package com.ericsson.cepmediation.profiling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.naming.ConfigurationException;

import org.apache.log4j.Logger;

import com.ericsson.cepmediation.profiling.util.ProfilingProperties;
import com.ericsson.cepmediation.profiling.util.Utils;

public class SystemMonitor extends Thread {
    private final Logger logger = Logger.getLogger(SystemMonitor.class);

    public static final String DATE_FORMAT = "yyyy.MM.dd HH:mm";

    private ExecutorService executor = Executors.newSingleThreadExecutor();

    private List<MonitorService> services = new ArrayList<MonitorService>();

    private long startTime;

    private String profilingFilePath = ProfilingProperties.instance.getProfilingFilePath();

    public SystemMonitor(Date start, String[] args) throws ConfigurationException, IOException {
        logger.info("Profiling data will be written to: " + profilingFilePath);

        startTime = start.getTime();

        Class<MonitorService>[] serviceClasses = ProfilingProperties.instance.getProfilingServices();
        logger.info("Enabled services: " + Arrays.asList(serviceClasses));
        for (Class<MonitorService> service : serviceClasses) {
            try {
                MonitorService monService = service.newInstance();
                monService.init(start, args);
                logger.info("Started service: " + monService.getClass().getName());
                services.add(monService);
            } catch (IllegalAccessException e) {
                logger.error(e);
                throw new RuntimeException(e);
            } catch (InstantiationException e) {
                logger.error(e);
                throw new RuntimeException(e);
            }
        }

        executor.submit(this);

        // stop profiling after the defined interval
        long profilingDuration = ProfilingProperties.instance.getProfilingDuration();
        Executors.newSingleThreadScheduledExecutor().schedule(new Runnable() {
            @Override
            public void run() {
                shutdown();
            }
        }, profilingDuration, TimeUnit.MILLISECONDS);
    }

    public void shutdown() {
        executor.shutdown();
        for (MonitorService service : services) {
            service.shutdown();
        }
    }

    public void run() {
        PrintWriter profilingFileWriter = null;
        try {
            while (!isInterrupted()) {
                // allow some time for one minute data to be collected
                Thread.sleep(INTERVALS.ONE_MIN.getMillis() + 60000);
                profilingFileWriter = new PrintWriter(new BufferedWriter(new FileWriter(new File(profilingFilePath))));
                Date now = new Date();
                for (INTERVALS interval : INTERVALS.values()) {
                    if (startTime + interval.getMillis()  < now.getTime()) {
                        String columns = getColumns(interval);
                        profilingFileWriter.println(columns);
                        logger.info(columns);
                        for (MonitorService service : services) {
                            List<String> data = service.getData(interval);
                            for (String line : data) {
                                profilingFileWriter.println(line);
                                logger.info(line);
                            }
                        }
                        profilingFileWriter.println();
                    }
                }

                for (MonitorService service : services) {
                    profilingFileWriter.println(service.getSummary());
                    logger.info(service.getSummary());
                }
                profilingFileWriter.flush();
            }
            
            profilingFileWriter.close();
        } catch (InterruptedException e) {
            logger.error("Interrupted!", e);
        } catch (IOException e) {
            logger.error("IO error for " + profilingFilePath, e);
        } catch(Throwable t) {
            logger.error("Internal error", t);
        } finally {
            if (profilingFileWriter != null ){
                profilingFileWriter.close();
            }
        }
        
    }

    private String getColumns(INTERVALS interval) {
        List<String> startTimes = computeStartTimes(interval);
        StringBuilder columnNames = new StringBuilder();
        columnNames.append(Utils.formatValue("Intervals"));
        columnNames.append(Utils.formatLine(startTimes.toArray(new String[] {})));
        return columnNames.toString();
    }

    private List<String> computeStartTimes(INTERVALS interval) {
        List<String> res = new ArrayList<String>();
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(startTime + interval.getMillis());
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
        Date now = new Date();
        while (cal.getTimeInMillis() < now.getTime()) {
            String date = formatter.format(cal.getTime());
            res.add(date);
            cal.add(Calendar.MILLISECOND, interval.getMillis());
        }
        return res;
    }

    public static void main(String[] args) throws Exception {
        Date d = new Date();
        d.setSeconds(d.getSeconds() + 50);
        final SystemMonitor mon = new SystemMonitor(d, args);
    }
}
