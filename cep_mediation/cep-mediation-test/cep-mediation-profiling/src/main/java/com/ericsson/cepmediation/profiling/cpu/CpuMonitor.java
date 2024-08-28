package com.ericsson.cepmediation.profiling.cpu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

import org.apache.log4j.Logger;

import com.ericsson.cepmediation.profiling.BaseService;
import com.ericsson.cepmediation.profiling.INTERVALS;
import com.ericsson.cepmediation.profiling.valueobject.CpuStatesData;
import com.ericsson.cepmediation.profiling.valueobject.GenericAverage;
import com.ericsson.cepmediation.profiling.valueobject.SystemData;

/**
 * This class collects statistics about cpu utilization. The statistics are average CPU utilization and
 * percentage of idle/low/medium/high/ciritical CPU load.
 * 
 * @author emicned
 *
 */
public class CpuMonitor extends BaseService {
    protected static final String ALL_STRING = "all";

    private final Logger logger = Logger.getLogger(CpuMonitor.class);

    protected Map<Long, Double> time2cpuUtil = new ConcurrentSkipListMap<Long, Double>();

    private Map<INTERVALS, List<GenericAverage>> averages = new HashMap<INTERVALS, List<GenericAverage>>();

    private Map<INTERVALS, List<CpuStatesData>> cpuStates = new HashMap<INTERVALS, List<CpuStatesData>>();

    public CpuMonitor(){
        setName("CpuMonitor");
    }
    @Override
    public List<String> getData(INTERVALS interval) {
        logger.debug("Computing intervals based on cpu profiling data: " + time2cpuUtil);
        List<String> res = new ArrayList<String>();

        String averagesLine = getAverages(interval, averages, time2cpuUtil);
        if (averagesLine != null) {
            logger.debug("Averages for " + interval + " : " + averagesLine);
            res.add(averagesLine);
        }

        String cpuStatesLine = getStates(interval);
        if (cpuStatesLine != null) {
            logger.debug("States for " + interval + " : " + cpuStatesLine);
            res.add(cpuStatesLine);
        }

        return res;
    }

    private String getStates(INTERVALS interval) {
        List<CpuStatesData> currentData = cpuStates.get(interval);
        if (currentData == null) {
            currentData = new ArrayList<CpuStatesData>();
            cpuStates.put(interval, currentData);
        }

        SystemData next = getNext(currentData);
        if (next == null) {
            next = new CpuStatesData(interval, startTime + interval.getMillis());
        }

        List<SystemData> newData = computeNewData(next, time2cpuUtil);

        for (SystemData sd : newData) {
            currentData.add((CpuStatesData) sd);
        }
        String title = getDescription() + "CPU state";
        return currentData.isEmpty() ? null : createDataLine(title, currentData);
    }

    @Override
    public String getSummary() {
        long end = -1;
        SystemData totalAvg = new GenericAverage(INTERVALS.ONE_MIN, -1);
        for (GenericAverage d : averages.get(INTERVALS.ONE_MIN)) {
            totalAvg = totalAvg.add(d);
            end = d.getEndTime();
        }

        SystemData totalStates = new CpuStatesData(INTERVALS.ONE_MIN, -1);
        for (CpuStatesData s : cpuStates.get(INTERVALS.ONE_MIN)) {
            totalStates = totalStates.add(s);
        }

        return String.format(getDescription() + "Total time: %s mins. Total CPU utilization average: %s. Total CPU Utilization(Idle,Low,Medium,High,Critical): %s ",
                (end - startTime) / (1000 * 60), totalAvg.getComputedValue() + PERCENT, totalStates.getData());
    }

    @Override
    public void run() {
        Process proc = null;
        BufferedReader br = null;
        try {
            proc = Runtime.getRuntime().exec("mpstat -P ALL " + SAMPLING_INTERVAL);
            br = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            while (!isInterrupted()) {
                String line = null;
                while ((line = br.readLine()) != null) {
                    int pos = line.indexOf(ALL_STRING);
                    if (pos > -1) {
                        addCPUUtilizationData(line);
                    }
                }
                Thread.sleep(SAMPLING_INTERVAL * 1000);
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

    private void addCPUUtilizationData(String data) {
        // The data should look like this:
        // 01:36:33 PM all 0.47 0.00 0.24 0.03 0.00 0.01 0.00 0.00 99.25
        // and the names of columns are these:
        // 01:36:33 PM CPU %usr %nice %sys %iowait %irq %soft %steal %guest
        // %idle
        data = data.substring(data.indexOf(ALL_STRING) + ALL_STRING.length());
        data = data.trim();
        String[] tokens = data.split("\\s+");
        double usrUtil = Double.valueOf(tokens[0].trim());
        time2cpuUtil.put(System.currentTimeMillis(), usrUtil);
        logger.trace("current cpu util: " + usrUtil);
    }
}
