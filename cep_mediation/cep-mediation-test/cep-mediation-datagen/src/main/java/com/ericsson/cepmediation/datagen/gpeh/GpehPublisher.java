package com.ericsson.cepmediation.datagen.gpeh;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
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
import com.ericsson.cepmediation.datagen.common.DatagenProperties;
import com.ericsson.cepmediation.datagen.common.GpehDateTime;
import com.ericsson.cepmediation.datagen.common.PublisherAdaptor;
import com.ericsson.cepmediation.datagen.common.XGPEHFooterRecord;
import com.ericsson.cepmediation.datagen.utils.Util;
import com.ericsson.cepmediation.loading.filerecords.Record;
import com.ericsson.cepmediation.loading.filerecords.RecordDescriptor;
import com.ericsson.cepmediation.loading.gpeh.GPEHFooterRecordHandler;
import com.ericsson.cepmediation.loading.gpeh.GPEHHeaderRecordHandler;
import com.ericsson.cepmediation.loading.service.GPEHParser;

/**
 * This class generates binary files comprising entire rop of gpeh data. 
 * 
 * The publisher receives events, modifies them if necessary and writes the events to a binary file.
 * 
 * @author emicned
 *
 */
public class GpehPublisher extends PublisherAdaptor {
    private final Logger logger = LoggerFactory.getLogger(GpehPublisher.class);

    private File internalDir = DatagenProperties.instance.getInternalDir();

    private ArrayList<ApEventBean> bufferlist = new ArrayList<ApEventBean>();

    private Map<Integer, Event> id2event;

    private SchemaTypeHandler schemaTypeHandler;

    private XGPEHFooterRecord footer = null;

    private List<Future<?>> completed;

    private int eventRecordType;

    private short footerRecordType;

    private String rncID;

    protected String filePrefix;

    private final boolean isLivePlayback = DatagenProperties.instance.getLivePlayBackFlag();

    private ExecutorService executor;

    private String fileInformationVersion;

    public GpehPublisher(final SchemaHandler schemaHandler, final List<Future<?>> completed, final String rncID,
            final ExecutorService executor) {
        this.rncID = rncID;
        this.completed = completed;
        schemaTypeHandler = schemaHandler.getSchemaMap().get(GPEHParser.GPEH_SCHEMA_TYPE);
        footerRecordType = new GPEHFooterRecordHandler().getRecordType();
        this.executor = executor;
    }

    public void writeHeaderFile(final File neFile, final String rncid) {
        try {
            logger.debug("Parsing header file: " + neFile.getAbsolutePath());
            GpehFileWriter out = new GpehFileWriter(internalDir.getAbsolutePath() + "/" + rncid, changeFileName(
                    neFile.getName(), rncid));

            final GPEHHeaderRecordHandler gpehHeaderRecordHandler = new GPEHHeaderRecordHandler(schemaTypeHandler);
            gpehHeaderRecordHandler.extractFileNameFields(neFile);
            eventRecordType = gpehHeaderRecordHandler.getEventRecordType();

            List<Record> records = Util.getRecords(new RecordDescriptor(true), neFile);
            for (Record record : records) {
                byte[] data = record.getData();
                if (record.getType() == gpehHeaderRecordHandler.getRecordType()) {
                    processHeaderRecord(gpehHeaderRecordHandler, data);
                } else if (record.getType() == footerRecordType) {
                    final GpehDateTime date = new GpehDateTime(data);
                    footer = new XGPEHFooterRecord(date);
                }
                out.writeRecord(data, record.getType());
            }
            out.close();
        } catch (IOException ioe) {
            logger.error("Could not write header file", ioe);
        } catch (SchemaException e) {
            logger.error("Schema error.", e);
        } catch (ParseException e) {
            logger.error("Error parsing date from filename: " + neFile.getName(), e);
        }
    }

    /* (non-Javadoc)
     * @see com.ericsson.cepmediation.datagen.common.PublisherAdaptor#setCurrentFileName(java.lang.String)
     */
    @Override
    public void setCurrentFileName(String name) {
        if (name.indexOf("Mp0") == -1) {
            if (!name.equals(currentFileName)) {
                flush();
            }
        }
        super.setCurrentFileName(name);
    }

    /**
     * @param gpehHeaderRecordHandler
     * @param data
     * @throws SchemaException
     */
    private void processHeaderRecord(final GPEHHeaderRecordHandler gpehHeaderRecordHandler, final byte[] data)
            throws SchemaException {
        gpehHeaderRecordHandler.process(data);
        fileInformationVersion = gpehHeaderRecordHandler.getFileInformationVersion();
        Schema schema = schemaTypeHandler.getFileInformationVersionMap().get(fileInformationVersion);
        id2event = schema.getEventHandler().getMap();
        logger.debug("Found schema version: " + fileInformationVersion);
    }

    /* (non-Javadoc)
     * @see com.ericsson.cepmediation.datagen.common.PublisherAdaptor#publishMessage(com.ericsson.cepmediation.base.apeventbeans.ApEventBean)
     */
    @Override
    public void publishMessage(ApEventBean apEventBean) {
        bufferlist.add(apEventBean);
    }

    /* (non-Javadoc)
     * @see com.ericsson.cepmediation.datagen.common.PublisherAdaptor#flush()
     */
    @Override
    public void flush() {
        if (bufferlist.size() > 0) {
            logger.debug("Flushing Events");

            String newFilename = changeFileName(getCurrentFileName(), rncID);

            logger.debug(bufferlist.size() + " events writing to " + newFilename);

            ArrayList<ApEventBean> localThreadList = new ArrayList<ApEventBean>();

            for (ApEventBean events : bufferlist) {
                localThreadList.add(events.clone());
            }

            Future<?> future = executor.submit(new GpehFileProcessor(rncID, newFilename, id2event, localThreadList,
                    eventRecordType, footer, fileInformationVersion));
            completed.add(future);

            localThreadList = new ArrayList<ApEventBean>();
            bufferlist = new ArrayList<ApEventBean>();
        }
    }

    /**
     * change the file name, i.e RNC Name and the date part to the current date 
     * @param filename
     * @param RNCID
     * @return
     */
    protected String changeFileName(final String filename, final String RNCID) {
        //change the RNCID 
        String name = filename.replaceAll("\\^*RNC[0-9]{2}", RNCID);

        // don't change the date for rop by rop processing 
        if (!isLivePlayback) {
            return name;
        }

        if ((filename.indexOf("Mp0") != -1)) {
            Calendar date = Calendar.getInstance();

            // add 15 min becasuse we always process future rop
            date.add(Calendar.MINUTE, 15);
            setFilePrefix(String.format("%4d%02d%02d", date.get(Calendar.YEAR), date.get(Calendar.MONTH) + 1,
                    date.get(Calendar.DAY_OF_MONTH)));
        }

        //change the date part in actual file name
        name = name.replaceAll("\\^*[0-9]{8}", getFilePrefix());
        return name;
    }

    /**
     * @param filePrefix
     */
    public void setFilePrefix(String filePrefix) {
        this.filePrefix = filePrefix;
    }

    /**
     * @return
     */
    public String getFilePrefix() {
        return filePrefix;
    }

}
