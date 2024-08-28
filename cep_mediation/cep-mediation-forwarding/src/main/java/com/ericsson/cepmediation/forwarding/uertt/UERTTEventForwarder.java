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
package com.ericsson.cepmediation.forwarding.uertt;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;

/**
 * @author xalomis
 */
public class UERTTEventForwarder implements UERTTForwarder {
    private static final Logger logger = LoggerFactory
            .getLogger(UERTTEventForwarder.class);

    @Override
    public void forward(ApEventBean event) {
        try {
            UERTTFileWriter.uerttWrite(event);
        } catch (IOException e) {
           logger.info("Exception caught at UERTTEventForwarder: UERTTFileWriter.uerttWrite()"+e);
        }
        
       
    }

    @Override
    public void close() {
    }

    @Override
    public void init(final ServiceConfigBean configData) {
        logger.info("Init UERTTEventForwarder");
    }
    
}
