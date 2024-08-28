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
package com.ericsson.cepmediation.correlation.stubs;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.ericsson.cepmediation.apeventbeans.gpeh.RRC_MEASUREMENT_REPORT;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.correlation.enrichment.InternalNormalReleaseSetValue;
import com.ericsson.cepmediation.correlation.enrichment.SessionEndEvent;
import com.ericsson.cepmediation.loading.asn1.ASN1MeasurementWrapper;
import com.ericsson.cepmediation.loading.events.Asn1MessageSplitter;
import com.espertech.esper.client.EPRuntime;

/**
 * Version of the DefaultEsperService for test purposes - intended to mimic what
 * DefaultEsperService does
 * 
 * @author eemecoy
 * 
 */
public class StubbedEsperService {

    private final Asn1MessageSplitter asn1MessageSplitter = new Asn1MessageSplitter();

    private final EPRuntime esperRuntime;

    /**
     * @param correlationEngine
     */
    public StubbedEsperService(final EPRuntime esperRuntime) {
        this.esperRuntime = esperRuntime;
    }

    public void sendEvent(final Object event) {
        sendEventToEsper(event);
        if (event instanceof ApEventBean) {
            splitAndSendAsn1MessagesForRRCMeasEvent((ApEventBean) event);
        }
    }

    private int splitAndSendAsn1MessagesForRRCMeasEvent(
            final ApEventBean parentEvent) {
        int eventCount = 0;
        final List<Object> splitEvents = Asn1MessageSplitter
                .splitEvent(parentEvent);
        parentEvent.setMeasurements(splitEvents);
        List<Object> measurementList = parentEvent.getMeasurements();
        if (measurementList != null && measurementList.size() > 0) {
            for (Iterator<Object> iterator = measurementList.iterator(); iterator
                    .hasNext();) {
                ASN1MeasurementWrapper measurementWrapper = (ASN1MeasurementWrapper) iterator
                        .next();
                sendEventToEsper(measurementWrapper);
                eventCount++;
            }
        }
        return eventCount;
    }

    private void sendEventToEsper(final Object event) {
        esperRuntime.sendEvent(event);
    }

    public int sendEventsAndSessionEndEventsForROP(
            final List<ApEventBean> gpehEvents) {
        long endSessionEventTimestamp = 0l;
        SessionEndEvent sessionEndEvent = null;
        ApEventBean event;
        int eventCount = 0;

        for (final Iterator<ApEventBean> iterator = gpehEvents.iterator(); iterator
                .hasNext();) {
            eventCount++;
            event = iterator.next();
            if (eventCount == 1) {
                esperRuntime.sendEvent(new InternalNormalReleaseSetValue(event
                        .getSubNetwork()));
                eventCount++;
            }
            if (endSessionEventTimestamp <= event.getTimestamp()) {
                if (sessionEndEvent != null) {
                    sessionEndEvent
                            .setTimestamp(sessionEndEvent.getTimestamp() + 1);
                    esperRuntime.sendEvent(sessionEndEvent);
                }
                sessionEndEvent = resolveEnd(event.getTimestamp());
                endSessionEventTimestamp = sessionEndEvent.getTimestamp();
            }
            if (event instanceof RRC_MEASUREMENT_REPORT) {
                eventCount += splitAndSendAsn1MessagesForRRCMeasEvent(event);
            }
            esperRuntime.sendEvent(event);
        }
        esperRuntime.sendEvent(sessionEndEvent);
        return eventCount;

    }

    private static SessionEndEvent resolveEnd(final long timestamp) {
        final long fiveMinute = 5 * 60 * 1000;
        final short rncId = 9;
        final Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("UTC"));
        cal.setTimeInMillis(timestamp);
        cal.set(Calendar.MINUTE,
                cal.get(Calendar.MINUTE) - cal.get(Calendar.MINUTE) % 5);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        final long sessionEndTime = cal.getTime().getTime() + fiveMinute;
        return new SessionEndEvent(sessionEndTime);

    }

}
