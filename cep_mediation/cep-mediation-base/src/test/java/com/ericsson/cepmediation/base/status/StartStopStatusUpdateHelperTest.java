/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.status;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import com.ericsson.cepmediation.base.status.StartStopStatusUpdate;
import com.ericsson.cepmediation.base.status.StartStopStatusUpdateHelper;

/**
 * @author eemecoy
 *
 */
public class StartStopStatusUpdateHelperTest {

    @Test
    public void testTranslatingLogBackToEnum() {
        final String logMessage = "Successfully loaded system configuration";
        assertThat(StartStopStatusUpdateHelper.convertLogMessageToStatusUpdate(logMessage),
                is(StartStopStatusUpdate.SUCCESSFULLY_LOADED_SYSTEM_CONFIGURATION));
    }

}
