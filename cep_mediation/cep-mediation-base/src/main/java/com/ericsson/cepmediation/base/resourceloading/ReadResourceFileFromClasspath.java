/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.resourceloading;

import java.io.InputStream;
import java.net.URL;

import com.ericsson.cepmediation.base.util.ResourceLoadingUtilities;

/**
 * Try reading the resource file from the classpath
 * When running on Linux, the resources are provided to the application in the classpath
 * When running from Eclipse, the resources may be available on the classpath
 * 
 * @author eemecoy
 *
 */
public class ReadResourceFileFromClasspath implements ReadResource {

    /* (non-Javadoc)
     * @see com.ericsson.cepmediation.base.properties.ConfigFileLocation#findConfigFile()
     */
    @Override
    public InputStream findResourceFile(final String fileName) {
        return ResourceLoadingUtilities.getInputStreamForResourceOnClassPath(fileName);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Config file location: classpath";
    }

    @Override
    public URL findResourceFileAsURL(final String fileName) {
        return ResourceLoadingUtilities.getURLForResourceOnClassPath(fileName);
    }

}
