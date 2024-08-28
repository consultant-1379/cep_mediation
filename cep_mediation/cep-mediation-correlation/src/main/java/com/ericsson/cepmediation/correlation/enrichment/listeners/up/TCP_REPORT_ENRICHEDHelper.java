package com.ericsson.cepmediation.correlation.enrichment.listeners.up;

import com.ericsson.cepmediation.apeventbeans.correlation.TCP_REPORT_ENRICHED;

/**
 * 
 * This class is used as helper class in esper engine. i.e, there are some extra fields added for associate.
 * 
 * @author exuexie
 *
 */
public class TCP_REPORT_ENRICHEDHelper extends TCP_REPORT_ENRICHED implements Cloneable {

    private static final long serialVersionUID = 1L;

    public static final String ABSOLUTE_NAME = "correlation.TCP_REPORT_ENRICHEDHelper";

    private int SETUP_TIME_TERMCount;

    private int SETUP_TIME_NETCount;

    private int PACKET_LOSS_TERMCount;

    private int PACKET_LOSS_NETCount;

    private int THROUGHPUTCount;

    private int PIPE_THROUGHPUTCount;

    private int NONSS_PIPE_THROUGHPUTCount;

    private int CHANNEL_PIPE_THROUGHPUTCount;

    private int hash;

    private String GGSN_STRING;

    private String UE_STRING;

    private String TERM_STRING;

    private String SERV_STRING;

    public TCP_REPORT_ENRICHEDHelper() {
        super();
    }

    public int getHash() {
        return hash;
    }

    public void setHASH(int hash) {
        this.hash = hash;
    }

    @Override
    public TCP_REPORT_ENRICHEDHelper clone() {
        try {
            final TCP_REPORT_ENRICHEDHelper cloned = (TCP_REPORT_ENRICHEDHelper) super.clone();
            return cloned;
        } catch (final Throwable t) {
            t.printStackTrace();
        }
        return null;
    }

    public TCP_REPORT_ENRICHEDHelper cloneMe() {
        final TCP_REPORT_ENRICHEDHelper tcp_REPORT_ENRICHEDHelper = (TCP_REPORT_ENRICHEDHelper) this.clone();
        return tcp_REPORT_ENRICHEDHelper;
    }

    public int getSETUP_TIME_TERMCount() {
        return SETUP_TIME_TERMCount;
    }

    public void setSETUP_TIME_TERMCount(int sETUP_TIME_TERMCount) {
        SETUP_TIME_TERMCount = sETUP_TIME_TERMCount;
    }

    public int getSETUP_TIME_NETCount() {
        return SETUP_TIME_NETCount;
    }

    public void setSETUP_TIME_NETCount(int sETUP_TIME_NETCount) {
        SETUP_TIME_NETCount = sETUP_TIME_NETCount;
    }

    public int getPACKET_LOSS_TERMCount() {
        return PACKET_LOSS_TERMCount;
    }

    public void setPACKET_LOSS_TERMCount(int pACKET_LOSS_TERMCount) {
        PACKET_LOSS_TERMCount = pACKET_LOSS_TERMCount;
    }

    public int getPACKET_LOSS_NETCount() {
        return PACKET_LOSS_NETCount;
    }

    public void setPACKET_LOSS_NETCount(int pACKET_LOSS_NETCount) {
        PACKET_LOSS_NETCount = pACKET_LOSS_NETCount;
    }

    public int getTHROUGHPUTCount() {
        return THROUGHPUTCount;
    }

    public void setTHROUGHPUTCount(int tHROUGHPUTCount) {
        THROUGHPUTCount = tHROUGHPUTCount;
    }

    public int getPIPE_THROUGHPUTCount() {
        return PIPE_THROUGHPUTCount;
    }

    public void setPIPE_THROUGHPUTCount(int pIPE_THROUGHPUTCount) {
        PIPE_THROUGHPUTCount = pIPE_THROUGHPUTCount;
    }

    public int getNONSS_PIPE_THROUGHPUTCount() {
        return NONSS_PIPE_THROUGHPUTCount;
    }

    public void setNONSS_PIPE_THROUGHPUTCount(int nONSS_PIPE_THROUGHPUTCount) {
        NONSS_PIPE_THROUGHPUTCount = nONSS_PIPE_THROUGHPUTCount;
    }

    public int getCHANNEL_PIPE_THROUGHPUTCount() {
        return CHANNEL_PIPE_THROUGHPUTCount;
    }

    public void setCHANNEL_PIPE_THROUGHPUTCount(int cHANNEL_PIPE_THROUGHPUTCount) {
        CHANNEL_PIPE_THROUGHPUTCount = cHANNEL_PIPE_THROUGHPUTCount;
    }

    public String getGGSN_STRING() {
        return GGSN_STRING;
    }

    public void setGGSN_STRING(String gGSN_STRING) {
        GGSN_STRING = gGSN_STRING;
    }

    public String getUE_STRING() {
        return UE_STRING;
    }

    public void setUE_STRING(String uE_STRING) {
        UE_STRING = uE_STRING;
    }

    public String getTERM_STRING() {
        return TERM_STRING;
    }

    public void setTERM_STRING(String tERM_STRING) {
        TERM_STRING = tERM_STRING;
    }

    public String getSERV_STRING() {
        return SERV_STRING;
    }

    public void setSERV_STRING(String sERV_STRING) {
        SERV_STRING = sERV_STRING;
    }
}
