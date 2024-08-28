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

import com.ericsson.cepmediation.base.database.entity.WhitelistValues;



public final class HfaWhitelistValues {

    private static List<WhitelistValues> event2whitelistValues = new ArrayList<WhitelistValues>();

    static {
        event2whitelistValues.add(new WhitelistValues((int)458, (short)1, (short)1, (short)1));
    }

    public static boolean isInHfaWhitelist(final int eventId, final short exceptionClass, final short causeValue, final short subCauseValue) {
        final WhitelistValues hfawhiteListValues = event2whitelistValues.get(0);

        if (hfawhiteListValues == null) {
            // Event has no whitelist entries, return false
            return false;
        }

        if (hfawhiteListValues.containsValues(eventId, exceptionClass, causeValue, subCauseValue)) {
                // Event has a whitelist entry with the specified values
                return true;
        }

        return false;
    }

}
