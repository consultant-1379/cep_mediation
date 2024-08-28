/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2013
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.cepmediation.base.features.impl;

import static com.ericsson.cepmediation.base.features.impl.WCDMAConstants.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.*;

import org.junit.Test;

import com.ericsson.cepmediation.base.licensing.LicensingService;
import com.ericsson.cepmediation.base.properties.ConfigBinder;
import com.ericsson.cepmediation.config.bean.FeaturesEnum;

public class WcdmaCfaFeatureUnitTest {

    public final static LicensingService mockedLicensingService = mock(LicensingService.class);
    public final static ConfigBinder mockedConfigbinder = mock(ConfigBinder.class);
    private final boolean CFA_ENABLED = true;
    private final boolean CFA_LICENCED = true;
    private final boolean REESTABLISH_ENABLED = true;
    private final boolean REESTABLISH_LICENCED = true;
    private final boolean CFA_NOT_ENABLED = false;
    private final boolean CFA_NOT_LICENCED = false;
    private final boolean REESTABLISH_NOT_ENABLED = false;
    private final boolean REESTABLISH_NOT_LICENCED = false;

    @Test
    public void isReestablishLicenced_CFAFeatureEnabledAndLicenced_ReestablishmentEnabledAndLicened_ExpectTrue() throws Exception {
        setupExpectationsForTest(CFA_ENABLED, CFA_LICENCED, REESTABLISH_ENABLED, REESTABLISH_LICENCED);
        WcdmaCfaFeature objUnderTest = new StubbedWcdmaCfaFeature();
        assertEquals(true, objUnderTest.isReestablishLicensed());
    }

    @Test
    public void isReestablishLicenced_CFAFeatureEnabledAndLicenced_ReestablishmentEnabledAndNotLicened_ExpectFalse() throws Exception {
        setupExpectationsForTest(CFA_ENABLED, CFA_LICENCED, REESTABLISH_ENABLED, REESTABLISH_NOT_LICENCED);
        WcdmaCfaFeature objUnderTest = new StubbedWcdmaCfaFeature();
        assertEquals(false, objUnderTest.isReestablishLicensed());
    }

    @Test
    public void isReestablishLicenced_CFAFeatureEnabledAndNotLicenced_ReestablishmentEnabledAndLicened_ExpectFalse() throws Exception {
        setupExpectationsForTest(CFA_ENABLED, CFA_NOT_LICENCED, REESTABLISH_ENABLED, REESTABLISH_LICENCED);
        WcdmaCfaFeature objUnderTest = new StubbedWcdmaCfaFeature();
        assertEquals(false, objUnderTest.isReestablishLicensed());
    }

    @Test
    public void isReestablishLicenced_CFAFeatureNotEnabledAndLicenced_ReestablishmentEnabledAndLicened_ExpectFalse() throws Exception {
        setupExpectationsForTest(CFA_NOT_ENABLED, CFA_LICENCED, REESTABLISH_ENABLED, REESTABLISH_LICENCED);
        WcdmaCfaFeature objUnderTest = new StubbedWcdmaCfaFeature();
        assertEquals(false, objUnderTest.isReestablishLicensed());
    }

    @Test
    public void isReestablishLicenced_CFAFeatureNotEnabledAndNotLicenced_ReestablishmentEnabledAndLicened_ExpectFalse() throws Exception {
        setupExpectationsForTest(CFA_NOT_ENABLED, CFA_NOT_LICENCED, REESTABLISH_ENABLED, REESTABLISH_LICENCED);
        WcdmaCfaFeature objUnderTest = new StubbedWcdmaCfaFeature();
        assertEquals(false, objUnderTest.isReestablishLicensed());
    }

    @Test
    public void isEplDefinitonsAdded() throws Exception {
        List<String> mockEpls = new ArrayList<String>();
        mockEpls.add(ESPER_RAW_EVENTS_BASE_EPL);
        mockEpls.add(ESPER_CFA_HFA_COMMON_EPL);
        mockEpls.add(ESPER_CFA_EPL);

        WcdmaCfaFeature objUnderTest = new StubbedWcdmaCfaFeature();
        assertEquals(mockEpls, objUnderTest.getEplFiles());
    }

    @Test
    public void isTableDefinitonsAdded() throws Exception {
        Set<String> mockTables = new HashSet<String>();
        mockTables.add(EVENT_E_RAN_CFA_HIER3_CELL_ID_ALLCALLS);
        mockTables.add(EVENT_E_RAN_CFA_HIER3_ALLCALLS);
        mockTables.add(EVENT_E_RAN_CFA_ERR);

        WcdmaCfaFeature objUnderTest = new StubbedWcdmaCfaFeature();
        assertEquals(mockTables, objUnderTest.getTableNames());
    }

    @Test
    public void isEventIdToEventNameMappingsAddedWithReestablish() throws Exception {
        setupExpectationsForTest(CFA_ENABLED, CFA_LICENCED, REESTABLISH_ENABLED, REESTABLISH_LICENCED);
        WcdmaCfaFeature objUnderTest = new StubbedWcdmaCfaFeature();
        assertEquals(enableEventListWithReestablish(), objUnderTest.getEvents());
    }

    @Test
    public void isEventIdToEventNameMappingsAddedWithoutReestablish() throws Exception {
        setupExpectationsForTest(CFA_ENABLED, CFA_LICENCED, REESTABLISH_ENABLED, REESTABLISH_NOT_LICENCED);
        WcdmaCfaFeature objUnderTest = new StubbedWcdmaCfaFeature();
        assertEquals(enableEventListWithoutReestablish(), objUnderTest.getEvents());
    }

    @Test
    public void isEventIdToEventNameMappingsAddedWithoutReestablishWhenReestablishNotEnable() throws Exception {
        setupExpectationsForTest(CFA_ENABLED, CFA_LICENCED, REESTABLISH_NOT_ENABLED, REESTABLISH_LICENCED);
        WcdmaCfaFeature objUnderTest = new StubbedWcdmaCfaFeature();
        assertEquals(enableEventListWithoutReestablish(), objUnderTest.getEvents());
    }

    private Map<Integer, String> enableEventListWithoutReestablish() {
        Map<Integer, String> mockEventId2NameWithoutReestablish = new HashMap<Integer, String>();
        mockEventId2NameWithoutReestablish.put(415, "gpeh." + INTERNAL_RAB_ESTABLISHMENT);
        mockEventId2NameWithoutReestablish.put(457, "gpeh." + INTERNAL_NORMAL_RELEASE);
        mockEventId2NameWithoutReestablish.put(456, "gpeh." + INTERNAL_CALL_SETUP_FAIL);
        mockEventId2NameWithoutReestablish.put(384, "gpeh." + INTERNAL_IMSI);
        mockEventId2NameWithoutReestablish.put(35, "gpeh." + RRC_RRC_CONNECTION_SETUP);
        mockEventId2NameWithoutReestablish.put(20, "gpeh." + RRC_RRC_CONNECTION_RELEASE_COMPLETE);
        mockEventId2NameWithoutReestablish.put(29, "gpeh." + RRC_UPLINK_DIRECT_TRANSFER);
        mockEventId2NameWithoutReestablish.put(438, "gpeh." + INTERNAL_SYSTEM_RELEASE);
        mockEventId2NameWithoutReestablish.put(0, "ebm." + ATTACH);
        return mockEventId2NameWithoutReestablish;
    }

    private Map<Integer, String> enableEventListWithReestablish() {
        Map<Integer, String> mockEventId2NameWithReestablish = enableEventListWithoutReestablish();
        mockEventId2NameWithReestablish.put(409, "gpeh." + INTERNAL_CALL_REESTABLISHMENT);
        return mockEventId2NameWithReestablish;
    }

    private List<FeaturesEnum> enableFeatureList(final boolean cfaEnabled, final boolean reestablishEnabled) {
        List<FeaturesEnum> listEnabledFeatures = new ArrayList<FeaturesEnum>();
        if (cfaEnabled) {
            listEnabledFeatures.add(FeaturesEnum.CFA);
        }
        if (reestablishEnabled) {
            listEnabledFeatures.add(FeaturesEnum.REESTABLISH);
        }
        return listEnabledFeatures;
    }

    private void setupExpectationsForTest(boolean cfaEnable, boolean cfaLicense, boolean reestablishEnable, boolean reestablishLicense)
            throws Exception {
        when(mockedLicensingService.hasCFALicense()).thenReturn(cfaLicense);
        when(mockedLicensingService.hasReestablishLicense()).thenReturn(reestablishLicense);
        when(mockedConfigbinder.getEnabledFeatures()).thenReturn(enableFeatureList(cfaEnable, reestablishEnable));
    }
}

class StubbedWcdmaCfaFeature extends WcdmaCfaFeature {

    @Override
    protected LicensingService getLicensingService() {
        return (WcdmaCfaFeatureUnitTest.mockedLicensingService);
    }

    @Override
    protected ConfigBinder getConfigBinder() {
        return WcdmaCfaFeatureUnitTest.mockedConfigbinder;
    }
}
