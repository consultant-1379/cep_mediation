/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.resourceloading;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class to loop over a list of possible locations for the resource filex and return an InputStream for
 * the first instance of the file it finds
 * 
 * This is to accomodate running the application in different modes eg from a shell script in Linux, as part of 
 * hyperic plugin, from Eclipse
 * 
 * @author eemecoy
 *
 */
public class ResourceFileFinder {

    private static final Logger logger = LoggerFactory.getLogger(ResourceFileFinder.class);

    private static List<Class<? extends ReadResource>> classes = new ArrayList<Class<? extends ReadResource>>();
    static {
        classes.add(ReadResourceFileFromRootPathVariableAndMaven.class);
        classes.add(ReadResourceFileFromClasspath.class);
        classes.add(ReadResourceFileFromAbsolutePath.class);
    }

    public InputStream findResourceFile(final String fileName) throws ResourceLoadingFailedException {
        try {
            for (final Class<? extends ReadResource> clazz : classes) {
                final ReadResource resourceFileLocation = clazz.newInstance();
                logger.debug("Looking for file " + fileName + " in " + resourceFileLocation);
                final InputStream resourceFileInputStream = resourceFileLocation.findResourceFile(fileName);
                if (resourceFileInputStream != null) {
                    logger.debug("Using file found in " + resourceFileLocation);
                    return resourceFileInputStream;
                }
            }
            throw new ResourceLoadingFailedException("Could not find file in any of the locations");
        } catch (final IllegalAccessException e) {
            throw new ResourceLoadingFailedException(e);
        } catch (final InstantiationException e) {
            throw new ResourceLoadingFailedException(e);
        }

    }

    public URL findURLForResourceFile(final String fileName) throws ResourceLoadingFailedException {
        try {
            for (final Class<? extends ReadResource> clazz : classes) {
                final ReadResource resourceFileLocation = clazz.newInstance();
                logger.debug("Looking for file " + fileName + " in " + resourceFileLocation);
                final URL resourceFileURL = resourceFileLocation.findResourceFileAsURL(fileName);
                if (resourceFileURL != null) {
                    logger.debug("Using file found in " + resourceFileLocation);
                    return resourceFileURL;
                }
            }
            throw new ResourceLoadingFailedException("Could not find file in any of the locations");
        } catch (final IllegalAccessException e) {
            throw new ResourceLoadingFailedException(e);
        } catch (final InstantiationException e) {
            throw new ResourceLoadingFailedException(e);
        }

    }

    public String getFullPathToFileResource(final String fileName) throws ResourceLoadingFailedException {
        return findURLForResourceFile(fileName).getFile();

    }

}
