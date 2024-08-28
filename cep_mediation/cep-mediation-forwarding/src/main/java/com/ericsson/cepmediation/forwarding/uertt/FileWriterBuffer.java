/***------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2013
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
-----------------------------------------------------------------------------------------------*/
package com.ericsson.cepmediation.forwarding.uertt;

import java.io.File;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import java.util.ArrayList;

public class FileWriterBuffer {
    private File file;
    ArrayList<ApEventBean> listEvents = new ArrayList();

    public File getFile() {
        return file;
    }

    public ArrayList<ApEventBean> getlistEvent() {
        return listEvents;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
