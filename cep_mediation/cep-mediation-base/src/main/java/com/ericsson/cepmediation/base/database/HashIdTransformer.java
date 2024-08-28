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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.database.entity.CellIdentifier;
import com.ericsson.cepmediation.base.database.entity.HashId;

public class HashIdTransformer implements Transformer<Map<CellIdentifier, List<HashId>>> {
    private static final Logger LOGGER = LoggerFactory.getLogger(HashIdTransformer.class);

    public final static String CELL_ID = "CELL_ID";

    public final static String HIER3_ID = "HIER3_ID";

    public final static String HIER321_ID = "HIER321_ID";

    public final static String HIER3_CELL_ID = "HIER3_CELL_ID";

    public final static String C_ID = "C_ID";

    public final static String RNC_ID = "RNC_ID";

    public final static String PLMN_ID = "PLMN_ID";

    public final static String LAC = "LAC";

    public final static String MCC = "MCC";

    public final static String MNC = "MNC";

    public final static String RAT = "RAT";

    public final static String RAC = "RAC";

    @Override
    public Map<CellIdentifier, List<HashId>> transform(final ResultSet resultSet) throws SQLException {
        final Map<CellIdentifier, List<HashId>> res = new HashMap<CellIdentifier, List<HashId>>();
        while (resultSet.next()) {

            final int cellId = resultSet.getInt(C_ID);
            final short rncId = resultSet.getShort(RNC_ID);

            final long hier3Id = resultSet.getLong(HIER3_ID);
            final long hier321Id = resultSet.getLong(HIER321_ID);
            final long hier3CellId = resultSet.getLong(HIER3_CELL_ID);
            final String strCellId = resultSet.getString(CELL_ID);
            final int lac = resultSet.getInt(LAC);
            final String mcc = resultSet.getString(MCC);
            final String mnc = resultSet.getString(MNC);

            final byte rat = resultSet.getByte(RAT);
            final short rac = resultSet.getShort(RAC);

            Integer plmnId = null;
            try {
                plmnId = Integer.valueOf(resultSet.getString(PLMN_ID));
            } catch (final NumberFormatException nfe) {
                LOGGER.warn("Icorrect plmnId:" + resultSet.getString(PLMN_ID));
                LOGGER.debug("hier321Id:" + hier321Id);
            }

            final HashId hashId = new HashId(hier3Id, hier321Id, hier3CellId, strCellId, plmnId, lac, rat, rac);

            final CellIdentifier cellIdentif = new CellIdentifier();
            cellIdentif.setRaw(false);
            cellIdentif.setCellId(cellId);
            cellIdentif.setRncId(rncId);
            cellIdentif.setRat(rat);

            List<HashId> ids = res.get(cellIdentif);
            if (ids == null) {
                ids = new ArrayList<HashId>(2);
                res.put(cellIdentif, ids);
            }
            ids.add(hashId);
            //add a new key using raw topology location information
            addKeyWithTopologyInfo(res, cellId, lac, mcc, mnc, rat, hashId);

        }

        return res;
    }

    private void addKeyWithTopologyInfo(
            final Map<CellIdentifier, List<HashId>> res, final int cellId,
            final int lac, final String mcc, final String mnc, final byte rat,
            final HashId hashId) {
        final CellIdentifier rawCellIdentif = new CellIdentifier();

        rawCellIdentif.setRaw(true);
        rawCellIdentif.setAccess_area_id(cellId);
        rawCellIdentif.setLac(lac);
        rawCellIdentif.setMcc(mcc);
        rawCellIdentif.setMnc(mnc);
        rawCellIdentif.setRat(rat);

        if ( res.get(rawCellIdentif) == null){

            res.put(rawCellIdentif, new ArrayList<HashId>());

        }

        res.get(rawCellIdentif).add(hashId);
    }
}