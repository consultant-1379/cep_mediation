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
public class ImsiMapping {

    private long IMSI;

    private short UE_CONTEXT;

    private byte RNC_MODULE_ID;

    public ImsiMapping() {

    }

    /**
     * @param iMSI
     * @param uE_CONTEXT
     * @param rNC_MODULE_ID
     */
    public ImsiMapping(final long iMSI, final short uE_CONTEXT, final byte rNC_MODULE_ID) {

        IMSI = iMSI;
        UE_CONTEXT = uE_CONTEXT;
        RNC_MODULE_ID = rNC_MODULE_ID;
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
    public void setIMSI(final long iMSI) {
        IMSI = iMSI;
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
    public void setUE_CONTEXT(final short uE_CONTEXT) {
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
    public void setRNC_MODULE_ID(final byte rNC_MODULE_ID) {
        RNC_MODULE_ID = rNC_MODULE_ID;
    }

    @Override
    public String toString() {
        final StringBuilder trace = new StringBuilder();
        trace.append("IMSI: " + IMSI);
        trace.append(", UeContext " + UE_CONTEXT);
        trace.append(", RncModuleId " + RNC_MODULE_ID);
        return trace.toString();
    }

}
