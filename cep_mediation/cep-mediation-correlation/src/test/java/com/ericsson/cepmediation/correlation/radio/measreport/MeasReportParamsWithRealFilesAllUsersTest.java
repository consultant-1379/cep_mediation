/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.radio.measreport;

import org.junit.Test;

/**
 * @author eemecoyl
 *
 */
public class MeasReportParamsWithRealFilesAllUsersTest extends BaseMeasReportParamsWithRealFilesTest {

    @Test
    public void testRunningEntireRopThruEsper() {
        sendEventsToEsperAndVerifySomeSessions();
    }

}
