/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.resourceloading;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author eemecoy
 *
 */
public class URLGenerator {

    /**
     * Return the URL for given file
     * 
     * @param fileName          the full path and name of file
     * @return URL for file if it exists, null otherwise or if a MalformedURLException occurred
     */
    public static URL getURLForFileName(final String fileName) {
        final File file = new File(fileName);
        if (file.exists()) {
            try {
                return file.toURI().toURL();
            } catch (final MalformedURLException e) {
                return null;
            }
        }
        return null;
    }

}
