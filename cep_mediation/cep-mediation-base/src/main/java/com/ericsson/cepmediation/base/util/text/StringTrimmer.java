/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.util.text;

import java.util.ArrayList;
import java.util.List;

/**
 * @author eemecoy
 *
 */
public class StringTrimmer {

    public static List<String> trimStrings(List<String> inputStrings) {
        List<String> trimmedStrings = new ArrayList<String>();
        for (String name : inputStrings) {
            trimmedStrings.add(name.trim());
        }
        return trimmedStrings;
    }

}
