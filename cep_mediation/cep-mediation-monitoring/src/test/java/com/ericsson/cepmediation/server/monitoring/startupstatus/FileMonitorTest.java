/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.server.monitoring.startupstatus;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * @author eemecoy
 *
 */
public class FileMonitorTest {

    private static final String EXTRA_LINE_IN_FILE = "an extra string";

    private FileMonitor fileMonitor;

    List<String> linesInFile;

    private List<String> bunchOfLines;

    private List<String> anotherBunchOfLines;

    @Before
    public void setup() {
        setUpLineBunches();
        linesInFile = new ArrayList<String>();
        fileMonitor = new StubbedFileMonitor(null);
    }

    private void setUpLineBunches() {
        bunchOfLines = new ArrayList<String>();
        bunchOfLines.add("some string");
        bunchOfLines.add("some string 2");
        anotherBunchOfLines = new ArrayList<String>();
        anotherBunchOfLines.addAll(bunchOfLines);
        anotherBunchOfLines.add(EXTRA_LINE_IN_FILE);
    }

    @Test
    public void testReadingFileForFirstTime() throws IOException {
        linesInFile = bunchOfLines;
        assertThat(fileMonitor.getNewLinesInFile(), is(bunchOfLines));
    }

    @Test
    public void testReadingFileTwiceFileHasChanged() throws IOException {
        linesInFile = bunchOfLines;
        assertThat(fileMonitor.getNewLinesInFile(), is(bunchOfLines));
        linesInFile = anotherBunchOfLines;
        final List<String> newLinesInFile = fileMonitor.getNewLinesInFile();
        assertThat(newLinesInFile.size(), is(1));
        assertThat(newLinesInFile.contains(EXTRA_LINE_IN_FILE), is(true));
    }

    class StubbedFileMonitor extends FileMonitor {

        public StubbedFileMonitor(final String fileName) {
            super(fileName);
        }

        /* (non-Javadoc)
        * @see com.ericsson.cepmediation.server.monitoring.startupstatus.FileMonitor#readLinesInFile()
        */
        @Override
        List<String> readLinesInFile() throws IOException {
            return linesInFile;
        }

    }
}
