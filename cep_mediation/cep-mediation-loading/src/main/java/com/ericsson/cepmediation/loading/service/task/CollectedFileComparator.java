package com.ericsson.cepmediation.loading.service.task;

import java.io.File;
import java.util.Comparator;

/**
 * This class is used to sort a collection of files into Mp order, used particularly for GPEH files
 * @author eeilfn
 *
 */
public class CollectedFileComparator implements Comparator<File> {
	// The Mp tag to search for
	private static final String MP_TAG     = "_rnc_gpehfile_Mp";
	private static final String MP_END_TAG = ".bin.gz";
	
	/**
	 * Compare two  file names and sort them into increasing Mp order
	 * GPEH files are named as follows:
	 * A<Date>.<StartTime>- <EndTime>_<ShortNodeId>_rnc_gpehfile_Mp<n>.bin.gz
	 * @return an integer indicating the comparison
	 */
	@Override
	public int compare(final File firstFile, final File secondFile) {
		// Get the position of the Mp in the file names
		final int firstMpPos     = firstFile.getName().indexOf(MP_TAG);
		final int secondMpPos    = secondFile.getName().indexOf(MP_TAG);
		final int firstMpEndPos  = firstFile.getName().indexOf(MP_END_TAG);
		final int secondMpEndPos = secondFile.getName().indexOf(MP_END_TAG);
		
		// Check if the Mp start and end was found
		if (firstMpPos == -1 || secondMpPos == -1 || firstMpEndPos == -1 || secondMpEndPos == -1) {
			// Return the bare file comparison
			return firstFile.compareTo(secondFile);
		}
		
		// Get the file names up to the MP position
		final String firstFilePrefix  = firstFile.getName().substring(0, firstMpPos);
		final String secondFilePrefix = secondFile.getName().substring(0, firstMpPos);
		
		// Check if the prefixes are the same
		if (!firstFilePrefix.equals(secondFilePrefix)) {
			// Return the bare file comparison
			return firstFile.compareTo(secondFile);
		}
		
		// Convert each Mp into an integer
		final int firstMp  = Integer.parseInt(firstFile.getName().substring(firstMpPos + MP_TAG.length(), firstMpEndPos));
		final int secondMp = Integer.parseInt(secondFile.getName().substring(secondMpPos + MP_TAG.length(), secondMpEndPos));
		
		// Return the 
		return firstMp - secondMp;
	}

}
