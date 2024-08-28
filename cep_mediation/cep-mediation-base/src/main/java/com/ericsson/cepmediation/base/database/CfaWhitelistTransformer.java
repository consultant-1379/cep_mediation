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

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.ericsson.cepmediation.base.database.entity.CfaWhitelistValues;


public class CfaWhitelistTransformer implements
        Transformer<List<CfaWhitelistValues>> {

    public final static String UNKNOWN_VALUE = "-1";
    public final static String EVENT_ID = "EVENT_ID";
    public final static String RAB_DISCONNECTION_CODE = "DISCONNECTION_CODE";
    public final static String RAB_DISCONNECTION_SUBCODE = "DISCONNECTION_SUB_CODE";
    public final static String UNKNOWN_STRING = "UNKNOWN";
    public final static int DEFAULT_VALUE = -2;
    public final static int UNKNOWN = -1;
    public final static int MAX_COLS_GROUP_CFA = 9;

    @Override
    public List<CfaWhitelistValues> transform(final ResultSet resultSet)
            throws SQLException {

        final List<CfaWhitelistValues> result = new ArrayList<CfaWhitelistValues>();
        final ResultSetMetaData rsmd = resultSet.getMetaData();
        final int columnsNumber = rsmd.getColumnCount();
        if (columnsNumber >= MAX_COLS_GROUP_CFA) {
            while (resultSet.next()) {
                final Number eventId = (Number) resultSet.getObject(EVENT_ID);
                Integer rabDisconnectionCode = (Integer) DEFAULT_VALUE;
                Integer rabDisconnectionSubcode = (Integer) DEFAULT_VALUE;
                final String rabDisconnectionCodeChk = (String) resultSet
                        .getObject(RAB_DISCONNECTION_CODE);
                final String rabDisconnectionSubcodeChk = (String) resultSet
                        .getObject(RAB_DISCONNECTION_SUBCODE);
                CfaWhitelistValues whitelistValues;
                rabDisconnectionCode = assignValidDisconnCodeValue(
                        rabDisconnectionCode, rabDisconnectionCodeChk);

                rabDisconnectionSubcode = assignValidDisconnCodeValue(
                        rabDisconnectionSubcode, rabDisconnectionSubcodeChk);

                if (eventId != null) {
                    whitelistValues = new CfaWhitelistValues(
                            eventId.intValue(),
                            rabDisconnectionCode.byteValue(),
                            rabDisconnectionSubcode.byteValue());
                    result.add(whitelistValues);
                }

            }
        }
        return result;
    }

    private Integer assignValidDisconnCodeValue(
            Integer intDisconnectionCode, final String stringDisconnectionCode) {
        if (stringDisconnectionCode == null) {
            intDisconnectionCode = DEFAULT_VALUE;
        } else if (stringDisconnectionCode
                .equalsIgnoreCase(UNKNOWN_STRING)) {
            intDisconnectionCode = UNKNOWN;
        } else {
            if (isNumeric(stringDisconnectionCode)
                    && !(stringDisconnectionCode
                            .equalsIgnoreCase(UNKNOWN_VALUE))) {
                intDisconnectionCode = Integer
                        .valueOf(stringDisconnectionCode);
            }
        }
        return intDisconnectionCode;
    }

    public static boolean isNumeric(final String rabCode) {
        try {
            @SuppressWarnings("unused")
            final int rabCodeChk = Integer.parseInt(rabCode);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}