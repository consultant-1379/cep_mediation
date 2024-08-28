package com.ericsson.cepmediation.datagen.mme;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.apeventbeans.ebm.ACTIVATE;
import com.ericsson.cepmediation.apeventbeans.ebm.ATTACH;
import com.ericsson.cepmediation.apeventbeans.ebm.DEACTIVATE;
import com.ericsson.cepmediation.apeventbeans.ebm.DETACH;
import com.ericsson.cepmediation.apeventbeans.ebm.ISRAU;
import com.ericsson.cepmediation.apeventbeans.ebm.RAU;
import com.ericsson.cepmediation.apeventbeans.ebm.SERVICE_REQUEST;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.meta.admin.SchemaHandler;
import com.ericsson.cepmediation.base.meta.admin.SchemaTypeHandler;
import com.ericsson.cepmediation.base.meta.schema.Event;
import com.ericsson.cepmediation.base.meta.schema.Schema;
import com.ericsson.cepmediation.base.meta.schema.SchemaException;
import com.ericsson.cepmediation.datagen.common.DatagenProperties;
import com.ericsson.cepmediation.datagen.common.DatagenPropertiesConstants;
import com.ericsson.cepmediation.datagen.common.XPacker;
import com.ericsson.cepmediation.loading.service.EBMParser;

public class MMEFileProcessor extends Thread {
    private final Logger logger = LoggerFactory.getLogger(MMEFileProcessor.class);

    private File internalDir = DatagenProperties.instance.getInternalDir();

    private ArrayList<ApEventBean> eventsList;

    private SgehFileWriter writer;

    private String sGSNID;

    private String filename;

    private XMMELoader mmeloader;

    private SchemaTypeHandler schemaTypeHandler;

    private MMEFooterRecord footer;

    private MMEHearderRecord header;

    private Map<Integer, Event> id2event;

    private final String CHANGE_IMSI_PREFIX = "111";

    private final String HOME_IMSI_PREFIX = "45406";

    private final String INVALID_IMIS = "0fffffffffffffff";

    public MMEFileProcessor(String sGSNID, String filename, SchemaHandler schemaHandler, XMMELoader mmeloader,
            ArrayList<ApEventBean> eventsList) {
        this.sGSNID = sGSNID;
        this.filename = filename;
        try {
            this.schemaTypeHandler = new SchemaHandler().getSchemaMap().get(EBMParser.EBM_SCHEMA_TYPE);
        } catch (SchemaException e) {
            logger.error(e.getMessage() + ":" + e.toString());
            e.printStackTrace();
        }
        this.mmeloader = mmeloader;
        this.eventsList = eventsList;
        this.header = new MMEHearderRecord(mmeloader);
        this.footer = new MMEFooterRecord(mmeloader);
    }

    @Override
    public void run() {
        id2event = getEventMap();
        logger.debug("Thread " + Thread.currentThread() + "is running ");
        try {
            writer = new SgehFileWriter(internalDir.getAbsolutePath() + "/" + sGSNID.toUpperCase(), filename);
            writer.writeRecord(header.toByteArray(), header.getRecordType());
            for (ApEventBean apEventBean : eventsList) {
                ApEventBean aEventBeanclone = apEventBean.clone();

                aEventBeanclone = changeRncAndImsi(aEventBeanclone);

                Event event = id2event.get(aEventBeanclone.getEventId());
                byte[] data = aEventBeanclone.getData(event);

                if (event.isBitpacked()) {
                    data = new XPacker(event).pack(data);
                }

                writer.writeRecord(data, getEventRecordType());
                aEventBeanclone = null;
            }
            close();
        } catch (Throwable e) {
            if (e.getMessage() != null) {
                logger.error(e.getMessage() + ":" + e.toString());
                e.printStackTrace();
            } else {
                e.printStackTrace();
            }
        }
        eventsList = null;
    }

    /**
     * @param aEventBeanclone
     * @return
     */
    private ApEventBean changeRncAndImsi(ApEventBean evnt) {
        if (sGSNID.equals(DatagenPropertiesConstants.SGSN04)) {
            return evnt;
        }

        if (evnt instanceof ACTIVATE) {
            if (!((ACTIVATE) evnt).getIMSI().equals(INVALID_IMIS)) {
                ((ACTIVATE) evnt).setIMSI(modifyIMSI(((ACTIVATE) evnt).getIMSI()));
            }
        } else if (evnt instanceof ATTACH) {
            if (!((ATTACH) evnt).getIMSI().equals(INVALID_IMIS)) {
                ((ATTACH) evnt).setIMSI(modifyIMSI(((ATTACH) evnt).getIMSI()));
            }
        } else if (evnt instanceof DEACTIVATE) {
            if (!((DEACTIVATE) evnt).getIMSI().equals(INVALID_IMIS)) {
                ((DEACTIVATE) evnt).setIMSI(modifyIMSI(((DEACTIVATE) evnt).getIMSI()));
            }
        } else if (evnt instanceof ISRAU) {
            if (!((ISRAU) evnt).getIMSI().equals(INVALID_IMIS)) {
                ((ISRAU) evnt).setIMSI(modifyIMSI(((ISRAU) evnt).getIMSI()));
            }
        } else if (evnt instanceof RAU) {
            if (!((RAU) evnt).getIMSI().equals(INVALID_IMIS)) {
                ((RAU) evnt).setIMSI(modifyIMSI(((RAU) evnt).getIMSI()));
            }
        } else if (evnt instanceof DETACH) {
            if (!((DETACH) evnt).getMSID_IMSI().equals(INVALID_IMIS)) {
                ((DETACH) evnt).setMSID_IMSI(modifyIMSI(((DETACH) evnt).getMSID_IMSI()));
            }
        } else if (evnt instanceof SERVICE_REQUEST) {
            if (!((SERVICE_REQUEST) evnt).getMSID_IMSI().equals(INVALID_IMIS)) {
                ((SERVICE_REQUEST) evnt).setMSID_IMSI(modifyIMSI(((SERVICE_REQUEST) evnt).getMSID_IMSI()));
            }
        }
        return evnt;
    }

    public void close() {
        if (writer != null) {
            writer.writeRecord(footer.toByteArray(), footer.getRecordType());
            writer.close();
        }
    }

    private Map<Integer, Event> getEventMap() {

        String fileInformationVersion = (mmeloader.getMmeHeaderRecordHandler()).getFileInformationVersion();
        Schema schema = schemaTypeHandler.getFileInformationVersionMap().get(fileInformationVersion);

        id2event = schema.getEventHandler().getMap();
        logger.debug("Schema found fiv : " + fileInformationVersion);
        return id2event;
    }

    private int getEventRecordType() {
        return (mmeloader.getMmeHeaderRecordHandler()).getEventRecordType();
    }

    public synchronized String modifyIMSI(String IMSI) {
        if (IMSI.length() > 0 && IMSI.startsWith(HOME_IMSI_PREFIX)) {
            StringBuilder s = new StringBuilder(IMSI);
            String sgsnIDtoreplace = sGSNID.substring(4, sGSNID.length());

            s.replace(0, CHANGE_IMSI_PREFIX.length() + sgsnIDtoreplace.length(),
                    CHANGE_IMSI_PREFIX.concat(sgsnIDtoreplace));
            return s.toString();
        }
        return IMSI;
    }
}
