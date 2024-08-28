package com.ericsson.cepmediation.base.properties;

import static org.junit.Assert.assertNotNull;

import javax.xml.bind.JAXBException;

import org.junit.Test;

public class ConfigBinderTest {
    @Test
    public void testGetInstanceDoesntThrowException() throws ConfigurationException {
        assertNotNull(ConfigBinder.getInstance());
    }
    
    @Test
    public void shouldRetrieveStandaloneProcesses() throws ConfigurationException, JAXBException {
        assertNotNull(StandaloneConfigBinder.getInstance());
    }
}


