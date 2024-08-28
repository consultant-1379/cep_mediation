/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.publishing.eventbus.local;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.base.publishing.eventbus.EventBusTopic;

/**
 * @author eemecoy
 *
 */
public class LocalEventBusTest {

    private LocalEventBus localEventBus;

    @Before
    public void setup() {
        localEventBus = new LocalEventBus();
    }

    @Test
    public void testTopicCreatedIfDoesntAlreadyExist() {
        final String topicName = "newTopic";
        final EventBusTopic<Object> topic = localEventBus.getTopic(topicName);
        assertNotNull(topic);
        assertThat(topic.getName(), is(topicName));
    }

    @Test
    public void testSameTopicReturnedMultipleTimes() {
        final String topicName = "aTopic";
        final EventBusTopic<Object> topic = localEventBus.getTopic(topicName);
        final EventBusTopic<Object> topicAgain = localEventBus.getTopic(topicName);
        assertSame(topic, topicAgain);
    }

}
