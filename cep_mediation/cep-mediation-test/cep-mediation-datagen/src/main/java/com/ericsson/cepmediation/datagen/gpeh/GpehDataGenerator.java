package com.ericsson.cepmediation.datagen.gpeh;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
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
import com.ericsson.cepmediation.datagen.common.DatagenProperties;
import com.ericsson.cepmediation.datagen.utils.FifteemMinRopTimeList;
import com.ericsson.cepmediation.datagen.utils.FilesMover;
import com.ericsson.cepmediation.datagen.utils.OneMinRopTimeList;
import com.ericsson.cepmediation.datagen.utils.RopTimeList;
import com.ericsson.cepmediation.loading.exception.ParsingFailedException;

public class GpehDataGenerator extends Thread {
    private static final String DIR_PATH_WHERE_FILES_MOVE_ONCE_DONE = "/FileToMoves";

    private static final Logger logger = LoggerFactory.getLogger(GpehDataGenerator.class);

    private static Set<String> rNCsNames = DatagenProperties.instance.getRNCsNames();

    private final SchemaHandler schemaHandler;

    private final XGPEHParser parser;

    private final File masterDatasetPath = DatagenProperties.instance.getMasterDatasetPath(DatagenProperties.Node.GPEH);

    private final boolean isLivePlayback = DatagenProperties.instance.getLivePlayBackFlag();

    private GpehPublisher[] publishers;

    private List<Future<?>> completed = new CopyOnWriteArrayList<Future<?>>();

    private String ropToProcess;

    private String lastProcessedRop;

    private RopTimeList ropsToProcess;

    private final ExecutorService executor = Executors.newFixedThreadPool(
            DatagenProperties.instance.getThreadPoolSize(), new ThreadFactory() {
                int i = 0;

                @Override
                public Thread newThread(final Runnable r) {
                    return new Thread(r, "GpehPublisher_writer_live_datagen_thread " + String.valueOf(i++));
                }
            });

    public GpehDataGenerator() throws SchemaException, ParsingFailedException, ConfigurationException {
        if (!masterDatasetPath.exists() || !masterDatasetPath.isDirectory()) {
            throw new ConfigurationException("Invalid master dataset path: " + masterDatasetPath.getAbsolutePath());
        }

        ropsToProcess = getRopList();
        schemaHandler = new SchemaHandler();
        parser = new XGPEHParser();
        publishers = initalizePublishers(schemaHandler, completed);
        parser.initialize(schemaHandler, publishers);
    }

    private GpehPublisher[] initalizePublishers(SchemaHandler schemaHandler2, List<Future<?>> completed2) {

        ArrayList<GpehPublisher> simplePublishers = new ArrayList<GpehPublisher>();

        logger.debug("Initalizing Publishers now ...");

        for (String rnc : rNCsNames) {
            simplePublishers.add(new GpehPublisher(schemaHandler2, completed2, rnc, executor));
        }

        return simplePublishers.toArray(new GpehPublisher[simplePublishers.size()]);
    }

    private void parseFiles(final String regex) {
        try {
            final File[] files = masterDatasetPath.listFiles(new FileFilter() {
                @Override
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

    private void generateHeaderFiles(File[] files) {
        boolean found = false;
        for (File f : files) {
            if (f.getAbsolutePath().indexOf("Mp0") > -1) {
                if (found) {
                    throw new IllegalStateException("More than 1 Mp0 files found: " + Arrays.asList(files));
                }
                found = true;
                String[] rncs = rNCsNames.toArray(new String[publishers.length]);
                for (int i = 0; i < publishers.length; i++) {
                    publishers[i].writeHeaderFile(f, rncs[i]);
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
            while (!isInterrupted()) {
                while (isWait()) {
                    try {
                        Calendar time = Calendar.getInstance();
                        Calendar d = getclosestEndTime(time);
                        logger.debug("Sleeping for " + (d.getTimeInMillis() - time.getTimeInMillis()) + " miliseconds");
                        Thread.sleep(d.getTimeInMillis() - time.getTimeInMillis());
                    } catch (InterruptedException e) {
                        logger.error("Interrupted!", e);
                    }
                }
                final long start = System.currentTimeMillis();
                parseFiles(getRegex());

                if (waitTillLastThreadsFinish()) {
                    moveFiles(getRegex());
                }

                final long end = System.currentTimeMillis();
                final long result = end - start;
                logger.info("Total Time to Prase Files: time ms=" + result + " for Number of RNCs=" + rNCsNames.size());
            }
        } catch (Exception e) {
            logger.error("Error generating files", e);
            throw new RuntimeException(e);
        }

        //wait for all threads to finish and than shutdonw executor to terminates this thread 
        waitTillLastThreadsFinish();
        executor.shutdown();
    }

    private void moveFiles(String regex) {
        File internalDir = DatagenProperties.instance.getInternalDir();
        String outputDir = DatagenProperties.instance.getDestinationDir().getAbsolutePath();
        boolean generateRNC09DataFlag = DatagenProperties.instance.generateDataForRNC09();

        String destination = (isLivePlayback ? internalDir.getAbsolutePath() + DIR_PATH_WHERE_FILES_MOVE_ONCE_DONE
                : outputDir);

        FilesMover filemover = new FilesMover(regex, internalDir.getAbsolutePath(), destination, rNCsNames,
                generateRNC09DataFlag, true);
        filemover.start();
    }

    private String getRegex() {
        lastProcessedRop = ropToProcess;
        return "A(.*)" + ropToProcess + "(.*)";
    }

    private boolean isWait() {
        waitTillLastThreadsFinish();

        if (isLivePlayback) {
            return livePlayBack();
        }
        //process the 24 hour data one by one
        return !isMoreRops();
    }

    private boolean livePlayBack() {
        return fifteenMinPlayBack();
    }

    private boolean fifteenMinPlayBack() {
        Calendar time = Calendar.getInstance();
        Calendar d = getClosestRop(time);

        ropToProcess = getRopRegex(d);
        long timediff = d.getTimeInMillis() - time.getTimeInMillis();

        //TODO constant for value 10
        if (((int) (timediff / (1000 * 60)) < 10) || (ropToProcess.equals(lastProcessedRop))) {
            return true;
        }

        return false;
    }

    private boolean waitTillLastThreadsFinish() {
        while (!completed.isEmpty()) {
            for (int i = 0; i < completed.size(); i++) {
                try {
                    completed.get(i).get();
                } catch (InterruptedException e) {
                    logger.error("Interupted ", e);
                } catch (ExecutionException e) {
                    logger.error("Execution Exception ", e);
                }
                if (completed.get(i).isDone()) {
                    completed.remove(i);
                }
            }
        }
        return true;
    }

    protected Calendar getClosestRop(Calendar date) {
        Calendar convertedDate = Calendar.getInstance();

        convertedDate.setTime(date.getTime());

        int mins = date.get(Calendar.MINUTE);
        int hr = date.get(Calendar.HOUR_OF_DAY);
        if ((mins % 15) > 0) {
            if (mins >= 45) {
                convertedDate.set(Calendar.HOUR_OF_DAY, hr + 1);
                convertedDate.set(Calendar.MINUTE, 0);
            } else if (mins >= 30 & mins < 45) {
                convertedDate.set(Calendar.MINUTE, 45);
            } else if (mins >= 15 & mins < 30) {
                convertedDate.set(Calendar.MINUTE, 30);
            } else if (mins > 0 & mins < 15) {
                convertedDate.set(Calendar.MINUTE, 15);
            }
        } else if ((mins % 15) == 0) {
            if (mins == 0)
                convertedDate.set(Calendar.MINUTE, 15);
            else if (mins == 15)
                convertedDate.set(Calendar.MINUTE, 30);
            else if (mins == 30)
                convertedDate.set(Calendar.MINUTE, 45);
            else if (mins == 45) {
                convertedDate.set(Calendar.HOUR_OF_DAY, hr + 1);
                convertedDate.set(Calendar.MINUTE, 0);
            }

        }

        return convertedDate;
    }

    protected Calendar getclosestEndTime(Calendar date) {
        Calendar convertedDate = Calendar.getInstance();

        convertedDate.setTime(date.getTime());

        int mins = date.get(Calendar.MINUTE);
        int hr = date.get(Calendar.HOUR_OF_DAY);

        if ((mins % 15) > 0) {
            if (mins >= 45) {
                convertedDate.set(Calendar.HOUR_OF_DAY, hr + 1);
                convertedDate.set(Calendar.MINUTE, 0);
            } else if (mins >= 30 & mins < 45) {
                convertedDate.set(Calendar.MINUTE, 45);
            } else if (mins >= 15 & mins < 30) {
                convertedDate.set(Calendar.MINUTE, 30);
            } else if (mins > 0 & mins < 15) {
                convertedDate.set(Calendar.MINUTE, 15);
            }
        } else if ((mins % 15) == 0) {
            if (mins == 0)
                convertedDate.set(Calendar.MINUTE, 15);
            else if (mins == 15)
                convertedDate.set(Calendar.MINUTE, 30);
            else if (mins == 30)
                convertedDate.set(Calendar.MINUTE, 45);
            else if (mins == 45) {
                convertedDate.set(Calendar.HOUR_OF_DAY, hr + 1);
                convertedDate.set(Calendar.MINUTE, 0);
            }

        }

        return convertedDate;
    }

    public String getRopRegex(Calendar cal) {
        Calendar convertedDate = Calendar.getInstance();

        convertedDate.setTime(cal.getTime());

        Calendar end = getClosestRop(convertedDate);

        return (String.format("%02d%02d-%02d%02d", cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE),
                end.get(Calendar.HOUR_OF_DAY), end.get(Calendar.MINUTE)));
    }

    /**
     * Are there any more rops to process and if there are, 
     * @return
     */
    public boolean isMoreRops() {
        if (ropsToProcess.hasMoreRopsToProcess()) {
            ropToProcess = ropsToProcess.getNextRopToProcess();
            return true;
        }
        return false;
    }

    /**
     * Are there any more 1 min rops to process and if there are, 
     * @return
     */
    public boolean isMore1minRops() {
        if (ropsToProcess.hasMoreRopsToProcess()) {
            ropToProcess = ropsToProcess.getNextRopToProcess();
            return true;
        }
        return false;
    }

    /**
     * @return
     */
    private RopTimeList getRopList() {
        if (DatagenProperties.instance.useOneMinuteRops()) {
            return new OneMinRopTimeList();
        }
        return new FifteemMinRopTimeList();
    }
}
