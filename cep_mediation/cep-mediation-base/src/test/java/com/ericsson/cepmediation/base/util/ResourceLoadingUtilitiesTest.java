/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.util;

import static org.junit.Assert.*;

import java.net.URL;

import org.junit.Before;
import org.junit.Test;

/**
 * @author eemecoy
 *
 */
public class ResourceLoadingUtilitiesTest {

    private ResourceLoadingUtilities resourceLoadingUtilities;

    URL mockedURL;

    String pathOfResourceFromGetPath;

    @Before
    public void setup() {
        pathOfResourceFromGetPath = null;
        resourceLoadingUtilities = new StubbedResourceLoadingUtilites();
    }

    @Test
    public void testgetPathForResourceOnClassPathStripsOffFilePrefix() {
        final String correctPath = "/opt/ericsson/cep-mediation/cep-mediation_1.0.1/lib/cep-mediation-ap-event-beans-generated-2.2.6.jar!/esper/esper-conf.xml";
        pathOfResourceFromGetPath = "file:" + correctPath;
        assertEquals(correctPath, resourceLoadingUtilities.getPathForResourceOnClassPath("some_resource.txt"));
    }

    @Test
    public void testgetPathForResourceOnClassPathReturnsPlainPathIfNoFilePrefix() {
        final String correctPath = "/opt/ericsson/cep-mediation/cep-mediation_1.0.1/lib/cep-mediation-ap-event-beans-generated-2.2.6.jar!/esper/esper-conf.xml";
        pathOfResourceFromGetPath = correctPath;
        assertEquals(correctPath, resourceLoadingUtilities.getPathForResourceOnClassPath("some_resource.txt"));
    }

    class StubbedResourceLoadingUtilites extends ResourceLoadingUtilities {
        /* (non-Javadoc)
         * @see com.ericsson.cepmediation.base.util.ResourceLoadingUtilities#getPathOfResourceOnClassPath(java.lang.String)
         */
        @Override
        String getPathOfResourceOnClassPath(final String resource) {
            return pathOfResourceFromGetPath;
        }
    }

}
