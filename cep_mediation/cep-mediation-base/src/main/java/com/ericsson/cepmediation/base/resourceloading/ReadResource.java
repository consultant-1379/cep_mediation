/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.resourceloading;

import java.io.InputStream;
import java.net.URL;

/**
 * @author eemecoy
 *
 */
public interface ReadResource {

    /**
     * Find specified resource
     * 
     * @param fileName          should contain the folderName also ie app-config/config.xml
     * @return input stream for specified file
     */
    InputStream findResourceFile(String fileName);

    URL findResourceFileAsURL(String fileName);

}
