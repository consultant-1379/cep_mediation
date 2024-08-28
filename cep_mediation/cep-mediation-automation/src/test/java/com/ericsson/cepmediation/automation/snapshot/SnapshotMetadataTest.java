package com.ericsson.cepmediation.automation.snapshot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import java.io.File;
import java.sql.SQLException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.ericsson.cepmediation.automation.metadata.MetadataException;
import com.ericsson.cepmediation.automation.metadata.RadioSessionSnapshotMetadata;
import com.ericsson.cepmediation.automation.metadata.SnapshotMetadata;

public class SnapshotMetadataTest {
	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	@Test
	public void verifySnapshotsFile() throws MetadataException, SQLException {
		SnapshotMetadata metaData = new RadioSessionSnapshotMetadata();
		String file = metaData.getSnapshotsFile();
		int pos = file.lastIndexOf(File.separator);
		String fileName = file.substring(pos + 1);
		assertEquals("GPEH_SESSION.snapshots", fileName);
		String path = file.substring(0, pos);
		assertNotSame("null", path);

	}

}
