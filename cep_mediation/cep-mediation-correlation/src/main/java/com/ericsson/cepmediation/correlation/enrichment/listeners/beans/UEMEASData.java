/**
 * (C) Copyright LM Ericsson System Expertise AT/LMI, 2011
 *
 * The copyright to the computer program(s) herein is the property of Ericsson
 * System Expertise EEI, Sweden. The program(s) may be used and/or copied only
 * with the written permission from Ericsson System Expertise AT/LMI or in
 * accordance with the terms and conditions stipulated in the agreement/contract
 * under which the program(s) have been supplied.
 *
 */
package com.ericsson.cepmediation.correlation.enrichment.listeners.beans;

import com.espertech.esper.client.EventBean;

/**
 * Class is holder for UE Measurement data
 * @author eachsaj
 *
 */
class UEMEASData{
	
	private double rsrp;
	private double rsrq;
	private long timeStamp;
	public UEMEASData(final EventBean event){
		setRsrp((Byte)event.get("RSRPSERVING"));
		setRsrq((Byte)event.get("RSRQSERVING"));
		setTimeStamp( (Long) event.get("timestamp"));
	}
	public synchronized double getRsrp() {
		return rsrp;
	}
	private  synchronized void setRsrp(final byte rsrp) {
		this.rsrp = (rsrp-141.0);
	}
	public synchronized double getRsrq() {
		return rsrq;
	}
	private synchronized void setRsrq(final byte rsrq) {
		this.rsrq = (rsrq/2.0-20.0);
	}
	public synchronized long getTimeStamp() {
		return timeStamp;
	}
	public synchronized void setTimeStamp(final long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
}