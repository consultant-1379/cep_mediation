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

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.features.CepFeature;
import com.ericsson.cepmediation.base.licensing.CannotAccessLicensingServiceException;
import com.ericsson.cepmediation.base.licensing.LicensingService;
import com.ericsson.cepmediation.base.properties.ConfigBinder;
import com.ericsson.cepmediation.config.bean.FeaturesEnum;

class WcdmaHfaFeature implements CepFeature {
    private static final Logger logger = LoggerFactory.getLogger(WcdmaHfaFeature.class);

    private boolean enabled;

    private List<String> epls = new ArrayList<String>();

    private Set<String> tables = new HashSet<String>();

    private Map<Integer, String> eventId2name = new HashMap<Integer, String>();

    WcdmaHfaFeature() {
        List<FeaturesEnum> enabledFeatures = ConfigBinder.getInstance().getEnabledFeatures();
        enabled = enabledFeatures.contains(FeaturesEnum.HFA);

        epls.add("esper/raw_events_base.epl");
        epls.add("esper/cfa_hfa_common.epl");
        epls.add("esper/hfa.epl");
        epls = Collections.unmodifiableList(epls);

        tables.add("event_e_ran_hfa_soho_err");
        tables.add("event_e_ran_hfa_ifho_err");
        tables.add("event_e_ran_hfa_irat_err");
        tables.add("event_e_ran_hfa_hsdsch_err");
        tables.add("event_e_ran_hfa_soho_err");
        tables = Collections.unmodifiableSet(tables);

        eventId2name.put(384, GPEH_EVENT_PREFIX + "INTERNAL_IMSI");
        eventId2name.put(0, SGEH_EVENT_PREFIX + "ATTACH");
        eventId2name.put(29, GPEH_EVENT_PREFIX + "RRC_UPLINK_DIRECT_TRANSFER");
        eventId2name.put(35, GPEH_EVENT_PREFIX + "RRC_RRC_CONNECTION_SETUP");
        eventId2name.put(20, GPEH_EVENT_PREFIX + "RRC_RRC_CONNECTION_RELEASE_COMPLETE");
        eventId2name.put(408, GPEH_EVENT_PREFIX + "INTERNAL_SOFT_HANDOVER_EXECUTION");
        eventId2name.put(458, GPEH_EVENT_PREFIX + "INTERNAL_OUT_HARD_HANDOVER_FAILURE");
        eventId2name.put(433, GPEH_EVENT_PREFIX + "INTERNAL_FAILED_HSDSCH_CELL_CHANGE");
        eventId2name.put(436, GPEH_EVENT_PREFIX + "INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED");
        eventId2name.put(423, GPEH_EVENT_PREFIX + "INTERNAL_IFHO_EXECUTION_ACTIVE");
        eventId2name = Collections.unmodifiableMap(eventId2name);
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public FeaturesEnum getFeature() {
        return FeaturesEnum.HFA;
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
        try {
            return LicensingService.getInstance().hasHFALicense();
        } catch (CannotAccessLicensingServiceException e) {
            logger.error("Error accessing licensing service", e);
        }
        return false;
    }

    @Override
    public String toString() {
        return "WcdmaHFAFeature [enabled=" + enabled + ", epls=" + epls + ", tables=" + tables + ", eventId2name=" + eventId2name + "]";
    }
}
