/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2013 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.eniq.events.cepmediation.datagen_precook.common;

import java.util.HashMap;

/**
 * @author eikrwaq
 * @since 2013
 *
 */
public enum RncType {

    TYPE1("datagen.preparser.rnctype1"), TYPE2("datagen.preparser.rnctype2"), TYPE3("datagen.preparser.rnctype3"), TYPE4(
            "datagen.preparser.rnctype4"), TYPE5("datagen.preparser.rnctype5"), TYPE6("datagen.preparser.rnctype6"), TYPE7(
            "datagen.preparser.rnctype7"), TYPE8("datagen.preparser.rnctype8"), TYPE9("datagen.preparser.rnctype9"), TYPE10(
            "datagen.preparser.rnctype10");

    private int numOfMcs;

    private int numOfFiles;

    private int noOfUeContextModleIDs;

    private static final int TOTAL_NO_OF_KNOWN_UE_CONTEXT_MODULE_ID = 219071;

    private String rncType;

    private RncType(String rncType) {
        this.rncType = rncType;
    }

    public String getRncType() {
        return rncType;
    }

    public void setRncType(String rncType) {
        this.rncType = rncType;
    }

    public int getNumOfMcs() {
        return numOfMcs;
    }

    public void setNumOfMcs(int numOfMcs) {
        this.numOfMcs = numOfMcs;
    }

    public int getNumOfFiles() {
        return numOfFiles;
    }

    public void setNumOfFiles(int numOfFiles) {
        this.numOfFiles = numOfFiles;
    }

    public int getNoOfUeContextModleIDs() {
        return noOfUeContextModleIDs;
    }

    public void setNoOfUeContextModleIDs(int noOfUeContextModleIDs) {
        this.noOfUeContextModleIDs = noOfUeContextModleIDs;
    }

    public int getTotalUeContextModuleIdSize() {
        if (noOfUeContextModleIDs > TOTAL_NO_OF_KNOWN_UE_CONTEXT_MODULE_ID) {
            return noOfUeContextModleIDs % TOTAL_NO_OF_KNOWN_UE_CONTEXT_MODULE_ID;
        }

        return noOfUeContextModleIDs;
    }

    public int getNumberOfEventToClone() {
        return noOfUeContextModleIDs / TOTAL_NO_OF_KNOWN_UE_CONTEXT_MODULE_ID;
    }
    public int getNumberInternalSysUtilToClone() {
        return (((100 * noOfUeContextModleIDs) / TOTAL_NO_OF_KNOWN_UE_CONTEXT_MODULE_ID) % 100);
    }
    
    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {

        final StringBuilder sb = new StringBuilder();
        sb.append("No Of MCs : ").append(numOfMcs).append(", No Of Files : ").append(numOfFiles)
                .append(", No Of UE CONTEXT & MODULE ID required : ").append(noOfUeContextModleIDs);

        return sb.toString();
    }

    /**
     * @param property
     */
    public void init(String property) {
        final String[] string = property.split("\\,");
        final HashMap<String, String> map = new HashMap<String, String>();
        for (final String keyValueString : string) {
            final String[] keyValue = keyValueString.split("\\=");
            map.put(keyValue[0], keyValue[1]);
        }
        setNumOfMcs(Integer.valueOf(map.get("MC")));
        setNumOfFiles(Integer.valueOf(map.get("FILES")));
        setNoOfUeContextModleIDs(Integer.valueOf(map.get("NoOfUeContextModleIDs")));
    }
}
