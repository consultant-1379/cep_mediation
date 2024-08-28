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
package com.ericsson.cepmediation.correlation.service;

import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.apeventbeans.gpeh.*;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.features.impl.FeatureManagerImpl;
import com.ericsson.cepmediation.base.meta.admin.SchemaHandler;
import com.ericsson.cepmediation.base.meta.admin.SchemaTypeHandler;
import com.ericsson.cepmediation.base.meta.schema.SchemaException;
import com.ericsson.cepmediation.base.proc.config.Correlation;
import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.properties.*;
import com.ericsson.cepmediation.base.publishing.impl.AutoFlushingPublisher;
import com.ericsson.cepmediation.base.publishing.impl.EventBusPublisher;
import com.ericsson.cepmediation.base.service.ServiceException;
import com.ericsson.cepmediation.base.util.ErrorCode;
import com.ericsson.cepmediation.correlation.enrichment.listeners.GenericEsperListener;
import com.ericsson.cepmediation.correlation.precorrelation.esperservices.EsperService;
import com.ericsson.cepmediation.correlation.precorrelation.esperservices.impl.EsperConfiguration;
import com.ericsson.cepmediation.correlation.precorrelation.esperservices.impl.UERTTEsperService;
import com.espertech.esper.client.Configuration;
import com.espertech.esper.client.UpdateListener;

/**
 * @author xalomis
 */
public class UERTTEsperCorrelationEngine implements CorrelationEngine {
    private static final String EPL_DIR = "esper/";
    
    private static final String UE_TRACE = "UE_TRACE";

    private static final Logger logger = LoggerFactory
            .getLogger(UERTTEsperCorrelationEngine.class);

    private EsperService service = null;

    private static final String CORRELATION_SCHEMA_NAME = "correlation";

    private static final int PUBLISHING_SCAN_INTERVAL = CepMediationProperties
            .getIntProperty(CepMediationProperty.PUBLISHING_CORRELATING_SCAN_INTERVAL);

    @Override
    public void onEvents(final List<ApEventBean> events) {
        service.onEvents(events);
    }

    private UERTTEsperCorrelationEngine() {
    }

    private UERTTEsperCorrelationEngine(final ServiceConfigBean serviceData,
            final String label) throws SchemaException, ServiceException {
        Correlation correlation = serviceData.getCorrelationData();
        this.service = createEsperService(correlation, label);
        initService(correlation, createPublisher());
    }

    private void initService(Correlation correlation,
            EventBusPublisher publisher) throws ServiceException {
        UpdateListener listener = createEsperListener(correlation, publisher);
        service.attachListenerToStatements(listener, correlation
                .getStatements().toArray(new String[0]));
    }

    public static UERTTEsperCorrelationEngine instance(
            final ServiceConfigBean serviceData, final String label)
            throws ServiceException {
        try {
            return new UERTTEsperCorrelationEngine(serviceData, label);
        } catch (final Exception e) {
            logger.error(
                    "UERTT Correlation Service Failed to initlialize, Reason:\n"
                            + e.getMessage(), e);
            throw new ServiceException(e.getMessage(),
                    ErrorCode.CORRELATION_ENG_INIT_FAILED);
        }
    }

    private UpdateListener createEsperListener(
            final Correlation correlationRule, EventBusPublisher publisher)
            throws ServiceException {
        final GenericEsperListener esperListener = createListener(correlationRule
                .getListener());
        esperListener.config(publisher);
        return esperListener;
    }

    private GenericEsperListener createListener(final String className)
            throws ServiceException {
        try {
            return (GenericEsperListener) (Class
                    .forName("com.ericsson.cepmediation.correlation.enrichment.listeners."
                            + className).newInstance());
        } catch (final Exception e) {
            logger.error("Exception", e);
            throw new ServiceException(
                    "Failed to load the UERTT Correlation listener class "
                            + className, ErrorCode.CORRELATION_ENG_INIT_FAILED);
        }
    }

    private EventBusPublisher createPublisher() throws SchemaException {
        final SchemaTypeHandler schemaTypeHandler = new SchemaHandler().getSchemaMap().get(CORRELATION_SCHEMA_NAME);
        final EventBusPublisher correlatedEventPublisher = new AutoFlushingPublisher(PUBLISHING_SCAN_INTERVAL, ConfigBinder.getInstance()
                .getUerttForwarderListeners(),UE_TRACE);
        // Add correlation events to the publisher as an array of mapped events
        correlatedEventPublisher.addEvents(schemaTypeHandler.getName(), schemaTypeHandler.getEventMap().values());
        
        correlatedEventPublisher.addEvent(RRC_ACTIVE_SET_UPDATE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_ACTIVE_SET_UPDATE_COMPLETE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_ACTIVE_SET_UPDATE_FAILURE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_CELL_UPDATE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_CELL_UPDATE_CONFIRM_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_DOWNLINK_DIRECT_TRANSFER_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_MEASUREMENT_CONTROL_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_MEASUREMENT_CONTROL_FAILURE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_MEASUREMENT_REPORT_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_PAGING_TYPE_2_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_RADIO_BEARER_RECONFIGURATION_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_RADIO_BEARER_RECONFIGURATION_COMPLETE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_RADIO_BEARER_RECONFIGURATION_FAILURE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_RADIO_BEARER_RELEASE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_RADIO_BEARER_RELEASE_COMPLETE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_RADIO_BEARER_RELEASE_FAILURE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_RADIO_BEARER_SETUP_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_RADIO_BEARER_SETUP_COMPLETE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_RADIO_BEARER_SETUP_FAILURE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_RRC_CONNECTION_RELEASE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_RRC_CONNECTION_RELEASE_COMPLETE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_RRC_STATUS_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_SECURITY_MODE_COMMAND_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_SECURITY_MODE_COMPLETE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_SECURITY_MODE_FAILURE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_SIGNALLING_CONNECTION_RELEASE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_SIGNALLING_CONNECTION_RELEASE_INDICATION_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_UE_CAPABILITY_INFORMATION_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_UE_CAPABILITY_INFORMATION_CONFIRM_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_UPLINK_DIRECT_TRANSFER_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_UTRAN_MOBILITY_INFORMATION_CONFIRM_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_HANDOVER_FROM_UTRAN_COMMAND_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_HANDOVER_FROM_UTRAN_FAILURE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_PHYSICAL_CHANNEL_RECONFIGURATION_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_PHYSICAL_CHANNEL_RECONFIGURATION_COMPLETE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_PHYSICAL_CHANNEL_RECONFIGURATION_FAILURE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_UTRAN_MOBILITY_INFORMATION_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_UTRAN_MOBILITY_INFORMATION_FAILURE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_CELL_CHANGE_ORDER_FROM_UTRAN_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_CELL_CHANGE_ORDER_FROM_UTRAN_FAILURE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_UE_CAPABILITY_ENQUIRY_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_URA_UPDATE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_URA_UPDATE_CONFIRM_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_TRANSPORT_CHANNEL_RECONFIGURATION_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_TRANSPORT_CHANNEL_RECONFIGURATION_COMPLETE_ENRICHED.ABSOLUTE_NAME);
        
        correlatedEventPublisher.addEvent(NBAP_RADIO_LINK_SETUP_REQUEST_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(NBAP_RADIO_LINK_SETUP_RESPONSE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(NBAP_RADIO_LINK_SETUP_FAILURE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(NBAP_RADIO_LINK_ADDITION_REQUEST_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(NBAP_RADIO_LINK_ADDITION_RESPONSE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(NBAP_RADIO_LINK_ADDITION_FAILURE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(NBAP_RADIO_LINK_RECONFIGURATION_PREPARE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(NBAP_RADIO_LINK_RECONFIGURATION_READY_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(NBAP_RADIO_LINK_RECONFIGURATION_FAILURE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(NBAP_RADIO_LINK_RECONFIGURATION_COMMIT_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(NBAP_RADIO_LINK_RECONFIGURATION_CANCEL_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(NBAP_RADIO_LINK_DELETION_REQUEST_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(NBAP_RADIO_LINK_DELETION_RESPONSE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(NBAP_DL_POWER_CONTROL_REQUEST_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(NBAP_DEDICATED_MEASUREMENT_INITIATION_REQUEST_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(NBAP_DEDICATED_MEASUREMENT_INITIATION_RESPONSE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(NBAP_DEDICATED_MEASUREMENT_INITIATION_FAILURE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(NBAP_DEDICATED_MEASUREMENT_REPORT_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(NBAP_DEDICATED_MEASUREMENT_TERMINATION_REQUEST_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(NBAP_DEDICATED_MEASUREMENT_FAILURE_INDICATION_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(NBAP_RADIO_LINK_FAILURE_INDICATION_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(NBAP_RADIO_LINK_RESTORE_INDICATION_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(NBAP_COMPRESSED_MODE_COMMAND_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(NBAP_RADIO_LINK_PARAMETER_UPDATE_INDICATION_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(NBAP_SECONDARY_UL_FREQUENCY_REPORT_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(NBAP_SECONDARY_UL_FREQUENCY_UPDATE_INDICATION_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(NBAP_RADIO_LINK_PREEMPTION_REQUIRED_INDICATION_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RANAP_RAB_ASSIGNMENT_REQUEST_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RANAP_RAB_ASSIGNMENT_RESPONSE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RANAP_IU_RELEASE_REQUEST_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RANAP_IU_RELEASE_COMMAND_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RANAP_IU_RELEASE_COMPLETE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RANAP_SECURITY_MODE_COMMAND_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RANAP_SECURITY_MODE_COMPLETE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RANAP_SECURITY_MODE_REJECT_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RANAP_LOCATION_REPORTING_CONTROL_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RANAP_DIRECT_TRANSFER_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RANAP_ERROR_INDICATION_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RANAP_RELOCATION_REQUIRED_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RANAP_RELOCATION_REQUEST_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RANAP_RELOCATION_REQUEST_ACKNOWLEDGE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RANAP_RELOCATION_COMMAND_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RANAP_RELOCATION_DETECT_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RANAP_RELOCATION_COMPLETE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RANAP_RELOCATION_PREPARATION_FAILURE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RANAP_RELOCATION_FAILURE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RANAP_RELOCATION_CANCEL_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RANAP_RELOCATION_CANCEL_ACKNOWLEDGE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RANAP_SRNS_CONTEXT_REQUEST_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RANAP_SRNS_CONTEXT_RESPONSE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RANAP_SRNS_DATA_FORWARD_COMMAND_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RANAP_LOCATION_REPORT_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RANAP_RANAP_RELOCATION_INFORMATION_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RANAP_RAB_RELEASE_REQUEST_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_COMMON_TRANSPORT_CHANNEL_RESOURCES_RELEASE_REQUEST_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_COMMON_TRANSPORT_CHANNEL_RESOURCES_REQUEST_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_COMMON_TRANSPORT_CHANNEL_RESOURCES_RESPONSE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_COMMON_TRANSPORT_CHANNEL_RESOURCES_FAILURE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_RADIO_LINK_SETUP_REQUEST_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_RADIO_LINK_SETUP_RESPONSE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_RADIO_LINK_SETUP_FAILURE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_RADIO_LINK_ADDITION_REQUEST_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_RADIO_LINK_ADDITION_RESPONSE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_RADIO_LINK_ADDITION_FAILURE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_RADIO_LINK_RECONFIGURATION_PREPARE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_RADIO_LINK_RECONFIGURATION_READY_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_RADIO_LINK_RECONFIGURATION_FAILURE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_RADIO_LINK_RECONFIGURATION_COMMIT_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_RADIO_LINK_RECONFIGURATION_CANCEL_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_RADIO_LINK_DELETION_REQUEST_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_RADIO_LINK_DELETION_RESPONSE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_DL_POWER_CONTROL_REQUEST_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_DEDICATED_MEASUREMENT_INITIATION_REQUEST_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_DEDICATED_MEASUREMENT_INITIATION_RESPONSE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_DEDICATED_MEASUREMENT_INITIATION_FAILURE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_DEDICATED_MEASUREMENT_REPORT_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_DEDICATED_MEASUREMENT_TERMINATION_REQUEST_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_DEDICATED_MEASUREMENT_FAILURE_INDICATION_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_RADIO_LINK_FAILURE_INDICATION_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_RADIO_LINK_RESTORE_INDICATION_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_COMPRESSED_MODE_COMMAND_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_ERROR_INDICATION_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_UPLINK_SIGNALLING_TRANSFER_INDICATION_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_DOWNLINK_SIGNALLING_TRANSFER_REQUEST_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RNSAP_RADIO_LINK_PARAMETER_UPDATE_INDICATION_ENRICHED.ABSOLUTE_NAME);

        return correlatedEventPublisher;
    }

    private EsperService createEsperService(Correlation correlation,
            String dataLabel) {
        Configuration esperConfiguration = new EsperConfiguration()
                .getEsperConfiguration();
        EsperService res = new UERTTEsperService(dataLabel, esperConfiguration,
                correlation.getName() + "_neName_" + dataLabel,
                correlation.getSessionDuration());

        logger.debug("Deploying Rule " + correlation.getRule());
        final String rulePath = EPL_DIR + correlation.getRule();
        res.deploy(rulePath);
        logger.info("Deployed Rule " + correlation.getRule());

        Set<String> enabledEpls = FeatureManagerImpl.getInstance()
                .getEnabledEpls();
        logger.info("Enabled epls: " + enabledEpls);
        if (!enabledEpls.isEmpty() && correlation.getUses() != null
                && !correlation.getUses().isEmpty()) {
            logger.info("Uses epls: " + correlation.getUses());
            for (String epl : correlation.getUses()) {
                epl = EPL_DIR + epl;
                if (enabledEpls.contains(epl)) {
                    logger.info("Deploying: " + epl);
                    res.deploy(epl);
                }
            }
        }

        return res;
    }
}
