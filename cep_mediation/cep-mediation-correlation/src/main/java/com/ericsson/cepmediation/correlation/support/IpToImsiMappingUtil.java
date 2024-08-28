/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.support;

import com.ericsson.cepmediation.apeventbeans.correlation.IP_TO_IMSI_LOOKUP;

/**
 * @author eemecoy
 *
 */
public class IpToImsiMappingUtil {

    static {
        final CacheReaderFactory cacheFactory = CacheReaderFactory.create();
        userPlaneHandler = cacheFactory.getHandler(CACHE_HANDLER_TYPE.USER_PLANE);
    }

    private static CacheHandler userPlaneHandler;

    public static IP_TO_IMSI_LOOKUP getIpToImsiMapping(final String ipAddress, final long timestamp,
            final boolean isLastAttempt) {
        return userPlaneHandler.findByIpAddressAndTimestamp(ipAddress, timestamp, isLastAttempt);
    }

}
