/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.properties;

import com.ericsson.cepmediation.config.bean.AppStartTypeEnum;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author EEMECOY
 *
 */
public class PropertyValidatorTest {

    private PropertyValidator propertyValidator;

    Map<String, String> userProperties;

    @Before
    public void setup() {
        userProperties = new HashMap<String, String>();
        propertyValidator = new StubbedPropertyValidator();
    }

    @Test(expected = MissingSystemPropertyException.class)
    public void testExceptionThrownWhenMissingProperty() throws ConfigurationException {
        propertyValidator.checkStartUpPropertiesPresent(AppStartTypeEnum.CEP_MEDIATION);
    }

    class StubbedPropertyValidator extends PropertyValidator {
        @Override
        Map<String, String> getPropertiesConfiguredByUser() throws ConfigurationException {
            return userProperties;
        }
    }

}
