package com.ericsson.cepmediation.base.meta.schema;

/**
 * This class represents an exception thrown by schema XML file parsing and mapping building
 * 
 * @author eeilfn
 */
public class SchemaException extends Exception {
    // The UID of this class
    private static final long serialVersionUID = -1809026909717493068L;

    /**
     * This class simply wraps the standard Exception class
     * 
     * @param message
     */
    public SchemaException(final String message) {
        super(message);
    }
    
    public SchemaException(String message, Throwable cause) {
    	super(message, cause);
    }
}
