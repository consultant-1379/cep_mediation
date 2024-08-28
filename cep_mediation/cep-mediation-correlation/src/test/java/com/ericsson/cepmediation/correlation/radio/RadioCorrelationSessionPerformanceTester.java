package com.ericsson.cepmediation.correlation.radio;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.ericsson.cepmediation.correlation.support.Configurator;
import com.ericsson.cepmediation.correlation.util.XSecondsConstants;
import com.ericsson.cepmediation.test.common.GpehEventType;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;
import com.espertech.esper.client.scopetest.SupportUpdateListener;

public class RadioCorrelationSessionPerformanceTester extends RadioCorrelationPerformanceTesterBase {

    private static java.text.DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSS");

    public static int numberOfImsiOverlapping = 0;

    private final Map<Long, Long> imsis = new HashMap<Long, Long>();

    @Before
    public void setUp() throws Exception {
        XSecondsConstants.setRrcMeasReportRetentionPeriodInSeconds(30);
        dateFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        configureEsper(Configurator.testInstance().getProperties().getProperty("default.epl.name"));
        addStatementAndListener("Session-Enrichment", sessionListener = new SupportUpdateListener());
        createData();
    }

    @Test
    public void shouldCorrstelationEngineConsumeAllEventsAtRopUnderXSeconds() {
        System.out.println("EventReport : " + detailedEventReport);

        final long startTime = System.currentTimeMillis();
        final long startTimeForSendingEvents = System.currentTimeMillis();
        int eventCount = correlationEngine.sendEventsAndSessionEndEventsForROP(gpehParsedRowEvents);
        final long timeTakenToSendEvents = System.currentTimeMillis() - startTimeForSendingEvents;
        System.out.println("Have sent all parsed events, it took " + timeTakenToSendEvents + " ms");
        rncId = 9;
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId,
                getTimestamp(), rncId, rncModuleId, ueContext));
        rncId = -1;
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId,
                getTimestamp(), rncId, rncModuleId, ueContext));
        final long endtime = System.currentTimeMillis() - startTime;
        System.out.println("endTime : " + endtime);

        final List<EventBean[]> eventList = sessionListener.getNewDataList();
        int numberOfSessions = 0;
        EventBean[] eventBeans = null;
        GPEH_SESSION radioSession = null;
        int rrcConnectionCount = 0;
        int psRabEstablishmentCount = 0;
        int eventCntInsSession = 0;
        int hsCellSuccessCount = 0;
        for (final Iterator<EventBean[]> eventBeanArrayIterator = eventList.iterator(); eventBeanArrayIterator
                .hasNext();) {
            eventBeans = eventBeanArrayIterator.next();
            for (int i = 0; i < eventBeans.length; i++) {
                radioSession = (GPEH_SESSION) eventBeans[i].getUnderlying();
                rrcConnectionCount += radioSession.getRRC_CONNECTION_CNT();
                psRabEstablishmentCount += radioSession.getPS_RAB_ESTABLISH_CNT();
                eventCntInsSession += radioSession.getEVENT_CNT();
                hsCellSuccessCount += radioSession.getHS_CELL_CHANGE_SUC_CNT();
                checkDuplicateImsiInSameSession(radioSession.getIMSI(), radioSession.getDATETIME_ID());

            }

            numberOfSessions += eventBeans.length;
        }
        System.out.println("total event count with extracted ASN events (rrc measurements) : " + eventCount);
        System.out.println("numberOFSessionsCreated : " + numberOfSessions + " \n performance rate : "
                + (eventCount / (endtime / 1000)) + " events correlations per second.\n "
                + " number of RRC Connections : " + rrcConnectionCount + " number of PS Rab Establishment count : "
                + psRabEstablishmentCount + " \n event count : " + eventCntInsSession + " \n HS_CELL_CHANGE_SUC_CNT "
                + hsCellSuccessCount + " number of overlapping imsi : " + numberOfImsiOverlapping
                + " number of total unique imsi : " + imsis.size());
    }

    private void checkDuplicateImsiInSameSession(final long imsi, final long sessionStartTime) {
        if (imsis.containsKey(imsi) && imsis.get(imsi) == sessionStartTime) {
            numberOfImsiOverlapping++;
            System.out.println("Duplicate imsi for the session imsi : " + imsi + " session : " + sessionStartTime
                    + " :: " + dateFormatter.format(sessionStartTime));
        } else {
            imsis.put(imsi, sessionStartTime);
        }
    }

    class InstantListener implements UpdateListener {

        @Override
        public void update(final EventBean[] newEvents, final EventBean[] oldEvents) {
            System.out.println("Received update");
            for (final EventBean eventBean : newEvents) {
                final GPEH_SESSION gpehSession = (GPEH_SESSION) eventBean.getUnderlying();
                System.out.println("rrc meas rep samples: " + gpehSession.getRRC_MEAS_REP_SAMPLES());
                System.out.println("gcgs: " + gpehSession.getRRC_SAMPLES_GC_GS());
                System.out.println("gcbs: " + gpehSession.getRRC_SAMPLES_GC_BS());
                System.out.println("bcgs: " + gpehSession.getRRC_SAMPLES_BC_GS());
                System.out.println("bcbs: " + gpehSession.getRRC_SAMPLES_BC_BS());
            }
        }

    }

}
