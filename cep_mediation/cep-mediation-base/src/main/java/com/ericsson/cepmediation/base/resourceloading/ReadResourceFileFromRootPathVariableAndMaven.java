/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.resourceloading;

import java.io.File;
import java.io.InputStream;
import java.net.URL;

import com.ericsson.cepmediation.base.util.FileUtils;

/**
 * Read resource file from the absolute path in the maven code base where root is specified by the root.path property
 * @author eemecoy
 *
 */
public class ReadResourceFileFromRootPathVariableAndMaven implements ReadResource {

    private static final String CEP_MEDIATION_AP_EVENT_BEANS_GENERATED = "cep-mediation-ap-event-beans-generated";

    private static final String CEP_MEDIATION_BASE = "cep-mediation-base";

    /* (non-Javadoc)
     * @see com.ericsson.cepmediation.base.properties.ReadConfigFile#findConfigFile()
     */
    @Override
    public InputStream findResourceFile(final String fileName) {
        InputStream inputStream = tryFindingFileInModule(CEP_MEDIATION_BASE, fileName);
        if (inputStream == null) {
            return tryFindingFileInModule(CEP_MEDIATION_AP_EVENT_BEANS_GENERATED, fileName);
        }
        return inputStream;
    }

    private InputStream tryFindingFileInModule(final String moduleName, String fileName) {
        final String filePathInMaven = getPathToFileInMavenModule(moduleName, fileName);
        return FileUtils.readInputStreamForFile(filePathInMaven);
    }

    private String getPathToFileInMavenModule(final String moduleName, String fileName) {
        return getPathToResourcesInMavenModule(moduleName) + File.separator + fileName;
    }

    private String getPathToResourcesInMavenModule(String moduleName) {
        return getRootMavenFolder() + File.separator + moduleName + File.separator + "src"
                + File.separator + "main" + File.separator + "resources" + File.separator;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Using file found in maven file structure:");
        stringBuilder.append(getRootMavenFolder());
        return stringBuilder.toString();
    }

    private String getRootMavenFolder() {
        final String rootPath = System.getProperty("root.path");
        return rootPath + File.separator + "cep_mediation" + File.separator;
    }

    @Override
    public URL findResourceFileAsURL(final String fileName) {
        URL urlForFileInBaseModule = URLGenerator.getURLForFileName(getPathToFileInMavenModule(CEP_MEDIATION_BASE,
                fileName));
        if (urlForFileInBaseModule == null) {
            return URLGenerator.getURLForFileName(getPathToFileInMavenModule(CEP_MEDIATION_AP_EVENT_BEANS_GENERATED,
                    fileName));
        }
        return urlForFileInBaseModule;
    }
}
