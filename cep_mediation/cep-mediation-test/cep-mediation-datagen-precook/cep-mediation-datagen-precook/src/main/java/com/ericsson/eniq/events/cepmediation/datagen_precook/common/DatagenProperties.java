package com.ericsson.eniq.events.cepmediation.datagen_precook.common;

import static com.ericsson.eniq.events.cepmediation.datagen_precook.common.DataGenPropertiesConstants.*;

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

    public enum Node {
        GPEH, SGSN
    }

    protected static final Logger logger = LoggerFactory.getLogger(DatagenProperties.class);

    private static DatagenProperties instance;

    protected final Properties props = new Properties();

    private String ueContextMouduleidpath;

    private RncType type;

    private String imsiListPath;

    /**
     * Protected rather than private so we can extend the class in JUnit tests
     */
    protected DatagenProperties() {
        loadProperties();
    }

    /**
     * 
     */
    protected void loadProperties() {
        try {
            final InputStream in = new ResourceFileFinder().findResourceFile(DATAGEN_PROPERTIES_FILE_NAME);
            props.load(in);
        } catch (final IOException ioe) {
            logger.error("Error reading props file ", ioe);
            throw new RuntimeException(ioe);
        } catch (final ResourceLoadingFailedException e) {
            logger.error("Error loading resource", e);
            throw new RuntimeException(e);
        }
    }

    public RncType getType() {
        return type;
    }

    public void setType(final RncType type) {
        this.type = type;
        type.init(props.getProperty(type.getRncType()));
    }

    public File getInternalDir() {
        final String path = props.getProperty(INTNERNAL_DIR);
        return new File(path);
    }

    public File getMasterDatasetPath(final Node node) {
        String path = props.getProperty(MASTER_DATASET_PATH);
        path = path + "/" + node.toString();
        return new File(path);
    }

    public File getDestinationDir() {
        final String path = props.getProperty(GENERATED_DESTINATION);
        return new File(path);
    }

    public boolean generateDataForRNC09() {
        final String rnc09 = props.getProperty(RECREATE_ORIGINAL_DATA);
        return rnc09.equalsIgnoreCase("true");
    }

    public Set<String> getRNCNames() {
        final String rncs = props.getProperty(RNCSNAMES);
        final String[] rncsNames = rncs.trim().split(DELIMITER);

        final Set<String> namesSet = new HashSet<String>();

        namesSet.addAll(Arrays.asList(rncsNames));
        namesSet.remove(ORIGINAL_RNC_NAME);

        return Collections.unmodifiableSet(namesSet);
    }

    public Set<String> getInterestingEvents() {
        final String events = props.getProperty(PREPARSER_INTERESTINGEVENTS);
        final String[] eventIds = events.trim().replaceAll("\\s","").split(DELIMITER);

        // Add the array of eventIds to a set to remove duplicates
        final Set<String> eventSet = new HashSet<String>();
        eventSet.addAll(Arrays.asList(eventIds));

        return Collections.unmodifiableSet(eventSet);
    }

    public File getIntermediateFileLocation() {
        final String path = props.getProperty(DATAGEN_PREPARSER_INTERMEDIATE_FILELOCATION);
        return new File(path);
    }

    public Set<String> getSGSNsNames() {
        final String sgsns = props.getProperty(SGSNSNAMES);
        final String[] sgsnNames = sgsns.trim().split(DELIMITER);

        final Set<String> namesSet = new HashSet<String>();

        namesSet.addAll(Arrays.asList(sgsnNames));

        return Collections.unmodifiableSet(namesSet);
    }

    public int getNumberOfLinkFilesRequired() {
        final String numberOfLinkFiles = props.getProperty(NUMBER_OF_LINK_FILES);
        int numberofFilesRequired = 0;
        try {
            numberofFilesRequired = Integer.parseInt(numberOfLinkFiles);
        } catch (final Throwable e) {
            logger.error("Invalid value (Number of Link Files Required)" + e.getMessage());
        }
        return numberofFilesRequired;
    }

    public static DatagenProperties getInstance() {
        if (instance == null) {
            instance = new DatagenProperties();
        }
        return instance;
    }

    public String getUeContextModuleIDFilePath() {
        final String filepath = props.getProperty(UECONTEXT_MODULEID_FILE_PATH);
        return filepath;
    }

    public String getUeContextModudleIdPath() {
        return ueContextMouduleidpath;
    }

    public void setUeContextModudleIdPath(final String ueContextMouduleidpath) {
        this.ueContextMouduleidpath = ueContextMouduleidpath;
    }

    public String getImsiListPath() {
        return imsiListPath;
    }

    public void setImsiListPath(final String imsiListPath) {
        this.imsiListPath = imsiListPath;
    }

    public boolean useOneMinuteRops() {
        return Boolean.valueOf(props.getProperty(USE_ONE_MINUTE_ROPS));
    }

    public int getThreadPoolSize() {
        return Integer.parseInt(props.getProperty(THREAD_POOL));
    }

    public int getNumberOfEventsPerMb() {
        return Integer.parseInt(props.getProperty(DATAGEN_EVENTS_PER_MB));
    }
    
    public boolean includenonUeEvents() {
        return Boolean.valueOf(props.getProperty("datagen.include.nonue.events"));
    }
}
