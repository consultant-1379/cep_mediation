package com.ericsson.cepmediation.server.management;

import java.util.Arrays;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.proc.config.Ne;
import com.ericsson.cepmediation.base.proc.config.ProcessConfigBean;
import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.service.Service;
import com.ericsson.cepmediation.base.service.ServiceException;
import com.ericsson.cepmediation.base.util.ConfigData;
import com.ericsson.cepmediation.base.util.ErrorCode;
import com.ericsson.cepmediation.base.util.FileUtils;

public abstract class ProcessManager {
    private static final Logger logger = LoggerFactory.getLogger(ProcessManager.class);

    public static void main(final String[] args) throws ServiceException {
        logger.trace("--->ProcessManager():" + Arrays.toString(args));

        BasicConfigurator.configure();
        final String beanPath = args[0];
        final ProcessConfigBean bean = (ProcessConfigBean) FileUtils.restoreObject(beanPath);

        for (final ServiceConfigBean serviceBean : bean.getServices().values()) {
            Service instance;
            try {
                @SuppressWarnings("unchecked")
                final Class<Service> serviceClass = (Class<Service>) Class.forName(serviceBean.getClassDefinition());
                instance = serviceClass.newInstance();

                init(serviceBean, instance);
                instance.start();

                logger.debug("service started: " + serviceBean);
            } catch (final Exception e) {
                logger.debug("Start of service failed:" + serviceBean, e);
                throw new ServiceException(e.getMessage(), ErrorCode.PROC_INIT_FAILED);
            }
        }

        // Add a shutdown hook for controlled shutdown of this class in a process
        final ProcessShutdownHook processShutdownHook = new ProcessShutdownHook(bean);
        Runtime.getRuntime().addShutdownHook(processShutdownHook);

        logger.trace("ProcessManager() <---");
    }

    private static void init(final ServiceConfigBean serviceBean, final Service instance) throws ServiceException {
        try {
            instance.init(ConfigData.create(new Ne()), serviceBean);
        } catch (final UnsupportedOperationException e) {

        }
    }

}
