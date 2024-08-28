
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
 * A holder class aggregated Radio Data
 * @author eachsaj
 *
 */
class RadioUEData{

	private int[] CQIReport = new int[16];
	private int[] chRankReps =new int[2];
	private int[] txMode =new int[5];
	private int powerRestrict = -1;
	private int powerNoRestrict = -1;
	
	public RadioUEData(final EventBean event){
		setCQIReport(getVal(event, "CQI_MEDS"));
		setChRankReps(getVal(event, "CH_RANK_REPS"));
		setTxMode(getVal(event, "TX_MODE"));
		setPowerRestrict((Integer) event.get("POWER_RESTRICT"));
		setPowerNoRestrict((Integer) event.get("POWER_NO_RESTRICT"));		
	}
	
	private int[] getVal(final EventBean event, final String eventName) {
		try {
			return toIntArray((Short[]) event.get(eventName));
		} catch (final Exception e) {
			return toIntArray((Integer[]) event.get(eventName));
		}
	}
	
	private int[] toIntArray(final Short[] dataIn){
		final int [] array = new int[dataIn.length];
		int index=0;
		for(final int data:dataIn){
			array[index]= data;
			index++;
		}
		return array;
	}
	
	private int[] toIntArray(final Integer[] dataIn){
		final int [] array = new int[dataIn.length];
		int index=0;
		for(final int data:dataIn){
			array[index]= data;
			index++;
		}
		return array;
	}
	
	
	/**
	 * @return the chRankReps
	 */
	public synchronized int[] getChRankReps() {
		return chRankReps;
	}
	/**
	 * @param chRankReps the chRankReps to set
	 */
	public synchronized void setChRankReps(final int[] chRankReps) {
		this.chRankReps = chRankReps;
	}
	/**
	 * @return the txMode
	 */
	public synchronized int[] getTxMode() {
		return txMode;
	}
	/**
	 * @param txMode the txMode to set
	 */
	public synchronized void setTxMode(final int[] txMode) {
		this.txMode = txMode;
	}
	/**
	 * @return the powerRestrict
	 */
	public synchronized int getPowerRestrict() {
		return powerRestrict;
	}
	/**
	 * @param powerRestrict the powerRestrict to set
	 */
	public synchronized void setPowerRestrict(final int powerRestrict) {
		this.powerRestrict = powerRestrict;
	}
	/**
	 * @return the powerNoRestrict
	 */
	public synchronized int getPowerNoRestrict() {
		return powerNoRestrict;
	}
	/**
	 * @param powerNoRestrict the powerNoRestrict to set
	 */
	public synchronized void setPowerNoRestrict(final int powerNoRestrict) {
		this.powerNoRestrict = powerNoRestrict;
	}

	/**
	 * @return the cQIReport
	 */
	public synchronized int[] getCQIReport() {
		return CQIReport;
	}

	/**
	 * @param cQIReport the cQIReport to set
	 */
	public synchronized void setCQIReport(final int[] cQIReport) {
		CQIReport = cQIReport;
	}
}