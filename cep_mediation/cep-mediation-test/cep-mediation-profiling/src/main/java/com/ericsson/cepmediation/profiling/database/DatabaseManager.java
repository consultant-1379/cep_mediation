/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2015
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.cepmediation.profiling.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.ericsson.cepmediation.profiling.util.ProfilingProperties;

public class DatabaseManager {
    private final Logger logger = Logger.getLogger(DatabaseManager.class);

    private Properties props;

    private String connectionString = ProfilingProperties.instance.getDatabaseConnectionString();

    private static final DatabaseManager instance = new DatabaseManager();

    private DatabaseManager() {
        try {
            Class.forName("com.sybase.jdbc4.jdbc.SybDriver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        props = new Properties();
        props.put("user", ProfilingProperties.instance.getDatabaseUser());
        props.put("password", ProfilingProperties.instance.getDatabasePass());
        
        testConnection();
        
        logger.info("Successfully pinged db: " + connectionString);

    }

    private void testConnection() {
        if (connectionString == null || connectionString.isEmpty()) {
            throw new IllegalStateException("Connection string is null or empty!");
        }

        Connection connection = null;
        try {
            connection = getConnection();
        } finally {
            close(connection);
        }
    }

    private void close(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (final SQLException e) {
                logger.error(e.getMessage());
            }
        }
    }

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(connectionString, props);
        } catch (SQLException e) {
            logger.error("Error gettings connection", e);
            throw new RuntimeException(e);
        }
    }

    public static DatabaseManager getInstance() {
        return instance;
    }

}
