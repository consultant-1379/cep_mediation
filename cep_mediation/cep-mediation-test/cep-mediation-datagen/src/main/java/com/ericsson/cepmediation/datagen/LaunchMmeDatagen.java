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
import com.ericsson.cepmediation.datagen.mme.MMEDataGenerator;
import com.ericsson.cepmediation.loading.events.EventRecordHandler;
import com.ericsson.cepmediation.loading.exception.ParsingFailedException;

/**
 * @author eikrwaq
 * @since 2013
 *
 */
public class LaunchMmeDatagen {
    private ExecutorService executor = Executors.newCachedThreadPool();

    public static void main(String[] args) throws ConfigurationException, SchemaException, ParsingFailedException {
        new LaunchMmeDatagen().launch();
    }

    private void launch() throws ConfigurationException, SchemaException, ParsingFailedException {
        System.setProperty(EventRecordHandler.SHOULD_NULLIFY_ASN1MESSAGECONTENTS_AFTER_DECODING, "false");
        executor.submit(new MMEDataGenerator());
    }
}
