/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.meta.admin;

import org.junit.Test;

import com.ericsson.cepmediation.base.meta.schema.SchemaException;

/**
 * @author eemecoy
 *
 */
public class SchemaHandlerTest {

    @Test
    public void testInitializationCanFindFilesOnClassPath() throws SchemaException {
        new SchemaHandler();

    }

}
