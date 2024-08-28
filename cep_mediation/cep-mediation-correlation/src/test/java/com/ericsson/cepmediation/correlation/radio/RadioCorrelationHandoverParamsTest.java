/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.radio;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_IFHO_EXECUTION_ACTIVE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_OUT_HARD_HANDOVER_FAILURE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_RAB_ESTABLISHMENT;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SOFT_HANDOVER_EXECUTION;
import com.ericsson.cepmediation.correlation.enrichment.SessionEndEvent;
import com.ericsson.cepmediation.test.common.GpehEventType;

/**
 * 
 * Tests the following counters:
 * 
 * HS_CELL_CHANGE_ERR_CNT
 * HS_CELL_CHANGE_SUC_CNT
 * HS_NO_SELECTION_CNT
 * IRAT_EXEC_ERR_CNT
 * IFHO_EXEC_SUC_CNT
 * IFHO_EXEC_ERR_CNT
 * SOHO_EXEC_SUC_CNT
 * SOHO_EXEC_ERR_CNT
 * 
 * @author emicned
 *
 */

public class RadioCorrelationHandoverParamsTest extends RadioCorrelationBase {
    private long sessionStart;

    @Before
    public void setup() throws Exception {
        rncId = 1;
        rncModuleId = 1;
        ueContext = 1;
        cellId = 1;
        configure("esper/rc.epl");
        final Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MINUTE, 0);
        sessionStart = cal.getTimeInMillis();
    }

    @Test
    public void shouldInitHandoverCountersWithZero() {
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, sessionStart + 1, ueContext);
        sendEvent(GpehEventType.INTERNAL_IMSI, sessionStart + 2, ueContext);
        sendRabEstEvent(sessionStart + 5);
        flush();

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertTrue(sessions.size() == 1);

        final GPEH_SESSION sess = sessions.get(0);
        assertEquals(0, sess.getHS_CELL_CHANGE_ERR_CNT());
        assertEquals(0, sess.getHS_CELL_CHANGE_SUC_CNT());
        assertEquals(0, sess.getHS_NO_SELECTION_CNT());
        assertEquals(0, sess.getIRAT_EXEC_ERR_CNT());
        assertEquals(0, sess.getIFHO_EXEC_SUC_CNT());
        assertEquals(0, sess.getIFHO_EXEC_ERR_CNT());
        assertEquals(0, sess.getSOHO_EXEC_SUC_CNT());
        assertEquals(0, sess.getSOHO_EXEC_ERR_CNT());
    }

    @Test
    public void shouldIncrementHandoverCounters() {
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, sessionStart + 1, ueContext);
        sendEvent(GpehEventType.INTERNAL_IMSI, sessionStart + 2, ueContext);
        sendRabEstEvent(sessionStart + 5);

        sendEvent(GpehEventType.INTERNAL_FAILED_HSDSCH_CELL_CHANGE, sessionStart + 10, ueContext);
        sendEvent(GpehEventType.INTERNAL_FAILED_HSDSCH_CELL_CHANGE, sessionStart + 20, ueContext);

        sendEvent(GpehEventType.INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE, sessionStart + 30, ueContext);
        sendEvent(GpehEventType.INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE, sessionStart + 40, ueContext);
        sendEvent(GpehEventType.INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE, sessionStart + 50, ueContext);

        sendEvent(GpehEventType.INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED, sessionStart + 60, ueContext);
        sendEvent(GpehEventType.INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED, sessionStart + 70, ueContext);
        sendEvent(GpehEventType.INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED, sessionStart + 80, ueContext);
        sendEvent(GpehEventType.INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED, sessionStart + 90, ueContext);

        final INTERNAL_OUT_HARD_HANDOVER_FAILURE iohhf = (INTERNAL_OUT_HARD_HANDOVER_FAILURE) createRadioEventsWithParams(GpehEventType.INTERNAL_OUT_HARD_HANDOVER_FAILURE, cellId, 150, rncId,
                rncModuleId, ueContext);
        iohhf.setPROCEDURE_INDICATOR((byte) 7);
        correlationEngine.sendEvent(iohhf);
        correlationEngine.sendEvent(iohhf);
        correlationEngine.sendEvent(iohhf);
        iohhf.setPROCEDURE_INDICATOR((byte) 12);
        correlationEngine.sendEvent(iohhf);
        correlationEngine.sendEvent(iohhf);
        correlationEngine.sendEvent(iohhf);
        iohhf.setPROCEDURE_INDICATOR((byte) 5);
        correlationEngine.sendEvent(iohhf);
        correlationEngine.sendEvent(iohhf);

        final INTERNAL_IFHO_EXECUTION_ACTIVE iiea = (INTERNAL_IFHO_EXECUTION_ACTIVE) createRadioEventsWithParams(GpehEventType.INTERNAL_IFHO_EXECUTION_ACTIVE, cellId, 160, rncId, rncModuleId,
                ueContext);
        iiea.setRESULT((byte) 1);
        correlationEngine.sendEvent(iiea);
        correlationEngine.sendEvent(iiea);
        correlationEngine.sendEvent(iiea);
        correlationEngine.sendEvent(iiea);
        correlationEngine.sendEvent(iiea);
        correlationEngine.sendEvent(iiea);

        iiea.setRESULT((byte) 0);
        correlationEngine.sendEvent(iiea);
        correlationEngine.sendEvent(iiea);
        correlationEngine.sendEvent(iiea);
        correlationEngine.sendEvent(iiea);
        correlationEngine.sendEvent(iiea);
        correlationEngine.sendEvent(iiea);
        correlationEngine.sendEvent(iiea);

        final INTERNAL_SOFT_HANDOVER_EXECUTION ishe = (INTERNAL_SOFT_HANDOVER_EXECUTION) createRadioEventsWithParams(GpehEventType.INTERNAL_SOFT_HANDOVER_EXECUTION, cellId, 170, rncId, rncModuleId,
                ueContext);
        ishe.setRESULT((byte) 1);
        correlationEngine.sendEvent(ishe);
        correlationEngine.sendEvent(ishe);
        correlationEngine.sendEvent(ishe);
        correlationEngine.sendEvent(ishe);
        correlationEngine.sendEvent(ishe);
        correlationEngine.sendEvent(ishe);
        correlationEngine.sendEvent(ishe);
        correlationEngine.sendEvent(ishe);

        ishe.setRESULT((byte) 0);
        correlationEngine.sendEvent(ishe);
        correlationEngine.sendEvent(ishe);
        correlationEngine.sendEvent(ishe);
        correlationEngine.sendEvent(ishe);
        correlationEngine.sendEvent(ishe);
        correlationEngine.sendEvent(ishe);
        correlationEngine.sendEvent(ishe);
        correlationEngine.sendEvent(ishe);
        correlationEngine.sendEvent(ishe);
        flush();

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertTrue(sessions.size() == 1);

        final GPEH_SESSION sess = sessions.get(0);
        assertEquals(2, sess.getHS_CELL_CHANGE_ERR_CNT());
        assertEquals(3, sess.getHS_CELL_CHANGE_SUC_CNT());
        assertEquals(4, sess.getHS_NO_SELECTION_CNT());
        assertEquals(6, sess.getIRAT_EXEC_ERR_CNT());
        assertEquals(6, sess.getIFHO_EXEC_ERR_CNT());
        assertEquals(7, sess.getIFHO_EXEC_SUC_CNT());
        assertEquals(8, sess.getSOHO_EXEC_ERR_CNT());
        assertEquals(9, sess.getSOHO_EXEC_SUC_CNT());
    }

    @Test
    public void shouldIncrementHandoverCounters2RrcConnections() {

        final int cellId1 = 1;
        final String imsi1 = "454061111111111";
        final short sourceConf = 1;
        final short targetConf = 25;
        final long timeStamp = 1;
        final int numHsCellChangeFailure = 2;
        final int numHsCellChangeSuccess = 3;
        final int numNoCellSelected = 4;
        final int numIfhoFailure = 6;
        final int numIfhoSuccess = 7;
        final int numSohoFailure = 8;
        final int numSohoSuccess = 9;

        final short ueContext2 = 2;

        setUpRrcRabSession(cellId1, imsi1, timeStamp, sourceConf, targetConf, ueContext, rncModuleId);

        sendMultipleEvents(GpehEventType.INTERNAL_FAILED_HSDSCH_CELL_CHANGE, sessionStart + 500, ueContext, numHsCellChangeFailure);
        sendMultipleEvents(GpehEventType.INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE, sessionStart + 600, ueContext, numHsCellChangeSuccess);
        sendMultipleEvents(GpehEventType.INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED, sessionStart + 700, ueContext, numNoCellSelected);

        final INTERNAL_OUT_HARD_HANDOVER_FAILURE iohhf = (INTERNAL_OUT_HARD_HANDOVER_FAILURE) createRadioEventsWithParams(GpehEventType.INTERNAL_OUT_HARD_HANDOVER_FAILURE, cellId, sessionStart + 800,
                rncId, rncModuleId, ueContext);
        iohhf.setPROCEDURE_INDICATOR((byte) 7);
        correlationEngine.sendEvent(iohhf);
        correlationEngine.sendEvent(iohhf);
        correlationEngine.sendEvent(iohhf);
        iohhf.setPROCEDURE_INDICATOR((byte) 12);
        correlationEngine.sendEvent(iohhf);
        correlationEngine.sendEvent(iohhf);
        correlationEngine.sendEvent(iohhf);
        iohhf.setPROCEDURE_INDICATOR((byte) 5);
        correlationEngine.sendEvent(iohhf);
        correlationEngine.sendEvent(iohhf);

        final INTERNAL_IFHO_EXECUTION_ACTIVE iiea = (INTERNAL_IFHO_EXECUTION_ACTIVE) createRadioEventsWithParams(GpehEventType.INTERNAL_IFHO_EXECUTION_ACTIVE, cellId, sessionStart + 900, rncId,
                rncModuleId, ueContext);
        iiea.setRESULT((byte) 1);
        sendMultipleEvents(iiea, numIfhoFailure);

        iiea.setRESULT((byte) 0);
        sendMultipleEvents(iiea, numIfhoSuccess);

        final INTERNAL_SOFT_HANDOVER_EXECUTION ishe = (INTERNAL_SOFT_HANDOVER_EXECUTION) createRadioEventsWithParams(GpehEventType.INTERNAL_SOFT_HANDOVER_EXECUTION, cellId, sessionStart + 1000,
                rncId, rncModuleId, ueContext);
        ishe.setRESULT((byte) 1);
        sendMultipleEvents(ishe, numSohoFailure);

        ishe.setRESULT((byte) 0);
        sendMultipleEvents(ishe, numSohoSuccess);

        closeRrcSession(cellId1, sessionStart + 1100, ueContext, rncModuleId);

        setUpRrcRabSession(cellId1, imsi1, timeStamp + 1200, sourceConf, targetConf, ueContext2, rncModuleId);
        sendEvent(GpehEventType.INTERNAL_FAILED_HSDSCH_CELL_CHANGE, sessionStart + 1300, ueContext2);
        sendEvent(GpehEventType.INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE, sessionStart + 1400, ueContext2);
        sendEvent(GpehEventType.INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED, sessionStart + 1600, ueContext2);

        final INTERNAL_OUT_HARD_HANDOVER_FAILURE iohhf2 = (INTERNAL_OUT_HARD_HANDOVER_FAILURE) createRadioEventsWithParams(GpehEventType.INTERNAL_OUT_HARD_HANDOVER_FAILURE, cellId,
                sessionStart + 800, rncId, rncModuleId, ueContext2);
        iohhf2.setPROCEDURE_INDICATOR((byte) 7);
        correlationEngine.sendEvent(iohhf2);
        iohhf2.setPROCEDURE_INDICATOR((byte) 12);
        correlationEngine.sendEvent(iohhf2);
        iohhf2.setPROCEDURE_INDICATOR((byte) 5);
        correlationEngine.sendEvent(iohhf2);

        final INTERNAL_IFHO_EXECUTION_ACTIVE iiea2 = (INTERNAL_IFHO_EXECUTION_ACTIVE) createRadioEventsWithParams(GpehEventType.INTERNAL_IFHO_EXECUTION_ACTIVE, cellId, sessionStart + 900, rncId,
                rncModuleId, ueContext2);
        iiea2.setRESULT((byte) 1);
        correlationEngine.sendEvent(iiea2);
        iiea2.setRESULT((byte) 0);
        correlationEngine.sendEvent(iiea2);

        final INTERNAL_SOFT_HANDOVER_EXECUTION ishe2 = (INTERNAL_SOFT_HANDOVER_EXECUTION) createRadioEventsWithParams(GpehEventType.INTERNAL_SOFT_HANDOVER_EXECUTION, cellId, sessionStart + 1000,
                rncId, rncModuleId, ueContext2);
        ishe2.setRESULT((byte) 1);
        correlationEngine.sendEvent(ishe2);
        ishe2.setRESULT((byte) 0);
        correlationEngine.sendEvent(ishe2);

        flush();

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertTrue(sessions.size() == 1);

        final GPEH_SESSION sess = sessions.get(0);
        assertThat(sess.getHS_CELL_CHANGE_ERR_CNT(), is(numHsCellChangeFailure + 1));
        assertThat(sess.getHS_CELL_CHANGE_SUC_CNT(), is(numHsCellChangeSuccess + 1));
        assertThat(sess.getHS_NO_SELECTION_CNT(), is(numNoCellSelected + 1));
        assertThat(sess.getIRAT_EXEC_ERR_CNT(), is(6 + 2));
        assertThat(sess.getIFHO_EXEC_ERR_CNT(), is(numIfhoFailure + 1));
        assertThat(sess.getIFHO_EXEC_SUC_CNT(), is(numIfhoSuccess + 1));
        assertThat(sess.getSOHO_EXEC_ERR_CNT(), is(numSohoFailure + 1));
        assertThat(sess.getSOHO_EXEC_SUC_CNT(), is(numSohoSuccess + 1));
    }

    private void flush() {
        // this last event will send the session to the update listener
        correlationEngine.sendEvent(new SessionEndEvent());
    }

    private void sendRabEstEvent(final long increment) {
        final INTERNAL_RAB_ESTABLISHMENT ire = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT, cellId, increment, rncId, rncModuleId, ueContext);
        ire.setTARGET_CONF((byte) 4);
        correlationEngine.sendEvent(ire);
    }

    private void sendEvent(final GpehEventType eventType, final long startTime, final short ueContext) {
        correlationEngine.sendEvent(createRadioEventsWithParams(eventType, cellId, startTime, rncId, rncModuleId, ueContext));
    }

    private void setUpRrcRabSession(final int cellId, final String imsi, final long timestamp, final short sourceConf, final short targetConf, final short ueContext, final byte rncModuleId) {
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timestamp, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createImsiEventsWithParams(cellId, timestamp + 100, rncId, rncModuleId, ueContext, imsi));
        correlationEngine.sendEvent(createRabEventsWithParams(cellId, timestamp + 200, rncId, rncModuleId, ueContext, sourceConf, targetConf));
    }

    private void closeRrcSession(final int cellId, final long timeStamp, final short ueContext, final byte rncModuleId) {
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, cellId, timeStamp, rncId, rncModuleId, ueContext));

    }

    private void sendMultipleEvents(final GpehEventType eventType, final long startTime, final short ueContext, final int numEvents) {
        for (int i = 0; i < numEvents; i++) {
            sendEvent(eventType, startTime, ueContext);
        }
    }

    private void sendMultipleEvents(final GpehBase event, final int numEvents) {
        for (int i = 0; i < numEvents; i++) {
            correlationEngine.sendEvent(event);
        }
    }
}
