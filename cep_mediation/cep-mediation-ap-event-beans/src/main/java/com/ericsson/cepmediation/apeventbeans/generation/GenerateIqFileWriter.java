package com.ericsson.cepmediation.apeventbeans.generation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import org.jaxen.JaxenException;
import org.jdom.JDOMException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import com.ericsson.cepmediation.base.meta.persistence.FieldType;
import com.ericsson.cepmediation.base.meta.persistence.Persistence;
import com.ericsson.cepmediation.base.meta.persistence.PersistentEntity;
import com.ericsson.cepmediation.base.meta.schema.SchemaException;
import com.ericsson.cepmediation.base.resourceloading.ResourceLoadingFailedException;
import com.ericsson.cepmediation.base.util.Utilities;

/**
 * 
 * This class generates the class IqFileWriter using string templates.
 * 
 * Generation is based on the persistence metadata stored in a file configured
 * in config.xml. The persistence metadadata file defines how to write ApEventsBeans in
 * the iq binary files.
 * 
 * @author emicned
 *
 */
public class GenerateIqFileWriter {
    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(GenerateIqFileWriter.class);

    // Set the package prefix for the generated class
    private static final String PERSIST_PACKAGE = "com.ericsson.cepmediation.persist";

    public static void main(final String[] args) throws IOException, SchemaException, JaxenException, JDOMException, ResourceLoadingFailedException {
        // Check the arguments
        if (args.length != 2) {
            logger.error("usage: GenerateIqFileWriter <directory name> <root.path>");
            System.exit(1);
        }

        // Declare variables to hold the arguments
        final String fileDirName = args[0];
        final String rootPath = args[1];
        System.setProperty("root.path", rootPath);

        // Check that the argument is a directory
        final File fileDir = new File(fileDirName);
        if (!fileDir.isDirectory()) {
            logger.error("\"" + fileDirName + "\" is not a directory");
            System.exit(1);
        }

        // Define the directory for the event class package
        final File persistencePackageDir = new File(fileDirName + '/' + PERSIST_PACKAGE.replaceAll("\\.", "/"));
        // If the package directory does not exist, create it
        if (persistencePackageDir.exists()) {
            logger.info(persistencePackageDir.getAbsolutePath() + " already exists, will be used");
        } else {
            persistencePackageDir.mkdirs();
            logger.info(persistencePackageDir.getAbsolutePath() + " created");
        }

        final Persistence persistence = new Persistence("xml/persistence.xml");

        // Create the java file for the event
        final File iqFileWriterFile = new File(persistencePackageDir, "IqFileWriter.java");
        final PrintWriter classWriter = new PrintWriter(new BufferedWriter(new FileWriter(iqFileWriterFile)));

        // Open the string template group which will create the IqFileWriter class
        final String iqFileWriterTemplate = Utilities.getFileResource("StringTemplates/IqFileWriter.stg");
        final STGroup iqFileWriterGroup = new STGroupFile(iqFileWriterTemplate);

        // Get the string templates
        final ST iqFileWriterST = iqFileWriterGroup.getInstanceOf("main");

        // Iterate over all persistent entities and generate a write method
        final Map<String, PersistentEntity> name2persistentEntity = persistence.getPersistentEntityHandler().getMap();
        for (final PersistentEntity persistentEntity : name2persistentEntity.values()) {
            final String fullyQualifiedName = persistentEntity.getFullyQualifiedName();
            // Generate method body
            final ST iqMethodBodyST = iqFileWriterGroup.getInstanceOf("methodBody");
            for (final FieldType field : persistentEntity.getFields()) {
                iqMethodBodyST.addAggr("field.{fieldName, writeMethod, size, truncateMillis, attributeExists, func, enriches, enriched}", field.getName(),
                		iqType2writeMethod(field.getType()), field.getSize(), field.isTruncateMillis(), field.doesAttributeExist(),
                		field.getFunc(), persistentEntity.isEnriches(), field.isEnriched());
            }
            final String methodBody = iqMethodBodyST.render();

            // Generate method signature and append the body
            final ST iqMethodST = iqFileWriterGroup.getInstanceOf("methodDefinition");
            iqMethodST.addAggr("methodDef.{fullyQualifiedName, className, body}", fullyQualifiedName, persistentEntity.getClassName(), methodBody);
            final String method = iqMethodST.render();

            // Add the method definition to the class
            iqFileWriterST.addAggr("method.{definition, fullyQualifiedName, className}", method, fullyQualifiedName, persistentEntity.getClassName());
        }

        classWriter.println(iqFileWriterST.render());

        // Close the class writer
        classWriter.close();
    }

    private static String iqType2writeMethod(final String type) {
        if ("tinyint".equals(type)) {
            return "writeTinyint";
        } else if ("smallint".equals(type)) {
            return "writeSmallint";
        } else if ("unsignedint".equals(type)) {
            return "writeUnsignedint";
        } else if ("int".equals(type)) {
            return "writeInt";
        } else if ("unsignedbigint".equals(type)) {
            return "writeUnsignedbigint";
        } else if ("varchar".equals(type)) {
            return "writeVarchar";
        } else if ("binary".equals(type)) {
            return "writeBinary";
        } else if ("timestamp".equals(type)) {
            return "writeTimestamp";
        } else if ("float".equals(type)) {
            return "writeFloat";
        } else if ("bit".equals(type)) {
            return "writeBit";
        } else if ("date".equals(type)) {
        	return "writeDate";
        } else {
            throw new IllegalArgumentException("Unsupported iq sql type: " + type);
        }
    }
}
