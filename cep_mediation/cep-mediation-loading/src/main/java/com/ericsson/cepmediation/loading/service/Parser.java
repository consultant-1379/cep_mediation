package com.ericsson.cepmediation.loading.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.meta.admin.SchemaHandler;
import com.ericsson.cepmediation.base.meta.admin.SchemaTypeHandler;
import com.ericsson.cepmediation.base.publishing.Publisher;
import com.ericsson.cepmediation.base.util.ErrorCode;
import com.ericsson.cepmediation.loading.exception.ParsingFailedException;

/**
 * This class sets up parsing schemas, and initializes and closes parsing objects
 * 
 * @author eeilfn
 */

public abstract class Parser {

    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(Parser.class);

    // Create a schema type handler for schemas of the type used by this parser
    protected SchemaTypeHandler schemaTypeHandler = null;

    // Create publishers which this parser will use to publish events it reads
    protected Publisher[] publishers = null;

    /**
     * This method initializes a parser, sets up the schemas and initializes event handling
     * @param schemaHandler Handler containing information on all loaded schemas
     * @param schemaTypename The name of the schema type for this parser
     * @param publishers The publishers to use to publish events
     * @throws ParsingFailedException 
     */
    public void initialize(final SchemaHandler schemaHandler, final String schemaTypeName, final Publisher[] publishers)
            throws ParsingFailedException {
        logger.debug("initializing parser for schema type " + schemaTypeName);

        // Get the schema type handler for cell trace schemas
        schemaTypeHandler = schemaHandler.getSchemaMap().get(schemaTypeName);

        // Save the publishers
        this.publishers = publishers;

        // Check if the schema type handler existed
        if (schemaTypeHandler == null) {
            final String message = "parsing failed, schema type handler not found for schema type: " + schemaTypeName;
            logger.debug(message);
            throw new ParsingFailedException(message, ErrorCode.PARSING_FAILED);
        }

        // Set the schema type handler for each publisher
        for (final Publisher publisher : publishers) {
            // Add events to the publisher as an array of mapped events
            publisher.addEvents(schemaTypeName, schemaTypeHandler.getEventMap().values());
        }
    }

    /**
     * This method closes a parser, and removes events from its publishers
     * @param schemaHandler Handler containing information on all loaded schemas
     * @param publishers The publishers to use to publish events
     */
    public void close() {
        logger.debug("closing parser for schema type " + schemaTypeHandler.getName());

        // Set the schema type handler for each publisher
        for (final Publisher publisher : publishers) {
            // Add events to the publisher as an array of mapped events
            publisher.removeEvents(schemaTypeHandler.getName(), schemaTypeHandler.getEventMap().values());
        }
    }

}
