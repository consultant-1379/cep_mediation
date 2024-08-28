package com.ericsson.cepmediation.base.publishing.impl;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.proc.config.EventListening;
import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;

public class AutoFlushingPublisher extends EventBusPublisher implements Runnable {
    private static final Logger logger = LoggerFactory.getLogger(AutoFlushingPublisher.class);

    private ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

    public AutoFlushingPublisher(final int flushingInterval, List<EventListening> eventListeners) {
        super(CepMediationProperties.getIntProperty(CepMediationProperty.PUBLISHING_BUFFER_SIZE), eventListeners);
        executor.scheduleAtFixedRate(this, flushingInterval, flushingInterval, TimeUnit.MILLISECONDS);
    }

    public AutoFlushingPublisher(String dataLabel, final int flushingInterval) {
        super(dataLabel, CepMediationProperties.getIntProperty(CepMediationProperty.PUBLISHING_BUFFER_SIZE));
        executor.scheduleAtFixedRate(this, flushingInterval, flushingInterval, TimeUnit.MILLISECONDS);
    }

    public AutoFlushingPublisher(final int flushingInterval, List<EventListening> eventListeners, String dataLabel) {
        super(flushingInterval, eventListeners, dataLabel);
        executor.scheduleAtFixedRate(this, flushingInterval, flushingInterval, TimeUnit.MILLISECONDS);
    }

    @Override
    public void run() {
        logger.debug("Publishing buffer flushing thread started");

        flush();

        logger.debug("Publishing buffer flushing thread stopped");
    }

    @Override
    public void close() {
        executor.shutdown();
    }
}