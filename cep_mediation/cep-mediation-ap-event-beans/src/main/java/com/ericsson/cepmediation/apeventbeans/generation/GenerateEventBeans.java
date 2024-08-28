package com.ericsson.cepmediation.apeventbeans.generation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Types;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;
import com.ericsson.cepmediation.base.meta.admin.MappedEvent;
import com.ericsson.cepmediation.base.meta.admin.SchemaHandler;
import com.ericsson.cepmediation.base.meta.admin.SchemaTypeHandler;
import com.ericsson.cepmediation.base.meta.schema.Event;
import com.ericsson.cepmediation.base.meta.schema.EventParameter;
import com.ericsson.cepmediation.base.meta.schema.Schema;
import com.ericsson.cepmediation.base.meta.schema.SchemaException;
import com.ericsson.cepmediation.base.meta.schema.extension.EnrichedEvent;
import com.ericsson.cepmediation.base.resourceloading.ResourceFileFinder;
import com.ericsson.cepmediation.base.resourceloading.ResourceLoadingFailedException;
import com.ericsson.cepmediation.base.util.TypeConversion;
import com.ericsson.cepmediation.base.util.Utilities;

/**
 * This class generates a java package for each schema and a java class for each event.
 * 
 * @author eeilfn
 */
public abstract class GenerateEventBeans {
    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(GenerateEventBeans.class);

    // Set the package prefix for generation of classes
    private static final String EVENT_BEAN_PACKAGE = "com.ericsson.cepmediation.apeventbeans";

    /**
     * This method generates the schema packages and event classes
     * 
     * @param Command line arguments
     * @throws SchemaException 
     * @throws IOException 
     * @throws ResourceLoadingFailedException 
     */
    public static void main(final String[] args) throws IOException, SchemaException, ResourceLoadingFailedException {

        // Check the arguments
        if (args.length != 2) {
            logger.error("usage: GenerateEventBeans <directory name> <root path>");
            System.exit(1);
        }
        // Declare variables to hold the arguments
        final String fileDirName = args[0];
        final String rootPath = args[1];
        System.setProperty("root.path", rootPath);

        if (!checkThatFileDirIsOK(fileDirName)) {
            System.exit(1);
        }

        // Define the directory for the event class package
        final File eventBeanPackageDir = defineDirectoryForEventClassPackage(fileDirName);

        // Initialize the schema handler which loads all schemas
        final SchemaHandler schemaHandler = new SchemaHandler();

        // Iterate over each schema type
        for (final String schemaType : schemaHandler.getSchemaMap().keySet()) {
            // Generate the base package for this schema from the most recent version of the
            // schema, all events received will inherit from events in the mapping package
            final File basePackageDir = new File(eventBeanPackageDir, schemaType);
            basePackageDir.mkdir();

            // Get the Schema Type Handler
            final SchemaTypeHandler schemaTypeHandler = schemaHandler.getSchemaMap().get(schemaType);

            // Get the fields that are common for all events in the schema
            String commonInterfaceName = schemaTypeHandler.getCommonInterfaceName();
            if (commonInterfaceName != null) {
                // Generate the super class for all classes in this schema
                generateSuperJavaClass(basePackageDir, commonInterfaceName, schemaTypeHandler.getCommonInterfaceParams());
            } else {
                commonInterfaceName = ApEventBean.class.getSimpleName();
            }

            // Iterate over each event in the schema type map
            for (final MappedEvent mappedEvent : schemaTypeHandler.getEventMap().values()) {
                // Generate a java class for this event
                generateBaseJavaClass(commonInterfaceName, schemaTypeHandler.getCommonInterfaceParams(), basePackageDir, mappedEvent);
            }

            logger.info("mapping generated for schema type " + schemaType);

            // Now, generate sub classes for all events in all schemas that will populate the events in the
            // base classes
            for (final String schemaName : schemaTypeHandler.getSchemaMap().keySet()) {
                final Schema schema = schemaTypeHandler.getSchemaMap().get(schemaName);

                // Create the schema package
                final File schemaPackageDir = new File(eventBeanPackageDir, schemaName);
                schemaPackageDir.mkdir();

                // Iterate over each event in the schema
                for (final Event event : schema.getEventHandler().getMap().values()) {
                    // Generate a java class for this event
                    generateSubJavaClass(schemaPackageDir, schemaType, event);
                }

                logger.info("event classes generated for schema " + schema.getName());

            }

            final List<EnrichedEvent> enrichedEventList = schemaTypeHandler.getEnrichedEvents();
            for (final EnrichedEvent enrichedEvent : enrichedEventList) {
                generateEnrichedEventJavaClass(basePackageDir, enrichedEvent);
            }
        }
    }

    /**
     * Check that the directory specified is a directory
     * If not, this method tries to create it (and its parent directories if they don't exist)
     * 
     * @param directoryName                     name of directory
     * @return boolean                          true if directory exists, false if directory didn't exist and this 
     *                                          method couldn't create it
     * 
     */
    private static boolean checkThatFileDirIsOK(final String directoryName) {
        final File fileDir = new File(directoryName);
        if (!fileDir.isDirectory()) {
            logger.debug("\"" + directoryName + "\" is not a directory, creating it");
            final boolean result = fileDir.mkdirs();
            if (!result) {
                logger.error("Could not create " + directoryName);
                return false;
            }
        }
        return true;

    }

    private static void generateEnrichedEventJavaClass(final File basePackageDir, final EnrichedEvent enrichedEvent) throws IOException {
        // Create the java class file for the event
        final File eventBeanFile = new File(basePackageDir, enrichedEvent.getName() + ".java");

        // Open the class file
        final PrintWriter classWriter = new PrintWriter(new BufferedWriter(new FileWriter(eventBeanFile)));

        // Open the string template group
        final String baseEventBeanFile = Utilities.getFileResource("StringTemplates/EnrichedEventBean.stg");
        final STGroup group = new STGroupFile(baseEventBeanFile);

        // Get the EventBean string template
        final ST st = group.getInstanceOf("main");
        for (final Map.Entry<String, String> paramName2type : enrichedEvent.getParamName2type().entrySet()) {
            final int sqlType = Integer.parseInt(paramName2type.getValue());
            final String parameterInitValue = getParameterInitValue(sqlType, false);
            final String writeDataMethod = getWriteDataMethod(sqlType, false);
            st.addAggr("parameter.{type, name, initValue, writeDataMethod}", TypeConversion.typeSqlToJava(sqlType), paramName2type.getKey(),
                    parameterInitValue, writeDataMethod);
        }

        // Template the event class main body
        st.add("schemaType", basePackageDir.getName());
        st.addAggr("event.{name, extends}", enrichedEvent.getName(), enrichedEvent.getEnriches());

        classWriter.println(st.render());

        // Close the class writer
        classWriter.close();
    }

    private static void generateSuperJavaClass(final File packageDir, final String commonInterfaceName, final List<EventParameter> commonInterfaceParams)
            throws IOException {
        // Create the java class file for the event
        final File eventBeanFile = new File(packageDir, commonInterfaceName + ".java");

        // Open the class file
        final PrintWriter classWriter = new PrintWriter(new BufferedWriter(new FileWriter(eventBeanFile)));

        // Open the string template group
        final String baseEventBeanFile = Utilities.getFileResource("StringTemplates/SuperEventBean.stg");
        final STGroup group = new STGroupFile(baseEventBeanFile);

        // Get the EventBean string template
        final ST st = group.getInstanceOf("main");

        addParams("field", st, commonInterfaceParams, new StringBuilder());

        // Template the event class main body
        st.add("schemaType", packageDir.getName());
        st.addAggr("event.{name}", commonInterfaceName);

        classWriter.println(st.render());

        // Close the class writer
        classWriter.close();
    }

    private static File defineDirectoryForEventClassPackage(final String fileDirName) {
        final File eventBeanPackageDir = new File(fileDirName + '/' + EVENT_BEAN_PACKAGE.replaceAll("\\.", "/"));
        // If the package directory does not exist, create it
        if (eventBeanPackageDir.exists()) {
            logger.info(eventBeanPackageDir.getAbsolutePath() + " already exists, will be used");
        }

        else {
            eventBeanPackageDir.mkdirs();
            logger.info(eventBeanPackageDir.getAbsolutePath() + " created");
        }
        return eventBeanPackageDir;
    }

    /**
     * Generate a base java class for all events of this type in the schema
     * @param superClassParams the params that are defined in the super class
     * 
     * @param packageDir The directory in which to generate the Java class
     * @param event The event to generate
     * 
     * @throws IOException 
     * @throws ResourceLoadingFailedException 
     */
    private static void generateBaseJavaClass(final String superClassName, final List<EventParameter> superClassParams, final File packageDir,
            final MappedEvent mappedEvent) throws IOException, ResourceLoadingFailedException {
        // Create the java class file for the event
        final File eventBeanFile = new File(packageDir, mappedEvent.getEvent().getName() + ".java");

        logger.trace("Generating: " + eventBeanFile.getPath());

        // Open the class file
        final PrintWriter classWriter = new PrintWriter(new BufferedWriter(new FileWriter(eventBeanFile)));

        // Open the string template group
        final String baseEventBeanFile = getFileResource(getStringTemplateFileName(packageDir.getName(), true));

        final STGroup group = new STGroupFile(baseEventBeanFile);

        // Get the EventBean string template
        final ST st = group.getInstanceOf("main");

        // Flag to indicate if there are any byte arrays in the parameters, if so, we must trigger an
        // extra import for DataConverters in the string template
        final StringBuilder dataConvertersNeeded = new StringBuilder();

        addParams("field", st, mappedEvent.getParameterSet(), dataConvertersNeeded);
        addParams("field", st, mappedEvent.getIgnoredParameterSet(), dataConvertersNeeded);
        addParams("parameter", st, superClassParams, dataConvertersNeeded);
        addParams("parameter", st, mappedEvent.getParameterSet(), dataConvertersNeeded);
        addParams("parameter", st, mappedEvent.getIgnoredParameterSet(), dataConvertersNeeded);

        // Template the event class main body
        st.add("schemaType", packageDir.getName());

        st.addAggr("event.{superClassName, name, dataConvertersNeeded, asn1Parameter}", superClassName, mappedEvent.getEvent().getName(), dataConvertersNeeded,
                getAsn1Parameter(mappedEvent));

        classWriter.println(st.render());
        // Close the class writer
        classWriter.close();

    }

    private static Object getAsn1Parameter(final MappedEvent mappedEvent) {

        String asn1Parameter = "null";

        Collection<EventParameter> parameterSet = mappedEvent.getParameterSet();

        for (final EventParameter parameter : parameterSet) {
            // Check if this is an ASN.1 parameter
            if (parameter.getName().endsWith("MESSAGE_CONTENTS")) {
                asn1Parameter = "get" + parameter.getName() + "()";
                return asn1Parameter;
            }
        }

        parameterSet = mappedEvent.getIgnoredParameterSet();
        for (final EventParameter parameter : parameterSet) {
            // Check if this is an ASN.1 parameter
            if (parameter.getName().endsWith("MESSAGE_CONTENTS")) {
                asn1Parameter = "get" + parameter.getName() + "()";
                return asn1Parameter;
            }
        }
        return asn1Parameter;
    }

    private static void addParams(final String name, final ST st, final Collection<EventParameter> params, final StringBuilder dataConvertersNeeded) {

        // Add the code for each parameter
        for (final EventParameter parameter : params) {
            // Get the java type of the parameter
            String parameterJavaType = TypeConversion.typeSqlToJava(parameter.getSqlType());

            // Get the number of bytes needed for this value
            final int numbBytes = parameter.getNumberOfBytes();

            // Get the initial value of the parameter
            String parameterInitValue = getParameterInitValue(parameter.getSqlType(), parameter.isSigned());

            // Create a holder for array element details
            String[] arrayElements = null;

            // If the parameter is an array, add square brackets to the type
            if (parameter.isStructArray()) {
                parameterJavaType += "[]";

                // Transpose the initial value into an array of those values
                parameterInitValue = getParameterArrayInitValue(parameterInitValue, parameter.getMaxStructArraySize());

                // Create a string array for the array elements
                arrayElements = new String[parameter.getMaxStructArraySize()];

                // Initialise the array elements
                for (int i = 0; i < parameter.getMaxStructArraySize(); i++) {
                    arrayElements[i] = new String(Integer.toString(i));
                }
            }

            // Parameter is not an array, add the parameter to the event class
            st.addAggr(name + ".{type, numbBytes, name, initValue, arrayElements, isByteArray, isTimestamp, isDate, isString, writeDataMethod}",
                    parameterJavaType, numbBytes, parameter.getName(), parameterInitValue, arrayElements,
                    (parameter.getSqlType() == java.sql.Types.BINARY ? "true" : null), (parameter.getSqlType() == java.sql.Types.TIMESTAMP ? "true" : null),
                    (parameter.getSqlType() == java.sql.Types.DATE ? "true" : null), (parameterJavaType.equals("String") ? "true" : null),
                    getWriteDataMethod(parameter.getSqlType(), parameter.isSigned()));

            // Check if there are any byte arrays in this parameter
            if (dataConvertersNeeded.length() == 0 && parameter.getSqlType() == java.sql.Types.BINARY) {
                dataConvertersNeeded.append("true");
            }
        }
    }

    private static String getFileResource(final String fileToSource) throws ResourceLoadingFailedException {
        final String pathToFileResource = new ResourceFileFinder().getFullPathToFileResource(fileToSource);
        final String dodgy = "%5c";
        if (pathToFileResource.contains(dodgy)) {
            return pathToFileResource.replace(dodgy, "/");
        }
        return pathToFileResource;
    }

    /**
     * Generate a java sub class this event in this schema that inherits from the base java class
     * 
     * @param schemaPackageDir The directory in which to generate the Java class
     * @param schemaType The base schema type for this schema
     * @param event The event to generate the mapping for
     * @param 
     * @throws IOException 
     * @throws ResourceLoadingFailedException 
     */
    private static void generateSubJavaClass(final File schemaPackageDir, final String schemaType, final Event event) throws IOException,
            ResourceLoadingFailedException {
        // Create the java class file for the event
        final File eventBeanFile = new File(schemaPackageDir, event.getName() + ".java");

        // Open the class file
        final PrintWriter classWriter = new PrintWriter(new BufferedWriter(new FileWriter(eventBeanFile)));

        // Open the string template group
        final String subEventBeanFile = getFileResource(getStringTemplateFileName(schemaType, false));

        final STGroup group = new STGroupFile(subEventBeanFile);

        // Get the EventBean string template
        final ST st = group.getInstanceOf("main");

        // Template the event class main body
        st.add("schema", schemaPackageDir.getName());
        st.add("schemaType", schemaType);
        st.add("event", event.getName());

        // Add the code for each parameter
        final List<EventParameter> eventParameterList = event.getParameterList();
        for (int par = 0; par < eventParameterList.size(); par++) {
            final EventParameter parameter = eventParameterList.get(par);

            // Create a holder for array element details
            String[] arrayElements = null;
            int startSkip = 0;
            int endSkip = 0;
            int structSize = 0;

            // If the parameter is an array, add square brackets to the type
            if (parameter.isStructArray()) {
                // Create a string array for the array elements
                arrayElements = new String[parameter.getMaxStructArraySize()];

                // Initialise the array elements
                for (int i = 0; i < parameter.getMaxStructArraySize(); i++) {
                    arrayElements[i] = new String(Integer.toString(i));

                }

                // Calculate the structure size for an array structure
                int structPar = par;
                while (!eventParameterList.get(structPar).isStructFirstParameter()) {
                    structPar--;
                }
                for (; structPar < eventParameterList.size(); structPar++) {
                    structSize += eventParameterList.get(structPar).getNumberOfBytes();
                    if (eventParameterList.get(structPar).isStructLastParameter()) {
                        break;
                    }
                }
                structSize *= parameter.getMaxStructArraySize();

                // Calculate the start skip for an array element
                if (!parameter.isStructFirstParameter()) {
                    for (int firstPar = par - 1; firstPar >= 0; firstPar--) {
                        startSkip += eventParameterList.get(firstPar).getNumberOfBytes();
                        if (eventParameterList.get(firstPar).isStructFirstParameter()) {
                            break;
                        }
                    }
                }

                // Calculate the end skip for an array element
                if (!parameter.isStructLastParameter()) {
                    for (int lastPar = par + 1; lastPar < eventParameterList.size(); lastPar++) {
                        endSkip += eventParameterList.get(lastPar).getNumberOfBytes();
                        if (eventParameterList.get(lastPar).isStructLastParameter()) {
                            break;
                        }
                    }
                }
            } else {
                structSize = 0;
            }

            //EIKRWAQ -- added contains to check whether it contains MESSAGE_CONTENTS or not. it is used encoding getData Method for changing offset  

            // Add this parameter to the string template 
            st.addAggr("parameter.{type, name, arrayElements, rewindOffset, startSkip, endSkip, encodeDataMethod, decodeDataMethod, bits, contains}",
                    TypeConversion.typeSqlToJava(parameter.getSqlType()), parameter.getName(), arrayElements, (parameter.isStructFirstParameter() ? 0
                            : structSize), startSkip, endSkip, getDataMethod(parameter, false), getDataMethod(parameter, true),
                    (parameter.getType().equals("IBCD") ? parameter.getNumberOfBits() : null), (parameter.getName().equals("MESSAGE_CONTENTS") ? true : false));
        }

        classWriter.println(st.render());

        // Close the class writer
        classWriter.close();
    }

    /**
     * This method determines the name of the method used for decoding/encoding the parameter specified.
     * 
     * @param the parameter
     * @param decode indicates whether we need the method for decoding or encoding
     * @return the method name as per the respective converter (DataConverters for decoding and XDataConverter for encoding)
     */
    private static String getDataMethod(final EventParameter parameter, boolean decode) {
        // Method for DNS names
        if (parameter.getType().equals("DNSNAME")) {
            return decode ? "getByteArray3GPPString" : "setByteArray3GPPString";
        }
        // IBCD numbers
        else if (parameter.getType().equals("IBCD")) {
            return decode ? "getByteArrayIBCD" : "setByteArrayIBCD";
        }
        // TBCD numbers
        else if (parameter.getType().equals("TBCD")) {
            return decode ? "getByteArrayTBCDString" : "setByteArrayTBCDString";
        }
        // TBCD numbers already decoded into hexadecimal
        else if (parameter.getType().equals("HEXSTRING")) {
            return decode ? "getByteArrayHexString" : "setByteArrayHexString";
        }
        // Hexadecimal with only numeric values.
        else if (parameter.getType().equals("NUMERICHEXSTRING")) {
            return decode ? "getByteArrayNumericHexString" : "setByteArrayHexString";
        }
        // IP Addresses (IPADDRESS and IPADDRESSV6)
        else if (parameter.getType().startsWith("IPADDRESS")) {
            return decode ? "getByteArrayDottedDecimalString" : "setByteArrayDottedDecimalString";
        }
        // All other conversions are standard
        else {
            return getSqlDataMethod(parameter, decode);
        }
    }

    /**
     * Method to return the getData method for a SQL type
     * @param parameter The parameter to get the method for
     * @return the method as a string
     */
    private static String getSqlDataMethod(final EventParameter parameter, boolean decode) {
        // Use a switch on the SQL type
        switch (parameter.getSqlType()) {
        // String types
        case Types.CLOB: {
            return decode ? "getString" : "setString";
        }

        // Numeric types
        case Types.TINYINT:
            return decode ? "getByte" : "setByte";
        case Types.SMALLINT:
            return decode ? "getShort" : "setShort";
        case Types.BIGINT: {
            return decode ? "getLong" : "setLong";
        }
        case Types.INTEGER:
            return decode ? "getUnsignedIntegerAsInteger" : "setUnsignedIntegerAsInteger";

            // Byte arrays and IP addresses
        case Types.BINARY: {
            return decode ? "getByteArray" : "setByteArray";
        }

        // Dates
        case Types.TIMESTAMP:
        case Types.DATE: {
            return decode ? "getLong" : "setLong";
        }

        // Boolean values
        case Types.BOOLEAN: {
            return decode ? "getBoolean" : "setBoolean";
        }

        // Boolean values
        case Types.FLOAT: {
            return decode ? "getFloat" : "setFloat";
        }
        // Boolean values
        case Types.DOUBLE: {
            return decode ? "getDouble" : "setDouble";
        }

        default: {
            // Should never happen, all other parameter types are illegal in files
            logger.warn("parameter with incorrect type \"" + parameter.getSqlType() + "\" found: " + parameter);
            return "";
        }
        }
    }

    /**
     * Method to compute the write data method defined in IqBinaryFileWriter for a parameter with the specified sql type.
     * 
     * @param sqlType the sql type of the parameter to be written
     * @param numbOfBytes the number of bytes needed for the specified data type
     * @param signed indicates whether the parameter is signed
     * @return name of method in class IqBinaryFileWriter
     */
    private static String getWriteDataMethod(final int sqlType, final boolean signed) {
        switch (sqlType) {
        // String types
        case Types.CLOB: {
            return "writeVarchar";
        }

        // Numeric types
        case Types.TINYINT: {
            return "writeTinyint";
        }
        case Types.SMALLINT: {
            return "writeSmallint";
        }
        case Types.INTEGER: {
            return signed ? "writeInt" : "writeUnsignedint";
        }
        case Types.BIGINT: {
            return "writeUnsignedbigint";
        }

        // Dates
        case Types.TIMESTAMP: {
            return "writeTimestamp";
        }
        case Types.DATE: {
            return "writeDate";
        }

        // Boolean values
        case Types.BOOLEAN: {
            return "writeBit";
        }

        // Boolean values
        case Types.FLOAT: {
            return "writeFloat";
        }

        case Types.BINARY: {
            return "writeBinary";
        }

        default: {
            return "writeNotSupported";
        }
        }
    }

    /**
     * Method to return the initial value for a parameter
     * @param parameter The parameter to get the method for
     * @return the initial value as a string
     */
    static String getParameterInitValue(final int sqlType, final boolean isSigned) {
        // Find the type of the parameter and return the appropriate value
        switch (sqlType) {

        // String parameters
        case Types.CLOB: {
            return "null";
        }

        // Numerical Parameters
        case Types.TINYINT:
        case Types.SMALLINT:
        case Types.BIGINT: {
            return "-1";
        }

        // Distinguish between signed and unsigned integers
        case Types.INTEGER: {
            return isSigned ? String.valueOf(Integer.MIN_VALUE) : "-1";
        }

        // Parameters stored in byte arrays
        case Types.BINARY: {
            return "{-1}";
        }

        // Time stamp
        case Types.TIMESTAMP:
        case Types.DATE: {
            return "-1";
        }

        // Boolean values
        case Types.BOOLEAN: {
            return "false";
        }

        // Float values
        case Types.FLOAT: {
            return String.valueOf(DefaultValues.DEFAULT_FLOAT_VALUE) + "f";
        }

        // Float values
        case Types.DOUBLE: {
            return "0.0";
        }
        default: {
            // Should never happen, all other parameter types are illegal in files
            logger.warn("parameter with incorrect type \"" + sqlType + "\" found ");
            return "";
        }
        }
    }

    /**
     * Method to return the initial value for an array parameter
     * @param elementInitValue The initial value of an array element
     * @param maxArraySize The maximum number of elements in the array
     * @return the initial value as a string
     */
    private static String getParameterArrayInitValue(final String parameterInitValue, final int maxArraySize) {
        final StringBuilder builder = new StringBuilder();

        // Add the left brace for the array definition
        builder.append('{');

        // Add a default value for each element of the array
        for (int i = 0; i < maxArraySize; i++) {
            // Add a comma before all except the first element
            if (i > 0) {
                builder.append(',');
            }
            // Append the default parameter value
            builder.append(parameterInitValue);
        }

        // Add the right brace for the array definition
        builder.append('}');

        return builder.toString();
    }

    /**
     * Method to return the stringtemplate file.
     * @param packageDirName
     * @param baseEventBean
     * @return
     */
    private static String getStringTemplateFileName(final String packageDirName, final boolean baseEventBean) {
        if (baseEventBean) {
            if (packageDirName.equals("bearer_plane")) {
                return "StringTemplates" + File.separator + "BaseEventBean_BearerPlane.stg";
            }
            return "StringTemplates" + File.separator + "BaseEventBean.stg";
        }
        if (packageDirName.equals("bearer_plane")) {
            return "StringTemplates" + File.separator + "SubEventBean_BearerPlane.stg";
        }
        return "StringTemplates" + File.separator + "SubEventBean.stg";
    }
}
