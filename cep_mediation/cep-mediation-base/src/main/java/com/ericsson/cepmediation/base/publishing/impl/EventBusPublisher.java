package com.ericsson.cepmediation.base.publishing.impl;

/**
 * This class handles publishing of events from a schema type. It instantiates a topic for each event in the
 * schema. It also spawns a thread that flushes the topic buffers for each topic when
 * a timer expires.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.meta.admin.MappedEvent;
import com.ericsson.cepmediation.base.proc.config.EventListening;
import com.ericsson.cepmediation.base.properties.ConfigBinder;
import com.ericsson.cepmediation.base.publishing.Publisher;

public class EventBusPublisher implements Publisher {

    private static final Logger logger = LoggerFactory.getLogger(EventBusPublisher.class);

    protected final Map<String, Topic> topicMap = new HashMap<String, Topic>();

    private String dataLabel;

    private String currentFileName;

    private List<EventListening> eventListeners = new ArrayList<EventListening>();

    private final Integer publishingBufferSize;

    protected ReentrantLock lock = new ReentrantLock();

    public EventBusPublisher(final String dataLabel, final int publishingBufferSize) {
        this.publishingBufferSize = publishingBufferSize;
        this.dataLabel = dataLabel;
        eventListeners = ConfigBinder.getInstance().getAllEventListeners();
    }

    public EventBusPublisher(final int publishingBufferSize, List<EventListening> eventListeners) {
        this.publishingBufferSize = publishingBufferSize;
        this.eventListeners = eventListeners;
    }

    public EventBusPublisher(final int publishingBufferSize, List<EventListening> eventListeners, final String dataLabel) {
        this.publishingBufferSize = publishingBufferSize;
        this.eventListeners = eventListeners;
        this.dataLabel = dataLabel;
    }

    /**
     * Add events to the list of events that this topic publishes
     * 
     * @param schemaType
     *        The schema type for publishing
     * @param events
     *        An array of mapped events that this publisher will publish
     */
    @Override
    public void addEvents(final String schemaType, final Collection<MappedEvent> events) {
        logger.debug("adding " + events.size() + " events to event bus publisher");

        lock.lock();

        try {
            // Add these events to all other listeners
            for (final MappedEvent mappedEvent : events) {
                for (final EventListening eventListening : eventListeners) {
                    final String absoluteEventName = schemaType + '.' + mappedEvent.getEvent().getName();
                    if (eventListening.getEventTypes().contains(absoluteEventName)) {
                        final String topicName = eventListening.getTopicName();
                        Topic topic = topicMap.get(topicName);
                        if (topic == null) {
                            topic = new Topic(eventListening.getTopicName(), dataLabel, publishingBufferSize);
                            topicMap.put(topicName, topic);
                        }
                        topic.addEvent(absoluteEventName);
                    }
                }
            }

        } finally {
            lock.unlock();
        }
    }

    public void addEvent(final String absoluteEventName) {

        lock.lock();
        try {
            for (final EventListening eventListening : eventListeners) {
                if (eventListening.getEventTypes().contains(absoluteEventName)) {
                    final String topicName = eventListening.getTopicName();
                    Topic topic = topicMap.get(topicName);
                    if (topic == null) {
                        topic = new Topic(eventListening.getTopicName(), dataLabel, publishingBufferSize);
                        topicMap.put(topicName, topic);
                    }
                    topic.addEvent(absoluteEventName);
                }
            }

        } finally {
            lock.unlock();
        }
    }

    /**
     * Remove events from the list of events that this topic publishes
     * 
     * @param schemaType
     *        The schema type for publishing
     * @param events
     *        An array of mapped events that this publisher will no longer publish
     */
    @Override
    public void removeEvents(final String schemaType, final Collection<MappedEvent> events) {
        logger.debug("removing " + events.size() + " events from event bus publisher");

        lock.lock();
        try {
            for (final Topic topic : topicMap.values()) {
                // Remove the events from the topic
                topic.removeEvents(schemaType, events);
                topic.flush();
            }
        } finally {
            lock.unlock();
        }
    }

    /**
     * Publishes a message to a topic on this schema
     * 
     * @param event
     *        The event to publish
     */
    @Override
    public synchronized void publishMessage(final ApEventBean event) {
        if (logger.isTraceEnabled()) {
            logger.trace(event.getAbsoluteName() + ':' + event.getDecodedString());
        }

        lock.lock();
        try {
            // Send the event to all topics; it will be published on all topics for which it is valid
            for (final Topic topic : topicMap.values()) {
                topic.publish(event);
            }
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void close() {
    }

    /**
     * This method flushes all the topics to the event bus
     */
    @Override
    public void flush() {
        logger.trace("flushing publishing buffers . . .");

        lock.lock();
        try {
            // Iterate over the topics and flush them
            for (final Topic topic : topicMap.values()) {
                topic.flush();
            }
        } finally {
            lock.unlock();
        }

        logger.trace("publishing buffers flushed");
    }

    public String getCurrentFileName() {
        return currentFileName;
    }

    public void setCurrentFileName(String currentFileName) {
        this.currentFileName = currentFileName;
    }

}