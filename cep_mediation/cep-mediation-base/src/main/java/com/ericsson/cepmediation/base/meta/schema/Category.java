package com.ericsson.cepmediation.base.meta.schema;

import java.util.ArrayList;
import java.util.List;

import org.jdom.DataConversionException;
import org.jdom.Element;
import org.jdom.Namespace;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is used to hold a single event category
 * 
 * @author eeilfn
 */
public class Category implements Comparable<Category> {
    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(Category.class);

    // Member data, read from the XML files
    private String name = ""; //NOPMD eemecoy 9/4/2012 bug in pmd

    // A list that holds the events in this category 
    private final List<Event> eventList = new ArrayList<Event>();

    /**
     * Instantiate a category as an object
     * 
     * @param handler, the category handler for this category
     * @param category the category XML element
     * @param namespace the name space to use for reading elements
     * @throws SchemaException 
     */
    protected Category(final SchemaComponentHandler handler, final Element category, final Namespace namespace)
            throws SchemaException {
        try {
            // Instantiate mandatory data from the XML element
            name = category.getChild("name", namespace).getText().trim();

            // Get the events in this category
            @SuppressWarnings("unchecked")
            final List<Element> eventNodeList = category.getChildren("eventref", namespace);

            // Instantiate the parameter list for this event
            loadEvents(handler, eventNodeList);
        } catch (final Exception e) {
            // Return a sensible exception to the caller
            throw new SchemaException("Error parsing event schema element [" + category.getName() + "=" + name + "] "
                    + e);
        }
    }

    /**
     * Set the event list for this category
     * 
     * @param handler, the category handler for this category
     * @param elementNode The list of event XML elements
     * @throws DataConversionException 
     */
    private void loadEvents(final SchemaComponentHandler handler, final List<Element> eventNodeList)
            throws DataConversionException {
        // Iterate over the list, look up each event on the event list and store it in this category
        for (final Element eventNode : eventNodeList) {
            // Get the event Name
            final String eventName = eventNode.getAttribute("name").getValue().trim();

            // Get the event ID
            final Integer eventId = eventNode.getAttribute("id").getIntValue();

            // Get the event definition for this event
            final Event event = handler.getSchema().getEventHandler().getMap().get(eventId);

            // Check if the event was found
            if (event != null && event.getName().equalsIgnoreCase(eventName)) {
                eventList.add(event);
            } else {
                // An unknown parameter was found
                logger.warn("Unknown event \"" + eventName + "\" specified on category");
            }
        }
    }

    /**
     * Get the name of the category
     * @return The category name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the event list
     * @return the event list
     */
    public List<Event> getEventList() {
        return eventList;
    }

    /**
     * Method to dump the category to a string
     * @return string containing the category
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();

        // Add the fields to the buffer
        builder.append(name);
        builder.append(",");

        // Add the parameters for this event
        for (final Event event : eventList) {
            builder.append("[");
            builder.append(event.getName());
            builder.append("]");
        }

        // return the string
        return builder.toString();
    }

    /**
     * Compare this category to another category, comparison based on name
     * 
     * @param comparedEventCategory
     * @return the comparison value
     */
    @Override
    public int compareTo(final Category comparedEventCategory) {
        return name.compareTo(comparedEventCategory.name);
    }

    /**
     * Override the equals method for hash maps of categories
     */
    @Override
    public boolean equals(final Object other) {
        // Check the object type
        if (other instanceof Category) {
            // Cast and compare the category names
            final Category otherCategory = (Category) other;
            return name.equals(otherCategory.getName());
        } else {
            return false;
        }
    }

    /**
     * Override the hashCode hash maps of categories
     * @return The hash code of the category name
     */
    @Override
    public int hashCode() {
        // The hash code is the name hash code
        return name.hashCode();
    }
}
