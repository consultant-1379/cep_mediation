package com.ericsson.cepmediation.base.meta.admin;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import com.ericsson.cepmediation.base.meta.schema.Event;
import com.ericsson.cepmediation.base.meta.schema.EventParameter;
import com.ericsson.cepmediation.base.meta.schema.ExtraColumn;
import com.ericsson.cepmediation.base.meta.schema.Schema;

/**
 * This class holds a mapped event, consisting of an event reference, a list of parameter
 * references, and a list of extra column references that represent an event mapped
 * for all versions in a schema
 * 
 * @author eeilfn
 */
public class MappedEvent implements Comparable<MappedEvent> {

    // Declare a reference for the event for which this mapping is built
    private final Event event;

    // Declare the extra column set for this event
    private final HashSet<ExtraColumn> extraColumnSet = new LinkedHashSet<ExtraColumn>();

    // Declare the parameter set for this event
    private final HashSet<EventParameter> parameterSet = new LinkedHashSet<EventParameter>();

    // Declare the ignored parameter set for this event. Ignored parameters are not populated by parsers.
    private final HashSet<EventParameter> ignoredParameterSet = new LinkedHashSet<EventParameter>();

    protected MappedEvent(final Event event) {
        // Save the event reference
        this.event = event;
    }

    /**
     * Set the extra columns from this event onto the event mapping if they have not already been set
     * @param schema The schema to use when reading extra columns
     */
    protected void setExtraColumns(final Schema schema) {
        // Iterate over the parameters in this event and add extra columns for the event if they have
        // not been already added
        for (final ExtraColumn extraColum : schema.getExtraColumnHandler().getMap().values()) {
            // Add the extra column if it is not already added
            if (!extraColumnSet.contains(extraColum)) {
                extraColumnSet.add(extraColum);
            }
        }
    }

    /**
     * Set the parameters from this event onto the event mapping if they have not already been set
     * @param event The event to use when reading parameters
     */
    protected void setParameters(final List<EventParameter> params) {
        // Iterate over the parameters in this event and add parameters for the event if they have
        // not been already added
        for (final EventParameter parameter : params) {
            // Add the parameter if it is not already added
            if (!parameterSet.contains(parameter)) {
                parameterSet.add(parameter);
            }
        }
    }

    protected void setIgnoredParameters(final List<EventParameter> ignoredParams) {
        // Set ignored parameters
        for (final EventParameter parameter : ignoredParams) {
            if (!ignoredParameterSet.contains(parameter)) {
                ignoredParameterSet.add(parameter);
            }
        }
    }

    public Event getEvent() {
        return event;
    }

    /**
     * Get the parameters for this map
     * @return The mapped parameters
     */
    public HashSet<ExtraColumn> getExtraColumnSet() {
        return extraColumnSet;
    }

    /**
     * Get the parameters for this map
     * @return The mapped parameters
     */
    public HashSet<EventParameter> getParameterSet() {
        return parameterSet;
    }

    public HashSet<EventParameter> getIgnoredParameterSet() {
        return ignoredParameterSet;
    }

    /**
     * Compare two mapped event objects
     * @param The mapped event to compare this mapped event to
     * @return The comparison result
     */
    @Override
    public int compareTo(final MappedEvent mappedEvent) {
        return this.event.compareTo(mappedEvent.event);
    }
}
