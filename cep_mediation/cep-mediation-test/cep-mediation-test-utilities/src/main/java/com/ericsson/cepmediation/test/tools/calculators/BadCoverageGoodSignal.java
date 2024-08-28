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
public class BadCoverageGoodSignal implements CoverageSignal {

    @Override
    public boolean fitsCriteria(final float mappedEcno, final float mappedRscp, final int ecnoThreshold, final int rscpThreshold) {
        return mappedEcno >= ecnoThreshold && mappedRscp < rscpThreshold;
    }

}
