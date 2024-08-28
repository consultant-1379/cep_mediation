/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2013 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.eventprocessor;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;

/**
 * @author eikrwaq
 * @since 2013
 *
 */
public class DummyEvents {
    /**
     * @param eventsToWriteToFile 
     * 
     */

    private static final Logger logger = LoggerFactory.getLogger(DummyEvents.class);

    private final ArrayList<ApEventBean> eventsToWriteToFile;

    private final ArrayList<ApEventBean> dummyEventList;

    private final String currentFileName;

    public DummyEvents(final ArrayList<ApEventBean> eventsToWriteToFile2, final ArrayList<ApEventBean> dummyEventList,
            final String currentFileName) {
        this.eventsToWriteToFile = eventsToWriteToFile2;
        this.dummyEventList = dummyEventList;
        this.currentFileName = currentFileName;
    }

    /**
     * 
     */
    public void addDummyEvents(final int numberOfEventsNeeded) {
        logger.debug(numberOfEventsNeeded + " adding noise events to the list");
        int xs = eventsToWriteToFile.size();
        if (!dummyEventList.isEmpty()) {
            for (int x = 0; x < numberOfEventsNeeded; x++) {
            	final ApEventBean event = (ApEventBean)dummyEventList.get((int) (Math.random() * dummyEventList.size()));
                //logger.debug("Add dummy event started");
              /*  if(event instanceof GpehBase)
                {
                	logger.debug("Casting can happen");
                	
                }*/
                final GpehBase e = (GpehBase) event;
                //change TimeStamp of the event
               // logger.debug("After GpehBase");
                final Calendar randomTime = getRandomTimeStampInMillis();
                e.setTIMESTAMP_HOUR((byte) randomTime.get(Calendar.HOUR_OF_DAY));
                e.setTIMESTAMP_MINUTE((byte) randomTime.get(Calendar.MINUTE));
                e.setTIMESTAMP_SECOND((byte) randomTime.get(Calendar.SECOND));
                e.setTIMESTAMP_MILLISEC((short) randomTime.get(Calendar.MILLISECOND));
                // need to set Time for sorting the events later
                e.setTimestamp(randomTime.getTimeInMillis()
                        + randomTime.getTimeZone().getOffset(randomTime.getTimeInMillis()));
                eventsToWriteToFile.add(e.clone());
            }
        }
        logger.debug((eventsToWriteToFile.size() - xs) + " noise added to the list");
    }

    private Calendar getRandomTimeStampInMillis() {
        final Calendar startTime = Calendar.getInstance();
        final DateFormat shortDateFormat = new SimpleDateFormat("yyyyMMdd.HHmm");
        final Calendar ranTime = Calendar.getInstance();

        long randomtime = 0;
        try {
            // get the the time from the filename
            startTime.setTime(shortDateFormat.parse(this.currentFileName.substring(1, 14)));
        } catch (final ParseException e) {
            e.printStackTrace();
        }

        final Calendar endTime = Calendar.getInstance();
        startTime.set(Calendar.MILLISECOND, 00);
        endTime.setTime(startTime.getTime());

        // for 15 mins Rop, have to change this value if the rop is different
        endTime.add(Calendar.MINUTE, 15);

        // generate random time stamp between above time range i.e 0000 - 0015
        do {
            randomtime = (long) (Math.random() * (endTime.getTimeInMillis() - startTime.getTimeInMillis() - 60000) + startTime
                    .getTimeInMillis());
            ranTime.setTimeInMillis(randomtime);
        } while ((endTime.before(ranTime) && (startTime.after(ranTime))));
        return ranTime;
    }
}
