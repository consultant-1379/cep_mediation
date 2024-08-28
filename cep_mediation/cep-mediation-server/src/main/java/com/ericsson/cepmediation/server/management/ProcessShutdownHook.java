package com.ericsson.cepmediation.server.management;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.proc.config.ProcessConfigBean;
import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.service.Service;

/**
 * This class is a shutdown hook class that implements a thread that is run when a process is shutdown
 * with SIGINT (CTRL-C). It shuts down an CEP Mediation process in an orderly fashion by calling
 * the "stop" method on the process 
 * @author eeilfn
 *
 */
public class ProcessShutdownHook extends Thread {
    private static final Logger logger = LoggerFactory.getLogger(ProcessShutdownHook.class);

    // Keep a reference to the process services that this shutdown hook should act on
    private final ProcessConfigBean processConfigBean;

    protected ProcessShutdownHook(final ProcessConfigBean processConfigBean) {
        logger.debug("->ProcessShutdownHook(): processConfigBean=" + processConfigBean);
        this.processConfigBean = processConfigBean;
        logger.debug("<-ProcessShutdownHook()");
    }

    /**
     * This method is called when a shutdown signal has been issued on a process
     * running an CEP Mediation service
     */
    @Override
    public void run() {
        logger.debug("->ProcessShutdownHook.run() called on process:" + processConfigBean);

        // Flush standard output and standard error to output any pre-shutdown messages
        System.out.flush();
        System.err.flush();

        for (final ServiceConfigBean serviceBean : processConfigBean.getServices().values()) {
            Service instance;
            try {
                @SuppressWarnings("unchecked")
                final Class<Service> serviceClass = (Class<Service>) Class.forName(serviceBean.getClassDefinition());
                instance = serviceClass.newInstance();

                instance.stop();

                logger.debug("service stopped: " + serviceBean);
            } catch (final Exception e) {
                logger.debug("Stop of service failed:" + serviceBean, e);
            }
        }

        // Flush standard output and standard error to ensure any messages are read
        System.out.flush();
        System.err.flush();

        logger.debug("<-ProcessShutdownHook.run() process:" + processConfigBean);
    }

}
