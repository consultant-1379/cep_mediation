/*------------------------------------------------------------------------------
*******************************************************************************
* COPYRIGHT Ericsson 2013
*
* The copyright to the computer program(s) herein is the property of
* Ericsson Inc. The programs may be used and/or copied only with written
* permission from Ericsson Inc. or in accordance with the terms and
* conditions stipulated in the agreement/contract under which the
* program(s) have been supplied.
*******************************************************************************
*----------------------------------------------------------------------------*/

package com.ericsson.cepmediation.standalone.listener;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.apeventbeans.ebm.ATTACH;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CALL_SETUP_FAIL_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SYSTEM_RELEASE_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CALL_REESTABLISHMENT_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.RRC_UPLINK_DIRECT_TRANSFER_ENRICHED;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.apeventbeans.Asn1Message;
import com.ericsson.cepmediation.base.database.iq.IqDatabaseManager;
import com.ericsson.cepmediation.base.properties.ConfigBinder;
import com.ericsson.cepmediation.base.properties.StandaloneConfigBinder;
import com.ericsson.cepmediation.base.publishing.impl.AutoFlushingPublisher;
import com.ericsson.cepmediation.base.publishing.impl.EventBusPublisher;
import com.ericsson.cepmediation.base.util.Utilities;
import com.ericsson.cepmediation.base.util.constants.UplinkDirectTransferAttributes;
import com.hazelcast.core.MessageListener;

public class IMEITopicListener implements MessageListener<List<ApEventBean>> {
    private static final int FLUSHING_INTERVAL = 30 * 1000;

    private static final Logger logger = LoggerFactory.getLogger(ConfigBinder.class);

    private final Map<Long, String> imsi2imei = new ConcurrentHashMap<Long, String>(5000000);

    private final EventBusPublisher publisher;

    public IMEITopicListener() {
        publisher = new AutoFlushingPublisher(FLUSHING_INTERVAL, StandaloneConfigBinder.getInstance()
                .getAllEventListeners());
        publisher.addEvent(INTERNAL_CALL_SETUP_FAIL_ENRICHED.ABSOLUTE_NAME);
        publisher.addEvent(INTERNAL_SYSTEM_RELEASE_ENRICHED.ABSOLUTE_NAME);
        publisher.addEvent(INTERNAL_CALL_REESTABLISHMENT_ENRICHED.ABSOLUTE_NAME);
        publisher.addEvent(INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED.ABSOLUTE_NAME);
        publisher.addEvent(INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED.ABSOLUTE_NAME);
        publisher.addEvent(INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED.ABSOLUTE_NAME);
        publisher.addEvent(INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED.ABSOLUTE_NAME);
        publisher.addEvent(INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED.ABSOLUTE_NAME);
        publisher.addEvent(INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED.ABSOLUTE_NAME);
        imsi2imei.putAll(IqDatabaseManager.getInstance().getImsi2imei());
        logger.info("Loaded " + imsi2imei.size() + " imsi-to-imei mappings.");
    }

    @Override
    public void onMessage(List<ApEventBean> events) {
        logger.debug("IMEIEnrichment: Received " + events.size() + " events for enrichment!");

        Collections.sort(events);

        for (ApEventBean event : events) {
            if (event instanceof ATTACH) {
                ATTACH attach = (ATTACH) event;
                safeAddImei(safeParseLong(attach.getIMSI()), attach.getIMEISV());
            } else if (event instanceof RRC_UPLINK_DIRECT_TRANSFER_ENRICHED) {
                RRC_UPLINK_DIRECT_TRANSFER_ENRICHED rrcUplink = (RRC_UPLINK_DIRECT_TRANSFER_ENRICHED) event;
                List<Asn1Message> messages = rrcUplink.getBase().getAsn1MessageList();
                if (messages != null && !messages.isEmpty()) {
                    Asn1Message message = messages.get(0);
                    if (message.getMessageAttributes() != null) {
                        String imei = message.getMessageAttributes().get(UplinkDirectTransferAttributes.IMEI);
                        safeAddImei(rrcUplink.getIMSI(), imei);
                    }
                }
            } else {
                if (event instanceof INTERNAL_CALL_SETUP_FAIL_ENRICHED) {
                    INTERNAL_CALL_SETUP_FAIL_ENRICHED callSetupFail = (INTERNAL_CALL_SETUP_FAIL_ENRICHED) event;
                    String imei = imsi2imei.get(callSetupFail.getIMSI());
                    if (imei != null) {
                        int tac = Utilities.extractTacFromImeiSvforWCDMA(imei);
                        callSetupFail.setTAC(tac);
                        callSetupFail.getBase().setIMEISV(safeParseLong(imei));
                    }
                } else if (event instanceof INTERNAL_SYSTEM_RELEASE_ENRICHED) {
                    INTERNAL_SYSTEM_RELEASE_ENRICHED sysRelease = (INTERNAL_SYSTEM_RELEASE_ENRICHED) event;
                    String imei = imsi2imei.get(sysRelease.getIMSI());
                    if (imei != null) {
                        int tac = Utilities.extractTacFromImeiSvforWCDMA(imei);
                        sysRelease.setTAC(tac);
                        sysRelease.getBase().setIMEISV(safeParseLong(imei));
                    }
                } else if (event instanceof INTERNAL_CALL_REESTABLISHMENT_ENRICHED) {
                    INTERNAL_CALL_REESTABLISHMENT_ENRICHED callReestablishment = (INTERNAL_CALL_REESTABLISHMENT_ENRICHED) event;
                    String imei = imsi2imei.get(callReestablishment.getIMSI());
                    if (imei != null) {
                        int tac = Utilities.extractTacFromImeiSvforWCDMA(imei);
                        callReestablishment.setTAC(tac);
                        callReestablishment.setIMEISV(safeParseLong(imei));
                    }
                } else if (event instanceof INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED) {

                    INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED sofoHandoverExecFail = (INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED) event;

                    String imei = imsi2imei.get(sofoHandoverExecFail.getIMSI());
                    if (imei != null) {
                        int tac = Utilities.extractTacFromImeiSvforWCDMA(imei);
                        sofoHandoverExecFail.setTAC(tac);
                        sofoHandoverExecFail.setIMEISV(safeParseLong(imei));
                    }
                } else if (event instanceof INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED) {

                    INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED failedCC = (INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED) event;

                    String imei = imsi2imei.get(failedCC.getIMSI());
                    if (imei != null) {
                        int tac = Utilities.extractTacFromImeiSvforWCDMA(imei);
                        failedCC.setTAC(tac);
                        failedCC.setIMEISV(safeParseLong(imei));
                    }
                } else if (event instanceof INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED) {

                    INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED noCell = (INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED) event;

                    String imei = imsi2imei.get(noCell.getIMSI());
                    if (imei != null) {
                        int tac = Utilities.extractTacFromImeiSvforWCDMA(imei);
                        noCell.setTAC(tac);
                        noCell.setIMEISV(safeParseLong(imei));
                    }
                } else if (event instanceof INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED) {

                    INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED noCell = (INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED) event;

                    String imei = imsi2imei.get(noCell.getIMSI());
                    if (imei != null) {
                        int tac = Utilities.extractTacFromImeiSvforWCDMA(imei);
                        noCell.setTAC(tac);
                        noCell.setIMEISV(safeParseLong(imei));
                    }
                } else if (event instanceof INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED) {
                    INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED ifhoOutHard = (INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED) event;
                    String imei = imsi2imei.get(ifhoOutHard.getIMSI());
                    if (imei != null) {
                        int tac = Utilities.extractTacFromImeiSvforWCDMA(imei);
                        ifhoOutHard.setTAC(tac);
                        ifhoOutHard.getBase().setIMEISV(safeParseLong(imei));
                    }
                } else if (event instanceof INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED) {
                    INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED iratOutHard = (INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED) event;
                    String imei = imsi2imei.get(iratOutHard.getIMSI());
                    if (imei != null) {
                        int tac = Utilities.extractTacFromImeiSvforWCDMA(imei);
                        iratOutHard.setTAC(tac);
                        iratOutHard.getBase().setIMEISV(safeParseLong(imei));
                    }
                }

                publisher.publishMessage(event);
            }
        }
    }

    private void safeAddImei(Long imsi, String imei) {
        if (imsi != null && imsi > 0 && imei != null && safeParseLong(imei) > 0) {
            imsi2imei.put(imsi, imei);
        }
    }

    private Long safeParseLong(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        try {
            return Long.parseLong(s);
        } catch (Exception e) {
            logger.debug("Unparseable long: " + s, e);
            return null;
        }
    }
}
