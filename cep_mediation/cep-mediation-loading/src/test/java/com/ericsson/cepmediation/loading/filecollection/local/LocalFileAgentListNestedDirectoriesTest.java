/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.filecollection.local;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.loading.filecollection.CollectionException;

/**
 * @author eemecoy
 *
 */
public class LocalFileAgentListNestedDirectoriesTest {

    private LocalFileAgent localFileAgent;

    Map<String, File> mockedFiles;

    @Before
    public void setup() {
        mockedFiles = new HashMap<String, File>();
        localFileAgent = new StubbedLocalFileAgent();
    }

    @Test
    public void testListingNestedDirectoriesReturnsOnlySubFoldersContainingFiles() throws CollectionException {
        String topLevelFolderName = "/parent";
        String subFolderNameLevel1 = topLevelFolderName + "/subFolder1";
        String subFolderNameLevel2 = subFolderNameLevel1 + "/subFolder";
        mockTopLevelFolder(topLevelFolderName, subFolderNameLevel1, subFolderNameLevel2);
        String[] result = localFileAgent.listDirectories(topLevelFolderName);
        assertNotNull(result);
        assertThat(result.length, is(1));
        assertThat(result[0], is(subFolderNameLevel2));

    }

    private void mockTopLevelFolder(String topLevelFolderName, String subFolderNameLevel1, String subFolderNameLevel2) {
        File topLevelFolder = mockFolder(topLevelFolderName);
        File subFolder1 = mockSubFolder(subFolderNameLevel1);
        File[] subFolders = new File[] { subFolder1 };
        when(topLevelFolder.listFiles()).thenReturn(subFolders);
        File subFolder2 = mockFolder(subFolderNameLevel2);
        when(subFolder1.listFiles()).thenReturn(new File[] { subFolder2 });
        mockedFiles.put(topLevelFolderName, topLevelFolder);
        mockedFiles.put(subFolderNameLevel1, subFolder1);
        mockedFiles.put(subFolderNameLevel2, subFolder2);
    }

    private File mockSubFolder(String subFolderName) {
        File subFolder = mockFolder(subFolderName);
        File file = mock(File.class);
        File[] files = new File[] { file };
        when(subFolder.listFiles()).thenReturn(files);
        return subFolder;
    }

    private File mockFolder(String folderName) {
        File folder = mock(File.class, folderName);
        when(folder.exists()).thenReturn(true);
        when(folder.isDirectory()).thenReturn(true);
        when(folder.getAbsolutePath()).thenReturn(folderName);
        return folder;
    }

    class StubbedLocalFileAgent extends LocalFileAgent {
        @Override
        protected File createFileObject(String path) {
            return mockedFiles.get(path);
        }
    }

}
