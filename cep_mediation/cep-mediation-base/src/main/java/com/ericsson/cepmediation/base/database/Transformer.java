/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.database;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author eemecoy
 *
 */
public interface Transformer<T> {

    /**
     * Transform result set into expected output
     */
    T transform(ResultSet resultSet) throws SQLException;

}
