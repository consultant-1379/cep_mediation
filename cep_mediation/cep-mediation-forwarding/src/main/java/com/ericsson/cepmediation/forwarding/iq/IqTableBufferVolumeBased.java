package com.ericsson.cepmediation.forwarding.iq;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;

/**
 * This class is used to loads events into iq binary files for Volume based Partitions.
 * 
 * Load files for volume based partitions have no special handling
 */
public class IqTableBufferVolumeBased extends IqTableBuffer {
    
    IqTableBufferVolumeBased(final String absoluteName, final String techPackName, final String filePrefix) {
    	super(absoluteName, techPackName, filePrefix);
    }
    
   
    /**
     * Load files for volume based partitions have no special handling.
     *   
     */
    protected synchronized boolean canEventBeAddedToFile(final ApEventBean event) {
    	return true;
    }
    
    protected void eventInsertedIntoFile(final ApEventBean event) {
    	// Nothing to do
    }
    
    
    protected void fileFlushed() {
    	// No special handling
    }
    
    protected String getFilePrefix() {
    	return getCommonPrefix();
    }
   
}
