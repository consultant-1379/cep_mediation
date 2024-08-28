/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ericsson.cepmediation.correlation.support;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;

/**
 *
 * @author ealfrgu
 */
public class BufferedEvent  implements Comparator<ApEventBean> {
    
    private final long timestamp;
    private final String key;
    private final List<ApEventBean> events = new ArrayList<ApEventBean>();
    
    // event names for this correlation (from the config.xml file)
    private final List<String> eventsNames;
   
    public BufferedEvent(final String key, final List<String> eventsNames ) {
        this.timestamp = new Date().getTime();
        this.key = key;
        this.eventsNames = eventsNames;
    }

    public String getKey() {
        return key;
    }

    public long getTimestamp() {
        return timestamp;
    }
    /**
     * Add events to a list ordered according to the config.xml 
     */
    public void addEvent(final ApEventBean event){
        //TODO: ctum event will have to indices in eventsNames, how to discriminate?
        boolean inserted=false;
        if (!events.isEmpty()) {
            int index=0;
            for (final ApEventBean e:events){
                if (compare(e, event)>0){//is e greater than event
                    //insert before e and shift all entries
                    events.add(index, event);
                    inserted=true;
                   // break; allow more than one event to be added to the list because we have a case lik this that needs tow events with same new CTUM in S1 Handover
                } 
                index++;
            }
            if (!inserted){//all events in list are less than the event so add to end of list
                events.add(event);
            }
        } else {
            events.add(event);
        }
    }
    
    public List<ApEventBean> getEvents(){
        return this.events;
    }
    
    @Override
    /**
     * returns a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second
     */
    public int compare(final ApEventBean o1, final ApEventBean o2) {
        final Integer index1 = eventsNames.indexOf(o1.getAbsoluteName());
        final Integer index2 = eventsNames.indexOf(o2.getAbsoluteName());
        return index1.compareTo(index2);
    }

    
    
}
