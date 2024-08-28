/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.proc.config;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author eemecoy
 *
 */
public class ServiceConfigBeanTest {

    private static final String NEW_LINE = "\n";

    private ServiceConfigBean serviceConfigBean;

    @Before
    public void setup() {
        serviceConfigBean = new ServiceConfigBean();
    }

    @Test
    public void testForwarderClassIsTrimmedIfRequired() {
        final String className = "com.ericsson.somepackage.someclass";
        final String classNameWithWhiteSpace = className + NEW_LINE + NEW_LINE;
        serviceConfigBean.setForwarderType(classNameWithWhiteSpace);
        assertEquals(className, serviceConfigBean.getForwarderType());
    }

}
