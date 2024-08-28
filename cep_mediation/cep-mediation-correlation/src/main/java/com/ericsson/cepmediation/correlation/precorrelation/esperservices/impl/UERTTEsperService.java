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
package com.ericsson.cepmediation.correlation.precorrelation.esperservices.impl;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.statistics.Statistics;
import com.ericsson.cepmediation.correlation.enrichment.SessionFlushEvent;
import com.ericsson.cepmediation.correlation.precorrelation.esperservices.EsperService;
import com.espertech.esper.client.*;
import com.espertech.esper.client.deploy.Module;

/**
 * @author xalomis
 * 
 */
public class UERTTEsperService implements EsperService {
    private static final Logger logger = LoggerFactory.getLogger(UERTTEsperService.class);

    private final EPServiceProvider epServiceProvider;

    private final EPRuntime runtime;

    private final EPAdministrator admin;

    public UERTTEsperService(String dataLabel, final Configuration configuration, final String name, String sessionDuration) {
        epServiceProvider = EPServiceProviderManager.getProvider("esper-service-provider-" + name, configuration);
        runtime = epServiceProvider.getEPRuntime();
        admin = epServiceProvider.getEPAdministrator();
    }

    @Override
    public void onEvents(final List<ApEventBean> rop) {
        for (ApEventBean apEventBean : rop) {
            runtime.sendEvent(apEventBean);
        }
        runtime.sendEvent(new SessionFlushEvent());
    }

    @Override
    public void deploy(final String eplFile) {
        try {
            final Module module = admin.getDeploymentAdmin().read(eplFile);
            admin.getDeploymentAdmin().deploy(module, null);
        } catch (final Exception e) {
            throw new RuntimeException("UERTTEsperService:Unable to deploy module '" + eplFile + "'", e);
        }
    }

    @Override
    public void attachListenerToStatements(final UpdateListener listener, final String[] statements) {
        if (listener != null && statements != null) {
            final Set<String> attachToStatmentsSet = new HashSet<String>();
            attachToStatmentsSet.addAll(Arrays.asList(statements));
            final String[] esperStatements = epServiceProvider.getEPAdministrator().getStatementNames();
            for (final String esperStatementName : esperStatements) {
                if (attachToStatmentsSet.contains(esperStatementName)) {
                    final EPStatement stmt = epServiceProvider.getEPAdministrator().getStatement(esperStatementName);
                    stmt.addListener(listener);
                    logger.info("UERTTEsperService:Attached listener to statement '" + esperStatementName + "'");
                }
            }
        }
    }

    @Override
    public void exportTo(final Statistics statistics) {
    }

}
