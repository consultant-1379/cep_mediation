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
package com.ericsson.cepmediation.base.properties;

/**
 * @author xalomis
 * 
 */
public class FeatureConstants {
    public static final String EPL_UERTT_RRC = "esper/uertt_rrc.epl";
    public static final String EPL_UERTT_RANAP = "esper/uertt_ranap.epl";
    public static final String EPL_UERTT_RNSAP = "esper/uertt_rnsap.epl";
    public static final String EPL_UERTT_NBAP = "esper/uertt_nbap.epl";
    public static final String EPL_UERTT_RAW = "esper/uertt_raw_events_base.epl";

    public static final String EVENT_E_RAN_CFA_ERR = "event_e_ran_cfa_err";
    public static final String EVENT_E_RAN_CFA_HIER3_ALLCALLS = "event_e_ran_cfa_hier3_allcalls";
    public static final String EVENT_E_RAN_CFA_HIER3_CELL_ID_ALLCALLS = "event_e_ran_cfa_hier3_cell_id_allcalls";

    public static final int INTERNAL_RAB_ESTABLISHMENT_EVENT_ID = 415;
    public static final int INTERNAL_CALL_SETUP_FAIL_EVENT_ID = 456;
    public static final int INTERNAL_IMSI_EVENT_ID = 384;
    public static final int RRC_RRC_CONNECTION_SETUP_EVENT_ID = 35;
    public static final int RRC_RRC_CONNECTION_RELEASE_COMPLETE_EVENT_ID = 20;
    public static final int RRC_UPLINK_DIRECT_TRANSFER_EVENT_ID = 29;
    public static final int INTERNAL_SYSTEM_RELEASE_EVENT_ID = 438;
    public static final int ATTACH_EVENT_ID = 0;

    public static final String INTERNAL_RAB_ESTABLISHMENT = "INTERNAL_RAB_ESTABLISHMENT";
    public static final String INTERNAL_CALL_SETUP_FAIL = "INTERNAL_CALL_SETUP_FAIL";
    public static final String INTERNAL_IMSI = "INTERNAL_IMSI";
    public static final String RRC_RRC_CONNECTION_SETUP = "RRC_RRC_CONNECTION_SETUP";
    public static final String RRC_RRC_CONNECTION_RELEASE_COMPLETE = "RRC_RRC_CONNECTION_RELEASE_COMPLETE";
    public static final String RRC_UPLINK_DIRECT_TRANSFER = "RRC_UPLINK_DIRECT_TRANSFER";
    public static final String INTERNAL_SYSTEM_RELEASE = "INTERNAL_SYSTEM_RELEASE";
    public static final String ATTACH = "ATTACH";

    public static final String UERTT_CORRELATION_TOPIC = "UERTTCorrelationTopic";
    public static final String UERTT_FORWARDER_TOPIC = "UERTTForwarderTopic";
}
