/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.util.text;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * @author eemecoy
 *
 */
public class StringTrimmerTest {

    @Test
    public void testTrimmingStrings() {
        List<String> inputStrings = new ArrayList<String>();
        String okString = "some string with no trailing whitespace";
        String stringWithTrailingWhiteSpaceStripped = "some string with trailing whitespace";
        String stringWithTrailingWhiteSpace = stringWithTrailingWhiteSpaceStripped + "\n";
        inputStrings.add(okString);
        inputStrings.add(stringWithTrailingWhiteSpace);
        List<String> result = StringTrimmer.trimStrings(inputStrings);
        assertThat(result.size(), is(2));
        assertThat(result.contains(okString), is(true));
        assertThat(result.contains(stringWithTrailingWhiteSpaceStripped), is(true));
    }
}
