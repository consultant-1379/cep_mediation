package com.ericsson.cepmediation.correlation.radio.performance;

import org.junit.Ignore;

@Ignore
public class NoMeasPerformance extends BasePerformanceTest {
    @Override
    protected String getEplFile() {
        return "performance/epl/rc_orig_no_meas.epl";
    }

    @Override
    protected int correlate() {
        super.correlate();
        return events.size();
    }
}
