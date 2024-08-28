/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2013 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.eniq.events.cepmediation.datagen_precook;

import static com.ericsson.eniq.events.cepmediation.datagen_precook.common.DataGenPropertiesConstants.ORIGINAL_RNC_NAME;
import static com.ericsson.eniq.events.cepmediation.datagen_precook.common.DataGenPropertiesConstants.RECREATE_ORIGINAL_DATA;
import static com.ericsson.eniq.events.cepmediation.datagen_precook.common.DataGenPropertiesConstants.RNCSNAMES;
import static com.ericsson.eniq.events.cepmediation.datagen_precook.common.DataGenPropertiesConstants.SGSNSNAMES;
import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import com.ericsson.eniq.events.cepmediation.datagen_precook.common.DatagenProperties;

/**
 * @author eeikonl
 * @since 2013
 *
 */
public class DatagenPropertiesTest {

    static final String MOCKED_FILE_NAME = "datagen.properties.mocked";

    final Map<String, String> properties = new HashMap<String, String>();
    {
        properties.put("datagen.intnernal.dir", "/proj/cep/eeikonl/GPEHRopInternal/");
        properties.put("datagen.gpeh.master.dataset.path", "/proj/cep/eeikonl/GPEHFullMasterSet");
        properties.put("datagen.gpeh.generated.destination", "/proj/cep/eeikonl/GPEHRopFilesOutput");
        properties.put("datagen.gpeh.rncsnames", "RNC01");
        properties.put("datagen.gpeh.orginaldata", "false");
        properties.put("datagen.gpeh.sgsnsnames", "SGSN01");
        properties.put("datagen.preparser.interestingevents", "384,458,456,438,436,433,432,408");
    }

    @Before
    public void setup() {
        writeMockedProperties();
    }

    /**
     * 
     */
    protected void writeMockedProperties() {
        try {
            PrintWriter writer;
            writer = new PrintWriter(MOCKED_FILE_NAME);
            for (final String key : properties.keySet()) {
                writer.println(key + "=" + properties.get(key));
            }
            writer.close();
        } catch (final FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    protected void writeMockedProperties(final String key, final String value) {
        properties.put(key, value);
        writeMockedProperties();
    }

    @Test
    public void testGenerateDataForRNC09false_expectfalse() {
        writeMockedProperties(RECREATE_ORIGINAL_DATA, "false");
        final boolean expected = false;

        final boolean result = new StubbedDatagenProperties().generateDataForRNC09();

        assertEquals(expected, result);

    }

    @Test
    public void testGenerateDataForRNC09true_expecttrue() {
        writeMockedProperties(RECREATE_ORIGINAL_DATA, "true");
        final boolean expected = true;

        final boolean result = new StubbedDatagenProperties().generateDataForRNC09();

        assertEquals(expected, result);

    }

    @Test
    public void testGenerateDataForRNC09TRUE_expecttrue() {
        writeMockedProperties(RECREATE_ORIGINAL_DATA, "TRUE");
        final boolean expected = true;

        final boolean result = new StubbedDatagenProperties().generateDataForRNC09();

        assertEquals(expected, result);

    }

    @Test
    public void testGenerateDataForRNC09gibberish_expectfalse() {
        writeMockedProperties(RECREATE_ORIGINAL_DATA, "nhsdfjklhsjkl");
        final boolean expected = false;

        final boolean result = new StubbedDatagenProperties().generateDataForRNC09();

        assertEquals(expected, result);

    }

    @Test
    public void testGetRNCNamesincludingOriginalRNC_expectingOriginalRncToBeExcluded() {
        writeMockedProperties(RNCSNAMES, "RNC01," + ORIGINAL_RNC_NAME);
        final Set<String> rncNames = new StubbedDatagenProperties().getRNCNames();
        assertFalse(rncNames.contains(ORIGINAL_RNC_NAME));
    }

    @Test
    public void testGetRNCNamesincludingOriginalRNC_expectingSizeToBe1() {
        writeMockedProperties(RNCSNAMES, "RNC01," + ORIGINAL_RNC_NAME);
        final Set<String> rncNames = new StubbedDatagenProperties().getRNCNames();
        assertEquals(1, rncNames.size());
    }

    @Test
    public void testGetRNCNamesincludingOriginalRNC_expectingOnlyRNC01() {
        writeMockedProperties(RNCSNAMES, "RNC01," + ORIGINAL_RNC_NAME);
        final Set<String> rncNames = new StubbedDatagenProperties().getRNCNames();
        assertTrue(rncNames.contains("RNC01"));
    }

    @Test
    public void testGetRNCNamesexcludingOriginalRNC() {
        writeMockedProperties(RNCSNAMES, "RNC01," + ORIGINAL_RNC_NAME);
        final Set<String> rncNames = new StubbedDatagenProperties().getRNCNames();
        assertFalse(rncNames.contains(ORIGINAL_RNC_NAME));
    }

    @Test
    public void testGetSgsnName_sizeIs1() {
        writeMockedProperties(SGSNSNAMES, "SGSN01");
        final Set<String> sgsnNames = new StubbedDatagenProperties().getSGSNsNames();
        assertEquals(1, sgsnNames.size());
    }

    @Test
    public void testGetSgsnName_containsSGSN01() {
        writeMockedProperties(SGSNSNAMES, "SGSN01");
        final Set<String> sgsnNames = new StubbedDatagenProperties().getSGSNsNames();
        assertTrue(sgsnNames.contains("SGSN01"));
    }

    @Test
    public void testGetSgsnName_multipleNames() {
        writeMockedProperties(SGSNSNAMES, "SGSN01,SGSN02,SGSN03");
        final Set<String> sgsnNames = new StubbedDatagenProperties().getSGSNsNames();
        final List<String> sgsns = new ArrayList<String>();
        sgsns.add("SGSN01");
        sgsns.add("SGSN02");
        sgsns.add("SGSN03");
        assertTrue(sgsnNames.containsAll(sgsns));
        assertEquals(3, sgsnNames.size());
    }

    @AfterClass
    public static void cleanUP() {
        final File f = new File(MOCKED_FILE_NAME);
        if (f.exists()) {
            f.delete();
        }
    }
}

class StubbedDatagenProperties extends DatagenProperties {

    @Override
    protected void loadProperties() {
        try {
            final InputStream in = new FileInputStream(new File(DatagenPropertiesTest.MOCKED_FILE_NAME));
            props.load(in);
        } catch (final IOException ioe) {
            logger.error("Error reading props file ", ioe);
            throw new RuntimeException(ioe);
        }
    }

}
