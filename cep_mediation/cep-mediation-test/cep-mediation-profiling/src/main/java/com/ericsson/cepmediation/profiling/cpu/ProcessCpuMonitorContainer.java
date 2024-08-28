package com.ericsson.cepmediation.profiling.cpu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.ericsson.cepmediation.profiling.BaseService;
import com.ericsson.cepmediation.profiling.INTERVALS;

public class ProcessCpuMonitorContainer extends BaseService {
    private final Logger logger = Logger.getLogger(ProcessCpuMonitor.class);

    private List<ProcessCpuMonitor> services = new ArrayList<ProcessCpuMonitor>();

    private static final String ALIASES_PARAM = "aliases=";
    private static final String PROCESSES_PARAM = "processes=";
    

    @Override
    public List<String> getData(INTERVALS interval) {
        List<String> res = new ArrayList<String>();
        for (ProcessCpuMonitor service : services ){
            res.addAll(service.getData(interval));
        }
        return res;
    }

    @Override
    public String getSummary() {
        StringBuilder  res = new StringBuilder();
        for (ProcessCpuMonitor service : services ){
            res.append(service.getSummary());
        }
        return res.toString();
    }

    @Override
    public void run() {
        // blank 
    }

    public void init(Date start, String[] args) {
        if (args.length == 0 || args.length % 2 != 0) {
            throw new IllegalArgumentException("Invalid processes: " + Arrays.asList(args));
        }
        String[] processes = null;
        String[] aliases = null;
        for (String arg : args) {
            int pos = arg.trim().indexOf(PROCESSES_PARAM);
            if (pos > -1) {
                String keyStripped = arg.substring(pos + PROCESSES_PARAM.length());
                processes = keyStripped.trim().split(",");
            } else {
                pos = arg.trim().indexOf(ALIASES_PARAM);
                if (pos > -1) {
                    String keyStripped = arg.substring(pos + ALIASES_PARAM.length());
                    aliases = keyStripped.trim().split(",");
                }
            }
        }
        
        logger.info("Found following processes/aliases: " + Arrays.asList(processes) + "/" + Arrays.asList(aliases));

        if (processes != null && aliases != null) {
            if (processes.length != aliases.length) {
                throw new IllegalArgumentException("processes.length != aliases.length: " + Arrays.asList(processes) + " vs " + Arrays.asList(aliases));
            }
            for (int i = 0; i < processes.length; i++) {
                ProcessCpuMonitor service = new ProcessCpuMonitor(processes[i], aliases[i]);
                service.init(start, args);
                services.add(service);
            }
            
            logger.debug("Started services: " + services);
        }
    }
}
