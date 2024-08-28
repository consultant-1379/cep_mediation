package com.ericsson.cepmediation.correlation.enrichment.listeners;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.statistics.Statistics;
import com.ericsson.cepmediation.base.statistics.StatisticsAware;
import com.espertech.esper.client.EventBean;

public final class RadioSessionCorrelationEsperListener extends GenericEsperListener implements StatisticsAware {

    private static final Logger logger = LoggerFactory.getLogger(RadioSessionCorrelationEsperListener.class);

    EventEnricher eventEnricher = new EventEnricher();

    private final BlockingQueue<ApEventBean> queue = new LinkedBlockingQueue<ApEventBean>();

    private final ExecutorService executor = Executors.newFixedThreadPool(1, new ThreadFactory() {
        @Override
        public Thread newThread(final Runnable r) {
            return new Thread(r, "correlation_publishing_thread");
        }
    });

    public RadioSessionCorrelationEsperListener() {
        executor.submit(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    try {
                        int eventCnt = 0;
                        final ApEventBean apEventBean = queue.take();
                        eventEnricher.enrich(apEventBean);
                        try {
                            if (eventCnt++ == 100000) {
                                logger.debug("Published 100k radio sessions");
                                eventCnt = 0;
                            }

                            eventBusPublisher.publishMessage(apEventBean);
                        } catch (final Exception e) {
                            logger.error("Error publishing event. ", e);
                        }

                    } catch (final InterruptedException e) {
                        logger.error("Queue handler has failed to execute, Reason: " + e.getMessage());
                    } catch (final Throwable t) {
                        logger.error("Fatal error while processing event", t);
                    }
                }
            }

        });
    }

    @Override
    public void exportTo(final Statistics statistics) {
    }

    @Override
    public void update(final EventBean[] newEvents, final EventBean[] oldEvents) {
        if (newEvents != null) {
            logger.trace("Correlated events: " + newEvents.length);
            for (int i = 0; i < newEvents.length; i++) {
                queue.add((ApEventBean) newEvents[i].getUnderlying());
            }
        }
    }
}
