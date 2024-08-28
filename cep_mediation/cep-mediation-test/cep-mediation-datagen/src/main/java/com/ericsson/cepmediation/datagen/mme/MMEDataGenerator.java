package com.ericsson.cepmediation.datagen.mme;

import java.io.File;
import java.io.FileFilter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
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
import com.ericsson.cepmediation.datagen.common.DatagenPropertiesConstants;
import com.ericsson.cepmediation.datagen.utils.MMEFileMover;
import com.ericsson.cepmediation.datagen.utils.OneMinRopTimeList;
import com.ericsson.cepmediation.datagen.utils.RopTimeList;
import com.ericsson.cepmediation.loading.exception.ParsingFailedException;
import com.ericsson.cepmediation.loading.service.EBMParser;

public class MMEDataGenerator extends Thread {

    private static final Logger logger = LoggerFactory.getLogger(MMEDataGenerator.class);

    private static Set<String> sGSNNames = DatagenProperties.instance.getSGSNsNames();

    private final SchemaHandler schemaHandler;

    private final XMMELoader parser;

    private final File masterDatasetPath = DatagenProperties.instance.getMasterDatasetPath(DatagenProperties.Node.SGSN);

    private MMEPublisher[] publishers;

    private List<Future<?>> completed = new CopyOnWriteArrayList<Future<?>>();

    private final RopTimeList ropsToProcess;

    private String ropToProcess;

    private String lastProcessedRop;

    private final boolean isLivePlayback = DatagenProperties.instance.getLivePlayBackFlag();

    private final ExecutorService executor = Executors.newFixedThreadPool(
            DatagenProperties.instance.getThreadPoolSize(), new ThreadFactory() {
                int i = 0;

                @Override
                public Thread newThread(final Runnable r) {
                    return new Thread(r, "MmePublisher_writer_live_datagen_thread " + String.valueOf(i++));
                }
            });

    public MMEDataGenerator() throws SchemaException, ParsingFailedException, ConfigurationException {
        if (!masterDatasetPath.exists() || !masterDatasetPath.isDirectory()) {
            throw new ConfigurationException("Invalid master dataset path: " + masterDatasetPath.getAbsolutePath());
        }
        schemaHandler = new SchemaHandler();
        parser = new XMMELoader();
        publishers = initalizePublishers(schemaHandler, completed, parser);
        ropsToProcess = new OneMinRopTimeList();
    }

    /**
     * initalize Publisher for each MME
     * @param mmeschemaHandler
     * @param mmeCompleted
     * @param mmeParser
     * @return
     */
    private MMEPublisher[] initalizePublishers(SchemaHandler mmeschemaHandler, List<Future<?>> mmeCompleted,
            XMMELoader mmeParser) {

        ArrayList<MMEPublisher> simplePublishers = new ArrayList<MMEPublisher>();

        for (String sgsn : sGSNNames) {
            simplePublishers.add(new MMEPublisher(mmeschemaHandler, mmeCompleted, sgsn, mmeParser, executor));
        }

        return simplePublishers.toArray(new MMEPublisher[simplePublishers.size()]);
    }

    private void parseFiles(final String regex) throws ExecutionException {
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

            logger.debug("Parsing files: " + files);
            parser.load(schemaHandler.getSchemaMap().get(EBMParser.EBM_SCHEMA_TYPE), Arrays.asList(files), publishers);

        } catch (final Throwable e) {
            logger.error("No files found in " + masterDatasetPath.getAbsolutePath() + " matching " + regex);
        }
    }

    @Override
    public void run() {

        try {
            while (!isInterrupted()) {
                while (isWait()) {
                    try {
                        Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                        Calendar d = getclosestEndTime(time);
                        logger.debug("Sleeping for " + (d.getTimeInMillis() - time.getTimeInMillis()) + " miliseconds");
                        Thread.sleep(d.getTimeInMillis() - time.getTimeInMillis());
                    } catch (InterruptedException e) {
                        logger.error("Interrupted!", e);
                    }
                }

                
                if (backlogScenario()) {
                    logger.info("Backlog recovery mode Started");
                    processBacklog();
                    logger.info("Backlog recovery mode Finished");
                }

                proccessRop(getRegex(), ropToProcess);
            }
        } catch (Exception e) {
            logger.error("Error generating files", e);
            throw new RuntimeException(e);
        }
        waitTillLastThreadsFinish();
        executor.shutdown();
        logger.info("Completed Processing files.. Shut downing now !");
    }

    /**
     * @throws ExecutionException
     */
    private void processBacklog() throws ExecutionException {
        final Calendar startTime = Calendar.getInstance();
        final Calendar endTime = Calendar.getInstance();

        final DateFormat lastRopTime = new SimpleDateFormat("HHmm");

        String lastProcessedRopStartHHMM = lastProcessedRop.substring(0, 4);
        String lastProcessedRopEndHHMM = lastProcessedRop.substring(5, lastProcessedRop.length());
        try {
            startTime.setTime(lastRopTime.parse(lastProcessedRopStartHHMM));
            endTime.setTime(lastRopTime.parse(lastProcessedRopEndHHMM));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String lastrop = lastProcessedRopStartHHMM + "-" + lastProcessedRopEndHHMM;
        while (!ropToProcess.equals(lastrop)) {
            startTime.add(Calendar.MINUTE, 1);
            endTime.add(Calendar.MINUTE, 1);

            String startRop = String.format("%02d%02d", startTime.get(Calendar.HOUR_OF_DAY),
                    startTime.get(Calendar.MINUTE));
            String endRop = String.format("%02d%02d", endTime.get(Calendar.HOUR_OF_DAY), endTime.get(Calendar.MINUTE));

            if (!ropToProcess.equals(startRop + "-" + endRop)) {
                String regex = "^A\\d+\\." + startRop + "(.+)0800(.*)-\\d+\\." + endRop + "(.+)0800(.*)";
                logger.info("Backlog recovery mode, processing rop regex " + regex);

                proccessRop(regex, startRop + "-" + endRop);
            }
            lastrop = String.format("%02d%02d-%02d%02d", startTime.get(Calendar.HOUR_OF_DAY),
                    startTime.get(Calendar.MINUTE), endTime.get(Calendar.HOUR_OF_DAY), endTime.get(Calendar.MINUTE));
        }
    }

    /**
     * @param regex
     * @param ropToMove
     * @throws ExecutionException
     */
    private void proccessRop(String regex, String ropToMove) throws ExecutionException {
        final long start = System.currentTimeMillis();
        parseFiles(regex);
        final long end = System.currentTimeMillis();
        final long result = end - start;
        logger.info("Total Time to Prase Files: time ms=" + result + " for Number of SGSNs=" + sGSNNames.size());
        if (waitTillLastThreadsFinish()) {
            moveFiles(ropToMove);
        }
    }

    /**
     * @return
     */
    private boolean backlogScenario() {
        if (lastProcessedRop != null) {
            final Calendar startTime = Calendar.getInstance();
            final DateFormat lastRopTime = new SimpleDateFormat("HHmm");

            String lastProcessedRopHHMM = lastProcessedRop.substring(5, lastProcessedRop.length());
            try {
                startTime.setTime(lastRopTime.parse(lastProcessedRopHHMM));
            } catch (ParseException e) {
                e.printStackTrace();
            }

            startTime.add(Calendar.MINUTE, 1);
            String rop = String.format(lastProcessedRopHHMM + "-%02d%02d", startTime.get(Calendar.HOUR_OF_DAY),
                    startTime.get(Calendar.MINUTE));

            return !ropToProcess.equals(rop);
        }
        return false;
    }

    /**
     * @param regex
     */
    private void moveFiles(String currentRop) {
        String outputDir = DatagenProperties.instance.getDestinationDir().getAbsolutePath();
        String internalDir = DatagenProperties.instance.getInternalDir().getAbsolutePath();
        MMEFileMover filemover = new MMEFileMover(internalDir, outputDir, sGSNNames, currentRop);
        filemover.start();
    }

    /**
     * @param time
     * @return
     */
    private Calendar getclosestEndTime(Calendar time) {
        Calendar convertedDate = Calendar.getInstance(TimeZone.getTimeZone("UTC"));

        convertedDate.setTime(time.getTime());
        convertedDate.set(Calendar.SECOND, 0);
        convertedDate.set(Calendar.MINUTE, (convertedDate.get(Calendar.MINUTE) + 1));

        return convertedDate;
    }

    /**
     * @param time
     * @return
     */
    private Calendar getClosestRop(Calendar time) {
        Calendar convertedDate = Calendar.getInstance(TimeZone.getTimeZone("UTC"));

        convertedDate.setTime(time.getTime());
        convertedDate.set(Calendar.SECOND, 0);

        convertedDate.add(Calendar.HOUR_OF_DAY, DatagenPropertiesConstants.ROPOFFSET);

        return convertedDate;
    }

    /**
     * @return
     */
    private String getRegex() {
        lastProcessedRop = ropToProcess;
        String[] x = ropToProcess.split("-");
        return "^A\\d+\\." + x[0] + "(.+)0800(.*)-\\d+\\." + x[1] + "(.+)0800(.*)";
    }

    /**
     * @return
     */
    private boolean isWait() {
        waitTillLastThreadsFinish();

        if (isLivePlayback) {
            return livePlayBack();
        }
        return !isMore1minRops();
    }

    /**
     * @return
     */
    private boolean livePlayBack() {
        Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        Calendar d = getClosestRop(time);
        ropToProcess = getRopRegex(d);

        if (ropToProcess.equals(lastProcessedRop)) {
            return true;
        }

        return false;
    }

    /**
     * @param d
     * @return
     */
    private String getRopRegex(Calendar cal) {
        Calendar convertedDate = Calendar.getInstance(TimeZone.getTimeZone("UTC"));

        convertedDate.setTime(cal.getTime());

        Calendar end = getclosestEndTime(convertedDate);

        return (String.format("%02d%02d-%02d%02d", cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE),
                end.get(Calendar.HOUR_OF_DAY), end.get(Calendar.MINUTE)));
    }

    /**
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
    private boolean waitTillLastThreadsFinish() {
        while (!completed.isEmpty()) {
            for (int i = 0; i < completed.size(); i++) {
                try {
                    completed.get(i).get();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
                if (completed.get(i).isDone()) {
                    completed.remove(i);
                }
            }
        }
        return true;
    }

}
