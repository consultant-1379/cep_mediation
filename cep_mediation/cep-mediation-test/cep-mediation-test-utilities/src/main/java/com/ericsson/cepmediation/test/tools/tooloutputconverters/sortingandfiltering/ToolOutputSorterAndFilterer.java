/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.tools.tooloutputconverters.sortingandfiltering;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.ericsson.cepmediation.base.util.FileUtils;
import com.ericsson.cepmediation.test.util.FileUtilsForTest;

/**
 * @author eemecoy
 *
 */
public class ToolOutputSorterAndFilterer {

    private final String inputFile = "C:\\Users\\eemecoy\\Documents\\CEA\\decoded_rop_files\\A20120516\\1730-1745\\454061192646119_sessions.txt";

    private final long chosenIMSI = 454061192646119L;

    private void sortAndFilterFile() throws IOException, Exception {
        final List<String> linesInFile = FileUtils.readFile(inputFile);
        final List<String> sortedLines = sortAndFilterOtherIMSIs(linesInFile);
        FileUtilsForTest.writeToFile(sortedLines, inputFile + "_transformed.txt");
    }

    private List<String> sortAndFilterOtherIMSIs(final List<String> linesInFile) {
        ToolOutputSorter toolOutputSorter = new ToolOutputSorter();
        List<Session> sessions = toolOutputSorter.getAndSortSessions(linesInFile);
        filterOutUnwantedSessions(sessions);
        return toolOutputSorter.transformSessionsBackToLines(sessions);

    }

    private void filterOutUnwantedSessions(List<Session> sessions) {
        final Iterator<Session> iterator = sessions.iterator();
        while (iterator.hasNext()) {
            final Session session = iterator.next();
            final long imsi = session.getIMSI();
            System.out.println("For session at " + session.getTimestamp() + ", imsi is " + imsi);
            if (imsi != chosenIMSI) {
                System.out.println("Dumping session with imsi of " + imsi);
                iterator.remove();
            }
        }
        Collections.sort(sessions);
    }

    public static void main(final String[] args) throws Exception {
        new ToolOutputSorterAndFilterer().sortAndFilterFile();
    }
}
