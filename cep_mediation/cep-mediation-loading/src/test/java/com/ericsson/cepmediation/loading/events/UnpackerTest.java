/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.events;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

import com.ericsson.cepmediation.base.meta.schema.Event;
import com.ericsson.cepmediation.base.meta.schema.EventParameter;
import com.ericsson.cepmediation.base.util.DataConverters;

/**
 * @author eemecoy
 *
 */
public class UnpackerTest {

    private Event event;

    private Unpacker unpacker;

    @Test
    public void testUnpackingByte() {
        int numberBytes = 8;
        byte[] unpackedData = testUnpackingData(numberBytes, 64);
        byte result = DataConverters.getByte(unpackedData, 0, true, numberBytes);
        assertThat(result, is((byte) 2));
    }

    @Test
    public void testUnpackingInt() {
        int numberBytes = 2;
        byte[] unpackedData = testUnpackingData(numberBytes, 16);
        int result = DataConverters.getUnsignedIntegerAsInteger(unpackedData, 0, true, numberBytes);
        assertThat(result, is(514));
    }

    @Test
    public void testUnpackingShort() {
        int numberBytes = 2;
        byte[] unpackedData = testUnpackingData(numberBytes, 11);
        short result = DataConverters.getShort(unpackedData, 0, false, numberBytes);
        assertThat(result, is((short) 0));
    }

    @Test
    public void testUnpackingString() {
        int numberBytes = 8;
        byte[] unpackedData = testUnpackingData(numberBytes, 60);
        String result = DataConverters.getByteArrayHexString(unpackedData, 0, numberBytes);
        assertThat(result, is("0000202020202020"));
    }

    private byte[] testUnpackingData(int numberBytes, int numberBits) {
        setUpMocks(numberBytes, numberBits);
        byte[] data = createData(numberBytes + 1);
        return unpacker.unpack(data);
    }

    private byte[] createData(int numberBytes) {
        byte[] invalidData = new byte[numberBytes];
        for (int i = 0; i < numberBytes; i++) {
            invalidData[i] = 1;
        }
        return invalidData;
    }

    private void setUpMocks(int numberBytes, int numberBits) {
        List<EventParameter> parameters = new ArrayList<EventParameter>();
        EventParameter eventParameter = mock(EventParameter.class);
        parameters.add(eventParameter);
        when(eventParameter.getNumberOfBytes()).thenReturn(numberBytes);
        when(eventParameter.getNumberOfBits()).thenReturn(numberBits);
        when(eventParameter.isUseValid()).thenReturn(true);
        event = mock(Event.class);
        when(event.getParameterList()).thenReturn(parameters);
        when(event.getLength()).thenReturn(numberBytes + 1);
        unpacker = new Unpacker(event, new HashSet<Integer>());
    }

}
