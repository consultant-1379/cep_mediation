package com.ericsson.cepmediation.forwarding.iq;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;

/**
 * This class is used to loads events into iq binary files for Time based Partitions.
 * 
 * Load files for Time Based Partitions have the following characteristics
 *    - Events from different days cannot get added to the same file
 *    - File names must begin with date of the day in the format YYYYMMDD_ and end with .binary
 */
public class IqTableBufferTimeBased extends IqTableBuffer {

    private static DateFormat dateFormatter = new SimpleDateFormat("yyyyMMdd_HHmm_");

    // Store the day part of the timestamp of the first event added to the file
    private int dayOfEventsInFile = -1;
    
    String filePrefix = "";
    
    private Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    
    static {
    	dateFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
    }
   
    IqTableBufferTimeBased(final String absoluteName, final String techPackName, final String filePrefix) {
    	super(absoluteName, techPackName, filePrefix);
    }
    
    /**
     * Load files for Time Based partitions cannot have the events (records) spanning 2 different
     * days as this will cause problems for the loaders. This method will check
     * if it is ok to add the new event to the existing file.
     * 
     * It is assumed that the data is relatively time ordered.
     * Note: If the data is not relatively time ordered, the there may be a scenario where
     * a lot of small files are created.
     */
    protected synchronized boolean canEventBeAddedToFile(final ApEventBean event) {
    	// Check if there is an open file
    	if (binaryWriter == null) {
            // No file open, ensure variables are reset and return event can be added
    		resetVariables();
    		return true;
        }
    	
    	if (isEventForSameDayAsEventsInFile(event)) {
    		// Event can be added to the opened file
    		return true;
    	}
    	
    	// Event cannot be added to this file
    	// Need to flush the file and create a new one
    	return false;
    }
    
    protected void eventInsertedIntoFile(ApEventBean event) {
    	// If this is the first record in file, then update stored variables
    	if (dayOfEventsInFile == -1) {
			setVariables(event);
		}
    }
    
    protected void fileFlushed() {
    	// Reset the variables (flags) as the file has been flushed
    	resetVariables();
    }
    
    protected String getFilePrefix() {
    	return filePrefix + getCommonPrefix();
    }

    /*
     * Checks if new event is for the same day as the events already in the file 
     */
    private boolean isEventForSameDayAsEventsInFile(ApEventBean event) {
    	if (dayOfEventsInFile == -1) {
    		return true;
    	}
    	
    	calendar.setTimeInMillis(event.getTimestamp());
    	int dayOfEvent = calendar.get(Calendar.DAY_OF_YEAR);
    	if (dayOfEvent == dayOfEventsInFile) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    private void resetVariables() {
    	dayOfEventsInFile = -1;
    	filePrefix = "";
    }
    
    private void setVariables(ApEventBean event) {
    	calendar.setTimeInMillis(event.getTimestamp());
		dayOfEventsInFile = calendar.get(Calendar.DAY_OF_YEAR);
		filePrefix = dateFormatter.format(new Timestamp(event.getTimestamp()));
    }
}
