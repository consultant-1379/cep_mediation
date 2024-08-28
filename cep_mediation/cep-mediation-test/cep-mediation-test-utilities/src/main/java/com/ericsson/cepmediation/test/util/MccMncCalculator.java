/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.util;

/**
 * @author eemecoy
 *
 */
public class MccMncCalculator {

    public static String getMncForIMSI(long imsi) {
        String imsiAsString = Long.toString(imsi);
        return imsiAsString.substring(3, 5);
    }

    public static String getMccForIMSI(long imsi) {
        String imsiAsString = Long.toString(imsi);
        return imsiAsString.substring(0, 3);
    }

}
