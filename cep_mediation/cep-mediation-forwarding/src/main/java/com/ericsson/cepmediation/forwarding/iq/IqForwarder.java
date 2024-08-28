package com.ericsson.cepmediation.forwarding.iq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.forwarding.Forwarder;
import com.ericsson.cepmediation.forwarding.ForwarderUtilityHelper;
import com.ericsson.cepmediation.forwarding.filesystem.FileSystemMonitor;

/**
 * This class forwards events for storage into IQ database.
 * 
 * @author emicned
 */
public class IqForwarder implements Forwarder {
    private static final Logger logger = LoggerFactory.getLogger(IqForwarder.class);

    private IqTableBufferHandler tableBufferHandler;

    private static FileSystemMonitor fileSystemMonitor = FileSystemMonitor.getInstance();

    // A check of the File System will be performed after this number of events is received  
    private static final int NUM_EVENTS_PERFORM_FILESYSTEM_CHECK = 10000;
    
    // A message indicating events could not be stored in the database will be logged after this number of events have been dropped
    private static final int NUM_EVENTS_NOT_STORED_BEFORE_LOGGING = 1000;

    // Holds the number of events that have arrived since last file system check
    private int numEventsSinceLastFileSystemCheck = 0;

    // Holds the number of events that have been dropped 
    private int numDroppedEvents = 0;
    
    private int numDroppedEventsCannotBeStored = 0;

    // Holds the status of the last file system check
    private boolean fileSystemStatus = true;

    @Override
    public void forward(ApEventBean event) {

        // Before processing the events, need to determine if it is possible to write the generated data to the file system
        numEventsSinceLastFileSystemCheck++;

        if (numEventsSinceLastFileSystemCheck >= NUM_EVENTS_PERFORM_FILESYSTEM_CHECK) {
            // If current file system status is false then log that events were dropped before checking the status again
            if (fileSystemStatus == false) {
                logger.error("Dropped " + numDroppedEvents + " records as file system checker indicated that it was not possible to write to file system");
                numDroppedEvents = 0;
            }

            if (logger.isTraceEnabled()) {
                logger.trace("Checking if it is possible to write to the file system");
            }
            fileSystemStatus = fileSystemMonitor.canWriteToFileSystem();
            if (logger.isTraceEnabled()) {
                logger.trace("Result of checking if it is possible to write to file system is " + fileSystemStatus);
            }
            numEventsSinceLastFileSystemCheck = 0;
        }

        if (fileSystemStatus == false) {
            // dropping the event as cannot write to file system
            event = null;
            numDroppedEvents++;
            return;
        }

        // Can write to the file system so continue
        
        // Can the event be stored in the table in the database
        if (!canEventBeStored(event)) {
        	// This event cannot be stored in the table
        	event = null;
        	return;
        }
        
        try {
            tableBufferHandler.insert(event.getAbsoluteName(), event);
        } catch (final Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

    @Override
    public void close() {
        tableBufferHandler.close();
        fileSystemMonitor.close();
    }

    @Override
    public void init(final ServiceConfigBean configData) {
        // Set input data in Utility Helper
        ForwarderUtilityHelper.setInitialData(configData.getHostName(), configData.getHostIp(), configData.getProcessId());
        fileSystemMonitor.start();
        tableBufferHandler = new IqTableBufferHandler();
        tableBufferHandler.start();

    }
    
    private boolean canEventBeStored(ApEventBean event) {
    	if (ForwarderUtilityHelper.canEventBeStored(event)) {
    		return true;
    	} else {
    		// This event cannot be stored in the table
    		// It is assumed that the volume will be low so logging each one
    		logger.debug("Dropping event " + event.getAbsoluteName() + " as it cannot be stored. " +
    				"Check the values of the event. " + event.getDecodedString());
    		numDroppedEventsCannotBeStored++;
    		if (numDroppedEventsCannotBeStored > NUM_EVENTS_NOT_STORED_BEFORE_LOGGING) {
    			logger.error("Dropped " + NUM_EVENTS_NOT_STORED_BEFORE_LOGGING + " records as they cannot be stored" +
    					" in the database. Set tracing to debug to see details of the events dropped.");
    			numDroppedEventsCannotBeStored = 0;
    		}
    		return false;
    	} 
    }
    
}
