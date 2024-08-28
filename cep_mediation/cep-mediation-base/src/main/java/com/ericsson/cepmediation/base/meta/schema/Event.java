package com.ericsson.cepmediation.base.meta.schema;

import java.util.ArrayList;
import java.util.List;

import org.jdom.DataConversionException;
import org.jdom.Element;
import org.jdom.Namespace;

/**
 * This class is used to hold a single event type
 * 
 * @author eeilfn
 */
public class Event implements Comparable<Event> {
    // Member data, read from the XML files
    private String name = ""; //NOPMD eemecoy 9/4/2012 bug in pmd

    private int id;

    private boolean ignored = false; //NOPMD eemecoy 4/5/2012 bug in pmd, this can't be final

    // Member data, set from other XML data
    private Category category = null;

    // Member data, set internally
    private int length = 0; // The initial length is just the length of the ID of the event

    private boolean variableLength = false; // Used for events with byte array parameters of variable length

    private boolean bitPacked = false; // True if this event is a bit packed event

    // A list that holds the parameters of this event 
    private List<EventParameter> parameterList = new ArrayList<EventParameter>();

    // A list that holds params that are not populated by parsers
    private List<EventParameter> ignoredParameterList = new ArrayList<EventParameter>();

    private boolean decodeAsn1 = false;

    /**
     * Instantiate an event as an object
     * 
     * @param handler The event handler for this event, used to look up parameters
     * @param event The event XML element
     * @param namespace the name space to use for reading elements
     * @throws SchemaException 
     */
    protected Event(final SchemaComponentHandler handler, final Element event, final Namespace namespace)
            throws SchemaException {
        try {
            // Instantiate mandatory data from the XML element
            name = event.getChild("name", namespace).getText().trim();
            id = Integer.valueOf(event.getChild("id", namespace).getText().trim());

            // Find if the event should be ignored
            if (event.getAttribute("ignore") != null) {
                ignored = event.getAttribute("ignore").getBooleanValue();
            }

            // Find if ASN.1 on the event should be decoded
            if (event.getAttribute("decode-asn1") != null) {
                decodeAsn1 = event.getAttribute("decode-asn1").getBooleanValue();
            }

            // Instantiate the parameter list for this event
            loadParameters(handler, event.getChild("elements", namespace));
        } catch (final Exception e) {
            // Return a sensible exception to the caller
            throw new SchemaException("Error parsing event schema element [" + event.getName() + "=" + name + "] " + e);
        }
    }

    /**
     * Set the parameter list for this event
     * 
     * @param handler The event handler for this event, used to look up parameters
     * @param elementNode The element XML element that has parameters as children
     * @throws SchemaException 
     * @throws DataConversionException 
     */
    private void loadParameters(final SchemaComponentHandler handler, final Element elementNode)
            throws SchemaException, DataConversionException {
        // Get the children of the element node
        @SuppressWarnings("unchecked")
        final List<Element> children = elementNode.getChildren();

        // Get the parameter values as a list using the parameter/struct parser in EventParameter
        parameterList = EventParameter.getParameters(handler, children);

        ignoredParameterList = EventParameter.getIgnoredParameters(handler, children);

        // Find if the first parameter is bit packed, if so, the event is bit packed and so should all the parameters be
        // In other words, all parameters should either be bit packed or be not bit packed
        bitPacked = parameterList.get(0).getParameter().isBitPacked();
        final String firstParamName = parameterList.get(0).getParameter().getName();

        // Iterate over the list, and calculate the length of the event
        for (final EventParameter parameter : parameterList) {
            // Check if the parameter is bit packed
            if (parameter.getParameter().isBitPacked() != bitPacked) {
                final String paramName = parameter.getParameter().getName();
                throw new SchemaException("Mixed bit packed and non bit packed parameters specified on event: " + name
                        + ". Difference between parameters '" + firstParamName + "' and '" + paramName + "'");
            }

            // Check if the parameter is of variable length or has optional parameters or is an array, if so, the event is of variable length
            if (parameter.isVariableLength() || parameter.isOptional() || parameter.isStructArray()) {
                variableLength = true;
            }

            // Check if the parameter is in a struct array
            if (parameter.isStructArray()) {
                // Increment event length with the entire array size
                length += parameter.getNumberOfBits() * parameter.getMaxStructArraySize();
            } else {
                // Increment the length of this event
                length += parameter.getNumberOfBytes();
            }
            addByteForValidityBitIfRequired(parameter);
        }

        // All events are padded to multiples of 32-bit words
        if (bitPacked) {
            // Length is in bits, pad the length to the next 32-bit boundary
            // Check if padding is needed
            if (length % 32 > 0) {
                // Padding needed so pad
                length += 32 - (length % 32);
            }
        }

        // Events can have duplicate parameter names, we eliminate these duplicate names
        for (int i = 0; i < parameterList.size(); i++) {
            // Get the name of this parameter
            final String ithName = parameterList.get(i).getName();

            // Scan the list from here to see if there are any duplicate names
            for (int j = i + 1, suffix = 2; j < parameterList.size(); j++) {
                // Check for a duplicate
                if (ithName.equalsIgnoreCase(parameterList.get(j).getName())) {
                    // A duplicate was found, reset the name on the ith element and on this element
                    // OK, the ith element will be set multiple times, once for each duplicate but its not all that inefficient
                    parameterList.get(i).setName(ithName + "_1");
                    parameterList.get(j).setName(ithName + "_" + suffix++);
                }
            }
        }
    }

    private void addByteForValidityBitIfRequired(EventParameter parameter) {
        if (parameter.isUseValid()) {
            length += 1;
        }

    }

    /**
     * Get the name of an event
     * @return The event name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the ID of an event
     * @return The event ID
     */
    public int getId() {
        return id;
    }

    /**
     * returns true if this event is to be ignored
     * @return true if this event is to be ignored
     */
    public boolean isIgnored() {
        return ignored;
    }

    /**
     * returns true if ASN.1 data is to be decoded on this event
     * @return true if ASN.1 data is to be decoded on this event
     */
    public boolean isDecodeAsn1() {
        return decodeAsn1;
    }

    /**
     * returns true if this event is bit packed
     * @return true if this event is bit packed
     */
    public boolean isBitpacked() {
        return bitPacked;
    }

    /**
     * Get the total length of this record
     * @return The record length
     */
    public int getLength() {
        return length;
    }

    /**
     * Check if this event is of variable length
     * @return true if the record is of variable length
     */
    public boolean isVariableLength() {
        return variableLength;
    }

    /**
     * Get the parameter values
     * @return the ENUM values
     */
    public List<EventParameter> getParameterList() {
        return parameterList;
    }

    /**
     * Get the ignored parameter values
     * @return the ignored parameter values
     */
    public List<EventParameter> getIgnoredParameterList() {
        return ignoredParameterList;
    }

    /**
     * Get the category of this event
     * @return the category of the event
     */
    public Category getCategory() {
        return category;
    }

    /**
     * Set the category of this event
     * @param category the category of the event
     */
    public void setCategory(final Category category) {
        this.category = category;
    }

    /**
     * Method to dump the event to a string
     * 
     * @return string containing the parameter
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();

        // Add the fields to the buffer
        builder.append(name);
        builder.append(",");
        builder.append(id);
        builder.append(",");
        builder.append(category);

        // Add the parameters for this event
        for (final EventParameter parameter : parameterList) {
            builder.append("[");
            builder.append(parameter.toString());
            builder.append("]");
        }

        // return the string
        return builder.toString();
    }

    /**
     * Compare this event to another event, comparison based on name
     * 
     * @param comparedEvent
     * @return the comparison value
     */
    @Override
    public int compareTo(final Event comparedEvent) {
        return name.compareTo(comparedEvent.name);
    }

    /**
     * Override the equals method for hash maps of events
     */
    @Override
    public boolean equals(final Object other) {
        // Check the object type
        if (other instanceof Event) {
            // Cast and compare the events names
            final Event otherEvent = (Event) other;
            return name.equals(otherEvent.getName());
        } else {
            return false;
        }
    }

    /**
     * Override the hashCode hash maps of events
     * @return The hash code of the event name
     */
    @Override
    public int hashCode() {
        // The hash code is the name hash code
        return name.hashCode();
    }

}
