package com.ericsson.eniq.events.cepmediation.datagen_precook.utils.fileutils;

import java.io.File;
import java.io.FileFilter;
import java.util.Calendar;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.eniq.events.cepmediation.datagen_precook.common.DatagenProperties;

public class FileMoverThread extends Thread {
    private static final String RNC09 = "RNC09";

    private static boolean generateRNC09Data = DatagenProperties.getInstance().generateDataForRNC09();

    private static File internalDir = DatagenProperties.getInstance().getInternalDir();

    private static File destinationDir = DatagenProperties.getInstance().getDestinationDir();

    private static Set<String> rNCsNames = DatagenProperties.getInstance().getRNCNames();

    private static final Logger logger = LoggerFactory.getLogger(FileMoverThread.class);

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {

                final String directory = destinationDir.getAbsolutePath();
                if (!isDirectoryExists(directory)) {
                    new File(directory).mkdir();
                }

                for (final String rnc : rNCsNames) {
                    final String d = directory + "/" + rnc;
                    if (!isDirectoryExists(d)) {
                        new File(d).mkdir();
                    }
                }

                final Calendar time = Calendar.getInstance();
                final Calendar d = getclosestStartTime(time);

                final String ropToMove = getRopRegex(d);

                // Moves Files for Current Time
                for (final String rnc : rNCsNames) {
                    moveFiles(directory, ropToMove, rnc);
                }

                //Move RNC09 Files 
                if (generateRNC09Data) {
                    final String rnc09 = directory + "/" + RNC09;
                    if (!isDirectoryExists(rnc09)) {
                        new File(rnc09).mkdir();
                    }
                    moveFiles(directory, ropToMove, RNC09);
                }

                while (!isWait(d)) {
                    try {
                        logger.debug("No files found to Move, Sleeping for 2 min");
                        Thread.sleep(120 * 1000);
                    } catch (final InterruptedException e) {
                        logger.error("Interrupted!", e);
                    }
                }
            }
        } catch (final Exception e) {
            logger.error("Error Moving Files", e);
            throw new RuntimeException(e);
        }
        logger.error("live play back crashed !!! ");
    }

    private void moveFiles(final String directory, final String ropToMove, final String rnc) {
        final String rncPath = internalDir.getAbsolutePath() + "/FileToMoves" + "/" + rnc;

        final File rncFiles = new File(rncPath);

        final File[] files = rncFiles.listFiles(new FileFilter() {
            public boolean accept(final File file) {
                return file.isFile() && file.getName().matches("A(.*)" + ropToMove + "(.*)");
            }
        });

        if (files != null) {
            for (final File file : files) {

                final boolean result = file.renameTo(new File(directory + "/" + rnc, file.getName()));
                if (result) {
                    logger.debug("Moving " + file.getName() + " To " + directory + "/" + rnc + " was " + "successfull");
                } else {
                    logger.error("Moving " + file.getName() + " To " + directory + "/" + rnc + "failed");
                }
            }
        }
    }

    private boolean isWait(final Calendar d) {
        boolean hasFiles = false;
        for (final String rnc : rNCsNames) {
            final String rncPath = internalDir.getAbsolutePath() + "/FileToMoves";

            final File rncFiles = new File(rncPath + "/" + rnc);
            final File[] files = rncFiles.listFiles();

            if (files != null && files.length > 0) {
                final Calendar currenttime = Calendar.getInstance();
                if (currenttime.getTimeInMillis() >= d.getTimeInMillis()) {
                    hasFiles = true;
                } else {
                    hasFiles = false;
                }
            }
        }

        return hasFiles;
    }

    public boolean isDirectoryExists(final String dir) {
        return new File(dir).exists();
    }

    protected Calendar getclosestEndTime(final Calendar date) {
        final Calendar convertedDate = Calendar.getInstance();

        convertedDate.setTime(date.getTime());

        final int mins = date.get(Calendar.MINUTE);
        final int hr = date.get(Calendar.HOUR_OF_DAY);

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
            if (mins == 0) {
                convertedDate.set(Calendar.MINUTE, 15);
            } else if (mins == 15) {
                convertedDate.set(Calendar.MINUTE, 30);
            } else if (mins == 30) {
                convertedDate.set(Calendar.MINUTE, 45);
            } else if (mins == 45) {
                convertedDate.set(Calendar.HOUR_OF_DAY, hr + 1);
                convertedDate.set(Calendar.MINUTE, 0);
            }

        }

        return convertedDate;
    }

    protected Calendar getclosestStartTime(final Calendar date) {

        final Calendar convertedDate = Calendar.getInstance();

        convertedDate.setTime(date.getTime());

        final int mins = date.get(Calendar.MINUTE);

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

    public String getRopRegex(final Calendar cal) {
        final Calendar convertedDate = Calendar.getInstance();

        convertedDate.setTime(cal.getTime());

        final Calendar end = getclosestEndTime(convertedDate);

        return (String.format("%02d%02d-%02d%02d", cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE),
                end.get(Calendar.HOUR_OF_DAY), end.get(Calendar.MINUTE)));
    }
}
