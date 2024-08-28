package com.ericsson.cepmediation.correlation.enrichment.listeners.up;

import com.ericsson.cepmediation.apeventbeans.bearer_plane.CLASSIFICATION_REPORT;
import com.ericsson.cepmediation.apeventbeans.correlation.IP_TO_IMSI_LOOKUP;
import com.ericsson.cepmediation.apeventbeans.ebm.ACTIVATE;
import com.ericsson.cepmediation.apeventbeans.ebm.ISRAU;
import com.ericsson.cepmediation.apeventbeans.ebm.RAU;
import com.ericsson.cepmediation.apeventbeans.ebm.SERVICE_REQUEST;

public interface SgehLookupService {
	public void onServiceRequest(SERVICE_REQUEST event);
	
	public void onActivate(ACTIVATE event);
	
	public void onRau(RAU event);
	
	public void onIsRau(ISRAU event);
	
	public void onClassificationReport(CLASSIFICATION_REPORT event);
	
	public IP_TO_IMSI_LOOKUP find(String ipAddress, long timestamp, boolean isFinal);
}
