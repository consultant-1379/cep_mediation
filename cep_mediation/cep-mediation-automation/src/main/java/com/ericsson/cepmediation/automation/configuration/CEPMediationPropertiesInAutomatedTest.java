/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.automation.configuration;

import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.base.resourceloading.ResourceLoadingFailedException;

/**
 * @author eemecoy
 *
 */
public class CEPMediationPropertiesInAutomatedTest {
    private static final Logger logger = LoggerFactory.getLogger(CEPMediationPropertiesInAutomatedTest.class);

    private final Properties allProps = new Properties();

    private static final CEPMediationPropertiesInAutomatedTest instance = new CEPMediationPropertiesInAutomatedTest();

    private CEPMediationPropertiesInAutomatedTest() {
    	// read the base CEP props from config.xml 
        PropertiesReader reader = new PropertiesReader();
        try {
            Properties props = reader.readProps("automated_test_config/config.xml");
            allProps.putAll(props);
        } catch (ResourceLoadingFailedException e) {
            logger.error("Fialed loading props", e);
            throw new RuntimeException(e);
        } catch (IOException e) {
            logger.error("Fialed loading props", e);
            throw new RuntimeException(e);
        }

        // add some additional props specific for automated tests
        allProps.put("host.ip", "10.44.79.41");
        allProps.put("automatedtest.cep.blade.hostName", "atrcxb1863.athtem.eei.ericsson.se");
        allProps.put("automatedtest.cep.blade.userName", "dcuser");
        allProps.put("automatedtest.cep.blade.password", "dcuser");
        allProps.put("automatedtest.cep.blade.rootUser", "root");
        allProps.put("automatedtest.cep.blade.rootPassword", "shroot");
        
        allProps.put("automatedtest.eniq.events.db.user", "dc");
        allProps.put("automatedtest.eniq.events.db.password", "dc");
        allProps.put("automatedtest.eniq.events.db.databaseName", "dwhdb");
        allProps.put("automatedtest.eniq.events.db.serverName", "atrcxb1877.athtem.eei.ericsson.se");
        allProps.put("automatedtest.eniq.events.db.server.user", "dcuser");
        allProps.put("automatedtest.eniq.events.db.server.pass", "dcuser");
        allProps.put("automatedtest.eniq.events.db.portNumber", "2640");
        allProps.put("log.directory", "/var/log/ericsson/cep-mediation/");
        allProps.put("package.install.configured", "true");
        allProps.put("automatedtest.data.loading.sleep.period", "2");
        //IMPORTANT!!!! This value should match the raw files path definitions in automated_test_config/network_elements.xml
        allProps.put("automatedtest.home.dir", "/eniq/home/dcuser/cep_mediation_automation");
    }

    public static boolean getBooleanProperty(String propertyName) {
        return Boolean.valueOf(getProperty(propertyName).trim());
    }

    public static String getProperty(final String propertyName) {
        return instance.allProps.getProperty(propertyName);
    }

    public static String getProperty(CepMediationProperty key) {
        return instance.allProps.getProperty(key.getPropertyName());
    }
}
