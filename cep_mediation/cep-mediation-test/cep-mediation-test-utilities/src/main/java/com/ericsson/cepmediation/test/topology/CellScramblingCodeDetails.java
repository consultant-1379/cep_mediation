/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.topology;

/**
 * @author eemecoy
 *
 */
public class CellScramblingCodeDetails {

    private int rnc;

    private int cell;

    private int scramblingCode;

    /**
     * @return the rnc
     */
    public int getRnc() {
        return rnc;
    }

    /**
     * @param rnc the rnc to set
     */
    public void setRnc(final int rnc) {
        this.rnc = rnc;
    }

    /**
     * @return the cell
     */
    public int getCell() {
        return cell;
    }

    /**
     * @param cell the cell to set
     */
    public void setCell(final int cell) {
        this.cell = cell;
    }

    /**
     * @return the scramblingCode
     */
    public int getScramblingCode() {
        return scramblingCode;
    }

    /**
     * @param scramblingCode the scramblingCode to set
     */
    public void setScramblingCode(final int scramblingCode) {
        this.scramblingCode = scramblingCode;
    }

    @Override
    public boolean equals(final Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        final CellScramblingCodeDetails otherCellDetails = (CellScramblingCodeDetails) other;
        return otherCellDetails.getRnc() == getRnc() && otherCellDetails.getCell() == getCell() && otherCellDetails.getScramblingCode() == getScramblingCode();

    }

}
