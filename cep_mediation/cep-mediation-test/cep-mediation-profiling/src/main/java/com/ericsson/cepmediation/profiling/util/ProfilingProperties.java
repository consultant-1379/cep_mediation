package com.ericsson.cepmediation.profiling.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.ericsson.cepmediation.base.resourceloading.ResourceFileFinder;
import com.ericsson.cepmediation.base.resourceloading.ResourceLoadingFailedException;
import com.ericsson.cepmediation.profiling.MonitorService;

public class ProfilingProperties {
    private static final String SEPARATOR = ",";

    private final Logger logger = Logger.getLogger(ProfilingProperties.class);

    public static final ProfilingProperties instance = new ProfilingProperties();

    private static final String PROFILING_PROPERTIES = "profiling.properties";

    private Properties props;

    private ProfilingProperties() {
        props = loadProps();
        logger.info("Sucessfully read properties: " + props);
    }

    public String getProfilingFilePath() {
        return props.getProperty("profiling.file.path");
    }

    public Class<MonitorService>[] getProfilingServices() {
        String services = props.getProperty("profiling.services");
        services = services.trim();
        String[] clazzes = services.split(SEPARATOR);
        Class<MonitorService>[] res = new Class[clazzes.length];
        for (int i = 0; i < clazzes.length; i++) {
            try {
                res[i] = (Class<MonitorService>) Class.forName(clazzes[i].trim());
            } catch (ClassNotFoundException e) {
                logger.error(e);
                throw new RuntimeException(e);
            }
        }
        return res;
    }

    public long getProfilingDuration() {
        return Long.valueOf(props.getProperty("profiling.duration").trim()) * 60 * 1000;
    }

    public String getDatabaseConnectionString() {
        return props.getProperty("database.connection.string");
    }

    public String getDatabaseUser() {
        return props.getProperty("database.user");
    }

    public String getDatabasePass() {
        return props.getProperty("database.pass");
    }

    public List<String> getTables() {
        List<String> res = new ArrayList<String>();
        String tables = props.getProperty("database.tables");
        if (tables == null || tables.trim().isEmpty()) {
            return res;
        }
        String[] tablesArray = tables.trim().split(SEPARATOR);
        for (String t : tablesArray){
            res.add(t.trim());
        }
        
        return res;
    }

    private Properties loadProps() {
        Properties props = new Properties();
        InputStream in;
        try {
            in = new ResourceFileFinder().findResourceFile(PROFILING_PROPERTIES);
            if (in == null) {
                throw new RuntimeException("Could not resolve config file:" + PROFILING_PROPERTIES);
            }
            props.load(in);
        } catch (ResourceLoadingFailedException e) {
            logger.error(e);
            throw new RuntimeException("could not read " + PROFILING_PROPERTIES, e);
        } catch (IOException e) {
            logger.error(e);
            throw new RuntimeException("IO error reading " + PROFILING_PROPERTIES, e);
        }
        return props;
    }
}
