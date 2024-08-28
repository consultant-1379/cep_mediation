package com.ericsson.cepmediation.base.meta.persistence;

import java.util.ArrayList;
import java.util.List;

import org.jdom.Element;
import org.jdom.Namespace;

public class PersistentEntity {
    private final String className;

    private final String packageName;

    private boolean enriches;

    private final List<FieldType> fields = new ArrayList<FieldType>();

    public PersistentEntity(final Element persistentEntityElement, final Namespace namespace) {
        // Instantiate mandatory data from the XML element
        className = persistentEntityElement.getAttributeValue("className").trim();
        packageName = persistentEntityElement.getAttributeValue("packageName").trim();
        if (persistentEntityElement.getAttributeValue("enriches") != null) {
            enriches = Boolean.valueOf(persistentEntityElement.getAttributeValue("enriches").trim());
        }
        final Element columnsElem = persistentEntityElement.getChild("columns", namespace);
        @SuppressWarnings("unchecked")
        final List<Element> columnsList = columnsElem.getChildren("column", namespace);
        for (final Element column : columnsList) {
            final FieldType entityType = new FieldType(column);
            fields.add(entityType);
        }
    }

    public boolean isEnriches() {
        return enriches;
    }

    public String getClassName() {
        return className;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getFullyQualifiedName() {
        return getPackageName() + "." + getClassName();
    }

    public List<FieldType> getFields() {
        return fields;
    }

}
