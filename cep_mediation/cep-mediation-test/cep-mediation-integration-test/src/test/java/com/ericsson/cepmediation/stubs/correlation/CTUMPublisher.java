package com.ericsson.cepmediation.stubs.correlation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.service.SERVICES;
import com.ericsson.cepmediation.base.service.ServiceException;
import com.ericsson.cepmediation.base.service.ServiceExecuter;
import com.ericsson.cepmediation.server.service.ServiceExecuterFactory;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.LifecycleService;

/**
 * This class is a singleton that controls access to the CTUM event map
 * @author eeilfn
 *
 */
public class CTUMPublisher {
    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(CTUMPublisher.class);

    /**
     * Constructor, kicks off the CTUM publisher
     * @throws ServiceException 
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException, ServiceException {
	logger.info("CTUM publisher starting . . .");
	ServiceExecuter ctumExecuter =ServiceExecuterFactory.createService(SERVICES.CTUM_SERVICE);

	// Instantiate a Hazelcast instance
	LifecycleService hazelcastLCS = Hazelcast.getLifecycleService();
	
	// Execute the CTUM service
	ctumExecuter.execute();

	// Wait for input on standard in, indicates shutdown
	System.out.println("CTUM publisher is running, ^D to terminate");
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	in.readLine();

	logger.info("CTUM publisher finished");
	hazelcastLCS.shutdown();
    }

}
