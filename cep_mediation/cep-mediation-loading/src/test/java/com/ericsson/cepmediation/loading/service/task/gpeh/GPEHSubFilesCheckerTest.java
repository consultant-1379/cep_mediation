/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.service.task.gpeh;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.test.util.GITRoot;

/**
 * @author eemecoy
 *
 */
public class GPEHSubFilesCheckerTest {

    private static final String ROP_FOLDER_WITH_MISSING_FILES = "rop_with_sub_files_missing";

    private static final String ROP_FOLDER_FOR_REAL_FILES = "input_files/smartone_data";

    private GPEHSubFilesChecker gpehSubFilesChecker;

    private String fileSetPath;

    @Before
    public void setup() {

        gpehSubFilesChecker = new StubbedGPEHSubFilesChecker();
        setUpModuleRoot();
    }

    private void setUpModuleRoot() {
        String gitRoot = GITRoot.getGITRootForTestInLoadingModule();
        fileSetPath = gitRoot + "cep-mediation-test/cep-mediation-test-utilities/src/main/resources";
    }

    @Test
    public void testAreAllSubFilesPresentIsFalse() {
        testAreAllSubFilesPresent(fileSetPath + File.separator + ROP_FOLDER_WITH_MISSING_FILES, "A20120516.1645-1700",
                false);
    }

    @Test
    public void testAreAllSubFilesPresentIsTrueIfNumbersMatch() {
        testAreAllSubFilesPresent(fileSetPath + File.separator + ROP_FOLDER_FOR_REAL_FILES, "A20120516.1645-1700", true);
    }

    private void testAreAllSubFilesPresent(String folder, String ropId, boolean expectedResult) {
        Collection<File> filesInROP = getAllFilesForROPInFolder(folder, ropId);
        assertThat(gpehSubFilesChecker.areAllSubFilesPresent(filesInROP), is(expectedResult));
    }

    private Collection<File> getAllFilesForROPInFolder(String folderName, final String ropId) {
        Collection<File> collection = new ArrayList<File>();
        File folder = new File(folderName);
        File[] filesInFolder = folder.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(File folder, String filename) {
                return filename.startsWith(ropId);
            }
        });

        if (filesInFolder == null) {
            throw new RuntimeException("No files found in " + folderName + " starting with " + ropId);
        }
        for (File file : filesInFolder) {
            collection.add(file);
        }
        return collection;

    }

    class StubbedGPEHSubFilesChecker extends GPEHSubFilesChecker {
        @Override
        boolean getPropertyValue(CepMediationProperty propertyName) {
            return true;
        }
    }

}
