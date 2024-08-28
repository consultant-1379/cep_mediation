package com.ericsson.cepmediation.correlation.enrichment;

import java.io.Serializable;

import com.ericsson.cepmediation.apeventbeans.correlation.ASN1_MEASUREMENT;

public class MeasurementWindow implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

    private long timestamp = 0l;

    private long IMSI = -1;

    private ASN1_MEASUREMENT ASN1_MEASUREMENT;

    private short UE_CONTEXT = -1;

    private int RNC_MODULE_ID = -1;

    private boolean SESSION_CLOSED = false;

    public static final String ABSOLUTE_NAME = "correlation.MeasurementWindow";

    @Override
    public Object clone() {
        try {
            final MeasurementWindow cloned = (MeasurementWindow) super.clone();
            return cloned;
        } catch (final CloneNotSupportedException e) {
            e.printStackTrace();
        } catch (final Throwable t) {
            t.printStackTrace();
        }
        return null;
    }

    public MeasurementWindow cloneMe() {
        final MeasurementWindow measurementWindow = (MeasurementWindow) this.clone();
        return measurementWindow;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(final long timestamp) {
        this.timestamp = timestamp;
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
     * @return the sESSION_CLOSED
     */
    public boolean isSESSION_CLOSED() {
        return SESSION_CLOSED;
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

    /**
     * @param sESSION_CLOSED the sESSION_CLOSED to set
     */
    public void setSESSION_CLOSED(final boolean sESSION_CLOSED) {
        SESSION_CLOSED = sESSION_CLOSED;
    }

    /**
     * @return the aSN1_MEASUREMENT
     */
    public ASN1_MEASUREMENT getASN1_MEASUREMENT() {
        return ASN1_MEASUREMENT;
    }

    /**
     * @param aSN1_MEASUREMENT the aSN1_MEASUREMENT to set
     */
    public void setASN1_MEASUREMENT(final ASN1_MEASUREMENT aSN1_MEASUREMENT) {
        ASN1_MEASUREMENT = aSN1_MEASUREMENT;
    }

}
