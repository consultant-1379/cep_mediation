package com.ericsson.cepmediation.loading.service.task.collection;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.util.FileUtils;
import com.ericsson.cepmediation.base.util.Metrics;
import com.ericsson.cepmediation.base.util.NodeFileNameUtils;
import com.ericsson.cepmediation.base.util.Pair;
import com.ericsson.cepmediation.base.util.Utilities;
import com.ericsson.cepmediation.loading.filecollection.CollectionAgent;
import com.ericsson.cepmediation.loading.filecollection.CollectionAgentFactory;
import com.ericsson.cepmediation.loading.filecollection.CollectionException;
import com.ericsson.cepmediation.loading.filecollection.CollectionMode;
import com.ericsson.cepmediation.loading.filecollection.CollectionModeConfigured;
import com.ericsson.cepmediation.loading.filecollection.ssh.SSHAgent;
import com.ericsson.cepmediation.loading.service.task.CollectedFileComparator;
import com.ericsson.cepmediation.loading.stalerops.StaleRopCheck;

/** This class is responsible for providing the files to be processed to the Parser. */
public class CollectionJob {
    private static final Logger logger = LoggerFactory.getLogger(CollectionJob.class);

    private static final Logger metricLogger = LoggerFactory.getLogger(Metrics.class);

    private static final int FIFTEEN_MINUTES = 15 * 60 * 1000;

    private static final int ONE_MINUTE = 60000;

    // The maximum number of files to keep in .last file.
    private static final int LAST_FILE_SIZE = 1000;

    // Extension for last list files. This file contains names of files processed in the previous pass.
    public static final String LAST_LIST_EXTENSION = ".last";

    // Hold the last list of files for this collection job 
    private LinkedHashSet<String> lastFileList = new LinkedHashSet<String>();

    // Declare the collection agent for this collection job. The agent actually fetches the files.
    private CollectionAgent collectionAgent = null;

    // Collection params specific the type of the parser(i.e. GPEH, EBS etc.)
    private CollectionJobParameters params;

    // Needed for checking if a rop is stale
    private final StaleRopCheck staleRopCheck = new StaleRopCheck();

    // A queue holding stale files. A separate thread will delete all files in this queue
    private final BlockingQueue<File> staleFilesQueue = new LinkedBlockingQueue<File>();

    // Launches the stale rop cleaner thread
    private Executor staleFilesCleanerExecutor = Executors.newSingleThreadExecutor();

    // Used to filter files of interest for collection
    private FilenameFilter fileFilter;

    // Key - rop start, Value - files on the remote server that belong to the rop
    private TreeMap<Long, Set<String>> backlog = new TreeMap<Long, Set<String>>();

    // Contains the remote file paths which should be processed next
    private Set<String> currentRemoteFiles = new HashSet<String>();

    // The last rop processed
    private long lastRop = -1;

    public CollectionJob(final CollectionJobParameters params) {
        logger.debug("Creating collection job with params: " + params);

        // params for collection
        this.params = params;

        // create the agent
        CollectionMode collectionMode = new CollectionModeConfigured().getConfiguredCollectionMode(params.getInputType());
        collectionAgent = new CollectionAgentFactory().createCollectionAgent(params.getFileServerData(), collectionMode);

        // load the last processed files list
        loadLastFileList();

        // create the filter
        this.fileFilter = new FilenameFilter() {
            @Override
            public boolean accept(final File arg0, final String name) {
                if (params.getSearchPattern() == null) {
                    return true;
                }
                return name.matches(params.getSearchPattern());
            }
        };

        // start stale rop cleaner thread
        staleFilesCleanerExecutor.execute(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        List<String> stale = new ArrayList<String>();
                        File file = null;
                        while ((file = staleFilesQueue.take()) != null) {
                            if (file.exists()) {
                                stale.add(file.getAbsolutePath());
                            } else {
                                // Might be a broken symbolic link. Need to cleanup these also.
                                if (params.getCollectionMode() == CollectionMode.SYMBOLIC_LINK) {
                                    stale.add(file.getAbsolutePath());
                                } else {
                                    logger.info("File " + file.getAbsolutePath() + " does not exist. Skipping deletion...");
                                }
                            }
                            if (staleFilesQueue.peek() == null) {
                                logger.trace("Deleting files : " + Arrays.asList(stale));
                                collectionAgent.deleteFiles(stale);
                                stale = new ArrayList<String>();
                            }
                        }
                    } catch (Exception e) {
                        logger.error("Error cleaninig stale files: " + e.getMessage());
                    }
                }
            }
        });
    }

    /** Fetches NE files for processing by parser. */
    public boolean fetchFiles() {
        logger.trace("fetchFiles()-->");
        String jobLabel = params.getJobLabel();

        // will throw Exception if output dir does not exist
        checkOutputDirectoryExists();

        // Holder for the list of files
        Set<String> fileList = null;

        try {
            if (backlog.isEmpty()) {
                //Build up the search pattern for the find command 
                fileList = collectionAgent.listFiles(params.getConfig().getInputDirectory(), params.getSearchPattern());
                trace("job: " + jobLabel + ", found " + fileList.size() + " files on host");

                // remove old files
                removeStaleFiles(fileList);

                // remove broken symbolic links
                if (!fileList.isEmpty()) {
                    if (params.getCollectionMode() == CollectionMode.SYMBOLIC_LINK) {
                        removeBrokenLinks(fileList);
                    }
                }

                if (fileList.isEmpty()) {
                    return false;
                }

                // Check how many files have already been processed
                for (Iterator<String> filesIter = fileList.iterator(); filesIter.hasNext();) {
                    String file = filesIter.next();
                    // Check if this file was on the last list
                    if (!lastFileList.contains(file)) {
                        long fileTimestamp = -1;
                        try {
                            fileTimestamp = getTimestamp(file);
                            long ropStart = getRopStart(fileTimestamp);
                            if (ropStart < lastRop) {
                                logger.debug(String.format("job: " + jobLabel + " - Ignore old file: %1$s. Last processed rop: %2$s", file,
                                        Utilities.time2UTCString(lastRop)));
                            } else {
                                long batchStart = (fileTimestamp / FIFTEEN_MINUTES) * FIFTEEN_MINUTES;
                                Set<String> files = backlog.get(batchStart);
                                if (files == null) {
                                    files = new HashSet<String>();
                                    backlog.put(batchStart, files);
                                }
                                files.add(file);
                            }
                        } catch (Exception e) {
                            logger.error("Could not parse file name: " + file, e);
                        }
                    }
                }
            }
            copyRemoteFiles();
        } catch (final Exception e) {
            traceException("job: " + jobLabel + ", fetch of  files failed", e);
        }

        if (params.isShouldRenameCopiedFiles()) {
            renameCopiedFiles();
        }

        logger.trace("fetchFiles()<--" + (fileList != null ? Arrays.toString(fileList.toArray(new String[0])) : "[]"));

        return !backlog.isEmpty();
    }

    private void copyRemoteFiles() throws CollectionException {
        if (backlog.isEmpty()) {
            trace("job: " + params.getJobLabel() + ", no new files found");
            return;
        }

        long key = backlog.firstKey();
        Set<String> rop = backlog.remove(key);
        trace("job: " + params.getJobLabel() + ", " + rop.size() + " new files found");

        currentRemoteFiles.addAll(rop);

        if (backlog.size() > 0 && logger.isInfoEnabled()) {
            Pair<Long, Long> firstLast = getFirstLast(backlog.keySet(), null);
            logger.info(String.format("Backlog recovery mode, size: %1$s, start: %2$s, end: %3$s ", backlog.size(),
                    Utilities.time2UTCString(firstLast.getFirst()), Utilities.time2UTCString(firstLast.getSecond())));
        }

        if (rop.size() > 0 && params.getCollectionMode() != CollectionMode.SYMBOLIC_LINK) {
            collectionAgent.getFiles(rop, params.getPathToFilesCopiedLocally());
            trace("job: " + params.getJobLabel() + ", fetched " + rop.size() + " files to " + params.getPathToFilesCopiedLocally());
        }

        updateLastFiles();
    }

    private void updateLastFiles() {
        lastFileList.addAll(currentRemoteFiles);
        if (lastFileList.size() > LAST_FILE_SIZE) {
            int thirtyPercent = LAST_FILE_SIZE / 3;
            Iterator<String> iter = lastFileList.iterator();
            for (int i = 0; i < thirtyPercent; i++) {
                iter.next();
                iter.remove();
            }
        }
        saveLastFileList();
    }

    private long getTimestamp(String file) throws ParseException {
        int pos = file.lastIndexOf(File.separator);
        if (pos > -1 && pos < file.length() - 1) {
            file = file.substring(pos + 1);
        }

        Calendar fileTime = NodeFileNameUtils.nameToCalendar(file);
        return fileTime.getTimeInMillis();
    }

    /**
     * This method searches the specified path for files if collection mode is not sym links.
     * All files that belong to one rop are added to the Map, key is the rop start time in millis.
     * 
     * In case of sym links, the links that need to be processed next are in the currentRemoteFile list,
     * therefore it is not needed to search the paths once again.
     */
    public synchronized Map<Long, Collection<File>> getFileNamesByROP(String dir) {
        logger.debug("getFileNamesByROP-->path: " + dir);
        final Map<Long, Collection<File>> ropStart2ropFiles = new TreeMap<Long, Collection<File>>();
        try {
            if (params.getCollectionMode() == CollectionMode.SYMBOLIC_LINK) {
                if (!currentRemoteFiles.isEmpty()) {
                    for (Iterator<String> iter = currentRemoteFiles.iterator(); iter.hasNext();) {
                        File path = new File(iter.next());
                        if (!path.exists()) {
                            iter.remove();
                        } else {
                            addFile(path, ropStart2ropFiles);
                        }
                    }
                }
            } else {
                String[] lowestDirectories = new String[] { dir };

                //if it is not SSHAgent need to find the lowest directory.
                if (!(collectionAgent instanceof SSHAgent)) {
                    lowestDirectories = collectionAgent.listDirectories(dir);
                }

                for (final String lowestDirectory : lowestDirectories) {
                    // Check if the output directory exists
                    final File location = new File(lowestDirectory);
                    if (!location.isDirectory()) {
                        logger.warn("Fetch path does not exist or is not a directory: " + location.getAbsolutePath());
                    } else {
                        for (final String file : location.list(fileFilter)) {
                            final File foundFile = new File(location.getAbsolutePath() + "/" + file);
                            addFile(foundFile, ropStart2ropFiles);
                        }
                    }
                }
            }
        } catch (final Exception e) {
            logger.error("error listing fetched files", e);
        }

        logger.debug("getFileNamesByROP<--rops: " + ropStart2ropFiles);
        return ropStart2ropFiles;
    }

    private void addFile(File file, Map<Long, Collection<File>> ropStart2ropFiles) {
        try {
            final Calendar fileTime = NodeFileNameUtils.nameToCalendar(file.getName());
            final long ropStart = getRopStart(fileTime.getTimeInMillis());
            Collection<File> fileSet = ropStart2ropFiles.get(ropStart);
            if (fileSet == null) {
                fileSet = new TreeSet<File>(new CollectedFileComparator());
                ropStart2ropFiles.put(ropStart, fileSet);
            }

            fileSet.add(file);
        } catch (final ParseException pe) {
            logger.error("Could not parse date from file name. File name: " + file.getName(), pe);
        }
    }

    /** Deletes processed files if needed */
    public void cleanUp(Map<Long, Collection<File>> fileROPMap, Pair<Long, Collection<File>> excludedFiles) {
        Collection<File> excludedFileList = excludedFiles != null ? excludedFiles.getSecond() : null;
        Pair<Long, Long> firstLast = getFirstLast(fileROPMap.keySet(), excludedFiles);
        String rop = firstLast == null ? "empty rop" : normalize(firstLast);
        trace("job: " + params.getJobLabel() + ", cleanup started, rop=" + rop);

        if (firstLast != null && firstLast.getSecond() > lastRop) {
            lastRop = firstLast.getSecond();
        }

        if (params.getCollectionMode() != CollectionMode.SYMBOLIC_LINK) {
            // Now clean up the local cache
            removeFilesIn(params.getPathToFilesCopiedLocally(), excludedFileList);
            if (excludedFileList == null || excludedFileList.size() == 0)
                deleteLocalCacheDirectory();
        }

        if (excludedFileList != null && excludedFileList.size() > 0) {
            Collection<?> excludedStringList = toStringList(excludedFileList);
            currentRemoteFiles.retainAll(excludedStringList);
        } else {
            currentRemoteFiles.clear();
        }

        //Delete the files on the server if needed, runs for SYMBOLIC_LINK
        if (params.isDeleteRemoteFilesAfterCopy()) {
            removeOriginalFilesOnRemoteHost(fileROPMap, excludedFileList);
        }

        trace("job: " + params.getJobLabel() + ", cleanup finished, rop=" + rop);
    }

    private static Pair<Long, Long> getFirstLast(Set<Long> ropTimeSet, Pair<Long, ?> excludedFiles) {
        long ropTimeInitial = 0l;
        long ropTimeFinal = 0l;
        if (ropTimeSet == null || ropTimeSet.size() == 0)
            return null;

        for (Long ropTime : ropTimeSet) {
            if (excludedFiles != null && excludedFiles.getFirst() == ropTime) {
                continue;
            }
            if (0 == ropTimeInitial)
                ropTimeInitial = ropTime;
            ropTimeFinal = ropTime;
        }

        return new Pair<Long, Long>(ropTimeInitial, ropTimeFinal);
    }

    private static String normalize(Pair<Long, Long> firstLast) {
        return Utilities.time2UTCString(firstLast.getFirst()) + " - " + Utilities.time2UTCString(firstLast.getSecond());
    }

    /**
     * Removes stale files from the specified list and puts them into the result list.
     * 
     * @param fileList  list of file names, each element is the complete path to the file
     */
    private void removeStaleFiles(final Collection<String> fileList) {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        long currTime = cal.getTimeInMillis();
        int cnt = 0;
        for (Iterator<String> iterator = fileList.iterator(); iterator.hasNext();) {
            final String completeFilePath = iterator.next();
            final String fileName = FileUtils.getFileNameFromCompleteFilePath(completeFilePath);
            if (staleRopCheck.isStaleRopFile(fileName, currTime)) {
                logger.trace("Skipping stale file: " + completeFilePath);
                if (params.isDeleteRemoteFilesAfterCopy()) {
                    staleFilesQueue.add(new File(completeFilePath));
                }
                cnt++;
                iterator.remove();
            }
        }

        if (logger.isInfoEnabled() && cnt > 0) {
            logger.info("Skipped " + cnt + " stale files!");
        }
    }

    /**
     * Removes broken symbolic links from the specified list and puts them into stale queue for deletion.
     * 
     * @param fileList  list of file names, each element is the complete path to the file
     */
    private void removeBrokenLinks(final Collection<String> fileList) {
        // Broken symbolic links will be returned in file.listFiles() method but the
        // file.exists() method will return false for these links
        int brokenLinkCnt = 0;
        for (Iterator<String> iterator = fileList.iterator(); iterator.hasNext();) {
            final String completeFilePath = iterator.next();
            File file = new File(completeFilePath);
            if (!file.exists()) {
                logger.trace("Skipping broken link: " + completeFilePath);
                staleFilesQueue.add(file);
                brokenLinkCnt++;
                iterator.remove();
            }
        }

        if (logger.isInfoEnabled() && brokenLinkCnt > 0) {
            logger.info("Skipped " + brokenLinkCnt + " broken symbolic links!");
        }
    }

    private void checkOutputDirectoryExists() {
        // Check if the output directory exists, if not create it
        final String outputDirectoryName = params.getPathToFilesCopiedLocally();
        final File outputDirectory = new File(outputDirectoryName);
        if (!outputDirectory.exists()) {
            logger.debug("Directory " + outputDirectoryName + " does not exist, will try to create it");
            if (!outputDirectory.mkdirs()) {
                final String errorMessage = "Failed to create local cache directory:" + outputDirectoryName;
                logger.error(errorMessage);
                throw new RuntimeException(errorMessage);
            }
        }
    }

    private void deleteLocalCacheDirectory() {
        if (params.getCollectionMode() != CollectionMode.SYMBOLIC_LINK) {
            final String pathToFilesCopiedLocally = params.getPathToFilesCopiedLocally();
            final File outputDirectory = new File(pathToFilesCopiedLocally);
            logger.debug("Deleting files in " + pathToFilesCopiedLocally);
            if (!outputDirectory.delete()) {
                logger.error("failed to delete local cache directory:" + pathToFilesCopiedLocally);
            }

        }
    }

    /**
     * The name of the files captool produces are not in a standard format.
     * Rename the files to the format which EA recognises.
     * From: "summary-<dateTime>-<restOfName>.blk"
     * To:       "A<yearMonthDay>.<hourMinute>_captool_<orginalName>"
     */
    private void renameCopiedFiles() {
        logger.trace("renameCopiedFiles() --> ");
        final File location = new File(params.getPathToFilesCopiedLocally());
        if (!location.isDirectory()) {
            logger.debug("cache directory for fetched files does not exist or is not a directory:" + params.getPathToFilesCopiedLocally());
            return;
        }

        // Add each file in this directory
        for (final String fileName : location.list()) {
            final int startOfDate = fileName.indexOf("summary-") + 8;
            final String fileDate = fileName.substring(startOfDate);
            final int endOfDate = fileDate.indexOf("-");
            final String date = fileDate.substring(0, endOfDate);
            final String yearMonthDay = date.substring(0, 8);
            final String hourMinute = date.substring(8, 12);
            final String newFileName = "A" + yearMonthDay + "." + hourMinute + "_captool_summary-" + fileDate;
            final File newName = new File(location, newFileName);

            final File file = new File(location, fileName);
            final boolean succeeded = file.renameTo(newName);
            if (!succeeded) {
                logger.error("Failed to rename the captool log file: " + fileName + " to: " + newFileName);
            }
        }
        logger.trace("renameCopiedFiles() <-- ");
    }

    /**
     * This method deletes files copied from the OSS machine or local host when they have been parsed
     * @param The location from which to delete the files
     */
    private synchronized void removeFilesIn(final String location, Collection<File> excludedFileList) {
        logger.trace("removeFiles-->");

        final Map<Long, Collection<File>> fileROPMap = getFileNamesByROP(location);

        // Iterate over each ROP
        for (final Collection<File> fileSet : fileROPMap.values()) {
            for (final File file : fileSet) {
                if (!isFileInExcludedList(excludedFileList, file)) {
                    if (!file.delete())
                        logger.debug("failed to delete file: " + file);
                }
            }
        }
        logger.trace("removeFiles-->");
    }

    private boolean isFileInExcludedList(Collection<File> excludedFileList, File file) {
        return (excludedFileList != null && excludedFileList.contains(file));
    }

    /**
     * This method deletes files copied from the original location when they have been parsed
     * @param The location from which to delete the files
     */
    private synchronized void removeOriginalFilesOnRemoteHost(Map<Long, Collection<File>> fileROPMap, Collection<File> excludedFileList) {
        logger.debug("removeFiles-->");
        try {
            final Set<String> filesToDelete = getFilesToDelete(fileROPMap);
            final Set<String> additionalFiles = getAdditionalFilesToDelete();

            if (additionalFiles != null && additionalFiles.size() > 0)
                filesToDelete.addAll(additionalFiles);

            if (excludedFileList != null && excludedFileList.size() > 0) {
                Collection<?> excludedStringList = toStringList(excludedFileList);
                filesToDelete.removeAll(excludedStringList);
            }

            if (filesToDelete.size() > 0) {
                collectionAgent.deleteFiles(filesToDelete);
                metricLogger.debug("job: " + params.getJobLabel() + ", deleted " + filesToDelete.size() + " files");
            }
        } catch (final CollectionException e) {
            metricLogger.trace("job: " + params.getJobLabel() + ", delete of files failed", e);
            logger.debug("job: " + params.getJobLabel() + ", delete of files failed", e);
        }
        logger.debug("removeFiles-->");
    }

    private Set<String> getFilesToDelete(Map<Long, Collection<File>> fileROPMap) {
        Set<String> filesToDelete = new HashSet<String>();
        for (Long startTime : fileROPMap.keySet()) {
            for (File f : fileROPMap.get(startTime)) {
                filesToDelete.add(f.getAbsolutePath());
            }
        }
        return filesToDelete;
    }

    private Collection<?> toStringList(Collection<File> excludedFileList) {
        Collection<String> excludedFiles = new TreeSet<String>();
        for (File f : excludedFileList)
            excludedFiles.add(f.getAbsolutePath());
        return excludedFiles;
    }

    /**
     * Returns a list of any additional files (on top of the files which were 
     * collected) which should be deleted from the node during this ROP
     * @return The additional list of files to delete or null if no extra 
     * files
     */

    private Set<String> getAdditionalFilesToDelete() throws CollectionException {
        if (params.isShouldDeleteAdditionalFiles()) {
            Set<String> additionalFiles = null;
            //Staple at the end of each ROP creates .log files, from the .tmp files
            //which it writes to during the ROP.  So this should catch all the files
            final String searchPattern = ".*.log";
            additionalFiles = collectionAgent.listFiles(params.getConfig().getInputDirectory(), searchPattern);
            if (logger.isTraceEnabled()) {
                logger.trace("Adding the following remote files to the list to be deleted: " + additionalFiles.toString());
            }
            return additionalFiles;

        }
        return null;
    }

    private void loadLastFileList() {
        logger.debug("loadLastFileList()-->");

        // Find the last list file
        final File lastFileListFile = new File(params.getPathToFilesCopiedLocally() + LAST_LIST_EXTENSION);
        if (lastFileListFile.isFile()) {
            FileReader fileReader = null;
            BufferedReader lastListReader = null;
            // Open the file
            try {
                fileReader = new FileReader(lastFileListFile);
                lastListReader = new BufferedReader(fileReader);

                // Read each file name line by line
                String fileName = null;
                while ((fileName = lastListReader.readLine()) != null) {
                    fileName = fileName.trim();
                    try {
                        long ropStart = getRopStart(getTimestamp(fileName));
                        if (ropStart > lastRop) {
                            lastRop = ropStart;
                        }
                    } catch (Exception e) {
                        logger.warn("Error extracting timestamp from file name: " + fileName, e);
                    }
                    lastFileList.add(fileName);
                }

                // Close the file
                lastListReader.close();

                logger.debug("last file list loaded from " + lastFileListFile);
            } catch (final Exception e) {
                logger.debug("last list file could not be opened: " + lastFileListFile, e);
            } finally {
                close(lastListReader);
                close(fileReader);
            }
        } else {
            logger.debug("last file list file not found: " + lastFileListFile);
        }
        logger.debug("loadLastFileList()<--");
    }

    /**
     * Save the last list of files to the file cache
     */
    private void saveLastFileList() {
        logger.debug("saveLastFileList()-->");

        // Find the last file list file
        final File lastFileListFile = new File(params.getPathToFilesCopiedLocally() + LAST_LIST_EXTENSION);

        FileOutputStream fileOutputStream = null;
        PrintWriter lastListWriter = null;
        // Create the file
        try {
            fileOutputStream = new FileOutputStream(lastFileListFile);
            lastListWriter = new PrintWriter(fileOutputStream);

            // Write each file name line by line
            for (final String fileName : lastFileList) {
                lastListWriter.println(fileName);
            }

            // Close the file
            lastListWriter.close();

            logger.debug("last file list written to " + lastFileListFile);
        } catch (final Exception e) {
            logger.debug("last list file could not be created: " + lastFileListFile, e);
        } finally {
            close(fileOutputStream);
            close(lastListWriter);
        }

        logger.debug("saveLastFileList()<--");
    }

    public CollectionMode getCollectionMode() {
        return params.getCollectionMode();
    }

    private void traceException(final String message, final Exception e) {
        metricLogger.warn(message, e);
        logger.debug(message, e);
    }

    private void trace(final String message) {
        metricLogger.trace(message);
        logger.debug(message);
    }

    private void close(final Closeable lastListReader) {
        FileUtils.closeWithoutException(lastListReader);
    }

    private long getRopStart(long timestamp) {
        return (timestamp / ONE_MINUTE) * ONE_MINUTE;
    }
}