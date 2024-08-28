/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2015
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.cepmediation.loading.events;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;

import com.ericsson.cepmediation.base.util.NodeFileNameUtils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author exuexie
 * @since 07/2012
 */
public class EventRecordHandlerTimestampsTest {

    // event header record handler
    private EventHeaderRecordHandler mockedEventHeaderRecordHandler;

    // event record handler
    private EventRecordHandler eventRecordHandler;

    public void setUp(String fileName) {

        // create a mock object of EventHeaderRecordhandler
        mockedEventHeaderRecordHandler = mock(EventHeaderRecordHandler.class);

        // initialise the EventRecordHandler object and ignore the publisher
        // parameter which is not required for these
        // test cases
        eventRecordHandler = new EventRecordHandler(
                mockedEventHeaderRecordHandler, null, new HashSet<Integer>(
                        Arrays.asList(0, 8, 18010)));

        Calendar calendar = null;
        try {
            calendar = NodeFileNameUtils.nameToCalendar(fileName);
        } catch (ParseException e) {
            e.printStackTrace(); // To change body of catch statement use File |
                                 // Settings | File Templates.
        }

        when(mockedEventHeaderRecordHandler.getTimestamp())
                .thenReturn(calendar);

        // return a positive time zone offset, as calculated in the class, the
        // value itself is negative, i.e,
        // this value is supposed to be decreased from the timestamp
        when(mockedEventHeaderRecordHandler.getUtcOffsetOfDataInsideFile())
                .thenReturn(
                        (long) (-(NodeFileNameUtils
                                .getTimezoneOffsetInMinutesFromFileName(fileName) * 60 * 1000)));

        /**
         * The same as the setHeaderTimestamp() method from
         * EventHeaderRecordHandler
         *
         */
        Calendar utcStartOfDayCal = (Calendar) calendar.clone();

        // Set the hour, minute, second, and millisecond to zero
        utcStartOfDayCal.set(Calendar.HOUR_OF_DAY, 0);
        utcStartOfDayCal.set(Calendar.MINUTE, 0);
        utcStartOfDayCal.set(Calendar.SECOND, 0);
        utcStartOfDayCal.set(Calendar.MILLISECOND, 0);

        long utcStartOfDay = utcStartOfDayCal.getTimeInMillis();

        // return the utcStartOfDay
        when(mockedEventHeaderRecordHandler.getUTCStartOfDay()).thenReturn(
                utcStartOfDay);

    }

    @Test
    public void testGetTimeStampInMillsForPositiveTimeOffset() throws Exception {

        // in time zone offset +0800, midnight event file between 00h00m and
        // 00h05m
        String fileName = "A20120809.0000+0800-20120809.0005+0800_1_ebs.8";

        setUp(fileName);

        // later arriving event, event supposed to between 00h00m and 00h01m
        long timestamp = eventRecordHandler.getTimeStampInMills(23, 59, 59, 0);

        // 1344441599000 is 2012-08-08 15:59:59 UTC time
        assertEquals("Later coming event", 1344441599000L, timestamp);

        // test the right timestamp event
        timestamp = eventRecordHandler.getTimeStampInMills(0, 1, 59, 0);

        // 1344441719000 is 2012-08-08 16:1:59 UTC time
        assertEquals("right timestamp event", 1344441719000L, timestamp);

    }

    @Test
    public void testGetTimeStampInMillsBeforeMidnightWithPositiveTimeOffset()
            throws Exception {

        // in time zone offset +0800, midnight event file between 00h00m and
        // 00h05m
        String fileName = "A20120517.0759+0800-20120517.0800+0800_1_ebs.104";

        setUp(fileName);

        // later arriving event, event supposed to between 07h55m and 08h00m
        long timestamp = eventRecordHandler.getTimeStampInMills(7, 58, 59, 0);

        // 1337212739000L is 2012-05-16 23:58:59 UTC time
        assertEquals("Later coming event", 1337212739000L, timestamp);

        // test the right timestamp event
        timestamp = eventRecordHandler.getTimeStampInMills(8, 0, 0, 0);

        // 1337212800000L is 2012-05-17 00:00:00 UTC time
        assertEquals("right timestamp event", 1337212800000L, timestamp);

    }

    @Test
    public void testGetTimeStampInMillsAfterMidnightWithPositiveTimeOffset()
            throws Exception {

        // in time zone offset +0800, midnight event file between 00h00m and
        // 00h05m
        String fileName = "A20120517.0800+0800-20120517.0801+0800_1_ebs.104";

        setUp(fileName);

        // later arriving event, event supposed to between 07h55m and 08h00m
        long timestamp = eventRecordHandler.getTimeStampInMills(7, 59, 59, 0);

        // 1337212799000L is 2012-05-16 23:58:59 UTC time
        assertEquals("Later coming event", 1337212799000L, timestamp);

        // test the right timestamp event
        timestamp = eventRecordHandler.getTimeStampInMills(8, 0, 0, 0);

        // 1337212800000L is 2012-05-17 00:00:00 UTC time
        assertEquals("right timestamp event", 1337212800000L, timestamp);

    }

    @Test
    public void testGetTimeStampInMillsForZeroTimeOffset() throws Exception {

        String fileName = "A20120808.0000+0000-20120808.0005+0000_1_ebs.8";

        setUp(fileName);

        // later arriving event, event supposed to between 00h00m and 00h01m
        long timestamp = eventRecordHandler.getTimeStampInMills(23, 59, 59, 0);

        // 1344383999000 is 2012-08-07 23:59:59 UTC time
        assertEquals("Later coming event", 1344383999000L, timestamp);

        // test the right timestamp event
        timestamp = eventRecordHandler.getTimeStampInMills(0, 1, 59, 0);

        // 1344384119000 is 2012-08-08 00:01:59 UTC time
        assertEquals("right timestamp event", 1344384119000L, timestamp);

    }

    @Test
    public void testGetTimeStampInMillsForNegativeTimeOffset() throws Exception {

        String fileName = "A20120808.0500-0500-20120808.0505-0500_1_ebs.8";

        setUp(fileName);

        // later arriving event, event supposed to between 00h00m and 00h01m
        long timestamp = eventRecordHandler.getTimeStampInMills(4, 59, 59, 0);

        // 1344419999000L is 2012-08-08 09:59:59 UTC time, i.e, 2012-08-08
        // 04:59:59 of -0500 offset
        assertEquals("Later coming event", 1344419999000L, timestamp);

        // test the right timestamp event
        timestamp = eventRecordHandler.getTimeStampInMills(5, 1, 59, 0);

        // 1344420119000 is 2012-08-08 10:01:59 UTC time, i.e, 2012-08-08
        // 05:01:59 of -0500
        assertEquals("right timestamp event", 1344420119000L, timestamp);

    }

}
