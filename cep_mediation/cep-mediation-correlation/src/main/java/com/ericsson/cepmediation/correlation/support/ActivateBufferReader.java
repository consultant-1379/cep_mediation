/**
 * (C) Copyright LM Ericsson System Expertise AT/LMI, 2012
 *
 * The copyright to the computer program(s) herein is the property of Ericsson
 * System Expertise EEI, Sweden. The program(s) may be used and/or copied only
 * with the written permission from Ericsson System Expertise AT/LMI or in
 * accordance with the terms and conditions stipulated in the agreement/contract
 * under which the program(s) have been supplied.
 *
 */
package com.ericsson.cepmediation.correlation.support;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.apeventbeans.correlation.IP_TO_IMSI_LOOKUP;
import com.ericsson.cepmediation.apeventbeans.ebm.ACTIVATE;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.IMap;

/**
 * This class can be used to search ACTIVATE events from the cache 
 * @author saj
 *
 */
public class ActivateBufferReader implements CacheHandler {
    // Get the logger
    private static final Logger logger = LoggerFactory.getLogger(ActivateBufferReader.class);

    // Hold a set of all L_SERVICE_REQUEST events mapped to IMSIs
    private final IMap<String, ACTIVATE> activateMap;

    /**
     * Default constructor encapsulates the L_HANDOVER-Map distributed map.
     */
    public ActivateBufferReader() {
        synchronized (this) {
            activateMap = Hazelcast.getMap("ACTIVATE-Map");
        }
    }

    public synchronized static CacheHandler getInstance() {

        return new ActivateBufferReader();
    }

    /**This method perform a search in the cache
     * @param imsi, String IMSI
     * @return an array of the {@link ACTIVATE}
     */
    @Override
    public synchronized ApEventBean[] findById(final String imsi) {
        if ("".equals(imsi) || null == imsi) {
            throw new IllegalStateException("ACTIVATE event serach failed, reason : Invalid IMSI value");
        }
        long timeStart = 0;

        if (logger.isDebugEnabled()) {
            logger.debug("SERVICE_REQUEST map size =" + activateMap.size());
            timeStart = System.currentTimeMillis();
        }
        final ACTIVATE event = activateMap.get(imsi);
        if (logger.isDebugEnabled()) {
            logger.debug("ACTIVATE search took " + (System.currentTimeMillis() - timeStart) + " milli secs");
        }
        if (event == null) {
            return new ApEventBean[0];
        }
        return new ApEventBean[] { event };

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
        throw new UnsupportedOperationException("This operation not supported ");
    }

    @Override
    public IP_TO_IMSI_LOOKUP findByIpAddressAndTimestamp(final String ipAddress, final long timestamp,
            final boolean isLastAttempt) {
        throw new UnsupportedOperationException("This operation not supported ");
    }

}
