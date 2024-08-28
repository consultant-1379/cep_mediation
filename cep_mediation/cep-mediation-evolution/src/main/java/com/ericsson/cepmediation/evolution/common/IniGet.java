package com.ericsson.cepmediation.evolution.common;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IniGet {

    private static final Logger logger = LoggerFactory.getLogger(IniGet.class);

    private static final int LINE_SEPARATOR_LENGTH = System.getProperty("line.separator").length();

    private static IniGet instance;

    private IniGet() {

    }

    public static IniGet getInstance() {

        if (instance == null) {

            instance = new IniGet();
        }

        return instance;
    }

    /**
     * Read and return contents of specified ini file 
     * 
     * @return Contents as a map of maps. First level map stores blocks. Second level map stores individual config settings within each block
     * @throws IOException Errors reading ini files.
     */
    public Map<String, Map<String, String>> readIniFile(final File iniFile) throws IOException {

        final RandomAccessFile raf = new RandomAccessFile(iniFile, "r");

        try {
            String line;
            final Map<String, Map<String, String>> iniContents = new HashMap<String, Map<String, String>>();

            // Step through file looking for next block of ini file - a block starts with an identifier
            // within square brackets e.g. [DWH_DBSPACES_MAIN]. Get contents of the block and store as
            // name-value pairs where name is the block identifier and the "value" is another map holding 
            // the config settings defined within the block

            while ((line = raf.readLine()) != null) {
                final String blockName = line.trim();

                if (blockName.length() == 0 || blockName.startsWith(";")) {
                    continue;
                }

                if (blockName.matches("\\[.*\\]")) {
                    final String name = blockName.substring(1, blockName.length() - 1);
                    final Map<String, String> block = getIniBlock(raf);
                    if (block != null && block.size() > 0) {
                        iniContents.put(name, block);
                    }
                } else {
                    System.out.println("?? '" + blockName + "'");
                }
            }

            return iniContents;
        } finally {
            try {
                raf.close();
            } catch (Throwable t) {/*-*/
            }
        }

    }

    /**
     * Reads the config settings for the next block of an ini file. 
     * 
     * @return A name-value map of the config settings within the block
     * @throws IOException Errors reading ini files.
     */
    private Map<String, String> getIniBlock(final RandomAccessFile raf) throws IOException {

        String line;
        final Map<String, String> block = new LinkedHashMap<String, String>();

        // step through each line of file to end-of-file or start of next block (whichever comes first)
        // for each line, split contents into name-value pairs and add to block map

        while ((line = raf.readLine()) != null) {
            final String trimmedLine = line.trim();

            if (trimmedLine.length() == 0 || trimmedLine.startsWith(";")) {
                continue;
            }

            if (trimmedLine.startsWith("[")) { // check the trimmed line (line read might have spaces at start...)
                // We're at the next block so step back a line and stop parsing this block
                raf.seek(raf.getFilePointer() - (line.length() + LINE_SEPARATOR_LENGTH)); // new line character
                break;
            }

            final String[] nvpair = trimmedLine.split("=");

            if (nvpair.length == 1) {
                block.put(nvpair[0], null);
            } else {
                block.put(nvpair[0], nvpair[1]);
            }
        }

        return block;

    }


}
