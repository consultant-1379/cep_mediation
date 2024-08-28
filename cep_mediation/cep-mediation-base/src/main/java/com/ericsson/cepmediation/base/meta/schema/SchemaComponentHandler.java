package com.ericsson.cepmediation.base.meta.schema;

import java.io.IOException;

import org.jaxen.JaxenException;
import org.jdom.Document;
import org.jdom.JDOMException;

/**
 * This interface enforces implementation of map building for schema components from an XML file. It also
 * gets table definitions and table rows for component meta data
 * 
 * @author eeilfn
 */
public abstract class SchemaComponentHandler {
    // The schema to which this handler applies
    protected Schema schema = null;

    /**
     * Constructor to initialize the handler for this schema
     * 
     * @param schema The schema for which this map is being built
     */
    public SchemaComponentHandler(final Schema schema) {
        // Save a reference to the schema to which this parameter handler applies
        this.schema = schema;
    }

    /**
     * Builds a map from elements in the XML file.
     * 
     * @param mapDocument the XML document
     * @throws JaxenException 
     * @throws IOException 
     * @throws JDOMException 
     * @throws SchemaException 
     */
    public abstract void buildMap(Document mapDocument) throws SchemaException, JDOMException, IOException,
            JaxenException;

    /**
     * Return the event schema used by this handler
     * @return the event schema
     */
    public Schema getSchema() {
        return schema;
    }
}
