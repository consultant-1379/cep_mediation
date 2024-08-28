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

public class RncHashIdTransformer implements Transformer<Map<Short, Long>> {

    public final static String RNC_ID = "RNC_ID";

    public final static String HIER3_ID = "HIER3_ID";

    @Override
    public Map<Short, Long> transform(final ResultSet resultSet) throws SQLException {
        final Map<Short, Long> res = new HashMap<Short, Long>();
        while (resultSet.next()) {
            
            final short rncId = resultSet.getShort(RNC_ID);
            final long hier3Id = resultSet.getLong(HIER3_ID);
            
            res.put(rncId, hier3Id);
                        
        }

        return res;
    }
}