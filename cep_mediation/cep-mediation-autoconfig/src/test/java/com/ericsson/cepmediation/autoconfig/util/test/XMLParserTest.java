package com.ericsson.cepmediation.autoconfig.util.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.jdom.Document;
import org.jdom.JDOMException;
import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.autoconfig.model.Config;
import com.ericsson.cepmediation.autoconfig.util.XMLParser;

public class XMLParserTest {

    XMLParser xmlParser;

    Config config;

    @Before
    public void init() {
        xmlParser = new XMLParser();
        config = new Config();
        String pcpXML = getClass().getClassLoader().getResource("pcp-config.xml").getFile();
        config.setPcapXML(pcpXML);
    }

    @Test
    public void testReadWriteXML() throws IOException, JDOMException {
        Document doc = xmlParser.readXML(config.getPcapXML());
        assertNotNull(doc);
        assertTrue(xmlParser.writeXML(config.getPcapXML(), doc));
    }
}
