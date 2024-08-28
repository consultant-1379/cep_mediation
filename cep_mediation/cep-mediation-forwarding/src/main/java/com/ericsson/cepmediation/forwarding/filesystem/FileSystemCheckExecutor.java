package com.ericsson.cepmediation.forwarding.filesystem;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.forwarding.ForwarderUtilityHelper;


public class FileSystemCheckExecutor {

    private static final int NUMBER_OF_DUMMY_FILE_CREATION_RETRIES = 3;

    private static final String DUMMY_FILE_NAME = "cep_mediation_file_system_check";

    private static final String FILE_SEPERATOR = File.separator;

    private static final Logger logger = LoggerFactory.getLogger(FileSystemCheckExecutor.class);
    
    private String filePrefix; 

    public FileSystemCheckExecutor() {
        filePrefix = ForwarderUtilityHelper.constructFilePrefix();
    }

    /**
     * Perform checks on the file system to help determine if it is possible to write to the file system 
     * @param fileSystemCheckResults object stores the results of the file system check
     */
    void runChecks(FileSystemCheckResultHolder fileSystemCheckResults) {

        String fileSystemName = fileSystemCheckResults.getFilesystemName();
        Set<String> techPackDirNames = fileSystemCheckResults.getTechPackDirNames();

        // Check can we write to file system, try to write to any tech pack directory
        fileSystemCheckResults.setCanFileBeWritten(canFileBeWrittenToFileSystem(fileSystemName, techPackDirNames.iterator().next()));

        fileSystemCheckResults.setPercentageOfDiskSpaceUsed(getPercentageOfDiskSpaceUsedInFileSystem(fileSystemName));

        fileSystemCheckResults.setTechPackDirectoriesCharacteristics(calculateTechPackFileCharacteristics(fileSystemName, techPackDirNames));
    }

    private boolean canFileBeWrittenToFileSystem(String fileSystemName, String techPackDirName) {
        logger.debug("Checking if process can write to the filesystem: " + fileSystemName);
        boolean result = false;
        int retryFileCreationCounter = 0;

        final File path = new File(fileSystemName + FILE_SEPERATOR + techPackDirName);
        File fileToCreate = new File(path.getPath() + FILE_SEPERATOR + "." + filePrefix + DUMMY_FILE_NAME);

        while (result == false && retryFileCreationCounter < NUMBER_OF_DUMMY_FILE_CREATION_RETRIES) {
            logger.debug("Attempt number " + (retryFileCreationCounter + 1) + " to create dummy file " + fileToCreate.getAbsolutePath());
            if (path.exists() && path.isDirectory() && path.canWrite()) {
                //try and create dummy file             
                try {
                    if (!fileToCreate.exists()) {
                        result = fileToCreate.createNewFile();
                        logger.debug("Result of trying to create file " + fileToCreate.getAbsolutePath() + " in the filesystem is: " + result);
                        fileToCreate.delete();
                    } else {
                        // Shouldn't end up here, delete and try again
                        logger.debug("The dummy file " + fileToCreate.getAbsolutePath()
                                + " already exists. Not expected! Deleting it and trying to create the file again ");
                        fileToCreate.delete();
                        result = fileToCreate.createNewFile();
                        fileToCreate.delete();
                    }
                } catch (Exception e) {
                    logger.error("Failed to create the file " + fileToCreate.getAbsolutePath() + " in the fileSystem, " + e.getMessage(), e);
                }
            } else {
                result = false;
                logger.error("Tech pack directory " + path.getAbsolutePath() + " does not exist or it exists but there is not write access to it");
            }
            retryFileCreationCounter++;

            // If result was false then wait 1 second before trying again
            if (result == false) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    // Thread has been interrupted
                    break;
                }
            }
        }

        return result;

    }

    private float getPercentageOfDiskSpaceUsedInFileSystem(String fileSystemName) {
        logger.debug("Checking if there is free space on the File System: " + fileSystemName);
        File outputDir = new File(fileSystemName);

        double totalSpaceMB = 0;
        double usableSpaceMB = 0;
        try {
            totalSpaceMB = (double) outputDir.getTotalSpace() / (1024.0 * 1024.0);
            usableSpaceMB = (double) outputDir.getUsableSpace() / (1024.0 * 1024.0);
            logger.debug("Total Space is (MB): " + totalSpaceMB + " , Usuable Space is (MB): " + usableSpaceMB + " , therefore used space is (MB): "
                    + (totalSpaceMB - usableSpaceMB) + " for directory " + outputDir.getAbsolutePath());
        } catch (Exception e) {
            logger.error("Unable to determine total and/or free space for directory " + outputDir.getAbsolutePath() + " , " + e.getMessage(), e);
            logger.error("Setting disk space usage to 100% to block writing");
            return 100f;
        }

        if (totalSpaceMB > 0) {
            float percentageUsed = (float) (((totalSpaceMB - usableSpaceMB) / totalSpaceMB) * 100);
            logger.debug("Calculated percentage used is: " + percentageUsed + " % ");
            return percentageUsed;
        } else {
            logger.error("Disk Space for directory " + outputDir.getAbsolutePath() + " is reported as 0");
            logger.error("Setting disk space usage to 100% to block writing");
            return 100f;
        }

    }

    /**
     * Calculates the total number and size of all files that are in all sub directories of 
     * the tech pack directories
     * @return DirectoryCharacteristics object containing the number and size of all the files
     */
    private DirectoryCharacteristics calculateTechPackFileCharacteristics(String fileSystemName, Set<String> techPackDirNames) {
        logger.debug("Calculating the number of files and the size of the files in the tech pack directories in file system: " + fileSystemName);
        File root = new File(fileSystemName);

        List<File> techPackDirs = new ArrayList<File>();
        DirectoryCharacteristics rootDirChar = new DirectoryCharacteristics();

        techPackDirs.addAll(findTechPackDirs(root, techPackDirNames));
        for (File techPackDir : techPackDirs) {
            if (logger.isTraceEnabled()) {
                logger.trace("Checking tech pack directory " + techPackDir.getAbsolutePath());
            }
            rootDirChar.addDirectoryCharacteristics(calculateRecursiveDirectoryCharacteristics(techPackDir));
        }

        logger.debug("The total number of files in relevant tech packs directories in " + root.getAbsolutePath() + " is: " + rootDirChar.getNumFiles()
                + " , total size of these files is (MB): " + rootDirChar.getSize() / (1024.0 * 1024.0)
                + " , total number of binary files in the relevant tech pack directories is: " + rootDirChar.getNumBinaryFiles());
        return rootDirChar;
    }

    private List<File> findTechPackDirs(File startDir, Set<String> techPackDirNames) {
        List<File> techPackDirs = new ArrayList<File>();

        try {
            if (startDir.isDirectory()) {
                File[] files = startDir.listFiles();
                if (files != null) {
                    for (File file : files) {
                        if (file.isDirectory()) {
                            if (techPackDirNames.contains(file.getName())) {
                                techPackDirs.add(file);
                            } else {
                                techPackDirs.addAll(findTechPackDirs(file, techPackDirNames));
                            }
                        }
                    }
                } else {
                    logger.error("Unable to read files in directory " + startDir.getAbsolutePath());
                }
            }
        } catch (Exception e) {
            logger.error("Unable to read files in directory " + startDir.getAbsolutePath() + " , " + e.getMessage(), e);
        }

        return techPackDirs;
    }

    private DirectoryCharacteristics calculateRecursiveDirectoryCharacteristics(File dir) {
        DirectoryCharacteristics dirCharacteristics = new DirectoryCharacteristics();
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                dirCharacteristics.addDirectoryCharacteristics(calculateRecursiveDirectoryCharacteristics(file));
            } else {
                dirCharacteristics.increaseSize(file.length());
                dirCharacteristics.increaseNumFiles(1);
                if (file.getName().endsWith(".binary")) {
                    dirCharacteristics.increaseNumBinaryFiles(1);
                }
            }
        }
        return dirCharacteristics;
    }

}
