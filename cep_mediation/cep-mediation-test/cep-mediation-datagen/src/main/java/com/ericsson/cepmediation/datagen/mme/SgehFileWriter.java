package com.ericsson.cepmediation.datagen.mme;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SgehFileWriter {
    private static final Logger logger = LoggerFactory.getLogger(SgehFileWriter.class);

    public final static int MAX_RECORD_LENGTH = 65535;

    private String filePath;

    private OutputStream output;

    public SgehFileWriter(String directory, String fileName) {
        filePath = directory + "/" + fileName;
        if (!isDirectoryExists(directory)) {
			new File(directory).mkdir();
		}
        open();
    }

    public void open() {
        logger.info("Creating " + filePath);
        File file = new File(filePath);
        try {
            file.createNewFile();
            output = new FileOutputStream(filePath);
        } catch (Exception e) {
            logger.error("Exception creating/opening file: " + filePath);
            throw new IllegalArgumentException("unable to create/open file: " + filePath);
        }
    }

    public void close() {
        if (output != null) {
            try {
                output.close();
            } catch (Exception e) {
                System.err.println("Exception closing file: " + filePath);
            }
        }
    }

    public void writeRecord(byte[] record, int type) {
        int recordLength = record.length;
        if (recordLength > MAX_RECORD_LENGTH) {
            throw new IllegalArgumentException("record too big");
        }

        try {
            byte[] recordHeader = new byte[3];
            recordHeader[0] = (byte) (((3 + recordLength) & 0x0000ff00) >> 8);
            recordHeader[1] = (byte) ((3 + recordLength) & 0x000000ff);
            recordHeader[2] = (byte) (type & 0x000000ff);
            output.write(recordHeader);
            output.write(record);
        } catch (Exception e) {
            logger.error("Exception writing record to file: " + filePath, e);
        }
    }
	public boolean isDirectoryExists(String dir) {
		return new File(dir).exists();
	}
}
