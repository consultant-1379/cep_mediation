/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.util;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.util.Calendar;
import java.util.TimeZone;

import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 *
 * Timestamp handling is extremely important for mediation device, and testing the NodeFileNameUtils class should make
 * sure we always get the right time information from file name.
 *
 * @author exuexie
 * @since 07/2012
 *
 */
public class NodeFileNameUtilsTest {

    //SGEH file with timestamp 
    private final String SGEH_WITH_TIMESTAMP = "A20120808.0800+0800-20120808.0805+0800_1_ebs.8";

    //SGEH file without timestamp
    private final String SGEH_WITHOUT_TIMESTAMP = "A20120808.0000-0005_1_ebs.8";

    @Test
    public void testNameToCalendarGPEHFile() throws ParseException {
        final Calendar calendar = NodeFileNameUtils.nameToCalendar("A20120516.1600-1615_SubNetwork=RNC09,MeContext=RNC09_rnc_gpehfile_Mp0.bin.gz");
        assertEquals("year", 2012, calendar.get(Calendar.YEAR));
        assertEquals("month", 4, calendar.get(Calendar.MONTH));
        assertEquals("day", 16, calendar.get(Calendar.DAY_OF_MONTH));
        assertEquals("hour", 16, calendar.get(Calendar.HOUR_OF_DAY));
        assertEquals("minute", 0, calendar.get(Calendar.MINUTE));
    }

    @Test
    @Ignore
    /**
     * @TODO complete the test case
     */
    public void testPathToNEName() {

    }

    @Test
    @Ignore
    /**
     * @TODO complete the test case
     */
    public void testPathToSubNetName() {

    }

    @Test
    public void testNameToCalendar() throws Exception {

        //get the calendar returned from the method, should return the start time in the file name
        final Calendar calendar = NodeFileNameUtils.nameToCalendar(SGEH_WITH_TIMESTAMP);

        assertEquals("As we convert the time to UTC, the time zone should be UTC", TimeZone.getTimeZone("UTC"), calendar.getTimeZone());

        assertEquals("year", 2012, calendar.get(Calendar.YEAR));
        assertEquals("month", 7, calendar.get(Calendar.MONTH)); //[0-11]
        assertEquals("day", 8, calendar.get(Calendar.DAY_OF_MONTH));
        assertEquals("hour", 0, calendar.get(Calendar.HOUR_OF_DAY));
        assertEquals("minute", 0, calendar.get(Calendar.MINUTE));

    }

    @Test
    public void testNameToCalendarForFileWithoutTZ() throws Exception {

        final Calendar calendar = NodeFileNameUtils.nameToCalendar(SGEH_WITHOUT_TIMESTAMP);

        assertEquals("As we convert the time to UTC, the time zone should be UTC", TimeZone.getTimeZone("UTC"), calendar.getTimeZone());

        assertEquals("year", 2012, calendar.get(Calendar.YEAR));
        assertEquals("month", 7, calendar.get(Calendar.MONTH)); //[0-11]
        assertEquals("day", 8, calendar.get(Calendar.DAY_OF_MONTH));
        assertEquals("hour", 0, calendar.get(Calendar.HOUR_OF_DAY));
        assertEquals("minute", 0, calendar.get(Calendar.MINUTE));

    }

    @Test
    public void testGetTimezoneDiffInMinutes() throws Exception {

        final long timeZoneDiff = NodeFileNameUtils.getTimezoneOffsetInMinutesFromFileName(SGEH_WITH_TIMESTAMP);

        assertEquals("The timezoneDiff of file " + SGEH_WITH_TIMESTAMP, 8 * 60, timeZoneDiff);

    }

    @Test
    public void testGetTimezoneDiffInMinutesForFileWithoutTZ() throws Exception {

        final long timeZoneDiff = NodeFileNameUtils.getTimezoneOffsetInMinutesFromFileName(SGEH_WITHOUT_TIMESTAMP);

        assertEquals("The timezoneDiff of file " + SGEH_WITHOUT_TIMESTAMP, -1, timeZoneDiff);

    }
    
    @Test
    public void testGetOssId() {
    	String path1 = "/eniq/data/importdata/events_oss_1/ossrc/data/pms/segment1/";
    	String ossId1 = NodeFileNameUtils.getOssId(path1);
    	assertThat(ossId1, is("events_oss_1"));
    	
    	String pathNoOssId = "/eniq/data/importdata/dummyPath/";
    	String ossId2 = NodeFileNameUtils.getOssId(pathNoOssId);
    	assertNull(ossId2);
    }

}
