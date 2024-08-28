package com.ericsson.cepmediation.evolution.core;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.features.impl.FeatureManagerImpl;
import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.base.properties.ConfigBinder;
import com.ericsson.cepmediation.evolution.common.Host;
import com.ericsson.cepmediation.evolution.network.NetworkManager;
import com.ericsson.cepmediation.evolution.network.XmlGenerator;
import com.ericsson.cepmediation.evolution.os.HostManager;
import com.ericsson.cepmediation.evolution.os.MemoryRecommender;
import com.ericsson.cepmediation.evolution.os.ProcessPlanner;

/**
 * Main class for network evolution
 * 
 * @author exuexie
 *
 */
public class Main {

    //logger
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        logger.info("Beginning to retrieve all the cep mediation server information");

        List<Host> hosts = HostManager.getInstance().getHosts();

        logger.info("Done retreiving server information");

        logger.info("Calculting the required memory per process");

        long requiredMemory = new MemoryRecommender(ConfigBinder.getInstance().getRecommendations(1), FeatureManagerImpl.getInstance()
                .getEnabledFeatures()).getMemory();

        logger.info("Done. Required memory per process: " + requiredMemory);

        logger.info("Calculating the process number per server");

        int processNumber = ProcessPlanner.getInstance().getMaximumProcessNumber(requiredMemory,
                Float.valueOf(CepMediationProperties.getProperty(CepMediationProperty.GPEH_PROCESS_MEMORY_RATIO)));

        logger.info("Done. process Number: " + processNumber);

        logger.info("Planning the process distribution");

        Map<Integer, Map<Integer, List<String>>> rncs = NetworkManager.getInstance().planning(hosts.size(), processNumber);

        logger.info("Done. planned the process");

        logger.info("Output xml file per host");

        String folder = CepMediationProperties.getProperty(CepMediationProperty.AUTO_GENERATION_LOCATION);

        for (int i = 0; i < hosts.size(); i++) {

            Map<Integer, List<String>> rncsPer = rncs.get(i);

            XmlGenerator generator = new XmlGenerator(hosts.get(i), requiredMemory, rncsPer, folder);

        }

        logger.info("Done, XML files written");

    }

}
