package com.ericsson.cepmediation.server.management.helper;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.Timer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.server.management.AgentData;

public class NodeMonitor implements Observer {
    private static final Logger logger = LoggerFactory.getLogger(NodeMonitor.class);

    private final Map<String, Timer> timerMap = new HashMap<String, Timer>();

    @Override
    public void update(final Observable arg0, final Object input) {
        final AgentData bean = (AgentData) input;
        // not start a timer task to monitor the server
        if (bean.isEnableMonitor()) {

            final Timer timer = new Timer();
            final HBMonitor instance = new HBMonitor(bean);
            timer.scheduleAtFixedRate(instance, 0, 5 * 60 * 1000);
            timerMap.put(bean.getHost(), timer);
            logger.debug("Node Monitor adding: " + bean.getHost());
        } else {
            final Timer timer = timerMap.get(bean.getHost());
            timer.cancel();
            timer.purge();
            logger.debug("Node Monitor removing: " + bean.getHost());
        }
    }

    public void stopMonitor() {
        for (final String keys : timerMap.keySet()) {
            final Timer timer = timerMap.get(keys);
            if (timer != null) {
                timer.cancel();
            }
        }
    }

}
