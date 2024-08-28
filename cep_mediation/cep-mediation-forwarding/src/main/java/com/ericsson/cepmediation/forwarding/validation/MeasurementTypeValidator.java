package com.ericsson.cepmediation.forwarding.validation;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;

/**
 * The implementors of this interface will check if the data within 
 * the event is ok to load into the database before adding it to the file
 *
 */
public interface MeasurementTypeValidator {
	
	public boolean canDataBeStored(ApEventBean event);

}
