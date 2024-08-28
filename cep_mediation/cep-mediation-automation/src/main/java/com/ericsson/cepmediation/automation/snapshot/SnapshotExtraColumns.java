package com.ericsson.cepmediation.automation.snapshot;

public enum SnapshotExtraColumns {
	DATE_TAKEN("varchar"), TOTAL_CNT("varchar");
	
	private String type;
	
	SnapshotExtraColumns(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
}
