package com.ericsson.cepmediation.automation.snapshot;

import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.automation.file.FileAgent;
import com.ericsson.cepmediation.automation.file.RemoteMachineFileAgent;
import com.ericsson.cepmediation.automation.metadata.MetadataException;
import com.ericsson.cepmediation.automation.metadata.SnapshotMetadata;
import com.ericsson.cepmediation.automation.sql.SQLCommand;

/**
 * This class manages snapshots e.g. create a snapshot of a particular database
 * table, save a snapshot to its snapshots file and load snapshots from file.
 * 
 * @author emicned
 * 
 */
public class SnapshotManager {
    private static final int COLUMN_LENGTH = 43;

    public static final String SNAPSHOT_NULL = "NULL";

    public static final String SNAPSHOT_NOT_AVAILABLE = "N/A";

    public static final String SNAPSHOT_NOT_SUPPORTED = "NOT_SUPPORTED";

    private static final String DEVIATION_CHAR = "#";

    private static final Logger logger = LoggerFactory.getLogger(SnapshotManager.class);

    private static final String SNAPSHOT_FILE_DELIMITER = "'\\s+'";

    protected static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";

    protected static final DateFormat dateFormat = new SimpleDateFormat(DATE_TIME_FORMAT);

    private FileAgent fileAgent = new RemoteMachineFileAgent();

    public <T> Snapshot<T> createSnapshot(SnapshotMetadata metaData) throws MetadataException, SQLException, SnapshotException {
        logger.debug("Creating snapshot of " + metaData.getViewName());

        Map<String, String> snapshotData = queryDatabase(metaData);
        Snapshot<T> res = new Snapshot<T>(metaData);
        res.put(SnapshotExtraColumns.DATE_TAKEN.name(), dateFormat.format(new Date()));
        for (Map.Entry<String, String> entry : snapshotData.entrySet()) {
            if (entry.getValue() == null) {
                res.put(entry.getKey(), SNAPSHOT_NULL);
            } else {
                String type = metaData.getName2type().get(entry.getKey());
                res.put(entry.getKey(), "real".equalsIgnoreCase(type) ? roundFloatValue(entry.getValue()) : entry.getValue());
            }
        }

        logger.debug("Created snpashot: " + res);
        return res;
    }

    /**
     * Writes the provided snapshot to the respective snapshots file.
     * 
     * @throws SnapshotFileException
     *             in case of error in the snapshot file contents
     */
    public <T> void save(Snapshot<T> snapshot) throws IOException, SnapshotFileException {
        logger.debug(">>Saving snapshot: " + snapshot);
        List<Snapshot<T>> snapshots = loadAll(snapshot.getMetaData());
        List<Snapshot<T>> allSnapshots = new ArrayList<Snapshot<T>>(snapshots);
        if (allSnapshots.isEmpty()) {
            logger.debug("Creating new snpashots file: " + snapshot);
            allSnapshots.add(snapshot);
            writeSnapshots(allSnapshots);
        } else {
            Set<String> columns = allSnapshots.get(0).getField2Value().keySet();
            Set<String> fields = snapshot.getField2Value().keySet();
            logger.debug("Snapshot file found. Columns: " + columns + ". Fields: " + fields);
            if (columnsAndFieldsMatch(columns, fields)) {
                allSnapshots.add(snapshot);
                writeSnapshots(allSnapshots);
            } else {
                List<String> missingFields = getMissingValues(columns, fields);
                List<String> missingColumns = getMissingValues(fields, columns);
                if (missingFields != null) {
                    logger.info("Missing fields: " + missingFields);
                    for (String field : missingFields) {
                        for (Snapshot<T> oldSnapshot : allSnapshots) {
                            oldSnapshot.remove(field);
                        }
                    }
                }

                if (missingColumns != null) {
                    logger.info("Missing columns: " + missingColumns);
                    for (String col : missingColumns) {
                        for (Snapshot<T> oldSnapshot : allSnapshots) {
                            oldSnapshot.put(col, SNAPSHOT_NOT_AVAILABLE);
                        }
                    }
                }

                allSnapshots.add(snapshot);

                writeSnapshots(allSnapshots);
            }
        }
        logger.debug("<<Snapshot saved.");
    }

    /**
     * Convenience method returning the last snapshot from the file.
     * 
     * @return the latest snapshot or null if none is available.
     */
    public <T> Snapshot<T> getLastSnapshot(SnapshotMetadata metaData) throws IOException, SnapshotFileException {
        List<Snapshot<T>> snapshots = loadAll(metaData);
        logger.debug("Getting last snapshot. Total snapshots: " + snapshots.size());
        Snapshot<T> res = null;
        long resDate = -1;
        for (Snapshot<T> currSnapshot : snapshots) {
            if (!currSnapshot.isDeviating()) {
                long currDate = parseDate(currSnapshot.getField2Value().get(SnapshotExtraColumns.DATE_TAKEN.name()));
                if (currDate > resDate) {
                    res = currSnapshot;
                    resDate = currDate;
                }
            }
        }

        logger.debug("Last snapshot: " + res);
        return res;
    }

    /**
     * Loads all snapshots defined by the specified metadata.
     * 
     * @throws IOException
     *             in case of I/O error reading the snapshot file
     * @throws SnapshotFileException
     *             in case of error in the snapshot file contents
     */
    public <T> List<Snapshot<T>> loadAll(SnapshotMetadata metaData) throws IOException, SnapshotFileException {
        logger.debug(">>Loading snapshots.");
        List<Snapshot<T>> res = new ArrayList<Snapshot<T>>();
        logger.debug("Reading file: " + metaData.getSnapshotsFile());
        List<String> snapshotFileContents = fileAgent.readFile(metaData.getSnapshotsFile());
        if (snapshotFileContents == null || snapshotFileContents.isEmpty()) {
            logger.debug("Snapshots file empty!");
            return res;
        }

        String[] fieldNames = extractFieldNames(snapshotFileContents, metaData);
        logger.debug("Found the following columns: " + Arrays.asList(fieldNames));

        for (String line : snapshotFileContents) {
            line = line.trim();
            if (line.isEmpty()) {
                continue;
            }
            boolean isDeviating = line.startsWith(DEVIATION_CHAR);
            if (isDeviating) {
                line = line.substring(DEVIATION_CHAR.length());
            }
            String[] values = getValuesTrimmed(line);
            if (fieldNames.length != values.length) {
                String errorMsg = "Snapshot columns and values do not match. Columns: " + Arrays.asList(fieldNames) + ". Values: " + Arrays.asList(values);
                throw new SnapshotFileException(errorMsg, metaData.getSnapshotsFile());
            }
            Snapshot<T> snapshot = new Snapshot<T>(metaData);
            snapshot.setDeviating(isDeviating);
            for (int i = 0; i < fieldNames.length; i++) {
                snapshot.put(fieldNames[i], "real".equalsIgnoreCase(metaData.getName2type().get(fieldNames[i])) ? roundFloatValue(values[i]) : values[i]);

            }
            res.add(snapshot);
            logger.trace("Loaded snapshot: " + snapshot);
        }

        logger.debug("<<Loading complete. Snapshots: " + res.size());
        return res;
    }

    public String roundFloatValue(String value) {
        // round the value if type is real
        if (!SNAPSHOT_NULL.equals(value) && !SNAPSHOT_NOT_AVAILABLE.equals(value)) {
            try {
                return String.valueOf((int) Float.parseFloat((value)));
            } catch (Exception e) {
                logger.debug("Could not parse value: " + value, e);
                return value;
            }
        }
        return value;
    }

    private String[] extractFieldNames(List<String> snapshotFileContents, SnapshotMetadata metaData) throws SnapshotFileException {
        String[] fields = snapshotFileContents.remove(0).split("\\s+");
        if (fields.length < 2) {
            throw new SnapshotFileException("Less than 2 field names in the file: " + metaData.getSnapshotsFile() + ". Fields: " + Arrays.asList(fields),
                    metaData.getSnapshotsFile());
        }
        // at least half of the column names should be
        // found in the snapshots file
        int minMatchFieldsCnt = metaData.getName2type().size() / 2;
        for (String field : fields) {
            if (metaData.getName2type().containsKey(field)) {
                minMatchFieldsCnt--;
            }
        }
        if (minMatchFieldsCnt > 0) {
            throw new SnapshotFileException("Less than half of the columns in database are found in the snapshots file. DB cols: "
                    + metaData.getName2type().keySet() + ". Fields: " + Arrays.asList(fields), metaData.getSnapshotsFile());
        }

        return fields;
    }

    private Map<String, String> queryDatabase(SnapshotMetadata metaData) throws MetadataException, SnapshotException {
        String sql = generateSnapshotSql(metaData);
        logger.debug("Executing query: " + sql);
        List<Map<String, String>> queryResult = new SQLCommand().executeQuery(sql);
        if (queryResult.size() != 1) {
            throw new SnapshotException("Only one result is expected when making the snapshot. Instead got " + queryResult.size() + " : " + queryResult);
        }
        Map<String, String> snapshotData = queryResult.get(0);
        logger.debug("Query result: " + snapshotData);
        return snapshotData;
    }

    private final String generateSnapshotSql(SnapshotMetadata metaData) throws MetadataException {
        Map<String, String> name2type = metaData.getName2type();
        StringBuilder query = new StringBuilder();
        query.append("SELECT CAST(count(*) AS varchar) AS " + SnapshotExtraColumns.TOTAL_CNT.name());
        for (String key : name2type.keySet()) {
            String aggregation = getAggregation(key, name2type.get(key));
            query.append(",");
            query.append(aggregation);
        }
        query.append(" FROM " + metaData.getViewName() + " WHERE CAST(datetime_id AS VARCHAR) LIKE '%16:5[0-4]%'");

        return query.toString();
    }

    private String getAggregation(String name, String type) {
        if ("varchar".equals(type)) {
            return "CAST( SUM(LENGTH(" + name + ")) AS varchar) AS " + name;
        } else if ("smallint".equals(type) || ("unsigned int".equals(type)) || ("real".equals(type)) || ("int".equals(type))
                || ("unsigned bigint".equals(type)) || ("tinyint".equals(type)) || ("bit".equals(type))) {
            return "CAST( SUM(" + name + ") AS varchar) AS " + name;
        } else if ("datetime".equals(type)) {
            return "CAST( SUM(CAST(" + name + " AS unsigned bigint)) AS varchar) AS " + name;
        } else {
            return "'" + SNAPSHOT_NOT_SUPPORTED + "' AS " + name;
        }
    }

    private List<String> getMissingValues(Set<String> s1, Set<String> s2) {
        List<String> res = new ArrayList<String>();
        for (String s : s1) {
            if (!s2.contains(s)) {
                res.add(s);
            }
        }
        return res;
    }

    private boolean columnsAndFieldsMatch(Set<String> columns, Set<String> fields) {
        if (fields.size() != columns.size()) {
            return false;
        }

        for (String col : columns) {
            if (!fields.contains(col)) {
                return false;
            }
        }
        return true;
    }

    private <T> void writeSnapshots(List<Snapshot<T>> snapshots) throws SnapshotFileException {
        if (snapshots == null || snapshots.size() == 0) {
            throw new IllegalArgumentException("Invalid argument, snapshots: " + snapshots);
        }

        Snapshot<T> snapshot = snapshots.get(0);
        SnapshotMetadata metaData = snapshot.getMetaData();
        String path = metaData.getSnapshotsFile();
        Map<String, String> field2value = snapshot.getField2Value();
        List<String> contents = new ArrayList<String>(snapshots.size() + 1);
        String columns = createSnapshotLine(field2value.keySet(), false);
        contents.add(columns);
        for (Snapshot<T> s : snapshots) {
            String values = createSnapshotLine(s.getField2Value().values(), true);
            if (s.isDeviating()) {
                values = DEVIATION_CHAR + values;
            }
            contents.add(values);
        }

        logger.debug("Writing snapshots file: " + path + " snapshots: " + snapshots.size());
        writeFile(path, contents);
    }

    private String[] getValuesTrimmed(String line) {
        // remove leading and trailing quotes
        line = line.trim();
        if (line.charAt(0) == '\'') {
            line = line.substring(1);
        } else {
            logger.warn("The first character in line is expected to be quote(')" + line);
        }

        if (line.charAt(line.length() - 1) == '\'') {
            line = line.substring(0, line.length() - 1);
        } else {
            logger.warn("The last character in line is expected to be quote(')" + line);
        }

        String[] res = line.split(SNAPSHOT_FILE_DELIMITER);
        for (int i = 0; i < res.length; i++) {
            res[i] = res[i].trim();
        }
        return res;
    }

    private String createSnapshotLine(Collection<String> tokens, boolean quote) {
        StringBuilder res = new StringBuilder();
        for (String token : tokens) {
            token = token.trim();
            if (quote) {
                token = "'" + token + "'";
            }

            res.append(addSpaces(token));
        }
        return res.toString();

    }

    private String addSpaces(String token) {
        if (token == null) {
            token = "";
        }
        token = token.trim();
        while (token.length() < COLUMN_LENGTH) {
            token += " ";
        }

        return token;
    }

    protected void writeFile(String path, List<String> contents) throws SnapshotFileException {
        try {
            fileAgent.writeFile(path, contents);
        } catch (SnapshotFileException sfe) {
            logger.error("Could not create file: " + sfe.getFileName());
            throw sfe;
        } catch (Exception e) {
            logger.error("Error writing snapshot to remote server. Path: " + path, e);
            throw new SnapshotFileException("Could not write snapshots file", path);
        }
    }

    private long parseDate(String date) {
        try {
            Date d = dateFormat.parse(date);
            return d.getTime();
        } catch (ParseException e) {
            logger.error("Error while parsing date_taken=" + date + " from snapshots file.", e);
            return -1;
        }
    }

}
