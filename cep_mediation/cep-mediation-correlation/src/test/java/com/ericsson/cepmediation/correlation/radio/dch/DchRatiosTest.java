package com.ericsson.cepmediation.correlation.radio.dch;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.ericsson.cepmediation.correlation.radio.RadioCorrelationBase;
import com.ericsson.cepmediation.correlation.radio.utils.Statements;

public class DchRatiosTest extends RadioCorrelationBase {

    @Before
    public void setup() throws Exception {
        configure("esper/_rc.epl", Statements.SESSION_ENRICHMENT);
    }

    @Test
    public void test() throws Exception {
        processFile("dch/dchRealData.txt");

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(3));

        final GPEH_SESSION session = sessions.get(0);
        assertThat(session.getHS_RATIO(), is(0.05603099f));
        assertThat(session.getEUL_RATIO(), is(0.05603099f));
        assertThat(session.getACTIVITY(), is(0.87903976f));
    }
}
