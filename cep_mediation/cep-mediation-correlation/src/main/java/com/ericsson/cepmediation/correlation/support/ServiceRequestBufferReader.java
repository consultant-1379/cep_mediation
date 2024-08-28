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

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.apeventbeans.correlation.IP_TO_IMSI_LOOKUP;
import com.ericsson.cepmediation.apeventbeans.ebm.ACTIVATE;
import com.ericsson.cepmediation.apeventbeans.ebm.SERVICE_REQUEST;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.IMap;
import com.hazelcast.query.EntryObject;
import com.hazelcast.query.Predicate;
import com.hazelcast.query.PredicateBuilder;

/**
 * This class can be used to search ACTIVATE events from the cache 
 * @author saj
 *
 */
public class ServiceRequestBufferReader implements CacheHandler {
    // Get the logger
    private static final Logger logger = LoggerFactory.getLogger(ServiceRequestBufferReader.class);

    // Hold a set of all L_SERVICE_REQUEST events mapped to IMSIs
    private IMap<String, SERVICE_REQUEST> activateMap = null;

    /**
     * Default constructor encapsulates the L_HANDOVER-Map distributed map.
     */
    public ServiceRequestBufferReader() {
        synchronized (this) {
            activateMap = Hazelcast.getMap("SERVICE_REQUEST-Map");
        }
    }

    public synchronized static CacheHandler getInstance() {

        return new ServiceRequestBufferReader();
    }

    /**This method perform a search in the cache
     * @param imsi, String IMSI
     * @return an array of the {@link ACTIVATE}
     */
    @Override
    public synchronized ApEventBean[] findById(final String imsi) {
        if ("".equals(imsi) || null == imsi) {
            throw new IllegalStateException("SERVICE_REQUEST event serach failed, reason : Invalid IMSI value");
        }
        long timeStart = 0;
        if (logger.isDebugEnabled()) {
            logger.debug("SERVICE_REQUEST map size =" + activateMap.size());
            timeStart = System.currentTimeMillis();
        }
        final SERVICE_REQUEST event = activateMap.get(imsi);
        if (event == null) {
            return new ApEventBean[0];
        }
        if (logger.isDebugEnabled()) {
            logger.debug("SERVICE_REQUEST search took " + (System.currentTimeMillis() - timeStart) + " milli secs");
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
        // sets a predicate for the search using IMSI
        final EntryObject eObject = new PredicateBuilder().getEntryObject();
        @SuppressWarnings("rawtypes")
        final Predicate predicate = eObject.get("MSID_IMSI").equal(imsi)
                .and(eObject.get("timestamp").between(new Long(startTimestamp), new Long(endTimeStamp)));
        final Set<SERVICE_REQUEST> activate = (Set<SERVICE_REQUEST>) activateMap.values(predicate);

        logger.debug((activate.size() > 0 ? "SERVICE_REQUEST event found in the cache"
                : "SERVICE_REQUEST event not found in cache") + " for IMSI -->" + imsi);
        final ApEventBean[] apEventBeans = new ApEventBean[0];
        if (activate == null || activate.size() == 0) {
            return apEventBeans;
        }
        return activate.size() == 1 ? activate.toArray(apEventBeans) : Util.sort(activate.toArray(apEventBeans));
    }

    @Override
    public IP_TO_IMSI_LOOKUP findByIpAddressAndTimestamp(final String ipAddress, final long timestamp,
            final boolean isLastAttempt) {
        throw new UnsupportedOperationException("This operation not supported ");
    }

}
