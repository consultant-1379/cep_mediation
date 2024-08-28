/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.tools.tooloutputconverters;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.test.common.RadioUser;

/**
 * @author eemecoy
 *
 */
public class ToolOutputUeContextRncModuleIdGrabber {

    public static void main(String[] args) throws Exception {
        new ToolOutputUeContextRncModuleIdGrabber().printUeContextRncModuleIdsInOutput();
    }

    private void printUeContextRncModuleIdsInOutput() throws Exception {
        final String inputFile = "C:\\Users\\eemecoy\\Documents\\CEA\\decoded_rop_files\\A20120516\\1730-1745\\454061192646119_sessions.txt_transformed.txt";
        List<ApEventBean> events = new ToolOutputToEventTransformer().transformToolOutputToEvents(inputFile);
        Set<RadioUser> radioUsers = getRadioUsersInEventList(events);
        printRadioUsers(radioUsers);
    }

    private void printRadioUsers(Set<RadioUser> radioUsers) {
        for (RadioUser radioUser : radioUsers) {
            System.out.println(radioUser);
        }
        System.out.println();
        System.out.println("Ready to copy and paste:");
        StringBuilder stringBuilder = new StringBuilder();
        int index = 1;
        for (RadioUser radioUser : radioUsers) {
            stringBuilder.append("RadioUser user" + index + " = new RadioUser();");
            stringBuilder.append("\n");
            stringBuilder.append("user" + index + ".setRncModuleIdForUser((byte) " + radioUser.getRncModuleIdForUser()
                    + ");");
            stringBuilder.append("\n");
            stringBuilder.append("user" + index + ".setUeContextForUser((short) " + radioUser.getUeContextForUser()
                    + ");");
            stringBuilder.append("\n");
            stringBuilder.append("userFilter.addUser(user" + index + ");");
            stringBuilder.append("\n");
            stringBuilder.append("\n");
            index++;
        }
        System.out.println(stringBuilder);
    }

    private Set<RadioUser> getRadioUsersInEventList(List<ApEventBean> events) {
        Set<RadioUser> radioUsers = new HashSet<RadioUser>();
        for (ApEventBean apEventBean : events) {
            GpehBase gpehEvent = (GpehBase) apEventBean;
            RadioUser radioUser = new RadioUser();
            radioUser.setUeContextForUser(gpehEvent.getUE_CONTEXT());
            radioUser.setRncModuleIdForUser(gpehEvent.getRNC_MODULE_ID());
            radioUsers.add(radioUser);
        }
        return radioUsers;
    }

}
