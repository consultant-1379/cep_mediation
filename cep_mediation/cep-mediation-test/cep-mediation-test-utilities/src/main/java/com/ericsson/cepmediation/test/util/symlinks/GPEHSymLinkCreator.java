/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.util.symlinks;

/**
 * @author eemecoy
 *
 */
public class GPEHSymLinkCreator {

    public static void main(String[] args) throws Exception {
        new SymLinkCreator().createSymbolicLinksForGPEHFiles();
    }

}
