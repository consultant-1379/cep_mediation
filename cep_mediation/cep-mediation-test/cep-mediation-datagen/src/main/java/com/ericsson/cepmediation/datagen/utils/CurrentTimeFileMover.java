package com.ericsson.cepmediation.datagen.utils;

import java.io.File;
import java.io.FileFilter;
import java.util.Calendar;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.datagen.common.DatagenProperties;

public class CurrentTimeFileMover extends Thread {
    private final String GPEH_EVENTS_CEP = "/GpehEvents_CEP";

    private final String DIR_PATH_WHERE_FILES_MOVE_ONCE_DONE = "/FileToMoves";

    private final String DELIMITER = "/";

    private final String RNC09 = "RNC09";

    private boolean generateRNC09Data = DatagenProperties.instance.generateDataForRNC09();

    private File internalDir = DatagenProperties.instance.getInternalDir();

    private File destinationDir = DatagenProperties.instance.getDestinationDir();

    private Set<String> rNCsNames = DatagenProperties.instance.getRNCsNames();

    private final Logger logger = LoggerFactory.getLogger(CurrentTimeFileMover.class);

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {

                String directory = destinationDir.getAbsolutePath() + GPEH_EVENTS_CEP;

                createDirectories(directory);

                Calendar time = Calendar.getInstance();
                Calendar d = getclosestStartTime(time);

                final String ropToMove = getRopRegex(d);

                // Moves Files for Current Time
                for (String rnc : rNCsNames) {
                    moveFiles(directory, ropToMove, rnc);
                }

                //Move RNC09 Files 
                if (generateRNC09Data) {
                    String rnc09 = directory + DELIMITER + "SubNetwork=" + RNC09.toUpperCase() + DELIMITER
                            + "MeContext=" + RNC09.toUpperCase();
                    if (!isDirectoryExists(rnc09)) {
                        new File(rnc09).mkdirs();
                    }
                    moveFiles(directory, ropToMove, RNC09);
                }

                while (!isWait(d)) {
                    try {
                        logger.debug("No files found to Move, Sleeping for 2 min");
                        Thread.sleep(120 * 1000);
                    } catch (InterruptedException e) {
                        logger.error("Interrupted!", e);
                    }
                }
            }
        } catch (Exception e) {
            logger.error("Error Moving Files", e);
            throw new RuntimeException(e);
        }
        logger.error("live play back crashed !!! ");
    }

    private void createDirectories(String directory) {
        if (!isDirectoryExists(directory)) {
            new File(directory).mkdir();
        }

        for (String rnc : rNCsNames) {
            String d = directory + DELIMITER + "SubNetwork=" + rnc.toUpperCase() + DELIMITER + "MeContext="
                    + rnc.toUpperCase();
            if (!isDirectoryExists(d)) {
                new File(d).mkdirs();
            }
        }
    }

    /**
     * @param directory
     * @param ropToMove
     * @param rnc
     */
    private void moveFiles(String directory, final String ropToMove, String rnc) {
        String rncPath = internalDir.getAbsolutePath() + DIR_PATH_WHERE_FILES_MOVE_ONCE_DONE + DELIMITER
                + "SubNetwork=" + rnc.toUpperCase() + DELIMITER + "MeContext=" + rnc.toUpperCase();

        File rncFiles = new File(rncPath);

        File[] files = rncFiles.listFiles(new FileFilter() {
            @Override
            public boolean accept(final File file) {
                return file.isFile() && file.getName().matches("A(.*)" + ropToMove + "(.*)");
            }
        });

        if (files != null) {
            for (int i = 0; i < files.length; i++) {

                boolean result = files[i].renameTo(new File(directory + DELIMITER + "SubNetwork=" + rnc.toUpperCase()
                        + DELIMITER + "MeContext=" + rnc.toUpperCase(), files[i].getName()));
                if (result) {
                    logger.debug("Moving " + files[i].getName() + " To " + directory + DELIMITER + "SubNetwork="
                            + rnc.toUpperCase() + DELIMITER + "MeContext=" + rnc.toUpperCase() + " was "
                            + "successfull");
                } else {
                    logger.error("Moving " + files[i].getName() + " To " + directory + DELIMITER + "SubNetwork="
                            + rnc.toUpperCase() + DELIMITER + "MeContext=" + rnc.toUpperCase() + "failed");
                }
            }
        }
    }

    /**
     * @param d
     * @return
     */
    private boolean isWait(Calendar d) {
        boolean hasFiles = false;
        for (String rnc : rNCsNames) {
            String rncPath = internalDir.getAbsolutePath() + DIR_PATH_WHERE_FILES_MOVE_ONCE_DONE;

            File rncFiles = new File(rncPath + DELIMITER + "SubNetwork=" + rnc.toUpperCase() + DELIMITER + "MeContext="
                    + rnc.toUpperCase());
            File[] files = rncFiles.listFiles();

            if (files != null && files.length > 0) {
                Calendar currenttime = Calendar.getInstance();
                if (currenttime.getTimeInMillis() >= d.getTimeInMillis()) {
                    hasFiles = true;
                } else {
                    hasFiles = false;
                }
            }
        }

        return hasFiles;
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
}
