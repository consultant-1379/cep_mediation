/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2013 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.datagen;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.naming.ConfigurationException;

import com.ericsson.cepmediation.base.meta.schema.SchemaException;
import com.ericsson.cepmediation.datagen.utils.LiveFileCopier;
import com.ericsson.cepmediation.loading.exception.ParsingFailedException;

/**
 * @author eikrwaq
 * @since 2013
 *
 */
public class LaunchLiveDatagen {
    private ExecutorService executor = Executors.newCachedThreadPool();

    public static void main(String[] args) throws ConfigurationException, SchemaException, ParsingFailedException {
        new LaunchLiveDatagen().launch();

    }

    private void launch() throws ConfigurationException, SchemaException, ParsingFailedException {
        executor.submit(new LiveFileCopier());
    }
}
