/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2013 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.datagen.utils;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.datagen.common.PreCookDatagenProperties;

/**
 * @author eikrwaq
 * @since 2013
 *
 */
public class LiveFileCopier extends Thread {
    private static final Logger logger = LoggerFactory.getLogger(LiveFileCopier.class);

    private static File outputfolder = PreCookDatagenProperties.instance.getDestinationDir();

    private static File destinationDir = PreCookDatagenProperties.instance.getMasterDatasetPath();

    private static File internal = PreCookDatagenProperties.instance.getInternalDir();

    private final List<Future<?>> completed = new CopyOnWriteArrayList<Future<?>>();

    private ExecutorService executor = Executors.newCachedThreadPool();

    private String lastproccessedRop;

    private String ropToProcess;

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

                String directory = internal.getAbsolutePath();

                Set<String> listOfRNCs = getListofRNCs();

                createDirectories(directory, listOfRNCs);

                logger.debug("Processing Rop id : " + ropToProcess);

                for (String rnc : listOfRNCs) {
                    Future<?> future = executor.submit(new FileCopier(directory, destinationDir.getAbsolutePath(),
                            ropToProcess, rnc));
                    completed.add(future);
                }

                if (waitTillLastThreadsFinish()) {
                    createDirectories(outputfolder.getAbsolutePath(), listOfRNCs);

                    (new FilesMover(ropToProcess, internal.getAbsolutePath(), outputfolder.getAbsolutePath(),
                            listOfRNCs, false, true)).start();
                }

                lastproccessedRop = new String(ropToProcess);

            }
        } catch (Exception e) {
            logger.error("Error Moving Files", e);
            throw new RuntimeException(e);
        }
    }

    private String getRegex() {
        Calendar time = Calendar.getInstance();
        Calendar d = getclosestStartTime(time);

        final String ropToMove = getRopRegex(d);
        return ropToMove;
    }

    /**
     * @param directory
     * @param rNCsNames
     */
    private void createDirectories(String directory, Set<String> rNCsNames) {
        if (!isDirectoryExists(directory)) {
            new File(directory).mkdir();
        }

        for (String rnc : rNCsNames) {
            String d = directory + "/" + rnc;
            if (!isDirectoryExists(d)) {
                new File(d).mkdir();
            }
        }
    }

    /**
     * @return
     */
    private Set<String> getListofRNCs() {
        File file = destinationDir;

        String[] rncsDirectories = file.list(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                return new File(dir, name).isDirectory();
            }
        });

        return new HashSet<String>(Arrays.asList(rncsDirectories));
    }

    /**
     * @param d
     * @return
     */
    private boolean isWait() {
        ropToProcess = getRegex();
        return (ropToProcess.equals(lastproccessedRop));
    }

    /**
     * @param dir
     * @return
     */
    public boolean isDirectoryExists(String dir) {
        return new File(dir).exists();
    }

    /**
     * @param date
     * @return
     */
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

    /**
     * @param date
     * @return
     */
    protected Calendar getclosestStartTime(Calendar date) {

        Calendar convertedDate = Calendar.getInstance();

        convertedDate.setTime(date.getTime());

        int mins = date.get(Calendar.MINUTE);

        if ((mins % 15) > 0) {
            if (mins >= 45) {
                convertedDate.set(Calendar.MINUTE, 45);
            } else if (mins >= 30 & mins < 45) {
                convertedDate.set(Calendar.MINUTE, 30);
            } else if (mins >= 15 & mins < 30) {
                convertedDate.set(Calendar.MINUTE, 15);
            } else if (mins > 0 & mins < 15) {
                convertedDate.set(Calendar.MINUTE, 0);
            }
        }

        return convertedDate;
    }

    /**
     * @param cal
     * @return
     */
    public String getRopRegex(Calendar cal) {
        Calendar convertedDate = Calendar.getInstance();

        convertedDate.setTime(cal.getTime());

        Calendar end = getclosestEndTime(convertedDate);

        return (String.format("%02d%02d-%02d%02d", cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE),
                end.get(Calendar.HOUR_OF_DAY), end.get(Calendar.MINUTE)));
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
}
