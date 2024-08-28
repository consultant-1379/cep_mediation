/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.service.task.gpeh;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.loading.filerecords.Record;
import com.ericsson.cepmediation.loading.filerecords.RecordBuffer;

/**
 * @author eemecoy
 *
 */
@Ignore
public class GPEHSubFilesCheckerMockedTest {

    private GPEHSubFilesChecker gpehSubFilesChecker;

    RecordBuffer mockedRecordBuffer;

    private boolean subFileCheckConfigured;

    @Before
    public void setup() {
        subFileCheckConfigured = false;
        mockedRecordBuffer = mock(RecordBuffer.class);
        gpehSubFilesChecker = new StubbedGPEHSubFilesChecker();
    }

    @Test
    public void testAreAllSubFilesPresentIsTrueIfPropertyConfiguredToFalse() {
        subFileCheckConfigured = false;
        assertThat(gpehSubFilesChecker.areAllSubFilesPresent(null), is(true));
    }

    @Test
    public void testAreAllSubFilesPresentIsTrueIfMoreSubFilesPresentThanInLinkFile() throws Exception {
        final Collection<File> filesForROP = mockActualFiles(3);
        mockExpectedSubFiles(2);
        final boolean areAllSubFilesPresent = gpehSubFilesChecker.areAllSubFilesPresent(filesForROP);
        assertThat(areAllSubFilesPresent, is(true));
    }

    private void mockExpectedSubFiles(final int numberExpectedSubFiles) {
        final List<Record> listOfExpectedSubFiles = new ArrayList<Record>();
        for (int i = 0; i < numberExpectedSubFiles; i++) {
            listOfExpectedSubFiles.add(mock(Record.class));
        }
        when(mockedRecordBuffer.getRecordList()).thenReturn(listOfExpectedSubFiles);
    }

    private Collection<File> mockActualFiles(final int numberFilesToMock) {
        final Collection<File> filesForROP = new ArrayList<File>();
        filesForROP.add(mockFile("ROP_Mp0.bin.gz"));
        for (int i = 1; i < numberFilesToMock; i++) {
            filesForROP.add(mockFile("ROP_Mp.bin.gz" + i));
        }
        return filesForROP;
    }

    private File mockFile(final String fileName) {
        final File mockedLinkFile = mock(File.class);
        when(mockedLinkFile.getName()).thenReturn(fileName);
        when(mockedLinkFile.getAbsolutePath()).thenReturn("");
        return mockedLinkFile;
    }

    class StubbedGPEHSubFilesChecker extends GPEHSubFilesChecker {
        // TODO: Commented out because compilation is failing.
        //        @Override
        //        RecordBuffer createRecordBuffer(RecordDescriptor recordDescriptor, File linkFile) throws IOException {
        //            return mockedRecordBuffer;
        //        }

        @Override
        boolean getPropertyValue(final CepMediationProperty propertyName) {
            return subFileCheckConfigured;
        }
    }
}
