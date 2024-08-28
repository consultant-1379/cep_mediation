/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.meta.persistence;

import java.io.IOException;

import org.jaxen.JaxenException;
import org.jdom.JDOMException;
import org.junit.Test;

import com.ericsson.cepmediation.base.resourceloading.ResourceLoadingFailedException;

/**
 * @author eemecoy
 *
 */
public class PersistenceTest {

    @Test
    public void testPersistenceXMLLoadsWithoutException() throws JaxenException, JDOMException, IOException, ResourceLoadingFailedException {
        new Persistence("xml/persistence.xml");
    }

}
