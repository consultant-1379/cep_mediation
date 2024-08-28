package com.ericsson.cepmediation.server.management;

import com.ericsson.cepmediation.base.proc.config.ProcessConfigBean;
import com.ericsson.cepmediation.base.properties.ConfigBinder;
import com.ericsson.cepmediation.base.properties.ConfigurationException;
import com.ericsson.cepmediation.base.service.SERVICES;
import com.ericsson.cepmediation.base.service.ServiceException;
import com.ericsson.cepmediation.base.service.ServiceExecuter;
import com.ericsson.cepmediation.base.statistics.StatisticsCollector;
import com.ericsson.cepmediation.base.status.StartStopStatusUpdate;
import com.ericsson.cepmediation.base.util.constants.ApplicationConstants;
import com.ericsson.cepmediation.base.util.constants.SystemExitCode;
import com.ericsson.cepmediation.server.management.status.startupstatus.Monitor;
import com.ericsson.cepmediation.server.management.status.startupstatus.MonitorCentre;
import com.ericsson.cepmediation.server.management.util.AdminHelper;
import com.ericsson.cepmediation.server.management.util.CouldNotConnectToRMIServiceException;
import com.ericsson.cepmediation.server.service.ServiceExecuterFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;
import java.rmi.UnmarshalException;
import java.util.*;

public class MasterHostManagementServer extends ManagementServerImpl {
    static final Logger logger = LoggerFactory.getLogger(MasterHostManagementServer.class);

    private Timer managedNodeMonitor = null;

    final Map<String, AgentData> nodesServerMapping = new HashMap<String, AgentData>();

    MasterHostManagementServer() {
        super();
    }

    public Map<String, AgentData> getNodesServerMapping() {
        return nodesServerMapping;
    }

    @Override
    protected void init(final String serviceName) throws AdminException, ConfigurationException {
        super.init(serviceName);
        super.makeAdminServer();
    }

    /**
     * This method can stop or start a server
     * Warning - if exception caught, this method will call System.exit() and shut down the JVM
     * 
     * @param start True for start, false for stop
     */
    public void startStop(final boolean startStopFlag) {
        logger.debug("startStop()-->");

        if (startStopFlag) {
            startMasterHostManagementServer();
        } else {
            stopMasterHostManagementServer();
        }

        logger.debug("startStop()<--");
    }

    private void stopMasterHostManagementServer() {
        try {
            logger.debug("Management Master Node stopping . . .");
            final AgentData masterServerData = createAgentData();

            masterServerData.setHost(configBinder.getLocalHostName());
            masterServerData.setAdminServer(true);
            final CepMediationServer server = getRemoteCepMediationServerObject(masterServerData);
            //unregister from any live slaves
            dettachAllSlaves(masterServerData);

            server.stop();
        } catch (final UnmarshalException e) {
            logger.debug("Expected exception caught (application will shut down before successfully completing the RMI stop() method", e);
        } catch (final Exception e) {
            logErrorAndExitSystem(StartStopStatusUpdate.FAILED_TO_SUCCESSFULLY_STOP_APPLICATION, e);
        }
        sendStatusUpdate(StartStopStatusUpdate.SUCCESSFULLY_STOPPED_APPLICATION);

    }

    private void logErrorAndExitSystem(final StartStopStatusUpdate statusUpdate, final Exception e) {
        sendStatusUpdate(statusUpdate);
        logger.error("Failed to start/stop the server, Reason:\n" + e.getMessage(), e);
        exitSystem(SystemExitCode.SYSTEM_EXIT_CODE_NOK.getValue());
    }

    void exitSystem(final int exitCode) {
        System.exit(exitCode);
    }

    private void startMasterHostManagementServer() {
        logger.debug("Management Master Node starting . . .");
        try {
            startServer();
            startProcesses();
            startToCollectStatistics();
            sendStatusUpdate(StartStopStatusUpdate.SUCCESSFULLY_STARTED_APPLICATION);
        } catch (final Exception e) {
            logErrorAndExitSystem(StartStopStatusUpdate.FAILED_TO_START_APPLICATION, e);
        }
    }

    CepMediationServer getRemoteCepMediationServerObject(final AgentData masterServerData) throws CouldNotConnectToRMIServiceException {
        return AdminHelper.connect(masterServerData);
    }

    AgentData createAgentData() {
        return new AgentData();
    }

    private void sendStatusUpdate(final StartStopStatusUpdate statusUpdate) {
        final Monitor monitor = getStartupStatusMonitor();
        monitor.statusUpdate(statusUpdate);
    }

    Monitor getStartupStatusMonitor() {
        return MonitorCentre.getMonitor();
    }

    void startToCollectStatistics() {
        if (StatisticsCollector.isStatsCollectOn()) {
            new Thread(new StatisticsCollector()).start();
        }
    }

    private void dettachAllSlaves(final AgentData dataToconnect) throws RemoteException {
        for (final String ip : getNodesServerMapping().keySet()) {
            try {
                final AgentData data = getNodesServerMapping().get(ip);
                CepMediationServer slaves = getRemoteCepMediationServerObject(data);
                slaves.unRegister(dataToconnect);
                slaves = null;
            } catch (final CouldNotConnectToRMIServiceException e) {
                //ignore this
            }
        }
    }

    @Override
    public void configure(@SuppressWarnings("unused")
    final List<ProcessConfigBean> data) {
        throw new UnsupportedOperationException("This method execution not allowed on Admin Server");
    }

    /*
     * returns the instance of this class, this method used the system to regi
     */
    @Override
    protected ManagementServerImpl getObject() {
        logger.debug("getObject()-->");
        logger.debug("getObject()<--");
        return this;
    }

    @Override
    protected String getServerType() {
        logger.debug("getServerType()-->");
        logger.debug("getServerType()<--");
        logger.debug("Server type is AdminServer");
        return ApplicationConstants.getInstance().getAdminServer();
    }

    @SuppressWarnings("unused")
    @Override
    public boolean isAlive() throws RemoteException {
        return true;
    }

    @Override
    public void register(final AgentData agentData) throws RemoteException {
        logger.debug("register(" + agentData.toString() + ")-->");
        agentData.enableMonitor();
        try {
            getRegister().register(agentData);
            logger.debug("Registration done for " + agentData.getHost());
        } catch (final CouldNotConnectToRMIServiceException e1) {
            throw new RemoteException("Error while registering the server " + agentData.getHost() + " Reason:\n" + e1.getMessage());
        }
        attachSlave(agentData);
        logger.debug("register(" + agentData.toString() + ")<--");
    }

    private void attachSlave(final AgentData agentData) throws RemoteException {
        logger.debug("attachSlave(" + agentData.toString() + ")-->");
        nodesServerMapping.put(agentData.getHost(), agentData);
        final String ip = agentData.getHost();
        final AgentData mserverData = createAgentData();
        mserverData.setHost(ConfigBinder.getInstance().getLocalHostName());
        mserverData.enableMonitor();
        mserverData.setAdminServer(true);

        final List<ProcessConfigBean> loadingServices = getConfinguration().findLoadingServicesByIP(ip);
        logger.debug("Total number loading services for the server  is " + loadingServices.size());
        final AgentData remoteNodeData = nodesServerMapping.get(ip);
        logger.debug("Registering the server " + agentData.getHost());
        final CepMediationServer remoteNode = remoteNodeData.getServer();
        //asking slave to register the server
        remoteNode.register(mserverData);
        logger.debug("Server Registation completed");
        remoteNode.configure(loadingServices);
        logger.debug("Configuration done for  server " + agentData.getHost());

        logger.debug("attachSlave(" + agentData.toString() + ")<--");
    }

    @Override
    protected void startLoadBalancer() throws ServiceException {
        final ServiceExecuter loadBalancer = ServiceExecuterFactory.createService(SERVICES.LOAD_BAL_SERVICE);
        loadBalancer.init(getConfurationData(), null);
        loadBalancer.execute();
    }

    @Override
    protected void startServerMonitor() {
        getRegister().addObserver(getMonitor());
        managedNodeMonitor = new Timer();
        managedNodeMonitor.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                for (final String ip : nodesServerMapping.keySet()) {
                    if (!nodesServerMapping.get(ip).isReachable()) {
                        nodesServerMapping.remove(ip);
                        logger.debug("Managed Server " + ip + " is down, so Admin server performing recofigurtion");
                        // run the load balancer again, if the this node has any parsing service re-assign all nodes.
                    }
                }
            }
        }, 0, 5 * 60 * 1000);

    }

    @Override
    protected void stopServerMonitor() {
        managedNodeMonitor.cancel();
    }

    @SuppressWarnings("unused")
    @Override
    public void unRegister(final AgentData agentData) throws RemoteException {
        logger.debug("unregister(" + agentData.toString() + ")-->");

        agentData.disableMonitor();
        getRegister().unRegister(agentData.getHost());
        nodesServerMapping.remove(agentData.getHost());

        logger.debug("unregister(" + agentData.toString() + ")<--");
    }

}
