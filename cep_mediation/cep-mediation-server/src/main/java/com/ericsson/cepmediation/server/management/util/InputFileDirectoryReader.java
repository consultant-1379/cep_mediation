/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.server.management.util;

import com.ericsson.cepmediation.base.util.ConfigData;
import com.ericsson.cepmediation.loading.filecollection.CollectionAgent;
import com.ericsson.cepmediation.loading.filecollection.CollectionAgentFactory;
import com.ericsson.cepmediation.loading.filecollection.CollectionException;
import com.ericsson.cepmediation.loading.filecollection.CollectionMode;
import com.ericsson.cepmediation.loading.filecollection.CollectionModeConfigured;
import com.ericsson.cepmediation.loading.service.InputType;

/**
 * @author eemecoy
 *
 */
public class InputFileDirectoryReader {

    private CollectionAgentFactory collectionAgentFactory = new CollectionAgentFactory();

    private CollectionModeConfigured collectionModeConfigured = new CollectionModeConfigured();

    public String[] getOSSMMEDirectories(final ConfigData configurationData) throws CollectionException {
        CollectionMode configuredCollectionMode = collectionModeConfigured.getConfiguredCollectionMode(InputType.EBS);
        String directoryToLookup = null;
        switch (configuredCollectionMode) {
        case REMOTE:
            directoryToLookup = configurationData.getInputDirectory() + "ManagedElement=*";
            break;
        default:
            directoryToLookup = configurationData.getInputDirectory();
            break;

        }

        CollectionAgent collectionAgent = collectionAgentFactory.createCollectionAgent(configurationData.getServerData(), configuredCollectionMode);
        return collectionAgent.listDirectories(directoryToLookup);
    }

    public String[] getOSSRNCDirectories(final ConfigData configurationData) throws CollectionException {
        CollectionMode configuredCollectionMode = collectionModeConfigured.getConfiguredCollectionMode(InputType.GPEH);
        String directoryToLookup = null;
        switch (configuredCollectionMode) {
        case REMOTE:
            directoryToLookup = configurationData.getInputDirectory() + "*";
            break;
        default:
            directoryToLookup = configurationData.getInputDirectory();
            break;
        }
        CollectionAgent collectionAgent = collectionAgentFactory.createCollectionAgent(configurationData.getServerData(), configuredCollectionMode);
        return collectionAgent.listDirectories(directoryToLookup);
    }

    public String[] getStapleDirectories(final ConfigData configurationData) throws CollectionException {
        CollectionAgent collectionAgent = collectionAgentFactory.createCollectionAgent(configurationData.getServerData(), InputType.STAPLE);
        return collectionAgent.listDirectories(configurationData.getInputDirectory() + "*");
    }

    /**
     * @param collectionAgentFactory the collectionAgentFactory to set
     */
    void setCollectionAgentFactory(CollectionAgentFactory collectionAgentFactory) {
        this.collectionAgentFactory = collectionAgentFactory;
    }

    /**
     * @param collectionModeConfigured the collectionModeConfigured to set
     */
    void setCollectionModeConfigured(CollectionModeConfigured collectionModeConfigured) {
        this.collectionModeConfigured = collectionModeConfigured;
    }

}
