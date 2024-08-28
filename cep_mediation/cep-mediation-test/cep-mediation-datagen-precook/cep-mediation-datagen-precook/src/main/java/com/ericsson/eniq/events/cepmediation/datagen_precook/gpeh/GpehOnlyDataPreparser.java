package com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

import javax.naming.ConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.meta.admin.SchemaHandler;
import com.ericsson.cepmediation.base.meta.schema.SchemaException;
import com.ericsson.cepmediation.loading.exception.ParsingFailedException;
import com.ericsson.cepmediation.loading.service.GPEHParser;
import com.ericsson.eniq.events.cepmediation.datagen_precook.common.DatagenProperties;
import com.ericsson.eniq.events.cepmediation.datagen_precook.common.PublisherAdaptor;
import com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.publisher.GpehPublisher;
import com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.publisher.GpehPublisher_1MinRop;
import com.ericsson.eniq.events.cepmediation.datagen_precook.utils.RopTimeList;

public class GpehOnlyDataPreparser extends Thread {
    private static final Logger logger = LoggerFactory.getLogger(GpehOnlyDataPreparser.class);

    private final SchemaHandler schemaHandler;

    private final GPEHParser parser;

    private final File masterDatasetPath = DatagenProperties.getInstance().getMasterDatasetPath(
            DatagenProperties.Node.GPEH);

    private final PublisherAdaptor[] publishers;

    private final List<Future<?>> completed = new CopyOnWriteArrayList<Future<?>>();

    private String ropToProcess;

    private final RopTimeList ropsToProcess;

    private final ExecutorService executor = Executors.newFixedThreadPool(DatagenProperties.getInstance()
            .getThreadPoolSize(), new ThreadFactory() {
        public Thread newThread(final Runnable r) {
            return new Thread(r, "GpehPublisher_writer_thread");
        }
    });

    public GpehOnlyDataPreparser() throws SchemaException, ParsingFailedException, ConfigurationException {

        ropsToProcess = new RopTimeList();

        if (!masterDatasetPath.exists() || !masterDatasetPath.isDirectory()) {
            throw new ConfigurationException("Invalid master dataset path: " + masterDatasetPath.getAbsolutePath());
        }
        schemaHandler = new SchemaHandler();
        parser = new GPEHParser();
        publishers = getGpehPublisher();
        parser.initialize(schemaHandler, publishers);
    }

    /**
     * @return
     */
    private PublisherAdaptor[] getGpehPublisher() {
        if (DatagenProperties.getInstance().useOneMinuteRops()) {
            return new GpehPublisher_1MinRop[] { new GpehPublisher_1MinRop(schemaHandler, completed, executor) };
        }
        return new GpehPublisher[] { new GpehPublisher(schemaHandler, completed, executor) };
    }

    private void parseFiles(final String regex) {
        try {
            final File[] files = masterDatasetPath.listFiles(new FileFilter() {
                public boolean accept(final File file) {
                    return file.isFile() && file.getName().matches(regex);
                }
            });
            if (files == null || files.length == 0) {
                throw new RuntimeException("No files found in " + masterDatasetPath.getAbsolutePath() + " matching "
                        + regex);
            }
            Arrays.sort(files);

            generateHeaderFiles(files);

            logger.debug("Parsing files: " + files);
            parser.execute(Arrays.asList(files));

        } catch (final ParsingFailedException e) {
            throw new RuntimeException(e);
        }
    }

    private void generateHeaderFiles(final File[] files) {
        boolean found = false;
        for (final File f : files) {
            if (f.getAbsolutePath().indexOf("Mp0") > -1) {
                if (found) {
                    throw new IllegalStateException("More than 1 Mp0 files found: " + Arrays.asList(files));
                }
                found = true;
                for (final PublisherAdaptor publisher : publishers) {
                    publisher.writeHeaderFile(f);
                }
            }
        }
        if (!found) {
            throw new IllegalStateException("No Mp0 file found: " + Arrays.asList(files));
        }
    }

    @Override
    public void run() {
        try {
            while (hasMoreFiles()) {
                final long start = System.currentTimeMillis();
                parseFiles(getRegex());
                final long end = System.currentTimeMillis();
                final long result = end - start;
                logger.info("Total Time to Prase Files: time ms=" + result);
            }
        } catch (final Exception e) {
            logger.error("Error generating files", e);
            throw new RuntimeException(e);
        }

        //wait for all threads to finish and than shutdonw executor to terminates this thread 
        waitTillLastThreadsFinish();
        executor.shutdown();
    }

    /**
     * Get the filename regex based on the specified rop times
     * @return
     */
    private String getRegex() {
        return "A(.*)" + ropToProcess + "(.*)";
    }

    /**
     * Are there any more files to process
     * @return
     */
    private boolean hasMoreFiles() {
        waitTillLastThreadsFinish();

        return hasMoreRops();

    }

    /**
     * Wait for the last threads to finish processing the last rop
     * @return
     */
    private boolean waitTillLastThreadsFinish() {
        while (!completed.isEmpty()) {
            for (int i = 0; i < completed.size(); i++) {
                try {
                    completed.get(i).get();
                } catch (final InterruptedException e) {
                    logger.error("Interupted ", e);
                } catch (final ExecutionException e) {
                    logger.error("Execution Exception ", e);
                } catch (final Exception e) {
                    logger.error("Exception ", e);
                }
                if (completed.get(i).isDone()) {
                    completed.remove(i);
                }
            }
        }
        return true;
    }

    /**
     * Are there any more rops to process and if there are, 
     * @return
     */
    public boolean hasMoreRops() {
        if (ropsToProcess.hasMoreRopsToProcess()) {
            ropToProcess = ropsToProcess.getNextRopToProcess();
            return true;
        }
        return false;
    }
}
