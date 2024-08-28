package com.ericsson.cepmediation.correlation.enrichment;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class SessionEndEvent implements Serializable {

    public static final String ABSOLUTE_NAME = "correlation.SESSION_END_EVENT";
    
    private static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";

    // This date formatter is required to format dates into UTC
    private static final DateFormat dateFormat = new SimpleDateFormat(DATE_TIME_FORMAT);
    
    protected static final String TIME_ZONE = "UTC";
    
    // Set the time zone for the formatter as UTC
    static {
            dateFormat.setTimeZone(TimeZone.getTimeZone(TIME_ZONE));
    }

    private long timestamp;

    public SessionEndEvent() {

    }

    public SessionEndEvent(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
    
    public boolean isAlignedToFifteenMinutes() {
    	// Round the value to minutes
    	long roundedTimestamp = getTimestampRoundedToMinutes();
    	return roundedTimestamp % 900000 == 0;
    }
    
    public long getTimestampRoundedToMinutes() {
    	return timestamp - (timestamp % 60000);
    }

    @Override
    public String toString() {
        return "SessionEndEvent: time "+ dateFormat.format(new Date(timestamp));
    }
}
