package com.ericsson.cepmediation.base.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.proc.config.Ne;
import com.ericsson.cepmediation.base.proc.config.PROC_TYPE;
import com.ericsson.cepmediation.base.proc.config.ProcessConfigBean;
import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.base.properties.ConfigBinder;
import com.ericsson.cepmediation.base.properties.ConfigurationException;
import com.ericsson.cepmediation.base.util.ConfigData;
import com.ericsson.cepmediation.base.util.ErrorCode;
import com.ericsson.cepmediation.base.util.Utilities;

public abstract class ApplicationFactory {
    private static final String LOG4J_CONFIGURATION = "-Dlog4j.configuration=file://" + Utilities.getFileResource("app-config/log4j.properties");

    private static final String HAZELCAST_CONFIGURATION = "-Dhazelcast.config=" + Utilities.getFileResource("app-config/hazelcast.xml");

    private static final String INIT_MEM_SZ = "-Xms1024m";

    private static final String DEF_MEM_SZ = "-Xmx1024m";
    
    private static final String MAX_MEM = "max.mem";
    
    private static final String INIT_MEM = "init.mem";
    
    private static final String MEGABYTES_SIGN = "m";
    
    private static final String LOG_CONFIGURATION_FILE = "log.configuration.file";
    
    private static final boolean JMX_PROFILING_ON = CepMediationProperties.getBooleanProperty(CepMediationProperty.JMX_PROFILING_ON);
    
    private static final Integer JMX_PORT_STARTING_INDEX ;

    private static final String JMX_ENABLED = "-Dcom.sun.management.jmxremote=true";

    private static final String JMX_PORT = "-Dcom.sun.management.jmxremote.port=";

    private static final String SSL = "-Dcom.sun.management.jmxremote.ssl=false";

    private static final String AUTHENTICATE = "-Dcom.sun.management.jmxremote.authenticate=false";

    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(ApplicationFactory.class);

    private static final String JAVA_HOME = System.getProperty("java.home") + "/bin/java";

    private static final String PROC_MAN = "com.ericsson.cepmediation.server.management.ProcessManager";

    private static Map<Integer, CepMediationProcess> localProcessMap = new HashMap<Integer, CepMediationProcess>();

    private static Map<Integer, Process> remoteProcessMap = new HashMap<Integer, Process>();


	static
	{
		Integer jmxPort=null;
		try{
			jmxPort =Integer.parseInt(CepMediationProperties.getProperty(CepMediationProperty.JMX_PORT_STARTING_INDEX));

		}
		catch (Exception ex)
		{ // do nothing
		}

		JMX_PORT_STARTING_INDEX =jmxPort;
	}

    public static void destory() {
        for (final Process procs : remoteProcessMap.values()) {
            procs.destroy();
        }
    }

    /**
     * This method creates a process 
     * @param processType
     * @param processBean
     * @param data
     * @throws ServiceException
     */
    public static void create(final PROC_TYPE processType, final ProcessConfigBean processBean, final ConfigData data) throws ServiceException {
        logger.trace("create()-->");
        switch (processType) {
        case SERVER:
            runLocalProcess(processBean, data);
            break;
        case SLAVE:
            runRemoteProcess(processBean);
            break;

        default:
            logger.error("Unknown Process or service");
            throw new ServiceException("Unknown Process or service", ErrorCode.UNKNOWN_PROC);
        }
        logger.trace("create()<--");
    }

    /**
     * This method stops and removes a process 
     * @param processType
     * @param processBean
     * @throws ServiceException
     */
    public static void remove(final PROC_TYPE processType, final ProcessConfigBean processBean) throws ServiceException {
        logger.trace("remove()-->");
        switch (processType) {
        case SERVER:
            removeLocalProcess(processBean);
            break;
        case SLAVE:
            removeRemoteProcess(processBean);
            break;

        default:
            logger.error("Unknown Process or service");
            throw new ServiceException("Unknown Process or service", ErrorCode.UNKNOWN_PROC);
        }
        logger.trace("create()<--");
    }

    private static void runLocalProcess(final ProcessConfigBean processBean, final ConfigData data) throws ServiceException {
        logger.trace("runLocalProcess()-->");

        logger.debug("starting " + processBean.getServices().size() + " local services . . .");

        for (final ServiceConfigBean serviceLocal : processBean.getServices().values()) {
            try {
                final CepMediationProcess processInternal = (CepMediationProcess) Class.forName(serviceLocal.getClassDefinition()).newInstance();
                try {
                    processInternal.init(data, serviceLocal);
                } catch (final UnsupportedOperationException e) {
                    //ignore this and continue
                }
                processInternal.start();
                localProcessMap.put(serviceLocal.getServiceId(), processInternal);
                logger.debug("Started service: " + serviceLocal);
            } catch (final Exception e) {
                logger.error(e.getMessage(), e);
                throw new ServiceException(e.getMessage(), ErrorCode.FAILED_START_SERVICE);
            }
        }
        logger.trace("runLocalProcess()<--");
    }

    private static void removeLocalProcess(final ProcessConfigBean processBean) {
        logger.trace("removeLocalProcess()-->");

        logger.debug("stopping " + processBean.getServices().size() + " local services . . .");

        for (final ServiceConfigBean serviceLocal : processBean.getServices().values()) {
            // Find the service in the local service map
            final CepMediationProcess localProcess = localProcessMap.get(serviceLocal.getServiceId());

            // Check if the local service was found
            if (localProcess == null) {
                logger.debug("process for service not found: " + serviceLocal);
                continue;
            }

            // Stop the local process
            localProcess.stop();
            logger.debug("stopped process for service " + serviceLocal);
        }

        logger.debug("local services stopped");
        logger.trace("removeLocalProcess()<--");
    }

    private static void runRemoteProcess(final ProcessConfigBean processBean) throws ServiceException {
        logger.info("runRemoteProcess()-->");
        try {
            final Map<String, String> arguments = processBean.getArguments();
            String maxMem = DEF_MEM_SZ;
            String iniMem = INIT_MEM_SZ;
            String loggerPath = LOG4J_CONFIGURATION;
            String processId = getProcessId(processBean);
            final String processIdParameter = "-DprocessId=" + processId;
            if (arguments != null) {
                maxMem = arguments.get(MAX_MEM) + MEGABYTES_SIGN;
                maxMem = (maxMem == null || maxMem.trim().length() == 0) ? DEF_MEM_SZ : "-Xmx" + maxMem;
                iniMem = arguments.get(INIT_MEM) + MEGABYTES_SIGN;
                iniMem = (iniMem == null || iniMem.trim().length() == 0) ? INIT_MEM_SZ : "-Xms" + iniMem;
                loggerPath = arguments.get(LOG_CONFIGURATION_FILE);
                loggerPath = (loggerPath == null || loggerPath.trim().length() == 0) ? LOG4J_CONFIGURATION : "-Dlog4j.configuration=file://" + loggerPath;
            }
            String[] rootArguments = new String[] { JAVA_HOME, "-classpath", System.getProperty("java.class.path"), iniMem, maxMem};
            String[] processArguments = addAdditionalArguments(rootArguments, getMemoryHints(arguments.get("memoryHints")));
                        
            ArrayList<String> additionalArguments = new ArrayList<String>();
            additionalArguments.add(loggerPath);
            additionalArguments.add(processIdParameter);
            additionalArguments.add(HAZELCAST_CONFIGURATION);
            if (JMX_PROFILING_ON) {
            	additionalArguments.add(JMX_ENABLED);
            	additionalArguments.add(JMX_PORT + (JMX_PORT_STARTING_INDEX + Integer.parseInt(processId)));
            	additionalArguments.add(SSL);
            	additionalArguments.add(AUTHENTICATE);
            }
            additionalArguments.add(PROC_MAN);
            additionalArguments.add(processBean.persist());
            
            processArguments = addAdditionalArguments(processArguments, additionalArguments.toArray(new String[0]));
            logger.info("Launching process with " + Arrays.asList(processArguments));
            final ProcessBuilder pb = new ProcessBuilder(processArguments);

            final Process pr = pb.start();
            new ProcessMonitor(pr, processBean).start();
            remoteProcessMap.put(processBean.getProcessId(), pr);

        } catch (final Exception e) {
            throw new ServiceException("Failed to load the service", ErrorCode.FAILED_TO_LOAD_SERVICE);
        }
        logger.trace("runRemoteProcess()<--");
    }

    private static String[] addAdditionalArguments(String[] baseArguments, String[] additionalArguments) {
        if (additionalArguments == null) {
            return baseArguments;
        }
        return (String[]) ArrayUtils.addAll(baseArguments, additionalArguments);
    }

    private static String[] getMemoryHints(String memoryHints) {
        if (memoryHints == null || "".equalsIgnoreCase(memoryHints.trim())) {
            return null;
        }
        return memoryHints.split("#");
    }

    static String getProcessId(final ProcessConfigBean processBean) {
        return Integer.toString(processBean.getProcessId());
    }

    private static void removeRemoteProcess(final ProcessConfigBean processBean) {
        logger.trace("removeRemoteProcess()-->");

        logger.debug("stopping process " + processBean + " . . .");

        final Process remoteProcess = remoteProcessMap.get(processBean.getProcessId());

        // Check if the remote service was found
        if (remoteProcess == null) {
            logger.debug("running process for process not found: " + processBean);
            return;
        }

        try {
            // Stop child processes, if any, of the current process
            terminateChildProcesses(getProcessId(remoteProcess));
            // Destory the current process
            terminateProcess(getProcessId(remoteProcess));

            logger.debug("stopped running process for process " + processBean);
        } catch (final Exception e) {
            logger.error("stopping of running process for process failed: " + processBean, e);
        }

        logger.trace("removeRemoteProcess()<--");
    }

    public static void main(final String[] args) throws ServiceException {

        try {
            final ConfigBinder binder = ConfigBinder.getInstance();
            final ConfigData data = ConfigData.create(new Ne());
            for (final ProcessConfigBean process : binder.getAllLocalProcesses()) {
                ApplicationFactory.create(process.getProcessType(), process, data);
            }
        } catch (final Exception e) {
            throw new ServiceException("Failed to load the service", ErrorCode.FAILED_TO_LOAD_SERVICE);
        }
    }

    /**
     * Method to get the process ID of a process (works for unix/linux systems)
     * @param process The process for which to get the process ID
     * @return the process ID
     * @throws NoSuchFieldException 
     * @throws SecurityException 
     * @throws IllegalAccessException 
     * @throws IllegalArgumentException 
     */
    public static int getProcessId(final Process process) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        logger.debug("-> getPid: getting process ID of process " + process);

        // Check this is a unix process
        if (!process.getClass().getName().equals("java.lang.UNIXProcess")) {
            logger.debug("process is not a unix process " + process);
            // This process is not a unix process
            return -1;
        }

        // Get the pid field
        final Field pidField = process.getClass().getDeclaredField("pid");
        pidField.setAccessible(true);

        // Get and return the pid
        return (Integer) pidField.get(process);
    }

    /**
     * Method to terminate all child processes (works for unix/linux systems)
     * @param processId The process Id of the parent process 
     * @return the pkill exit status
     * @throws IOException 
     * @throws InterruptedException 
     */
    protected static int terminateChildProcesses(final int processId) throws Exception {
        // The pkill -P option kills all child processes of the process with the given pid.
        // This method is used by Probe team to terminate their spawned child processes
        // if the process with the given process id does not have child process. e.g., CEP process, 
        // then pkill will return immediately 
        return Runtime.getRuntime().exec("pkill -TERM -P " + processId).waitFor();
    }

    /**
     * Method to terminate the current running process
     * @param processId
     * @return
     * @throws Exception
     */
    protected static int terminateProcess(int processId) throws Exception {
        return Runtime.getRuntime().exec("kill -9 " + processId).waitFor();
    }

	// return a local process map -- local process means the sub process of current jvm
	public static Map<Integer, CepMediationProcess> getLocalProcessMap() {
		return localProcessMap;
	}
	public static HashMap<String,InstanceGroup>  getPortNumberInstanceMap() throws ConfigurationException {

		HashMap<String, InstanceGroup> portNumberInstancesMap = new HashMap<String, InstanceGroup>();
		Map<Integer, CepMediationProcess> map = ApplicationFactory.getLocalProcessMap();
		for (Integer key : map.keySet()) {
			CepMediationProcess cepMediationProcess = map.get(key);
			if (cepMediationProcess instanceof PCPService) {
				PCPService pcpService = (PCPService) cepMediationProcess;
				String portNumber = pcpService.getServiceExecuterInstance().getPortNumber();
				InstanceGroup instanceGroup = portNumberInstancesMap.get(portNumber);
				if (instanceGroup == null) {
					instanceGroup = new InstanceGroup();
				}
				instanceGroup.addInstance(pcpService);

				portNumberInstancesMap.put(portNumber, instanceGroup);
			}
		}
		return  portNumberInstancesMap;
	}

}

class ProcessMonitor extends Thread {
    private static final Logger logger = LoggerFactory.getLogger(ProcessMonitor.class);

    private final Process process;

    private final ProcessConfigBean processBeanCurrent;

    ProcessMonitor(final Process pb, final ProcessConfigBean processBean) {
        process = pb;
        processBeanCurrent = processBean;
    }

    @Override
    public void run() {
        try {
            final BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String result = "";
            while ((result = reader.readLine()) != null) {
                logger.info("Process:" + processBeanCurrent.getProcessId() + result);
            }

            final BufferedReader errrorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            String errorResult = "";
            while ((errorResult = errrorReader.readLine()) != null) {
                logger.info("Process:" + processBeanCurrent.getProcessId() + errorResult);
            }
        } catch (final Exception e) {
            logger.error("Error in running process", e);
        }
    }




}