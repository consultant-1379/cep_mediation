/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.util.text;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author eemecoy
 *
 */
public class EnumTranslatorTest {

    @Test
    public void testToDescription() {
        final String result = EnumTranslator
                .translateEnumToEnglish(MyEnum.CONFIGURATION_INFORMATION_FOR_LOCAL_HOST_FOUND);
        assertEquals("Configuration information for local host found", result);
    }

    enum MyEnum {
        CONFIGURATION_INFORMATION_FOR_LOCAL_HOST_FOUND
    }
}
