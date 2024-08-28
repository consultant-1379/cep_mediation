/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.util.ResourceLoadingUtilities;
import com.espertech.esper.client.Configuration;
import com.espertech.esper.client.EPServiceDestroyedException;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.deploy.DeploymentException;
import com.espertech.esper.client.deploy.DeploymentOptions;
import com.espertech.esper.client.deploy.DeploymentOrder;
import com.espertech.esper.client.deploy.DeploymentOrderOptions;
import com.espertech.esper.client.deploy.DeploymentResult;
import com.espertech.esper.client.deploy.EPDeploymentAdmin;
import com.espertech.esper.client.deploy.Module;
import com.espertech.esper.client.deploy.ParseException;

/**
 * @author eemecoy
 *
 */
public class EsperInitialization {
    private static final Logger logger = LoggerFactory.getLogger(EsperInitialization.class);

    public static EPServiceProvider configureEngine(final String... epls) throws EPServiceDestroyedException, IOException, ParseException, DeploymentException {
        logger.info("Running epl " + Arrays.asList(epls));
        Configuration esperConfiguration = new EsperConfigurationForTest().getEsperConfiguration();
        final EPServiceProvider epServiceProvider = EPServiceProviderManager.getDefaultProvider(esperConfiguration);
        epServiceProvider.initialize();
        for (String epl : epls) {
            final InputStream inputFile = getInputStream(epl);
            epServiceProvider.getEPAdministrator().getDeploymentAdmin().readDeploy(inputFile, null, null, null);
        }
        return epServiceProvider;

    }

    public static EPServiceProvider configureModule(final String moduleName) throws EPServiceDestroyedException, IOException, ParseException,
            DeploymentException {
        logger.info("Running epl " + moduleName);
        Configuration esperConfiguration = new EsperConfigurationForTest().getEsperConfiguration();
        EPServiceProvider epServiceProvider = EPServiceProviderManager.getDefaultProvider(esperConfiguration);
        EPDeploymentAdmin deployAdmin = epServiceProvider.getEPAdministrator().getDeploymentAdmin();
        List<Module> radioModules = getRadioModules(deployAdmin);
        DeploymentOrder order = deployAdmin.getDeploymentOrder(radioModules, new DeploymentOrderOptions());
        DeploymentOptions deploymentOptions = new DeploymentOptions();
        deploymentOptions.setValidateOnly(true); // validate leaving no started statements
        deploymentOptions.setFailFast(false); // do not fail on first error
        for (Module module : order.getOrdered()) {
            DeploymentResult deploymentResult = deployAdmin.deploy(module, deploymentOptions);
        }
        return epServiceProvider;
    }

    private static List<Module> getRadioModules(EPDeploymentAdmin deployAdmin) throws IOException, ParseException {
        List<Module> radioModules = new ArrayList<Module>();
        radioModules.add(deployAdmin.read(getInputStream("esper/rrc.epl"), null));
        radioModules.add(deployAdmin.read(getInputStream("esper/rc.epl"), null));
        radioModules.add(deployAdmin.read(getInputStream("esper/vc.epl"), null));
        radioModules.add(deployAdmin.read(getInputStream("esper/re.epl"), null));
        return radioModules;
    }

    private static InputStream getInputStream(final String fileName) throws FileNotFoundException {
        final InputStream inputStream = ResourceLoadingUtilities.getInputStreamForResourceOnClassPath(fileName);
        if (inputStream == null) {
            throw new FileNotFoundException("Could not find file " + fileName + " on the classpath");
        }
        return inputStream;
    }

}
