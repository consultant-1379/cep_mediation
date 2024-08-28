package com.ericsson.cepmediation.base.database.iq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.distocraft.dc5000.etl.rock.Meta_databases;
import com.ericsson.eniq.repository.DBUsersGet;

public class ConnectionFactory {
    private static final Logger logger = LoggerFactory.getLogger(ConnectionFactory.class);

    private static final String CONF_DIR_PARAM = "CONF_DIR";

    private final String dbUrl;

    private final Properties props;

    ConnectionFactory(final String user, final String conn) {
        final Meta_databases info = getMetaInfo(user, conn);
        dbUrl = info.getConnection_string();

        props = new Properties();
        props.put("user", user);
        props.put("password", info.getPassword());

        testConnection();
    }

    private void testConnection() {
        if (dbUrl == null || dbUrl.isEmpty()) {
            throw new IllegalStateException("Connection string is null or empty in meta_databases!");
        }

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbUrl, props);
            logger.info("Successfully pinged db: " + dbUrl);
        } catch (final SQLException e) {
            throw new IllegalStateException("Could not create connection to db! url: " + dbUrl);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (final SQLException e) {
                    logger.error(e.getMessage());
                }
            }
        }
    }

    Connection getConnection() throws SQLException {
        try {
            return DriverManager.getConnection(dbUrl, props);
        } catch (final SQLException e) {
            logger.error("Could not get connection: " + e.getMessage());
            throw e;
        }
    }

    private final Meta_databases getMetaInfo(final String user, final String connection) {
        final String confDir = System.getenv().get(CONF_DIR_PARAM);
        if (confDir != null && !confDir.isEmpty()) {
            System.setProperty(CONF_DIR_PARAM, confDir);
        }
        System.setProperty("pname", "DBUsers");

        final List<Meta_databases> databases = DBUsersGet.getMetaDatabases(user, connection);
        for (int i = 0, n = databases != null ? databases.size() : 0; i < n; i++) {
            @SuppressWarnings("null")
            final Meta_databases db = databases.get(i);
            if (db != null && connection.equals(db.getConnection_name()) && user.equals(db.getUsername())) {
                return db;
            }
        }

        throw new IllegalArgumentException("Could not retrieve password for user: " + user + " database: " + connection);
    }
}
