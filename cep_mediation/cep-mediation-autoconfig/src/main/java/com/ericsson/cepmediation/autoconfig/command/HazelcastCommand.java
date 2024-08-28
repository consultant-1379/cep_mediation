/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2013
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/

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
 * This method modify hazelcast.xml file with correct host IPs
 *
 * @author evikkua
 *
 */

public class HazelcastCommand implements AutoconfigCommand {

    private static final String INTERFACE = "interface";
    private static final String TCP_IP = "tcp-ip";
    private static final String JOIN = "join";
    private static final String NETWORK = "network";
    private static final Logger logger = LoggerFactory
            .getLogger(HazelcastCommand.class);

    /**
     * This method modify hazelcast.xml file with correct host IPs
     */
    @Override
    public boolean process(Config config) {
        String hazelcastXMLPath = config.getHazelcastXML();
        List<Host> hostList = config.getHosts();
        try {

            Namespace ns = Namespace
                    .getNamespace("http://www.hazelcast.com/schema/config");
            XMLParser parser = new XMLParser();
            Document doc = parser.readXML(hazelcastXMLPath);

            if (doc == null) {
                logger.error("Unable to read hazelcast.xml file, skipping hazelcast.xml configuration..........");
                return false;
            }

            Element rootNode = doc.getRootElement();
            Element intface = rootNode.getChild(NETWORK, ns).getChild(JOIN, ns)
                    .getChild(TCP_IP, ns).getChild(INTERFACE, ns);
            if (hostList != null && intface != null) {
                Element parentIntface = intface.getParentElement();
                parentIntface.removeContent();
                for (int i = 0; i < hostList.size(); i++) {
                    if (hostList.get(i) != null) {
                        parentIntface.addContent(new Element(INTERFACE, ns)
                                .setText(hostList.get(i).getIp()));
                    }
                }
            }

            boolean result = parser.writeXML(hazelcastXMLPath, doc);

            if (!result) {
                logger.error("Unable to write hazelcast.xml file, skipping hazelcast.xml configuration..........");
                return false;
            }
            return true;
        } catch (IOException io) {
            logger.error("Input Output exception happened, please check read-write permision of "
                    + hazelcastXMLPath + "\n" + io.getMessage());
        } catch (JDOMException e) {
            logger.error("Parsing failed, error occurred in JDOM application"
                    + "\n" + e.getMessage());
        } catch (Exception e) {
            logger.error("Error while generating hazelcast.xml!"
                    + e.getMessage());
        }
        return false;
    }
}
