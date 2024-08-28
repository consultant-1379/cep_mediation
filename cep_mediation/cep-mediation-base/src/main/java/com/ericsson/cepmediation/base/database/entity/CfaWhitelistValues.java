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

public class CfaWhitelistValues {

    private final int eventId;

    private final byte rabDisconnectionCode;

    private final byte rabDisconnectionSubcode;

    public CfaWhitelistValues(final int eventId,
            final byte rabDisconnectionCode, final byte rabDisconnectionSubcode) {

        this.eventId = eventId;
        this.rabDisconnectionCode = rabDisconnectionCode;
        this.rabDisconnectionSubcode = rabDisconnectionSubcode;
    }

    public int eventId() {
        return eventId;
    }

    public short getRabDisconnectionCode() {
        return rabDisconnectionCode;
    }

    public short getRabDisconnectionSubcode() {
        return rabDisconnectionSubcode;
    }

    public boolean containsValues(final int eventId,
            final byte rabDisconnectionCode, final byte rabDisconnectionSubcode) {

        boolean ret = true;

        ret = ret && (this.eventId == eventId);

        ret = ret && (this.rabDisconnectionCode == rabDisconnectionCode);

        ret = ret && (this.rabDisconnectionSubcode == rabDisconnectionSubcode);

        return ret;

    }

    @Override
    public String toString() {
        return "WhitelistValues [eventId=" + eventId
                + ", rabDisconnectionCode=" + rabDisconnectionCode
                + ", rabDisconnectionSubcode=" + rabDisconnectionSubcode + "]";
    }

}