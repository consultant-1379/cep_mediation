package com.ericsson.cepmediation.decodingtool;

import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.publishing.Publisher;
import com.ericsson.cepmediation.decodingtool.parser.HeaderPrinter;
import com.ericsson.cepmediation.decodingtool.parser.RopParser;
import com.ericsson.cepmediation.decodingtool.parser.SgehParser;
import com.ericsson.cepmediation.decodingtool.publisher.ImsiPublisher;
import com.ericsson.cepmediation.decodingtool.publisher.MinMaxPublisher;
import com.ericsson.cepmediation.decodingtool.publisher.PartitionPublisher;
import com.ericsson.cepmediation.decodingtool.publisher.RawAsn1MessagePublisher;
import com.ericsson.cepmediation.decodingtool.publisher.RegexPublisher;
import com.ericsson.cepmediation.decodingtool.publisher.SessionPublisher;
import com.ericsson.cepmediation.decodingtool.publisher.SysUtilPublisher;
import com.ericsson.cepmediation.decodingtool.publisher.TimerangePublisher;
import com.ericsson.cepmediation.decodingtool.sgehpublisher.SgehRegexPublisher;
import com.ericsson.cepmediation.loading.service.EBMParser;
import com.ericsson.cepmediation.loading.service.GPEHParser;
import com.ericsson.cepmediation.test.common.RadioUser;

/**
 * Entry point for the application.
 * 
 * Parses the command to be executed from command line arguments.
 * 
 * Inits the parser with the appropriate publisher and starts the parser.
 * 
 * @author emicned
 * 
 */
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public enum COMMANDS {
        SESSIONS, IMSIS, SYSUTILS, TIMERANGE, PARTITIONS, MINMAXDATE, RAWASN1MESSAGES, REGEX, SGEH_REGEX, GPEH_HEADER, SGEH_HEADER
    }

    private static final String TIME_ZONE = "UTC";

    private static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";

    private static final DateFormat dateFormat = new SimpleDateFormat(DATE_TIME_FORMAT);
    static {
        dateFormat.setTimeZone(TimeZone.getTimeZone(TIME_ZONE));
    }

    public static void main(final String[] args) throws Exception {
        if (args.length == 0) {
            logger.error("Please specify the command. Supported commands: " + Arrays.asList(COMMANDS.values()));
            System.exit(0);
        }

        if (args.length == 1) {
            logger.error("Please specify the folder containing rop data(absolute path)");
            System.exit(0);
        }

        final String command = args[0].trim();
        final String directoryPath = args[1].trim();

        Publisher pub = null;
        if (COMMANDS.IMSIS.name().equalsIgnoreCase(command)) {
            pub = createImsiPublisher();
        } else if (COMMANDS.SESSIONS.name().equalsIgnoreCase(command)) {
            pub = createSessionPublisher(args);
        } else if (COMMANDS.SYSUTILS.name().equalsIgnoreCase(command)) {
            pub = createSystemUtilPublisher(args, dateFormat);
        } else if (COMMANDS.TIMERANGE.name().equalsIgnoreCase(command)) {
            pub = createTimerangePublisher(args, dateFormat);
        } else if (COMMANDS.MINMAXDATE.name().equalsIgnoreCase(command)) {
            pub = new MinMaxPublisher();
        } else if (COMMANDS.PARTITIONS.name().equalsIgnoreCase(command)) {
            pub = createPartitionPublisher(args);
        } else if (COMMANDS.RAWASN1MESSAGES.name().equalsIgnoreCase(command)) {
            pub = createRawAsn1MessagePublisher(args);
        } else if (COMMANDS.REGEX.name().equalsIgnoreCase(command)) {
            if (args.length != 3) {
                logger.error("Please specify regex");
                System.exit(0);
            }

            pub = new RegexPublisher(args[2]);
        } else if (COMMANDS.SGEH_REGEX.name().equalsIgnoreCase(command)) {
            if (args.length != 3) {
                logger.error("Please specify regex");
                System.exit(0);
            }

            pub = new SgehRegexPublisher(args[2]);

            new SgehParser(directoryPath, pub).parseFiles();
            System.exit(0);
        } else if (COMMANDS.GPEH_HEADER.name().equalsIgnoreCase(command) || COMMANDS.SGEH_HEADER.name().equalsIgnoreCase(command)) {
            File headerFile = new File(directoryPath);
            if (!headerFile.exists()) {
                logger.error("Header file does not exist: " + headerFile.getAbsolutePath());
                System.exit(1);
            } else if (!headerFile.getName().startsWith("A")) {
                logger.error("Not a header file: " + headerFile.getAbsolutePath() + ". Filename should start with A");
                System.exit(1);
            } else {
                HeaderPrinter headerPrinter = new HeaderPrinter(COMMANDS.GPEH_HEADER.name().equalsIgnoreCase(command) ? GPEHParser.GPEH_SCHEMA_TYPE : EBMParser.EBM_SCHEMA_TYPE);
                headerPrinter.print(headerFile);
                System.exit(0);
            }
        } else {
            logger.error("Uknown command: " + command);
            System.exit(1);
        }

        logger.info("Parsed program arguments succesfuly");

        new RopParser(directoryPath, pub).parseFiles();
    }

    private static Publisher createRawAsn1MessagePublisher(final String[] args) {
        if (args.length != 4) {
            logger.error("Please specify directoryPath ueContext rncModuleId");
            System.exit(1);
        }
        final RadioUser specifiedUser = new RadioUser();
        final short ueContext = Short.parseShort(args[2]);
        specifiedUser.setUeContextForUser(ueContext);
        final byte rncModuleId = Byte.parseByte(args[3]);
        specifiedUser.setRncModuleIdForUser(rncModuleId);
        return new RawAsn1MessagePublisher(specifiedUser);
    }

    private static Publisher createPartitionPublisher(final String[] args) {
        if (args.length != 4) {
            logger.error("Please provide ue context and rnc module id");
            System.exit(0);
        }

        PartitionPublisher pub = null;
        try {
            final short ueContext = Short.parseShort(args[2].trim());
            final short moduleId = Short.parseShort(args[3].trim());
            pub = new PartitionPublisher(ueContext, moduleId);
        } catch (final Exception e) {
            logger.error("Illegal ueContext or moduleId: " + args[2] + "/" + args[3] + " Exception: " + e.getMessage());
            System.exit(1);
        }
        return pub;
    }

    private static Publisher createTimerangePublisher(final String[] args, final DateFormat dateFormat) {
        if (args.length != 4) {
            logger.error("Please specify start date and end date. Format for dates: 2012-05-16 16:29:59.000");
        }
        long start = -1;
        long end = -1;
        try {
            start = dateFormat.parse(args[2].trim()).getTime();
            end = dateFormat.parse(args[3].trim()).getTime();
        } catch (final ParseException e) {
            logger.error("Illegal Arguments:" + args[2] + " " + args[3]);
            logger.error("Format for dates: 2012-05-16 16:29:59.000");
            logger.error("Exception:" + e);
            System.exit(0);
        }
        return new TimerangePublisher(start, end);
    }

    private static Publisher createSystemUtilPublisher(final String[] args, final DateFormat dateFormat) {
        if (args.length != 5) {
            logger.error("Please specify start date, end date and c_id. Format for dates: 2012-05-16 16:29:59.000");
        }
        long start = -1;
        long end = -1;
        int cellId = -1;
        try {
            start = dateFormat.parse(args[2].trim()).getTime();
            end = dateFormat.parse(args[3].trim()).getTime();
            cellId = Integer.parseInt(args[4].trim());
        } catch (final ParseException e) {
            logger.error("Illegal Arguments:" + args[2] + " " + args[3] + " " + args[4]);
            logger.error("Format for dates: 2012-05-16 16:29:59.000 ");
            logger.error("Exception:" + e);
            System.exit(0);
        }

        return new SysUtilPublisher(start, end, cellId);
    }

    private static Publisher createSessionPublisher(final String[] args) {
        if (args.length != 3) {
            logger.error("Pease specify imsi");
            System.exit(0);
        }
        return new SessionPublisher(args[2]);
    }

    private static Publisher createImsiPublisher() {
        return new ImsiPublisher();
    }
}
