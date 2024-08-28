/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class ImsiToImeiTransformer implements Transformer<Map<Long, String>> {
    @Override
    public Map<Long, String> transform(final ResultSet resultSet) throws SQLException {
        final Map<Long, String> result = new HashMap<Long, String>();
        while (resultSet.next()) {
            final long imsi = resultSet.getLong("imsi");
            final String imei = resultSet.getString("imeisv");
            result.put(imsi, imei);
        }
        return result;
    }
}