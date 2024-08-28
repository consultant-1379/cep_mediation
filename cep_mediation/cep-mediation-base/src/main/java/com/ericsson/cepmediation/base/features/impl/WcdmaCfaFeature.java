/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2015
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

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.features.CepFeature;
import com.ericsson.cepmediation.base.licensing.CannotAccessLicensingServiceException;
import com.ericsson.cepmediation.base.licensing.LicensingService;
import com.ericsson.cepmediation.base.properties.ConfigBinder;
import com.ericsson.cepmediation.config.bean.FeaturesEnum;

class WcdmaCfaFeature implements CepFeature {

    private static final Logger logger = LoggerFactory.getLogger(WcdmaCfaFeature.class);

    private final boolean cfaEnabled;

    private final boolean cfaLicensed;

    private final boolean reestablishEnabled;

    private final boolean reestablishLicensed;

    private List<String> epls = new ArrayList<String>();

    private Set<String> tables = new HashSet<String>();

    private Map<Integer, String> eventId2name = new HashMap<Integer, String>();

    WcdmaCfaFeature() {
        cfaEnabled = isCfaEnabled();
        cfaLicensed = isCfaLicensed();
        reestablishEnabled = isReestablishEnabled();
        reestablishLicensed = isReestablishLicensed();

        addEplDefinitons();
        addTableDefinitions();
        addEventIdToEventNameMappings();
    }

    protected LicensingService getLicensingService(){
        return LicensingService.getInstance();
    }

    protected ConfigBinder getConfigBinder() {
        return ConfigBinder.getInstance();
    }

    private boolean isCfaEnabled() {
        final List<FeaturesEnum> enabledFeatures = getConfigBinder().getEnabledFeatures();
        return enabledFeatures.contains(FeaturesEnum.CFA);
    }

    private boolean isCfaLicensed() {
        try {
            return getLicensingService().hasCFALicense();
        } catch (final CannotAccessLicensingServiceException e) {
            logger.error("Error accessing licensing service", e);
        }
        return false;
    }

    private boolean cfaIsLicencedAndEnabled() {
        return cfaEnabled && cfaLicensed;
    }

    private boolean isReestablishEnabled() {
        final List<FeaturesEnum> enabledFeatures = getConfigBinder().getEnabledFeatures();
        if (cfaIsLicencedAndEnabled())
            return enabledFeatures.contains(FeaturesEnum.REESTABLISH);
        else
            return false;
    }

    boolean isReestablishLicensed() {
        try {
            if (cfaIsLicencedAndEnabled())
                return getLicensingService().hasReestablishLicense();
        } catch (final CannotAccessLicensingServiceException e) {
            logger.error("Error accessing licensing service", e);
        }
        return false;
    }

    private void addEplDefinitons() {
        epls.add(ESPER_RAW_EVENTS_BASE_EPL);
        epls.add(ESPER_CFA_HFA_COMMON_EPL);
        epls.add(ESPER_CFA_EPL);
        epls = Collections.unmodifiableList(epls);
    }

    private void addTableDefinitions() {
        tables.add(EVENT_E_RAN_CFA_ERR);
        tables.add(EVENT_E_RAN_CFA_HIER3_ALLCALLS);
        tables.add(EVENT_E_RAN_CFA_HIER3_CELL_ID_ALLCALLS);
        tables = Collections.unmodifiableSet(tables);
    }

    private void addEventIdToEventNameMappings() {
        eventId2name.put(415, GPEH_EVENT_PREFIX + INTERNAL_RAB_ESTABLISHMENT);
        eventId2name.put(457, GPEH_EVENT_PREFIX + INTERNAL_NORMAL_RELEASE);
        eventId2name.put(456, GPEH_EVENT_PREFIX + INTERNAL_CALL_SETUP_FAIL);
        eventId2name.put(384, GPEH_EVENT_PREFIX + INTERNAL_IMSI);
        eventId2name.put(35, GPEH_EVENT_PREFIX + RRC_RRC_CONNECTION_SETUP);
        eventId2name.put(20, GPEH_EVENT_PREFIX + RRC_RRC_CONNECTION_RELEASE_COMPLETE);
        eventId2name.put(29, GPEH_EVENT_PREFIX + RRC_UPLINK_DIRECT_TRANSFER);
        eventId2name.put(438, GPEH_EVENT_PREFIX + INTERNAL_SYSTEM_RELEASE);
        eventId2name.put(0, SGEH_EVENT_PREFIX + ATTACH);

        if (reestablishEnabled && reestablishLicensed) {
            eventId2name.put(409, GPEH_EVENT_PREFIX + INTERNAL_CALL_REESTABLISHMENT);
        }

        eventId2name = Collections.unmodifiableMap(eventId2name);
    }

    @Override
    public boolean isEnabled() {
        return cfaEnabled;
    }

    @Override
    public FeaturesEnum getFeature() {
        return FeaturesEnum.CFA;
    }

    @Override
    public Map<Integer, String> getEvents() {
        return eventId2name;
    }

    @Override
    public List<String> getEplFiles() {
        return epls;
    }

    @Override
    public Set<String> getTableNames() {
        return tables;
    }

    @Override
    public boolean hasLicence() {
        return cfaLicensed;
    }

    @Override
    public String toString() {
        return "WcdmaCFAFeature [enabled=" + cfaEnabled + ", epls=" + epls + ", tables=" + tables + ", eventId2name=" + eventId2name + "]";
    }

}
