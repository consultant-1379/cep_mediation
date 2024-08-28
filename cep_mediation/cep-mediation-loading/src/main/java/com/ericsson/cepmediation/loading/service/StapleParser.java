package com.ericsson.cepmediation.loading.service;

import java.io.File;
import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.meta.admin.SchemaHandler;
import com.ericsson.cepmediation.base.publishing.Publisher;
import com.ericsson.cepmediation.base.statistics.Statistics;
import com.ericsson.cepmediation.base.statistics.StatisticsAware;
import com.ericsson.cepmediation.base.statistics.StatisticsCollector;
import com.ericsson.cepmediation.base.util.ErrorCode;
import com.ericsson.cepmediation.loading.exception.ParsingFailedException;
import com.ericsson.cepmediation.loading.filerecords.LoadingMetrics;
import com.ericsson.cepmediation.loading.staple.LoadStaple;

/**
 * This class parses Staple files with TCP probe data
 * 
 * @author eeilfn
 */
public class StapleParser extends Parser implements ParserService, StatisticsAware {
    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(StapleParser.class);

    // Define the Staple schema type
    private static final String STAPLE_SCHEMA_TYPE = "bearer_plane";

    private String stapleParserMetrics = "";

    public StapleParser() {
        super();
        StatisticsCollector.registerMe(this);
    }

    /**
     * This method initializes a parser, sets up the schemas and initializes event handling
     * @param schemaHandler The schema handler that contains information on all schemas
     * @param publishers The publishers to use to publish events
     * @throws ParsingFailedException 
     */
    @Override
    public void initialize(final SchemaHandler schemaHandler, final Publisher[] publishers)
            throws ParsingFailedException {
        super.initialize(schemaHandler, STAPLE_SCHEMA_TYPE, publishers);
    }

    /**
     * This method runs a parser, which parses a set of files and publishes
     * events for correlation
     * @param publishers The publishers on which to publish events
     * @param fileList The list of files to parse
     * @return the metrics for this load run
     * @throws ParsingFailedException Exception thrown when parsing fails
     */
    @Override
    public LoadingMetrics execute(final Collection<File> fileList) throws ParsingFailedException {
        try {
            logger.debug("Start processing of staple files");

            final LoadingMetrics loadingMetrics = new LoadStaple().load(schemaTypeHandler, fileList, publishers);
            stapleParserMetrics = loadingMetrics.toString();
            logger.debug("completed processing of staple files");

            return loadingMetrics;
        } catch (final Exception e) {
            logger.debug("parsing failed", e);
            throw new ParsingFailedException(e.getMessage(), ErrorCode.PARSING_FAILED);
        }
    }

    @Override
    public void exportTo(final Statistics statistics) {
        statistics.add(Statistics.Keys.STAPLE_METRICS, stapleParserMetrics);
        stapleParserMetrics = "";

    }
}
