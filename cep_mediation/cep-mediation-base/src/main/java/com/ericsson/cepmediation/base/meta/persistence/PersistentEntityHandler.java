package com.ericsson.cepmediation.base.meta.persistence;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jaxen.JaxenException;
import org.jaxen.SimpleNamespaceContext;
import org.jaxen.jdom.JDOMXPath;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;

public class PersistentEntityHandler {

    private static String PERSISTENT_ENTITY_XPATH_EXPRESSION = String.format(
            "/%1$s:persistence/%1$s:persistent-entity", Persistence.PERSISTENCE_NAMESPACE_PREFIX);

    private final Map<String, PersistentEntity> persistentEntityMap = new HashMap<String, PersistentEntity>();

    private final Persistence persistence;

    PersistentEntityHandler(final Persistence persistence) {
        this.persistence = persistence;
    }

    void buildMap(final Document doc) throws JDOMException, IOException, JaxenException {
        // Initialize the XPath expression for selecting commoninterface elements 
        final JDOMXPath xPathCommonInterface = new JDOMXPath(PERSISTENT_ENTITY_XPATH_EXPRESSION);
        xPathCommonInterface.setNamespaceContext(new SimpleNamespaceContext(persistence.getNameSpaceMap()));

        // Run the XPath query on the DOM, the result is a list of persistent-entityS nodes
        @SuppressWarnings("unchecked")
        final List<Element> persistentEntityNodeList = xPathCommonInterface.selectNodes(doc);

        // Iterate over the elements from the XML file
        for (final Element persistentEntityElement : persistentEntityNodeList) {
            final PersistentEntity entity = new PersistentEntity(persistentEntityElement, persistence.getNamespace());

            // Add the entity to the hash map
            if (persistentEntityMap.containsKey(entity.getFullyQualifiedName())) {
                throw new IllegalStateException("Entities with duplicating fully qualified name: "
                        + entity.getFullyQualifiedName());
            }
            persistentEntityMap.put(entity.getFullyQualifiedName(), entity);
        }
    }

    public Map<String, PersistentEntity> getMap() {
        return persistentEntityMap;
    }
}
