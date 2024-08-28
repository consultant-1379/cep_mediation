/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.filerecords;

import java.io.IOException;
import java.io.InputStream;

import com.ericsson.cepmediation.base.util.DataConverters;

/**
 * @author eemecoy
 *
 */
public class RecordFactory {

    // Constants for header fields
    private static final int LENGTH_FIELD_LENGTH = 2;

    private static final int SHORT_TYPE_LENGTH = 1;

    private static final int LONG_TYPE_LENGTH = 2;

    /**
     * Read data into a record
     * 
     * @param neFileInputStream input stream open on the NE file
     * @param recordDescriptor
     *  
     * @throws IOException 
     */
    public static Record getNextRecord(final InputStream neFileInputStream, final RecordDescriptor recordDescriptor)
            throws IOException {
        // Set the record type field length and the header length
        final int typeFieldLength = (recordDescriptor.isShortHeader() ? SHORT_TYPE_LENGTH : LONG_TYPE_LENGTH);
        final int headerLength = LENGTH_FIELD_LENGTH + typeFieldLength;

        // Save the member data
        final byte[] recordHeader = new byte[headerLength];

        // Read the record header, getting EOF is an error because we should get a FOOTER record first
        for (int headerPos = 0; headerPos < headerLength;) {
            final int bytesRead = neFileInputStream.read(recordHeader, headerPos, headerLength - headerPos);

            // We should not get zero or less bytes (EOF)
            if (bytesRead <= 0) {
                throw new IOException("error reading record header, file is corrupt");
            }
            headerPos += bytesRead;
        }

        // Set the length of the record
        final int length = (int) DataConverters.getByteArrayInteger(recordHeader, 0, 2, DataConverters.UNSIGNED_FLAG);

        // Set the type of the record
        short type;
        if (recordDescriptor.isShortHeader()) {
            type = recordHeader[2];
        } else {
            type = (short) DataConverters.getByteArrayInteger(recordHeader, 2, 2, DataConverters.UNSIGNED_FLAG);
        }

        // This indicates a corrupt file because the record length should never be negative
        if (length - headerLength <= 0) {
            throw new IOException("negative header length detected, file is corrupt");
        }

        // Read the record data
        final byte[] data = new byte[length - headerLength];
        for (int dataPos = 0; dataPos < length - headerLength;) {
            final int bytesRead = neFileInputStream.read(data, dataPos, length - headerLength - dataPos);

            // We should not get zero or less bytes (EOF)
            if (bytesRead <= 0) {
                throw new IOException("error reading record body, file is corrupt");
            }
            dataPos += bytesRead;
        }

        // Construct the record
        return new Record((short) (length - headerLength), type, data);
    }

}
