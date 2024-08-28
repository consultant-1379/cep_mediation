/**
 * -----------------------------------------------------------------------
l *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.radio.measreport;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.test.common.RadioUser;

/**
 * @author eemecoy
 *
 */
public class MeasReportParamsWithRealFilesSelectedUsersTest extends BaseMeasReportParamsWithRealFilesTest {

    @Before
    public void setup() {
        setUpUserFilter();
    }

    @Test
    public void testRunningEventsForSelectedUsersThroughEsper() throws Exception {
        sendEventsToEsperAndVerifySomeSessions();
    }

    private void setUpUserFilter() {
        setUpUser454063302963615L();
        final RadioUser user1 = new RadioUser();
        user1.setRncModuleIdForUser((byte) 6);
        user1.setUeContextForUser((short) 715);
        userFilter.addUser(user1);

        //for IMSI 454061106090952
        RadioUser radioUser2 = new RadioUser();
        radioUser2.setUeContextForUser((short) 7233);
        radioUser2.setRncModuleIdForUser((byte) 19);
        userFilter.addUser(radioUser2);

        setUpUser454063302840112();

        setUpUser454061105025948();
    }

    private void setUpUser454063302963615L() {
        RadioUser user1 = new RadioUser();
        user1.setRncModuleIdForUser((byte) 1);
        user1.setUeContextForUser((short) 3030);
        userFilter.addUser(user1);

        RadioUser user2 = new RadioUser();
        user2.setRncModuleIdForUser((byte) 1);
        user2.setUeContextForUser((short) 7615);
        userFilter.addUser(user2);

        RadioUser user3 = new RadioUser();
        user3.setRncModuleIdForUser((byte) 1);
        user3.setUeContextForUser((short) 1462);
        userFilter.addUser(user3);

        RadioUser user4 = new RadioUser();
        user4.setRncModuleIdForUser((byte) 19);
        user4.setUeContextForUser((short) 541);
        userFilter.addUser(user4);

        RadioUser user5 = new RadioUser();
        user5.setRncModuleIdForUser((byte) 27);
        user5.setUeContextForUser((short) 6244);
        userFilter.addUser(user5);

        RadioUser user6 = new RadioUser();
        user6.setRncModuleIdForUser((byte) 1);
        user6.setUeContextForUser((short) 1271);
        userFilter.addUser(user6);

        RadioUser user7 = new RadioUser();
        user7.setRncModuleIdForUser((byte) 21);
        user7.setUeContextForUser((short) 940);
        userFilter.addUser(user7);

        RadioUser user8 = new RadioUser();
        user8.setRncModuleIdForUser((byte) 1);
        user8.setUeContextForUser((short) 5378);
        userFilter.addUser(user8);

        RadioUser user9 = new RadioUser();
        user9.setRncModuleIdForUser((byte) 5);
        user9.setUeContextForUser((short) 7513);
        userFilter.addUser(user9);

        RadioUser user10 = new RadioUser();
        user10.setRncModuleIdForUser((byte) 5);
        user10.setUeContextForUser((short) 7398);
        userFilter.addUser(user10);

        RadioUser user11 = new RadioUser();
        user11.setRncModuleIdForUser((byte) 31);
        user11.setUeContextForUser((short) 7814);
        userFilter.addUser(user11);

        RadioUser user12 = new RadioUser();
        user12.setRncModuleIdForUser((byte) 1);
        user12.setUeContextForUser((short) 7056);
        userFilter.addUser(user12);

        RadioUser user13 = new RadioUser();
        user13.setRncModuleIdForUser((byte) 29);
        user13.setUeContextForUser((short) 5413);
        userFilter.addUser(user13);

        RadioUser user14 = new RadioUser();
        user14.setRncModuleIdForUser((byte) 1);
        user14.setUeContextForUser((short) 7780);
        userFilter.addUser(user14);

        RadioUser user15 = new RadioUser();
        user15.setRncModuleIdForUser((byte) 6);
        user15.setUeContextForUser((short) 1991);
        userFilter.addUser(user15);

        RadioUser user16 = new RadioUser();
        user16.setRncModuleIdForUser((byte) 6);
        user16.setUeContextForUser((short) 715);
        userFilter.addUser(user16);

        RadioUser user17 = new RadioUser();
        user17.setRncModuleIdForUser((byte) 1);
        user17.setUeContextForUser((short) 929);
        userFilter.addUser(user17);

        RadioUser user18 = new RadioUser();
        user18.setRncModuleIdForUser((byte) 25);
        user18.setUeContextForUser((short) 4907);
        userFilter.addUser(user18);

        RadioUser user19 = new RadioUser();
        user19.setRncModuleIdForUser((byte) 5);
        user19.setUeContextForUser((short) 6323);
        userFilter.addUser(user19);

        RadioUser user20 = new RadioUser();
        user20.setRncModuleIdForUser((byte) 7);
        user20.setUeContextForUser((short) 376);
        userFilter.addUser(user20);

        RadioUser user21 = new RadioUser();
        user21.setRncModuleIdForUser((byte) 1);
        user21.setUeContextForUser((short) 5057);
        userFilter.addUser(user21);

        RadioUser user22 = new RadioUser();
        user22.setRncModuleIdForUser((byte) 1);
        user22.setUeContextForUser((short) 7762);
        userFilter.addUser(user22);

        RadioUser user23 = new RadioUser();
        user23.setRncModuleIdForUser((byte) 14);
        user23.setUeContextForUser((short) 80);
        userFilter.addUser(user23);

        RadioUser user24 = new RadioUser();
        user24.setRncModuleIdForUser((byte) 22);
        user24.setUeContextForUser((short) 608);
        userFilter.addUser(user24);

        RadioUser user25 = new RadioUser();
        user25.setRncModuleIdForUser((byte) 1);
        user25.setUeContextForUser((short) 635);
        userFilter.addUser(user25);

        RadioUser user26 = new RadioUser();
        user26.setRncModuleIdForUser((byte) 1);
        user26.setUeContextForUser((short) 5345);
        userFilter.addUser(user26);

        RadioUser user27 = new RadioUser();
        user27.setRncModuleIdForUser((byte) 1);
        user27.setUeContextForUser((short) 1249);
        userFilter.addUser(user27);

        RadioUser user28 = new RadioUser();
        user28.setRncModuleIdForUser((byte) 1);
        user28.setUeContextForUser((short) 799);
        userFilter.addUser(user28);

    }

    private void setUpUser454061105025948() {

        RadioUser user1 = new RadioUser();
        user1.setRncModuleIdForUser((byte) 19);
        user1.setUeContextForUser((short) 3263);
        userFilter.addUser(user1);

        RadioUser user2 = new RadioUser();
        user2.setRncModuleIdForUser((byte) 26);
        user2.setUeContextForUser((short) 1194);
        userFilter.addUser(user2);

    }

    private void setUpUser454063302840112() {
        RadioUser user1 = new RadioUser();
        user1.setRncModuleIdForUser((byte) 22);
        user1.setUeContextForUser((short) 2599);
        userFilter.addUser(user1);

        RadioUser user2 = new RadioUser();
        user2.setRncModuleIdForUser((byte) 31);
        user2.setUeContextForUser((short) 438);
        userFilter.addUser(user2);

        RadioUser user3 = new RadioUser();
        user3.setRncModuleIdForUser((byte) 24);
        user3.setUeContextForUser((short) 3940);
        userFilter.addUser(user3);

    }

}
