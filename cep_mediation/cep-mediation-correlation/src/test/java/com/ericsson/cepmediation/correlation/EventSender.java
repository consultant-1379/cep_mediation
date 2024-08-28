package com.ericsson.cepmediation.correlation;

import java.util.HashMap;
import java.util.Map;

import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.espertech.esper.client.EPRuntime;

public class EventSender implements Runnable
{
    private GpehBase eventToSend;
    private EPRuntime correlationEngine;
    private static Map<String,EventSender> eventSenderMap= new HashMap<String,EventSender>();

    private EventSender(EPRuntime epService, GpehBase theRadioObject)
    {
        this.correlationEngine = epService;
        this.eventToSend = theRadioObject;
    }

    public static EventSender getEventSender(EPRuntime epService, GpehBase theRadioObject){
//    	String key = String.valueOf(theRadioObject.getRNC_MODULE_ID()+theRadioObject.getUE_CONTEXT());
//    	EventSender eventSender = null;
//    	if(eventSenderMap.containsKey(key)){
//    		eventSender = eventSenderMap.get(key);
//    	}else{
//    		eventSender = new EventSender(epService,theRadioObject);
//    		eventSenderMap.put(key,eventSender);
//    	};
//    	return eventSender;
    	return new EventSender(epService,theRadioObject);
    }
    public void run()
    {
        try
        {
        	correlationEngine.sendEvent(eventToSend);
        }
        catch (Exception ex)
        {
        	ex.printStackTrace();
        }
    }

}
