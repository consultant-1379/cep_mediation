package com.ericsson.cepmediation.correlation.beans;

import java.io.Serializable;

import com.ericsson.cepmediation.correlation.support.CellUtil;
import com.ericsson.cepmediation.correlation.support.Util;

@SuppressWarnings("serial")
public class VisitedCellData implements Serializable {
    private short rncId;

    private int cellId;

    private long start;

    private long end;

    private long timestamp;

    // used internally for equals and hashcode impl
    private long timestampForComparison;

    private VisitedCellData() {
    }

    /**
     * Creates an instance of this class without specifying start and end time
     * of the visit to the cell. 
     * 
     * This method return an instance that specifies only the time when the cell was visited.
     * It is intended for use in EPL to mark when certain measurement for
     * a specific cell occurred. 
     *  
     * @param rncId the rnc for this cell
     * @param cellId the cellId
     * @param timestamp specifies when the measurement occurred
     * @return an instance of this class without start and end data
     */
    public static VisitedCellData getInstance(final short rncId, final short cellId, final long timestamp) {
        final VisitedCellData instance = new VisitedCellData();
        instance.rncId = rncId;
        instance.cellId = CellUtil.getUnsignedCellId(cellId);
        instance.timestamp = timestamp;
        instance.timestampForComparison = Util.floorTime(timestamp);
        return instance;
    }

    /**
     * Creates an instance of this class with start and end time of the visited cell.
     * Thus duration of the visit can be calculated as end - start;
     * 
     * This method returns an instance that can represent the time spent in a cell.
     * 
     * @param rncId the rnc for this cell
     * @param cellId the cellId
     * @param start specifies when the cell was used for first time
     * @return an instance of this class with duration data
     */
    public static VisitedCellData getInstance(final short rncId, final int cellId, final long start) {
        final VisitedCellData instance = new VisitedCellData();
        instance.rncId = rncId;
        instance.cellId = cellId;
        instance.start = start;
        return instance;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public short getRncId() {
        return rncId;
    }

    public int getCellId() {
        return cellId;
    }

    public long getStart() {
        return start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(final long end) {
        this.end = end;
    }

    public long getTimestampForComparison() {
        return timestampForComparison;
    }

    public void setTimestampForComparison(final long timestampForComparison) {
        this.timestampForComparison = timestampForComparison;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + cellId;
        result = prime * result + rncId;
        result = prime * result + (int) (timestampForComparison ^ (timestampForComparison >>> 32));
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VisitedCellData other = (VisitedCellData) obj;
        if (cellId != other.cellId) {
            return false;
        }
        if (rncId != other.rncId) {
            return false;
        }
        if (timestampForComparison != other.timestampForComparison) {
            return false;
        }
        return true;
    }
}
