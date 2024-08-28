package com.ericsson.cepmediation.base.meta.schema;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.jaxen.JaxenException;
import org.jaxen.SimpleNamespaceContext;
import org.jaxen.jdom.JDOMXPath;
import org.jdom.Document;
import org.jdom.Element;

/**
 * This class holds all the events defined in a schema
 * 
 * @author eeilfn
 */
public class EventHandler extends SchemaComponentHandler {
    // Constants for table names
    protected static final String EVENT_TYPES_TABLE_NAME = "event_types";

    protected static final String EVENT_PARAM_MAP_TABLE_NAME = "event_param_map";

    // Constant strings for XPATH searches
    private static final String EVENT_XPATH_EXPRESSION = "/pe:eventspecification/pe:events/pe:event";

    // Event map containing definitions of all possible events
    private final Map<Integer, Event> eventMap;

    /**
     * Constructor to initialize the handler for this schema
     * @param schema The schema for which this map is being built
     */
    public EventHandler(final Schema schema) {
        super(schema);

        // Constructor initializes the event map
        eventMap = new LinkedHashMap<Integer, Event>();
    }

    /**
     * Builds the event map from elements in the XML file.
     * 
     * @param eventDocument the event XML document
     * @param nameSpaceMap the name spaces used in the XML document
     * @throws SchemaException 
     * @throws JaxenException 
     */
    @Override
    public void buildMap(final Document eventDocument) throws SchemaException, JaxenException {
        // Initialize the XPath expression for selecting event types and set its name space to be the Event Schema 
        final JDOMXPath xPathEvent = new JDOMXPath(EVENT_XPATH_EXPRESSION);
        xPathEvent.setNamespaceContext(new SimpleNamespaceContext(schema.getNameSpaceMap()));

        // Run the Event XPath query on the DOM, the result is a list of event nodes
        @SuppressWarnings("unchecked")
        final List<Element> eventNodeList = xPathEvent.selectNodes(eventDocument);

        // Iterate over the elements from the XML file
        for (final Element event : eventNodeList) {
            final Event currentEvent = new Event(this, event, schema.getNameSpace());

            // Add the event to the hash map
            eventMap.put(currentEvent.getId(), currentEvent);
        }
    }

    /**
     * Get the event mapping
     * 
     * @return The event mapping
     */
    public Map<Integer, Event> getMap() {
        return eventMap;
    }
}
