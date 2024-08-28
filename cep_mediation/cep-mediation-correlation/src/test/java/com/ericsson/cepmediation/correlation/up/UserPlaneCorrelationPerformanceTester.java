package com.ericsson.cepmediation.correlation.up;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.correlation.enrichment.SessionEndEvent;
import com.ericsson.cepmediation.correlation.util.FileParser;
import com.ericsson.cepmediation.loading.exception.ParsingFailedException;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;

@Ignore
public class UserPlaneCorrelationPerformanceTester extends UserPlaneCorrelationBase {
    
    private CaptoolInstantListener captoolEventListener = null;
    private StapleInstantListener stapleEventListener = null;
    private List<ApEventBean> captoolParsedRowEvents = null;
    private List<ApEventBean> tcpParsedRowEvents = null;
    private int theNumberOfCaptoolEvents = 0;
    private int theNumberOfStapleEvents = 0;
    
    @Before
    public void setUp() throws ParsingFailedException {
        
        configure("esper/WcdmaUserPlaneCorrelation.epl",
                "classification-handler", captoolEventListener = new CaptoolInstantListener() );
        
        addStatementAndListener("TCP_REPORT_ENRICHED", stapleEventListener = new StapleInstantListener());
        captoolParsedRowEvents = new FileParser().parseCaptoolFiles();
        tcpParsedRowEvents = new FileParser().parseStapleFiles();
        
    }
    
    /**
     * Setting prioritized on engine to true
        Starting file parsing for CAPTOOL, parsing files in /home/ECAMOSM/smartonedata/CAPTOOL_PERFORMANCE_TEST with pattern 
        done parsing files
        CAPTOOL Files are parsed and buffered in 30660 ms. and sorted in 1127 for Number of events ---> 2281457
        Starting file parsing for STAPLE, parsing files in /home/ECAMOSM/smartonedata/STAPLE_PERFORMANCE_TEST with pattern 
        done parsing files
        STAPLE Files are parsed and buffered in 13896 ms. and sorted in 873 for Number of events ---> 891057
        Captool Events( 2281457 ) send to UP Correlation engine in : 1741 ms.
        Staple Events( 891057 )send to UP Correlation engine in :  : 44723 ms.
        the number of UP Events : 2281457 the number of staple Events : 734348
     * 
     * ***/
    @Test
    public void testPerformancesOfWCDMAUPCorrelation() {
        long captoolStartTime = System.currentTimeMillis();
        int captoolEvents = 0;
        for(ApEventBean event : captoolParsedRowEvents){
            captoolEvents ++ ;
            correlationEngine.sendEvent(event);
        }
        long captoolEndTime = System.currentTimeMillis();
        System.out.println("Captool Events(" + captoolEvents + ") send to UP Correlation engine in : " + (captoolEndTime-captoolStartTime) + " ms.");
        
        int stapleEvents = 0;
        long stapleStartTime = System.currentTimeMillis();
        SessionEndEvent sessionEndEvent = null;
        long endSessionEventTimestamp = 0l;
        for(ApEventBean event : tcpParsedRowEvents){
            stapleEvents ++;
            if (endSessionEventTimestamp <= event.getTimestamp()) {
                if (sessionEndEvent != null) {
                    sessionEndEvent.setTimestamp(sessionEndEvent.getTimestamp() + 1);
                    correlationEngine.sendEvent(sessionEndEvent);
                }
                sessionEndEvent = resolveEnd(event.getTimestamp());
                endSessionEventTimestamp = sessionEndEvent.getTimestamp();
            }
            correlationEngine.sendEvent(event);
        }
        long stapleEndTime = System.currentTimeMillis();
        System.out.println("Staple Events(" + stapleEvents + ")send to UP Correlation engine in :  : " + (stapleEndTime-stapleStartTime) + " ms.");
        
        
        System.out.println("the number of UP Events : " + theNumberOfCaptoolEvents + " the number of staple Events : " + theNumberOfStapleEvents);
        
    }
    private static SessionEndEvent resolveEnd(final long timestamp) {
        final long fiveMinute = 5 * 60 * 1000;
        final short rncId = 9;
        final Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("UTC"));
        cal.setTimeInMillis(timestamp);
        cal.set(Calendar.MINUTE, cal.get(Calendar.MINUTE) - cal.get(Calendar.MINUTE) % 5);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        final long sessionEndTime = cal.getTime().getTime() + fiveMinute;
        return new SessionEndEvent(sessionEndTime);
    }
    
    
    class CaptoolInstantListener implements UpdateListener {
        @Override
        public void update(final EventBean[] newEvents, final EventBean[] oldEvents) {
            theNumberOfCaptoolEvents += newEvents.length;
        }
    }
    
    class StapleInstantListener implements UpdateListener {
        @Override
        public void update(final EventBean[] newEvents, final EventBean[] oldEvents) {
            theNumberOfStapleEvents += newEvents.length;
        }
    }
}
