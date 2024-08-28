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
package com.ericsson.cepmediation.automation.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.automation.configuration.CEPMediationPropertiesInAutomatedTest;
import com.sybase.jdbc4.jdbc.SybConnectionPoolDataSource;

/**
 * @author eemecoy
 * 
 */
public class SQLCommand {
	private static final Logger logger = LoggerFactory.getLogger(SQLCommand.class);

	private SybConnectionPoolDataSource dataSource;

	public SQLCommand() {
		setupDBConnection();
	}

	private void setupDBConnection() {
		String user = CEPMediationPropertiesInAutomatedTest.getProperty("automatedtest.eniq.events.db.user");
		String pass = CEPMediationPropertiesInAutomatedTest.getProperty("automatedtest.eniq.events.db.password");
		String dbName = CEPMediationPropertiesInAutomatedTest.getProperty("automatedtest.eniq.events.db.databaseName");
		String server = CEPMediationPropertiesInAutomatedTest.getProperty("automatedtest.eniq.events.db.serverName");

		String portNumber = CEPMediationPropertiesInAutomatedTest.getProperty("automatedtest.eniq.events.db.portNumber");
		int port = Integer.parseInt(portNumber);

		dataSource = new SybConnectionPoolDataSource();
		dataSource.setUser(user);
		dataSource.setPassword(pass);
		dataSource.setDatabaseName(dbName);
		dataSource.setServerName(server);
		dataSource.setPortNumber(port);
		logger.info("Db server: "+ server);
	}

	public Connection getConnection() {
		try {
			return (Connection) dataSource.getPooledConnection();
		} catch (final SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Map<String, String>> executeQuery(final String query) {
		Statement statement = null;
		Connection connection = null;
		try {
			connection = getConnection();
			statement = connection.createStatement();
			logger.info("Executing: " + query);
			final ResultSet resultSet = statement.executeQuery(query);
			return transformResultSetToAttributesMap(resultSet);
		} catch (final Exception e) {
			throw new RuntimeException(e);
		} finally {
			close(statement);
			close(connection);
		}
	}

	private List<Map<String, String>> transformResultSetToAttributesMap(final ResultSet resultSet) {
		try {
			final ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
			final List<Map<String, String>> rows = new ArrayList<Map<String, String>>();
			while (resultSet.next()) {
				final int columnCount = resultSetMetaData.getColumnCount();
				final Map<String, String> values = new TreeMap<String, String>();
				for (int i = 1; i <= columnCount; i++) {
					final String columnName = resultSetMetaData.getColumnName(i);
					final String value = resultSet.getString(i);
					values.put(columnName, value);
				}
				rows.add(values);

			}
			return rows;
		} catch (final SQLException e) {
			throw new RuntimeException(e);
		}
	}

	private void close(final Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (final SQLException e) {
				throw new RuntimeException(e);
			}
		}

	}

	private void close(final Statement statement) {
		if (statement != null) {
			try {
				statement.close();
			} catch (final SQLException e) {
				throw new RuntimeException(e);
			}
		}

	}

	public void executeUpdate(final String query) {
		Statement statement = null;
		Connection connection = null;
		try {
			connection = getConnection();
			statement = connection.createStatement();
			logger.info("Executing: " + query);
			statement.executeUpdate(query);
		} catch (final Exception e) {
			throw new RuntimeException(e);
		} finally {
			close(statement);
			close(connection);
		}
	}
}
