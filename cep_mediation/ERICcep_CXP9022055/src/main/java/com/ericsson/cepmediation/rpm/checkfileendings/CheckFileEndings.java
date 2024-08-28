/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.rpm.checkfileendings;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author EEMECOY
 *
 */
public class CheckFileEndings {

    private static final char CARRIAGE_RETURN = '\r';

    public void checkFileEndings(final String folder) throws IOException, CarriageReturnFoundInLinuxFileException {
        final List<String> files = FileUtilties.getFilesInFolder(folder);
        for (final String file : files) {
            checkCharactersInFile(file);
        }
        System.out.println("No carriage returns found in any files in folder " + folder);

    }

    private void checkCharactersInFile(final String file) throws IOException, CarriageReturnFoundInLinuxFileException {
        final List<Character> charactersInFile = FileUtilties.readFileCharByChar(file);
        for (final Character character : charactersInFile) {
            if (character == CARRIAGE_RETURN) {
                throw new CarriageReturnFoundInLinuxFileException(CARRIAGE_RETURN + " found in file " + file);
            }
        }
    }

    public static void main(final String[] args) throws IOException, CarriageReturnFoundInLinuxFileException {
        final String rootPath = System.getProperty("root.path");
        final String folder = rootPath + File.separator + "cep_mediation" + File.separator + "bin" + File.separator;
        new CheckFileEndings().checkFileEndings(folder);
    }

}
