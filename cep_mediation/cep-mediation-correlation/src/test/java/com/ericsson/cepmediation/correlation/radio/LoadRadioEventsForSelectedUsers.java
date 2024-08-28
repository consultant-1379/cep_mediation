/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.radio;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.test.common.RadioUser;
import com.ericsson.cepmediation.test.topology.ServingCellsForTest;
import com.ericsson.cepmediation.test.util.EventFilterer;
import com.ericsson.cepmediation.test.util.tracer.SessionTracer;
import com.espertech.esper.client.scopetest.SupportUpdateListener;

/**
 * 
 * @author eemecoy
 *
 */
public class LoadRadioEventsForSelectedUsers extends RadioCorrelationPerformanceTesterBase {

    @Before
    public void setUp() throws Exception {
        ServingCellsForTest.addCellScramblingCodesSavedFromDatabase();
        // setUpSelectedUsers();
        //parseDataFromFiles("/home/eemecoy/decoded_rop_files/A20120516/1730-1745/raw_files/");
        parseDataFromFilesStoredInGit("A20120516.1645-1700");
        configureEsper("esper/rc.epl");
        addStatementAndListener("Session-Enrichment", sessionListener = new SupportUpdateListener());
    }

    private void setUpSelectedUsers() {
        RadioUser user1 = new RadioUser();
        user1.setRncModuleIdForUser((byte) 7);
        user1.setUeContextForUser((short) 2430);
        userFilter.addUser(user1);

    }

    @Test
    public void loadEventsForOnlySpecifiedUsers() {

        EventFilterer eventFilterer = new EventFilterer();
        List<ApEventBean> filteredEvents = eventFilterer.filterEventsIfRequested(gpehParsedRowEvents, userFilter);
        correlationEngine.sendEventsAndSessionEndEventsForROP(filteredEvents);

        final List<GPEH_SESSION> sessionsCreated = getSessionsCreated();
        assertFalse(sessionsCreated.isEmpty());
        printSessionDetails(sessionsCreated);

    }

    private void printSessionDetails(final List<GPEH_SESSION> sessionsCreated) {
        for (GPEH_SESSION session : sessionsCreated) {
            long imsi = session.getIMSI();
            if (imsi == 454061039545839L) {
                SessionTracer.traceSession(session);
            }
        }
        SessionTracer.traceSessions(sessionsCreated);
    }

}
