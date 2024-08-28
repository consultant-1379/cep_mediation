package com.ericsson.cepmediation.base.meta.schema;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.jaxen.JaxenException;
import org.jaxen.SimpleNamespaceContext;
import org.jaxen.jdom.JDOMXPath;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;

/**
 * This class holds the definitions of all parameters in a schema
 * 
 * @author eeilfn
 */
public class ParameterHandler extends SchemaComponentHandler {
    // Constants for table names
    protected static final String PARAMETER_TYPES_TABLE_NAME = "param_types";

    protected static final String PARAMETER_ENUMS_TABLE_NAME = "param_enums";

    // Constant strings for XPATH searches
    private static final String PARAMETER_TYPE_XPATH_EXPRESSION = "/pe:eventspecification/pe:parametertypes/pe:parametertype";

    // Parameter map containing definitions of all possible parameters
    private final Map<String, Parameter> parameterMap;

    /**
     * Constructor to initialize the parameter handler for this schema
     * 
     * @param schema A string indicating the schema for which this map is being built
     */
    public ParameterHandler(final Schema schema) {
        super(schema);

        // Constructor initializes the event map
        parameterMap = new LinkedHashMap<String, Parameter>();
    }

    /**
     * Builds the parameter map from elements in an XMP file.
     * 
     * @param eventDocument the event XML document
     * @param nameSpaceMap the name spaces used in the XML document
     * @throws SchemaException 
     * @throws IOException 
     * @throws JDOMException 
     * @throws JaxenException 
     */
    @Override
    public void buildMap(final Document eventDocument) throws SchemaException, JDOMException, IOException,
            JaxenException {

        // Initialize the XPath expression for selecting parameter types and set its name space to be the Event Schema 
        final JDOMXPath xPathPar = new JDOMXPath(PARAMETER_TYPE_XPATH_EXPRESSION);
        xPathPar.setNamespaceContext(new SimpleNamespaceContext(schema.getNameSpaceMap()));

        // Run the Parameter XPath query on the DOM, the result is a list of parameter nodes
        @SuppressWarnings("unchecked")
        final List<Element> parNodeList = xPathPar.selectNodes(eventDocument);

        // Iterate over the elements from the XML file
        for (final Element parameter : parNodeList) {
            final Parameter currentParameter = new Parameter(parameter, schema.getNameSpace(), schema
                    .getSchemaTypeHandler().getParamPreamble(), schema.getSchemaTypeHandler().getValuePreamble());

            // Add the parameter to the hash map
            parameterMap.put(currentParameter.getName(), currentParameter);
        }
    }

    /**
     * Get the parameter mapping
     * 
     * @return The parameter mapping
     */
    public Map<String, Parameter> getMap() {
        return parameterMap;
    }
}
