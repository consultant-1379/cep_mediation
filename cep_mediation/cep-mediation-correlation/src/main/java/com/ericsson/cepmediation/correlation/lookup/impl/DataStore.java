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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;
import com.ericsson.cepmediation.base.database.entity.CellIdentifier;
import com.ericsson.cepmediation.base.database.entity.CfaWhitelistValues;
import com.ericsson.cepmediation.base.database.entity.HashId;
import com.ericsson.cepmediation.base.database.entity.MccMncPair;
import com.ericsson.cepmediation.base.database.entity.RabCombination;
import com.ericsson.cepmediation.base.database.entity.RabType;
import com.ericsson.cepmediation.base.database.entity.RabTypeInfo;
import com.ericsson.cepmediation.base.database.entity.WhitelistValues;
import com.ericsson.cepmediation.base.database.iq.IqDatabaseManager;
import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.correlation.support.Util;

/**
 * Layer to store the data retrieved for the database Includes a refresh mechanism that refreshes cache every X minutes This refresh mechanism isn't
 * automatic for every cache stored here - update the run() method in CacheRefresher to include a specific cache that should be refreshed
 * 
 * 
 * EQEV-1834 - topology refresh mechanism changed to load load changes since last refresh instead of total replacement, when it helps.
 * 
 */
public class DataStore {

    static final Logger LOGGER = LoggerFactory.getLogger(DataStore.class);

    private static final int NUMBER_MILLISECONDS_IN_MINUTE = 1000 * 60;

    private final IqDatabaseManager iqDatabaseManager;

    private Map<String, Integer> upProtocolList;

    private Map<String, Integer> upFunctionList;

    private Map<String, Integer> upClientList;

    private Map<String, Integer> upProviderList;

    private Map<String, Integer> upEncapsulationList;

    private Map<String, Integer> upEncryptionList;

    private Map<String, String> gpehThresholds;

    private Map<Integer, String> psRabs; // key is int, value is RAB description

    private Map<Integer, RabTypeInfo> rabTypesInfo;

    private Map<RabCombination, Short> rabCombinations2RabType;

    private Map<String, MccMncPair> mccMnc = null;

    private Map<String, Short> rncName2RncId;

    // key is RNC ID & cell ID pair, value is scrambling code
    private Map<CellIdentifier, Integer> scramblingCodes;
    private Date scramblingCodesLastUpdated = null;

    // key is RNC ID and cell ID, value is hash id
    private Map<CellIdentifier, List<HashId>> hashIds = null;
    private Date hashIdsLastUpdated = null;

    // key is RNC ID, value is RNC hash id
    private Map<Short, Long> rncHashIds;

    private Set<String> homePlmnIds;

    // key is event id
    private List<WhitelistValues> hfaWhitelist;

    private List<CfaWhitelistValues> cfaWhitelist;

    long sleepIntervalForCacheRefresh;

    public DataStore() {
        iqDatabaseManager = setUpIqDatabaseManagerInstance();
        // to get under
        // test
        loadDataFromDatabase();
        startRefreshThreadForSomeCaches();
    }

    private void loadDataFromDatabase() {
        loadPacketSwitchedRAB();
        loadRabTypeInfo();
        loadRabCombinations2RabType();
        loadMccMnc();
        if (Util.isSBEnabled()) {
            loadUserPlane();
        }
        loadGpehThresholds();
        loadScramblingCodeMappings();
        loadHashIds();
        loadRncHashIds();
        loadHomePlmnIds();
        loadHfaWhitelist();
        loadCfaWhitelist();
    }


    private void loadHashIds() {
        final Date now = new Date();
        final Map<CellIdentifier, List<HashId>> results = iqDatabaseManager.getHashIds(hashIdsLastUpdated);
        if (hashIds == null) {
            hashIds = new ConcurrentHashMap<CellIdentifier, List<HashId>>(results);
            LOGGER.info("Loaded " + hashIds.size() + " hashIds");
        } else {
            hashIds.putAll(results);
            LOGGER.info("Added " + results.size() + " hashIds");
        }
        hashIdsLastUpdated = now;
    }

    private void loadRncHashIds() {
        rncHashIds = new ConcurrentHashMap<Short, Long>(iqDatabaseManager.getRncHashIds());
        LOGGER.info("Loaded " + rncHashIds.size() + " rnc hash Ids");
    }

    void loadScramblingCodeMappings() {
        final Date now = new Date();
        int scramblingCodeMapIndex = 0;
        int rncnameTorncidMapIndex = 1;
        final List mapLists = iqDatabaseManager.getScramblingCodes(scramblingCodesLastUpdated);
        final Map<CellIdentifier, Integer> results = (Map<CellIdentifier, Integer>)mapLists.get(scramblingCodeMapIndex);
        final HashMap<String,Short> rncnameTorncid = (HashMap<String,Short>)mapLists.get(rncnameTorncidMapIndex);
        if (scramblingCodes == null) {
            scramblingCodes = new ConcurrentHashMap<CellIdentifier, Integer>(results);
            LOGGER.info("Loaded " + results.size() + " rnc/cell->scrambling code mappings");
        } else {
            scramblingCodes.putAll(results);
            LOGGER.info("Added " + results.size() + " rnc/cell->scrambling code mappings");
        }

        if(rncName2RncId==null){
            rncName2RncId = rncnameTorncid;
            LOGGER.info("Loaded " + results.size() + " rnc/rncName->rncName2RncId mappings");
        }else{
            rncnameTorncid.putAll(rncnameTorncid);
            LOGGER.info("Loaded " + results.size() + " rnc/rncName->rncName2RncId mappings");
        }
        scramblingCodesLastUpdated = now;
    }

    private void loadHomePlmnIds() {
        homePlmnIds = Collections.newSetFromMap(new ConcurrentHashMap<String, Boolean>());
        homePlmnIds.addAll(iqDatabaseManager.getHomePlmnIds());
        LOGGER.info("Loaded " + homePlmnIds.size() + " Home Plmn Ids");
    }

    private void loadHfaWhitelist() {
        hfaWhitelist = new ArrayList<WhitelistValues>(iqDatabaseManager.getHfaWhitelist());
        LOGGER.info("Loaded HFA Whitelist. " + hfaWhitelist.size() + " events have whitelist entries");
    }

    private void loadCfaWhitelist() {

        cfaWhitelist = new ArrayList<CfaWhitelistValues>();
        cfaWhitelist = iqDatabaseManager.getCfaWhitelist();

        LOGGER.info("Loaded CFA Whitelist. " + cfaWhitelist.size() + " events have whitelist entries");
    }

    private void loadUserPlane() {
        upProtocolList = new ConcurrentHashMap<String, Integer>(iqDatabaseManager.getUpProtocolList());
        upFunctionList = new ConcurrentHashMap<String, Integer>(iqDatabaseManager.getUpFunctionList());
        upClientList = new ConcurrentHashMap<String, Integer>(iqDatabaseManager.getUpClientList());
        upProviderList = new ConcurrentHashMap<String, Integer>(iqDatabaseManager.getUpProviderList());
        upEncapsulationList = new ConcurrentHashMap<String, Integer>(iqDatabaseManager.getUpEncapsulationList());
        upEncryptionList = new ConcurrentHashMap<String, Integer>(iqDatabaseManager.getUpEncryptionList());

        LOGGER.trace("Loaded " + upProtocolList.size() + " UP protocol mappings " + upProtocolList);
        LOGGER.trace("Loaded " + upFunctionList.size() + " UP function mappings " + upFunctionList);
        LOGGER.trace("Loaded " + upClientList.size() + " UP client mappings " + upClientList);
        LOGGER.trace("Loaded " + upProviderList.size() + " UP provider mappings " + upProviderList);
        LOGGER.trace("Loaded " + upEncapsulationList.size() + " UP encapsulation mappings " + upEncapsulationList);
        LOGGER.trace("Loaded " + upEncryptionList.size() + " UP encryption mappings " + upEncryptionList);
    }

    private void loadGpehThresholds() {
        gpehThresholds = new ConcurrentHashMap<String, String>(iqDatabaseManager.getGPEHThresholdList());
        LOGGER.trace("Loaded " + gpehThresholds.size() + " GPEH threshold values " + gpehThresholds);
    }

    private final void loadPacketSwitchedRAB() {
        psRabs = new HashMap<Integer, String>();
        final List<RabType> rows = iqDatabaseManager.getRabTypes();
        for (final RabType row : rows) {
            final Boolean isPsRab = row.getCategoryId();
            if (isPsRab) {
                psRabs.put(row.getRabType(), row.getRabTypeDesc());
            }
        }
        LOGGER.trace("Loaded " + psRabs.size() + " PS RABs from database " + psRabs.toString());
    }

    private final void loadRabTypeInfo() {
        rabTypesInfo = new HashMap<Integer, RabTypeInfo>();
        final List<RabType> rabTypes = iqDatabaseManager.getRabTypes();
        final Map<String, Short> description2RabType = getDescription2RabType(rabTypes);
        for (final RabType rabType : rabTypes) {
            final Integer rabTypeNumber = rabType.getRabType();
            final String rabTypeDescription = rabType.getRabTypeDesc();
            final List<Short> rabs = new ArrayList<Short>();
            if (rabTypeDescription != null && !rabTypeDescription.isEmpty()) {
                final byte psRabCount = countOccurences(rabTypeDescription, "_PS_");
                final byte csRabCount = countOccurences(rabTypeDescription, "_CS_");
                /*
                 * If rabType is in the description2RabType lookup, then retrieve value(s) from lookup Some values are not in the lookup as they have
                 * same description as "more important" rab types. See method getDescription2RabType(List<RabType> rabTypes)
                 */
                if (isRabTypeDescriptionInLookup(rabTypeNumber.intValue())) {
                    final String[] rabTypeDescriptionSplit = rabTypeDescription.split("-");
                    for (final String description : rabTypeDescriptionSplit) {
                        final Short rabTypeValue = description2RabType.get(description);
                        if (rabTypeValue != null) {
                            rabs.add(rabTypeValue);
                        } else {
                            // Should not get here but just in case
                            rabs.add(DefaultValues.DEFAULT_SHORT_VALUE);
                        }
                    }
                } else {
                    rabs.add(rabTypeNumber.shortValue());
                }

                final RabTypeInfo rabTypeInfo = new RabTypeInfo(psRabCount, csRabCount, rabs);
                rabTypesInfo.put(rabTypeNumber, rabTypeInfo);

            }
        }

    }

    private final void loadRabCombinations2RabType() {
        rabCombinations2RabType = new HashMap<RabCombination, Short>();
        for (final Map.Entry<Integer, RabTypeInfo> rabTypeInfo : rabTypesInfo.entrySet()) {
            final Short rabTypeNumber = rabTypeInfo.getKey().shortValue();
            final RabCombination rabs = rabTypeInfo.getValue().getComposedOfRabTypes();
            rabCombinations2RabType.put(rabs, rabTypeNumber);
        }
    }

    /*
     * Provides a mapping between the description of a rab and the rabType value. Only single rabs are added to the map i.e. description for
     * combinations are not added.
     * 
     * @param rabTypes
     * 
     * @return mapping between the description and the rabType value
     */
    private final Map<String, Short> getDescription2RabType(final List<RabType> rabTypes) {
        final Map<String, Short> results = new HashMap<String, Short>();
        for (final RabType rabType : rabTypes) {
            final Integer rabTypeNumber = rabType.getRabType();
            /*
             * Some rabTypes have same description as each other. Only 1 of these will be added to map to avoid overwriting each other.
             */
            if (isRabTypeDescriptionInLookup(rabTypeNumber.intValue())) {
                final String rabTypeDescription = rabType.getRabTypeDesc();
                final String[] rabDescriptions = rabTypeDescription.split("-");
                if (rabDescriptions.length == 1) {
                    /*
                     * Only add single rab descriptions, not combination descriptions
                     */
                    results.put(rabTypeDescription, rabTypeNumber.shortValue());
                }
            } else {
                continue;
            }
        }
        return results;
    }

    /*
     * Some rabTypes have the same descriptions e.g. rabType 2 and rabType 12. Only 1 of these rab types should be included in the lookup so that they
     * don't overwrite each other. The ones that are added are listed below
     * 
     * RabTypes with Same Description Value to put in Lookup 2, 12 2 40, 41 40 1, 11 1
     */
    private final boolean isRabTypeDescriptionInLookup(final int rabTypeNumber) {
        return !(rabTypeNumber == 12 || rabTypeNumber == 41 || rabTypeNumber == 11);
    }

    private final void loadMccMnc() {
        final List<MccMncPair> mccMncPairs = iqDatabaseManager.getMccMncPairs();
        mccMnc = new HashMap<String, MccMncPair>(mccMncPairs.size());
        for (final MccMncPair pair : mccMncPairs) {
            mccMnc.put(pair.getMcc() + pair.getMnc(), pair);
        }
        LOGGER.trace("Loaded mcc/mnc pairs: " + mccMnc.keySet());
    }

    private void startRefreshThreadForSomeCaches() {
        sleepIntervalForCacheRefresh = getConfiguredSleepIntervalInMS();
        LOGGER.debug("Refresh thread will run every " + sleepIntervalForCacheRefresh + "ms");
        final Runnable cacheRefresh = new CacheRefresher();
        new Thread(cacheRefresh).start();
    }

    long getConfiguredSleepIntervalInMS() {
        final int configuredCacheRefreshPeriodInMinutes = getIntProperty(CepMediationProperty.LOOKUPSERVICE_CACHE_REFRESH_PERIOD);
        return configuredCacheRefreshPeriodInMinutes * NUMBER_MILLISECONDS_IN_MINUTE;
    }

    int getIntProperty(final CepMediationProperty property) {
        return CepMediationProperties.getIntProperty(property);
    }

    /**
     * Making default to allow unit testing
     */
    IqDatabaseManager setUpIqDatabaseManagerInstance() {
        return IqDatabaseManager.getInstance();
    }

    public Map<CellIdentifier, Integer> getScramblingCodes() {
        return scramblingCodes;
    }

    public Set<String> getHomePlmnIds() {
        return homePlmnIds;
    }

    public List<WhitelistValues> getHfaWhitelist() {
        return hfaWhitelist;
    }

    public List<CfaWhitelistValues> getCfaWhitelist() {
        return cfaWhitelist;
    }

    /**
     * @return the upProtocolList
     */
    public Map<String, Integer> getUpProtocolList() {
        return upProtocolList;
    }

    /**
     * @return the upFunctionList
     */
    public Map<String, Integer> getUpFunctionList() {
        return upFunctionList;
    }

    /**
     * @return the upClientList
     */
    public Map<String, Integer> getUpClientList() {
        return upClientList;
    }

    /**
     * @return the upProviderList
     */
    public Map<String, Integer> getUpProviderList() {
        return upProviderList;
    }

    /**
     * @return the upEncapsulationList
     */
    public Map<String, Integer> getUpEncapsulationList() {
        return upEncapsulationList;
    }

    /**
     * @return the upEncryptionList
     */
    public Map<String, Integer> getUpEncryptionList() {
        return upEncryptionList;
    }

    /**
     * @return the gpehThresholds
     */
    public Map<String, String> getGpehThresholds() {
        return gpehThresholds;
    }

    /**
     * @return the psRabs
     */
    public Map<Integer, String> getPsRabs() {
        return psRabs;
    }

    public Map<Integer, RabTypeInfo> getRabTypesInfo() {
        return rabTypesInfo;
    }

    public Map<RabCombination, Short> getRabCombinations2RabType() {
        return rabCombinations2RabType;
    }

    private byte countOccurences(String source, final String pattern) {
        byte count = 0;
        int pos = source.indexOf(pattern);
        while (pos > -1) {
            count++;
            source = source.substring(pos + pattern.length());
            pos = source.indexOf(pattern);
        }
        return count;

    }

    public Map<CellIdentifier, List<HashId>> getHashIds() {
        return hashIds;
    }

    public Map<Short, Long> getRncHashIds() {
        return rncHashIds;
    }

    /**
     * @return the mccMnc
     */
    public Map<String, MccMncPair> getMccMnc() {
        return mccMnc;
    }

    public Map<String, Short> getRncName2RncIdList() {
        if(rncName2RncId==null){
            rncName2RncId = new HashMap<String, Short>();
        }
        return rncName2RncId;
    }

    class CacheRefresher implements Runnable {

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(sleepIntervalForCacheRefresh);
                    LOGGER.debug("Refreshing cache...");
                    loadScramblingCodeMappings();
                    loadGpehThresholds();
                    loadHashIds();
                    loadRncHashIds();
                    loadHomePlmnIds();
                    loadHfaWhitelist();
                    loadCfaWhitelist();
                } catch (final InterruptedException e) {
                    LOGGER.debug("Interrupted Exception caught", e);
                }
            }
        }
    }
}