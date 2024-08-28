package com.ericsson.cepmediation.datagen.mme;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.meta.admin.SchemaHandler;
import com.ericsson.cepmediation.datagen.common.DatagenProperties;
import com.ericsson.cepmediation.datagen.common.DatagenPropertiesConstants;
import com.ericsson.cepmediation.datagen.common.PublisherAdaptor;

public class MMEPublisher extends PublisherAdaptor {

    private ExecutorService executor;

    private static final Logger logger = LoggerFactory.getLogger(MMEPublisher.class);

    private ArrayList<ApEventBean> bufferlist = new ArrayList<ApEventBean>();

    private List<Future<?>> completed;

    private SchemaHandler schemaHandler;

    private XMMELoader mmeloader;

    private String sgsn;

    private final boolean isLivePlayback = DatagenProperties.instance.getLivePlayBackFlag();

    public MMEPublisher(SchemaHandler schemaHandler, List<Future<?>> completed, String sgsn, XMMELoader mmeloader,
            ExecutorService executor) {
        this.schemaHandler = schemaHandler;
        this.completed = completed;
        this.sgsn = sgsn;
        this.mmeloader = mmeloader;
        this.executor = executor;
    }

    @Override
    public void publishMessage(ApEventBean apEventBean) {
        bufferlist.add(apEventBean);
    }

    @Override
    public void flush() {
        if (bufferlist.size() > 0) {
            logger.info("buffer Size : " + bufferlist.size());
            logger.debug("Flushing MME events");

            ArrayList<ApEventBean> localThreadList = new ArrayList<ApEventBean>();

            for (ApEventBean events : bufferlist) {
                localThreadList.add(events.clone());
            }

            Future<?> future = executor.submit(new MMEFileProcessor(sgsn, changeFileName(getCurrentFileName()),
                    schemaHandler, mmeloader, localThreadList));
            completed.add(future);
            bufferlist = new ArrayList<ApEventBean>();
        }
    }

    @Override
    public void setCurrentFileName(String name) {
        if (!name.equals(currentFileName)) {
            flush();
        }
        super.setCurrentFileName(name);
    }

    protected String changeFileName(String filename) {
        // don't change the date for rop by rop processing 
        if (!isLivePlayback) {
            return filename;
        }
        Calendar date = Calendar.getInstance(TimeZone.getTimeZone("UTC"));

        //add 8 hour offset to the current date
        date.add(Calendar.HOUR_OF_DAY, DatagenPropertiesConstants.ROPOFFSET);

        String fileprefix = (String.format("%4d%02d%02d", date.get(Calendar.YEAR), date.get(Calendar.MONTH) + 1,
                date.get(Calendar.DAY_OF_MONTH)));

        filename = filename.replaceAll("\\^*[0-9]{8}", fileprefix);
        return filename;
    }
}
