package com.ericsson.cepmediation.correlation.radio.performance;

import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;

import com.ericsson.cepmediation.correlation.enrichment.listeners.up.TCP_REPORT_ENRICHEDHelper;
import com.ericsson.cepmediation.correlation.util.FileParser;
import com.espertech.esper.client.scopetest.SupportUpdateListener;

@Ignore
public class StaplePerformance extends BasePerformanceTest {
    @Before
    public void setup() throws Exception {
        configureEsper(getEplFile());
        sessionListener = new SupportUpdateListener();
        listenToStatements("TCP_REPORT_ENRICHED");
    }
    
    protected void parseEvents() throws Exception {
        final long start = System.currentTimeMillis();
        events = new FileParser().parseStapleFiles();
        final long duration = System.currentTimeMillis() - start;

        perfData.append("Run " + cnt + " Loading performance: " + (events.size() / duration) + " duration: " + duration + "\n");
        Collections.sort(events);
    }
    
    protected String getEplFile() {
        return "performance/epl/up.epl";
    }
    
    protected int getCorrelatedRecords() {
        // logEvents();
        return getTcpReports().size();
    }
    
    private void logEvents() {
        List<TCP_REPORT_ENRICHEDHelper> tcpReports = getTcpReports();
        for (TCP_REPORT_ENRICHEDHelper r : tcpReports) {
            System.out.println(r.getDecodedString());
        }
    }
}
