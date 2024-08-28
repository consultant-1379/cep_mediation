/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2013 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.eventprocessor.oneminrops;

import static com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.GpehPreparserConstants.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;


import com.ericsson.cepmediation.apeventbeans.gpeh_11b_12a.INTERNAL_UE_MOVE;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.meta.schema.Event;
import com.ericsson.cepmediation.correlation.support.TimeOnlyApEventBeanComparator;
import com.ericsson.eniq.events.cepmediation.datagen_precook.common.DatagenProperties;
import com.ericsson.eniq.events.cepmediation.datagen_precook.common.RncType;
import com.ericsson.eniq.events.cepmediation.datagen_precook.common.XGPEHFooterRecord;
import com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.GpehFileProcessor;
import com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.eventprocessor.EventProcessor;
//import com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.eventprocessor.fifteenminuterops.INTERNAL_UE_MOVE;
import com.ericsson.eniq.events.cepmediation.datagen_precook.utils.ArrayChopper;
import com.ericsson.eniq.events.cepmediation.datagen_precook.utils.RandomIMSIGenerator;
import com.ericsson.eniq.events.cepmediation.datagen_precook.utils.uecontext.RandomUeContextMoudleIDGenerator;
import com.ericsson.eniq.events.cepmediation.datagen_precook.utils.uecontext.UeContextModuleID;

/**
 * @author eikrwaq
 * @since 2013
 *
 */
public abstract class EventProcessorForRNCs_1MinRop implements EventProcessor {

    private static final int MILIS_IN_ONE_MINUTE = 60000;

    protected static Logger logger;

    protected ArrayList<ApEventBean> eventBufferList;

    final Set<String> interestingEvents = DatagenProperties.getInstance().getInterestingEvents();

    private final int numberOfLinkFilesRequired = DatagenProperties.getInstance().getType().getNumOfFiles();

    protected ArrayList<ApEventBean> dummyEventList;

    protected ArrayList<ApEventBean> imsisForLastMpList;

    protected ArrayList<ApEventBean> eventsToWriteToFile;

    private String currentFileName;

    private Map<Integer, Event> id2event;

    private int eventRecordType;

    private XGPEHFooterRecord[] footer = null;

    private List<Future<?>> completed;

    protected HashSet<UeContextModuleID> ueContextModuleIDtoProcess;

    private OneMinuteRopFileNames oneMinuteList;

    Future<?> future = null;

    private static final RncType type = DatagenProperties.getInstance().getType();

    private final int numberOfMCsPerFile = type.getNumOfMcs();

    private ExecutorService executor;

    protected RandomIMSIGenerator randomIMSIGenerator;

    protected RandomUeContextMoudleIDGenerator ueContextGen;

    private final int numberOFDummyEventsneededperfile = (NUMBER_EVENTS_PER_MB * NUMBER_OF_EXTRA_MB_PER_MC
            * numberOfMCsPerFile * numberOfLinkFilesRequired)
            / ((numberOfLinkFilesRequired - 1) * 15);

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
        this.footer = generateFooter(footer);
        this.completed = completed;
        this.ueContextModuleIDtoProcess = ueContextModuleIDtoKeep;
        this.oneMinuteList = new OneMinuteRopFileNames();
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

        logger.debug("Finished proccessing Events");
        
        dummyEventList.add(getDummyEvent());

        writeEventsToFile();

        createLastMpFile();

        //clear the bufferlist
        this.eventBufferList = new ArrayList<ApEventBean>();
        //clear the array 
        this.imsisForLastMpList = new ArrayList<ApEventBean>();

        //clear the array 
        this.eventsToWriteToFile = new ArrayList<ApEventBean>();
    }
    
    private ApEventBean getDummyEvent() {
        INTERNAL_UE_MOVE internal_UE_MOVE = new INTERNAL_UE_MOVE();
        internal_UE_MOVE.setEventId((short) 417);
        internal_UE_MOVE.setEVENT_ID((short) 417);
        return internal_UE_MOVE;
    }
    

    /**
     * @param footer2
     * @return
     */
    private XGPEHFooterRecord[] generateFooter(final XGPEHFooterRecord footer2) {
        final XGPEHFooterRecord[] footers = new XGPEHFooterRecord[15];
        final int currentHour = getHourFromFileName(currentFileName);
        for (int x = 0; x < 15; x++) {
            footers[x] = new XGPEHFooterRecord(footer2.getYear(), footer2.getMonth(), footer2.getDay(), currentHour,
                    x + 1, footer2.getSecond());

        }
        return footers;
    }

    /**
     * @param fileName 
     * @return
     */
    protected int getHourFromFileName(final String fileName) {
        final Pattern pattern = Pattern.compile("^A\\d*\\.(\\d\\d).*");
        final Matcher matcher = pattern.matcher(fileName);

        new ArrayList<String>();
        String hour = "";
        while (matcher.find()) {
            hour = matcher.group(1);
        }
        return Integer.parseInt(hour);
    }

    protected abstract void processEvents(final ApEventBean events);

    /**
     * 
     */
    private void createLastMpFile() {
        if (imsisForLastMpList.size() > 0) {
            logger.info("Processing IMSI Mp File : " + imsisForLastMpList.size());

            long endTime = 0;

            //sort the events
            Collections.sort(imsisForLastMpList, new TimeOnlyApEventBeanComparator());

            //Use the timestamp of the first event as the reference point, it doesn't matter if it isn't accurate.
            long startTime = imsisForLastMpList.get(0).getTimestamp();

            //Use the timestamp of the first event as the reference point, it doesn't matter if it isn't accurate.
            final List<String> fileNames = oneMinuteList.getFileNames(currentFileName);
            for (int x = 0; x < 15; x++) {
                endTime = (x == 14 ? startTime + (5 * MILIS_IN_ONE_MINUTE) : startTime
                        + getJitterInMilliseconds(startTime) + MILIS_IN_ONE_MINUTE);
                final ArrayList<ApEventBean> imsisForThisRop = new ArrayList<ApEventBean>();
                for (final ApEventBean bean : imsisForLastMpList) {
                	if (bean.getTimestamp() >= startTime && bean.getTimestamp() < endTime) {
                        imsisForThisRop.add(bean);
                    }
                }

                logger.debug("writing : " + imsisForThisRop.size() + " events, in " + (numberOfLinkFilesRequired)
                        + " files, to " + fileNames.get(x));

                // create Mp15

                logger.debug("writing : " + imsisForLastMpList.size() + " events, in Mp15");

                final String filename = fileNames.get(x).replaceAll("\\^*Mp[0-9]+",
                        "Mp" + Integer.toString(numberOfLinkFilesRequired));
                future = executor.submit(new GpehFileProcessor(filename, id2event, imsisForThisRop,
                        new ArrayList<ApEventBean>(), eventRecordType, footer[x], numberOFDummyEventsneededperfile,
                        true));
                completed.add(future);

                startTime = endTime;
            }

        }
    }

    /**
     * 
     */
    private void writeEventsToFile() {
        //need to split the eventsToWriteToFile up into 15 1 minute chunks and process each 
        if (eventsToWriteToFile.size() > 0) {
            logger.info("Processing : " + eventsToWriteToFile.size());

            long endTime = 0;

            //sort the events
            Collections.sort(eventsToWriteToFile, new TimeOnlyApEventBeanComparator());

            //Use the timestamp of the first event as the reference point, it doesn't matter if it isn't accurate.
            long startTime = eventsToWriteToFile.get(0).getTimestamp();

            final List<String> fileNames = oneMinuteList.getFileNames(currentFileName);

            for (int x = 0; x < 15; x++) {
                endTime = (x == 14 ? startTime + (5 * MILIS_IN_ONE_MINUTE) : startTime
                        + getJitterInMilliseconds(startTime) + MILIS_IN_ONE_MINUTE);

                final ArrayList<ApEventBean> eventsForThisRop = new ArrayList<ApEventBean>();
                for (final ApEventBean bean : eventsToWriteToFile) {
                    if (bean.getTimestamp() >= startTime && bean.getTimestamp() < endTime) {
                        eventsForThisRop.add(bean);
                    }
                }

                logger.debug("writing : " + eventsForThisRop.size() + " events, in " + (numberOfLinkFilesRequired - 1)
                        + " files, to " + fileNames.get(x));

                // Divide the array of all events into no of files required excluding Mp15
                final ArrayList<ArrayList<ApEventBean>> parts = (new ArrayChopper()).choptheArray(eventsForThisRop,
                        (numberOfLinkFilesRequired - 1));
                int mpNumber = 1;
                for (final ArrayList<ApEventBean> arrayList2 : parts) {
                    if (parts.size() < numberOfLinkFilesRequired) {
                        String filename = fileNames.get(x);
                        filename = filename.replaceAll("\\^*Mp[0-9]+", "Mp" + Integer.toString(mpNumber));
                        future = executor.submit(new GpehFileProcessor(filename, id2event, arrayList2, dummyEventList,
                                eventRecordType, footer[x], numberOFDummyEventsneededperfile, false));
                        completed.add(future);
                    }
                    mpNumber++;
                }
                startTime = endTime;
            }
        }
    }

    /**
     * Retunr a jitter value. Essentially this is to introduce some variation in the event times within our
     * one minute rops so that there isn't a hard cut at 1 minute.
     * The jitter is defined as +/- random value up to 100 milliseconds.
     * @param startTime
     * @return
     */
    private long getJitterInMilliseconds(final long startTime) {
        return (long) (Math.random() * 2 - 1) * 100;
    }
}

                