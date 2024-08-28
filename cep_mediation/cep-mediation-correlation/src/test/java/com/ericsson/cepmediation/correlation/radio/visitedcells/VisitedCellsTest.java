/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2013
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/

package com.ericsson.cepmediation.correlation.radio.visitedcells;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.correlation.enrichment.EnhancedVisitedCell;
import com.ericsson.cepmediation.correlation.radio.RadioCorrelationBase;
import com.ericsson.cepmediation.test.topology.ServingCellsForTest;

public class VisitedCellsTest extends RadioCorrelationBase {
    protected static final String TIME_ZONE = "UTC";

    protected static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";

    // This date formatter is required to format dates into UTC
    protected static final DateFormat dateFormat = new SimpleDateFormat(DATE_TIME_FORMAT);
    // Set the time zone for the formatter as UTC
    static {
        dateFormat.setTimeZone(TimeZone.getTimeZone(TIME_ZONE));
    }

    @Before
    public void setup() throws Exception {
        configure("esper/vc.epl", "Visited-Cells-Enrichment");
        ServingCellsForTest.addCellScramblingCodesSavedFromDatabase();
    }

    @Test
    public void shouldPopulateVisitedCellFieldsOneCellOneSession() throws Exception {
        processFile("visitedcells/one_cell_one_session.txt");

        final List<EnhancedVisitedCell> cells = getVisitedCellsCreated();
        assertThat(cells.size(), is(1));

        final EnhancedVisitedCell cell = cells.get(0);
        assertThat(cell.getC_ID(), is(13581));
        assertThat(cell.getDURATION(), is(16));
        assertThat(cell.getIMSI(), is(454063302941012l));
        assertThat(cell.getIMSI_MCC(), is("454"));
        assertThat(cell.getIMSI_MNC(), is("06"));
        assertThat(cell.getRNC_ID(), is((short) 9));
        assertThat(cell.getRRC_SAMPLES_BC_BS(), is(0));
        assertThat(cell.getRRC_SAMPLES_BC_GS(), is(0));
        assertThat(cell.getRRC_SAMPLES_GC_GS(), is(0));
        assertThat(cell.getRRC_SAMPLES_GC_BS(), is(0));
    }

    @Test
    public void shouldOneCellOneSessionTerminatedByConnSetup() throws Exception {
        processFile("visitedcells/one_cell_one_session_terminated_by_conn_setup.txt");

        final List<EnhancedVisitedCell> cells = getVisitedCellsCreated();
        assertThat(cells.size(), is(2));

        assertAllCellsAreDifferent(cells);

        for (final EnhancedVisitedCell cell : cells) {
            if (cell.getC_ID() == 13581) {
                assertThat(cell.getDURATION(), is(7));
            } else if (cell.getC_ID() == 13582) {
                assertThat(cell.getDURATION(), is(16));
            } else {
                fail("unexpected cid: " + cell.getC_ID());
            }
            assertThat(cell.getIMSI(), is(454063302941012l));
            assertThat(cell.getIMSI_MCC(), is("454"));
            assertThat(cell.getIMSI_MNC(), is("06"));
            assertThat(cell.getRNC_ID(), is((short) 9));
            assertThat(cell.getRRC_SAMPLES_BC_BS(), is(0));
            assertThat(cell.getRRC_SAMPLES_BC_GS(), is(0));
            assertThat(cell.getRRC_SAMPLES_GC_GS(), is(0));
            assertThat(cell.getRRC_SAMPLES_GC_BS(), is(0));
        }
    }

    @Test
    public void shouldPopulateVisitedCellFieldsThreeCellsOneSession() throws Exception {
        processFile("visitedcells/three_cells_one_session.txt");

        final List<EnhancedVisitedCell> cells = getVisitedCellsCreated();
        assertThat(cells.size(), is(3));

        assertAllCellsAreDifferent(cells);

        for (final EnhancedVisitedCell cell : cells) {
            if (cell.getC_ID() == 13581) {
                assertThat(cell.getDURATION(), is(7));
            } else if (cell.getC_ID() == 13582) {
                assertThat(cell.getDURATION(), is(2));
            } else if (cell.getC_ID() == 13583) {
                assertThat(cell.getDURATION(), is(3));
            } else {
                fail("cell with unexpected id found!");
            }
            assertThat(cell.getIMSI(), is(454063302941012l));
            assertThat(cell.getIMSI_MCC(), is("454"));
            assertThat(cell.getIMSI_MNC(), is("06"));
            assertThat(cell.getRNC_ID(), is((short) 9));
            assertThat(cell.getRRC_SAMPLES_BC_BS(), is(0));
            assertThat(cell.getRRC_SAMPLES_BC_GS(), is(0));
            assertThat(cell.getRRC_SAMPLES_GC_GS(), is(0));
            assertThat(cell.getRRC_SAMPLES_GC_BS(), is(0));
        }
    }

    @Test
    public void shouldCreateZeroCellsForFirstSession() throws Exception {
        processFile("visitedcells/zero_cells_in_first_session.txt");

        final List<EnhancedVisitedCell> cells = getVisitedCellsCreated();
        assertThat(cells.size(), is(2));

        final EnhancedVisitedCell cell0 = cells.get(0);
        final EnhancedVisitedCell cell1 = cells.get(1);
        assertThat(cell0.getIMSI(), is(454063302941012l));
        assertThat(cell1.getIMSI(), is(454063302941012l));
    }

    @Test
    public void shouldCreateThreeCellsThreeSessions() throws Exception {
        processFile("visitedcells/three_cells_three_sessions.txt");

        final List<EnhancedVisitedCell> cells = getVisitedCellsCreated();
        assertThat(cells.size(), is(3));

        for (final EnhancedVisitedCell cell : cells) {
            if (cell.getC_ID() == 13581 && cell.getTimestamp() == dateFormat.parse("2012-05-17 13:01:51.443").getTime()) {
                assertThat(cell.getDURATION(), is(16));
            } else if (cell.getC_ID() == 13582
                    && cell.getTimestamp() == dateFormat.parse("2012-05-17 13:02:51.443").getTime()) {
                assertThat(cell.getDURATION(), is(15));
            } else if (cell.getC_ID() == 13585
                    && cell.getTimestamp() == dateFormat.parse("2012-05-17 13:03:51.443").getTime()) {
                assertThat(cell.getDURATION(), is(14));
            } else {
                fail("Cell not found!");
            }
            assertThat(cell.getIMSI(), is(454063302941012l));
            assertThat(cell.getIMSI_MCC(), is("454"));
            assertThat(cell.getIMSI_MNC(), is("06"));
            assertThat(cell.getRNC_ID(), is((short) 9));
            assertThat(cell.getRRC_SAMPLES_BC_BS(), is(0));
            assertThat(cell.getRRC_SAMPLES_BC_GS(), is(0));
            assertThat(cell.getRRC_SAMPLES_GC_GS(), is(0));
            assertThat(cell.getRRC_SAMPLES_GC_BS(), is(0));
        }
    }

    @Test
    public void shouldComputeRrcMeasurementsOneCell() throws Exception {
        processFile("visitedcells/one_cell_one_session_rrc_meas.txt");

        final List<EnhancedVisitedCell> cells = getVisitedCellsCreated();
        assertThat(cells.size(), is(1));

        // ecno = 3 -> -23 < -14
        // rscp = 4 -> -113 < -100
        // RSCP_THRESHOLD = -100
        // ECNO_THRESHOLD = -14;
        final EnhancedVisitedCell cell = cells.get(0);
        assertThat(cell.getC_ID(), is(4843));
        assertThat(cell.getDURATION(), is(2016));
        assertThat(cell.getIMSI(), is(454063302941012l));
        assertThat(cell.getIMSI_MCC(), is("454"));
        assertThat(cell.getIMSI_MNC(), is("06"));
        assertThat(cell.getRNC_ID(), is((short) 9));
        assertThat(cell.getRRC_SAMPLES_BC_BS(), is(2));
        assertThat(cell.getRRC_SAMPLES_BC_GS(), is(0));
        assertThat(cell.getRRC_SAMPLES_GC_GS(), is(1));
        assertThat(cell.getRRC_SAMPLES_GC_BS(), is(0));
    }

    @Test
    public void shouldComputeRrcFourCellsOneSession() throws Exception {
        processFile("visitedcells/four_cells_one_session_rrc_meas.txt");

        final List<EnhancedVisitedCell> cells = getVisitedCellsCreated();
        assertThat(cells.size(), is(4));

        assertAllCellsAreDifferent(cells);

        for (final EnhancedVisitedCell cell : cells) {
            if (cell.getC_ID() == 5240) {
                assertThat(cell.getDURATION(), is(1));
                assertThat(cell.getRRC_SAMPLES_BC_BS(), is(0));
                assertThat(cell.getRRC_SAMPLES_BC_GS(), is(0));
                assertThat(cell.getRRC_SAMPLES_GC_GS(), is(0));
                assertThat(cell.getRRC_SAMPLES_GC_BS(), is(0));
            } else if (cell.getC_ID() == 5241) {
                assertThat(cell.getDURATION(), is(5));
                assertThat(cell.getRRC_SAMPLES_BC_BS(), is(2));
                assertThat(cell.getRRC_SAMPLES_BC_GS(), is(0));
                assertThat(cell.getRRC_SAMPLES_GC_GS(), is(2));
                assertThat(cell.getRRC_SAMPLES_GC_BS(), is(0));
            } else if (cell.getC_ID() == 5242) {
                assertThat(cell.getDURATION(), is(2));
                assertThat(cell.getRRC_SAMPLES_BC_BS(), is(0));
                assertThat(cell.getRRC_SAMPLES_BC_GS(), is(0));
                assertThat(cell.getRRC_SAMPLES_GC_GS(), is(1));
                assertThat(cell.getRRC_SAMPLES_GC_BS(), is(0));
            } else if (cell.getC_ID() == 5246) {
                assertThat(cell.getDURATION(), is(2008));
                assertThat(cell.getRRC_SAMPLES_BC_BS(), is(0));
                assertThat(cell.getRRC_SAMPLES_BC_GS(), is(0));
                assertThat(cell.getRRC_SAMPLES_GC_GS(), is(1));
                assertThat(cell.getRRC_SAMPLES_GC_BS(), is(0));
            } else {
                fail("Cell not found!");
            }
            assertThat(cell.getIMSI(), is(454063302941012l));
            assertThat(cell.getIMSI_MCC(), is("454"));
            assertThat(cell.getIMSI_MNC(), is("06"));
            assertThat(cell.getRNC_ID(), is((short) 9));

        }
    }

    @Test
    public void shouldCarryOverCell() throws Exception {
        processFile("visitedcells/cell_carry_over.txt");

        final List<EnhancedVisitedCell> cells = getVisitedCellsCreated();
        assertThat(cells.size(), is(3));

        long firstCellEndTimestamp = -1;
        long secondCellStartTimestamp = -1;
        for (final EnhancedVisitedCell cell : cells) {
            if (cell.getTimestamp() == dateFormat.parse("2012-05-17 13:01:51.443").getTime()) {
                assertThat(cell.getC_ID(), is(13581));
                assertThat(cell.getDURATION(), is(188557));
                firstCellEndTimestamp = cell.getTimestamp() + cell.getDURATION();
            } else if (cell.getTimestamp() == dateFormat.parse("2012-05-17 13:05:00.000").getTime()) {
                assertThat(cell.getC_ID(), is(13581));
                assertThat(cell.getDURATION(), is(51459));
                secondCellStartTimestamp = cell.getTimestamp();
            } else if (cell.getTimestamp() == dateFormat.parse("2012-05-17 13:11:51.443").getTime()) {
                assertThat(cell.getC_ID(), is(13581));
                assertThat(cell.getDURATION(), is(16));
            } else {
                fail("unexpected cell: " + cell.getC_ID());
            }
            assertThat(cell.getIMSI(), is(454063302941012l));
            assertThat(cell.getIMSI_MCC(), is("454"));
            assertThat(cell.getIMSI_MNC(), is("06"));
            assertThat(cell.getRNC_ID(), is((short) 9));
            assertThat(cell.getRRC_SAMPLES_BC_BS(), is(0));
            assertThat(cell.getRRC_SAMPLES_BC_GS(), is(0));
            assertThat(cell.getRRC_SAMPLES_GC_GS(), is(0));
            assertThat(cell.getRRC_SAMPLES_GC_BS(), is(0));
        }
        assertEquals(firstCellEndTimestamp, secondCellStartTimestamp);
    }

    @Test
    public void shouldComputeRrcCarryOver() throws ParseException {
        processFile("visitedcells/cell_carry_over_rrc_meas.txt");

        final List<EnhancedVisitedCell> cells = getVisitedCellsCreated();
        assertThat(cells.size(), is(2));

        long firstCellEndTimestamp = -1;
        long secondCellStartTimestamp = -1;
        for (final EnhancedVisitedCell cell : cells) {
            if (cell.getTimestamp() == dateFormat.parse("2012-05-17 13:01:51.443").getTime()) {
                assertThat(cell.getC_ID(), is(5246));
                assertThat(cell.getDURATION(), is(188557));
                assertThat(cell.getRRC_SAMPLES_BC_BS(), is(0));
                assertThat(cell.getRRC_SAMPLES_BC_GS(), is(0));
                assertThat(cell.getRRC_SAMPLES_GC_GS(), is(4));
                assertThat(cell.getRRC_SAMPLES_GC_BS(), is(0));
                firstCellEndTimestamp = cell.getTimestamp() + cell.getDURATION();
            } else if (cell.getTimestamp() == dateFormat.parse("2012-05-17 13:05:00.000").getTime()) {
                assertThat(cell.getC_ID(), is(5246));
                assertThat(cell.getDURATION(), is(51459));
                secondCellStartTimestamp = cell.getTimestamp();
                assertThat(cell.getRRC_SAMPLES_BC_BS(), is(0));
                assertThat(cell.getRRC_SAMPLES_BC_GS(), is(0));
                assertThat(cell.getRRC_SAMPLES_GC_GS(), is(3));
                assertThat(cell.getRRC_SAMPLES_GC_BS(), is(0));
            }
            assertThat(cell.getIMSI(), is(454063302941012l));
            assertThat(cell.getIMSI_MCC(), is("454"));
            assertThat(cell.getIMSI_MNC(), is("06"));
            assertThat(cell.getRNC_ID(), is((short) 9));

        }

        assertEquals(firstCellEndTimestamp, secondCellStartTimestamp);
    }

    @Test
    public void shouldDiscardEmptyCellCarryOver() throws Exception {
        processFile("visitedcells/empty_cell_carry_over.txt");

        final List<EnhancedVisitedCell> cells = getVisitedCellsCreated();
        assertThat(cells.size(), is(1));
        final EnhancedVisitedCell cell = cells.get(0);
        assertThat(cell.getC_ID(), is(13581));
        assertThat(cell.getDURATION(), is(248557));

        assertThat(cell.getIMSI(), is(454063302941012l));
        assertThat(cell.getIMSI_MCC(), is("454"));
        assertThat(cell.getIMSI_MNC(), is("06"));
        assertThat(cell.getRNC_ID(), is((short) 9));

    }

    @Test
    public void shouldDiscardCellWithDurationZero() {
        processFile("visitedcells/zero_duration_cell.txt");

        final List<EnhancedVisitedCell> cells = getVisitedCellsCreated();
        assertThat(cells.size(), is(3));

        for (final EnhancedVisitedCell cell : cells) {
            assertTrue(cell.getDURATION() > 0);
            assertThat(cell.getIMSI(), is(454061103038281l));
            assertThat(cell.getIMSI_MCC(), is("454"));
            assertThat(cell.getIMSI_MNC(), is("06"));
        }
    }

    @Test
    public void shouldNotCreateCellWhenConnCompleteForDifferentCell() {
        processFile("visitedcells/conn_release_for_different_cell.txt");

        final List<EnhancedVisitedCell> cells = getVisitedCellsCreated();
        assertThat(cells.size(), is(2));

        assertAllCellsAreDifferent(cells);

        for (final EnhancedVisitedCell cell : cells) {
            if (cell.getC_ID() == 13581) {
                assertThat(cell.getDURATION(), is(16));
            } else if (cell.getC_ID() == 13582) {
                assertThat(cell.getDURATION(), is(17));
            } else {
                fail("Unexpected cell: " + cell.getC_ID());
            }
        }
    }

    @Test
    public void shouldDeleteEmptyCarryOver() {
        processFile("visitedcells/delete_empty_cell_carry_over.txt");

        final List<EnhancedVisitedCell> cells = getVisitedCellsCreated();
        assertThat(cells.size(), is(2));

        assertAllCellsAreDifferent(cells);

        for (final EnhancedVisitedCell cell : cells) {
            if (cell.getC_ID() == 13581) {
                assertThat(cell.getDURATION(), is(188557));
            } else if (cell.getC_ID() == 13582) {
                assertThat(cell.getDURATION(), is(188556));
            } else {
                fail("Unexpected cell: " + cell.getC_ID());
            }
        }
    }

    @Test
    public void shouldWaitForImsi() throws ParseException {
        processFile("visitedcells/wait_for_imsi.txt");

        final List<EnhancedVisitedCell> cells = getVisitedCellsCreated();
        assertThat(cells.size(), is(4));

        for (final EnhancedVisitedCell cell : cells) {
            if (cell.getTimestamp() == dateFormat.parse("2012-05-17 13:01:51.443").getTime()) {
                assertThat(cell.getC_ID(), is(13581));
                assertThat(cell.getDURATION(), is(188557));
            } else if (cell.getTimestamp() == dateFormat.parse("2012-05-17 13:05:00.000").getTime()) {
                assertThat(cell.getC_ID(), is(13581));
                assertThat(cell.getDURATION(), is(51447));
            } else if (cell.getTimestamp() == dateFormat.parse("2012-05-17 13:06:51.444").getTime()) {
                assertThat(cell.getC_ID(), is(13582));
                assertThat(cell.getDURATION(), is(188556));
            } else if (cell.getTimestamp() == dateFormat.parse("2012-05-17 13:11:51.444").getTime()) {
                assertThat(cell.getC_ID(), is(13582));
                assertThat(cell.getDURATION(), is(4));
            } else {
                fail("Unexpected cell: " + cell.getC_ID());
            }
        }
    }

    @Test
    public void shouldDiscardEventsAfterRelease() throws ParseException {
        processFile("visitedcells/event_after_sys_release.txt");

        final List<EnhancedVisitedCell> cells = getVisitedCellsCreated();
        assertThat(cells.size(), is(2));

        for (final EnhancedVisitedCell cell : cells) {
            if (cell.getTimestamp() == dateFormat.parse("2012-05-16 16:50:54.600").getTime()) {
                assertThat(cell.getC_ID(), is(43730));
                assertThat(cell.getDURATION(), is(45644));
            } else if (cell.getTimestamp() == dateFormat.parse("2012-05-16 17:00:48.382").getTime()) {
                assertThat(cell.getC_ID(), is(43730));
                assertThat(cell.getDURATION(), is(49635));
            }

            assertThat(cell.getIMSI(), is(454064500529185l));
        }
    }

    @Test
    public void shouldCountGoodBadRealData() {
        processFile("visitedcells/good_bad_cnt_real_data.txt");

        final List<EnhancedVisitedCell> cells = getVisitedCellsCreated();
        boolean found = false;
        for (final EnhancedVisitedCell c : cells) {
            if (c.getDecodedString().indexOf("2012-05-17 01:45:27.158") > -1) {
                found = true;
                assertThat(c.getDURATION(), is(5753));
                assertThat(c.getIMSI(), is(454061106062920l));
                assertThat(c.getRRC_SAMPLES_GC_GS(), is(6));
            }
        }

        assertTrue(found);
    }

    private void assertAllCellsAreDifferent(final List<EnhancedVisitedCell> cells) {
        for (int i = 0; i < cells.size(); i++) {
            final EnhancedVisitedCell cell = cells.get(i);
            for (int j = i + 1; j < cells.size(); j++) {
                assertTrue(cell.getC_ID() != cells.get(j).getC_ID());
            }
        }
    }
}
