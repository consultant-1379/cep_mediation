/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.input;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import com.ericsson.cepmediation.test.util.FileUtilsForTest;

/**
 * @author eemecoy
 *
 */
public class RopInputterLocal {

    //private static final int ONE_MINUTE = 60 * 1000;

    //private static final long FIFTEEN_MINUTES = 15 * ONE_MINUTE;

    public static void main(String[] args) throws Exception {
        long copyInterval = 1;
        String parentInputDirectory = "/home/eemecoy/decoded_rop_files/A20120516/";
        String destinationFolderForRNC01 = "/home/eemecoy/streamed_files/SubNetwork=RNC01/MeContext=RNC01/";
        //String destinationFolderForRNC02 = "/home/eemecoy/streamed_files/SubNetwork=RNC02/MeContext=RNC02/";
        String[] destinationFolders = new String[] { destinationFolderForRNC01 };
        Collection<String> inputSubFolders = new ArrayList<String>();
        inputSubFolders.add("1600-1615/raw_files");
        inputSubFolders.add("1615-1630/raw_files");
        new RopInputterLocal().copyRopInputFilesEveryFifteenMinutes(copyInterval, parentInputDirectory,
                inputSubFolders, destinationFolders);
    }

    public void copyRopInputFilesEveryFifteenMinutes(long copyInterval, String inputParentFolder,
            Collection<String> inputSubFolders, String... destinationFolders) throws Exception {
        for (String inputSubFolder : inputSubFolders) {
            copyROPAndSleep(copyInterval, inputParentFolder + inputSubFolder, destinationFolders);
        }
    }

    private void copyROPAndSleep(long copyInterval, String inputFolder, String... destinationFolders)
            throws IOException, InterruptedException {
        for (String destinationFolder : destinationFolders) {
            System.out.println("Copying files at " + new Date() + " to " + destinationFolder);
            copyFiles(inputFolder, destinationFolder);
        }
        Thread.sleep(copyInterval);
    }

    private void copyFiles(String inputFolder, String destinationFolder) throws IOException {
        Collection<String> ropFiles = FileUtilsForTest.listFiles(inputFolder);
        for (String ropFile : ropFiles) {
            String sourceFileName = ropFile;
            String fileName = getFileNameFromFullPath(ropFile);
            String destinationFileName = destinationFolder + fileName;
            FileUtilsForTest.copyFile(sourceFileName, destinationFileName);
        }
    }

    private String getFileNameFromFullPath(String ropFile) {
        int beginIndex = ropFile.lastIndexOf("/");
        return ropFile.substring(beginIndex, ropFile.length());
    }

}
