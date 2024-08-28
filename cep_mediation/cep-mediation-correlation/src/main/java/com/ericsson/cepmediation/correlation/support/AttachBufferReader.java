package com.ericsson.cepmediation.correlation.support;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.apeventbeans.correlation.IP_TO_IMSI_LOOKUP;
import com.ericsson.cepmediation.apeventbeans.ebm.ATTACH;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.IMap;
import com.hazelcast.query.EntryObject;
import com.hazelcast.query.Predicate;
import com.hazelcast.query.PredicateBuilder;

public class AttachBufferReader implements CacheHandler {
    // Get the logger
    private static final Logger logger = LoggerFactory.getLogger(RAUBufferReader.class);

    // Hold a set of all ATTACH events mapped to IMSIs
    private final IMap<String, ATTACH> attachMap;

    /**
     * Default constructor encapsulates the L_HANDOVER-Map distributed map.
     */
    public AttachBufferReader() {
        synchronized (this) {
            attachMap = Hazelcast.getMap("ATTACH-Map");
        }
    }

    public synchronized static CacheHandler getInstance() {
        return new AttachBufferReader();
    }

    /**This method perform a search in the cache
     * @param imsi, String IMSI
     * @return an array of the {@link ATTACH}
     */
    @Override
    public synchronized ApEventBean[] findById(final String imsi) {
        final ATTACH event = attachMap.get(imsi);
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
        // sets a predicate for the search using IMSI
        final EntryObject eObject = new PredicateBuilder().getEntryObject();
        @SuppressWarnings("rawtypes")
        final Predicate predicate = eObject.get("IMSI").equal(imsi)
                .and(eObject.get("timestamp").between(new Long(startTimestamp), new Long(endTimeStamp)));
        final Set<ATTACH> attach = (Set<ATTACH>) attachMap.values(predicate);

        logger.debug((attach.size() > 0 ? "ATTACH event found in the cache" : "ATTACH event not found in cache")
                + " for IMSI -->" + imsi);
        final ApEventBean[] apEventBeans = new ApEventBean[0];
        if (attach == null || attach.size() == 0) {
            return apEventBeans;
        }
        return attach.size() == 1 ? attach.toArray(apEventBeans) : Util.sort(attach.toArray(apEventBeans));
    }

    @Override
    public IP_TO_IMSI_LOOKUP findByIpAddressAndTimestamp(final String ipAddress, final long timestamp,
            final boolean isLastAttempt) {
        throw new UnsupportedOperationException("This operation not supported ");
    }

}
