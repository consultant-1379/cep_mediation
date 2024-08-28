/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2013 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.eniq.events.cepmediation.datagen_precook.utils;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.eniq.events.cepmediation.datagen_precook.common.DataGenPropertiesConstants;
import com.ericsson.eniq.events.cepmediation.datagen_precook.common.DatagenProperties;
import com.ericsson.eniq.events.cepmediation.datagen_precook.common.RncType;
import com.ericsson.eniq.events.cepmediation.datagen_precook.utils.fileutils.OutputHelper;

/**
 * @author eikrwaq
 * @since 2013
 *
 */

public class RandomIMSIGenerator {

    public static final RncType type = DatagenProperties.getInstance().getType();

    public static final String masterSetfilePath = DatagenProperties.getInstance().getUeContextModuleIDFilePath();

    private static final Logger logger = LoggerFactory.getLogger(RandomIMSIGenerator.class);

    private static final String userdefinedIMSIfilePath = DatagenProperties.getInstance().getImsiListPath();

    private static final String IMSI_PREFIX = "045406999";

    private static final String ZERO = "0";

    private static final int IMSI_LENGTH = 16;

    private static int imsiCounter = 1;

    private HashMap<String, String> imsiMapping;

    /**
     * generate Unique Imsis 
     */
    public RandomIMSIGenerator() {
        imsiMapping = new HashMap<String, String>();
        //load list of IMSIs from user defined path
        if (!createRandomUeIMSIs()) {
            final File file = new File(userdefinedIMSIfilePath);
            imsiMapping = LoadFile(file);
        }
    }

    public String getImsi(String imsi) {

        String folder = new File(masterSetfilePath).getParent().toString();
        String filename = "/IMSI-Mapping-" + type.name();
        String fileExt = ".txt";

        if (!createRandomUeIMSIs()) {
            folder = new File(userdefinedIMSIfilePath).getParent().toString();
            filename = new File(userdefinedIMSIfilePath).getName();
        }
        

        if (imsiMapping.containsKey(imsi)) {
            return imsiMapping.get(imsi);
        }

        OutputHelper.init(folder, filename, fileExt);

        String newimsi = getRandomIMSI();
        imsiMapping.put(imsi, newimsi);

        OutputHelper.writeToFile(imsi + "," + newimsi);
        OutputHelper.close();

        return newimsi;
    }

    public String getRandomIMSI() {
        String counterStr = String.valueOf(imsiCounter);
        String imsi = IMSI_PREFIX
                + (getZeroString(IMSI_LENGTH - IMSI_PREFIX.length() - counterStr.length()) + counterStr);
        imsiCounter++;
        return imsi;
    }

    private static String getZeroString(final int noOfZeroes) {
        StringBuffer zeroes = new StringBuffer();
        for (int j = 0; j < noOfZeroes; j++) {
            zeroes.append(ZERO);
        }
        return zeroes.toString();
    }

    private boolean createRandomUeIMSIs() {
        final String propertyValue = System.getProperty(DataGenPropertiesConstants.CREATE_RANDOM_IMSI_SET,
                Boolean.toString(false));
        return Boolean.parseBoolean(propertyValue);
    }

    private HashMap<String, String> LoadFile(final File file) {
        final HashMap<String, String> fileContant = new HashMap<String, String>();
        logger.debug("Loading File :" + file.getName() + "...");
        FileInputStream fstream = null;
        try {
            try {
                fstream = new FileInputStream(file);
            } catch (final FileNotFoundException e) {
                e.printStackTrace();
            }

            final DataInputStream in = new DataInputStream(fstream);

            final BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;

            while ((strLine = br.readLine()) != null) {
                if (strLine.length() > 0) {
                    final String[] tokens = strLine.split(",");
                    fileContant.put(tokens[0].trim(), tokens[1].trim());
                }
            }

            in.close();
        } catch (final Throwable e) {
            logger.error(e.getMessage() + ":" + e.toString());
            System.exit(0);
        }
        return fileContant;
    }

}
