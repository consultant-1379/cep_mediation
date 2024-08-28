/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.filerecords;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/**
 * @author eemecoy
 *
 */
public class NEFileReader {

    public InputStream getInputStreamForNeFile(final File neFile) throws IOException, FileNotFoundException {
        // Declare an input stream for the file
        InputStream neFileInputStream = null;

        // Check if the file is compressed
        if (neFile.getName().endsWith(".gz")) {
            // The file is a compressed file, open and read it
            neFileInputStream = new GZIPInputStream(new FileInputStream(neFile));
        } else {
            // The file is not compressed, open and read it
            neFileInputStream = new FileInputStream(neFile);
        }
        return neFileInputStream;
    }

}
