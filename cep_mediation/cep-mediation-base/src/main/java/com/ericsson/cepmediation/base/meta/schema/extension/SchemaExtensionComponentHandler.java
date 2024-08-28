package com.ericsson.cepmediation.base.meta.schema.extension;

import java.io.IOException;

import org.jaxen.JaxenException;
import org.jdom.Document;
import org.jdom.JDOMException;

import com.ericsson.cepmediation.base.meta.schema.SchemaException;

public abstract class SchemaExtensionComponentHandler {
    protected SchemaExtension schemaExtension = null;

    protected SchemaExtensionComponentHandler(final SchemaExtension schema) {
        this.schemaExtension = schema;
    }

    abstract void buildMap(Document mapDocument) throws JDOMException, IOException, JaxenException, SchemaException;

    protected SchemaExtension getSchemaExtension() {
        return schemaExtension;
    }
}
