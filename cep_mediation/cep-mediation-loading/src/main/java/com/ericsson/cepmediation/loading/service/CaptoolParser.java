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
import com.ericsson.cepmediation.loading.captool.LoadCaptool;
import com.ericsson.cepmediation.loading.exception.ParsingFailedException;
import com.ericsson.cepmediation.loading.filerecords.LoadingMetrics;

/**
 * This class parses Captool files with session classification data
 * 
 * @author eeilfn
 */
public class CaptoolParser extends Parser implements ParserService, StatisticsAware {
    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(CaptoolParser.class);

    // Define the Captool schema type
    private static final String CAPTOOL_SCHEMA_TYPE = "bearer_plane";

    private String captoolParserMetrics = "";

    public CaptoolParser() {
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
        super.initialize(schemaHandler, CAPTOOL_SCHEMA_TYPE, publishers);
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
            logger.debug("Start processing of captool files");

            final LoadingMetrics loadingMetrics = new LoadCaptool().load(schemaTypeHandler, fileList, publishers);
            captoolParserMetrics = loadingMetrics.toString();
            logger.debug("completed processing of captool files");

            return loadingMetrics;
        } catch (final Exception e) {
            logger.debug("parsing failed", e);
            throw new ParsingFailedException(e.getMessage(), ErrorCode.PARSING_FAILED);
        }
    }

    @Override
    public void exportTo(final Statistics statistics) {
        statistics.add(Statistics.Keys.CAPTOOL_METRICS, captoolParserMetrics);
        captoolParserMetrics = "";

    }
}
