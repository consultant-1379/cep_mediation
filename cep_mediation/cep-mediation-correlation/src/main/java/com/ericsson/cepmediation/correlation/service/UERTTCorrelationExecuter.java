/**
 * (C) Copyright LM Ericsson System Expertise AT/LMI, 2011
 *
 * The copyright to the computer program(s) herein is the property of Ericsson
 * System Expertise EEI, Sweden. The program(s) may be used and/or copied only
 * with the written permission from Ericsson System Expertise AT/LMI or in
 * accordance with the terms and conditions stipulated in the agreement/contract
 * under which the program(s) have been supplied.
 *
 */

package com.ericsson.cepmediation.correlation.service;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.proc.config.EventListening;
import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.service.ServiceException;
import com.ericsson.cepmediation.base.service.ServiceExecuter;
import com.ericsson.cepmediation.base.util.ConfigData;

/**
 * @author xalomis
 * 
 */
public final class UERTTCorrelationExecuter implements ServiceExecuter {

    private static final Logger logger = LoggerFactory
            .getLogger(UERTTCorrelationExecuter.class);

    private ServiceConfigBean serviceData;

    private UERTTCorrelationExecuter() {
    }

    public static UERTTCorrelationExecuter create() {
        return new UERTTCorrelationExecuter();
    }

    @Override
    public void execute() throws ServiceException {

    }

    private void initTopicListener(
            Map<String, CorrelationEngine> correlationEngineMap) {
        logger.info("Start UERTTCorrelationExecuter :initTopicListener()");
        final EventListening eventListening = serviceData.getEventListening();
        if (eventListening != null) {
            new UERTTCorrelationTopicListener(eventListening.getTopicName(),
                    serviceData.getCorrelationData().getName(),
                    correlationEngineMap);
        }
        logger.info("End UERTTCorrelationExecuter :initTopicListener()");
    }

    @Override
    public void terminate() {
    }

    @Override
    public void init(final ConfigData data, final ServiceConfigBean serviceData) {
        logger.info("Start UERTTCorrelationExecuter :init()");
        try {
            this.serviceData = serviceData;
            Map<String, CorrelationEngine> correlationEngineMap = UERTTCorrelationEngines
                    .createCorrelationEngineMap(serviceData);
            initTopicListener(correlationEngineMap);

        } catch (Exception e) {
            logger.info(
                    "UERTT Correlation Service Failed to initlialize, Reason:\n"
                            + e.getMessage(), e);
        }
        logger.info("End UERTTCorrelationExecuter :init()");
    }
}