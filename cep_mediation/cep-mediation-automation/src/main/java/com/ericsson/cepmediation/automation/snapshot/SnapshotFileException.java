package com.ericsson.cepmediation.automation.snapshot;

public class SnapshotFileException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String fileName;
	
	public SnapshotFileException(String msg, String fileName) {
		super(msg);
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}


}
