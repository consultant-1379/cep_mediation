/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2013 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh;

import com.ericsson.eniq.events.cepmediation.datagen_precook.common.DatagenProperties;

/**
 * @author eeikonl
 * @since 2013
 *
 */
public class GpehPreparserConstants {
    /**
     * Our event rate generates ~500K data per file. This constant is the number of Mb needed to bring the file size 
     * up to the max per mc.
     */
    public static final int NUMBER_OF_EXTRA_MB_PER_MC = 14;

    public static final String ZERO = "0";

    public static final String LINK_RECORD_PREFIX = "p9";

    public static final int LINK_RECORD_LENGTH = 7;

    public static final int NUMBER_EVENTS_PER_MB = DatagenProperties.getInstance().getNumberOfEventsPerMb();
}
