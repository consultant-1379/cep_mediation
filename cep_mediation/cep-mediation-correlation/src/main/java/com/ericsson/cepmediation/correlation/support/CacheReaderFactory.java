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

/**
 * This class builds the Cache handler based on the type requested.
 * @author eachsaj
 *
 */
public class CacheReaderFactory {

    /**
     * This method creates the instance of this class and returns to the caller.
     * 
     */
    public static CacheReaderFactory create() {
        return new CacheReaderFactory();
    }

    /**This method creates the instance of requested CacheHandler Type
     * @param type, please see the {@link CACHE_HANDLER_TYPE} for more info
     * @return instance of {@link CacheHandler} 
     */
    public synchronized CacheHandler getHandler(final CACHE_HANDLER_TYPE type) {

        switch (type) {

        case USER_PLANE:
            return UserPlaneBufferReader.getInstance();
        case RAU:
            return RAUBufferReader.create();
        case ISRAU:
            return ISRAUBufferReader.getInstance();
        case ACTIVATE:
            return ActivateBufferReader.getInstance();
        case ATTACH_WCDMA:
            return AttachBufferReader.getInstance();
        case SERVICE_REQUEST_WCDMA:
            return ServiceRequestBufferReader.getInstance();

        default:
            throw new UnsupportedOperationException("Unknown  handler type requested");
        }

    }

}
