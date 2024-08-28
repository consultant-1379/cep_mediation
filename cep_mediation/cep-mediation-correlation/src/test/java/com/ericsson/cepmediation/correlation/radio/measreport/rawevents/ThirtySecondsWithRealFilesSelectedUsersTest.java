/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.radio.measreport.rawevents;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.EE_RRC_MEASUREMENT;
import com.ericsson.cepmediation.test.common.RadioUser;
import com.ericsson.cepmediation.test.util.tracer.EE_RRC_MEASUREMENTReporter;

/**
 * @author eemecoy
 *
 */
public class ThirtySecondsWithRealFilesSelectedUsersTest extends BaseThirtySecondsWithRealFilesTest {

    @Before
    public void setup() {
        setupSelectedUsers();
    }

    @Test
    public void testLoadingEventsForSelectedUsers() {
        final List<EE_RRC_MEASUREMENT> measurementWindows = parseFilesLoadEventsAndFetchMeasurementWindows();
        EE_RRC_MEASUREMENTReporter.traceMeasurements(measurementWindows);
        checkMeasurementWindowsForUser(measurementWindows, 454063307348471L);
    }

    /**
     * These are the uecontexts/rncmoduleids for the IMSI 454063307348471 in this ROP
     */
    private void setupSelectedUsers() {
        addUeContextsAndRncModuleIdCombinationsForIMSI454063307348471();
        addUeContextsAndRncModuleIdCombinationsForIMSI454061101343047();
    }

    private void addUeContextsAndRncModuleIdCombinationsForIMSI454061101343047() {
        RadioUser radioUser1 = new RadioUser();
        radioUser1.setUeContextForUser((short) 3138);
        radioUser1.setRncModuleIdForUser((byte) 7);
        radioUserFilter.addUser(radioUser1);

        RadioUser radioUser2 = new RadioUser();
        radioUser2.setUeContextForUser((short) 3138);
        radioUser2.setRncModuleIdForUser((byte) 13);
        radioUserFilter.addUser(radioUser2);

        RadioUser radioUser3 = new RadioUser();
        radioUser3.setUeContextForUser((short) 3138);
        radioUser3.setRncModuleIdForUser((byte) 27);
        radioUserFilter.addUser(radioUser3);

        RadioUser radioUser4 = new RadioUser();
        radioUser4.setUeContextForUser((short) 3138);
        radioUser4.setRncModuleIdForUser((byte) 27);
        radioUserFilter.addUser(radioUser4);

    }

    private void addUeContextsAndRncModuleIdCombinationsForIMSI454063307348471() {

        final RadioUser radioUser1 = new RadioUser();
        radioUser1.setUeContextForUser((short) 3775);
        radioUser1.setRncModuleIdForUser((byte) 12);
        radioUserFilter.addUser(radioUser1);

        final RadioUser radioUser3 = new RadioUser();
        radioUser3.setUeContextForUser((short) 2201);
        radioUser3.setRncModuleIdForUser((byte) 14);
        radioUserFilter.addUser(radioUser3);

        final RadioUser radioUser4 = new RadioUser();
        radioUser4.setUeContextForUser((short) 3964);
        radioUser4.setRncModuleIdForUser((byte) 12);
        radioUserFilter.addUser(radioUser4);

        final RadioUser radioUser2 = new RadioUser();
        radioUser2.setUeContextForUser((short) 3406);
        radioUser2.setRncModuleIdForUser((byte) 19);
        radioUserFilter.addUser(radioUser2);

        final RadioUser radioUser6 = new RadioUser();
        radioUser6.setUeContextForUser((short) 3685);
        radioUser6.setRncModuleIdForUser((byte) 28);
        radioUserFilter.addUser(radioUser6);

        final RadioUser radioUser8 = new RadioUser();
        radioUser8.setUeContextForUser((short) 5840);
        radioUser8.setRncModuleIdForUser((byte) 28);
        radioUserFilter.addUser(radioUser8);

        final RadioUser radioUser5 = new RadioUser();
        radioUser5.setUeContextForUser((short) 5078);
        radioUser5.setRncModuleIdForUser((byte) 7);
        radioUserFilter.addUser(radioUser5);

        final RadioUser radioUser7 = new RadioUser();
        radioUser7.setUeContextForUser((short) 7319);
        radioUser7.setRncModuleIdForUser((byte) 6);
        radioUserFilter.addUser(radioUser7);

        //for IMSI 454061106124056
        RadioUser radioUser9 = new RadioUser();
        radioUser9.setRncModuleIdForUser((byte) 0);
        radioUser9.setUeContextForUser((short) 4984);
        radioUserFilter.addUser(radioUser9);

    }

}
