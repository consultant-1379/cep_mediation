package com.ericsson.cepmediation.correlation.radio.performance;

import org.junit.Ignore;

@Ignore
public class VisitedCellsPerformance extends BasePerformanceTest {

    @Override
    protected String getEplFile() {
        return "performance/epl/rc_visited_cells.epl";
    }
}
