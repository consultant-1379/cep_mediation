package com.ericsson.cepmediation.loading.asn1;

public enum UE_INTERNAL_EVENT_RESULT_ID {
	EVENT6A((short)0), EVENT6B((short)1), EVENT6C((short)2), EVENT6D((short)3), EVENT6E((short)4), EVENT6F((short)5), EVENT6G((short)6); 
	
	private short id;
	UE_INTERNAL_EVENT_RESULT_ID(final short id) {
		this.id = id;
	}
	
	public short getId() {
		return id;
	}
}