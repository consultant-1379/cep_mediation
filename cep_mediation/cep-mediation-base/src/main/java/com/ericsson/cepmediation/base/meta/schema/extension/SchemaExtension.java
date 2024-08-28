package com.ericsson.cepmediation.base.meta.schema.extension;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.jaxen.JaxenException;
import org.jdom.Document;
import org.jdom.JDOMException;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.meta.admin.SchemaTypeHandler;
import com.ericsson.cepmediation.base.meta.schema.SchemaException;
import com.ericsson.cepmediation.base.resourceloading.ResourceFileFinder;
import com.ericsson.cepmediation.base.resourceloading.ResourceLoadingFailedException;

/**
 * This class parses schema extension data from an extension XML file.
 * 
 * @author emicned
 */
public class SchemaExtension {
    private static final Logger logger = LoggerFactory.getLogger(SchemaExtension.class);

    // The namespace for schema extension
    private static final String EXTENSIONS_NAMESPACE = "http://www.ericsson.com/SchemaTypeExtension";

    // Distinct prefix is needed by JDOM
    static final String EXTENSION_NAMESPACE_PREFIX = "se";

    // Used by XPath searches
    private final Map<String, String> nameSpaceMap = new HashMap<String, String>();

    // The parser class
    private static final String XERCES_SAX_PARSER = "org.apache.xerces.parsers.SAXParser";

    // The parent Schema Type Handler
    private final SchemaTypeHandler schemaTypeHandler;

    // The handlers for the various sections in this schema
    private CommonInterfaceHandler commonInterfaceHandler = null;

    private EnrichedEventHandler enrichedEventHandler = null;

    private final Namespace namespace;

    public SchemaExtension(final SchemaTypeHandler schemaTypeHandler, final String extensionXmlFile) throws SchemaException, JDOMException, IOException, JaxenException {
        logger.debug("schemaExtensionXml file=" + extensionXmlFile);

        this.schemaTypeHandler = schemaTypeHandler;

        // Get the event XML file
        try {
            final InputStream inputStream = new ResourceFileFinder().findResourceFile(extensionXmlFile);
            namespace = Namespace.getNamespace(EXTENSIONS_NAMESPACE);
            nameSpaceMap.put(EXTENSION_NAMESPACE_PREFIX, namespace.getURI());

            // TODO define xsd schema, for now just parse the xml 
            final SAXBuilder builder = new SAXBuilder(XERCES_SAX_PARSER);
            final Document extensionsDocument = builder.build(inputStream);

            // Create the handlers
            commonInterfaceHandler = new CommonInterfaceHandler(this);
            commonInterfaceHandler.buildMap(extensionsDocument);
            logger.debug(commonInterfaceHandler.getMap().toString());

            enrichedEventHandler = new EnrichedEventHandler(this);
            enrichedEventHandler.buildMap(extensionsDocument);
            logger.debug(enrichedEventHandler.getMap().toString());

        } catch (final ResourceLoadingFailedException e) {
            throw new SchemaException("failed to find XML file for extensions: " + extensionXmlFile, e);
        }

    }

    Map<String, String> getNameSpaceMap() {
        return nameSpaceMap;
    }

    Namespace getNamespace() {
        return namespace;
    }

    SchemaTypeHandler getSchemaTypeHandler() {
        return schemaTypeHandler;
    }

    public CommonInterfaceHandler getCommonInterfaceHandler() {
        return commonInterfaceHandler;
    }

    public EnrichedEventHandler getEnrichedEventHandler() {
        return enrichedEventHandler;
    }
}
