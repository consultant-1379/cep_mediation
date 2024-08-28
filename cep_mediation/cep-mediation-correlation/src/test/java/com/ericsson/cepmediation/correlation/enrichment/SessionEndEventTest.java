/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.enrichment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Calendar;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.Test;

public class SessionEndEventTest {

    @Before
    public void setup() {
        
    }

    @Test
    public void testIsAlignedToFifteenMinutes() {        
        assertThat(createSessonEndEvent(5,0,1).isAlignedToFifteenMinutes() , is(false));
        assertThat(createSessonEndEvent(10,0,1).isAlignedToFifteenMinutes() , is(false));
        assertThat(createSessonEndEvent(15,0,1).isAlignedToFifteenMinutes() , is(true));
        assertThat(createSessonEndEvent(20,0,1).isAlignedToFifteenMinutes() , is(false));
        assertThat(createSessonEndEvent(25,0,1).isAlignedToFifteenMinutes() , is(false));
        assertThat(createSessonEndEvent(30,0,1).isAlignedToFifteenMinutes() , is(true));
        assertThat(createSessonEndEvent(35,0,1).isAlignedToFifteenMinutes() , is(false));
        assertThat(createSessonEndEvent(40,0,1).isAlignedToFifteenMinutes() , is(false));
        assertThat(createSessonEndEvent(45,0,1).isAlignedToFifteenMinutes() , is(true));
        assertThat(createSessonEndEvent(50,0,1).isAlignedToFifteenMinutes() , is(false));
        assertThat(createSessonEndEvent(55,0,1).isAlignedToFifteenMinutes() , is(false));
        assertThat(createSessonEndEvent(0,0,1).isAlignedToFifteenMinutes() , is(true));
        
    }
    
    private SessionEndEvent createSessonEndEvent(int minute, int second, int millisecond) {
    	Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    	calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, millisecond);
    	return new SessionEndEvent(calendar.getTimeInMillis());
    }
    
}
