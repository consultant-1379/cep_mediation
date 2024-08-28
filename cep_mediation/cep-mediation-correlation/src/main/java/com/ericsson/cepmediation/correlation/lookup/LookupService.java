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
package com.ericsson.cepmediation.correlation.lookup;

import java.util.List;

import com.ericsson.cepmediation.base.database.entity.HashId;
import com.ericsson.cepmediation.base.database.entity.MccMncPair;
import com.ericsson.cepmediation.base.database.entity.RabCombination;
import com.ericsson.cepmediation.correlation.support.Category;

public interface LookupService {

    /**
     * If the given cell managed by given RNC has given scrambling code, return
     * true.
     *
     * @param rncId
     *            rnc id
     * @param cellId
     *            cell id
     * @param scramblingCode
     *            scrambling code
     *
     * @return boolean
     */
    boolean isForServingCell(int rncId, int cellId, int scramblingCode);

    /**
     * If the given cell managed by given RNC has given scrambling code, return
     * true.
     *
     * @param rncId
     *            rnc id
     * @param cellId
     *            cell id
     * @param scramblingCode
     *            scrambling code in string - must contain the integer
     *            scrambling code value
     *
     * @return boolean
     */
    boolean isForServingCell(int rncId, int cellId, String scramblingCode);

    Integer getScramblingCode(int servingRnc, int servingCell);

    boolean isPacketSwitchedRAB(int rab);

    boolean isCsRabOnly(final int rab);

    /**
     * Returns integer mapping to given string category. User plane stuff.
     */
    int getValue(Category category, String key);

    boolean isHsdpaBearer(int bearerId);

    boolean isHsupaBearer(int bearerId);

    byte getCsCount(final int rab);

    byte getPsCount(final int rab);

    boolean isMultiRab(final int rab);

    RabCombination getRabCombination(int rab);

    Short getRab(RabCombination rabCombination);

    MccMncPair extractMccAndMnc(long imsi);

    String getMcc(long imsi);

    String getMnc(long imsi);

    int getRSCPThresholdValue();

    int getECNOThresholdValue();

    List<HashId> getHashId(int cellId, short rncId);

    List<HashId> getHashId(byte rat, String mcc, String mnc, int lac,
            int access_area_id);

    Long getRncHashId(short rncId);

    boolean isRoaming(String mcc, String mnc);

    boolean isInHfaWhitelist(int eventId, short exceptionClass,
            short causeValue, short subCauseValue);

    boolean isInCfaWhitelist(int eventId, byte rabDisconnectionCode,
            byte rabDisconnectionSubcode);

    List<HashId> getHashId(int cellId, int rncId);

    short getRncId(String rncName);

}