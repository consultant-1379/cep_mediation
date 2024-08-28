/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.tools.calculators;

/**
 * @author eemecoy
 *
 */
public class EcnoMappingForTest {

    public static final float[] ECNOs = new float[50];

    static {
        float value = -24.5f;
        for (int i = 0; i < ECNOs.length; i++) {
            ECNOs[i] = value;
            value = value + 0.5f;
        }
    }

    public static float getMappedEcno(final int index) {
        if (0 <= index && index < ECNOs.length) {
            return ECNOs[index];
        }
        if (index < 0) {
            return ECNOs[0];
        }

        return ECNOs[ECNOs.length - 1];
    }

    public static void main(String[] args) {
        float mappedEcno = getMappedEcno(10);
        System.out.println(mappedEcno);
    }

}
