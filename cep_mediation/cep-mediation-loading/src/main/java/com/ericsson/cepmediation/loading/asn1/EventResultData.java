package com.ericsson.cepmediation.loading.asn1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EventResultData {

    private EVENT_TYPE type;

    private short eventId = -1;

    private boolean isExtractOnlyFirstReport;

    // Holds either scramblingCode (when type is intra/inter freq) or bsic (when type is inter_rat)
    private final List<Integer> codes = new ArrayList<Integer>();

    public List<Integer> getCodes() {
        return codes;
    }

    public void addCode(final int code) {
        codes.add(code);
    }

    public boolean containsCode(final int code) {
        return codes.contains(code);
    }

    public boolean isEmpty() {
        return codes.isEmpty();
    }

    public Iterator<Integer> getCodesIter() {
        return codes.iterator();
    }

    public EVENT_TYPE getType() {
        return type;
    }

    public void setType(final EVENT_TYPE type) {
        this.type = type;
    }

    public short getEventId() {
        return eventId;
    }

    public void setEventId(final short eventId) {
        this.eventId = eventId;
    }

    public boolean isExtractOnlyFirstReport() {
        return isExtractOnlyFirstReport;
    }

    public void setExtractOnlyFirstReport(final boolean isExtractOnlyFirstReport) {
        this.isExtractOnlyFirstReport = isExtractOnlyFirstReport;
    }

    public boolean isInterFreq() {
        return type == EVENT_TYPE.INTER_FREQ;
    }

    public boolean isIntraFreq() {
        return type == EVENT_TYPE.INTRA_FREQ;
    }

    public boolean isInterRat() {
        return type == EVENT_TYPE.INTER_RAT;
    }

    public boolean isTrafficVolume() {
        return type == EVENT_TYPE.TRAFFIC_VOLUME;
    }

    public boolean isUeInternal() {
        return type == EVENT_TYPE.UE_INTERNAL;
    }

}
