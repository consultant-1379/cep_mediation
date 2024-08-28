package com.ericsson.cepmediation.base.proc.config;


public enum NE_TYPE {

    GPEH(1),

    SGEH(2),

    USER_PLANE(3),
    
    UE_TRACE(4);

    private int networkElementType;

    NE_TYPE(final int networkElementType) {
        this.networkElementType = networkElementType;
    }

    public int getValue() {
        return networkElementType;
    }
    
    public static String getName(int type){
        switch (type) {
            case 1:
                return "GPEH TYPE (RADIO)";
            case 2:
                return "SGEH TYPE (CORE)";
            case 3: 
                return "USER_PLANE TYPE (PCP)";
            case 4:
                return "UE_TRACE TYPE (UE_RTT)";
            default:
               return "UNDEFINED-TYPE";
        }
    }

    public static NE_TYPE resolveNetworkType(String correlationName) {
        if (correlationName.equalsIgnoreCase("3GRadioSessionCorrelation")
        		||correlationName.equalsIgnoreCase("3GRadioSessionVCCorrelation")
        		||correlationName.equalsIgnoreCase("3GRadioSessionMCorrelation")) {
            return NE_TYPE.GPEH;
        } else if (correlationName.equalsIgnoreCase("CoreSessionCorrelation")) {
            return NE_TYPE.SGEH;
        } else if (correlationName.equalsIgnoreCase("UserPlaneCorrelation")) {
            return NE_TYPE.USER_PLANE;
        } else if (correlationName.equalsIgnoreCase("UERTTCorrelation")) {
            return NE_TYPE.UE_TRACE;
        }
        return null;
    }
    
}
