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
 * This class holds general information about a schema
 * 
 * @author eeilfn
 */
public class GeneralHandler extends SchemaComponentHandler {
    // Constant strings for XPATH searches
    private static final String GENERAL_XPATH_EXPRESSION = "/pe:eventspecification/pe:general";

    // General map containing a single entry for the general information
    private final Map<Integer, General> generalMap;

    /**
     * Constructor to initialize the handler for this schema
     * @param schema The schema for which this map is being built
     */
    public GeneralHandler(final Schema schema) {
        super(schema);

        // Constructor initializes the category map
        generalMap = new LinkedHashMap<Integer, General>();
    }

    /**
     * Builds the general map from elements in the XML file.
     * 
     * @param schema A string indicating the schema for which this map is being built
     * @param eventDocument the event XML document
     * @param nameSpaceMap the name spaces used in the XML document
     * @throws SchemaException 
     * @throws JaxenException 
     */
    @Override
    public void buildMap(final Document eventDocument) throws SchemaException, JaxenException {
        // Initialize the XPath expression for selecting general types and set its name space to be the Event Schema 
        final JDOMXPath xPathGeneral = new JDOMXPath(GENERAL_XPATH_EXPRESSION);
        xPathGeneral.setNamespaceContext(new SimpleNamespaceContext(schema.getNameSpaceMap()));

        // Run the general XPath query on the DOM, the result is a list of event nodes
        @SuppressWarnings("unchecked")
        final List<Element> generalNodeList = xPathGeneral.selectNodes(eventDocument);

        // Iterate over the elements from the XML file
        final int generalElementNo = 0;
        for (final Element generalElement : generalNodeList) {
            final General currentGeneral = new General(generalElement, schema.getNameSpace());

            // Add the event to the hash map
            generalMap.put(generalElementNo, currentGeneral);
        }
    }

    /**
     * Get the general mapping
     * 
     * @return The general mapping
     */
    public Map<Integer, General> getMap() {
        return generalMap;
    }

    /**
     * Get the first general information element
     * 
     * @return The first general information element
     */
    public General getGeneralInfo() {
        return generalMap.get(0);
    }
}
