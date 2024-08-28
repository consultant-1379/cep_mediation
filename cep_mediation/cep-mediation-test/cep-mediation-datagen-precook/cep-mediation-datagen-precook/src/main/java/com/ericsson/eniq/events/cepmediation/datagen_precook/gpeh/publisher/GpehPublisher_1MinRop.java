package com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.publisher;

import static com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.GpehPreparserConstants.*;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.meta.admin.SchemaHandler;
import com.ericsson.cepmediation.base.meta.admin.SchemaTypeHandler;
import com.ericsson.cepmediation.base.meta.schema.Event;
import com.ericsson.cepmediation.base.meta.schema.Schema;
import com.ericsson.cepmediation.base.meta.schema.SchemaException;
import com.ericsson.cepmediation.loading.filerecords.Record;
import com.ericsson.cepmediation.loading.filerecords.RecordDescriptor;
import com.ericsson.cepmediation.loading.gpeh.GPEHFooterRecordHandler;
import com.ericsson.cepmediation.loading.gpeh.GPEHHeaderRecordHandler;
import com.ericsson.cepmediation.loading.service.GPEHParser;
import com.ericsson.eniq.events.cepmediation.datagen_precook.common.DatagenProperties;
import com.ericsson.eniq.events.cepmediation.datagen_precook.common.GpehDateTime;
import com.ericsson.eniq.events.cepmediation.datagen_precook.common.PublisherAdaptor;
import com.ericsson.eniq.events.cepmediation.datagen_precook.common.RncType;
import com.ericsson.eniq.events.cepmediation.datagen_precook.common.XGPEHFooterRecord;
import com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.GpehFileWriter;
import com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.eventprocessor.EventProcessor;
import com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.eventprocessor.EventProcessorFactory;
import com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.eventprocessor.oneminrops.OneMinuteRopFileNames;
import com.ericsson.eniq.events.cepmediation.datagen_precook.utils.RandomIMSIGenerator;
import com.ericsson.eniq.events.cepmediation.datagen_precook.utils.Util;
import com.ericsson.eniq.events.cepmediation.datagen_precook.utils.fileutils.FileLoaderUeContextModuleID;
import com.ericsson.eniq.events.cepmediation.datagen_precook.utils.uecontext.RandomUeContextMoudleIDGenerator;
import com.ericsson.eniq.events.cepmediation.datagen_precook.utils.uecontext.UeContextModuleID;

/**
* This class generates binary files comprising entire rop of gpeh data.
* 
 * The publisher receives events, modifies them if necessary and writes the
* events to a binary file.
* 
 * @author emicned
* 
 */
public class GpehPublisher_1MinRop extends PublisherAdaptor {
    private static final Logger logger = LoggerFactory.getLogger(GpehPublisher_1MinRop.class);

    private static File internalDir = DatagenProperties.getInstance().getIntermediateFileLocation();

    private static final RncType type = DatagenProperties.getInstance().getType();

    protected ArrayList<ApEventBean> bufferlist = new ArrayList<ApEventBean>();

    private Map<Integer, Event> id2event;

    private final SchemaTypeHandler schemaTypeHandler;

    private static XGPEHFooterRecord footer = null;

    private final List<Future<?>> completed;

    private int eventRecordType;

    private final short footerRecordType;

    private static int linkRecordCounter = 0;

    Future<?> future = null;

    private ExecutorService executor;

    private final OneMinuteRopFileNames oneMinuteList;

    private final HashSet<UeContextModuleID> ueContextModuleIDtoProcess;

    private final RandomIMSIGenerator randomIMSIGenerator;

    protected final RandomUeContextMoudleIDGenerator ueContextGen;

    public GpehPublisher_1MinRop(final SchemaHandler schemaHandler, final List<Future<?>> completed,
            final ExecutorService executor) {
        this.completed = completed;
        schemaTypeHandler = schemaHandler.getSchemaMap().get(GPEHParser.GPEH_SCHEMA_TYPE);
        this.executor = executor;
        footerRecordType = new GPEHFooterRecordHandler().getRecordType();
        ueContextModuleIDtoProcess = new FileLoaderUeContextModuleID().getUeContextModuleIDs();
        oneMinuteList = new OneMinuteRopFileNames();
        randomIMSIGenerator = new RandomIMSIGenerator();
        ueContextGen = new RandomUeContextMoudleIDGenerator(
                RandomUeContextMoudleIDGenerator.MAX_NO_OF_UNIQUE_UECONTEXT_MODULE_ID_SET_AVAILABLE);
    }

    @Override
    public void writeHeaderFile(final File neFile) {
        try {
            logger.debug("Parsing header file: " + neFile.getAbsolutePath());
            final GpehFileWriter out[] = new GpehFileWriter[15];

            final List<String> fileNames = oneMinuteList.getFileNames(neFile.getName());
            for (int x = 0; x < 15; x++) {
                out[x] = new GpehFileWriter(internalDir.getAbsolutePath() + "/" + type.name(), fileNames.get(x));
            }

            final GPEHHeaderRecordHandler gpehHeaderRecordHandler = new GPEHHeaderRecordHandler(schemaTypeHandler);
            gpehHeaderRecordHandler.extractFileNameFields(neFile);
            eventRecordType = gpehHeaderRecordHandler.getEventRecordType();

            final int numberOfLinkFilesRequired = type.getNumOfFiles();

            int countNumberOfLinkFiles = 0;
            final List<Record> records = Util.getRecords(new RecordDescriptor(true), neFile);
            for (final Record record : records) {
                byte[] data = record.getData();
                if (record.getType() == gpehHeaderRecordHandler.getRecordType()) {
                    processHeaderRecord(gpehHeaderRecordHandler, data);
                } else if (record.getType() == footerRecordType) {
                    final GpehDateTime date = new GpehDateTime(data);
                    footer = new XGPEHFooterRecord(date);
                } else if (record.getType() == 8) {
                    if (countNumberOfLinkFiles < numberOfLinkFilesRequired) {
                        if (countNumberOfLinkFiles >= 14) {
                            for (int x = 0; x < 15; x++) {
                                //Write the extra link files that we require
                                int numberOfNewRecordLinksRequired = (numberOfLinkFilesRequired - countNumberOfLinkFiles) - 1;
                                while (numberOfNewRecordLinksRequired != 0) {
                                    final String newRecordLink = getLinkRecord(fileNames.get(x));
                                    byte[] linkRecordByte = newRecordLink.getBytes();
                                    linkRecordByte = addPadding(linkRecordByte);

                                    out[x].writeRecord(linkRecordByte, record.getType());
                                    numberOfNewRecordLinksRequired--;
                                    data = new byte[] {};
                                }
                                //Write the last record
                                final String endRecord = getEndLinkRecord(fileNames.get(x));
                                byte[] linkRecordByte = endRecord.getBytes();
                                linkRecordByte = addPadding(linkRecordByte);
                                out[x].writeRecord(linkRecordByte, record.getType());
                                data = new byte[] {};
                            }
                        } else {
                            for (int x = 0; x < 15; x++) {
                                final String newRecordLink = getLinkRecord(fileNames.get(x));
                                byte[] linkRecordByte = newRecordLink.getBytes();
                                linkRecordByte = addPadding(linkRecordByte);
                                out[x].writeRecord(linkRecordByte, record.getType());
                                data = new byte[] {};
                            }
                        }
                        countNumberOfLinkFiles++;
                    } else {
                        data = new byte[] {};
                    }
                }
                //If we haven't already written the data, write out whatever was in the original 15 min rop file 
                //into the new 15 1 min rop files
                if (data.length > 0) {
                    for (final GpehFileWriter writer : out) {
                        writer.writeRecord(data, record.getType());
                    }
                }
            }
            for (final GpehFileWriter writer : out) {
                writer.close();
            }
        } catch (final IOException ioe) {
            logger.error("Could not write header file", ioe);
        } catch (final SchemaException e) {
            logger.error("Schema error.", e);
        } catch (final ParseException e) {
            logger.error("Error parsing date from filename: " + neFile.getName(), e);
        }
    }

    private void processHeaderRecord(final GPEHHeaderRecordHandler gpehHeaderRecordHandler, final byte[] data)
            throws SchemaException {
        gpehHeaderRecordHandler.process(data);
        final String fileInformationVersion = gpehHeaderRecordHandler.getFileInformationVersion();
        final Schema schema = schemaTypeHandler.getFileInformationVersionMap().get(fileInformationVersion);
        id2event = schema.getEventHandler().getMap();
        logger.debug("Found schema version: " + fileInformationVersion);
    }

    @Override
    public void publishMessage(final ApEventBean apEventBean) {
        bufferlist.add(apEventBean);
    }

    @Override
    public void flush() {
        if (bufferlist.size() > 0) {
            logger.debug("Flushing Events");
            logger.debug("writing " + bufferlist.size() + "..");

            final EventProcessor eventProcessor = EventProcessorFactory.getEventProcessor(DatagenProperties
                    .getInstance().getType());
            eventProcessor.processEvents(bufferlist, id2event, eventRecordType, getCurrentFileName(), footer,
                    completed, ueContextModuleIDtoProcess, executor, randomIMSIGenerator, ueContextGen);
            bufferlist = new ArrayList<ApEventBean>();
        }
    }

    // create link record
    private String getLinkRecord(final String filename) {
        final String counterStr = String.valueOf(linkRecordCounter);
        final String imsi = "/" + LINK_RECORD_PREFIX
                + (getZeroString(LINK_RECORD_LENGTH - LINK_RECORD_PREFIX.length() - counterStr.length()) + counterStr)
                + "/" + filename.substring(0, 19) + "_GPEH.lnk.gz";
        linkRecordCounter++;
        return imsi;
    }

    // create link record
    private String getEndLinkRecord(final String filename) {
        final String imsi = "/c" + "/" + filename.substring(0, 19) + "_GPEH.lnk.gz";
        return imsi;
    }

    private String getZeroString(final int noOfZeroes) {
        final StringBuilder zeroes = new StringBuilder();
        for (int j = 0; j < noOfZeroes; j++) {
            zeroes.append(ZERO);
        }
        return zeroes.toString();
    }

    // add padding in linkrecord
    private byte[] addPadding(final byte[] linkRecordByte) {
        final byte[] padding = new byte[256];

        for (int i = 0; i < padding.length; i++) {
            padding[i] = (byte) 0;
        }
        System.arraycopy(linkRecordByte, 0, padding, 0, linkRecordByte.length);
        return padding;
    }
}
