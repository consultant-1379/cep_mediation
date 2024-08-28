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

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ericsson.cepmediation.base.database.entity.WhitelistValues;



public class HfaWhitelistTransformer implements Transformer<List<WhitelistValues>> {

    public final static String EVENT_ID = "EVENT_ID";

    public final static String EXCEPTION_CLASS = "EXCEPTION_CLASS";

    public final static String CAUSE_VALUE = "CAUSE_VALUE";

    public final static String SUB_CAUSE_VALUE = "SUB_CAUSE_VALUE";

    @Override
    public List<WhitelistValues> transform(final ResultSet resultSet) throws SQLException {
        final List<WhitelistValues> result = new ArrayList<WhitelistValues>();
        while (resultSet.next()) {
            final Number eventId = (Number)resultSet.getObject(EVENT_ID);
            final Number exceptionClass = (Number)resultSet.getObject(EXCEPTION_CLASS); // can be null
            final Number causeValue = (Number)resultSet.getObject(CAUSE_VALUE);
            final Number subCauseValue = (Number)resultSet.getObject(SUB_CAUSE_VALUE);

            WhitelistValues whitelistValues;
            if (exceptionClass != null) {
                whitelistValues = new WhitelistValues(eventId.intValue(), exceptionClass.shortValue(), causeValue.shortValue(), subCauseValue.shortValue());
            } else {
                whitelistValues = new WhitelistValues(eventId.intValue(), causeValue.shortValue(), subCauseValue.shortValue());
            }
            // Add this entry to the relevant event in the ArrayList.
            result.add(whitelistValues);
            }
        return result;
    }
}