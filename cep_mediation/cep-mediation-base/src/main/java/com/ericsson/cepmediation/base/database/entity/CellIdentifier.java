/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.database.entity;

/**
 * Holder for cell id and its corresponding rnc id
 * 
 * @author eemecoy
 *
 */
public class CellIdentifier {

    private int rncId = -1;

    private int cellId = -1;

    /**
     * To distinguish between gpeh hashid lookup and user plane hashid lookup
     * 
     */
    private boolean isRaw = false;

    private byte rat = -1;

    private String mcc = null;

    private String mnc = null;

    private int lac = -1;

    private int access_area_id = -1;

    /**
     * @return the rncId
     */
    public int getRncId() {
        return rncId;
    }

    /**
     * @param rncId the rncId to set
     */
    public void setRncId(final int rncId) {
        this.rncId = rncId;
    }

    /**
     * @return the cellId
     */
    public int getCellId() {
        return cellId;
    }

    /**
     * @param cellId the cellId to set
     */
    public void setCellId(final int cellId) {
        this.cellId = cellId;
    }

    @Override
    public int hashCode() {

        int hash = 1;

        if (isRaw()) {

            if (mcc != null) {
                hash = hash * 17 + mcc.hashCode();
            }

            if (mnc != null) {
                hash = hash * 13 + mnc.hashCode();

            }

            hash = hash + access_area_id * 11 + lac * 7 + rat;

        }

        else {

            hash = (rncId * 31) ^ cellId;

        }

        return hash;

    }

    @Override
    public boolean equals(final Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }

        final CellIdentifier otherCellIdentifer = (CellIdentifier) other;

        //raw identifiers
        if (isRaw()) {

            //check whether mcc/mnc are nullable
            if (mcc == null || mnc == null) {
                return false;
            }

            return this.rat == otherCellIdentifer.getRat() && this.mcc.equals(otherCellIdentifer.getMcc())
                    && this.mnc.equals(otherCellIdentifer.getMnc()) && this.lac == otherCellIdentifer.getLac()
                    && this.access_area_id == otherCellIdentifer.getAccess_area_id();

        }
        return this.rncId == otherCellIdentifer.rncId && this.cellId == otherCellIdentifer.cellId;

    }

    @Override
    public String toString() {

        return "CellIdentifier [rncId=" + rncId + ", cellId=" + cellId + ",RAT=" + rat + ",MCC=" + mcc + ",MNC=" + mnc
                + ",LAC=" + lac + ",access_area_id=" + access_area_id + "]";
    }

    public boolean isRaw() {
        return isRaw;
    }

    public void setRaw(boolean isRaw) {
        this.isRaw = isRaw;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public String getMnc() {
        return mnc;
    }

    public void setMnc(String mnc) {
        this.mnc = mnc;
    }

    public int getLac() {
        return lac;
    }

    public void setLac(int lac) {
        this.lac = lac;
    }

    public int getAccess_area_id() {
        return access_area_id;
    }

    public void setAccess_area_id(int access_area_id) {
        this.access_area_id = access_area_id;
    }

    public byte getRat() {
        return rat;
    }

    public void setRat(byte rat) {
        this.rat = rat;
    }

}