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
package com.ericsson.cepmediation.correlation.enrichment.listeners;

import java.util.concurrent.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.statistics.Statistics;
import com.ericsson.cepmediation.base.statistics.StatisticsAware;
import com.espertech.esper.client.EventBean;

public final class UERTTCorrelationEsperListener extends GenericEsperListener implements StatisticsAware {
    public static int eventCount = 0;
    private int NUMBER_OF_EVENTS_TO_LOG = 100000;
    private static final Logger logger = LoggerFactory.getLogger(UERTTCorrelationEsperListener.class);
    private final BlockingQueue<ApEventBean> queue = new LinkedBlockingQueue<ApEventBean>();
    private final ExecutorService executor = Executors.newFixedThreadPool(1, new ThreadFactory() {
        @Override
        public Thread newThread(final Runnable r) {
            return new Thread(r, "uertt_correlation_publishing_thread");
        }
    });

    public UERTTCorrelationEsperListener() {
        executor.submit(getListenerThread());
    }

    private Runnable getListenerThread() {
        return new ListenerThread();
    }

    @Override
    public void exportTo(final Statistics statistics) {
    }

    @Override
    public void update(final EventBean[] newEvents, final EventBean[] oldEvents) {
        if (newEvents != null) {
            addToQueue(newEvents);
        }
    }

    private void addToQueue(final EventBean[] newEvents) {
        for (int i = 0; i < newEvents.length; i++) {
            queue.add((ApEventBean) newEvents[i].getUnderlying());
        }
    }

    private final class ListenerThread implements Runnable {

        @Override
        public void run() {
            while (true) {
                processQueue();
            }
        }

        private void processQueue() {
            try {
                processEvent();
            } catch (final InterruptedException e) {
                logger.error("UERTTCorrelationEsperListener:Queue handler has failed to execute, Reason: " + e.getMessage());
            } catch (final Throwable t) {
                logger.error("UERTTCorrelationEsperListener:Fatal error while processing event", t);
            }
        }

        private void processEvent() throws InterruptedException {
            final ApEventBean apEventBean = queue.take();
            logEventCount();
            publishEvent(apEventBean);
        }

        private void logEventCount() {
            if (eventCount++ == NUMBER_OF_EVENTS_TO_LOG) {
                logger.debug("UERTTCorrelationEsperListener: Published 100k events.");
                eventCount = 0;
            }
        }

        private void publishEvent(final ApEventBean apEventBean) {
            try {
                eventBusPublisher.publishMessage(apEventBean);
            } catch (final Exception e) {
                logger.error("UERTTCorrelationEsperListener:Error publishing event. ", e);
            }
        }
    }
}