/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2014
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
*******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.cepmediation.base.database.entity;

import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;

public class WhitelistValues {

    private final int eventId;

    // exceptionClass may not have value defined in database
    private final short exceptionClass;

    private final short causeValue;

    private final short subCauseValue;

    public WhitelistValues(final int eventId, final short exceptionClass, final short causeValue, final short subCauseValue) {
        this.eventId = eventId;
        this.exceptionClass = exceptionClass;
        this.causeValue = causeValue;
        this.subCauseValue = subCauseValue;
    }

    public WhitelistValues(final int eventId, final short causeValue, final short subCauseValue) {
        this.eventId = eventId;
        this.exceptionClass = DefaultValues.DEFAULT_SHORT_VALUE;
        this.causeValue = causeValue;
        this.subCauseValue = subCauseValue;
    }

    public int getEventId() {
        return eventId;
    }

    public short getExceptionClass() {
        return exceptionClass;
    }

    public short getCauseValue() {
        return causeValue;
    }

    public short getSubCauseValue() {
        return subCauseValue;
    }

    public boolean containsValues(final int eventId, final short exceptionClass, final short causeValue, final short subCauseValue) {

        boolean ret = true;

        ret = ret && (this.eventId == eventId);

        //Most of the case, causeValue is provided
        ret = ret && (this.causeValue == causeValue);

        //exception class is not null
        if (exceptionClass != DefaultValues.DEFAULT_SHORT_VALUE) {
            ret = ret && (this.exceptionClass == exceptionClass);
        }

        if (subCauseValue != DefaultValues.DEFAULT_SHORT_VALUE) {
            ret = ret && (this.subCauseValue == subCauseValue);
        }

        return ret;

    }

    @Override
    public String toString() {
        return "WhitelistValues [eventId=" + eventId + ",exceptionClass=" + exceptionClass + ", causeValue=" + causeValue + ", subCauseValue=" + subCauseValue + "]";
    }

}
