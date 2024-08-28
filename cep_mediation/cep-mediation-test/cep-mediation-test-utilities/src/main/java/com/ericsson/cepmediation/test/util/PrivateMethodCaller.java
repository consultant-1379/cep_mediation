package com.ericsson.cepmediation.test.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.commons.lang.ArrayUtils;

/**
 * Utility class for invoking private methods as required by JUnit tests.
 * 
 * This class should be used in Junit only.
 * 
 * @author emicned
 *
 */
public class PrivateMethodCaller {
    private final Object target;

    private final Method method;

    public PrivateMethodCaller(final Object target, final String methodName, Class<?>... parameterTypes) {
        this.target = target;

        if (parameterTypes == null) {
            parameterTypes = ArrayUtils.EMPTY_CLASS_ARRAY;
        }

        method = getDeclaredMethod(target.getClass(), methodName, parameterTypes);

        method.setAccessible(true);
    }

    public Object call(Object... args) throws IllegalArgumentException, IllegalAccessException,
            InvocationTargetException {
        if (args == null) {
            args = ArrayUtils.EMPTY_OBJECT_ARRAY;
        }
        return method.invoke(target, args);
    }

    private Method getDeclaredMethod(final Class<?> clazz, final String methodName, final Class<?>... parameterTypes)
            throws SecurityException {
        try {
            return clazz.getDeclaredMethod(methodName, parameterTypes);
        } catch (final NoSuchMethodException e) {
            if (clazz.equals(Object.class)) {
                return null;
            }
            return getDeclaredMethod(clazz.getSuperclass(), methodName, parameterTypes);
        }
    }
}