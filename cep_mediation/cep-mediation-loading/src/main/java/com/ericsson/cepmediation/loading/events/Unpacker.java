package com.ericsson.cepmediation.loading.events;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.meta.schema.Event;
import com.ericsson.cepmediation.base.meta.schema.EventParameter;
import com.ericsson.cepmediation.base.util.DataConverters;

/**
 * This class unpacks packed records
 * 
 * @author eeilfn
 */
public class Unpacker {
    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(Unpacker.class);

    // Constant used to indicate that parsed bytes are not set or are invalid
    private static final byte INVALID_BYTE = (byte) 0xff;

    // Constant used to indicate that an index is not set
    private static final byte NOT_SET = -1;

    // Reference to the event we are unpacking
    Event event = null;

    // Define a new byte array for the unpacked event
    byte[] unpackedData = null;

    // Define a reference for packed data
    byte[] data = null;

    // Set the initial packed and unpacked offsets
    int packedOffset = 0;

    int unpackedOffset = 0;

    // Member data for structure decoding
    int structureArraySize = NOT_SET;

    int structureArrayIndex = NOT_SET;

    int structureArrayFirstPar = NOT_SET;

    boolean structureParameterValid = false;
    
    private Set<Integer> parsingExceptions;

    /**
     * Constructor, stores the references to the event to be unpacked and initializes the unpacker
     * 
     * @param event The event to be unpacked
     */
    protected Unpacker(final Event event, Set<Integer> parsingExceptions) {
        this.parsingExceptions = parsingExceptions;
        // Save the event we are unpacking
        this.event = event;

        if (logger.isTraceEnabled()) {
            logger.trace("Event:" + event.getId() + ':' + event.getName());
        }

        // Initialize an array for the unpacked data
        initializeUnpackedData();
    }

    private void initializeUnpackedData() {
        unpackedData = new byte[event.getLength()];
    }

    /**
     * This method expands each field in a packed event byte array into an unpacked byte array
     * @param event The event that is represented by the data
     * @param data The data
     */
    protected byte[] unpack(final byte[] data) {
        // Set the reference to the packed data
        this.data = data;

        if (logger.isTraceEnabled()) {
            logger.trace("Event data:" + data.length + ':' + DataConverters.getByteArrayHexString(data, 0, data.length));
        }

        // Iterate over each parameter and decode them
        for (int parameterNumber = 0; parameterNumber < event.getParameterList().size();) {
            // Get the parameter
            final EventParameter parameter = event.getParameterList().get(parameterNumber);

            // Control structures of which the parameter may be a part
            parameterNumber = structureControl(parameter, parameterNumber);

            // Decode the parameter
            if (parameterNumber == -1) {
                break;
            }
            
            int currentOffset = unpackedOffset;
            if (!decodeParameter(parameter)) {
                // set all remaining parameters to invalid
                for (int i = currentOffset; i < unpackedData.length; i++) {
                    unpackedData[i] = INVALID_BYTE;
                }
                break;
            }

            if (logger.isTraceEnabled()) {
                logger.trace("ReadPar:"
                        + DataConverters.getByteArrayHexString(unpackedData,
                                unpackedOffset - parameter.getNumberOfBytes(), parameter.getNumberOfBytes()) + ':'
                        + parameter);
            }
        }

        return unpackedData;
    }

    /**
     * This method controls the decoding of structure arrays, managing the indexes and parameter number control
     * @param parameter The parameter to carry out structure control on
     * @param parNo The parameter number
     * @return The next parameter number to decode after the current parameter number has completed
     */
    private int structureControl(final EventParameter parameter, final int parNo) {
        // Check if the parameter is in a structure
        if (!parameter.isStructArray()) {
            // We are not in a structure
            structureArraySize = NOT_SET;
            return parNo + 1;
        }

        // Check if the structure array size has been read, the structure array size is a byte field that precedes a series of
        // arrays that are in a structure structure. Therefore, all arrays in the structure structure have equal length
        if (structureArraySize == NOT_SET) {
            // Now, handle the structure of which this parameter is a part
            try {
                // Read the number of elements actually specified on the array
                structureArraySize = getParamByte(data, packedOffset, 8, 0);
                packedOffset += 8;
            } catch (final Exception e) {
                // Output a warning
                logger.warn(event.getName() + ',' + e.getMessage() + ':' + parameter.toString());
                return -1;
            }

            // Trace the structure size
            if (logger.isTraceEnabled()) {
                logger.trace("structure size:" + structureArraySize);
            }

            // This is the first parameter of the structure
            structureArrayFirstPar = parNo;
            structureArrayIndex = 0;
        }

        // Check if the current parameter is a valid structure array parameter
        if (structureArrayIndex < structureArraySize) {
            structureParameterValid = true;
        } else {
            structureParameterValid = false;
        }

        // Check if we are at the last parameter in the structure
        if (parameter.isStructLastParameter()) {
            // Process the next index of the structure
            structureArrayIndex++;

            // Have we finished processing the structure?
            if (structureArrayIndex < parameter.getMaxStructArraySize()) {
                // Go back to the first parameter in the structure
                return structureArrayFirstPar;
            }
            // The structure is finished, move on to the next parameter
            structureArraySize = NOT_SET;
            return parNo + 1;

        }

        // In all other cases, return the next parameter as the number
        return parNo + 1;
    }

    /**
     * Method to decode a single parameter
     * @param parameter The parameter to decode
     * @return boolean true if the parameter was decoded correctly
     */
    private boolean decodeParameter(final EventParameter parameter) {
        try {
            // Check if this parameter skipped because it is a structure index that is not specified 
            if (isSkippedStructureArray(parameter)) {
                if (logger.isTraceEnabled()) {
                    logger.trace("SkipSeq:"
                            + DataConverters.getByteArrayHexString(unpackedData,
                                    unpackedOffset - parameter.getNumberOfBytes(), parameter.getNumberOfBytes()) + ':'
                            + parameter);
                }
                return true;
            }

            // Check if this parameter should be skipped because it is optional and is not specified
            if (isSkippedOptional(parameter)) {
                if (logger.isTraceEnabled()) {
                    logger.trace("SkipOpt:"
                            + DataConverters.getByteArrayHexString(unpackedData,
                                    unpackedOffset - parameter.getNumberOfBytes(), parameter.getNumberOfBytes()) + ':'
                            + parameter);
                }
                return true;
            }

            unpackValidityBitIfPresent(parameter);

            // Finally, read the parameter
            readParameterValues(parameter);

            // Parameter has been decoded
            return true;
        } catch (final Exception e) {
            if (!parsingExceptions.contains(event.getId())) {
                logger.error("Error while decoding event. Event: " + event.getName() +". Parameter: " + parameter.getName(), e);
                parsingExceptions.add(event.getId());
            }
            return false;
        }
    }

    private void unpackValidityBitIfPresent(EventParameter parameter) throws UnpackException {
        if (parameter.isUseValid()) {
            unpackedData[unpackedOffset] = getParamByte(data, packedOffset++, 1, 0);
            unpackedOffset++;
        }

    }

    /**
     * Check if this parameter is a structure parameter that should be skipped because this index of the structure is
     * not specified
     * @param parameter The parameter to check
     * @return true if the parameter should be skipped
     */
    private boolean isSkippedStructureArray(final EventParameter parameter) {
        // Check if this parameter is in an array
        if (!parameter.isStructArray()) {
            // This is not a parameter in a structure
            return false;
        }

        // Check if this index of the parameter is set, if so, the parameter is not skipped
        if (structureParameterValid) {
            return false;
        }

        // The optional bit is set, set the parameter values to INVALID
        setValuesInvalid(parameter.getNumberOfBytes());

        // The parameter is skipped
        return true;
    }

    /**
     * Check if this parameter is an optional parameter that should be skipped
     * @param parameter The parameter to check
     * @return true if the parameter should be skipped
     * @throws UnpackException 
     */
    private boolean isSkippedOptional(final EventParameter parameter) throws UnpackException {
        // Check if this is an optional parameter
        if (!parameter.isOptional()) {
            // This is not an optional parameter
            return false;
        }

        // Get the optional bit
        final int optionalBit = getParamByte(data, packedOffset++, 1, 0);

        // Check if the optional bit is set
        if (optionalBit == 0) {
            // The optional parameter is used
            return false;
        }

        // The optional bit is set, set the parameter values to INVALID
        setValuesInvalid(parameter.getNumberOfBytes());

        // The parameter is skipped
        return true;
    }

    /**
     * This method reads the bytes of a parameter from the bit encoded byte array to
     * a byte aligned byte array
     * 
     * @param parameter
     * @throws UnpackException 
     */
    private void readParameterValues(final EventParameter parameter) throws UnpackException {
        // Keep track of bits and bytes read
        int parameterLength = parameter.getNumberOfBytes();
        int numberOfBits = parameter.getNumberOfBits();

        // Check if the parameter is a variable length parameter
        if (parameter.isVariableLength()) {
            // Get the length of variable length parameters
            parameterLength = getVariableParameterLength(parameter);

            // Store the amount of bytes and bits to actually read on the parameter
            parameter.setNumberOfBytes(parameterLength);
            numberOfBits = parameterLength * 8;
        }

        // Now, read the parameter if it has length (this is to handle variable length parameters that have zero length)
        if (parameterLength > 0) {
            readParameterValue(parameterLength, numberOfBits);
        } else {
            setValuesInvalid(parameter.getNumberOfBytes());
        }

    }

    /**
     * This method reads the length of a variable length parameter and sets the offset correctly for reading
     * that parameter
     * 
     * @param parameter
     * @return the number of bytes in the parameter
     * @throws UnpackException 
     */
    private int getVariableParameterLength(final EventParameter parameter) throws UnpackException {
        // Hold the parameter length
        int parLength = 0;

        // Find the number of bits in the parameter, if the number of bits is -1, then the
        // length is in the preceding 2 bytes of unpacked data, otherwise it's in the first bits of this parameter
        final int numberOfBits = parameter.getNumberOfBits();

        if (numberOfBits == -1) {
            // Read the parameter length from the preceding 2 bytes. Also, in this case, the parameter is not
            // byte aligned, so just read the length and return. This encoding is used in GPEH
            parLength = (0x0000ff00 & unpackedData[unpackedOffset - 2] << 8)
                    + (0x000000ff & unpackedData[unpackedOffset - 1]);
        } else {
            // In this parameter, the length is in the first number of bits of the parameter and is byte aligned, this encoding is
            // used in EBM/SGEH
            parLength = getParamByte(data, packedOffset, numberOfBits, 0);

            // Increment the packed offset
            packedOffset += numberOfBits;

            // A variable length parameter must start on the next byte boundary
            packedOffset += (8 - (packedOffset % 8)) & 0x0000007;
        }

        return parLength;
    }

    /**
     * Unpack a single parameter value
     * @param parameterLength The length of the parameter in bytes
     * @param numberOfBits The number of bits in the parameter value
     * @throws UnpackException 
     */
    private void readParameterValue(final int parameterLength, final int numberOfBits) throws UnpackException {
        // Get the next unpacked byte for this parameter
        for (int i = 0; i < parameterLength; i++) {
            unpackedData[unpackedOffset++] = getParamByte(data, packedOffset, numberOfBits, i);
        }

        // Increment the packed offset
        packedOffset += numberOfBits;
    }

    /**
     * This method sets the bytes on a parameter to INVALID_BYTE, used when the parameter value is not set or is invalid
     * @param bytes The number of bytes to set
     */
    private void setValuesInvalid(final int bytes) {
        // Set the bytes
        for (int i = unpackedOffset; i < unpackedOffset + bytes; i++) {
            unpackedData[i] = INVALID_BYTE;
        }

        // Increment the position in the unpacked data
        unpackedOffset += bytes;
    }

    /**
     * This method gets the next byte value from a parameter in a bit packed byte array
     * @param data The bit packed byte array
     * @param bitPos The current offset in the byte array
     * @param bits The total size of the parameter
     * @param paramByte The position of the unpacked byte in the parameter 
     * @return The unpacked byte
     * @throws UnpackException 
     */
    private byte getParamByte(final byte[] data, final int bitPos, final int bits, final int paramByte)
            throws UnpackException {
        // Sanity check the amount of packed data being accessed
        if (bitPos + bits > (data.length * 8)) {
            throw new UnpackException("Overflow on packed data array, lth/pos/reading:" + (data.length * 8) + '/'
                    + bitPos + '/' + bits);
        }

        // Determine the positions for the first unpacked byte in the parameter
        int startBit = bitPos % 8;
        int dataByte = bitPos / 8;
        int bitsToRead = (bits % 8 == 0 ? 8 : bits % 8);

        // Amend the positions if this is not the first unpacked byte
        if (paramByte > 0) {
            startBit = (bitPos + bits) % 8;
            dataByte = (bitPos + bitsToRead + ((paramByte - 1) * 8)) / 8;
            bitsToRead = 8;
        }

        // Declare an integer to hold the parameter byte value and get the 2 packed bytes that hold this parameter byte
        int value = data[dataByte] & 0x000000ff;
        value <<= 8;

        // Check if we are at the end of the input data, if so don't read the next byte
        if ((dataByte + 1) < data.length) {
            value |= data[dataByte + 1] & 0x000000ff;
        }

        // Shift and and out the bits we are interested in
        value >>= 16 - startBit - bitsToRead;
        value &= 0x000000ff >> (8 - bitsToRead);

        return (byte) value;
    }
}
