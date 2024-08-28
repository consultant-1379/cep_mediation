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
package com.ericsson.cepmediation.correlation.stubs;

import java.util.ArrayList;
import java.util.List;

import com.ericsson.cepmediation.base.database.entity.CfaWhitelistValues;

public final class CfaWhitelist {

    private static List<CfaWhitelistValues> event2whitelistValues = new ArrayList<CfaWhitelistValues>();

    static {

        event2whitelistValues.add(new CfaWhitelistValues(438, (byte) 11,
                (byte) 2));

    }

    public static boolean isInCfaWhitelist(final int eventId, byte causeValue,
            byte subCauseValue) {
        CfaWhitelistValues cfawhiteListValues = event2whitelistValues.get(0);

        if (cfawhiteListValues == null) {
            // Event has no whitelist entries, return false
            return false;
        }

        if (cfawhiteListValues.containsValues(eventId, causeValue,
                subCauseValue)) {
            // Event has a whitelist entry with the specified values
            return true;
        }

        return false;
    }

}
