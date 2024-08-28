/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2013 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.datagen.utils;

/**
 * @author eikrwaq
 * @since 2013
 *
 */
public abstract class RopTimeList {

    abstract public boolean hasMoreRopsToProcess();

    abstract public String getNextRopToProcess();
}
