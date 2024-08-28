package com.ericsson.cepmediation.forwarding.iq;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.forwarding.ForwarderUtilityHelper;
import com.ericsson.cepmediation.forwarding.MeasurementTypeDetails;
import com.ericsson.cepmediation.forwarding.PartitionTypeEnum;

/**
 * This class handles buffering of data into binary files and coordinates loading of those files
 * into the database. It starts a thread that periodically scans the table buffer map and flushes any
 * table buffers that have not been written in the scan interval to binary files
 */
public class IqTableBufferHandler implements Runnable {

    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(IqTableBufferHandler.class);

    // Property strings for binary file handling
    private static final int FLUSH_RECORDS = CepMediationProperties.getIntProperty(CepMediationProperty.IQ_BINARY_FLUSH_RECORDS);

    private static final int FLUSH_INTERVAL = CepMediationProperties.getIntProperty(CepMediationProperty.IQ_BINARY_FLUSH_INTERVAL);

    // Hold a reference to a binary file loader and the binary file loader thread for this table buffer handler
    private final IqFileLoader iqFileLoader;

    private final Map<String, IqTableBuffer> tableBufferMap;

    // Hold a reference to the thread that is supervising the table maps
    private Thread supervisionThread = null;

    /**
     * Constructor, creates a unique directory to hold binary files
     * @param procId 
     */
    public IqTableBufferHandler() {
        // Initialize the binary file loader
        iqFileLoader = new IqFileLoader();

        // Initialize the table buffer map
        tableBufferMap = new HashMap<String, IqTableBuffer>();
        Set<String> eventNames = ForwarderUtilityHelper.getAllEventAbsoluteNames();
        
        for (final String eventAbsoluteName : eventNames) {
            tableBufferMap.put(eventAbsoluteName, createIqTableBuffer(eventAbsoluteName)); //NOPMD necessary evil
        }
    }

    /**
     * This method starts the publisher thread, a thread that handles flushing of published events
     * @param publisher The publisher
     * @return The thread that was started
     */
    public Thread start() {
        // Check if the buffer map supervision thread is running
        if (supervisionThread != null && supervisionThread.isAlive()) {
            logger.warn("table buffer flushing thread is already running");
            return null;
        }

        // Thread is not running, start it
        supervisionThread = new Thread(this);
        supervisionThread.setName(IqTableBufferHandler.class.getSimpleName());
        supervisionThread.start();

        // Return the thread reference
        return supervisionThread;
    }

    /**
     * Method to close the table buffer handler, it flushes all table buffers
     * and deletes the directory for this Database Operator
     */
    public synchronized void close() {
        // Flush and queue all the table buffers
        for (final IqTableBuffer tableBuffer : tableBufferMap.values()) {
            flushAndQueue(tableBuffer);
        }

        // Interrupt the supervision thread
        if (supervisionThread != null && supervisionThread.isAlive()) {
            supervisionThread.interrupt();
        } else {
            logger.debug("table buffer flushing thread has already stopped");
        }
    }

    /**
     * Insert an event into a table buffer
     * 
     * @param table the table name
     * @param tableRows the table rows
     */
    public synchronized void insert(final String tableBufferName, final ApEventBean event) {
        if (logger.isTraceEnabled()) {
            logger.trace("Storing row to '" + tableBufferName);
        }

        try {
            // Get the table buffer in which to store this event
            final IqTableBuffer tableBuffer = tableBufferMap.get(tableBufferName);

            // Check if the table buffer was found
            if (tableBuffer != null) {
            	
            	// Check if event can be added to the open file
            	if (!tableBuffer.canEventBeAddedToFile(event)) {
            		flushAndQueue(tableBuffer);
            	}
            	
                // Store the event the table buffer
                tableBuffer.insertRow(event);

                // Find out how many rows are in the table buffer, table buffer files should not be
                // allowed to grow to be too big for efficient loading
                if (tableBuffer.getRowCount() >= FLUSH_RECORDS) {
                    flushAndQueue(tableBuffer);
                }
            }
        } catch (final Exception e) {
            logger.error("Exception while inserting row to " + tableBufferName);
            logger.error(event.getClass().getCanonicalName());
            logger.error(e.getMessage());
        }

    }

    /**
     * This method runs the table buffer supervision thread that scans the table buffer files to see
     * if they have been updated in the last interval. If not, they are flushed to the database.
     */
    @Override
    public void run() {
        logger.debug("Table buffer supervision thread started");

        // This thread runs until it is interrupted by the class instance closing
        while (supervisionThread != null && supervisionThread.isAlive() && !supervisionThread.isInterrupted()) {
            logger.debug("Table buffer flushing thread running, interval: " + FLUSH_INTERVAL);

            // Flush and queue any table buffer that has timed out
            flushAndQueueOnTimer();

            // Sleep for the flush interval
            try {
                Thread.sleep(FLUSH_INTERVAL);
            } catch (final InterruptedException e) {
                // Thread has been interrupted
                break;
            }
        }

        logger.debug("Table buffer supervision thread finished");
    }

    /**
     * Check the table buffer map and flush and queue all table buffers that have not been updated in the supervision interval
     */
    public synchronized void flushAndQueueOnTimer() {
        // Iterate over the table buffers
        for (final IqTableBuffer tableBuffer : tableBufferMap.values()) {
            // Check if the table buffer has timed out
            if (tableBuffer.getLastUpdatedTime() < System.currentTimeMillis() - FLUSH_INTERVAL) {
                flushAndQueue(tableBuffer);
            }
        }
    }

    /**
     * Method to flush a table buffer and queue it for storage in the database
     * @param tableBuffer The table buffer to flush and queue
     */
    private void flushAndQueue(final IqTableBuffer tableBuffer) {
        // If the table was found, flush it and retrieve the flushed file
        try {
            final File flushedFile = tableBuffer.flush();
            // Check if there is a flushed file to write to the database
            if (flushedFile != null) {
                // Send the flushed file to the binary file loader for loading into the database
                iqFileLoader.addToQueue(flushedFile);
            }
        } catch (final Exception e) {
            logger.error("Exception while flushing file: " + e.getMessage());
        }
    }
    
    private IqTableBuffer createIqTableBuffer(String eventAbsoluteName) {
    	MeasurementTypeDetails measTypeDetails = ForwarderUtilityHelper.getMeasTypeDetails(eventAbsoluteName);
    	PartitionTypeEnum partitionType = measTypeDetails.getPartitionType();
    	String measTypeName = measTypeDetails.getMeasurementTypeName();
    	String filePrefix = ForwarderUtilityHelper.constructFilePrefix();
    	if (partitionType == PartitionTypeEnum.VOLUME_BASED) {
    		return new IqTableBufferVolumeBased(eventAbsoluteName, measTypeName, filePrefix);
    	} else {
    		return new IqTableBufferTimeBased(eventAbsoluteName, measTypeName, filePrefix);
    	}
    }

}
