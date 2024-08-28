package com.ericsson.cepmediation.correlation.enrichment.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.publishing.impl.EventBusPublisher;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;

public class GenericEsperListener implements UpdateListener {
    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(GenericEsperListener.class);

    protected EventBusPublisher eventBusPublisher;

    public void config(final EventBusPublisher eventBusPublisher) {
        this.eventBusPublisher = eventBusPublisher;
    }

    @Override
    @SuppressWarnings("unused")
    public void update(final EventBean[] newEvents, final EventBean[] oldEvents) {
        if (newEvents != null && newEvents.length > 0) {
            logger.debug(newEvents.length + " new esper output events received at " + System.currentTimeMillis());
            for (final EventBean eventBean : newEvents) {
                if (logger.isTraceEnabled()) {
                    logger.trace("Event=" + eventBean.getEventType().getName() + ':' + eventBean.get("CSVString"));
                }
                // Publish the event to the database
                publish((ApEventBean) eventBean.getUnderlying());
            }
        }
    }

    /**
     * Has default access to allow it to be called from subclasses
     * 
     * @param eventBean
     */
    final void publish(final ApEventBean eventBean) {
        eventBusPublisher.publishMessage(eventBean);
    }

}
