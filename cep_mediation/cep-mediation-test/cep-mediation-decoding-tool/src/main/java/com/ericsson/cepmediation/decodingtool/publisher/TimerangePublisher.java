package com.ericsson.cepmediation.decodingtool.publisher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_IMSI;
import com.ericsson.cepmediation.apeventbeans.gpeh.RRC_RRC_CONNECTION_SETUP;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;

/**
 * Prints all events in a given timerange.
 * 
 * @author emicned
 *
 */
public class TimerangePublisher extends PublisherAdapter {
    private static final Logger logger = LoggerFactory.getLogger(TimerangePublisher.class);

    private final long start;

    private final long end;

    long min = Long.MAX_VALUE;

    long max = Long.MIN_VALUE;

    private final Map<Long, List<ApEventBean>> partitions;

    public TimerangePublisher(final long start, final long end) {
        partitions = new HashMap<Long, List<ApEventBean>>(10000);
        this.start = start;
        this.end = end;
    }

    @Override
    public void publishMessage(final ApEventBean e) {
        if (e instanceof GpehBase) {
            final GpehBase event = (GpehBase) e;
            if (event.getUE_CONTEXT() > -1 && event.getRNC_MODULE_ID() > -1 && e.getTimestamp() >= start && e.getTimestamp() <= end) {
                final long key = ((long) event.getUE_CONTEXT() << 32) + event.getRNC_MODULE_ID();
                List<ApEventBean> part = partitions.get(key);
                if (part == null) {
                    part = new ArrayList<ApEventBean>();
                    partitions.put(key, part);
                }
                part.add(event);
            }
        }
    }

    @Override
    public void flush() {
        final Map<Long, List<ApEventBean>> res = new TreeMap<Long, List<ApEventBean>>();
        for (final List<ApEventBean> part : partitions.values()) {
            Collections.sort(part);
            res.put(part.get(0).getTimestamp(), part);
        }

        logger.debug("res size" + res.size());
        for (final List<ApEventBean> part : res.values()) {
            long currImsi = -1;
            long cnt = 0;
            for (final ApEventBean e : part) {
                if (e instanceof RRC_RRC_CONNECTION_SETUP) {
                    if (cnt > 2) {
                        logger.info("~~~~~~~~~~~~~~~~~~~~session end: " + currImsi + "~~~~~~~~~~~~~~~~~~~~~~");
                    }
                    currImsi = -1;
                } else if (e instanceof INTERNAL_IMSI) {
                    currImsi = Long.valueOf(((INTERNAL_IMSI) e).getIMSI().trim());
                }

                logger.info(e.getDecodedString());
                cnt++;
            }
            logger.info("=======================partition end: " + currImsi + "=======================");
        }
    }
}
