package com.ericsson.cepmediation.base.util;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

/**
 * This class handles conversion between Strings and Java SQL types
 * @author eeilfn
 *
 */
public abstract class TypeConversion {
    private static Map<Integer, JavaType> sqlToJavaTypes = new HashMap<Integer, JavaType>();

    /**
     * Convert an Event Parameter type to a SQL type
     * @param parameterType
     * @return The parameter type as a SQL type     
     */
    public static int typeEventParameter2Sql(final String parameterType, final int numberOfBytes) {
        // String converts directly to text; DNSNAME, STRING, and TBCD types hold identities and are converted to text

        if (parameterType.equals("DNSNAME") || parameterType.equals("STRING") || parameterType.equals("TBCD") || parameterType.equals("HEXSTRING")
                || parameterType.equals("NUMERICHEXSTRING") || parameterType.equals("IPADDRESS") || parameterType.equals("IPADDRESSV6")) {
            return java.sql.Types.CLOB;
        }

        // Numeric type conversions
        else if (parameterType.equals("ENUM") || parameterType.equals("IBCD") || parameterType.equals("UINT")) {
            // numberOfBytes is -1 for variable length parameters
            if (numberOfBytes >= 0 & numberOfBytes <= 1) {
                return java.sql.Types.TINYINT;
            }
            if (numberOfBytes == 2) {
                return java.sql.Types.SMALLINT;
            } else if (numberOfBytes >= 3 & numberOfBytes <= 4) {
                return java.sql.Types.INTEGER;
            } else if (numberOfBytes >= 4 & numberOfBytes <= 8) {
                return java.sql.Types.BIGINT;
            }
            // Numeric type is too long, so return OTHER
            else {
                return java.sql.Types.OTHER;
            }
        }

        // We treat IP addresses as byte arrays, all byte arrays are translated to text
        else if (parameterType.equals("BINARY") || parameterType.equals("BYTEARRAY") || parameterType.equals("FROREF")) {
            return java.sql.Types.BINARY;
        }

        // Time stamp remains a time stamp
        else if (parameterType.equals("TIMESTAMP")) {
            return java.sql.Types.TIMESTAMP;
        }

        // Date remains a date
        else if (parameterType.equals("DATE")) {
            return java.sql.Types.DATE;
        }

        // Boolean remains a boolean
        else if (parameterType.equals("BOOLEAN")) {
            return java.sql.Types.BOOLEAN;
        }

        // Float remains a Float
        else if (parameterType.equals("FLOAT")) {
            return java.sql.Types.FLOAT;
        }
        // Float remains a Float
        else if (parameterType.equals("DOUBLE")) {
            return java.sql.Types.DOUBLE;
        }

        else {
            // Unknown type, so return OTHER
            return java.sql.Types.OTHER;
        }
    }

    /**
     * Convert a SQL type to a standard SQL type string
     * @param sqlType
     */
    public static String typeSqlToString(final int sqlType) {
        // Use a big old switch for this
        switch (sqlType) {
        case Types.ARRAY: {
            return "ARRAY";
        }
        case Types.BIGINT: {
            return "BIGINT";
        }
        case Types.BINARY: {
            return "BINARY";
        }
        case Types.BIT: {
            return "BIT";
        }
        case Types.BLOB: {
            return "BLOB";
        }
        case Types.BOOLEAN: {
            return "BOOLEAN";
        }
        case Types.CHAR: {
            return "CHAR";
        }
        case Types.CLOB: {
            return "CLOB";
        }
        case Types.DATALINK: {
            return "DATALINK";
        }
        case Types.DATE: {
            return "DATE";
        }
        case Types.DECIMAL: {
            return "DECIMAL";
        }
        case Types.DISTINCT: {
            return "DISTINCT";
        }
        case Types.DOUBLE: {
            return "DOUBLE";
        }
        case Types.FLOAT: {
            return "FLOAT";
        }
        case Types.INTEGER: {
            return "INTEGER";
        }
        case Types.JAVA_OBJECT: {
            return "JAVA_OBJECT";
        }
        case Types.LONGNVARCHAR: {
            return "LONGNVARCHAR";
        }
        case Types.LONGVARBINARY: {
            return "LONGVARBINARY";
        }
        case Types.LONGVARCHAR: {
            return "LONGVARCHAR";
        }
        case Types.NCHAR: {
            return "NCHAR";
        }
        case Types.NCLOB: {
            return "NCLOB";
        }
        case Types.NULL: {
            return "NULL";
        }
        case Types.NUMERIC: {
            return "NUMERIC";
        }
        case Types.NVARCHAR: {
            return "NVARCHAR";
        }
        case Types.OTHER: {
            return "OTHER";
        }
        case Types.REAL: {
            return "REAL";
        }
        case Types.REF: {
            return "REF";
        }
        case Types.ROWID: {
            return "ROWID";
        }
        case Types.SMALLINT: {
            return "SMALLINT";
        }
        case Types.SQLXML: {
            return "SQLXML";
        }
        case Types.STRUCT: {
            return "STRUCT";
        }
        case Types.TIME: {
            return "TIME";
        }
        case Types.TIMESTAMP: {
            return "TIMESTAMP";
        }
        case Types.TINYINT: {
            return "TINYINT";
        }
        case Types.VARBINARY: {
            return "VARBINARY";
        }
        case Types.VARCHAR: {
            return "VARCHAR";
        }
        default: {
            return "UNKNOWN";
        }
        }
    }

    /**
     * Convert a SQL type to a PostgreSQL type string. Only the ones used in CEP Mediation are checked as being
     * properly mapped. The main differences are BINARY<-->BYTEA and CLOB<-->TEXT
     * @param sqlType
     */
    public static String typeSqlToPostgreSqlString(final int sqlType) {
        // Use a big old switch for this
        switch (sqlType) {
        case Types.ARRAY: {
            return "ARRAY";
        }
        case Types.BIGINT: {
            return "BIGINT";
        }
        case Types.BINARY: {
            return "BYTEA"; // Different from Standard
        }
        case Types.BIT: {
            return "BIT";
        }
        case Types.BLOB: {
            return "BLOB";
        }
        case Types.BOOLEAN: {
            return "BOOLEAN";
        }
        case Types.CHAR: {
            return "CHAR";
        }
        case Types.CLOB: {
            return "TEXT"; // Different from standard SQL
        }
        case Types.DATALINK: {
            return "DATALINK";
        }
        case Types.DATE: {
            return "DATE";
        }
        case Types.DECIMAL: {
            return "DECIMAL";
        }
        case Types.DISTINCT: {
            return "DISTINCT";
        }
        case Types.DOUBLE: {
            return "double precision";
        }
        case Types.FLOAT: {
            return "FLOAT";
        }
        case Types.INTEGER: {
            return "INTEGER";
        }
        case Types.JAVA_OBJECT: {
            return "JAVA_OBJECT";
        }
        case Types.LONGNVARCHAR: {
            return "LONGNVARCHAR";
        }
        case Types.LONGVARBINARY: {
            return "LONGVARBINARY";
        }
        case Types.LONGVARCHAR: {
            return "LONGVARCHAR";
        }
        case Types.NCHAR: {
            return "NCHAR";
        }
        case Types.NCLOB: {
            return "NCLOB";
        }
        case Types.NULL: {
            return "NULL";
        }
        case Types.NUMERIC: {
            return "NUMERIC";
        }
        case Types.NVARCHAR: {
            return "NVARCHAR";
        }
        case Types.OTHER: {
            return "OTHER";
        }
        case Types.REAL: {
            return "REAL";
        }
        case Types.REF: {
            return "REF";
        }
        case Types.ROWID: {
            return "ROWID";
        }
        case Types.SMALLINT: {
            return "SMALLINT";
        }
        case Types.SQLXML: {
            return "SQLXML";
        }
        case Types.STRUCT: {
            return "STRUCT";
        }
        case Types.TIME: {
            return "TIME";
        }
        case Types.TIMESTAMP: {
            return "TIMESTAMP";
        }
        case Types.TINYINT: { // Customized for PostgreSQL
            return "SMALLINT";
        }
        case Types.VARBINARY: {
            return "VARBINARY";
        }
        case Types.VARCHAR: {
            return "VARCHAR";
        }
        default: {
            return "UNKNOWN";
        }
        }
    }

    /**
     * Convert a String to a standard SQL type
     * @param sqlType
     */
    public static int typeStringToSql(final String sqlTypeString) {
        // Convert each string one by one, take care calling this method in performance
        // sensitive parts of the system
        if (sqlTypeString.equals("ARRAY")) {
            return Types.ARRAY;
        } else if (sqlTypeString.equals("BIGINT")) {
            return Types.BIGINT;
        } else if (sqlTypeString.equals("BINARY")) {
            return Types.BINARY;
        } else if (sqlTypeString.equals("BYTEA")) {
            return Types.BINARY; // Extra for PostgreSQL
        } else if (sqlTypeString.equals("BIT")) {
            return Types.BIT;
        } else if (sqlTypeString.equals("BLOB")) {
            return Types.BLOB;
        } else if (sqlTypeString.equals("BOOLEAN")) {
            return Types.BOOLEAN;
        } else if (sqlTypeString.equals("CHAR")) {
            return Types.CHAR;
        } else if (sqlTypeString.equals("CLOB")) {
            return Types.CLOB;
        } else if (sqlTypeString.equals("TEXT")) {
            return Types.CLOB; // Extra for PostgreSQL
        } else if (sqlTypeString.equals("DATALINK")) {
            return Types.DATALINK;
        } else if (sqlTypeString.equals("DATE")) {
            return Types.DATE;
        } else if (sqlTypeString.equals("DECIMAL")) {
            return Types.DECIMAL;
        } else if (sqlTypeString.equals("DISTINCT")) {
            return Types.DISTINCT;
        } else if (sqlTypeString.equals("DOUBLE")) {
            return Types.DOUBLE;
        } else if (sqlTypeString.equals("FLOAT")) {
            return Types.FLOAT;
        } else if (sqlTypeString.equals("INTEGER")) {
            return Types.INTEGER;
        } else if (sqlTypeString.equals("JAVA_OBJECT")) {
            return Types.JAVA_OBJECT;
        } else if (sqlTypeString.equals("LONGNVARCHAR")) {
            return Types.LONGNVARCHAR;
        } else if (sqlTypeString.equals("LONGVARBINARY")) {
            return Types.LONGVARBINARY;
        } else if (sqlTypeString.equals("LONGVARCHAR")) {
            return Types.LONGVARCHAR;
        } else if (sqlTypeString.equals("NCHAR")) {
            return Types.NCHAR;
        } else if (sqlTypeString.equals("NCLOB")) {
            return Types.NCLOB;
        } else if (sqlTypeString.equals("NULL")) {
            return Types.NULL;
        } else if (sqlTypeString.equals("NUMERIC")) {
            return Types.NUMERIC;
        } else if (sqlTypeString.equals("NVARCHAR")) {
            return Types.NVARCHAR;
        } else if (sqlTypeString.equals("OTHER")) {
            return Types.OTHER;
        } else if (sqlTypeString.equals("REAL")) {
            return Types.REAL;
        } else if (sqlTypeString.equals("REF")) {
            return Types.REF;
        } else if (sqlTypeString.equals("ROWID")) {
            return Types.ROWID;
        } else if (sqlTypeString.equals("SMALLINT")) {
            return Types.SMALLINT;
        } else if (sqlTypeString.equals("SQLXML")) {
            return Types.SQLXML;
        } else if (sqlTypeString.equals("STRUCT")) {
            return Types.STRUCT;
        } else if (sqlTypeString.equals("TIME")) {
            return Types.TIME;
        } else if (sqlTypeString.equals("TIMESTAMP")) {
            return Types.TIMESTAMP;
        } else if (sqlTypeString.equals("TINYINT")) {
            return Types.TINYINT;
        } else if (sqlTypeString.equals("VARBINARY")) {
            return Types.VARBINARY;
        } else if (sqlTypeString.equals("VARCHAR")) {
            return Types.ARRAY;
        } else {
            return Types.OTHER;
        }
    }

    /**
     * Method to return the java type of a SQL type; this method only converts types used in CEP Mediation
     * @param sqlType The SQL type value
     * @return The java type of the SQL type
     */
    public static String typeSqlToJava(final int sqlType) {
        JavaType javaType = getJavaType(sqlType);
        if (javaType == null) {
            // Unknown parameters are returned as null
            return "null";
        }
        return javaType.getJavaType();
    }

    public static JavaType getJavaType(final int sqlType) {
        return sqlToJavaTypes.get(sqlType);

    }

    public static Map<Integer, JavaType> getSqlToJavaTypesMap() {
        return sqlToJavaTypes;
    }

    static {
        sqlToJavaTypes.put(Types.CLOB, JavaType.String);
        sqlToJavaTypes.put(Types.TINYINT, JavaType.BYTE);
        sqlToJavaTypes.put(Types.SMALLINT, JavaType.SHORT);
        sqlToJavaTypes.put(Types.INTEGER, JavaType.INT);
        sqlToJavaTypes.put(Types.BIGINT, JavaType.LONG);
        sqlToJavaTypes.put(Types.BINARY, JavaType.BYTE_ARRAY); // Binary parameters are stored in byte arrays
        sqlToJavaTypes.put(Types.TIMESTAMP, JavaType.LONG); // Time stamp types are stored as long values 
        sqlToJavaTypes.put(Types.DATE, JavaType.LONG); // Date types are stored as long values 
        sqlToJavaTypes.put(Types.BOOLEAN, JavaType.BOOLEAN);
        sqlToJavaTypes.put(Types.FLOAT, JavaType.FLOAT);
        sqlToJavaTypes.put(Types.DOUBLE, JavaType.DOUBLE);

    }
}
