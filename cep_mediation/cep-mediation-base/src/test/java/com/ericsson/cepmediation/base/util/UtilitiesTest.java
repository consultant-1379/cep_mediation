package com.ericsson.cepmediation.base.util;

import org.jdom.Element;
import org.junit.Test;
import static org.junit.Assert.*;

import com.ericsson.cepmediation.base.properties.ConfigurationException;

public class UtilitiesTest {

    @Test
    public void validateConfigXml() {
        try {
            Element root = Utilities.loadConfigurationFile();
            assertNotNull(root);
        } catch (ConfigurationException e) {
            fail("Validation of config.xml failed: " + e.getMessage());
        }
    }

    @Test
    public void validateNetworkElementsXml() {
        try {
            Element root = Utilities.loadNetworkElementsFile();
            assertNotNull(root);
        } catch (ConfigurationException e) {
            fail("Validation of network_elements.xml failed: " + e.getMessage());
        }
    }

    @Test
    public void validateStandaloneXml() {
        try {
            Element root = Utilities.loadStandaloneXmlFile();
            assertNotNull(root);
        } catch (ConfigurationException e) {
            fail("Validation of standalone.xml failed: " + e.getMessage());
        }
    }

    @Test
    public void extractTacFromImeiSvTestwithSixteenDigitNoleadingZero() {
        String imeisv = "1234567890123456";
        int expectedTac = 12345678;

        assertEquals("", expectedTac, Utilities.extractTacFromImeiSvforWCDMA(imeisv));

    }

    @Test
    public void extractTacFromImeiSvTestwithSixteenDigitleadingZero() {
        String imeisv = "0123456789012345";
        int expectedTac = 1234567;

        assertEquals("", expectedTac, Utilities.extractTacFromImeiSvforWCDMA(imeisv));

    }

    @Test
    public void extractTacFromImeiSvTestwithfifteenDigitNoleadingZero() {
        String imeisv = "123456789012345";
        int expectedTac = 12345678;

        assertEquals("", expectedTac, Utilities.extractTacFromImeiSvforWCDMA(imeisv));

    }

    @Test
    public void extractTacFromImeiSvTestwithSixDigits() {
        String imeisv = "1234567";
        int expectedTac = -1;

        assertEquals("", expectedTac, Utilities.extractTacFromImeiSvforWCDMA(imeisv));

    }

}
