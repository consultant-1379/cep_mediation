package com.ericsson.cepmediation.correlation;

import static com.ericsson.cepmediation.test.common.DateTimeUtilities.*;

import java.io.Serializable;

public class RadioSession implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private int startRab = -1;

    private int endRab = -1;

    private String imsi;

    private long sessionStart = 0l;

    private long sessionDuration = 0l;

    private long sessionEnd = 0l;

    private long rrcConnectionStart = 0l;

    private long psRabActivityStart = 0;

    private long rrcConnectionEnd;

    private long psRabActivityEnd = 0l;

    private long rrcDuration = 0l;

    private long psRabDuration = 0l;

    private int psRabEstablishmentCount = 0;

    private int csRabEstablishmentCount = 0;

    private int dropCount = 0;

    private int totalEventCount = 0;

    private int hsCellChangeSuccessfulCount = 0;

    private int startCellId = -1;

    private int endCellId = -1;

    private short startRNC = -1;

    private short endRNC = -1;

    private int ifhoExecSuccessfulCount = 0;

    private int ifhoExecErrorCount = 0;

    private boolean rabActivityOn = false;

    private boolean rrcActivityOn = false;

    private int rrcConnectionCount = 0;

    private int hsCellChangeErrorCount = 0;

    private int hasNoCellSelected = 0;

    private int internalOutHardHandoverFailure = 0;

    private int internalIfhoExecutionSuccessCount = 0;

    private int internalIfhoExecutionErrorCount = 0;

    private int softHandoverExecutionSuccessCount = 0;

    private int softHandoverExecutionErrorCount = 0;

    private int internalCModeActivateCount = 0;

    private int internalCModeDeactivateCount = 0;

    public int getInternalCModeDeactivateCount() {
        return internalCModeDeactivateCount;
    }

    public void setInternalCModeDeactivateCount(final int internalCModeDeactivateCount) {
        this.internalCModeDeactivateCount = internalCModeDeactivateCount;
    }

    public int getInternalCModeActivateCount() {
        return internalCModeActivateCount;
    }

    public void setInternalCModeActivateCount(final int internalCModeActivateCount) {
        this.internalCModeActivateCount = internalCModeActivateCount;
    }

    public int getSoftHandoverExecutionSuccessCount() {
        return softHandoverExecutionSuccessCount;
    }

    public void setSoftHandoverExecutionSuccessCount(final int softHandoverExecutionSuccessCount) {
        this.softHandoverExecutionSuccessCount = softHandoverExecutionSuccessCount;
    }

    public int getSoftHandoverExecutionErrorCount() {
        return softHandoverExecutionErrorCount;
    }

    public void setSoftHandoverExecutionErrorCount(final int softHandoverExecutionErrorCount) {
        this.softHandoverExecutionErrorCount = softHandoverExecutionErrorCount;
    }

    public int getInternalIfhoExecutionSuccessCount() {
        return internalIfhoExecutionSuccessCount;
    }

    public void setInternalIfhoExecutionSuccessCount(final int internalIfhoExecutionSuccessCount) {
        this.internalIfhoExecutionSuccessCount = internalIfhoExecutionSuccessCount;
    }

    public int getInternalIfhoExecutionErrorCount() {
        return internalIfhoExecutionErrorCount;
    }

    public void setInternalIfhoExecutionErrorCount(final int internalIfhoExecutionErrorCount) {
        this.internalIfhoExecutionErrorCount = internalIfhoExecutionErrorCount;
    }

    public int getInternalOutHardHandoverFailure() {
        return internalOutHardHandoverFailure;
    }

    public void setInternalOutHardHandoverFailure(final int internalOutHardHandoverFailure) {
        this.internalOutHardHandoverFailure = internalOutHardHandoverFailure;
    }

    public int getHasNoCellSelected() {
        return hasNoCellSelected;
    }

    public void setHasNoCellSelected(final int hasNoCellSelected) {
        this.hasNoCellSelected = hasNoCellSelected;
    }

    public RadioSession() {
    }

    public int getStartRab() {
        return startRab;
    }

    public void setStartRab(final int startRab) {
        this.startRab = startRab;
    }

    public int getEndRab() {
        return endRab;
    }

    public void setEndRab(final int endRab) {
        this.endRab = endRab;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(final String imsi) {
        this.imsi = imsi;
    }

    public long getSessionStart() {
        return sessionStart;
    }

    public void setSessionStart(final long sessionStart) {
        this.sessionStart = sessionStart;
    }

    public long getSessionDuration() {
        return sessionDuration;
    }

    public void setSessionDuration(final long sessionDuration) {
        this.sessionDuration = sessionDuration;
    }

    public long getSessionEnd() {
        return sessionEnd;
    }

    public void setSessionEnd(final long sessionEnd) {
        this.sessionEnd = sessionEnd;
    }

    public long getRrcConnectionStart() {
        return rrcConnectionStart;
    }

    public void setRrcConnectionStart(final long rrcConnectionStart) {
        this.rrcConnectionStart = rrcConnectionStart;
    }

    public long getPsRabActivityStart() {
        return psRabActivityStart;
    }

    public void setPsRabActivityStart(final long psRabActivityStart) {
        this.psRabActivityStart = psRabActivityStart;
    }

    public long getRrcConnectionEnd() {
        return rrcConnectionEnd;
    }

    public void setRrcConnectionEnd(final long rrcConnectionEnd) {
        this.rrcConnectionEnd = rrcConnectionEnd;
    }

    public long getPsRabActivityEnd() {
        return psRabActivityEnd;
    }

    public void setPsRabActivityEnd(final long psRabActivityEnd) {
        this.psRabActivityEnd = psRabActivityEnd;
    }

    public long getRrcDuration() {
        return rrcDuration;
    }

    public void setRrcDuration(final long rrcDuration) {
        this.rrcDuration = rrcDuration;
    }

    public long getPsRabDuration() {
        return psRabDuration;
    }

    public void setPsRabDuration(final long psRabDuration) {
        this.psRabDuration = psRabDuration;
    }

    public int getPsRabEstablishmentCount() {
        return psRabEstablishmentCount;
    }

    public void setPsRabEstablishmentCount(final int psRabEstablishmentCount) {
        this.psRabEstablishmentCount = psRabEstablishmentCount;
    }

    public int getCsRabEstablishmentCount() {
        return csRabEstablishmentCount;
    }

    public void setCsRabEstablishmentCount(final int csRabEstablishmentCount) {
        this.csRabEstablishmentCount = csRabEstablishmentCount;
    }

    public int getDropCount() {
        return dropCount;
    }

    public void setDropCount(final int dropCount) {
        this.dropCount = dropCount;
    }

    public int getTotalEventCount() {
        return totalEventCount;
    }

    public void setTotalEventCount(final int totalEventCount) {
        this.totalEventCount = totalEventCount;
    }

    public int getHsCellChangeSuccessfulCount() {
        return hsCellChangeSuccessfulCount;
    }

    public void setHsCellChangeSuccessfulCount(final int hsCellChangeSuccessfulCount) {
        this.hsCellChangeSuccessfulCount = hsCellChangeSuccessfulCount;
    }

    public int getStartCellId() {
        return startCellId;
    }

    public void setStartCellId(final int startCellId) {
        this.startCellId = startCellId;
    }

    public int getEndCellId() {
        return endCellId;
    }

    public void setEndCellId(final int endCellId) {
        this.endCellId = endCellId;
    }

    public short getStartRNC() {
        return startRNC;
    }

    public void setStartRNC(final short startRNC) {
        this.startRNC = startRNC;
    }

    public short getEndRNC() {
        return endRNC;
    }

    public void setEndRNC(final short endRNC) {
        this.endRNC = endRNC;
    }

    public int getIfhoExecSuccessfulCount() {
        return ifhoExecSuccessfulCount;
    }

    public void setIfhoExecSuccessfulCount(final int ifhoExecSuccessfulCount) {
        this.ifhoExecSuccessfulCount = ifhoExecSuccessfulCount;
    }

    public int getIfhoExecErrorCount() {
        return ifhoExecErrorCount;
    }

    public void setIfhoExecErrorCount(final int ifhoExecErrorCount) {
        this.ifhoExecErrorCount = ifhoExecErrorCount;
    }

    public boolean isRabActivityOn() {
        return rabActivityOn;
    }

    public void setRabActivityOn(final boolean rabActivityOn) {
        this.rabActivityOn = rabActivityOn;
    }

    public boolean isRrcActivityOn() {
        return rrcActivityOn;
    }

    public void setRrcActivityOn(final boolean rrcActivityOn) {
        this.rrcActivityOn = rrcActivityOn;
    }

    public int getRrcConnectionCount() {
        return rrcConnectionCount;
    }

    public void setRrcConnectionCount(final int rrcConnectionCount) {
        this.rrcConnectionCount = rrcConnectionCount;
    }

    public int getHsCellChangeErrorCount() {
        return hsCellChangeErrorCount;
    }

    public void setHsCellChangeErrorCount(final int hsCellChangeErrorCount) {
        this.hsCellChangeErrorCount = hsCellChangeErrorCount;
    }

    @Override
    public String toString() {
        return "RadioSession[ " + "startRab=" + startRab + ", endRab=" + endRab + ", imsi=" + imsi + ", sessionStart=" + sessionStart + ":" + convertTimeStampToDateString(sessionStart)
                + ", sessionDuration=" + sessionDuration + ", sessionEnd=" + sessionEnd + ":" + convertTimeStampToDateString(sessionEnd) + ", rrcConnectionStart=" + rrcConnectionStart + ":"
                + convertTimeStampToDateString(rrcConnectionStart) + ", psRabActivityStart=" + psRabActivityStart + ":" + convertTimeStampToDateString(psRabActivityStart) + ", rrcConnectionEnd="
                + rrcConnectionEnd + ":" + convertTimeStampToDateString(rrcConnectionEnd) + ", psRabActivityEnd=" + psRabActivityEnd + ":" + convertTimeStampToDateString(psRabActivityEnd)
                + ", rrcDuration=" + rrcDuration + ", psRabDuration=" + psRabDuration + ", psRabEstablishmentCount=" + psRabEstablishmentCount + ", csRabEstablishmentCount=" + csRabEstablishmentCount
                + ", dropCount=" + dropCount + ", totalEventCount=" + totalEventCount + ", hsCellChangeSuccessfulCount=" + hsCellChangeSuccessfulCount + ", startCellId=" + startCellId
                + ", endCellId=" + endCellId + ", startRNC=" + startRNC + ", endRNC=" + endRNC + ", ifhoExecSuccessfulCount=" + ifhoExecSuccessfulCount + ", ifhoExecErrorCount=" + ifhoExecErrorCount
                + ", rabActivityOn=" + rabActivityOn + ", rrcActivityOn=" + rrcActivityOn + ", rrcConnectionCount=" + rrcConnectionCount + ", hsCellChangeErrorCount=" + hsCellChangeErrorCount
                + ", hasNoCellSelected=" + hasNoCellSelected + ", internalOutHardHandoverFailure=" + internalOutHardHandoverFailure + ", internalIfhoExecutionSuccessCount="
                + internalIfhoExecutionSuccessCount + ", internalIfhoExecutionErrorCount=" + internalIfhoExecutionErrorCount + ", softHandoverExecutionSuccessCount="
                + softHandoverExecutionSuccessCount + ", softHandoverExecutionErrorCount=" + softHandoverExecutionErrorCount + ", internalCModeActivateCount=" + internalCModeActivateCount
                + ", internalCModeDeactivateCount=" + internalCModeDeactivateCount + "]";
    }
}
