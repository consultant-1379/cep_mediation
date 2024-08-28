/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.rpm.checkfileendings;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author EEMECOY
 *
 */
public class FileUtilties {

    public static List<Character> readFileCharByChar(final String fileName) throws IOException {
        final List<Character> characters = new ArrayList<Character>();
        final InputStream inputStream = new FileInputStream(fileName);

        while (inputStream.available() > 0) {
            characters.add((char) inputStream.read());
        }

        return characters;
    }

    public static List<String> getFilesInFolder(final String folderName) {
        final File folder = new File(folderName);
        if (!folder.exists() || !folder.isDirectory()) {
            throw new RuntimeException("Folder doesn't exist or isn't a directory, " + folderName);
        }
        final String[] filesInFolder = folder.list();
        final List<String> result = new ArrayList<String>();
        for (final String fileInFolder : filesInFolder) {
            result.add(folderName + File.separator + fileInFolder);
        }
        return result;
    }

}
