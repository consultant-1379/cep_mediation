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
package com.ericsson.cepmediation.base.util;

/**
 * @author eachsaj
 *This enum defines all error codes used in the system
 */
public enum ErrorCode {
    
    NON_UNIQUE_LABEL,

    NOT_ENOUGH_FREE_MEMORY,
    
    PARSING_FAILED,

    SCHEME_GEN_FAILED,

    /*
     * used in {@link ConfigurationHelper} class 
     * */
    FAILED_LOAD_PROC_DEF,

    FAILED_LOAD_PROPS_DEF,

    // Failed to load service
    FAILED_TO_LOAD_SERVICE,

    // used by the server component
    FTP_OPERATION_FAILED,

    FAILED_TO_CLOSE_FTP_CONNECTION,

    // rmi registry failed to start
    REGISTRY_CREATION_FAILURE,

    CORRELATION_ENG_INIT_FAILED,

    CORRELATION_NAME_UNDEFINED,

    //local ip address read failed
    FAILED_READ_SYSTEM_IP,

    FAILED_READ_SYSTEM_NAME,

    //check the config.xml ,missing/wrong ip/hostname definition or problem reading or finding file
    PROBLEM_READING_SERVICE_CONFIG,

    //esper rules directory missing
    RULES_NOT_FOUND,

    //esper rules deployment failed
    RULE_DEPLOY_FAILED,

    UNKNOWN_PROC,

    PROC_INIT_FAILED,

    UNKNOWN_SERVICE,

    FAILED_START_SERVICE,

    DUPLICATE_ENTRY,

    FAILED_TO_CONNECT_REMOTE_SERVER,

    MISSING_ADMIN_IP,

    FAILED_TO_START_SERVER,

    COLLECTION_EXCEPTION;

}
