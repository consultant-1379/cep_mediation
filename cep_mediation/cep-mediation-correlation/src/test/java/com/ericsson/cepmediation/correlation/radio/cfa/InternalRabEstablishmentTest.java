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

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.RAB_ESTABLISH_CELL_AGGR;
import com.ericsson.cepmediation.apeventbeans.correlation.RAB_ESTABLISH_INFO;
import com.ericsson.cepmediation.apeventbeans.correlation.RAB_ESTABLISH_RNC_AGGR;
import com.ericsson.cepmediation.apeventbeans.correlation.INR_ENABLED_INFO;
import com.ericsson.cepmediation.correlation.radio.RadioCorrelationBase;
import com.ericsson.cepmediation.correlation.radio.utils.Statements;
import com.ericsson.cepmediation.correlation.stubs.Util;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.scopetest.SupportUpdateListener;
import com.ericsson.cepmediation.correlation.enrichment.InternalNormalReleaseSetValue;

public class InternalRabEstablishmentTest extends RadioCorrelationBase {

    private static final int CELL_ID_1 = 5246;

    private static final String RNC09_TXT = "RNC09.txt";

    private static final int RNC_ID_6 = 13;

    private static final int RNC_ID_5 = 12;

    private static final int RNC_ID_4 = 11;

    private static final int RNC_ID_3 = 2;

    private static final int RNC_ID_1 = 1;

    private static final int RNC_ID_2 = 9;

    private static final int sleepTime = 5000;

    // RAB_ESTABLISH_INFO rabInfoOb = new RAB_ESTABLISH_INFO();

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
        configureEsper("esper/raw_events_base.epl", "esper/cfa_hfa_common.epl",
                "esper/cfa.epl");
        sessionListener = new SupportUpdateListener();

    }

    @Test
    public void areRabsEstablishmentsAddedToWindow() throws Exception {
        addStatementAndListener(Statements.CLEANUP_RABESTABLISHMENT_WINDOW,
                sessionListener);

        processFile("cfa/rabEstablishment/rabEstablishments.txt");
        Thread.sleep(sleepTime);

        final List<RAB_ESTABLISH_INFO> events = getRABInfo();
        assertThat(events.size(), is(20));

        for (final RAB_ESTABLISH_INFO event : events) {
            RAB_ESTABLISH_INFO rabInfo = (RAB_ESTABLISH_INFO) event;
            {
                assertThat(rabInfo.getVALID(), is(false));
            }

            if (rabInfo.getRNC_ID_1() == RNC_ID_2) {
                System.out.println(rabInfo.getDecodedString());
            }
        }
    }

    @Test
    public void areRabsAggregatedToRNC() throws Exception {
        addStatementAndListener(Statements.AGGREGATE_RAB_TO_RNC_RESULTS,
                sessionListener);

        processFile("cfa/rabEstablishment/rabEstablishments.txt");
        Thread.sleep(sleepTime);

        final List<RAB_ESTABLISH_RNC_AGGR> aggregations = getRNCAggs();
        assertThat(aggregations.size(), is(3));

        for (final RAB_ESTABLISH_RNC_AGGR aggregation : aggregations) {
            final RAB_ESTABLISH_RNC_AGGR rncAggr = (RAB_ESTABLISH_RNC_AGGR) aggregation;

            if (rncAggr.getRNC_ID() == RNC_ID_2) {
                assertThat(rncAggr.getCALLS_PS_ALL(), is(12));
                assertThat(rncAggr.getCALLS_CS_ALL(), is(6));
                assertThat(rncAggr.getCALLS_MR_ALL(), is(3));

                assertThat(rncAggr.getPS_SUC(), is(9));
                assertThat(rncAggr.getCS_SUC(), is(3));
                assertThat(rncAggr.getMR_SUC(), is(0));
                assertThat(rncAggr.getINR_ACTIVATED(),is(false));
                assertThat(rncAggr.getINR_RECEIVED(),is(false));

            } else if (rncAggr.getRNC_ID() == 1) {
                assertThat(rncAggr.getCALLS_PS_ALL(), is(4));
                assertThat(rncAggr.getCALLS_CS_ALL(), is(2));
                assertThat(rncAggr.getCALLS_MR_ALL(), is(1));
                assertThat(rncAggr.getPS_SUC(), is(3));
                assertThat(rncAggr.getCS_SUC(), is(1));
                assertThat(rncAggr.getMR_SUC(), is(0));
                assertThat(rncAggr.getINR_ACTIVATED(),is(false));
                assertThat(rncAggr.getINR_RECEIVED(),is(false));
            }

            else {
                // RNC Id is 2
                assertThat(rncAggr.getCALLS_PS_ALL(), is(4));
                assertThat(rncAggr.getCALLS_CS_ALL(), is(2));
                assertThat(rncAggr.getCALLS_MR_ALL(), is(1));

                assertThat(rncAggr.getPS_SUC(), is(3));
                assertThat(rncAggr.getCS_SUC(), is(1));
                assertThat(rncAggr.getMR_SUC(), is(0));
                assertThat(rncAggr.getINR_ACTIVATED(),is(false));
                assertThat(rncAggr.getINR_RECEIVED(),is(false));
            }

            System.out.println(rncAggr.getDecodedString());
        }

    }

    @Test
    public void areRabsAggregatedToCell() throws Exception {
        addStatementAndListener(Statements.AGGREGATE_RAB_TO_CELL_RESULTS,
                sessionListener);

        processFile("cfa/rabEstablishment/rabEstablishments.txt");
        Thread.sleep(sleepTime);

        final List<RAB_ESTABLISH_CELL_AGGR> aggregations = getCellAggs();
        assertThat(aggregations.size(), is(4));

        for (final RAB_ESTABLISH_CELL_AGGR aggregation : aggregations) {
            final RAB_ESTABLISH_CELL_AGGR cellAggr = (RAB_ESTABLISH_CELL_AGGR) aggregation;
            if (cellAggr.getRNC_ID() == RNC_ID_2) {
                if (cellAggr.getC_ID() == CELL_ID_1) {
                    assertThat(cellAggr.getCALLS_PS_ALL(), is(8));
                    assertThat(cellAggr.getCALLS_CS_ALL(), is(4));
                    assertThat(cellAggr.getCALLS_MR_ALL(), is(2));

                    assertThat(cellAggr.getPS_SUC(), is(6));
                    assertThat(cellAggr.getCS_SUC(), is(2));
                    assertThat(cellAggr.getMR_SUC(), is(0));
                    assertThat(cellAggr.getINR_ACTIVATED(),is(false));
                    assertThat(cellAggr.getINR_RECEIVED(),is(false));
                }

                else {
                    // C_ID = 1111
                    assertThat(cellAggr.getCALLS_PS_ALL(), is(4));
                    assertThat(cellAggr.getCALLS_CS_ALL(), is(2));
                    assertThat(cellAggr.getCALLS_MR_ALL(), is(1));

                    assertThat(cellAggr.getPS_SUC(), is(3));
                    assertThat(cellAggr.getCS_SUC(), is(1));
                    assertThat(cellAggr.getMR_SUC(), is(0));
                    assertThat(cellAggr.getINR_ACTIVATED(),is(false));
                    assertThat(cellAggr.getINR_RECEIVED(),is(false));
                }
            }

            else if (cellAggr.getRNC_ID() == RNC_ID_1) {
                assertThat(cellAggr.getCALLS_PS_ALL(), is(4));
                assertThat(cellAggr.getCALLS_CS_ALL(), is(2));
                assertThat(cellAggr.getCALLS_MR_ALL(), is(1));

                assertThat(cellAggr.getPS_SUC(), is(3));
                assertThat(cellAggr.getCS_SUC(), is(1));
                assertThat(cellAggr.getMR_SUC(), is(0));
                assertThat(cellAggr.getINR_ACTIVATED(),is(false));
                assertThat(cellAggr.getINR_RECEIVED(),is(false));
            }

            else {
                // RNC Id is 2
                assertThat(cellAggr.getCALLS_PS_ALL(), is(4));
                assertThat(cellAggr.getCALLS_CS_ALL(), is(2));
                assertThat(cellAggr.getCALLS_MR_ALL(), is(1));

                assertThat(cellAggr.getPS_SUC(), is(3));
                assertThat(cellAggr.getCS_SUC(), is(1));
                assertThat(cellAggr.getMR_SUC(), is(0));
                assertThat(cellAggr.getINR_ACTIVATED(),is(false));
                assertThat(cellAggr.getINR_RECEIVED(),is(false));
            }

            System.out.println(cellAggr.getDecodedString());
        }

    }

    @Test
    public void areRncRabAggregationsWithCorrectTimestamp() throws Exception {
        addStatementAndListener(Statements.AGGREGATE_RAB_TO_RNC_RESULTS,
                sessionListener);

        processFile("cfa/rabEstablishment/rabEstablishmentRop.txt");
        Thread.sleep(sleepTime);

        final List<RAB_ESTABLISH_RNC_AGGR> aggregations = getRNCAggs();

        assertThat(aggregations.size(), is(6));

        for (final RAB_ESTABLISH_RNC_AGGR rncAggr : aggregations) {

            final String time = dateFormat.format(new Date(rncAggr
                    .getTimestamp()));

            if (rncAggr.getRNC_ID() == RNC_ID_2) {
                assertThat(time, is("2012-05-17 21:30:00.000"));
                assertThat(rncAggr.getCALLS_PS_ALL(), is(12));
                assertThat(rncAggr.getCALLS_CS_ALL(), is(6));
                assertThat(rncAggr.getCALLS_MR_ALL(), is(3));
                assertThat(rncAggr.getINR_ACTIVATED(),is(false));
                assertThat(rncAggr.getINR_RECEIVED(),is(false));
            }

            else if (rncAggr.getRNC_ID() == RNC_ID_1) {
                assertThat(time, is("2012-05-17 19:00:00.000"));
                assertThat(rncAggr.getCALLS_PS_ALL(), is(4));
                assertThat(rncAggr.getCALLS_CS_ALL(), is(2));
                assertThat(rncAggr.getCALLS_MR_ALL(), is(1));
                assertThat(rncAggr.getPS_SUC(), is(3));
                assertThat(rncAggr.getCS_SUC(), is(1));
                assertThat(rncAggr.getMR_SUC(), is(0));
                assertThat(rncAggr.getINR_ACTIVATED(),is(false));
                assertThat(rncAggr.getINR_RECEIVED(),is(false));
            }

            else if ((rncAggr.getRNC_ID() == RNC_ID_3)) {
                assertThat(time, is("2012-05-17 19:00:00.000"));
                assertThat(rncAggr.getCALLS_PS_ALL(), is(4));
                assertThat(rncAggr.getCALLS_CS_ALL(), is(2));
                assertThat(rncAggr.getCALLS_MR_ALL(), is(1));
                assertThat(rncAggr.getPS_SUC(), is(3));
                assertThat(rncAggr.getCS_SUC(), is(1));
                assertThat(rncAggr.getMR_SUC(), is(0));
                assertThat(rncAggr.getINR_ACTIVATED(),is(false));
                assertThat(rncAggr.getINR_RECEIVED(),is(false));

            } else if ((rncAggr.getRNC_ID() == RNC_ID_4)) {
                assertThat(time, is("2012-05-17 19:15:00.000"));
                assertThat(rncAggr.getCALLS_PS_ALL(), is(4));
                assertThat(rncAggr.getCALLS_CS_ALL(), is(2));
                assertThat(rncAggr.getCALLS_MR_ALL(), is(1));

                assertThat(rncAggr.getPS_SUC(), is(3));
                assertThat(rncAggr.getCS_SUC(), is(1));
                assertThat(rncAggr.getMR_SUC(), is(0));
                assertThat(rncAggr.getINR_ACTIVATED(),is(false));
                assertThat(rncAggr.getINR_RECEIVED(),is(false));
            } else if ((rncAggr.getRNC_ID() == RNC_ID_5)) {
                assertThat(time, is("2012-05-17 19:15:00.000"));
                assertThat(rncAggr.getCALLS_PS_ALL(), is(4));
                assertThat(rncAggr.getCALLS_CS_ALL(), is(2));
                assertThat(rncAggr.getCALLS_MR_ALL(), is(1));

                assertThat(rncAggr.getPS_SUC(), is(3));
                assertThat(rncAggr.getCS_SUC(), is(1));
                assertThat(rncAggr.getMR_SUC(), is(0));
                assertThat(rncAggr.getINR_ACTIVATED(),is(false));
                assertThat(rncAggr.getINR_RECEIVED(),is(false));
            } else if ((rncAggr.getRNC_ID() == RNC_ID_6)) {
                assertThat(time, is("2012-05-17 21:30:00.000"));
                assertThat(rncAggr.getCALLS_PS_ALL(), is(4));
                assertThat(rncAggr.getCALLS_CS_ALL(), is(2));
                assertThat(rncAggr.getCALLS_MR_ALL(), is(1));

                assertThat(rncAggr.getPS_SUC(), is(3));
                assertThat(rncAggr.getCS_SUC(), is(1));
                assertThat(rncAggr.getMR_SUC(), is(0));
                assertThat(rncAggr.getINR_ACTIVATED(),is(false));
                assertThat(rncAggr.getINR_RECEIVED(),is(false));
            } else {
                fail("Unexpected RNC ID: " + rncAggr.getDecodedString());
            }

            System.out.println(rncAggr.getDecodedString());
        }
    }

    @Test
    public void areCellAggregationsWithCorrectTimestamp() throws Exception {
        addStatementAndListener(Statements.AGGREGATE_RAB_TO_CELL_RESULTS,
                sessionListener);

        processFile("cfa/rabEstablishment/rabEstablishmentRop.txt");
        Thread.sleep(sleepTime);

        final List<RAB_ESTABLISH_CELL_AGGR> aggregations = getCellAggs();
        assertThat(aggregations.size(), is(7));

        for (final RAB_ESTABLISH_CELL_AGGR aggregation : aggregations) {
            final RAB_ESTABLISH_CELL_AGGR cellAggr = (RAB_ESTABLISH_CELL_AGGR) aggregation;
            if (cellAggr.getRNC_ID() == RNC_ID_2) {
                final String time = dateFormat.format(new Date(cellAggr
                        .getTimestamp()));

                assertThat(time, is("2012-05-17 21:30:00.000"));
                if (cellAggr.getC_ID() == CELL_ID_1) {
                    assertThat(cellAggr.getCALLS_PS_ALL(), is(8));
                    assertThat(cellAggr.getCALLS_CS_ALL(), is(4));
                    assertThat(cellAggr.getCALLS_MR_ALL(), is(2));
                    assertThat(cellAggr.getPS_SUC(), is(6));
                    assertThat(cellAggr.getCS_SUC(), is(2));
                    assertThat(cellAggr.getMR_SUC(), is(0));
                    assertThat(cellAggr.getINR_ACTIVATED(),is(false));
                    assertThat(cellAggr.getINR_RECEIVED(),is(false));
                } else {
                    // C_ID = 1111
                    assertThat(cellAggr.getCALLS_PS_ALL(), is(4));
                    assertThat(cellAggr.getCALLS_CS_ALL(), is(2));
                    assertThat(cellAggr.getCALLS_MR_ALL(), is(1));
                    assertThat(cellAggr.getPS_SUC(), is(3));
                    assertThat(cellAggr.getCS_SUC(), is(1));
                    assertThat(cellAggr.getMR_SUC(), is(0));
                    assertThat(cellAggr.getINR_ACTIVATED(),is(false));
                    assertThat(cellAggr.getINR_RECEIVED(),is(false));
                }

            } else if (cellAggr.getRNC_ID() == RNC_ID_1) {
                assertThat(cellAggr.getCALLS_PS_ALL(), is(4));
                assertThat(cellAggr.getCALLS_CS_ALL(), is(2));
                assertThat(cellAggr.getCALLS_MR_ALL(), is(1));
                assertThat(cellAggr.getPS_SUC(), is(3));
                assertThat(cellAggr.getCS_SUC(), is(1));
                assertThat(cellAggr.getMR_SUC(), is(0));
                assertThat(cellAggr.getINR_ACTIVATED(),is(false));
                assertThat(cellAggr.getINR_RECEIVED(),is(false));
            } else {
                // RNC Id is 2
                assertThat(cellAggr.getCALLS_PS_ALL(), is(4));
                assertThat(cellAggr.getCALLS_CS_ALL(), is(2));
                assertThat(cellAggr.getCALLS_MR_ALL(), is(1));
                assertThat(cellAggr.getPS_SUC(), is(3));
                assertThat(cellAggr.getCS_SUC(), is(1));
                assertThat(cellAggr.getMR_SUC(), is(0));
                assertThat(cellAggr.getINR_ACTIVATED(),is(false));
                assertThat(cellAggr.getINR_RECEIVED(),is(false));
            }

            System.out.println(cellAggr.getDecodedString());
        }

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