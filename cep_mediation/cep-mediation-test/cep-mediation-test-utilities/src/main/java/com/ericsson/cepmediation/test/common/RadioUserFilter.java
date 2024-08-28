/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.common;

import java.util.ArrayList;
import java.util.List;

import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;

/**
 * @author eemecoy
 *
 */
public class RadioUserFilter {

    private final List<RadioUser> selectedUsers = new ArrayList<RadioUser>();

    public boolean isForSelectedUser(final ApEventBean event) {
        final GpehBase gpehEvent = (GpehBase) event;
        final short currentUeContext = gpehEvent.getUE_CONTEXT();
        final int currentRncModuleId = gpehEvent.getRNC_MODULE_ID();
        final RadioUser thisUser = new RadioUser();
        thisUser.setRncModuleIdForUser(currentRncModuleId);
        thisUser.setUeContextForUser(currentUeContext);
        for (final RadioUser selectedUser : selectedUsers) {
            if (selectedUser.equals(thisUser)) {
                return true;
            }
        }

        return false;
    }

    public void addUser(final RadioUser user) {
        selectedUsers.add(user);
    }

    public boolean isSelectedUsersEmpty() {
        return selectedUsers.isEmpty();
    }

}
