/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.util.esperwindows;

/**
 * @author eemecoy
 *
 */
public class UpdateStream {

    private long IMSI;

    private long DATETIME_ID;

    private long SESSION_END;

    private short UE_CONTEXT;

    private byte RNC_MODULE_ID;

    /**
     * @param iMSI
     * @param dATETIME_ID
     * @param sESSION_END
     * @param uE_CONTEXT
     * @param rNC_MODULE_ID
     */
    public UpdateStream(long iMSI, long dATETIME_ID, long sESSION_END, short uE_CONTEXT, byte rNC_MODULE_ID) {
        super();
        IMSI = iMSI;
        DATETIME_ID = dATETIME_ID;
        SESSION_END = sESSION_END;
        UE_CONTEXT = uE_CONTEXT;
        RNC_MODULE_ID = rNC_MODULE_ID;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Element in update_stream with IMSI ");
        description.append(IMSI);
        description.append(", UeContext " + UE_CONTEXT);
        description.append(", RNC_MODULE_ID " + RNC_MODULE_ID);
        return description.toString();
    }

    /**
     * @return the iMSI
     */
    public long getIMSI() {
        return IMSI;
    }

    /**
     * @param iMSI the iMSI to set
     */
    public void setIMSI(long iMSI) {
        IMSI = iMSI;
    }

    /**
     * @return the dATETIME_ID
     */
    public long getDATETIME_ID() {
        return DATETIME_ID;
    }

    /**
     * @param dATETIME_ID the dATETIME_ID to set
     */
    public void setDATETIME_ID(long dATETIME_ID) {
        DATETIME_ID = dATETIME_ID;
    }

    /**
     * @return the sESSION_END
     */
    public long getSESSION_END() {
        return SESSION_END;
    }

    /**
     * @param sESSION_END the sESSION_END to set
     */
    public void setSESSION_END(long sESSION_END) {
        SESSION_END = sESSION_END;
    }

    /**
     * @return the uE_CONTEXT
     */
    public short getUE_CONTEXT() {
        return UE_CONTEXT;
    }

    /**
     * @param uE_CONTEXT the uE_CONTEXT to set
     */
    public void setUE_CONTEXT(short uE_CONTEXT) {
        UE_CONTEXT = uE_CONTEXT;
    }

    /**
     * @return the rNC_MODULE_ID
     */
    public byte getRNC_MODULE_ID() {
        return RNC_MODULE_ID;
    }

    /**
     * @param rNC_MODULE_ID the rNC_MODULE_ID to set
     */
    public void setRNC_MODULE_ID(byte rNC_MODULE_ID) {
        RNC_MODULE_ID = rNC_MODULE_ID;
    }

    public UpdateStream() {

    }

}
