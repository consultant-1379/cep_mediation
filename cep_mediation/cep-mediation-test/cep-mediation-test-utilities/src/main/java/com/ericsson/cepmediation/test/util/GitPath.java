/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.util;

import java.io.File;

/**
 * @author eemecoy
 *
 */
public class GitPath {
    public static String REAL_FILES_DIR = "input_files/";

    private static final String PARTIAL_FOLDER_WITH_REAL_FILES = REAL_FILES_DIR + "smartone_data/";

    public static final String FOLDER_WITH_CAPTOOL_REAL_FILES = "captool/3G/454_06_1001/";

    public static final String FOLDER_WITH_STAPLE_REAL_FILES = "staple/3G/tcpta_partial/454_06_1001";

    private final static String PATH_TO_ONE_REAL_FILE_IN_TEST_UTILITIES_MODULE = PARTIAL_FOLDER_WITH_REAL_FILES
            + "A20120517.0415-0430_SubNetwork=RNC09,MeContext=RNC09_rnc_gpehfile_Mp0.bin.gz";

    public static String getDirectoryPathForRealFilesInGIT() {
        return getDirectoryPathForFilesInGIT(PARTIAL_FOLDER_WITH_REAL_FILES);
    }

    public static String getDirectoryPathForRealCaptoolFilesInGIT() {
        return getDirectoryPathForFilesInGIT(REAL_FILES_DIR + FOLDER_WITH_CAPTOOL_REAL_FILES);
    }

    public static String getDirectoryPathForRealStapleFilesInGIT() {
        return getDirectoryPathForFilesInGIT(REAL_FILES_DIR + FOLDER_WITH_STAPLE_REAL_FILES);
    }

    public static String getDirectoryPathForFilesInGIT(String subFolder) {
        return getGITRoot() + subFolder + File.separator;
    }

    private static String getGITRoot() {
        final String filePath = ResourceLoadingUtilitiesForTest.getFullPathForFileOnClasspath(PATH_TO_ONE_REAL_FILE_IN_TEST_UTILITIES_MODULE);
        final int index = filePath.lastIndexOf("/") + 1;
        final String folderForInvidualFile = filePath.substring(0, index);
        return getPathToAllResourcesInModule(folderForInvidualFile);
    }

    private static String getPathToAllResourcesInModule(String folderForInvidualFile) {
        int endIndex = folderForInvidualFile.length() - PARTIAL_FOLDER_WITH_REAL_FILES.length();
        String substring = folderForInvidualFile.substring(0, endIndex);
        System.out.println(substring);
        return substring;
    }

}
