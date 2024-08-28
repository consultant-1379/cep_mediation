/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.database.templates;

/**
 * @author eemecoy
 *
 */
public class TemplateException extends Exception {

    public TemplateException(final String message, final Exception rootException) {
        super(message, rootException);
    }

}
