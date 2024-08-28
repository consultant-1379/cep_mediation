/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.service.task.gpeh;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.loading.filerecords.RecordDescriptor;
import com.ericsson.cepmediation.loading.gpeh.GPEHFooterRecordHandler;
import com.ericsson.cepmediation.loading.gpeh.GPEHLinkRecordHandler;

/**
 * @author eemecoy
 *
 */
public class GPEHSubFilesChecker {

    private static final Logger logger = LoggerFactory.getLogger(GPEHSubFilesChecker.class);

    /**
     * Check if all expected sub MpX files are present
     * Method reads the Mp0 file name specified in linkFileName, this contains a list of all MpX files
     * produced for this ROP and this network element.
     * Method then proceeds to read all MpX sub files for this linkFileName currently present in the folder
     * Returns false if the expected number of sub files isn't present, true otherwise
     * 
     * @param filesForROP                        collection of files in ROP, each entry is complete path to file
     * @return  see above 
     */
    public boolean areAllSubFilesPresent(final Collection<File> filesForROP) {
        if (subFileCheckConfigured()) {
            return checkAllSubFilesPresent(filesForROP);
        }
        return true;
    }

    private boolean checkAllSubFilesPresent(final Collection<File> filesForROP) {
        final String linkFileName = getLinkFile(filesForROP);
        if (linkFileName == null) {
            return false;
        }
        int numberOfSubFilesExpected;
        try {
            numberOfSubFilesExpected = getNumberOfSubFilesExpected(linkFileName);
            final int totalNumberOfFilesExpectedForTheCurrentRop = numberOfSubFilesExpected + 1;
            final int numberOfFilesCurrentlyPresent = filesForROP.size();
            // number of sub files (excluding mp0) should always equal to the total number of files minutes 1
            final boolean areAllSubFilesPresent = (totalNumberOfFilesExpectedForTheCurrentRop == numberOfFilesCurrentlyPresent);
            logger.info("number of files expected: " + (numberOfSubFilesExpected + 1) + ", number of files present: "
                    + numberOfFilesCurrentlyPresent);
            trace(linkFileName, totalNumberOfFilesExpectedForTheCurrentRop, numberOfFilesCurrentlyPresent);
            return areAllSubFilesPresent;
        } catch (final IOException e) {
            logger.error("Could not read link file  " + linkFileName, e);
            return false;
        }
    }

    private boolean subFileCheckConfigured() {
        return getPropertyValue(CepMediationProperty.GPEH_SUBFILE_CHECK);
    }

    boolean getPropertyValue(final CepMediationProperty propertyName) {
        return CepMediationProperties.getBooleanProperty(propertyName);
    }

    private String getLinkFile(final Collection<File> filesForROP) {
        for (final File file : filesForROP) {
            if (file.getName().contains("Mp0")) {
                return file.getAbsolutePath();
            }
        }
        logger.debug("No Mp0 file present in " + filesForROP);
        return null;
    }

    private int getNumberOfSubFilesExpected(final String linkFileName) throws IOException, FileNotFoundException {
        final RecordDescriptor recordDescriptor = new RecordDescriptor(true);
        recordDescriptor.addRecordHandler(new GPEHLinkRecordHandler());
        // need to add footer record handler here, otherwise, the program cannot correctly determine the 
        // end of the mp0 file
        recordDescriptor.addRecordHandler(new GPEHFooterRecordHandler());
        final File linkFile = new File(linkFileName);
        final GPEHLnkFileCounter gpehLnkFileCounter = new GPEHLnkFileCounter(linkFile, recordDescriptor);
        // link files does not contain mp0, so the number of link files will also
        // be the number of total files in a rop - 1
        return gpehLnkFileCounter.countLnkFiles();
    }

    private void trace(final String linkFileName, final int numberOfFilesExpected,
            final int numberOfFilesCurrentlyPresent) {
        if (logger.isDebugEnabled()) {
            final StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("For linkFile ");
            stringBuilder.append(linkFileName);
            stringBuilder.append(", expected ");
            stringBuilder.append(numberOfFilesExpected);
            stringBuilder.append(", ");
            stringBuilder.append(numberOfFilesCurrentlyPresent);
            stringBuilder.append(" files currently present");
            logger.debug(stringBuilder.toString());
        }
    }

}
