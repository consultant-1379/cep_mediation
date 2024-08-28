/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.util.tracer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.ericsson.cepmediation.test.util.FileUtilsForTest;

/**
 * @author eemecoy
 *
 */
public class SessionAttributeFilter {

    private List<String> attributesToInclude = new ArrayList<String>();

    private boolean attributeFilterSet;

    public SessionAttributeFilter() {
        try {
            attributesToInclude = FileUtilsForTest.readFileFromClasspathAsListOfStrings("session_attributes_to_print.properties");
        } catch (IOException e) {
            //no filter file specified, assuming user wants all attributes printed
            attributeFilterSet = false;
        }
        if (attributesToInclude.isEmpty()) {
            attributeFilterSet = false;
        } else {
            attributeFilterSet = true;
        }

    }

    public boolean userWantsAttributesFiltered() {
        return attributeFilterSet;
    }

    public boolean filterContainsAttribute(String attributeName) {
        return attributesToInclude.contains(attributeName);
    }

    public static void main(String[] args) {
        SessionAttributeFilter sessionAttributeFilter = new SessionAttributeFilter();
        System.out.println("Filtering turned on? " + sessionAttributeFilter.userWantsAttributesFiltered());
        System.out.println("Filter contains attribute DURATION? " + sessionAttributeFilter.filterContainsAttribute("DURATION"));
    }

}
