package com.ericsson.cepmediation.automation.metadata;

public class MetadataException  extends Exception {
	private static final long serialVersionUID = 1L;

	private String clazz;
	
	public MetadataException(String msg, String clazz) {
		super(msg);
		this.clazz = clazz;
	}

	public String getClazz() {
		return clazz;
	}
	
	

}
