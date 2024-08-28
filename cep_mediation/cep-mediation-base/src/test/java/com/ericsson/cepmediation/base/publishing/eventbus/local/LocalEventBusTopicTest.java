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

import com.ericsson.cepmediation.base.publishing.eventbus.Listener;

/**
 * @author eemecoy
 *
 */
public class LocalEventBusTopicTest {

    private LocalEventBusTopic<String> localEventBusTopic;

    String receivedMessage;

    @Before
    public void setup() {
        localEventBusTopic = new LocalEventBusTopic<String>("some topic");
    }

    @Test
    public void testListenerReceivesMessagesPublishedToTopic() throws InterruptedException {
        final Listener<String> myListener = new MyListener();
        localEventBusTopic.addListener(myListener);
        final String publishedMessage = "the message";
        localEventBusTopic.publish(publishedMessage, null);
        //sleep to give topic a change to publish message
        Thread.sleep(50);
        assertThat(receivedMessage, is(publishedMessage));
    }

    class MyListener implements Listener<String> {

        /* (non-Javadoc)
         * @see com.ericsson.cepmediation.base.publishing.eventbus.Listener#onMessage(java.lang.Object)
         */
        @Override
        public void onMessage(final String message) {
            receivedMessage = message;
        }

        @Override
        public void onMessage(String message, String dataLabel) {
            receivedMessage = message;

        }

    }

}
