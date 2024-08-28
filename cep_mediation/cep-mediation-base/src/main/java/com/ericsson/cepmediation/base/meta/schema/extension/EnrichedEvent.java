package com.ericsson.cepmediation.base.meta.schema.extension;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom.Element;

import com.ericsson.cepmediation.base.meta.schema.SchemaException;

/**
 * This class encapsulates data parsed from the enriched event section
 * of the extension metadata file.
 * 
 * @author emicned
 *
 */
public class EnrichedEvent implements Comparable<EnrichedEvent> {
    // The name of the enriched event
    private String name;

    // Specifies which class is enriched
    private String enriches;

    // Specifies the new fields
    private final Map<String, String> paramName2type = new HashMap<String, String>();

    public EnrichedEvent(final String paramPreamble, final Element enrichedEventElement,
            final SchemaExtension schemaExtension) throws SchemaException {
        try {
            // Instantiate mandatory data from the XML element
            name = enrichedEventElement.getAttributeValue("name").trim();
            enriches = enrichedEventElement.getAttributeValue("enriches").trim();

            final Element paramsElement = enrichedEventElement.getChild("params", schemaExtension.getNamespace());
            if (paramsElement != null) {
                @SuppressWarnings("unchecked")
                final List<Element> paramsList = paramsElement.getChildren("param", schemaExtension.getNamespace());
                if (paramsList != null) {
                    for (final Element e : paramsList) {
                        final String paramName = e.getText().replaceFirst(paramPreamble, "").trim();
                        final String type = e.getAttributeValue("sqlType").trim();
                        paramName2type.put(paramName, type);
                    }
                }
            }
        } catch (final Exception e) {
            // Return a sensible exception to the caller
            throw new SchemaException("Error parsing common interface element in extension xml ["
                    + enrichedEventElement.getName() + "=" + name + "] ", e);
        }
    }

    public String getName() {
        return name;
    }

    public String getEnriches() {
        return enriches;
    }

    public Map<String, String> getParamName2type() {
        return paramName2type;
    }

    @Override
    public String toString() {
        return "EnrichedEvent [name=" + name + ", enriches=" + enriches + ", paramName2type=" + paramName2type + "]";
    }

    @Override
    public int compareTo(final EnrichedEvent o) {
        return name.compareTo(o.name);
    }

    @Override
    public boolean equals(final Object other) {
        if (!(other instanceof EnrichedEvent)) {
            return false;
        }

        return name.equals(((EnrichedEvent) other).name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

}