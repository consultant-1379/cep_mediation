package com.ericsson.cepmediation.correlation.enrichment.listeners.up.impl;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import com.ericsson.cepmediation.apeventbeans.bearer_plane.CLASSIFICATION_REPORT;
import com.ericsson.cepmediation.apeventbeans.correlation.IP_TO_IMSI_LOOKUP;
import com.ericsson.cepmediation.apeventbeans.ebm.ACTIVATE;
import com.ericsson.cepmediation.apeventbeans.ebm.ISRAU;
import com.ericsson.cepmediation.apeventbeans.ebm.RAU;
import com.ericsson.cepmediation.apeventbeans.ebm.SERVICE_REQUEST;
import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.correlation.enrichment.listeners.up.IpAddressPartition;
import com.ericsson.cepmediation.correlation.enrichment.listeners.up.SgehLookupService;

public final class DefaultSgehLookupService implements SgehLookupService {
    private final Logger logger = Logger.getLogger(DefaultSgehLookupService.class);

    private final Map<String, IpAddressPartition> ips;

    public DefaultSgehLookupService() {
        ips = new ConcurrentHashMap<String, IpAddressPartition>();
    }

    @Override
    public void onClassificationReport(final CLASSIFICATION_REPORT event) {
        final IP_TO_IMSI_LOOKUP entry = createLookup(event);
        if (isValid(entry)) {
            onLookupEvent(entry);
        }
    }

    @Override
    public void onRau(final RAU event) {
        final IP_TO_IMSI_LOOKUP entry = createLookup(event);
        if (isValid(entry)) {
            onLookupEvent(entry);
        }
    }

    @Override
    public void onIsRau(final ISRAU event) {
        final IP_TO_IMSI_LOOKUP entry = createLookup(event);
        if (isValid(entry)) {
            onLookupEvent(entry);
        }
    }

    @Override
    public void onServiceRequest(final SERVICE_REQUEST event) {
        final IP_TO_IMSI_LOOKUP entry = createLookup(event);
        if (isValid(entry)) {
            onLookupEvent(entry);
        }
    }

    @Override
    public void onActivate(final ACTIVATE event) {
        final IP_TO_IMSI_LOOKUP entry = createLookup(event);
        if (isValid(entry)) {
            onLookupEvent(entry);
        }
    }

    @Override
    public IP_TO_IMSI_LOOKUP find(final String ipAddress, final long timestamp, final boolean isFinal) {
        return findImpl(ipAddress, timestamp, isFinal);
    }

    private IP_TO_IMSI_LOOKUP findImpl(final String ipAddress, final long timestamp, final boolean isFinal) {
        final IpAddressPartition partition = ips.get(ipAddress);
        if (partition != null) {
            return partition.find(timestamp, isFinal);
        }
        return null;
    }

    private void onLookupEvent(final IP_TO_IMSI_LOOKUP event) {
        IpAddressPartition partition = ips.get(event.getIP());
        if (partition == null) {
            partition = new DefaultIpAddressPartition();
            ips.put(event.getIP(), partition);
        }
        insert(partition, event);
    }

    private void insert(final IpAddressPartition partition, final IP_TO_IMSI_LOOKUP entry) {
        partition.onEvent(entry);
    }

    private IP_TO_IMSI_LOOKUP createLookup(final ACTIVATE activate) {
        String ip = activate.getMS_ADDRESS_IPV4();
        if (ip == null || ip.isEmpty()) {
            ip = activate.getMS_ADDRESS_IPV6();
        }
        if (ip == null || ip.isEmpty()) {
            return null;
        }
        final IP_TO_IMSI_LOOKUP lookup = new IP_TO_IMSI_LOOKUP();
        lookup.setIP(ip);
        lookup.setIMSI(safeLongCast(activate.getIMSI()));
        lookup.setIMEI(safeLongCast(activate.getIMEISV()));
        lookup.setAPN(activate.getAPN());
        lookup.setMSISDN(safeLongCast(activate.getMSISDN()));
        lookup.setMCC(activate.getLOCATION_MCC());
        lookup.setMNC(activate.getLOCATION_MNC());
        lookup.setTimestamp(activate.getTimestamp());
        lookup.setCREATION_TIME(System.currentTimeMillis());
        lookup.setSOURCE_EVENT_TYPE((byte) 1);
        return lookup;
    }

    private IP_TO_IMSI_LOOKUP createLookup(final SERVICE_REQUEST serviceRequest) {
        String ip = getFirstNotEmpty(serviceRequest.getPDP_INFO_MS_ADDRESS_IPV4());
        if (ip == null) {
            ip = getFirstNotEmpty(serviceRequest.getPDP_INFO_MS_ADDRESS_IPV6());
        }
        if (ip == null) {
            return null;
        }
        final IP_TO_IMSI_LOOKUP lookup = new IP_TO_IMSI_LOOKUP();
        lookup.setIP(ip);
        lookup.setIMSI(safeLongCast(serviceRequest.getMSID_IMSI()));
        lookup.setIMEI(safeLongCast(serviceRequest.getMSID_IMEISV()));
        lookup.setMSISDN(safeLongCast(serviceRequest.getMSID_MSISDN()));
        lookup.setMCC(serviceRequest.getLOCATION_MCC());
        lookup.setMNC(serviceRequest.getLOCATION_MNC());
        lookup.setTimestamp(serviceRequest.getTimestamp());
        lookup.setCREATION_TIME(System.currentTimeMillis());
        lookup.setSOURCE_EVENT_TYPE((byte) 2);
        return lookup;
    }

    private IP_TO_IMSI_LOOKUP createLookup(final RAU rau) {
        String ip = getFirstNotEmpty(rau.getPDP_INFO_MS_ADDRESS_IPV4());
        if (ip == null) {
            ip = getFirstNotEmpty(rau.getPDP_INFO_MS_ADDRESS_IPV6());
        }
        if (ip == null) {
            return null;
        }
        final IP_TO_IMSI_LOOKUP lookup = new IP_TO_IMSI_LOOKUP();
        lookup.setIP(ip);
        lookup.setIMSI(safeLongCast(rau.getIMSI()));
        lookup.setIMEI(safeLongCast(rau.getIMEISV()));
        lookup.setMSISDN(safeLongCast(rau.getMSISDN()));
        lookup.setMCC(rau.getLOCATION_MCC());
        lookup.setMNC(rau.getLOCATION_MNC());
        lookup.setTimestamp(rau.getTimestamp());
        lookup.setCREATION_TIME(System.currentTimeMillis());
        lookup.setSOURCE_EVENT_TYPE((byte) 3);
        return lookup;
    }

    private IP_TO_IMSI_LOOKUP createLookup(final ISRAU rau) {
        String ip = getFirstNotEmpty(rau.getPDP_INFO_MS_ADDRESS_IPV4());
        if (ip == null) {
            ip = getFirstNotEmpty(rau.getPDP_INFO_MS_ADDRESS_IPV6());
        }
        if (ip == null) {
            return null;
        }
        final IP_TO_IMSI_LOOKUP lookup = new IP_TO_IMSI_LOOKUP();
        lookup.setIP(ip);
        lookup.setIMSI(safeLongCast(rau.getIMSI()));
        lookup.setIMEI(safeLongCast(rau.getIMEISV()));
        lookup.setMSISDN(safeLongCast(rau.getMSISDN()));
        lookup.setMCC(rau.getLOCATION_MCC());
        lookup.setMNC(rau.getLOCATION_MNC());
        lookup.setTimestamp(rau.getTimestamp());
        lookup.setCREATION_TIME(System.currentTimeMillis());
        lookup.setSOURCE_EVENT_TYPE((byte) 4);
        return lookup;
    }

    private String getFirstNotEmpty(final String[] arr) {
        if (arr != null && arr.length > 0) {
            for (final String s : arr) {
                if (s != null && !s.isEmpty()) {
                    return s;
                }
            }
        }
        return null;
    }

    private IP_TO_IMSI_LOOKUP createLookup(final CLASSIFICATION_REPORT event) {
        final IP_TO_IMSI_LOOKUP lookup = new IP_TO_IMSI_LOOKUP();
        lookup.setIP(event.getADDR_TERM());
        lookup.setIMSI(safeLongCast(event.getIMSI()));
        lookup.setIMEI(safeLongCast(event.getIMEISV()));
        lookup.setTimestamp(event.getPERIOD_START());
        lookup.setCREATION_TIME(System.currentTimeMillis());
        lookup.setAPN(event.getAPN());
        lookup.setSOURCE_EVENT_TYPE((byte) 5);
        return lookup;
    }

    private boolean isValid(final IP_TO_IMSI_LOOKUP entry) {
        if (entry == null || entry.getIMSI() <= 0) {
            return false;
        }
        return true;
    }

    private long safeLongCast(final String value) {
        try {
            return Long.valueOf(value);
        } catch (final NumberFormatException e) {
            return -1;
        }
    }

    class IpAddressPartitionCleaner {

        private final int IP_PARTITION_TTL = CepMediationProperties
                .getIntProperty(CepMediationProperty.IP_PARTITION_TTL);

        private final int EVICTION_INTERVAL = IP_PARTITION_TTL / 5;

        private final int EVICTION_INITIAL_DELAY = IP_PARTITION_TTL + EVICTION_INTERVAL;

        void start() {
            Executors.newScheduledThreadPool(1, new ThreadFactory() {
                @Override
                public Thread newThread(final Runnable r) {
                    final Thread t = new Thread(r);
                    t.setName("ips-eviction-thread");
                    return t;
                }
            }).scheduleWithFixedDelay(new Runnable() {
                @Override
                public void run() {
                    evict();
                }
            }, EVICTION_INITIAL_DELAY, EVICTION_INTERVAL, TimeUnit.MILLISECONDS);

        }

        private void evict() {
            try {
                int totalCnt = 0;
                int evictedCnt = 0;
                for (final Iterator<Map.Entry<String, IpAddressPartition>> iter = ips.entrySet().iterator(); iter
                        .hasNext();) {
                    final IpAddressPartition partition = iter.next().getValue();
                    if (partition != null) {
                        final int size = partition.getSize();
                        if (size > 0) {
                            totalCnt += size;
                            for (int i = size - 1; i > -1; i--) {
                                final IP_TO_IMSI_LOOKUP entry = partition.getEvent(i);
                                if ((System.currentTimeMillis() - entry.getCREATION_TIME()) > IP_PARTITION_TTL) {
                                    partition.removeEvent(i);
                                    evictedCnt++;
                                }
                            }
                        }

                        if (partition.getSize() == 0) {
                            iter.remove();
                        }
                    }
                }

                logger.info("IP_TO_IMSI map: distinct/total/evicted:" + ips.size() + "/" + totalCnt + "/" + evictedCnt);
            } catch (final Throwable t) {
                logger.error("error during ip map eviction " + t);
            }
        }
    }
}
