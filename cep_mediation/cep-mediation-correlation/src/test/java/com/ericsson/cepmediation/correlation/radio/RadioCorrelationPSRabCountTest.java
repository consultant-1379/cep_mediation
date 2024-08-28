/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.radio;

import static com.ericsson.cepmediation.test.common.TestConstants.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.ericsson.cepmediation.correlation.enrichment.SessionEndEvent;
import com.ericsson.cepmediation.test.common.GpehEventType;

/**
 * @author eemecoy
 *
 */
public class RadioCorrelationPSRabCountTest extends RadioCorrelationBase {

    @Before
    public void setup() throws Exception {
        configure("esper/rc.epl");
        rncId = 1;
        rncModuleId = 1;
        ueContext = 1;
        cellId = 1;
    }

    @Test
    public void testPSRabCountRabEventsBeforeIMSIEvent() {
        long startTime = 0;
        sendRadioEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTime);
        sendRabEvent(startTime + 1);
        sendIMSIEvent(startTime + 2);
        //tracePartialWindow();
        sendRabEvent(startTime + 3);
        sendRabEvent(startTime + 4);
        long endTime = startTime + FIVE_MINUTE;
        flush(endTime);
        GPEH_SESSION session = getSingleGpehSessionCreated();
        assertThat(session.getPS_RAB_ESTABLISH_CNT(), is((short) 3));
        assertThat(session.getPS_RAB_ACTIVITY_END_TIME(), is(endTime));

    }

    private void tracePartialWindow() {
        List<? extends Object> elementsInWindow = getElementsInWindow("partial");
        for (Object object : elementsInWindow) {
            System.out.println(object);
        }
    }

    @Test
    public void testPSRabCount() {
        long startTime = 0;
        long sessionEnd = startTime + FIVE_MINUTE;
        sendRadioEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTime);
        sendIMSIEvent(startTime + 1);
        sendRabEvent(startTime + 2);
        sendRabEvent(startTime + 3);
        flush(sessionEnd);
        GPEH_SESSION session = getSingleGpehSessionCreated();
        assertThat(session.getPS_RAB_ESTABLISH_CNT(), is((short) 2));
        assertThat(session.getRAB_ACTIVITY_ON(), is(true));
        assertThat(session.getPS_RAB_ACTIVITY_END_TIME(), is(sessionEnd));
    }

    private void flush(long timestamp) {
        correlationEngine.sendEvent(new SessionEndEvent(timestamp));
    }

    private void sendRabEvent(long timestamp) {
        final short sourceConf = 1;
        final short targetConf = 25;
        correlationEngine.sendEvent(createRabEventsWithParams(cellId, timestamp, rncId, rncModuleId, ueContext, sourceConf, targetConf));
    }

    private void sendIMSIEvent(long timestamp) {
        correlationEngine.sendEvent(createImsiEventsWithParams(cellId, timestamp, rncId, rncModuleId, ueContext, IMSI));
    }

    private void sendRadioEvent(GpehEventType eventType, long timestamp) {
        correlationEngine.sendEvent(createRadioEventsWithParams(eventType, cellId, timestamp, rncId, rncModuleId, ueContext));
    }

}
