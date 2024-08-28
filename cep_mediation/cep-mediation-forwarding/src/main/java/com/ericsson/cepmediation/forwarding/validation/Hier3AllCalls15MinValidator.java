package com.ericsson.cepmediation.forwarding.validation;

import com.ericsson.cepmediation.apeventbeans.correlation.RAB_ESTABLISH_RNC_AGGR;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;

/**
 * This class checks if the data within the RAB_ESTABLISH_RNC_AGGR is ok to
 * store in the database
 * @author eeidmea
 *
 */
public class Hier3AllCalls15MinValidator implements MeasurementTypeValidator {

	/**
	 * Data cannot be stored if the hash_id is null as the column is not nullable
	 */
	@Override
	public boolean canDataBeStored(ApEventBean event) {		
		RAB_ESTABLISH_RNC_AGGR record = (RAB_ESTABLISH_RNC_AGGR) event;
		return record.getHIER3_ID() != DefaultValues.DEFAULT_LONG_VALUE ? true : false;		
	}

}
