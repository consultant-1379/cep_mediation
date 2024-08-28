package com.ericsson.cepmediation.stubs.util;

import com.ericsson.cepmediation.base.meta.admin.MappedEvent;
import com.ericsson.cepmediation.base.meta.admin.SchemaHandler;
import com.ericsson.cepmediation.base.meta.schema.EventParameter;
import com.ericsson.cepmediation.base.meta.schema.ExtraColumn;
import com.ericsson.cepmediation.base.meta.schema.SchemaException;

public class DumpSchemas {

    /**
     * @param args
     * @throws SchemaException 
     */
    public static void main(String[] args) throws SchemaException  {
	SchemaHandler schemaHandler = new SchemaHandler();
	
	for (String schema: schemaHandler.getSchemaMap().keySet()) {
	    System.out.println("Schema: " + schema);
	    
	    for (MappedEvent event: schemaHandler.getSchemaMap().get(schema).getEventMap().values()) {
		System.out.println("mapped event : " + event.getEvent().getName());
		
		for (ExtraColumn extraColumn: event.getExtraColumnSet()) {
		    System.out.println("Extra cloumn: " + extraColumn.getName());
		}
		
		for (EventParameter eventParameter: event.getParameterSet()) {
		    System.out.println("parameter: " + eventParameter.getName());
		}
	    }
	}
    }
}
