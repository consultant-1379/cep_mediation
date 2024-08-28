/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.database.entity;

/**
 * @author eemecoy
 *
 */
public class RabType {

    private int rabType;

    private String rabTypeDesc;

    private boolean categoryId;

    public void setRabType(int rabType) {
        this.rabType = rabType;
    }

    public void setRabTypeDesc(String rabTypeDesc) {
        this.rabTypeDesc = rabTypeDesc;
    }

    public void setCategoryId(boolean categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @return the rabType
     */
    public int getRabType() {
        return rabType;
    }

    /**
     * @return the rabTypeDesc
     */
    public String getRabTypeDesc() {
        return rabTypeDesc;
    }

    /**
     * @return the categoryId
     */
    public boolean getCategoryId() {
        return categoryId;
    }

}
