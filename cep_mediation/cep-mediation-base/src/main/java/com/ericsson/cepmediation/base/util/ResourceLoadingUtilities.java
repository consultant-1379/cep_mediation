/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.util;

import java.io.InputStream;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author eemecoy
 *
 */
public class ResourceLoadingUtilities {

    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(ResourceLoadingUtilities.class);

    private static final String FILE_PREFIX = "file:";

    /**
     * todo - make this non static
     */
    public static URL getURLForResourceOnClassPath(final String resource) {
        return new ResourceLoadingUtilities().getURLForResourceFromClassPath(resource);
    }

    URL getURLForResourceFromClassPath(final String resource) {
        URL urlForResource = ClassLoader.getSystemClassLoader().getResource(resource);
        logger.debug("on system class path, for " + resource + " found " + urlForResource);
        if (urlForResource == null) {
            urlForResource = ResourceLoadingUtilities.class.getClassLoader().getResource(resource);
            logger.debug("on class's class path, for " + resource + " found " + urlForResource);
        }
        return urlForResource;

    }

    public static InputStream getInputStreamForResourceOnClassPath(final String resource) {
        final InputStream inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream(resource);
        if (inputStream == null) {
            return ResourceLoadingUtilities.class.getClassLoader().getResourceAsStream(resource);
        }
        return inputStream;

    }

    public String getPathForResourceOnClassPath(final String resource) {
        final String path = getPathOfResourceOnClassPath(resource);
        return trimFilePrefixFromPathIfRequired(path);
    }

    private String trimFilePrefixFromPathIfRequired(final String path) {
        if (path.startsWith(FILE_PREFIX)) {
            return path.substring(5, path.length());
        }
        return path;
    }

    String getPathOfResourceOnClassPath(final String resource) {
        return getURLForResourceFromClassPath(resource).getPath();
    }

}
