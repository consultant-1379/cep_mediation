package com.ericsson.cepmediation.correlation.util.parser;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.apeventbeans.gpeh.RRC_UPLINK_DIRECT_TRANSFER;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.apeventbeans.Asn1Message;
import com.ericsson.cepmediation.base.util.ResourceLoadingUtilities;
import com.ericsson.cepmediation.test.common.GpehEventType;

public class PlainFileParser {
    private static final String TIMESTAMP_PARAM = "timestamp";

    private static final String CLASS_NAME_PARAM = "className";

    private static final String EVENTS_PACKAGE = "com.ericsson.cepmediation.apeventbeans.gpeh.";

    private static final Logger logger = LoggerFactory.getLogger(PlainFileParser.class);

    private final InputStream file;

    private static final String TIME_ZONE = "UTC";

    private static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";

    // This date formatter is required to format dates into UTC
    private static final DateFormat dateFormat = new SimpleDateFormat(DATE_TIME_FORMAT);

    // Set the time zone for the formatter as UTC
    static {
        dateFormat.setTimeZone(TimeZone.getTimeZone(TIME_ZONE));
    }

    public PlainFileParser(final String f) throws IOException {
        final URL url = ResourceLoadingUtilities.getURLForResourceOnClassPath(f);
        if (url == null) {
            throw new IllegalArgumentException("Could not find file: " + f);
        }
        file = url.openStream();

        if (file == null) {
            logger.error("Could not find file: " + f);

            throw new IllegalArgumentException();
        }
    }

    public List<ApEventBean> parse() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, ParseException,
            IllegalArgumentException, InvocationTargetException {
        final List<String> lines = readFile();
        final List<ApEventBean> events = new ArrayList<ApEventBean>(lines.size());
        for (final String line : lines) {
            if (!line.trim().startsWith("#") && line.trim().length() > 10) {
                final ApEventBean event = parseLine(line);
                String actual = event.getDecodedString().replaceAll(",.[^,]*?=-1", "");
                String expected = line.replaceAll(",.[^,]*?=-1", "");
                //assertEquals("Event was not parsed correctly, the line in the file did not match the decoded string of the event produced", expected, actual);
                events.add(event);
            }
        }
        return events;
    }

    private int getEventId(final ApEventBean instance) {
        for (final GpehEventType type : GpehEventType.values()) {
            if (instance.getClass().getSimpleName().equalsIgnoreCase(type.toString())) {
                return type.getId();
            }
        }

        throw new IllegalArgumentException("Could not find eventId for: " + instance.getClass().getSimpleName());
    }

    private ApEventBean parseLine(String line) throws ClassNotFoundException, InstantiationException, IllegalAccessException, ParseException,
            IllegalArgumentException, InvocationTargetException {

        //extract asn messages
        final List<Asn1Message> asn1MessageList = new ArrayList<Asn1Message>();
        line = extractAsn1Messages(line, asn1MessageList);

        final Map<String, String> params = parseParams(line);
        final ApEventBean instance = (ApEventBean) instantiate(params.remove(CLASS_NAME_PARAM));
        try {
            populateBaseFields(instance, asn1MessageList, params);
            populateEventFields(instance, params);
        } catch (final IllegalArgumentException e) {
            logger.error("Error printing parsing line: " + line);

            throw e;
        }

        return instance;
    }

    private String extractAsn1Messages(String line, final List<Asn1Message> asn1MessageList) {
        final int pos = line.indexOf("MESSAGE_CONTENTS=");
        if (pos > -1) {
            final int posOpenBracket = line.indexOf("{");
            final int posClosingBracket = line.lastIndexOf("}");
            if (posOpenBracket > -1 && posClosingBracket > -1) {
                final String asnMessagesString = line.substring(posOpenBracket, posClosingBracket + 1);
                parseAsn1Messages(asnMessagesString, asn1MessageList);
                line = line.substring(0, pos - 1);
                if (posClosingBracket < line.length()) {
                    line += line.substring(posClosingBracket + 1);
                }
            }
        }
        return line;
    }

    private void parseAsn1Messages(final String asnMessagesString, final List<Asn1Message> res) {
        final Pattern p = Pattern.compile("\\{.*?\\}");
        final Matcher matcher = p.matcher(asnMessagesString);
        while (matcher.find()) {
            String content = matcher.group();
            content = content.substring(1, content.length() - 1);
            final String[] tokens = content.split(",");
            final Map<String, String> attributes = new HashMap<String, String>();
            for (final String token : tokens) {
                final String[] nvPair = token.split("=");
                if (nvPair.length > 1) {
                	attributes.put(nvPair[0].trim(), nvPair[1].trim());
                }
            }
            if (!attributes.isEmpty()) {
            	final Asn1Message asn = new Asn1Message();
            	asn.setMessageAttributes(attributes);
            	res.add(asn);
            }
        }
    }

    private void populateEventFields(final ApEventBean instance, final Map<String, String> params) throws IllegalArgumentException, IllegalAccessException,
            InvocationTargetException {
        final Method[] methods = instance.getClass().getMethods();
        for (final Map.Entry<String, String> entry : params.entrySet()) {
            final Method setter = findMethod(methods, "set" + entry.getKey());
            if (setter == null) {
                throw new IllegalArgumentException("Provided param could not be found in the event. Field name: " + entry.getKey() + " class name: "
                        + instance.getAbsoluteName());
            }
            final Class<?>[] paramTypes = setter.getParameterTypes();
            if (paramTypes.length != 1) {
                throw new IllegalStateException("Setter method takes more than one arg. Strange. Class: " + instance.getAbsoluteName() + " field: set"
                        + entry.getKey());
            }

            final Object param = parseParam(paramTypes[0], entry.getValue());
            if (param == null) {
                throw new IllegalArgumentException("Could not parse parameter type. Param name: " + entry.getKey() + " value: " + entry.getValue() + " type: "
                        + paramTypes[0]);
            }
            setter.invoke(instance, param);
        }
    }

    private Object parseParam(final Class<?> clazz, final String value) {
        try {
            if (clazz.getName().equals("java.lang.String")) {
                return value.substring(1, value.length() - 1);
            }
            if (clazz.getName().equals("byte")) {
                return Byte.valueOf(value);
            }

            if (clazz.getName().equals("int")) {
                return Integer.valueOf(value);
            }

            if (clazz.getName().equals("short")) {
                return Short.valueOf(value);
            }
            if (clazz.getName().equals("long")) {
                return Long.valueOf(value);
            }
            if (clazz.getName().equals("boolean")) {
                return Boolean.valueOf(value);
            }
            if (clazz.getName().equals("float")) {
                return Float.valueOf(value);
            }
            if (clazz.getName().equals("double")) {
                return Double.valueOf(value);
            }
            if (clazz.getName().equals("[B")) {
                return hexStringToByteArray(value);
            }
        } catch (final Exception e) {
            logger.error("Error parsing value: " + value);
        }

        return null;
    }

    private Method findMethod(final Method[] methods, final String key) {
        for (final Method m : methods) {
            if (m.getName().equalsIgnoreCase(key)) {
                return m;
            }
        }
        return null;
    }

    private Map<String, String> parseParams(String line) throws ParseException {
        final Map<String, String> params = new HashMap<String, String>();

        final String date = line.substring(0, line.indexOf(","));
        params.put(TIMESTAMP_PARAM, String.valueOf((parseTimestamp(date))));
        line = line.substring(line.indexOf(",") + 1);

        final String[] tokens = line.split(",");
        for (final String token : tokens) {
            // classname is specified without the equals sign
            if (token.indexOf("=") == -1) {
                if (params.get(CLASS_NAME_PARAM) != null) {
                    throw new IllegalArgumentException("Illegal paramter provided, missing = sign: " + token + " in line: " + line);
                }
                params.put(CLASS_NAME_PARAM, token);
            } else {
                final String[] nvPair = token.split("=");
                if (params.containsKey(nvPair[0].trim())) {
                    throw new IllegalArgumentException("Duplicate param: " + nvPair[0] + " in line: " + line);
                }
                params.put(nvPair[0].trim(), nvPair[1].trim());
            }
        }

        checkParams(params, line);

        return params;
    }

    private void checkParams(final Map<String, String> params, final String line) {
        if (!params.containsKey(CLASS_NAME_PARAM)) {
            throw new IllegalArgumentException(
                    "Event name should be provided in the line as a param without name and equals sign(just the event name). No class event name provided in line: "
                            + line);
        }

        if (!params.containsKey(TIMESTAMP_PARAM)) {
            throw new IllegalArgumentException("Timestamp should be the first param in any line. No timestamp provided in line: " + line);
        }

    }

    private void populateBaseFields(final ApEventBean instance, final List<Asn1Message> asn1MessageList, final Map<String, String> params)
            throws ParseException {
        if (!asn1MessageList.isEmpty() || instance.getClass() == RRC_UPLINK_DIRECT_TRANSFER.class) {
            instance.setAsn1MessageList(asn1MessageList);
        }
        instance.setEventId(getEventId(instance));
        instance.setTimestamp(Long.valueOf(params.remove(TIMESTAMP_PARAM)));
        instance.setSubNetwork(params.remove("SN"));
        instance.setNe(params.remove("NE"));
        instance.setName(instance.getClass().getSimpleName());
        instance.setVersion(params.remove("VERSION"));
    }

    private long parseTimestamp(final String timestamp) throws ParseException {
        try {
            final Date date = dateFormat.parse(timestamp);
            return date.getTime();
        } catch (final ParseException e) {
            logger.error("Could not parse date: " + timestamp);

            throw e;
        }
    }

    private Object instantiate(final String className) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        try {
            final Class clazz = Class.forName(EVENTS_PACKAGE + className);
            return clazz.newInstance();
        } catch (final ClassNotFoundException e) {
            logger.error("Could not instantiate class: " + EVENTS_PACKAGE + className);

            throw e;
        }
    }

    private List<String> readFile() throws IOException {
        final List<String> res = new ArrayList<String>();
        final BufferedReader br = new BufferedReader(new InputStreamReader(file));
        String line = null;
        while ((line = br.readLine()) != null) {
            res.add(line.trim());
        }
        return res;
    }

    public byte[] hexStringToByteArray(final String s) {
        final int len = s.length();
        final byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
        }
        return data;
    }

    public static void main(final String[] args) throws Exception {
        final PlainFileParser parser = new PlainFileParser("handover/rop.txt");
        final List<ApEventBean> events = parser.parse();
        for (final ApEventBean e : events) {
            System.out.println(e.getDecodedString());
        }

        System.out.println("Done");
    }
}
