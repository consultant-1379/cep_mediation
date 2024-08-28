package com.ericsson.cepmediation.correlation.enrichment.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.apeventbeans.correlation.IP_TO_IMSI_LOOKUP;
import com.espertech.esper.client.EventBean;

public class IpToImsiEsperListener extends GenericEsperListener {
    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(IpToImsiEsperListener.class);

    /**
     * Publishes the events after they leave the IpToImsi Window.
     */
    @Override
    public void update(final EventBean[] newEvents, final EventBean[] oldEvents) {
        if (oldEvents != null && oldEvents.length > 0) {
            logger.debug(oldEvents.length + " new esper output events received at " + System.currentTimeMillis());
            for (final EventBean eventBean : oldEvents) {
                if (logger.isTraceEnabled()) {
                    logger.trace("Event=" + eventBean.getEventType().getName() + ':' + eventBean.get("CSVString"));
                }
                // Publish the event to the database
                final IP_TO_IMSI_LOOKUP bean = (IP_TO_IMSI_LOOKUP) eventBean.getUnderlying();
                if (bean.getIMSI() > 0) // TODO
                    publish(bean);
                else
                    logger.debug("Ignoring the event: " + bean.getCSVString() + ", as the IMSI is null");
            }
        }
    }
}