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
 * This class holds event categories
 * 
 * @author eeilfn
 */
public class CategoryHandler extends SchemaComponentHandler {
    // Constants for table names
    protected static final String CATEGORY_TABLE_NAME = "event_categories";

    // Constant strings for XPATH searches
    private static final String CATEGORY_XPATH_EXPRESSION = "/pe:eventspecification/pe:eventcategories/pe:eventcategory";

    // Category map containing definitions of all possible categories
    private final Map<String, Category> categoryMap;

    /**
     * Constructor to initialize the handler for this schema
     * @param schema The schema for which this map is being built
     */
    public CategoryHandler(final Schema schema) {
        super(schema);

        // Constructor initializes the category map
        categoryMap = new LinkedHashMap<String, Category>();
    }

    /**
     * Builds the category map from elements in the XML file.
     * 
     * @param eventDocument the event XML document
     * @throws SchemaException 
     * @throws JaxenException 
     */
    @Override
    public void buildMap(final Document eventDocument) throws SchemaException, JaxenException {
        // Initialize the XPath expression for selecting category types and set its name space to be the Event Schema 
        final JDOMXPath xPathCategory = new JDOMXPath(CATEGORY_XPATH_EXPRESSION);
        xPathCategory.setNamespaceContext(new SimpleNamespaceContext(schema.getNameSpaceMap()));

        // Run the category XPath query on the DOM, the result is a list of event nodes
        @SuppressWarnings("unchecked")
        final List<Element> categoryNodeList = xPathCategory.selectNodes(eventDocument);

        // Iterate over the elements from the XML file
        for (final Element categoryElement : categoryNodeList) {
            final Category currentCategory = new Category(this, categoryElement, schema.getNameSpace());

            // Add the event to the hash map
            categoryMap.put(currentCategory.getName(), currentCategory);
        }
    }

    /**
     * Get the category mapping
     * 
     * @return The category mapping
     */
    public Map<String, Category> getMap() {
        return categoryMap;
    }
}
