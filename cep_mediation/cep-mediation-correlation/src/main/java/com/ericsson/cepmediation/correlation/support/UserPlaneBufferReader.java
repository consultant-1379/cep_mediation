package com.ericsson.cepmediation.correlation.support;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ericsson.cepmediation.apeventbeans.correlation.IP_TO_IMSI_LOOKUP;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.IMap;
import com.hazelcast.query.EntryObject;
import com.hazelcast.query.Predicate;
import com.hazelcast.query.PredicateBuilder;

public final class UserPlaneBufferReader implements CacheHandler {

    private static UserPlaneBufferReader INSTANCE;

    public static synchronized CacheHandler getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new UserPlaneBufferReader();
        }
        return INSTANCE;
    }

    private final IMap<String, IP_TO_IMSI_LOOKUP> userPlaneMap = Hazelcast.getMap("User-Plane-Map");

    @Override
    public ApEventBean[] findById(final String imsi) {
        throw new UnsupportedOperationException("This operation not supported ");

    }

    @Override
    public ApEventBean[] findAllById(final String imsi) {
        throw new UnsupportedOperationException("This operation not supported ");
    }

    @Override
    public ApEventBean[] findByIdAndRange(final String imsi, final long timestamp) {
        throw new UnsupportedOperationException("This operation not supported ");
    }

    @Override
    public IP_TO_IMSI_LOOKUP findByIpAddressAndTimestamp(final String ipAddress, final long timeStamp,
            final boolean isLastAttempt) {
        final EntryObject eObject = new PredicateBuilder().getEntryObject();
        @SuppressWarnings("rawtypes")
        final Predicate predicate = eObject.get("IP").equal(ipAddress)
                .and(eObject.get("timestamp").between(new Long(timeStamp - 60 * 60 * 1000), new Long(timeStamp)));
        final Collection<IP_TO_IMSI_LOOKUP> list = userPlaneMap.values(predicate);
        //    	logger.info("Lookup for '" + ipAddress + "' returned " + (list == null ? 0 : list.size()) + " entries");
        if (list == null || list.size() == 0) {
            return null;
        }
        final List<IP_TO_IMSI_LOOKUP> arrayList = new ArrayList<IP_TO_IMSI_LOOKUP>(list);
        Collections.sort(arrayList, UserPlaneComparator.COMPARATOR);
        return arrayList.get(arrayList.size() - 1);
    }

    @Override
    public ApEventBean[] findByIdAndTimeRange(final String imsi, final long startTimestamp, final long endTimeStamp) {
        throw new UnsupportedOperationException("This operation not supported ");
    }

    private static final class UserPlaneComparator implements Comparator<IP_TO_IMSI_LOOKUP> {

        public static final Comparator<IP_TO_IMSI_LOOKUP> COMPARATOR = new UserPlaneComparator();

        @Override
        public int compare(final IP_TO_IMSI_LOOKUP o1, final IP_TO_IMSI_LOOKUP o2) {
            if (o1.getTimestamp() < o2.getTimestamp()) {
                return -1;
            } else if (o1.getTimestamp() > o2.getTimestamp()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
