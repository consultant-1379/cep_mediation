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

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ericsson.cepmediation.base.database.entity.CellIdentifier;

public class ScramblingCodeTransformer implements Transformer<List> {

    @Override
    public List transform(final ResultSet resultSet) throws SQLException {
        final List mapLists = new ArrayList();
        final Map<String, Short> rncNametoRncIdMap = new HashMap<String, Short>();
        final Map<CellIdentifier, Integer> ScramblingCodeMap = new HashMap<CellIdentifier, Integer>();
        while (resultSet.next()) {
            final int rncId = resultSet.getShort(1);
            final int cellId = resultSet.getInt(2);
            final int scramblingCode = resultSet.getShort(3);
            rncNametoRncIdMap.put(resultSet.getString(4), resultSet.getShort(1));
            final CellIdentifier cellIdentifer = new CellIdentifier();
            cellIdentifer.setRncId(rncId);
            cellIdentifer.setCellId(cellId);
            ScramblingCodeMap.put(cellIdentifer, scramblingCode);
        }
        mapLists.add(ScramblingCodeMap);
        mapLists.add(rncNametoRncIdMap);
        return mapLists;
    }
}