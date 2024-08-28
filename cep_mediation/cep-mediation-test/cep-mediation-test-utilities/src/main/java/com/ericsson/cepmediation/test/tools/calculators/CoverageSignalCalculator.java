/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.tools.calculators;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import com.ericsson.cepmediation.base.apeventbeans.Asn1Message;
import com.ericsson.cepmediation.test.common.TestConstants;

/**
 * @author eemecoy
 *
 */
public class CoverageSignalCalculator {

    public static int getExpectedGG(final List<RRCMeasurementEcnoRscp> rrcMeasurements) throws Exception {
        return getExpectedValue(rrcMeasurements, GoodCoverageGoodSignal.class);
    }

    private static int getExpectedValue(final List<RRCMeasurementEcnoRscp> rrcMeasurements, final Class<? extends CoverageSignal> coverageSignalCalculatorClass) throws Exception {
        final CoverageSignal coverageSignalCalculator = createInstance(coverageSignalCalculatorClass);
        final int ecnoThreshold = TestConstants.ECNO_THRESHOLD;
        final int rscpThreshold = TestConstants.RSCP_THRESHOLD;
        int count = 0;
        for (final RRCMeasurementEcnoRscp rrcMeasurement : rrcMeasurements) {
            if (rrcMeasurement.isForServingCell() && rscpAndEcnoSet(rrcMeasurement)) {
                final float mappedEcno = EcnoMappingForTest.getMappedEcno(rrcMeasurement.getEcno());
                final float mappedRscp = RscpMappingForTest.getMappedRscp(rrcMeasurement.getRscp());
                if (coverageSignalCalculator.fitsCriteria(mappedEcno, mappedRscp, ecnoThreshold, rscpThreshold)) {
                    count++;
                }
            }

        }
        System.out.println("Expected value for " + coverageSignalCalculator + " is " + count);
        return count;
    }

    private static boolean rscpAndEcnoSet(final RRCMeasurementEcnoRscp rrcMeasurement) {
        return rrcMeasurement.getEcno() != Integer.MIN_VALUE && rrcMeasurement.getRscp() != Integer.MIN_VALUE;
    }

    private static CoverageSignal createInstance(final Class<? extends CoverageSignal> clazz) throws SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException,
            IllegalAccessException, InvocationTargetException {
        final Constructor<? extends CoverageSignal> constructor = clazz.getDeclaredConstructor();
        return constructor.newInstance();
    }

    public static int getExpectedGB(final List<RRCMeasurementEcnoRscp> rrcMeasurements) throws Exception {
        return getExpectedValue(rrcMeasurements, GoodCoverageBadSignal.class);
    }

    public static int getExpectedBG(final List<RRCMeasurementEcnoRscp> rrcMeasurements) throws Exception {
        return getExpectedValue(rrcMeasurements, BadCoverageGoodSignal.class);

    }

    public static int getExpectedBB(final List<RRCMeasurementEcnoRscp> rrcMeasurements) throws Exception {
        return getExpectedValue(rrcMeasurements, BadCoverageBadSignal.class);
    }

    public static void getType(final Asn1Message asn1Message) {
        final List<Class<? extends CoverageSignal>> classes = new ArrayList<Class<? extends CoverageSignal>>();
        classes.add(GoodCoverageGoodSignal.class);
        classes.add(GoodCoverageBadSignal.class);
        classes.add(BadCoverageGoodSignal.class);
        classes.add(BadCoverageBadSignal.class);

    }

}
