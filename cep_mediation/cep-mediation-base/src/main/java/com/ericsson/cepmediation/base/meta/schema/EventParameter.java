package com.ericsson.cepmediation.base.meta.schema;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.jdom.DataConversionException;
import org.jdom.Element;

/**
 * This class holds information on a specific parameter on an event. An event can have more than one
 * instance of a particular parameter type so this class holds those instances. It also holds
 * mapping information for parameters to table columns.
 * 
 * @author eeilfn
 */
public class EventParameter implements Comparable<EventParameter>, Comparator<EventParameter> {
    // Constant to indicate a value is not set
    public static final int NOT_SET = -1;

    // The unique name of this parameter in an event
    private String name = "";

    // The definition of the parameter from the event definition XML file
    private final Parameter parameter;

    // The type and size of the table column this parameter is stored in,
    // copied from the Parameter instance for efficiency
    private final String type;

    private final int sqlType;

    private int numberOfBytes;

    private final int numberOfBits; // Used for unpacking bit packed events

    private final boolean variableLength;

    // Flags read from the struct and param XML tags
    private boolean useValid = false; // True if this parameter is preceded by a validation field (1 bit in bit packed parameters)

    private boolean optional = false; // True if this parameter is optional, preceded by an optional field (1 bit in bit packed parameters)

    private boolean ignored = false; // True if this parameter is to be ignored in CEP Mediation

    // Member data for struct arrays, if a seqmaxlen attribute appears on a parameter, it is an array
    // If a parameter is in an array, the first parameter is preceded by a 1 byte field indicating the actual size of the array
    // That field must be read in decoding to find the actual amount of array elements in the decoded file
    // Parameter array elements not in the event are not read and pick up default values
    private boolean structArray = false;

    private int maxStructArraySize = 0;

    private boolean structFirstParameter = false;

    private boolean structLastParameter = false;

    private final boolean signed;

    // Member data set from the XML file

    /**
     * Constructor, create the parameter from the parameter definition of the parameter
     * @param parameter
     * @param useValid True if this parameter is valid to use
     * @param optional True if this parameter is optional
     * @param ignore True if this parameter is to be ignored
     */
    private EventParameter(final Parameter parameter) {
        // Save member data
        this.parameter = parameter;

        // Set data from the parameter type
        this.name = parameter.getName();
        this.type = parameter.getType();
        this.signed = parameter.isSigned();
        this.sqlType = parameter.getSqlType();
        this.numberOfBytes = parameter.getNumberOfBytes();
        this.numberOfBits = parameter.getNumberOfBits();
        this.variableLength = parameter.isVariableLength();
        this.useValid = parameter.isUseValid();
    }

    /**
     * This method returns a list of parameters from a list of XML elements containing struct and param elements
     * @param handler A SchemaHandler used to look up parameters 
     * @param children The list of XML elements
     * @throws SchemaException 
     * @throws DataConversionException 
     */
    protected static List<EventParameter> getParameters(final SchemaComponentHandler handler,
            final List<Element> children) throws DataConversionException, SchemaException {
        // Instantiate an array list to hold found parameters
        final List<EventParameter> parameterList = new ArrayList<EventParameter>();

        // Iterate over the children on the XML element list
        for (final Element child : children) {
            // We are only interested in param and struct children
            boolean containsIgnored = false;
            if (child.getName().equals("param")) {
                // A single parameter, add it to the list
                final EventParameter param = getSingleParameter(handler, child);
                if (containsIgnored) {
                    if (!param.isIgnored()) {
                        throw new IllegalStateException(
                                "Alternating mandatory and ignore parameters in event definition for param: "
                                        + param.getName()
                                        + " All params after ignore param should also be ignore=true!");
                    }
                } else {
                    if (param.isIgnored()) {
                        containsIgnored = true;
                    } else {
                        parameterList.add(param);
                    }
                }
            } else if (child.getName().equals("struct")) {
                // A structure containing parameters and possibly other structs, add the list in the struct to the parameter list
                parameterList.addAll(getStructParameters(handler, child));
            }
        }

        // Return the parameter list
        return parameterList;
    }

    protected static List<EventParameter> getIgnoredParameters(final SchemaComponentHandler handler,
            final List<Element> children) throws DataConversionException, SchemaException {
        final List<EventParameter> parameterList = new ArrayList<EventParameter>();
        for (final Element child : children) {
            if (child.getName().equals("param")) {
                final EventParameter param = getSingleParameter(handler, child);
                if (param.isIgnored()) {
                    parameterList.add(param);
                }
            }
        }

        return parameterList;
    }

    /**
     * This method creates a new parameter type object from a param XML element in the event schema file
     * 
     * @param handler A schemahandler to look up parameter types
     * @param paramElement The struct XML element
     * @return returns a list of EventParam objects describing the structure instance
     * @throws SchemaException
     * @throws DataConversionException
     */
    private static List<EventParameter> getStructParameters(final SchemaComponentHandler handler,
            final Element structElement) throws SchemaException, DataConversionException {
        // The structure type is always explicitly specified in the struct element
        final String structureType = structElement.getAttribute("type").getValue();

        // Set the structure name as being the same as the structure type
        String structureName = structureType;

        // Overwrite the structure name if it is explicitly set
        if (structElement.getText() != null && structElement.getText().trim().length() > 0) {
            structureName = structElement.getText().trim();
        }

        // Get the structure definition for this structure
        final Structure structure = handler.getSchema().getStructureHandler().getMap().get(structureType);

        // Check if the structure was found
        if (structure == null) {
            throw new SchemaException("Unknown structure \"" + structureType + "\" specified on event");
        }

        // Check if a sequence/array is specified on this parameters
        boolean structArray = false;
        int maxStructArraySize = 0;
        if (structElement.getAttribute("seqmaxlen") != null) {
            // A sequence has been specified, set the flags and get max number of possible sequences
            structArray = true;
            maxStructArraySize = structElement.getAttribute("seqmaxlen").getIntValue();
        }

        // Find if the ignore flag is specified and if it is specified, should the structure be ignored
        boolean ignoreFlag = false;
        if (structElement.getAttribute("ignore") != null) {
            ignoreFlag = structElement.getAttribute("ignore").getBooleanValue();
        }

        // We need to clone the structure event parameter objects
        final List<EventParameter> structureParameterList = new ArrayList<EventParameter>(structure.getParameterList()
                .size());

        // Get the parameter list from the structure and set structure-wide values on the parameter
        final List<EventParameter> structParameterList = structure.getParameterList();

        for (int i = 0; i < structParameterList.size(); i++) {
            // Get the event parameter
            // Clone the event parameter object
            final EventParameter newEventParameter = new EventParameter(structParameterList.get(i).parameter);

            // Append the structure name to the parameter name
            newEventParameter.name = structureName + '_' + structParameterList.get(i).name;

            // Set the parameter flags from the structure parameter values
            newEventParameter.useValid = structParameterList.get(i).useValid;
            newEventParameter.optional = structParameterList.get(i).optional;
            newEventParameter.ignored = structParameterList.get(i).ignored;

            // Set the array characteristics of the parameter
            newEventParameter.structArray = structArray;
            newEventParameter.maxStructArraySize = maxStructArraySize;

            // Set the ignore flag on the parameter to the value on the struct if it is not already set to true
            if (!newEventParameter.ignored) {
                newEventParameter.ignored = ignoreFlag;
            }

            // Set the first struct parameter flag
            if (i == 0) {
                newEventParameter.structFirstParameter = true;
            }

            // Set the last struct parameter flag
            if (i == structParameterList.size() - 1) {
                newEventParameter.structLastParameter = true;
            }

            // Add the cloned parameter to the structure parameter list
            structureParameterList.add(newEventParameter);
        }

        // Return the parameter list for the structure
        return structureParameterList;
    }

    /**
     * This method creates a new parameter type object from a param XML element in the event schema file
     * 
     * @param handler A schemahandler to look up parameter types
     * @param paramElement The param XML element
     * @return returns an EventParam object describing the parameter instance
     * @throws SchemaException
     * @throws DataConversionException
     */
    private static EventParameter getSingleParameter(final SchemaComponentHandler handler, final Element paramElement)
            throws SchemaException, DataConversionException {
        // Get the parameter preamble
        final String paramPreamble = handler.getSchema().getSchemaTypeHandler().getParamPreamble();

        // Get the parameter name and remove the preamble if it exists
        String parameterName = paramElement.getText().trim().replaceFirst(paramPreamble, "");

        // Ensure that the name does not have a number as its first character
        if (Character.isDigit(parameterName.charAt(0))) {
            parameterName = "P_" + parameterName;
        }

        // Default the parameter type to the parameter name
        String parameterType = parameterName;

        // Check if the parameter type is explicitly specified
        if (paramElement.getAttribute("type") != null) {
            // Explicit specification of parameter type
            parameterType = paramElement.getAttribute("type").getValue().trim();
        }

        // Get the parameter definition for this parameter
        final Parameter parameter = handler.getSchema().getParameterHandler().getMap().get(parameterType);

        // Check if the parameter was found
        if (parameter == null) {
            throw new SchemaException("Unknown parameter \"" + parameterType + "\" specified on event");
        }

        // Find if the useValid flag is specified and if it is specified, is use of the parameter valid
        // If it is not specified, use the  usevalid value from the parameter type
        boolean useValidFlag = parameter.isUseValid();
        if (paramElement.getAttribute("usevalid") != null) {
            useValidFlag = paramElement.getAttribute("usevalid").getBooleanValue();
        }

        // Find if the optional flag is specified and if it is specified, is the parameter optional
        boolean optionalFlag = false;
        if (paramElement.getAttribute("optional") != null) {
            optionalFlag = paramElement.getAttribute("optional").getBooleanValue();
        }

        // Find if the ignore flag is specified and if it is specified, should the parameter be ignored
        boolean ignoreFlag = false;
        if (paramElement.getAttribute("ignore") != null) {
            ignoreFlag = paramElement.getAttribute("ignore").getBooleanValue();
        }

        // Construct a new event parameter
        final EventParameter newEventParameter = new EventParameter(parameter);

        // Set the event parameter flags and values that differ from the parameter type definition
        newEventParameter.name = parameterName;
        newEventParameter.useValid = useValidFlag;
        newEventParameter.optional = optionalFlag;
        newEventParameter.ignored = ignoreFlag;

        // Return the new event parameter
        return newEventParameter;
    }

    /**
     * Get the name of the parameter
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the definition of this parameter
     * @return the definition of the parameter
     */
    public Parameter getParameter() {
        return parameter;
    }

    /**
     * Return the SQL type for this parameter
     * @return the SQL type
     */
    public int getSqlType() {
        return sqlType;
    }

    /**
     * Return the type for this parameter
     * @return the type
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
     * Return the number of bytes used by this parameter
     * @return the size (or minimum size if variable length) of this parameter in bytes
     */
    public int getNumberOfBytes() {
        return numberOfBytes;
    }

    /**
     * Set the number of bytes in this parameter, used on variable length parameters
     * @param numberOfBytes
     */
    public void setNumberOfBytes(final int numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
    }

    /**
     * Return the number of bits used by this parameter if it is bit packed
     * @return the size (or minimum size if variable length) of this parameter packed in bits
     */
    public int getNumberOfBits() {
        return numberOfBits;
    }

    /**
     * Return if use of this parameter is valid
     * @return true if the use of this parameter is valid
     */
    public boolean isUseValid() {
        return useValid;
    }

    /**
     * Return if this parameter is of variable length
     * @return true if the parameter is variable length
     */
    public boolean isVariableLength() {
        return variableLength;
    }

    /**
     * Return if use of this parameter is optional
     * @return true if the use of this parameter is optional
     */
    public boolean isOptional() {
        return optional;
    }

    /**
     * returns true if this parameter is to be ignored
     * @return true if this parameter is to be ignored
     */
    public boolean isIgnored() {
        return ignored;
    }

    /**
     * Return if this parameter is a structure array parameter
     * @return true if the parameter is an array parameter
     */
    public boolean isStructArray() {
        return structArray;
    }

    /**
     * Return true if this parameter is the first parameter in a structure
     * @return true if this parameter is the first parameter in a structure
     */
    public boolean isStructFirstParameter() {
        return structFirstParameter;
    }

    /**
     * Return true if this parameter is the last parameter in a structure
     * @return true if this parameter is the last parameter in a structure
     */
    public boolean isStructLastParameter() {
        return structLastParameter;
    }

    /**
     * Return the maximum number of elements in the array if this parameter is a structure array parameter
     * @return The maximum number of elements
     */
    public int getMaxStructArraySize() {
        return maxStructArraySize;
    }

    /**
     * Set the name of the parameter, used to eliminate duplicate parameter names on an event
     * and to prefix parameters with struct names
     * @param name The parameter name
     */
    protected void setName(final String name) {
        this.name = name;
    }

    /**
     * Set the flag indicating this parameter should be ignored
     * @param ignored true if the parameter is to be ignored
     */
    public void setIgnored(final boolean ignored) {
        this.ignored = ignored;
    }

    /**
     * Returns a string representation of this object
     */
    @Override
    public String toString() {
        return "EventParameter [name=" + name + ", parameter=" + parameter + ", type=" + type + ", sqlType=" + sqlType
                + ", numberOfBytes=" + numberOfBytes + ", numberOfBits=" + numberOfBits + ", variableLength="
                + variableLength + ", useValid=" + useValid + ", optional=" + optional + ", ignored=" + ignored
                + ", structArray=" + structArray + ", structFirstParameter=" + structFirstParameter
                + ", structLastParameter=" + structLastParameter + ", maxStructArraySize=" + maxStructArraySize + "]";
    }

    /**
     * Compare this parameter to another parameter, comparison based on name
     * 
     * @param comparedEventParameter
     * @return the comparison value
     */
    @Override
    public int compareTo(final EventParameter comparedEventParameter) {
        return name.compareTo(comparedEventParameter.name);
    }

    /**
     * Compare two parameters, comparison based on name
     * 
     * @param firstParameter the first parameter
     * @param secondParameter the second parameter
     * @return the comparison value
     */
    @Override
    public int compare(final EventParameter firstParameter, final EventParameter secondParameter) {
        return firstParameter.compareTo(secondParameter);
    }

    /**
     * Override the equals method for hash maps of event parameters
     */
    @Override
    public boolean equals(final Object other) {
        // Check the object type
        if (other instanceof EventParameter) {
            // Cast and compare the event parameter names
            final EventParameter otherEventParameter = (EventParameter) other;
            return name.equals(otherEventParameter.getName());
        } else {
            return false;
        }
    }

    /**
     * Override the hashCode hash maps of event parameters
     * @return The hash code of the event parameter name
     */
    @Override
    public int hashCode() {
        // The hash code is the name hash code
        return name.hashCode();
    }
}
