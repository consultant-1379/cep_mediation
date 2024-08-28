/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2015
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.cepmediation.correlation.radio.cfa;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.INR_ENABLED_INFO;
import com.ericsson.cepmediation.apeventbeans.correlation.RAB_ESTABLISH_CELL_AGGR;
import com.ericsson.cepmediation.apeventbeans.correlation.RAB_ESTABLISH_INFO;
import com.ericsson.cepmediation.apeventbeans.correlation.RAB_ESTABLISH_RNC_AGGR;
import com.ericsson.cepmediation.correlation.radio.RadioCorrelationBase;
import com.ericsson.cepmediation.correlation.radio.utils.Statements;
import com.ericsson.cepmediation.correlation.stubs.Util;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.scopetest.SupportUpdateListener;

import java.lang.reflect.*;

public class InternalNormalReleaseTest extends RadioCorrelationBase {

    private static final String CFA_RAB_ESTABLISHMENT_RAB_ESTABLISHMENTS_TXT = "cfa/rabEstablishment/rabEstablishments.txt";

    private static final String CFA_RAB_ESTABLISHMENT_RAB_ESTABLISHMENT_WITH_INR_TXT = "cfa/rabEstablishment/rabEstablishmentWithINR.txt";

    private static final String ESPER_CFA_EPL = "esper/cfa.epl";

    private static final String ESPER_CFA_HFA_COMMON_EPL = "esper/cfa_hfa_common.epl";

    private static final String ESPER_RAW_EVENTS_BASE_EPL = "esper/raw_events_base.epl";

    private static final String WRONG_PATH = "/proj/cep/dummyPath";

    private static final int CELL_ID_2 = 1111;

    private static final int CELL_ID_1 = 5246;

    private static final String RNC09_TXT = "RNC09.txt";

    private static final int RNC_ID_1 = 2;

    private static final int RNC_ID_2 = 9;

    private static final int sleepTime = 5000;

    private static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";

    // This date formatter is required to format dates into UTC
    private static final DateFormat dateFormat = new SimpleDateFormat(
            DATE_TIME_FORMAT);

    protected static final String TIME_ZONE = "UTC";

    // Set the time zone for the formatter as UTC
    static {
        dateFormat.setTimeZone(TimeZone.getTimeZone(TIME_ZONE));
    }

    @Before
    public void setupListeners() throws Exception {
        configureEsper(ESPER_RAW_EVENTS_BASE_EPL, ESPER_CFA_HFA_COMMON_EPL,
                ESPER_CFA_EPL);
        sessionListener = new SupportUpdateListener();
    }

    @Test
    public void isDummyAddedToWindow() throws Exception {
        int event = processFileforInr(CFA_RAB_ESTABLISHMENT_RAB_ESTABLISHMENT_WITH_INR_TXT);
        Thread.sleep(sleepTime);

        final List<INR_ENABLED_INFO> events = getINRInfo();
        assertThat(event, is(17)); // 16 events are there in the text file,
                                   // extra one event is dummy event, thats why
                                   // count is 17
        ClassLoader loader = Util.class.getClassLoader();
        File file = null;
        file = new File(loader.getResource("").getPath() + RNC09_TXT);
        file.delete();

    }

    @Test
    public void areRabsEstablishmentsAddedToWindowWithINR() throws Exception {
        addStatementAndListener(Statements.CLEANUP_RABESTABLISHMENT_WINDOW,
                sessionListener);

        processFile(CFA_RAB_ESTABLISHMENT_RAB_ESTABLISHMENT_WITH_INR_TXT);
        Thread.sleep(sleepTime);

        final List<RAB_ESTABLISH_INFO> events = getRABInfo();
        for (final RAB_ESTABLISH_INFO event : events) {
            final RAB_ESTABLISH_INFO rabInfo = (RAB_ESTABLISH_INFO) event;

            assertThat(rabInfo.getVALID(), is(true));
            ClassLoader loader = Util.class.getClassLoader();
            File file = null;
            file = new File(loader.getResource("").getPath() + RNC09_TXT);
            file.delete();
            if (rabInfo.getRNC_ID_1() == RNC_ID_2) {
                System.out.println(rabInfo.getDecodedString());
            }
            assertThat(events.size(), is(15));
        }

    }

    @Test
    public void areRabsAggregatedToRNCwithINRActivatedAndRecieved()
            throws Exception {

        addStatementAndListener(Statements.AGGREGATE_RAB_TO_RNC_RESULTS,
                sessionListener);

        processFile(CFA_RAB_ESTABLISHMENT_RAB_ESTABLISHMENT_WITH_INR_TXT);
        Thread.sleep(sleepTime);

        final List<RAB_ESTABLISH_RNC_AGGR> aggregations = getRNCAggs();
        assertThat(aggregations.size(), is(2));

        for (final RAB_ESTABLISH_RNC_AGGR aggregation : aggregations) {
            final RAB_ESTABLISH_RNC_AGGR rncAggr = (RAB_ESTABLISH_RNC_AGGR) aggregation;
            if (rncAggr.getRNC_ID() == RNC_ID_2) {
                assertThat(rncAggr.getINR_ACTIVATED(), is(true));
                assertThat(rncAggr.getINR_RECEIVED(), is(true));
            }
            ClassLoader loader = Util.class.getClassLoader();
            File file = null;
            file = new File(loader.getResource("").getPath() + RNC09_TXT);
            file.delete();
        }
    }

    @Test
    public void areRabsAggregatedToRNCwithINR() throws Exception {

        addStatementAndListener(Statements.AGGREGATE_RAB_TO_RNC_RESULTS,
                sessionListener);

        processFile(CFA_RAB_ESTABLISHMENT_RAB_ESTABLISHMENT_WITH_INR_TXT);
        Thread.sleep(sleepTime);

        final List<RAB_ESTABLISH_RNC_AGGR> aggregations = getRNCAggs();
        assertThat(aggregations.size(), is(2));

        for (final RAB_ESTABLISH_RNC_AGGR aggregation : aggregations) {
            final RAB_ESTABLISH_RNC_AGGR rncAggr = (RAB_ESTABLISH_RNC_AGGR) aggregation;
            if (rncAggr.getRNC_ID() == RNC_ID_2) {
                assertThat(rncAggr.getCALLS_PS_ALL(), is(8));
                assertThat(rncAggr.getCALLS_CS_ALL(), is(4));
                assertThat(rncAggr.getCALLS_MR_ALL(), is(2));
                assertThat(rncAggr.getPS_SUC(), is(6));
                assertThat(rncAggr.getCS_SUC(), is(1));
                assertThat(rncAggr.getMR_SUC(), is(1));
                assertThat(rncAggr.getINR_ACTIVATED(), is(true));
                assertThat(rncAggr.getINR_RECEIVED(), is(true));
            }
            if (rncAggr.getRNC_ID() == RNC_ID_1) {
                assertThat(rncAggr.getCALLS_PS_ALL(), is(2));
                assertThat(rncAggr.getCALLS_CS_ALL(), is(0));
                assertThat(rncAggr.getCALLS_MR_ALL(), is(0));
                assertThat(rncAggr.getPS_SUC(), is(0));
                assertThat(rncAggr.getCS_SUC(), is(0));
                assertThat(rncAggr.getMR_SUC(), is(0));
                assertThat(rncAggr.getINR_ACTIVATED(), is(true));
                assertThat(rncAggr.getINR_RECEIVED(), is(false));
            }
            System.out.println(rncAggr.getDecodedString());
            ClassLoader loader = Util.class.getClassLoader();
            File file = null;
            file = new File(loader.getResource("").getPath() + RNC09_TXT);
            file.delete();
        }
    }

    @Test
    public void areRabsAggregatedToCellWithINRActivatedAndRecieved()
            throws Exception {
        addStatementAndListener(Statements.AGGREGATE_RAB_TO_CELL_RESULTS,
                sessionListener);

        processFile(CFA_RAB_ESTABLISHMENT_RAB_ESTABLISHMENT_WITH_INR_TXT);
        Thread.sleep(sleepTime);

        final List<RAB_ESTABLISH_CELL_AGGR> aggregations = getCellAggs();
        assertThat(aggregations.size(), is(3));
        for (final RAB_ESTABLISH_CELL_AGGR aggregation : aggregations) {
            final RAB_ESTABLISH_CELL_AGGR cellAggr = (RAB_ESTABLISH_CELL_AGGR) aggregation;
            if (cellAggr.getRNC_ID() == RNC_ID_2) {
                if (cellAggr.getC_ID() == CELL_ID_1) {
                    assertThat(cellAggr.getINR_ACTIVATED(), is(true));
                    assertThat(cellAggr.getINR_RECEIVED(), is(true));
                } else {
                    // C_ID = 1111
                    assertThat(cellAggr.getPS_SUC(), is(0));
                    assertThat(cellAggr.getCS_SUC(), is(0));
                    assertThat(cellAggr.getMR_SUC(), is(0));
                    assertThat(cellAggr.getINR_ACTIVATED(), is(true));
                    assertThat(cellAggr.getINR_RECEIVED(), is(false));
                }
                ClassLoader loader = Util.class.getClassLoader();
                File file = null;
                file = new File(loader.getResource("").getPath() + RNC09_TXT);
                file.delete();
            }
        }
    }

    @Test
    public void areRabsAggregatedToCellWithINR() throws Exception {
        addStatementAndListener(Statements.AGGREGATE_RAB_TO_CELL_RESULTS,
                sessionListener);

        processFile(CFA_RAB_ESTABLISHMENT_RAB_ESTABLISHMENT_WITH_INR_TXT);
        Thread.sleep(sleepTime);

        final List<RAB_ESTABLISH_CELL_AGGR> aggregations = getCellAggs();
        assertThat(aggregations.size(), is(3));

        for (final RAB_ESTABLISH_CELL_AGGR aggregation : aggregations) {
            final RAB_ESTABLISH_CELL_AGGR cellAggr = (RAB_ESTABLISH_CELL_AGGR) aggregation;
            if (cellAggr.getRNC_ID() == RNC_ID_2) {
                if (cellAggr.getC_ID() == CELL_ID_1) {
                    assertThat(cellAggr.getCALLS_PS_ALL(), is(4));
                    assertThat(cellAggr.getCALLS_CS_ALL(), is(2));
                    assertThat(cellAggr.getCALLS_MR_ALL(), is(1));
                    assertThat(cellAggr.getPS_SUC(), is(6));
                    assertThat(cellAggr.getCS_SUC(), is(1));
                    assertThat(cellAggr.getMR_SUC(), is(1));
                    assertThat(cellAggr.getINR_ACTIVATED(), is(true));
                    assertThat(cellAggr.getINR_RECEIVED(), is(true));
                } else {
                    // C_ID = 1111
                    assertThat(cellAggr.getCALLS_PS_ALL(), is(4));
                    assertThat(cellAggr.getCALLS_CS_ALL(), is(2));
                    assertThat(cellAggr.getCALLS_MR_ALL(), is(1));
                    assertThat(cellAggr.getPS_SUC(), is(0));
                    assertThat(cellAggr.getCS_SUC(), is(0));
                    assertThat(cellAggr.getMR_SUC(), is(0));
                    assertThat(cellAggr.getINR_ACTIVATED(), is(true));
                    assertThat(cellAggr.getINR_RECEIVED(), is(false));
                }
            }
            if (cellAggr.getRNC_ID() == RNC_ID_1) {
                {

                    if (cellAggr.getC_ID() == CELL_ID_2) {
                        assertThat(cellAggr.getCALLS_PS_ALL(), is(2));
                        assertThat(cellAggr.getCALLS_CS_ALL(), is(0));
                        assertThat(cellAggr.getCALLS_MR_ALL(), is(0));
                        assertThat(cellAggr.getPS_SUC(), is(0));
                        assertThat(cellAggr.getCS_SUC(), is(0));
                        assertThat(cellAggr.getMR_SUC(), is(0));
                        assertThat(cellAggr.getINR_ACTIVATED(), is(true));
                        assertThat(cellAggr.getINR_RECEIVED(), is(false));

                    }
                    addStatementAndListener(
                            Statements.CLEANUP_RABESTABLISHMENT_WINDOW,
                            sessionListener);
                    ClassLoader loader = Util.class.getClassLoader();
                    File file = null;
                    file = new File(loader.getResource("").getPath()
                            + RNC09_TXT);
                    file.delete();
                }
            }
        }
    }

    @Test
    public void isfileCreated() throws Exception {

        addStatementAndListener(Statements.CLEANUP_RABESTABLISHMENT_WINDOW,
                sessionListener);

        processFile(CFA_RAB_ESTABLISHMENT_RAB_ESTABLISHMENT_WITH_INR_TXT);
        Thread.sleep(sleepTime);
        final List<RAB_ESTABLISH_INFO> events = getRABInfo();
        File file = null;
        ClassLoader loader = Util.class.getClassLoader();
        file = new File(loader.getResource("").getPath() + RNC09_TXT);
        assertThat(file.exists(), is(true));
        file.delete();
        assertThat(file.exists(), is(false));
    }

    @Test
    public void isfilePathCorrect() throws Exception {
        addStatementAndListener(Statements.CLEANUP_RABESTABLISHMENT_WINDOW,
                sessionListener);
        processFile(CFA_RAB_ESTABLISHMENT_RAB_ESTABLISHMENT_WITH_INR_TXT);
        Thread.sleep(sleepTime);
        final List<RAB_ESTABLISH_INFO> events = getRABInfo();
        File file = null;
        ClassLoader loader = Util.class.getClassLoader();
        file = new File(loader.getResource("").getPath() + RNC09_TXT);
        assertThat(file.getPath(), is(loader.getResource("").getPath()
                + RNC09_TXT));
        file.delete();
        assertThat(file.exists(), is(false));
    }

    @Test
    public void inCorrectFilePath() throws Exception {
        addStatementAndListener(Statements.CLEANUP_RABESTABLISHMENT_WINDOW,
                sessionListener);
        processFile(CFA_RAB_ESTABLISHMENT_RAB_ESTABLISHMENT_WITH_INR_TXT);
        Thread.sleep(sleepTime);
        try {
            final List<RAB_ESTABLISH_INFO> events = getRABInfo();
            File file = null;
            ClassLoader loader = Util.class.getClassLoader();
            file = new File(WRONG_PATH + RNC09_TXT);
            assertThat(file.exists(), is(false));
            file.delete();
            assertThat(file.exists(), is(false));
        } catch (Exception e) {
            System.out.println("Incorrect Path");

        }
    }

    @Test
    public void isfileNameCorrect() throws Exception {
        processFile(CFA_RAB_ESTABLISHMENT_RAB_ESTABLISHMENT_WITH_INR_TXT);
        addStatementAndListener(Statements.CLEANUP_RABESTABLISHMENT_WINDOW,
                sessionListener);
        Thread.sleep(sleepTime);
        final List<RAB_ESTABLISH_INFO> events = getRABInfo();
        File file = null;
        ClassLoader loader = Util.class.getClassLoader();
        file = new File(loader.getResource("").getPath() + RNC09_TXT);
        assertThat(file.getName(), is(RNC09_TXT));
        file.delete();
        assertThat(file.exists(), is(false));

    }

    @Test
    public void isFilePermissionCorrect() throws Exception {
        processFile(CFA_RAB_ESTABLISHMENT_RAB_ESTABLISHMENT_WITH_INR_TXT);
        addStatementAndListener(Statements.CLEANUP_RABESTABLISHMENT_WINDOW,
                sessionListener);
        Thread.sleep(sleepTime);
        final List<RAB_ESTABLISH_INFO> events = getRABInfo();
        File file = null;
        ClassLoader loader = Util.class.getClassLoader();
        file = new File(loader.getResource("").getPath() + RNC09_TXT);
        assertThat(file.getName(), is(RNC09_TXT));
        assertThat(file.canExecute(), is(false));
        assertThat(file.canRead(), is(true));
        assertThat(file.canWrite(), is(false));
        file.delete();
        assertThat(file.exists(), is(false));

    }

    @Test
    public void filedoesNotExistIfINRdoesNotCome() throws Exception {
        processFile(CFA_RAB_ESTABLISHMENT_RAB_ESTABLISHMENTS_TXT);
        addStatementAndListener(Statements.CLEANUP_RABESTABLISHMENT_WINDOW,
                sessionListener);
        Thread.sleep(sleepTime);
        File file = null;
        ClassLoader loader = Util.class.getClassLoader();

        file = new File(loader.getResource("").getPath() + RNC09_TXT);

        assertThat(file.exists(), is(false));
        file.delete();
        assertThat(file.exists(), is(false));

    }

    protected List<INR_ENABLED_INFO> getINRInfo() {
        final List<EventBean[]> eventList = sessionListener.getNewDataList();
        final List<INR_ENABLED_INFO> events = new ArrayList<INR_ENABLED_INFO>();
        for (final EventBean[] eventBeans : eventList) {
            for (final EventBean eventBean : eventBeans) {
                if (eventBean.getUnderlying() instanceof INR_ENABLED_INFO) {
                    final INR_ENABLED_INFO event = (INR_ENABLED_INFO) eventBean
                            .getUnderlying();
                    events.add(event);
                }

            }
        }
        return events;
    }

    protected List<RAB_ESTABLISH_INFO> getRABInfo() {
        final List<EventBean[]> eventList = sessionListener.getNewDataList();
        final List<RAB_ESTABLISH_INFO> events = new ArrayList<RAB_ESTABLISH_INFO>();
        for (final EventBean[] eventBeans : eventList) {
            for (final EventBean eventBean : eventBeans) {
                if (eventBean.getUnderlying() instanceof RAB_ESTABLISH_INFO) {
                    final RAB_ESTABLISH_INFO event = (RAB_ESTABLISH_INFO) eventBean
                            .getUnderlying();
                    events.add(event);
                }
            }
        }
        return events;

    }

    protected List<RAB_ESTABLISH_RNC_AGGR> getRNCAggs() {
        final List<EventBean[]> eventList = sessionListener.getNewDataList();
        final List<RAB_ESTABLISH_RNC_AGGR> events = new ArrayList<RAB_ESTABLISH_RNC_AGGR>();
        for (final EventBean[] eventBeans : eventList) {
            for (final EventBean eventBean : eventBeans) {
                if (eventBean.getUnderlying() instanceof RAB_ESTABLISH_RNC_AGGR) {
                    final RAB_ESTABLISH_RNC_AGGR event = (RAB_ESTABLISH_RNC_AGGR) eventBean
                            .getUnderlying();
                    events.add(event);
                }

            }
        }
        return events;

    }

    protected List<RAB_ESTABLISH_CELL_AGGR> getCellAggs() {
        final List<EventBean[]> eventList = sessionListener.getNewDataList();
        final List<RAB_ESTABLISH_CELL_AGGR> events = new ArrayList<RAB_ESTABLISH_CELL_AGGR>();
        for (final EventBean[] eventBeans : eventList) {
            for (final EventBean eventBean : eventBeans) {
                if (eventBean.getUnderlying() instanceof RAB_ESTABLISH_CELL_AGGR) {
                    final RAB_ESTABLISH_CELL_AGGR event = (RAB_ESTABLISH_CELL_AGGR) eventBean
                            .getUnderlying();
                    events.add(event);
                }

            }
        }
        return events;

    }
}