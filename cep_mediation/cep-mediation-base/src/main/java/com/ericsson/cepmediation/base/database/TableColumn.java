package com.ericsson.cepmediation.base.database;

/**
 * This class describes a column in a table in a database
 * 
 * @author eeilfn 
 */
public class TableColumn {
    // The column attributes
    private final String name;

    private final String type;

    private final boolean isArray;

    private final int maxAraySize;

    /**
     * Define a column on a table
     * 
     * @param name The column name
     * @param type The column type
     * @param isArray True if the table column is an array
     * @param maxArraySize The maximum size of the array
     */
    public TableColumn(final String name, final String type, final boolean isArray, final int maxArraySize) {
        // Save the column data
        this.name = name;
        this.type = type;
        this.isArray = isArray;
        this.maxAraySize = maxArraySize;
    }

    /**
     * Getter for Name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the type of the column
     * 
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Find out if this table column is an array
     * @return true if the table column is an array
     */
    protected boolean isArray() {
        return isArray;
    }

    /**
     * Get the maximum size of a table column array
     * @return the maximum array size
     */
    protected int getMaxAraySize() {
        return maxAraySize;
    }
}
