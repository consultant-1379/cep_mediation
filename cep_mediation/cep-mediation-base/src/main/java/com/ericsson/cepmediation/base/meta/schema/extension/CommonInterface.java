package com.ericsson.cepmediation.base.meta.schema.extension;

import java.util.ArrayList;
import java.util.List;

import org.jdom.Element;

import com.ericsson.cepmediation.base.meta.schema.SchemaException;

/**
 * This class encapsulates data parsed from the common interface section
 * of the extension metadata file.
 * 
 * @author emicned
 *
 */
public class CommonInterface implements Comparable<CommonInterface> {
    // Name of the interface
    private String name;

    // The fields of the interface
    private List<String> params;

    protected CommonInterface(final String paramPreamble, final Element commonInterface,
            final SchemaExtension schemaExtension) throws SchemaException {
        try {
            // Instantiate mandatory data from the XML element
            name = commonInterface.getAttributeValue("name").trim();

            final Element paramsElement = commonInterface.getChild("params", schemaExtension.getNamespace());
            if (paramsElement != null) {
                @SuppressWarnings("unchecked")
                final List<Element> paramsList = paramsElement.getChildren("param", schemaExtension.getNamespace());
                if (paramsList != null) {
                    params = new ArrayList<String>(paramsList.size());
                    for (final Element e : paramsList) {
                        params.add(e.getText().replaceFirst(paramPreamble, "").trim());
                    }
                }
            }
        } catch (final Exception e) {
            // Return a sensible exception to the caller
            throw new SchemaException("Error parsing common interface element in extension xml ["
                    + commonInterface.getName() + "=" + name + "] ", e);
        }
    }

    public String getName() {
        return name;
    }

    public List<String> getParams() {
        return params;
    }

    @Override
    public int compareTo(final CommonInterface o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "CommonInterface [name=" + name + ", params=" + params + "]";
    }

    @Override
    public boolean equals(final Object other) {
        if (!(other instanceof CommonInterface)) {
            return false;
        }

        return name.equals(((CommonInterface) other).name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
