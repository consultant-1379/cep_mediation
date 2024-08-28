package com.ericsson.cepmediation.correlation.radio.performance;

import org.junit.Ignore;

@Ignore
public class RefactorImsiUpdatePerformance extends BasePerformanceTest {
    @Override
    protected String getEplFile() {
        return "performance/epl/rc_orig_refactor_imsi_update.epl";
    }
}
