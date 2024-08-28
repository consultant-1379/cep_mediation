package com.ericsson.cepmediation.automation.snapshot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.ericsson.cepmediation.automation.file.LocalMachineFileAgent;
import com.ericsson.cepmediation.automation.metadata.MetadataException;
import com.ericsson.cepmediation.test.util.PrivateFieldAccessor;


public class SnapshotManagerTest {
	private SnapshotManager manager;
	
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	@Before
	public void init() throws SecurityException, IllegalArgumentException, NoSuchFieldException, IllegalAccessException{
		manager = new SnapshotManager();
		PrivateFieldAccessor accessor = new PrivateFieldAccessor(manager, "fileAgent");
		accessor.setVal(new LocalMachineFileAgent());
	}

	@Test
	public void verifySaveAndLoadSnapshot() throws IOException, MetadataException, SnapshotFileException, SQLException {
		Snapshot<GPEH_SESSION> snapshot = saveSnapshot();
		
		List<Snapshot<GPEH_SESSION>> snapshots = manager.loadAll(snapshot.getMetaData());
		assertEquals(1, snapshots.size());
		Map<String, String> field2Value = snapshot.getField2Value();
		assertNull("Dummy column is not null: " + field2Value.get("dummy"), field2Value.get("dummy"));
		assertEquals("53453", field2Value.get("TOTAL_CNT"));
		assertEquals("2013-01-23-23:20:00.000000", field2Value.get("DATE_TAKEN"));
		assertEquals("5", field2Value.get("CM_CNT"));
		assertEquals("startcid", field2Value.get("START_CELL_ID"));
		assertEquals("5", field2Value.get("ECNO_AVG"));
	}
	
	private Snapshot<GPEH_SESSION> saveSnapshot() throws IOException, MetadataException, SQLException, SnapshotFileException {
		File snapshotsFile = File.createTempFile("GPEH_SESSION", ".snapshots");
		snapshotsFile.deleteOnExit();

		Map<String, String> name2type = new HashMap<String, String>();
		name2type.put("TOTAL_CNT", "int");
		name2type.put("CM_CNT", "int");
		name2type.put("START_CELL_ID", "varchar");
		name2type.put("ECNO_AVG", "real");
		SnapshotMetadataMock metaData = new SnapshotMetadataMock(snapshotsFile.getAbsolutePath(), name2type);
		
		Snapshot<GPEH_SESSION> snapshot = new Snapshot<GPEH_SESSION>(metaData);
		snapshot.put("dummy", "dummy");
		snapshot.put("TOTAL_CNT", "53453");
		snapshot.put("DATE_TAKEN","2013-01-23-23:20:00.000000");
		snapshot.put("CM_CNT", "5");
		snapshot.put("START_CELL_ID", "startcid");
		snapshot.put("ECNO_AVG", "5");
		
		manager.save(snapshot);
		
		return snapshot;
	}
}
