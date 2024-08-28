/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.util;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.sql.Types;

import org.junit.Test;

/**
 * @author eemecoy
 *
 */
public class TypeConversionTest {

    @Test
    public void testTypeSqlToJava() {
        testTypeConversion(Types.CLOB, "String");
        testTypeConversion(Types.TINYINT, "byte");
        testTypeConversion(Types.SMALLINT, "short");
        testTypeConversion(Types.INTEGER, "int");
        testTypeConversion(Types.BIGINT, "long");
        testTypeConversion(Types.BINARY, "byte[]");
        testTypeConversion(Types.TIMESTAMP, "long");
        testTypeConversion(Types.DATE, "long");
        testTypeConversion(Types.BOOLEAN, "boolean");
        testTypeConversion(Types.FLOAT, "float");
        testTypeConversion(Types.DOUBLE, "double");
        testTypeConversion(999, "null");
    }

    private void testTypeConversion(int sqlType, String expectedJavaType) {
        assertThat(TypeConversion.typeSqlToJava(sqlType), is(expectedJavaType));
    }

}
