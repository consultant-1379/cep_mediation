package com.ericsson.cepmediation.base.util.xml;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.jdom.Document;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

/**
 * This class loads an XML document into a DOM and validates it
 * 
 * @author liam.fallon@ericsson.com
 */
public class XMLDocumentHandler {
    private static final String XERCES_SAX_PARSER = "org.apache.xerces.parsers.SAXParser";

    private static final String VALIDATION_FEATURE = "http://apache.org/xml/features/validation/schema";

    private static final String VALIDATION_FULL_CHECKING = "http://apache.org/xml/features/validation/schema-full-checking";

    private static final String SCHEMA_LOCATION_PROPERTY = "http://apache.org/xml/properties/schema/external-schemaLocation";

    // Handle to SAX/DOM parser
    SAXBuilder builder;

    // List of schema URIs and files
    Map<String, String> schemaURIMap = new HashMap<String, String>();

    /**
     * Constructor, set up a document handler with the appropriate schemas for validation
     * 
     * @param schemaURIMap
     */
    public XMLDocumentHandler(final Map<String, String> schemaURIMap) {
        // Initialize the parser for full validation
        builder = new SAXBuilder(XERCES_SAX_PARSER, true);
        builder.setFeature(VALIDATION_FEATURE, true);
        builder.setFeature(VALIDATION_FULL_CHECKING, true);

        // Set the schemas in the parser
        setSchemas(schemaURIMap);
    }

    /**
     * Set the schemas for the XML document on this handler
     * 
     * @param schemaURIMap
     */
    private void setSchemas(final Map<String, String> schemaURIMap) {
        // Save the schemas
        this.schemaURIMap = schemaURIMap;

        // Get the schemas into a string
        final StringBuilder schemaStringBuilder = new StringBuilder();
        for (final String schemaURI : schemaURIMap.keySet()) {
            schemaStringBuilder.append(schemaURI);
            schemaStringBuilder.append(' ');
            schemaStringBuilder.append(schemaURIMap.get(schemaURI));
            schemaStringBuilder.append(' ');
        }

        // Set the schemas on the parser
        builder.setProperty(SCHEMA_LOCATION_PROPERTY, schemaStringBuilder.toString());
    }

    /**
     * Load the document into a DOM and validate it
     * 
     * @param documenttFile
     * @return the document as a DOM document
     * @throws IOException 
     * @throws JDOMException 
     */
    public Document loadAndValidate(final File documentFile) throws JDOMException, IOException {
        return builder.build(documentFile);
    }

    public Document loadAndValidate(final InputStream documentInputStream) throws JDOMException, IOException {
        return builder.build(documentInputStream);
    }
}
