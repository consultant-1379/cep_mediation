/**
 * (C) Copyright LM Ericsson System Expertise AT/LMI, 2011
 *
 * The copyright to the computer program(s) herein is the property of Ericsson
 * System Expertise EEI, Sweden. The program(s) may be used and/or copied only
 * with the written permission from Ericsson System Expertise AT/LMI or in
 * accordance with the terms and conditions stipulated in the agreement/contract
 * under which the program(s) have been supplied.
 *
 */
package com.ericsson.cepmediation.base.util;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.meta.admin.SchemaHandler;
import com.ericsson.cepmediation.base.meta.schema.SchemaException;
import com.ericsson.cepmediation.base.proc.config.Ne;
import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;

/**
 * 
 * This class encapsulates the all required properties to run the CEP Mediation application
 *  
 * @category Configuration
 * @since 1/06/2011
 * @author eachsaj
 * 
 */

/**
 * @author anauser
 * 
 */
public class ConfigData extends AgentConfigurationData {

    private static final Logger logger = LoggerFactory.getLogger(ConfigData.class);

    private static final long serialVersionUID = -8759674721409806980L;

    private SchemaHandler schemaHandler;
    
    private Ne networkElement;

    public static ConfigData create(Ne networkElement) {
        logger.trace("-->");
        final ConfigData bean = new ConfigData();
        bean.setNetworkElement(networkElement);
        bean.setServerData(networkElement.getIp(), networkElement.getUname(), networkElement.getPassword());
        bean.setInputDirectory(networkElement.getDirectory());
        bean.setLocalFileStorage(CepMediationProperties.getProperty(CepMediationProperty.GENERAL_FILECOPY_DESTINATION));
        
        SchemaHandler newSchemaHandler = null;
        try {
            newSchemaHandler = new SchemaHandler();
        } catch (final SchemaException e) {
            logger.error("schema loading failed", e);
        }
        bean.setSchemaHandler(newSchemaHandler);
        logger.trace("<--");
        return bean;
    }

    private ConfigData() {
    }

    public Ne getNetworkElement() {
        return networkElement;
    }

    //this is on purpose restricted usage in order to force ConfigData static initiation with NetworkElement
    private void setNetworkElement(Ne networkElement) {
        this.networkElement = networkElement;
    }

    public SchemaHandler getSchemaHandler() {
        return schemaHandler;
    }

    public void setSchemaHandler(final SchemaHandler schemaHandler) {
        this.schemaHandler = schemaHandler;
    }

    @Override
    public String toString() {
        return "ConfigData [networkElement=label" + networkElement.getLabel() + " : directory_" + networkElement.getDirectory() + ", schemaHandler=" + schemaHandler + "]";
    }
}