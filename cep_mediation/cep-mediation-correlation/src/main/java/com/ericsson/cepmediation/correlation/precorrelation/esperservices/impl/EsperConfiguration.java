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

package com.ericsson.cepmediation.correlation.precorrelation.esperservices.impl;

import com.ericsson.cepmediation.apeventbeans.gpeh.*;

import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;
import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.base.util.constants.EventIdConstants;
import com.ericsson.cepmediation.correlation.enrichment.*;
import com.ericsson.cepmediation.correlation.enrichment.listeners.up.TCP_REPORT_ENRICHEDHelper;
import com.ericsson.cepmediation.loading.asn1.ASN1MeasurementWrapper;

import com.espertech.esper.client.*;
import com.espertech.esper.client.Configuration.PropertyResolutionStyle;
import com.espertech.esper.client.ConfigurationEngineDefaults.TimeSourceType;
import com.espertech.esper.client.ConfigurationEventTypeLegacy.AccessorStyle;
import com.espertech.esper.client.ConfigurationEventTypeLegacy.CodeGeneration;

public class EsperConfiguration {

    private static final int OUTPUT_INTERVAL = CepMediationProperties.getIntProperty(CepMediationProperty.INTERVAL_PRODUCE_OUTPUT_CORRELATED_EVENTS);

    public Configuration getEsperConfiguration() {
        final Configuration configuration = new Configuration();
        addConstants(configuration);
        addEventTypes(configuration);
        addImports(configuration);
        configuration.configure("esper/esper-conf.xml");
        configureEngineSettings(configuration);
        return configuration;

    }

    private void configureEngineSettings(final Configuration configuration) {
        configuration.getEngineDefaults().getExpression().setDivisionByZeroReturnsNull(true);
        configuration.getEngineDefaults().getExpression().setSelfSubselectPreeval(false);
        configuration.getEngineDefaults().getExecution().setPrioritized(true);
        configuration.getEngineDefaults().getExecution().setDisableLocking(false);
        configuration.getEngineDefaults().getViewResources().setShareViews(true);
        configuration.getEngineDefaults().getTimeSource().setTimeSourceType(TimeSourceType.MILLI);
        configuration.getEngineDefaults().getExecution().setFairlock(true);
        configuration.getEngineDefaults().getThreading().setListenerDispatchPreserveOrder(false);
        configuration.getEngineDefaults().getThreading().setInsertIntoDispatchPreserveOrder(false);
        configuration.getEngineDefaults().getEventMeta().setDefaultEventRepresentation(Configuration.EventRepresentation.OBJECTARRAY);
    }

    private void addImports(final Configuration configuration) {
        configuration.addImport("java.util.Arrays");
        configuration.addImport("java.lang.Byte");
        addUtilImport(configuration);
    }

    protected void addUtilImport(final Configuration configuration) {
        configuration.addImport("com.ericsson.cepmediation.correlation.support.Util");
    }

    private void addEventTypes(final Configuration configuration) {
        configuration.addEventType(MeasurementWindow.ABSOLUTE_NAME, MeasurementWindow.class.getName(), createConfigurationEventTypeLegacy());
        configuration.addEventType("correlation.CUSTOM_ENHANCED_GPEH_SESSION", EnhancedGpehSession.class.getName(),
                createConfigurationEventTypeLegacy());
        configuration.addEventType("correlation.CUSTOM_IMSI_MAP_WINDOW", ImsiMapWindow.class.getName(), createConfigurationEventTypeLegacy());
        configuration.addEventType("correlation.ENHANCED_VISITED_CELL", EnhancedVisitedCell.class.getName(), createConfigurationEventTypeLegacy());
        configuration.addEventType(Partial.ABSOLUTE_NAME, Partial.class.getName(), createConfigurationEventTypeLegacy());
        configuration.addEventType(SessionEndEvent.ABSOLUTE_NAME, SessionEndEvent.class);
        configuration.addEventType(SessionFlushEvent.ABSOLUTE_NAME, SessionFlushEvent.class);
        configuration.addEventType(ASN1MeasurementWrapper.ABSOLUTE_NAME, ASN1MeasurementWrapper.class);
        configuration.addEventType(EnhancedInternalSystemReleaseEnriched.ABSOLUTE_NAME, EnhancedInternalSystemReleaseEnriched.class);
        configuration.addEventType(EnhancedInternalCallSetupFailEnriched.ABSOLUTE_NAME, EnhancedInternalCallSetupFailEnriched.class);
        configuration.addEventType(EnhancedInternalCallReestablishmentEnriched.ABSOLUTE_NAME, EnhancedInternalCallReestablishmentEnriched.class);
        configuration.addEventType(InternalNormalReleaseSetValue.ABSOLUTE_NAME, InternalNormalReleaseSetValue.class);
        configuration.addEventType(GpehBase.class);
        configuration.addEventType("ApEventBean", "com.ericsson.cepmediation.base.apeventbeans.ApEventBean");
        configuration.addEventType("gpeh.INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED", INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED.class);
        configuration.addEventType("gpeh.INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED", INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED.class);
        configuration.addEventType("gpeh.INTERNAL_SOHO_DS_MISSING_NEIGHBOUR_ENRICHED", INTERNAL_SOHO_DS_MISSING_NEIGHBOUR_ENRICHED.class);
        configuration.addEventType("gpeh.INTERNAL_CALL_SETUP_FAIL_ENRICHED", INTERNAL_CALL_SETUP_FAIL_ENRICHED.class);
        configuration.addEventType("gpeh.INTERNAL_SYSTEM_RELEASE_ENRICHED", INTERNAL_SYSTEM_RELEASE_ENRICHED.class);
        configuration.addEventType("gpeh.INTERNAL_CALL_REESTABLISHMENT_ENRICHED", INTERNAL_CALL_REESTABLISHMENT_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_UPLINK_DIRECT_TRANSFER_ENRICHED", RRC_UPLINK_DIRECT_TRANSFER_ENRICHED.class);
        configuration.addEventType("gpeh.INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED", INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED.class);
        configuration.addEventType("gpeh.INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED", INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED.class);
        configuration.addEventType("gpeh.INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED", INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED.class);
        configuration.addEventType("gpeh.INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED",
                INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED.class);
        configuration.addEventType("gpeh.INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED", INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED.class);

        configuration.addEventType(TCP_REPORT_ENRICHEDHelper.ABSOLUTE_NAME, TCP_REPORT_ENRICHEDHelper.class.getName(),
                createConfigurationEventTypeLegacy());

        configuration.addEventType("gpeh.INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED", INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_ACTIVE_SET_UPDATE_ENRICHED", RRC_ACTIVE_SET_UPDATE_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_ACTIVE_SET_UPDATE_COMPLETE_ENRICHED", RRC_ACTIVE_SET_UPDATE_COMPLETE_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_ACTIVE_SET_UPDATE_FAILURE_ENRICHED", RRC_ACTIVE_SET_UPDATE_FAILURE_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_CELL_UPDATE_ENRICHED", RRC_CELL_UPDATE_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_CELL_UPDATE_CONFIRM_ENRICHED", RRC_CELL_UPDATE_CONFIRM_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_DOWNLINK_DIRECT_TRANSFER_ENRICHED", RRC_DOWNLINK_DIRECT_TRANSFER_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_MEASUREMENT_CONTROL_ENRICHED", RRC_MEASUREMENT_CONTROL_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_MEASUREMENT_CONTROL_FAILURE_ENRICHED", RRC_MEASUREMENT_CONTROL_FAILURE_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_MEASUREMENT_REPORT_ENRICHED", RRC_MEASUREMENT_REPORT_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_PAGING_TYPE_2_ENRICHED", RRC_PAGING_TYPE_2_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_RADIO_BEARER_RECONFIGURATION_ENRICHED", RRC_RADIO_BEARER_RECONFIGURATION_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_RADIO_BEARER_RECONFIGURATION_COMPLETE_ENRICHED",
                RRC_RADIO_BEARER_RECONFIGURATION_COMPLETE_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_RADIO_BEARER_RECONFIGURATION_FAILURE_ENRICHED", RRC_RADIO_BEARER_RECONFIGURATION_FAILURE_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_RADIO_BEARER_RELEASE_ENRICHED", RRC_RADIO_BEARER_RELEASE_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_RADIO_BEARER_RELEASE_COMPLETE_ENRICHED", RRC_RADIO_BEARER_RELEASE_COMPLETE_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_RADIO_BEARER_RELEASE_FAILURE_ENRICHED", RRC_RADIO_BEARER_RELEASE_FAILURE_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_RADIO_BEARER_SETUP_ENRICHED", RRC_RADIO_BEARER_SETUP_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_RADIO_BEARER_SETUP_COMPLETE_ENRICHED", RRC_RADIO_BEARER_SETUP_COMPLETE_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_RADIO_BEARER_SETUP_FAILURE_ENRICHED", RRC_RADIO_BEARER_SETUP_FAILURE_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_RRC_CONNECTION_RELEASE_ENRICHED", RRC_RRC_CONNECTION_RELEASE_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_RRC_CONNECTION_RELEASE_COMPLETE_ENRICHED", RRC_RRC_CONNECTION_RELEASE_COMPLETE_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_RRC_STATUS_ENRICHED", RRC_RRC_STATUS_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_SECURITY_MODE_COMMAND_ENRICHED", RRC_SECURITY_MODE_COMMAND_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_SECURITY_MODE_COMPLETE_ENRICHED", RRC_SECURITY_MODE_COMPLETE_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_SECURITY_MODE_FAILURE_ENRICHED", RRC_SECURITY_MODE_FAILURE_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_SIGNALLING_CONNECTION_RELEASE_ENRICHED", RRC_SIGNALLING_CONNECTION_RELEASE_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_SIGNALLING_CONNECTION_RELEASE_INDICATION_ENRICHED",
                RRC_SIGNALLING_CONNECTION_RELEASE_INDICATION_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_UE_CAPABILITY_INFORMATION_ENRICHED", RRC_UE_CAPABILITY_INFORMATION_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_UE_CAPABILITY_INFORMATION_CONFIRM_ENRICHED", RRC_UE_CAPABILITY_INFORMATION_CONFIRM_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_UTRAN_MOBILITY_INFORMATION_CONFIRM_ENRICHED", RRC_UTRAN_MOBILITY_INFORMATION_CONFIRM_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_HANDOVER_FROM_UTRAN_COMMAND_ENRICHED", RRC_HANDOVER_FROM_UTRAN_COMMAND_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_HANDOVER_FROM_UTRAN_FAILURE_ENRICHED", RRC_HANDOVER_FROM_UTRAN_FAILURE_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_PHYSICAL_CHANNEL_RECONFIGURATION_ENRICHED", RRC_PHYSICAL_CHANNEL_RECONFIGURATION_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_PHYSICAL_CHANNEL_RECONFIGURATION_COMPLETE_ENRICHED",
                RRC_PHYSICAL_CHANNEL_RECONFIGURATION_COMPLETE_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_PHYSICAL_CHANNEL_RECONFIGURATION_FAILURE_ENRICHED",
                RRC_PHYSICAL_CHANNEL_RECONFIGURATION_FAILURE_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_UTRAN_MOBILITY_INFORMATION_ENRICHED", RRC_UTRAN_MOBILITY_INFORMATION_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_UTRAN_MOBILITY_INFORMATION_FAILURE_ENRICHED", RRC_UTRAN_MOBILITY_INFORMATION_FAILURE_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_CELL_CHANGE_ORDER_FROM_UTRAN_ENRICHED", RRC_CELL_CHANGE_ORDER_FROM_UTRAN_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_CELL_CHANGE_ORDER_FROM_UTRAN_FAILURE_ENRICHED", RRC_CELL_CHANGE_ORDER_FROM_UTRAN_FAILURE_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_UE_CAPABILITY_ENQUIRY_ENRICHED", RRC_UE_CAPABILITY_ENQUIRY_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_URA_UPDATE_ENRICHED", RRC_URA_UPDATE_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_URA_UPDATE_CONFIRM_ENRICHED", RRC_URA_UPDATE_CONFIRM_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_TRANSPORT_CHANNEL_RECONFIGURATION_ENRICHED", RRC_TRANSPORT_CHANNEL_RECONFIGURATION_ENRICHED.class);
        configuration.addEventType("gpeh.RRC_TRANSPORT_CHANNEL_RECONFIGURATION_COMPLETE_ENRICHED",
                RRC_TRANSPORT_CHANNEL_RECONFIGURATION_COMPLETE_ENRICHED.class);

        configuration.addEventType("gpeh.NBAP_RADIO_LINK_SETUP_REQUEST_ENRICHED", NBAP_RADIO_LINK_SETUP_REQUEST_ENRICHED.class);
        configuration.addEventType("gpeh.NBAP_RADIO_LINK_SETUP_RESPONSE_ENRICHED", NBAP_RADIO_LINK_SETUP_RESPONSE_ENRICHED.class);
        configuration.addEventType("gpeh.NBAP_RADIO_LINK_SETUP_FAILURE_ENRICHED", NBAP_RADIO_LINK_SETUP_FAILURE_ENRICHED.class);
        configuration.addEventType("gpeh.NBAP_RADIO_LINK_ADDITION_REQUEST_ENRICHED", NBAP_RADIO_LINK_ADDITION_REQUEST_ENRICHED.class);
        configuration.addEventType("gpeh.NBAP_RADIO_LINK_ADDITION_RESPONSE_ENRICHED", NBAP_RADIO_LINK_ADDITION_RESPONSE_ENRICHED.class);
        configuration.addEventType("gpeh.NBAP_RADIO_LINK_ADDITION_FAILURE_ENRICHED", NBAP_RADIO_LINK_ADDITION_FAILURE_ENRICHED.class);
        configuration.addEventType("gpeh.NBAP_RADIO_LINK_RECONFIGURATION_PREPARE_ENRICHED", NBAP_RADIO_LINK_RECONFIGURATION_PREPARE_ENRICHED.class);
        configuration.addEventType("gpeh.NBAP_RADIO_LINK_RECONFIGURATION_READY_ENRICHED", NBAP_RADIO_LINK_RECONFIGURATION_READY_ENRICHED.class);
        configuration.addEventType("gpeh.NBAP_RADIO_LINK_RECONFIGURATION_FAILURE_ENRICHED", NBAP_RADIO_LINK_RECONFIGURATION_FAILURE_ENRICHED.class);
        configuration.addEventType("gpeh.NBAP_RADIO_LINK_RECONFIGURATION_COMMIT_ENRICHED", NBAP_RADIO_LINK_RECONFIGURATION_COMMIT_ENRICHED.class);
        configuration.addEventType("gpeh.NBAP_RADIO_LINK_RECONFIGURATION_CANCEL_ENRICHED", NBAP_RADIO_LINK_RECONFIGURATION_CANCEL_ENRICHED.class);
        configuration.addEventType("gpeh.NBAP_RADIO_LINK_DELETION_REQUEST_ENRICHED", NBAP_RADIO_LINK_DELETION_REQUEST_ENRICHED.class);
        configuration.addEventType("gpeh.NBAP_RADIO_LINK_DELETION_RESPONSE_ENRICHED", NBAP_RADIO_LINK_DELETION_RESPONSE_ENRICHED.class);
        configuration.addEventType("gpeh.NBAP_DL_POWER_CONTROL_REQUEST_ENRICHED", NBAP_DL_POWER_CONTROL_REQUEST_ENRICHED.class);
        configuration.addEventType("gpeh.NBAP_DEDICATED_MEASUREMENT_INITIATION_REQUEST_ENRICHED",
                NBAP_DEDICATED_MEASUREMENT_INITIATION_REQUEST_ENRICHED.class);
        configuration.addEventType("gpeh.NBAP_DEDICATED_MEASUREMENT_INITIATION_RESPONSE_ENRICHED",
                NBAP_DEDICATED_MEASUREMENT_INITIATION_RESPONSE_ENRICHED.class);
        configuration.addEventType("gpeh.NBAP_DEDICATED_MEASUREMENT_INITIATION_FAILURE_ENRICHED",
                NBAP_DEDICATED_MEASUREMENT_INITIATION_FAILURE_ENRICHED.class);
        configuration.addEventType("gpeh.NBAP_DEDICATED_MEASUREMENT_REPORT_ENRICHED", NBAP_DEDICATED_MEASUREMENT_REPORT_ENRICHED.class);
        configuration.addEventType("gpeh.NBAP_DEDICATED_MEASUREMENT_TERMINATION_REQUEST_ENRICHED",
                NBAP_DEDICATED_MEASUREMENT_TERMINATION_REQUEST_ENRICHED.class);
        configuration.addEventType("gpeh.NBAP_DEDICATED_MEASUREMENT_FAILURE_INDICATION_ENRICHED",
                NBAP_DEDICATED_MEASUREMENT_FAILURE_INDICATION_ENRICHED.class);
        configuration.addEventType("gpeh.NBAP_RADIO_LINK_FAILURE_INDICATION_ENRICHED", NBAP_RADIO_LINK_FAILURE_INDICATION_ENRICHED.class);
        configuration.addEventType("gpeh.NBAP_RADIO_LINK_RESTORE_INDICATION_ENRICHED", NBAP_RADIO_LINK_RESTORE_INDICATION_ENRICHED.class);
        configuration.addEventType("gpeh.NBAP_COMPRESSED_MODE_COMMAND_ENRICHED", NBAP_COMPRESSED_MODE_COMMAND_ENRICHED.class);
        configuration.addEventType("gpeh.NBAP_RADIO_LINK_PARAMETER_UPDATE_INDICATION_ENRICHED",
                NBAP_RADIO_LINK_PARAMETER_UPDATE_INDICATION_ENRICHED.class);
        configuration.addEventType("gpeh.NBAP_SECONDARY_UL_FREQUENCY_REPORT_ENRICHED", NBAP_SECONDARY_UL_FREQUENCY_REPORT_ENRICHED.class);
        configuration.addEventType("gpeh.NBAP_SECONDARY_UL_FREQUENCY_UPDATE_INDICATION_ENRICHED",
                NBAP_SECONDARY_UL_FREQUENCY_UPDATE_INDICATION_ENRICHED.class);
        configuration.addEventType("gpeh.NBAP_RADIO_LINK_PREEMPTION_REQUIRED_INDICATION_ENRICHED",
                NBAP_RADIO_LINK_PREEMPTION_REQUIRED_INDICATION_ENRICHED.class);
        configuration.addEventType("gpeh.RANAP_RAB_ASSIGNMENT_REQUEST_ENRICHED", RANAP_RAB_ASSIGNMENT_REQUEST_ENRICHED.class);
        configuration.addEventType("gpeh.RANAP_RAB_ASSIGNMENT_RESPONSE_ENRICHED", RANAP_RAB_ASSIGNMENT_RESPONSE_ENRICHED.class);
        configuration.addEventType("gpeh.RANAP_IU_RELEASE_REQUEST_ENRICHED", RANAP_IU_RELEASE_REQUEST_ENRICHED.class);
        configuration.addEventType("gpeh.RANAP_IU_RELEASE_COMMAND_ENRICHED", RANAP_IU_RELEASE_COMMAND_ENRICHED.class);
        configuration.addEventType("gpeh.RANAP_IU_RELEASE_COMPLETE_ENRICHED", RANAP_IU_RELEASE_COMPLETE_ENRICHED.class);
        configuration.addEventType("gpeh.RANAP_SECURITY_MODE_COMMAND_ENRICHED", RANAP_SECURITY_MODE_COMMAND_ENRICHED.class);
        configuration.addEventType("gpeh.RANAP_SECURITY_MODE_COMPLETE_ENRICHED", RANAP_SECURITY_MODE_COMPLETE_ENRICHED.class);
        configuration.addEventType("gpeh.RANAP_SECURITY_MODE_REJECT_ENRICHED", RANAP_SECURITY_MODE_REJECT_ENRICHED.class);
        configuration.addEventType("gpeh.RANAP_LOCATION_REPORTING_CONTROL_ENRICHED", RANAP_LOCATION_REPORTING_CONTROL_ENRICHED.class);
        configuration.addEventType("gpeh.RANAP_DIRECT_TRANSFER_ENRICHED", RANAP_DIRECT_TRANSFER_ENRICHED.class);
        configuration.addEventType("gpeh.RANAP_ERROR_INDICATION_ENRICHED", RANAP_ERROR_INDICATION_ENRICHED.class);
        configuration.addEventType("gpeh.RANAP_RELOCATION_REQUIRED_ENRICHED", RANAP_RELOCATION_REQUIRED_ENRICHED.class);
        configuration.addEventType("gpeh.RANAP_RELOCATION_REQUEST_ENRICHED", RANAP_RELOCATION_REQUEST_ENRICHED.class);
        configuration.addEventType("gpeh.RANAP_RELOCATION_REQUEST_ACKNOWLEDGE_ENRICHED", RANAP_RELOCATION_REQUEST_ACKNOWLEDGE_ENRICHED.class);
        configuration.addEventType("gpeh.RANAP_RELOCATION_COMMAND_ENRICHED", RANAP_RELOCATION_COMMAND_ENRICHED.class);
        configuration.addEventType("gpeh.RANAP_RELOCATION_DETECT_ENRICHED", RANAP_RELOCATION_DETECT_ENRICHED.class);
        configuration.addEventType("gpeh.RANAP_RELOCATION_COMPLETE_ENRICHED", RANAP_RELOCATION_COMPLETE_ENRICHED.class);
        configuration.addEventType("gpeh.RANAP_RELOCATION_PREPARATION_FAILURE_ENRICHED", RANAP_RELOCATION_PREPARATION_FAILURE_ENRICHED.class);
        configuration.addEventType("gpeh.RANAP_RELOCATION_FAILURE_ENRICHED", RANAP_RELOCATION_FAILURE_ENRICHED.class);
        configuration.addEventType("gpeh.RANAP_RELOCATION_CANCEL_ENRICHED", RANAP_RELOCATION_CANCEL_ENRICHED.class);
        configuration.addEventType("gpeh.RANAP_RELOCATION_CANCEL_ACKNOWLEDGE_ENRICHED", RANAP_RELOCATION_CANCEL_ACKNOWLEDGE_ENRICHED.class);
        configuration.addEventType("gpeh.RANAP_SRNS_CONTEXT_REQUEST_ENRICHED", RANAP_SRNS_CONTEXT_REQUEST_ENRICHED.class);
        configuration.addEventType("gpeh.RANAP_SRNS_CONTEXT_RESPONSE_ENRICHED", RANAP_SRNS_CONTEXT_RESPONSE_ENRICHED.class);
        configuration.addEventType("gpeh.RANAP_SRNS_DATA_FORWARD_COMMAND_ENRICHED", RANAP_SRNS_DATA_FORWARD_COMMAND_ENRICHED.class);
        configuration.addEventType("gpeh.RANAP_LOCATION_REPORT_ENRICHED", RANAP_LOCATION_REPORT_ENRICHED.class);
        configuration.addEventType("gpeh.RANAP_RANAP_RELOCATION_INFORMATION_ENRICHED", RANAP_RANAP_RELOCATION_INFORMATION_ENRICHED.class);
        configuration.addEventType("gpeh.RANAP_RAB_RELEASE_REQUEST_ENRICHED", RANAP_RAB_RELEASE_REQUEST_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_COMMON_TRANSPORT_CHANNEL_RESOURCES_RELEASE_REQUEST_ENRICHED",
                RNSAP_COMMON_TRANSPORT_CHANNEL_RESOURCES_RELEASE_REQUEST_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_COMMON_TRANSPORT_CHANNEL_RESOURCES_REQUEST_ENRICHED",
                RNSAP_COMMON_TRANSPORT_CHANNEL_RESOURCES_REQUEST_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_COMMON_TRANSPORT_CHANNEL_RESOURCES_RESPONSE_ENRICHED",
                RNSAP_COMMON_TRANSPORT_CHANNEL_RESOURCES_RESPONSE_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_COMMON_TRANSPORT_CHANNEL_RESOURCES_FAILURE_ENRICHED",
                RNSAP_COMMON_TRANSPORT_CHANNEL_RESOURCES_FAILURE_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_RADIO_LINK_SETUP_REQUEST_ENRICHED", RNSAP_RADIO_LINK_SETUP_REQUEST_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_RADIO_LINK_SETUP_RESPONSE_ENRICHED", RNSAP_RADIO_LINK_SETUP_RESPONSE_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_RADIO_LINK_SETUP_FAILURE_ENRICHED", RNSAP_RADIO_LINK_SETUP_FAILURE_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_RADIO_LINK_ADDITION_REQUEST_ENRICHED", RNSAP_RADIO_LINK_ADDITION_REQUEST_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_RADIO_LINK_ADDITION_RESPONSE_ENRICHED", RNSAP_RADIO_LINK_ADDITION_RESPONSE_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_RADIO_LINK_ADDITION_FAILURE_ENRICHED", RNSAP_RADIO_LINK_ADDITION_FAILURE_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_RADIO_LINK_RECONFIGURATION_PREPARE_ENRICHED", RNSAP_RADIO_LINK_RECONFIGURATION_PREPARE_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_RADIO_LINK_RECONFIGURATION_READY_ENRICHED", RNSAP_RADIO_LINK_RECONFIGURATION_READY_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_RADIO_LINK_RECONFIGURATION_FAILURE_ENRICHED", RNSAP_RADIO_LINK_RECONFIGURATION_FAILURE_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_RADIO_LINK_RECONFIGURATION_COMMIT_ENRICHED", RNSAP_RADIO_LINK_RECONFIGURATION_COMMIT_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_RADIO_LINK_RECONFIGURATION_CANCEL_ENRICHED", RNSAP_RADIO_LINK_RECONFIGURATION_CANCEL_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_RADIO_LINK_DELETION_REQUEST_ENRICHED", RNSAP_RADIO_LINK_DELETION_REQUEST_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_RADIO_LINK_DELETION_RESPONSE_ENRICHED", RNSAP_RADIO_LINK_DELETION_RESPONSE_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_DL_POWER_CONTROL_REQUEST_ENRICHED", RNSAP_DL_POWER_CONTROL_REQUEST_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_DEDICATED_MEASUREMENT_INITIATION_REQUEST_ENRICHED",
                RNSAP_DEDICATED_MEASUREMENT_INITIATION_REQUEST_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_DEDICATED_MEASUREMENT_INITIATION_RESPONSE_ENRICHED",
                RNSAP_DEDICATED_MEASUREMENT_INITIATION_RESPONSE_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_DEDICATED_MEASUREMENT_INITIATION_FAILURE_ENRICHED",
                RNSAP_DEDICATED_MEASUREMENT_INITIATION_FAILURE_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_DEDICATED_MEASUREMENT_REPORT_ENRICHED", RNSAP_DEDICATED_MEASUREMENT_REPORT_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_DEDICATED_MEASUREMENT_TERMINATION_REQUEST_ENRICHED",
                RNSAP_DEDICATED_MEASUREMENT_TERMINATION_REQUEST_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_DEDICATED_MEASUREMENT_FAILURE_INDICATION_ENRICHED",
                RNSAP_DEDICATED_MEASUREMENT_FAILURE_INDICATION_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_RADIO_LINK_FAILURE_INDICATION_ENRICHED", RNSAP_RADIO_LINK_FAILURE_INDICATION_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_RADIO_LINK_RESTORE_INDICATION_ENRICHED", RNSAP_RADIO_LINK_RESTORE_INDICATION_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_COMPRESSED_MODE_COMMAND_ENRICHED", RNSAP_COMPRESSED_MODE_COMMAND_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_ERROR_INDICATION_ENRICHED", RNSAP_ERROR_INDICATION_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_UPLINK_SIGNALLING_TRANSFER_INDICATION_ENRICHED",
                RNSAP_UPLINK_SIGNALLING_TRANSFER_INDICATION_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_DOWNLINK_SIGNALLING_TRANSFER_REQUEST_ENRICHED",
                RNSAP_DOWNLINK_SIGNALLING_TRANSFER_REQUEST_ENRICHED.class);
        configuration.addEventType("gpeh.RNSAP_RADIO_LINK_PARAMETER_UPDATE_INDICATION_ENRICHED",
                RNSAP_RADIO_LINK_PARAMETER_UPDATE_INDICATION_ENRICHED.class);
    }

    private ConfigurationEventTypeLegacy createConfigurationEventTypeLegacy() {
        final ConfigurationEventTypeLegacy legacyDefForEnhancedSession = new ConfigurationEventTypeLegacy();
        legacyDefForEnhancedSession.setCopyMethod("cloneMe");
        legacyDefForEnhancedSession.setAccessorStyle(AccessorStyle.JAVABEAN);
        legacyDefForEnhancedSession.setCodeGeneration(CodeGeneration.ENABLED);
        legacyDefForEnhancedSession.setPropertyResolutionStyle(PropertyResolutionStyle.CASE_INSENSITIVE);
        return legacyDefForEnhancedSession;
    }

    private void addConstants(final Configuration configuration) {
        configuration.addVariable("INTEGER_MIN_VAL", "int", Integer.MIN_VALUE, true);
        configuration.addVariable("DEFAULT_FLOAT_VALUE", "float", DefaultValues.DEFAULT_FLOAT_VALUE, true);
        configuration.addVariable("DEFAULT_LONG_VALUE", "long", DefaultValues.DEFAULT_LONG_VALUE, true);
        configuration.addVariable("DEFAULT_LONG_VALUE_STRING", "string", String.valueOf(DefaultValues.DEFAULT_LONG_VALUE), true);
        configuration.addVariable("DEFAULT_INT_VALUE", "int", DefaultValues.DEFAULT_INT_VALUE, true);
        configuration.addVariable("DEFAULT_BYTE_VALUE", "byte", DefaultValues.DEFAULT_BYTE_VALUE, true);
        configuration.addVariable("X", "int", "30", true);
        configuration.addVariable("TIMER_INTERVAL_CHECK_EXPIRY", "int", 300, true); // 5 minutes in seconds
        configuration.addVariable("EXPIRY_TIME", "int", 5400000, true); // 1.5 hours in milliseconds
        configuration.addVariable("TIMER_INTERVAL_PRODUCE_OUTPUT", "int", OUTPUT_INTERVAL, true);
        configuration.addVariable("BASE_ECNO_VALUE", "float", -24.5f, true);
        configuration.addVariable("HIGHEST_ECNO_INDEX", "int", 50, true);
        configuration.addVariable("BASE_RSCP_VALUE", "float", -116f, true);
        configuration.addVariable("HIGHEST_RSCP_INDEX", "int", 92, true);
        configuration.addVariable("HO_TYPE_SOHO", "byte", 0, true);
        configuration.addVariable("HO_TYPE_HSDSCH", "byte", 1, true);
        configuration.addVariable("HO_TYPE_IFHO", "byte", 2, true);
        configuration.addVariable("HO_TYPE_IRAT", "byte", 3, true);
        configuration.addVariable("SESSION_DURATION_IN_SECONDS", "int", 300, true);
        configuration.addVariable("SESSION_DURATION_IN_MINUTES", "int", 5, true);
        configuration.addVariable("EVENT_ID_VALUE", "short", 20000, true);
        configuration.addVariable("ONE_MINUTE_IN_MS", "int", 60000, true);
        configuration.addVariable("RRC_RRC_CONNECTION_SETUP_ID", "int", 35, true);
        configuration.addVariable("RRC_RRC_CONNECTION_RELEASE_COMPLETE_ID", "int", 20, true);
        configuration.addVariable("INTERNAL_IMSI_ID", "int", 384, true);
        configuration.addVariable("INTERNAL_RAB_ESTABLISHMENT_ID", "int", 415, true);
        configuration.addVariable("INTERNAL_NORMAL_RELEASE_ID", "int", 457, true);
        configuration.addVariable("INTERNAL_RAB_RELEASE_ID", "int", 416, true);
        configuration.addVariable("INTERNAL_SYSTEM_RELEASE_ID", "int", 438, true);
        configuration.addVariable("INTERNAL_CALL_REESTABLISHMENT_ID", "int", 409, true);
        configuration.addVariable("RRC_MEASUREMENT_REPORT_ID", "int", EventIdConstants.RRC_MEASUREMENT_REPORT, true);
        configuration.addVariable("ASN1_MEASUREMENT_ID", "int", EventIdConstants.ASN1_MEASUREMENT, true);
        configuration.addVariable("INTERNAL_CHANNEL_SWITCHING_ID", "int", 387, true);
        configuration.addVariable("INTERNAL_SYSTEM_UTILIZATION_ID", "int", 451, true);
        configuration.addVariable("INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ID", "int", 433, true);
        configuration.addVariable("INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ID", "int", 432, true);
        configuration.addVariable("INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ID", "int", 436, true);
        configuration.addVariable("INTERNAL_OUT_HARD_HANDOVER_FAILURE_ID", "int", 458, true);
        configuration.addVariable("INTERNAL_IFHO_EXECUTION_ACTIVE_ID", "int", 423, true);
        configuration.addVariable("INTERNAL_SOFT_HANDOVER_EXECUTION_ID", "int", 408, true);
        configuration.addVariable("INTERNAL_CMODE_ACTIVATE_ID", "int", 401, true);
        configuration.addVariable("INTERNAL_CMODE_DEACTIVATE_ID", "int", 402, true);
        configuration.addVariable("INTERNAL_START_CONGESTION_ID", "int", 393, true);
        configuration.addVariable("INTERNAL_STOP_CONGESTION_ID", "int", 394, true);
        configuration.addVariable("INTERNAL_RECORDING_FAULT_ID", "int", 444, true);
        configuration.addVariable("INTERNAL_RECORDING_RECOVERED_ID", "int", 445, true);
        configuration.addVariable("INTERNAL_MP_OVERLOAD_ID", "int", 425, true);
        configuration.addVariable("INTERNAL_CALL_SETUP_FAIL_ID", "int", 456, true);
        configuration.addVariable("INTERNAL_SOHO_DS_MISSING_NEIGHBOUR_ID", "int", 427, true);
        configuration.addVariable("RRC_UPLINK_DIRECT_TRANSFER_ID", "int", 29, true);
    }

}