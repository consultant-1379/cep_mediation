/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.filecollection.local;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import java.io.File;
import java.io.FilenameFilter;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.loading.filecollection.CollectionException;

/**
 * @author eemecoy
 *
 */
public class LocalFileAgentTest {

    private LocalFileAgent localFileAgent;

    File mockedFileObject;

    @Before
    public void setup() {
        mockedFileObject = mockFolderWithOneFile("");
        localFileAgent = new StubbedLocalFileAgent();
    }

    @Test
    public void testListFiles() throws CollectionException {
        String path = "/parent/path";
        String[] paths = new String[] { path };
        String regexPattern = null;
        when(mockedFileObject.exists()).thenReturn(true);
        String fileName1 = "file1";
        File file1 = mockFileObject(fileName1);
        String fileName2 = "file2";
        File file2 = mockFileObject(fileName2);
        File[] files = new File[] { file1, file2 };
        when(mockedFileObject.listFiles((FilenameFilter) anyObject())).thenReturn(files);
        TreeSet<String> result = localFileAgent.listFiles(paths, regexPattern);
        assertThat(result.size(), is(2));
        checkFileInResult(fileName1, result);
        checkFileInResult(fileName2, result);
    }

    private File mockFileObject(String fileName) {
        File mockedFile = mock(File.class);
        when(mockedFile.getAbsolutePath()).thenReturn(fileName);
        return mockedFile;
    }

    private void checkFileInResult(String fileName, TreeSet<String> result) {
        assertThat("Result should have contained " + fileName + " but was " + result, result.contains(fileName),
                is(true));
    }

    @Test
    public void testListDirectories_ParentFolder() throws CollectionException {
        String subDir1 = "/parent/path/subDir1";
        String subDir2 = "/parent/path/subDir2";
        File folder1 = mockFolderWithOneFile(subDir1);
        File folder2 = mockFolderWithOneFile(subDir2);
        File[] foldersInParentFolder = new File[] { folder1, folder2 };
        when(mockedFileObject.listFiles()).thenReturn(foldersInParentFolder);
        String[] directories = localFileAgent.listDirectories("/parent/path/");
        assertThat(directories.length, is(2));
        assertThat(directories[0], is(subDir1));
        assertThat(directories[1], is(subDir2));
    }

    private File mockFolderWithOneFile(String folderName) {
        File mockedFolder = mock(File.class);
        when(mockedFolder.isDirectory()).thenReturn(true);
        File file = mock(File.class);
        when(file.isDirectory()).thenReturn(false);
        File[] files = new File[] { file };
        when(mockedFolder.listFiles()).thenReturn(files);
        when(mockedFolder.getAbsolutePath()).thenReturn(folderName);
        return mockedFolder;
    }

    @Test
    public void testNullPointerNotThrownWhenListReturnsNull() throws CollectionException {
        final String[] result = localFileAgent.listDirectories(null);
        assertNotNull(result);
        assertThat(result.length, is(0));
    }

    class StubbedLocalFileAgent extends LocalFileAgent {
        @Override
        protected File createFileObject(final String path) {
            return mockedFileObject;
        }
    }

}
