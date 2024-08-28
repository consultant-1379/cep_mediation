package com.ericsson.cepmediation.correlation.radio;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.ericsson.cepmediation.apeventbeans.bearer_plane.CLASSIFICATION_REPORT;
import com.ericsson.cepmediation.apeventbeans.bearer_plane.TCP_REPORT;
import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CALL_SETUP_FAIL_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CHANNEL_SWITCHING;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_RAB_ESTABLISHMENT;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_RAB_RELEASE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SOHO_DS_MISSING_NEIGHBOUR_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SYSTEM_RELEASE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SYSTEM_UTILIZATION;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.correlation.enrichment.*;
import com.ericsson.cepmediation.correlation.enrichment.listeners.up.TCP_REPORT_ENRICHEDHelper;
import com.ericsson.cepmediation.correlation.radio.utils.EventCreator;
import com.ericsson.cepmediation.correlation.radio.utils.SessionCreator;
import com.ericsson.cepmediation.correlation.radio.utils.Statements;
import com.ericsson.cepmediation.correlation.stubs.StubbedEsperService;
import com.ericsson.cepmediation.correlation.util.EsperInitialization;
import com.ericsson.cepmediation.correlation.util.parser.PlainFileParser;
import com.ericsson.cepmediation.correlation.util.tracers.EnhancedGpehSessionTracer;
import com.ericsson.cepmediation.test.common.DateTimeUtilities;
import com.ericsson.cepmediation.test.common.GpehEventType;
import com.ericsson.cepmediation.test.common.RadioUser;
import com.ericsson.cepmediation.test.util.tracer.EventTracer;
import com.ericsson.cepmediation.test.util.tracer.SessionTracer;
import com.espertech.esper.client.EPAdministrator;
import com.espertech.esper.client.EPOnDemandQueryResult;
import com.espertech.esper.client.EPRuntime;
import com.espertech.esper.client.EPServiceDestroyedException;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;
import com.espertech.esper.client.deploy.DeploymentException;
import com.espertech.esper.client.deploy.ParseException;
import com.espertech.esper.client.scopetest.SupportUpdateListener;

public abstract class RadioCorrelationBase {

    protected static long FIVE_MINUTE = 5 * 60 * 1000; // In order to create the session//

    protected short ueContext;

    protected short rncId;

    protected int cellId;

    protected byte rncModuleId;

    protected EPServiceProvider engine = null;

    protected UpdateListener fiveMinuteSessionListener = null;

    protected SupportUpdateListener sessionListener = null;

    protected SupportUpdateListener startMarkerListener = null;

    protected SupportUpdateListener enrichedEventListener = null;

    protected StubbedEsperService correlationEngine = null;

    protected static List<EventBean[]> radioSessionList = new ArrayList<EventBean[]>();
    private EPRuntime esperRuntime;

    /**
     * @param eplName
     *            name of epl file
     * @param statement
     *            name of statement in epl to listen on
     */
    public void configure(final String eplName, final String statement) throws Exception {
        configureEsper(eplName);
        addStatementAndListener(statement, sessionListener = new SupportUpdateListener());
    }

    /**
     * Configure esper to run the epl specified by eplName This method will use the default Statement to listen on, ie Session-Enrichment
     * 
     * @param eplName
     *            name of epl file
     * 
     */
    public void configure(final String eplName) throws Exception {
        configure(eplName, Statements.SESSION_ENRICHMENT);
    }

    public void configureEsper(final String... eplName) throws Exception {
        configureEngine(eplName);
        final EPRuntime epRuntime = this.engine.getEPRuntime();
        correlationEngine = new StubbedEsperService(epRuntime);
    }

    protected void configureEngine(final String... eplName) throws EPServiceDestroyedException, IOException, ParseException, DeploymentException {
        this.engine = EsperInitialization.configureEngine(eplName);
    }

    protected void listenToStatements(final String... statements) {
        for (final String statement : statements) {
            addStatementAndListener(statement, sessionListener);
        }
    }

    protected void addStatementAndListener(final String statement, final UpdateListener updateListener) {
        final EPAdministrator epAdministrator = engine.getEPAdministrator();
        final EPStatement epStatement = epAdministrator.getStatement(statement);
        if (epStatement == null) {
            throw new RuntimeException("Could not find epl statement " + statement);
        }
        System.out.println("Adding listener on statement " + statement);
        epStatement.addListener(updateListener);
    }

    protected static List<EventBean[]> getRadioSessionList() {
        return radioSessionList;
    }

    protected static long getTimestamp() {
        return System.currentTimeMillis();
    }

    protected static GpehBase createRandomRadioEvent() {
        return EventCreator.createRandomRadioEvent();
    }

    protected static GpehBase createRadioEventsWithParams(final GpehEventType radioEventId, final int cellId, final long timestamp,
                                                          final short rncId, final int rncModuleId, final short ueContext) {
        return EventCreator.createRadioEventsWithParams(radioEventId, cellId, timestamp, rncId, rncModuleId, ueContext);
    }

    protected static GpehBase createRadioEventsWithParams(final GpehEventType radioEventId, final int cellId, final short rncId,
                                                          final byte rncModuleId, final short ueContext) {
        return EventCreator.createRadioEventsWithParams(radioEventId, cellId, rncId, rncModuleId, ueContext);
    }

    protected static GpehBase createImsiEventsWithParams(final int cellId, final long timestamp, final short rncId, final int rncModuleId,
                                                         final short ueContext, final long imsi) {
        return EventCreator.createImsiEventsWithParams(cellId, timestamp, rncId, rncModuleId, ueContext, Long.toString(imsi));
    }

    protected static GpehBase createImsiEventsWithParams(final int cellId, final long timestamp, final short rncId, final int rncModuleId,
                                                         final short ueContext, final String imsi) {
        return EventCreator.createImsiEventsWithParams(cellId, timestamp, rncId, rncModuleId, ueContext, imsi);
    }

    protected static INTERNAL_RAB_ESTABLISHMENT createRabEventsWithParams(final int cellId, final long timestamp, final short rncId,
                                                                          final int rncModuleId, final short ueContext, final short sourceConf,
                                                                          final short targetConf) {
        return EventCreator.createRabEventsWithParams(cellId, timestamp, rncId, rncModuleId, ueContext, sourceConf, targetConf);
    }

    protected static INTERNAL_SYSTEM_UTILIZATION createInterSysUtilEventsWithParams(final int cellId, final long timestamp, final short rncId,
                                                                                    final byte rncModuleId, final short hsUsers,
                                                                                    final short ulInterference, final short dlNonHsPower,
                                                                                    final byte cmUsers) {
        return EventCreator.createInterSysUtilEventsWithParams(cellId, timestamp, rncId, rncModuleId, hsUsers, ulInterference, dlNonHsPower, cmUsers);
    }

    protected static INTERNAL_CHANNEL_SWITCHING createChannelSwitchEventsWithParams(final int cellId, final long timestamp, final short rncId,
                                                                                    final byte rncModuleId, final short ueContext, final byte reason) {
        return EventCreator.createChannelSwitchEventsWithParams(cellId, timestamp, rncId, rncModuleId, ueContext, reason);
    }

    protected static INTERNAL_CHANNEL_SWITCHING createChannelSwitchEventsWithParamsConf(final int cellId, final long timestamp,
                                                                                        final byte rncModuleId, final short ueContext,
                                                                                        final short sourceConf, final short targetConf) {
        return EventCreator.createChannelSwitchEventsWithParamsConf(cellId, timestamp, rncModuleId, ueContext, sourceConf, targetConf);
    }

    protected static INTERNAL_SYSTEM_RELEASE createSystemReleaseEventsWithParams(final int cellId, final long timestamp, final short rncId,
                                                                                 final byte rncModuleId, final short ueContext,
                                                                                 final short sourceConf, final short targetConf) {
        return EventCreator.createSystemReleaseEventsWithParams(cellId, timestamp, rncId, rncModuleId, ueContext, sourceConf, targetConf);
    }

    protected static INTERNAL_RAB_RELEASE createRabReleaseEventsWithParams(final int cellId, final long timestamp, final short rncId,
                                                                           final byte rncModuleId, final short ueContext, final short sourceConf,
                                                                           final short targetConf) {
        return EventCreator.createRabReleaseEventsWithParams(cellId, timestamp, rncId, rncModuleId, ueContext, sourceConf, targetConf);
    }

    protected List<GPEH_SESSION> getSessionsCreated() {
        final List<EventBean[]> eventList = sessionListener.getNewDataList();
        final List<GPEH_SESSION> sessions = new ArrayList<GPEH_SESSION>();
        for (final EventBean[] eventBeans : eventList) {
            for (final EventBean eventBean : eventBeans) {
                if (eventBean.getUnderlying() instanceof GPEH_SESSION) {
                    final GPEH_SESSION session = (GPEH_SESSION) eventBean.getUnderlying();
                    sessions.add(session);
                }

            }
        }
        return sessions;

    }

    protected GPEH_SESSION getSingleGpehSessionCreated() {
        final List<GPEH_SESSION> gpehSessions = getSessionsCreated();
        assertThat("Incorrect number of GPEH Sessions, number of GPEH Sessions created by epl is " + gpehSessions.size(), gpehSessions.size(), is(1));
        return gpehSessions.get(0);
    }

    protected <T> List<T> getEventBeansCreatedByEsper() {
        final List<EventBean[]> output = sessionListener.getNewDataList();
        final List<T> underlyingObjects = new ArrayList<T>();
        for (final EventBean[] eventBeans : output) {
            for (final EventBean eventBean : eventBeans) {
                final T underlyingObject = (T) eventBean.getUnderlying();
                underlyingObjects.add(underlyingObject);
            }
        }
        return underlyingObjects;
    }

    protected List<? extends Object> getElementsInWindow(final String windowName) {
        return runOnDemandQuery("select * from " + windowName);
    }

    protected List<? extends Object> runOnDemandQuery(final String onDemandQuery) {
        final String currentTime = DateTimeUtilities.convertTimeStampToDateString(getTimestamp());
        System.out.println("At " + currentTime + " ,running on demand query: " + onDemandQuery);
        final EPOnDemandQueryResult result = engine.getEPRuntime().executeQuery(onDemandQuery);
        final EventBean[] eventBeanObjects = result.getArray();
        final List<Object> objects = new ArrayList<Object>();

        for (final EventBean eventBean : eventBeanObjects) {
            final Object underlying = eventBean.getUnderlying();
            objects.add(underlying);
        }
        return objects;
    }

    protected void traceSessionWindows(String windowName) {
        final List<? extends Object> elementsInWindow = getElementsInWindow(windowName);
        for (final Object element : elementsInWindow) {
            if (element instanceof EnhancedGpehSession) {
                final EnhancedGpehSession enhancedGpehSession = (EnhancedGpehSession) element;
                EnhancedGpehSessionTracer.traceSession(enhancedGpehSession);
            } else if (element instanceof GPEH_SESSION) {
                final GPEH_SESSION gpehSession = (GPEH_SESSION) element;
                SessionTracer.traceSession(gpehSession);
            } else if (element instanceof INTERNAL_CALL_SETUP_FAIL_ENRICHED) {
                INTERNAL_CALL_SETUP_FAIL_ENRICHED event = (INTERNAL_CALL_SETUP_FAIL_ENRICHED) element;
                System.out.println("Window : " + event.getDecodedString());
            }
        }
    }

    /**
     * More intelligent method - for example will populate IMSI for an INTERNAL_IMSI event
     */
    protected void sendEvent(final GpehEventType gpehEventType, final long timestamp, final RadioUser radioUser) {
        switch (gpehEventType) {
            case INTERNAL_IMSI:
                sendIMSIEvent(radioUser, timestamp);
                break;
            case INTERNAL_RAB_ESTABLISHMENT:
                sendRabEvent(radioUser, timestamp);
                break;
            default:
                sendBasicRadioEvent(gpehEventType, timestamp, radioUser);
                break;
        }
    }

    protected void sendBasicRadioEvent(final GpehEventType eventType, final long timestamp, final RadioUser radioUser) {
        final GpehBase event = createRadioEventsWithParams(eventType, cellId, timestamp, rncId, radioUser.getRncModuleIdForUser(),
                radioUser.getUeContextForUser());
        sendEvent(event);
    }

    protected void sendIMSIEvent(final RadioUser radioUser, final long timestamp) {
        sendEvent(createImsiEventsWithParams(cellId, timestamp, rncId, radioUser.getRncModuleIdForUser(), radioUser.getUeContextForUser(),
                radioUser.getImsi()));
    }

    protected void sendRabEvent(final RadioUser radioUser, final long timestamp) {
        final short sourceConf = 1;
        final short targetConf = 25;
        sendEvent(createRabEventsWithParams(cellId, timestamp, rncId, radioUser.getRncModuleIdForUser(), radioUser.getUeContextForUser(), sourceConf,
                targetConf));
    }

    protected void sendEvent(final GpehBase event) {
        EventTracer.traceEvent(event);
        correlationEngine.sendEvent(event);
    }

    protected void createSession(final RadioUser radioUser, final long startTime, final GpehEventType... gpehEventTypes) {
        SessionCreator.createSession(correlationEngine, radioUser, startTime, cellId, rncId, gpehEventTypes);
    }

    protected void createBasicSession(final RadioUser radioUser, final long startTime) {
        SessionCreator.createBasicSession(correlationEngine, radioUser, startTime, cellId, rncId);
    }

    protected void createSessionWithoutReleaseEvent(final RadioUser radioUser, final long timestamp) {
        SessionCreator.createSessionWithoutReleaseEvent(correlationEngine, radioUser, timestamp, cellId, rncId);
    }

    protected void processFile(final String file) {
        List<ApEventBean> events = readEventsFromFile(file);
        correlationEngine.sendEventsAndSessionEndEventsForROP(events);
    }

    protected int processFileforInr(final String file) {

        List<ApEventBean> events = readEventsFromFile(file);
        int sentEvents = correlationEngine.sendEventsAndSessionEndEventsForROP(events);
        return sentEvents;
    }

    protected List<ApEventBean> readEventsFromFile(final String file) {
        List<ApEventBean> events = null;
        try {
            events = new PlainFileParser(file).parse();
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
        Collections.sort(events);
        return events;
    }

    protected void sendEventsAndTraceSessionWindow(List<ApEventBean> events, String windowName) {
        Queue<SessionEndEvent> sessionEnds = calcSessionEndEvents(events);
        SessionEndEvent currentEnd = sessionEnds.poll();
        for (ApEventBean e : events) {
            if (currentEnd != null && currentEnd.getTimestamp() <= e.getTimestamp()) {
                currentEnd.setTimestamp(currentEnd.getTimestamp() + 1);
                System.out.println("***Sending SESSION END: " + currentEnd.toString());
                correlationEngine.sendEvent(currentEnd);
                traceSessionWindows(windowName);
                currentEnd = sessionEnds.poll();
            }
            sendEvent((GpehBase) e);
            traceSessionWindows(windowName);

        }
        SessionEndEvent dummySessionEnd = new SessionEndEvent(FIVE_MINUTE);
        System.out.println("***Sending SESSION END: " + dummySessionEnd.toString());
        correlationEngine.sendEvent(dummySessionEnd);

    }

    protected void sendFlush() {
        SessionFlushEvent flush = new SessionFlushEvent();
        correlationEngine.sendEvent(flush);
    }

    private Queue<SessionEndEvent> calcSessionEndEvents(List<ApEventBean> events) {
        Queue<SessionEndEvent> res = new LinkedList<SessionEndEvent>();
        if (events.size() > 1) {
            long first = events.get(0).getTimestamp();
            long last = events.get(events.size() - 1).getTimestamp();
            long sessionEnd = first - (first % FIVE_MINUTE) + FIVE_MINUTE;
            while (sessionEnd < last) {
                res.add(new SessionEndEvent(sessionEnd));
                sessionEnd += FIVE_MINUTE;
            }
        }
        return res;
    }

    protected List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED> getHandovers() {
        final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED> handovers = new ArrayList<INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED>();
        final List<EventBean[]> output = sessionListener.getNewDataList();
        for (final EventBean[] eventBeans : output) {
            for (final EventBean eventBean : eventBeans) {
                final Object underlyingObject = eventBean.getUnderlying();
                if (underlyingObject instanceof INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED) {
                    handovers.add((INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED) underlyingObject);
                }
            }
        }

        return handovers;
    }

    protected List<INTERNAL_SOHO_DS_MISSING_NEIGHBOUR_ENRICHED> getSohos() {
        final List<INTERNAL_SOHO_DS_MISSING_NEIGHBOUR_ENRICHED> sohos = new ArrayList<INTERNAL_SOHO_DS_MISSING_NEIGHBOUR_ENRICHED>();
        final List<EventBean[]> output = sessionListener.getNewDataList();
        for (final EventBean[] eventBeans : output) {
            for (final EventBean eventBean : eventBeans) {
                final Object underlyingObject = eventBean.getUnderlying();
                if (underlyingObject instanceof INTERNAL_SOHO_DS_MISSING_NEIGHBOUR_ENRICHED) {
                    sohos.add((INTERNAL_SOHO_DS_MISSING_NEIGHBOUR_ENRICHED) underlyingObject);
                }
            }
        }

        return sohos;
    }

    protected List<TCP_REPORT_ENRICHEDHelper> getTcpReports() {
        List<TCP_REPORT_ENRICHEDHelper> reports = new ArrayList<TCP_REPORT_ENRICHEDHelper>();
        final List<EventBean[]> output = sessionListener.getNewDataList();
        for (final EventBean[] eventBeans : output) {
            for (final EventBean eventBean : eventBeans) {
                final Object underlyingObject = eventBean.getUnderlying();
                if (underlyingObject instanceof TCP_REPORT_ENRICHEDHelper) {
                    reports.add((TCP_REPORT_ENRICHEDHelper) underlyingObject);
                }
            }
        }

        return reports;
    }

    protected List<CLASSIFICATION_REPORT> getClassificationReports() {
        List<CLASSIFICATION_REPORT> reports = new ArrayList<CLASSIFICATION_REPORT>();
        final List<EventBean[]> output = sessionListener.getNewDataList();
        for (final EventBean[] eventBeans : output) {
            for (final EventBean eventBean : eventBeans) {
                final Object underlyingObject = eventBean.getUnderlying();
                if (underlyingObject instanceof CLASSIFICATION_REPORT) {
                    reports.add((CLASSIFICATION_REPORT) underlyingObject);
                }
            }
        }

        return reports;
    }

    protected List<EnhancedVisitedCell> getVisitedCellsCreated() {
        final List<EventBean[]> eventList = sessionListener.getNewDataList();
        final List<EnhancedVisitedCell> cells = new ArrayList<EnhancedVisitedCell>();
        for (final EventBean[] eventBeans : eventList) {
            for (final EventBean eventBean : eventBeans) {
                if (eventBean.getUnderlying() instanceof EnhancedVisitedCell) {
                    final EnhancedVisitedCell cell = (EnhancedVisitedCell) eventBean.getUnderlying();
                    cells.add(cell);
                }

            }
        }
        return cells;
    }
}