/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2013 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.datagen.common;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.resourceloading.ResourceFileFinder;
import com.ericsson.cepmediation.base.resourceloading.ResourceLoadingFailedException;

public class DatagenProperties {

    /**
     * @author  eikrwaq
     * @since  2013
     */
    public enum Node {
        GPEH, SGSN
    }

    private static final Logger logger = LoggerFactory.getLogger(DatagenProperties.class);

    public static DatagenProperties instance = new DatagenProperties();

    private Properties props = new Properties();

    private DatagenProperties() {
        try {
            InputStream in = new ResourceFileFinder()
                    .findResourceFile(DatagenPropertiesConstants.DATAGEN_PROPERTIES_FILE_NAME);
            props.load(in);
        } catch (IOException ioe) {
            logger.error("Error reading props file ", ioe);
            throw new RuntimeException(ioe);
        } catch (ResourceLoadingFailedException e) {
            logger.error("Error loading resource", e);
            throw new RuntimeException(e);
        }
    }

    public File getInternalDir() {
        String path = props.getProperty(DatagenPropertiesConstants.INTNERNAL_DIR);
        return new File(path);
    }

    public File getMasterDatasetPath(Node node) {
        String path = props.getProperty(DatagenPropertiesConstants.MASTER_DATASET_PATH);
        path = path + "/" + node.toString();
        return new File(path);
    }

    public File getDestinationDir() {
        String path = props.getProperty(DatagenPropertiesConstants.DATAGEN_GPEH_GENERATED_DESTINATION);
        return new File(path);
    }

    public boolean generateDataForRNC09() {
        boolean generate = false;
        String rnc09 = props.getProperty(DatagenPropertiesConstants.CREATE_RNC09_ORGINALDATA_WITHOUT_ANY_CHANGHES);
        if (rnc09.equalsIgnoreCase("true") || rnc09.equalsIgnoreCase("false")) {
            generate = Boolean.parseBoolean(rnc09.trim());
        } else {
            generate = false;
        }

        return generate;
    }

    public Set<String> getRNCsNames() {
        String rncs = props.getProperty(DatagenPropertiesConstants.RNCS_NAMES);
        String[] rncsNames = rncs.trim().split(",");

        // to remove duplicates
        Set<String> namesSet = new HashSet<String>();

        for (int i = 0; i < rncsNames.length; i++) {
            if (!rncsNames[i].trim().equals(DatagenPropertiesConstants.RNC09)) {
                namesSet.add(rncsNames[i].trim());
            }
        }

        return Collections.unmodifiableSet(namesSet);
    }

    public Set<String> getSGSNsNames() {
        String sgsns = props.getProperty(DatagenPropertiesConstants.SGSNSNAMES);
        String[] sgsnNames = sgsns.trim().split(",");

        // to remove duplicates
        Set<String> namesSet = new HashSet<String>();

        for (int i = 0; i < sgsnNames.length; i++) {
            namesSet.add(sgsnNames[i].trim());
        }

        return Collections.unmodifiableSet(namesSet);
    }

    public boolean getLivePlayBackFlag() {
        boolean generateLivePlayback = false;
        String userdefined = props.getProperty(DatagenPropertiesConstants.CREATE_LIVEDATAGEN);
        if (userdefined.equalsIgnoreCase("true") || userdefined.equalsIgnoreCase("false")) {
            generateLivePlayback = Boolean.parseBoolean(userdefined.trim());
        }
        return generateLivePlayback;
    }

    public boolean useOneMinuteRops() {
        return Boolean.valueOf(props.getProperty(DatagenPropertiesConstants.USE_ONE_MINUTE_ROPS));
    }

    public int getThreadPoolSize() {
        return Integer.parseInt(props.getProperty(DatagenPropertiesConstants.THREAD_POOL));
    }

    public boolean getGpehFlag() {
        return Boolean.valueOf(props.getProperty(DatagenPropertiesConstants.CREATEGPEH));
    }

    public boolean getSgsnFlag() {
        return Boolean.valueOf(props.getProperty(DatagenPropertiesConstants.CREATESGSN));
    }

    public Set<Integer> getInterestingEvents() {
        final String events = props.getProperty(DatagenPropertiesConstants.INTERSESTING_EVENTS);
        final String[] eventIds = events.trim().replaceAll("\\s", "").split(DatagenPropertiesConstants.DELIMITER);

        // Add the array of eventIds to a set to remove duplicates
        final HashSet<Integer> eventSet = new HashSet<Integer>();
        //        eventSet.addAll(Arrays.asList(eventIds));
        for (int i = 0; i < eventIds.length; i++) {
            eventSet.add(Integer.parseInt(eventIds[i]));
        }

        return Collections.unmodifiableSet(eventSet);
    }
}
