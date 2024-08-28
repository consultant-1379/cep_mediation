/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.resourceloading;

import java.io.InputStream;
import java.net.URL;

import com.ericsson.cepmediation.base.util.FileUtils;

/**
 * Read resource file from an absolute path
 * This can be used in the case of code running externally eg the hyperic plugin won't have anything specified on the classpath
 * but will be running on the Linux server, so can just specify the absolute path of the resource file
 * 
 * @author eemecoy
 *
 */
public class ReadResourceFileFromAbsolutePath implements ReadResource {

    private static final String PATH_TO_RESOURCES_ON_SERVER = "/opt/ericsson/cep-mediation/cep-mediation/etc/";

    /* (non-Javadoc)
     * @see com.ericsson.cepmediation.base.properties.ConfigFileLocation#findConfigFile()
     */
    @Override
    public InputStream findResourceFile(final String fileName) {
        return FileUtils.readInputStreamForFile(PATH_TO_RESOURCES_ON_SERVER + fileName);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Using resource file found in " + PATH_TO_RESOURCES_ON_SERVER;
    }

    @Override
    public URL findResourceFileAsURL(final String fileName) {
        final String absoluteFileName = PATH_TO_RESOURCES_ON_SERVER + fileName;
        return URLGenerator.getURLForFileName(absoluteFileName);
    }

}
