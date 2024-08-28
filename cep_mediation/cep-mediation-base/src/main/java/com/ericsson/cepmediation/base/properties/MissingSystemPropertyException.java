/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.properties;

/**
 * Indicates a property is missing from config.xml
 * 
 * @author EEMECOY
 *
 */
public class MissingSystemPropertyException extends ConfigurationException {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public MissingSystemPropertyException(final String message) {
        super(message, null);
    }

}
