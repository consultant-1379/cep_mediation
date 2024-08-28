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
public interface CoverageSignal {

    boolean fitsCriteria(float mappedEcno, float mappedRscp, int ecnoThreshold, int rscpThreshold);

}
