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

public final class CorrelationExecuter implements ServiceExecuter {

    private static final Logger logger = LoggerFactory.getLogger(CorrelationExecuter.class);

    private ServiceConfigBean serviceData;

    private CorrelationExecuter() {
    }

    /**
     * @return Instance of this class
     */
    public static CorrelationExecuter create() {
        return new CorrelationExecuter();
    }

    @Override
    public void execute() throws ServiceException {
        logger.trace("execute()-->");
        logger.trace("execute()<--");
    }

    private void initTopicListener(Map<String, CorrelationEngine> correlationEngineMap) {
        final EventListening eventListening = serviceData.getEventListening();
        if (eventListening != null) {
            new CorrelationTopicListener(eventListening.getTopicName(), serviceData.getCorrelationData().getName(), correlationEngineMap);
        }
    }

    @Override
    public void terminate() {
    }

    @Override
    public void init(final ConfigData data, final ServiceConfigBean serviceData) {
        try {
            this.serviceData = serviceData;
            Map<String, CorrelationEngine> correlationEngineMap = CorrelationEngineFactory.createCorrelationEngineMap(serviceData);
            initTopicListener(correlationEngineMap);
        } catch (Exception e) {
            logger.error("Correlation Service Failed to initlialize, Reason:\n" + e.getMessage(), e);
        }
    }
}
