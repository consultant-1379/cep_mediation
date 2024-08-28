/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.radio.utils;

import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.ericsson.cepmediation.correlation.stubs.StubbedEsperService;
import com.ericsson.cepmediation.test.common.GpehEventType;
import com.ericsson.cepmediation.test.common.RadioUser;
import com.ericsson.cepmediation.test.util.tracer.EventTracer;

/**
 * @author eemecoy
 *
 */
public class SessionCreator {

    public static void createSession(StubbedEsperService correlationEngine, RadioUser radioUser, long startTime, int cellId, short rncId, GpehEventType... gpehEventTypes) {
        long timestamp = startTime;
        for (GpehEventType gpehEventType : gpehEventTypes) {
            sendEvent(correlationEngine, gpehEventType, timestamp, radioUser, cellId, rncId);
            timestamp++;
        }
    }

    /**
     * More intelligent method - for example will populate IMSI for an INTERNAL_IMSI event
     * @param correlationEngine 
     * @param cellId 
     * @param rncId 
     */
    public static void sendEvent(StubbedEsperService correlationEngine, GpehEventType gpehEventType, long timestamp, RadioUser radioUser, int cellId, short rncId) {
        switch (gpehEventType) {
        case INTERNAL_IMSI:
            sendIMSIEvent(correlationEngine, radioUser, timestamp, cellId, rncId);
            break;
        case INTERNAL_RAB_ESTABLISHMENT:
            sendRabEvent(correlationEngine, radioUser, timestamp, cellId, rncId);
            break;
        default:
            sendBasicRadioEvent(correlationEngine, gpehEventType, timestamp, radioUser, cellId, rncId);
            break;
        }
    }

    private static void sendBasicRadioEvent(StubbedEsperService correlationEngine, GpehEventType eventType, long timestamp, RadioUser radioUser, int cellId, short rncId) {
        GpehBase event = EventCreator.createRadioEventsWithParams(eventType, cellId, timestamp, rncId, radioUser.getRncModuleIdForUser(), radioUser.getUeContextForUser());
        sendEvent(correlationEngine, event);
    }

    private static void sendIMSIEvent(StubbedEsperService correlationEngine, RadioUser radioUser, long timestamp, int cellId, short rncId) {
        sendEvent(correlationEngine, EventCreator.createImsiEventsWithParams(cellId, timestamp, rncId, radioUser.getRncModuleIdForUser(), radioUser.getUeContextForUser(), radioUser.getImsi()));
    }

    private static void sendRabEvent(StubbedEsperService correlationEngine, RadioUser radioUser, long timestamp, int cellId, short rncId) {
        final short sourceConf = 1;
        final short targetConf = 25;
        sendEvent(correlationEngine, EventCreator.createRabEventsWithParams(cellId, timestamp, rncId, radioUser.getRncModuleIdForUser(), radioUser.getUeContextForUser(), sourceConf, targetConf));
    }

    private static void sendEvent(StubbedEsperService correlationEngine, GpehBase event) {
        EventTracer.traceEvent(event);
        correlationEngine.sendEvent(event);
    }

    public static void createBasicSession(StubbedEsperService correlationEngine, RadioUser radioUser, long startTime, int cellId, short rncId) {
        boolean includeRRCConnectionReleaseEvent = true;
        boolean includeIMSIEvent = true;
        createSession(correlationEngine, radioUser, startTime, includeRRCConnectionReleaseEvent, includeIMSIEvent, cellId, rncId);
    }

    public static void createSession(StubbedEsperService correlationEngine, RadioUser radioUser, long startTime, boolean includeRRCConnectionReleaseEvent, boolean includeIMSIEvent, int cellId,
            short rncId) {
        sendBasicRadioEvent(correlationEngine, GpehEventType.RRC_RRC_CONNECTION_SETUP, startTime, radioUser, cellId, rncId);

        if (includeIMSIEvent) {
            sendIMSIEvent(correlationEngine, radioUser, startTime + 1, cellId, rncId);

        }
        sendRabEvent(correlationEngine, radioUser, startTime + 2, cellId, rncId);

        if (includeRRCConnectionReleaseEvent) {
            sendBasicRadioEvent(correlationEngine, GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, startTime + 3, radioUser, cellId, rncId);
        }
    }

    public static void createSessionWithoutReleaseEvent(StubbedEsperService correlationEngine, RadioUser radioUser, long timestamp, int cellId, short rncId) {
        boolean includeRRCConnectionReleaseEvent = false;
        boolean includeIMSIEvent = true;
        createSession(correlationEngine, radioUser, timestamp, includeRRCConnectionReleaseEvent, includeIMSIEvent, cellId, rncId);
    }
}
