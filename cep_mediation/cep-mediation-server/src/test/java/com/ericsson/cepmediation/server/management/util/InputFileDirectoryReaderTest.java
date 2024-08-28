/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.server.management.util;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.base.util.ConfigData;
import com.ericsson.cepmediation.base.util.FileServerData;
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
public class InputFileDirectoryReaderTest {

    private InputFileDirectoryReader directoryReader;

    private CollectionAgentFactory collectionAgentFactory;

    private CollectionModeConfigured collectionModeConfigured;

    @Before
    public void setup() {
        collectionAgentFactory = mock(CollectionAgentFactory.class);
        collectionModeConfigured = mock(CollectionModeConfigured.class);

        directoryReader = new InputFileDirectoryReader();
        directoryReader.setCollectionAgentFactory(collectionAgentFactory);
        directoryReader.setCollectionModeConfigured(collectionModeConfigured);

    }

    @Test
    public void testgetOSSRNCDirectories_Symbolic() throws CollectionException {
        testGetOSSRNCDirectories_SymOrLocal();
    }

    @Test
    public void testgetOSSMMEDirectories_Symbolic() throws CollectionException {
        testGetOSSMMEDirectories_SymOrLocal();
    }

    @Test
    public void testgetOSSMMEDirectories_Remote() throws CollectionException {
        testGetOSSMMEDirectories("/rootFolder/", "/rootFolder/" + "ManagedElement=*", CollectionMode.REMOTE);
    }

    @Test
    public void testgetOSSMMEDirectories_Local() throws CollectionException {
        testGetOSSMMEDirectories_SymOrLocal();
    }

    private void testGetOSSMMEDirectories_SymOrLocal() throws CollectionException {
        String mmeRootDirectory = "/rootFolder/";
        testGetOSSMMEDirectories(mmeRootDirectory, mmeRootDirectory, CollectionMode.LOCAL);
    }

    private void testGetOSSMMEDirectories(String mmeRootDirectory, String expectedRootDirectory, CollectionMode collectionMode) throws CollectionException {
        ConfigData configurationData = mock(ConfigData.class);
        when(configurationData.getInputDirectory()).thenReturn(mmeRootDirectory);
        mockConfiguredCollectionMode(collectionMode);
        CollectionAgent collectionAgent = mockCollectionAgent();
        directoryReader.getOSSMMEDirectories(configurationData);
        verify(collectionAgent).listDirectories(expectedRootDirectory);
    }

    private void mockConfiguredCollectionMode(CollectionMode collectionMode) {
        when(collectionModeConfigured.getConfiguredCollectionMode(any(InputType.class))).thenReturn(collectionMode);
    }

    @Test
    public void testgetOSSRNCDirectories_Remote() throws CollectionException {
        testGetOSSRNCDirectories("/rncRootFolder/", "/rncRootFolder/" + "*", CollectionMode.REMOTE);
    }

    @Test
    public void testgetOSSRNCDirectories_Local() throws CollectionException {
        testGetOSSRNCDirectories_SymOrLocal();
    }

    private void testGetOSSRNCDirectories_SymOrLocal() throws CollectionException {
        testGetOSSRNCDirectories("/rncRootFolder/", "/rncRootFolder/", CollectionMode.LOCAL);
    }

    private void testGetOSSRNCDirectories(String rncRootDirectory, String expectedRncRootDirectoryToSearchOn, CollectionMode collectionMode) throws CollectionException {
        ConfigData configurationData = mock(ConfigData.class);
        when(configurationData.getInputDirectory()).thenReturn(rncRootDirectory);
        mockConfiguredCollectionMode(collectionMode);
        CollectionAgent collectionAgent = mockCollectionAgent();
        directoryReader.getOSSRNCDirectories(configurationData);
        verify(collectionAgent).listDirectories(expectedRncRootDirectoryToSearchOn);
    }

    private CollectionAgent mockCollectionAgent() {
        CollectionAgent collectionAgent = mock(CollectionAgent.class);
        when(collectionAgentFactory.createCollectionAgent(any(FileServerData.class), any(CollectionMode.class))).thenReturn(collectionAgent);
        return collectionAgent;
    }

}
