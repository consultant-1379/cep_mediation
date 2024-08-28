package com.ericsson.cepmediation.correlation.radio.realdata;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.ericsson.cepmediation.correlation.radio.RadioCorrelationBase;
import com.ericsson.cepmediation.correlation.radio.utils.Statements;

public class RealDataTest extends RadioCorrelationBase {

    @Before
    public void setupListeners() throws Exception {
        configure("esper/_rc.epl");
        listenToStatements(Statements.SESSION_ENRICHMENT);
    }

    @Test
    public void areSignalCoverageCalculationsValid() throws Exception {
        processFile("real_data/start_rnc_id_null.txt");

        List<GPEH_SESSION> sess = getSessionsCreated();
        GPEH_SESSION s = sess.get(0);

        assertThat(s.getRRC_MEAS_REP_SAMPLES(), is(4));
        assertThat(s.getRRC_SAMPLES_BC_BS(),  is(0));
        assertThat(s.getRRC_SAMPLES_BC_GS(),  is(0));
        assertThat(s.getRRC_SAMPLES_GC_BS(),  is(0));
        assertThat(s.getRRC_SAMPLES_GC_GS(),  is(0));
    }

}
