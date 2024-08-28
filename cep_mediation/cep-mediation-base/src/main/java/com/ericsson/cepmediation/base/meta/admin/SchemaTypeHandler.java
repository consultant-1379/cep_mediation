package com.ericsson.cepmediation.base.meta.admin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.jdom.Element;
import org.jdom.Namespace;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.meta.schema.Event;
import com.ericsson.cepmediation.base.meta.schema.EventParameter;
import com.ericsson.cepmediation.base.meta.schema.Schema;
import com.ericsson.cepmediation.base.meta.schema.extension.CommonInterface;
import com.ericsson.cepmediation.base.meta.schema.extension.EnrichedEvent;
import com.ericsson.cepmediation.base.meta.schema.extension.SchemaExtension;
import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;

/**
 * This class handles schema administration for schemas of a particular type in CEP Mediation. It loads all schemas
 * of a particular type into memory from XML files, uses the rules below to resolve all those schemas into a
 * single event parameter map for the given schema type. A single instance of this class exists for all Cell
 * Trace, EBM, or CTUM schemas.
 * 
 * The mapping rules used are:
 * 1) Events are added to the event map for the most recent version first working back to the least recent version
 * 2) If an event does not exist in the latest schema version but appears in an earlier schema version, it is added
 *    to the map
 * 3) Parameters are added to the map from the latest version backwards; a parameter will always
 *    have the attributes from the latest event schema in which it appears. Therefore, if, for example, the length
 *    of a parameter is increased in a later version, the increased length will be the length of the parameter in
 *    the map. It is assumed that parameters will never get more restrictive definitions in later versions
 * 4) If a parameter is dropped from an event in later versions, it will appear in the map.
 * 
 * @author eeilfn
 */

public class SchemaTypeHandler {
    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(SchemaTypeHandler.class);

    // Property strings for XML event file
    private static final Namespace SCHEMA_TYPE_NAMESPACE = Namespace.getNamespace(CepMediationProperties
            .getProperty(CepMediationProperty.SCHEMATYPE_NAMESPACE));

    // Hold a reference to the Schema Handler for this schema type handler
    private final SchemaHandler schemaHandler;

    // Define the member data for this schema type
    private String name = ""; //NOPMD eemecoy 9/4/2012 setting default value here 

    private int idLength = -1;//NOPMD eemecoy 9/4/2012 setting default value here 

    private int idStartPos = -1;//NOPMD eemecoy 9/4/2012 setting default value here 

    private boolean idInEvent = false; //NOPMD eemecoy 9/4/2012 pmd bug

    private String paramPreamble = ""; //NOPMD eemecoy 9/4/2012 setting default value here 

    private String valuePreamble = ""; //NOPMD eemecoy 9/4/2012 setting default value here 

    // Define a map of schemas for this schema type, the map contains the schema name and XML file for each schema
    // in this type.
    private final TreeMap<String, Schema> schemaMap = new TreeMap<String, Schema>();

    // Define a map of schemas by file information version ID for this schema type, this map is
    // used to look up schemas during parsing
    private final TreeMap<String, Schema> fileInformationVersionMap = new TreeMap<String, Schema>();

    // Declare a map of maps to hold all possible events, extra columns, and parameters on those events
    // This map is generated using the rules explained above
    private final TreeMap<Event, MappedEvent> eventMap = new TreeMap<Event, MappedEvent>();

    private CommonInterface commonInterface;

    // Declare a list that contains common EventParamteters for all events in this schema
    private final List<EventParameter> commonInterfaceParams = new ArrayList<EventParameter>();

    //  Declare a list that contains enriched event definitions
    private final List<EnrichedEvent> enrichedEvents = new ArrayList<EnrichedEvent>();

    /**
     * Instantiate a general entry as an object
     * @param schemaHandler the schema handler that owns this schema type handler 
     * @param general the general XML element
     */
    protected SchemaTypeHandler(final SchemaHandler schemaHandler, final Element schemaTypeElement) {
        // Save the schema handler
        this.schemaHandler = schemaHandler;

        try {
            // Instantiate member data from the XML element
            name = schemaTypeElement.getChild("name", SCHEMA_TYPE_NAMESPACE).getText().trim();
            idLength = Integer.valueOf(schemaTypeElement.getChild("idLength", SCHEMA_TYPE_NAMESPACE).getText().trim());
            idStartPos = Integer.valueOf(schemaTypeElement.getChild("idStartPos", SCHEMA_TYPE_NAMESPACE).getText()
                    .trim());
            idStartPos = Integer.valueOf(schemaTypeElement.getChild("idStartPos", SCHEMA_TYPE_NAMESPACE).getText()
                    .trim());
            idInEvent = Boolean
                    .valueOf(schemaTypeElement.getChild("idInEvent", SCHEMA_TYPE_NAMESPACE).getText().trim());

            // Get the parameter preamble if it is set
            if (schemaTypeElement.getChild("paramPreamble", SCHEMA_TYPE_NAMESPACE) != null) {
                paramPreamble = schemaTypeElement.getChild("paramPreamble", SCHEMA_TYPE_NAMESPACE).getText().trim();
            }

            // Get the value preamble if it is set
            if (schemaTypeElement.getChild("paramPreamble", SCHEMA_TYPE_NAMESPACE) != null) {
                valuePreamble = schemaTypeElement.getChild("paramPreamble", SCHEMA_TYPE_NAMESPACE).getText().trim();
            }

            logger.debug("loading schema type=" + name + ", idLength=" + idLength + ", idStartPos=" + idStartPos);

            // Get the schema versions in this schema type
            @SuppressWarnings("unchecked")
            final List<Element> schemaVersionElements = schemaTypeElement.getChildren("schemaVersion",
                    SCHEMA_TYPE_NAMESPACE);

            // Get the schema versions in this schema type and load them into the schema map
            for (final Element schemaVersionElement : schemaVersionElements) {
                // Get the schema name and XML file
                final String schemaName = schemaVersionElement.getChild("name", SCHEMA_TYPE_NAMESPACE).getText().trim();
                final String schemaXmlFile = schemaVersionElement.getChild("xmlFile", SCHEMA_TYPE_NAMESPACE).getText()
                        .trim();

                // Instantiate the schema
                final Schema schema = new Schema(this, schemaName, schemaXmlFile);
                logger.debug("schema version=" + schemaName + ", XML file=" + schemaXmlFile + " loaded");

                // Add the schema to the schema map
                schemaMap.put(schemaName, schema);

                // Add the schema to the schema file information version map
                fileInformationVersionMap.put(schema.getGeneralHandler().getGeneralInfo().getFileInformationVersion(),
                        schema);
            }

            final Element extension = schemaTypeElement.getChild("extension", SCHEMA_TYPE_NAMESPACE);
            if (extension != null) {
                final String extensionXmlFile = extension.getChild("xmlFile", SCHEMA_TYPE_NAMESPACE).getText().trim();
                logger.debug("schema extension: " + extensionXmlFile);

                initExtensions(new SchemaExtension(this, extensionXmlFile));
            }
        } catch (final Exception e) {
            logger.warn("loading of a schema in schema type " + name + " failed", e);
        }

        // Build the event parameter map for this schema type
        buildEventParameterMap();
    }

    private void initExtensions(final SchemaExtension schemaExtension) {
        final Map<String, CommonInterface> name2commonInterface = schemaExtension.getCommonInterfaceHandler().getMap();
        final Map.Entry<String, CommonInterface> commonInterfaceEntry = name2commonInterface.entrySet().iterator()
                .next();
        commonInterface = commonInterfaceEntry.getValue();

        final Map<String, EnrichedEvent> name2enrichedEvent = schemaExtension.getEnrichedEventHandler().getMap();
        for (final Map.Entry<String, EnrichedEvent> enrichedEventEntry : name2enrichedEvent.entrySet()) {
            enrichedEvents.add(enrichedEventEntry.getValue());
        }
    }

    /**
     * Build the event parameter map using the rules described in the comment at the top of this class
     */
    private void buildEventParameterMap() {
        // Iterate through all schemas from the latest back and find all events in those schemas
        for (final Schema schema : schemaMap.descendingMap().values()) {
            // Iterate through every event on this schema
            for (final Event event : schema.getEventHandler().getMap().values()) {

                // Declare a map for this event
                MappedEvent mappedEvent = null;

                // Add this event to the event map if it does not already exist on the map
                if (eventMap.containsKey(event)) {
                    mappedEvent = eventMap.get(event);
                } else {
                    mappedEvent = new MappedEvent(event);
                    eventMap.put(event, mappedEvent);
                }

                // Add the extra columns from this schema to the map
                mappedEvent.setExtraColumns(schema);

                final List<EventParameter> params = new ArrayList<EventParameter>(event.getParameterList());
                final List<EventParameter> ignoredParams = new ArrayList<EventParameter>(
                        event.getIgnoredParameterList());

                if (commonInterface != null) {
                    extractCommonParams(params);
                    extractCommonParams(ignoredParams);
                }

                // Add the parameters from this event to the map
                mappedEvent.setParameters(params);

                // Add the ignored parameters from this event to the map                
                mappedEvent.setIgnoredParameters(ignoredParams);
            }
        }
    }

    private void extractCommonParams(final List<EventParameter> params) {
        for (final Iterator<EventParameter> iter = params.iterator(); iter.hasNext();) {
            final EventParameter param = iter.next();
            if (commonInterface.getParams().contains(param.getName())) {
                if (!commonInterfaceParams.contains(param)) {
                    commonInterfaceParams.add(param);
                }
                iter.remove();
            }
        }
    }

    /**
     * Get the schema handler of this schema type handler
     * @return The schema handler reference
     */
    public SchemaHandler getSchemaHandler() {
        return schemaHandler;
    }

    /**
     * Get the schema type name
     * @return The schema type name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the ID length for this schema type
     * @return The ID length in bits
     */
    public int getIdLength() {
        return idLength;
    }

    /**
     * Get the ID start position bit for this schema type
     * @return The ID start position bit
     */
    public int getIdStartPos() {
        return idStartPos;
    }

    /**
     * Find if the event ID is in the event as a field
     * @return True if the event ID is a field in the event
     */
    public boolean isIdInEvent() {
        return idInEvent;
    }

    /**
     * Get the parameter preamble for parameters on this schema type
     * @return the parameter preamble
     */
    public String getParamPreamble() {
        return paramPreamble;
    }

    /**
     * Get the value preamble for parameters on this schema type
     * @return the value preamble
     */
    public String getValuePreamble() {
        return valuePreamble;
    }

    /**
     * Return the schema map for this schema type
     * @return The schema map
     */
    public TreeMap<String, Schema> getSchemaMap() {
        return schemaMap;
    }

    /**
     * Return the file information version schema map for this schema type
     * @return The file information version schema map
     */
    public TreeMap<String, Schema> getFileInformationVersionMap() {
        return fileInformationVersionMap;
    }

    public List<EnrichedEvent> getEnrichedEvents() {
        return enrichedEvents;
    }

    public String getCommonInterfaceName() {
        return commonInterface != null ? commonInterface.getName() : null;
    }

    /**
     * Return common event parameters for this schema type.
     * @return the list of common parameters
     */
    public List<EventParameter> getCommonInterfaceParams() {
        return commonInterfaceParams;
    }

    /**
     * Return the event map for this schema type
     * @return The event map
     */
    public TreeMap<Event, MappedEvent> getEventMap() {
        return eventMap;
    }

    /**
     * Find and return a mapped event from the event map
     * @param The name of the event to find
     * @return The mapped event
     */
    public MappedEvent getMappedEvent(final String eventName) {
        // Search for the event
        for (final MappedEvent mappedEvent : eventMap.values()) {
            if (mappedEvent.getEvent().getName().equals(eventName)) {
                // Found the event, return it
                return mappedEvent;
            }
        }

        return null;
    }
}
