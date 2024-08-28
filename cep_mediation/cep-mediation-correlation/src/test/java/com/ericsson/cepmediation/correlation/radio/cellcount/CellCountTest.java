package com.ericsson.cepmediation.correlation.radio.cellcount;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.ericsson.cepmediation.correlation.radio.RadioCorrelationBase;
import com.ericsson.cepmediation.correlation.radio.utils.Statements;

public class CellCountTest extends RadioCorrelationBase {

    @Before
    public void setup() throws Exception {
        configure("esper/_rc.epl", Statements.SESSION_ENRICHMENT);
    }

    @Test
    public void shouldCountTwoCells() throws Exception {
        processFile("cellcount/two_cells.txt");

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(1));

        final GPEH_SESSION session = sessions.get(0);
        assertThat(session.getDISTINCT_CELL_CNT(), is(2));
    }

    @Test
    public void shouldCountManyCells() throws Exception {
        processFile("cellcount/many_cells.txt");

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(1));

        final GPEH_SESSION session = sessions.get(0);
        assertThat(session.getDISTINCT_CELL_CNT(), is(14));
    }

    @Test
    public void shouldCountManyCellsDifferentRnc() throws Exception {
        processFile("cellcount/many_cells_different_rnc.txt");

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(1));

        final GPEH_SESSION session = sessions.get(0);
        assertThat(session.getDISTINCT_CELL_CNT(), is(15));
    }

    @Test
    public void shouldCountTwoSessionCells() throws Exception {
        processFile("cellcount/two_sessions.txt");

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(1));

        final GPEH_SESSION session = sessions.get(0);
        assertThat(session.getDISTINCT_CELL_CNT(), is(5));
    }

    @Test
    public void shouldCountCellsRealData() throws Exception {
        processFile("cellcount/real_data.txt");

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(3));

        final GPEH_SESSION session = sessions.get(1);
        assertThat(session.getDISTINCT_CELL_CNT(), is(25));
    }
}
