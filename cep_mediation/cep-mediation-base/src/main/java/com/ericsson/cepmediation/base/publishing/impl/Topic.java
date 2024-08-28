package com.ericsson.cepmediation.base.publishing.impl;

/**
 * This class buffers the messages for a single topic in CEP Mediation until the buffer size is
 * reached or the buffer is flushed
 * 
 * @author eeilfn
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.meta.admin.MappedEvent;
import com.ericsson.cepmediation.base.publishing.eventbus.EventBusFactory;
import com.ericsson.cepmediation.base.publishing.eventbus.EventBusTopic;
import com.ericsson.cepmediation.base.util.Metrics;

public class Topic implements Comparable<Topic> {
    // Get the logger
    private static final Logger logger = LoggerFactory.getLogger(Topic.class);

    // Get a reference to the metrics logger
    private static final Logger metricLogger = LoggerFactory.getLogger(Metrics.class);

    // The buffer size to use
    private final int publishingBufferSize;

    // The event bus topic definition, defined as a list of event beans
    private final EventBusTopic<Collection<ApEventBean>> eventTopic;

    // The list of event types that may be published on this topic
    private final Set<String> eventTypeSet = new TreeSet<String>();

    // The message buffer
    private List<ApEventBean> messageBuffer;

    // Record if the last flush was active or not, if so, then ignore the next scheduled flush
    // on this topic
    boolean lastFlushWasActive = false;

    private String dataLabel = "";

    /**
     * Constructor, initiate the topic object for this topic
     * @param topicName The name of the topic
     * 
     */
    public Topic(final String topicName, final int publishingBufferSize) {
        this(topicName, "", publishingBufferSize);
    }

    /**
     * Constructor, initiate the topic object for this topic
     * @param topicName The name of the topic
     */
    public Topic(final String topicName, final String dataLabel, final int publishingBufferSize) {
        logger.trace("Constructor:" + topicName);

        this.publishingBufferSize = publishingBufferSize;

        messageBuffer = new ArrayList<ApEventBean>(publishingBufferSize);

        this.dataLabel = dataLabel;

        // Instantiate the topic object
        eventTopic = new EventBusFactory().getEventBus(false).getTopic(topicName);

    }

    /**
     * Add events to the list of events that this topic publishes
     * @param schemaType The schema type for publishing
     * @param events An array of mapped events that this publisher will publish
     * @param traceMessage Message to appear on traces
     */
    public synchronized void addEvents(final String schemaType, final Collection<MappedEvent> events,
            final String traceMessage) {
        logger.debug("adding " + events.size() + " events to topic " + eventTopic.getName() + ": " + traceMessage);

        // Add these events as legal events for this topic
        for (final MappedEvent mappedEvent : events) {
            final String absoluteEventName = schemaType + '.' + mappedEvent.getEvent().getName();

            // Check if the event is already in the set
            if (eventTypeSet.contains(absoluteEventName)) {
                logger.trace("event " + absoluteEventName + " aleready on topic " + eventTopic.getName() + ": "
                        + traceMessage);
            } else {
                eventTypeSet.add(absoluteEventName);
                logger.trace("added " + absoluteEventName + " to topic " + eventTopic.getName() + ": " + traceMessage);
            }
        }
    }

    /**
     * Add a single event to the list of events that this topic publishes
     * @param schemaType The schema type for publishing
     * @param event A mapped event that this publisher will publish
     */
    public synchronized void addEvent(final String absoluteEventName) {
        logger.debug("adding " + absoluteEventName + " to topic " + eventTopic.getName());

        // Add these events as legal events for this topic
        eventTypeSet.add(absoluteEventName);
    }

    /**
     * Remove events from the list of events that this topic publishes
     * @param schemaType The schema type for publishing
     * @param events An array of mapped events that this publisher will no longer publish
     */
    public synchronized void removeEvents(final String schemaType, final Collection<MappedEvent> events) {
        logger.debug("removing " + events.size() + " events from topic " + eventTopic.getName());

        // Remove all the events from the event set for this topic
        for (final MappedEvent mappedEvent : events) {
            final String absoluteEventName = schemaType + '.' + mappedEvent.getEvent().getName();
            logger.trace("removing " + absoluteEventName + " from topic " + eventTopic.getName());
            eventTypeSet.remove(absoluteEventName);
        }
    }

    /**
     * This method buffers event messages, it adds a message to the buffer and flushes
     * the buffer if it is full
     * @param event The event to add to the buffer
     */
    public synchronized void publish(final ApEventBean event) {
        // Check if the event type of this event is registered on this topic
        if (eventTypeSet.contains(event.getAbsoluteName())) {
            // Add the message to the buffer
            messageBuffer.add(event);

            // Check if the buffer should be flushed to the queue
            if (messageBuffer.size() >= publishingBufferSize) {
                logger.debug("message buffer size exceeded, flushing message buffer");
                // Flush the message buffer to the event bus topic
                publishToEventBus();
            }

            if (logger.isTraceEnabled()) {
                logger.trace(messageBuffer.size() + ":published on topic:" + eventTopic.getName() + ':'
                        + event.getDecodedString());
            }
        } else {
            if (logger.isTraceEnabled()) {
                logger.trace(messageBuffer.size() + ":not publshed, not on topic:" + eventTopic.getName() + ':'
                        + event.getDecodedString());
            }
        }
    }

    protected synchronized void flush() {
        if (messageBuffer.size() > 0) {
            // Flush the messages
            publishToEventBus();
        }
    }

    /**
     * This method publishes the message buffer to the event bus topic and flushes the buffer
     */
    private synchronized void publishToEventBus() {
        logger.trace("publishToEventBus:" + eventTopic.getName());

        // Sort the list
        Collections.sort(messageBuffer);

        // Publish the messages
        metricLogger.trace(eventTopic.getName() + ": " + messageBuffer.size() + " events for publication to bus");
        eventTopic.publish(messageBuffer, dataLabel);
        metricLogger.trace(eventTopic.getName() + ": " + messageBuffer.size() + " events published to bus");

        // Clear the buffer
        messageBuffer = new ArrayList<ApEventBean>(publishingBufferSize);
    }

    /**
     * Compares this topic to another topic
     * @param The other topic
     * @return The comparison result
     */
    @Override
    public int compareTo(final Topic topic) {
        return this.eventTopic.getName().compareTo(topic.eventTopic.getName());
    }
}
