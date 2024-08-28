package com.ericsson.cepmediation.base.properties;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.util.ErrorCode;
import com.ericsson.cepmediation.config.bean.NetworkElement;
import com.ericsson.cepmediation.config.bean.ProcessType;

public class ProcessValidator {
    private static final Logger logger = LoggerFactory.getLogger(ProcessValidator.class);

    public static void validate(List<ProcessType> processes) throws ConfigurationException {
        validateMemoryParameters(processes);
        validateLabelUniqueness(processes);
    }

    private static void validateLabelUniqueness(List<ProcessType> processes) throws ConfigurationException {
        List<String> labelList = new ArrayList<String>();
        List<NetworkElement> networkElementList = null;
        for (ProcessType process : processes) {
            networkElementList = process.getNetworkElements().getNetworkElement();
            for (NetworkElement networkElement : networkElementList) {
                if (labelList.contains(networkElement.getLabel())) {
                    throw new ConfigurationException("label : " + networkElement.getLabel()
                            + " exists more than once, labels should be unique", ErrorCode.NON_UNIQUE_LABEL);
                } else {
                    labelList.add(networkElement.getLabel());
                }
            }
        }
    }

    private static void validateMemoryParameters(List<ProcessType> processes) throws ConfigurationException {
        int requiredMemory = getTotalMemory(processes);
        long ramSizeInMb = -1;

        try {
            com.sun.management.OperatingSystemMXBean bean = (com.sun.management.OperatingSystemMXBean) java.lang.management.ManagementFactory
                    .getOperatingSystemMXBean();
            ramSizeInMb = bean.getTotalPhysicalMemorySize() / 1024 / 1024;
        } catch (Throwable e) {
            ramSizeInMb = -1;
        }

        if (ramSizeInMb != -1 && ramSizeInMb < requiredMemory) {
        	throw new ConfigurationException("Total Memory Available on Machine is : "
                    + ramSizeInMb + " MB. Required Memory to Run the Application is : " + requiredMemory + " MB.",
                    ErrorCode.NOT_ENOUGH_FREE_MEMORY);
        }
    }

    private static int getTotalMemory(List<ProcessType> processes) {
        int totalMemory = 0;
        List<NetworkElement> networkElementList = null;
        for (ProcessType process : processes) {

            totalMemory += Integer.parseInt(process.getMemorySize());

        }
        return totalMemory;
    }

}
