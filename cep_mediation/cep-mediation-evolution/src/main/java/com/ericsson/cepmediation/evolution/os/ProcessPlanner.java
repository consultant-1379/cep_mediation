package com.ericsson.cepmediation.evolution.os;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * This singleton is used to calculate the required processes etc
 * 
 * @author exuexie
 *
 */
public class ProcessPlanner {

    private static final Logger logger = LoggerFactory.getLogger(ProcessPlanner.class);

    private static ProcessPlanner instance;

    private long totalRam = -1;

    private long freeRam = -1;

    private ProcessPlanner() {

        try {
            com.sun.management.OperatingSystemMXBean bean = (com.sun.management.OperatingSystemMXBean) java.lang.management.ManagementFactory
                    .getOperatingSystemMXBean();
            totalRam = bean.getTotalPhysicalMemorySize() / 1024 / 1024;
            freeRam = bean.getFreePhysicalMemorySize() / 1024 / 1024;

            logger.debug("Total Memory: " + totalRam + "; Free memory: " + freeRam);





        } catch (Throwable e) {
            logger.warn(e.getMessage(), e);
        }

    }

    public static ProcessPlanner getInstance() {

        if (instance == null) {

            instance = new ProcessPlanner();
        }

        return instance;
    }

    public int getMaximumProcessNumber(long memory, float percent) {

        if (percent > 1) {

            throw new IllegalArgumentException("Expected percent should be smaller than 100%,while actual value:" + percent);
        }

        long allocatedMem = (long) (totalRam * percent);

        if (totalRam * percent > freeRam) {

            allocatedMem = freeRam;
        }

        return (int) (allocatedMem / memory);

    }

}
