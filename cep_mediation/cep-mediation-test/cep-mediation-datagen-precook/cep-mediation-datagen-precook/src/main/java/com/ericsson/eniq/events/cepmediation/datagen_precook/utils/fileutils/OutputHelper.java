package com.ericsson.eniq.events.cepmediation.datagen_precook.utils.fileutils;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputHelper {
	private static FileOutputStream fop = null;
	private static File file;

	public static void init(String OUTPUT_FOLDER, String FILE_PREFIX, String FILE_POSTFIX) {
		file = new File(OUTPUT_FOLDER + FILE_PREFIX + FILE_POSTFIX);
		try {
			fop = new FileOutputStream(file,true);
			file.createNewFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void writeToFile(String str) {
		try {
			byte[] contentInBytes = (str + "\n").getBytes();
			fop.write(contentInBytes);
			fop.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void close() {
		try {
			fop.flush();
			fop.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
