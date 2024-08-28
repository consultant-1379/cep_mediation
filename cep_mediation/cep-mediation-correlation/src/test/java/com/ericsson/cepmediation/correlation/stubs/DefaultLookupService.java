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

package com.ericsson.cepmediation.correlation.stubs;

import java.util.List;

import com.ericsson.cepmediation.base.database.entity.HashId;
import com.ericsson.cepmediation.base.database.entity.MccMncPair;
import com.ericsson.cepmediation.base.database.entity.RabCombination;
import com.ericsson.cepmediation.correlation.lookup.LookupService;
import com.ericsson.cepmediation.correlation.support.Category;
import com.ericsson.cepmediation.test.common.TestConstants;
import com.ericsson.cepmediation.test.topology.ServingCellsForTest;

public class DefaultLookupService implements LookupService {

    private static DefaultLookupService instance = new DefaultLookupService();

    public static DefaultLookupService getInstance() {
        return instance;
    }

    @Override
    public boolean isForServingCell(final int rncId, final int cellId,
            final String scramblingCode) {
        return isForServingCell(rncId, cellId, Integer.parseInt(scramblingCode));
    }

    @Override
    public boolean isForServingCell(final int servingRnc,
            final int servingCell, final int scramblingCode) {
        return ServingCellsForTest.isForServingCell(servingRnc, servingCell,
                scramblingCode);
    }

    @Override
    public Integer getScramblingCode(final int servingRnc, final int servingCell) {

        return null;
    }

    @Override
    public boolean isPacketSwitchedRAB(final int rab) {

        return false;
    }

    @Override
    public boolean isCsRabOnly(final int rab) {

        return false;
    }

    @Override
    public int getValue(final Category category, final String key) {

        return 0;
    }

    @Override
    public boolean isHsdpaBearer(final int bearerId) {

        return false;
    }

    @Override
    public boolean isHsupaBearer(final int bearerId) {

        return false;
    }

    @Override
    public byte getCsCount(final int rab) {

        return 0;
    }

    @Override
    public byte getPsCount(final int rab) {

        return 0;
    }

    @Override
    public boolean isMultiRab(final int rab) {
        return false;
    }

    @Override
    public RabCombination getRabCombination(final int rab) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Short getRab(final RabCombination rabCombination) {
        // TODO Auto-generated method stub
        return new Short((short) 0);
    }

    @Override
    public MccMncPair extractMccAndMnc(final long imsi) {

        return null;
    }

    @Override
    public int getRSCPThresholdValue() {
        return TestConstants.RSCP_THRESHOLD;
    }

    @Override
    public int getECNOThresholdValue() {
        return TestConstants.ECNO_THRESHOLD;
    }

    @Override
    public List<HashId> getHashId(final int cellId, final short rncId) {

        return null;
    }

    @Override
    public Long getRncHashId(final short rncId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getMcc(final long imsi) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getMnc(final long imsi) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<HashId> getHashId(final byte rat, final String mcc,
            final String mnc, final int lac, final int access_area_id) {

        return null;
    }

    @Override
    public boolean isRoaming(final String mcc, final String mnc) {
        return false;
    }

    @Override
    public boolean isInHfaWhitelist(final int eventId,
            final short exceptionClause, final short causeValue,
            final short subCauseValue) {
        return false;
    }

    // WCDMA-CFA Change
    @Override
    public boolean isInCfaWhitelist(final int eventId,
            final byte rabDisconnectionCode, final byte rabDisconnectionSubcode) {
        return false;
    }

    @Override
    public List<HashId> getHashId(int cellId, int rncId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public short getRncId(String rncName) {
        // TODO Auto-generated method stub
        return 0;
    }
}