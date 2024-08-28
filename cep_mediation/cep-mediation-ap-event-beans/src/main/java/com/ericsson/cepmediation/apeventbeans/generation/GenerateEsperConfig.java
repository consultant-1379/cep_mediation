package com.ericsson.cepmediation.apeventbeans.generation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import com.ericsson.cepmediation.base.meta.admin.MappedEvent;
import com.ericsson.cepmediation.base.meta.admin.SchemaHandler;
import com.ericsson.cepmediation.base.meta.admin.SchemaTypeHandler;
import com.ericsson.cepmediation.base.util.Utilities;

/**
 * This class generates a java package for each schema and a java class for each event.
 * 
 * @author eeilfn
 */
public abstract class GenerateEsperConfig {
    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(GenerateEsperConfig.class);

    /**
     * This method generates the Esper configuration file for event beans
     * 
     * @param Command line arguments
     * @throws Exception 
     */
    public static void main(final String[] args) throws Exception {

        // Check the arguments
        if (args.length != 2) {
            logger.error("usage: GenerateEsperConfig <directory name> <root path of GIT repository>");
            System.exit(1);
        }
        // Declare variables to hold the arguments
        final String configDirName = args[0];
        final String rootPath = args[1];
        System.setProperty("root.path", rootPath);

        // Check that the argument is a directory
        final File configDir = new File(configDirName);
        if (!configDir.isDirectory()) {
            logger.debug("\"" + configDirName + "\" is not a directory, will create it");
            final boolean result = configDir.mkdirs();
            if (!result) {
                logger.error("Could not create folder " + configDirName);
                System.exit(1);
            }
        }

        // Create the esper configuration file
        final File esperConfigFile = new File(configDir, "esper-conf.xml");

        // Open the class file
        PrintWriter confWriter = new PrintWriter(new BufferedWriter(new FileWriter(esperConfigFile)));

        // Open the string template group
        final String esperSTFile = Utilities.getFileResource("StringTemplates/esper-conf.xml.stg");
        final STGroup group = new STGroupFile(esperSTFile);

        // Get the Esper Config string template
        final ST st = group.getInstanceOf("main");

        // Initialize the schema handler final which loads all schemas
        final SchemaHandler schemaHandler = new SchemaHandler();

        // Iterate over each schema type
        for (final String schemaType : schemaHandler.getSchemaMap().keySet()) {
            // Get the final Schema Type Handler
            final SchemaTypeHandler schemaTypeHandler = schemaHandler.getSchemaMap().get(schemaType);

            // Iterate over each event in the sfinal chema type map
            for (final MappedEvent mappedEvent : schemaTypeHandler.getEventMap().values()) {
                // Generate the configuration for this event
                st.addAggr("event.{schemaType, name}", schemaType, mappedEvent.getEvent().getName());
            }

            logger.info("configuration generated for schema " + schemaType);
        }

        // Write the template
        confWriter.println(st.render());

        // Close the configuration writer
        confWriter.close();
    }
}