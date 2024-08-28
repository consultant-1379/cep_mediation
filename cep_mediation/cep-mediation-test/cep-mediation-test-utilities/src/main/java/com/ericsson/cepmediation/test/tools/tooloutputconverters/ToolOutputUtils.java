/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.tools.tooloutputconverters;

/**
 * @author eemecoy
 *
 */
public class ToolOutputUtils {

    private static final String KEY = "SessionPublisher";

    public static String stripHeaderInfoIfRequired(final String line) {
        if (lineStartsWithLog4JStuff(line)) {
            final String strippedLine = stripHeader(line);
            //  System.out.println(strippedLine);
            return strippedLine;
        }
        return line;
    }

    private static boolean lineStartsWithLog4JStuff(final String line) {
        return line.contains(KEY);
    }

    private static String stripHeader(final String line) {
        final int startIndex = line.indexOf(KEY) + KEY.length() + 3;
        return line.substring(startIndex, line.length());
    }

}
