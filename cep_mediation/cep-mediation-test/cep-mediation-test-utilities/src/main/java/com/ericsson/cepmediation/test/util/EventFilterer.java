/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.util;

import java.util.ArrayList;
import java.util.List;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.test.common.DateTimeUtilities;
import com.ericsson.cepmediation.test.common.RadioUserFilter;

/**
 * @author eemecoy
 *
 */
public class EventFilterer {

    public List<ApEventBean> filterEventsIfRequested(List<ApEventBean> allEvents, RadioUserFilter userFilter) {
        if (userFilter.isSelectedUsersEmpty()) {
            return allEvents;
        }
        List<ApEventBean> eventsToSend = new ArrayList<ApEventBean>();
        for (ApEventBean event : allEvents) {
            long timestamp = DateTimeUtilities.convertDateStringtoTimestamp("2012-05-16 16:50:47.0831");
            if (event.getTimestamp() == timestamp) {
                System.out.println();
            }
            if (shouldSendEvent(event, userFilter)) {
                System.out.println("Including event:" + event.getDecodedString());
                eventsToSend.add(event);
            }
        }
        return eventsToSend;

    }

    private boolean shouldSendEvent(final ApEventBean event, RadioUserFilter userFilter) {
        if (userFilter.isSelectedUsersEmpty()) {
            return true;
        }
        return userFilter.isForSelectedUser(event);
    }

}
