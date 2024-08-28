/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.asn1;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.ericsson.cepmediation.base.util.ResourceLoadingUtilities;

/**
 * @author eemecoy
 *
 */
public class Asn1RealFiles {

    private static final String PER_FILE_EXTENSION = ".per";

    private static final String ASN_SAMPLE_DATA = "asn-sample-data";

    public List<byte[]> getSampleAsnData() throws Exception {
        final List<byte[]> result = new ArrayList<byte[]>();
        final List<String> asnSampleDataFiles = getASNSampleDataFiles();
        for (final String file : asnSampleDataFiles) {
            System.out.println("Reading file " + file);
            final InputStream inputStream = getInputStream(file);
            result.add(readFile(inputStream));
        }
        return result;
    }

    private InputStream getInputStream(final String file) throws FileNotFoundException {
        final InputStream inputStream = ResourceLoadingUtilities.getInputStreamForResourceOnClassPath(file);
        if (inputStream == null) {
            throw new FileNotFoundException(file);
        }
        return inputStream;
    }

    private List<String> getASNSampleDataFiles() {
        final int startingIndex = 41511;
        final int endIndex = 41524;
        final List<String> files = new ArrayList<String>();
        for (int i = startingIndex; i <= endIndex; i++) {
            files.add(ASN_SAMPLE_DATA + File.separator + i + PER_FILE_EXTENSION);
        }
        return files;
    }

    private byte[] readFile(final InputStream inputStream) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            int bite = -1;
            while ((bite = inputStream.read()) != -1) {
                byteArrayOutputStream.write(bite);
            }
            return byteArrayOutputStream.toByteArray();
        } finally {
            close(byteArrayOutputStream);
            close(inputStream);
        }
    }

    private void close(final Closeable closeable) throws IOException {
        if (closeable != null) {
            closeable.close();
        }

    }

    public byte[] getAsnDataFromFile(final String fileName) throws Exception {
        final InputStream inputStream = getInputStream(ASN_SAMPLE_DATA + File.separator + fileName + PER_FILE_EXTENSION);
        return readFile(inputStream);
    }

}
