package com.ericsson.cepmediation.forwarding.hazelcast;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.forwarding.Forwarder;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.ITopic;

/**
 * This class just forwards all events it receives to the hazelcast topic specified
 * in its configuration. Events are buffered before sending.
 * 
 * @author emicned
 *
 */
public class HazelcastForwarder implements Forwarder {
    private static final int FLUSH_INTERVAL = CepMediationProperties.getIntProperty(CepMediationProperty.IMEI_ENRICHMENT_HAZELCAST_FLUSH_INTERVAL);

    private static final Logger logger = LoggerFactory.getLogger(HazelcastForwarder.class);

    // the remote hazelcast topic
    private ITopic<List<ApEventBean>> topic;

    private List<ApEventBean> buffer = new ArrayList<ApEventBean>();

    private final Lock lock = new ReentrantLock();

    private final ScheduledExecutorService scheduledExecutor = Executors.newSingleThreadScheduledExecutor();

    @Override
    public void init(ServiceConfigBean configData) {
        String topicName = configData.getHazelcastTopic();
        topic = Hazelcast.getTopic(topicName);
        scheduledExecutor.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                try {
                    flush();
                } catch (Exception e) {
                    logger.error("Error sending events!", e);
                }
            }
        }, FLUSH_INTERVAL, FLUSH_INTERVAL, TimeUnit.MILLISECONDS);
        logger.info("Sucessfully inited hazelcast forwarding topic " + topicName);
    }

    @Override
    public void forward(ApEventBean event) {
        try {
            lock.lock();
            buffer.add(event);
        } finally {
            lock.unlock();
        }
    }

    private void flush() {
        if (!buffer.isEmpty()) {
            List<ApEventBean> events = buffer;
            try {
                lock.lock();
                buffer = new ArrayList<ApEventBean>();
            } finally {
                lock.unlock();
            }

            topic.publish(events);

            logger.debug("IMEIEnrichment: Sent " + events.size() + " events to IMEI Enrichment service");
        }
    }

    @Override
    public void close() {
        flush();
        Hazelcast.getLifecycleService().shutdown();
        scheduledExecutor.shutdown();
        logger.info("Stopped hazelcast service");
    }
}
