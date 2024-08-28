package com.ericsson.cepmediation.server.management;

import com.ericsson.cepmediation.base.proc.config.Ne;
import com.ericsson.cepmediation.base.proc.config.ProcessConfigBean;
import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.base.properties.ConfigBinder;
import com.ericsson.cepmediation.base.properties.ConfigurationException;
import com.ericsson.cepmediation.base.service.ServiceException;
import com.ericsson.cepmediation.base.util.ConfigData;
import com.ericsson.cepmediation.base.util.ErrorCode;
import com.ericsson.cepmediation.base.util.constants.SystemExitCode;
import com.ericsson.cepmediation.config.bean.NetworkElement;
import com.ericsson.cepmediation.server.management.helper.NodeMonitor;
import com.ericsson.cepmediation.server.management.helper.SystemRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 * @author eachsaj
 *
 */
abstract class ManagementServerImpl implements CepMediationServer {

    private int rmiPort;

    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(ManagementServerImpl.class);

    final ConfigBinder configBinder;

    private ConfigData configurationData;

    private NodeMonitor monitor;

    // system Register
    private final AgentData nodeData = new AgentData();

    //system registry for the slave servers
    private SystemRegistry register;

    // a process executer for all processes defined for this server
    private ProcessLoader processLoader;

    ManagementServerImpl() {
        configBinder = getConfigBinderInstance(); //NOPMD eemecoy necessary to get class under test
        setRMIServerHostName();
        setRMIPort(); //NOPMD eemecoy necessary to get class under test
    }

    void setRMIPort() {
        rmiPort = CepMediationProperties.getIntProperty(CepMediationProperty.JAVA_RMI_SERVER_PORT);
    }

    ConfigBinder getConfigBinderInstance() {
        return ConfigBinder.getInstance();
    }

    /**
     * This static initialiser sets the property java.rmi.server.hostname
     * to bind the correct ip address instead of the localhost address while
     * binding the remote object.
     *   
     */
    private void setRMIServerHostName() {
        System.setProperty("java.rmi.server.hostname", configBinder.getLocalHostName());
        logger.debug("property set to: " + configBinder.getLocalHostName());
    }

    /**This method is to configure the slave servers by admin server after the registration
     * if there is any Loading service enabled in the slave server, admin server assigns the
     * modified process of that slave server with number of enodeBs to be managed.
     * @throws RemoteException 
     * 
     */
    @SuppressWarnings("unused")
    @Override
    public void configure(final List<ProcessConfigBean> data) throws RemoteException {
        // there is no need to synch back the data from slaves to Master
    }

    protected ConfigBinder getConfinguration() {
        return configBinder;
    }

    public ConfigData getConfurationData() {
        return configurationData;
    }

    public NodeMonitor getMonitor() {
        return monitor;
    }

    public AgentData getNodeData() {
        return nodeData;
    }

    public void makeAdminServer() {
        nodeData.setAdminServer(true);
    }

    public void makeSlaveServer() {
        nodeData.setAdminServer(false);
    }

    protected abstract ManagementServerImpl getObject();

    public SystemRegistry getRegister() {
        return register;
    }

    protected abstract String getServerType();

    protected void init(final String serviceName) throws AdminException {
        logger.debug("init(" + serviceName + ")-->");

        try {
            //register the local object
            UnicastRemoteObject.exportObject(getObject(), 0);
            //default registry
            final Registry registry = LocateRegistry.createRegistry(rmiPort);
            registry.bind(serviceName, getObject());

            //system registry for all slaves or single admin server for slaves
            register = SystemRegistry.getInstance();
            //system monitor 
            monitor = new NodeMonitor();
            configurationData = ConfigData.create(new Ne(new NetworkElement()));
            nodeData.setHost(ConfigBinder.getInstance().getLocalHostName());
            processLoader = ProcessLoader.getInstance();
            processLoader.init(configurationData);

            logger.debug(serviceName + " inialised.");
        } catch (final RemoteException e) {
            logger.error("Error:", e);
            throw new AdminException("Failed to start RMI regisrty on port number " + rmiPort,
                    ErrorCode.FAILED_TO_START_SERVER);
        } catch (final AlreadyBoundException e) {
            logger.error("Error:", e);
            throw new AdminException(" The " + getServerType() + " is already started",
                    ErrorCode.FAILED_TO_START_SERVER);
        }
        logger.debug("init(" + serviceName + ")<--");
    }

    /**
     * this method starts the Load balancer service and this use case only
     * applicable to the AdminServer
     * 
     * @throws ServiceException
     */
    protected abstract void startLoadBalancer() throws ServiceException;

    /**This is template method for starting server
     */
    protected void startServer() throws AdminException, ConfigurationException, ServiceException {
        logger.debug("startServer()-->");
        //initialise for admin and slave server
        init(getServerType());
        // start local services of this services, if any. its only applicable to admin server
        startLoadBalancer();
        //start server monitoring
        startServerMonitor();
        logger.debug("Server  started.");
        logger.debug("startServer()<--");
    }

    /**
     * server monitoring all slaves
     */
    protected abstract void startServerMonitor();

    /**This method to start the services
     * @throws ServiceException
     */
    protected void startProcesses() throws ServiceException {
        logger.debug("startProcesses()-->");

        if (processLoader != null) {
            processLoader.startProcesses();
            logger.debug("processes started");
        } else {
            logger.debug("no processes found");
        }
        logger.debug("startProcesses()<--");
    }

    /**This is template method for stopping server
     */
    protected void stopServer() {
        logger.debug("stopServer()-->");

        if (processLoader != null) {
            stopProcesses();
            logger.debug("processes stopped");
        } else {
            logger.debug("no processes found");
        }
        stopServerMonitor();
        logger.debug("stopServer()<--");
    }

    /**
     * this method to stop the server monitoring process
     */
    protected abstract void stopServerMonitor();

    /**
     * this method stops all services
     */
    protected void stopProcesses() {
        try {
            logger.debug("stopProcesses()-->");
            logger.debug("Stopping processes . . .");
            processLoader.stopProcesses();
            logger.debug("Processes stopped");
            logger.debug("stopProcesses()<--");
        } catch (final Exception e) {
            logger.error("Fail to stop processes.", e);
        }
    }

    @Override
    public void stop() {
        logger.debug("stop()-->");
        try {
            stopServer();
        } catch (final Exception e) {
            logger.error("Exception stopping server", e);
            System.exit(SystemExitCode.SYSTEM_EXIT_CODE_NOK.getValue());
        }
        System.exit(SystemExitCode.SYSTEM_EXIT_CODE_OK.getValue());
        logger.debug("stop()<--");
    }

    /* This remote method to start the server through hyperic
     * @see com.ericsson.cepmediation.server.management.PerfmonServer#start()
     */
    @Override
    public void start() throws RemoteException {
        logger.debug("start()-->");
        try {
            startServer();
        } catch (final Exception e) {
            logger.error("Fail to start server, please check log.");
            throw new RemoteException(e.getMessage());
        }
        logger.debug("start()<--");
    }
}
