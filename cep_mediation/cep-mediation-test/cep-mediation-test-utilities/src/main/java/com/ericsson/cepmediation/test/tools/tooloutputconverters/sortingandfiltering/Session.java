package com.ericsson.cepmediation.test.tools.tooloutputconverters.sortingandfiltering;

import java.util.ArrayList;
import java.util.List;

import com.ericsson.cepmediation.test.common.DateTimeUtilities;

class Session implements Comparable<Session> {

    private static final int IMSI_LENGTH = 15;

    private final List<String> lines = new ArrayList<String>();

    private final long timestamp;

    public Session(final String timestampOfFirstEvent) {
        this.timestamp = DateTimeUtilities.convertDateStringtoTimestamp(timestampOfFirstEvent);
    }

    public long getIMSI() {
        final String lastLine = lines.get(lines.size() - 1);
        final int beginIndex = lastLine.indexOf(": ");
        final String imsi = lastLine.substring(beginIndex + 2, beginIndex + 2 + IMSI_LENGTH);
        return transformToIMSI(imsi);
    }

    private long transformToIMSI(final String imsi) {
        if (imsi.contains("-1")) {
            return -1;
        }
        return Long.parseLong(imsi);
    }

    public void add(final String line) {
        lines.add(line);
    }

    @Override
    public int compareTo(final Session otherSession) {
        if (this.timestamp != otherSession.timestamp) {
            return (int) (this.timestamp - otherSession.timestamp);
        }
        return 0;
    }

    public List<String> getLines() {
        return lines;
    }

    public long getTimestamp() {
        return timestamp;
    }

}