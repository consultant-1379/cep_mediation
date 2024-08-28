/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.tools.tooloutputconverters;

import java.lang.reflect.Constructor;

import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.ericsson.cepmediation.test.common.GpehEventType;

/**
 * @author eemecoy
 *
 */
public class EventCreatorForToolOutput {

    private static final String PACKAGE_NAME = "com.ericsson.cepmediation.apeventbeans.gpeh";

    public static GpehBase createEvent(final GpehEventType gpehEventType) {
        try {
            final Class<? extends GpehBase> clazz = getClazz(gpehEventType);
            //constructor for the class
            final Constructor<? extends GpehBase> constructor = clazz.getDeclaredConstructor();
            GpehBase newInstance;
            newInstance = constructor.newInstance();
            newInstance.setEventId(gpehEventType.getId());
            return newInstance;
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static Class<? extends GpehBase> getClazz(final GpehEventType gpehEventType) throws Exception {
        final String className = PACKAGE_NAME + "." + gpehEventType.toString();
        return (Class<? extends GpehBase>) Class.forName(className);
    }

}
