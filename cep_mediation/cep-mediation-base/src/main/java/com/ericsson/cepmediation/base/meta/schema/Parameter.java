package com.ericsson.cepmediation.base.meta.schema;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import org.jdom.Element;
import org.jdom.Namespace;

import com.ericsson.cepmediation.base.util.TypeConversion;

/**
 * This class is used to hold a single Parameter
 * 
 * @author eeilfn
 */
public class Parameter implements Comparable<Parameter>, Comparator<Parameter> {
    // The maximum variable bit packed parameter length is 4096 bytes (Defined by 3GPP for messages)
    private static final int MAX_VARIABLE_BITPACKED_PARAMETER_LENGTH = 4096;

    // Member data, read from the XML file
    private String name = ""; //NOPMD eemecoy 9/4/2012 want default value

    private String type;

    private String description;

    private final boolean bitPacked;

    private int numberOfBytes; // The unpacked size, or minimum size in the case of variable length parameters, of this parameter

    private int numberOfBits; // The packed size of this parameter

    private boolean variableLength = false; // true if the parameter is of variable length  //NOPMD eemecoy 4/5/2012 bug in pmd, this can't be final

    private boolean useValid = false; // Indicates if a validation bit precedes this parameter, if the bit is zero, the parameter is valid  //NOPMD eemecoy 4/5/2012 bug in pmd, this can't be final

    private final long[] range = new long[2]; // Two longs, low and high values        

    private int resolution; // Possibly the increments that the parameter uses

    private String unit; // The units the parameter is in

    private String detailedDescription;

    private String comment;

    private boolean signed = false;//NOPMD eemecoy 4/5/2012 bug in pmd, this can't be final

    // ENUM types instantiate a parameterEnum object that holds the values of the ENUM
    private HashMap<Integer, String> enumMap = null;

    private int javaTypeByteSize = -1;

    /**
     * Instantiate a parameter as an object
     * @param the parameter element to read
     * @param namespace The parameter namespace
     * @param paramPreamble The preamble string on parameter names that is to be replaced
     * @param valuePreamble The preamble string on ENUM value names that is to be replaced
     * @throws SchemaException 
     */
    protected Parameter(final Element parameter, final Namespace namespace, final String paramPreamble,
            final String valuePreamble) throws SchemaException {
        try {
            // Instantiate mandatory data from the XML element
            name = parameter.getChild("name", namespace).getText().trim().replaceFirst(paramPreamble, "");
            type = parameter.getChild("type", namespace).getText().trim();

            // check if parameter is signed
            final Element signedElem = parameter.getChild("signed", namespace);
            if (signedElem != null) {
                signed = "Yes".equals(signedElem.getText().trim());
            }

            description = parameter.getChild("description", namespace).getText().trim().replaceAll("'", "");

            // Ensure that the name does not have a number as its first character
            if (Character.isDigit(name.charAt(0))) {
                name = "P_" + name;
            }

            // DNSNAME and BYTEARRAY parameters are variable length
            if (type.equals("DNSNAME") || type.equals("BYTEARRAY")) {
                // These parameters only occur in bit packed parameters
                bitPacked = true;
                variableLength = true;

                // Get the size
                numberOfBits = Integer.valueOf(parameter.getChild("lengthbits", namespace).getText().trim());

                // The maximum number of bytes is the 
                numberOfBytes = Integer.valueOf(parameter.getChild("validlength", namespace)
                        .getChild("high", namespace).getText().trim());
                javaTypeByteSize = numberOfBytes;
            } else {
                // Check if the parameter is bit packed
                if (parameter.getChild("numberofbytes", namespace) != null) {
                    // The parameter is not bit packed, get its size
                    bitPacked = false;
                    numberOfBytes = Integer.valueOf(parameter.getChild("numberofbytes", namespace).getText().trim());

                    javaTypeByteSize = numberOfBytes;

                    // For byte packed parameters, a size of -1 is a variable length parameter
                    // Convert the byte count to bit count
                    if (numberOfBytes == -1) {
                        variableLength = true;
                        numberOfBits = -1;
                    } else {
                        numberOfBits = numberOfBytes * 8;
                    }
                } else {
                    // The parameter is bit packed
                    bitPacked = true;
                    numberOfBits = Integer.valueOf(parameter.getChild("numberofbits", namespace).getText().trim());

                    // Check for variable length bit packed fields
                    if (numberOfBits == -1) {
                        variableLength = true;
                        numberOfBytes = MAX_VARIABLE_BITPACKED_PARAMETER_LENGTH;
                        javaTypeByteSize = numberOfBytes;
                    } else {
                        numberOfBytes = (numberOfBits - 1) / 8 + 1;
                        if (numberOfBits <= 7) {
                            javaTypeByteSize = 1;
                        } else if (numberOfBits <= 15) {
                            javaTypeByteSize = 2;
                        } else if (numberOfBits <= 31) {
                            javaTypeByteSize = 4;
                        } else {
                            javaTypeByteSize = numberOfBytes;
                        }
                    }
                }
            }

            // Check if range is specified
            if (parameter.getChild("range", namespace) != null) {
                range[0] = Long.valueOf(parameter.getChild("range", namespace).getChild("low", namespace).getText()
                        .trim());
                range[1] = Long.valueOf(parameter.getChild("range", namespace).getChild("high", namespace).getText()
                        .trim());
            }
            // Range is mandatory on UINT types
            else if (type.equals("UINT")) {
                // Set the range for the UINT type
                range[0] = 0;
                range[1] = (long) Math.pow(2, numberOfBits) - 1;
            }

            // enumeration is mandatory on ENUM types
            if (type.equals("ENUM")) {
                toEnum(parameter.getChild("enumeration", namespace), valuePreamble);
            }

            // Instantiate optional elements
            if (parameter.getChild("usevalid", namespace) != null) {
                // Get the usevalid string
                final String useValidString = parameter.getChild("usevalid", namespace).getText().trim();

                // Check for all types of affirmative answers
                if (useValidString.equalsIgnoreCase("yes") || useValidString.equalsIgnoreCase("true")) {
                    useValid = true;
                } else {
                    useValid = false;
                }
            }

            if (parameter.getChild("resolution", namespace) != null) {
                resolution = Integer.valueOf(parameter.getChild("resolution", namespace).getText().trim());
            }

            if (parameter.getChild("unit", namespace) != null) {
                unit = parameter.getChild("unit", namespace).getText().trim();
            }

            if (parameter.getChild("comment", namespace) != null) {
                comment = parameter.getChild("comment", namespace).getText().trim().replaceAll("'", "");
            }

            if (parameter.getChild("detaileddescription", namespace) != null) {
                comment = parameter.getChild("detaileddescription", namespace).getText().trim().replaceAll("'", "");
            }
        } catch (final Exception e) {
            // Return a sensible exception to the caller
            throw new SchemaException("Error parsing event schema element [" + parameter.getName() + "=" + name + "] "
                    + e);
        }
    }

    /**
     * Set an MAP for this parameter
     * 
     * @param enumParameter The ENUM XML element
     * @param valuePreamble The preamble string on ENUM value names that is to be replaced
     * @throws SchemaException 
     */
    private void toEnum(final Element enumParameter, final String valuePreamble) throws SchemaException {
        // Instantiate the ENUM hash map
        enumMap = new HashMap<Integer, String>();

        // Get the enumeration values as a list
        @SuppressWarnings("unchecked")
        final List<Element> enumValues = enumParameter.getChildren();

        // Iterate over the list and store each enum value as a name-value pair
        for (final Element enumValue : enumValues) {
            final String internalName = enumValue.getAttributeValue("internal").replaceFirst(valuePreamble, "").trim();
            final int value = Integer.valueOf(enumValue.getAttributeValue("value").trim());

            // Add the value to the ENUM map
            enumMap.put(value, internalName);
        }
    }

    /**
     * Get the name of a parameter
     * @return The parameter name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the type of a parameter
     * @return The parameter type
     */
    public String getType() {
        return type;
    }

    /**
     * Determines if the parameter is signed.
     * @return true if the parameter is signed
     */
    public boolean isSigned() {
        return signed;
    }

    /**
     * Get the SQL type of a parameter
     * @return The SQL parameter type
     */
    public int getSqlType() {
        return TypeConversion.typeEventParameter2Sql(type, javaTypeByteSize);
    }

    /**
     * Get the description of the parameter
     * @return the parameter description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Determine if this parameter is bit packed
     * @return true if the parameter is bit packed
     */
    public boolean isBitPacked() {
        return bitPacked;
    }

    /**
     * Get the number of bytes of the parameter
     * The byte count of the unpacked parameter or minimum byte count for variable length parameters
     * @return the number of bytes in the parameter
     */
    public int getNumberOfBytes() {
        return numberOfBytes;
    }

    /**
     * Get the number of bits of the parameter, the actual packed size of the parameter
     * The bit count of the packed parameter or minimum bit count for variable length parameters
     * @return the number of bits in the parameter
     */
    public int getNumberOfBits() {
        return numberOfBits;
    }

    /**
     * Return if this parameter is of variable length
     * @return true if this parameter is of variable length
     */
    public boolean isVariableLength() {
        return variableLength;
    }

    /**
     * Return if use of this parameter is valid
     * @return true if the use of this parameter is valid
     */
    public boolean isUseValid() {
        return useValid;
    }

    /**
     * Get the range of values this parameter can have
     * @return an array with two values for the low and high range values
     */
    public long[] getRange() {
        return range;
    }

    /**
     * Get the resolution of this parameter
     * @return the resolution
     */
    public int getResolution() {
        return resolution;
    }

    /**
     * Get the units in which this parameter is expressed
     * @return The units in which the parameter is expressed
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Get the detailed description of this parameter
     * @return detailed description of the parameter
     */
    public String getDetailedDescription() {
        return detailedDescription;
    }

    /**
     * Get any comments made on this parameter
     * @return comments on the parameter
     */
    public String getComment() {
        return comment;
    }

    /**
     * Get the ENUM values for a parameter
     * @return the ENUM values
     */
    public HashMap<Integer, String> getEnumMap() {
        return enumMap;
    }

    /**
     * Method to dump the parameter to a string
     * 
     * @return string containing the parameter
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();

        // Add the fields to the buffer
        builder.append(name);
        builder.append(",");
        builder.append(bitPacked);
        builder.append(",");
        builder.append(numberOfBytes);
        builder.append(",");
        builder.append(numberOfBits);
        builder.append(",");
        builder.append(variableLength);
        builder.append(",");
        builder.append(useValid);
        builder.append(",");
        builder.append(type.toString());
        builder.append(",[");
        builder.append(range[0]);
        builder.append("-");
        builder.append(range[1]);
        builder.append("]");
        builder.append(",");
        builder.append(resolution);
        builder.append(",");
        builder.append(unit);

        if (type.equals("ENUM")) {
            builder.append("[");
            boolean firstLoop = true;
            for (final Integer enumValue : enumMap.keySet()) {
                builder.append(firstLoop ? "" : ",");
                builder.append(enumValue);
                builder.append(":");
                builder.append(enumMap.get(enumValue));
                firstLoop = false;
            }
            builder.append("]");
        }
        builder.append(",");
        builder.append(description);
        builder.append(",");
        builder.append(detailedDescription);
        builder.append(",");
        builder.append(comment);

        // return the string
        return builder.toString();
    }

    /**
     * Compare this parameter to another parameter, comparison based on name
     * 
     * @param comparedParameter
     * @return the comparison value
     */
    @Override
    public int compareTo(final Parameter comparedParameter) {
        return name.compareTo(comparedParameter.name);
    }

    /**
     * Compare this parameter to another parameter, comparison based on name
     * 
     * @param firstParameter
     * @param secondParameter
     * @return the comparison value
     */
    @Override
    public int compare(final Parameter firstParameter, final Parameter secondParameter) {
        return firstParameter.compareTo(secondParameter);
    }

    /**
     * Override the equals method for hash maps of parameters
     */
    @Override
    public boolean equals(final Object other) {
        // Check the object type
        if (other instanceof Parameter) {
            // Cast and compare the parameter names
            final Parameter otherParameter = (Parameter) other;
            return name.equals(otherParameter.getName());
        } else {
            return false;
        }
    }

    /**
     * Override the hashCode hash maps of parameters
     * @return The hash code of the parameter name
     */
    @Override
    public int hashCode() {
        // The hash code is the name hash code
        return name.hashCode();
    }
}
