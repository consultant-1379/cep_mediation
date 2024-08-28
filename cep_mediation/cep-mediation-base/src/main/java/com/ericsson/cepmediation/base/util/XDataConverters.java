/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2014
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/

package com.ericsson.cepmediation.base.util;

import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;
import com.ericsson.cepmediation.base.meta.schema.EventParameter;

public abstract class XDataConverters {
    // EIKRWAQ DONE!!!
    public static void setByteArray3GPPString(String value, final byte[] data,
            int offset, boolean isUseValid, final int numberOfBytesToConvert,
            EventParameter parameter) {
        int dnsoffset = offset;
        int localdataoffset = 0;

        if (value == DefaultValues.DEFAULT_STRING_VALUE) {
            for (int j = dnsoffset; j < offset + numberOfBytesToConvert; j++) {
                data[dnsoffset] = (byte) -1;
                dnsoffset++;
            }
            if (parameter.isVariableLength()) {
                parameter.setNumberOfBytes(localdataoffset);
            }
            return;
        }

        final String localval = value;
        final String[] wordsArray = localval.split("\\.");
        byte[] localdata = new byte[100];

        for (int i = 0; i < wordsArray.length; i++) {
            byte[] wordbyte = wordsArray[i].getBytes();
            byte wordlength = (byte) wordsArray[i].length();

            byte[] localArray = new byte[wordbyte.length + 1];
            localArray[0] = wordlength;

            System.arraycopy(wordbyte, 0, localArray, 1, wordbyte.length);
            System.arraycopy(localArray, 0, localdata, localdataoffset,
                    localArray.length);

            localdataoffset += localArray.length;
        }
        System.arraycopy(localdata, 0, data, dnsoffset, localdataoffset);

        if (parameter.isVariableLength()) {
            parameter.setNumberOfBytes(localdataoffset);
        }
    }

    // EIKRWAQ DONE!!!
    public static void setByteArrayIBCD(short value, final byte[] data,
            final int offset, final int bytes, final int bits,
            EventParameter parameter) {
        int dnsoffset = offset;

        if (value == DefaultValues.DEFAULT_SHORT_VALUE) {
            for (int j = dnsoffset; j < offset + bytes; j++) {
                data[dnsoffset] = (byte) -1;
                dnsoffset++;
            }
            if (parameter.isVariableLength()) {
                parameter.setNumberOfBytes(0);
            }
            return;
        }

        int localoffset = (bytes * 2) - 1;
        byte bcd[] = new byte[bytes];
        while (value > 0) {
            final int nibble = value % 10;
            // check its odd value
            if (localoffset % 2 == 1) {
                bcd[localoffset / 2] = (byte) nibble;
            } else {
                bcd[localoffset / 2] = (byte) (bcd[localoffset / 2] + (byte) (nibble << 4));
            }
            localoffset--;
            value /= 10;
        }

        while (localoffset > 0) {
            if (localoffset % 2 == 1) {
                bcd[localoffset / 2] |= 0x0f;
            } else {
                bcd[localoffset / 2] = (byte) (bcd[localoffset / 2] << 4);
            }
            localoffset--;
        }
        System.arraycopy(bcd, 0, data, offset, bcd.length);

        if (parameter.isVariableLength()) {
            parameter.setNumberOfBytes(bcd.length);
        }
    }

    // EIKRWAQ DONE!!!
    public static void setByteArrayTBCDString(String value, final byte[] data,
            int offset, boolean isUseValid, final int numberOfBytesToConvert,
            EventParameter parameter) {

        int offsetForData = offset;
        if (isUseValid) {
            data[offsetForData] = 0;
            if (value == DefaultValues.DEFAULT_STRING_VALUE) {
                markInvalid(data, offsetForData);
                if (parameter.isVariableLength()) {
                    parameter.setNumberOfBytes(0);
                }
                return;
            }
            offsetForData = offsetForData + 1;
        }

        final int length = (value == null ? 0 : value.length());
        final int size = (length + 1) / 2;
        byte[] buffer = new byte[size];

        for (int i = 0, i1 = 0, i2 = 1; i < size; ++i, i1 += 2, i2 += 2) {

            char c = value.charAt(i1);
            int n2 = getTBCDNibble(c, i1);
            int octet = 0;
            int n1 = 15;
            if (i2 < length) {
                c = value.charAt(i2);
                n1 = getTBCDNibble(c, i2);
            }
            octet = (n1 << 4) + n2;
            buffer[i] = (byte) (octet & 0xFF);
        }
        if (buffer.length < numberOfBytesToConvert) {
            byte[] tmp = new byte[numberOfBytesToConvert];
            for (int i = buffer.length; i < tmp.length; i++) {
                tmp[i] = (byte) -1;
            }
            System.arraycopy(buffer, 0, tmp, 0, buffer.length);
            System.arraycopy(tmp, 0, data, offsetForData, tmp.length);
            if (parameter.isVariableLength()) {
                parameter.setNumberOfBytes(tmp.length);
            }
        } else {
            System.arraycopy(buffer, 0, data, offsetForData, buffer.length);
            if (parameter.isVariableLength()) {
                parameter.setNumberOfBytes(buffer.length);
            }
        }
    }

    // EIKRWAQ DONE!!!
    public static void setByteArrayDottedDecimalString(String value,
            final byte[] data, int offset, boolean isUseValid,
            final int numberOfBytesToConvert, EventParameter parameter) {

        int localoffset = offset;

        if (value == DefaultValues.DEFAULT_STRING_VALUE) {
            for (int j = localoffset; j < offset + numberOfBytesToConvert; j++) {
                data[localoffset] = (byte) -1;
                localoffset++;
            }
            return;
        }
        if (value.length() == 0) {
            for (int j = localoffset; j < offset + numberOfBytesToConvert; j++) {
                data[localoffset] = (byte) -1;
                localoffset++;
            }
            return;
        }

        final String localval = value;
        final String[] localArray = localval.split("\\.");

        byte[] localdata = new byte[100];
        int localdataoffset = 0;

        for (int i = 0; i < localArray.length; i++) {
            long x = Integer.parseInt(localArray[i]);
            localdata[localdataoffset] = (byte) ((x >> 0) & 0xff);
            localdataoffset++;
        }

        System.arraycopy(localdata, 0, data, offset, localdataoffset);
        if (parameter.isVariableLength()) {
            parameter.setNumberOfBytes(localdataoffset);
        }
    }

    // EIKRWAQ DONE!!!
    public static void setString(String value, final byte[] data, int offset,
            boolean isUseValid, final int numberOfBytesToConvert,
            EventParameter parameter) {

        int offsetForData = offset;

        if (isUseValid) {
            data[offsetForData] = 0;
            if (value == DefaultValues.DEFAULT_STRING_VALUE) {
                markInvalid(data, offsetForData);
                return;
            }
            offsetForData = offset + 1;
        }

        byte[] word = value.getBytes();

        if (word.length != numberOfBytesToConvert) {
            for (int i = numberOfBytesToConvert - word.length; i < numberOfBytesToConvert; i++) {
                byte[] tmp = new byte[numberOfBytesToConvert];
                System.arraycopy(word, 0, tmp, 0, word.length);
                word = new byte[numberOfBytesToConvert];
                System.arraycopy(tmp, 0, word, 0, tmp.length);
            }
        }

        System.arraycopy(word, 0, data, offset, word.length);
    }

    // EIKRWAQ DONE!!!
    public static void setLong(long value, final byte[] data, int offset,
            boolean isUseValid, final int numberOfBytesToConvert,
            EventParameter parameter) {
        int offsetForData = offset;
        if (isUseValid) {
            data[offsetForData] = 0;
            if (value == DefaultValues.DEFAULT_LONG_VALUE) {
                markInvalid(data, offsetForData);
                return;
            }
            offsetForData = offset + 1;
        }

        setByteArrayInteger((int) value, data, offset, numberOfBytesToConvert,
                false, parameter);
    }

    public static void setBoolean(boolean value, final byte[] data, int offset,
            boolean isUseValid, final int numberOfBytesToConvert,
            EventParameter parameter) {

    }

    /*
     * EIKRWAQ This is a dummy method, floats are not returned by any currently
     * 8 supported file type, we not gona use it, in coding, because we save
     * byte[] as it is... don't make any modification
     */
    public static void setFloat(float value, final byte[] data, int offset,
            boolean isUseValid, final int numberOfBytesToConvert,
            EventParameter parameter) {
    }

    // EIKRWAQ DONE!!!
    public static void setDouble(double value, final byte[] data, int offset,
            boolean isUseValid, final int numberOfBytesToConvert,
            EventParameter parameter) {
        int offsetForData = offset;

        long localval = Double.doubleToRawLongBits(value);

        if (isUseValid) {
            data[offsetForData] = 0;
            if (value == DefaultValues.DEFAULT_DOUBLE_VALUE) {
                markInvalid(data, offsetForData);
                return;
            }
            offsetForData = offset + 1;
        }

        if (numberOfBytesToConvert == 8) {
            int localswift = 0;
            for (int i = offsetForData; i < offsetForData
                    + numberOfBytesToConvert; i++) {
                data[i] = (byte) ((localval >> 56 - localswift) & 0xff);
                localswift += 8;
            }
        }
    }

    public static void setUnsignedIntegerAsInteger(int value,
            final byte[] data, int offset, boolean isUseValid,
            final int numberOfBytesToConvert, EventParameter parameter) {
        int offsetForData = offset;
        if (isUseValid) {
            data[offsetForData] = 0;
            if (value == DefaultValues.DEFAULT_INT_VALUE) {
                markInvalid(data, offsetForData);
                return;
            }
            offsetForData = offset + 1;
        }
        setByteArrayInteger(value, data, offsetForData, numberOfBytesToConvert,
                false, parameter);
    }

    public static void setShort(int value, final byte[] data, int offset,
            boolean isUseValid, final int numberOfBytesToConvert,
            EventParameter parameter) {
        setShort((short) value, data, offset, isUseValid,
                numberOfBytesToConvert, parameter);
    }

    public static void setShort(short value, final byte[] data, int offset,
            boolean isUseValid, final int numberOfBytesToConvert,
            EventParameter parameter) {
        int offsetForData = offset;
        if (isUseValid) {
            data[offsetForData] = 0;
            if (value == DefaultValues.DEFAULT_SHORT_VALUE) {
                markInvalid(data, offsetForData);
                return;
            }
            offsetForData = offset + 1;
        }
        setByteArrayInteger(value, data, offsetForData, numberOfBytesToConvert,
                false, parameter);
    }

    public static void setByte(int value, final byte[] data, int offset,
            boolean isUseValid, final int numberOfBytesToConvert,
            EventParameter parameter) {
        setByte((byte) value, data, offset, isUseValid, numberOfBytesToConvert,
                parameter);
    }

    public static void setByte(final byte value, final byte[] data, int offset,
            boolean isUseValid, final int numberOfBytesToConvert,
            EventParameter parameter) {
        int offsetForData = offset;
        if (isUseValid) {
            data[offsetForData] = 0;
            if (value == DefaultValues.DEFAULT_BYTE_VALUE) {
                markInvalid(data, offsetForData);
                return;
            }
            offsetForData = offset + 1;
        }
        setByteArrayInteger(value, data, offsetForData, numberOfBytesToConvert,
                false, parameter);
    }

    public static void setByteArray(byte[] value, final byte[] data,
            final int offset, boolean isUseValid, final int bytes,
            EventParameter parameter) {
        int offsetForData = offset;
        if (isUseValid) {
            data[offsetForData] = 0;
            if (value == DefaultValues.DEFAULT_BYTE_ARRAY_VALUE) {
                markInvalid(data, offsetForData);
                return;
            }
            offsetForData = offset + 1;
        }

        // TODO - don't think we need the following for now... If the length of
        // the binary parameter is -1, the length is in the previous two bytes

        for (int i = 0; i < value.length; i++) {
            data[offsetForData + i] = value[i];
        }

        if (parameter.isVariableLength()) {
            parameter.setNumberOfBytes(value.length);
        }
    }

    public static void setByteArrayInteger(int value, final byte[] data,
            final int offset, final int bytes, final boolean signed,
            EventParameter parameter) {
        long paramValue = value;
        int xoffset = offset;

        for (int i = offset; i < offset + bytes; i++) {
            final long x = paramValue >> ((offset + bytes - i - 1) * 8);
            data[xoffset++] = (byte) (x & 0xff);
        }
        // TODO - sign
    }

    private static void markInvalid(byte[] data, int offset) {
        data[offset] = 1;
    }

    public static void setByteArrayHexString(String value, final byte[] data,
            final int offset, boolean isUseValid, final int bytes,
            EventParameter parameter) {
        int offsetForData = offset;

        int charIndex = 0;
        if (value.length() % 2 != 0) { // odd length
            data[offsetForData] = (byte) (Character.digit(value.charAt(0), 16));
            offsetForData++;
            charIndex++;
        }

        while (charIndex < value.length()) {
            data[offsetForData] = (byte) ((Character.digit(
                    value.charAt(charIndex), 16) << 4) + Character.digit(
                    value.charAt(charIndex + 1), 16));
            offsetForData++;
            charIndex += 2;
        }
    }

    private static int getTBCDNibble(char c, int i1) {

        int n = Character.digit(c, 10);

        if (n < 0 || n > 9) {
            switch (c) {
            case '*':
                n = 10;
                break;
            case '#':
                n = 11;
                break;
            case 'a':
                n = 12;
                break;
            case 'b':
                n = 13;
                break;
            case 'c':
                n = 14;
                break;
            default:
                throw new NumberFormatException("Bad character '" + c
                        + "' at position " + i1);
            }
        }
        return n;
    }

    public static boolean isGpeh() {
        final String propertyValue = System.getProperty("datagen.gpeh.files",
                Boolean.toString(false));
        return Boolean.parseBoolean(propertyValue);
    }

}
