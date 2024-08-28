package com.ericsson.eniq.events.cepmediation.datagen_precook;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.naming.ConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.meta.schema.SchemaException;
import com.ericsson.cepmediation.loading.events.EventRecordHandler;
import com.ericsson.cepmediation.loading.exception.ParsingFailedException;
import com.ericsson.eniq.events.cepmediation.datagen_precook.common.DataGenPropertiesConstants;
import com.ericsson.eniq.events.cepmediation.datagen_precook.common.DatagenProperties;
import com.ericsson.eniq.events.cepmediation.datagen_precook.common.RncType;
import com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.GpehOnlyDataPreparser;

public class LaunchDatagen {
    private final ExecutorService executor = Executors.newCachedThreadPool();

    private static final Logger logger = LoggerFactory.getLogger(LaunchDatagen.class);

    public static void main(final String[] args) throws ConfigurationException, SchemaException, ParsingFailedException {
        LaunchDatagen dataGen = new LaunchDatagen();
        dataGen.init(args);

        dataGen.launch();
    }

    private void init(final String[] args) {
        parseArguments(args);

        isImsiRequired(args);

        setupDatagenProperties(args);
    }

    /**
     * @param dataGen
     * @param args
     */
    private void setupDatagenProperties(String[] args) {
        final int rncType = Integer.parseInt(args[0].trim());
        final String directoryPath = (args.length > 1 && args[1].length() > 0 ? args[1].trim() : "");
        final String imsifilePath = (largeRncType(args[0]) && args.length > 2 && args[2].length() > 0 ? args[2].trim()
                : "");
        DatagenProperties.getInstance().setUeContextModudleIdPath(directoryPath);
        DatagenProperties.getInstance().setImsiListPath(imsifilePath);
        DatagenProperties.getInstance().setType(getRncType(rncType));
    }

    /**
     * @param args
     */
    private void isImsiRequired(final String[] args) {
        if (largeRncType(args[0]) && (args.length < 3 || args[2].length() == 0)) {
            logger.debug("user haven't specify the pre defined imsi mapping, will create random imsi list");
            System.setProperty(DataGenPropertiesConstants.CREATE_RANDOM_IMSI_SET, "true");
        } else if (!largeRncType(args[0])) {
            System.setProperty(DataGenPropertiesConstants.CREATE_RANDOM_IMSI_SET, "true");
        } else {
            System.setProperty(DataGenPropertiesConstants.CREATE_RANDOM_IMSI_SET, "false");
        }
    }

    /**
     * @param args
     */
    private void parseArguments(final String[] args) {
        if (args.length == 0) {
            logger.error("Please specify the RNC Type [1-9]");
            System.exit(0);
        }

        if (args.length == 1 || args[1].length() == 0) {
            logger.debug("location for selected ue context and module ids is not defined, will create new random list");
            System.setProperty(DataGenPropertiesConstants.CREATE_RANDOM_UECONTEXT_MODULEID_SET, "true");
        }
    }

    /**
     * @param args
     * @return
     */
    private boolean largeRncType(final String args) {
        return (args.equals("4") || args.equals("5") || args.equals("6") || args.equals("7") || args.equals("9") || args.equals("10"));
    }

    /**
     * @throws ConfigurationException
     * @throws SchemaException
     * @throws ParsingFailedException
     */
    private void launch() throws ConfigurationException, SchemaException, ParsingFailedException {
        System.setProperty(EventRecordHandler.SHOULD_NULLIFY_ASN1MESSAGECONTENTS_AFTER_DECODING, "false");
        executor.submit(new GpehOnlyDataPreparser());
    }

    /**
     * @param param
     * @return
     */
    private RncType getRncType(final int param) {
        switch (param) {
        case 1:
            return RncType.TYPE1;
        case 2:
            return RncType.TYPE2;
        case 3:
            return RncType.TYPE3;
        case 4:
            return RncType.TYPE4;
        case 5:
            return RncType.TYPE5;
        case 6:
            return RncType.TYPE6;
        case 7:
            return RncType.TYPE7;
        case 8:
            return RncType.TYPE8;
        case 9:
            return RncType.TYPE9;
        case 10:
            return RncType.TYPE10;
        default:
            throw new RuntimeException("Invalid rnc type specified");

        }
    }

}
