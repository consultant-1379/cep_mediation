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

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;
import com.ericsson.cepmediation.base.meta.schema.EventParameter;

public class XDataConverterTest {

    @Test
    public void testSetLong() {
        byte[] data = new byte[] { 0, 0, 0, 0, 1, 2, 3, 4 };
        XDataConverters.setLong(123456L, data, 0, true, 1, null);
        assertThat(data[0], is((byte) 64));
        XDataConverters.setLong(-1L, data, 0, true, 1, null);
        assertThat(data[0], is((byte) 1));
    }

    @Test
    public void testSetDouble() {
        byte[] data = new byte[] { 0, 0, 0, 0, 1, 2, 3, 4, 5 };
        XDataConverters.setDouble(15.99, data, 0, true, 1, null);
        assertThat(data[0], is((byte) 0));
        XDataConverters.setDouble(15.99, data, 0, true, 8, null);
        assertThat(data[0], is((byte) 0));
        XDataConverters.setDouble(0.0D, data, 0, true, 1, null);
        assertThat(data[0], is((byte) 1));
    }

    @Test
    public void testSetUnsignedIntegerAsInteger() {
        byte[] data = new byte[] { 0, 0, 0, 0, 1, 2, 3, 4 };
        XDataConverters.setUnsignedIntegerAsInteger(1599, data, 0, true, 1,
                null);
        assertThat(data[0], is((byte) 0));
        XDataConverters.setUnsignedIntegerAsInteger(
                DefaultValues.DEFAULT_INT_VALUE, data, 0, true, 1, null);
        assertThat(data[0], is((byte) 1));
    }

    @Test
    public void testSetShort() {
        byte[] data = new byte[] { 0, 0, 0, 0, 1, 2, 3, 4 };
        XDataConverters.setShort(1599, data, 0, true, 1, null);
        assertThat(data[0], is((byte) 0));
        XDataConverters.setShort(DefaultValues.DEFAULT_SHORT_VALUE, data, 0,
                true, 1, null);
        assertThat(data[0], is((byte) 1));
    }

    @Test
    public void testSetByte() {
        byte[] data = new byte[] { 0, 0, 0, 0, 1, 2, 3, 4 };
        XDataConverters.setByte(2000, data, 0, true, 1, null);
        assertThat(data[0], is((byte) 0));
        XDataConverters.setByte(DefaultValues.DEFAULT_BYTE_VALUE, data, 0,
                true, 1, null);
        assertThat(data[0], is((byte) 1));
    }

    @Test
    public void testSetString() {
        byte[] data = new byte[] { 0, 0, 0, 0, 1, 2, 3, 4 };
        XDataConverters.setString("100100", data, 0, true, 7, null);
        assertThat(data[0], is((byte) 49));
        XDataConverters.setString(DefaultValues.DEFAULT_STRING_VALUE, data, 0,
                true, 1, null);
        assertThat(data[0], is((byte) 1));
    }

    @Test
    public void testSetByteArrayInteger() {
        byte[] data = new byte[] { 0, 0, 0, 0, 1, 2, 3, 4 };
        XDataConverters.setByteArrayInteger(1400, data, 0, 1, true, null);
        assertThat(data[0], is((byte) 120));
    }

    @Test
    public void testSetByteArrayHexString() {
        byte[] data = new byte[] { 0, 0, 0, 0, 1, 2, 3, 4 };
        XDataConverters.setByteArrayHexString("12A", data, 0, true, 1, null);
        assertThat(data[0], is((byte) 1));
    }

    @Test
    public void testSetByteArray() {
        byte[] data = new byte[] { 0, 0, 0, 0, 1, 2, 3, 4 };
        EventParameter parameter = mock(EventParameter.class);
        when(parameter.isVariableLength()).thenReturn(true);
        XDataConverters.setByteArray(new byte[] { 1, 3, 4 }, data, 0, true, 1,
                parameter);
        assertThat(data[0], is((byte) 0));
        XDataConverters.setByteArray(DefaultValues.DEFAULT_BYTE_ARRAY_VALUE,
                data, 0, true, 1, parameter);
        assertThat(data[0], is((byte) 1));
    }

    @Test
    public void testIsGpeh() {
        boolean returnedValue = XDataConverters.isGpeh();
        assertThat(returnedValue, is(false));
    }

    @Test
    public void testSetByteArray3GPPString() {
        byte[] data = new byte[] { 0, 0, 0, 0, 1, 2, 3, 4 };
        EventParameter parameter = mock(EventParameter.class);
        when(parameter.isVariableLength()).thenReturn(true);
        XDataConverters.setByteArray3GPPString("100100", data, 0, true, 7,
                parameter);
        assertThat(data[0], is((byte) 6));
        XDataConverters
                .setByteArray3GPPString(DefaultValues.DEFAULT_STRING_VALUE,
                        data, 0, true, 1, parameter);
        assertThat(data[0], is((byte) -1));
    }

    @Test
    public void testSetByteArrayIBCD() {
        byte[] data = new byte[] { 0, 0, 0, 0, 1, 2, 3, 4 };
        EventParameter parameter = mock(EventParameter.class);
        when(parameter.isVariableLength()).thenReturn(true);
        XDataConverters.setByteArrayIBCD((short) 10, data, 0, 1, 1, parameter);
        assertThat(data[0], is((byte) 16));
        XDataConverters.setByteArrayIBCD((short) 10, data, 0, 2, 1, parameter);
        assertThat(data[0], is((byte) 15));
        XDataConverters.setByteArrayIBCD(DefaultValues.DEFAULT_SHORT_VALUE,
                data, 0, 1, 1, parameter);
        assertThat(data[0], is((byte) -1));
    }

    @Test
    public void testSetByteArrayTBCDString() {
        byte[] data = new byte[] { 0, 0, 0, 0, 1, 2, 3, 4 };
        EventParameter parameter = mock(EventParameter.class);
        when(parameter.isVariableLength()).thenReturn(true);
        XDataConverters.setByteArrayTBCDString("100100", data, 0, true, 7,
                parameter);
        assertThat(data[0], is((byte) 0));
        XDataConverters
                .setByteArrayTBCDString(DefaultValues.DEFAULT_STRING_VALUE,
                        data, 0, true, 1, parameter);
        assertThat(data[0], is((byte) 1));
    }

    @Test
    public void testSetByteArrayDottedDecimalString() {
        byte[] data = new byte[] { 0, 0, 0, 0, 1, 2, 3, 4 };
        EventParameter parameter = mock(EventParameter.class);
        when(parameter.isVariableLength()).thenReturn(true);
        XDataConverters.setByteArrayDottedDecimalString("100100", data, 0,
                true, 7, parameter);
        assertThat(data[0], is((byte) 4));
        XDataConverters
                .setByteArrayDottedDecimalString(
                        DefaultValues.DEFAULT_STRING_VALUE, data, 0, true, 1,
                        parameter);
        assertThat(data[0], is((byte) -1));
    }
}