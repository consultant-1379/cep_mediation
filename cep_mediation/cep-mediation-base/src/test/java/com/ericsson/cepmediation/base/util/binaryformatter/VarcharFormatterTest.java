package com.ericsson.cepmediation.base.util.binaryformatter;

import static org.junit.Assert.*;

import org.junit.Test;

public class VarcharFormatterTest {

    @Test
    public void testDoFormatForNullString() {
        
        byte[] rets = VarcharFormatter.doFormat(null, 127);
        
        assertEquals("Length of the return array", 128, rets.length);
        
        assertEquals("last byte should be 1", 1, rets[rets.length -1]);
        
    }

}
