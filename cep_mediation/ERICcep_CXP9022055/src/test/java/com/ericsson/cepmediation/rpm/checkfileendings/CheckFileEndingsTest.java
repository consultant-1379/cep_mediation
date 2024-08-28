/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.rpm.checkfileendings;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

/**
 * @author EEMECOY
 *
 */
public class CheckFileEndingsTest {

    private CheckFileEndings checkFileEndings;

    private String basePathForTestFiles;

    @Before
    public void setup() {
        checkFileEndings = new CheckFileEndings();
        final String rootPath = System.getProperty("root.path");
        basePathForTestFiles = rootPath + File.separator + "cep_mediation" + File.separator + "ERICcep_CXP9022055"
                + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator;

    }

    @Test(expected = CarriageReturnFoundInLinuxFileException.class)
    public void testCheckFileEndingsThrowsExceptionIfItFindsCarriageReturns() throws Exception {
        final String folderToCheck = basePathForTestFiles + "files_with_window_file_endings" + File.separator;
        checkFileEndings.checkFileEndings(folderToCheck);
    }

    @Test
    public void testCheckFileEndingsForCorrectFile() throws Exception {
        final String folderToCheck = basePathForTestFiles + "files_without_window_file_endings" + File.separator;
        checkFileEndings.checkFileEndings(folderToCheck);
    }

}
