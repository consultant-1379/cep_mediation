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

class SessionBrowserFeature implements CepFeature {
    private static final Logger logger = LoggerFactory.getLogger(SessionBrowserFeature.class);

    private boolean enabled;

    private List<String> epls = new ArrayList<String>();

    private Set<String> tables = new HashSet<String>();

    private Map<Integer, String> eventId2name = new HashMap<Integer, String>();

    SessionBrowserFeature() {
        List<FeaturesEnum> enabledFeatures = ConfigBinder.getInstance().getEnabledFeatures();
        enabled = enabledFeatures.contains(FeaturesEnum.SESSION_BROWSER);

        epls.add("esper/_rc.epl");
        epls.add("esper/vc.epl");
        epls.add("esper/raw_events_base.epl");
        epls.add("esper/session_browser.epl");
        epls.add("esper/WcdmaUserPlaneCorrelation.epl");
        epls.add("esper/CoreCorrelation.epl");
        epls = Collections.unmodifiableList(epls);

        tables.add("event_e_ran_session");
        tables.add("event_e_core_session");
        tables.add("event_e_ran_session_cell_visited");
        tables.add("event_e_ran_session_rrc_meas");
        tables.add("event_e_user_plane_tcp");
        tables.add("event_e_user_plane_classification");
        tables.add("event_e_ran_session_inter_congest");
        tables.add("event_e_ran_session_inter_record");
        tables.add("event_e_ran_session_mp_overload");
        tables.add("event_e_ran_session_inter_sys_util");
        tables.add("event_e_ran_session_suc_hsdsch_cell_change");
        tables.add("event_e_ran_session_inter_out_hho");
        tables.add("event_e_ran_session_inter_soho_ds_msng_nbr");

        eventId2name.put(432, "gpeh.INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE");
        eventId2name.put(427, "gpeh.INTERNAL_SOHO_DS_MISSING_NEIGHBOUR");
        eventId2name.put(393, "gpeh.INTERNAL_START_CONGESTION");
        eventId2name.put(394, "gpeh.INTERNAL_STOP_CONGESTION");
        eventId2name.put(444, "gpeh.INTERNAL_RECORDING_FAULT");
        eventId2name.put(445, "gpeh.INTERNAL_RECORDING_RECOVERED");
        eventId2name.put(425, "gpeh.INTERNAL_MP_OVERLOAD");

        eventId2name.put(384, "gpeh.INTERNAL_IMSI");
        eventId2name.put(415, "gpeh.INTERNAL_RAB_ESTABLISHMENT");
        eventId2name.put(416, "gpeh.INTERNAL_RAB_RELEASE");
        eventId2name.put(387, "gpeh.INTERNAL_CHANNEL_SWITCHING");
        eventId2name.put(438, "gpeh.INTERNAL_SYSTEM_RELEASE");
        eventId2name.put(433, "gpeh.INTERNAL_FAILED_HSDSCH_CELL_CHANGE");
        eventId2name.put(436, "gpeh.INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED");
        eventId2name.put(458, "gpeh.INTERNAL_OUT_HARD_HANDOVER_FAILURE");
        eventId2name.put(423, "gpeh.INTERNAL_IFHO_EXECUTION_ACTIVE");
        eventId2name.put(408, "gpeh.INTERNAL_SOFT_HANDOVER_EXECUTION");
        eventId2name.put(401, "gpeh.INTERNAL_CMODE_ACTIVATE");
        eventId2name.put(402, "gpeh.INTERNAL_CMODE_DEACTIVATE");
        eventId2name.put(451, "gpeh.INTERNAL_SYSTEM_UTILIZATION");
        eventId2name.put(8, "gpeh.RRC_MEASUREMENT_REPORT");
        eventId2name.put(35, "gpeh.RRC_RRC_CONNECTION_SETUP");
        eventId2name.put(20, "gpeh.RRC_RRC_CONNECTION_RELEASE_COMPLETE");
        eventId2name.put(259, "gpeh.RANAP_IU_RELEASE_COMMAND");
        eventId2name.put(1, "ebm.ACTIVATE");
        eventId2name.put(2, "ebm.RAU");
        eventId2name.put(3, "ebm.ISRAU");
        eventId2name.put(4, "ebm.DEACTIVATE");

        eventId2name.put(18001, "bearer_plane.TCP_REPORT_PARTIAL");
        eventId2name.put(18010, "bearer_plane.CLASSIFICATION_REPORT");
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public FeaturesEnum getFeature() {
        return FeaturesEnum.SESSION_BROWSER;
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
            return LicensingService.getInstance().hasSessionBrowserLicense();
        } catch (CannotAccessLicensingServiceException e) {
            logger.error("Error accessing licensing service", e);
        }
        return false;
    }

    @Override
    public String toString() {
        return "SessionBrowserFeature [enabled=" + enabled + ", epls=" + epls + ", tables=" + tables + ", eventId2name=" + eventId2name + "]";
    }
}
