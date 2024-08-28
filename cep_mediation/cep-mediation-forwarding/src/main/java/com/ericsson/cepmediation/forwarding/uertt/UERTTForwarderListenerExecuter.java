/***------------------------------------------------------------------------------	
 *******************************************************************************	
 * COPYRIGHT Ericsson 2013	
 *	
 * The copyright to the computer program(s) herein is the property of	
 * Ericsson Inc. The programs may be used and/or copied only with written	
 * permission from Ericsson Inc. or in accordance with the terms and	
 * conditions stipulated in the agreement/contract under which the	
 * program(s) have been supplied.	
 *******************************************************************************
-----------------------------------------------------------------------------------------------*/
package com.ericsson.cepmediation.forwarding.uertt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.service.ServiceExecuter;
import com.ericsson.cepmediation.base.util.ConfigData;

/**
 * @author xalomis
 */
public class UERTTForwarderListenerExecuter implements ServiceExecuter {

    private static final Logger logger = LoggerFactory
            .getLogger(UERTTForwarderListenerExecuter.class);

    private static final String LISTENER_NAME = "UERTT Forwarder Listener";

    private UERTTForwarderListener listener;

    private UERTTForwarderListenerExecuter() {

    }

    public static UERTTForwarderListenerExecuter create() {
        return new UERTTForwarderListenerExecuter();
    }

    @Override
    public void init(final ConfigData data, final ServiceConfigBean configData) {
        logger.info("In init UERTTForwarderListenerExecuter start");
        final String clazz = configData.getForwarderType();
        try {
            final UERTTForwarder forwarder = (UERTTForwarder) Class.forName(
                    clazz).newInstance();
            forwarder.init(configData);
            listener = new UERTTForwarderListener(LISTENER_NAME, forwarder,
                    configData.getEventListening().getTopicName());

        } catch (final Exception e) {
            logger.info(e.getMessage());
            throw new IllegalStateException("Failed to load forwarder class "
                    + clazz);
        }
        logger.info("In init UERTTForwarderListenerExecuter end");
    }

    @Override
    public void execute() {
    }

    @Override
    public void terminate() {
        logger.trace("UERTTForwarderListenerExecuter close()-->");
        listener.close();
        logger.trace("UERTTForwarderListenerExecuter close()<--");
    }
}
