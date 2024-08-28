package com.ericsson.cepmediation.loading.asn1;

public enum EVENT_TYPE {
	INTRA_FREQ(0), INTER_FREQ(1), INTER_RAT(2), TRAFFIC_VOLUME(3), UE_INTERNAL(4);

	private int id;
	EVENT_TYPE(final int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
}
