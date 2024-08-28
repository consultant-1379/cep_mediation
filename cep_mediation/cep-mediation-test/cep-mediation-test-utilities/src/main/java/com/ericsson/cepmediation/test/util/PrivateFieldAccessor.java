package com.ericsson.cepmediation.test.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class PrivateFieldAccessor {
    private Object target;

    private Field field;

    public PrivateFieldAccessor(Object target, String fieldName) throws SecurityException, NoSuchFieldException,
            IllegalArgumentException, IllegalAccessException {
        Class<?> clazz = target.getClass();
        this.target = target;
        field = clazz.getDeclaredField(fieldName);
        // needed to access private field
        field.setAccessible(true);

        // needed to handle final
        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
    }

    public void setVal(Object val) throws IllegalArgumentException, IllegalAccessException {
        field.set(target, val);
    }

    public Object getVal() throws IllegalArgumentException, IllegalAccessException {
        return field.get(target);
    }
}
