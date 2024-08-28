package com.ericsson.cepmediation.loading.filerecords;

import java.io.IOException;

import com.ericsson.cepmediation.base.meta.schema.SchemaException;

/**
 * This interface enforces implementation of a hander for a record from a NE
 * 
 * @author eeilfn
 */
public interface RecordHandler {
    /**
     * Returns the record type that this record handler implements. The record type returned
     * must be unique in the set of handlers for a particular type of file
     * 
     * @return The record type handled as a short
     */
    short getRecordType();

    /**
     * Method to process the record in question
     * 
     * @param the data of the record
     * @return true if the record was successfully processed
     * @throws IOException 
     * @throws SchemaException 
     */
    boolean process(byte[] data) throws IOException, SchemaException;

    /**
     * Returns the number of events processed by this record handler
     * @return the number of events processed
     */
    long getEventsProcessed();

    /**
     * Clears the number of events processed by this record handler
     */
    void clearEventsProcessed();

    /**
     * Method to return a string representation of the record
     * 
     * @param the data of the record
     */
    String toString(byte[] data);
}
