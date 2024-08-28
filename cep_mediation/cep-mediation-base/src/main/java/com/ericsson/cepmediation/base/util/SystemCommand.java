/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.util;

/**
 * @author eemecoy
 *
 */
public class SystemCommand {

    public void runSystemCommand(final String command) throws Exception {
        final Process proc = Runtime.getRuntime().exec(command);
        proc.waitFor();
    }
}
