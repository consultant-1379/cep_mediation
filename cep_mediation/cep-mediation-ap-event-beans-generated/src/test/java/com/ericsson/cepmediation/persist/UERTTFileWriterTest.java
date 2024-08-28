/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2013
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.cepmediation.persist;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import org.mockito.Mockito;
import org.mockito.Mockito.*;

import org.jmock.Mockery;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.Assert.*;

import com.ericsson.cepmediation.apeventbeans.gpeh.RRC_MEASUREMENT_REPORT;
import com.ericsson.cepmediation.apeventbeans.gpeh.RRC_MEASUREMENT_REPORT_ENRICHED;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.util.Utilities;

public class UERTTFileWriterTest {
    private static final Logger logger = LoggerFactory.getLogger(UERTTFileWriterTest.class);
    private static BufferedWriter bw;
    private static final String TIME_ZONE = "UTC";
    RRC_MEASUREMENT_REPORT_ENRICHED entity1;
    RRC_MEASUREMENT_REPORT event;
    private static Calendar calendar;

    private static String imsi;

    private static File file;

    private static String headers;

    private static String mainDir;

    private static String hoursDir;

    private static long timeStamp;

    private static int hour;

    private static int minute;

    private static FileReader reader;

    private static Properties properties;

    private static HashMap<String, String> protocolMapping = new HashMap<String, String>();

    private static final String HEXES = "0123456789ABCDEF";

    private static String path;

    private static ArrayList<FileWriterBuffer> listBuffer = new ArrayList(20);

    private static int countBuffer = 0;

    private static boolean initBufferDone = false;

    public void setup(int j) {

        headers = "IMSI|TIMESTAMP|EVENT_ID|EVENT_NAME|PROTOCOL_ID|MESSAGE_DIRECTION|SCANNER_ID|UE_CONTEXT|RNC_MODULE_ID|C_ID_1|RNC_ID_1|C_ID_2|RNC_ID_2|C_ID_3|RNC_ID_3|C_ID_4|RNC_ID_4|PDU_TYPE|MESSAGE_LENGTH|MESSAGE_CONTENTS"
                + "|PROTOCOL_NAME|DIRECTION";
        entity1 = new RRC_MEASUREMENT_REPORT_ENRICHED();
        event = new RRC_MEASUREMENT_REPORT();
        byte[] MESSAGE_CONTENTS = new byte[] { 1, 0, 0 };
        event = new RRC_MEASUREMENT_REPORT();
        event.setUE_CONTEXT((short) 7058);
        event.setRNC_MODULE_ID(6);
        event.setSCANNER_ID(00400000);
        long timestamp = 113411144;
        event.setTimestamp(timestamp - j);
        event.setEVENT_ID((short) 8);
        event.setC_ID_1(1136);
        event.setRNC_ID_1((short) 301);
        event.setC_ID_2(1137);
        event.setRNC_ID_2((short) 301);
        event.setPDU_TYPE((byte) 2);
        event.setPROTOCOL_ID((byte) 0);
        event.setMESSAGE_DIRECTION((byte) 0);
        event.setMESSAGE_CONTENTS(MESSAGE_CONTENTS);
        long valueImsi = randInt();
        long min = Long.parseLong("100000000000000");
        long max = Long.parseLong("9999999999999999");
        entity1.setIMSI(max - j);
        entity1.setBase(event);
    }

    public static int randInt() {

        Random rand = new Random(0);
        int i = rand.nextInt(100);
        return i;
    }

    @Test
    public void writeFile() throws IOException {

        for (int j = 0; j < 200; j++) {
            setup(j);
            if (!initBufferDone) {
                for (int i = 0; i < 20; i++) {
                    FileWriterBuffer bufferObj = new FileWriterBuffer();
                    listBuffer.add(i, bufferObj);
                }
                initBufferDone = true;
                initPath();
            }
            countBuffer++;
            imsi = ((com.ericsson.cepmediation.apeventbeans.gpeh.RRC_MEASUREMENT_REPORT_ENRICHED) entity1).getIMSI() + "";
            timeStamp = ((com.ericsson.cepmediation.apeventbeans.gpeh.RRC_MEASUREMENT_REPORT_ENRICHED) entity1).getTimestamp();
            int bucketCount = generateFilePath();
            FileWriterBuffer bufferObj = listBuffer.get(bucketCount);
            if (bufferObj.getFile() == null) {
                bufferObj.setFile(file);
                bufferObj.getlistEvent().add(entity1);
            } else {
                bufferObj.getlistEvent().add(entity1);
            }
            if (countBuffer > 100) {
                countBuffer = 0;
                BufferedWriter writer;
                for (FileWriterBuffer buffer : listBuffer) {
                    if (buffer.getFile() != null) {
                        writer = new BufferedWriter(new FileWriter(buffer.getFile(), true));
                        if (buffer.getFile() != null) {
                            buffer.getFile().createNewFile();
                        }
                        for (ApEventBean entity : buffer.getlistEvent()) {
                            if (entity instanceof com.ericsson.cepmediation.apeventbeans.gpeh.RRC_MEASUREMENT_REPORT_ENRICHED) {
                                writeRRC_MEASUREMENT_REPORT_ENRICHED(writer,
                                        (com.ericsson.cepmediation.apeventbeans.gpeh.RRC_MEASUREMENT_REPORT_ENRICHED) entity);
                            }
                        }
                        writer.flush();
                        writer.close();
                        try {
                            triggerSortingScript(buffer.getFile().getAbsolutePath());
                        } catch (Exception e) {

                        }
                    }
                }
                listBuffer.clear();
                initBufferDone = false;
            }
        }
    }

    public static void triggerSortingScript(String path) throws Exception {
        String location = Utilities.getFileResource("uertt/sortFile.py");
        String targetPath = createSortedFileTargetPath(path);
        String cmd[] = { "/bin/sh", "-c", "python " + location + " -k\"((line[0:29]))\" " + path + " " + targetPath };
        Process p1 = Runtime.getRuntime().exec(cmd);
        p1.waitFor();
        if (p1.exitValue() == 0) {
            File fileToDelete = new File(path);
            fileToDelete.delete();
        }

    }

    public static String createSortedFileTargetPath(String path) {
        String targetPath = "";
        if (path.contains(".csv")) {
            targetPath = path.substring(0, path.indexOf(".csv"));
            targetPath = targetPath + "_sorted.csv";
        }
        return targetPath;
    }

    /*
     * public String readHeader(File input) throws IOException{ FileInputStream inputStream = new FileInputStream(input); BufferedReader in = new
     * BufferedReader(new InputStreamReader(inputStream)); return in.readLine(); }
     */
    private void initPath() {
        if (properties == null)
            try {
                properties = new Properties();
                path = Utilities.getFileResource("uertt/testUerttWriter.properties");
                reader = new FileReader(path);
                properties.load(reader);
                setProtocolMapping();
            } catch (IOException e) {
                logger.info("Exception while loading uerttWriter.properties:" + e);
            }
    }

    public static void writeRNSAP_COMMON_TRANSPORT_CHANNEL_RESOURCES_FAILURE_ENRICHED(BufferedWriter bw,
                                                                                      com.ericsson.cepmediation.apeventbeans.gpeh.RNSAP_COMMON_TRANSPORT_CHANNEL_RESOURCES_FAILURE_ENRICHED entity)
            throws IOException {

        bw.write(replaceNull((entity.getIMSI() + "|")));
        bw.write(replaceNull((formatTime(entity.getBase().getTimestamp()) + "|")));
        bw.write(replaceNull((entity.getBase().getEVENT_ID() + "|")));
        bw.write(replaceNull((entity.getBase().getName() + "|")));
        bw.write(replaceNull((entity.getBase().getPROTOCOL_ID() + "|")));
        bw.write(replaceNull((entity.getBase().getMESSAGE_DIRECTION() + "|")));
        bw.write(replaceNull((entity.getBase().getSCANNER_ID() + "|")));
        bw.write(replaceNull((entity.getBase().getUE_CONTEXT() + "|")));
        bw.write(replaceNull((entity.getBase().getRNC_MODULE_ID() + "|")));
        bw.write(replaceNull((entity.getBase().getC_ID_1() + "|")));
        bw.write(replaceNull((entity.getBase().getRNC_ID_1() + "|")));
        bw.write(replaceNull((entity.getBase().getC_ID_2() + "|")));
        bw.write(replaceNull((entity.getBase().getRNC_ID_2() + "|")));
        bw.write(replaceNull((entity.getBase().getC_ID_3() + "|")));
        bw.write(replaceNull((entity.getBase().getRNC_ID_3() + "|")));
        bw.write(replaceNull((entity.getBase().getC_ID_4() + "|")));
        bw.write(replaceNull((entity.getBase().getRNC_ID_4() + "|")));
        bw.write(replaceNull((entity.getBase().getPDU_TYPE() + "|")));
        bw.write(replaceNull((entity.getBase().getMESSAGE_LENGTH() + "|")));
        bw.write(replaceNull((getHexValue(entity.getBase().getMESSAGE_CONTENTS()) + "|")));

        bw.write(replaceNull((protocolMapping.get(Byte.toString(entity.getBase().getPROTOCOL_ID())) + "|")));
        bw.write(replaceNull(((entity.getBase().getMESSAGE_DIRECTION() == 1 ? "SENT" : "RECEIVED"))));
        bw.newLine();
    }

    private static String replaceNull(String value) {
        if (value == null) {
            value = " |";
        }
        return value;
    }

    public static String formatTime(long millis) {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss.SSS");
        String strDate = sdf.format(millis);
        return strDate;
    }

    private static String getHexValue(byte[] byteArray) {
        if (byteArray == null) {
            return null;
        }
        final StringBuilder hex = new StringBuilder(2 * byteArray.length);
        for (final byte b : byteArray) {
            hex.append(HEXES.charAt((b & 0xF0) >> 4)).append(HEXES.charAt((b & 0x0F)));
        }
        return hex.toString();
    }

    public static void writeRRC_MEASUREMENT_REPORT_ENRICHED(BufferedWriter bw,
                                                            com.ericsson.cepmediation.apeventbeans.gpeh.RRC_MEASUREMENT_REPORT_ENRICHED entity)
            throws IOException {

        bw.write(replaceNull((entity.getIMSI() + "|")));
        bw.write(replaceNull((formatTime(entity.getBase().getTimestamp()) + "|")));
        bw.write(replaceNull((entity.getBase().getEVENT_ID() + "|")));
        bw.write(replaceNull((entity.getBase().getName() + "|")));
        bw.write(replaceNull((entity.getBase().getPROTOCOL_ID() + "|")));
        bw.write(replaceNull((entity.getBase().getMESSAGE_DIRECTION() + "|")));
        bw.write(replaceNull((entity.getBase().getSCANNER_ID() + "|")));
        bw.write(replaceNull((entity.getBase().getUE_CONTEXT() + "|")));
        bw.write(replaceNull((entity.getBase().getRNC_MODULE_ID() + "|")));
        bw.write(replaceNull((entity.getBase().getC_ID_1() + "|")));
        bw.write(replaceNull((entity.getBase().getRNC_ID_1() + "|")));
        bw.write(replaceNull((entity.getBase().getC_ID_2() + "|")));
        bw.write(replaceNull((entity.getBase().getRNC_ID_2() + "|")));
        bw.write(replaceNull((entity.getBase().getC_ID_3() + "|")));
        bw.write(replaceNull((entity.getBase().getRNC_ID_3() + "|")));
        bw.write(replaceNull((entity.getBase().getC_ID_4() + "|")));
        bw.write(replaceNull((entity.getBase().getRNC_ID_4() + "|")));
        bw.write(replaceNull((entity.getBase().getPDU_TYPE() + "|")));
        bw.write(replaceNull((entity.getBase().getMESSAGE_LENGTH() + "|")));
        bw.write(replaceNull((getHexValue(entity.getBase().getMESSAGE_CONTENTS()) + "|")));

        bw.write(replaceNull((protocolMapping.get(Byte.toString(entity.getBase().getPROTOCOL_ID())) + "|")));
        bw.write(replaceNull(((entity.getBase().getMESSAGE_DIRECTION() == 1 ? "SENT" : "RECEIVED"))));
        bw.newLine();
    }

    private static void setProtocolMapping() {
        String protocolsMapping[] = properties.getProperty("protocol_mapping").split(":");
        String map[] = null;
        for (String string : protocolsMapping) {
            map = string.split(",");
            protocolMapping.put(map[0], map[1]);
        }
    }

    private static void fileCreate() {
        TimeZone.setDefault(TimeZone.getTimeZone(TIME_ZONE));
        calendar = Calendar.getInstance(TimeZone.getTimeZone(TIME_ZONE));
        String strHours = setFormatting(hour);
        String fileNameWithDate = properties.getProperty("file_EE") + calendar.get(Calendar.YEAR)
                + setFormatting((calendar.get(Calendar.MONDAY) + 1)) + setFormatting(calendar.get(Calendar.DATE));
        String DOT = properties.getProperty("file_DOT");
        String fileExt = properties.getProperty("file_EXT");
        String completePath = null;
        if (minute >= 00 && minute <= 14) {
            completePath = mainDir + hoursDir + fileNameWithDate + DOT + strHours + properties.getProperty("minute_range_00") + strHours
                    + properties.getProperty("minute_range_15") + fileExt;
        } else if (minute >= 15 && minute <= 29) {
            completePath = mainDir + hoursDir + fileNameWithDate + DOT + strHours + properties.getProperty("minute_range_15") + strHours
                    + properties.getProperty("minute_range_30") + fileExt;
        } else if (minute >= 30 && minute <= 44) {
            completePath = mainDir + hoursDir + fileNameWithDate + DOT + strHours + properties.getProperty("minute_range_30") + strHours
                    + properties.getProperty("minute_range_45") + fileExt;
        } else if (minute >= 45 && minute <= 59) {
            completePath = mainDir + hoursDir + fileNameWithDate + DOT + strHours + properties.getProperty("minute_range_45")
                    + ((hour + 1) > 23 ? "00" : strHours) + properties.getProperty("minute_range_00") + fileExt;
        }
        if (path.contains("uertt"))
            path = path.substring(0, path.indexOf("uertt"));
        file = new File(path + completePath);
    }

    private static String setFormatting(int data) {
        String strData = String.valueOf(data);
        if (data < 10) {
            strData = "0" + data;
        }
        return strData;
    }

    private static void setHoursDirectory() {

        switch (hour) {

            case 0:
                hoursDir = properties.getProperty("hours_00");
                break;
            case 1:
                hoursDir = properties.getProperty("hours_01");
                break;
            case 2:
                hoursDir = properties.getProperty("hours_02");
                break;
            case 3:
                hoursDir = properties.getProperty("hours_03");
                break;
            case 4:
                hoursDir = properties.getProperty("hours_04");
                break;
            case 5:
                hoursDir = properties.getProperty("hours_05");
                break;
            case 6:
                hoursDir = properties.getProperty("hours_06");
                break;
            case 7:
                hoursDir = properties.getProperty("hours_07");
                break;
            case 8:
                hoursDir = properties.getProperty("hours_08");
                break;
            case 9:
                hoursDir = properties.getProperty("hours_09");
                break;
            case 10:
                hoursDir = properties.getProperty("hours_10");
                break;
            case 11:
                hoursDir = properties.getProperty("hours_11");
                break;
            case 12:
                hoursDir = properties.getProperty("hours_12");
                break;
            case 13:
                hoursDir = properties.getProperty("hours_13");
                break;
            case 14:
                hoursDir = properties.getProperty("hours_14");
                break;
            case 15:
                hoursDir = properties.getProperty("hours_15");
                break;
            case 16:
                hoursDir = properties.getProperty("hours_16");
                break;
            case 17:
                hoursDir = properties.getProperty("hours_17");
                break;
            case 18:
                hoursDir = properties.getProperty("hours_18");
                break;
            case 19:
                hoursDir = properties.getProperty("hours_19");
                break;
            case 20:
                hoursDir = properties.getProperty("hours_20");
                break;
            case 21:
                hoursDir = properties.getProperty("hours_21");
                break;
            case 22:
                hoursDir = properties.getProperty("hours_22");
                break;
            case 23:
                hoursDir = properties.getProperty("hours_23");
                break;
            default:
                logger.info("value is out of time range :setHoursDirectory:UERTTFileWriter");
                break;
        }
        if (hoursDir != null) {
            fileCreate();
        }
    }

    public int generateFilePath() {
        int finalIntHash = 0;
        int bucketCount = 0;
        long hashValue = imsi.hashCode();
        TimeZone.setDefault(TimeZone.getTimeZone(TIME_ZONE));
        Date date = new Date(timeStamp);
        String timeStampString = DateFormat.getTimeInstance(DateFormat.SHORT).format(date);
        String timeStampSubString = timeStampString.substring(0, 5);
        hour = Integer.parseInt(timeStampSubString.substring(0, 2));
        minute = Integer.parseInt(timeStampSubString.substring(3, 5));

        String strHash = Long.toString(hashValue);
        String finalStrHash = strHash.substring(strHash.length() - 4);
        finalIntHash = Integer.parseInt(finalStrHash);
        //System.out.println(imsi+"=>"+finalIntHash);
        String subDir = properties.getProperty("main_dir");

        if (finalIntHash >= 0000 && finalIntHash <= 499) {
            mainDir = subDir + properties.getProperty("imsi_1");
            bucketCount = 1;

        } else if (finalIntHash >= 500 && finalIntHash <= 999) {
            mainDir = subDir + properties.getProperty("imsi_2");
            bucketCount = 2;

        } else if (finalIntHash >= 1000 && finalIntHash <= 1499) {
            mainDir = subDir + properties.getProperty("imsi_3");
            bucketCount = 3;

        } else if (finalIntHash >= 1500 && finalIntHash <= 1999) {
            mainDir = subDir + properties.getProperty("imsi_4");
            bucketCount = 4;

        } else if (finalIntHash >= 2000 && finalIntHash <= 2499) {
            mainDir = subDir + properties.getProperty("imsi_5");
            bucketCount = 5;

        } else if (finalIntHash >= 2500 && finalIntHash <= 2999) {
            mainDir = subDir + properties.getProperty("imsi_6");
            bucketCount = 6;

        } else if (finalIntHash >= 3000 && finalIntHash <= 3499) {
            mainDir = subDir + properties.getProperty("imsi_7");
            bucketCount = 7;

        } else if (finalIntHash >= 3500 && finalIntHash <= 3999) {
            mainDir = subDir + properties.getProperty("imsi_8");
            bucketCount = 8;
        } else if (finalIntHash >= 4000 && finalIntHash <= 4499) {
            mainDir = subDir + properties.getProperty("imsi_9");
            bucketCount = 9;
        }

        else if (finalIntHash >= 4500 && finalIntHash <= 4999) {
            mainDir = subDir + properties.getProperty("imsi_10");
            bucketCount = 10;
        }

        else if (finalIntHash >= 5000 && finalIntHash <= 5499) {
            mainDir = subDir + properties.getProperty("imsi_11");
            bucketCount = 11;

        } else if (finalIntHash >= 5500 && finalIntHash <= 5999) {
            mainDir = subDir + properties.getProperty("imsi_12");
            bucketCount = 12;

        } else if (finalIntHash >= 6000 && finalIntHash <= 6499) {
            mainDir = subDir + properties.getProperty("imsi_13");
            bucketCount = 13;

        } else if (finalIntHash >= 6500 && finalIntHash <= 6999) {
            mainDir = subDir + properties.getProperty("imsi_14");
            bucketCount = 14;

        } else if (finalIntHash >= 7000 && finalIntHash <= 7499) {
            mainDir = subDir + properties.getProperty("imsi_15");
            bucketCount = 15;

        } else if (finalIntHash >= 7500 && finalIntHash <= 7999) {
            mainDir = subDir + properties.getProperty("imsi_16");
            bucketCount = 16;

        } else if (finalIntHash >= 8000 && finalIntHash <= 8499) {
            mainDir = subDir + properties.getProperty("imsi_17");
            bucketCount = 17;

        } else if (finalIntHash >= 8500 && finalIntHash <= 8999) {
            mainDir = subDir + properties.getProperty("imsi_18");
            bucketCount = 18;
        }

        else if (finalIntHash >= 9000 && finalIntHash <= 9499) {
            mainDir = subDir + properties.getProperty("imsi_19");
            bucketCount = 19;

        } else if (finalIntHash >= 9500 && finalIntHash <= 9999)

        {
            mainDir = subDir + properties.getProperty("imsi_20");
            bucketCount = 20;
        }
        setHoursDirectory();
        return --bucketCount;
    }

}