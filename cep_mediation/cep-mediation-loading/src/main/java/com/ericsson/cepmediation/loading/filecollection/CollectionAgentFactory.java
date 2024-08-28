/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.filecollection;

import com.ericsson.cepmediation.base.util.FileServerData;
import com.ericsson.cepmediation.loading.filecollection.local.LocalFileAgent;
import com.ericsson.cepmediation.loading.filecollection.ssh.SSHAgent;
import com.ericsson.cepmediation.loading.service.InputType;

/**
 * @author eemecoy
 *
 */
public class CollectionAgentFactory {

    private CollectionModeConfigured collectionModeConfigured = new CollectionModeConfigured();

    public CollectionAgent createCollectionAgent(FileServerData fileServerData, InputType inputType) {
        return createCollectionAgent(fileServerData, collectionModeConfigured.getConfiguredCollectionMode(inputType));
    }

    /**
     * @param collectionModeConfigured the collectionModeConfigured to set
     */
    void setCollectionModeConfigured(CollectionModeConfigured collectionModeConfigured) {
        this.collectionModeConfigured = collectionModeConfigured;
    }

    public CollectionAgent createCollectionAgent(FileServerData fileServerData, CollectionMode configuredCollectionMode) {
        switch (configuredCollectionMode) {
        case LOCAL:
        case SYMBOLIC_LINK:
            return new LocalFileAgent();
        case REMOTE:
        default:
            return new SSHAgent(fileServerData);
        }
    }
}
