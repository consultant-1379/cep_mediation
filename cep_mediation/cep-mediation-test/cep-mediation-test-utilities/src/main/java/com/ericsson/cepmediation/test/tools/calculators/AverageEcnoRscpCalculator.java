/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.tools.calculators;

import java.util.ArrayList;
import java.util.List;

/**
 * @author eemecoy
 *
 */
public class AverageEcnoRscpCalculator {

    public static float getExpectedEcnoAvg(final List<Integer> ecnos) {
        double ecnoSum = 0;
        int ecnoCount = 0;
        for (final Integer ecno : ecnos) {
            if (ecno != Integer.MIN_VALUE) {
                final float mappedEcno = EcnoMappingForTest.getMappedEcno(ecno);
                final int x = 10;
                final float y = mappedEcno / 10f;
                final double ecnoCalculation = Math.pow(x, y);
                ecnoSum += ecnoCalculation;
                ++ecnoCount;
            }
        }

        if (ecnoCount > 0) {
            final float result = (float) (10 * Math.log10((ecnoSum / ecnoCount)));
            final float roundedResult = (float) Math.round(result * 2) / 2;
            return roundedResult;
        }
        return Integer.MIN_VALUE;
    }

    public static int getExpectedRscpAvg(final List<Integer> rscps) {
        float rscpSum = 0;
        int rscpCount = 0;

        for (final Integer rscp : rscps) {

            if (rscp != Integer.MIN_VALUE) {
                final float mappedRscp = RscpMappingForTest.getMappedRscp(rscp);
                rscpSum += Math.pow(10, (mappedRscp / 10f));
                ++rscpCount;
            }
        }

        final float rscpAvg;
        if (rscpCount > 0) {
            final double log10 = Math.log10(rscpSum / rscpCount);
            rscpAvg = (float) (10 * log10);
        } else {
            rscpAvg = Integer.MIN_VALUE;
        }
        System.out.println("expected rscp average: " + rscpAvg);
        return Math.round(rscpAvg);
    }

    public static float getExpectedEcnoAvgFromListOfMeasurements(final List<RRCMeasurementEcnoRscp> rrcMeasurements) {
        final List<Integer> ecnos = new ArrayList<Integer>();
        for (final RRCMeasurementEcnoRscp rrcMeasurement : rrcMeasurements) {
            if (rrcMeasurement.isForServingCell()) {
                ecnos.add(rrcMeasurement.getEcno());
            }
        }
        return getExpectedEcnoAvg(ecnos);
    }

    public static int getExpectedRscpAvgFromListOfMeasurements(final List<RRCMeasurementEcnoRscp> rrcMeasurements) {
        final List<Integer> rscps = new ArrayList<Integer>();
        for (final RRCMeasurementEcnoRscp rrcMeasurement : rrcMeasurements) {
            if (rrcMeasurement.isForServingCell()) {
                rscps.add(rrcMeasurement.getRscp());
            }

        }

        return getExpectedRscpAvg(rscps);
    }

}
