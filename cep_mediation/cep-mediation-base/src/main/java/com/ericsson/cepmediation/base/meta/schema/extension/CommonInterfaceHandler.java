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
 * This class parses the common interface section of the metadata extension file.
 * 
 * @author emicned
 *
 */
public class CommonInterfaceHandler extends SchemaExtensionComponentHandler {
    private static String COMMON_INTERFACE_XPATH_EXPRESSION = String.format(
            "/%1$s:extensions/%1$s:commoninterfaces/%1$s:commoninterface", SchemaExtension.EXTENSION_NAMESPACE_PREFIX);

    private final Map<String, CommonInterface> commonInterfaceMap = new HashMap<String, CommonInterface>();

    CommonInterfaceHandler(final SchemaExtension schemaExtension) {
        super(schemaExtension);
    }

    @Override
    void buildMap(final Document doc) throws SchemaException, JDOMException, IOException, JaxenException {
        // Initialize the XPath expression for selecting commoninterface elements 
        final JDOMXPath xPathCommonInterface = new JDOMXPath(COMMON_INTERFACE_XPATH_EXPRESSION);
        xPathCommonInterface.setNamespaceContext(new SimpleNamespaceContext(schemaExtension.getNameSpaceMap()));

        // Run the category XPath query on the DOM, the result is a list of event nodes
        @SuppressWarnings("unchecked")
        final List<Element> commonInterfaceNodeList = xPathCommonInterface.selectNodes(doc);

        // Iterate over the elements from the XML file
        for (final Element commonInterfaceElement : commonInterfaceNodeList) {
            final CommonInterface itf = new CommonInterface(schemaExtension.getSchemaTypeHandler().getParamPreamble(),
                    commonInterfaceElement, schemaExtension);

            // Add the interface to the hash map
            commonInterfaceMap.put(itf.getName(), itf);
        }
    }

    public Map<String, CommonInterface> getMap() {
        return commonInterfaceMap;
    }
}
