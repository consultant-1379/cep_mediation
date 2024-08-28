package com.ericsson.cepmediation.base.properties;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.features.impl.FeatureManagerImpl;
import com.ericsson.cepmediation.base.proc.config.NE_TYPE;
import com.ericsson.cepmediation.config.bean.NetworkElement;
import com.ericsson.cepmediation.config.bean.ProcessType;

public class ProcessPrinter {

    private static final Logger logger = LoggerFactory.getLogger(ProcessPrinter.class);

    private static final StringBuilder builder = new StringBuilder();

    public static String newline = System.getProperty("line.separator");

    private static int width = 150;

    public static void printProcesses(List<ProcessType> processes, Map<String, String> properties) {
        List<ProcessType> enabledProcesses = getEnabledProcesses(processes);
        if (!enabledProcesses.isEmpty()) {
            formStartingLine(enabledProcesses);
            for (ProcessType process : enabledProcesses) {
                printProcess(process, properties);
            }
            logger.info(newline + newline + builder.toString());
        }
    }

    private static void formStartingLine(List<ProcessType> processes) {
        int rncCount = getNumberOfNodesOfType(processes, NE_TYPE.GPEH.getValue());
        int sgnsCount = getNumberOfNodesOfType(processes, NE_TYPE.SGEH.getValue());
        int pcpCount = getNumberOfNodesOfType(processes, NE_TYPE.USER_PLANE.getValue());

        if (processes.size() == 1) {
            builder.append("            JVM-(PROCESS) LIST- TOTAL : " + processes.size() + " process contains: ");
        } else if (processes.size() > 1) {
            builder.append("            JVM-(PROCESS) LIST- TOTAL : " + processes.size() + " processes contains: ");
        }

        boolean isCommaReguired = false;
        if (rncCount == 1) {
            builder.append(rncCount + " RNC  ");
            isCommaReguired = true;
        } else if (rncCount > 1) {
            builder.append(rncCount + " RNCs ");
            isCommaReguired = true;
        }

        if (sgnsCount == 1) {
            if (isCommaReguired)
                builder.append(", ");
            builder.append(sgnsCount + " SGSN ");
            isCommaReguired = true;
        } else if (sgnsCount > 1) {
            if (isCommaReguired)
                builder.append(", ");
            builder.append(sgnsCount + " SGSNs ");
            isCommaReguired = true;
        }

        if (pcpCount == 1) {
            if (isCommaReguired)
                builder.append(", ");
            builder.append(pcpCount + " USER PLANE NODE (PCP) ");
        } else if (pcpCount > 1) {
            if (isCommaReguired)
                builder.append(", ");
            builder.append(pcpCount + " USER PLANE NODES (PCP) ");
        }

        builder.append(" - Memory:" + getTotalMemory(processes) + " mb" + newline);

    }

    private static int getTotalMemory(List<ProcessType> processes) {
        int totalMemory = 0;
        for (ProcessType process : processes) {
            if (isProcessEnabled(process)) {
                totalMemory += Integer.parseInt(process.getMemorySize());
            }

        }
        return totalMemory;
    }

    private static int getNumberOfNodesOfType(List<ProcessType> processes, int type) {
        int numberOfNodes = 0;
        List<NetworkElement> networkElementList = null;
        for (ProcessType process : processes) {
            networkElementList = getLicencedNetworkElements(process);
            for (NetworkElement networkElement : networkElementList) {
                if (networkElement.getNeType() == type)
                    numberOfNodes++;
            }
        }
        return numberOfNodes;
    }

    private static void printProcess(ProcessType process, Map<String, String> properties) {

        drawWidth();
        drawLine(" -process Id: " + process.getProcid());
        List<NetworkElement> networkElementList = getLicencedNetworkElements(process);
        drawLine(" -number of Network Elements: " + networkElementList.size());
        int i = 1;
        for (NetworkElement networkElement : networkElementList) {
            drawLine("  " + i + ")." + " -label: " + networkElement.getLabel());
            drawLine("  " + " " + "  " + " -networkElementType: " + networkElement.getNeType() + " (" + NE_TYPE.getName(networkElement.getNeType()) + ")");
            drawLine("  " + " " + "  " + " -directory: " + networkElement.getDirectory());
            drawLine("  " + " " + "  " + " -memory: " + networkElement.getMemorySize() + " mb.");
            drawLine("  " + " " + "  " + " -memory hint: " + networkElement.getMemoryHint());
            drawLine("  " + " " + "  " + " -Prefer serial processing: " + networkElement.getSerialProcessing());
            drawLine("  " + " " + "  " + getCollectionModeText(networkElement, properties));
            i++;
        }
        drawLine(" -Apply serial processing: " + process.getSerialProcessing());
        drawLine(" -total process memory: " + process.getMemorySize() + " mb.");
        drawWidth();
    }

    private static List<ProcessType> getEnabledProcesses(List<ProcessType> processes) {
        List<ProcessType> res = new ArrayList<ProcessType>();
        for (ProcessType process : processes) {
            if (isProcessEnabled(process)) {
                res.add(process);
            }
        }

        return res;
    }

    private static boolean isProcessEnabled(ProcessType process) {
        return !getLicencedNetworkElements(process).isEmpty();
    }

    private static List<NetworkElement> getLicencedNetworkElements(ProcessType process) {
        List<NetworkElement> res = new ArrayList<NetworkElement>();
        List<NetworkElement> networkElementList = process.getNetworkElements().getNetworkElement();
        boolean userPlaneEnabled = FeatureManagerImpl.getInstance().isUserPlaneEnabled();
        for (NetworkElement networkElement : networkElementList) {
            if (!userPlaneEnabled && networkElement.getNeType() == 3) {
                continue;
            }
            res.add(networkElement);
        }

        return res;
    }

    private static String getCollectionModeText(NetworkElement networkElement, Map<String, String> properties) {
        String collectionModeString = " -collection mode: ";

        if (NE_TYPE.GPEH.getValue() == networkElement.getNeType() && properties.get("general.server.radio.file.collection.mode").equalsIgnoreCase("REMOTE")) {
            collectionModeString += " connection to the REMOTE Host: " + networkElement.getIp() + " with User : " + networkElement.getUname();
        } else if (NE_TYPE.GPEH.getValue() == networkElement.getNeType()
                && properties.get("general.server.radio.file.collection.mode").equalsIgnoreCase("LOCAL")) {
            collectionModeString += " connected LOCALLY";
        } else if (NE_TYPE.GPEH.getValue() == networkElement.getNeType()
                && properties.get("general.server.radio.file.collection.mode").equalsIgnoreCase("SYMBOLIC_LINK")) {
            collectionModeString += " connected via SYMBOLIC LINK";
        } else if (NE_TYPE.SGEH.getValue() == networkElement.getNeType()
                && properties.get("general.server.core.file.collection.mode").equalsIgnoreCase("REMOTE")) {
            collectionModeString += " connection to the REMOTE Host: " + networkElement.getIp() + " with User : " + networkElement.getUname();
        } else if (NE_TYPE.SGEH.getValue() == networkElement.getNeType()
                && properties.get("general.server.core.file.collection.mode").equalsIgnoreCase("LOCAL")) {
            collectionModeString += " connected LOCALLY";
        } else if (NE_TYPE.SGEH.getValue() == networkElement.getNeType()
                && properties.get("general.server.core.file.collection.mode").equalsIgnoreCase("SYMBOLIC_LINK")) {
            collectionModeString += " connected via SYMBOLIC LINK";
        } else if (NE_TYPE.USER_PLANE.getValue() == networkElement.getNeType()
                && properties.get("general.probe.file.collection.mode").equalsIgnoreCase("REMOTE")) {
            collectionModeString += " connection to the REMOTE Host: " + networkElement.getIp() + " with User : " + networkElement.getUname();
        } else if (NE_TYPE.USER_PLANE.getValue() == networkElement.getNeType()
                && properties.get("general.probe.file.collection.mode").equalsIgnoreCase("LOCAL")) {
            collectionModeString += " connected LOCALLY";
        } else if (NE_TYPE.USER_PLANE.getValue() == networkElement.getNeType()
                && properties.get("general.probe.file.collection.mode").equalsIgnoreCase("SYMBOLIC_LINK")) {
            collectionModeString += " connected via SYMBOLIC LINK";
        }

        return collectionModeString;
    }

    private static void drawWidth() {
        String message = "";
        for (int i = message.length(); i < width + 1; i++) {
            message += "-";
        }
        builder.append(message + newline);
    }

    private static void drawLine(String message) {
        builder.append("|" + drawMessage(message) + "|" + newline);
    }

    private static String drawMessage(String message) {
        for (int i = message.length(); i < width; i++) {
            message += " ";
        }
        return message;
    }
}
