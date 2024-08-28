package com.ericsson.cepmediation.base.publishing;

import java.util.Collection;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.meta.admin.MappedEvent;

/**
 * This interface is used to allow events to be published from parsers
 * @author eeilfn
 *
 */
public interface Publisher {

    /**
     * Add events to the list of events that this publisher publishes
     * @param schemaType The schema type for publishing
     * @param events An array of mapped events that this publisher will publish     
     */
    void addEvents(String schemaType, Collection<MappedEvent> events);

    /**
     * Remove events from the list of events that this publisher publishes
     * @param schemaType The schema type for publishing
     * @param events An array of mapped events that this publisher will no longer publish
     */
    void removeEvents(String schemaType, Collection<MappedEvent> events);

    /**
     * Publishes an event using a publisher
     * @param event The event to publish
     */
    void publishMessage(ApEventBean event);

    /**
     * This method flushes all buffered events
     */
    void flush();
    
    /**
     * Sets the name of the file from which events are read.
     * 
     * @param name NE file name
     */
    void setCurrentFileName(String name);

    /**
     * Close the publisher
     */
    void close();
}
