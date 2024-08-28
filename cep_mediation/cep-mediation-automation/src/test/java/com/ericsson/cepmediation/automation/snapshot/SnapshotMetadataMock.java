package com.ericsson.cepmediation.automation.snapshot;

import java.sql.SQLException;
import java.util.Map;

import com.ericsson.cepmediation.automation.metadata.MetadataException;
import com.ericsson.cepmediation.automation.metadata.RadioSessionSnapshotMetadata;


class SnapshotMetadataMock extends RadioSessionSnapshotMetadata {

	private String snapshotsFile;
	private Map<String, String> name2type;

	public SnapshotMetadataMock(String snapshotsFile, Map<String,String> name2type) throws MetadataException, SQLException {
		super();
		this.snapshotsFile = snapshotsFile;
		this.name2type = name2type;
	}
	
	@Override
	public String getSnapshotsFile(){
		return snapshotsFile;
	}
	@Override
	protected  Map<String, String> parseFieldTypes() throws MetadataException, SQLException {
		// needed to avoid db call
		return null;
	}
	
	@Override
	public Map<String, String> getName2type(){
		return name2type;
	}
}