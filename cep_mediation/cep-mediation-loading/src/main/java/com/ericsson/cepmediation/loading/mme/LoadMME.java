package com.ericsson.cepmediation.loading.mme;

import java.io.File;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicLong;

import com.ericsson.cepmediation.base.features.FeatureManager;
import com.ericsson.cepmediation.base.features.impl.FeatureManagerImpl;
import com.ericsson.cepmediation.base.meta.admin.SchemaTypeHandler;
import com.ericsson.cepmediation.base.publishing.Publisher;
import com.ericsson.cepmediation.base.statistics.Statistics;
import com.ericsson.cepmediation.base.statistics.StatisticsAware;
import com.ericsson.cepmediation.base.statistics.StatisticsCollector;
import com.ericsson.cepmediation.loading.events.EventRecordHandler;
import com.ericsson.cepmediation.loading.filerecords.LoadingMetrics;
import com.ericsson.cepmediation.loading.filerecords.RecordDescriptor;
import com.ericsson.cepmediation.loading.filerecords.RecordLoader;

/**
 * This class initializes loading, parsing, and storage of a list of MME files
 * 
 * @author eeilfn
 */

public class LoadMME extends RecordLoader implements StatisticsAware {
    // Local constants for MME events
    private static final boolean IS_SHORT_HEADER = true;

    private static AtomicLong numberOfEventsParsed = new AtomicLong(0);

    private static FeatureManager featureManager = FeatureManagerImpl.getInstance();

    public LoadMME() {
        super();
        StatisticsCollector.registerMe(this);
    }

    @Override
    public void exportTo(Statistics statistics) {
        statistics.add(Statistics.Keys.SGEH_NUMBER_OF_EVENTS_PARSED, numberOfEventsParsed.getAndSet(0l));

    }

    /**
     * Method that loads a list of MME files into the database, these files can be EBM files or
     * CTUM files
     * 
     * @param schemaTypeHandler A handler for all loaded MME schemas of this type
     * @param fileList The list of files to process
     * @param publishers The publishers to use to publish events
     */
    public LoadingMetrics load(final SchemaTypeHandler schemaTypeHandler, final Collection<File> fileList, final Publisher[] publishers) {

        // In order read the records in the file, we must declare a record handler for each
        // type of record that can occur in the file and pass it to a record descriptor, that
        // describes the record format for the record buffer, used to load in raw records into memory
        final RecordDescriptor mmeRecordDescriptor = new RecordDescriptor(IS_SHORT_HEADER);

        // The Header record handler uses general information from the schema to check file versions
        final MMEHeaderRecordHandler mmeHeaderRecordHandler = new MMEHeaderRecordHandler(schemaTypeHandler);

        // The Event record handler uses the Header record handler to insert NE names and dates into events stored
        // in the database, and it uses the event map, the record type, and the ID length to parse event records
        final EventRecordHandler mmeEventRecordHandler = new EventRecordHandler(mmeHeaderRecordHandler, publishers, featureManager.getEnabledSgehEvents());
        mmeEventRecordHandler.setEventCounterForStats(numberOfEventsParsed);

        // The rest of the record handlers are standard MME record handlers, all record handlers are added to the
        // record handler list
        mmeRecordDescriptor.addRecordHandler(mmeHeaderRecordHandler);
        mmeRecordDescriptor.addRecordHandler(mmeEventRecordHandler);
        mmeRecordDescriptor.addRecordHandler(new MMEErrorRecordHandler());
        mmeRecordDescriptor.addRecordHandler(new MMEFooterRecordHandler());

        // Use the super class load method to load the files
        return super.load(mmeRecordDescriptor, schemaTypeHandler.getName(), fileList, publishers);
    }
}