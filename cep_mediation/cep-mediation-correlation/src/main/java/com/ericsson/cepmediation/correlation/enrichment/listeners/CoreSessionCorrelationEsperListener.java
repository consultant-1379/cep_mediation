package com.ericsson.cepmediation.correlation.enrichment.listeners;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.apeventbeans.correlation.SGEH_SESSION;
import com.ericsson.cepmediation.base.statistics.Statistics;
import com.ericsson.cepmediation.base.statistics.StatisticsAware;
import com.espertech.esper.client.EventBean;

/**
 * This class represents the Core session correlation esper listener
 *
 * @author exuexie
 */
public final class CoreSessionCorrelationEsperListener extends GenericEsperListener implements StatisticsAware {

    private static final Logger logger = LoggerFactory.getLogger(CoreSessionCorrelationEsperListener.class);

    private final BlockingQueue<SGEH_SESSION> queue = new LinkedBlockingQueue<SGEH_SESSION>();

    //used for dispatching the events
    private final ExecutorService executor = Executors.newFixedThreadPool(1, new ThreadFactory() {
        @Override
        public Thread newThread(final Runnable r) {
            return new Thread(r, "core_correlation_publishing_thread");
        }
    });

    /**
     *
     * Constructor
     *
     */
    public CoreSessionCorrelationEsperListener() {

        executor.submit(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    int eventCnt = 0;
                    try {
                        final SGEH_SESSION data = queue.take();
                        if (data.getIMSI() != -1) {
                            try {
                                if (eventCnt++ == 100000) {
                                    logger.debug("Published 100k core sessions");
                                    eventCnt = 0;
                                }
                                publish(data);
                            } catch (final Exception e) {
                                logger.error("Error publishing event. ", e);
                            }
                        }
                    } catch (final InterruptedException e) {
                        logger.error("SGEH_SESSION queue handler is failed to execute, Reason" + e.getMessage());
                    } catch (final Throwable t) {
                        logger.error("Fatal error while processing SGEH", t);
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

            for (int i = 0; i < newEvents.length; i++) {
                queue.add((SGEH_SESSION) newEvents[i].getUnderlying());
            }
        }
    }

}
