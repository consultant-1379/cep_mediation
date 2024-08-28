/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.util;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;

import com.ericsson.cepmediation.base.util.ResourceLoadingUtilities;

/**
 * @author eemecoy
 *
 */
public class ClasspathHelper {

    public static InputStream getInputStreamForResourceOnClassPath(final String resource) throws FileNotFoundException {
        InputStream inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream(resource);
        if (inputStream == null) {
            inputStream = ClasspathHelper.class.getClassLoader().getResourceAsStream(resource);
        }
        if (inputStream == null) {
            throw new FileNotFoundException(resource);
        }
        return inputStream;
    }

    public static URL getURLForResourceOnClassPath(final String resource) {
        return new ClasspathHelper().getURLForResourceFromClassPath(resource);
    }

    URL getURLForResourceFromClassPath(final String resource) {
        URL urlForResource = ClassLoader.getSystemClassLoader().getResource(resource);

        if (urlForResource == null) {
            urlForResource = ResourceLoadingUtilities.class.getClassLoader().getResource(resource);

        }
        return urlForResource;

    }

}
