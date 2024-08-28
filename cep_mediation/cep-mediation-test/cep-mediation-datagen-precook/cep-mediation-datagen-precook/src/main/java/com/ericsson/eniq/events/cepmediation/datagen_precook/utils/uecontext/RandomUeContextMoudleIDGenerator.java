/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2013 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.eniq.events.cepmediation.datagen_precook.utils.uecontext;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author eikrwaq
 * @since 2013
 *
 */

public class RandomUeContextMoudleIDGenerator {

    /**
     * create unique uecontext and module ids list
     */
    public static final int MAX_NO_OF_UNIQUE_UECONTEXT_MODULE_ID_SET_AVAILABLE = 1845250;

    private static final int MIN_VAL_UECONTEXT_TO_USE = 8000;

    private static final int MAX_VAL_UECONTEXT_TO_USE = 32766;

    private static final int MIN_VAL_MODULE_ID_TO_USE = 0;

    private static final int MAX_VAL_MODULE_ID_TO_USE = 63;

    private final List<UeContextModuleID> uniquepool;

    Random random;

    public RandomUeContextMoudleIDGenerator(final int maxval) {
        if (maxval > MAX_NO_OF_UNIQUE_UECONTEXT_MODULE_ID_SET_AVAILABLE) {
            throw new IllegalArgumentException("Max value should be less than "
                    + MAX_NO_OF_UNIQUE_UECONTEXT_MODULE_ID_SET_AVAILABLE);
        }
        random = new Random();
        uniquepool = new ArrayList<UeContextModuleID>();
        for (int i = MIN_VAL_UECONTEXT_TO_USE; i < MAX_VAL_UECONTEXT_TO_USE; i++) {
            for (int j = MIN_VAL_MODULE_ID_TO_USE; j < MAX_VAL_MODULE_ID_TO_USE; j++) {
                final UeContextModuleID unique = new UeContextModuleID((short) i, j);
                uniquepool.add(unique);
                if (uniquepool.size() == maxval) {
                    i = MAX_VAL_UECONTEXT_TO_USE;
                    j = MAX_VAL_MODULE_ID_TO_USE;
                }
            }
        }
    }

    /**
     * @return
     */
    public UeContextModuleID getUniqueUeContextMoudleID() {
        try {
            if (uniquepool.size() > 0) {
                final int randomIndex = random.nextInt(uniquepool.size());
                final UeContextModuleID uniquePair = uniquepool.get(randomIndex);
                uniquepool.remove(randomIndex);
                return uniquePair;
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
