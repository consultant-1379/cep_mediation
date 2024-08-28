/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.util;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import junit.framework.Assert;

import org.junit.Test;

import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;

/**
 * @author eemecoy
 *
 */
public class DataConvertersTest {

    private static final double SAMPLE_DOUBLE = 688128.0098116109;

    private static final long SAMPLE_LONG = 16909060L;

    private String word = "word";

    @Test
    public void testGetLong_ValidityByteSetToNotOK() {
        testGetLongValidityByte((byte) 1, DefaultValues.DEFAULT_LONG_VALUE);
    }

    @Test
    public void testGetLong_ValidityByteSetToOK() {
        testGetLongValidityByte((byte) 0, SAMPLE_LONG);
    }

    private void testGetLongValidityByte(byte validityByte, long expectedValue) {
        byte[] data = new byte[] { validityByte, 0, 0, 0, 0, 1, 2, 3, 4 };
        int numberOfBytes = 8;
        long result = DataConverters.getLong(data, 0, true, numberOfBytes);
        assertThat(result, is(expectedValue));
    }

    @Test
    public void testGetLong_NoValidityByte() {
        testGetLong(false);
    }

    private void testGetLong(boolean isUseValid) {
        byte[] data = new byte[] { 0, 0, 0, 0, 1, 2, 3, 4 };
        int numberOfBytes = 8;
        long result = DataConverters.getLong(data, 0, isUseValid, numberOfBytes);
        assertThat(result, is(SAMPLE_LONG));
    }

    @Test
    public void testGetShort_ValidityByteNotSet() {
        testGetShort(new byte[] { 1, 2 }, false, (short) (258));
    }

    @Test
    public void testGetShort_ValidityByteSetToNotOK() {
        testGetShort(new byte[] { 1, 0 }, true, DefaultValues.DEFAULT_BYTE_VALUE);
    }

    @Test
    public void testGetShort_ValidityByteSetToOK() {
        short expectedValue = 258;
        byte[] data = new byte[] { 0, 1, 2 };
        testGetShort(data, true, expectedValue);
    }

    private void testGetShort(byte[] data, boolean useValid, short expectedValue) {
        short result = DataConverters.getShort(data, 0, useValid, 2);
        assertThat(result, is(expectedValue));
    }

    @Test
    public void testGetByte_ValidityByteNotSet() {
        testGetByte(new byte[] { 1 }, false, (byte) 1);
    }

    @Test
    public void testGetByte_ValidityByteSetToNotOK() {
        testGetByte(new byte[] { 1, 0 }, true, DefaultValues.DEFAULT_BYTE_VALUE);
    }

    @Test
    public void testGetByte_ValidityByteSetToOK() {
        byte expectedValue = 1;
        byte[] data = new byte[] { 0, expectedValue };
        testGetByte(data, true, expectedValue);
    }

    private void testGetByte(byte[] data, boolean useValid, byte expectedValue) {
        int offset = 0;
        int numberOfBytes = 1;
        byte result = DataConverters.getByte(data, offset, useValid, numberOfBytes);
        assertThat(result, is(expectedValue));
    }

    @Test
    public void getGetField_String() {
        String[] fields = new String[] { "1", "2" };
        AtomicInteger inc = new AtomicInteger(1);
        String type = "";
        String name = null;
        String result = DataConverters.getField(fields, inc, type, name);
        assertThat(result, is("2"));
    }
    
    @Test
    public void getGetField_NullString(){
        
        String[] fields = new String[]{null, "\\N"};
        
        AtomicInteger inc = new AtomicInteger(0);
        
        String type = "";
        
        String name = null;
        
        //get the first element from array fields
        String result = DataConverters.getField(fields, inc, type, name);
        
        Assert.assertNull(result);
        
        //get the second element from array fields
        result = DataConverters.getField(fields, inc, type, name);
        
        Assert.assertNull(result);
        
    }

    @Test
    public void getGetField_Long() {
        String[] fields = new String[] { "1", "2" };
        AtomicInteger inc = new AtomicInteger(1);
        long type = 0;
        String name = null;
        long result = DataConverters.getField(fields, inc, type, name);
        assertThat(result, is(2L));
    }

    @Test
    public void getGetField_Short() {
        String[] fields = new String[] { "1", "2" };
        AtomicInteger inc = new AtomicInteger(1);
        short type = 0;
        String name = null;
        short result = DataConverters.getField(fields, inc, type, name);
        assertThat(result, is((short) 2));
    }

    @Test
    public void testGetField_Byte() {
        String[] fields = new String[] { "64", "54" };
        AtomicInteger inc = new AtomicInteger(1);
        byte type = 0;
        String name = "name";
        byte result = DataConverters.getField(fields, inc, type, name);
        assertThat(result, is((byte) 54));
    }

    @Test
    public void getGetField_Float() {
        String[] fields = new String[] { "1", "2" };
        AtomicInteger inc = new AtomicInteger(1);
        float type = 0.0f;
        String name = null;
        float result = DataConverters.getField(fields, inc, type, name);
        assertThat(result, is(2.0f));
    }

    @Test
    public void getGetField_Int() {
        String[] fields = new String[] { "1", "2" };
        AtomicInteger inc = new AtomicInteger(1);
        int type = 0;
        String name = null;
        int result = DataConverters.getField(fields, inc, type, name);
        assertThat(result, is(2));
    }

    @Test
    public void getGetField_FloatArray() {
        String[] fields = new String[] { "1", "2" };
        AtomicInteger inc = new AtomicInteger(1);
        float[] type = null;
        String name = null;
        float[] result = DataConverters.getField(fields, inc, type, name);
        assertThat(result, is(new float[] { 2.0f }));
    }

    @Test
    public void testgetByteArrayDottedDecimalString() {
        byte[] data = "10.10.10.10".getBytes();
        String result = DataConverters.getByteArrayDottedDecimalString(data, 0, false, data.length);
        assertThat(result, is("49.48.46.49.48.46.49.48.46.49.48"));
    }

    @Test
    public void testGetString_NoValidityByte() {
        testGetString(false, word.getBytes(), word);
    }

    @Test
    public void testGetString_ValidityByteSetToNotOK() {
        testGetStringWithValidityByte((byte) 1, null);
    }

    @Test
    public void testGetString_ValidityByteSetToOK() {
        testGetStringWithValidityByte((byte) 0, word);
    }

    private void testGetStringWithValidityByte(byte validityByte, String expectedResult) {
        byte[] wordBytes = word.getBytes();
        int wordLength = wordBytes.length;
        int dataLength = wordLength + 1;
        byte[] data = new byte[dataLength];
        data[0] = validityByte;
        for (int i = 0; i < wordLength; i++) {
            data[i + 1] = wordBytes[i];
        }
        testGetString(true, data, expectedResult);
    }

    private void testGetString(boolean isUseValid, byte[] data, String expectedResult) {
        assertThat(DataConverters.getString(data, 0, isUseValid, word.getBytes().length), is(expectedResult));
    }

    @Test
    public void testgetByteArrayTBCDString() {
        byte[] data = new byte[] { 7, 5, 6, 4 };
        int offset = 0;
        int bytes = 4;
        String result = DataConverters.getByteArrayTBCDString(data, offset, false, bytes);
        assertThat(result, is("70506040"));
    }

    @Test
    public void testgetByteArrayIBCD() {
        byte[] data = new byte[] { 3, 4 };
        int offset = 0;
        int bytes = 2;
        int bits = 16;
        int result = DataConverters.getByteArrayIBCD(data, offset, bytes, bits);
        assertThat(result, is(4030));
    }

    @Test
    public void testgetByteArray3GPPString_EmptyWord() {
        getGetByteArray3GPPString("", null);
    }

    @Test
    public void testgetByteArray3GPPString_ValidWord() {
        getGetByteArray3GPPString("a", "a");
    }

    private void getGetByteArray3GPPString(String wordToEncode, String expectedResult) {
        byte[] wordInBytes = wordToEncode.getBytes();
        List<Byte> inputString = new ArrayList<Byte>();
        inputString.add((byte) wordInBytes.length); //length of word
        for (Byte element : wordInBytes) {
            inputString.add(element);
        }

        byte[] data = new byte[inputString.size()];
        for (int i = 0; i < inputString.size(); i++) {
            data[i] = inputString.get(i);
        }

        String result = DataConverters.getByteArray3GPPString(data, 0, false, data.length);
        assertThat(result, is(expectedResult));

    }

    @Test
    public void testgetByteArray_NoValidityByte() {
        getGetByteArray(new byte[] { 0, 1, 2, 3 }, false, new byte[] { 1, 2, 3 });
    }

    @Test
    public void testgetByteArray_ValidityByteSetToNotOK() {
        getGetByteArray(new byte[] { 0, 1, 1, 2, 3 }, true, new byte[] {});
    }

    @Test
    public void testgetByteArray_ValidityByteSetToOK() {
        getGetByteArray(new byte[] { 0, 0, 1, 2, 3 }, true, new byte[] { 1, 2, 3 });
    }

    private void getGetByteArray(byte[] data, boolean isUseValid, byte[] expectedResult) {
        byte[] result = DataConverters.getByteArray(data, 1, isUseValid, 3);
        assertThat(result, is(expectedResult));
    }

    @Test
    public void testgetByteArrayHexString() {
        String result = DataConverters.getByteArrayHexString(new byte[] { 1, 2, 3 }, 1, 2);
        assertThat(result, is("0203"));
    }

    @Test
    public void testgetByteArrayDouble_ValidityByteSetToOK() {
        getGetDoubleWithValidityByte((byte) 0, SAMPLE_DOUBLE);
    }

    @Test
    public void testgetByteArrayDouble_ValidityByteSetToNotOK() {
        getGetDoubleWithValidityByte((byte) 1, DefaultValues.DEFAULT_DOUBLE_VALUE);
    }

    private void getGetDoubleWithValidityByte(byte validityByte, double expectedResult) {
        double result = DataConverters.getDouble(new byte[] { 1, validityByte, 65, 37, 0, 0, 5, 6, 7, 8 }, 1, true, 8);
        assertThat(result, is(expectedResult));
    }

    @Test
    public void testgetByteArrayDouble_NoValidityByte() {
        double result = DataConverters.getDouble(new byte[] { 1, 65, 37, 0, 0, 5, 6, 7, 8 }, 1, false, 8);
        assertThat(result, is(688128.0098116109));
    }

    @Test
    public void testGetBoolean_NoValidityByte() {
        testGetBoolean(false);
    }

    @Test
    public void testGetBoolean_ValidityByteSetTo1() {
        testGetBooleanWithValidityByte((byte) 1, (byte) 0, false);
    }

    @Test
    public void testGetBoolean_ValidityByteSetTo0() {
        testGetBooleanWithValidityByte((byte) 0, (byte) 0, true);
    }

    private void testGetBooleanWithValidityByte(byte validityByte, byte data, boolean expectedResult) {
        boolean result = DataConverters.getBoolean(new byte[] { 0, 0, validityByte, data }, 2, true, 1);
        assertThat(result, is(expectedResult));

    }

    private void testGetBoolean(boolean isUseValid) {
        boolean result = DataConverters.getBoolean(new byte[] { 0, 0, 1 }, 2, isUseValid, 1);
        assertThat(result, is(false));
    }

    @Test
    public void testgetByteArrayInteger_Unsigned() {
        testGetByteArrayInteger(false, 4286545925L);
    }

    @Test
    public void testgetByteArrayInteger_Signed() {
        testGetByteArrayInteger(true, -8421371L);
    }

    private void testGetByteArrayInteger(boolean signed, long expectedResult) {
        long result = DataConverters.getByteArrayInteger(new byte[] { 0, 1, (byte) 255, 127, (byte) 128, 5 }, 2, 4,
                signed);
        assertThat(result, is(expectedResult));
    }

    @Test
    public void testGetByteArrayUnsignedInteger_WithValidityByteSetToOK() {
        testGetByteArrayUnsignedInteger(true, (byte) 0, 1029);
    }

    @Test
    public void testGetByteArrayUnsignedInteger_WithValidityByteSetToNotOK() {
        testGetByteArrayUnsignedInteger(true, (byte) 1, DefaultValues.DEFAULT_INT_VALUE);
    }

    @Test
    public void testGetByteArrayUnsignedInteger_NoValidityByte() {
        int result = DataConverters.getUnsignedIntegerAsInteger(new byte[] { 0, 1, 0, 0, 4, 5 }, 2, false, 4);
        assertThat(result, is(1029));

    }

    private void testGetByteArrayUnsignedInteger(boolean isUseValid, byte validityByte, int expectedResult) {
        int result = DataConverters.getUnsignedIntegerAsInteger(new byte[] { 0, 1, validityByte, 0, 0, 4, 5 }, 2,
                isUseValid, 4);
        assertThat(result, is(expectedResult));
    }

}
