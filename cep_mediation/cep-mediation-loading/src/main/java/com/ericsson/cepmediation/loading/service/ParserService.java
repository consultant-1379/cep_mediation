package com.ericsson.cepmediation.loading.service;

/**
 * This interface defines a parser service, which parses a list of files 
 * 
 * @author eachsaj
 */
import java.io.File;
import java.util.Collection;

import com.ericsson.cepmediation.base.meta.admin.SchemaHandler;
import com.ericsson.cepmediation.base.publishing.Publisher;
import com.ericsson.cepmediation.loading.exception.ParsingFailedException;
import com.ericsson.cepmediation.loading.filerecords.LoadingMetrics;

public interface ParserService {
    /**
     * This method initializes a parser, sets up the schemas and initializes event handling
     * @param schemaHandler The schema handler that contains information on all schemas
     * @param publishers The publishers to use to publish events
     * @throws ParsingFailedException 
     */
    void initialize(SchemaHandler schemaHandler, Publisher[] publishers) throws ParsingFailedException;

    /**
     * This method runs a parser, which parses a set of files and publishes
     * events for correlation
     * @param fileList The list of files to parse
     * @return the metrics for this load run
     * @throws ParsingFailedException Exception thrown when parsing fails
     */
    LoadingMetrics execute(Collection<File> fileList) throws ParsingFailedException;

    /**
     * This method closes a parser, closes database connections and flushes buffers
     * @throws ParsingFailedException 
     */
    void close() throws ParsingFailedException;

}
