package com.ericsson.cepmediation.correlation.support;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.log4j.Logger;

import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;

public class InternalSystemUtilization {

    private static final Logger logger = Logger.getLogger(InternalSystemUtilization.class);

    private static final int SYS_UTIL_TTL = CepMediationProperties
            .getIntProperty(CepMediationProperty.INTERNAL_ISU_TTL);

    private static final int EVICTION_INTERVAL = SYS_UTIL_TTL / 5;

    private static final int EVICTION_INITIAL_DELAY = SYS_UTIL_TTL + EVICTION_INTERVAL;

    private static final String KEY_FOMAT = "%s-%s";

    private static final ConcurrentHashMap<String, ConcurrentHashMap<Long, InternalSystemUtilizationData>> cell2sysUtil = new ConcurrentHashMap<String, ConcurrentHashMap<Long, InternalSystemUtilizationData>>();

    private static final ThreadFactory evictionThreadFactory = new ThreadFactory() {
        private final AtomicInteger counter = new AtomicInteger(0);

        @Override
        public Thread newThread(final Runnable r) {
            final Thread t = new Thread(r);
            t.setName("isu-eviction-thread-" + counter.getAndIncrement());
            return t;
        }
    };

    static {
        Executors.newScheduledThreadPool(1, evictionThreadFactory).scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                try {
                    final long start = System.currentTimeMillis();
                    logger.debug("InternalSystemUtilization eviction start");
                    int timestampsRemaining = 0;
                    int timestampsEvictedCnt = 0;
                    int cellsRemaining = 0;
                    int cellsEvictedCnt = 0;
                    for (final Iterator<Map.Entry<String, ConcurrentHashMap<Long, InternalSystemUtilizationData>>> cell2sysUtilIter = cell2sysUtil
                            .entrySet().iterator(); cell2sysUtilIter.hasNext();) {
                        final ConcurrentHashMap.Entry<String, ConcurrentHashMap<Long, InternalSystemUtilizationData>> cell2sysUtilEntry = cell2sysUtilIter
                                .next();
                        final ConcurrentHashMap<Long, InternalSystemUtilizationData> timestamp2sysUtil = cell2sysUtilEntry
                                .getValue();
                        for (final Iterator<Map.Entry<Long, InternalSystemUtilizationData>> timestamp2sysUtilIter = timestamp2sysUtil
                                .entrySet().iterator(); timestamp2sysUtilIter.hasNext();) {
                            final ConcurrentHashMap.Entry<Long, InternalSystemUtilizationData> entry = timestamp2sysUtilIter
                                    .next();
                            final InternalSystemUtilizationData data = entry.getValue();
                            if (System.currentTimeMillis() - data.getTimestamp() > SYS_UTIL_TTL) {
                                timestampsEvictedCnt++;
                                timestamp2sysUtilIter.remove();
                            } else {
                                timestampsRemaining++;
                            }
                        }

                        if (timestamp2sysUtil.isEmpty()) {
                            cellsEvictedCnt++;
                            cell2sysUtilIter.remove();
                        } else {
                            cellsRemaining++;
                        }
                    }
                    logger.debug("eviction took: " + (System.currentTimeMillis() - start)
                            + "millis. Timesamps total/evicted: " + (timestampsRemaining + timestampsEvictedCnt) + "/"
                            + timestampsEvictedCnt + " cells total/evicted: " + (cellsRemaining + cellsEvictedCnt)
                            + "/" + cellsEvictedCnt);
                } catch (final Throwable t) {
                    logger.error("error during eviction: " + t);
                }
            }
        }, EVICTION_INITIAL_DELAY, EVICTION_INTERVAL, TimeUnit.MILLISECONDS);
    }

    public static void addSysUtil(final long timestamp, final int rncId, final int cellId, final int cmUserCount,
            final int hsdschUserCount, final int dlNonHsTxPower, final int ulInterference) {
        final String key = String.format(KEY_FOMAT, rncId, CellUtil.getUnsignedCellId(cellId));
        ConcurrentHashMap<Long, InternalSystemUtilizationData> timestamp2sysUtils = cell2sysUtil.get(key);
        if (timestamp2sysUtils == null) {
            timestamp2sysUtils = new ConcurrentHashMap<Long, InternalSystemUtilizationData>();
            final ConcurrentHashMap<Long, InternalSystemUtilizationData> other = cell2sysUtil.putIfAbsent(key,
                    timestamp2sysUtils);
            if (other != null) {
                timestamp2sysUtils = other;
            }
        }

        final long timestampForComparison = Util.floorTime(timestamp);
        InternalSystemUtilizationData data = timestamp2sysUtils.get(timestampForComparison);
        if (data == null) {
            data = new InternalSystemUtilizationData(cmUserCount, hsdschUserCount, dlNonHsTxPower, ulInterference);
            data = timestamp2sysUtils.putIfAbsent(timestampForComparison, data);
            if (data != null) {
                data.add(cmUserCount, hsdschUserCount, dlNonHsTxPower, ulInterference);
            }
        } else {
            data.add(cmUserCount, hsdschUserCount, dlNonHsTxPower, ulInterference);
        }
    }

    public static InternalSystemUtilizationData getSysUtil(final long timestamp, final int rncId, final int cellId) {
        final String key = String.format(KEY_FOMAT, rncId, cellId);
        final Map<Long, InternalSystemUtilizationData> timestamp2sysUtils = cell2sysUtil.get(key);
        InternalSystemUtilizationData res = null;
        if (timestamp2sysUtils != null) {
            res = timestamp2sysUtils.get(timestamp);
            if (res != null) {
                res = res.computeCurrentAverages();
            }
        }

        return res;
    }

    public static final class InternalSystemUtilizationData implements Cloneable {
        private int cmUserCount;

        private int hsdschUserCount;

        private int dlNonHsTxPower;

        private int ulInterference;

        private int countCm = 0;

        private int countHs = 0;

        private int countPower = 0;

        private int countUi = 0;

        private final long timestamp;

        private void handleCm(final int cmUsers) {
            if (cmUsers >= 0) {
                this.cmUserCount += cmUsers;
                ++countCm;
            }
        }

        private void handleHs(final int hsUSers) {
            if (hsUSers >= 0) {
                this.hsdschUserCount += hsUSers;
                ++countHs;
            }
        }

        private void handlePower(final int power) {
            if (power >= 0) {
                this.dlNonHsTxPower += power;
                ++countPower;
            }
        }

        private void handleUi(final int ui) {
            if (ui >= 0) {
                //				this.ulInterference = (int)(-112.1 + 0.1 * ui);
                this.ulInterference += ui;
                ++countUi;
            }
        }

        public InternalSystemUtilizationData(final int cmUserCount, final int hsdschUserCount,
                final int dlNonHsTxPower, final int ulInterference) {
            handleCm(cmUserCount);
            handleHs(hsdschUserCount);
            handlePower(dlNonHsTxPower);
            handleUi(ulInterference);
            //			this.cmUserCount = cmUserCount;
            //			this.hsdschUserCount = hsdschUserCount;
            //			this.dlNonHsTxPower = dlNonHsTxPower;
            //			this.ulInterference = (int)(-112.1 + 0.1 * ulInterference);
            timestamp = System.currentTimeMillis();
            //			count = 1;
        }

        public synchronized void add(final int cmUserCount, final int hsdschUserCount, final int dlNonHsTxPower,
                final int ulInterference) {
            handleCm(cmUserCount);
            handleHs(hsdschUserCount);
            handlePower(dlNonHsTxPower);
            handleUi(ulInterference);
            //			this.cmUserCount += cmUserCount;
            //			this.hsdschUserCount += hsdschUserCount;
            //			this.dlNonHsTxPower += dlNonHsTxPower;
            //			this.ulInterference += (-112.1 + 0.1 * ulInterference);
            //			count++;
        }

        public synchronized InternalSystemUtilizationData computeCurrentAverages() {
            if (countCm > 1) {
                cmUserCount = cmUserCount / countCm;
                countCm = 1;
            }
            if (countPower > 1) {
                dlNonHsTxPower = dlNonHsTxPower / countPower;
                countPower = 1;
            }
            if (countHs > 1) {
                hsdschUserCount = hsdschUserCount / countHs;
                countHs = 1;
            }
            if (countUi > 1) {
                ulInterference = ulInterference / countUi;
                countUi = 1;
            }
            //			if (count > 1) {
            //				cmUserCount = (int) (cmUserCount / count);
            //				hsdschUserCount = (int) (hsdschUserCount / count);
            //				dlNonHsTxPower = (int) (dlNonHsTxPower / count);
            //				ulInterference = (int) (ulInterference / count);
            //				count = 1;
            //			}

            try {
                return (InternalSystemUtilizationData) clone();
            } catch (final CloneNotSupportedException e) {
                // Should never happen since we are cloneable
                throw new RuntimeException(e);
            }
        }

        public long getTimestamp() {
            return timestamp;
        }

        public int getCmUserCount() {
            return cmUserCount;
        }

        public int getHsdschUserCount() {
            return hsdschUserCount;
        }

        public int getDlNonHsTxPower() {
            return dlNonHsTxPower;
        }

        public int getUlInterference() {
            return ulInterference;
        }

        //		public int getCount() {
        //			return count;
        //		}

        @Override
        public String toString() {
            return "InternalSystemUtilizationData [cmUserCount=" + cmUserCount + ", hsdschUserCount=" + hsdschUserCount
                    + ", dlNonHsTxPower=" + dlNonHsTxPower + ", ulInterference=" + ulInterference //+ ", count=" + count
                    + "]";
        }
    }
}
