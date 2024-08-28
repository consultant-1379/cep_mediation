/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.precorrelation.esperservices.impl;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.ericsson.cepmediation.test.util.FileUtilsForTest;

/**
 * @author eemecoy
 *
 */
public class CheckEPLFilesForAuditTest {

    @Test
    public void checkNoAuditsCommitedInProductionEPLFiles() throws IOException {
        checkNoAuditCommitedIn("esper/rc.epl");
    }

    private void checkNoAuditCommitedIn(String eplFileOnClasspath) throws IOException {
        String fileContents = FileUtilsForTest.readFileFromClasspath(eplFileOnClasspath);
        assertFalse(eplFileOnClasspath + " should not contain @Audit", fileContents.contains("@Audit"));
    }
}
