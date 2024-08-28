/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2013 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.datagen.utils;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * @author eikrwaq
 * @since 2013
 *
 */
public class OneMinRopTimeList extends RopTimeList {

    final private ArrayList<String> ropsToProcess = new ArrayList<String>();

    public OneMinRopTimeList() {
        Calendar oneMinRop = Calendar.getInstance();
        oneMinRop.set(Calendar.HOUR_OF_DAY, 0);
        oneMinRop.set(Calendar.MINUTE, 0);
        oneMinRop.set(Calendar.SECOND, 0);

        // 60 *24 = 1440 (mins * hours)
        for (int i = 0; i < 1440; i++) {
            int starthour = oneMinRop.get(Calendar.HOUR_OF_DAY);
            int startmin = oneMinRop.get(Calendar.MINUTE);

            oneMinRop.add(Calendar.MINUTE, 1);

            int endhour = oneMinRop.get(Calendar.HOUR_OF_DAY);
            int endmin = oneMinRop.get(Calendar.MINUTE);

            ropsToProcess.add(getNo(starthour) + getNo(startmin) + "-" + getNo(endhour) + getNo(endmin));
        }
    }

    private String getNo(int i) {
        return (i < 10 ? "0" + i : i + "");
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