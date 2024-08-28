package com.ericsson.cepmediation.standalone;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.service.ServiceException;
import com.ericsson.cepmediation.base.service.ServiceExecuter;
import com.ericsson.cepmediation.base.util.ConfigData;
import com.ericsson.cepmediation.standalone.listener.IMEITopicListener;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.ITopic;

/**
 * This class inits the hazelcast topic listener which encapsulates
 * the IMEI enrichment business logic.
 * 
 * @author emicned
 *
 */
public class IMEIEnrichmentServiceExecuter implements ServiceExecuter {
    private static final Logger logger = LoggerFactory.getLogger(IMEIEnrichmentServiceExecuter.class);

    private ITopic<List<ApEventBean>> hazelcastTopic;

    @Override
    public void init(ConfigData data, ServiceConfigBean serviceData) {
        String hazelcastTopicName = serviceData.getHazelcastTopic();
        logger.info("Listening for remote events on topic: " + hazelcastTopicName);
        hazelcastTopic = Hazelcast.getTopic(hazelcastTopicName);
        logger.info("IMEIEnrichmentService inited");
    }

    @Override
    public void execute() throws ServiceException {
        hazelcastTopic.addMessageListener(new IMEITopicListener());
        logger.info("IMEIEnrichmentService started");
    }

    @Override
    public void terminate() {
        Hazelcast.getLifecycleService().shutdown();
        logger.info("IMEIEnrichmentService terminated");
    }

    public static ServiceExecuter create() {
        return new IMEIEnrichmentServiceExecuter();
    }
}
