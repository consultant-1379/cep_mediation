package com.ericsson.cepmediation.correlation.enrichment.listeners.up;

import com.ericsson.cepmediation.apeventbeans.correlation.IP_TO_IMSI_LOOKUP;

public interface IpAddressPartition {
	public void onEvent(IP_TO_IMSI_LOOKUP event);
	
	public IP_TO_IMSI_LOOKUP find(long timestamp, boolean isFinal);
	
	public IP_TO_IMSI_LOOKUP getEvent(int idx);

	// only one thread should remove events from the list
	public IP_TO_IMSI_LOOKUP removeEvent(int idx);
	
	public int getSize();
}
