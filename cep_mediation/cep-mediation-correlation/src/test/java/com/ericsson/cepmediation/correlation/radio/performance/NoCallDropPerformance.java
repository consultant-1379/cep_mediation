package com.ericsson.cepmediation.correlation.radio.performance;

import org.junit.Ignore;

@Ignore
public class NoCallDropPerformance extends BasePerformanceTest {
    @Override
    protected String getEplFile() {
        return "performance/epl/rc_orig_no_call_drop.epl";
    }
}
