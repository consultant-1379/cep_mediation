package com.ericsson.cepmediation.base.meta.schema;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.jaxen.JaxenException;
import org.jdom.Document;
import org.jdom.JDOMException;
import org.jdom.Namespace;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.meta.admin.SchemaTypeHandler;
import com.ericsson.cepmediation.base.resourceloading.ResourceFileFinder;
import com.ericsson.cepmediation.base.resourceloading.ResourceLoadingFailedException;
import com.ericsson.cepmediation.base.util.xml.XMLDocumentHandler;

/**
 * This class builds an event schema from an event definition XML file
 * 
 * @author eeilfn
 */
public class Schema {
    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(Schema.class);

    // Local constant strings for handling name spaces
    private static final String EVENT_NAMESPACE_PREFIX = "pe";

    // Store a reference to the schema type handler to which this schema belongs
    private final SchemaTypeHandler schemaTypeHandler;

    // Event name space data
    private final Namespace namespace;

    private final String schemaFile;

    private final Map<String, String> nameSpaceMap = new HashMap<String, String>(); // Used by XPath searches

    // The handlers for the maps in this event schema
    private final GeneralHandler generalHandler;

    private final EventHandler eventHandler;

    private final ParameterHandler parameterHandler;

    private final StructureHandler structureHandler;

    private final CategoryHandler categoryHandler;

    private final ExtraColumnHandler extraColumnHandler;

    // The name of the schema
    private final String name;

    /*
     * Constructor, builds the event schema maps
     * @param schemaTypeHandler The schema type handler for this schema
     * @param name the name of the schema
     * @param idLength The length in bytes of ID fields in this schema
     * @param eventXMLFIle the location of the XML file describing events in the schema
     */
    public Schema(final SchemaTypeHandler schemaTypeHandler, final String name, final String eventXMLFile) throws IOException, JDOMException, JaxenException, SchemaException {
        logger.debug("schemaName=" + name + ", xmlFile=" + eventXMLFile);

        // Store the schema type handler and name
        this.schemaTypeHandler = schemaTypeHandler;
        this.name = name;

        logger.debug(this.toString());
        logger.debug("Namespace:" + schemaTypeHandler.getSchemaHandler().getEventDefinitionNamespace());
        final String eventDefinitionXSDFile = schemaTypeHandler.getSchemaHandler().getEventDefinitionXSDFile();
        logger.debug("Schema File:" + eventDefinitionXSDFile);
        logger.debug("XML File:" + eventXMLFile);

        // Set the name space for this schema
        this.namespace = Namespace.getNamespace(schemaTypeHandler.getSchemaHandler().getEventDefinitionNamespace());
        nameSpaceMap.put(EVENT_NAMESPACE_PREFIX, namespace.getURI());

        // Get the schema 
        final ResourceFileFinder resourceFileFinder = new ResourceFileFinder();
        try {
            this.schemaFile = resourceFileFinder.getFullPathToFileResource(eventDefinitionXSDFile);

            // The event definition XML file is validated, so we set up the name space to XSD mapping
            final Map<String, String> eventSchemaMap = new HashMap<String, String>();
            final URL resource = resourceFileFinder.findURLForResourceFile(eventDefinitionXSDFile);
            eventSchemaMap.put(namespace.getURI(), resource.toString());

            // Instantiate a document handler, load and validate the event definitions XML file into a DOM 
            final XMLDocumentHandler documentHandler = new XMLDocumentHandler(eventSchemaMap);
            final InputStream inputStream = resourceFileFinder.findResourceFile(eventXMLFile);
            final Document eventDocument = documentHandler.loadAndValidate(inputStream);

            // Create the general handler and the general parameter map
            generalHandler = new GeneralHandler(this);
            generalHandler.buildMap(eventDocument);

            // Create the parameter handler and the event parameter map
            parameterHandler = new ParameterHandler(this);
            parameterHandler.buildMap(eventDocument);

            // Create the structure handler and the structure map
            structureHandler = new StructureHandler(this);
            structureHandler.buildMap(eventDocument);

            // Create the event handler and the event map
            eventHandler = new EventHandler(this);
            eventHandler.buildMap(eventDocument);

            // Create the category map and build the map
            categoryHandler = new CategoryHandler(this);
            categoryHandler.buildMap(eventDocument);

            // Create the extra column map and build the map
            extraColumnHandler = new ExtraColumnHandler(this);
            extraColumnHandler.buildMap(eventDocument);
        } catch (final ResourceLoadingFailedException e) {
            throw new SchemaException("failed to find file for events", e);
        }
    }

    /**
     * Get the schema type handler for this schema
     * @return the schema type handler
     */
    public SchemaTypeHandler getSchemaTypeHandler() {
        return schemaTypeHandler;
    }

    /**
     * Get the name of this schema
     * @return the schema name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the name space for this schema
     * @return The name space for this schema
     */
    public Namespace getNameSpace() {
        return namespace;
    }

    /**
     * Get the name space for this schema
     * @return The name space for this schema
     */
    public String getSchemaFile() {
        return schemaFile;
    }

    /**
     * Get the name space map for this schema
     * @return the name space map
     */
    public Map<String, String> getNameSpaceMap() {
        return nameSpaceMap;
    }

    /**
     * Get the handler for the general information on the schema
     * @return the general information handler
     */
    public GeneralHandler getGeneralHandler() {
        return generalHandler;
    }

    /**
     * Get the handler for events on this schema
     * @return the event handler
     */
    public EventHandler getEventHandler() {
        return eventHandler;
    }

    /**
     * Get the handler for parameters on this schema
     * @return the parameters handler
     */
    public ParameterHandler getParameterHandler() {
        return parameterHandler;
    }

    /**
     * Get the handler for structures on this schema
     * @return the structure handler
     */
    public StructureHandler getStructureHandler() {
        return structureHandler;
    }

    /**
     * Get the handler for categories on this schema
     * @return the categories handler
     */
    public CategoryHandler getCategoryHandler() {
        return categoryHandler;
    }

    /**
     * Get the handler for event tables on this schema
     * @return the event table handler
     */
    public ExtraColumnHandler getExtraColumnHandler() {
        return extraColumnHandler;
    }

    /**
     * Render the schema object as a string
     * @return a string representing the schema
     */
    @Override
    public String toString() {
        return "Schema [name=" + name + "]";
    }
}
