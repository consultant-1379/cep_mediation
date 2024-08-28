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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.listening.TopicListener;
import com.ericsson.cepmediation.base.service.ServiceException;
import com.ericsson.cepmediation.base.util.ErrorCode;
import com.ericsson.cepmediation.base.util.Metrics;

/**
 * @author xalomis
 * 
 */
public class UERTTCorrelationTopicListener extends TopicListener {
    private static final Logger logger = LoggerFactory
            .getLogger(UERTTCorrelationTopicListener.class);

    private static final Logger metricLogger = LoggerFactory
            .getLogger(Metrics.class);

    private final Map<String, CorrelationEngine> correlationEngineMap;

    public UERTTCorrelationTopicListener(final String topicName,
            final String correlationName,
            final Map<String, CorrelationEngine> correlationEngineMap) {
        super(topicName);
        logger.info("Creating topic listener for UERTT correlation: "
                + correlationName + " on topic: " + topicName
                + " with correlation engines: " + correlationEngineMap);
        final List<String> topicList = new ArrayList<String>();
        topicList.add(topicName);
        super.setTopics(topicList);
        this.correlationEngineMap = correlationEngineMap;
    }

    @Override
    public void onMessage(final List<ApEventBean> events) {
    }

    @Override
    public void onMessage(final List<ApEventBean> events, final String dataLabel) {
        try {
            logger.info("Received " + (events != null ? events.size() : 0)
                    + " events for UERTT correlation by engine: " + dataLabel);
            metricLogger.trace(events.size()
                    + " events received on UERTT correlation=" + name
                    + " data:" + dataLabel);
            final CorrelationEngine correlationEngine = correlationEngineMap
                    .get(dataLabel);
            if (correlationEngine == null) {
                throw new ServiceException(name + " " + dataLabel == null ? ""
                        : dataLabel
                                + " --> UERTT Correlation Engine Not Found. ",
                        ErrorCode.CORRELATION_ENG_INIT_FAILED);
            }

            correlationEngine.onEvents(events);
            metricLogger.trace(events.size()
                    + " events sent for UERTT correlation");
        } catch (final Exception e) {
            logger.error("Exception while sending events", e);
            throw new RuntimeException(e);
        }
    }

}
