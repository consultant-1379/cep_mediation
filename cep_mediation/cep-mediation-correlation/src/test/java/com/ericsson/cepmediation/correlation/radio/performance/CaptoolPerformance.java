package com.ericsson.cepmediation.correlation.radio.performance;

import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;

import com.ericsson.cepmediation.apeventbeans.bearer_plane.CLASSIFICATION_REPORT;
import com.ericsson.cepmediation.base.util.Utilities;
import com.ericsson.cepmediation.correlation.util.FileParser;
import com.espertech.esper.client.scopetest.SupportUpdateListener;

@Ignore
public class CaptoolPerformance extends BasePerformanceTest {
    
    @Before
    public void setup() throws Exception {
        configureEsper(getEplFile());
        sessionListener = new SupportUpdateListener();
        listenToStatements("classification-handler");
    }
    
    protected void parseEvents() throws Exception {
        final long start = System.currentTimeMillis();
        events = new FileParser().parseCaptoolFiles();
        final long duration = System.currentTimeMillis() - start;

        perfData.append("Run " + cnt + " Loading performance: " + (events.size() / duration) + " duration: " + duration + "\n");
        Collections.sort(events);
    }
    
    protected String getEplFile() {
        return "performance/epl/up.epl";
    }
    
    protected int getCorrelatedRecords() {
        logEvents();
        return getTcpReports().size();
    }
    
    private void logEvents() {
        List<CLASSIFICATION_REPORT> classificationReports = getClassificationReports();
        for (CLASSIFICATION_REPORT r : classificationReports) {
            System.out.println(Utilities.extractTacFromImeiSv(r.getIMEISV()));
        }
    }
}
