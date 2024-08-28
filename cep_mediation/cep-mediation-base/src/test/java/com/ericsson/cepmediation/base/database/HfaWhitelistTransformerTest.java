/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2014
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.cepmediation.base.database;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.base.database.entity.WhitelistValues;

public class HfaWhitelistTransformerTest {

    HfaWhitelistTransformer hfaWhitelistTransformer;

    @Before
    public void setup() {
        hfaWhitelistTransformer = new HfaWhitelistTransformer();
    }

    @Test
    public void testHfaWhitelistTransformer() throws SQLException {

        final ResultSet resultSet = mockResultSet();

        final List<WhitelistValues> result = hfaWhitelistTransformer
                .transform(resultSet);
        resultSet.close();
        assertEquals("Number of whitelist entries:", 1, result.size());
        assertEquals("EVENT_ID ", result.get(0).getEventId(), 458);
        assertEquals("EXCEPTION_CLASS:", result.get(0).getExceptionClass(), -1);
        assertEquals("CAUSE_VALUE:", result.get(0).getCauseValue(), -1);
        assertEquals("SUB_CAUSE_VALUE:", result.get(0).getSubCauseValue(), 1);
        assertTrue(result.get(0).containsValues(458, (short) -1, (short) -1, (short)1));
    }

    private ResultSet mockResultSet() throws SQLException {

        final ResultSet resultSet = mock(ResultSet.class);

        when(resultSet.next()).thenReturn(true).thenReturn(false);

        when(resultSet.getObject("EVENT_ID")).thenReturn(458);
        when(resultSet.getObject("EXCEPTION_CLASS")).thenReturn(-1);
        when(resultSet.getObject("CAUSE_VALUE")).thenReturn(-1);
        when(resultSet.getObject("SUB_CAUSE_VALUE")).thenReturn(1);

       return resultSet;

    }

}
