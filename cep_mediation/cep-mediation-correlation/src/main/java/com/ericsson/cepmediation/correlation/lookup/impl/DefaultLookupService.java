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

package com.ericsson.cepmediation.correlation.lookup.impl;

import java.util.List;
import com.ericsson.cepmediation.base.database.entity.CellIdentifier;
import com.ericsson.cepmediation.base.database.entity.CfaWhitelistValues;
import com.ericsson.cepmediation.base.database.entity.HashId;
import com.ericsson.cepmediation.base.database.entity.MccMncPair;
import com.ericsson.cepmediation.base.database.entity.RabCombination;
import com.ericsson.cepmediation.base.database.entity.RabTypeInfo;
import com.ericsson.cepmediation.base.database.entity.WhitelistValues;
import com.ericsson.cepmediation.correlation.beans.NotYetImplementedException;
import com.ericsson.cepmediation.correlation.lookup.LookupService;
import com.ericsson.cepmediation.correlation.support.Category;
import com.ericsson.cepmediation.correlation.support.CellUtil;

public class DefaultLookupService implements LookupService {

    private static final int IMSI_MAX_LEN = 16;

    private static final int IMSI_MIN_LEN = 5;

    private static final String GPEH_RSCP_THRESHOLD = "RSCP";

    private static final String GPEH_ECNO_THRESHOLD = "ECNO";

    private static final Integer GPEH_ECNO_THRESHOLD_DEFAULT = -14;

    private static final Integer GPEH_RSCP_THRESHOLD_DEFAULT = -100;

    private static DefaultLookupService instance = new DefaultLookupService();

    private final DataStore dataStore;

    DefaultLookupService() {
        dataStore = createDataStore();
    }

    /**
     * Making default to allow unit testing
     */
    DataStore createDataStore() {
        return new DataStore();
    }

    @Override
    public boolean isForServingCell(final int rncId, final int cellId,
            final String scramblingCode) {
        return isForServingCell(rncId, cellId, Integer.parseInt(scramblingCode));
    }

    @Override
    public boolean isForServingCell(final int rncId, final int cellId,
            final int scramblingCode) {
        final Integer result = getScramblingCode(rncId, cellId);
        if (result != null) {
            return result == scramblingCode;
        }
        return false;
    }

    @Override
    public Integer getScramblingCode(final int servingRnc, int servingCell) {
        // TODO yet another cleanup task
        servingCell = CellUtil.getUnsignedCellId(servingCell);
        final CellIdentifier cellIdentifier = new CellIdentifier();
        cellIdentifier.setRncId(servingRnc);
        cellIdentifier.setCellId(servingCell);
        return dataStore.getScramblingCodes().get(cellIdentifier);

    }

    public static LookupService getInstance() {
        return instance;

    }

    @Override
    public int getValue(final Category category, final String key) {
        Integer result;
        switch (category) {
        case FUNCTION:
            result = dataStore.getUpFunctionList().get(key);
            break;
        case PROTOCOL:
            result = dataStore.getUpProtocolList().get(key);
            break;
        case SERVICE_PROVIDER:
            result = dataStore.getUpProviderList().get(key);
            break;
        case CLIENT:
            result = dataStore.getUpClientList().get(key);
            break;
        case ENCAPSULATION:
            result = dataStore.getUpEncapsulationList().get(key);
            break;
        case ENCRYPTION:
            result = dataStore.getUpEncryptionList().get(key);
            break;
        default:
            throw new NotYetImplementedException("Unknown category " + category);
        }
        if (result == null) {
            return -1;
        }
        return result;
    }

    @Override
    public boolean isPacketSwitchedRAB(final int id) {
        return dataStore.getPsRabs().containsKey(id);
    }

    @Override
    public boolean isCsRabOnly(final int rab) {
        return getPsCount(rab) == 0 && getCsCount(rab) > 0;
    }

    @Override
    public byte getPsCount(final int rab) {
        final RabTypeInfo res = dataStore.getRabTypesInfo().get(rab);
        return res != null ? res.getPsRabCount() : 0;
    }

    @Override
    public byte getCsCount(final int rab) {
        final RabTypeInfo res = dataStore.getRabTypesInfo().get(rab);
        return res != null ? res.getCsRabCount() : 0;
    }

    @Override
    public boolean isMultiRab(final int rab) {
        final RabTypeInfo res = dataStore.getRabTypesInfo().get(rab);
        return res != null ? res.isMultiRab() : false;
    }

    @Override
    public RabCombination getRabCombination(final int rab) {
        final RabTypeInfo rabTypeInfo = dataStore.getRabTypesInfo().get(rab);
        if (rabTypeInfo != null) {
            return rabTypeInfo.getComposedOfRabTypes();
        }
        return null;
    }

    @Override
    public Short getRab(final RabCombination rabCombination) {
        return dataStore.getRabCombinations2RabType().get(rabCombination);
    }

    @Override
    public boolean isHsdpaBearer(final int bearerId) {
        final String description = dataStore.getPsRabs().get(bearerId);
        if (description != null && description.contains("HS")) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isHsupaBearer(final int bearerId) {
        final String description = dataStore.getPsRabs().get(bearerId);
        if (description != null && description.contains("EUL")) {
            return true;
        }
        return false;
    }

    /**
     * Extracts mcc and mnc from the provided imsi value. If imsi size is
     * invalid or mcc/mnc pair is not present in db returns null.
     *
     *
     *
     * @param imsiString
     *            the imsi
     * @return MccMncPair containing mcc and mnc or null
     */
    @Override
    public MccMncPair extractMccAndMnc(final long imsi) {
        MccMncPair res = null;
        final String imsiString = String.valueOf(imsi);
        if (imsiString != null && !imsiString.isEmpty()) {
            final int len = imsiString.length();
            if (len > IMSI_MIN_LEN && len < IMSI_MAX_LEN) {
                String mccMncPair = imsiString.substring(0, 6);
                res = dataStore.getMccMnc().get(mccMncPair);
                if (res == null) {
                    mccMncPair = imsiString.substring(0, 5);
                    res = dataStore.getMccMnc().get(mccMncPair);
                }
            }
        }

        return res;
    }

    @Override
    public int getRSCPThresholdValue() {
        final String threshold = dataStore.getGpehThresholds().get(
                GPEH_RSCP_THRESHOLD);
        return threshold == null ? GPEH_RSCP_THRESHOLD_DEFAULT : Integer
                .valueOf(threshold);
    }

    @Override
    public int getECNOThresholdValue() {
        final String threshold = dataStore.getGpehThresholds().get(
                GPEH_ECNO_THRESHOLD);
        return threshold == null ? GPEH_ECNO_THRESHOLD_DEFAULT : Integer
                .valueOf(threshold);
    }

    @Override
    public List<HashId> getHashId(final int cellId, final short rncId) {
        final CellIdentifier identif = new CellIdentifier();
        identif.setCellId(cellId);
        identif.setRncId(rncId);
        return dataStore.getHashIds().get(identif);
    }

    @Override
    public List<HashId> getHashId(final int cellId, final int rncId) {
        final CellIdentifier identif = new CellIdentifier();
        identif.setCellId(cellId);
        identif.setRncId(rncId);
        return dataStore.getHashIds().get(identif);
    }

    @Override
    public Long getRncHashId(final short rncId) {
        return dataStore.getRncHashIds().get(rncId);
    }

    @Override
    public String getMcc(final long imsi) {
        final MccMncPair mccAndMnc = extractMccAndMnc(imsi);
        if (mccAndMnc == null) {
            return "";
        }
        return mccAndMnc.getMcc();

    }

    @Override
    public String getMnc(final long imsi) {
        final MccMncPair mccAndMnc = extractMccAndMnc(imsi);
        if (mccAndMnc == null) {
            return "";
        }
        return mccAndMnc.getMnc();
    }

    @Override
    public List<HashId> getHashId(final byte rat,final String mcc,final String mnc,final int lac,
        final int access_area_id) {

        final CellIdentifier identif = new CellIdentifier();

        identif.setRaw(true);
        identif.setRat(rat);
        identif.setMcc(mcc);
        identif.setMnc(mnc);
        identif.setLac(lac);
        identif.setAccess_area_id(access_area_id);

        return dataStore.getHashIds().get(identif);

    }

    @Override
    public boolean isRoaming(final String mcc,final String mnc) {
        if (mcc == null || mcc.length() == 0 || mnc == null
                || mcc.length() == 0) {
            // Don't know if UE is roaming or not
            return false;
        }
        // If Plmn Id is not in the list of home Plmn Ids then it is a roamer
        return !dataStore.getHomePlmnIds().contains(mcc + mnc);
    }

    @Override
    public boolean isInHfaWhitelist(final int eventId,final short exceptionClass,
            final short causeValue,final short subCauseValue) {
        final List<WhitelistValues> hfawhiteListValues = dataStore.getHfaWhitelist();
        if (hfawhiteListValues == null) {
            // Event has no whitelist entries, return false
            return false;
        }

        for (final WhitelistValues whitelistValues : hfawhiteListValues) {
            if (whitelistValues.containsValues(eventId, exceptionClass, causeValue,
                    subCauseValue)) {
                // Event has a whitelist entry with the specified values
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean isInCfaWhitelist(final int eventId,final byte rabDisconnectionCode,
            final byte rabDisconnectionSubcode) {
        final List<CfaWhitelistValues> cfawhiteListValues = dataStore
                .getCfaWhitelist();

        if (cfawhiteListValues == null) {
            return false;
        }

        for (final CfaWhitelistValues whitelistValues : cfawhiteListValues) {
            if (whitelistValues.containsValues(eventId, rabDisconnectionCode,
                    rabDisconnectionSubcode)) {
                return true;
            }
        }

        return false;
    }


    @Override
    public short getRncId(String rncName) {
        short defalutValue = -1;
        if(rncName!=null){
            Short rncId = dataStore.getRncName2RncIdList().get(rncName);
            if(rncId==null){
                return defalutValue;
            }else{
                return rncId;
            }
        }else{
            return defalutValue;
        }
    }

}