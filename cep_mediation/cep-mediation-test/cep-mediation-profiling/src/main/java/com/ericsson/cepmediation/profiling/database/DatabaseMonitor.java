package com.ericsson.cepmediation.profiling.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.ericsson.cepmediation.profiling.BaseService;
import com.ericsson.cepmediation.profiling.INTERVALS;
import com.ericsson.cepmediation.profiling.cpu.CpuMonitor;
import com.ericsson.cepmediation.profiling.util.ProfilingProperties;
import com.ericsson.cepmediation.profiling.valueobject.GenericCounter;
import com.ericsson.cepmediation.profiling.valueobject.SystemData;

public class DatabaseMonitor extends BaseService {
    private final Logger logger = Logger.getLogger(CpuMonitor.class);

    private static final String CNT_COL = "cnt";
    
    private static final String COUNT_SQL = "select count(*) as " + CNT_COL + " from ";

    private TablesData tablesData = new TablesData();

    private Map<INTERVALS, Map<String, List<GenericCounter>>> interval2tables = new HashMap<INTERVALS, Map<String, List<GenericCounter>>>();

    public DatabaseMonitor(){
        setName("DatabaseMonitor");
    }
    public void init(Date start, String[] args) {
        super.init(start, args);
        List<String> tables = ProfilingProperties.instance.getTables();
        if (tables.isEmpty()) {
            throw new RuntimeException("DatabaseMonitor service is enabled but no tables to track are specified.");
        }

        for (String table : tables) {
            int initialSize = getTableSize(table);
            tablesData.addTable(table, initialSize);
        }
    }

    @Override
    public List<String> getData(INTERVALS interval) {
        logger.debug("Tracking tables data: " + tablesData);
        
        List<String> res = new ArrayList<String>();

        Map<String, List<GenericCounter>> table2data = interval2tables.get(interval);
        if (table2data == null) {
            table2data = new HashMap<String, List<GenericCounter>>();
            for (String table : tablesData.getTables()) {
                table2data.put(table, new ArrayList<GenericCounter>());
            }
            interval2tables.put(interval, table2data);
        }

        for (Map.Entry<String, List<GenericCounter>> entry : table2data.entrySet()) {
            String table = entry.getKey();
            List<GenericCounter> currentData = entry.getValue();
            
            SystemData next = getNext(currentData);
            if (next == null) {
                next = new GenericCounter(interval, startTime + interval.getMillis());
            }

            Map<Long, Integer> sizeData = tablesData.getSizeData(table);

            List<SystemData> newData = computeNewData(next, sizeData);
            for (SystemData sd : newData) {
                currentData.add((GenericCounter) sd);
            }
            
            if (!currentData.isEmpty()) {
                res.add(createDataLine(table, currentData));
            }
        }
        
        return res;
    }

    @Override
    public String getSummary() {
        String summary = "Total number of events:";
        for (String table : tablesData.getTables()) {
            Map<Long,Integer> time2size = tablesData.getSizeData(table);
            int total = 0;
            for (Integer size : time2size.values()) {
                total += size;
            }
            summary += table + ":" + total +"  ";
        }
        return summary;
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(60 * 1000);
                long now = System.currentTimeMillis();
                for (String table : tablesData.getTables()) {
                    int size = getTableSize(table);
                    tablesData.addSizeData(table, now, size);
                    logger.debug("Table: " + table + " Size: " + size);
                }
            }
        } catch (InterruptedException e) {
            logger.error("Interrupted!", e);
            return;
        } catch (Throwable t) {
            logger.error("Error retrievening cpu utilization data: " + t);
            return;
        }
    }

    private int getTableSize(String table) {
        Connection conn = DatabaseManager.getInstance().getConnection();
        Statement stat = null;
        try {
            stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(COUNT_SQL + table);
            rs.next();
            return rs.getInt(CNT_COL);
        } catch (SQLException e) {
            logger.error("Error executing sql", e);
            throw new RuntimeException(e);
        } finally {
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    logger.error(e);
                }
            }
        }
    }

}
