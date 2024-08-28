/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.server.management.util;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * @author eemecoy
 *
 */
public class AdminHelperTest {

    private AdminHelper adminHelper;

    @Before
    public void setup() {
        adminHelper = new AdminHelper();
    }

    @Test
    public void testGetAsList() {
        final String[] array = new String[] {};
        final List<String> result = adminHelper.getAsList(array);
        assertThat(result.size(), is(0));
    }

}
