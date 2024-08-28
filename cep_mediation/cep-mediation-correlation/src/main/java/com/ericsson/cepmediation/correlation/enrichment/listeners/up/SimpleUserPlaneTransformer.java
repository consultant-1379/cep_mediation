package com.ericsson.cepmediation.correlation.enrichment.listeners.up;

import java.util.List;

import com.ericsson.cepmediation.apeventbeans.bearer_plane.CLASSIFICATION_REPORT;
import com.ericsson.cepmediation.apeventbeans.bearer_plane.FLASH_VIDEO_REPORT;
import com.ericsson.cepmediation.apeventbeans.bearer_plane.TCP_REPORT;
import com.ericsson.cepmediation.apeventbeans.bearer_plane.TCP_REPORT_PARTIAL;
import com.ericsson.cepmediation.apeventbeans.correlation.CLASSIFICATION_REPORT_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.correlation.TCP_REPORT_ENRICHED;
import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;
import com.ericsson.cepmediation.base.database.entity.HashId;
import com.ericsson.cepmediation.base.database.entity.MccMncPair;
import com.ericsson.cepmediation.base.util.Utilities;
import com.ericsson.cepmediation.correlation.lookup.LookupService;
import com.ericsson.cepmediation.correlation.lookup.impl.DefaultLookupService;
import com.ericsson.cepmediation.correlation.support.Category;
import com.ericsson.cepmediation.correlation.support.Util;

public final class SimpleUserPlaneTransformer {

    //FLASH VIDEO REPORT EVENT ID
    private static final short FLASH_VIDEO_REPORT_EVENT_ID = 20003;

    private static final short TCP_REPORT_EVENT_ID = 20002;

    private static final short CLASSIF_REP_EVENT_ID = 20001;

    private static final long FIVE_MIN_SESSION_DURATION_MILL = 5 * 60 * 1000;

    private final LookupService lookupService = DefaultLookupService.getInstance();

    /**
     *
     * Carry out more enrichment of TCP_REPORT_ENRICHED event bean. like, extract the MCC/MNC from IMSI
     *
     * @param event
     * @return
     */
    public TCP_REPORT_ENRICHED transform(final TCP_REPORT_ENRICHED event) {

        final MccMncPair mccMnc = lookupService.extractMccAndMnc(event.getIMSI());
        if (mccMnc != null) {
            String mcc = mccMnc.getMcc();
            String mnc = mccMnc.getMnc();
            event.setIMSI_MCC("".equals(mcc) ? null : mcc);
            event.setIMSI_MNC("".equals(mnc) ? null : mnc);
        }

        //find the HashId for the MCC,MNC,LAC,SAC
        List<HashId> hashIds = lookupService.getHashId(event.getRAT(), event.getMCC(), event.getMNC(), event.getLAC(), event.getSAC());

        if (hashIds != null && hashIds.size() >= 1) {
            //use the first element of the return list
            HashId hashId = hashIds.get(0);

            event.setHIER3_ID(hashId.getHier3Id());
            event.setHIER321_ID(hashId.getHier321Id());
        }

        if (event instanceof TCP_REPORT_ENRICHEDHelper) {

            TCP_REPORT_ENRICHEDHelper eventHelper = (TCP_REPORT_ENRICHEDHelper) event;

            if (eventHelper.getSETUP_TIME_NETCount() == 0) {

                event.setSETUP_TIME_NET(DefaultValues.DEFAULT_INT_VALUE);
            } else {
                event.setSETUP_TIME_NET(eventHelper.getSETUP_TIME_NET() / eventHelper.getSETUP_TIME_NETCount());
            }

            if (eventHelper.getSETUP_TIME_TERMCount() == 0) {

                event.setSETUP_TIME_TERM(DefaultValues.DEFAULT_INT_VALUE);
            } else {
                event.setSETUP_TIME_TERM(eventHelper.getSETUP_TIME_TERM() / eventHelper.getSETUP_TIME_TERMCount());
            }

            if (eventHelper.getPACKET_LOSS_NETCount() == 0) {

                event.setPACKET_LOSS_NET(DefaultValues.DEFAULT_FLOAT_VALUE);
            } else {
                event.setPACKET_LOSS_NET(eventHelper.getPACKET_LOSS_NET() / eventHelper.getPACKET_LOSS_NETCount());
            }

            if (eventHelper.getPACKET_LOSS_TERMCount() == 0) {

                event.setPACKET_LOSS_TERM(DefaultValues.DEFAULT_FLOAT_VALUE);
            } else {
                event.setPACKET_LOSS_TERM(eventHelper.getPACKET_LOSS_TERM() / eventHelper.getPACKET_LOSS_TERMCount());
            }

            if (eventHelper.getTHROUGHPUTCount() == 0) {

                event.setTHROUGHPUT(DefaultValues.DEFAULT_INT_VALUE);
            } else {
                event.setTHROUGHPUT(eventHelper.getTHROUGHPUT() / eventHelper.getTHROUGHPUTCount());
            }

            if (eventHelper.getPIPE_THROUGHPUTCount() == 0) {

                event.setPIPE_THROUGHPUT(DefaultValues.DEFAULT_INT_VALUE);
            } else {
                event.setPIPE_THROUGHPUT(eventHelper.getPIPE_THROUGHPUT() / eventHelper.getPIPE_THROUGHPUTCount());
            }

            if (eventHelper.getNONSS_PIPE_THROUGHPUTCount() == 0) {

                event.setNONSS_PIPE_THROUGHPUT(DefaultValues.DEFAULT_INT_VALUE);
            } else {
                event.setNONSS_PIPE_THROUGHPUT(eventHelper.getNONSS_PIPE_THROUGHPUT()
                        / eventHelper.getNONSS_PIPE_THROUGHPUTCount());
            }

            if (eventHelper.getCHANNEL_PIPE_THROUGHPUTCount() == 0) {

                event.setCHANNEL_PIPE_THROUGHPUT(DefaultValues.DEFAULT_INT_VALUE);
            } else {
                event.setCHANNEL_PIPE_THROUGHPUT(eventHelper.getCHANNEL_PIPE_THROUGHPUT()
                        / eventHelper.getCHANNEL_PIPE_THROUGHPUTCount());
            }
        }

        return event;

    }

    /**
     *
     * Transform the FLASH_VIDEO_REPORT event bean to TCP_REPORT_ENIRCHED bean
     *
     *
     * @param event
     * @return
     */
    public TCP_REPORT_ENRICHED transform(final FLASH_VIDEO_REPORT event) {
        final TCP_REPORT_ENRICHED result = new TCP_REPORT_ENRICHED();

        result.setEVENT_ID(FLASH_VIDEO_REPORT_EVENT_ID);

        result.setDURATION((int) event.getDURATION() * 1000);
        result.setIS_PARTIAL(false);
        result.setDOWNLINK(event.getDIRECTION() == 1);
        result.setDATA_RECEIVED(event.getDATA_RECEIVED());
        result.setALONE_RATIO(event.getALONE_RATIO());
        result.setMAX_RWIN(event.getMAX_RWIN());
        result.setSETUP_TIME_TERM((int) (1000 * event.getSETUP_TIME_TERM()));
        result.setSETUP_TIME_NET((int) (1000 * event.getSETUP_TIME_NET()));
        result.setMAX_DATA_PACKET(event.getMAX_DATA_PACKET());
        result.setPACKET_LOSS_TERM(event.getPACKET_LOSS_TERM());
        result.setPACKET_LOSS_NET(event.getPACKET_LOSS_NET());
        result.setCONTENT_TYPE(-1); // TODO
        result.setUE_IP_ADDRESS(Util.getIpv4Address(event.getADDR_TERM()));
        result.setTimestamp(event.getTimestamp());

        return result;
    }

    public TCP_REPORT_ENRICHED transform(final TCP_REPORT_PARTIAL event) {
        final TCP_REPORT_ENRICHED result = new TCP_REPORT_ENRICHED();

        result.setIMSI(safeLongCast(event.getIMSI()));
        final MccMncPair mccMnc = lookupService.extractMccAndMnc(result.getIMSI());
        if (mccMnc != null) {
            String mcc = mccMnc.getMcc();
            String mnc = mccMnc.getMnc();
            result.setIMSI_MCC("".equals(mcc) ? null : mcc);
            result.setIMSI_MNC("".equals(mnc) ? null : mnc);
        }
        result.setTAC(Utilities.extractTacFromImeiSv(event.getIMEISV()));
        result.setIMEISV(safeLongCast(event.getIMEISV()));
        result.setSTART_APN(event.getAPN());
        result.setEND_APN(event.getAPN());
        result.setMSISDN(safeLongCast(event.getMSISDN()));
        result.setEVENT_ID(TCP_REPORT_EVENT_ID);
        result.setDURATION((int) event.getDURATION() * 1000);
        result.setIS_PARTIAL(true);
        result.setDOWNLINK(event.getDIRECTION() == 1);
        result.setDATA_RECEIVED(event.getDATA_RECEIVED());
        result.setTHROUGHPUT((int) event.getTHROUGHPUT());
        result.setPIPE_THROUGHPUT((int) event.getPIPE_THROUGHPUT());
        result.setNONSS_PIPE_THROUGHPUT((int) event.getNONSS_PIPE_THROUGHPUT());
        result.setCHANNEL_PIPE_THROUGHPUT((int) event.getCHANNEL_PIPE_THROUGHPUT());
        result.setALONE_RATIO(event.getALONE_RATIO());
        result.setMAX_RWIN(event.getMAX_RWIN());
        result.setSETUP_TIME_TERM((int) (1000 * event.getSETUP_TIME_TERM()));
        result.setSETUP_TIME_NET((int) (1000 * event.getSETUP_TIME_NET()));
        result.setMAX_DATA_PACKET(event.getMAX_DATA_PACKET());
        result.setPACKET_LOSS_TERM(event.getPACKET_LOSS_TERM());
        result.setPACKET_LOSS_NET(event.getPACKET_LOSS_NET());
        result.setCONTENT_TYPE(-1); // TODO
        result.setHOST(event.getHOST());
        result.setUE_IP_ADDRESS(Util.getIpv4Address(event.getADDR_TERM()));

        result.setTimestamp(event.getTimestamp());

        return result;
    }

    public TCP_REPORT_ENRICHED transform(final TCP_REPORT event) {
        final TCP_REPORT_ENRICHED result = new TCP_REPORT_ENRICHED();

        result.setIMSI(safeLongCast(event.getIMSI()));
        final MccMncPair mccMnc = lookupService.extractMccAndMnc(result.getIMSI());
        if (mccMnc != null) {
            String mcc = mccMnc.getMcc();
            String mnc = mccMnc.getMnc();
            result.setIMSI_MCC("".equals(mcc) ? null : mcc);
            result.setIMSI_MNC("".equals(mnc) ? null : mnc);
        }
        result.setTAC(Utilities.extractTacFromImeiSv(event.getIMEISV()));
        result.setIMEISV(safeLongCast(event.getIMEISV()));
        result.setSTART_APN(event.getAPN());
        result.setEND_APN(event.getAPN());
        result.setMSISDN(safeLongCast((event.getMSISDN())));
        result.setEVENT_ID(TCP_REPORT_EVENT_ID);

        result.setDURATION((int) event.getDURATION() * 1000);
        result.setIS_PARTIAL(false);
        result.setDOWNLINK(event.getDIRECTION() == 1);
        result.setDATA_RECEIVED(event.getDATA_RECEIVED());
        result.setTHROUGHPUT((int) event.getTHROUGHPUT());
        result.setPIPE_THROUGHPUT((int) event.getPIPE_THROUGHPUT());
        result.setNONSS_PIPE_THROUGHPUT((int) event.getNONSS_PIPE_THROUGHPUT());
        result.setCHANNEL_PIPE_THROUGHPUT((int) event.getCHANNEL_PIPE_THROUGHPUT());
        result.setALONE_RATIO(event.getALONE_RATIO());
        result.setMAX_RWIN(event.getMAX_RWIN());
        result.setSETUP_TIME_TERM((int) (1000 * event.getSETUP_TIME_TERM()));
        result.setSETUP_TIME_NET((int) (1000 * event.getSETUP_TIME_NET()));
        result.setMAX_DATA_PACKET(event.getMAX_DATA_PACKET());
        result.setPACKET_LOSS_TERM(event.getPACKET_LOSS_TERM());
        result.setPACKET_LOSS_NET(event.getPACKET_LOSS_NET());
        result.setCONTENT_TYPE(-1); // TODO
        result.setHOST(event.getHOST());
        result.setUE_IP_ADDRESS(Util.getIpv4Address(event.getADDR_TERM()));

        result.setTimestamp(event.getTimestamp());

        return result;
    }

    public CLASSIFICATION_REPORT_ENRICHED transform(final CLASSIFICATION_REPORT event) {
        final CLASSIFICATION_REPORT_ENRICHED reportEnriched = new CLASSIFICATION_REPORT_ENRICHED();

        reportEnriched.setEVENT_ID(CLASSIF_REP_EVENT_ID);
        reportEnriched.setTimestamp(event.getTimestamp());
        reportEnriched.setAPN(event.getAPN());
        reportEnriched.setIMSI(safeLongCast(event.getIMSI()));
        reportEnriched.setMSISDN(safeLongCast(event.getMSISDN()));
        reportEnriched.setIMEISV(safeLongCast(event.getIMEISV()));
        reportEnriched.setTAC(Utilities.extractTacFromImeiSv(event.getIMEISV()));
        reportEnriched.setFIVE_MIN_AGG_TIME(event.getTimestamp() - event.getTimestamp()
                % FIVE_MIN_SESSION_DURATION_MILL);

        final MccMncPair mccMnc = lookupService.extractMccAndMnc(reportEnriched.getIMSI());
        if (mccMnc != null) {
            String mcc = mccMnc.getMcc();
            String mnc = mccMnc.getMnc();
            reportEnriched.setIMSI_MCC("".equals(mcc) ? null : mcc);
            reportEnriched.setIMSI_MNC("".equals(mnc) ? null : mnc);
        }

        reportEnriched.setUE_IP_ADDRESS(Util.getIpv4Address(event.getADDR_TERM()));
        reportEnriched.setDURATION((int) (event.getPERIOD_END() - event.getPERIOD_START()));

        reportEnriched.setBYTES_DOWNLINK(event.getBYTES_DOWNLINK());
        reportEnriched.setBYTES_UPLINK(event.getBYTES_UPLINK());
        reportEnriched.setPACKETS_DOWNLINK(event.getPACKETS_DOWNLINK());
        reportEnriched.setPACKETS_UPLINK(event.getPACKETS_UPLINK());

        final LookupService lookupService = DefaultLookupService.getInstance();
        reportEnriched.setCLIENT(lookupService.getValue(Category.CLIENT, event.getCLIENT()));
        reportEnriched.setSERVICE_PROVIDER(lookupService.getValue(Category.SERVICE_PROVIDER,
                event.getSERVICE_PROVIDER()));
        reportEnriched.setPROTOCOL(lookupService.getValue(Category.PROTOCOL, event.getPROTOCOL()));
        reportEnriched.setENCAPSULATION(lookupService.getValue(Category.ENCAPSULATION, event.getENCAPSULATION()));
        reportEnriched.setENCRYPTION(lookupService.getValue(Category.ENCRYPTION, event.getENCRYPTION()));
        reportEnriched.setFUNCTION(lookupService.getValue(Category.FUNCTION, event.getFUNCTION()));

        //topology location information

        reportEnriched.setRAT(event.getRAT());//RAT

        reportEnriched.setMCC(event.getSAI_MCC());//MCC
        reportEnriched.setMNC(event.getSAI_MNC());//MNC
        reportEnriched.setLAC(event.getSAI_LAC()); //LAC
        reportEnriched.setRAC(event.getRAI_RAC()); //RAC
        reportEnriched.setCID(event.getCGI_CI()); //Cell id
        reportEnriched.setSAC(event.getSAI_SAC());//SAC

        //find the HashId for the MCC,MNC,LAC,SAC
        List<HashId> hashIds = lookupService.getHashId(reportEnriched.getRAT(), reportEnriched.getMCC(), reportEnriched.getMNC(), reportEnriched.getLAC(), reportEnriched.getSAC());

        if (hashIds != null && hashIds.size() >= 1) {
            //use the first element of the return list
            HashId hashId = hashIds.get(0);

            reportEnriched.setHIER3_ID(hashId.getHier3Id());
            reportEnriched.setHIER321_ID(hashId.getHier321Id());
        }

        reportEnriched.setADDR_TERM(Util.getIpv4Address(event.getADDR_TERM()));//set the address of terminal

        return reportEnriched;
    }

    private long safeLongCast(final String value) {
        try {
            return Long.valueOf(value);
        } catch (final NumberFormatException e) {
            return -1;
        }
    }
}
