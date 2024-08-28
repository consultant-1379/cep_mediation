/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.util;

import static com.ericsson.cepmediation.base.util.text.StringConstants.*;
import static com.ericsson.cepmediation.test.common.StringConstantsForTest.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;

import com.ericsson.cepmediation.base.util.FileUtils;
import com.ericsson.cepmediation.base.util.ResourceLoadingUtilities;
import com.ericsson.cepmediation.base.util.SystemCommand;

/**
 * @author eemecoy
 *
 */
public class FileUtilsForTest {

    public static List<List<String>> readCSVFileFromClasspath(String fileName) throws IOException {
        List<String> fileContents = readFileFromClasspathAsListOfStrings(fileName);
        List<List<String>> linesInCSVFile = new ArrayList<List<String>>();
        for (String lineInFile : fileContents) {
            if (isNotAComment(lineInFile)) {
                String[] tokens = lineInFile.split(COMMA);
                List<String> values = new ArrayList<String>();
                for (String token : tokens) {
                    values.add(token);
                }
                linesInCSVFile.add(values);
            }
        }
        return linesInCSVFile;
    }

    private static boolean isNotAComment(String line) {
        return !line.startsWith(HASH);
    }

    public static void writeToFile(final String fileContents, final String fileName) throws IOException {
        System.out.println("Writing to " + fileName);

        DataOutputStream dataOutputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(fileName);
            dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.write(fileContents.getBytes());
        } finally {
            close(fileOutputStream);
            close(dataOutputStream);
        }

    }

    public static Properties readPropertiesFromFile(String fileName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        return readPropertiesFromInputStream(fileInputStream);
    }

    public static Properties readPropertiesFromFileOnClasspath(final String propertiesFileName) throws IOException {
        final InputStream inputStream = ClasspathHelper.getInputStreamForResourceOnClassPath(propertiesFileName);
        return readPropertiesFromInputStream(inputStream);

    }

    private static Properties readPropertiesFromInputStream(final InputStream inputStream) throws IOException {
        final Properties properties = new Properties();
        try {
            properties.load(inputStream);
        } finally {
            inputStream.close();
        }
        return properties;
    }

    public static String readFile(String fileName) throws IOException {
        List<String> linesInFile = FileUtils.readFile(fileName);
        return putBackListOfStringsAsOneString(linesInFile);
    }

    public static Collection<String> listFiles(String folderName, final String filePrefix) {
        Collection<String> list = new ArrayList<String>();
        File folder = new File(folderName);
        checkFolderExists(folderName, folder);
        File[] files = listFiles(filePrefix, folder);

        if (files == null) {
            throw new RuntimeException("No files found in folder " + folderName + " starting with " + filePrefix);
        }
        for (File file : files) {
            list.add(file.getAbsolutePath());
        }
        return list;
    }

    private static File[] listFiles(final String filePrefix, File folder) {
        File[] files = folder.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                return matchesFilter(filePrefix, name);
            }
        });
        return files;
    }

    private static void checkFolderExists(String folderName, File folder) {
        if (!folder.exists()) {
            throw new RuntimeException("Folder " + folderName + " does not exist");
        }
    }

    public static String goUpOneDirectory(String filePath) {
        int endIndex = filePath.lastIndexOf(File.separator);
        return filePath.substring(0, endIndex);
    }

    public static void copyFile(String sourceFileName, String destinationFileName) throws IOException {
        System.out.println("Copying file " + sourceFileName + " to " + destinationFileName);
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            File sourceFile = new File(sourceFileName);
            File destinationFile = new File(destinationFileName);
            inputStream = new FileInputStream(sourceFile);
            outputStream = new FileOutputStream(destinationFile);

            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        } finally {
            FileUtils.close(inputStream);
            FileUtils.close(outputStream);
        }
    }

    public static String readFileFromClasspath(final String fileName) throws IOException {
        List<String> linesInFile = readFileFromClasspathAsListOfStrings(fileName);
        return putBackListOfStringsAsOneString(linesInFile);
    }

    private static String putBackListOfStringsAsOneString(List<String> linesInFile) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String line : linesInFile) {
            stringBuilder.append(line);
            stringBuilder.append(NEW_LINE);

        }
        return stringBuilder.toString();
    }

    private static void close(final Closeable closeable) throws IOException {
        if (closeable != null) {
            closeable.close();
        }

    }

    public static void writeToFile(final Collection<String> lines, final String fileName) throws IOException {
        writeToFile(lines, fileName, false);
    }

    private static void writeToFile(final Collection<String> lines, final String fileName, boolean append)
            throws IOException {
        System.out.println("Writing list of length " + lines.size() + " to " + fileName);
        BufferedWriter bufferedWriter = null;
        try {

            final FileWriter fileWriter = new FileWriter(fileName, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (final String line : lines) {
                bufferedWriter.write(line);
                bufferedWriter.write("\n");
            }
        } finally {
            close(bufferedWriter);
        }
    }

    public static List<String> readFileFromClasspathAsListOfStrings(String fileName) throws IOException {
        List<String> linesInFile = new ArrayList<String>();
        final InputStream inputStream = ResourceLoadingUtilities.getInputStreamForResourceOnClassPath(fileName);
        if (inputStream == null) {
            throw new FileNotFoundException("Could not find file " + fileName + " on classpath");
        }
        DataInputStream dataInputStream = null;
        BufferedReader bufferedReader = null;
        try {

            // Get the object of DataInputStream
            dataInputStream = new DataInputStream(inputStream);
            bufferedReader = new BufferedReader(new InputStreamReader(dataInputStream));
            String strLine;
            //Read File Line By Line
            while ((strLine = bufferedReader.readLine()) != null) {
                final String trimmedLine = strLine.trim();
                if (trimmedLine.length() > 0) {
                    linesInFile.add(trimmedLine);
                }
            }
        } finally {
            close(bufferedReader);
            close(dataInputStream);
            close(inputStream);
        }

        return linesInFile;

    }

    public static Collection<String> listFiles(String folder) {
        return listFiles(folder, "");
    }

    /**
     * List all plain files (ie not folders) in a directory, looping 
     * recursively over the folders subfolders
     * @return 
     * 
     */
    public static List<String> listFilesRecursively(String folder) {
        List<String> fileList = new ArrayList<String>();
        listFilesRecursively(folder, fileList, "");
        return fileList;

    }

    private static void listFilesRecursively(String folder, List<String> fileList, String filter) {
        Collection<String> elementsInFolder = listFiles(folder);
        for (String element : elementsInFolder) {
            File fileObject = new File(element);
            if (fileObject.isDirectory()) {
                listFilesRecursively(element, fileList, filter);
            } else {
                if (matchesFilter(filter, fileObject.getName())) {
                    fileList.add(element);
                }
            }
        }
    }

    private static boolean matchesFilter(String filter, String shortName) {
        return shortName.startsWith(filter);
    }

    public static Collection<File> listFileObjects(String folderName) {
        Collection<File> fileObjects = new ArrayList<File>();
        File folder = new File(folderName);
        checkFolderExists(folderName, folder);
        File[] files = listFiles("", folder);
        for (File file : files) {
            fileObjects.add(file);
        }

        return fileObjects;
    }

    public static void renameFile(String originalFileName, String newFileName) {
        SystemCommand systemCommand = new SystemCommand();
        try {
            String command = "mv " + originalFileName + " " + newFileName;
            System.out.println("Running system command: " + command);
            systemCommand.runSystemCommand(command);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void appendToFile(Collection<String> lines, String outputFile) throws IOException {
        writeToFile(lines, outputFile, true);

    }

    public static Collection<String> listFilesRecursively(String folder, String filter) {
        List<String> fileList = new ArrayList<String>();
        listFilesRecursively(folder, fileList, filter);
        return fileList;
    }
}
