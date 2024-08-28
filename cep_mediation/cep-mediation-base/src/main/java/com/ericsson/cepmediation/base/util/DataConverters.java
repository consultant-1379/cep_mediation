package com.ericsson.cepmediation.base.util;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;

/**
 * This class provides static utility methods for converting data
 * 
 * @author eeilfn
 */
public abstract class DataConverters {
    // Flags to indicate if an integer is signed or not
    public final static boolean UNSIGNED_FLAG = false;

    public final static boolean SIGNED_FLAG = true;

    /**
     * Returns a byte array segment as a long integer, assumes an unsigned integer
     * @param data the byte array to use
     * @param offset the offset to start at 
     * @param numberOfBytesToConvert the number of bytes to convert
     * @return The long representation of tlhe byte array segment
     */
    private static long getByteArrayUnsignedInteger(final byte[] data, int offset, final int numberOfBytesToConvert) {
        return getByteArrayInteger(data, offset, numberOfBytesToConvert, false);
    }

    /**
     * Returns a byte array segment as a long integer, assumes an unsigned integer
     * @param data the byte array to use
     * @param offset the offset to start at
     * @param isUseValid 
     * @param numberOfBytesToConvert the number of bytes to convert
     * @return The long representation of the byte array segment
     */
    public static int getUnsignedIntegerAsInteger(final byte[] data, int offset, boolean isUseValid, final int numberOfBytesToConvert) {
        int offsetForData = offset;
        if (isUseValid) {
            if (isMarkedInvalid(data, offset)) {
                return DefaultValues.DEFAULT_INT_VALUE;

            }
            offsetForData = offset + 1;

        }
        return (int) getByteArrayInteger(data, offsetForData, numberOfBytesToConvert, false);
    }

    private static boolean isMarkedInvalid(byte[] data, int offset) {
        // Get the validation byte
        final int validationByte = data[offset];

        if (validationByte == 0) {
            // The parameter is validated, so it is not skipped
            return false;
        }

        return true;

    }

    /**
     * Returns a byte array segment as a boolean value
     * @param data the byte array to use
     * @param offset the offset to start at
     * @param isUseValid 
     * @param bytes the number of bytes to convert
     * @return The boolean value
     */
    public static boolean getBoolean(final byte[] data, final int offset, boolean isUseValid, final int bytes) {
        int offsetToUse = offset;
        if (isUseValid) {
            if (isMarkedInvalid(data, offset)) {
                return DefaultValues.DEFAULT_BOOLEAN_VALUE;
            }
            offsetToUse = offset + 1;
        }
        return (getByteArrayInteger(data, offsetToUse, bytes, false) == 0 ? true : false);
    }

    /**
     * Returns a byte array segment as a float value
     * @param data the byte array to use
     * @param offset the offset to start at
     * @param isUseValid 
     * @param bytes the number of bytes to convert
     * @return The boolean value
     */
    public static float getFloat(final byte[] data, final int offset, boolean isUseValid, final int bytes) {
        // This is a dummy method, floats are not returned by any currently supported file types
        return 0;
    }

    /**
     * Returns a byte array segment as a double value
     * @param data the byte array to use
     * @param offset the offset to start at
     * @param isUseValid 
     * @param bytes the number of bytes to convert
     * @return The double value
     */
    public static double getDouble(final byte[] data, final int offset, boolean isUseValid, final int bytes) {
        int offsetToUse = offset;
        if (isUseValid) {
            if (isMarkedInvalid(data, offset)) {
                return DefaultValues.DEFAULT_DOUBLE_VALUE;
            }
            offsetToUse = offset + 1;
        }

        final byte[] dataset = Arrays.copyOfRange(data, offsetToUse, offsetToUse + bytes);
        if (dataset != null && dataset.length > 0) {
            return Double.longBitsToDouble(byteArray2Long(dataset));
        }
        return 0;
    }

    /**
     * Returns a byte array segment as a long integer
     * @param data the byte array to use
     * @param offset the offset to start at
     * @param bytes the number of bytes to convert
     * @param signed true if this integer value is signed
     * @return The long representation of the byte array segment
     */
    public static long getByteArrayInteger(final byte[] data, final int offset, final int bytes, final boolean signed) {
        // Get the integer value of the parameter
        long paramValue = 0;

        // Iterate over the bytes to be decoded
        for (int i = offset; i < offset + bytes; i++) {
            paramValue = paramValue << 8 | (0x00000000000000ff & data[i]);
        }

        // For integers of length less than 8 bytes, check if this integer value is signed
        // Integers of length 8 bytes are full longs and will be handled automatically
        if (bytes < 8 && signed) {
            // Check if the uppermost bit for the number of bytes in question is set, then we have a negative value
            if (paramValue >> (bytes * 8) - 1 != 0) {
                // Uppermost bit is set, we set all high bytes to 1s for the length of the long
                for (int i = bytes; i < 8; i++) {
                    // Set high bits
                    final long maskValue = ((long) 0xff) << (i * 8);
                    paramValue = paramValue | maskValue;
                }
            }
        }

        return paramValue;
    }

    /**
     * Converts a byte array segment to a hex string
     * @param data the byte array
     * @param offset the offset in the byte array to start at
     * @param isUseValid 
     * @param bytes the number of bytes to convert
     * @return the hex string
     */
    public static String getByteArrayHexString(final byte[] data, final int offset, boolean isUseValid, final int bytes) {
        // These are the characters we can have in the output
        final char[] hexCharArray = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

        // This array will hold the hex string as a character array
        final char[] hexChars = new char[bytes * 2];

        // The current byte value
        int value;

        // Iterate over the byte array
        for (int i = 0; i < bytes; i++) {
            // Get the current byte
            value = data[i + offset] & 0xff;

            // Add in the character representation of each character of the current byte
            hexChars[i * 2] = hexCharArray[value / 16];
            hexChars[i * 2 + 1] = hexCharArray[value % 16];
        }

        return new String(hexChars);
    }

    /**
     * Converts a byte array segment to a hex string and return hex string with only numeric value
     * @param data
     * @param offset
     * @param isUseValid
     * @param bytes
     * @return the hex string with only numeric value
     */
    public static String getByteArrayNumericHexString(final byte[] data, final int offset, boolean isUseValid, final int bytes) {
        return getByteArrayHexString(data, offset, isUseValid, bytes).replaceAll("[^\\d.]", "");
    }

    /**
     * Returns a byte array segment as a separate byte array
     * @param data the byte array to use
     * @param offset the offset to start at
     * @param isUseValid 
     * @param bytes the number of bytes to extract
     * @return The segment of the byte array
     */
    public static byte[] getByteArray(final byte[] data, final int offset, boolean isUseValid, int bytes) {
        int offsetToUse = offset;
        if (isUseValid) {
            if (isMarkedInvalid(data, offset)) {
                return DefaultValues.DEFAULT_BYTE_ARRAY_VALUE;
            }
            offsetToUse = offset + 1;
        }
        // If the length of the binary parameter is -1, the length is in the previous two bytes
        if (bytes == -1) {
            // Reset the length
            bytes = (int) getByteArrayInteger(data, offsetToUse - 2, 2, DataConverters.UNSIGNED_FLAG);
        }

        // Declare the new byte array
        final byte[] subByteArray = new byte[bytes];

        // Populate the sub byte array
        for (int i = 0; i < bytes; i++) {
            subByteArray[i] = data[offsetToUse + i];
        }

        // Return the byte array
        return subByteArray;
    }

    /**
     * Returns a byte array segment as a DNS name string. The DNS name is made up of a string
     * of words, with the word length of each word separating the words. This method uses the
     * word length values to jump through the string and delimits the words with dot characters
     * @param data the byte array to use
     * @param offset the offset to start at
     * @param isUseValid 
     * @param bytes the number of bytes to extract
     * @return The byte array segment as a DNS name
     */
    public static String getByteArray3GPPString(final byte[] data, final int offset, boolean isUseValid, final int bytes) {
        // Declare a string builder to hold the string
        final StringBuilder builder = new StringBuilder();

        // Append all the words in the DNS name
        for (int dnsOffset = offset; dnsOffset < offset + bytes - 1;) {
            // Get the length of the word
            final int wordLength = data[dnsOffset++];

            // Check if the word length is -1 or the first character of the string is less than zero, indicating the end of the DNS name
            if (wordLength == -1 || data[dnsOffset] < 0) {
                break;
            }

            // Get the word
            final String dnsWord = new String(data, dnsOffset, wordLength).trim();

            // Add the word to the string builder if the word is not zero length
            if (dnsWord.length() > 0) {
                // Check if this is the first word, if not, append a dot
                if (dnsOffset > offset + 1) {
                    builder.append('.');
                }

                // Append the word
                builder.append(dnsWord);
            }

            // Hop to the next word
            dnsOffset += wordLength;
        }

        // Check if an APN was specified
        if (builder.length() == 0) {
            return null;
        }
        // Return the string
        return builder.toString();

    }

    /**
     * Returns a byte array segment as an IBCD number
     * @param data the byte array to use
     * @param offset the offset to start at
     * @param bytes the number of bytes to extract
     * @return The byte array segment as an IBCD number
     */
    public static int getByteArrayIBCD(final byte[] data, final int offset, final int bytes, final int bits) {
        // Declare an integer to hold the IBCD number
        int value = 0;

        // Declare a temporary array to hold the IBCD values
        final int[] ibcdValues = new int[bytes * 2];

        // Store the IBCD values into the array
        for (int i = bytes * 2 - 1, j = offset; j < offset + bytes; i -= 2, j++) {
            ibcdValues[i - 1] = data[j] & 0x0000000f;
            ibcdValues[i] = (data[j] & 0x000000f0) >> 4;
        }

        // Calculate the IBCD value, stop if we encounter a filler IBCD value of 10 or more
        for (int i = 0; i < bits / 4 && ibcdValues[i] < 10; i++) {
            // The IBCD digits are held in decreasing order in the array so
            // multiply the value by 10 for each iteration
            value = value * 10 + ibcdValues[i];
        }

        // The integer value is the value of the IBCD number
        return value;
    }

    /**
     * Returns a byte array segment as a TBCD string
     * @param data the byte array to use
     * @param offset the offset to start at
     * @param isUseValid 
     * @param bytes the number of bytes to extract
     * @return The byte array segment as an IBCD number string
     */
    public static String getByteArrayTBCDString(final byte[] data, final int offset, boolean isUseValid, final int bytes) {
    	int offsetToUse = offset;
        if (isUseValid) {
            if (isMarkedInvalid(data, offset)) {
                return DefaultValues.DEFAULT_STRING_VALUE;
            }
            offsetToUse = offset + 1;
        }
        // Declare a byte array to hold the TBCD value
        final byte[] tbcdValue = getByteArrayTBCD(data, offsetToUse, bytes);

        // Return the value with hexadecimal 'f' values stripped
        return getByteArrayHexString(tbcdValue, 0, false, tbcdValue.length).replace("f", "");
    }

    /**
     * Returns a byte array segment as a TBCD number
     * @param data the byte array to use
     * @param offset the offset to start at
     * @param bytes the number of bytes to extract
     * @return The byte array segment as an IBCD number
     */
    private static byte[] getByteArrayTBCD(final byte[] data, final int offset, final int bytes) {
        // Declare a byte array to hold the TBCD value
        final byte[] tbcdValue = new byte[bytes];

        // Reverse the order of the nibbles in each byte
        for (int i = offset, j = 0; i < bytes + offset; i++, j++) {
            // Store least significant nibble first
            int value = (data[i] & 0x0000000f) << 4;

            // Store most significant nibble last
            value |= (data[i] & 0x000000f0) >> 4;

            // Store the value into the array
            tbcdValue[j] = (byte) value;
        }

        // Return the value
        return tbcdValue;
    }

    /**
     * Returns a byte array segment as a string
     * @param data the byte array to use
     * @param offset the offset to start at
     * @param isUseValid 
     * @param bytes the number of bytes to extract
     * @return The byte array segment as a string
     */
    public static String getString(final byte[] data, final int offset, boolean isUseValid, final int bytes) {

        int offsetToUse = offset;
        if (isUseValid) {
            boolean markedInvalid = isMarkedInvalid(data, offset);
            if (markedInvalid) {
                return DefaultValues.DEFAULT_STRING_VALUE;
            }
            offsetToUse = offset + 1;
        }
        // Declare a string builder to hold the string
        final StringBuilder builder = new StringBuilder();

        // Append the byte data to the string builder
        for (int i = offsetToUse; i < bytes + offsetToUse; i++) {
            // Ignore zeroed bytes, the first byte in the field is zero (is this an error in the file?)
            if (data[i] != 0) {
                builder.append((char) data[i]);
            }
        }

        // Return the string
        return builder.toString();
    }

    /**
     * Converts an entire byte array to a hex string
     * @param data the byte array
     * @param isUseValid 
     * @return the hex string
     */
    public static String getByteArrayDottedDecimalString(final byte[] data, final int offset, boolean isUseValid, final int bytes) {
        final StringBuilder builder = new StringBuilder();

        // Check if the address is set, if all values are 0xff then the address is not set
        boolean isSet = false;

        for (int i = offset; i < bytes + offset; i++) {
            if (i != offset) {
                builder.append('.');
            }
            // Use the mask to and out any signs
            builder.append((data[i] & 0x00ff));

            // Check if the address value is set
            if (!isSet && data[i] != -1) {
                isSet = true;
            }
        }

        // Check if the address was set
        if (isSet) {
            // Return the string
            return builder.toString();
        }
        return null;

    }

    /**
     * Converts an entire byte array to a hex string
     * @param data the byte array
     * @return the hex string
     */
    public static String byteArray2String(final byte[] data) {
        return getByteArrayHexString(data, 0, false, data.length);
    }

    /**
     * method to convert a byte array to a long
     * @param data The byte array
     * @return the long value
     */
    private static long byteArray2Long(final byte[] data) {
        if (data == null || data.length != 8) {
            return 0x0;
        }
        return ((long) (0xff & data[0]) << 56 | (long) (0xff & data[1]) << 48 | (long) (0xff & data[2]) << 40 | (long) (0xff & data[3]) << 32
                | (long) (0xff & data[4]) << 24 | (long) (0xff & data[5]) << 16 | (long) (0xff & data[6]) << 8 | (long) (0xff & data[7]) << 0);
    }

    public static int getField(final String[] fields, final AtomicInteger inc, final int type, final String name) {
        if (fields[inc.get()] == null || fields[inc.get()].trim().length() == 0 || fields[inc.get()].equals("Unknown") || fields[inc.get()].equals("\\N")) {
            inc.getAndIncrement();
            return -1;
        }
        return Integer.valueOf(fields[inc.getAndIncrement()]);
    }

    public static float getField(final String[] fields, final AtomicInteger inc, final float type, final String name) {
        if (fields[inc.get()].contains("nan") || fields[inc.get()].contains("inf")) {
            inc.getAndIncrement();
            return new Float(0);
        }
        if (fields[inc.get()] == null || fields[inc.get()].trim().length() == 0 || fields[inc.get()].equals("Unknown") || fields[inc.get()].equals("\\N")) {
            inc.getAndIncrement();
            return DefaultValues.DEFAULT_FLOAT_VALUE;
        }
        return Float.valueOf(fields[inc.getAndIncrement()]);
    }

    public static float[] getField(final String[] fields, final AtomicInteger inc, final float[] type, final String name) {
        if (fields[inc.get()].equals("{}")) {
            inc.getAndIncrement();
            return new float[] { -1 };
        }

        // Remove the parenthesis from the string
        String field = fields[inc.get()].replaceAll("\\{|\\}", "");
        field = field.replaceAll("\"", "");

        // Split the IP address string
        final String[] arrayFields = field.split(",");

        // Array to hold the values
        final float[] array = new float[arrayFields.length];

        // Now load the Array
        for (int i = 0; i < arrayFields.length; i++) {
            // need to handle these values in the MOS_Value fields
            if (arrayFields[i].contains("nan") || arrayFields[i].contains("inf") || arrayFields[i].contains("\\N")) {
                array[i] = DefaultValues.DEFAULT_FLOAT_VALUE;
            } else {
                array[i] = Float.valueOf(arrayFields[i]);
            }
        }
        inc.getAndIncrement();
        return array;
    }

    public static byte getField(final String[] fields, final AtomicInteger inc, final byte type, final String name) {
        if (name.equals("RAT")) {
            // convert a RAT string value to a RAT ENUM value
            if (fields[inc.get()].equalsIgnoreCase("geran") || fields[inc.get()].equalsIgnoreCase("GSM")) {
                // ENUM value GSM from event file <enum internal="GSM" value="0">GSM</enum>
                inc.getAndIncrement();
                return 0;
            }

            if (fields[inc.get()].equalsIgnoreCase("utran") || fields[inc.get()].equalsIgnoreCase("WCDMA")) {
                // ENUM value WCDMA from event file <enum internal="WCDMA" value="1">WCDMA</enum>
                inc.getAndIncrement();
                return 1;
            }

            if (fields[inc.get()].equalsIgnoreCase("lte")) {
                // ENUM value GSM from event file <enum internal="LTE" value="2">LTE</enum>
                inc.getAndIncrement();
                return 2;
            }
            inc.getAndIncrement();
            return -1;
        }
        if (fields[inc.get()] == null || fields[inc.get()].trim().length() == 0 || fields[inc.get()].equals("Unknown") || fields[inc.get()].equals("\\N")) {
            inc.getAndIncrement();
            return -1;
        }
        return Byte.valueOf(fields[inc.getAndIncrement()]);
    }

    public static short getField(final String[] fields, final AtomicInteger inc, final short type, final String name) {
        if (fields[inc.get()] == null || fields[inc.get()].trim().length() == 0 || fields[inc.get()].equals("Unknown") || fields[inc.get()].equals("\\N")) {
            inc.getAndIncrement();
            return -1;
        }
        return Short.valueOf(fields[inc.getAndIncrement()]);
    }

    public static long getField(final String[] fields, final AtomicInteger inc, final long type, final String name) {
        if (fields[inc.get()] == null || fields[inc.get()].trim().length() == 0 || fields[inc.get()].equals("Unknown") || fields[inc.get()].equals("\\N")) {
            inc.getAndIncrement();
            return -1;
        }

        // if contains floating point, then truncate the fraction part
        if (fields[inc.get()].contains(".")) {
            final long retVal = Long.valueOf(fields[inc.get()].substring(0, fields[inc.get()].indexOf(".")));
            inc.getAndIncrement();
            return retVal;
        }

        return Long.valueOf(fields[inc.getAndIncrement()]);
    }

    public static String getField(final String[] fields, final AtomicInteger inc, final String type, final String name) {

        /**
         * 
         * increase the inc(AtomicInteger) by 1 and return the previous value of inc as the index to retrieve element from fields
         */
        String ret = fields[inc.getAndIncrement()];

        //if the value is null or if the value is "\N", which is null symbol in user plane data, set the value to null
        if (ret == null || ret.equals("\\N")) {

            ret = null;
        }

        //if the trimmed value is empty string, set the value to empty
        else if (ret.trim().length() == 0) {

            ret = "";
        }

        return ret;

    }

    public static String getByteArrayHexString(byte[] data, int offset, int numberOfBytes) {
        return getByteArrayHexString(data, offset, false, numberOfBytes);
    }

    public static byte getByte(byte[] data, int offset, boolean useValid, int numberOfBytes) {
        int offsetToUse = offset;
        if (useValid) {
            if (isMarkedInvalid(data, offset)) {
                return DefaultValues.DEFAULT_BYTE_VALUE;
            }
            offsetToUse = offset + 1;
        }
        return (byte) getByteArrayUnsignedInteger(data, offsetToUse, numberOfBytes);
    }

    public static short getShort(byte[] data, int offset, boolean useValid, int numberOfBytes) {
        int offsetToUse = offset;
        if (useValid) {
            if (isMarkedInvalid(data, offset)) {
                return DefaultValues.DEFAULT_SHORT_VALUE;
            }
            offsetToUse = offset + 1;
        }
        return (short) getByteArrayUnsignedInteger(data, offsetToUse, numberOfBytes);
    }

    public static long getLong(byte[] data, int offset, boolean isUseValid, int numberOfBytes) {
        int offsetToUse = offset;
        if (isUseValid) {
            if (isMarkedInvalid(data, offset)) {
                return DefaultValues.DEFAULT_LONG_VALUE;
            }
            offsetToUse = offset + 1;
        }
        return getByteArrayUnsignedInteger(data, offsetToUse, numberOfBytes);
    }

}
