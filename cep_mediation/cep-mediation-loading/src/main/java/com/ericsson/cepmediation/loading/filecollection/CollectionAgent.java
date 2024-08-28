package com.ericsson.cepmediation.loading.filecollection;

import java.io.File;
import java.util.Collection;
import java.util.Set;

public interface CollectionAgent {

    /**
     * Get a list of directories in a directory from a host
     * Some implementations will list just the lowest level folders (ie only folders containing actual files), 
     *others will only list the top level directories
     * 
     * @param path The directory to list
     * @return The list of directories in the directory (each element must be a full path to the subdirectory)
     * @throws CollectionException
     */
    String[] listDirectories(String path) throws CollectionException;

    /**
     * Get a list of files in a set of directories
     *  
     * @param paths The directories to get the file lists for
     * @param regexPattern the file pattern to search for in the directory, if null, all files are returned
     * @return a list of files for the directories in question
     * @throws CollectionException
     */
    Set<String> listFiles(String[] paths, String regexPattern) throws CollectionException;

    /**
     * Get a list of files in a directory
     *  
     * @param path The directory to get the file lists for
     * @param regexPattern the file pattern to search for in the directory.  If null, all files are returned
     * @return a list of files for the directory in question
     * @throws CollectionException
     */
    Set<String> listFiles(String path, String regexPattern) throws CollectionException;

    /**
     * Copy a list of files in a set of directories 
     * 
     * @param files The files to copy across
     * @param localDirectory the directory to copy files to   
     * @return a list of files for the directories in question
     * @throws CollectionException
     */
    void getFiles(Set<String> files, String localDirectory) throws CollectionException;

    /**
     * Deletes the list of given files 
     * @param The files to delete
     * @throws CollectionException
     */
    void deleteFiles(Collection<String> files) throws CollectionException;

    /**
     * Recursively list all files in directory (will only list files, will not include folders in final result)
     * 
     */
    Collection<File> recursivelyListFilesOnly(String directory) throws CollectionException;

}