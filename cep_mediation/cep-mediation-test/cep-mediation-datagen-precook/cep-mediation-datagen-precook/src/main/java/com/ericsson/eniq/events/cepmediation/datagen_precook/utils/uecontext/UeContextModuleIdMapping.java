/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2013 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.eniq.events.cepmediation.datagen_precook.utils.uecontext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This is the Initialization on Demand Holder (IODH) idiom (cs.umd.edu/~pugh/java/memoryModel/jsr-133-faq.html#dcl) 
 * and it allows to implement a lazy loaded singleton with zero synchronization overhead.
 * I only include that comment as I hadn't heard of it till recently and thought someone else might find it useful
 * @author eeikonl
 * @since 2013
 *
 */
public class UeContextModuleIdMapping {
    private static final Logger logger = LoggerFactory.getLogger(UeContextModuleIdMapping.class);

    private final Map<UeContextModuleID, List<UeContextModuleID>> mappings;

    private static class SingletonHolder {
        private static final UeContextModuleIdMapping INSTANCE = new UeContextModuleIdMapping();
    }

    public static UeContextModuleIdMapping getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private UeContextModuleIdMapping() {
        mappings = new HashMap<UeContextModuleID, List<UeContextModuleID>>();
    }

    public void addUeContextMapping(final UeContextModuleID oldPair, final UeContextModuleID newPair) {
        if (mappings.containsKey(oldPair)) {
            final List<UeContextModuleID> list = mappings.get(oldPair);
            list.add(newPair);
            mappings.put(oldPair, list);
        } else {
            final List<UeContextModuleID> list = new ArrayList<UeContextModuleID>();
            list.add(newPair);
            mappings.put(oldPair, list);
        }
    }

    public List<UeContextModuleID> getMapping(final UeContextModuleID oldPair) {
        return mappings.get(oldPair);
    }

    public boolean isAlreadyMapped(final UeContextModuleID oldPair) {
        return mappings.containsKey(oldPair);
    }
}
