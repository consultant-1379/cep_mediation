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
package com.ericsson.cepmediation.base.database;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.base.database.entity.CellIdentifier;

public class ScramblingCodeTransformerTest {

    private ScramblingCodeTransformer scramblingCodeTransformer;

    private final short rncId1 = 3;

    private final int cellId1 = 4;

    private final short scramblingCode1 = 5;

    private final short rncId2 = 2;

    private final int cellId2 = 7;

    private final short scramblingCode2 = 9;

    @Before
    public void setup() {
        scramblingCodeTransformer = new ScramblingCodeTransformer();
    }

    @Test
    public void testTransforming() throws SQLException {
        int scramblingCodeIndex = 0;
        final ResultSet resultSet = mockSQLResultSet();
        List list = scramblingCodeTransformer.transform(resultSet);
        final Map<CellIdentifier, Integer> result = (Map<CellIdentifier, Integer>)list.get(scramblingCodeIndex);

        assertThat(result.size(), is(2));
        final CellIdentifier cellIdentifierForCellId1 = new CellIdentifier();
        cellIdentifierForCellId1.setRncId(rncId1);
        cellIdentifierForCellId1.setCellId(cellId1);
        final int scramblingCodeForFirstCell = result.get(cellIdentifierForCellId1);
        assertThat(scramblingCodeForFirstCell, is((int) scramblingCode1));

        final CellIdentifier cellIdentiferForCell2 = new CellIdentifier();
        cellIdentiferForCell2.setRncId(rncId2);
        cellIdentiferForCell2.setCellId(cellId2);
        final int scramblingCodeForSecondCell = result.get(cellIdentiferForCell2);
        assertThat(scramblingCodeForSecondCell, is((int) scramblingCode2));

    }

    private ResultSet mockSQLResultSet() throws SQLException {
        final ResultSet resultSet = mock(ResultSet.class);
        when(resultSet.next()).thenReturn(true).thenReturn(true).thenReturn(false);

        when(resultSet.getShort(1)).thenReturn(rncId1).thenReturn(rncId2);
        when(resultSet.getInt(2)).thenReturn(cellId1).thenReturn(cellId2);
        when(resultSet.getShort(3)).thenReturn(scramblingCode1).thenReturn(scramblingCode2);

        return resultSet;
    }

}