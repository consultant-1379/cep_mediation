/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2013 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.eniq.events.cepmediation.datagen_precook.utils;

import java.util.ArrayList;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;

/**
 * @author eeikonl
 * @since 2013
 *
 */
public class ArrayChopper {
    /**
     * Utility method to chop the supplied ArrayList up into the required number of ArrayLists
     * @param list
     * @param linkFilesRequired
     * @return
     */
    public ArrayList<ArrayList<ApEventBean>> choptheArray(final ArrayList<ApEventBean> list, final int linkFilesRequired) {
        if (list.size() < linkFilesRequired) {
            throw new IllegalArgumentException("Invalid Division of arraylist");
        }
        final ArrayList<ArrayList<ApEventBean>> parts = new ArrayList<ArrayList<ApEventBean>>();
        final int N = Math.round(list.size() / linkFilesRequired);
        for (int i = 0; i < list.size(); i += N) {
            if (!(parts.size() == linkFilesRequired)) {
                if (list.size() - (i + N) >= N) {
                    parts.add(new ArrayList<ApEventBean>(list.subList(i, Math.max(i, i + N))));
                } else {
                    parts.add(new ArrayList<ApEventBean>(list.subList(i, Math.max(i, list.size()))));
                    i += list.size();
                }
            } else {
                parts.remove((parts.size() - 1));
                parts.add(parts.size(), new ArrayList<ApEventBean>(list.subList(i - N, Math.max(i, list.size()))));
                i += list.size();
            }
        }

        return parts;
    }
}
