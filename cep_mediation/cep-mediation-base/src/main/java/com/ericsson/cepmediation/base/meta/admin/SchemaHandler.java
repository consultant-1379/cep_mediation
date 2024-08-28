package com.ericsson.cepmediation.base.meta.admin;

import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.jaxen.SimpleNamespaceContext;
import org.jaxen.jdom.JDOMXPath;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.meta.schema.SchemaException;
import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.base.resourceloading.ResourceFileFinder;
import com.ericsson.cepmediation.base.util.xml.XMLDocumentHandler;

/**
 * This class handles schema administration for all schemas in CEP Mediation. It instantiates a SchemaTypeHandler
 * instance to handle the schemas for each schema type, such as cell trace, EBM, or CTUM.
 * 
 * This class depends on naming conventions in properties. It searches for properties with the prefix "schema.name"
 * and instantiates a schema for each property found with that prefix
 * 
 * @author eeilfn
 *
 */

public class SchemaHandler {

    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(SchemaHandler.class);

    // Property strings for XML event file
    private static final String SCHEMA_TYPE_NAMESPACE = CepMediationProperties.getProperty(CepMediationProperty.SCHEMATYPE_NAMESPACE);

    private static final String SCHEMA_TYPE_SCHEMA_FILE = CepMediationProperties.getProperty(CepMediationProperty.SCHEMATYPE_SCHEMA);

    private static final String SCHEMA_TYPE_XML_FILE = CepMediationProperties.getProperty(CepMediationProperty.SCHEMATYPE_XML_FILE);

    // Local constant strings for handling name spaces
    private static final String SCHEMA_TYPE_NAMESPACE_PREFIX = "st";

    // Constant strings for XPATH searches
    private static final String SCHEMA_TYPE_XPATH_EXPRESSION = "/st:schemaTypes/st:schemaType";

    // Member data for the Event Definition schema
    private final String eventDefinitionNamespace;

    private final String eventDefinitionXSDFile;

    // Declare a tree map to handle schemas for each schema type
    private final TreeMap<String, SchemaTypeHandler> schemaMap = new TreeMap<String, SchemaTypeHandler>();

    /**
     * Constructor: Finds schema types from properties and instantiates a schema type handler for 
     * each one found
     * @throws SchemaException 
     */
    public SchemaHandler() throws SchemaException {
        logger.debug("loading schemas . . .");

        logger.debug("Schema type schema is at: " + SCHEMA_TYPE_SCHEMA_FILE);
        logger.debug("Schema type xml file is at: " + SCHEMA_TYPE_XML_FILE);

        try {

            final ResourceFileFinder resourceFileFinder = new ResourceFileFinder();

            // The schema type definition XML file is validated, so we set up the name space to XSD mapping
            final Map<String, String> schemaTypeSchemaMap = new HashMap<String, String>();
            final URL schemaTypesXSDURL = resourceFileFinder.findURLForResourceFile("xml/SchemaTypes.xsd");

            final String schemaTypeSchemaFile = schemaTypesXSDURL.toString();

            schemaTypeSchemaMap.put(SCHEMA_TYPE_NAMESPACE, schemaTypeSchemaFile);

            // Instantiate a document handler, load and validate the schema type definitions XML file into a DOM          
            final XMLDocumentHandler documentHandler = new XMLDocumentHandler(schemaTypeSchemaMap);
            final InputStream inputStream = resourceFileFinder.findResourceFile(SCHEMA_TYPE_XML_FILE);

            final Document schemaTypeDocument = documentHandler.loadAndValidate(inputStream);

            // XPath expressions are used to find elements in the DOM, we need to set up the name spaces for
            // the XPath expressions into a map
            final Map<String, String> nameSpaceMap = new HashMap<String, String>();
            nameSpaceMap.put(SCHEMA_TYPE_NAMESPACE_PREFIX, SCHEMA_TYPE_NAMESPACE);

            // Get the event schema information
            eventDefinitionNamespace = schemaTypeDocument.getRootElement().getChildText("eventNamespace", Namespace.getNamespace(SCHEMA_TYPE_NAMESPACE)).trim();
            eventDefinitionXSDFile = schemaTypeDocument.getRootElement().getChildText("eventSchemaFile", Namespace.getNamespace(SCHEMA_TYPE_NAMESPACE)).trim();

            // Initialize the XPath expression for selecting general types and set its name space to be the Event Schema 
            final JDOMXPath xPathSchemaType = new JDOMXPath(SCHEMA_TYPE_XPATH_EXPRESSION);
            xPathSchemaType.setNamespaceContext(new SimpleNamespaceContext(nameSpaceMap));

            // Run the general XPath query on the DOM, the result is a list of event nodes
            @SuppressWarnings("unchecked")
            final List<Element> schemaTypeNodeList = xPathSchemaType.selectNodes(schemaTypeDocument);

            // Iterate over the elements from the XML file
            for (final Element schemaTypeElement : schemaTypeNodeList) {
                final SchemaTypeHandler schemaTypeHandler = new SchemaTypeHandler(this, schemaTypeElement);

                // Add the event to the hash map
                schemaMap.put(schemaTypeHandler.getName(), schemaTypeHandler);
            }
        } catch (final Exception e) {
            logger.error("schema loading failed", e);
            throw new SchemaException("schema loading failed");
        }

        logger.debug("schema loading completed");
    }

    /**
     * Get the schema map for all schemas
     * @return The schema map
     */
    public TreeMap<String, SchemaTypeHandler> getSchemaMap() {
        return schemaMap;
    }

    /**
     * Get the name space string for the event schema
     * @return The event schema name space
     */
    public String getEventDefinitionNamespace() {
        return eventDefinitionNamespace;
    }

    /**
     * Get the XML schema file (XSD) for the event definition schema
     * @return The XSD file
     */
    public String getEventDefinitionXSDFile() {
        return eventDefinitionXSDFile;
    }

}
