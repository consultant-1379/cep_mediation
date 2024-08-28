package com.ericsson.cepmediation.profiling.mem;

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
import com.ericsson.cepmediation.profiling.util.Utils;
import com.ericsson.cepmediation.profiling.valueobject.GenericAverage;
import com.ericsson.cepmediation.profiling.valueobject.SystemData;

public class MemUtilizationMonitor extends BaseService {
    private static final String MEM_STRING = "Mem:";

    private final Logger logger = Logger.getLogger(MemUtilizationMonitor.class);

    // maps the free memory(as per free command) to the time it was measured
    private Map<Long, Double> time2mem = new ConcurrentSkipListMap<Long, Double>();

    private Map<INTERVALS, List<GenericAverage>> averages = new HashMap<INTERVALS, List<GenericAverage>>();

    public MemUtilizationMonitor() {
        setName("MemUtilizationMonitor");
    }

    @Override
    public List<String> getData(INTERVALS interval) {
        logger.debug("Computing intervals based on mem data: " + time2mem);
        List<String> res = new ArrayList<String>();

        String averagesLine = getAverages(interval, averages, time2mem);
        if (averages != null) {
            logger.debug("Averages for " + interval + " : " + averagesLine);
            res.add(averagesLine);
        }

        return res;
    }

    @Override
    public String getSummary() {
        SystemData totalAvg = new GenericAverage(INTERVALS.ONE_MIN, -1);
        for (GenericAverage d : averages.get(INTERVALS.ONE_MIN)) {
            totalAvg = totalAvg.add(d);
        }
        return String.format("Average mem usage: %s", totalAvg.getData());
    }

    @Override
    public void run() {
        Process proc = null;
        BufferedReader br = null;
        try {
            proc = Runtime.getRuntime().exec("free -g -s " + SAMPLING_INTERVAL);
            br = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            while (!isInterrupted()) {
                String line = null;
                while ((line = br.readLine()) != null) {
                    int pos = line.toLowerCase().indexOf(MEM_STRING);
                    if (pos > -1) {
                        addMemData(line);
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

    private void addMemData(String data) {
        //               total       used       free     shared    buffers     cached
        // Mem:            31         18         12          0          0         1
        data = data.substring(data.indexOf(MEM_STRING) + MEM_STRING.length());
        data = data.trim();
        String[] tokens = data.split("\\s+");
        int totalMem = Integer.valueOf(tokens[0].trim());
        int freeMem = Integer.valueOf(tokens[2].trim());
        Double memUsage = new Double(Utils.calcPercentage(freeMem, totalMem));
        time2mem.put(System.currentTimeMillis(), memUsage);
        logger.trace("current free mem: " + memUsage);
    }

    public static void main(String[] args) {
        String data = " Mem:            31         18         12          0          0         1";
        System.out.println(data.indexOf(MEM_STRING));
        data = data.substring(data.indexOf(MEM_STRING) + MEM_STRING.length());
        data = data.trim();
        System.out.println(data);
    }
}
