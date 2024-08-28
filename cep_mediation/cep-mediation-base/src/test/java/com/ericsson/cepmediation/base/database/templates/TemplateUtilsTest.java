/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.database.templates;

import static com.ericsson.cepmediation.base.database.templates.TemplateFiles.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author eemecoy
 *
 */
public class TemplateUtilsTest {

    private TemplateUtils templateUtils;

    @Before
    public void setup() throws TemplateException {
        templateUtils = new TemplateUtils();
    }

    @Test
    public void testGettingValidTemplate() throws TemplateException {
        final String sql = templateUtils.getQueryFromTemplate(SCRAMBLING_CODE_VM);
        assertNotNull(sql);
    }

    @Test(expected = TemplateException.class)
    public void testExceptionThrownForMissingTemplateFile() throws TemplateException {
        templateUtils.getQueryFromTemplate("Some non existent file");
    }
}
