/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2015
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/

package com.ericsson.cepmediation.correlation.precorrelation.esperservices.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.apeventbeans.gpeh.RRC_MEASUREMENT_REPORT;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.semaphor.ProcessSemaphore;
import com.ericsson.cepmediation.correlation.enrichment.InternalNormalReleaseSetValue;
import com.ericsson.cepmediation.correlation.enrichment.SessionEndEvent;
import com.ericsson.cepmediation.correlation.enrichment.SessionFlushEvent;
import com.ericsson.cepmediation.correlation.lookup.LookupService;
import com.ericsson.cepmediation.correlation.lookup.impl.DefaultLookupService;
import com.ericsson.cepmediation.loading.asn1.ASN1MeasurementWrapper;
import com.espertech.esper.client.EPRuntime;

/**
 * Processes a rop and then sends it to Esper.
 * 
 * Processing comprises of carry over and gap handling. When correlation is
 * finished, this class signals to the loader thread.
 * 
 */
public class RopProcessor extends Thread {
    private static final String ONE_MINUTE = "ONE_MINUTE";

    private static final Logger logger = LoggerFactory
            .getLogger(RopProcessor.class);

    private static final int BYTES_IN_ONE_MEGABYTE = 1024 * 1024;

    private static final int CARRY_OVER_INTERVAL = 10000;

    private List<ApEventBean> carryOver = new ArrayList<ApEventBean>(1000);

    private final BlockingQueue<List<ApEventBean>> ropsQueue = new LinkedBlockingQueue<List<ApEventBean>>(
            1);

    private final String name;

    private final EPRuntime runtime;

    private final String dataLabel;

    private final long sessionDuration;

    private final String radioSessionCorrelation = "3GRadioSessionCorrelation_";

    private final String userPlaneCorrelation = "UserPlaneCorrelation_";

    private final String coreSessionCorrelation = "CoreSessionCorrelation_";

    private final String radioSessionMCorrelation = "3GRadioSessionMCorrelation_";

    private int dummyEventCount = 0;

    RopProcessor(final String dataLabel, final EPRuntime runtime,
            final String name, String sessionDuration) {
        super("correlation_thread_" + name + "_" + dataLabel);
        this.name = name;
        this.runtime = runtime;
        this.dataLabel = dataLabel;
        this.sessionDuration = ONE_MINUTE.equals(sessionDuration) ? 1 * 60 * 1000
                : 5 * 60 * 1000;
        dummyEventCount = 1;
        start();
    }

    /**
     * This method will block if there is already a rop in the queue waiting to
     * be processed.
     */
    void process(final List<ApEventBean> rop) {
        try {
            ropsQueue.put(rop);
        } catch (final InterruptedException e) {
            logger.error("Rop produced was interrupted: " + e.getMessage());
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                // this method is blocking
                List<ApEventBean> rop = ropsQueue.take();
                ProcessSemaphore.getInstance().consumerStarted(dataLabel);
                try {
                    handleRopCarryOver(rop);
                    send(rop);
                } finally {
                    ProcessSemaphore.getInstance().consumerFinished(dataLabel);
                }

                reclaimMemory(rop);
            }
        } catch (final Throwable t) {
            // never exit, just log the error
            logger.error(t.getMessage(), t);
        }
    }

    private void handleRopCarryOver(List<ApEventBean> rop) {
        if (isCarryOverRequired()) {
            processGap(rop);
            processOverlap(rop);
            processCarryOver(rop);
        }

    }

    private void reclaimMemory(List<ApEventBean> rop) {
        if (isFullGCReqqired(name)) {
            rop = null;
            System.gc();/*
                         * Give a hint to JVM to reclaim whole rop because this
                         * is unnecessary to retain in the memory altough enough
                         * space in the heap.!!
                         */
        }
    }

    private boolean isFullGCReqqired(String name) {
        return name.contains(radioSessionCorrelation)
                || name.contains(userPlaneCorrelation)
                || name.contains(coreSessionCorrelation);
    }

    private boolean isCarryOverRequired() {
        return !name.contains(userPlaneCorrelation);
    }

    private void processGap(final List<ApEventBean> events) {
        if (carryOver != null && !carryOver.isEmpty() && !events.isEmpty()) {
            final long lastFromCarryOver = carryOver.get(carryOver.size() - 1)
                    .getTimestamp();
            long carryOverSessionEnd = lastFromCarryOver
                    - (lastFromCarryOver % sessionDuration) + sessionDuration;
            final long firstFromRop = events.get(0).getTimestamp();
            boolean isGap = carryOverSessionEnd + sessionDuration < firstFromRop;
            if (isGap) {
                logger.info("Detected gap of "
                        + (firstFromRop - lastFromCarryOver)
                        + " millis. Carry over size:" + carryOver.size());
                for (final ApEventBean e : carryOver) {
                    if (e.getTimestamp() >= carryOverSessionEnd) {
                        break;
                    }
                    runtime.sendEvent(e);
                }

                runtime.sendEvent(new SessionEndEvent(carryOverSessionEnd + 1));
                runtime.sendEvent(new SessionFlushEvent());
                carryOver = new ArrayList<ApEventBean>(1000);
            }
        }
    }

    private void processCarryOver(final List<ApEventBean> events) {
        final int carryOverIndex = findCarryOverIndex(events);
        if (carryOverIndex > -1) {
            final List<ApEventBean> newCarryOver = events.subList(
                    carryOverIndex, events.size());
            carryOver = new ArrayList<ApEventBean>(newCarryOver);
            newCarryOver.clear();
        }
    }

    private void processOverlap(final List<ApEventBean> events) {
        final int overlapIndex = findOverlapIndex(events);
        if (overlapIndex > -1) {
            if (overlapIndex > 0) {
                final List<ApEventBean> overlap = events.subList(0,
                        overlapIndex);
                carryOver.addAll(overlap);
                Collections.sort(carryOver);
                // deletes from events list
                overlap.clear();
            }
            events.addAll(0, carryOver);
        }
    }

    private int findCarryOverIndex(final List<ApEventBean> events) {
        if (events.size() > 1) {
            long timestamp = events.get(events.size() - 1).getTimestamp();
            timestamp -= CARRY_OVER_INTERVAL;
            for (int i = events.size() - 2; i > -1; i--) {
                if (events.get(i).getTimestamp() < timestamp) {
                    // return the last event in the range
                    return i + 1;
                }
            }
        }
        return -1;
    }

    @SuppressWarnings("null")
    private int findOverlapIndex(final List<ApEventBean> events) {
        if (carryOver != null && !carryOver.isEmpty()) {
            final long timestamp = carryOver.get(carryOver.size() - 1)
                    .getTimestamp();
            for (int i = 0, n = events != null ? events.size() : 0; i < n; i++) {
                if (events.get(i) != null
                        && events.get(i).getTimestamp() > timestamp) {
                    return i;
                }
            }
        }

        return -1;
    }

    private void send(final List<ApEventBean> events) {
        final long start = System.currentTimeMillis();
        final long startFreeMem = Runtime.getRuntime().freeMemory();
        int progressIndicator = 0;
        int eventCount = 0;
        Queue<SessionEndEvent> sessionEnds = calcSessionEndEvents(events);
        SessionEndEvent currentEnd = sessionEnds.poll();
        if (name.contains(radioSessionMCorrelation) && dummyEventCount == 1) {
            dummyEventCount++;
            eventCount++;

            runtime.sendEvent(new InternalNormalReleaseSetValue(dataLabel));

        }
        for (ApEventBean e : events) {
            eventCount++;
            showProgress(++progressIndicator, events.size());

            if (currentEnd != null
                    && currentEnd.getTimestamp() <= e.getTimestamp()) {
                currentEnd.setTimestamp(currentEnd.getTimestamp() + 1);
                runtime.sendEvent(currentEnd);
                logger.debug("Sending end event: "
                        + new Date(currentEnd.getTimestamp()));
                currentEnd = sessionEnds.poll();
            }

            if (name.startsWith(radioSessionMCorrelation)) {
                runtime.sendEvent(e);
                eventCount += splitAndSendAsn1MessagesForRRCMeasEvent(e);
            } else {
                // For RC and VC correlation, do not send RRC Measurement report
                if (!(e instanceof RRC_MEASUREMENT_REPORT))
                    runtime.sendEvent(e);
                else
                    eventCount--;
                eventCount += sendAsn1MessageWithServingCell(e);
            }
            e = null;
        }
        showProgress(-1, events.size());
        logCorrelationPerformance(eventCount, System.currentTimeMillis()
                - start, startFreeMem);
    }

    private long sessionEnd = -1;

    private Queue<SessionEndEvent> calcSessionEndEvents(List<ApEventBean> events) {
        Queue<SessionEndEvent> res = new LinkedList<SessionEndEvent>();
        if (events.size() > 1) {
            long first = events.get(0).getTimestamp();
            long last = events.get(events.size() - 1).getTimestamp();
            if (!isCarryOverRequired()) {
                /*
                 * if we are not carrying over we may end up with missing
                 * session ends therefore we need this
                 */
                if (sessionEnd <= first) {
                    res.add(new SessionEndEvent(sessionEnd));
                }
            }
            sessionEnd = first - (first % sessionDuration) + sessionDuration;
            while (sessionEnd < last) {
                res.add(new SessionEndEvent(sessionEnd));
                sessionEnd += sessionDuration;
            }
        }
        return res;
    }

    private void showProgress(final int i, final int eventsSize) {
        if (i == -1) {
            logger.info("name : " + name + " ---> 100% processed.");
            return;
        }
        final int pauseCount = 250 * 1000;
        if (i % pauseCount == 0) {
            logger.info("name : " + name + " ---> "
                    + ((i / pauseCount) * (100 / (eventsSize / pauseCount)))
                    + "% processed.");
        }
    }

    private int splitAndSendAsn1MessagesForRRCMeasEvent(
            final ApEventBean parentEvent) {
        int eventCount = 0;
        final List<Object> measurementList = parentEvent.getMeasurements();
        if (measurementList != null && measurementList.size() > 0) {
            for (final Iterator<Object> iterator = measurementList.iterator(); iterator
                    .hasNext();) {
                final ASN1MeasurementWrapper measurementWrapper = (ASN1MeasurementWrapper) iterator
                        .next();
                runtime.sendEvent(measurementWrapper);
                eventCount++;
            }
        }
        return eventCount;
    }

    protected LookupService getDefaultLookupInstance() {
        return (DefaultLookupService.getInstance());
    }

    private int sendAsn1MessageWithServingCell(final ApEventBean parentEvent) {
        final List<Object> measurementList = parentEvent.getMeasurements();
        int eventCount = 0;
        if (measurementList != null && measurementList.size() > 0) {
            for (final Iterator<Object> iterator = measurementList.iterator(); iterator
                    .hasNext();) {
                final ASN1MeasurementWrapper measurementWrapper = (ASN1MeasurementWrapper) iterator
                        .next();
                if (getDefaultLookupInstance().isForServingCell(
                        measurementWrapper.getASN1_MEASUREMENT().getRNC_ID_1(),
                        measurementWrapper.getASN1_MEASUREMENT().getC_ID_1(),
                        measurementWrapper.getASN1_MEASUREMENT()
                                .getSCRAMBLING_CODE())) {
                    /*
                     * if there are more than one ASN1 in RRC Measurement Report
                     * carrying ASN1 data, set the Redundant ASN1 field to true
                     */
                    if (eventCount >= 1)
                        measurementWrapper.setRedundant_ASN1(true);
                    runtime.sendEvent(measurementWrapper);
                    eventCount++;
                }
            }
        }
        if (parentEvent instanceof RRC_MEASUREMENT_REPORT) {
            if (eventCount == 0) {
                /*
                 * Send RRC Measurement report if none of the ASN1 matches
                 * Serving cell.
                 */
                runtime.sendEvent(parentEvent);
                eventCount++;
            }
        }
        return eventCount;
    }

    private void logCorrelationPerformance(final long eventsCnt,
            final long duration, final long startFreeMem) {
        final StringBuilder res = new StringBuilder();
        res.append("correlation_performance: topic=" + name);
        res.append(", events=" + eventsCnt);
        res.append(", time ms=" + duration);
        res.append(", events per ms= "
                + (duration > 0 ? (eventsCnt / duration) : -1));
        res.append(", start free mem=" + (startFreeMem / BYTES_IN_ONE_MEGABYTE)
                + "m");
        res.append(", end free mem="
                + (Runtime.getRuntime().freeMemory() / BYTES_IN_ONE_MEGABYTE)
                + "m");

        logger.info(res.toString());
    }

}
