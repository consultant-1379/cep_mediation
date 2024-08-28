/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.status;

import static com.ericsson.cepmediation.base.util.text.StringConstants.*;

import java.util.StringTokenizer;

import com.ericsson.cepmediation.base.util.text.EnumTranslator;

/**
 * @author eemecoy
 *
 */
public class StartStopStatusUpdateHelper {

    public static String toDescription(final StartStopStatusUpdate statusUpdate) {
        return EnumTranslator.translateEnumToEnglish(statusUpdate);
    }

    public static StartStopStatusUpdate convertLogMessageToStatusUpdate(final String logMessage) {
        final String enumText = convertLogMessageToEnumText(logMessage);
        return StartStopStatusUpdate.valueOf(enumText);

    }

    private static String convertLogMessageToEnumText(final String logMessage) {
        final String messageWithUnderscores = replaceSpacesWithUnderscores(logMessage);
        return messageWithUnderscores.toUpperCase();

    }

    private static String replaceSpacesWithUnderscores(final String logMessage) {
        final StringTokenizer tokenizer = new StringTokenizer(logMessage, " ");
        final StringBuilder result = new StringBuilder();
        while (tokenizer.hasMoreTokens()) {
            final String token = tokenizer.nextToken();
            result.append(token);
            result.append(UNDERSCORE);
        }
        removeLastUnderscore(result);
        return result.toString();

    }

    private static void removeLastUnderscore(final StringBuilder stringBuilder) {
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);

    }

}
