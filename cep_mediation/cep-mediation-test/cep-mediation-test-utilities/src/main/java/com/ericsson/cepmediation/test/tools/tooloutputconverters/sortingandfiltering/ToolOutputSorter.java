/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.tools.tooloutputconverters.sortingandfiltering;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.ericsson.cepmediation.base.util.FileUtils;
import com.ericsson.cepmediation.test.tools.tooloutputconverters.ToolOutputUtils;
import com.ericsson.cepmediation.test.util.FileUtilsForTest;

/**
 * @author eemecoy
 *
 */
public class ToolOutputSorter {

    private final String inputFile = "C:\\Users\\eemecoy\\Documents\\CEA\\decoded_rop_files\\A20120516\\1645-1700\\454061105038251_sessions.txt";

    private boolean createNewSessionNextTime;

    private void sortFile() throws IOException, Exception {
        final List<String> linesInFile = FileUtils.readFile(inputFile);
        final List<String> sortedLines = sortLines(linesInFile);
        FileUtilsForTest.writeToFile(sortedLines, inputFile + "_sorted.txt");
    }

    public List<String> sortLines(final List<String> linesInFile) {
        List<Session> sessions = getAndSortSessions(linesInFile);
        return transformSessionsBackToLines(sessions);

    }

    public List<Session> getAndSortSessions(final List<String> linesInFile) {
        Session session = null;
        createNewSessionNextTime = true;
        List<Session> sessions = new ArrayList<Session>();
        for (final String line : linesInFile) {
            final String strippedLine = ToolOutputUtils.stripHeaderInfoIfRequired(line);
            if (shouldConsiderLine(strippedLine)) {
                session = getSession(sessions, session, strippedLine);
                session.add(strippedLine);
                if (isASessionEndMarker(strippedLine)) {
                    createNewSessionNextTime = true;
                }
            }
        }
        sessions.add(session);
        Collections.sort(sessions);
        return sessions;
    }

    List<String> transformSessionsBackToLines(List<Session> sessions) {
        final List<String> list = new ArrayList<String>();
        for (final Session session : sessions) {
            list.addAll(session.getLines());
        }
        return list;
    }

    private boolean shouldConsiderLine(final String line) {
        return line.contains("SN=") || isASessionEndMarker(line);
    }

    private boolean isASessionEndMarker(final String line) {
        return line.contains("======") || line.contains("-----") || line.contains("+++++");
    }

    private Session getSession(List<Session> sessions, final Session session, final String line) {
        if (createNewSessionNextTime) {
            if (session != null) {
                sessions.add(session);
            }
            createNewSessionNextTime = false;
            final String timestampOfFirstEvent = getTimestampFromLine(line);
            return new Session(timestampOfFirstEvent);
        }
        return session;
    }

    private String getTimestampFromLine(final String line) {
        final String[] tokens = line.split(",");
        return tokens[0];
    }

    public static void main(final String[] args) throws Exception {
        new ToolOutputSorter().sortFile();
    }
}
