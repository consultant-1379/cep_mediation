package com.ericsson.cepmediation.correlation.stubs;

import java.util.HashSet;
import java.util.Set;



public final class HomePlmnIds {
	
	private static Set<String> homePlmnIds = new HashSet<String>();

	static {	
		homePlmnIds.add("45406");	
	}
	
    public static boolean isRoaming(String mcc, String mnc) {
    	return !homePlmnIds.contains(mcc+mnc);
    }
       
}

    