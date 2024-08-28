package com.ericsson.cepmediation.correlation.enrichment;

import java.io.Serializable;

public class ImsiMapWindow implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

    private long IMSI = -1;

    private short UE_CONTEXT = -1;

    private int RNC_MODULE_ID = -1;

    public static final String ABSOLUTE_NAME = "correlation.ImsiMapWindow";

    @Override
    public Object clone() {
        try {
            final ImsiMapWindow cloned = (ImsiMapWindow) super.clone();
            return cloned;
        } catch (final CloneNotSupportedException e) {
            e.printStackTrace();
        } catch (final Throwable t) {
            t.printStackTrace();
        }
        return null;
    }

    public ImsiMapWindow cloneMe() {
        final ImsiMapWindow measurementWindow = (ImsiMapWindow) this.clone();
        return measurementWindow;
    }


    public long getIMSI() {
        return IMSI;
    }

    public void setIMSI(final long imsi) {
        this.IMSI = imsi;
    }

    /**
     * @return the uE_CONTEXT
     */
    public short getUE_CONTEXT() {
        return UE_CONTEXT;
    }

    /**
     * @return the rNC_MODULE_ID
     */
    public int getRNC_MODULE_ID() {
        return RNC_MODULE_ID;
    }


    /**
     * @param uE_CONTEXT the uE_CONTEXT to set
     */
    public void setUE_CONTEXT(final short uE_CONTEXT) {
        UE_CONTEXT = uE_CONTEXT;
    }

    /**
     * @param rNC_MODULE_ID the rNC_MODULE_ID to set
     */
    public void setRNC_MODULE_ID(final int rNC_MODULE_ID) {
        RNC_MODULE_ID = rNC_MODULE_ID;
    }


}
