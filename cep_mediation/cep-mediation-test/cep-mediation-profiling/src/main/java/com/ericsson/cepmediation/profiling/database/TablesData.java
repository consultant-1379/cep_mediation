package com.ericsson.cepmediation.profiling.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * This class encapsulates size data about different tables.
 * 
 * Size data represents the number of new records in the table at a specific point in time.
 * 
 * @author emicned
 *
 */
public class TablesData {
    private Map<String, SizeData> table2size = new HashMap<String, SizeData>();
    
    public List<String> getTables(){
        // return defensive copy to prevent modifications outside this class
        return new ArrayList<String>(table2size.keySet());
    }

    public void addTable(String table, int initialSize) {
        if (table == null || table.isEmpty() || initialSize < 0) {
            throw new IllegalArgumentException(String.format("invalid name or size: %s/%s", table, initialSize));
        }
        table2size.put(table, new SizeData(initialSize));
    }
    
    public void addSizeData(String table, long time, int size) {
        if (!table2size.containsKey(table)){
            throw new IllegalArgumentException("Table not found: " + table + ". Available tables: " + table2size.keySet());
        }
        
        table2size.get(table).addSize(time, size);
    }
    
    public Map<Long,Integer> getSizeData(String table){
        return table2size.get(table).getTime2size();
    }

    private class SizeData {
        private int lastSize;

        private Map<Long, Integer> time2size = new TreeMap<Long, Integer>();

        SizeData(int size) {
            lastSize = size;
        }
        
        Map<Long,Integer> getTime2size(){
            return time2size;
        }
        
        void addSize(long time, int size) {
            time2size.put(time, size - lastSize);
            lastSize = size;
        }

        @Override
        public String toString() {
            return "SizeData [lastSize=" + lastSize + ", time2size=" + time2size + "]";
        }
        
    }

    @Override
    public String toString() {
        return "TablesData [table2size=" + table2size + "]";
    }
    
    
}
