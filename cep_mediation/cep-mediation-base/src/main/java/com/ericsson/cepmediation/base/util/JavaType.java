/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.util;


/**
 * @author eemecoy
 *
 */
public enum JavaType {
    String("String"),

    DOUBLE("double"),

    FLOAT("float"),

    BOOLEAN("boolean"),

    LONG("long"),

    BYTE_ARRAY("byte[]"),

    INT("int"),

    SHORT("short"),

    BYTE("byte");

    private String javaType;

    JavaType(String javaType) {
        this.javaType = javaType;
    }

    public String getJavaType() {
        return javaType;
    }

}
