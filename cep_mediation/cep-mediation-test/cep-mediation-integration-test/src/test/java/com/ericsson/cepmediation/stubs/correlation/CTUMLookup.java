package com.ericsson.cepmediation.stubs.correlation;

//import com.ericsson.cepmediation.apeventbeans.ctum.CTUM;
//import com.ericsson.cepmediation.correlation.ctum.CTUMHandler;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.LifecycleService;

/**
 * This class is a test class that looks up the CTUM map using an IMSI and a MMES1APID/GUMMEI pair
 * @author eeilfn
 *
 */
public class CTUMLookup {

    public static void main(String[] args) {
	// Instantiate a Hazelcast instance
	LifecycleService hazelcastLCS = Hazelcast.getLifecycleService();
/*
	CTUM ctum1 = CTUMHandler.getCTUMEvent("240016012853636f", new Long("1298645478005").longValue());
	if (ctum1 != null) {
	    System.out.println(ctum1.getDecodedString());
	}
	else {
	    System.out.println("CTUM lookup failed");
	}

	CTUM ctum2 = CTUMHandler.getCTUMEvent("240016012853636f", new Long("1298645478005").longValue());
	if (ctum2 != null) {
	    System.out.println(ctum2.getDecodedString());
	}
	else {
	    System.out.println("CTUM lookup failed");
	}
*/
	hazelcastLCS.shutdown();
    }
}
