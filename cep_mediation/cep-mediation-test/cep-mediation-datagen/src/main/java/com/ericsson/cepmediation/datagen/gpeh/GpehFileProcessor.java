package com.ericsson.cepmediation.datagen.gpeh;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CHANNEL_SWITCHING;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_FAILED_HSDSCH_CELL_CHANGE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_IMSI;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_RES_CPICH_ECNO;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SOFT_HANDOVER_EXECUTION;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SUCCESSFUL_HSDSCH_CELL_SELECTION_NEW_ACTIVE_SET;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SUCCESSFUL_HSDSCH_CELL_SELECTION_OLD_ACTIVE_SET;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SYSTEM_RELEASE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_UE_POSITIONING_QOS;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_UE_POSITIONING_UNSUCC;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.meta.admin.SchemaHandler;
import com.ericsson.cepmediation.base.meta.admin.SchemaTypeHandler;
import com.ericsson.cepmediation.base.meta.schema.Event;
import com.ericsson.cepmediation.base.meta.schema.Schema;
import com.ericsson.cepmediation.base.meta.schema.SchemaException;
import com.ericsson.cepmediation.datagen.common.DatagenProperties;
import com.ericsson.cepmediation.datagen.common.XGPEHFooterRecord;
import com.ericsson.cepmediation.datagen.common.XPacker;
import com.ericsson.cepmediation.loading.gpeh.GPEHFooterRecordHandler;
import com.ericsson.cepmediation.loading.service.GPEHParser;

public class GpehFileProcessor extends Thread {

    private final String HOME_IMSI_PREFIX = "0454";

    private final String CHANGE_IMSI_PREFIX = "111";

    private final String CHANGE_IMSI_PREFIX_FOR_RNCS_GREATERTHAN_100 = "110";

    private final String INVALID_IMIS = "0fffffffffffffff";

    private final Logger logger = LoggerFactory.getLogger(GpehFileProcessor.class);

    private GpehFileWriter writer;

    private String rNCID;

    private String filename;

    private Map<Integer, Event> id2event;

    private ArrayList<ApEventBean> eventsList;

    private int eventRecordType;

    private XGPEHFooterRecord footer = null;

    private short footerRecordType;

    private static final int ORGINAL_RNC_ID = 9;

    private static File internalDir = DatagenProperties.instance.getInternalDir();

    private String fileInformationVersion;

    public GpehFileProcessor(final String RNCID, final String filename, final Map<Integer, Event> id2event,
            final ArrayList<ApEventBean> eventsList, final int eventRecordType, final XGPEHFooterRecord footer,
            final String fileInformationVersion) {
        this.rNCID = RNCID;
        this.filename = filename;
        this.id2event = id2event;
        this.eventsList = eventsList;
        this.eventRecordType = eventRecordType;
        this.footer = footer;
        footerRecordType = new GPEHFooterRecordHandler().getRecordType();
        this.fileInformationVersion = fileInformationVersion;
    }

    @Override
    public void run() {

        try {
            processHeaderRecord(fileInformationVersion);
            logger.debug("Thread " + Thread.currentThread() + "is running ");

            writer = new GpehFileWriter(internalDir.getAbsolutePath() + "/" + rNCID, filename);

            for (ApEventBean apEventBean : eventsList) {

                Event event = id2event.get(new Integer(apEventBean.getEventId()));

                ApEventBean aEventBeanclone = apEventBean.clone();

                if (apEventBean instanceof GpehBase) {
                    GpehBase e = (GpehBase) aEventBeanclone;
                    e = changeRncAndImsi(e);
                }

                byte[] data = aEventBeanclone.getData(event);
                if (event.isBitpacked()) {
                    data = new XPacker(event).pack(data);
                }
                writer.writeRecord(data, eventRecordType);
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
     * Change the RNCS ID and IMSI for the each event secondly, Replace the RNC_ID_SOURCE and RNC_ID_TARGET to the required RNC
     * @param e
     */
    private GpehBase changeRncAndImsi(GpehBase e) {
        if (e.getRNC_ID_1() == ORGINAL_RNC_ID) {
            e.setRNC_ID_1(getModifiedRNCID());
        }
        if (e instanceof INTERNAL_SOFT_HANDOVER_EXECUTION) {
            if (((INTERNAL_SOFT_HANDOVER_EXECUTION) e).getRNC_ID_EVALUATED() == ORGINAL_RNC_ID) {
                ((INTERNAL_SOFT_HANDOVER_EXECUTION) e).setRNC_ID_EVALUATED(getModifiedRNCID());
            }
        } else if (e instanceof INTERNAL_FAILED_HSDSCH_CELL_CHANGE) {
            if (((INTERNAL_FAILED_HSDSCH_CELL_CHANGE) e).getRNC_ID_SOURCE() == ORGINAL_RNC_ID) {
                ((INTERNAL_FAILED_HSDSCH_CELL_CHANGE) e).setRNC_ID_SOURCE(getModifiedRNCID());
            } else if (((INTERNAL_FAILED_HSDSCH_CELL_CHANGE) e).getRNC_ID_TARGET() == ORGINAL_RNC_ID) {
                ((INTERNAL_FAILED_HSDSCH_CELL_CHANGE) e).setRNC_ID_TARGET(getModifiedRNCID());
            }
        } else if (e instanceof INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED) {
            if (((INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED) e).getRNC_ID_TARGET() == ORGINAL_RNC_ID) {
                ((INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED) e).setRNC_ID_TARGET(getModifiedRNCID());
            }
        } else if (e instanceof INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE) {
            if (((INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE) e).getRNC_ID_SOURCE() == ORGINAL_RNC_ID) {
                ((INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE) e).setRNC_ID_SOURCE(getModifiedRNCID());
            } else if (((INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE) e).getRNC_ID_TARGET() == ORGINAL_RNC_ID) {
                ((INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE) e).setRNC_ID_TARGET(getModifiedRNCID());
            }
        } else if (e instanceof INTERNAL_SUCCESSFUL_HSDSCH_CELL_SELECTION_NEW_ACTIVE_SET) {
            if (((INTERNAL_SUCCESSFUL_HSDSCH_CELL_SELECTION_NEW_ACTIVE_SET) e).getRNC_ID_TARGET() == ORGINAL_RNC_ID) {
                ((INTERNAL_SUCCESSFUL_HSDSCH_CELL_SELECTION_NEW_ACTIVE_SET) e).setRNC_ID_TARGET(getModifiedRNCID());
            }
        } else if (e instanceof INTERNAL_SUCCESSFUL_HSDSCH_CELL_SELECTION_OLD_ACTIVE_SET) {
            if (((INTERNAL_SUCCESSFUL_HSDSCH_CELL_SELECTION_OLD_ACTIVE_SET) e).getRNC_ID_TARGET() == ORGINAL_RNC_ID) {
                ((INTERNAL_SUCCESSFUL_HSDSCH_CELL_SELECTION_OLD_ACTIVE_SET) e).setRNC_ID_TARGET(getModifiedRNCID());
            }
        } else if (e instanceof INTERNAL_CHANNEL_SWITCHING) {
            if (!((INTERNAL_CHANNEL_SWITCHING) e).getIMSI().equals(INVALID_IMIS)) {
                ((INTERNAL_CHANNEL_SWITCHING) e).setIMSI(modifyIMSI(((INTERNAL_CHANNEL_SWITCHING) e).getIMSI()));
            }
        } else if (e instanceof INTERNAL_IMSI) {
            if (!((INTERNAL_IMSI) e).getIMSI().equals(INVALID_IMIS)) {
                ((INTERNAL_IMSI) e).setIMSI(modifyIMSI(((INTERNAL_IMSI) e).getIMSI()));
            }
        } else if (e instanceof INTERNAL_RES_CPICH_ECNO) {
            if (!((INTERNAL_RES_CPICH_ECNO) e).getIMSI().equals(INVALID_IMIS)) {
                ((INTERNAL_RES_CPICH_ECNO) e).setIMSI(modifyIMSI(((INTERNAL_RES_CPICH_ECNO) e).getIMSI()));
            }
        } else if (e instanceof INTERNAL_SYSTEM_RELEASE) {
            if (!((INTERNAL_SYSTEM_RELEASE) e).getIMSI().equals(INVALID_IMIS)) {
                ((INTERNAL_SYSTEM_RELEASE) e).setIMSI(modifyIMSI(((INTERNAL_SYSTEM_RELEASE) e).getIMSI()));
            }
        } else if (e instanceof INTERNAL_UE_POSITIONING_QOS) {
            if (!((INTERNAL_UE_POSITIONING_QOS) e).getIMSI().equals(INVALID_IMIS)) {
                ((INTERNAL_UE_POSITIONING_QOS) e).setIMSI(modifyIMSI(((INTERNAL_UE_POSITIONING_QOS) e).getIMSI()));
            }
        } else if (e instanceof INTERNAL_UE_POSITIONING_UNSUCC) {
            if (!((INTERNAL_UE_POSITIONING_UNSUCC) e).getIMSI().equals(INVALID_IMIS)) {
                ((INTERNAL_UE_POSITIONING_UNSUCC) e)
                        .setIMSI(modifyIMSI(((INTERNAL_UE_POSITIONING_UNSUCC) e).getIMSI()));
            }

        }

        return e;
    }

    /**
     * add footer to the end of each Mp file
     */
    public synchronized void close() {
        if (writer != null) {
            writer.writeRecord(footer.toByteArray(), footerRecordType);
            writer.close();
        }
    }

    /**
     * Modify IMSI, replace first three of imiss with 111 and next two digits with RNC id, if rnc id is greater than 100 than first
     * three digits will 110
     * @param IMSI
     * @return
     */
    public synchronized String modifyIMSI(String IMSI) {
        String imsiprefix = CHANGE_IMSI_PREFIX;
        if (IMSI.length() > 0 && IMSI.startsWith(HOME_IMSI_PREFIX)) {
            StringBuilder s = new StringBuilder(IMSI);
            String rncIDtoreplace = rNCID.substring(3, rNCID.length());

            //if RNC id is greater than 100
            if (rNCID.length() > 5) {
                //drop first digit
                rncIDtoreplace = rncIDtoreplace.substring(1, rncIDtoreplace.length());
                imsiprefix = CHANGE_IMSI_PREFIX_FOR_RNCS_GREATERTHAN_100;
            }

            s.replace(1, imsiprefix.length() + rncIDtoreplace.length() + 1, imsiprefix.concat(rncIDtoreplace));
            return s.toString();
        }
        return IMSI;
    }

    /**
     * 
     * @return
     */
    public synchronized short getModifiedRNCID() {
        short ID = (short) Integer.parseInt(rNCID.substring(3, rNCID.length()));
        return ID;
    }

    private void processHeaderRecord(final String fileInformationVersion) throws SchemaException {
        Schema schema = new SchemaHandler().getSchemaMap().get(GPEHParser.GPEH_SCHEMA_TYPE)
                .getFileInformationVersionMap().get(fileInformationVersion);
        id2event = schema.getEventHandler().getMap();
        logger.debug("Found schema version: " + fileInformationVersion);
    }
}
