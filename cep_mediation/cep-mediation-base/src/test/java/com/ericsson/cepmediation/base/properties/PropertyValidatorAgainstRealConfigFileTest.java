/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.properties;

import com.ericsson.cepmediation.base.util.ErrorCode;
import com.ericsson.cepmediation.config.bean.AppStartTypeEnum;
import org.junit.Before;
import org.junit.Test;

/**
 * @author EEMECOY
 *
 */
public class PropertyValidatorAgainstRealConfigFileTest {

    private PropertyValidator propertyValidator;

    @Before
    public void setup() {
        propertyValidator = new PropertyValidator();
    }

    @Test
    public void testRunningAgainstRealConfigXMLFileThrowsNoException() throws ConfigurationException {
        try {
            propertyValidator.checkStartUpPropertiesPresent(AppStartTypeEnum.CEP_MEDIATION);    
        //No need to validate of the test machine towards the running network_elements.xml    
        } catch (ConfigurationException e) {
           if(e.getErrorCode() != ErrorCode.NOT_ENOUGH_FREE_MEMORY)
               throw e;
        }
        
    }

}
