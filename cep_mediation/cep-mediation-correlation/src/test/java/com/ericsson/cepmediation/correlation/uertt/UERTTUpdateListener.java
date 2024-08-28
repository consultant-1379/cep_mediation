/***------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2013
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
-----------------------------------------------------------------------------------------------*/
package com.ericsson.cepmediation.correlation.uertt;

import java.util.ArrayList;
import java.util.List;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;

public class UERTTUpdateListener implements UpdateListener {
    public static  List<EventBean[]> queue;
   

    @Override
    public void update(final EventBean[] newEvents, final EventBean[] oldEvents) {
        if (newEvents != null) {
            addToQueue(newEvents);
        }
    }

    private void addToQueue(final EventBean[] newEvents) {
       queue =  new ArrayList<EventBean[]>();
           queue.add( newEvents);
        
    }
    
}