/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.support;

/**
 * @author eemecoy
 *
 */
public abstract class CellUtil {

    public static int getUnsignedCellId(final int cellId) {
        if (cellId < 0 && cellId != -1) {
            final short value = (short) cellId;
            return value & 0xFFFF;
        }
        return cellId;
    }

}
