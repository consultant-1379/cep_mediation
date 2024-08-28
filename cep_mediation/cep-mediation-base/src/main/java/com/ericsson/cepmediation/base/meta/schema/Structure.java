package com.ericsson.cepmediation.base.meta.schema;

import java.util.List;

import org.jdom.Element;
import org.jdom.Namespace;

/**
 * This class is used to hold a single structure type
 * 
 * @author eeilfn
 */
public class Structure implements Comparable<Structure> {
    // Member data, read from the XML files
    private String name = ""; //NOPMD eemecoy 9/4/2012 want default value

    // A list that holds the parameters of this structure 
    private final List<EventParameter> parameterList;

    /**
     * Instantiate a structure as an object
     * 
     * @param handler The handler for this structure, used to look up parameters
     * @param structure The structure XML element
     * @param namespace the name space to use for reading elements
     * @throws SchemaException 
     */
    protected Structure(final SchemaComponentHandler handler, final Element structure, final Namespace namespace)
            throws SchemaException {
        try {
            // Instantiate mandatory data from the XML element
            name = structure.getChild("name", namespace).getText().trim();

            // Get the children of the structure node
            @SuppressWarnings("unchecked")
            final List<Element> children = structure.getChild("elements", namespace).getChildren();

            // Find the parameters in this structure
            parameterList = EventParameter.getParameters(handler, children);
        } catch (final Exception e) {
            // Return a sensible exception to the caller
            throw new SchemaException("Error parsing event schema element [" + structure.getName() + "=" + name + "] "
                    + e);
        }
    }

    /**
     * Get the name of this structure
     * @return The structurename
     */
    public String getName() {
        return name;
    }

    /**
     * Get the parameter values
     * @return the ENUM values
     */
    public List<EventParameter> getParameterList() {
        return parameterList;
    }

    /**
     * Method to dump the structure to a string
     * 
     * @return string containing the parameter
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();

        // Add the fields to the buffer
        builder.append(name);

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
    public int compareTo(final Structure comparedEvent) {
        return name.compareTo(comparedEvent.name);
    }

    /**
     * Override the equals method for hash maps of structures
     */
    @Override
    public boolean equals(final Object other) {
        // Check the object type
        if (other instanceof Structure) {
            // Cast and compare the structure names
            final Structure otherStructure = (Structure) other;
            return name.equals(otherStructure.getName());
        } else {
            return false;
        }
    }

    /**
     * Override the hashCode hash maps of structures
     * @return The hash code of the structure name
     */
    @Override
    public int hashCode() {
        // The hash code is the name hash code
        return name.hashCode();
    }
}
