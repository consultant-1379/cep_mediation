/**
 * (C) Copyright LM Ericsson System Expertise AT/LMI, 2011
 *
 * The copyright to the computer program(s) herein is the property of Ericsson
 * System Expertise EEI, Sweden. The program(s) may be used and/or copied only
 * with the written permission from Ericsson System Expertise AT/LMI or in
 * accordance with the terms and conditions stipulated in the agreement/contract
 * under which the program(s) have been supplied.
 *
 */
package com.ericsson.cepmediation.correlation.support;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.apeventbeans.correlation.IP_TO_IMSI_LOOKUP;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.IMap;

/**
 * This class process the {@link L_HANDOVER} search in the cache(L_HANDOVER-Map).
 * @author eachsaj
 *
 */
public class RAUBufferReader implements CacheHandler {
    // Get the logger
    private static final Logger logger = LoggerFactory.getLogger(RAUBufferReader.class);

    // Hold a set of all L_SERVICE_REQUEST events mapped to IMSIs
    private IMap<String, List<ApEventBean>> rauMap = null;

    /**
     * Default constructor encapsulates the L_HANDOVER-Map distributed map.
     */
    public RAUBufferReader() {
        synchronized (this) {
            rauMap = Hazelcast.getMap("RAU-Map");
        }
    }

    public static synchronized CacheHandler create() {

        return new RAUBufferReader();
    }

    /**This method perform a search in the cache
     * @param imsi, String IMSI
     * @return an array of the {@link L_HANDOVER}
     */
    @Override
    public synchronized ApEventBean[] findById(final String imsi) {

        long timeStart = 0;

        if (logger.isDebugEnabled()) {
            logger.debug("RAU map size =" + rauMap.size());
            timeStart = System.currentTimeMillis();
        }
        final List<ApEventBean> event = rauMap.get(imsi);
        if (logger.isDebugEnabled()) {
            logger.debug("RAU search took " + (System.currentTimeMillis() - timeStart) + " milli secs");
        }
        if (event == null) {
            return new ApEventBean[0];
        }

        return event.toArray(new ApEventBean[0]);

    }

    @Override
    public ApEventBean[] findAllById(final String imsi) {
        throw new UnsupportedOperationException("This operation not supported ");
    }

    @Override
    public synchronized ApEventBean[] findByIdAndRange(final String imsi, final long timestamp) {
        throw new UnsupportedOperationException("This operation not supported ");
    }

    @Override
    public ApEventBean[] findByIdAndTimeRange(final String imsi, final long startTimestamp, final long endTimeStamp) {
        // sets a predicate for the search using IMSI
        long timeStart = 0;

        if (logger.isDebugEnabled()) {
            logger.debug("RAU map size =" + rauMap.size());
            timeStart = System.currentTimeMillis();
        }
        final List<ApEventBean> event = rauMap.get(imsi);
        if (logger.isDebugEnabled()) {
            logger.debug("RAU search took " + (System.currentTimeMillis() - timeStart) + " milli secs");
        }
        if (event != null) {
            final List<ApEventBean> sortedEvents = new ArrayList<ApEventBean>();
            for (final ApEventBean eachRau : event) {
                final long timestamp = eachRau.getTimestamp();
                if (timestamp >= startTimestamp && timestamp <= endTimeStamp) {
                    sortedEvents.add(eachRau);
                }
            }
            return sortedEvents.toArray(new ApEventBean[0]);

        }

        return new ApEventBean[0];
    }

    @Override
    public IP_TO_IMSI_LOOKUP findByIpAddressAndTimestamp(final String ipAddress, final long timestamp, final boolean isLastAttempt) {
        throw new UnsupportedOperationException("This operation not supported ");
    }

}
