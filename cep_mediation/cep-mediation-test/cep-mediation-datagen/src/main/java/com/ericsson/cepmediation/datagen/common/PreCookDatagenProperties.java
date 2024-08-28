package com.ericsson.cepmediation.datagen.common;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.resourceloading.ResourceFileFinder;
import com.ericsson.cepmediation.base.resourceloading.ResourceLoadingFailedException;

public class PreCookDatagenProperties {

    private static final Logger logger = LoggerFactory.getLogger(PreCookDatagenProperties.class);

    public static PreCookDatagenProperties instance = new PreCookDatagenProperties();

    private Properties props = new Properties();

    private PreCookDatagenProperties() {
        try {
            InputStream in = new ResourceFileFinder().findResourceFile("precookdatagen.properties");
            props.load(in);
        } catch (IOException ioe) {
            logger.error("Error reading props file ", ioe);
            throw new RuntimeException(ioe);
        } catch (ResourceLoadingFailedException e) {
            logger.error("Error loading resource", e);
            throw new RuntimeException(e);
        }
    }

    public File getMasterDatasetPath() {
        String path = props.getProperty("datagen.gpeh.master.dataset.path");
        return new File(path);
    }

    public File getDestinationDir() {
        String path = props.getProperty("datagen.gpeh.generated.destination");
        return new File(path);
    }

    public File getInternalDir() {
        String path = props.getProperty("datagen.gpeh.generated.internal");
        return new File(path);
    }

}
