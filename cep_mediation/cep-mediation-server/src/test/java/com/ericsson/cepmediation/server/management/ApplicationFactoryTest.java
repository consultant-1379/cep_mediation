/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.server.management;

import com.ericsson.cepmediation.base.proc.config.ProcessConfigBean;
import org.junit.Test;

/**
 * @author eemecoy
 *
 */
public class ApplicationFactoryTest {

    @Test
    public void testgetProcessId() {
        final ProcessConfigBean processBean = new ProcessConfigBean();
        final int processId = 4732;
        processBean.setProcessId(processId);
        //assertThat(ApplicationFactory.getProcessId(processBean), is("" + processId));
    }

}
