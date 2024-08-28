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
import com.ericsson.cepmediation.loading.mme.LoadMME;

/**
 * This class parses EBM files
 * 
 * @author eeilfn
 */

public class EBMParser extends Parser implements ParserService, StatisticsAware {
    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(EBMParser.class);

    // Define the EBM schema type
    public static final String EBM_SCHEMA_TYPE = "ebm";

    private String sgehParserMetics = "";

    public EBMParser() {
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
        super.initialize(schemaHandler, EBM_SCHEMA_TYPE, publishers);
    }

    /**
     * This method runs a parser, which parses a set of files and publishes
     * events for correlation
     * @param fileList The list of files to parse
     * @return the metrics for this load run
     * @throws ParsingFailedException Exception thrown when parsing fails
     */
    @Override
    public LoadingMetrics execute(final Collection<File> fileList) throws ParsingFailedException {
        try {
            logger.debug("Start processing of EBM files");

            final LoadingMetrics loadingMetrics = new LoadMME().load(schemaTypeHandler, fileList, publishers);
            sgehParserMetics = loadingMetrics.toString();
            logger.debug("completed processing of EBM files");

            return loadingMetrics;
        } catch (final Exception e) {
            logger.debug("parsing failed", e);
            throw new ParsingFailedException(e.getMessage(), ErrorCode.PARSING_FAILED);
        }
    }

    @Override
    public void exportTo(final Statistics statistics) {
        statistics.add(Statistics.Keys.SGEH_METRICS, sgehParserMetics);
        sgehParserMetics = "";

    }
}