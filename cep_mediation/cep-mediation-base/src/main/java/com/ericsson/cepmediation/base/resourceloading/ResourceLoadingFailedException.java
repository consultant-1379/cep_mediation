/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.resourceloading;

/**
 * @author eemecoy
 *
 */
public class ResourceLoadingFailedException extends Exception {

    public ResourceLoadingFailedException(final String message) {
        super(message);
    }

    public ResourceLoadingFailedException(final Exception rootException) {
        super(rootException);
    }

}
