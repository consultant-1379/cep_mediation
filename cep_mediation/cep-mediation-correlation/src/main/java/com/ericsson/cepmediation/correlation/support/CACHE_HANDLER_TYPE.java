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

/**This enum defines the supported cache handler types
 * 
 * @author eachsaj
 *
 */
public enum CACHE_HANDLER_TYPE {

    /**
     * {@link RAUBufferReader}
     */
    RAU,
    /**
     *  {@link ISRAUBufferReader}
     */
    ISRAU,

    USER_PLANE,

    ACTIVATE, ATTACH_WCDMA, SERVICE_REQUEST_WCDMA
}
