/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.radio.measreport;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;

import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.ericsson.cepmediation.correlation.radio.RadioCorrelationPerformanceTesterBase;
import com.ericsson.cepmediation.test.common.DateTimeUtilities;
import com.ericsson.cepmediation.test.topology.CellScramblingCodeDetails;
import com.ericsson.cepmediation.test.topology.ServingCellsForTest;
import com.ericsson.cepmediation.test.util.tracer.SessionTracer;

/**
 * 
 * 
 * @author eemecoy
 *
 */
public class BaseMeasReportParamsWithRealFilesTest extends RadioCorrelationPerformanceTesterBase {

    private final RealFileRRCMeasurements realFileRRCMeasurements = new RealFileRRCMeasurements();

    @Before
    public void setUp() throws Exception {
        configure("esper/rc.epl");
        setUpScramblingCodesUsedInData();
        realFileRRCMeasurements.storeApplicableRRCMeasurements();
        parseDataFromFilesStoredInGit("A20120516.1645-1700");
    }

    private void setUpScramblingCodesUsedInData() {
        final CellScramblingCodeDetails cellScramblingCodeDetailsForUser1 = new CellScramblingCodeDetails();
        cellScramblingCodeDetailsForUser1.setCell(20409);
        cellScramblingCodeDetailsForUser1.setRnc(9);
        cellScramblingCodeDetailsForUser1.setScramblingCode(173);
        ServingCellsForTest.addCellScramblingCode(cellScramblingCodeDetailsForUser1);
        CellScramblingCodeDetails cellScramblingCodeDetailsForUser2 = new CellScramblingCodeDetails();
        cellScramblingCodeDetailsForUser2.setCell(411);
        cellScramblingCodeDetailsForUser2.setRnc(9);
        cellScramblingCodeDetailsForUser2.setScramblingCode(139);
        ServingCellsForTest.addCellScramblingCode(cellScramblingCodeDetailsForUser2);

        final CellScramblingCodeDetails cellScramblingCodeDetails3 = new CellScramblingCodeDetails();
        cellScramblingCodeDetails3.setRnc(9);
        cellScramblingCodeDetails3.setCell(20406);
        cellScramblingCodeDetails3.setScramblingCode(109);

        ServingCellsForTest.addCellScramblingCode(cellScramblingCodeDetails3);

    }

    void sendEventsToEsperAndVerifySomeSessions() {
        sendRealEventsToEsper();
        List<GPEH_SESSION> sessions = getSessionsCreated();
        SessionTracer.traceSessions(sessions);
        verifyBasicStuffOnAllSessions(sessions);
        verifyMeasReportAttributesForStoredIMSIs(getSessionForUser(RealFileRRCMeasurements.STORED_IMSI, sessions));
        verifyAnotherStoredUser(getSessionForUser(454061106090952L, sessions));
        verifyPsRabAttributesForSelectedUser(getSessionForUser(454063302840112L, "2012-05-16 17:57:19.0938", sessions));
        verifyRRCDurationParametersForSelectedUser(getSessionForUser(454061105025948L, sessions));

    }

    private GPEH_SESSION getSessionForUser(long imsi, String sessionTime, List<GPEH_SESSION> sessions) {
        for (GPEH_SESSION session : sessions) {
            long datetimeOfSession = DateTimeUtilities.convertDateStringtoTimestamp(sessionTime);
            if (session.getIMSI() == imsi && session.getTimestamp() == datetimeOfSession) {
                return session;
            }
        }
        fail("Could not find session for " + imsi + " at " + sessionTime);
        return null;
    }

    private void verifyBasicStuffOnAllSessions(List<GPEH_SESSION> sessions) {
        for (GPEH_SESSION session : sessions) {
            assertThat(session.getRRC_DURATION() > 0, is(true));
            assertThat(session.getPS_RAB_ACTIVITY_END_TIME() > 0, is(true));
        }

    }

    private void verifyRRCDurationParametersForSelectedUser(GPEH_SESSION sessionForUser) {
        assertThat(sessionForUser.getRRC_DURATION(), is(5138));

    }

    private void verifyPsRabAttributesForSelectedUser(GPEH_SESSION session) {
        System.out.println("Verifying session:");
        SessionTracer.traceSession(session);
        assertThat(session.getPS_RAB_ESTABLISH_CNT(), is((short) 1));
        assertThat(session.getPS_RAB_ACTIVITY_END_TIME(),
                is(DateTimeUtilities.convertDateStringtoTimestamp("2012-05-16 17:57:27.0666")));
        assertThat(session.getRRC_CONN_END(), is(1337187597399L));
    }

    private void verifyAnotherStoredUser(GPEH_SESSION session) {
        SessionTracer.traceSession(session);
        assertThat(session.getRRC_MEAS_REP_SAMPLES(), is(2));

    }

    void verifyMeasReportAttributesForStoredIMSIs(final GPEH_SESSION session) {
        assertThat("RRC_MEAS_REP_SAMPLES incorrect", session.getRRC_MEAS_REP_SAMPLES(), is(19));
        assertThat("Incorrect GB", session.getRRC_SAMPLES_GC_BS(), is(0));
        assertThat("Incorrect GG", session.getRRC_SAMPLES_GC_GS(), is(13));
        assertThat("Incorrect BG", session.getRRC_SAMPLES_BC_GS(), is(0));
        assertThat("Incorrect BB", session.getRRC_SAMPLES_BC_BS(), is(0));
        assertThat("Incorrect ecno average", session.getECNO_AVG(), is(-10.0f));
        assertThat("Incorrect rscp average", session.getRSCP_AVG(), is(-91));

    }

    GPEH_SESSION getSessionForUser(long imsi, List<GPEH_SESSION> sessions) {
        for (GPEH_SESSION session : sessions) {
            if (session.getIMSI() == imsi) {
                return session;
            }
        }
        fail("No session returned for IMSI " + imsi);
        return null;
    }

}
