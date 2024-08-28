/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.automation.file;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.lang.NotImplementedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.util.FileUtils;

/**
 * @author eemecoy
 *
 */
public class LocalMachineFileAgent implements FileAgent {

    private static final Logger logger = LoggerFactory.getLogger(LocalMachineFileAgent.class);

    @Override
    public void renameFile(String fileName, String rename) {

        final File existingFile = new File(fileName);
        if (existingFile.exists()) {
            final boolean result = existingFile.renameTo(new File(rename));
            if (result) {
                logger.debug("Old file backed up from " + fileName + " to " + rename);
            } else {
                throw new RuntimeException("Failed to back up file from " + fileName + " to " + rename);
            }
        }
    }

    @Override
    public String[] listFiles(String path) {
        final File folder = new File(path);
        final String[] filesInFolder = folder.list();
        return filesInFolder;
    }

    @Override
    public void deleteAllFilesInFolder(String path) {
        final File folder = new File(path);
        logger.debug("Cleaning folder " + path);
        final String[] filesInFolder = folder.list();
        if (filesInFolder != null) {
            for (final String item : filesInFolder) {
                deleteFileOrFolder(path, item);
            }
        }
    }

    private void deleteFileOrFolder(final String path, final String file) {
        final String fullPathToFile = path + File.separator + file;
        final File fileObject = new File(fullPathToFile);
        if (fileObject.isDirectory()) {
            final String[] filesInFolder = fileObject.list();
            if (filesInFolder != null) {
                for (final String fileInFolder : filesInFolder) {
                    deleteFileOrFolder(fullPathToFile, fileInFolder);
                }
            }
            deleteItem(fullPathToFile, fileObject);
        } else {
            deleteItem(fullPathToFile, fileObject);
        }
    }

    private void deleteItem(final String fullPathToFile, final File fileInFolder) {
        final boolean result = fileInFolder.delete();
        if (result) {
            logger.debug("Successfully deleted " + fullPathToFile);
        } else {
            logger.debug("Failed to delete " + fullPathToFile);
        }
    }

    @Override
    public List<String> readFile(String fileName) {
        try {
            return FileUtils.readFile(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean doesFileExist(String file) {
        File fileObject = new File(file);
        return fileObject.exists();
    }

    @Override
    public void createFolder(String folderName) {
        throw new NotImplementedException();
    }
    
    @Override
    public void writeFile(String fileName, List<String> contents) throws IOException {
    	FileUtils.writeFile(contents, fileName);
    }

}
