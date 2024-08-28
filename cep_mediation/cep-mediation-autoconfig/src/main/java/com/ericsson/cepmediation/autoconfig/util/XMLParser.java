package com.ericsson.cepmediation.autoconfig.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.jdom.Document;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is used for parsing XML files using JDOM parser
 * @author evikkua
 *
 */
public class XMLParser {

    private static final Logger logger = LoggerFactory.getLogger(XMLParser.class);

    /**
     * Method for reading XML file
     * @param xmlPath
     * @return
     * @throws IOException
     * @throws JDOMException
     */
    public Document readXML(String xmlPath) throws IOException, JDOMException {
        SAXBuilder builder = new SAXBuilder();

        File xmlFile = new File(xmlPath);

        if (!xmlFile.exists()) {
            logger.error("File doesn't exist! " + xmlPath);
            return null;
        }

        if (!xmlFile.canRead()) {
            logger.error("No read permission for " + xmlPath);
            return null;
        }

        Document doc = builder.build(xmlFile);

        return doc;
    }

    /**
     * Method for writing XML file
     * @param xmlPath
     * @param doc
     * @return
     * @throws IOException
     * @throws JDOMException
     */
    public boolean writeXML(String xmlPath, Document doc) throws IOException, JDOMException {
        File xmlFile = new File(xmlPath);

        if (!xmlFile.exists()) {
            logger.error("File doesn't exist! " + xmlPath);
            return false;
        }

        if (!xmlFile.canWrite()) {
            logger.error("No write permission for " + xmlPath);
            return false;
        }

        XMLOutputter xmlOutput = new XMLOutputter();
        Format format = Format.getPrettyFormat();
        format.setEncoding("UTF-8");
        format.setLineSeparator(System.getProperty("line.separator"));
        xmlOutput.setFormat(format);
        xmlOutput.output(doc, new FileWriter(xmlPath));
        return true;
    }
}
