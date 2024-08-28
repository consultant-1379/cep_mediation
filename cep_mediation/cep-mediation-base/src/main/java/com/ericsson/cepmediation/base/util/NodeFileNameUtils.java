/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.util;

import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;
import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;

/**
 * This class provides static utility methods for getting information from file names
 * 
 * @author eemecoy
 *
 */
public class NodeFileNameUtils {

    private static final Logger logger = LoggerFactory.getLogger(NodeFileNameUtils.class);
    
    private static final String OSS_ALIAS_PREFIX = CepMediationProperties.getProperty(CepMediationProperty.GENERAL_OSS_SERVER_ALIAS_PREFIX);
    
    // The underscore position on file names with short dates without time zones
    private static final int SHORT_DATE_UNDERSCORE_POS = 19;

    // Set the string lengths for long and short file date formats
    private static final int LONG_DATE_LENGTH = 18; // YYYYMMDD.HHMM+HHMM

    private static final int SHORT_DATE_LENGTH = 13; // YYYYMMDD.HHMM

    // Constant for unknown NE names
    private static final String UNKNOWN_NE_NAME = "unknown";
    
    /**
     * Method to get the NE name from a path string
     * 
     * @param pathString
     *            The string to search for a NE name
     * @return The NE name
     */
    public static String pathToNEName(final File pathFile) {
        // Get the file path as a string
        final String pathString = pathFile.getAbsolutePath();

        // Find the index of ManagedElement in the string
        int startIndex = pathString.indexOf("ManagedElement=");

        if (startIndex == -1) {
            // ManagedElement not found - try to find MeContext in the path
            startIndex = pathString.indexOf("MeContext=");
            if (startIndex == -1) {
                return UNKNOWN_NE_NAME;
            }
            // Add the length of MeContext= to the start index
            startIndex += "MeContext=".length();

        }
        // Add the length of ManagedElement= to the start index
        else {
            startIndex += "ManagedElement=".length();
        }

        // Find the location of the next forward slash after MeContext
        int endIndex = pathString.indexOf('/', startIndex);

        // Find if a forward slash was found
        if (endIndex == -1) {
            // Check if there is a %~% string in the string
            endIndex = pathString.indexOf("%~%", startIndex);
            if (endIndex == -1) {
                return UNKNOWN_NE_NAME;
            }
        }

        // Now, we have or NE name
        return pathString.substring(startIndex, endIndex);
    }

    /**
     * Method to get the SubNetwork name from a path string
     * 
     * @param pathString
     *            The string to search for a NE name
     * @return The NE name
     */
    public static String pathToSubNetName(final File pathFile) {
        // Get the file path as a string
        final String pathString = pathFile.getAbsolutePath();

        // Find the index of SubNetwork in the string
        int startIndex = pathString.lastIndexOf("SubNetwork=");

        // Find if MeContext is specified in the path
        if (startIndex == -1) {
            return UNKNOWN_NE_NAME;
        }
        // Add the length of SubNetwork= to the start index

        startIndex += "SubNetwork=".length();

        // Find the location of the MeContext part of the FDN
        int endIndex = pathString.indexOf(",MeContext=", startIndex);

        // Find if a forward slash was found
        if (endIndex == -1) {
            // Check if there is a %~% string in the string
            endIndex = pathString.indexOf("%~%", startIndex);
            if (endIndex == -1) {
                return UNKNOWN_NE_NAME;
            }
        }
        // Now, we have or NE name
        return pathString.substring(startIndex, endIndex);
    }

    /**
     * Method to get a calendar time from a file name
     * 
     * @param The file name (short file name, not complete file path)
     * @throws ParseException 
     * @throws Exception 
     */
    public static Calendar nameToCalendar(final String fileNameToParse) throws ParseException {
        // Get a UTC calendar
        final Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));

        // Define the format of dates on input files
        final DateFormat longDateFormat = new SimpleDateFormat("yyyyMMdd.HHmmZ"); // SGEH style: A20111003.1900+0800-20111003.1915+0800_1_ebs.169.gz
        longDateFormat.setTimeZone(TimeZone.getTimeZone("UTC")); // veljko fix

        final DateFormat shortDateFormat = new SimpleDateFormat("yyyyMMdd.HHmm"); //GPEH style: A20111003.1200-1215_SubNetwork=RNC10,MeContext=RNC10_rnc_gpehfile_Mp0.bin.gz
        shortDateFormat.setTimeZone(TimeZone.getTimeZone("UTC")); // veljko fix   //454_06_8100_A20121017.0205-0210_staple_tcpta-partial_1337217000.log-2.2.6
                                                                  //454_06_8100_A20121016.1616-1617_captool_summary_1337274120.blk-2.2.6

        // Find the file name in the file name path
        String fileName = fileNameToParse;

        // Check if the file name is in the format AyyyyMMdd.HHmmZ-......
        if (fileName.charAt(0) == 'A') {
            // This is a plain file name starting with A
            fileName = fileName.substring(1);
        } else {
            // This is a full path name with slashes converted to % signs, the file name is after the last %~%A
            fileName = fileName.substring((fileName.lastIndexOf("%~%A") + 4));
        }

        try {
            //in order to understand if the file is UP kind of file search -A
            int indexOfDateStart = fileName.indexOf("-A");
            if (indexOfDateStart != -1)//this is UP file
            {
                indexOfDateStart += 2;
                calendar.setTime(shortDateFormat.parse(fileName.substring(indexOfDateStart, indexOfDateStart
                        + SHORT_DATE_LENGTH)));
            } else {
                // Find the location of the first underscore in the date, that gives us the format of the date in the
                // file name
                final int underscoreLocation = fileName.indexOf('_');

                // Check which date format to use
                if (underscoreLocation > SHORT_DATE_UNDERSCORE_POS) {
                    // Set the UTC time of the calendar for a long date
                    calendar.setTime(longDateFormat.parse(fileName.substring(0, LONG_DATE_LENGTH)));
                } else {
                    // Set the UTC time of the calendar for a short date
                    calendar.setTime(shortDateFormat.parse(fileName.substring(0, SHORT_DATE_LENGTH)));
                }

            }
        } catch (final ParseException e) {
            logger.warn("invalid date on file name: " + fileName);
            throw e;
        }
        // return the calendar instance
        return calendar;
    }

    /**
     * 
     * @param fileNamePath
     * @return timezone offset from the file name. Return -1 if there was no offset.
     */
    public static int getTimezoneOffsetInMinutesFromFileName(final String fileNamePath) {
//        if (fileNamePath.contains("gpehfile")) {
//            return 0; // veljko fix; this is the case when GPEH file has its name with TZ offset but events in the file are UTC
//        }
        // Find the file name in the file name path
        String fileName = fileNamePath;

        // Check if the file name is in the format AyyyyMMdd.HHmmZ-......
        if (fileName.charAt(0) == 'A') {
            // This is a plain file name starting with A
            fileName = fileNamePath.substring(1);
        } else {
            // This is a full path name with slashes converted to % signs, the file name is after the last %~%A
            fileName = fileNamePath.substring((fileNamePath.lastIndexOf("%~%A") + 4));
        }
        // Find the location of the first underscore in the date, that gives us the format of the date in the
        // file name
        final int underscoreLocation = fileName.indexOf('_');
        try {
            if (underscoreLocation > SHORT_DATE_UNDERSCORE_POS) {
            	// file name is local
                // 20111003.1900+0800-20111003.1915+0800_9_ebs.177.gz
            	// 20111003.1200+0800-1215+0800_SubNetwork=RNC10,MeContext=RNC10_rnc_gpehfile_Mp0.bin.gz
                fileName = fileName.substring(13, 18);
                final char ch = fileName.charAt(0);
                fileName = fileName.substring(1);
                final int hour = Integer.valueOf(fileName.substring(0, 2));
                final int minute = Integer.valueOf(fileName.substring(2));
                if (ch == '+') {
                    return hour * 60 + minute;
                } else if (ch == '-') {
                    return -(hour * 60 + minute);
                } else {
                    throw new IllegalStateException();
                }
            }
            // file name is in UTC
            // 20111003.1200-1215_SubNetwork=RNC10,MeContext=RNC10_rnc_gpehfile_Mp0.bin.gz
            return -1;

        } catch (final IllegalStateException e) {
            logger.warn("invalid date on file name: " + fileNamePath);
            throw e;
        }
    }
    
    /**
     * Method to get the OSS ID from the directory path
     * 
     * @param The path (complete file path)
     */
    public static String getOssId(final String fileNamePath) {       
    	int startIndex = fileNamePath.indexOf(OSS_ALIAS_PREFIX);
    	
    	// If OSS alias is not in path, then OSS Id cannot be determined
    	if (startIndex < 0) {
    		return null;
    	}
    	
    	int endIndex = fileNamePath.indexOf(File.separator, startIndex);
    	
    	// If OSS alias is not followed by File Separator, then OSS Id cannot be determined
    	if (endIndex < 0) {
    		return null;
    	}
    	
    	return fileNamePath.substring(startIndex, endIndex);	
    }

}
