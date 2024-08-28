package com.ericsson.cepmediation.correlation.radio;

import static org.junit.Assert.*;

import java.util.List;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.correlation.enrichment.SessionEndEvent;
import com.ericsson.cepmediation.correlation.util.FileParser;
import com.ericsson.cepmediation.loading.exception.ParsingFailedException;
import com.ericsson.cepmediation.test.common.RadioUserFilter;
import com.ericsson.cepmediation.test.tools.EventBreakdown;
import com.ericsson.cepmediation.test.util.EventFilterer;
import com.ericsson.cepmediation.test.util.GitPath;

public class RadioCorrelationPerformanceTesterBase extends RadioCorrelationBase {

    protected List<ApEventBean> gpehParsedRowEvents = null;

    protected String eventReport = null;

    protected String detailedEventReport = null;

    final String pathToFilesInClasspath = GitPath.getDirectoryPathForRealFilesInGIT();

    protected final RadioUserFilter userFilter = new RadioUserFilter();

    protected void sendRealEventsToEsper() {
        EventFilterer eventFilterer = new EventFilterer();
        List<ApEventBean> eventsToSendToEsper = eventFilterer.filterEventsIfRequested(gpehParsedRowEvents, userFilter);
        long startTimeForSendingEvents = System.currentTimeMillis();
        int eventCount = correlationEngine.sendEventsAndSessionEndEventsForROP(eventsToSendToEsper);
        if (eventCount == 0) {
            fail("No events found for selected user");
        }

        final long timeTakenToSendEvents = System.currentTimeMillis() - startTimeForSendingEvents;
        System.out.println("Have sent " + eventCount + " parsed events for selected user, it took " + timeTakenToSendEvents + " ms");
        sendFakeEndOfSessionEventsToEsper();
    }

    private void sendFakeEndOfSessionEventsToEsper() {
        rncId = 9;
        correlationEngine.sendEvent(new SessionEndEvent(getTimestamp()));
        rncId = -1;
        correlationEngine.sendEvent(new SessionEndEvent(getTimestamp()));
    }

    protected void createData() throws ParsingFailedException {
        gpehParsedRowEvents = new FileParser().parseGPEHRopFiles();
        setDetailedEventReport();
    }

    protected void parseDataFromFilesStoredInGit(final String ropPattern) throws ParsingFailedException {
        gpehParsedRowEvents = new FileParser().parseGPEHRopFiles(pathToFilesInClasspath, ropPattern);
        setDetailedEventReport();
    }

    protected void parseDataFromFiles(String pathToFile) throws ParsingFailedException {
        gpehParsedRowEvents = new FileParser().parseGPEHRopFiles(pathToFile, "");
        setDetailedEventReport();
    }

    private void setDetailedEventReport() {
        final String eventBreakdown = new EventBreakdown().getDetailedEventReport(gpehParsedRowEvents);
        detailedEventReport = eventReport + " are all sorted. " + " \n " + eventBreakdown;
    }

}
