/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.beans;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author eemecoy
 *
 */
public class VisitedCellDataTest {

    @Test
    public void testEqualsIsTrueIfObjectsAreSameObject() {
        final VisitedCellData cellData = VisitedCellData.getInstance((short) 0, 0, 0);
        assertThat(cellData.equals(cellData), is(true));
    }

    @Test
    public void testEqualsIsFalseIfOneIsNullAndOtherIsNot() {
        final VisitedCellData cellData = VisitedCellData.getInstance((short) 0, 0, 0L);
        assertThat(cellData.equals(null), is(false));
    }

    @Test
    public void testEqualsIsFalseIfObjectsHaveDifferentClasses() {
        final VisitedCellData cellData = VisitedCellData.getInstance((short) 0, 0, 0L);
        assertThat(cellData.equals("3"), is(false));
    }

    @Test
    public void testEqualsIsFalseIfCellIdsDifferent() {
        final VisitedCellData a = VisitedCellData.getInstance((short) 0, 0, 0L);
        final VisitedCellData b = VisitedCellData.getInstance((short) 0, 1, 0L);
        assertThat(a.equals(b), is(false));
    }

    @Test
    public void testEqualsIsFalseIfRncIdsDifferent() {
        final VisitedCellData a = VisitedCellData.getInstance((short) 0, 0, 0L);
        final VisitedCellData b = VisitedCellData.getInstance((short) 1, 0, 0L);
        assertThat(a.equals(b), is(false));
    }

    @Test
    public void testEqualsIsTrueIfAllFieldsSame() {
        final VisitedCellData a = VisitedCellData.getInstance((short) 0, 0, 0L);
        final VisitedCellData b = VisitedCellData.getInstance((short) 0, 0, 0L);
        assertThat(a.equals(b), is(true));
    }

    @Test
    public void testEqualsIsFalseIfTimestampForComparisonDifferent() {
        final VisitedCellData a = VisitedCellData.getInstance((short) 0, (short) 0, 123456L);
        final VisitedCellData b = VisitedCellData.getInstance((short) 0, (short) 0, 123456999L);
        assertThat(a.equals(b), is(false));
    }

}
