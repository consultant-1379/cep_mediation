package com.ericsson.cepmediation.correlation.core;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.SGEH_SESSION;
import com.ericsson.cepmediation.apeventbeans.ebm.ACTIVATE;
import com.ericsson.cepmediation.apeventbeans.ebm.DEACTIVATE;
import com.ericsson.cepmediation.apeventbeans.ebm.ISRAU;
import com.ericsson.cepmediation.apeventbeans.ebm.RAU;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.correlation.enrichment.SessionEndEvent;
import com.ericsson.cepmediation.correlation.util.FileParser;
import com.ericsson.cepmediation.loading.exception.ParsingFailedException;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.scopetest.SupportUpdateListener;

@Ignore
public class CoreCorrelationPerformanceTester extends CoreCorrelationBase {
    private static java.text.DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSS");
    public static int numberOfImsiOverlapping = 0;
    private SupportUpdateListener coreSessionListener = null;
    protected List<ApEventBean> coreParsedRowEvents = null;
    protected List<SGEH_SESSION> duplicateSessions = new ArrayList<SGEH_SESSION>();
    private final Map<Long, Long> imsis = new HashMap<Long, Long>();
    
    @Before
    public void setUp() throws ParsingFailedException {
        configure("esper/CoreCorrelation.epl", "CORE_SESSION", coreSessionListener = new SupportUpdateListener());
        coreParsedRowEvents = new FileParser().parseCoreRopFiles();
    }
    
    @Test
    public void sgehSessionCreationTest() {
        long endSessionEventTimestamp = 0l;
        SessionEndEvent sessionEndEvent = null;
        System.out.println("------------------> Event Sending Started");
        for (ApEventBean e : coreParsedRowEvents) {
            log(e);
            if (endSessionEventTimestamp <= e.getTimestamp()) {
                if (sessionEndEvent != null) {
                    sessionEndEvent.setTimestamp(sessionEndEvent.getTimestamp() + 1);
                    correlationEngine.sendEvent(sessionEndEvent);
                    System.out.println("SESSION END EVENT : " + sessionEndEvent.getTimestamp()+ " :: " + dateFormatter.format(sessionEndEvent.getTimestamp()));
                }
            }
            sessionEndEvent = resolveEnd(e.getTimestamp());
            endSessionEventTimestamp = sessionEndEvent.getTimestamp();
            correlationEngine.sendEvent(e);
        }
        correlationEngine.sendEvent(sessionEndEvent);
        System.out.println("SESSION END EVENT : " + sessionEndEvent.getTimestamp()+ " :: " + dateFormatter.format(sessionEndEvent.getTimestamp()));
        System.out.println("Event Sending Finished <------------------");
        int numberOfSessions = 0;
        final List<EventBean[]> eventList = coreSessionListener.getNewDataList();
        SGEH_SESSION coreSession = null;
        for(EventBean[] eventBeanArray : eventList){
            for (int i = 0; i < eventBeanArray.length; i++) {
                coreSession = (SGEH_SESSION) eventBeanArray[i].getUnderlying();
                logSession(coreSession);
                if(isDuplicateSession(coreSession.getIMSI() , coreSession.getTimestamp())){
                    duplicateSessions.add(coreSession);
                }
            }    
            numberOfSessions += eventBeanArray.length;
        }
        System.out.println("Number of core sessions : " + numberOfSessions + " number of overlapping imsi : " + numberOfImsiOverlapping + " \n \n");
        System.out.println("<----------------------DUPLICATE CORE SESSIONS----------------------------->");
        for (SGEH_SESSION session : duplicateSessions) {
            logSessionAttributes(session);
        }
    }
    
    private void logSession(SGEH_SESSION session) {
        if(session.getIMSI() == 621300060805975l){
            logSessionAttributes(session);
        }
    }

    private void logSessionAttributes(SGEH_SESSION session){
        System.out.println("SAME SESSION**"
                + " Absolute Name : " + session.getAbsoluteName()
                + " getAPN_ACTIVITY_LATEST_TIME : " +session.getAPN_ACTIVITY_LATEST_TIME()
                + " getAPN_ACTIVITY_START_TIME : " +session.getAPN_ACTIVITY_START_TIME()
                + " END_APN : " +session.getEND_APN()
                + " EventId : " +session.getEventId()
                + " IMSI : " +session.getIMSI()
                + " ISRAU_ATT_CNT : " +session.getISRAU_ATT_CNT()
                + " ISRAU_SUC_CNT : " +session.getISRAU_SUC_CNT()
                + " RopId : " +session.getRopId()
                + " SESSION_DURATION : " +session.getSESSION_DURATION()
                + " timestamp : " + session.getTimestamp() + " :: " + dateFormatter.format(session.getTimestamp())
                );
    }
    private void log(ApEventBean e) {
        if(e instanceof ACTIVATE){
            ACTIVATE activate = (ACTIVATE)e;
            if(activate.getIMSI().equalsIgnoreCase("621300060805975")){
                System.out.println("ACTIVATE timestamp : " + activate.getTimestamp() + " :: " + dateFormatter.format(activate.getTimestamp()) + " APN " + activate.getAPN());
            }
        }else if(e instanceof RAU){
            RAU rau = (RAU)e;
            if(rau.getIMSI().equalsIgnoreCase("621300060805975")){
                System.out.println("RAU timestamp : " + rau.getTimestamp() + " :: " + dateFormatter.format(rau.getTimestamp()));
            }
        }else if(e instanceof ISRAU){
            ISRAU israu = (ISRAU)e;
            if(israu.getIMSI().equalsIgnoreCase("621300060805975")){
                System.out.println("ISRAU timestamp : " + israu.getTimestamp() + " :: " + dateFormatter.format(israu.getTimestamp()));
            }
        }else if(e instanceof DEACTIVATE){
            DEACTIVATE deactivate = (DEACTIVATE)e;
            if(deactivate.getIMSI().equalsIgnoreCase("621300060805975")){
                System.out.println("DEACTIVATE timestamp : " + deactivate.getTimestamp() + " :: " + dateFormatter.format(deactivate.getTimestamp()) + " APN " + deactivate.getAPN());
            }
        }
    }

    private boolean isDuplicateSession(final long imsi, final long sessionStartTime) {
        if (imsis.containsKey(imsi) && imsis.get(imsi) == sessionStartTime) {
            numberOfImsiOverlapping++;
            System.out.println("Duplicate imsi for the session imsi : " + imsi + " session : " + sessionStartTime
                    + " :: " + dateFormatter.format(sessionStartTime));
            return true;
        } else {
            imsis.put(imsi, sessionStartTime);
        }
        return false;
    }
    private static SessionEndEvent resolveEnd(final long timestamp) {
        final long fiveMinute = 5 * 60 * 1000;
        final Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("UTC"));
        cal.setTimeInMillis(timestamp);
        cal.set(Calendar.MINUTE, cal.get(Calendar.MINUTE) - cal.get(Calendar.MINUTE) % 5);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        final long sessionEndTime = cal.getTime().getTime() + fiveMinute;
        return new SessionEndEvent(sessionEndTime);
    }
}
