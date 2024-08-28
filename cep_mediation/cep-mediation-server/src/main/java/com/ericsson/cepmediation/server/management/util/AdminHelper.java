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
package com.ericsson.cepmediation.server.management.util;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.base.util.constants.ApplicationConstants;
import com.ericsson.cepmediation.server.management.AgentData;
import com.ericsson.cepmediation.server.management.CepMediationServer;

/**
 * This is a utility class for the server 
 * @category Server
 * @author eachsaj
 *
 */
public class AdminHelper {

    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(AdminHelper.class);

    private static int rmiPort = CepMediationProperties.getIntProperty(CepMediationProperty.JAVA_RMI_SERVER_PORT);

    /** Returns a server to nodes (one to many) relation object(one server and its allocated nodes array)
     * @param mmeNodes String[] contains all oss MME node directory names 
     * @param stapleNodes String[] contains all staple node directory names
     * @param rncNodes String[] contains all RNC node directory names
     * @param agents, number of enabled loading services defined in the xml file
     * 
     */
    public void distributeNodes(final String[] mmeNodes, final String[] stapleNodes, final String[] rncNodes, final List<ServiceConfigBean> loadingServices) {
        if (loadingServices.size() >= 1) {
            if (loadingServices.get(0).getNetworkElements() == null || loadingServices.get(0).getNetworkElements().size() == 0) {
                loadingServices.get(0).setRNCNodes(rncNodes);
                loadingServices.get(0).setMMENodes(mmeNodes);
                loadingServices.get(0).setProbeLogNodes(stapleNodes);
            }

        }

    }

    /**
     * @param nodes
     * @return
     */
    public List<String> getAsList(final String[] nodes) {
        final List<String> nodeList = new ArrayList<String>();
        for (final String node : nodes) {
            nodeList.add(node);
        }
        return nodeList;
    }

    /**
     * @param data
     * @return
     * @throws CouldNotConnectToRMIServiceException 
     */
    public static CepMediationServer connect(final AgentData data) throws CouldNotConnectToRMIServiceException {
        CepMediationServer server = null;
        for (int tryCount = 0; tryCount < 3; tryCount++) {
            logger.debug("connecting to server " + data + ", attempt no: " + tryCount + " . . .");
            try {
                final String serviceName = data.isAdminServer() ? ApplicationConstants.getInstance().getAdminServer() : ApplicationConstants.getInstance()
                        .getManagedNode();
                logger.debug("Connecting to registry on " + data.getHost() + " on port " + rmiPort + " for service " + serviceName);
                final Registry remoteRegistry = LocateRegistry.getRegistry(data.getHost(), rmiPort);
                server = (CepMediationServer) remoteRegistry.lookup(serviceName);

                data.setReachable(true);
                data.setServer(server);
                logger.debug("connect to server" + data + " succeeded");
                break;
            } catch (final Exception e) {
                logger.debug("connect to server" + data + ", attempt no: " + tryCount + " failed", e);
            }
        }

        // Check if connection to the server worked
        if (server == null) {
            throw new CouldNotConnectToRMIServiceException("Could not connect to server: " + data);
        }

        return server;
    }

}
