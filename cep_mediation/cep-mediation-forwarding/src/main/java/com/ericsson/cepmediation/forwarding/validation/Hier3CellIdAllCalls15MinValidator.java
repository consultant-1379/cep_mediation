package com.ericsson.cepmediation.forwarding.validation;

import com.ericsson.cepmediation.apeventbeans.correlation.RAB_ESTABLISH_CELL_AGGR;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;

/**
 * This class checks if the data within the RAB_ESTABLISH_CELL_AGGR is ok to
 * store in the database
 * @author eeidmea
 *
 */
public class Hier3CellIdAllCalls15MinValidator implements MeasurementTypeValidator {

	/**
	 * Data cannot be stored as of the the hash_ids are null as the column is not nullable
	 */
	@Override
	public boolean canDataBeStored(ApEventBean event) {		
		RAB_ESTABLISH_CELL_AGGR record = (RAB_ESTABLISH_CELL_AGGR) event;
		return (record.getHIER3_ID() != DefaultValues.DEFAULT_LONG_VALUE &&
				record.getHIER3_CELL_ID() != DefaultValues.DEFAULT_LONG_VALUE) ? true : false;		
	}

}
