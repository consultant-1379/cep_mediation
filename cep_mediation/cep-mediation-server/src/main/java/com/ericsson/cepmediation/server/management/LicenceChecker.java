package com.ericsson.cepmediation.server.management;

import java.util.Collection;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.features.CepFeature;
import com.ericsson.cepmediation.base.features.impl.FeatureManagerImpl;
import com.ericsson.cepmediation.base.properties.ConfigurationException;
import com.ericsson.cepmediation.base.status.StartStopStatusUpdate;
import com.ericsson.cepmediation.base.util.constants.SystemExitCode;
import com.ericsson.cepmediation.server.management.status.startupstatus.MonitorCentre;

public class LicenceChecker implements Runnable {
    private static final Logger logger = LoggerFactory.getLogger(LicenceChecker.class);

    private static final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() {
        @Override
        public Thread newThread(final Runnable r) {
            return new Thread(r, "licence-check-thread");
        }
    });

    public LicenceChecker() {
        if (!checkLicence()) {
            MonitorCentre.getMonitor().statusUpdate(StartStopStatusUpdate.FAILED_TO_VERIFY_LICENCE);
            logger.error("Not valid licence! Exiting...");
            System.exit(SystemExitCode.SYSTEM_EXIT_CODE_NOK.getValue());
        }
        startLicenceChecker();
    }

    private boolean checkLicence() {
        Collection<CepFeature> enabledFeatures = FeatureManagerImpl.getInstance().getEnabledFeatures();
        if (enabledFeatures.isEmpty()) {
            logger.error("No enabled features were defined!");
            return false;
        }
        logger.info("Enabled features: " + enabledFeatures);

        return true;
    }

    private void startLicenceChecker() {
        logger.info("Starting licence checker...");
        long licenceReloadInterval = FeatureManagerImpl.getInstance().getLicenceReloadInterval();
        // give licence thread some additional delay to make sure that licence reloading had finished when the licence check starts.
        long initialDelay = licenceReloadInterval + 5 * 60 * 1000;
        logger.info("Licence check will start after: " + initialDelay + " and will be done every " + licenceReloadInterval + " millis.");
        executor.scheduleAtFixedRate(this, initialDelay, licenceReloadInterval, TimeUnit.MILLISECONDS);
        logger.info("Licence checker started!");
    }

    @Override
    public void run() {
        logger.info("Checking licence...");
        if (!checkLicence()) {
            try {
                logger.info("Stopping application...");
                ApplicationStartStop.main(new String[] { "stop" });
                logger.info("Application is stopped!");
            } catch (final ConfigurationException e) {
                logger.error("Error stopping application!", e);
            }
        } else {
            logger.info("Licence is valid!");
        }
    }

}
