/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.radio.systemutil;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;
import com.ericsson.cepmediation.correlation.radio.RadioCorrelationPerformanceTesterBase;
import com.ericsson.cepmediation.test.util.tracer.SessionTracer;

/**
 * @author eemecoy
 *
 */
public class SystemUtilizationParamsWithRealFilesTest extends RadioCorrelationPerformanceTesterBase {

    @Before
    public void setUp() throws Exception {
        configure("esper/rc.epl");
        parseDataFromFilesStoredInGit("A20120516.1645-1700");
    }

    @Test
    public void testSystemUtilizationParamsInRealData() {
        sendRealEventsToEsper();
        List<GPEH_SESSION> sessions = getSessionsCreated();
        checkSystemUtilizationParameters(sessions);
    }

    private void checkSystemUtilizationParameters(List<GPEH_SESSION> sessions) {
        int sessionsWithUnsetSystemUtilValues = 0;
        for (GPEH_SESSION session : sessions) {
            float uplinkInterferenceAverage = session.getUL_INTERFERENCE_AVG();
            int downlinkNonHsTxPowerPaverage = session.getDL_NON_HS_TX_POWER_AVG();
            short hsdschUsersAverage = session.getHSDSCH_USERS_AVG();
            if (allValuesAreUnset(uplinkInterferenceAverage, downlinkNonHsTxPowerPaverage, hsdschUsersAverage)) {
                sessionsWithUnsetSystemUtilValues++;
            }
        }
        System.out.println("Number of sessions with unset fields " + sessionsWithUnsetSystemUtilValues);
        System.out.println("Number of total sessions " + sessions.size());
        double proportionOfSessionsWithSystemUtilFieldsUnset = (double) sessionsWithUnsetSystemUtilValues
                / sessions.size();
        System.out.println("Proportion of sessions with system util fields unset is "
                + proportionOfSessionsWithSystemUtilFieldsUnset);

        int expectedNumberOfSessions = 72517;
        assertThat(sessions.size(), is(expectedNumberOfSessions));
        if (sessionsWithUnsetSystemUtilValues == expectedNumberOfSessions) {
            SessionTracer.traceSession(sessions.get(0));
        }
        assertThat(sessionsWithUnsetSystemUtilValues, is(190));
    }

    private boolean allValuesAreUnset(float uplinkInterferenceAverage, int downlinkNonHsTxPowerPaverage,
            short hsdschUsersAverage) {
        return uplinkInterferenceAverage == DefaultValues.DEFAULT_FLOAT_VALUE && downlinkNonHsTxPowerPaverage == -1
                && hsdschUsersAverage == DefaultValues.DEFAULT_SHORT_VALUE;
    }

}
