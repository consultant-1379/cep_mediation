/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.util;

/**
 * @author eemecoy
 *
 */
public class GITRoot {

    /**
     * Get the root of the module (used to try to determine the root path in different environments)
     * 
     * @param relativePathToFileInModuleClasspath                       This must the path to a resource on the classpath in the current module
     * @return full path to the GIT root 
     *                                                                  
     */
    private static String getModuleRoot(String relativePathToFileInModuleClasspath) {
        final String filePath = ResourceLoadingUtilitiesForTest
                .getFullPathForFileOnClasspath(relativePathToFileInModuleClasspath);
        return extractGITRootFromFullPathToFile(filePath);
    }

    private static String extractGITRootFromFullPathToFile(String filePath) {
        String[] tokens = filePath.split("/");
        StringBuilder gitRoot = new StringBuilder();
        for (String token : tokens) {
            if (haveReachedMavenModule(token)) {
                break;
            }
            gitRoot.append(token);
            gitRoot.append("/");
        }
        return gitRoot.toString();
    }

    private static boolean haveReachedMavenModule(String token) {
        return token.startsWith("cep-mediation-");
    }

    public static String getGITRootForTestInLoadingModule() {
        return getModuleRoot("asn-sample-data/41511.per");
    }

    public static String getGITRootForTestInAutomatedTestModule() {
        return getModuleRoot("expected_results/GPEH/A20120516/1645-1700/A20120516.1645-1700_GPEHSession_454063302963615.txt");
    }
}
