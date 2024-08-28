/**------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2014
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.cepmediation.base.util;

import java.io.File;
import java.net.URL;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import org.jdom.Document;
import org.jdom.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.properties.ConfigurationException;
import com.ericsson.cepmediation.base.util.xml.XMLDocumentHandler;

/**
 * This is common utility class. It is an abstract class to prevent any direct
 * instantiation and private constructor to prevent extending this class.
 *
 */
public abstract class Utilities {

    private static final Logger LOGGER = LoggerFactory.getLogger(Utilities.class);

    private static final String CONFIG_NAMESPACE = "http://www.ericsson.com/app-config";

    private static final String CONFIG_SCHEMA = "app-config/config-schema.xsd";

    private static final String CONFIG_FILE = "app-config/config.xml";

    private static final String NETWORK_ELEMENTS_FILE = "app-config/network_elements.xml";

    private static final String STANDALONE_XML_FILE = "app-config/standalone.xml";

    private static Element configXml;

    private static Element networkElementsXml;

    private static Element standaloneXml;

    private Utilities() {
    }

    private static final DateFormat DATEFORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    static {
        DATEFORMAT.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    /**
     * This method reads the etc/config.xml and loads into a map.
     *
     * @throws ConfigurationException
     *             , if the system failed to parse file or failed to locate file
     *             or if there is any validation error.
     */
    public static Element loadConfigurationFile() throws ConfigurationException {
        LOGGER.trace("init()-->");
        if (configXml != null) {
            return configXml;
        }

        configXml = parseAndValidate(CONFIG_FILE);

        LOGGER.trace("<--init()");
        return configXml;
    }

    public static Element loadNetworkElementsFile() throws ConfigurationException {
        LOGGER.trace("init()-->");
        if (networkElementsXml != null) {
            return networkElementsXml;
        }

        networkElementsXml = parseAndValidate(NETWORK_ELEMENTS_FILE);

        LOGGER.trace("<--init()");
        return networkElementsXml;
    }

    public static Element loadStandaloneXmlFile() throws ConfigurationException {
        LOGGER.trace("init()-->");
        if (standaloneXml != null) {
            return standaloneXml;
        }

        standaloneXml = parseAndValidate(STANDALONE_XML_FILE);

        LOGGER.trace("<--init()");
        return standaloneXml;
    }

    public static Element parseAndValidate(String file) throws ConfigurationException {
        try {
            final String configSchema = getSchemaPath();
            if (configSchema == null) {
                throw new ConfigurationException("failed to find configuration schema: " + CONFIG_SCHEMA,
                        ErrorCode.FAILED_LOAD_PROPS_DEF);
            }

            final String configFile = getFileResource(file);
            if (configFile == null) {
                throw new ConfigurationException("failed to find configuration file: " + file,
                        ErrorCode.FAILED_LOAD_PROPS_DEF);
            }

            LOGGER.debug("Configuration schema is at: " + configSchema);
            LOGGER.debug("Configuration file is at: " + configFile);

            final Map<String, String> configurationParameterMap = new HashMap<String, String>();
            configurationParameterMap.put(CONFIG_NAMESPACE, configSchema);
            final XMLDocumentHandler handler = new XMLDocumentHandler(configurationParameterMap);
            final Document document = handler.loadAndValidate(new File(configFile));
            return document.getRootElement();

        } catch (final Exception e) {
            LOGGER.error(e.getMessage(), e);
            throw new ConfigurationException(e.getMessage(), ErrorCode.FAILED_LOAD_PROPS_DEF);
        }
    }

    /**
     * Method to get a file resource from the class path
     *
     * @param resourceName
     *            The resource name
     * @return The file name
     */
    public static String getFileResource(final String resourceName) {

        final URL correctURL = Utilities.class.getClassLoader().getResource(resourceName);

        final String[] fileParts = resourceName.split("/");
        URL fileURL = ClassLoader.getSystemResource(resourceName);

        if (correctURL != null) {
            final String urlPath = correctURL.getPath();
            final String file = correctURL.getFile();
            if (file.contains(".jar")) {
                return urlPath;
            }
            return file;
        } else {
            fileURL = ClassLoader.getSystemResource(fileParts[fileParts.length - 1]);
            if (fileURL == null) {
                return null;
            }
            return fileURL.toString();
        }
    }

    private static String getSchemaPath() {
        String[] fileParts = CONFIG_SCHEMA.split("/");
        URL fileURL = ClassLoader.getSystemResource(fileParts[fileParts.length - 1]);
        return fileURL.toString();
    }

    /**
     * Method to output a time stamp as a string in UTC
     *
     * @param timestamp
     *            The time stamp
     * @return The time stamp time in UTC
     */
    public static synchronized String time2UTCString(final long timeValue) {
        return DATEFORMAT.format(new Timestamp(timeValue));
    }

    public static int extractTacFromImeiSv(final long imeiSv) {
        final String imeiSvString = String.valueOf(imeiSv);
        try {
            final int length = imeiSvString.length();
            if (imeiSvString == null || length <= 7) {
                return -1;
            }
            final String tac = imeiSvString.substring(0, 8 - (16 - length));
            return Integer.valueOf(tac);
        } catch (final Exception e) {
            LOGGER.warn("Exception while decoding tac from long'" + imeiSv + "'", e);
            return -1;
        }
    }

    /**
     * The IMEI can be 16 digits long(imeisv) or 15 digits long(imei). In both
     * cases, if leading zeros are preserved in the string, the TAC is the first
     * 8 digits.
     *
     * Here we assume leading zeros are preserved and just extract the first 8
     * digits to get the TAC.
     */

    public static int extractTacFromImeiSv(final String imeiSv) {
        try {
            if (imeiSv == null || imeiSv.length() <= 7) {
                return -1;
            }
            final String tac = imeiSv.substring(0, 8);
            return Integer.valueOf(tac);
        } catch (final Exception e) {
            LOGGER.warn("Exception while decoding tac from String '" + imeiSv + "'");
            return -1;
        }
    }

    /**
     *
     * The IMEI for WCDMA can be 15 or 16 digits(IMEISV) in length.
     *
     * When IMEISV with 16 digits TAC will be 8 digits with or without leading zero (1..16 or 0 .15)
     * Updating the code against TR-HS32715
     * When IMEI is  15 digits TAC will be 8 digits with or without leading zero (1..16 or 0 .15)
     *
     *(1) IMEI (15-digit) resulting TAC (8-digit)
     *(2) IMEI (15-digit including a leading zero) resulting TAC (7-digit)
     *(3) IMEISV (16-digit) resulting TAC (8-digit)
     *(4) IMEISV (16-digit including a leading zero) resulting TAC (7-digit)
     * One draw back with the 16 digit string stored in DB with leading zero (0..15) leading zero is not preserved. (1..15 stored in DB)
     * Therefore only first 7 digits show as TAC as it is unknown if IMEI was orignally 15 digits or 16 digits with leading zero
     */

    public static int extractTacFromImeiSvforWCDMA(final String imeiSv) {
        try {
            final int length = imeiSv.length();
            if (imeiSv == null || length <= 7) {
                return -1;
            }

            else if (length == 15) {
                final String tac = imeiSv.substring(0, 8 - (15 - length));
                return Integer.valueOf(tac);
            }
            else {
                final String tac = imeiSv.substring(0, 8 - (16 - length));
                return Integer.valueOf(tac);
            }
        } catch (final Exception e) {
            LOGGER.warn("Exception while decoding tac from String '" + imeiSv + "'");
            return -1;
        }
    }
}
