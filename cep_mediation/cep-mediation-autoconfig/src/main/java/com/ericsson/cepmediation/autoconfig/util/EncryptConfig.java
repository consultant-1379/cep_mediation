package com.ericsson.cepmediation.autoconfig.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.Namespace;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Encrypt passwords in network_elements.xml  
 * @author evikkua
 *
 */
public class EncryptConfig {

    private static final Logger logger = LoggerFactory.getLogger(EncryptConfig.class);

    private static final String CONFIG_PROPERTIES_FILE = "/opt/ericsson/cep-mediation/cep-mediation/etc/app-config/config_file_selector.properties";

    /**
     * 
     * @param path
     */
    public static void process(String path) {

        try {

            Namespace ns = Namespace.getNamespace("http://www.ericsson.com/app-config");
            XMLParser parser = new XMLParser();
            Document doc = parser.readXML(path);

            if (doc == null) {
                logger.error("Unable to read network_elements.xml file, skipping encrypting passwords in network_elements.xml..........");
                return;
            }

            Element rootNode = doc.getRootElement();
            List<Element> hosts = rootNode.getChild("hosts", ns).getChildren("host", ns);
            Iterator<Element> hostIT = hosts.iterator();
            while (hostIT.hasNext()) {
                Element host = hostIT.next();
                List<Element> processes = host.getChildren("process", ns);
                Iterator<Element> processIT = processes.iterator();
                while (processIT.hasNext()) {
                    Element process = processIT.next();
                    List<Element> networkElements = process.getChild("network-elements", ns).getChildren("network-element", ns);
                    Iterator<Element> neIT = networkElements.iterator();
                    while (neIT.hasNext()) {
                        Element ne = neIT.next();
                        Element password = ne.getChild("password", ns);
                        if (password != null)
                            password.setText(EncryptPassword.encrypt(password.getText()));
                    }
                }
            }

            boolean result = parser.writeXML(path, doc);

            if (!result) {
                logger.error("Unable to write network_elements.xml file, skipping encrypting passwords in network_elements.xml..........");

            } else {
                logger.info("Sucessfully encypted passwords in " + path);
                System.out.println("Sucessfully encypted passwords in " + path);
            }
        } catch (IOException io) {
            logger.error("Input Output exception happened, please check read-write permision of " + path + "\n" + io.getMessage());
        } catch (JDOMException e) {
            logger.error("Parsing failed, error occurred in JDOM application" + "\n" + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Error while generating network_elements.xml!" + e.getMessage());
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        String path = "/opt/ericsson/cep-mediation/cep-mediation/etc/app-config/";
        String property = "config_files";
        final Properties props = new Properties();
        try {
            props.load(new FileInputStream(new File(CONFIG_PROPERTIES_FILE)));
        } catch (FileNotFoundException e) {
            logger.warn("Could not find file: " + CONFIG_PROPERTIES_FILE, e);
        } catch (IOException e) {
            logger.warn("Could read file: " + CONFIG_PROPERTIES_FILE, e);
        }
        String config = props.getProperty(property);
        String[] neConfig = null;
        if (config != null && config.length() > 0) {
            neConfig = config.split(",");
        }
        if (neConfig != null && neConfig.length > 1) {
            EncryptConfig.process(path + neConfig[1]);
        } else {
            EncryptConfig.process(path + "network_elements.xml");
        }
    }
}
