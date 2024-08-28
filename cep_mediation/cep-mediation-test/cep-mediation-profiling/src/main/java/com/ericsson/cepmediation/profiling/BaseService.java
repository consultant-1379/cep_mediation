package com.ericsson.cepmediation.profiling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import com.ericsson.cepmediation.profiling.util.Utils;
import com.ericsson.cepmediation.profiling.valueobject.GenericAverage;
import com.ericsson.cepmediation.profiling.valueobject.SystemData;

public abstract class BaseService extends Thread implements MonitorService {
    private final Logger logger = Logger.getLogger(BaseService.class);

    protected static final String PERCENT = "%";

    // the sampling interval in seconds
    protected static final int SAMPLING_INTERVAL = 5;

    private ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

    // the time sampling started
    protected long startTime;
    
    protected String[] args;

    @Override
    public void init(Date start, String[] args) {
        this.startTime = start.getTime();
        this.args = args;
        Date now = new Date();
        if (now.after(start)) {
            throw new IllegalArgumentException("Date is in the past. Current date: " + now + ". Start: " + start);
        }

        this.executor.schedule(this, startTime - now.getTime(), TimeUnit.MILLISECONDS);
    }

    protected String getAverages(INTERVALS interval, Map<INTERVALS, List<GenericAverage>> averages, Map<Long, Double> timestamp2measurement) {
        List<GenericAverage> currentData = averages.get(interval);
        if (currentData == null) {
            currentData = new ArrayList<GenericAverage>();
            averages.put(interval, currentData);
        }

        SystemData next = getNext(currentData);
        if (next == null) {
            next = new GenericAverage(interval, startTime + interval.getMillis());
        }

        List<SystemData> newData = computeNewData(next, timestamp2measurement);

        for (SystemData sd : newData) {
            currentData.add((GenericAverage) sd);
        }

        String title = getDescription() + "CPU Utilization Averages";
        return currentData.isEmpty() ? null : createDataLine(title, currentData);
    }

    // extracted to allow overwriting
    protected String getDescription() {
        return "";
    }

    protected List<SystemData> computeNewData(SystemData curr, Map<Long, ? extends Number> timestamp2measurement) {
        logger.trace("Computing new data until: " + curr.getEndTime());
        List<SystemData> res = new ArrayList<SystemData>();
        long now = System.currentTimeMillis();
        for (Map.Entry<Long, ? extends Number> entry : timestamp2measurement.entrySet()) {
            if (curr.getEndTime() >= now) {
                break;
            } else if (curr.getStartTime() < entry.getKey()) {
                if (entry.getKey() < curr.getEndTime()) {
                    curr.submit(entry.getValue());
                } else {
                    res.add(curr);
                    curr = curr.nextInstance();
                }
            }
        }

        logger.debug("New data: " + res);

        return res;
    }

    protected String createDataLine(String title, List<? extends SystemData> data) {
        StringBuilder res = new StringBuilder();
        res.append(Utils.formatValue(title));
        if (!data.isEmpty()) {
            for (SystemData d : data) {
                res.append(Utils.formatValue(d.getData()));
            }
        }
        return res.toString();
    }

    protected SystemData getNext(List<? extends SystemData> data) {
        if (!data.isEmpty()) {
            SystemData last = data.get(data.size() - 1);
            return last.nextInstance();
        }
        return null;
    }

    // enforce run method implementation
    public abstract void run();

    @Override
    public void shutdown() {
        executor.shutdown();
    }

    protected void close(Process p, Reader r) {
        if (p != null) {
            p.destroy();
        }
        try {
            if (r != null) {
                r.close();
            }
        } catch (IOException e) {
            logger.error(e);
        }
    }

    protected List<String> runSingleCmd(String cmd) {
        List<String> res = new ArrayList<String>();
        Process proc = null;
        BufferedReader br = null;
        try {
            logger.info("Running cmd: " + cmd);
            proc = Runtime.getRuntime().exec(cmd);
            br = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            Thread.sleep(3000);
            String line = null;
            while ((line = br.readLine()) != null) {
                res.add(line);
            }
        } catch (Exception e) {
            logger.error("Error reading the CPU column index", e);
            throw new RuntimeException(e);
        } finally {
            close(proc, br);
        }
        return res;
    }
}
