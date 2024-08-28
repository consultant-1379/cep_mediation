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
package com.ericsson.cepmediation.correlation.support;

import com.ericsson.cepmediation.apeventbeans.correlation.IP_TO_IMSI_LOOKUP;
import com.ericsson.cepmediation.apeventbeans.ebm.L_ATTACH;
import com.ericsson.cepmediation.apeventbeans.ebm.L_HANDOVER;
import com.ericsson.cepmediation.apeventbeans.ebm.L_SERVICE_REQUEST;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;

/**
 * This interface defines common method for CTUM and 
 * @author eachsaj
 *
 */
public interface CacheHandler {

    /**This method reads {@link L_ATTACH} or {@link L_SERVICE_REQUEST} or {@link L_HANDOVER} events
     * from the cache using the filter IMSI
    * @param imsi, String IMSI
    * @return an array of events, If the result contains more than one element use the time stamp to 
    * identify the most relevant event
    * 
    *
    */
    ApEventBean[] findById(String imsi);

    /**This method reads {@link ApEventBean}  events
     * from the cache using the imsi 
    * @param imsi, String IMSI
    * @returns array of {@link ApEventBean}
    * 
    
    */
    ApEventBean[] findAllById(String imsi);

    /**This method reads {@link L_ATTACH} or {@link L_SERVICE_REQUEST} or {@link L_HANDOVER} events
     * from the cache using the filter IMSI and time stamp
    * @param imsi, String IMSI
    * @return an array of events, If the result contains more than one element use the time stamp to 
    * identify the most relevant event
    * 
    
    */
    ApEventBean[] findByIdAndRange(String imsi, long timestamp);

    /**This method reads {@link RAU} and {@link ISRAU}  events
      * from the cache using the filter IMSI and time stamp. 
     * @param imsi, String IMSI
     * @return an array of events, If the result contains more than one element use the time stamp to 
     * identify the most relevant event
     * 
     * @exception This method throws {@link UnsupportedOperationException},if this method calls on a unsupported object, this supports only 
     * {@link RAUBufferReader}{@link ISRAUBufferReader}
     * 
     */
    ApEventBean[] findByIdAndTimeRange(String imsi, long startTimestamp, long endTimeStamp);

    IP_TO_IMSI_LOOKUP findByIpAddressAndTimestamp(String ipAddress, long timeStamp, boolean isLastAttempt);
}