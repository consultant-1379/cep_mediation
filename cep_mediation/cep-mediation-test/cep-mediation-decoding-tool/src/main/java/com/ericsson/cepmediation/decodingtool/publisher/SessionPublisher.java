package com.ericsson.cepmediation.decodingtool.publisher;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_IMSI;
import com.ericsson.cepmediation.apeventbeans.gpeh.RANAP_IU_RELEASE_COMMAND;
import com.ericsson.cepmediation.apeventbeans.gpeh.RRC_RRC_CONNECTION_RELEASE;
import com.ericsson.cepmediation.apeventbeans.gpeh.RRC_RRC_CONNECTION_RELEASE_COMPLETE;
import com.ericsson.cepmediation.apeventbeans.gpeh.RRC_RRC_CONNECTION_SETUP;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;

/**
 * Prints all partitions in a rop containing a specified imsi putting some delimiters at session boundaries.
 * 
 * @author emicned
 *
 */
public class SessionPublisher extends PublisherAdapter {
    private final Map<Long, List<ApEventBean>> partitions;

    private static final Logger logger = LoggerFactory.getLogger(SessionPublisher.class);

    private final long imsi;

    private int counter = 0;

    private int counterPartitioned = 0;

    public SessionPublisher(final String imsi) {
        if (imsi == null) {
            throw new IllegalArgumentException("null provided for imsi");
        }
        partitions = new HashMap<Long, List<ApEventBean>>(10000);
        this.imsi = Long.valueOf(imsi.trim());
    }

    @Override
    public void publishMessage(final ApEventBean e) {
        counter++;
        if (counter % 1000000 == 0) {
            logger.info("parsed " + counter + " events");
        }
        if (e instanceof GpehBase) {
            final GpehBase event = (GpehBase) e;
            if (event.getUE_CONTEXT() > -1 && event.getRNC_MODULE_ID() > -1) {
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
        try {
            if (true) {
                onlyPartitions();
                return;
            }
            final Map<Long, List<ApEventBean>> res = new TreeMap<Long, List<ApEventBean>>();

            for (final List<ApEventBean> part : partitions.values()) {
                List<ApEventBean> curr = new ArrayList<ApEventBean>();
                Collections.sort(part);
                long currImsi = -1;
                for (final ApEventBean e : part) {
                    counterPartitioned++;
                    if (counterPartitioned % 1000000 == 0) {
                        logger.info("partitioned " + counterPartitioned + " events");
                    }

                    if (e instanceof RRC_RRC_CONNECTION_SETUP) {
                        if (curr.size() > 0 && imsi == currImsi) {
                            res.put(curr.get(0).getTimestamp(), curr);
                        }
                        curr = new ArrayList<ApEventBean>();
                        currImsi = -1;
                        curr.add(e);
                    } else if (e instanceof RRC_RRC_CONNECTION_RELEASE_COMPLETE
                            || e instanceof RRC_RRC_CONNECTION_RELEASE || e instanceof RANAP_IU_RELEASE_COMMAND) {
                        if (curr.size() > 0 && imsi == currImsi) {
                            curr.add(e);
                            res.put(curr.get(0).getTimestamp(), curr);
                            curr = new ArrayList<ApEventBean>();
                            currImsi = -1;
                        }
                    } else if (e instanceof INTERNAL_IMSI) {
                        currImsi = Long.valueOf(((INTERNAL_IMSI) e).getIMSI().trim());
                        curr.add(e);
                    } else {
                        curr.add(e);
                    }
                }

                if (curr.size() > 0 && imsi == currImsi) {
                    res.put(curr.get(0).getTimestamp(), curr);
                }
            }

            for (final List<ApEventBean> part : res.values()) {
                for (final ApEventBean e : part) {
                    logger.info(e.getClass().getName() + " " + e.getDecodedString());
                }
                logger.info("--------------partition end---------------");
            }
        } catch (final Exception e) {
            logger.error(e.getMessage());
        }
    }

    private void onlyPartitions() {
        final Map<Long, List<ApEventBean>> res = new TreeMap<Long, List<ApEventBean>>();
        logger.debug("" + imsi);
        for (final List<ApEventBean> part : partitions.values()) {
            Collections.sort(part);
            for (final ApEventBean e : part) {
                if (e instanceof INTERNAL_IMSI) {
                    if (imsi == Long.valueOf((((INTERNAL_IMSI) e).getIMSI()))) {
                        res.put(part.get(0).getTimestamp(), part);
                        break;
                    }
                }
            }
        }

        logger.debug("res size" + res.size());
        for (final List<ApEventBean> part : res.values()) {
            long currImsi = -1;
            long cnt = 0;
            for (final ApEventBean e : part) {
                if (e instanceof RRC_RRC_CONNECTION_SETUP) {
                    if (cnt > 2) {
                        if (this.imsi == currImsi) {
                            logger.info("++++++++++++++++++session end: " + currImsi + "++++++++++++++++++");
                        } else {
                            logger.info("----------------session end: " + currImsi + "-------------------");
                        }
                    }
                    currImsi = -1;
                } else if (e instanceof INTERNAL_IMSI) {
                    currImsi = Long.valueOf(((INTERNAL_IMSI) e).getIMSI().trim());
                }

                logger.info(e.getDecodedString());
                cnt++;
            }
            if (this.imsi == currImsi) {
                logger.info("=======================++partition end: " + currImsi + "++=======================");
            } else {
                logger.info("=======================--partition end: " + currImsi + "--=======================");
            }
        }
    }

    private void specificPartition() {
        final Map<Long, List<ApEventBean>> res = new TreeMap<Long, List<ApEventBean>>();
        for (final List<ApEventBean> part : partitions.values()) {
            Collections.sort(part);
            final GpehBase b = (GpehBase) part.get(0);
            if (b.getUE_CONTEXT() == 391 && b.getRNC_MODULE_ID() == 3) {
                res.put(b.getTimestamp(), part);
            }
        }

        for (final List<ApEventBean> part : res.values()) {
            for (final ApEventBean e : part) {
                logger.info(e.getClass().getName() + " " + e.getDecodedString());
            }
            logger.info("--------------partition end---------------");
        }

    }

    private void printAllEventsUntilDate() throws ParseException {
        final String TIME_ZONE = "UTC";

        final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";
        final DateFormat dateFormat = new SimpleDateFormat(DATE_TIME_FORMAT);
        dateFormat.setTimeZone(TimeZone.getTimeZone(TIME_ZONE));

        final long start = dateFormat.parse("2012-05-17 06:59:59.000").getTime();

        final List<ApEventBean> res = new ArrayList<ApEventBean>();

        for (final List<ApEventBean> part : partitions.values()) {
            Collections.sort(part);
            final GpehBase b = (GpehBase) part.get(0);
            if (b.getTimestamp() > start) {
                res.add(b);
            }
        }

        Collections.sort(res);

        for (final ApEventBean e : res) {
            logger.info(e.getClass().getName() + " " + e.getDecodedString());
        }
    }
}