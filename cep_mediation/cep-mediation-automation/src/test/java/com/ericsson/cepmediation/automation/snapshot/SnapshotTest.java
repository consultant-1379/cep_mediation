package com.ericsson.cepmediation.automation.snapshot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.ericsson.cepmediation.automation.metadata.MetadataException;
public class SnapshotTest {
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	@Test
	public void verifyLoadSnapshot() throws MetadataException, SQLException{
		Map<String, String> name2type = new HashMap<String, String>();
		name2type.put("TOTAL_CNT", "int");
		name2type.put("CM_CNT", "int");
		name2type.put("START_CELL_ID", "varchar");
		name2type.put("ECNO_AVG", "real");
		SnapshotMetadataMock metaData = new SnapshotMetadataMock(null, name2type);
		Snapshot<GPEH_SESSION> snapshot = new Snapshot<GPEH_SESSION>(metaData);
		
		String[] fieldNames = {"TOTAL_CNT","DATE_TAKEN", "CM_CNT", "START_CELL_ID", "ECNO_AVG", "dummy"};
		String[] values = {"53453", "2013-01-23-23:20:00.000000", "5", "startcid", "6", "dummy"};
		for (int i = 0; i < fieldNames.length; i++) {
			snapshot.put(fieldNames[i], values[i]);
		}
		
		Map<String, String> field2Value = snapshot.getField2Value();
		assertNull(field2Value.get("dummy"));
		assertEquals("53453",field2Value.get("TOTAL_CNT"));
		assertEquals("2013-01-23-23:20:00.000000",field2Value.get("DATE_TAKEN"));
		assertEquals("5",field2Value.get("CM_CNT"));
		assertEquals("startcid",field2Value.get("START_CELL_ID"));
		assertEquals("6",field2Value.get("ECNO_AVG"));
	}
}
