package com.ericsson.cepmediation.forwarding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.service.ServiceExecuter;
import com.ericsson.cepmediation.base.util.ConfigData;

/**
 * This class instantiates and configures ForwarderListener.
 * 
 * It instantiates also the actual forwarder implementation class to which events will be forwarded.
 */
public class ForwarderListenerExecuter implements ServiceExecuter {
    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(ForwarderListenerExecuter.class);

    // A name string for the forwarder listener
    private static final String LISTENER_NAME = "Forwarder Listener";

    private ForwarderListener listener;

    /*
     *private constructor to prevent overriding and maintain code structure 
     */
    private ForwarderListenerExecuter() {

    }

    /**
     * Single point creation method for this class
     */
    public static ForwarderListenerExecuter create() {
        return new ForwarderListenerExecuter();
    }

    @Override
    public void init(final ConfigData data, final ServiceConfigBean configData) {
        final String clazz = configData.getForwarderType();
        try {
            final Forwarder forwarder = (Forwarder) Class.forName(clazz).newInstance();
            forwarder.init(configData);
            listener = new ForwarderListener(LISTENER_NAME, forwarder, configData.getEventListening().getTopicName());
        } catch (final Exception e) {
            logger.error(e.getMessage());
            throw new IllegalStateException("Failed to load forwarder class " + clazz);
        }
    }

    @Override
    public void execute() {
    }

    @Override
    public void terminate() {
        logger.trace("close()-->");
        listener.close();
        logger.trace("close()<--");
    }
}
