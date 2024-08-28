package com.ericsson.cepmediation.loading.filerecords;


/**
 * This class holds a single record from a NE file
 * 
 * @author eeilfn
 */
public class Record {

    // Member data for the record
    private final short length;

    private final short type;

    private final byte[] data;

    /**
     * Constructor for the record that has been read from the NE file
     * 
     * @param length The length of the record data
     * @param type   The type of the record
     * @param data   The record data
     */
    Record(final Short length, final short type, final byte[] data) {
        this.length = length;
        this.type = type;
        this.data = data;
    }

    /**
     * Return the length of the data in the record
     * 
     * @return the data length in bytes
     */
    public short getLength() {
        return length;
    }

    /**
     * Gets the type of the record
     * 
     * @return the type
     */
    public short getType() {
        return type;
    }

    /**
     * Get the record data
     * 
     * @return the record data as a byte array
     */
    public byte[] getData() {
        return data;
    }
}
