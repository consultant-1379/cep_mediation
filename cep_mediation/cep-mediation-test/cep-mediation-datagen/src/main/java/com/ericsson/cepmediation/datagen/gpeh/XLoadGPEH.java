package com.ericsson.cepmediation.datagen.gpeh;

import java.io.File;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

import com.ericsson.cepmediation.base.meta.admin.SchemaTypeHandler;
import com.ericsson.cepmediation.base.publishing.Publisher;
import com.ericsson.cepmediation.base.statistics.Statistics;
import com.ericsson.cepmediation.base.statistics.StatisticsAware;
import com.ericsson.cepmediation.base.statistics.StatisticsCollector;
import com.ericsson.cepmediation.datagen.common.DatagenProperties;
import com.ericsson.cepmediation.loading.events.EventRecordHandler;
import com.ericsson.cepmediation.loading.filerecords.LoadingMetrics;
import com.ericsson.cepmediation.loading.filerecords.RecordDescriptor;
import com.ericsson.cepmediation.loading.filerecords.RecordLoader;
import com.ericsson.cepmediation.loading.gpeh.GPEHErrorRecordHandler;
import com.ericsson.cepmediation.loading.gpeh.GPEHFooterRecordHandler;
import com.ericsson.cepmediation.loading.gpeh.GPEHHeaderRecordHandler;
import com.ericsson.cepmediation.loading.gpeh.GPEHLinkRecordHandler;
import com.ericsson.cepmediation.loading.gpeh.GPEHProtocolRecordHandler;
import com.ericsson.cepmediation.loading.gpeh.GPEHRecordingRecordHandler;

/**
 * This class initializes loading, parsing, and storage of a list of MME files for datagen
 * 
 * This file is same LoadGPEH 
 * 
 * @author eikrwaq
 */

public class XLoadGPEH extends RecordLoader implements StatisticsAware {
    // Local constants for GPEH events
    private static final boolean IS_SHORT_HEADER = true;

    private static AtomicLong numberOfEventsParsed = new AtomicLong(0);
    
    private static Set<Integer> features = DatagenProperties.instance.getInterestingEvents();

    public XLoadGPEH() {
        super();
        StatisticsCollector.registerMe(this);
    }

    @Override
    public void exportTo(final Statistics statistics) {
        statistics.add(Statistics.Keys.GPEH_NUMBER_OF_EVENTS_PARSED, numberOfEventsParsed.getAndSet(0l));
    }

    /**
     * Method that loads a list of GPEH files into the database, these files can be EBM files or
     * CTUM files
     * 
     * @param schemaTypeHandler A handler for all loaded GPEH schemas of this type
     * @param fileList The list of files to process
     * @param publishers The publishers to use to publish events
     */
    public LoadingMetrics load(final SchemaTypeHandler schemaTypeHandler, final Collection<File> fileList,
            final Publisher[] publishers) {
      
        // In order read the records in the file, we must declare a record handler for each
        // type of record that can occur in the file and pass it to a record descriptor, that
        // describes the record format for the record buffer, used to load in raw records into memory
        final RecordDescriptor gpehRecordDescriptor = new RecordDescriptor(IS_SHORT_HEADER);

        // The Header record handler uses general information from the schema to check file versions
        final GPEHHeaderRecordHandler gpehHeaderRecordHandler = new GPEHHeaderRecordHandler(schemaTypeHandler);

        // The Event record handler uses the Header record handler to insert NE names and dates into events stored
        // in the database, and it uses the event map, the record type, and the ID length to parse event records
        final EventRecordHandler gpehEventRecordHandler = new EventRecordHandler(gpehHeaderRecordHandler, publishers,
                features);
        gpehEventRecordHandler.setEventCounterForStats(numberOfEventsParsed);

        // The rest of the record handlers are standard GPEH record handlers, all record handlers are added to the
        // record handler list
        gpehRecordDescriptor.addRecordHandler(gpehHeaderRecordHandler);
        gpehRecordDescriptor.addRecordHandler(new GPEHRecordingRecordHandler());
        gpehRecordDescriptor.addRecordHandler(new GPEHProtocolRecordHandler());
        gpehRecordDescriptor.addRecordHandler(gpehEventRecordHandler);
        gpehRecordDescriptor.addRecordHandler(new GPEHErrorRecordHandler());
        gpehRecordDescriptor.addRecordHandler(new GPEHLinkRecordHandler());
        gpehRecordDescriptor.addRecordHandler(new GPEHFooterRecordHandler());

        // Use the super class load method to load the files
        return super.load(gpehRecordDescriptor, schemaTypeHandler.getName(), fileList, publishers);
    }

}