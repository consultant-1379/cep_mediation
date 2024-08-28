/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.stalerops;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.test.common.DateTimeUtilities;

/**
 * @author eemecoy
 *
 */
public class StaleRopCheckTest {

    private StaleRopCheck staleRopCheck;

    @Before
    public void setup() {
        staleRopCheck = new StaleRopCheck();
    }

    @Test
    public void testIsStaleRopIsTrueForOldRop() {
        testIsStaleRop(DateTimeUtilities.timestampForTwoHoursAgo(), true);
    }

    @Test
    public void testIsStaleRopIsFalseForCurrentTime() {
        testIsStaleRop(System.currentTimeMillis(), false);
    }

    private void testIsStaleRop(long timestamp, boolean expectedResult) {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        long currTime = cal.getTimeInMillis();
        assertThat(staleRopCheck.isStaleRop(timestamp, currTime), is(expectedResult));
    }

}
