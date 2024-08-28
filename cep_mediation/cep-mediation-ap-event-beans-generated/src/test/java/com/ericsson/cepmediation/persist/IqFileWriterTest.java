/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.persist;

import static org.mockito.Mockito.*;

import java.io.IOException;
import java.io.OutputStream;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;

/**
 * @author eemecoy
 *
 */
public class IqFileWriterTest {

    private OutputStream mockedOutputStream;

    @Before
    public void setup() {
        mockedOutputStream = mock(OutputStream.class);
    }

    @Test
    public void testWriteValidTinyint() throws IOException {
        testWritingTinyInt((byte) 2, new byte[] { 2, 0 });
    }

    @Test
    public void testWritingTinyintWithDefaultValueWritesNullToDB() throws IOException {
        testWritingTinyInt(DefaultValues.DEFAULT_BYTE_VALUE, getByteArrayForNull(2));
    }

    private byte[] getByteArrayForNull(int lengthOfByteArray) {
        byte[] nullByteArray = new byte[lengthOfByteArray];
        for (int i = 0; i < nullByteArray.length; i++) {
            nullByteArray[i] = 0;
        }
        nullByteArray[lengthOfByteArray - 1] = 1;
        return nullByteArray;
    }

    private void testWritingTinyInt(byte value, byte[] expectedByteArray) throws IOException {
        IqFileWriter.writeTinyint(mockedOutputStream, value);
        verifyByteArrayWrittenToDB(expectedByteArray);
    }

    @Test
    public void testWriteSmallInt() throws IOException {
        IqFileWriter.writeSmallint(mockedOutputStream, (short) 1);
        byte[] expectedByteArray = new byte[] { 1, 0, 0 };
        verifyByteArrayWrittenToDB(expectedByteArray);
    }

    private void verifyByteArrayWrittenToDB(byte[] expectedByteArray) throws IOException {
        verify(mockedOutputStream).write(expectedByteArray);
    }

    @Test
    public void testWriteSmallIntMinusOneWritesNullToDB() throws IOException {
        IqFileWriter.writeSmallint(mockedOutputStream, DefaultValues.DEFAULT_SHORT_VALUE);
        byte[] expectedByteArray = new byte[] { 0, 0, 1 };
        verifyByteArrayWrittenToDB(expectedByteArray);
    }

    @Test
    public void testWriteDefaultFloatValueWritesNullToDB() throws IOException {
        IqFileWriter.writeFloat(mockedOutputStream, DefaultValues.DEFAULT_FLOAT_VALUE);
        byte[] expectedByteArray = new byte[] { 0, 0, 0, 0, 1 };
        verifyByteArrayWrittenToDB(expectedByteArray);
    }

    @Test
    public void testWriteFloatOfMinusOneWritesMinusOneToDB() throws IOException {
        IqFileWriter.writeFloat(mockedOutputStream, -1);
        byte[] expectedByteArray = new byte[] { 0, 0, -128, -65, 0 };
        verifyByteArrayWrittenToDB(expectedByteArray);
    }

    @Test
    public void testWriteFloat() throws IOException {
        IqFileWriter.writeFloat(mockedOutputStream, 3);
        byte[] expectedByteArray = new byte[] { 0, 0, 64, 64, 0 };
        verifyByteArrayWrittenToDB(expectedByteArray);
    }

}
