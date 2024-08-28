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

package com.ericsson.cepmediation.server.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.service.ServiceException;
import com.ericsson.cepmediation.base.service.ServiceExecuter;
import com.ericsson.cepmediation.base.util.ConfigData;
import com.ericsson.cepmediation.server.management.util.AdminHelper;
import com.ericsson.cepmediation.server.management.util.InputFileDirectoryReader;

/**
 * This class equally distributes the all nodes to available loading services
 * 
 * @author eachsaj
 * 
 */
public class ParsingLoadBalanceExecuter implements ServiceExecuter {

    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(ParsingLoadBalanceExecuter.class);

    /*
     * instance of the ConfigData
     */
    private ConfigData configData;

    /*
     * instance of AdminHelper
     */
    private final AdminHelper helper = new AdminHelper();

    private InputFileDirectoryReader directoryReader = new InputFileDirectoryReader();

    /*
     * to prevent overriding
     */
    private ParsingLoadBalanceExecuter() {
        logger.trace("ParsingLoadBalanceExecuter()-->");
        logger.trace("ParsingLoadBalanceExecuter()<--");

    }

    /**
     * single method to create this class instance.
     * 
     * @return instance of this class.
     */
    public static ParsingLoadBalanceExecuter create() {
        return new ParsingLoadBalanceExecuter();
    }

    @Override
    public void init(final ConfigData data, final ServiceConfigBean serviceData) {
        //ignore service data here, it not required here
        logger.trace("init()-->");
        logger.debug("Load Balance Service initialised");
        this.configData = data;
        logger.trace("init()<--");

    }

    @Override
    public void execute() throws ServiceException {
        logger.trace("execute()-->");

//        // read all loading service bean of all hosts.
//        List<ServiceConfigBean> loadingServicebean;
//        try {
//            final ConfigBinder binder = ConfigBinder.getInstance();
//            // all servers loading process definitions
//            loadingServicebean = binder.getAllLoadingServices();
//
//            // Check if there are any loaders running on this machine
//            if (loadingServicebean.size() == 0) {
//                // No loaders so no load balancing
//                return;
//            }
//
//            // read local host loading services.
//            // mme node's directory names from OSS server
//            //final String[] mmeNodes = directoryReader.getOSSMMEDirectories(configData);
//
//            // all RNC directory names from OSS server,
//            //TODO this needs to corrected in GA version.its a temporary fix
//           // final String[] rncNodes = directoryReader.getOSSRNCDirectories(configData);
//
//            // all staple directory names from staple server
//           // final String[] stapleNodes = directoryReader.getStapleDirectories(configData);
//            // assign MME nodes and Staple nodes to one process, so one of the thread can be
//            // assigned for that later
//          //  helper.distributeNodes(mmeNodes, stapleNodes, rncNodes, loadingServicebean);
//            // enable mmeServiceEnabled for single admin server process.
//            //
//
//        } catch (final ConfigurationException e) {
//            logger.error(e.getMessage(), e);
//            throw new ServiceException(e.getMessage(), e.getErrorCode());
//        } catch (final CollectionException e) {
//            logger.error(e.getMessage(), e);
//            throw new ServiceException("SSH Error: " + e.getMessage(), e.getErrorCode());
//        }
        logger.debug("Load Balance Service started");
        logger.trace("execute()<--");
    }

    @Override
    public void terminate() {
        logger.trace("terminate()-->");
        //nothing to terminate here, this service must be part of the Admin server.
        logger.trace("terminate()<--");
    }

}
