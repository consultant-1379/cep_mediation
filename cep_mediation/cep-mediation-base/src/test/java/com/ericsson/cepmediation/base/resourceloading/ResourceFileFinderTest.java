/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.resourceloading;

import static org.junit.Assert.*;

import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.base.util.constants.ApplicationConstants;

/**
 * @author eemecoy
 *
 */
public class ResourceFileFinderTest {

    private ResourceFileFinder resourceFileFinder;

    @Before
    public void setup() {
        resourceFileFinder = new ResourceFileFinder();
    }

    @Test
    public void testFindResourceFileForConfigXML() throws Exception {
        testFindingFile(ApplicationConstants.getInstance().getConfigFile());
    }

    @Test
    public void testFindResourceFileForSchemaXSD() throws Exception {
        testFindingFile("xml/SchemaTypes.xsd");
    }

    private void testFindingFile(final String fileName) throws ResourceLoadingFailedException {
        final InputStream inputStream = resourceFileFinder.findResourceFile(fileName);
        assertNotNull(inputStream);
    }

}
