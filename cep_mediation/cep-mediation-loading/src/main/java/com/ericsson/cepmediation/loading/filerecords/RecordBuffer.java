package com.ericsson.cepmediation.loading.filerecords;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import com.ericsson.cepmediation.base.meta.schema.SchemaException;

/**
 * This class reads an NE file into a buffer of records
 * 
 * @author eeilfn
 */
public class RecordBuffer {
    // Name of the file to be read
    private final File neFile;

    // The descriptor of this record and its handlers
    private final RecordDescriptor recordDescriptor;

    // Array to hold the cell trace records
    private final List<Record> recordList = new ArrayList<Record>();

    /**
     * Read a NE file into an array of records
     * 
     * @param neFile
     * @param recordDescriptor Describes the structure of records in the input file
     * @throws IOException
     */
    public RecordBuffer(final File neFile, final RecordDescriptor recordDescriptor) throws IOException {
        // Save the record buffer member data
        this.neFile = neFile;
        this.recordDescriptor = recordDescriptor;

        InputStream neFileInputStream = new NEFileReader().getInputStreamForNeFile(neFile);

        // Read the file
        for (int recordNo = 0;; recordNo++) {
            try {
                // Read the next record
                final Record newRecord = RecordFactory.getNextRecord(neFileInputStream, recordDescriptor);

                // Add the record to the record array
                recordList.add(newRecord);

                // File reading has been completed
                if (newRecord.getType() == recordDescriptor.getFooterRecordType()) {
                    neFileInputStream.close();
                    return;
                }
            }
            // Catch IO exceptions, add the file name and the record number and rethrow
            catch (final IOException e) {
                neFileInputStream.close();
                throw new IOException("processing of \"" + neFile + "\" failed at line (" + recordNo + "): ", e);
            }
        }
    }

    /**
     * This method processes each record on the record list using its record handler
     * @return the number of events processed
     * @throws IOException 
     * @throws SchemaException 
     */
    public void process() throws IOException, SchemaException {
        // Iterate over the record list
        for (final Record record : recordList) {
            // Check the record type exists
            final RecordHandler recordHandler = recordDescriptor.getHandlerMap().get(record.getType());

            if (recordHandler != null) {
                // Look up the record type of the record and call the appropriate handler to process it
                recordHandler.process(record.getData());
            } else {
                throw new IOException("Record handler not found for record type: " + record.getType());
            }
        }
    }

    /**
     * This method prints each record on the record list to the print stream using its record handler
     * @param printStream the stream to print to 
     */
    public void print(final PrintStream printStream) {
        // Iterate over the record list
        for (final Record record : recordList) {
            // Look up the record type of the record and get its string representation
            final String recordAsString = recordDescriptor.getHandlerMap().get(record.getType()).toString(record.getData());

            // Print the record
            printStream.println(recordAsString);
        }
    }

    /**
     * Return the list of records
     * 
     * @return The list of records
     */
    public List<Record> getRecordList() {
        return recordList;
    }

    /**
     * Get the file for this record buffer
     * 
     * @return The file
     */
    public File getNeFile() {
        return neFile;
    }
}
