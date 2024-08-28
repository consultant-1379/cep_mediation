/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2013
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/

package com.ericsson.cepmediation.test.tools.calculators;

public class RscpMappingForTest {

    public static final int[] RSCPs = new int[92];
    static {
        int value = -116;
        for (int i = 0; i < RSCPs.length; i++) {
            RSCPs[i] = value;
            value = value + 1;
        }
    }

    public static int getMappedRscp(final int index) {
        if (0 <= index && index < RSCPs.length) {
            return RSCPs[index];
        }
        if (-5 <= index && index < 0) {
            return (RSCPs[0] + index);
        }
        if (index < -5) {
            return (RSCPs[0] - 5);
        }
        return RSCPs[RSCPs.length - 1];
    }

    public static void main(String[] args) {
        int mappedRscp = getMappedRscp(13);
        System.out.println(mappedRscp);
    }

}
