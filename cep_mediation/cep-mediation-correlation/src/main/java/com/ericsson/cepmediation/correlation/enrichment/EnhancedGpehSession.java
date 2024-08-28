package com.ericsson.cepmediation.correlation.enrichment;

import java.util.HashSet;
import java.util.Set;

import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;

public class EnhancedGpehSession extends GPEH_SESSION implements Cloneable {
    private static final long serialVersionUID = 1L;

    protected short UE_CONTEXT = -1;

    protected int RNC_MODULE_ID = -1;

    protected boolean SESSION_CLOSED = false;

    private Set<Long> visitedCells = new HashSet<Long>(4);

    @Override
    public EnhancedGpehSession clone() {
        try {
            final EnhancedGpehSession cloned = (EnhancedGpehSession) super.clone();
            return cloned;
        } catch (final Throwable t) {
            t.printStackTrace();
        }
        return null;
    }

    public EnhancedGpehSession cloneMe() {
        final EnhancedGpehSession enhancedGpehSession = (EnhancedGpehSession) this.clone();
        return enhancedGpehSession;
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

    public boolean isSESSION_CLOSED() {
        return SESSION_CLOSED;
    }

    public void setSESSION_CLOSED(final boolean sESSION_CLOSED) {
        SESSION_CLOSED = sESSION_CLOSED;
    }

    public void setVISITED_CELLS(Set<Long> partial) {
        visitedCells.addAll(partial);
        setDISTINCT_CELL_CNT(visitedCells.size());
    }

    public Set<Long> getVISITED_CELLS() {
        return visitedCells;
    }

    @Override
    public void setSTART_RNC(short rncId) {
        if (rncId > -1) {
            super.setSTART_RNC(rncId);
        }
    }

    @Override
    public void setEND_RNC(short rncId) {
        if (rncId > -1) {
            super.setEND_RNC(rncId);
        }
    }

    @Override
    public void setSTART_C_ID(int cId) {
        if (cId > -1) {
            super.setSTART_C_ID(cId);
        }
    }

    @Override
    public void setEND_C_ID(int cId) {
        if (cId > -1) {
            super.setEND_C_ID(cId);
            if (END_RNC > -1) {
                long rncIdAndCellId = cId;
                rncIdAndCellId = rncIdAndCellId << 16;
                rncIdAndCellId += END_RNC;
                if (!visitedCells.contains(rncIdAndCellId)) {
                    visitedCells.add(rncIdAndCellId);
                    setDISTINCT_CELL_CNT(visitedCells.size());
                }
            }
        }
    }
}
