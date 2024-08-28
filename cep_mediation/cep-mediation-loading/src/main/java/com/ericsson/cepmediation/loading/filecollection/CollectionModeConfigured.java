/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.filecollection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.loading.service.InputType;

/**
 * @author eemecoy
 *
 */
public class CollectionModeConfigured {
    private static final Logger logger = LoggerFactory.getLogger(CollectionAgentFactory.class);

    private CollectionMode defaultCollectionMode = CollectionMode.REMOTE;

    public CollectionMode getConfiguredCollectionMode(InputType inputType) {
        boolean supportsLocalFileCollection = doesInputTypeSupportLocalFileCollection(inputType);
        CepMediationProperty fileCollectionModePropertyName = getFileCollectionModePropertyName(inputType);
        final CollectionMode collectionMode = getCollectionModeSpecified(fileCollectionModePropertyName);
        if (collectionMode == CollectionMode.LOCAL && !supportsLocalFileCollection) {
            return defaultCollectionMode;

        }
        return collectionMode;
    }

    private CollectionMode getCollectionModeSpecified(CepMediationProperty propertyName) {
        String propertyValue = CepMediationProperties.getProperty(propertyName);
        if (propertyValue == null) {
            return CollectionMode.REMOTE;
        }
        CollectionMode valueOf = getMatchingEnum(propertyName, propertyValue);
        return valueOf;
    }

    private CepMediationProperty getFileCollectionModePropertyName(InputType inputType) {
        switch (inputType) {
        case GPEH:
            return CepMediationProperty.GENERAL_SERVER_RADIO_FILE_COLLECTION_MODE;
        case EBS:
            return CepMediationProperty.GENERAL_SERVER_CORE_FILE_COLLECTION_MODE;
        case CAPTOOL:
        case STAPLE:
            return CepMediationProperty.GENERAL_PROBE_FILE_COLLECTION_MODE;
        default:
            throw new RuntimeException("Nothing specified for input type " + inputType);
        }
    }

    private boolean doesInputTypeSupportLocalFileCollection(InputType inputType) {
        switch (inputType) {
        case GPEH:
        case EBS:
            return true;
        default:
            return false;
        }
    }

    private CollectionMode getMatchingEnum(CepMediationProperty propertyName, String propertyValue) {
        try {
            return CollectionMode.valueOf(propertyValue);
        } catch (IllegalArgumentException e) {
            logger.error("Invalid setting of " + propertyValue + " specified for property " + propertyName
                    + ", will default to " + defaultCollectionMode);
            return CollectionMode.REMOTE;
        }
    }
}
