/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.tools.calculators;

/**
 * @author emicned
 *
 */
public class RssiMappingForTest {

    public static final byte[] RSSIs = new byte[64];
    static {
        byte value = 111;
        for (int i = 0; i < RSSIs.length; i++) {
            RSSIs[i] = (byte)(value - i);
        }
    }

    public static byte getMappedRssi(final int index) {
        if (0 <= index && index < RSSIs.length) {
            return RSSIs[index];
        }
        if (index < 0) {

            return RSSIs[0];
        }

        return RSSIs[RSSIs.length - 1];
    }

}
