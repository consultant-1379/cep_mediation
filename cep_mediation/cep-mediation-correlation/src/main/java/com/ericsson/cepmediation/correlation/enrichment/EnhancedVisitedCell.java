package com.ericsson.cepmediation.correlation.enrichment;

import com.ericsson.cepmediation.apeventbeans.correlation.EE_VISITED_CELL;

public class EnhancedVisitedCell extends EE_VISITED_CELL implements Cloneable {
    private static final long serialVersionUID = 1L;

    private long END_TIMESTAMP = -1;

    private short UE_CONTEXT = -1;

    private int RNC_MODULE_ID = -1;

    private boolean CELL_CLOSED = false;

    private boolean CARRY_OVER = false;

    private boolean WAIT_FOR_IMSI = false;

    @Override
    public EnhancedVisitedCell clone() {
        try {
            final EnhancedVisitedCell cloned = (EnhancedVisitedCell) super.clone();
            return cloned;
        } catch (final Throwable t) {
            t.printStackTrace();
        }
        return null;
    }

    public EnhancedVisitedCell cloneMe() {
        final EnhancedVisitedCell EnhancedVisitedCell = (EnhancedVisitedCell) this.clone();
        return EnhancedVisitedCell;
    }

    public long getEND_TIMESTAMP() {
        return END_TIMESTAMP;
    }

    public void setEND_TIMESTAMP(final long eND_TIMESTAMP) {
        END_TIMESTAMP = eND_TIMESTAMP;
    }

    public short getUE_CONTEXT() {
        return UE_CONTEXT;
    }

    public void setUE_CONTEXT(final short uE_CONTEXT) {
        UE_CONTEXT = uE_CONTEXT;
    }

    public int getRNC_MODULE_ID() {
        return RNC_MODULE_ID;
    }

    public void setRNC_MODULE_ID(final int rNC_MODULE_ID) {
        RNC_MODULE_ID = rNC_MODULE_ID;
    }

    public boolean isCELL_CLOSED() {
        return CELL_CLOSED;
    }

    public void setCELL_CLOSED(final boolean cELL_CLOSED) {
        CELL_CLOSED = cELL_CLOSED;
    }

    public boolean getCARRY_OVER() {
        return CARRY_OVER;
    }

    public void setCARRY_OVER(final boolean isCARRY_OVER) {
        this.CARRY_OVER = isCARRY_OVER;
    }

    public boolean getWAIT_FOR_IMSI() {
        return WAIT_FOR_IMSI;
    }

    public void setWAIT_FOR_IMSI(final boolean wAIT_FOR_IMSI) {
        WAIT_FOR_IMSI = wAIT_FOR_IMSI;
    }
}
