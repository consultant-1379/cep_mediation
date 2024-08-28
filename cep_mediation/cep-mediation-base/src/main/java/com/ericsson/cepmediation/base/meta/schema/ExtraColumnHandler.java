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
 * This class is used to generate event tables in the database. It reads a list of
 * extra columns in event tables from the XML file.
 * 
 * @author eeilfn
 */
public class ExtraColumnHandler extends SchemaComponentHandler {
    // Constant strings for XPATH searches
    private static final String EXTRA_COLUMN_XPATH_EXPRESSION = "/pe:eventspecification/pe:extracolumns/pe:extracolumn";

    // The definitions of the tables that represent events as a list of tables
    private final Map<String, ExtraColumn> extraColumnMap;

    /**
     * Constructor to initialize the handler for this extra column handler
     * @param schema The schema for which this map is being built
     */
    public ExtraColumnHandler(final Schema schema) {
        super(schema);

        // Instantiate a map for the extra columns
        extraColumnMap = new LinkedHashMap<String, ExtraColumn>();
    }

    /**
     * Builds the extra column map from elements in the XML file.
     * 
     * @param eventDocument The event XML document
     * @throws SchemaException 
     * @throws JaxenException 
     */
    @Override
    public void buildMap(final Document eventDocument) throws SchemaException, JaxenException {
        // Initialize the XPath expression for selecting explicitly defined columns, set its name space to be the Event Schema 
        final JDOMXPath xPathExtraColumns = new JDOMXPath(EXTRA_COLUMN_XPATH_EXPRESSION);
        xPathExtraColumns.setNamespaceContext(new SimpleNamespaceContext(schema.getNameSpaceMap()));

        // Run the XPath query on the DOM, the result is a list of extra column nodes
        @SuppressWarnings("unchecked")
        final List<Element> extraColumnElementList = xPathExtraColumns.selectNodes(eventDocument);

        // Iterate over the table elements from the XML file
        for (final Element extraColumnElement : extraColumnElementList) {
            final ExtraColumn currentExtraColumn = new ExtraColumn(extraColumnElement);

            // Add the extra column to the hash map
            extraColumnMap.put(currentExtraColumn.getName(), currentExtraColumn);
        }
    }

    /**
     * Get the extra column map
     * @return The extra column map
     */
    public Map<String, ExtraColumn> getMap() {
        return extraColumnMap;
    }
}
