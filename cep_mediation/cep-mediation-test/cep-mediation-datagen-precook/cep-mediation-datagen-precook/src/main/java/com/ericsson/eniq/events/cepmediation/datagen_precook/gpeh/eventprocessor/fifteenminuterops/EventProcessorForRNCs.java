/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2013 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.eventprocessor.fifteenminuterops;

import static com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.GpehPreparserConstants.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import org.slf4j.Logger;

import com.ericsson.cepmediation.apeventbeans.gpeh_11b_12a.INTERNAL_UE_MOVE;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.meta.schema.Event;
import com.ericsson.eniq.events.cepmediation.datagen_precook.common.DatagenProperties;
import com.ericsson.eniq.events.cepmediation.datagen_precook.common.RncType;
import com.ericsson.eniq.events.cepmediation.datagen_precook.common.XGPEHFooterRecord;
import com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.GpehFileProcessor;
import com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.eventprocessor.EventProcessor;
import com.ericsson.eniq.events.cepmediation.datagen_precook.utils.ArrayChopper;
import com.ericsson.eniq.events.cepmediation.datagen_precook.utils.RandomIMSIGenerator;
import com.ericsson.eniq.events.cepmediation.datagen_precook.utils.uecontext.RandomUeContextMoudleIDGenerator;
import com.ericsson.eniq.events.cepmediation.datagen_precook.utils.uecontext.UeContextModuleID;

/**
 * @author eikrwaq
 * @since 2013
 *
 */
public abstract class EventProcessorForRNCs implements EventProcessor {
    protected static Logger logger;

    protected ArrayList<ApEventBean> eventBufferList;

    final Set<String> interestingEvents = DatagenProperties.getInstance().getInterestingEvents();

    private int numberOfLinkFilesRequired = DatagenProperties.getInstance().getType().getNumOfFiles();

    protected ArrayList<ApEventBean> dummyEventList;

    protected ArrayList<ApEventBean> imsisForLastMpList;

    protected ArrayList<ApEventBean> eventsToWriteToFile;

    private String currentFileName;

    private Map<Integer, Event> id2event;

    private int eventRecordType;

    private XGPEHFooterRecord footer = null;

    private List<Future<?>> completed;

    protected HashSet<UeContextModuleID> ueContextModuleIDtoProcess;

    Future<?> future = null;

    private ExecutorService executor;

    private final RncType type = DatagenProperties.getInstance().getType();

    private final int numberOfMCsPerFile = type.getNumOfMcs();

    protected RandomIMSIGenerator randomIMSIGenerator;

    protected RandomUeContextMoudleIDGenerator ueContextGen;

    private final int numberOFDummyEventsneededperfile = (NUMBER_EVENTS_PER_MB * NUMBER_OF_EXTRA_MB_PER_MC
            * numberOfMCsPerFile * numberOfLinkFilesRequired)
            / (numberOfLinkFilesRequired - 1);

    /* (non-Javadoc)
     * @see com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.EventProcessor#processEvents(java.util.ArrayList, java.util.Map, int, java.lang.String, com.ericsson.eniq.events.cepmediation.datagen_precook.common.XGPEHFooterRecord, java.util.List, java.util.HashSet)
     */
    @SuppressWarnings("hiding")
    public void processEvents(final ArrayList<ApEventBean> eventBufferList, final Map<Integer, Event> id2event,
            final int eventRecordType, final String currentFileName, final XGPEHFooterRecord footer,
            final List<Future<?>> completed, final HashSet<UeContextModuleID> ueContextModuleIDtoKeep,
            final ExecutorService executor, final RandomIMSIGenerator randomIMSIGenerator,
            final RandomUeContextMoudleIDGenerator ueContextGen) {
        this.eventBufferList = eventBufferList;
        this.id2event = id2event;
        this.eventRecordType = eventRecordType;
        this.currentFileName = currentFileName;
        this.footer = footer;
        this.completed = completed;
        this.ueContextModuleIDtoProcess = ueContextModuleIDtoKeep;
        this.executor = executor;
        this.randomIMSIGenerator = randomIMSIGenerator;
        this.ueContextGen = ueContextGen;

        eventsToWriteToFile = new ArrayList<ApEventBean>();

        imsisForLastMpList = new ArrayList<ApEventBean>();

        dummyEventList = new ArrayList<ApEventBean>();
        
        logger.debug("Proccessing Events");

        for (final ApEventBean event : eventBufferList) {
            processEvents(event);
        }

        //add Dummy event 
        dummyEventList.add(getDummyEvent());

        logger.debug("Finished proccessing Events");
        logger.debug("Processing : " + eventsToWriteToFile.size() + " and imsis " + imsisForLastMpList.size());

        writeEventsToFile();

        createLastMpFile();

        //clear the all arrays for this thread 
        this.imsisForLastMpList = null;
        this.eventsToWriteToFile = null;
        this.eventBufferList = null;
        this.dummyEventList = null;

    }

        
    protected abstract void processEvents(final ApEventBean events);
    
    private ApEventBean getDummyEvent() {
        INTERNAL_UE_MOVE internal_UE_MOVE = new INTERNAL_UE_MOVE();
        internal_UE_MOVE.setEventId((short) 417);
        internal_UE_MOVE.setEVENT_ID((short) 417);
        return internal_UE_MOVE;
    }

    /**
     * 
     */
    private void createLastMpFile() {

        // create Mp15
        if (imsisForLastMpList.size() > 0) {
            logger.debug("writing : " + imsisForLastMpList.size() + " events, in Mp15");

            final String filename = currentFileName.replaceAll("\\^*Mp[0-9]+",
                    "Mp" + Integer.toString(numberOfLinkFilesRequired));
            future = executor.submit(new GpehFileProcessor(filename, id2event, imsisForLastMpList,
                    new ArrayList<ApEventBean>(), eventRecordType, footer, numberOFDummyEventsneededperfile, true));
            completed.add(future);
        }
    }

    /**
     * 
     */
    private void writeEventsToFile() {
        if (eventsToWriteToFile.size() > 0) {

            logger.debug("writing : " + eventsToWriteToFile.size() + " events, in " + (numberOfLinkFilesRequired - 1)
                    + " files");

            // Divide the array of all events into no of files required excluding Mp15
            final ArrayList<ArrayList<ApEventBean>> parts = (new ArrayChopper()).choptheArray(eventsToWriteToFile,
                    (numberOfLinkFilesRequired - 1));

            // exclude MP0
            int mpNumber = 1;
            for (final ArrayList<ApEventBean> arrayList2 : parts) {
                if (parts.size() < numberOfLinkFilesRequired) {
                    final ArrayList<ApEventBean> arrayList = arrayList2;

                    final String filename = currentFileName.replaceAll("\\^*Mp[0-9]+",
                            "Mp" + Integer.toString(mpNumber));
                    logger.debug("starting thread to create file " + filename);
                    future = executor.submit(new GpehFileProcessor(filename, id2event, arrayList, dummyEventList,
                            eventRecordType, footer, numberOFDummyEventsneededperfile, false));
                    completed.add(future);
                }
                mpNumber++;
            }
        }

    }
}
