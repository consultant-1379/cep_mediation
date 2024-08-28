/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2013 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.datagen.utils;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author eikrwaq
 * @since 2013
 *
 */
public class MMEFileMover extends Thread {

    private ArrayList<String> mzDirs = new ArrayList<String>(Arrays.asList("dir1", "dir2", "dir3", "dir4"));

    private final String UNDERSCORE = "_";

    private final String SGEH_EVENTS_CEP = "SgehEvents_CEP";

    private final String SGEH_EVENTS_MZ = "sgeh";

    private final String DELIMITER = "/";

    private Set<String> nodeNames;

    private final Logger logger = LoggerFactory.getLogger(MMEFileMover.class);

    private String destinationDirectory;

    private String sourceDirectory;

    private String regex;

    private int dirx;

    /**
     * Default constructor
     */
    public MMEFileMover() {
    }

    public MMEFileMover(String sourceDirectory, String destinationDirectory, Set<String> nodeNames, String regex) {
        this.sourceDirectory = sourceDirectory;
        this.destinationDirectory = destinationDirectory;
        this.nodeNames = nodeNames;

        String[] x = regex.split("-");
        this.regex = "A(.*)" + x[0] + "(.+)0800(.*)-(.*)" + x[1] + "(.+)0800(.*)";
        this.dirx = 0;
    }

    @Override
    public void run() {
        createDirectories(destinationDirectory + DELIMITER + SGEH_EVENTS_CEP);
        createMZDirectories(destinationDirectory + DELIMITER + SGEH_EVENTS_MZ);

        for (String node : nodeNames) {
            // create temp directory FilesToMove to copy files to that directory first and than move 
            createDirectory(sourceDirectory + DELIMITER + "FilesToMove" + DELIMITER + node);
            movieFiles(destinationDirectory, sourceDirectory, node);
        }

    }

    /**
     * @param string
     */
    private void createMZDirectories(String directory) {
        logger.debug("Creating " + directory);
        createDirectory(directory);
        for (String dir : mzDirs) {
            String fulldirPath = directory + DELIMITER + dir;
            if (!isDirectoryExists(fulldirPath)) {
                new File(fulldirPath).mkdirs();
                logger.debug("Creating " + fulldirPath);
            }
        }
    }

    /**
     * @param directory
     */
    private void createDirectories(String directory) {
        logger.debug("Creating " + directory);
        createDirectory(directory);

        for (String node : nodeNames) {
            String fulldirPath = directory + DELIMITER + "ManagedElement=" + node.toUpperCase();
            if (!isDirectoryExists(fulldirPath)) {
                new File(fulldirPath).mkdirs();
                logger.debug("Creating " + fulldirPath);
            }
        }
    }

    /**
     * @param destinationDirectory1
     * @param sourceDirectory1
     * @param node
     */
    public void movieFiles(String destinationDirectory1, String sourceDirectory1, String node) {

        File rncFiles = new File(sourceDirectory1 + DELIMITER + node);

        File[] files = rncFiles.listFiles(new FileFilter() {
            @Override
            public boolean accept(final File file) {
                return file.isFile() && file.getName().matches(regex);
            }
        });

        String foldername = "ManagedElement=" + node.toUpperCase();

        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                String filename = files[i].getName();

                // copy files in temp directory first than move it  to SGEH_EVENTS_CEP
                copySgehFiles(files[i], sourceDirectory + DELIMITER + "FilesToMove" + DELIMITER + node);
                moveFile(new File(sourceDirectory + DELIMITER + "FilesToMove" + DELIMITER + node, filename),
                        destinationDirectory1 + DELIMITER + SGEH_EVENTS_CEP + DELIMITER + foldername + DELIMITER,
                        filename);

                String fileDestinationFolder = destinationDirectory1 + DELIMITER + SGEH_EVENTS_MZ + DELIMITER
                        + mzDirs.get(dirx) + DELIMITER;

                // move the file to other directory SGEH_EVENTS_MZ
                moveFile(files[i], fileDestinationFolder, changeFilenameForMZ(filename, node));
                dirx++;

                dirx = (dirx > 3 ? 0 : dirx);
            }
        }
    }

    /**
     * @param files
     * @param i
     * @param fileDestinationFolder
     * @param filename
     */
    private void moveFile(File file, String fileDestinationFolder, String filename) {
        boolean result = file.renameTo(new File(fileDestinationFolder, filename));
        if (result) {
            logger.debug("Moving " + filename + " To " + fileDestinationFolder + " was " + "successfull");
        } else {
            logger.error("Moving " + filename + " To " + fileDestinationFolder + " failed");
        }
    }

    /**
     * @param files
     * @param i
     * @param folderpath
     */
    private void copySgehFiles(File file, String folderpath) {
        try {
            new FileCopier().copy(file, new File(folderpath, file.getName()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /** create new directory 
     * @param node
     */
    private void createDirectory(String node) {
        if (!isDirectoryExists(node)) {
            new File(node).mkdirs();
        }
    }

    /**
     * @param dir
     * @return boolean
     */
    public boolean isDirectoryExists(String dir) {
        return new File(dir).exists();
    }

    /**
     * append node name to filename i.e. SGSN05_A20130716.2239+0800-20130716.2240+0800_1_ebs.219
     * @param filename , node
     * @return
     */
    public String changeFilenameForMZ(String filename, String node) {
        return new StringBuilder(node).append(UNDERSCORE).append(filename).toString();
    }

}