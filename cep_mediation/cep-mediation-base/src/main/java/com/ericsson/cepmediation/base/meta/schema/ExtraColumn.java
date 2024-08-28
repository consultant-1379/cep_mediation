package com.ericsson.cepmediation.base.meta.schema;

import java.util.Comparator;

import org.jdom.Element;

import com.ericsson.cepmediation.base.util.TypeConversion;

/**
 * This class is used to hold a single extra column definition. Extra columns are used as place
 * holders to allow the parser to insert information like time stamps and NE names on events.
 * 
 * @author eeilfn
 */
public class ExtraColumn implements Comparable<ExtraColumn>, Comparator<ExtraColumn> {
    // Member data, read from the XML files
    private String name = ""; //NOPMD eemecoy 9/4/2012 want default value

    // The java.sql.type of this column
    private int sqlType = -1; //NOPMD eemecoy 9/4/2012 want default value

    /**
     * Instantiate an extra column as an object
     * 
     * @param extraColumn The extra column XML element
     * @throws SchemaException 
     */
    protected ExtraColumn(final Element extraColumn) throws SchemaException {
        try {
            // Read the column name from the element
            name = extraColumn.getText().trim();

            // Read the column type from the column element
            sqlType = TypeConversion.typeStringToSql(extraColumn.getAttributeValue("type").trim());
        } catch (final Exception e) {
            // Return a sensible exception to the caller
            throw new SchemaException("Error parsing event schema element [" + extraColumn.getName() + "=" + name
                    + "] " + e);
        }
    }

    /**
     * Get the name of the extra column
     * @return The extra column name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the extra column SQl type
     * @return the extra column SQL type
     */
    public int getSqlType() {
        return sqlType;
    }

    /**
     * Method to dump the extra column to a string
     * 
     * @return string containing the parameter
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();

        // Add the fields to the buffer
        builder.append(name);

        // return the string
        return builder.toString();
    }

    /**
     * Compare this event to another event, comparison based on name
     * 
     * @param comparedEvent
     * @return the comparison value
     */
    @Override
    public int compareTo(final ExtraColumn comparedEvent) {
        return name.compareTo(comparedEvent.name);
    }

    /**
     * Compare this event to another event, comparison based on name
     * 
     * @param comparedEvent
     * @return the comparison value
     */
    @Override
    public int compare(final ExtraColumn firstExtraColumn, final ExtraColumn secondExtraColumn) {
        return firstExtraColumn.compareTo(secondExtraColumn);
    }

    /**
     * Override the equals method for hash maps of extra columns
     */
    @Override
    public boolean equals(final Object other) {
        // Check the object type
        if (other instanceof ExtraColumn) {
            // Cast and compare the extra column names
            final ExtraColumn otherExtraColumn = (ExtraColumn) other;
            return name.equals(otherExtraColumn.getName());
        }
        return false;

    }

    /**
     * Override the hashCode hash maps of extra columns
     * @return The hash code of the extra column name
     */
    @Override
    public int hashCode() {
        // The hash code is the name hash code
        return name.hashCode();
    }
}
