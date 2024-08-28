package com.ericsson.cepmediation.autoconfig.command;

import java.io.IOException;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.Namespace;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.autoconfig.model.Config;
import com.ericsson.cepmediation.autoconfig.model.Host;
import com.ericsson.cepmediation.autoconfig.util.XMLParser;

/**
 * This Class used to configure stanadalone.xml file
 * @author evikkua
 *
 */
public class StandaloneCommand implements AutoconfigCommand {

    private static final Logger logger = LoggerFactory.getLogger(StandaloneCommand.class);

    /**
     * This method modify standalone.xml file with correct host IP (CEP_MEDIATION_1)
     */
    @Override
    public boolean process(Config config) {
        String standloneXMLPath = config.getStandaloneXML();
        List<Host> hostList = config.getHosts();
        try {

            Namespace ns = Namespace.getNamespace("http://www.ericsson.com/app-config");
            XMLParser parser = new XMLParser();
            Document doc = parser.readXML(standloneXMLPath);

            if (doc == null) {
                logger.error("Unable to read standalone.xml file, skipping standalone.xml configuration..........");
                return false;
            }

            Element rootNode = doc.getRootElement();
            Element host = rootNode.getChild("hosts", ns).getChild("host", ns);
            if (hostList != null && hostList.get(0) != null) {
                //CEP_MEIATION_1 is the first host in the hostList
                host.getAttribute("ip").setValue(hostList.get(0).getIp());
            }

            boolean result = parser.writeXML(standloneXMLPath, doc);

            if (!result) {
                logger.error("Unable to write standalone.xml file, skipping standalone.xml configuration..........");
                return false;
            }
            return true;
        } catch (IOException io) {
            logger.error("Input Output exception happened, please check read-write permision of " + standloneXMLPath + "\n" + io.getMessage());
        } catch (JDOMException e) {
            logger.error("Parsing failed, error occurred in JDOM application" + "\n" + e.getMessage());
        } catch (Exception e) {
            logger.error("Error while generating standalone.xml!" + e.getMessage());
        }
        return false;
    }
}
