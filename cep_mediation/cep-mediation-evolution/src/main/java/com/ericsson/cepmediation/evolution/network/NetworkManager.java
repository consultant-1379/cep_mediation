package com.ericsson.cepmediation.evolution.network;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.database.iq.IqDatabaseManager;

/**
 * 
 * This Singelon class is used to analysis and collect network topology information
 * 
 * @author exuexie
 *
 */
public class NetworkManager {

    private static final Logger logger = LoggerFactory.getLogger(NetworkManager.class);

    private static NetworkManager instance;

    private final TreeMap<String, Integer> rncs;

    private NetworkManager() {

        Map<String, Integer> rets = IqDatabaseManager.getInstance().getRNCList();

        rncs = new TreeMap<String, Integer>(new ValueComparator(rets));
        rncs.putAll(rets);

    }

    public static NetworkManager getInstance() {

        if (instance == null) {
            instance = new NetworkManager();
        }

        return instance;
    }

    /**
     * Analysis the network topoloy
     * @return 
     */
    public Map<Integer, Map<Integer, List<String>>> planning(int hostNumber, int processNumber) {

        Map<Integer, Map<Integer, List<String>>> processes = new HashMap<Integer, Map<Integer, List<String>>>();

        int index = 0;

        for (final String rnc : rncs.keySet()) {

            int host = index % hostNumber;
            int processId = index % (hostNumber * processNumber) + 1;

            if (processes.get(host) == null) {

                processes.put(host, new HashMap<Integer, List<String>>());

            }

            if (processes.get(host).get(processId) == null) {

                processes.get(host).put(processId, new ArrayList<String>());

            }

            processes.get(host).get(processId).add(rnc);

            index++;

        }

        return processes;

    }

    class ValueComparator implements Comparator<String> {

        Map<String, Integer> base;

        public ValueComparator(Map<String, Integer> base) {
            this.base = base;
        }

        // Note: this comparator imposes orderings that are inconsistent with equals.    
        @Override
        public int compare(String a, String b) {
            if (base.get(a) >= base.get(b)) {
                return -1;
            } else {
                return 1;
            } // returning 0 would merge keys
        }
    }

}
