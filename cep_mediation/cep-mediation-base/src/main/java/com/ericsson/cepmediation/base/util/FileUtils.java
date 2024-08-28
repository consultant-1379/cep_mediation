package com.ericsson.cepmediation.base.util;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class provides static utility methods for searching directories and other file operations
 * 
 * @author eeilfn
 */
public abstract class FileUtils {

    private static final Logger logger = LoggerFactory.getLogger(FileUtils.class);

    public static String getFileNameFromCompleteFilePath(String completeFilePath) {
        String[] tokens = completeFilePath.split(File.separator);
        return tokens[tokens.length - 1];
    }

    public static List<String> readFile(final String fileName) throws IOException {
        logger.trace("Reading file " + fileName);
        final FileInputStream inputStream = new FileInputStream(fileName);
        return readFile(inputStream);
    }

    public static void writeFile(List<String> contents, String fileName) throws IOException {
        PrintWriter pw = new PrintWriter(new File(fileName));
        for (String line : contents) {
            pw.println(line);
        }
        pw.close();
    }

    public static List<String> readFile(final InputStream inputStream) throws IOException {
        InputStream dataInputStream = null;
        BufferedReader bufferedReader = null;
        final List<String> lines = new ArrayList<String>();
        try {

            dataInputStream = new DataInputStream(inputStream);
            bufferedReader = new BufferedReader(new InputStreamReader(dataInputStream));
            String strLine;
            //Read File Line By Line
            while ((strLine = bufferedReader.readLine()) != null) {
                final String trimmedLine = strLine.trim();
                if (trimmedLine.length() > 0) {
                    lines.add(strLine);
                }
            }
        } finally {
            close(bufferedReader);
            close(dataInputStream);
            close(inputStream);
        }

        return lines;
    }

    public static void close(final Closeable closeable) throws IOException {
        if (closeable != null) {
            closeable.close();
        }

    }

    /**
     * Check file exists and instantiate FileInputStream for file
     * 
     * @param filePath          full path and file name
     * @return                  input stream for file - null if file cannot be found
     */
    public static InputStream readInputStreamForFile(final String filePath) {
        final File file = new File(filePath);
        if (file.exists()) {
            try {
                return new FileInputStream(file);
            } catch (final FileNotFoundException e) {
                logger.error("Exception shouldn't matter, we've already checked that the file exists", e);
            }
        }
        return null;
    }

    /**This method restores the serialised object from the file specified.
     * @param filename, An absolute path of the serialised object file
     * @return an instance of the java.lang.Object
     */
    public static Object restoreObject(final String filename) {
        final Object readObject;
        try {
            final ObjectInputStream obj = new ObjectInputStream(new FileInputStream(filename));
            readObject = obj.readObject();

        } catch (final Exception e) {
            throw new RuntimeException("Failed to restore the process configuration data, Reason:\n" + e.getMessage());
        }
        return readObject;
    }

    public static void closeWithoutException(Closeable closeable) {
        try {
            close(closeable);
        } catch (IOException e) {
            logger.error("Could not close file", e);
        }
    }
}