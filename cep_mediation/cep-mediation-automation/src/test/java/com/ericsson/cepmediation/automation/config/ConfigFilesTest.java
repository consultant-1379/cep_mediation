package com.ericsson.cepmediation.automation.config;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ericsson.cepmediation.base.properties.ConfigurationException;
import com.ericsson.cepmediation.base.util.Utilities;

public class ConfigFilesTest {

    private static final String CONFIG_XML = "automated_test_config/config.xml";
    
    private static final String NETWORK_ELEMENTS_XML = "automated_test_config/network_elements.xml";

    @Test
    public void validateConfigXml() {
        try {
            Utilities.parseAndValidate(CONFIG_XML);
        } catch (ConfigurationException e) {
            fail("Could not validate " + CONFIG_XML);
        }
    }
    
    @Test
    public void validateNetworkElementsXml() {
        try {
            Utilities.parseAndValidate(NETWORK_ELEMENTS_XML);
        } catch (ConfigurationException e) {
            fail("Could not validate " + NETWORK_ELEMENTS_XML);
        }
    }
}
