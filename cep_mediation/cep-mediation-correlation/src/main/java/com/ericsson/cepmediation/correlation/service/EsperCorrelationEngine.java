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

package com.ericsson.cepmediation.correlation.service;

import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CALL_SETUP_FAIL_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SOHO_DS_MISSING_NEIGHBOUR_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SYSTEM_RELEASE_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CALL_REESTABLISHMENT_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.RRC_UPLINK_DIRECT_TRANSFER_ENRICHED;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.features.impl.FeatureManagerImpl;
import com.ericsson.cepmediation.base.meta.admin.SchemaHandler;
import com.ericsson.cepmediation.base.meta.admin.SchemaTypeHandler;
import com.ericsson.cepmediation.base.meta.schema.SchemaException;
import com.ericsson.cepmediation.base.proc.config.Correlation;
import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.base.properties.ConfigBinder;
import com.ericsson.cepmediation.base.publishing.impl.AutoFlushingPublisher;
import com.ericsson.cepmediation.base.publishing.impl.EventBusPublisher;
import com.ericsson.cepmediation.base.service.ServiceException;
import com.ericsson.cepmediation.base.util.ErrorCode;
import com.ericsson.cepmediation.correlation.enrichment.listeners.GenericEsperListener;
import com.ericsson.cepmediation.correlation.precorrelation.esperservices.EsperService;
import com.ericsson.cepmediation.correlation.precorrelation.esperservices.impl.DefaultEsperService;
import com.ericsson.cepmediation.correlation.precorrelation.esperservices.impl.EsperConfiguration;
import com.espertech.esper.client.Configuration;
import com.espertech.esper.client.UpdateListener;

public class EsperCorrelationEngine implements CorrelationEngine {
    private static final String EPL_DIR = "esper/";

    private static final Logger logger = LoggerFactory.getLogger(EsperCorrelationEngine.class);

    private EsperService service = null;

    private static final String CORRELATION_SCHEMA_NAME = "correlation";

    // The scan interval to use for buffer flushing
    private static final int PUBLISHING_SCAN_INTERVAL = CepMediationProperties.getIntProperty(CepMediationProperty.PUBLISHING_CORRELATING_SCAN_INTERVAL);

    @Override
    public void onEvents(final List<ApEventBean> events) {
        service.onEvents(events);
    }

    private EsperCorrelationEngine() {
    }

    private EsperCorrelationEngine(final ServiceConfigBean serviceData, final String label) throws SchemaException, ServiceException {
        Correlation correlation = serviceData.getCorrelationData();
        this.service = createEsperService(correlation, label);
        initService(correlation, createPublisher());
    }

    private void initService(Correlation correlation, EventBusPublisher publisher) throws ServiceException {
        UpdateListener listener = createEsperListener(correlation, publisher);
        service.attachListenerToStatements(listener, correlation.getStatements().toArray(new String[0]));
    }

    public static EsperCorrelationEngine instance(final ServiceConfigBean serviceData, final String label) throws ServiceException {
        try {
            return new EsperCorrelationEngine(serviceData, label);
        } catch (final Exception e) {
            logger.error("Correlation Service Failed to initlialize, Reason:\n" + e.getMessage(), e);
            throw new ServiceException(e.getMessage(), ErrorCode.CORRELATION_ENG_INIT_FAILED);
        }
    }

    private UpdateListener createEsperListener(final Correlation correlationRule, EventBusPublisher publisher) throws ServiceException {
        final GenericEsperListener esperListener = createListener(correlationRule.getListener());
        esperListener.config(publisher);
        return esperListener;
    }

    private GenericEsperListener createListener(final String className) throws ServiceException {
        try {
            return (GenericEsperListener) (Class.forName("com.ericsson.cepmediation.correlation.enrichment.listeners." + className).newInstance());
        } catch (final Exception e) {
            logger.error("Exception", e);
            throw new ServiceException("Failed to load the Correlation listener class " + className, ErrorCode.CORRELATION_ENG_INIT_FAILED);
        }
    }

    private EventBusPublisher createPublisher() throws SchemaException {
        final SchemaTypeHandler schemaTypeHandler = new SchemaHandler().getSchemaMap().get(CORRELATION_SCHEMA_NAME);
        final EventBusPublisher correlatedEventPublisher = new AutoFlushingPublisher(PUBLISHING_SCAN_INTERVAL, ConfigBinder.getInstance()
                .getAllEventListeners());
        // Add correlation events to the publisher as an array of mapped events
        correlatedEventPublisher.addEvents(schemaTypeHandler.getName(), schemaTypeHandler.getEventMap().values());
        correlatedEventPublisher.addEvent(INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(INTERNAL_SOHO_DS_MISSING_NEIGHBOUR_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(INTERNAL_CALL_SETUP_FAIL_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(INTERNAL_SYSTEM_RELEASE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(INTERNAL_CALL_REESTABLISHMENT_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(RRC_UPLINK_DIRECT_TRANSFER_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED.ABSOLUTE_NAME);
        correlatedEventPublisher.addEvent(INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED.ABSOLUTE_NAME);
        return correlatedEventPublisher;
    }

    private EsperService createEsperService(Correlation correlation, String dataLabel) {
        Configuration esperConfiguration = new EsperConfiguration().getEsperConfiguration();
        EsperService res = new DefaultEsperService(dataLabel, esperConfiguration, correlation.getName() + "_neName_" + dataLabel,
                correlation.getSessionDuration());

        logger.debug("Deploying Rule " + correlation.getRule());
        final String rulePath = EPL_DIR + correlation.getRule();
        res.deploy(rulePath);
        logger.info("Deployed Rule " + correlation.getRule());

        Set<String> enabledEpls = FeatureManagerImpl.getInstance().getEnabledEpls();
        logger.info("Enabled epls: " + enabledEpls);
        if (!enabledEpls.isEmpty() && correlation.getUses() != null && !correlation.getUses().isEmpty()) {
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
