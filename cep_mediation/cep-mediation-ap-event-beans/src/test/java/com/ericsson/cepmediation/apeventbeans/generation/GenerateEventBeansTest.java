/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.apeventbeans.generation;

import static org.junit.Assert.*;

import java.sql.Types;

import org.junit.Test;

/**
 * @author eemecoy
 *
 */
public class GenerateEventBeansTest {

    @Test
    public void testGetParameterInitValueForFloat() {
        String floatInitValue = GenerateEventBeans.getParameterInitValue(Types.FLOAT, true);
        assertEquals("1.4E-45f", floatInitValue);
    }

}
