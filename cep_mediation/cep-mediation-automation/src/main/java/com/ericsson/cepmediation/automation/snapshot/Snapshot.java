package com.ericsson.cepmediation.automation.snapshot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.automation.metadata.SnapshotMetadata;

/**
 * This class represents a database snapshot.
 * 
 * Basically the snapshot is the result returned by a query like this:
 * 
 * SELECT datetime_id, COUNT(*), SUM(EVENT_ID), SUM(EVENT_CNT),
 * SUM(RRC_DURATION),... FROM event_e_ran_session_raw WHERE CAST(datetime_id AS
 * VARCHAR) LIKE '%16:50%'
 * 
 * ...and the result might look like:
 * 
 * 2013-01-23-23:20:00.000000 27113 542260000 881194 1747217479...
 * 
 * The snapshot object holds the line above.
 * 
 * @author emicned
 * 
 * @param <T>
 *            the java class corresponding to the class which is stored in db.
 *            For the example above, the class would be GPEH_SESSION because the
 *            db table is event_e_ran_session
 */
public class Snapshot<T> {
	private static final Logger logger = LoggerFactory.getLogger(Snapshot.class);

	private SnapshotMetadata metaData;

	private Map<String, String> field2value = new TreeMap<String, String>();

	private List<String> extraCols = new ArrayList<String>();

	private boolean isDeviating;

	public Snapshot(SnapshotMetadata metaData) {
		this.metaData = metaData;
		for (SnapshotExtraColumns col : SnapshotExtraColumns.values()) {
			extraCols.add(col.name());
		}
	}

	public void put(String field, String value) {
		if (isSupported(field)) {
			if (field2value.containsKey(field)) {
				throw new IllegalArgumentException("Duplicate field name: " + field + ". Current fields: " + field2value);
			}

			field2value.put(field, value);
		} else {
			logger.warn("Skiping field not present in db and extra columns: " + field);
		}
	}

	public String remove(String field) {
		return field2value.remove(field);
	}

	public Map<String, String> getField2Value() {
		return Collections.unmodifiableSortedMap(new TreeMap<String, String>(field2value));
	}

	public SnapshotMetadata getMetaData() {
		return metaData;
	}

	private boolean isSupported(String col) {
		return extraCols.contains(col) || metaData.getName2type().containsKey(col);
	}

	public boolean isDeviating() {
		return isDeviating;
	}

	public void setDeviating(boolean isDeviating) {
		this.isDeviating = isDeviating;
	}

	@Override
	public String toString() {
		return "Date: " + field2value.get(SnapshotExtraColumns.DATE_TAKEN.name()) + " Deviating: " + isDeviating + " Snapshot [field2value=" + field2value + "]";
	}

}
