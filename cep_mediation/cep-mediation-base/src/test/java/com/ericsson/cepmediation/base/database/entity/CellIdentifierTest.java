/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.database.entity;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import com.ericsson.cepmediation.base.database.entity.CellIdentifier;

/**
 * @author eemecoy
 *
 */
public class CellIdentifierTest {

    @Test
    public void testEqualsIfFalseForTheSameObject() {
        final CellIdentifier cellIdentifer = new CellIdentifier();
        assertThat(cellIdentifer.equals(cellIdentifer), is(true));
    }

    @Test
    public void testEqualsIsFalseIfOtherIsNull() {
        final CellIdentifier cellIdentifier = new CellIdentifier();
        assertThat(cellIdentifier.equals(null), is(false));
    }

    @Test
    public void testEqualsIsFalseIfDifferentFields() {
        final CellIdentifier cellIdentifer1 = new CellIdentifier();
        cellIdentifer1.setRncId(45);
        cellIdentifer1.setCellId(37);
        final CellIdentifier cellIdentifier2 = new CellIdentifier();
        cellIdentifier2.setRncId(13);
        cellIdentifier2.setCellId(16);
        assertThat(cellIdentifer1.equals(cellIdentifier2), is(false));

    }

    @Test
    public void testEqualsIsFalseIfSameRncButDifferentCells() {
        final int rncId = 45;
        final CellIdentifier cellIdentifer1 = new CellIdentifier();
        cellIdentifer1.setRncId(rncId);
        cellIdentifer1.setCellId(37);
        final CellIdentifier cellIdentifier2 = new CellIdentifier();
        cellIdentifier2.setRncId(rncId);
        cellIdentifier2.setCellId(16);
        assertThat(cellIdentifer1.equals(cellIdentifier2), is(false));

    }

    @Test
    public void testEqualsIsFalseIfSameCellButDifferentRncs() {
        final int cellId = 17;
        final CellIdentifier cellIdentifer1 = new CellIdentifier();
        cellIdentifer1.setRncId(37);
        cellIdentifer1.setCellId(cellId);
        final CellIdentifier cellIdentifier2 = new CellIdentifier();
        cellIdentifier2.setRncId(2);
        cellIdentifier2.setCellId(cellId);
        assertThat(cellIdentifer1.equals(cellIdentifier2), is(false));
    }

    @Test
    public void testEqualsIsTrueForSameRncAndCell() {
        final int rncId = 45;
        final int cellId = 7;
        final CellIdentifier cellIdentifer1 = new CellIdentifier();
        cellIdentifer1.setRncId(rncId);
        cellIdentifer1.setCellId(cellId);
        final CellIdentifier cellIdentifier2 = new CellIdentifier();
        cellIdentifier2.setRncId(rncId);
        cellIdentifier2.setCellId(cellId);
        assertThat(cellIdentifer1.equals(cellIdentifier2), is(true));

    }

}