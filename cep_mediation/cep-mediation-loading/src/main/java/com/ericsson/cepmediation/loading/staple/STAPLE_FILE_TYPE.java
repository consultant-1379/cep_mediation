package com.ericsson.cepmediation.loading.staple;

import java.util.HashMap;
import java.util.Map;

/**
 * This ENUM is used to determine the type of parser to be instantiated and used
 * for certain input files 
 * @author eachsaj
 */

public enum STAPLE_FILE_TYPE {
    // TCPTA session file
    TCP_REPORT,
    // Partial TCPTA session File
    TCP_REPORT_PARTIAL,
    // Flash Video File
    FLASH_VIDEO_REPORT,
    // Partial flash video session file
    FLASH_VIDEO_REPORT_PARTIAL,
    // Invalid session file
    INVALID;

    private static final Map<Integer, STAPLE_FILE_TYPE> typesByValue = new HashMap<Integer, STAPLE_FILE_TYPE>();

    static {
        for (final STAPLE_FILE_TYPE type : STAPLE_FILE_TYPE.values()) {
            typesByValue.put(type.ordinal(), type);
        }
    }

    /**
     * Returns the STAPLE FILE TYPE Enum corresponding to the the given int value
     * @param value
     * @return the STAPLE_FILE_TYPE Enum for the corresponing int or null if no matching
     * enum is found.
     */
    public static STAPLE_FILE_TYPE forValue(final int value) {
        return typesByValue.get(value);
    }
}
