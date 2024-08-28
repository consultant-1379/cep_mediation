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
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.base.database.entity.CellIdentifier;
import com.ericsson.cepmediation.base.database.entity.HashId;

public class HashIdTransformerTest {

    HashIdTransformer transformer;

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

    private final static String mcc = "454";
    private final static String mnc = "06";
    private final static int lac = 1;
    private final static int cid1 = 1001;
    private final static int cid2 = 1002;

    private final static short rncId1 = 11;
    private final static short rncId2 = 12;

    final private byte rat = (byte)1;
    private final static short rac=145;
    private static final short RAC_VALUE=145;
    
    private final static String cellId="CELLID";
    private static final long hier3_id=1234567;
    private static final long hier321_id=98745612;
    private static final long hier3cell_id=5641237;

    @Before
    public void setup(){

        transformer = new HashIdTransformer();
    }

    @Test
    public void testTransforming() throws SQLException {

        final ResultSet resultSet = mockResultSet();

        final Map<CellIdentifier,List<HashId>> result = transformer.transform(resultSet);

        assertEquals("size of the hashmap should be 4", 4, result.size());

        final CellIdentifier cellIdentif = new CellIdentifier();

        cellIdentif.setAccess_area_id(cid1);
        cellIdentif.setLac(lac);
        cellIdentif.setMnc(mnc);
        cellIdentif.setMcc(mcc);
        cellIdentif.setRat(rat);
        cellIdentif.setRaw(true);

        final List<HashId> hashIds = result.get(cellIdentif);

        assertEquals("hash id list size", 1, hashIds.size());
        assertEquals("RAC Value:", RAC_VALUE, hashIds.get(0).getRac());
        assertEquals(cellId, hashIds.get(0).getCellId());
        assertEquals(hier3_id, hashIds.get(0).getHier3Id());
        assertEquals(hier321_id, hashIds.get(0).getHier321Id());
        assertEquals(hier3cell_id, hashIds.get(0).getHier3cellId());
        assertEquals(rat, hashIds.get(0).getRat());
        assertEquals(lac, hashIds.get(0).getLac());

    }

    private ResultSet mockResultSet() throws SQLException{

        final ResultSet resultSet = mock(ResultSet.class);

        //two lines of resultSet
        when(resultSet.next()).thenReturn(true).thenReturn(true).thenReturn(false);

        when(resultSet.getInt(C_ID)).thenReturn(cid1).thenReturn(cid2);
        when(resultSet.getInt(LAC)).thenReturn(lac).thenReturn(lac);
        when(resultSet.getString(MCC)).thenReturn(mcc).thenReturn(mcc);
        when(resultSet.getString(MNC)).thenReturn(mnc).thenReturn(mnc);
        when(resultSet.getByte(RAT)).thenReturn(rat).thenReturn(rat);
        when(resultSet.getShort(RAC)).thenReturn(rac).thenReturn(rac);

        when(resultSet.getShort(RNC_ID)).thenReturn(rncId1).thenReturn(rncId2);
        when(resultSet.getString(CELL_ID)).thenReturn(cellId).thenReturn(cellId);
        when(resultSet.getLong(HIER3_ID)).thenReturn(hier3_id).thenReturn(hier3_id);
        when(resultSet.getLong(HIER321_ID)).thenReturn(hier321_id).thenReturn(hier321_id);
        when(resultSet.getLong(HIER3_CELL_ID)).thenReturn(hier3cell_id).thenReturn(hier3cell_id);

        return resultSet;

    }

}
