/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.filecollection;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Properties;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.loading.service.InputType;
import com.ericsson.cepmediation.test.util.PrivateFieldAccessor;
import com.ericsson.cepmediation.test.util.PrivateMethodCaller;

/**
 * @author eemecoy
 *
 */
public class CollectionModeConfiguredTest {

    private CollectionModeConfigured collectionModeConfigured;

    private PrivateFieldAccessor propertiesAccessor;

    private PrivateMethodCaller getFileCollectionModePropertyNameCaller;

    @Before
    public void setup() throws SecurityException, IllegalArgumentException, NoSuchFieldException,
            IllegalAccessException {
        collectionModeConfigured = new CollectionModeConfigured();
        propertiesAccessor = new PrivateFieldAccessor(CepMediationProperties.getInstance(), "cepMediationProperties");
        getFileCollectionModePropertyNameCaller = new PrivateMethodCaller(collectionModeConfigured,
                "getFileCollectionModePropertyName", InputType.class);
    }

    @Test
    public void testSSHAgentCreatedByDefaultIfPropertyInvalid() {
        InputType type = InputType.GPEH;
        setPropVal(type, "some invalid setting");
        testGettingConfiguredCollectionMode(CollectionMode.REMOTE, type);
    }

    @Test
    public void testSymLinkAgentCreatedIf_SymLinkConfigured() {
        InputType type = InputType.GPEH;
        setPropVal(type, CollectionMode.SYMBOLIC_LINK.toString());
        testGettingConfiguredCollectionMode(CollectionMode.SYMBOLIC_LINK, type);
    }

    @Test
    public void testSSHAgentCreatedIf_DoesNotSupportLocalMode_Captool() {
        testGettingConfiguredCollectionMode(CollectionMode.REMOTE, InputType.CAPTOOL);
    }

    @Test
    public void testSSHAgentCreatedIf_DoesNotSupportLocalMode_Staple() {
        testGettingConfiguredCollectionMode(CollectionMode.REMOTE, InputType.STAPLE);
    }

    @Test
    public void testNFSAgentCreatedIf_SupportsLocalMode_LocalModeConfigured_EBS() {
        verifyLocalFileAgentCreatedForInputType(InputType.EBS);
    }

    private void verifyLocalFileAgentCreatedForInputType(InputType inputType) {
        setPropVal(inputType, CollectionMode.LOCAL.toString());
        testGettingConfiguredCollectionMode(CollectionMode.LOCAL, inputType);
    }

    @Test
    public void testNFSAgentCreatedIf_SupportsLocalMode_LocalModeConfigured_GPEH() {
        verifyLocalFileAgentCreatedForInputType(InputType.GPEH);
    }

    @Test
    public void testSSHAgentCreatedIf_SupportsLocalMode_LocalModeNotConfigured() {
        InputType type = InputType.GPEH;
        setPropVal(type, CollectionMode.REMOTE.toString());
        testGettingConfiguredCollectionMode(CollectionMode.REMOTE, type);
    }

    private void testGettingConfiguredCollectionMode(CollectionMode expectedCollectionMode, InputType inputType) {
        CollectionMode collectionAgent = collectionModeConfigured.getConfiguredCollectionMode(inputType);
        assertThat(collectionAgent, is(expectedCollectionMode));
    }

    @Test
    public void testgetFileCollectionModePropertyName() {
        testPropertyNameIsCorrect(InputType.GPEH, CepMediationProperty.GENERAL_SERVER_RADIO_FILE_COLLECTION_MODE);
        testPropertyNameIsCorrect(InputType.EBS, CepMediationProperty.GENERAL_SERVER_CORE_FILE_COLLECTION_MODE);
        testPropertyNameIsCorrect(InputType.STAPLE, CepMediationProperty.GENERAL_PROBE_FILE_COLLECTION_MODE);
        testPropertyNameIsCorrect(InputType.CAPTOOL, CepMediationProperty.GENERAL_PROBE_FILE_COLLECTION_MODE);
    }

    private void setPropVal(InputType type, String val) {
        try {
            CepMediationProperty prop = (CepMediationProperty) getFileCollectionModePropertyNameCaller.call(type);
            String key = prop.getPropertyName();
            Properties props = (Properties) propertiesAccessor.getVal();
            props.put(key, val);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void testPropertyNameIsCorrect(InputType inputType, CepMediationProperty expectedProperty) {
        try {
            CepMediationProperty prop = (CepMediationProperty) getFileCollectionModePropertyNameCaller.call(inputType);
            assertThat(prop, is(expectedProperty));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
