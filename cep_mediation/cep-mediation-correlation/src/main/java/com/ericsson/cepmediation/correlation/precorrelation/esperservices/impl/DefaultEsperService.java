package com.ericsson.cepmediation.correlation.precorrelation.esperservices.impl;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.statistics.Statistics;
import com.ericsson.cepmediation.correlation.precorrelation.esperservices.EsperService;
import com.espertech.esper.client.Configuration;
import com.espertech.esper.client.EPAdministrator;
import com.espertech.esper.client.EPRuntime;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.UpdateListener;
import com.espertech.esper.client.deploy.Module;

public class DefaultEsperService implements EsperService {
    private static final Logger logger = LoggerFactory.getLogger(DefaultEsperService.class);

    private final EPServiceProvider epServiceProvider;

    private final EPRuntime runtime;

    private final EPAdministrator admin;

    private final RopProcessor processor;

    public DefaultEsperService(String dataLabel, final Configuration configuration, final String name, String sessionDuration) {
        epServiceProvider = EPServiceProviderManager.getProvider("esper-service-provider-" + name, configuration);
        runtime = epServiceProvider.getEPRuntime();
        admin = epServiceProvider.getEPAdministrator();
        processor = new RopProcessor(dataLabel, runtime, name, sessionDuration);
    }

    @Override
    public void onEvents(final List<ApEventBean> rop) {
        // this invocation is blocking until the previous rop started processing
        processor.process(rop);
    }

    @Override
    public void deploy(final String eplFile) {
        try {
            final Module module = admin.getDeploymentAdmin().read(eplFile);
            admin.getDeploymentAdmin().deploy(module, null);
        } catch (final Exception e) {
            throw new RuntimeException("Unable to deploy module '" + eplFile + "'", e);
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
                    logger.info("Attached listener to statement '" + esperStatementName + "'");
                }
            }
        }
    }

    @Override
    public void exportTo(final Statistics statistics) {
        // TODO Auto-generated method stub

    }
}
