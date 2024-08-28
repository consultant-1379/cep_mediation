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

import java.rmi.RemoteException;
import java.rmi.UnmarshalException;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.proc.config.HostConfigBean;
import com.ericsson.cepmediation.base.proc.config.ProcessConfigBean;
import com.ericsson.cepmediation.base.properties.ConfigBinder;
import com.ericsson.cepmediation.base.properties.ConfigurationException;
import com.ericsson.cepmediation.base.service.ServiceException;
import com.ericsson.cepmediation.base.status.StartStopStatusUpdate;
import com.ericsson.cepmediation.base.util.constants.SystemExitCode;
import com.ericsson.cepmediation.server.management.status.startupstatus.MonitorCentre;
import com.ericsson.cepmediation.server.management.util.AdminHelper;
import com.ericsson.cepmediation.server.management.util.CouldNotConnectToRMIServiceException;

/**
 * 
 * This class can start and stop the slave servers
 * 
 * @category Perfmon Management Server
 * @since 20/05/2011
 * @author eachsaj
 * 
 */

public class SlaveHostManagementServer extends ManagementServerImpl {
    private static final Logger logger = LoggerFactory.getLogger(SlaveHostManagementServer.class);

    SlaveHostManagementServer() {
        super();

    }

    /**
     * This method can stop or start a slave server.
     * @param start True for start, false for stop
     */
    public static void startStop(final boolean startStopFlag) {
        logger.debug("startStop()-->");

        try {
            // configure the logger
            BasicConfigurator.configure();

            // Get the data for the slave
            final SlaveHostManagementServer slaveServer = new SlaveHostManagementServer();
            final AgentData slaveData = slaveServer.getNodeData();
            slaveData.setAdminServer(false);
            slaveData.setHost(ConfigBinder.getInstance().getLocalHostName());

            // create a connection to master server
            final AgentData masterData = new AgentData();
            masterData.setAdminServer(true);

            // Get master server configuration
            final HostConfigBean masterServerConfigBean = ConfigBinder.getInstance().getMasterHostConfig();
            // Check whether IP address or host name is used
            if (masterServerConfigBean.getHost() != null && masterServerConfigBean.getHost().length() > 0) {
                // Use host name
                masterData.setHost(masterServerConfigBean.getHost());
            } else {
                // Use IP address
                masterData.setHost(masterServerConfigBean.getIp());
            }

            if (startStopFlag) {
                logger.debug("Management Slave Node starting");

                // start server
                slaveServer.startServer();

                // register with the master server
                final CepMediationServer masterServer = AdminHelper.connect(masterData);
                logger.debug("registering slave with data:" + slaveData);
                masterServer.register(slaveData);
                logger.debug("Slave Node started");
                logger.debug("main()<--");
            } else {
                logger.debug("Management Slave Node stopping");

                try {
                    // Unregister from the master server
                    final CepMediationServer masterServer = AdminHelper.connect(masterData);
                    masterServer.unRegister(slaveData);
                } catch (final Exception e) {
                    logger.error("Failed to connect to master server:" + e.getMessage(), e);
                }

                // Stop this slave server
                final CepMediationServer runningSlaveServer = AdminHelper.connect(slaveData);
                runningSlaveServer.stop();

                logger.debug("Slave Node stopped");
                logger.debug("main()<--");
            }

        } catch (final UnmarshalException e) {
            // Ignore Marshalling exceptions
        } catch (final Exception e) {
            sendStatusUpdate(StartStopStatusUpdate.FAILED_TO_START_STOP_SLAVE);
            logger.error("Failed to start/stop the server:" + e.getMessage(), e);
            System.exit(SystemExitCode.SYSTEM_EXIT_CODE_NOK.getValue());
        }

        sendStatusUpdate(StartStopStatusUpdate.SUCCESSFULLY_STARTED_STOPPED_SLAVE);
        logger.debug("startStop()<--");
    }

    private static void sendStatusUpdate(final StartStopStatusUpdate statusUpdate) {
        MonitorCentre.getMonitor().statusUpdate(statusUpdate);
    }

    protected void startService() {
        logger.debug("startService()-->");
        logger.debug("Waiting for Admin Server to configure.");
        logger.debug("startServer()<--");
    }

    @Override
    public void configure(final List<ProcessConfigBean> data) throws RemoteException {
        logger.debug("configure()-->");
        logger.debug("Configuring the Management Node");
        try {
            if (data == null || data.size() == 0) {
                logger.debug("No process configuration information found");
                super.startProcesses();
                return;
            }
            // get all process of this slave server
            getConfinguration().resetProcessInfo(data);
            super.startProcesses();
        } catch (final ServiceException e) {
            logger.error("Failed to start Services reason:\n" + e.getMessage());
            throw new RemoteException("Failed to start Services reason \n" + e.getMessage());
        }
        logger.debug("configure()<--");
    }

    @Override
    protected ManagementServerImpl getObject() {
        return this;
    }

    @Override
    protected String getServerType() {
        return "ManagedNode";
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.ericsson.cepmediation.server.management.PerfmonServer#isAlive()
     */
    @Override
    public boolean isAlive() throws RemoteException {
        return true;
    }

    @Override
    protected void init(final String serviceName) throws AdminException, ConfigurationException {
        super.init(getServerType());
        super.makeSlaveServer();
    }

    @Override
    public void register(final AgentData agentData) throws RemoteException {
        logger.debug("register(" + agentData.toString() + ")-->");
        // flag to enable the monitor
        agentData.enableMonitor();

        try {// register with admin server.
            getRegister().register(agentData);
        } catch (final CouldNotConnectToRMIServiceException e) {
            logger.error(e.getMessage());
            throw new RemoteException("Registration process failed for " + agentData.getHost() + "");
        }
        logger.debug("Registration done");
        logger.debug("register(" + agentData.toString() + ")<--");
    }

    /**
     * this method starts the Load balancer service and this use case only
     * applicable to the AdminServer
     * 
     * @throws ServiceException
     */
    @Override
    protected void startLoadBalancer() throws ServiceException {
    }

    @Override
    protected void startServerMonitor() {
        // adding the monitor as an observer to the registry
        // so if any adding to the registry will start a monitoring thread
        logger.debug("startServerMonitor()-->");
        getRegister().addObserver(getMonitor());
        logger.debug("Server monitor started");
        logger.debug("startServerMonitor()<--");
    }

    @Override
    protected void stopServerMonitor() {
        logger.debug("stopServerMonitor()-->");
        getMonitor().stopMonitor();
        getRegister().deleteObserver(getMonitor());
        logger.debug("Server monitor stoppped");
        logger.debug("stopServerMonitor()<--");
    }

    @Override
    public void unRegister(final AgentData agentData) throws RemoteException {
        logger.debug("unRegister(" + agentData + ")-->");
        agentData.disableMonitor();
        getRegister().unRegister(agentData.getHost());
        logger.debug("unRegister(" + agentData + ")<--");

    }
}
