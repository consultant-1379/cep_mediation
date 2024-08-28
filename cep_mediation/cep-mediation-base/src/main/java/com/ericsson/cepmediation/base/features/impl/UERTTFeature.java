/***------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2013
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
-----------------------------------------------------------------------------------------------*/
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
import static com.ericsson.cepmediation.base.properties.FeatureConstants.*;

/**
 * 
 * @author xlomis
 * 
 */
class UERTTFeature implements CepFeature {
    private static final Logger logger = LoggerFactory
            .getLogger(UERTTFeature.class);

    private boolean enabled;

    private List<String> epls = new ArrayList<String>();

    private Set<String> tables = new HashSet<String>();

    private Map<Integer, String> eventId2name = new HashMap<Integer, String>();

    UERTTFeature() {
        List<FeaturesEnum> enabledFeatures = ConfigBinder.getInstance()
                .getEnabledFeatures();
        enabled = enabledFeatures.contains(FeaturesEnum.UE_RTT);

        epls.add(EPL_UERTT_RRC);
        epls.add(EPL_UERTT_NBAP);
        epls.add(EPL_UERTT_RANAP);
        epls.add(EPL_UERTT_RNSAP);
        epls.add(EPL_UERTT_RAW);

        epls = Collections.unmodifiableList(epls);

        tables.add(EVENT_E_RAN_CFA_ERR);
        tables.add(EVENT_E_RAN_CFA_HIER3_ALLCALLS);
        tables.add(EVENT_E_RAN_CFA_HIER3_CELL_ID_ALLCALLS);
        tables = Collections.unmodifiableSet(tables);

        eventId2name.put(INTERNAL_RAB_ESTABLISHMENT_EVENT_ID, GPEH_EVENT_PREFIX
                + INTERNAL_RAB_ESTABLISHMENT);
        eventId2name.put(INTERNAL_CALL_SETUP_FAIL_EVENT_ID, GPEH_EVENT_PREFIX
                + INTERNAL_CALL_SETUP_FAIL);
        eventId2name.put(INTERNAL_IMSI_EVENT_ID, GPEH_EVENT_PREFIX
                + INTERNAL_IMSI);
        eventId2name.put(RRC_RRC_CONNECTION_SETUP_EVENT_ID, GPEH_EVENT_PREFIX
                + RRC_RRC_CONNECTION_SETUP);
        eventId2name.put(RRC_RRC_CONNECTION_RELEASE_COMPLETE_EVENT_ID,
                GPEH_EVENT_PREFIX + RRC_RRC_CONNECTION_RELEASE_COMPLETE);
        eventId2name.put(RRC_UPLINK_DIRECT_TRANSFER_EVENT_ID, GPEH_EVENT_PREFIX
                + RRC_UPLINK_DIRECT_TRANSFER);
        eventId2name.put(INTERNAL_SYSTEM_RELEASE_EVENT_ID, GPEH_EVENT_PREFIX
                + INTERNAL_SYSTEM_RELEASE);
        eventId2name.put(ATTACH_EVENT_ID, SGEH_EVENT_PREFIX + ATTACH);
        eventId2name = Collections.unmodifiableMap(eventId2name);

    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public FeaturesEnum getFeature() {
        return FeaturesEnum.UE_RTT;
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
            return LicensingService.getInstance().hasUERTTLicense();
        } catch (CannotAccessLicensingServiceException e) {
            logger.error("UERTTFeature:Error accessing licensing service", e);
        }

        return false;
    }

    @Override
    public String toString() {
        return "UERTTFeature [enabled=" + enabled + ", epls=" + epls
                + ", tables=" + tables + ", eventId2name=" + eventId2name + "]";
    }
}
