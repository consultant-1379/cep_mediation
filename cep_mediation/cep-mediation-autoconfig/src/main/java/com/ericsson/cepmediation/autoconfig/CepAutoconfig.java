package com.ericsson.cepmediation.autoconfig;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.autoconfig.command.COMMAND;
import com.ericsson.cepmediation.autoconfig.command.CommandDispatcher;
import com.ericsson.cepmediation.autoconfig.model.Config;
import com.ericsson.cepmediation.autoconfig.model.Host;
import com.ericsson.cepmediation.autoconfig.model.Rnc;
import com.ericsson.cepmediation.autoconfig.model.Sgsn;
import com.ericsson.cepmediation.autoconfig.model.UserPlane;
import com.ericsson.cepmediation.autoconfig.properties.AutoconfigProperties;
import com.ericsson.cepmediation.autoconfig.util.HostUtils;
import com.ericsson.cepmediation.autoconfig.util.Utils;

/**
 * Main class for Autoconfig
 * 
 * It handles configuring network_element.xml, standalone.xml and hazelcast.xml automatically.
 * 
 * @author evikkua
 *
 */
public class CepAutoconfig {

    private static final Logger logger = LoggerFactory.getLogger(CepAutoconfig.class);

    /**
     * Main method to trigger Autoconfig
     * @param args
     */
    public static void main(String[] args) {

        try {
            logger.info("Starting AutoConfig for CEP..........");

            Config config = getConfig();

            CommandDispatcher manager = new CommandDispatcher();
            boolean result;

            result = manager.process(COMMAND.NETWORK_ELEMENT, config);
            if (!result) {
                logger.error("Unable to configure network_element.xml properly..........");
            } else {
                logger.info("AutoConfig completed for network_element.xml..........");
            }

            result = manager.process(COMMAND.STANDALONE, config);
            if (!result) {
                logger.error("Unable to configure standalone.xml..........");
            } else {
                logger.info("AutoConfig completed for standalone.xml..........");
            }

            result = manager.process(COMMAND.HAZELCAST, config);
            if (!result) {
                logger.error("Unable to configure hazelcast.xml..........");
            } else {
                logger.info("AutoConfig completed for hazelcast.xml..........");
            }
        } catch (Exception e) {
            logger.error("Error in autoconfig " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    /**
     * It triggers createDefaultConfig methods to get topology information of RNC & SGSN from DIM table and User Plane from pcp-cofig.xml
     * It also triggers applyAutoconfigProperties method to get config parameters from autoconfig.properties file
     * Returns populated object of Config class to Main method
     * @return Configurations
     * @throws IllegalStateException
     */
    private static Config getConfig() throws IllegalStateException {
        logger.info("Reading configuration parameters..........");
        Config config = new Config();
        applyAutoconfigProperties(config);
        createDefaultConfig(config);
        logger.debug("Configured parameters:" + config.toString());
        return config;
    }

    /**
     * It triggers Utils methods to get topology information of RNC & SGSN from DIM table and User Plane from pcp-cofig.xml and setting them to Config class
     * @param config
     * @throws IllegalStateException
     */
    private static void createDefaultConfig(Config config) throws IllegalStateException {
        config.setDateGenerated(new Date());
        boolean ONEMINROP = true;
        boolean FIFTEENMINROP = false;

        List<Rnc> rncList = Utils.getRncList(config);
        if (rncList == null || rncList.isEmpty()) {
            logger.warn("No rncs available");
        } else {
            config.setRncs(rncList);

            List<Rnc> rncList1Min = Utils.getRncROP(config.getRncs(), ONEMINROP);
            if (rncList1Min != null && !rncList1Min.isEmpty()) {
                config.setRncs1Min(rncList1Min);
            }

            List<Rnc> rncList15Min = Utils.getRncROP(config.getRncs(), FIFTEENMINROP);
            if (rncList15Min != null && !rncList15Min.isEmpty()) {
                config.setRncs15Min(rncList15Min);
            }
        }

        List<Sgsn> sgsnList = Utils.getSgsnList(config);
        if (sgsnList == null || sgsnList.isEmpty()) {
            logger.warn("No sgsns available");
        } else {
            config.setSgsns(sgsnList);
        }

        config.setSBEnabled(Utils.isSBEnabled());

        if (config.isSBEnabled()) {
            List<UserPlane> userPlaneList = Utils.getUPList(config);
            if (userPlaneList == null || userPlaneList.isEmpty()) {
                logger.warn("Could not retrieve userplane list from pcp-config.xml file!");
            } else {
                config.setUps(userPlaneList);
            }
        }

        if ((config.getRncs() == null || config.getRncs().isEmpty()) && (config.getSgsns() == null || config.getSgsns().isEmpty())
                && (config.getUps() == null || config.getUps().isEmpty())) {
            throw new IllegalStateException("No network elements found!");
        }

        List<Host> hosts = HostUtils.instance.getHosts();
        if (hosts == null || hosts.isEmpty()) {
            throw new IllegalStateException("Could not retrieve hosts list!");
        }
        config.setHosts(hosts);
    }

    /**
     * It is responsible get configuration parameters from autoconfig.properties file and setting them to Config class
     * @param config
     */
    private static void applyAutoconfigProperties(Config config) {
        logger.debug("Reading configuration from autoconfig.properties file..........");
        AutoconfigProperties autoconfigProperties = AutoconfigProperties.instance;
        config.setUpRootPath(autoconfigProperties.getUpRootPath());
        config.setGpehFixedMemory(autoconfigProperties.getGpehFixedMemory());
        config.setSgehFixedMeory(autoconfigProperties.getSgehFixedMemory());
        config.setUpFixedMemory(autoconfigProperties.getUpFixedMemory());
        config.setOutputNeXML(autoconfigProperties.getOutputNeXml());
        config.setStandaloneXML(autoconfigProperties.getStandaloneXmlPath());
        config.setHazelcastXML(autoconfigProperties.getHazelcastXmlPath());
        config.setPcapXML(autoconfigProperties.getPcpConfigFile());
        config.setMemoryUpperLimit(autoconfigProperties.getMemoryUpperLimit());
        config.setMaxRncsProcess(autoconfigProperties.getMaxRncsProcess());
    }
}
