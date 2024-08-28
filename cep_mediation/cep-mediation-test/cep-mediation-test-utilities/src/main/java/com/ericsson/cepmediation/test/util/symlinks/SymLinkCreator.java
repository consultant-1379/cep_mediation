/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.util.symlinks;

import java.io.File;
import java.util.Collection;

import com.ericsson.cepmediation.base.util.SystemCommand;
import com.ericsson.cepmediation.test.util.FileUtilsForTest;

/**
 * @author eemecoy
 *
 */
public class SymLinkCreator {

    private String mountPoint = "/eniq/data/etldata_/00/event_e_lte_suc/eemecoy/";

    private void createAllSymLinks() throws Exception {
        createSymbolicLinksForGPEHFiles();
        createSymbolicLinksForMMEFiles();
    }

    private void createSymbolicLinksForMMEFiles() throws Exception {
        String source = "/home/eemecoy/data/SGSN";
        String destination = mountPoint + File.separator + "sgeh_cep" + File.separator + "MeContext=SGSN1";
        createSymLinks("", source, destination);

    }

    public void createSymbolicLinksForGPEHFiles() throws Exception {
        String gpehFolder = "GPEHEvents_CEP";
        String destination = mountPoint + File.separator + gpehFolder + File.separator + "SubNetwork=RNC01"
                + File.separator + "MeContext=RNC01";
        // String source = PathsToRealFilesStoredInGIT.getDirectoryPathForRealFilesInGIT();

        String source = "/eniq/home/dcuser/eemecoy/GPEH_files/SubNetwork=RNC01/MeContext=RNC01/";
        createSymLinks("A20120516.1645-1700", source, destination);
    }

    private void createSymLinks(String ropId, String source, String destination) throws Exception {
        makeSureDestinationExists(destination);
        Collection<String> files = getFilesForROP(ropId, source);
        for (String file : files) {
            createSymbolicLink(file, destination);
        }
    }

    private void makeSureDestinationExists(String destination) {
        File folder = new File(destination);
        if (!folder.exists()) {
            boolean mkdirs = folder.mkdirs();
            if (!mkdirs) {
                throw new RuntimeException("Could not create " + destination);
            }
        }
    }

    private Collection<String> getFilesForROP(final String ropId, String source) {
        return FileUtilsForTest.listFiles(source, ropId);
    }

    private void createSymbolicLink(String sourceFile, String destination) throws Exception {
        String command = "ln -s " + sourceFile + " --target-directory=" + destination;
        System.out.println("Running command " + command);
        new SystemCommand().runSystemCommand(command);

    }

    public static void main(String[] args) throws Exception {
        new SymLinkCreator().createAllSymLinks();
    }

}
