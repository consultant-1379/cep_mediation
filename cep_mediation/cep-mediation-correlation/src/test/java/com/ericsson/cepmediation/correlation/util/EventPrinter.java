/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.util;

import java.util.List;

import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.test.util.GitPath;
import com.ericsson.cepmediation.test.util.tracer.EventTracer;

/**
 * @author eemecoy
 *
 */
public class EventPrinter {
    private static final String ROP_TIMESTAMP = "A20120516.1645-1700";

    public static void main(String[] args) throws Exception {
        new EventPrinter().printAllEventsInROP();
    }

    private void printAllEventsInROP() throws Exception {
        String pathToFilesInClasspath = GitPath.getDirectoryPathForRealFilesInGIT();
        List<ApEventBean> gpehParsedRowEvents = new FileParser().parseGPEHRopFiles(pathToFilesInClasspath,
                ROP_TIMESTAMP);
        printEvents(gpehParsedRowEvents);

    }

    private void printEvents(List<ApEventBean> gpehParsedRowEvents) throws Exception {
        System.out.println("Events in ROP: " + ROP_TIMESTAMP);
        for (ApEventBean apEventBean : gpehParsedRowEvents) {
            GpehBase gpehEvent = (GpehBase) apEventBean;
            EventTracer.traceEvent(gpehEvent);
        }
    }

}
