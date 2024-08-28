package com.ericsson.cepmediation.datagen;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.naming.ConfigurationException;

import com.ericsson.cepmediation.base.meta.schema.SchemaException;
import com.ericsson.cepmediation.datagen.common.DatagenProperties;
import com.ericsson.cepmediation.datagen.gpeh.GpehDataGenerator;
import com.ericsson.cepmediation.datagen.mme.MMEDataGenerator;
import com.ericsson.cepmediation.datagen.utils.CurrentTimeFileMover;
import com.ericsson.cepmediation.loading.events.EventRecordHandler;
import com.ericsson.cepmediation.loading.exception.ParsingFailedException;

public class LaunchDatagen {
    private ExecutorService executor = Executors.newCachedThreadPool();

    private final boolean isLivePlayback = DatagenProperties.instance.getLivePlayBackFlag();

    private final boolean createGpehFlag = DatagenProperties.instance.getGpehFlag();

    private final boolean createSgsnFlag = DatagenProperties.instance.getSgsnFlag();

    public static void main(String[] args) throws ConfigurationException, SchemaException, ParsingFailedException {
        new LaunchDatagen().launch();
    }

    private void launch() throws ConfigurationException, SchemaException, ParsingFailedException {
        System.setProperty(EventRecordHandler.SHOULD_NULLIFY_ASN1MESSAGECONTENTS_AFTER_DECODING, "false");

        if (createGpehFlag) {
            executor.submit(new GpehDataGenerator());
        }

        if (createSgsnFlag) {
            executor.submit(new MMEDataGenerator());
        }

        if (isLivePlayback && createGpehFlag) {
            executor.submit(new CurrentTimeFileMover());
        }

    }

}
