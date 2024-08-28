/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2013 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.eventprocessor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.meta.schema.Event;
import com.ericsson.eniq.events.cepmediation.datagen_precook.common.XGPEHFooterRecord;
import com.ericsson.eniq.events.cepmediation.datagen_precook.utils.RandomIMSIGenerator;
import com.ericsson.eniq.events.cepmediation.datagen_precook.utils.uecontext.RandomUeContextMoudleIDGenerator;
import com.ericsson.eniq.events.cepmediation.datagen_precook.utils.uecontext.UeContextModuleID;

/**
 * @author eikrwaq
 * @since 2013
 *
 */
public interface EventProcessor {
    public void processEvents(final ArrayList<ApEventBean> eventBufferList, final Map<Integer, Event> id2event,
            final int eventRecordType, final String currentFileName, final XGPEHFooterRecord footer,
            final List<Future<?>> completed, final HashSet<UeContextModuleID> ueContextModuleIDtoKeep,
            final ExecutorService executor, final RandomIMSIGenerator randomIMSIGenerator, final RandomUeContextMoudleIDGenerator ueContextGen);
}
