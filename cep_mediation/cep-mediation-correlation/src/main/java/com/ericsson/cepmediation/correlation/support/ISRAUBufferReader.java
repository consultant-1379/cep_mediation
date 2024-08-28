package com.ericsson.cepmediation.correlation.support;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.apeventbeans.correlation.IP_TO_IMSI_LOOKUP;
import com.ericsson.cepmediation.apeventbeans.ebm.ISRAU;
import com.ericsson.cepmediation.apeventbeans.ebm.L_HANDOVER;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.IMap;
import com.hazelcast.query.EntryObject;
import com.hazelcast.query.Predicate;
import com.hazelcast.query.PredicateBuilder;
import com.hazelcast.query.SqlPredicate;

public class ISRAUBufferReader implements CacheHandler {
    // Get the logger
    private static final Logger logger = LoggerFactory.getLogger(RAUBufferReader.class);

    // Hold a set of all L_SERVICE_REQUEST events mapped to IMSIs
    private IMap<String, ISRAU> rauMap = null;

    /**
     * Default constructor encapsulates the L_HANDOVER-Map distributed map.
     */
    public ISRAUBufferReader() {
        synchronized (this) {
            rauMap = Hazelcast.getMap("ISRAU-Map");
        }
    }

    public synchronized static CacheHandler getInstance() {

        return new ISRAUBufferReader();
    }

    /**This method perform a search in the cache
     * @param imsi, String IMSI
     * @return an array of the {@link L_HANDOVER}
     */
    @Override
    public synchronized ApEventBean[] findById(final String imsi) {
        final Set<ISRAU> rau = (Set<ISRAU>) rauMap.values(new SqlPredicate("IMSI=" + imsi));
        logger.debug((rau.size() > 0 ? "ISRAU event found in the cache" : "ISRAU event not found in cache")
                + " for IMSI -->" + imsi);
        final ApEventBean[] apEventBeans = new ApEventBean[0];
        if (rau == null || rau.size() == 0) {
            return apEventBeans;
        }
        return rau.size() == 1 ? rau.toArray(apEventBeans) : Util.sort(rau.toArray(apEventBeans));

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
        final Predicate predicate = eObject.get("IMSI").equal(imsi)
                .and(eObject.get("timestamp").between(new Long(startTimestamp), new Long(endTimeStamp)));
        final Set<ISRAU> rau = (Set<ISRAU>) rauMap.values(predicate);

        logger.debug((rau.size() > 0 ? "ISRAU event found in the cache" : "ISRAU event not found in cache")
                + " for IMSI -->" + imsi);
        final ApEventBean[] apEventBeans = new ApEventBean[0];
        if (rau == null || rau.size() == 0) {
            return apEventBeans;
        }
        return rau.size() == 1 ? rau.toArray(apEventBeans) : Util.sort(rau.toArray(apEventBeans));
    }

    @Override
    public IP_TO_IMSI_LOOKUP findByIpAddressAndTimestamp(final String ipAddress, final long timestamp,
            final boolean isLastAttempt) {
        throw new UnsupportedOperationException("This operation not supported ");
    }

}
