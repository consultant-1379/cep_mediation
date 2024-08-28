/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.service.task.collection.gpeh;

import static java.io.File.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.proc.config.Ne;
import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.base.util.ConfigData;
import com.ericsson.cepmediation.base.util.FileUtils;
import com.ericsson.cepmediation.base.util.Pair;
import com.ericsson.cepmediation.base.util.ResourceLoadingUtilities;
import com.ericsson.cepmediation.loading.service.task.collection.CollectionJob;
import com.ericsson.cepmediation.loading.service.task.gpeh.GPEHParsingJob;
import com.ericsson.cepmediation.test.util.CepMediationPropertiesUpdator;
import com.ericsson.cepmediation.test.util.PrivateFieldAccessor;
import com.ericsson.cepmediation.test.util.PrivateMethodCaller;

public class GpehSymLinkCollectionJobTest {
    private static final int INITIAL_COUNT_IN_LAST_FILE = 3;

    private static final String DODGY_FILE_REGEX = ".*dodgyFile.txt";

    private static final Logger logger = LoggerFactory.getLogger(GpehSymLinkCollectionJobTest.class);

    private static final String INPUT_DIR_NAME = "input";

    private static final int FIFTEEN_MINS = 15 * 60 * 1000;

    private static final String OUTPUT_DIR_NAME = "output";

    private static final int SERVICE_ID = 2;

    private static final int PROCESS_ID = 1;

    private static final int JOB_COUNTER = 3;

    private static SimpleDateFormat dateFormatForRopFileNames = new SimpleDateFormat("yyyyMMdd.HHmm");

    private CollectionJob collectionJob;

    private static String GPEH_FILE_NAME_TEMPLATE = "A%1$s_SubNetwork=RNC09,MeContext=RNC09_rnc_gpehfile_Mp%2$s.bin.gz";

    private CepMediationPropertiesUpdator updator;

    private ResourceLoadingUtilities resourceLoadingUtilities;

    private List<String> lastFileContent;

    private String outputDirPath;

    private String inputDirPath;

    private String lastFilePath;

    private StubbedParsingJob gpehParsingJob;

    @Before
    public void setup() throws SecurityException, IllegalArgumentException, NoSuchFieldException, IllegalAccessException {
        dateFormatForRopFileNames.setTimeZone(TimeZone.getTimeZone("UTC"));

        resourceLoadingUtilities = new ResourceLoadingUtilities();

        String lastFile = "RNC1.last";
        lastFilePath = resourceLoadingUtilities.getPathForResourceOnClassPath("collection_job" + separator + OUTPUT_DIR_NAME + separator + lastFile);
        try {
            lastFileContent = FileUtils.readFile(lastFilePath);
        } catch (IOException e) {
            logger.error(e.getMessage());
            fail("Could not read last file!");
        }

        outputDirPath = lastFilePath.replaceAll(lastFile, "");
        inputDirPath = outputDirPath.replaceAll(OUTPUT_DIR_NAME, INPUT_DIR_NAME);

        updator = new CepMediationPropertiesUpdator();
        updator.setPropVal("general.server.radio.file.collection.mode", "SYMBOLIC_LINK");
        updator.setPropVal("general.filecopy.destination", outputDirPath);
        updator.setPropVal("backlog.recovery.interval", "60");

        collectionJob = createGpehCollectionJob();
    }

    @After
    public void tearDown() {
        // restore props
        updator.restoreOriginalValues();

        // cleanup any files that may have been created as a result of test execution
        List<String> files = listFiles(inputDirPath, true);
        files.addAll(listFiles(OUTPUT_DIR_NAME, true));
        for (String file : files) {
            if (!file.matches(DODGY_FILE_REGEX)) {
                new File(file).delete();
            }
        }

        // restore .last file
        try {
            FileUtils.writeFile(lastFileContent, lastFilePath);
        } catch (IOException e) {
            logger.error("Could not write last files contents: " + e.getMessage());
            throw new RuntimeException(e);
        }

    }

    @Test
    public void verifyInputFolderEmpty() {
        List<String> inputFiles = listFiles(inputDirPath, true);
        assertThat(inputFiles.size(), is(1));
        assertTrue(inputFiles.get(0).matches(DODGY_FILE_REGEX));
    }

    @Test
    public void shouldLoadLastFileList() throws IllegalArgumentException, IllegalAccessException, SecurityException, NoSuchFieldException {
        PrivateFieldAccessor lastFileListAcc = new PrivateFieldAccessor(collectionJob, "lastFileList");
        Set<String> lastFileList = (Set<String>) lastFileListAcc.getVal();
        assertThat(lastFileList.size(), is(3));
    }

    @Test
    public void shouldFetchFiles() throws IOException, SecurityException, IllegalArgumentException, NoSuchFieldException, IllegalAccessException,
            InvocationTargetException {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        createFiles(cal.getTimeInMillis(), 10);

        List<String> inputFiles = listFiles(inputDirPath, true);
        assertThat(inputFiles.size(), is(11));

        Set<String> lastFileList = assertLastFile(INITIAL_COUNT_IN_LAST_FILE);

        collectionJob.fetchFiles();

        lastFileList = assertLastFile(10);

        for (String file : inputFiles) {
            if (!file.matches(DODGY_FILE_REGEX) && !lastFileList.contains(new File(file).getAbsolutePath())) {
                fail("The file " + file + " was not added to last files list!");
            }
        }

        List<String> files = listFiles(outputDirPath, true);
        assertThat(files.size(), is(1));
        assertTrue(new File(files.get(0)).getAbsolutePath().equals(new File(lastFilePath).getAbsolutePath()));

        PrivateMethodCaller callGetInputFolderPaths = new PrivateMethodCaller(gpehParsingJob, "getInputFolderPaths");
        String paths = (String) callGetInputFolderPaths.call();

        Map<Long, Collection<File>> rops = collectionJob.getFileNamesByROP(paths);
        assertThat(rops.size(), is(1));
        Long ropStart = rops.keySet().iterator().next();
        assertThat((cal.getTimeInMillis() / (60 * 1000)) * (60 * 1000), is(ropStart));
        assertThat(rops.get(ropStart).size(), is(10));

        collectionJob.cleanUp(rops, null);
        inputFiles = listFiles(inputDirPath, true);
        assertThat(inputFiles.size(), is(1));
    }

    private Set<String> assertLastFile(int size) throws SecurityException, IllegalArgumentException, NoSuchFieldException, IllegalAccessException {
        PrivateFieldAccessor lastFileListAcc = new PrivateFieldAccessor(collectionJob, "lastFileList");
        Set<String> lastFileList = (Set<String>) lastFileListAcc.getVal();
        if (size != INITIAL_COUNT_IN_LAST_FILE) {
            size += INITIAL_COUNT_IN_LAST_FILE;
        }
        assertThat(lastFileList.size(), is(size));
        return lastFileList;
    }

    @Test
    public void shouldDeleteStaleFiles() throws IOException, SecurityException, IllegalArgumentException, NoSuchFieldException, IllegalAccessException,
            InvocationTargetException {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        long currTime = cal.getTimeInMillis();
        int backlogInterval = CepMediationProperties.getIntProperty(CepMediationProperty.BACKLOG_RECOVERY_INTERVAL);
        long staleTime = ((currTime / FIFTEEN_MINS) * FIFTEEN_MINS) - (((backlogInterval * 60 * 1000) / FIFTEEN_MINS) * FIFTEEN_MINS) - 1;

        // create stale files
        createFiles(staleTime, 17);

        // create not stale files
        List<String> notStaleFiles = createFiles(currTime, 10);

        List<String> inputFiles = listFiles(inputDirPath, true);
        assertThat(inputFiles.size(), is(28));

        Set<String> lastFileList = assertLastFile(INITIAL_COUNT_IN_LAST_FILE);

        collectionJob.fetchFiles();

        try {
            // give a chance to the rop cleaner thread to finish
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            logger.error(e.getMessage());
        }

        lastFileList = assertLastFile(10);

        for (String file : notStaleFiles) {
            if (!file.matches(DODGY_FILE_REGEX) && !lastFileList.contains(new File(file).getAbsolutePath())) {
                fail("The file " + file + " was not added to last files list!");
            }
        }

        List<String> files = listFiles(outputDirPath, true);
        assertThat(files.size(), is(1));
        assertTrue(new File(files.get(0)).getAbsolutePath().equals(new File(lastFilePath).getAbsolutePath()));

        PrivateMethodCaller callGetInputFolderPaths = new PrivateMethodCaller(gpehParsingJob, "getInputFolderPaths");
        String paths = (String) callGetInputFolderPaths.call();

        Map<Long, Collection<File>> rops = collectionJob.getFileNamesByROP(paths);
        assertThat(rops.size(), is(1));
        Long ropStart = rops.keySet().iterator().next();
        assertThat((cal.getTimeInMillis() / (60 * 1000)) * (60 * 1000), is(ropStart));
        assertThat(rops.get(ropStart).size(), is(10));

        collectionJob.cleanUp(rops, null);
        inputFiles = listFiles(inputDirPath, true);
        assertThat(inputFiles.size(), is(1));
    }

    @Test
    public void shouldFetchTwoRops() throws IOException, SecurityException, IllegalArgumentException, NoSuchFieldException, IllegalAccessException,
            InvocationTargetException {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        long currTime = cal.getTimeInMillis();
        createFiles(currTime, 15);
        String currTimeStr = dateFormatForRopFileNames.format(currTime);

        long prevRop = currTime - 15 * 60 * 1000 - 1;
        String prevRopStr = dateFormatForRopFileNames.format(prevRop);
        createFiles(prevRop, 10);

        List<String> inputFiles = listFiles(inputDirPath, true);
        assertThat(inputFiles.size(), is(26));

        Set<String> lastFileList = assertLastFile(INITIAL_COUNT_IN_LAST_FILE);

        boolean hasMore = collectionJob.fetchFiles();

        assertTrue(hasMore);

        PrivateFieldAccessor currentRemoteFilesAccessor = new PrivateFieldAccessor(collectionJob, "currentRemoteFiles");
        Set<String> currentRemoteFiles = (Set<String>) currentRemoteFilesAccessor.getVal();
        assertThat(currentRemoteFiles.size(), is(10));

        lastFileList = assertLastFile(10);

        for (String file : inputFiles) {
            if (file.indexOf(prevRopStr) > -1) {
                if (!file.matches(DODGY_FILE_REGEX) && !lastFileList.contains(new File(file).getAbsolutePath())) {
                    fail("The file " + file + " was not added to last files list!");
                }
            }
        }

        List<String> files = listFiles(outputDirPath, true);
        assertThat(files.size(), is(1));
        assertTrue(new File(files.get(0)).getAbsolutePath().equals(new File(lastFilePath).getAbsolutePath()));

        PrivateMethodCaller callGetInputFolderPaths = new PrivateMethodCaller(gpehParsingJob, "getInputFolderPaths");
        String paths = (String) callGetInputFolderPaths.call();

        Map<Long, Collection<File>> rops = collectionJob.getFileNamesByROP(paths);
        assertThat(rops.size(), is(1));
        Long ropStart = rops.keySet().iterator().next();
        assertThat((prevRop / (60 * 1000)) * (60 * 1000), is(ropStart));
        assertThat(rops.get(ropStart).size(), is(10));

        collectionJob.cleanUp(rops, null);
        inputFiles = listFiles(inputDirPath, true);
        assertThat(inputFiles.size(), is(16));

        assertThat(currentRemoteFiles.size(), is(0));

        hasMore = collectionJob.fetchFiles();
        assertFalse(hasMore);
        assertThat(currentRemoteFiles.size(), is(15));

        lastFileList = assertLastFile(25);

        for (String file : inputFiles) {
            if (file.indexOf(currTimeStr) > -1) {
                if (!file.matches(DODGY_FILE_REGEX) && !lastFileList.contains(new File(file).getAbsolutePath())) {
                    fail("The file " + file + " was not added to last files list!");
                }
            }
        }

        files = listFiles(outputDirPath, true);
        assertThat(files.size(), is(1));
        assertTrue(new File(files.get(0)).getAbsolutePath().equals(new File(lastFilePath).getAbsolutePath()));

        paths = (String) callGetInputFolderPaths.call();

        rops = collectionJob.getFileNamesByROP(paths);
        assertThat(rops.size(), is(1));
        ropStart = rops.keySet().iterator().next();
        assertThat((currTime / (60 * 1000)) * (60 * 1000), is(ropStart));
        assertThat(rops.get(ropStart).size(), is(15));

        collectionJob.cleanUp(rops, null);
        inputFiles = listFiles(inputDirPath, true);
        assertThat(inputFiles.size(), is(1));
        assertThat(currentRemoteFiles.size(), is(0));
    }

    @Test
    public void shouldFetchThreeRops() throws IOException, SecurityException, IllegalArgumentException, NoSuchFieldException, IllegalAccessException,
            InvocationTargetException {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        long currTime = cal.getTimeInMillis();
        createFiles(currTime, 15);
        String currTimeStr = dateFormatForRopFileNames.format(currTime);

        long prevRop = currTime - 15 * 60 * 1000 - 1;
        String prevRopStr = dateFormatForRopFileNames.format(prevRop);
        createFiles(prevRop, 10);

        long firstRop = prevRop - 15 * 60 * 1000 - 1;
        String firstRopStr = dateFormatForRopFileNames.format(firstRop);
        createFiles(firstRop, 34);

        List<String> inputFiles = listFiles(inputDirPath, true);
        assertThat(inputFiles.size(), is(60));

        Set<String> lastFileList = assertLastFile(INITIAL_COUNT_IN_LAST_FILE);

        // first rop
        boolean hasMore = collectionJob.fetchFiles();

        assertTrue(hasMore);

        PrivateFieldAccessor currentRemoteFilesAccessor = new PrivateFieldAccessor(collectionJob, "currentRemoteFiles");
        Set<String> currentRemoteFiles = (Set<String>) currentRemoteFilesAccessor.getVal();
        assertThat(currentRemoteFiles.size(), is(34));

        lastFileList = assertLastFile(34);
        for (String file : inputFiles) {
            if (file.indexOf(firstRopStr) > -1) {
                if (!file.matches(DODGY_FILE_REGEX) && !lastFileList.contains(new File(file).getAbsolutePath())) {
                    fail("The file " + file + " was not added to last files list!");
                }
            }
        }

        List<String> files = listFiles(outputDirPath, true);
        assertThat(files.size(), is(1));
        assertTrue(new File(files.get(0)).getAbsolutePath().equals(new File(lastFilePath).getAbsolutePath()));

        PrivateMethodCaller callGetInputFolderPaths = new PrivateMethodCaller(gpehParsingJob, "getInputFolderPaths");
        String paths = (String) callGetInputFolderPaths.call();

        Map<Long, Collection<File>> rops = collectionJob.getFileNamesByROP(paths);
        assertThat(rops.size(), is(1));
        Long ropStart = rops.keySet().iterator().next();
        assertThat((firstRop / (60 * 1000)) * (60 * 1000), is(ropStart));
        assertThat(rops.get(ropStart).size(), is(34));

        collectionJob.cleanUp(rops, null);
        assertThat(currentRemoteFiles.size(), is(0));
        inputFiles = listFiles(inputDirPath, true);
        assertThat(inputFiles.size(), is(26));

        // second rop
        hasMore = collectionJob.fetchFiles();

        assertTrue(hasMore);

        assertThat(currentRemoteFiles.size(), is(10));

        lastFileList = assertLastFile(44);

        for (String file : inputFiles) {
            if (file.indexOf(prevRopStr) > -1) {
                if (!file.matches(DODGY_FILE_REGEX) && !lastFileList.contains(new File(file).getAbsolutePath())) {
                    fail("The file " + file + " was not added to last files list!");
                }
            }
        }

        files = listFiles(outputDirPath, true);
        assertThat(files.size(), is(1));
        assertTrue(new File(files.get(0)).getAbsolutePath().equals(new File(lastFilePath).getAbsolutePath()));

        callGetInputFolderPaths = new PrivateMethodCaller(gpehParsingJob, "getInputFolderPaths");
        paths = (String) callGetInputFolderPaths.call();

        rops = collectionJob.getFileNamesByROP(paths);
        assertThat(rops.size(), is(1));
        ropStart = rops.keySet().iterator().next();
        assertThat((prevRop / (60 * 1000)) * (60 * 1000), is(ropStart));
        assertThat(rops.get(ropStart).size(), is(10));

        collectionJob.cleanUp(rops, null);
        assertThat(currentRemoteFiles.size(), is(0));
        inputFiles = listFiles(inputDirPath, true);
        assertThat(inputFiles.size(), is(16));

        // third rop
        hasMore = collectionJob.fetchFiles();
        assertFalse(hasMore);

        assertThat(currentRemoteFiles.size(), is(15));

        lastFileList = assertLastFile(59);

        for (String file : inputFiles) {
            if (file.indexOf(currTimeStr) > -1) {
                if (!file.matches(DODGY_FILE_REGEX) && !lastFileList.contains(new File(file).getAbsolutePath())) {
                    fail("The file " + file + " was not added to last files list!");
                }
            }
        }

        files = listFiles(outputDirPath, true);
        assertThat(files.size(), is(1));
        assertTrue(new File(files.get(0)).getAbsolutePath().equals(new File(lastFilePath).getAbsolutePath()));

        paths = (String) callGetInputFolderPaths.call();

        rops = collectionJob.getFileNamesByROP(paths);
        assertThat(rops.size(), is(1));
        ropStart = rops.keySet().iterator().next();
        assertThat((currTime / (60 * 1000)) * (60 * 1000), is(ropStart));
        assertThat(rops.get(ropStart).size(), is(15));

        collectionJob.cleanUp(rops, null);
        assertThat(currentRemoteFiles.size(), is(0));

        inputFiles = listFiles(inputDirPath, true);
        assertThat(inputFiles.size(), is(1));
    }

    @Test
    public void shouldSkipIncompleteRop() throws IOException, SecurityException, IllegalArgumentException, NoSuchFieldException, IllegalAccessException,
            InvocationTargetException {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        long currTime = cal.getTimeInMillis();
        createFiles(currTime, 15);
        String currTimeStr = dateFormatForRopFileNames.format(currTime);

        long prevRop = currTime - 15 * 60 * 1000 - 1;
        String prevRopStr = dateFormatForRopFileNames.format(prevRop);
        createFiles(prevRop, 10);

        List<String> inputFiles = listFiles(inputDirPath, true);
        assertThat(inputFiles.size(), is(26));

        Set<String> lastFileList = assertLastFile(INITIAL_COUNT_IN_LAST_FILE);

        boolean hasMore = collectionJob.fetchFiles();

        assertTrue(hasMore);

        PrivateFieldAccessor currentRemoteFilesAccessor = new PrivateFieldAccessor(collectionJob, "currentRemoteFiles");
        Set<String> currentRemoteFiles = (Set<String>) currentRemoteFilesAccessor.getVal();
        assertThat(currentRemoteFiles.size(), is(10));

        lastFileList = assertLastFile(10);

        for (String file : inputFiles) {
            if (file.indexOf(prevRopStr) > -1) {
                if (!file.matches(DODGY_FILE_REGEX) && !lastFileList.contains(new File(file).getAbsolutePath())) {
                    fail("The file " + file + " was not added to last files list!");
                }
            }
        }

        List<String> files = listFiles(outputDirPath, true);
        assertThat(files.size(), is(1));
        assertTrue(new File(files.get(0)).getAbsolutePath().equals(new File(lastFilePath).getAbsolutePath()));

        PrivateMethodCaller callGetInputFolderPaths = new PrivateMethodCaller(gpehParsingJob, "getInputFolderPaths");
        String paths = (String) callGetInputFolderPaths.call();

        Map<Long, Collection<File>> rops = collectionJob.getFileNamesByROP(paths);
        assertThat(rops.size(), is(1));
        Iterator<Long> iterator = rops.keySet().iterator();
        Long ropStart = iterator.next();
        assertThat((prevRop / (60 * 1000)) * (60 * 1000), is(ropStart));
        assertThat(rops.get(ropStart).size(), is(10));

        PrivateMethodCaller parseRops = new PrivateMethodCaller(gpehParsingJob, "parseRops", Map.class);
        Pair<Long, Collection<File>> excludedFiles = (Pair<Long, Collection<File>>) parseRops.call(rops);
        assertThat(excludedFiles.getSecond().size(), is(10));

        collectionJob.cleanUp(rops, excludedFiles);
        assertThat(currentRemoteFiles.size(), is(10));

        inputFiles = listFiles(inputDirPath, true);
        assertThat(inputFiles.size(), is(26));

        hasMore = collectionJob.fetchFiles();
        assertFalse(hasMore);
        assertThat(currentRemoteFiles.size(), is(25));

        lastFileList = assertLastFile(25);

        for (String file : inputFiles) {
            if (file.indexOf(currTimeStr) > -1) {
                if (!file.matches(DODGY_FILE_REGEX) && !lastFileList.contains(new File(file).getAbsolutePath())) {
                    fail("The file " + file + " was not added to last files list!");
                }
            }
        }

        files = listFiles(outputDirPath, true);
        assertThat(files.size(), is(1));
        assertTrue(new File(files.get(0)).getAbsolutePath().equals(new File(lastFilePath).getAbsolutePath()));

        paths = (String) callGetInputFolderPaths.call();

        rops = collectionJob.getFileNamesByROP(paths);
        assertThat(rops.size(), is(2));
        iterator = rops.keySet().iterator();
        // first rop
        ropStart = iterator.next();
        assertThat((prevRop / (60 * 1000)) * (60 * 1000), is(ropStart));
        assertThat(rops.get(ropStart).size(), is(10));
        // second rop
        ropStart = iterator.next();
        assertThat((currTime / (60 * 1000)) * (60 * 1000), is(ropStart));
        assertThat(rops.get(ropStart).size(), is(15));

        excludedFiles = (Pair<Long, Collection<File>>) parseRops.call(rops);
        assertTrue(excludedFiles == null);

        collectionJob.cleanUp(rops, excludedFiles);
        inputFiles = listFiles(inputDirPath, true);
        assertThat(inputFiles.size(), is(1));
        assertThat(currentRemoteFiles.size(), is(0));
    }

    @Test
    public void shouldProcessIncompleteRop() throws IOException, SecurityException, IllegalArgumentException, NoSuchFieldException, IllegalAccessException,
            InvocationTargetException {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        long currTime = cal.getTimeInMillis();

        long prevRop = currTime - 15 * 60 * 1000 - 1;
        String prevRopStr = dateFormatForRopFileNames.format(prevRop);
        createFiles(prevRop, 10);

        List<String> inputFiles = listFiles(inputDirPath, true);
        assertThat(inputFiles.size(), is(11));

        Set<String> lastFileList = assertLastFile(INITIAL_COUNT_IN_LAST_FILE);

        boolean hasMore = collectionJob.fetchFiles();

        assertFalse(hasMore);

        PrivateFieldAccessor currentRemoteFilesAccessor = new PrivateFieldAccessor(collectionJob, "currentRemoteFiles");
        Set<String> currentRemoteFiles = (Set<String>) currentRemoteFilesAccessor.getVal();
        assertThat(currentRemoteFiles.size(), is(10));

        lastFileList = assertLastFile(10);

        for (String file : inputFiles) {
            if (file.indexOf(prevRopStr) > -1) {
                if (!file.matches(DODGY_FILE_REGEX) && !lastFileList.contains(new File(file).getAbsolutePath())) {
                    fail("The file " + file + " was not added to last files list!");
                }
            }
        }

        List<String> files = listFiles(outputDirPath, true);
        assertThat(files.size(), is(1));
        assertTrue(new File(files.get(0)).getAbsolutePath().equals(new File(lastFilePath).getAbsolutePath()));

        PrivateMethodCaller callGetInputFolderPaths = new PrivateMethodCaller(gpehParsingJob, "getInputFolderPaths");
        String paths = (String) callGetInputFolderPaths.call();

        Map<Long, Collection<File>> rops = collectionJob.getFileNamesByROP(paths);
        assertThat(rops.size(), is(1));
        Iterator<Long> iterator = rops.keySet().iterator();
        Long ropStart = iterator.next();
        assertThat((prevRop / (60 * 1000)) * (60 * 1000), is(ropStart));
        assertThat(rops.get(ropStart).size(), is(10));

        PrivateMethodCaller parseRops = new PrivateMethodCaller(gpehParsingJob, "parseRops", Map.class);
        Pair<Long, Collection<File>> excludedFiles = (Pair<Long, Collection<File>>) parseRops.call(rops);
        assertThat(excludedFiles.getSecond().size(), is(10));

        collectionJob.cleanUp(rops, excludedFiles);
        assertThat(currentRemoteFiles.size(), is(10));

        inputFiles = listFiles(inputDirPath, true);
        assertThat(inputFiles.size(), is(11));

        hasMore = collectionJob.fetchFiles();

        assertFalse(hasMore);

        currentRemoteFiles = (Set<String>) currentRemoteFilesAccessor.getVal();
        assertThat(currentRemoteFiles.size(), is(10));

        lastFileList = assertLastFile(10);

        for (String file : inputFiles) {
            if (file.indexOf(prevRopStr) > -1) {
                if (!file.matches(DODGY_FILE_REGEX) && !lastFileList.contains(new File(file).getAbsolutePath())) {
                    fail("The file " + file + " was not added to last files list!");
                }
            }
        }

        files = listFiles(outputDirPath, true);
        assertThat(files.size(), is(1));
        assertTrue(new File(files.get(0)).getAbsolutePath().equals(new File(lastFilePath).getAbsolutePath()));

        paths = (String) callGetInputFolderPaths.call();

        rops = collectionJob.getFileNamesByROP(paths);
        assertThat(rops.size(), is(1));
        iterator = rops.keySet().iterator();
        ropStart = iterator.next();
        assertThat((prevRop / (60 * 1000)) * (60 * 1000), is(ropStart));
        assertThat(rops.get(ropStart).size(), is(10));

        excludedFiles = (Pair<Long, Collection<File>>) parseRops.call(rops);
        assertThat(excludedFiles.getSecond().size(), is(10));

        collectionJob.cleanUp(rops, excludedFiles);
        assertThat(currentRemoteFiles.size(), is(10));

        inputFiles = listFiles(inputDirPath, true);
        assertThat(inputFiles.size(), is(11));

        createFiles(prevRop, 10, 15);

        inputFiles = listFiles(inputDirPath, true);
        assertThat(inputFiles.size(), is(16));

        hasMore = collectionJob.fetchFiles();

        assertFalse(hasMore);

        currentRemoteFiles = (Set<String>) currentRemoteFilesAccessor.getVal();
        assertThat(currentRemoteFiles.size(), is(15));

        lastFileList = assertLastFile(15);

        for (String file : inputFiles) {
            if (file.indexOf(prevRopStr) > -1) {
                if (!file.matches(DODGY_FILE_REGEX) && !lastFileList.contains(new File(file).getAbsolutePath())) {
                    fail("The file " + file + " was not added to last files list!");
                }
            }
        }

        files = listFiles(outputDirPath, true);
        assertThat(files.size(), is(1));
        assertTrue(new File(files.get(0)).getAbsolutePath().equals(new File(lastFilePath).getAbsolutePath()));

        paths = (String) callGetInputFolderPaths.call();

        rops = collectionJob.getFileNamesByROP(paths);
        assertThat(rops.size(), is(1));
        iterator = rops.keySet().iterator();
        ropStart = iterator.next();
        assertThat((prevRop / (60 * 1000)) * (60 * 1000), is(ropStart));
        assertThat(rops.get(ropStart).size(), is(15));

        excludedFiles = (Pair<Long, Collection<File>>) parseRops.call(rops);
        assertTrue(excludedFiles == null);

        collectionJob.cleanUp(rops, excludedFiles);
        assertThat(currentRemoteFiles.size(), is(0));

        inputFiles = listFiles(inputDirPath, true);
        assertThat(inputFiles.size(), is(1));
    }

    @Test
    public void shuldNotProcessOldRop() throws IOException, SecurityException, IllegalArgumentException, NoSuchFieldException, IllegalAccessException,
            InvocationTargetException {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        long currTime = cal.getTimeInMillis();

        long prevRop = currTime - 15 * 60 * 1000 - 1;
        String prevRopStr = dateFormatForRopFileNames.format(prevRop);
        createFiles(prevRop, 10);

        List<String> inputFiles = listFiles(inputDirPath, true);
        assertThat(inputFiles.size(), is(11));

        Set<String> lastFileList = assertLastFile(INITIAL_COUNT_IN_LAST_FILE);

        //20121107.1045-1100

        PrivateFieldAccessor lastRopAcc = new PrivateFieldAccessor(collectionJob, "lastRop");
        long lastRop = (Long) lastRopAcc.getVal();
        String lastRopString = dateFormatForRopFileNames.format(new Date(lastRop));
        assertThat(lastRopString, is("20121107.1045"));

        boolean hasMore = collectionJob.fetchFiles();

        assertFalse(hasMore);

        PrivateFieldAccessor currentRemoteFilesAccessor = new PrivateFieldAccessor(collectionJob, "currentRemoteFiles");
        Set<String> currentRemoteFiles = (Set<String>) currentRemoteFilesAccessor.getVal();
        assertThat(currentRemoteFiles.size(), is(10));

        lastFileList = assertLastFile(10);

        for (String file : inputFiles) {
            if (file.indexOf(prevRopStr) > -1) {
                if (!file.matches(DODGY_FILE_REGEX) && !lastFileList.contains(new File(file).getAbsolutePath())) {
                    fail("The file " + file + " was not added to last files list!");
                }
            }
        }

        List<String> files = listFiles(outputDirPath, true);
        assertThat(files.size(), is(1));
        assertTrue(new File(files.get(0)).getAbsolutePath().equals(new File(lastFilePath).getAbsolutePath()));

        PrivateMethodCaller callGetInputFolderPaths = new PrivateMethodCaller(gpehParsingJob, "getInputFolderPaths");
        String paths = (String) callGetInputFolderPaths.call();

        Map<Long, Collection<File>> rops = collectionJob.getFileNamesByROP(paths);
        assertThat(rops.size(), is(1));
        Long ropStart = rops.keySet().iterator().next();
        assertThat((prevRop / (60 * 1000)) * (60 * 1000), is(ropStart));
        assertThat(rops.get(ropStart).size(), is(10));

        collectionJob.cleanUp(rops, null);
        inputFiles = listFiles(inputDirPath, true);
        assertThat(inputFiles.size(), is(1));

        assertThat(currentRemoteFiles.size(), is(0));

        long oldRop = prevRop - 15 * 60 * 1000 - 1;
        createFiles(oldRop, 13);

        inputFiles = listFiles(inputDirPath, true);
        assertThat(inputFiles.size(), is(14));

        assertLastFile(10);

        hasMore = collectionJob.fetchFiles();

        assertFalse(hasMore);

        assertThat(currentRemoteFiles.size(), is(0));

        lastFileList = assertLastFile(10);

        for (String file : inputFiles) {
            if (file.indexOf(prevRopStr) > -1) {
                if (!file.matches(DODGY_FILE_REGEX) && !lastFileList.contains(new File(file).getAbsolutePath())) {
                    fail("The file " + file + " was not added to last files list!");
                }
            }
        }

        files = listFiles(outputDirPath, true);
        assertThat(files.size(), is(1));
        assertTrue(new File(files.get(0)).getAbsolutePath().equals(new File(lastFilePath).getAbsolutePath()));

        paths = (String) callGetInputFolderPaths.call();

        rops = collectionJob.getFileNamesByROP(paths);
        assertThat(rops.size(), is(0));

        collectionJob.cleanUp(rops, null);
        inputFiles = listFiles(inputDirPath, true);
        assertThat(inputFiles.size(), is(14));

        assertThat(currentRemoteFiles.size(), is(0));

    }

    private List<String> createFiles(long timestamp, int cnt) throws IOException {
        return createFiles(timestamp, 0, cnt);
    }

    private List<String> createFiles(long timestamp, int startIdx, int cnt) throws IOException {
        List<String> res = new ArrayList<String>();

        List<String> dummyFileContent = new ArrayList<String>(1);
        dummyFileContent.add("dummy line");

        String date = dateFormatForRopFileNames.format(timestamp);
        for (int i = startIdx; i < cnt; i++) {
            String fileName = String.format(GPEH_FILE_NAME_TEMPLATE, date, i);
            String fullName = inputDirPath + separator + "SubNetwork=RNC09" + separator + "MeContext=RNC09" + separator + fileName;
            FileUtils.writeFile(dummyFileContent, fullName);
            res.add(fullName);
        }

        return res;
    }

    private List<String> listFiles(String path, boolean recursively) {
        List<String> res = new ArrayList<String>();
        File dir = new File(path);
        if (dir.isDirectory()) {
            String[] paths = dir.list();
            for (String p : paths) {
                p = path + separator + p;
                if (!new File(p).isDirectory()) {
                    res.add(p);
                } else if (recursively) {
                    res.addAll(listFiles(p, recursively));
                }
            }
        }

        return res;
    }

    private CollectionJob createGpehCollectionJob() {
        try {
            ServiceConfigBean serviceData = new ServiceConfigBean();
            serviceData.setProcessId(PROCESS_ID);
            serviceData.setServiceId(SERVICE_ID);
            Ne ne = new Ne();
            ne.setDirectory(inputDirPath);
            ne.setLabel("RNC1");
            ConfigData config = ConfigData.create(ne);
            gpehParsingJob = new StubbedParsingJob(JOB_COUNTER, config, serviceData);
            PrivateMethodCaller caller = new PrivateMethodCaller(gpehParsingJob, "createCollectionJob");

            return (CollectionJob) caller.call();
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        fail();

        return null;
    }

    class StubbedParsingJob extends GPEHParsingJob {

        public StubbedParsingJob(final int jobCounter, final ConfigData config, final ServiceConfigBean serviceData) {
            super(jobCounter, config, serviceData);
        }

        @Override
        protected boolean completeROPExists(final Collection<File> filesForROP) {
            return filesForROP.size() == 15;
        }

        @Override
        protected void parseFiles(final Collection<File> fileNames) {
            // do nothing
        }

    }
}
