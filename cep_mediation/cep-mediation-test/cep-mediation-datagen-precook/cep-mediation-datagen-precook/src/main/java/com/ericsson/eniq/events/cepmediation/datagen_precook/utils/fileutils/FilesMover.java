package com.ericsson.eniq.events.cepmediation.datagen_precook.utils.fileutils;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Calendar;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.eniq.events.cepmediation.datagen_precook.common.DatagenProperties;

public class FilesMover extends Thread {
    private final File masterDatasetPath = DatagenProperties.getInstance().getMasterDatasetPath(DatagenProperties.Node.GPEH);

    private static File internalDir = DatagenProperties.getInstance().getInternalDir();

    private static boolean generateRNC09Data = DatagenProperties.getInstance().generateDataForRNC09();

    private static Set<String> rNCsNames = DatagenProperties.getInstance().getRNCNames();

    private static final Logger logger = LoggerFactory.getLogger(FilesMover.class);

    private static String fileregex = "";

    @SuppressWarnings("static-access")
    public FilesMover(final String regex) {
        this.fileregex = regex;
    }

    @Override
    public void run() {
        final String directory = internalDir.getAbsolutePath() + "/FileToMoves";
        if (!isDirectoryExists(directory)) {
            new File(directory).mkdir();
            logger.debug("Creating " + directory);
        }

        for (final String rnc : rNCsNames) {
            final String d = directory + "/" + rnc;
            if (!isDirectoryExists(d)) {
                new File(d).mkdir();
                logger.debug("Creating " + d);
            }
        }

        for (final String rnc : rNCsNames) {
            final String rncPath = internalDir.getAbsolutePath() + "/" + rnc + "/";

            final File rncFiles = new File(rncPath);

            final File[] files = rncFiles.listFiles();

            for (final File file : files) {

                final boolean result = file.renameTo(new File(directory + "/" + rnc, file.getName()));
                if (result) {
                    logger.debug("Moving " + file.getName() + " To " + directory + "/" + rnc + " was " + "successfull");
                } else {
                    logger.error("Moving " + file.getName() + " To " + directory + "/" + rnc + "failed");
                }
            }
        }
        if (generateRNC09Data) {
            final String rncPath = masterDatasetPath.getAbsolutePath();
            final String rnc09 = directory + "/" + "RNC09";
            if (!isDirectoryExists(rnc09)) {
                new File(rnc09).mkdir();
            }
            final File rncFiles = new File(rncPath);

            final File[] files = rncFiles.listFiles(new FileFilter() {
                public boolean accept(final File file) {
                    return file.isFile() && file.getName().matches(fileregex);
                }
            });
            if (files != null) {
                for (final File file : files) {
                    try {
                        copy(file.getAbsoluteFile(),
                                new File(directory + "/" + "RNC09", changeFileName(file.getName())));
                    } catch (final IOException e) {
                        logger.error(e.getMessage() + ":" + e.toString());
                        e.printStackTrace();
                    }
                    logger.debug("Copied " + file.getAbsoluteFile() + " To " + directory + "/" + "RNC09" + "/"
                            + changeFileName(file.getName()));
                }
            }
        }
    }

    public boolean isDirectoryExists(final String dir) {
        return new File(dir).exists();
    }

    @SuppressWarnings("resource")
    public void copy(final File srcFile, final File destFile) throws IOException {
        FileChannel srcChannel = null;
        FileChannel destChannel = null;
        try {
            srcChannel = new FileInputStream(srcFile).getChannel();
            destChannel = new FileOutputStream(destFile).getChannel();
            final long size = srcChannel.size();
            destChannel.transferFrom(srcChannel, 0, size);
        } finally {
            if (srcChannel != null) {
                srcChannel.close();
            }
            if (destChannel != null) {
                destChannel.close();
            }
        }
    }

    protected String changeFileName(String filename) {
        final Calendar date = Calendar.getInstance();
        String fileprefix = "";

        if (filename.matches("A*(.*)2345-0000(.*)")) {
            fileprefix = (String.format("%4d%02d%02d", date.get(Calendar.YEAR), date.get(Calendar.MONTH) + 1,
                    date.get(Calendar.DAY_OF_MONTH) + 1));
        } else {
            fileprefix = (String.format("%4d%02d%02d", date.get(Calendar.YEAR), date.get(Calendar.MONTH) + 1,
                    date.get(Calendar.DAY_OF_MONTH)));
        }
        filename = filename.replaceAll("\\^*[0-9]{8}", fileprefix);
        return filename;
    }

}
