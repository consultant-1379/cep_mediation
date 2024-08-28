/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.database.entity;

import java.util.List;

/**
 * @author eemecoy
 *
 */
public class RabTypeInfo {

    private byte psRabCount;

    private byte csRabCount;
    
    private boolean multiRab;
    
    // Indicate the rabTypes that this combination is composed of
    private RabCombination composedOfRabTypes;
    
    public RabTypeInfo(byte psRabCnt, byte csRabCount, List<Short> rabs) {
    	setPsRabCount(psRabCnt);
    	setCsRabCount(csRabCount);
    	setMultiRab();
    	setComposedOfRabTypes(rabs);
    }

    private void setPsRabCount(byte psRabCnt) {
        this.psRabCount = psRabCnt;
    }

    private void setCsRabCount(byte csRabCount) {
        this.csRabCount = csRabCount;
    }
    
    private void setMultiRab() {
        this.multiRab = psRabCount + csRabCount > 1;
    }
    
    private void setComposedOfRabTypes(List<Short> rabs) {
    	composedOfRabTypes = new RabCombination(rabs); 	
    }

    /**
     * @return the psRabCount
     */
    public byte getPsRabCount() {
        return psRabCount;
    }

    /**
     * @return the csRabCount
     */
    public byte getCsRabCount() {
        return csRabCount;
    }   

    /**
     * @return if RAB is multiRab
     */
    public boolean isMultiRab() {
        return multiRab;
    }
    
    /**
     * @return the rabs that compose this rab combination
     */
    public RabCombination getComposedOfRabTypes() {
        return composedOfRabTypes;
    }
    
    /**
     * @return the rabs that compose this rab combination
     */
    public List<Short> getListOfComposedOfRabTypes() {
        return composedOfRabTypes.getSortedRabs();
    }

}
