package com.ericsson.cepmediation.autoconfig.properties;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import java.util.Set;

import org.junit.Test;

import com.ericsson.cepmediation.test.util.PrivateFieldAccessor;
import com.ericsson.cepmediation.test.util.PrivateMethodCaller;

public class AutoconfigPropertiesTest {
    @Test
    public void shouldParseCommaSeparatedListCorrectly() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, SecurityException, NoSuchFieldException {
        PrivateFieldAccessor accessor = new PrivateFieldAccessor(AutoconfigProperties.instance, "props");
        Properties props = new Properties();
        props.put("x", "RNC01,RNC02,RNC03");
        accessor.setVal(props);
        
        PrivateMethodCaller caller = new PrivateMethodCaller(AutoconfigProperties.instance, "getListProperty", String.class);
        Set<String> rncs = (Set<String>)caller.call("x");
        assertThat(rncs.size(), is(3));
        assertTrue(rncs.contains("rnc01"));
        assertTrue(rncs.contains("rnc02"));
        assertTrue(rncs.contains("rnc03"));
    }
}
