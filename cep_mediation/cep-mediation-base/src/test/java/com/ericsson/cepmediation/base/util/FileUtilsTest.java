/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.util;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

/**
 * @author eemecoy
 *
 */
public class FileUtilsTest {

    @Test
    public void testGetFileNameFromCompleteFilePath() {
        String fileName = "A20120516.1645-1700_SubNetwork=RNC09,MeContext=RNC09_rnc_gpehfile_Mp0.bin.gz";
        String result = FileUtils.getFileNameFromCompleteFilePath(File.separator + "home" + File.separator
                + "input_files" + File.separator + fileName);
        assertThat(result, is(fileName));
    }

}
