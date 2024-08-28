package com.ericsson.cepmediation.base.properties;

import com.ericsson.cepmediation.base.util.ErrorCode;

public class ConfigurationException extends RuntimeException {

    private static final long serialVersionUID = 9036489860667343280L;

    private final ErrorCode errorCode;
    
    public ConfigurationException(String msg) {
        super(msg);
        errorCode = null;
    }

    /**This class is used by the {@link ConfigBinder.java} class, if it failed to 
     * load the config.xml file
     * @param message, String type error message
     * @param code, int type error code.
     */
    public ConfigurationException(final String message, final ErrorCode code) {
        super(message);
        this.errorCode = code;
    }

    /**
     * @param rootException
     * @param code
     */
    public ConfigurationException(final Exception rootException, final ErrorCode code) {
        super(rootException);
        this.errorCode = code;
    }

    /**Error code can accessed using this method.
     * @return  ErrorCode type error code
     */
    public ErrorCode getErrorCode() {
        return errorCode;
    }

}
