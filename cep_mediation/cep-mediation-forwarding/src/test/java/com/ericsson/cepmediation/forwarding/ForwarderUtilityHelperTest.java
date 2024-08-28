/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2014
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/

package com.ericsson.cepmediation.forwarding;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;

public class ForwarderUtilityHelperTest {

    private static final String name = null;
    private static final String hostname = "hostname";
    private static final String IpAddress1 = "10.1.1.1";
    private static final String IpAddress2 = null;
    private static final int processId = 1;
    private static final String result1 = "10_1_1_1_1_";
    private static final String result2 = "hostname_1_";
    private static final String[] fileSystemMountDirNames = { "00", "01", "02",
            "03" };
    private static Set<String> event2measTypeDetailsCheck = new HashSet();
    private static final String dirFifteenMinute6 = "15min/6/";

    @Test
    public void testConstructFilePrefixWithNullHostname() {
        ForwarderUtilityHelper.setInitialData(hostname, IpAddress1, processId);
        String returnedValue = ForwarderUtilityHelper.constructFilePrefix();
        assertThat(returnedValue, is(result1));
    }

    @Test
    public void testConstructFilePrefixWithNullIp() {
        ForwarderUtilityHelper.setInitialData(hostname, IpAddress2, processId);
        String returnedValue = ForwarderUtilityHelper.constructFilePrefix();
        assertThat(returnedValue, is(result2));
    }

    @Test
    public void testConstructFilePrefixWithNullValues() {
        ForwarderUtilityHelper.setInitialData(name, IpAddress2, processId);
        String returnedValue = null;
        returnedValue = ForwarderUtilityHelper.constructFilePrefix();
        assertNotNull(returnedValue);
    }

    @Test
    public void testCanEventBeStored() {
        boolean result = ForwarderUtilityHelper
                .canEventBeStored(new GPEH_SESSION());
        assertThat(result, is(true));
    }

    @Test
    public void testProcId() {
        ForwarderUtilityHelper.setInitialData(hostname, IpAddress2, processId);
        int returnedValue = ForwarderUtilityHelper.getProcId();
        assertThat(returnedValue, is(processId));
    }

    @Test
    public void testGetAllEventAbsoluteNames() {
        Set<String> returnedValue = ForwarderUtilityHelper
                .getAllEventAbsoluteNames();
        assertThat(returnedValue, is(event2measTypeDetailsCheck));
    }

    @Test
    public void testGetMeasTypes() {
        Set<String> returnedValue = ForwarderUtilityHelper.getMeasTypes();
        assertThat(returnedValue, is(event2measTypeDetailsCheck));
    }

    @Test
    public void testGetFileSystemMountDirNames() {
        String[] returnedValue = ForwarderUtilityHelper
                .getFileSystemMountDirNames();
        assertThat(returnedValue, is(fileSystemMountDirNames));
    }

@Test
public void testGetFifteenMinDirNames() {
    String returnedValue = ForwarderUtilityHelper.getFifteenMinDirNames();
    assertThat(returnedValue, is(dirFifteenMinute6));
}
}