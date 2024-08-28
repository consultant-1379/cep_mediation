/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2011 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.licensing;

/**
 *  Exception thrown if ENIQ licensing service cannot be accessed
 */
public class CannotAccessLicensingServiceException extends Exception {
    private static final long serialVersionUID = 6343106061568583356L;

    public CannotAccessLicensingServiceException(final Exception rootException) {
        super(rootException);
    }

}
