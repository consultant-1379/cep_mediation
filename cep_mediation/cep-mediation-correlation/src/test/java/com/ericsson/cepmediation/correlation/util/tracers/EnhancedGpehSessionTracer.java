/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.util.tracers;

import com.ericsson.cepmediation.correlation.enrichment.EnhancedGpehSession;
import com.ericsson.cepmediation.test.util.tracer.SessionTracer;

/**
 * @author eemecoy
 *
 */
public class EnhancedGpehSessionTracer {

    public static void traceSession(EnhancedGpehSession enhancedGpehSession) {
        String sessionTrace = SessionTracer.getSessionTrace(enhancedGpehSession);
        StringBuilder stringBuilder = new StringBuilder(sessionTrace);
        stringBuilder.append(", SESSION_CLOSED " + enhancedGpehSession.isSESSION_CLOSED());
        System.out.println(stringBuilder);
    }
}
