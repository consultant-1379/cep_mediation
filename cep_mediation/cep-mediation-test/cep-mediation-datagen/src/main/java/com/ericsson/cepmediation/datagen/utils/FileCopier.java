/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2013 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.datagen.utils;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author eikrwaq
 * @since 2013
 *
 */
public class FileCopier extends Thread {

    private static final String DATE_REGEX = "\\^*[0-9]{8}";

    private static final Logger logger = LoggerFactory.getLogger(FileCopier.class);

    private String destinationDirectoryPath;

    private String sourceDirectoryPath;

    private String ropToMove;

    private String rnc;

    /**
     * Default Constructor
     */
    public FileCopier() {
    }

    public FileCopier(final String destinationDirectoryPath, String sourceDirectoryPath, final String ropToMove,
            final String rnc) {
        this.destinationDirectoryPath = destinationDirectoryPath;
        this.sourceDirectoryPath = sourceDirectoryPath;
        this.ropToMove = ropToMove;
        this.rnc = rnc;
    }

    /* (non-Javadoc)
     * @see java.lang.Thread#run()
     */
    @Override
    public void run() {
        String rncPath = sourceDirectoryPath + "/" + rnc;
        File rncFiles = new File(rncPath);

        File[] files = rncFiles.listFiles(new FileFilter() {
            @Override
            public boolean accept(final File file) {
                return file.isFile() && file.getName().matches("A(.*)" + ropToMove + "(.*)");
            }
        });

        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                try {
                    copy(files[i],
                            new File(destinationDirectoryPath + "/" + rnc + "/" + changeFileName(files[i].getName())));
                    logger.debug("Copying " + changeFileName(files[i].getName()) + " to " + destinationDirectoryPath
                            + "/" + rnc);
                } catch (IOException e) {
                    logger.error(e.getMessage() + ":" + e.toString());
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * @param srcFile
     * @param destFile
     * @throws IOException
     */
    @SuppressWarnings("resource")
    public void copy(File srcFile, File destFile) throws IOException {
        FileChannel srcChannel = null;
        FileChannel destChannel = null;
        try {
            srcChannel = new FileInputStream(srcFile).getChannel();
            destChannel = new FileOutputStream(destFile).getChannel();
            long size = srcChannel.size();
            destChannel.transferFrom(srcChannel, 0, size);
        } finally {
            if (srcChannel != null)
                srcChannel.close();
            if (destChannel != null)
                destChannel.close();
        }
    }

    /**
     * @param name
     * @return
     */
    protected String changeFileName(String filename) {
        String fileprefix;
        Calendar date = Calendar.getInstance();
        fileprefix = (String.format("%4d%02d%02d", date.get(Calendar.YEAR), date.get(Calendar.MONTH) + 1,
                date.get(Calendar.DAY_OF_MONTH)));
        filename = filename.replaceAll(DATE_REGEX, fileprefix);
        return filename;
    }

}
