package com.ericsson.cepmediation.correlation.integrity;

import java.io.File;
import java.io.FileFilter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.TimeZone;

import junit.framework.TestCase;

public class CaptoolIntegrityTest extends TestCase {

	private static final String DIRECTORY = "/home/akrios/data/SmarTone/2011-09-27_to_2011-10-08/Probe/captool/";	
	
	private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	static {
		DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("UTC"));
	}
	
	public void test() throws Exception {
		
	}
	private List<File> getFiles() {
		File directory = new File(DIRECTORY);
		File[] files = directory.listFiles(new FileFilter() {
			@Override
			public boolean accept(File file) {
				return file.isFile() && (file.getName().contains("A20111003.1110"));
			}
		});
		Arrays.sort(files);
		return Arrays.asList(files);
	}
}
