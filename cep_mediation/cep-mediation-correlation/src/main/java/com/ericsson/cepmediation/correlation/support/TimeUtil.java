package com.ericsson.cepmediation.correlation.support;

import java.util.Calendar;

/**
 * This class can perform time/date manipulations 
 * @author eachsaj
 *
 */
public class TimeUtil {


	
    /**This method return a time stamp after modifying the time stamp passed with hour,minutes,second and milliseconds values
     * @param timestamp_hour byte type hour
     * @param timestamp_minute byte type minutes
     * @param timestamp_second byte type seconds
     * @param timestamp_millisec short type milliseconds
     * @param timestamp long type time stamps
     * @return a modified time stamp in long format
     */
    public static synchronized long getStartStopTime(final Byte timestamp_hour,final Byte timestamp_minute,final Byte timestamp_second,final Short timestamp_millisec, final Long timestamp){
    	final Calendar cal= Calendar.getInstance();
    	// set  time 
    	cal.setTimeInMillis(timestamp);
    	cal.set(Calendar.HOUR, timestamp_hour);
    	cal.set(Calendar.MINUTE, timestamp_minute);
    	cal.set(Calendar.SECOND, timestamp_second);
    	cal.set(Calendar.MILLISECOND, timestamp_millisec);
    	return cal.getTimeInMillis();
    }
    /**
 		This method returns a duration as int value
     * @return
     */
    public static synchronized int getDuration(final Byte timestamp_hour,final Byte timestamp_minute,final Byte timestamp_second,final Short timestamp_millisec,
    		final Byte end_hour,final Byte end_minute,final Byte end_second,final Short end_millisec,final Long timestamp){
    	final Calendar startTime=  Calendar.getInstance();;
    	startTime.setTimeInMillis(timestamp);
    	startTime.set(Calendar.HOUR, timestamp_hour);
    	startTime.set(Calendar.MINUTE, timestamp_minute);
    	startTime.set(Calendar.SECOND, timestamp_second);
    	startTime.set(Calendar.MILLISECOND, timestamp_millisec);
    	
    	final Calendar finishTime=  Calendar.getInstance();;
    	finishTime.setTimeInMillis(timestamp);
    	finishTime.set(Calendar.HOUR, end_hour);
    	finishTime.set(Calendar.MINUTE, end_minute);
    	finishTime.set(Calendar.SECOND, end_second);
    	finishTime.set(Calendar.MILLISECOND, end_millisec);
    	
    	return (int) (finishTime.getTime().getTime()-startTime.getTime().getTime());
    }
}
