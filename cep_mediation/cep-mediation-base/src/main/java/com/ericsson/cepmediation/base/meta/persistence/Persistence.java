package com.ericsson.cepmediation.base.meta.persistence;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.jaxen.JaxenException;
import org.jdom.Document;
import org.jdom.JDOMException;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.resourceloading.ResourceFileFinder;
import com.ericsson.cepmediation.base.resourceloading.ResourceLoadingFailedException;

public class Persistence {
    private static final Logger logger = LoggerFactory.getLogger(Persistence.class);

    private static final String PERSISTENCE_NAMESPACE = "http://www.ericsson.com/Persistence";

    static final String PERSISTENCE_NAMESPACE_PREFIX = "pe";

    private static final String XERCES_SAX_PARSER = "org.apache.xerces.parsers.SAXParser";

    // The handlers for the various sections in this schema
    private PersistentEntityHandler persistentEntityHandler = null;

    private final Namespace namespace;

    // Used by XPath searches
    private final Map<String, String> nameSpaceMap = new HashMap<String, String>();

    public Persistence(final String persistenceXmlFile) throws JDOMException, IOException, JaxenException, ResourceLoadingFailedException {
        logger.debug("persistenceXml file=" + persistenceXmlFile);

        // Get the persistence XML file from the class path
        final InputStream inputStream = new ResourceFileFinder().findResourceFile(persistenceXmlFile);

        namespace = Namespace.getNamespace(PERSISTENCE_NAMESPACE);
        nameSpaceMap.put(PERSISTENCE_NAMESPACE_PREFIX, namespace.getURI());

        // TODO define xsd schema, for now just parse the xml 
        final SAXBuilder builder = new SAXBuilder(XERCES_SAX_PARSER);
        final Document persistenceDocument = builder.build(inputStream);

        // Create the handlers
        persistentEntityHandler = new PersistentEntityHandler(this);
        persistentEntityHandler.buildMap(persistenceDocument);
        logger.debug(persistentEntityHandler.getMap().toString());
    }

    Map<String, String> getNameSpaceMap() {
        return nameSpaceMap;
    }

    Namespace getNamespace() {
        return namespace;
    }

    public PersistentEntityHandler getPersistentEntityHandler() {
        return persistentEntityHandler;
    }
}
