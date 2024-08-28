/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.util;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author eemecoy
 *
 */
public class PairTest {

    @Test
    public void testEqualsIsTrueIfObjectsAreSameObject() {
        final Pair<Object, Object> pair = new Pair<Object, Object>(null, null);
        assertThat(pair.equals(pair), is(true));
    }

    @Test
    public void testEqualsIsFalseIfParametersIsNull() {
        final Pair<Object, Object> pair = new Pair<Object, Object>(null, null);
        assertThat(pair.equals(null), is(false));
    }

    @Test
    public void testEqualsIsFalseIfObjectsNotOfSameType() {
        final Pair<Object, Object> pair = new Pair<Object, Object>(null, null);
        assertThat(pair.equals(new String()), is(false));
    }

    @Test
    public void testEqualsIsFalseIfFirstIsNullInAAndNotNullInB() {
        final Pair<Object, Object> a = new Pair<Object, Object>(null, null);
        final Pair<Object, Object> b = new Pair<Object, Object>("a", null);
        assertThat(a.equals(b), is(false));
    }

    @Test
    public void testEqualsIsFalseIfSecondIsNullInAAndNotNullInB() {
        final Pair<Object, Object> a = new Pair<Object, Object>(null, null);
        final Pair<Object, Object> b = new Pair<Object, Object>(null, 3);
        assertThat(a.equals(b), is(false));
    }

    @Test
    public void testEqualsIsTrueIfBothFirstsAreNullAndSecondsAreEqual() {
        final DummyObject dummyObject = new DummyObject("aString", 4);
        final Pair<DummyObject, DummyObject> a = new Pair<DummyObject, DummyObject>(null, dummyObject);
        final Pair<DummyObject, DummyObject> b = new Pair<DummyObject, DummyObject>(null, dummyObject);
        assertThat(a.equals(b), is(true));
    }

    @Test
    public void testEqualsIsTrueIfFirstsAreEqualAndBothSecondsAreNull() {
        final DummyObject dummyObject = new DummyObject("aString", 4);
        final Pair<DummyObject, DummyObject> a = new Pair<DummyObject, DummyObject>(dummyObject, null);
        final Pair<DummyObject, DummyObject> b = new Pair<DummyObject, DummyObject>(dummyObject, null);
        assertThat(a.equals(b), is(true));
    }

    @Test
    public void testEqualsIsFalseIfFirstsAreDifferent() {
        final Pair<DummyObject, DummyObject> a = new Pair<DummyObject, DummyObject>(new DummyObject("a", 1), null);
        final Pair<DummyObject, DummyObject> b = new Pair<DummyObject, DummyObject>(new DummyObject("b", 2), null);
        assertThat(a.equals(b), is(false));
    }

    @Test
    public void testEqualsIsFalseIfFirstsEqualsButSecondsNot() {
        final Object sameObject = 3;
        final Pair<Object, DummyObject> a = new Pair<Object, DummyObject>(sameObject, new DummyObject("", 3));
        final Pair<Object, DummyObject> b = new Pair<Object, DummyObject>(sameObject,
                new DummyObject("not the same", 4));
        assertThat(a.equals(b), is(false));
    }

    class DummyObject {

        private final String string;

        private final int number;

        public DummyObject(final String string, final int number) {
            this.string = string;
            this.number = number;
        }

    }

}
