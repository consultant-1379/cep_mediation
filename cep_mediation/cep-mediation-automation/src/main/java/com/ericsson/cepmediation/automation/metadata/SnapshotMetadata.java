package com.ericsson.cepmediation.automation.metadata;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.automation.launcher.ApplicationLauncher;
import com.ericsson.cepmediation.automation.sql.SQLCommand;

/**
 * This class holds meta data for snapshots of specific type e.g. GPEH_SESSION
 * snapshots.
 * 
 * Snapshots are created by executing a snapsot sql query against specific table. The query
 * aggregates the values of certain columns of the table for snapshot. The meta data class contains
 * information about table columns and their types which is needed to generate the snapshot query.
 * Also, snapshots have to be stored in a plain file on the file system in order to track regression.
 * The meta data class contains the name of the file.
 * 
 * @author emicned
 * 
 * @param <T>  the actual type that is persisted to database
 */
public abstract class SnapshotMetadata {
    private static final Logger logger = LoggerFactory.getLogger(SnapshotMetadata.class);

    // name of the snapshots file
    private String snapshotsFilePath;

    private Map<String, String> name2type;

    private List<String> excludedFields;

    public SnapshotMetadata(List<String> excludedFields, String snapshotFileName) throws MetadataException, SQLException {
        this.excludedFields = excludedFields;
        snapshotsFilePath = ApplicationLauncher.SNAPSHOTS_PATH + File.separator + snapshotFileName + ".snapshots";
        name2type = parseFieldTypes();
    }

    public abstract String getViewName();

    public String getSnapshotsFile() {
        return snapshotsFilePath;
    }

    public Map<String, String> getName2type() {
        return name2type;
    }

    protected Map<String, String> parseFieldTypes() throws MetadataException, SQLException {
        logger.debug(">>Retrieving column types.");
        Map<String, String> res = new HashMap<String, String>();

        Statement statement = null;
        Connection connection = null;
        try {
            connection = new SQLCommand().getConnection();
            statement = connection.createStatement();
            final ResultSet resultSet = statement.executeQuery("select top 1 * from " + getViewName() + " where imsi = -123");
            ResultSetMetaData metaData = resultSet.getMetaData();
            for (int i = 1, n = metaData.getColumnCount(); i < n; i++) {
                String name = metaData.getColumnName(i);
                String type = metaData.getColumnTypeName(i);
                if (!excludedFields.contains(name)) {
                    res.put(name, type);
                }
            }
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }

        logger.debug("<<Column types:" + res);
        return res;
    }

    @Override
    public String toString() {
        return "SnapshotMetadata [snapshotsFilePath=" + snapshotsFilePath + ", name2type=" + name2type + ", excludedFields=" + excludedFields + "]";
    }
}
