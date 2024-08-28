package com.ericsson.cepmediation.base.meta.persistence;

import org.jdom.Element;

public class FieldType {
    private final String name;

    private final String type;

    private Integer size;

    private boolean truncateMillis;

    private boolean enriched;
    
    private boolean attributeExists = true;
    
    private String func = "";

    public FieldType(final Element column) {
        name = column.getTextTrim();
        type = column.getAttributeValue("type").trim();
        if (column.getAttributeValue("size") != null) {
            size = Integer.valueOf(column.getAttributeValue("size").trim());
        }
        if (column.getAttributeValue("truncateMillis") != null) {
            truncateMillis = Boolean.valueOf(column.getAttributeValue("truncateMillis").trim());
        }
        if (column.getAttributeValue("enriched") != null) {
            enriched = Boolean.valueOf(column.getAttributeValue("enriched").trim());
        }
        if (column.getAttributeValue("attributeExists") != null) {
        	attributeExists = Boolean.valueOf(column.getAttributeValue("attributeExists").trim());
        }
        if (column.getAttributeValue("func") != null) {
        	func = column.getAttributeValue("func").trim();
        }
        
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Integer getSize() {
        return size;
    }

    public boolean isTruncateMillis() {
        return truncateMillis;
    }

    public boolean isEnriched() {
        return enriched;
    }
    
    public boolean doesAttributeExist() {
    	return attributeExists;
    }
    
    public String getFunc() {
    	return func;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + size;
        result = prime * result + (truncateMillis ? 1231 : 1237);
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final FieldType other = (FieldType) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (size != other.size)
            return false;
        if (truncateMillis != other.truncateMillis)
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "FieldType [name=" + name + ", type=" + type + ", size=" + size + ", truncateMillis=" + truncateMillis
                + "]";
    }
}
