/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.radio.measreport;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_RAB_ESTABLISHMENT;
import com.ericsson.cepmediation.apeventbeans.gpeh.RRC_MEASUREMENT_REPORT;
import com.ericsson.cepmediation.base.apeventbeans.Asn1Message;
import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;
import com.ericsson.cepmediation.base.util.constants.MeasReportAttributes;
import com.ericsson.cepmediation.correlation.enrichment.SessionEndEvent;
import com.ericsson.cepmediation.correlation.radio.RadioCorrelationBase;
import com.ericsson.cepmediation.correlation.support.MeasurementCategory;
import com.ericsson.cepmediation.loading.asn1.EVENT_TYPE;
import com.ericsson.cepmediation.test.common.GpehEventType;
import com.ericsson.cepmediation.test.common.RadioUser;
import com.ericsson.cepmediation.test.tools.calculators.AverageEcnoRscpCalculator;
import com.ericsson.cepmediation.test.topology.ServingCellsForTest;
import com.ericsson.cepmediation.test.util.tracer.SessionTracer;

/**
 * @author eemecoy
 *
 */
public class RadioCorrelationMeasReportParamsTest extends RadioCorrelationBase {

    private static final int ECNO_UNDER_ECNO_THRESHOLD = -15;

    private final List<Integer> ecnoCounter = new ArrayList<Integer>();

    private final int ECNO_OVER_ECNO_THRESHOLD = 44;

    private final List<Integer> rscpCounter = new ArrayList<Integer>();

    private RadioUser radioUser1;

    private RadioUser radioUser2;

    @Before
    public void setup() throws Exception {
        configure("esper/rc.epl");
        rncId = ServingCellsForTest.RNC_FOR_SERVING_CELL;
        cellId = ServingCellsForTest.CELL_FOR_SERVING_CELL;
        ecnoCounter.clear();
        rscpCounter.clear();
        setupRadioUsers();
    }

    private void setupRadioUsers() {
        radioUser1 = new RadioUser();
        radioUser1.setUeContextForUser((short) 1);
        radioUser1.setRncModuleIdForUser((byte) 1);
        radioUser1.setImsi(454061234);

        radioUser2 = new RadioUser();
        radioUser2.setUeContextForUser((short) 2);
        radioUser2.setRncModuleIdForUser((byte) 2);
        radioUser2.setImsi(454065345);
    }

    @Test
    public void testAverageEcnoIsDefaultFloatIfNoEcnoSamples() {
        final long startTime = System.currentTimeMillis();
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTime, radioUser1);
        sendEvent(GpehEventType.INTERNAL_IMSI, startTime + 1, radioUser1);

        sendRABEstablishmentEvent(startTime + 2, radioUser1);

        final RRC_MEASUREMENT_REPORT parent1 = createParentRRCMeasReportEvent(startTime + 3, radioUser1);
        addChildToParent(parent1, createAsn1Message(Integer.MIN_VALUE, Integer.MIN_VALUE));
        sendRRCMeasurementReportEventAndItsChildren(parent1);

        sendEvent(GpehEventType.RRC_UPLINK_DIRECT_TRANSFER, startTime + 7, radioUser1);
        sendEvent(GpehEventType.INTERNAL_SOFT_HANDOVER_EXECUTION, startTime + 9, radioUser1);
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, startTime + 10, radioUser1);
        correlationEngine.sendEvent(new SessionEndEvent(startTime + FIVE_MINUTE));

        final GPEH_SESSION gpehSession = getSingleGpehSessionCreated();

        verifyNoSamplesRecorded(gpehSession);
        assertThat(gpehSession.getRRC_MEAS_REP_SAMPLES(), is(1));

        verifyEcnoAverageNotSet(gpehSession);
        verifyRscpAverageNotSet(gpehSession);
        assertThat(gpehSession.getEVENT_CNT(), is(5));
        assertThat(gpehSession.getEND_RNC(), is((short) ServingCellsForTest.RNC_FOR_SERVING_CELL));
    }

    private void verifyRscpAverageNotSet(final GPEH_SESSION gpehSession) {
        assertThat(gpehSession.getRSCP_AVG(), is(DefaultValues.DEFAULT_INT_VALUE));
    }

    private void verifyEcnoAverageNotSet(final GPEH_SESSION gpehSession) {
        assertThat(gpehSession.getECNO_AVG(), is(DefaultValues.DEFAULT_FLOAT_VALUE));
    }

    @Test
    public void checkRRCAttributesWhen2RRCConnectionsWithinSession() {

        final int cellId1 = 1;
        final String imsi1 = "454061111111111";
        final short sourceConf = 1;
        final short targetConf = 25;
        final long timeStamp = 1;

        setUpRrcRabSession(cellId1, imsi1, timeStamp, sourceConf, targetConf, radioUser1);
        createAndSendRRCMeasReport(timeStamp, radioUser1, MeasurementCategory.GCGS);
        createAndSendRRCMeasReport(timeStamp, radioUser1, MeasurementCategory.GCGS);
        createAndSendRRCMeasReport(timeStamp, radioUser1, MeasurementCategory.GCBS);
        final long sessionStart = System.currentTimeMillis();
        closeRrcSession(cellId1, sessionStart + 1100, radioUser1);

        setUpRrcRabSession(cellId1, imsi1, timeStamp + 1200, sourceConf, targetConf, radioUser2);
        createAndSendRRCMeasReport(timeStamp, radioUser2, MeasurementCategory.GCGS);
        createAndSendRRCMeasReport(timeStamp, radioUser2, MeasurementCategory.GCGS);
        createAndSendRRCMeasReport(timeStamp, radioUser2, MeasurementCategory.GCBS);
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp + FIVE_MINUTE));

        final GPEH_SESSION session = getSingleGpehSessionCreated();
        assertThat(session.getRRC_MEAS_REP_SAMPLES(), is(6));
        assertThat(session.getRRC_SAMPLES_GC_GS(), is(4));
        assertThat(session.getRRC_SAMPLES_GC_BS(), is(2));
        assertThat(session.getRRC_SAMPLES_BC_GS(), is(0));
        assertThat(session.getRRC_SAMPLES_BC_BS(), is(0));
        checkEcnoAverage(session);
        checkRscpAverage(session);

    }

    private void setUpRrcRabSession(final int cellId, final String imsi, final long timestamp, final short sourceConf, final short targetConf,
            final RadioUser radioUser) {
        sendEventToEsper(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timestamp, rncId, radioUser.getRncModuleIdForUser(),
                radioUser.getUeContextForUser()));
        sendEventToEsper(createImsiEventsWithParams(cellId, timestamp + 100, rncId, radioUser.getRncModuleIdForUser(), radioUser.getUeContextForUser(), imsi));
        sendEventToEsper(createRabEventsWithParams(cellId, timestamp + 200, rncId, radioUser.getRncModuleIdForUser(), radioUser.getUeContextForUser(),
                sourceConf, targetConf));
    }

    private void closeRrcSession(final int cellIdForUser, final long timeStamp, final RadioUser radioUser) {
        sendEventToEsper(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, cellIdForUser, timeStamp, rncId,
                radioUser.getRncModuleIdForUser(), radioUser.getUeContextForUser()));

    }

    @Test
    public void testWhenNoRRCMeasurementsInSession() {
        final long startTime = System.currentTimeMillis();
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTime, radioUser1);
        sendEvent(GpehEventType.INTERNAL_IMSI, startTime + 1, radioUser1);

        sendRABEstablishmentEvent(startTime + 2, radioUser1);

        sendEvent(GpehEventType.RRC_UPLINK_DIRECT_TRANSFER, startTime + 7, radioUser1);
        sendEvent(GpehEventType.INTERNAL_SOFT_HANDOVER_EXECUTION, startTime + 9, radioUser1);
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, startTime + 10, radioUser1);
        correlationEngine.sendEvent(new SessionEndEvent(startTime + FIVE_MINUTE));

        final GPEH_SESSION gpehSession = getSingleGpehSessionCreated();

        verifyNoSamplesRecorded(gpehSession);
        assertThat(gpehSession.getRRC_MEAS_REP_SAMPLES(), is(0));

        verifyEcnoAverageNotSet(gpehSession);
        verifyRscpAverageNotSet(gpehSession);

        assertThat(gpehSession.getEVENT_CNT(), is(4));
        assertThat(gpehSession.getEND_RNC(), is((short) ServingCellsForTest.RNC_FOR_SERVING_CELL));

    }

    @Test
    public void testAllRRCMeasParametersResetForCarryOverEvent() {

        final long timestamp1 = System.currentTimeMillis();
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, timestamp1, radioUser1);
        sendEvent(GpehEventType.INTERNAL_IMSI, timestamp1 + 1, radioUser1);
        sendRABEstablishmentEvent(timestamp1 + 2, radioUser1);
        createAndSendRRCMeasReport(timestamp1, radioUser1, MeasurementCategory.GCBS);
        correlationEngine.sendEvent(new SessionEndEvent(timestamp1 + FIVE_MINUTE));

        final long timestamp2 = timestamp1 + FIVE_MINUTE;
        sendEvent(GpehEventType.INTERNAL_CHANNEL_SWITCHING, timestamp2, radioUser1);
        correlationEngine.sendEvent(new SessionEndEvent(timestamp2 + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(2));
        checkRRCMeasParametersEmptyForSession(getCarriedOverSession(sessions));
        checkRRCMeasParametersSetForFinalSession(getFinalSession(sessions));
    }

    private void checkRRCMeasParametersSetForFinalSession(final GPEH_SESSION session) {
        assertThat(session.getRRC_MEAS_REP_SAMPLES(), is(1));
        assertThat(session.getRRC_SAMPLES_GC_GS(), is(0));
        assertThat(session.getRRC_SAMPLES_GC_BS(), is(1));
        assertThat(session.getRRC_SAMPLES_BC_GS(), is(0));
        assertThat(session.getRRC_SAMPLES_BC_BS(), is(0));
        assertThat(session.getECNO_AVG(), is(AverageEcnoRscpCalculator.getExpectedEcnoAvg(ecnoCounter)));
        assertThat(session.getRSCP_AVG(), is(AverageEcnoRscpCalculator.getExpectedRscpAvg(rscpCounter)));

    }

    private GPEH_SESSION getFinalSession(final List<GPEH_SESSION> sessions) {
        for (final GPEH_SESSION session : sessions) {
            if (!session.getCARRIED_OVER()) {
                return session;
            }
        }
        fail("No session marked as final");
        return null;
    }

    private GPEH_SESSION getCarriedOverSession(final List<GPEH_SESSION> sessions) {
        for (final GPEH_SESSION session : sessions) {
            if (session.getCARRIED_OVER()) {
                return session;
            }
        }
        fail("No session marked as carried over");
        return null;
    }

    private void checkRRCMeasParametersEmptyForSession(final GPEH_SESSION session) {
        assertThat(session.getRRC_MEAS_REP_SAMPLES(), is(0));
        verifyNoSamplesRecorded(session);
        verifyEcnoAverageNotSet(session);
        verifyRscpAverageNotSet(session);
    }

    @Test
    public void testEcnoAndRscpAverageWhenNoEcnoOrRscpSet() {
        final long startTime = System.currentTimeMillis();

        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTime, radioUser1);
        sendEvent(GpehEventType.INTERNAL_IMSI, startTime + 1, radioUser1);

        sendRABEstablishmentEvent(startTime + 2, radioUser1);

        final RRC_MEASUREMENT_REPORT parent = createParentRRCMeasReportEvent(startTime + 3, radioUser1);
        addChildToParent(parent, createAsn1Message(Integer.MIN_VALUE, Integer.MIN_VALUE));
        sendRRCMeasurementReportEventAndItsChildren(parent);

        sendEvent(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, startTime + 10, radioUser1);
        correlationEngine.sendEvent(new SessionEndEvent(startTime + FIVE_MINUTE));

        final GPEH_SESSION gpehSession = getSingleGpehSessionCreated();

        verifyNoSamplesRecorded(gpehSession);
        assertThat(gpehSession.getRRC_MEAS_REP_SAMPLES(), is(1));
        verifyEcnoAverageNotSet(gpehSession);
        verifyRscpAverageNotSet(gpehSession);
        assertThat(gpehSession.getEVENT_CNT(), is(4));
        assertThat(gpehSession.getEND_RNC(), is((short) ServingCellsForTest.RNC_FOR_SERVING_CELL));

    }

    @Test
    public void testRRCMeasurementReportParametersNotSetIfEcnoOrRscpNotSet() {
        final long startTime = System.currentTimeMillis();
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTime, radioUser1);
        sendEvent(GpehEventType.INTERNAL_IMSI, startTime + 1, radioUser1);

        sendRABEstablishmentEvent(startTime + 2, radioUser1);

        final RRC_MEASUREMENT_REPORT parent1 = createParentRRCMeasReportEvent(startTime + 3, radioUser1);
        addChildToParent(parent1, createAsn1Message(Integer.MIN_VALUE, 4));
        sendRRCMeasurementReportEventAndItsChildren(parent1);

        final RRC_MEASUREMENT_REPORT parent2 = createParentRRCMeasReportEvent(startTime + 3, radioUser1);
        addChildToParent(parent2, createAsn1Message(5, Integer.MIN_VALUE));
        sendRRCMeasurementReportEventAndItsChildren(parent2);

        final RRC_MEASUREMENT_REPORT parent3 = createParentRRCMeasReportEvent(startTime + 3, radioUser1);
        addChildToParent(parent3, createAsn1Message(Integer.MIN_VALUE, Integer.MIN_VALUE));
        sendRRCMeasurementReportEventAndItsChildren(parent3);

        sendEvent(GpehEventType.RRC_UPLINK_DIRECT_TRANSFER, startTime + 7, radioUser1);
        sendEvent(GpehEventType.INTERNAL_SOFT_HANDOVER_EXECUTION, startTime + 9, radioUser1);
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, startTime + 10, radioUser1);
        correlationEngine.sendEvent(new SessionEndEvent(startTime + FIVE_MINUTE));

        final GPEH_SESSION gpehSession = getSingleGpehSessionCreated();

        verifyNoSamplesRecorded(gpehSession);
        assertThat(gpehSession.getRRC_MEAS_REP_SAMPLES(), is(3));

        checkEcnoAverage(gpehSession);
        checkRscpAverage(gpehSession);
        assertThat(gpehSession.getEVENT_CNT(), is(7));
        assertThat(gpehSession.getEND_RNC(), is((short) ServingCellsForTest.RNC_FOR_SERVING_CELL));

    }

    private RRC_MEASUREMENT_REPORT createParentRRCMeasReportEvent(final long timestamp, final RadioUser radioUser) {
        return (RRC_MEASUREMENT_REPORT) createEvent(GpehEventType.RRC_MEASUREMENT_REPORT, timestamp, radioUser);
    }

    @Test
    public void testRRCMeasurementReportParametersNotSetIfIncorrectTriggerType() {
        final long startTime = System.currentTimeMillis();
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTime, radioUser1);
        sendEvent(GpehEventType.INTERNAL_IMSI, startTime + 1, radioUser1);

        sendRABEstablishmentEvent(startTime + 2, radioUser1);

        sendRRCMeasurementNotFrequencyMeasurementType(startTime + 4, radioUser1, MeasurementCategory.GCGS);
        sendRRCMeasurementNotFrequencyMeasurementType(startTime + 4, radioUser1, MeasurementCategory.GCBS);
        sendRRCMeasurementNotFrequencyMeasurementType(startTime + 4, radioUser1, MeasurementCategory.BCGS);
        sendRRCMeasurementNotFrequencyMeasurementType(startTime + 4, radioUser1, MeasurementCategory.BCBS);

        sendEvent(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, startTime + 10, radioUser1);
        correlationEngine.sendEvent(new SessionEndEvent(startTime + FIVE_MINUTE));

        final GPEH_SESSION gpehSession = getSingleGpehSessionCreated();

        verifyNoSamplesRecorded(gpehSession);
        assertThat(gpehSession.getRRC_MEAS_REP_SAMPLES(), is(4));
        verifyEcnoAverageNotSet(gpehSession);
        verifyRscpAverageNotSet(gpehSession);

        assertThat(gpehSession.getEVENT_CNT(), is(7));
        assertThat(gpehSession.getEND_RNC(), is((short) ServingCellsForTest.RNC_FOR_SERVING_CELL));

    }

    private void sendRRCMeasurementNotFrequencyMeasurementType(final long timestamp, final RadioUser radioUser, final MeasurementCategory measurementCategory) {
        final GpehBase event = createRadioEventsWithParams(GpehEventType.RRC_MEASUREMENT_REPORT, ServingCellsForTest.CELL_FOR_SERVING_CELL, timestamp,
                (short) ServingCellsForTest.RNC_FOR_SERVING_CELL, radioUser.getRncModuleIdForUser(), radioUser.getUeContextForUser());
        setAsn1MessageList(getRSCP(measurementCategory), getECNO(measurementCategory), EVENT_TYPE.INTER_RAT, ServingCellsForTest.CELL_FOR_SERVING_CELL,
                (RRC_MEASUREMENT_REPORT) event);
        sendEventToEsper(event);
    }

    private void verifyNoSamplesRecorded(final GPEH_SESSION gpehSession) {
        assertThat(gpehSession.getRRC_SAMPLES_GC_GS(), is(0));
        assertThat(gpehSession.getRRC_SAMPLES_GC_BS(), is(0));
        assertThat(gpehSession.getRRC_SAMPLES_BC_GS(), is(0));
        assertThat(gpehSession.getRRC_SAMPLES_BC_BS(), is(0));
    }

    @Test
    public void testRRCMeasurementReportParametersNotSetIfNotServingCell() {
        final long startTime = System.currentTimeMillis();
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTime, radioUser1);
        sendEvent(GpehEventType.INTERNAL_IMSI, startTime + 1, radioUser1);
        sendRABEstablishmentEvent(startTime + 2, radioUser1);
        sendRRCMeasReportEventNotForServingCell(startTime + 4, radioUser1, MeasurementCategory.GCGS);
        sendRRCMeasReportEventNotForServingCell(startTime + 4, radioUser1, MeasurementCategory.GCBS);
        sendRRCMeasReportEventNotForServingCell(startTime + 4, radioUser1, MeasurementCategory.BCGS);
        sendRRCMeasReportEventNotForServingCell(startTime + 4, radioUser1, MeasurementCategory.BCBS);
        sendEvent(GpehEventType.RRC_UPLINK_DIRECT_TRANSFER, startTime + 7, radioUser1);
        sendEvent(GpehEventType.INTERNAL_SOFT_HANDOVER_EXECUTION, startTime + 9, radioUser1);
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, startTime + 10, radioUser1);
        correlationEngine.sendEvent(new SessionEndEvent(startTime + FIVE_MINUTE));

        final GPEH_SESSION gpehSession = getSingleGpehSessionCreated();

        verifyNoSamplesRecorded(gpehSession);
        assertThat(gpehSession.getRRC_MEAS_REP_SAMPLES(), is(4));
        verifyEcnoAverageNotSet(gpehSession);
        verifyRscpAverageNotSet(gpehSession);

        assertThat(gpehSession.getEVENT_CNT(), is(8));

    }

    private void sendRRCMeasReportEventNotForServingCell(final long timestamp, final RadioUser radioUser, final MeasurementCategory measurementCategory) {
        final int cellIdThatsNotServingCell = 123;
        final short rncIdThatsNotServingCell = 12;
        final GpehBase event = createRadioEventsWithParams(GpehEventType.RRC_MEASUREMENT_REPORT, cellIdThatsNotServingCell, timestamp,
                rncIdThatsNotServingCell, radioUser.getRncModuleIdForUser(), radioUser.getUeContextForUser());
        setAsn1MessageList(getRSCP(measurementCategory), getECNO(measurementCategory), EVENT_TYPE.INTER_FREQ, cellIdThatsNotServingCell,
                (RRC_MEASUREMENT_REPORT) event);
        sendEventToEsper(event);
    }

    @Test
    public void testRRCMeasurementReportParametersSetOnGPEHSessionFor2Users() {
        final long startTime = System.currentTimeMillis();
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTime, radioUser1);
        sendEvent(GpehEventType.INTERNAL_IMSI, startTime + 1, radioUser1);

        sendRABEstablishmentEvent(startTime, radioUser1);
        createAndSendRRCMeasReport(startTime, radioUser1, MeasurementCategory.GCGS);

        sendEvent(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, startTime + 10, radioUser1);
        correlationEngine.sendEvent(new SessionEndEvent(startTime + FIVE_MINUTE));

        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTime, radioUser2);
        sendEvent(GpehEventType.INTERNAL_IMSI, startTime + 1, radioUser2);

        sendRABEstablishmentEvent(startTime + 2, radioUser2);

        createAndSendRRCMeasReport(startTime + 4, radioUser2, MeasurementCategory.BCBS);

        sendEvent(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, startTime + 10, radioUser2);
        correlationEngine.sendEvent(new SessionEndEvent(startTime + FIVE_MINUTE));

        final List<GPEH_SESSION> gpehSessions = getEventBeansCreatedByEsper();
        assertThat(gpehSessions.size(), is(2));

        final GPEH_SESSION gpehSessionForUser1 = gpehSessions.get(0);
        assertThat(gpehSessionForUser1.getRRC_MEAS_REP_SAMPLES(), is(1));
        assertThat(gpehSessionForUser1.getRRC_SAMPLES_GC_GS(), is(1));
        assertThat(gpehSessionForUser1.getRRC_SAMPLES_BC_BS(), is(0));
        assertThat(gpehSessionForUser1.getEVENT_CNT(), is(4));

        final GPEH_SESSION gpehSessionForUser2 = gpehSessions.get(1);
        assertThat(gpehSessionForUser2.getRRC_MEAS_REP_SAMPLES(), is(1));
        assertThat(gpehSessionForUser2.getRRC_SAMPLES_GC_GS(), is(0));
        assertThat(gpehSessionForUser2.getRRC_SAMPLES_BC_BS(), is(1));

    }

    private void createAndSendRRCMeasReport(final long startTime, final RadioUser radioUser, final MeasurementCategory measurementCategory) {
        final RRC_MEASUREMENT_REPORT parentEvent = createParentRRCMeasReportEvent(startTime, radioUser);
        addChildToParent(parentEvent, createAsn1Message(measurementCategory));
        sendRRCMeasurementReportEventAndItsChildren(parentEvent);
    }

    private void sendRABEstablishmentEvent(final long startTime, final RadioUser radioUser) {
        final INTERNAL_RAB_ESTABLISHMENT rabEstablishmentEvent = (INTERNAL_RAB_ESTABLISHMENT) createEvent(GpehEventType.INTERNAL_RAB_ESTABLISHMENT, startTime,
                radioUser);
        rabEstablishmentEvent.setTARGET_CONF((short) 4);
        sendEventToEsper(rabEstablishmentEvent);
    }

    private void sendEventToEsper(final GpehBase event) {
        correlationEngine.sendEvent(event);
    }

    @Test
    public void testRRCMeasurementReportParametersSetOnGPEHSessionFor1User() {
        final long startTime = System.currentTimeMillis();
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTime, radioUser1);
        sendEvent(GpehEventType.INTERNAL_IMSI, startTime + 1, radioUser1);

        sendRABEstablishmentEvent(startTime + 2, radioUser1);

        final RRC_MEASUREMENT_REPORT parent1 = createParentRRCMeasReportEvent(startTime + 2, radioUser1);
        addChildToParent(parent1, createAsn1MessageGCGS());
        addChildToParent(parent1, createAsn1MessageWithGCGSOutsideEcnoRange());
        addChildToParent(parent1, createAsn1MessageWithGCGSOutsideRscpRange());
        sendRRCMeasurementReportEventAndItsChildren(parent1);

        final RRC_MEASUREMENT_REPORT parent2 = createParentRRCMeasReportEvent(startTime + 6, radioUser1);
        addChildToParent(parent2, createAsn1MessageGCBS());
        addChildToParent(parent2, createAsn1MessageWithGCBSOutsideEcnoRange());
        sendRRCMeasurementReportEventAndItsChildren(parent2);

        final RRC_MEASUREMENT_REPORT parent3 = createParentRRCMeasReportEvent(startTime + 8, radioUser1);
        addChildToParent(parent3, createAsn1MessageBCGS());
        addChildToParent(parent3, createAsn1MessageBCGS());
        addChildToParent(parent3, createAsn1MessageBCGS());
        addChildToParent(parent3, createAsn1MessageWithBCGSOutsideRscpRange());
        sendRRCMeasurementReportEventAndItsChildren(parent3);

        final RRC_MEASUREMENT_REPORT parent4 = createParentRRCMeasReportEvent(startTime + 9, radioUser1);
        addChildToParent(parent4, createAsn1MessageBCBS());
        sendRRCMeasurementReportEventAndItsChildren(parent4);

        sendEvent(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, startTime + 10, radioUser1);
        correlationEngine.sendEvent(new SessionEndEvent(startTime + FIVE_MINUTE));

        final GPEH_SESSION gpehSession = getSingleGpehSessionCreated();

        SessionTracer.traceSession(gpehSession);
        assertThat(gpehSession.getRRC_MEAS_REP_SAMPLES(), is(4));
        assertThat("Incorrect RRC_SAMPLES_GC_GS", gpehSession.getRRC_SAMPLES_GC_GS(), is(3));
        assertThat(gpehSession.getRRC_SAMPLES_GC_BS(), is(2));
        assertThat(gpehSession.getRRC_SAMPLES_BC_GS(), is(4));
        assertThat(gpehSession.getRRC_SAMPLES_BC_BS(), is(1));

        checkEcnoAverage(gpehSession);
        checkRscpAverage(gpehSession);

        assertThat(gpehSession.getEVENT_CNT(), is(7));
        assertThat(gpehSession.getEND_RNC(), is((short) ServingCellsForTest.RNC_FOR_SERVING_CELL));

    }

    private void sendRRCMeasurementReportEventAndItsChildren(final RRC_MEASUREMENT_REPORT rrcMeasurementEvent) {
        sendEventToEsper(rrcMeasurementEvent);
    }

    private void addChildToParent(final RRC_MEASUREMENT_REPORT parentRRCMeasurementReport, final Asn1Message asn1Message) {
        List<Asn1Message> asn1MessageList = parentRRCMeasurementReport.getAsn1MessageList();
        if (asn1MessageList == null) {
            asn1MessageList = new ArrayList<Asn1Message>();
        }
        asn1MessageList.add(asn1Message);
        parentRRCMeasurementReport.setAsn1MessageList(asn1MessageList);
    }

    private void checkRscpAverage(final GPEH_SESSION gpehSession) {
        assertThat(gpehSession.getRSCP_AVG(), is(AverageEcnoRscpCalculator.getExpectedRscpAvg(rscpCounter)));
    }

    private void checkEcnoAverage(final GPEH_SESSION gpehSession) {
        System.out.println("Number of ecno samples: " + gpehSession.getNUM_VALID_ECNO_SAMPLES());
        System.out.println("Ecno total " + gpehSession.getECNO_TOTAL());
        assertThat(gpehSession.getECNO_AVG(), is(AverageEcnoRscpCalculator.getExpectedEcnoAvg(ecnoCounter)));
    }

    private Asn1Message createAsn1MessageWithGCGSOutsideRscpRange() {
        final int rscpOverRscpRange = 92;
        return createAsn1Message(rscpOverRscpRange, ECNO_OVER_ECNO_THRESHOLD);
    }

    private Asn1Message createAsn1MessageWithBCGSOutsideRscpRange() {
        final int rscpUnderRscpRange = -1;
        return createAsn1Message(rscpUnderRscpRange, ECNO_OVER_ECNO_THRESHOLD);
    }

    private Asn1Message createAsn1MessageBCBS() {
        return createAsn1Message(MeasurementCategory.BCBS);
    }

    private Asn1Message createAsn1Message(final MeasurementCategory measCategory) {
        return createAsn1Message(getRSCP(measCategory), getECNO(measCategory));
    }

    private Asn1Message createAsn1MessageBCGS() {
        return createAsn1Message(MeasurementCategory.BCGS);
    }

    private Asn1Message createAsn1MessageGCBS() {
        return createAsn1Message(MeasurementCategory.GCBS);
    }

    private Asn1Message createAsn1MessageWithGCBSOutsideEcnoRange() {
        final int rscpOverRSCPThreshold = 84;
        final int ecnoUnderECNORange = -1;
        return createAsn1Message(rscpOverRSCPThreshold, ecnoUnderECNORange);
    }

    private Asn1Message createAsn1MessageGCGS() {
        return createAsn1Message(MeasurementCategory.GCGS);
    }

    private int getECNO(final MeasurementCategory measurementCategory) {
        switch (measurementCategory) {
        case GCGS:
            return ECNO_OVER_ECNO_THRESHOLD;
        case GCBS:
            return ECNO_UNDER_ECNO_THRESHOLD;
        case BCGS:
            return ECNO_OVER_ECNO_THRESHOLD;
        case BCBS:
            return ECNO_UNDER_ECNO_THRESHOLD;
        default:
            break;
        }
        return -1;
    }

    private int getRSCP(final MeasurementCategory measurementCategory) {
        switch (measurementCategory) {
        case GCGS:
            return 99;
        case GCBS:
            return 84;
        case BCGS:
            return 4;
        case BCBS:
            return -101;

        default:
            break;
        }
        return -1;
    }

    private Asn1Message createAsn1MessageWithGCGSOutsideEcnoRange() {
        final int rscpOverRSCPThreshold = 84;
        final int ecnoOverRange = 50;
        return createAsn1Message(rscpOverRSCPThreshold, ecnoOverRange);
    }

    private Asn1Message createAsn1Message(final int rscp, final int ecno) {
        final Asn1Message asn1Message = createAsn1MessageWithDefaults();
        setRSCP(rscp, asn1Message);
        setECNO(ecno, asn1Message);
        setMeasResOrdNumb((byte) 0, asn1Message);
        setEventResOrdNumb((byte) 0, asn1Message);
        setVALID_EVENT_RESULTS(true, asn1Message);
        setVALID_MEAS_RESULTS(true, asn1Message);
        ecnoCounter.add(ecno);
        rscpCounter.add(rscp);
        return asn1Message;
    }

    private void setECNO(final int ecno, final Asn1Message asn1Message) {
        final Map<String, String> messageAttributes = asn1Message.getMessageAttributes();
        messageAttributes.put(MeasReportAttributes.EC_NO, Integer.toString(ecno));
    }

    private void setMeasResOrdNumb(final byte numb, final Asn1Message asn1Message) {
        final Map<String, String> messageAttributes = asn1Message.getMessageAttributes();
        messageAttributes.put(MeasReportAttributes.MEAS_RESULTS_ORDER_NUMBER, Byte.toString(numb));
    }

    private void setEventResOrdNumb(final byte numb, final Asn1Message asn1Message) {
        final Map<String, String> messageAttributes = asn1Message.getMessageAttributes();
        messageAttributes.put(MeasReportAttributes.EVENT_RESULTS_ORDER_NUMBER, Byte.toString(numb));
    }

    private void setRSCP(final int rscp, final Asn1Message asn1Message) {
        final Map<String, String> messageAttributes = asn1Message.getMessageAttributes();
        messageAttributes.put(MeasReportAttributes.RSCP, Integer.toString(rscp));
    }

    private void setVALID_EVENT_RESULTS(final boolean valid, final Asn1Message asn1Message) {
        final Map<String, String> messageAttributes = asn1Message.getMessageAttributes();
        messageAttributes.put(MeasReportAttributes.VALID_EVENT_RESULTS, String.valueOf(valid));
    }

    private void setVALID_MEAS_RESULTS(final boolean valid, final Asn1Message asn1Message) {
        final Map<String, String> messageAttributes = asn1Message.getMessageAttributes();
        messageAttributes.put(MeasReportAttributes.VALID_MEAS_RESULTS, String.valueOf(valid));
    }

    private Asn1Message createAsn1MessageWithDefaults() {
        final Asn1Message asn1Message = new Asn1Message();
        final Map<String, String> messageAttributes = new HashMap<String, String>();
        messageAttributes.put(MeasReportAttributes.MEASUREMENT_TYPE, Byte.toString((byte) EVENT_TYPE.INTRA_FREQ.getId()));
        messageAttributes.put(MeasReportAttributes.SCRAMBLING_CODE, Integer.toString(ServingCellsForTest.SCRAMBLING_CODE_FOR_SERVING_CELL));
        messageAttributes.put(MeasReportAttributes.TRIGGER_EVENT_ID, "-1");
        messageAttributes.put(MeasReportAttributes.BSIC, "-1");
        messageAttributes.put(MeasReportAttributes.MEAS_RESULTS_ORDER_NUMBER, "-1");
        messageAttributes.put(MeasReportAttributes.EVENT_RESULTS_ORDER_NUMBER, "-1");
        messageAttributes.put(MeasReportAttributes.VALID_EVENT_RESULTS, "true");
        messageAttributes.put(MeasReportAttributes.VALID_MEAS_RESULTS, "true");
        asn1Message.setMessageAttributes(messageAttributes);
        return asn1Message;
    }

    private void setAsn1MessageList(final int rscp, final int ecno, final EVENT_TYPE eventType, final int cell, final RRC_MEASUREMENT_REPORT rrcMeasReportEvent) {
        final List<Asn1Message> asn1MessageList = new ArrayList<Asn1Message>();
        final Asn1Message asn1Message = new Asn1Message();
        final Map<String, String> messageAttributes = new HashMap<String, String>();
        messageAttributes.put(MeasReportAttributes.RSCP, Integer.toString(rscp));
        messageAttributes.put(MeasReportAttributes.EC_NO, Integer.toString(ecno));
        messageAttributes.put(MeasReportAttributes.MEASUREMENT_TYPE, Integer.toString(eventType.getId()));
        messageAttributes.put(MeasReportAttributes.TRIGGER_EVENT_ID, "0");
        messageAttributes.put(MeasReportAttributes.BSIC, "-1");
        messageAttributes.put(MeasReportAttributes.MEAS_RESULTS_ORDER_NUMBER, "-1");
        messageAttributes.put(MeasReportAttributes.EVENT_RESULTS_ORDER_NUMBER, "-1");
        messageAttributes.put(MeasReportAttributes.SCRAMBLING_CODE, Integer.toString(cell));
        messageAttributes.put(MeasReportAttributes.MEAS_RESULTS_ORDER_NUMBER, "-1");
        messageAttributes.put(MeasReportAttributes.EVENT_RESULTS_ORDER_NUMBER, "-1");
        messageAttributes.put(MeasReportAttributes.VALID_EVENT_RESULTS, "true");
        messageAttributes.put(MeasReportAttributes.VALID_MEAS_RESULTS, "true");
        asn1Message.setMessageAttributes(messageAttributes);
        asn1MessageList.add(asn1Message);
        rrcMeasReportEvent.setAsn1MessageList(asn1MessageList);
    }

    private GpehBase createEvent(final GpehEventType eventType, final long startTime, final RadioUser radioUser) {
        return createRadioEventsWithParams(eventType, ServingCellsForTest.CELL_FOR_SERVING_CELL, startTime, (short) ServingCellsForTest.RNC_FOR_SERVING_CELL,
                radioUser.getRncModuleIdForUser(), radioUser.getUeContextForUser());
    }

}
