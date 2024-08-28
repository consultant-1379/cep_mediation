/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;



public class HomePlmnIdTransformer implements Transformer<Set<String>> {

    public final static String PLMN_ID = "PLMN_ID";

    @Override
    public Set<String> transform(final ResultSet resultSet) throws SQLException {
        final Set<String> result = new HashSet<String>();
        while (resultSet.next()) {
            result.add(resultSet.getString(PLMN_ID));
        }
        return result;
    }
}