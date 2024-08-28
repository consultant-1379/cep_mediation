package com.ericsson.cepmediation.base.statistics.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.statistics.Statistics;
import com.ericsson.cepmediation.base.statistics.StatisticsCollector;

public final class DefaultStatistics implements Statistics {

    private static final Logger logger = LoggerFactory.getLogger(StatisticsCollector.class);

    private final Map<String, Object> map;

    public DefaultStatistics() {
        map = new HashMap<String, Object>();
    }

    @Override
    public void add(final String key, final Object value) {
        if (map.containsKey(key)) {
            logger.warn("Key '" + key + "' is already present, replacing it with '" + value + "'");
        }
        map.put(key, value);
    }

    @Override
    public String toString() {
        //final StringBuilder buffer = new StringBuilder();
        final TreeSet<String> keys = new TreeSet<String>(map.keySet());
        String key = null;
        for (final Iterator<String> iterator = keys.iterator(); iterator.hasNext();) {
            key = iterator.next();
            //buffer.append(key).append('=').append(map.get(key)).append('\n');
            logger.trace(key + "=" + map.get(key));
        }
        //		for(Entry<String, Object> entry : map.entrySet()) {
        //			buffer.append(entry.getKey()).append('=').append(entry.getValue()).append('\n');
        //		}
        return "";//buffer.toString();
    }
}
