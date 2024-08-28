/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.database.entity;

/**
 * @author eemecoy
 *
 */
public class MccMncPair {

    private String mcc;

    private String mnc;

    /**
     * @return the mcc
     */
    public String getMcc() {
        return mcc;
    }

    /**
     * @param mcc the mcc to set
     */
    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    /**
     * @return the mnc
     */
    public String getMnc() {
        return mnc;
    }

    /**
     * @param mnc the mnc to set
     */
    public void setMnc(String mnc) {
        this.mnc = mnc;
    }

}
