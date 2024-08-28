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
package com.ericsson.cepmediation.server.management;

/**
 * 
 * This Remote interface identifies the CEP Mediation remote methods exposed, that can be used
 * by the Admin/slave servers of CEP Mediation to manage each other over RMI-IIOP protocol
 * 
 * @category Management Server
 * @since 20/05/2011
 * @author eachsaj
 * 
 */

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import com.ericsson.cepmediation.base.proc.config.ProcessConfigBean;

public interface CepMediationServer extends Remote {
    /**
     * This method used to pass the file collection and parsing information between Admin
     * server and slaves. 
     * 
     * The ProcessBean objects are modified by the Load Balancer server of the 
     * Admin Server. This modified Parsing process objects contains the allocated 
     * nodes and that slaver server is responsible for collecting and parsing
     * the network data
     * @param data 
     *           List of {@link ProcessConfigBean} instance .
     * @throws RemoteException
     *             if the system fails to access/execute this method
     */

    void configure(List<ProcessConfigBean> data) throws RemoteException;

    /**
     * This method used to register many slave servers to admin server and 
     * admin server to the slaver server
     * 
     *This method monitoring the each other every 5 mins.
     * 
     * @param access is an instance AgentData bean, contains basic access 
     * information of a CEP Mediation server @see {@link AgentData}
     * @return True, if the registration process is successful.
     * @throws RemoteException, if the system fails to access/execute this method
     */
    void register(AgentData agentData) throws RemoteException;

    /**This method removes the monitors so the server become unmanaged.
     * @param agentData is an instance AgentData bean
     * @throws RemoteException,if the system failed to execute this method
     */
    void unRegister(AgentData agentData) throws RemoteException;

    /**this method is used to rm the health check between servers.
     * @return boolean if the server is active otherwise an exception
     * @throws RemoteException, if the remote server is down
     */
    boolean isAlive() throws RemoteException;

    /**
     * this method is used to stop server by hyperic and if the user issues the stop command
     * 
     * @throws RemoteException, if the remote server is failed to start
     */
    void stop() throws RemoteException;

    /**this method is used to stop server by hyperic
     * @throws RemoteException, if the remote server is down or failed to stop
     */
    void start() throws RemoteException;

}
