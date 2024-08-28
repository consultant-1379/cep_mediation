package com.ericsson.cepmediation.base.meta.schema.extension;

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

import com.ericsson.cepmediation.base.meta.schema.SchemaException;

/**
 * This class parses the enriched event section of the metadata extension file.
 * 
 * @author emicned
 *
 */
public class EnrichedEventHandler extends SchemaExtensionComponentHandler {
    private static String ENRICHED_EVENT_XPATH_EXPRESSION = String.format(
            "/%1$s:extensions/%1$s:enrichedevents/%1$s:enrichedevent", SchemaExtension.EXTENSION_NAMESPACE_PREFIX);

    private final Map<String, EnrichedEvent> enrichedEventMap = new HashMap<String, EnrichedEvent>();

    EnrichedEventHandler(final SchemaExtension schemaExtension) {
        super(schemaExtension);
    }

    @Override
    void buildMap(final Document doc) throws SchemaException, JDOMException, IOException, JaxenException {
        // Initialize the XPath expression for selecting commoninterface elements 
        final JDOMXPath xPathCommonInterface = new JDOMXPath(ENRICHED_EVENT_XPATH_EXPRESSION);
        xPathCommonInterface.setNamespaceContext(new SimpleNamespaceContext(schemaExtension.getNameSpaceMap()));

        // Run the category XPath query on the DOM, the result is a list of event nodes
        @SuppressWarnings("unchecked")
        final List<Element> enrichedEventNodeList = xPathCommonInterface.selectNodes(doc);

        // Iterate over the elements from the XML file
        for (final Element enrichedEventElement : enrichedEventNodeList) {
            final EnrichedEvent event = new EnrichedEvent(schemaExtension.getSchemaTypeHandler().getParamPreamble(),
                    enrichedEventElement, schemaExtension);

            // Add the interface to the hash map
            enrichedEventMap.put(event.getName(), event);
        }
    }

    public Map<String, EnrichedEvent> getMap() {
        return enrichedEventMap;
    }
}
