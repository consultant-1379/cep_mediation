package com.ericsson.cepmediation.profiling.cpu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * This class collects statistics about cpu utilization in the same way its base class does with the
 * only difference being that statistics are collected for a specific process.
 * 
 * @author emicned
 *
 */
public class ProcessCpuMonitor extends CpuMonitor {
    private final Logger logger = Logger.getLogger(ProcessCpuMonitor.class);

    private static final int TOP_SAMPLING_INTERVAL_SECS = 5;

    private static final String TOP_CMD = "top -b -n 1";

    private static final String TOP_CPU_HEADER = "%CPU";

    private String processId;

    private int cpuColumnIdx;

    private String alias;

    public ProcessCpuMonitor(String processId, String alias) {
        if (alias == null || alias.isEmpty() || processId == null || processId.isEmpty()) {
            throw new IllegalArgumentException("processId/alias is empty: " + processId + "/" + alias);
        }
        checkProcessRunning(processId);

        this.processId = processId;
        this.alias = alias;
        this.cpuColumnIdx = getCpuColumnIndex();
        setName("ProcessCpuMonitor");
    }

    protected String getDescription() {
        return alias + "(" + processId + ") ";
    }

    private void checkProcessRunning(String processId) {
        List<String> out = runSingleCmd("ps -p " + processId);
        for (String line : out) {
            if (line.indexOf(processId.trim()) > -1) {
                return;
            }
        }

        throw new IllegalArgumentException("Not a valid process id: " + processId);
    }

    private int getCpuColumnIndex() {
        List<String> out = runSingleCmd(TOP_CMD);
        for (String line : out) {
            if (line.indexOf("PID") > -1 && line.indexOf("USER") > -1 && line.indexOf(TOP_CPU_HEADER) > -1) {
                String[] tokens = line.split("\\s");
                int idx = 0;
                for (String token : tokens) {
                    token = token.trim();
                    if (token.isEmpty()) {
                        continue;
                    }
                    if (token.trim().equalsIgnoreCase(TOP_CPU_HEADER)) {
                        return idx;
                    }
                    idx++;
                }
            }
        }

        throw new RuntimeException("Could not find the CPU column index in: " + out);
    }

    @Override
    public void run() {
        Process proc = null;
        BufferedReader br = null;
        try {
            while (!isInterrupted()) {
                proc = Runtime.getRuntime().exec(TOP_CMD + " -p " + processId);
                br = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = null;
                long now = System.currentTimeMillis();
                while ((line = br.readLine()) != null) {
                    if (!line.trim().startsWith(processId)) {
                        continue;
                    }
                    String[] tokens = line.split("\\s");
                    if (tokens.length + 1 < cpuColumnIdx) {
                        logger.warn("Could not find cpu col idx(" + cpuColumnIdx + ") int the line: " + line + " Tokens:" + Arrays.asList(tokens));
                        continue;
                    }
                    int idx = 0;
                    String cpuUtilStr = null;
                    for (int i = 0; i < tokens.length; i++) {
                        if (tokens[i].trim().isEmpty()) {
                            continue;
                        }
                        if (idx == cpuColumnIdx) {
                            cpuUtilStr = tokens[i];
                            break;
                        }
                        idx++;
                    }
                    try {
                        double cpuUtil = Double.parseDouble(cpuUtilStr);
                        logger.trace(alias + " CPU : " + cpuUtil);
                        time2cpuUtil.put(now, cpuUtil);
                    } catch (Exception e) {
                        logger.error("Could not parse cpu utilization: " + tokens[cpuColumnIdx] + " Tokens: " + Arrays.asList(tokens));
                    }
                }
                Thread.sleep(TOP_SAMPLING_INTERVAL_SECS * 1000);
            }
        } catch (InterruptedException e) {
            logger.error("Interrupted!", e);
            close(proc, br);
            return;
        } catch (IOException e) {
            logger.error("Error reading command results", e);
            close(proc, br);
            return;
        } catch (Throwable t) {
            logger.error("Error retrievening cpu utilization data: " + t);
            close(proc, br);
            return;
        } finally {
            close(proc, br);
        }
    }

    @Override
    public String toString() {
        return "ProcessCpuMonitor [processId=" + processId + ", cpuColumnIdx=" + cpuColumnIdx + ", alias=" + alias + "]";
    }
}
