/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.lookup.impl;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.base.database.entity.CellIdentifier;
import com.ericsson.cepmediation.base.database.entity.MccMncPair;
import com.ericsson.cepmediation.correlation.support.Category;

/**
 * @author eemecoy
 *
 */
public class DefaultLookupServiceTest {

    private static final int UNKNOWN_KEY_VALUE = -1;

    private DefaultLookupService defaultLookupService;

    private final int scramblingCode = 3;

    private final int cellId = 4;

    private final int rncId = 5;

    private final String mcc = "454";

    private final String mnc = "06";

    final long imsi = 4540600011111l;

    DataStore mockedDataStore;

    @Before
    public void setup() {
        mockedDataStore = mock(DataStore.class);
        mockMccMncPairInDB();
        final Map<CellIdentifier, Integer> scramblingCodes = new HashMap<CellIdentifier, Integer>();
        final CellIdentifier cellIdentifier = new CellIdentifier();
        cellIdentifier.setRncId(rncId);
        cellIdentifier.setCellId(cellId);
        scramblingCodes.put(cellIdentifier, scramblingCode);
        when(mockedDataStore.getScramblingCodes()).thenReturn(scramblingCodes);
        defaultLookupService = new StubbedDefaultLookupService();
    }

    @Test
    public void testextractMccAndMnc() {
        MccMncPair mccMncPair = defaultLookupService.extractMccAndMnc(imsi);
        assertThat(mccMncPair.getMcc(), is(mcc));
        assertThat(mccMncPair.getMnc(), is(mnc));
    }

    @Test
    public void testEmptyStringReturnedIfCannotFindMccForIMSI() {
        assertThat(defaultLookupService.getMcc(123456), is(""));
    }

    @Test
    public void testNullPointerNotThrownIfCannotFindMncForIMSI() {
        assertThat(defaultLookupService.getMnc(123456), is(""));
    }

    @Test
    public void testGetValueForUserPlaneFunction() {
        final String userPlaneFunctionKey = "some up key";
        final int value = 3;
        final Map<String, Integer> userPlaneFunctions = new HashMap<String, Integer>();
        userPlaneFunctions.put(userPlaneFunctionKey, value);
        when(mockedDataStore.getUpFunctionList()).thenReturn(userPlaneFunctions);
        final int result = defaultLookupService.getValue(Category.FUNCTION, userPlaneFunctionKey);
        assertThat(result, is(value));
        assertThat(defaultLookupService.getValue(Category.FUNCTION, "unknown key"), is(UNKNOWN_KEY_VALUE));
    }

    @Test
    public void testGetValueForUserPlaneProtocol() {
        final String userPlaneProtocolKey = "some up key";
        final int value = 3;
        final Map<String, Integer> userPlaneProtocols = new HashMap<String, Integer>();
        userPlaneProtocols.put(userPlaneProtocolKey, value);
        when(mockedDataStore.getUpProtocolList()).thenReturn(userPlaneProtocols);
        final int result = defaultLookupService.getValue(Category.PROTOCOL, userPlaneProtocolKey);
        assertThat(result, is(value));
        assertThat(defaultLookupService.getValue(Category.PROTOCOL, "unknown key"), is(UNKNOWN_KEY_VALUE));
    }

    @Test
    public void testGetValueForUserPlaneServiceProvider() {
        final String validKey = "some up key";
        final int value = 3;
        final Map<String, Integer> userPlaneValues = new HashMap<String, Integer>();
        userPlaneValues.put(validKey, value);
        when(mockedDataStore.getUpProviderList()).thenReturn(userPlaneValues);
        final int result = defaultLookupService.getValue(Category.SERVICE_PROVIDER, validKey);
        assertThat(result, is(value));
        assertThat(defaultLookupService.getValue(Category.SERVICE_PROVIDER, "unknown key"), is(UNKNOWN_KEY_VALUE));
    }

    @Test
    public void testGetValueForClient() {
        final String validKey = "some up key";
        final int value = 3;
        final Map<String, Integer> userPlaneValues = new HashMap<String, Integer>();
        userPlaneValues.put(validKey, value);
        when(mockedDataStore.getUpClientList()).thenReturn(userPlaneValues);
        final int result = defaultLookupService.getValue(Category.CLIENT, validKey);
        assertThat(result, is(value));
        assertThat(defaultLookupService.getValue(Category.CLIENT, "unknown key"), is(UNKNOWN_KEY_VALUE));
    }

    @Test
    public void testGetValueForEncapsulation() {
        final String validKey = "some up key";
        final int value = 3;
        final Map<String, Integer> userPlaneValues = new HashMap<String, Integer>();
        userPlaneValues.put(validKey, value);
        when(mockedDataStore.getUpEncapsulationList()).thenReturn(userPlaneValues);
        final int result = defaultLookupService.getValue(Category.ENCAPSULATION, validKey);
        assertThat(result, is(value));
        assertThat(defaultLookupService.getValue(Category.ENCAPSULATION, "unknown key"), is(UNKNOWN_KEY_VALUE));
    }

    @Test
    public void testGetValueForEncyption() {
        final String validKey = "some up key";
        final int value = 3;
        final Map<String, Integer> userPlaneValues = new HashMap<String, Integer>();
        userPlaneValues.put(validKey, value);
        when(mockedDataStore.getUpEncryptionList()).thenReturn(userPlaneValues);
        final int result = defaultLookupService.getValue(Category.ENCRYPTION, validKey);
        assertThat(result, is(value));
        assertThat(defaultLookupService.getValue(Category.ENCRYPTION, "unknown key"), is(UNKNOWN_KEY_VALUE));
    }

    @Test
    public void testGetScramblingCodeForNotMatchingCell() {
        final int nonMatchingRnc = 77;
        final int nonMatchingCell = 3;
        assertThat(defaultLookupService.getScramblingCode(nonMatchingRnc, nonMatchingCell), is((Integer) null));
    }

    @Test
    public void testGetScramblingCodeForMatchingCell() {
        assertThat(defaultLookupService.getScramblingCode(rncId, cellId), is(scramblingCode));
    }

    @Test
    public void testIsForServingCellIsTrueIfFindMatchingScramblingCode() {
        assertThat(defaultLookupService.isForServingCell(rncId, cellId, scramblingCode), is(true));
    }

    @Test
    public void testIsForServingCellWhenScramblingCodeIsString() {
        final String scramblingCodeAsString = Integer.toString(scramblingCode);
        assertThat(defaultLookupService.isForServingCell(rncId, cellId, scramblingCodeAsString), is(true));
    }

    @Test
    public void testIsForServingCellWhenScramblingCodeIsStringAndNotAScramblingCode() {
        final String scramblingCodeAsString = Integer.toString(65);
        assertThat(defaultLookupService.isForServingCell(17, 13, scramblingCodeAsString), is(false));
    }

    @Test
    public void testIsForServingCellIsFalseIfDonotFindMatchingScramblingCode() {
        final int nonMatchingRNC = 1;
        final int nonMatchingCell = 2;
        final int nonMatchingScramblingCode = 7;
        assertThat(defaultLookupService.isForServingCell(nonMatchingRNC, nonMatchingCell, nonMatchingScramblingCode), is(false));
    }

    @Test
    public void testGetMccFromImsiWhereMncHasTwoCharacters() {
        final String result = defaultLookupService.getMcc(imsi);
        assertThat(result, is(mcc));
    }

    @Test
    public void testGetMncFromImsiWhereMncHasTwoCharacters() {
        final String result = defaultLookupService.getMnc(imsi);
        assertThat(result, is(mnc));
    }

    private void mockMccMncPairInDB() {
        final String mccMncKey = mcc + mnc;
        final MccMncPair mccMncPair = new MccMncPair();
        mccMncPair.setMcc(mcc);
        mccMncPair.setMnc(mnc);
        final Map<String, MccMncPair> mccMncValues = new HashMap<String, MccMncPair>();
        mccMncValues.put(mccMncKey, mccMncPair);
        when(mockedDataStore.getMccMnc()).thenReturn(mccMncValues);
    }

    class StubbedDefaultLookupService extends DefaultLookupService {

        public StubbedDefaultLookupService() {
            super();
        }

        @Override
        DataStore createDataStore() {
            return mockedDataStore;
        }
    }

}