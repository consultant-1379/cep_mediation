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
 * This class is used to hold parameter structures
 * 
 * @author eeilfn
 */
public class StructureHandler extends SchemaComponentHandler {
    // Constants for table names
    protected static final String STRUCTURE_TABLE_NAME = "structures";

    // Constant strings for XPATH searches
    private static final String STRUCTURE_XPATH_EXPRESSION = "/pe:eventspecification/pe:structuretypes/pe:structuretype";

    // Structure map containing definitions of all possible structures
    private final Map<String, Structure> structureMap;

    /**
     * Constructor to initialize the handler for this schema
     * @param schema The schema for which this map is being built
     */
    public StructureHandler(final Schema schema) {
        super(schema);

        // Constructor initializes the structure map
        structureMap = new LinkedHashMap<String, Structure>();
    }

    /**
     * Builds the structure map from elements in the XML file.
     * 
     * @param schema A string indicating the schema for which this map is being built
     * @param eventDocument the event XML document
     * @param nameSpaceMap the name spaces used in the XML document
     * @throws SchemaException 
     * @throws JaxenException 
     */
    @Override
    public void buildMap(final Document eventDocument) throws SchemaException, JaxenException {
        // Initialize the XPath expression for selecting structure types and set its name space to be the Event Schema 
        final JDOMXPath xPathStructure = new JDOMXPath(STRUCTURE_XPATH_EXPRESSION);
        xPathStructure.setNamespaceContext(new SimpleNamespaceContext(schema.getNameSpaceMap()));

        // Run the structure XPath query on the DOM, the result is a list of event nodes
        @SuppressWarnings("unchecked")
        final List<Element> structureNodeList = xPathStructure.selectNodes(eventDocument);

        // Iterate over the elements from the XML file
        for (final Element structureElement : structureNodeList) {
            final Structure currentStructure = new Structure(this, structureElement, schema.getNameSpace());

            // Add the event to the hash map
            structureMap.put(currentStructure.getName(), currentStructure);
        }
    }

    /**
     * Get the structure mapping
     * 
     * @return The structure mapping
     */
    public Map<String, Structure> getMap() {
        return structureMap;
    }
}
