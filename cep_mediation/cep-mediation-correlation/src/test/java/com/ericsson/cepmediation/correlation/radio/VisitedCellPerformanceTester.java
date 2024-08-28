package com.ericsson.cepmediation.correlation.radio;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.correlation.support.Configurator;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.scopetest.SupportUpdateListener;

public class VisitedCellPerformanceTester extends RadioCorrelationPerformanceTesterBase {

    private static java.text.DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSS");

    @Before
    public void setUp() throws Exception {
        dateFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        configureEsper(Configurator.testInstance().getProperties().getProperty("default.epl.name"));
        addStatementAndListener("Visited-Cells-Enrichment", sessionListener = new SupportUpdateListener());
        createData();
    }

    @Test
    public void shouldCorrstelationEngineConsumeAllEventsAtRopUnderXSeconds() {
        System.out.println("EventReport : " + detailedEventReport);
        final long startTimeForSendingEvents = System.currentTimeMillis();
        int eventCount = correlationEngine.sendEventsAndSessionEndEventsForROP(gpehParsedRowEvents);
        final long timeTakenToSendEvents = System.currentTimeMillis() - startTimeForSendingEvents;
        final List<EventBean[]> eventList = sessionListener.getNewDataList();
        int numberOfVC = 0;
        EventBean[] eventBeans = null;
        for (final Iterator<EventBean[]> eventBeanArrayIterator = eventList.iterator(); eventBeanArrayIterator.hasNext();) {
            eventBeans = eventBeanArrayIterator.next();
            numberOfVC += eventBeans.length;
        }
        //		final String query = "select * from VisitedCellsWindow";
        //        final List<EnhancedVisitedCell> results = (List<EnhancedVisitedCell>) runOnDemandQuery(query);
        //        System.out.println(results.size() + " objects currently in sliding window");

        System.out.println("Have sent all parsed events, it took " + timeTakenToSendEvents + " ms");
        System.out.println("total event count with extracted ASN events (rrc measurements) : " + eventCount);
        System.out.println("numberOfVisitedCells : " + numberOfVC + " \n performance rate : " + (eventCount / (timeTakenToSendEvents / 1000))
                + " events correlations per second.\n ");
    }

}
