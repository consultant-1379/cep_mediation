package com.ericsson.cepmediation.base.listening;

/**
 * This class is an abstract base class for an event listener. Listeners for events
 * inherit from this class
 */

import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.publishing.eventbus.EventBusFactory;
import com.ericsson.cepmediation.base.publishing.eventbus.EventBusTopic;
import com.ericsson.cepmediation.base.publishing.eventbus.Listener;

public abstract class TopicListener implements Listener<List<ApEventBean>> {
    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(TopicListener.class);

    // The name of the topic listener
    protected String name;

    /**
     * Constructor sets the name of the topic listener
     * @param name The topic listener name
     */
    public TopicListener(final String name) {
        this.name = name;
    }

    /**
     * Set the topics for subscription
     * @param topic The topic to subscribe on
     */
    public void setTopics(final Collection<String> topicCollection) {
        // Add all the topics in the list to the topic listener
        for (final String topic : topicCollection) {
            logger.debug(name + " is listening on topic:" + topic);

            // Get the topic from the event bus and add an event listener for the topic           
            final EventBusTopic<List<ApEventBean>> theTopic = new EventBusFactory().getEventBus(false).getTopic(topic);

            theTopic.addListener(this);
        }
    }

    /**
     * Get the name of this topic listener
     * @return The topic listener name
     */
    public String getName() {
        return name;
    }

    /**
     * Method that is called when a message list is received on this topic
     */
    @Override
    public abstract void onMessage(List<ApEventBean> events);
}
