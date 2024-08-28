/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.radio.measreport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_IMSI;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SYSTEM_RELEASE;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.correlation.radio.RadioCorrelationPerformanceTesterBase;
import com.ericsson.cepmediation.loading.exception.ParsingFailedException;
import com.ericsson.cepmediation.test.common.RadioUser;

/**
 * @author eemecoy
 *
 */
public class CallDropFinder extends RadioCorrelationPerformanceTesterBase {

    private final Map<RadioUser, List<String>> imsiCache = new HashMap<RadioUser, List<String>>();

    private void findIMSIWithCallDrop() throws ParsingFailedException {
        parseDataFromFilesStoredInGit("A20120516.1645-1700");
        for (final ApEventBean event : gpehParsedRowEvents) {
            final GpehBase gpehEvent = (GpehBase) event;
            if (event instanceof INTERNAL_IMSI) {
                addToIMSICache((INTERNAL_IMSI) event);
            }
            if (event instanceof INTERNAL_SYSTEM_RELEASE) {
                System.out.println("ISR event found for uecontext " + gpehEvent.getUE_CONTEXT() + " and rncModuleId "
                        + gpehEvent.getRNC_MODULE_ID());
                //this isn't working properly
                final List<String> imsis = getImsisForCombo(gpehEvent);
                if (imsis != null && imsis.size() > 0) {
                    printImsis(imsis);
                    //  break;
                }
            }
        }
        printAllIMSIs();

    }

    private void printAllIMSIs() {
        for (final RadioUser key : imsiCache.keySet()) {
            System.out.println("For UeContext " + key.getUeContextForUser() + " and RncModuleId "
                    + key.getRncModuleIdForUser());
            for (final String imsi : imsiCache.get(key)) {
                System.out.println(imsi);
            }
        }

    }

    private void printImsis(final List<String> imsis) {
        System.out.println("Imsis for this combo: " + imsis);
        if (imsis != null) {
            System.out.println(imsis.size());
            for (final String imsi : imsis) {
                System.out.println(imsi);
            }
        }

    }

    private List<String> getImsisForCombo(final GpehBase event) {
        final RadioUser radioUser = new RadioUser();
        radioUser.setRncModuleIdForUser(event.getRNC_MODULE_ID());
        radioUser.setUeContextForUser(event.getUE_CONTEXT());
        final List<String> imsis = imsiCache.get(radioUser);
        return imsis;
    }

    private void addToIMSICache(final INTERNAL_IMSI event) {
        final String imsi = event.getIMSI();
        final RadioUser radioUser = new RadioUser();
        radioUser.setRncModuleIdForUser(event.getRNC_MODULE_ID());
        radioUser.setUeContextForUser(event.getUE_CONTEXT());
        if (imsiCache.containsKey(radioUser)) {
            final List<String> values = imsiCache.get(radioUser);
            values.add(imsi);
        } else {
            final List<String> values = new ArrayList<String>();
            values.add(imsi);
            imsiCache.put(radioUser, values);
        }

    }

    public static void main(final String[] args) throws ParsingFailedException {
        new CallDropFinder().findIMSIWithCallDrop();

    }

}
