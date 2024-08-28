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
package com.ericsson.cepmediation.server.service;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.features.impl.FeatureManagerImpl;
import com.ericsson.cepmediation.base.proc.config.Correlation;
import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.service.SERVICES;
import com.ericsson.cepmediation.base.service.Service;
import com.ericsson.cepmediation.base.service.ServiceException;
import com.ericsson.cepmediation.base.service.ServiceExecuter;
import com.ericsson.cepmediation.base.util.ConfigData;

/**
 * @author xalomis
 * 
 */
public class UERTTCorrelationServiceProvider implements Service {
    private static final Logger logger = LoggerFactory
            .getLogger(UERTTCorrelationServiceProvider.class);

    private ServiceExecuter command;

    @Override
    public void start() throws ServiceException {
        logger.info("Start UERTTCorrelationServiceProvider :start() -->");
        if (command != null) {
            command.execute();
        }
        logger.info("End UERTTCorrelationServiceProvider :start() <--");
    }

    @Override
    public void stop() {
        logger.info("Start UERTTCorrelationServiceProvider :stop() -->");
        if (command != null) {
            command.terminate();
        }
        logger.info("End UERTTCorrelationServiceProvider :stop() -->");
    }

    @Override
    public void init(final ConfigData data, final ServiceConfigBean serviceData)
            throws ServiceException {
        logger.info("Start UERTTCorrelationServiceProvider: init() -->");
        if (isUerttCorrelationDisabled(serviceData)) {
            return;
        }
        command = ServiceExecuterFactory.createService(SERVICES.UERTT_SERVICE);
        command.init(data, serviceData);
        logger.info("End UERTTCorrelationServiceProvider: init() -->");
    }

    private boolean isUerttCorrelationDisabled(
            final ServiceConfigBean serviceData) {
        final Correlation correlation = serviceData.getCorrelationData();
        final Set<String> enabledEpls = FeatureManagerImpl.getInstance()
                .getEnabledEpls();
        final String epl = correlation.getRule();
        if (!enabledEpls.contains("esper/" + epl)) {
            logger.warn("UERTT Correlation not enabled: " + epl
                    + ". Enabled correlations: " + enabledEpls
                    + ". UERTT Correlation service will not be started.");
            return true;
        }
        return false;
    }
}
