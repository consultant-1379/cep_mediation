/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2013 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.datagen.utils;

import java.util.ArrayList;

/**
 * @author eeikonl
 * @since 2013
 *
 */
public class FifteemMinRopTimeList extends RopTimeList {

    final private ArrayList<String> ropsToProcess = new ArrayList<String>();

    public FifteemMinRopTimeList() {
        for (int hour = 0; hour < 24; hour++) {
            StringBuilder sb = null;
            for (int min = 0; min <= 45; min += 15) {
                sb = new StringBuilder();
                if (hour < 10) {
                    sb.append("0");
                }
                sb.append(hour);
                if (min < 10) {
                    sb.append("0");
                }
                sb.append(min);
                sb.append("-");
                if (min == 45) {
                    if (hour + 1 < 10) {
                        sb.append("0");
                    }
                    if (hour + 1 == 24) {
                        sb.append("0000");
                    } else {
                        sb.append(hour + 1).append("00");
                    }
                } else {
                    if (hour < 10) {
                        sb.append("0");
                    }
                    sb.append(hour);
                    sb.append(min + 15);
                }
                ropsToProcess.add(sb.toString());
            }
        }

    }

    @Override
    public boolean hasMoreRopsToProcess() {
        return !ropsToProcess.isEmpty();
    }

    @Override
    public String getNextRopToProcess() {
        return ropsToProcess.remove(0);
    }
}
