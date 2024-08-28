/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.util.text;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.commons.lang.WordUtils;

/**
 * @author eemecoy
 *
 */
public abstract class EnumTranslator {

    private static final String UNDERSCORE = "_";

    private static final String SPACE = " ";

    public static String translateEnumToEnglish(final Enum<?> statusUpdate) {
        final StringBuilder stringBuilder = new StringBuilder();
        final String enumString = statusUpdate.toString();
        final List<String> tokens = getTokensInString(enumString);
        for (int i = 0; i < tokens.size(); i++) {
            final String word = tokens.get(i);
            stringBuilder.append(correctCase(i, word));
            if (isNotLastWord(i, tokens)) {
                stringBuilder.append(SPACE);
            }
        }
        return stringBuilder.toString();

    }

    private static String correctCase(final int i, final String word) {
        String wordInCorrectCase;
        final String wordInLowerCase = word.toLowerCase();
        if (isFirstWord(i)) {
            wordInCorrectCase = WordUtils.capitalize(wordInLowerCase);
        } else {
            wordInCorrectCase = wordInLowerCase;
        }
        return wordInCorrectCase;
    }

    private static boolean isNotLastWord(final int i, final List<String> tokens) {
        return i < tokens.size() - 1;
    }

    private static boolean isFirstWord(final int i) {
        return i == 0;
    }

    private static List<String> getTokensInString(final String enumString) {
        final List<String> tokens = new ArrayList<String>();
        final StringTokenizer stringTokenizer = new StringTokenizer(enumString, UNDERSCORE);
        while (stringTokenizer.hasMoreElements()) {
            final String token = (String) stringTokenizer.nextElement();
            tokens.add(token);
        }
        return tokens;
    }

}
