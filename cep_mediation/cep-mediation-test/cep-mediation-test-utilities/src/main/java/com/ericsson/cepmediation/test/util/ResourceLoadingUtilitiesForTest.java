/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.util;

import java.net.URL;

import com.ericsson.cepmediation.base.util.ResourceLoadingUtilities;

/**
 * @author eemecoy
 *
 */
public class ResourceLoadingUtilitiesForTest {

    public static String getFullPathForFileOnClasspath(final String fileOnClasspath) {
        final URL urlForResource = ResourceLoadingUtilities.getURLForResourceOnClassPath(fileOnClasspath);
        return urlForResource.getPath();
    }

}
