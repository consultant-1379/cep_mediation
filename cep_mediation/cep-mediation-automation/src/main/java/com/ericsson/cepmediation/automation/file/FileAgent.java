/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.automation.file;

import java.util.List;

/**
 * @author eemecoy
 *
 */
public interface FileAgent {

    void renameFile(String fileName, String rename);

    /**
     * List elements in path
     * 
     * @return  each member of the array is an absolute file path
     */
    String[] listFiles(String path);

    void deleteAllFilesInFolder(String path);

    List<String> readFile(String fileName);

    void writeFile(String fileName, List<String> contents) throws Exception;
    
    boolean doesFileExist(String file);

    void createFolder(String folderName);

}
