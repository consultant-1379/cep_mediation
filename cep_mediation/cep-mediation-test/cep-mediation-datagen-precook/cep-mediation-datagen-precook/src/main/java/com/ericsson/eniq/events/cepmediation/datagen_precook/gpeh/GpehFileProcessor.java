package com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.meta.schema.Event;
import com.ericsson.cepmediation.correlation.support.TimeOnlyApEventBeanComparator;
import com.ericsson.cepmediation.loading.gpeh.GPEHFooterRecordHandler;
import com.ericsson.eniq.events.cepmediation.datagen_precook.common.DatagenProperties;
import com.ericsson.eniq.events.cepmediation.datagen_precook.common.RncType;
import com.ericsson.eniq.events.cepmediation.datagen_precook.common.XGPEHFooterRecord;
import com.ericsson.eniq.events.cepmediation.datagen_precook.common.XPacker;
import com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.eventprocessor.DummyEvents;
import com.ericsson.eniq.events.cepmediation.datagen_precook.utils.ArrayChopper;

public class GpehFileProcessor extends Thread {

    private final Logger logger = LoggerFactory.getLogger(GpehFileProcessor.class);

    private GpehFileWriter writer;

    private final String filename;

    private final Map<Integer, Event> id2event;

    private ArrayList<ApEventBean> eventsList;

    private final int eventRecordType;

    private XGPEHFooterRecord footer = null;

    private final short footerRecordType;

    private File internalDir = DatagenProperties.getInstance().getIntermediateFileLocation();

    private final RncType type = DatagenProperties.getInstance().getType();

    ArrayList<ApEventBean> dummyEventList;

    final int numberOfDummyEventPerThread;

    final boolean mp15;

    public GpehFileProcessor(final String filename, final Map<Integer, Event> id2event,
            final ArrayList<ApEventBean> eventsList, final ArrayList<ApEventBean> dummyEventList,
            final int eventRecordType, final XGPEHFooterRecord footer, final int numberOfDummyEventPerThread,
            boolean mp15) {
        this.filename = filename;
        this.id2event = id2event;
        this.eventsList = eventsList;
        this.dummyEventList = dummyEventList;
        this.eventRecordType = eventRecordType;
        this.footer = footer;
        footerRecordType = new GPEHFooterRecordHandler().getRecordType();
        this.numberOfDummyEventPerThread = numberOfDummyEventPerThread;
        this.mp15 = mp15;
    }

    @Override
    public void run() {
        try {
            logger.debug("Thread " + Thread.currentThread() + "is running ");
            if (!mp15) {
                processEvents();
            }

            writer = new GpehFileWriter(internalDir.getAbsolutePath() + "/" + type.name(), filename);

            for (final ApEventBean apEventBean : eventsList) {
                ApEventBean aEventBeanclone = apEventBean.clone();
                final Event event = id2event.get(new Integer(apEventBean.getEventId()));
                byte[] data = aEventBeanclone.getData(event);
                if (event.isBitpacked()) {
                    data = new XPacker(event).pack(data);
                }
                writer.writeRecord(data, eventRecordType);
                aEventBeanclone = null;
            }
            close();
        } catch (final Throwable e) {
            if (e.getMessage() != null) {
                logger.error(e.getMessage() + ":" + e.toString());
                e.printStackTrace();
            } else {
                e.printStackTrace();
            }
        }
        logger.debug(Thread.currentThread() + " finished processing");
    }

    /**
     * process events to add noise events and than, sort it and than shuffle the events
     */
    private void processEvents() {
        new DummyEvents(eventsList, dummyEventList, filename).addDummyEvents(numberOfDummyEventPerThread);

        dummyEventList = new ArrayList<ApEventBean>();

        //need to sort the evens before writing to the files
        logger.debug(Thread.currentThread() + " Sorting Events by time ");
        Collections.sort(eventsList, new TimeOnlyApEventBeanComparator());

        //Shuffle Events to mimic real world order
        int x = eventsList.size();
        logger.debug(Thread.currentThread() + " Suffle few events to mimic reald world ");
        eventsList = shuffleFewEvents(eventsList);
        logger.debug("array Size before and after shuffling (before:after)" + x + " : " + eventsList.size());
    }

    /**
     * add the footer to end the each file
     */
    public synchronized void close() {
        if (writer != null) {
            writer.writeRecord(footer.toByteArray(), footerRecordType);
            writer.close();
        }
    }

    /**
     * shuffle the arrayList
     * @param eventsToWriteToFile2
     * @return
     */
    private ArrayList<ApEventBean> shuffleFewEvents(ArrayList<ApEventBean> arr) {

        // divide the events array into pieces like RNCs threads
        final ArrayList<ArrayList<ApEventBean>> parts = (new ArrayChopper()).choptheArray(arr, 20);

        // shuffle the parts i.e different thread writing to the file at different time
        Collections.shuffle(parts);

        ArrayList<ApEventBean> arrayAfterShuffle = new ArrayList<ApEventBean>();

        //rejoin the parts to one array
        for (ArrayList<ApEventBean> arrayList : parts) {
            arrayAfterShuffle.addAll(arrayList);
        }

        return arrayAfterShuffle;
    }
}
