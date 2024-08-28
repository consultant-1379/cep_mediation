/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.lookup.impl;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.ericsson.cepmediation.base.database.entity.MccMncPair;
import com.ericsson.cepmediation.base.database.entity.RabTypeInfo;
import com.ericsson.cepmediation.base.database.entity.RabType;
import com.ericsson.cepmediation.base.database.iq.IqDatabaseManager;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;

/**
 * @author eemecoy
 *
 */
@Ignore
public class DataStoreTest {

    private DataStore dataStore;

    int configuredPropertyInMs;

    IqDatabaseManager mockedIqDatabaseManager;

    private int rabType1 = 11;

    private int rabType2 = 3;

    private String rabTypeDesc1 = "CONVERSATIONAL_CS_12.2_12.2-INTERACTIVE_PS_0_0";

    private String rabTypeDesc2 = "INTERACTIVE_PS_64_HS";

    private String mcc1 = "440";

    private String mcc2 = "441";

    private String mnc1 = "84";

    private String mnc2 = "85";

    @Before
    public void setup() {
        configuredPropertyInMs = 0;
        mockedIqDatabaseManager = mock(IqDatabaseManager.class);
        setUpMocksInDatabaseManager();
        dataStore = new StubbedDataStore();
    }

    @Test
    public void testGetMccMncPairs() {
        Map<String, MccMncPair> mccMncPairs = dataStore.getMccMnc();
        assertThat(mccMncPairs.size(), is(2));
        checkMccMncPair(mcc1, mnc1, mccMncPairs);
        checkMccMncPair(mcc2, mnc2, mccMncPairs);
    }

    private void checkMccMncPair(String mcc, String mnc, Map<String, MccMncPair> mccMncPairs) {
        MccMncPair mccMncPair = mccMncPairs.get(mcc + mnc);
        assertThat(mccMncPair.getMcc(), is(mcc));
        assertThat(mccMncPair.getMnc(), is(mnc));
    }

    @Test
    public void testGetPsRabs() {
        Map<Integer, String> psRabs = dataStore.getPsRabs();
        assertThat(psRabs.size(), is(2));
        assertThat(psRabs.get(rabType1), is(rabTypeDesc1));
        assertThat(psRabs.get(rabType2), is(rabTypeDesc2));
    }

    @Test
    public void testGetRabCount() {
        Map<Integer, RabTypeInfo> rabCount = dataStore.getRabTypesInfo();
        assertThat(rabCount.size(), is(2));
        RabTypeInfo count = rabCount.get(rabType1);
        assertThat(count.getPsRabCount(), is((byte) 1));
        assertThat(count.getCsRabCount(), is((byte) 1));
        RabTypeInfo count2 = rabCount.get(rabType2);
        assertThat(count2.getPsRabCount(), is((byte) 1));
        assertThat(count2.getCsRabCount(), is((byte) 0));
    }

    @Test
    public void testGettingConfiguredSleepInterval() {
        final int newlyConfiguredValue = 1440;
        configuredPropertyInMs = newlyConfiguredValue;
        final long expectedValue = newlyConfiguredValue * 60 * 1000;
        assertThat(dataStore.getConfiguredSleepIntervalInMS(), is(expectedValue));
    }

    private void setUpMocksInDatabaseManager() {
        setUpRabTypes();
        setUpMccMncs();
    }

    private void setUpMccMncs() {
        List<MccMncPair> mccMncPairs = new ArrayList<MccMncPair>();
        MccMncPair mccMncPair1 = new MccMncPair();
        mccMncPairs.add(mccMncPair1);
        mccMncPair1.setMcc(mcc1);
        mccMncPair1.setMnc(mnc1);
        MccMncPair mccMncPair2 = new MccMncPair();
        mccMncPair2.setMcc(mcc2);
        mccMncPair2.setMnc(mnc2);
        mccMncPairs.add(mccMncPair2);
        when(mockedIqDatabaseManager.getMccMncPairs()).thenReturn(mccMncPairs);
    }

    public void setUpRabTypes() {
        List<RabType> rabTypes = new ArrayList<RabType>();

        RabType rabTypeToStore1 = new RabType();
        rabTypeToStore1.setRabType(rabType1);
        rabTypeToStore1.setRabTypeDesc(rabTypeDesc1);
        rabTypeToStore1.setCategoryId(true);
        rabTypes.add(rabTypeToStore1);

        RabType rabTypeToStore2 = new RabType();
        rabTypeToStore2.setRabType(rabType2);
        rabTypeToStore2.setRabTypeDesc(rabTypeDesc2);
        rabTypeToStore2.setCategoryId(true);
        rabTypes.add(rabTypeToStore2);

        when(mockedIqDatabaseManager.getRabTypes()).thenReturn(rabTypes);
    }

    class StubbedDataStore extends DataStore {
        @Override
        int getIntProperty(final CepMediationProperty property) {
            return configuredPropertyInMs;
        }

        @Override
        IqDatabaseManager setUpIqDatabaseManagerInstance() {
            return mockedIqDatabaseManager;
        }
    }
}
