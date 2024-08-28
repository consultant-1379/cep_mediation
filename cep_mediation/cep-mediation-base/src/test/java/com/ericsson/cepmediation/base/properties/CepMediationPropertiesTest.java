/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.properties;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Difficult to test this class because of static/singleton methods, difficult to inject property values
 *
 * @author eemecoy
 *
 */
public class CepMediationPropertiesTest {

    @Test
    public void testIsWindowsOS() {
        final boolean expectedResult;
        final String osName = System.getProperty("os.name").toUpperCase();
        if (osName.contains("WINDOW")) {
            expectedResult = true;
        } else {
            expectedResult = false;
        }
        assertThat(CepMediationProperties.isWindowsOS(), is(expectedResult));
    }

    @Test
    public void testGettingValidLongPropertyDoesntThrowException() {
        CepMediationProperties.getLongProperty(CepMediationProperty.STATS_COLLECTION_PERIOD);
    }

    @Test
    public void testGettingValidFilePropertyDoesntThrowException() {
        CepMediationProperties.getFileProperty(CepMediationProperty.IQ_BINARY_DIRECTORY);
    }

    @Test
    public void testGettingValidBooleanPropertyDoesntThrowException() {
        CepMediationProperties.getBooleanProperty(CepMediationProperty.STATS_COLLECTION_ACTIVE);
    }

    @Test
    public void testGettingValidIntPropertyDoesntThrowException() {
        CepMediationProperties.getIntProperty(CepMediationProperty.GENERAL_SERVER_COLLECTION_INTERVAL);
    }

}
