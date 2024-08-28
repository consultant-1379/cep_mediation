package com.ericsson.cepmediation.loading.filecollection.local;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.util.SystemCommand;
import com.ericsson.cepmediation.loading.filecollection.CollectionAgent;
import com.ericsson.cepmediation.loading.filecollection.CollectionException;

public class LocalFileAgent implements CollectionAgent {
    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(LocalFileAgent.class);

    @Override
    public String[] listDirectories(final String path) throws CollectionException {
        if (null == path) {
            return new String[] {};
        }
        final File localDirectory = createFileObject(path);
        return getLowestLevelDirectories(localDirectory);

    }

    private String[] getLowestLevelDirectories(final File localDirectory) {
        final Collection<String> lowestLevelFolders = new ArrayList<String>();
        walk(getFilesIn(localDirectory), lowestLevelFolders);

        // if localDirectory does not have any sub-directories under it,
        // then localDirectory will be the lowest level directory
        if (lowestLevelFolders.isEmpty()) {
            lowestLevelFolders.add(localDirectory.getAbsolutePath());
        }

        return convertToArray(lowestLevelFolders);
    }

    private File[] getFilesIn(final File localDirectory) {
        return localDirectory.listFiles();
    }

    private String[] convertToArray(final Collection<String> collection) {
        return collection.toArray(new String[] {});
    }

    private void walk(final File[] elements, final Collection<String> lowestLevelFolders) {

        if (elements == null) {
            logger.warn("List on folder " + elements + " returned null");
            return;
        }
        for (final File element : elements) {
            if (element.isDirectory()) {
                if (hasSubDirectories(element)) {
                    walk(getFilesIn(element), lowestLevelFolders);
                } else {
                    lowestLevelFolders.add(element.getAbsolutePath());
                }
            }
        }
    }

    private boolean hasSubDirectories(final File directory) {
        final File[] elements = directory.listFiles();
        if (elements == null) {
            return false;
        }
        for (final File element : elements) {
            if (element.isDirectory()) {
                return true;
            }
        }
        return false;
    }

    protected File createFileObject(final String path) {
        return new File(path);
    }

    @Override
    public TreeSet<String> listFiles(final String[] paths, final String regexPattern) throws CollectionException {
        final TreeSet<String> fileList = new TreeSet<String>();
        for (final String path : paths) {

            final String[] lowestPaths = this.getLowestLevelDirectories(new File(path));

            for (final String lowestPath : lowestPaths) {
                final Collection<File> fileNames = listFileNames(lowestPath, regexPattern);
                if (fileNames != null) {
                    for (final File file : fileNames) {
                        fileList.add(file.getAbsolutePath());
                    }
                }
            }
        }

        return fileList;
    }

    private Collection<File> listFileNames(final String path, final String regexPattern) {
        logger.trace("listLocalFiles(" + path + ')');

        // Hold the list of files for all directories
        final Collection<File> fileList = new TreeSet<File>();

        // List the files in the directory
        final File localPath = createFileObject(path);
        if (!localPath.exists()) {
            return fileList;
        }
        final File[] files = localPath.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(final File arg0, final String name) {
                if (regexPattern == null) {
                    return true;
                }
                return name.matches(regexPattern);
            }
        });
        if (files != null) {
            for (final File file : files) {
                logger.debug("Files found  -->  " + file.getAbsolutePath());
                fileList.add(file);
            }
        }

        // Return the list of files
        if (logger.isTraceEnabled()) {
            logger.trace("listLocalFiles:" + fileList);
        }
        return fileList;
    }

    @Override
    public void getFiles(final Set<String> paths, final String localDirectory) throws CollectionException {
        for (final String path : paths) {
            moveFile(path, localDirectory);
        }

    }

    private void moveFile(final String path, final String localDirectory) {
        try {
            logger.debug("Moving file  " + path + " to " + localDirectory);
            new SystemCommand().runSystemCommand("mv " + path + " " + localDirectory);
        } catch (final Exception e) {
            logger.error("Failed to move the file " + path + " to " + localDirectory);
        }
    }

    @Override
    public void deleteFiles(final Collection<String> files) throws CollectionException {
        logger.trace("deleteFiles(" + files.size() + " files)-->");

        // Iterate over each file
        for (final String fileName : files) {
            final File file = createFileObject(fileName);
            //delete the file if it exists
            if (file.exists()) {
                final boolean deleted = file.delete();
                if (!deleted) {
                    throw new CollectionException("Failed to delete the file: " + fileName);
                }
            } else {
            	// File doesn't exist. Might be a broken symbolic link. Need to delete these also.
            	try {
            		file.delete();
            	} catch (Exception e) {
            		// Don't need to do anything
            	}
            }
        }
        logger.trace("deleteFiles(" + files.size() + " files)<--");
    }

    @Override
    public Set<String> listFiles(final String path, final String regexPattern) throws CollectionException {
        return listFiles(new String[] { path }, regexPattern);
    }

    /* (non-Javadoc)
     * @see com.ericsson.cepmediation.loading.filecollection.CollectionAgent#listFilesOnlyRecursively(java.lang.String)
     */
    @Override
    public Collection<File> recursivelyListFilesOnly(final String directory) throws CollectionException {
        final Collection<File> totalFiles = new ArrayList<File>();
        final File directoryObject = new File(directory);
        final String[] lowestLevelDirectories = getLowestLevelDirectories(directoryObject);
        for (final String lowLevelDirectory : lowestLevelDirectories) {
            final Collection<File> files = listFileNames(lowLevelDirectory, null);
            totalFiles.addAll(files);
        }
        return totalFiles;
    }

}
