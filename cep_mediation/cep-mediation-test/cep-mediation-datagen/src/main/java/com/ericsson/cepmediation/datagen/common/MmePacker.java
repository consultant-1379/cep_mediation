package com.ericsson.cepmediation.datagen.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.meta.schema.Event;
import com.ericsson.cepmediation.base.meta.schema.EventParameter;
import com.ericsson.cepmediation.loading.events.UnpackException;

/**
 * This class packs records
 * 
 * JSh - stolen from Unpacker
 */

public class MmePacker {
    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(MmePacker.class);

    // Reference to the event we are packing
    Event event = null;

    // Define a new byte array for the packed event
    byte[] packedData = null;

    // Define a reference for unpacked data
    byte[] unpackedData = null;

    // Set the initial packed and unpacked offsets
    int packedOffset = 0;

    int unpackedOffset = 0;

    // Constant used to indicate that an index is not set
    private static final byte NOT_SET = -1;

    // Member data for structure decoding
    int structureArraySize = NOT_SET;

    int structureArrayIndex = NOT_SET;

    int structureArrayFirstPar = NOT_SET;

    boolean structureParameterValid = false;

    private static final byte INVALID_BYTE = (byte) 0xff;

    public MmePacker(final Event event) {
        // Save the event we are unpacking
        this.event = event;

        if (logger.isTraceEnabled()) {
            logger.trace("Event:" + event.getId() + ':' + event.getName());
        }

        // Initialize an array for the unpacked data
        initializePackedData();
    }

    private void initializePackedData() {
        packedData = new byte[1024];
    }

    /**
     * This method expands each field in a packed event byte array into an
     * unpacked byte array
     * 
     * @param event
     *            The event that is represented by the data
     * @param data
     *            The data
     */
    public byte[] pack(final byte[] unpackedData) {
        // Set the reference to the unpacked data
        this.unpackedData = unpackedData;

        // Iterate over each parameter and decode them
        for (int parameterNumber = 0; parameterNumber < event.getParameterList().size();) {
            // Get the parameter
            final EventParameter parameter = event.getParameterList().get(parameterNumber);

            // Control structures of which the parameter may be a part
            parameterNumber = structureControl(parameter, parameterNumber);

            // Decode the parameter
            if (parameterNumber == -1 || !encodeParameter(parameter)) {
                break;
            }
        }

        int packedLength = packedOffset / 8;
        if (packedOffset % 8 != 0) {
            packedLength++;
        }

        byte[] xpackedData = new byte[packedLength];
        System.arraycopy(packedData, 0, xpackedData, 0, packedLength);
        packedData = xpackedData;

        return packedData;
    }

    private int structureControl(final EventParameter parameter, final int parNo) {
        if (!parameter.isStructArray()) {
            // We are not in a structure
            structureArraySize = NOT_SET;
            return parNo + 1;
        }

        if (structureArraySize == NOT_SET) {
            try {

                structureArraySize = parameter.getNumberOfBytes();
                setParamBytelenght(structureArraySize, packedOffset, 8);
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
        return parNo + 1;
    }

    private boolean encodeParameter(EventParameter parameter) {
        try {
            if (isSkippedStructureArray(parameter)) {
                return true;
            }

            if (isSkippedOptional(parameter)) {
                return true;
            }
            packValidityBitIfPresent(parameter);
            // Finally, write the parameter
            writeParameterValues(parameter);
            // Parameter has been decoded
            return true;
        } catch (final Exception e) {
            String message = e.getMessage();
            if (message == null) {

                e.printStackTrace();
                message = "";
            } else {
                // message = message.substring(0, 8);
            }
            if ("INTERNAL_SYSTEM_RELEASE".equals(event.getName()) && message.equals("Overflow")) {
                // swallow; temporary workaround since there seems to be bug in
                // XML definition file and
                // there is too much logging going on, leading to reduced
                // performance; TODO proper way
            } else {
                logger.warn(event.getName() + ',' + e.getMessage() + ':' + parameter.toString());
            }
            return false;
        }
    }

    private boolean isSkippedStructureArray(EventParameter parameter) {
        // Check if this parameter is in an array
        if (!parameter.isStructArray()) {
            // This is not a parameter in a structure
            return false;
        }
        if (structureParameterValid) {
            return false;
        }
        if (checkValuesAreSetToInvalid(parameter.getNumberOfBytes())) {
            parameter.getNumberOfBits();
            setStructuralBit((byte) 1, packedOffset);
        }
        unpackedOffset += parameter.getNumberOfBytes();
        return true;
    }

    private boolean isSkippedOptional(final EventParameter parameter) throws UnpackException {
        // Check if this is an optional parameter
        if (!parameter.isOptional()) {
            // This is not an optional parameter
            return false;
        }
        // set the optional bit
        if (checkValuesAreSetToInvalid(parameter.getNumberOfBytes())) {
            setStructuralBit((byte) 1, packedOffset++);
        } else {
            setStructuralBit((byte) 0, packedOffset++);
            return false;
        }
        unpackedOffset += parameter.getNumberOfBytes();
        // The parameter is skipped
        return true;
    }

    private boolean checkValuesAreSetToInvalid(final int bytes) {
        // Set the bytes
        boolean isOptionBitSetToOne = false;
        for (int i = unpackedOffset; i < unpackedOffset + bytes; i++) {
            if (unpackedData[i] == INVALID_BYTE) {
                isOptionBitSetToOne = true;
            } else {
                isOptionBitSetToOne = false;
                return isOptionBitSetToOne;
            }
        }

        return isOptionBitSetToOne;
    }

    private void packValidityBitIfPresent(EventParameter parameter) {
        if (parameter.isUseValid()) {
            setParamBit(unpackedData[unpackedOffset++], packedOffset);
            packedOffset++;
        }
    }

    private void writeParameterValues(final EventParameter parameter) {
        // Keep track of bits and bytes read
        int parameterLength = parameter.getNumberOfBytes();
        int numberOfBits = parameter.getNumberOfBits();

        if (parameter.isVariableLength()) {
            if (numberOfBits == -1) {
                // The parameter length in the preceding 2 bytes
                parameterLength = (0x0000ff00 & unpackedData[unpackedOffset - 2] << 8)
                        + (0x000000ff & unpackedData[unpackedOffset - 1]);
                numberOfBits = parameterLength * 8;
            } else {
                setParamBytelenght(parameterLength, packedOffset, numberOfBits);
                packedOffset += numberOfBits;
                packedOffset += (8 - (packedOffset % 8)) & 0x0000007;
            }
            numberOfBits = parameterLength * 8;
        }

        if (parameterLength > 0) {
            writeParameterValue(parameterLength, numberOfBits);

        } else {
            unpackedOffset += parameter.getNumberOfBytes();
        }
    }

    private void writeParameterValue(int parameterLength, int numberOfBits) {
        for (int i = 0; i < parameterLength; i++) {
            setParamByte(packedOffset, numberOfBits, i);
            unpackedOffset++;
        }

        // Increment the packed offset
        packedOffset += numberOfBits;
    }

    private void setParamByte(final int bitPos, final int bits, final int paramByte) {
        // Determine the positions for the first unpacked byte in the parameter
        int startBit = bitPos % 8; // bit position in current packed data byte
        int dataByte = bitPos / 8; // index of current packed data byte
        int bitsToWrite = (bits % 8 == 0 ? 8 : bits % 8); // #bits to write from
                                                          // unpacked for next
                                                          // unpacked byte

        // Amend the positions if this is not the first unpacked byte
        if (paramByte > 0) {
            // bit position in current packed data byte, offset by
            // bits/parameter
            startBit = (bitPos + bits) % 8;
            // index of current packed data byte, offset by number of parmeters
            dataByte = (bitPos + bitsToWrite + ((paramByte - 1) * 8)) / 8;
            bitsToWrite = 8; // need to read full byte
        }

        // Get the 2 packed bytes that hold this parameter byte
        int value = packedData[dataByte] & 0x000000ff;
        value <<= 8;
        if ((startBit + bitsToWrite) > 8) {
            value |= packedData[dataByte + 1] & 0x000000ff;
        }

        // Get bitsToWrite bits of unpacked value
        int uvalue = unpackedData[unpackedOffset];
        int umask = ((0xff << bitsToWrite) & 0xff00) >> 8;
        uvalue &= umask;

        // Write bitsToWrite bits of unpacked value to packed value from
        // startBit
        uvalue <<= 16 - startBit - bitsToWrite;
        value |= uvalue;

        // Write value back to packed data
        packedData[dataByte] = (byte) ((value & 0xff00) >> 8);
        if ((dataByte + 1) < unpackedData.length) {
            packedData[dataByte + 1] = (byte) (value & 0xff);
        }
    }

    private void setParamBytelenght(int uvalue, final int bitPos, final int bits) {
        int startBit = bitPos % 8;
        int dataByte = bitPos / 8;
        int bitsToWrite = (bits % 8 == 0 ? 8 : bits % 8);

        int value = packedData[dataByte] & 0x000000ff;
        value <<= 8;
        if ((startBit + bitsToWrite) > 8) {
            value |= packedData[dataByte + 1] & 0x000000ff;
        }
        int umask = ((0xff << bitsToWrite) & 0xff00) >> 8;
        uvalue &= umask;

        uvalue <<= 16 - startBit - bitsToWrite;
        value |= uvalue;

        packedData[dataByte] = (byte) ((value & 0xff00) >> 8);
        if ((dataByte + 1) < unpackedData.length) {
            packedData[dataByte + 1] = (byte) (value & 0xff);
        }
    }

    private void setParamBit(final byte value, final int bitPos) {
        int startBit = bitPos % 8;
        int dataByte = bitPos / 8;

        packedData[dataByte] |= (byte) ((value & 0x01) << (7 - startBit));
    }

    private void setStructuralBit(final byte value, final int bitPos) {
        int startBit = bitPos % 8;
        int dataByte = bitPos / 8;
        if (startBit + 1 >= 7) {
            packedData[dataByte + 1] |= (byte) ((value & 0x01) << (7 - startBit));
        } else {
            packedData[dataByte] |= (byte) ((value & 0x01) << (7 - startBit));
        }
    }
}
