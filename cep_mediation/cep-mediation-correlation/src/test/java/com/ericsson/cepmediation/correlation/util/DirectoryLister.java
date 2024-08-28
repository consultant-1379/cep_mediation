/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.util;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author EEMECOY
 *
 */
public class DirectoryLister {

    public static List<File> getFiles(final String directoryPath, final FileFilter fileFilter) {
        final File directory = new File(directoryPath);
        final File[] files = directory.listFiles(fileFilter);
        if (files == null || files.length == 0) {
            final StringBuilder errorMessage = new StringBuilder("No files found in " + directoryPath);
            if (fileFilter != null) {
                errorMessage.append(" with a file filter ");
            }
            throw new RuntimeException(errorMessage.toString());
        }
        Arrays.sort(files);
        return Arrays.asList(files);
    }

    public static Collection<File> getFiles(final String directoryPath) {
        return getFiles(directoryPath, null);
    }

}
