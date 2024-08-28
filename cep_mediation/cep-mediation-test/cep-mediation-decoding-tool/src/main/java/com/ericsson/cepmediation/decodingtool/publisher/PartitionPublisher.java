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
 * Prints entire partition by specified ueContext and moduleId.
 * 
 * @author emicned
 *
 */
public class PartitionPublisher extends PublisherAdapter {
    private static final Logger logger = LoggerFactory.getLogger(PartitionPublisher.class);

    private final short ueContext;

    private final short moduleId;

    private final Map<Long, List<ApEventBean>> partitions;

    public PartitionPublisher(final short ueContext, final short moduleId) {
        this.moduleId = moduleId;
        this.ueContext = ueContext;
        partitions = new HashMap<Long, List<ApEventBean>>(10000);

    }

    @Override
    public void publishMessage(final ApEventBean e) {
        if (e instanceof GpehBase) {
            final GpehBase event = (GpehBase) e;
            if (event.getUE_CONTEXT() == ueContext && event.getRNC_MODULE_ID() == moduleId) {
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

        logger.info("res size" + res.size());
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