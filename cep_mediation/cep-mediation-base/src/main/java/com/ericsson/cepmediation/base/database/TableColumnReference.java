package com.ericsson.cepmediation.base.database;

/**
 * This class describes a reference from a column in a table to another column in another table
 * 
 * @author eeilfn 
 */
public class TableColumnReference {
    // The column reference attributes
    private final String referencedSchema;

    private final String referencedTable;

    private final String referencedColumn;

    /**
     * Constructor that builds the reference
     * 
     * @param schema the referenced schema
     * @param referencedTable the referenced table
     * @param referencedColumn the referenced column
     */
    public TableColumnReference(final String schema, final String referencedTable, final String referencedColumn) {
        this.referencedSchema = schema;
        this.referencedTable = referencedTable;
        this.referencedColumn = referencedColumn;
    }

    /**
     * Get the schema of the reference
     * @return the schema
     */
    public String getReferencedSchema() {
        return referencedSchema;
    }

    /**
     * Get the table of the reference
     * @return the table
     */
    public String getReferencedTable() {
        return referencedTable;
    }

    /**
     * Get the column of the reference
     * @return the column
     */
    public String getReferencedColumn() {
        return referencedColumn;
    }

    /**
     * Render the reference in SQL format
     */
    public String toSQLFormat() {
        // Create a string builder to hold the SQL format string
        final StringBuilder builder = new StringBuilder();
        builder.append(" REFERENCES ");
        builder.append(referencedSchema);
        builder.append(".");
        builder.append(referencedTable);
        builder.append("(");
        builder.append(referencedColumn);
        builder.append(")");

        return builder.toString();
    }
}
