/***------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2013
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
-----------------------------------------------------------------------------------------------*/
package com.ericsson.cepmediation.forwarding.uertt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.HashMap;
import java.text.SimpleDateFormat;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.persist.EventUtilsUertt;
import java.util.ArrayList;

public class UERTTFileWriter {
    private static final String TIME_ZONE = "UTC";

    private static File file;

    private static final Logger logger = LoggerFactory.getLogger(UERTTFileWriter.class);

    private static Properties properties;

    private static HashMap<String, String> protocolMapping = new HashMap<String, String>();

    private static final String HEXES = "0123456789ABCDEF";

    private static ArrayList<FileWriterBuffer> listBuffer = new ArrayList<FileWriterBuffer>(20);

    private static int countBuffer = 0;

    private static boolean initBufferDone = false;

    public static void uerttWrite(ApEventBean entity1) throws IOException {
        if (!initBufferDone) {
            for (int i = 0; i < 20; i++) {
                FileWriterBuffer bufferObj = new FileWriterBuffer();
                listBuffer.add(i, bufferObj);
            }
            initBufferDone = true;
            EventUtilsUertt.initProperties();
        }
        countBuffer++;
        EventUtilsUertt.setImsi(EventUtilsUertt.getImsi(entity1));
        EventUtilsUertt.setTimestamp(EventUtilsUertt.getTimestamp(entity1));
        int bucketCount = EventUtilsUertt.generateFilePath();
        FileWriterBuffer bufferObj = listBuffer.get(bucketCount);
        if (bufferObj.getFile() == null) {
            bufferObj.setFile(EventUtilsUertt.getFile());
            bufferObj.getlistEvent().add(entity1);
        } else {
            bufferObj.getlistEvent().add(entity1);
        }
        if (countBuffer > EventUtilsUertt.getBufferSize()) {            
            countBuffer = 0;
            BufferedWriter writer;
            for (FileWriterBuffer buffer : listBuffer) {
                if (buffer.getFile() != null) {
                    File sortedFile = new File(EventUtilsUertt.createSortedFileTargetPath(buffer.getFile().getPath()));
                    if (!sortedFile.exists()) {
                        writer = new BufferedWriter(new FileWriter(buffer.getFile(), true));
                        if (buffer.getFile() != null) {
                            buffer.getFile().createNewFile();
                        }
                    } else {
                        writer = new BufferedWriter(new FileWriter(sortedFile, true));
                    }
                    for (ApEventBean entity : buffer.getlistEvent()) {
                        EventUtilsUertt.writeToBuffer(writer, entity);
                    }
                    writer.flush();
                    writer.close();
                    try {
                        if (sortedFile.exists()) {
                            EventUtilsUertt.triggerSortingScriptForSortedFile(sortedFile.getAbsolutePath());
                        } else {
                            EventUtilsUertt.triggerSortingScriptForUnsortedFile(buffer.getFile().getAbsolutePath());
                        }
                    } catch (Exception e) {
                    }
                }
            }
            listBuffer.clear();
            initBufferDone = false;
        }
    }

    public static String formatTime(long millis) {
        TimeZone.setDefault(TimeZone.getTimeZone(TIME_ZONE));
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
}
