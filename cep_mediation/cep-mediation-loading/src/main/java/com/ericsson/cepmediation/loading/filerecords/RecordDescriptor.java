package com.ericsson.cepmediation.loading.filerecords;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class describes the structure of records being reported by a network element
 * 
 * @author eeilfn
 */
public class RecordDescriptor {
    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(RecordDescriptor.class);

    // Set the header record type as zero, it is 0 in all file types encountered so far
    private static final short HEADER_RECORD_TYPE = 0;

    // Records can have a 3-byte header (2-byte length and 1-byte type) or
    // a 4-byte header (2-byte length and 2-byte type
    private final boolean shortHeader;

    // Here, we have a map that holds the ID of each record type that can occur in the
    // file, and an implementation of RecordHandler for that record type
    private final Map<Short, RecordHandler> handlerMap;

    // We hold the record type for the footer record because this is read for each record
    // rather than reading it from the map each time, it is highest record type in the record
    // descriptor
    private short footerRecordType = -1;

    /**
     * Constructor to build this record handler, the fields describe the structure of the records that are expected
     * 
     * @param shortHeader true if the record has a short header
     */
    public RecordDescriptor(final boolean shortHeader) {
        logger.debug("shortHeader=" + shortHeader);

        // Save the member data
        this.shortHeader = shortHeader;

        // Instantiate the record handler map
        handlerMap = new HashMap<Short, RecordHandler>();
    }

    /**
     * Add a record handler to the record descriptor
     * @param recordHandler the record handler for handling record types of this record
     */
    public void addRecordHandler(final RecordHandler recordHandler) {
        logger.debug("added record handler type:" + recordHandler.getRecordType());

        // Add an entry to the record handler map
        handlerMap.put(recordHandler.getRecordType(), recordHandler);

        // Check if the class name of this record handler contains the string "Footer"
        if (recordHandler.getClass().getName().contains("Footer")) {
            // Store the footer record type
            footerRecordType = recordHandler.getRecordType();
        }

        // Check if this is the highest record type so far, if so, store it as the footer record type
        // The footer record type is the highest record type in the file
        if (recordHandler.getRecordType() > footerRecordType) {
            footerRecordType = recordHandler.getRecordType();
        }
    }

    /**
     * Check if this record has a short header
     * @return true if the record has a short header
     */
    public boolean isShortHeader() {
        return shortHeader;
    }

    /**
     * The Header record type is fixed for all file types encountered so far
     * @return the header record type
     */
    public RecordHandler getHeaderHandler() {
        // Return the header record type
        return handlerMap.get(HEADER_RECORD_TYPE);
    }

    /**
     * The footer record type is the record type with the highest record type on the record handler list
     * @return the footer record type
     */
    public short getFooterRecordType() {
        // Return the footer record type
        return footerRecordType;
    }

    /**
     * Return the handlers for this record descriptor 
     * @return the handlers for records described by this record descriptor
     */
    public Map<Short, RecordHandler> getHandlerMap() {
        return handlerMap;
    }
}
