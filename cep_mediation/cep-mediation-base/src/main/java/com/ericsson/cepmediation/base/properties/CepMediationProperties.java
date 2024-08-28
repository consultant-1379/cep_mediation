package com.ericsson.cepmediation.base.properties;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.util.ErrorCode;
import com.ericsson.cepmediation.base.util.constants.SystemExitCode;

/**
 * This class holds configuration properties for CEP Mediation
 * 
 * Handling of properties not found needs to be revisited - perhaps a split between cases where code can handle a property
 * being missing, and those that can't 
 * 
 * @author eeilfn
 */
public class CepMediationProperties {
    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(CepMediationProperties.class);

    // Get CEP_MEDIATION_HOME and USER_DIR
    private static final String CEP_MEDIATION_HOME = System.getProperty("cep_mediation_home");

    private static final String USER_DIR = System.getProperty("user.dir");

    // The properties
    private Properties cepMediationProperties = null; //NOPMD eemecoy 4/5/2012 bug in pmd, this can't be final

    // properties reads from the etc/config.xml.this will used to populate this object
    private ConfigBinder propertyLoader;

    // A static instance of this class
    private static CepMediationProperties propertiesSingleton = new CepMediationProperties();

    /**
     * Method to get the singleton object
     * 
     * @return The properties singleton
     */
    public static CepMediationProperties getInstance() {
        return propertiesSingleton;
    }

    /**
     * Constructor, initialise properties from config.xml
     */
    private CepMediationProperties() {
        logger.debug("creating properties instance");

        // Check if the properties have been initialized yet
        if (cepMediationProperties == null) {
            try {
                cepMediationProperties = new Properties();
                propertyLoader = ConfigBinder.getInstance();
                cepMediationProperties.putAll(propertyLoader.getProperties());

                // Check if the properties have actually been set
                if (cepMediationProperties.size() == 0) {
                    throw new ConfigurationException("no properties were found", ErrorCode.FAILED_LOAD_PROPS_DEF);
                }
            } catch (final Exception error) {
                logger.error("failed to read properties from config files. ", error);
                System.exit(SystemExitCode.SYSTEM_EXIT_CODE_NOK.getValue());
            }
        }
    }

    /**
     * Getter for the properties
     * 
     * @return the properties
     */
    public Properties getProperties() {
        return cepMediationProperties;
    }

    /**
     * Helper method to shorten calls for properties
     * 
     * 
     * 
     * @param property
     *            The property to get
     * @return The property
     */
    public static String getProperty(final Property property) {
        //NOTE the origonal case threw a null pointer exception when prop did not exist we return that NULL.... BUT probably shoudl throw a prop not found exception.... 
        final String propertyValue = CepMediationProperties.getProperty(property, "").trim();
        if (propertyValue.length() == 0) {
            //FIXME throw a PropertyNotFound exception...... and not return NULL..
            return null;
        }
        return propertyValue;
    }

    /**
     * Helper method to shorten calls for properties
     * 
     * @param property
     *            The property to get
     * @return The property
     */
    public static String getProperty(final Property property, final String defaultValue) {
        logger.debug("getting property: " + property);
        final String propertyName = property.getPropertyName();
        return CepMediationProperties.getInstance().getProperties().getProperty(propertyName, defaultValue).trim();
    }

    /**
     * Helper method to shorten calls for properties and to return the integer
     * value of properties
     * 
     * @param property
     *            The property to get
     * @return The property value as an integer
     * @throws NumberFormatException 
     * @throws PropertyNotFoundRuntimeException         if property not found
     */
    public static int getIntProperty(final CepMediationProperty property) throws NumberFormatException,
            PropertyNotFoundRuntimeException {
        return Integer.valueOf(getPropertyValue(property).trim());
    }

    /**
     * Helper method to shorten calls for properties and to return the integer
     * value of properties
     *
     * @param property
     *            The property to get
     * @return The property value as an integer
     * @throws NumberFormatException
     * @throws PropertyNotFoundRuntimeException         if property not found
     */
    public static int getIntProperty(final String property) throws NumberFormatException,
            PropertyNotFoundRuntimeException {
        return Integer.valueOf(getPropertyValue(property).trim());
    }

    /**
     * Helper method to shorten calls for properties and to return the boolean
     * value of properties
     * 
     * @param property
     *            The property to get
     * @return The property value as an integer
     * @throws PropertyNotFoundRuntimeException         if property not found
     */
    public static boolean getBooleanProperty(final CepMediationProperty property)
            throws PropertyNotFoundRuntimeException {
        return Boolean.valueOf(getPropertyValue(property).trim());
    }

    /**
     *
     * @param property the name of property
     * @param defaultValue the default value of the property
     * @return
     */

    public static boolean getBooleanProperty(final CepMediationProperty property, final boolean defaultValue) {
        boolean value = defaultValue;
        try {
            value = Boolean.valueOf(getPropertyValue(property).trim());
            return value;
        } catch (Exception ex) {
            logger.warn("can not read property: " + property.getPropertyName(), " using default value :" + value);
            return value;
        }
    }

    /**
     * Helper method to shorten calls for properties and to return an absolute
     * file name
     * 
     * @param property
     *            The property to get
     * @return The property as a fully resolved file name
     * @throws PropertyNotFoundRuntimeException         if property not found
     */
    public static String getFileProperty(final CepMediationProperty property) throws PropertyNotFoundRuntimeException {
        // Get the property
        final String fileProperty = getPropertyValue(property).trim();

        if (isWindowsOS()) {
            return fileProperty;
        }

        // Check if this property is specified absolutely
        if (fileProperty.startsWith("/")) {
            return fileProperty;
        }

        // Find out if CEP_MEDIATION_HOME is set
        if (CEP_MEDIATION_HOME != null) {
            return CEP_MEDIATION_HOME + '/' + getPropertyValue(property).trim();
        }

        // Append the current directory to the file property
        return USER_DIR + '/' + getPropertyValue(property).trim();
    }

    static boolean isWindowsOS() {
        final String osName = System.getProperty("os.name").toUpperCase();
        if (osName.contains("WINDOW")) {
            return true;
        }
        return false;
    }

    /**
     * Helper method to shorten calls for properties and to return the long
     * value of properties
     * 
     * @param property
     *            The property to get
     * @return The property value as a long
     * @throws NumberFormatException 
     * @throws PropertyNotFoundRuntimeException         if property not found
     */
    public static long getLongProperty(final CepMediationProperty property) throws NumberFormatException,
            PropertyNotFoundRuntimeException {
        return Long.valueOf(getPropertyValue(property).trim());
    }

    /**
     * Get the property value for a property
     * 
     * @param property          name of property
     * @return String            property value
     * @throws PropertyNotFoundRuntimeException         if property not found      
     */
    private static String getPropertyValue(final CepMediationProperty property) throws PropertyNotFoundRuntimeException {
        final String propertyName = property.getPropertyName();
        final String propertyValue = CepMediationProperties.getInstance().getProperties().getProperty(propertyName);
        if (propertyValue == null) {
            throw new PropertyNotFoundRuntimeException("No property defined for " + propertyName);
        }
        return propertyValue;
    }

    /**
    * Get the property value for a property
    *
    * @param property          name of property
    * @return String            property value
    * @throws PropertyNotFoundRuntimeException         if property not found
    */
    private static String getPropertyValue(final String property) {
        final String propertyValue = CepMediationProperties.getInstance().getProperties().getProperty(property);
        if (propertyValue == null) {
            throw new PropertyNotFoundRuntimeException("No property defined for " + property);
        }
        return propertyValue;
    }

}
