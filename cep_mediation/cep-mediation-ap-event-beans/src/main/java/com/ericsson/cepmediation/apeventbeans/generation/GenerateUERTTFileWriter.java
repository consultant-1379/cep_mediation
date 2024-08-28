/***------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2013
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
-----------------------------------------------------------------------------------------------*/
package com.ericsson.cepmediation.apeventbeans.generation;

import java.io.*;
import java.util.Map;

import org.jaxen.JaxenException;
import org.jdom.JDOMException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.stringtemplate.v4.*;

import com.ericsson.cepmediation.base.meta.persistence.*;
import com.ericsson.cepmediation.base.meta.schema.SchemaException;
import com.ericsson.cepmediation.base.resourceloading.ResourceLoadingFailedException;
import com.ericsson.cepmediation.base.util.Utilities;

/**
 * 
 * This class generates the class UERTTFileWriter using string templates.
 * 
 * Generation is based on the persistence metadata stored in a file configured in config.xml. The persistence metadadata file defines how to write
 * ApEventsBeans in the text files.
 * 
 */
public class GenerateUERTTFileWriter {
    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(GenerateUERTTFileWriter.class);

    // Set the package prefix for the generated class
    private static final String PERSIST_PACKAGE = "com.ericsson.cepmediation.persist";

    private static StringBuilder headers = null;

    public static void main(final String[] args) throws IOException, SchemaException, JaxenException, JDOMException, ResourceLoadingFailedException {
        // Check the arguments
        if (args.length != 2) {
            logger.error("usage: GenerateUERTTFileWriter <directory name> <root.path>");
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

        final File persistencePackageDir = new File(fileDirName + '/' + PERSIST_PACKAGE.replaceAll("\\.", "/"));
        if (persistencePackageDir.exists()) {
            logger.info(persistencePackageDir.getAbsolutePath() + " already exists, will be used");
        } else {
            persistencePackageDir.mkdirs();
            logger.info(persistencePackageDir.getAbsolutePath() + " created");
        }
        final Persistence persistence = new Persistence("xml/UERTTEvents.xml");
        createUtilityClass("StringTemplates/EventUtilsUertt.stg","EventUtilsUertt.java", args[0], args[1]);
    }

    private static void getHeaders(String fieldName) {
        headers = headers.append(fieldName).append("|");
    }
    
    private static String setFields(String value){
        value = value.replace("entity.getBase().getTimestamp()","formatTime(entity.getBase().getTimestamp())");
        value = value.replace("entity.getBase().getMESSAGE_CONTENTS()","getHexValue(entity.getBase().getMESSAGE_CONTENTS())");
        return value;
    }
private static void createUtilityClass(String templateFile,String outputFile,String firstArgument,String secondArgument)throws IOException, SchemaException, JaxenException, JDOMException, ResourceLoadingFailedException {
    	
    	final String fileDirName = firstArgument;
        final String rootPath = secondArgument;
        System.setProperty("root.path", rootPath);

        // Check that the argument is a directory
        final File fileDir = new File(fileDirName);
        if (!fileDir.isDirectory()) {
            logger.error("\"" + fileDirName + "\" is not a directory");
            System.exit(1);
        }
    	final File persistencePackageDir = new File(fileDirName + '/' + PERSIST_PACKAGE.replaceAll("\\.", "/"));
        if (persistencePackageDir.exists()) {
            logger.info(persistencePackageDir.getAbsolutePath() + " already exists, will be used");
        } else {
            persistencePackageDir.mkdirs();
            logger.info(persistencePackageDir.getAbsolutePath() + " created");            
        }
    	final Persistence persistence = new Persistence("xml/UERTTEvents.xml");
    	final File uerttFileWriterFile = new File(persistencePackageDir, outputFile);
        final PrintWriter classWriter = new PrintWriter(new BufferedWriter(new FileWriter(uerttFileWriterFile)));
        
        final String uerttFileWriterTemplate = Utilities.getFileResource(templateFile);
        final STGroup uerttFileWriterGroup = new STGroupFile(uerttFileWriterTemplate);

        final ST uerttFileWriterST = uerttFileWriterGroup.getInstanceOf("main");        
        final Map<String, PersistentEntity> name2persistentEntity = persistence.getPersistentEntityHandler().getMap();        
        for (final PersistentEntity persistentEntity : name2persistentEntity.values()) {
            final String fullyQualifiedName = persistentEntity.getFullyQualifiedName();                                                                     
            final ST uerttGetImsiMethodST = uerttFileWriterGroup.getInstanceOf("getIMSI");
            uerttGetImsiMethodST.addAggr("method.{fullyQualifiedName}", fullyQualifiedName);
            final String method = uerttGetImsiMethodST.render(); 
        }        
        for (final PersistentEntity persistentEntity : name2persistentEntity.values()) {
            final String fullyQualifiedName = persistentEntity.getFullyQualifiedName();                                                                                             
            final ST uerttGetTimestampMethodST = uerttFileWriterGroup.getInstanceOf("getTimestamp");
            uerttGetTimestampMethodST.addAggr("method.{fullyQualifiedName}", fullyQualifiedName);            
            final String method = uerttGetTimestampMethodST.render();                        
        }
     // Iterate over all persistent entities and generate a write method        
        for (final PersistentEntity persistentEntity : name2persistentEntity.values()) {
            final String fullyQualifiedName = persistentEntity.getFullyQualifiedName();
            // Generate method body
            final ST uerttMethodBodyST = uerttFileWriterGroup.getInstanceOf("methodBody");
            headers = new StringBuilder();
            for (final FieldType field : persistentEntity.getFields()) {
                getHeaders(field.getName());
                uerttMethodBodyST.addAggr("field.{fieldName,  size, truncateMillis, attributeExists, func, enriches, enriched}", field.getName(),
                        field.getSize(), field.isTruncateMillis(), field.doesAttributeExist(), field.getFunc(), persistentEntity.isEnriches(),
                        field.isEnriched());
            }

            String methodBody = uerttMethodBodyST.render();
            
            methodBody = setFields(methodBody);

            final ST uerttMethodST = uerttFileWriterGroup.getInstanceOf("methodDefinition");
            uerttMethodST.addAggr("methodDef.{fullyQualifiedName, className, body}", fullyQualifiedName, persistentEntity.getClassName(), methodBody);
            final String method = uerttMethodST.render();

            // Add the method definition to the class
            uerttFileWriterST.addAggr("method.{definition, fullyQualifiedName, className,fileHeaders}", method, fullyQualifiedName,
                    persistentEntity.getClassName(), headers.substring(0, headers.lastIndexOf("|")).toUpperCase());
        }

        classWriter.println(uerttFileWriterST.render());

        // Close the class writer
        classWriter.close();               
    }

}
