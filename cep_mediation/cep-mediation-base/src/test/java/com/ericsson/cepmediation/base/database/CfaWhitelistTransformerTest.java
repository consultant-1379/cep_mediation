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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.base.database.entity.CfaWhitelistValues;

public class CfaWhitelistTransformerTest {

    CfaWhitelistTransformer cfaWhitelistTransformer;

    @Before
    public void setup() {
        cfaWhitelistTransformer = new CfaWhitelistTransformer();
    }

    @Test
    public void testCfaWhitelistTransformer() throws SQLException {

        final ResultSet resultSet = mockResultSet();

        final List<CfaWhitelistValues> result = cfaWhitelistTransformer
                .transform(resultSet);
        resultSet.close();
        assertEquals("Number of whitelist entries:", 1, result.size());
        assertTrue(result.get(0).containsValues(438, (byte) -1, (byte) 2));
    }

    private ResultSet mockResultSet() throws SQLException {

        final ResultSet resultSet = mock(ResultSet.class);
        final ResultSetMetaData rsmd = mock(ResultSetMetaData.class);

        when(resultSet.next()).thenReturn(true).thenReturn(false);

        when(resultSet.getObject("EVENT_ID")).thenReturn(438);
        when(resultSet.getObject("DISCONNECTION_CODE")).thenReturn("UnKnOwN");
        when(resultSet.getObject("DISCONNECTION_SUB_CODE")).thenReturn("2");

        when(rsmd.getColumnCount()).thenReturn(9);
        when(resultSet.getMetaData()).thenReturn(rsmd);
        return resultSet;

    }

}