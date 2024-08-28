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
public class RRCMeasurementEcnoRscp {
    private int rscp;

    private int ecno;

    private boolean isForServingCell;

    /**
     * @return the rscp
     */
    public int getRscp() {
        return rscp;
    }

    /**
     * @param rscp the rscp to set
     */
    public void setRscp(final int rscp) {
        this.rscp = rscp;
    }

    /**
     * @return the ecno
     */
    public int getEcno() {
        return ecno;
    }

    /**
     * @param ecno the ecno to set
     */
    public void setEcno(final int ecno) {
        this.ecno = ecno;
    }

    /**
     * @return the isForServingCell
     */
    public boolean isForServingCell() {
        return isForServingCell;
    }

    /**
     * @param isForServingCell the isForServingCell to set
     */
    public void setForServingCell(final boolean isForServingCell) {
        this.isForServingCell = isForServingCell;
    }
}
