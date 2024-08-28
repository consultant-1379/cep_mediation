/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.core;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import com.ericsson.cepmediation.apeventbeans.correlation.SGEH_SESSION;
import com.ericsson.cepmediation.apeventbeans.ebm.ACTIVATE;
import com.ericsson.cepmediation.apeventbeans.ebm.DEACTIVATE;
import com.ericsson.cepmediation.apeventbeans.ebm.ISRAU;
import com.ericsson.cepmediation.apeventbeans.ebm.RAU;
import com.ericsson.cepmediation.correlation.enrichment.SessionEndEvent;
import com.espertech.esper.client.Configuration;
import com.espertech.esper.client.ConfigurationEngineDefaults.ThreadingProfile;
import com.espertech.esper.client.EPAdministrator;
import com.espertech.esper.client.EPRuntime;
import com.espertech.esper.client.EPServiceDestroyedException;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;
import com.espertech.esper.client.deploy.DeploymentException;
import com.espertech.esper.client.deploy.ParseException;

/**
 * @author exuexie
 * @since 06/2012
 */

public abstract class CoreCorrelationBase {

    protected long SESSION_DURATION = 5 * 60 * 1000; // In order to create the session//

    protected String packageName = "com.ericsson.cepmediation.apeventbeans.ebm";

    //network type
    protected String subNetwork = "SubNetwork1";

    protected String ne = "SGSN1";

    protected String name = "";

    protected String version = "v1";

    protected EPServiceProvider engine = null;

    protected EPRuntime correlationEngine = null;

    protected static List<EventBean[]> coreSessionList = new ArrayList<EventBean[]>();

    public static enum CoreEventType {

        ACTIVATE, ATTACH, DEACTIVATE, DETACH, ISRAU, RAU, SERVICE_REQUEST
    }

    public void configure(final String eplName, final String statementName, final UpdateListener updateListener) {
        configureEsper(eplName);
        addStatementAndListener(statementName, updateListener);
    }

    /**
     * Pass the epl file to EPRuntime
     *
     * @param eplName
     */
    public void configureEsper(final String eplName) {
        try {
            configureEngine(eplName);
            this.correlationEngine = this.engine.getEPRuntime();
        } catch (final Exception e) {
            e.printStackTrace();
        }

    }

    private void configureEngine(final String eplName) throws EPServiceDestroyedException, IOException, ParseException, DeploymentException {
        final Configuration configuration = new Configuration();
        configuration.addEventType(SGEH_SESSION.ABSOLUTE_NAME, SGEH_SESSION.class);
        //configuration.addImport(Util.class);
        configuration.getEngineDefaults().getExecution().setPrioritized(true);
        configuration.addEventType("ebm.ACTIVATE", ACTIVATE.class);
        configuration.addEventType("ebm.DEACTIVATE", DEACTIVATE.class);
        configuration.addEventType("ebm.RAU", RAU.class);
        configuration.addEventType("ebm.ISRAU", ISRAU.class);
        configuration.addEventType(SessionEndEvent.ABSOLUTE_NAME, SessionEndEvent.class);
        //configuration.getEngineDefaults().getThreading().setInternalTimerEnabled(false);
        configuration.getEngineDefaults().getExecution().setThreadingProfile(ThreadingProfile.LARGE);
        configuration.getEngineDefaults().getThreading().setListenerDispatchPreserveOrder(true);
        configuration.getEngineDefaults().getEventMeta().setDefaultEventRepresentation(Configuration.EventRepresentation.OBJECTARRAY);
        final EPServiceProvider engine = EPServiceProviderManager.getDefaultProvider(configuration);
        engine.initialize();
        final InputStream inputFile = this.getClass().getClassLoader().getResourceAsStream(eplName);
        engine.getEPAdministrator().getDeploymentAdmin().readDeploy(inputFile, null, null, null);
        this.engine = engine;
    }

    protected void addStatementAndListener(final String statement, final UpdateListener updateListener) {
        final EPAdministrator epAdministrator = engine.getEPAdministrator();
        if (epAdministrator == null) {
            throw new RuntimeException("Could not get EP Adminstrator from correlation engine");
        }
        final EPStatement epStatement = epAdministrator.getStatement(statement);
        if (epStatement == null) {
            throw new RuntimeException("Could not find statement " + statement);
        }
        epStatement.addListener(updateListener);
    }

    protected static List<EventBean[]> getCoreSessionList() {
        return coreSessionList;
    }

    protected static long getTimestamp() {
        return System.currentTimeMillis();
    }

    /**
     * Create the core event object
     *
     * @param eventType
     *
     * @return
     */
    protected Object createCoreEvent(final CoreEventType eventType, final long timestamp, final String imsi, final String imeisv, final String apn,
            final byte eventResult) {

        Object object = null;

        try {

            //find the class
            final Class clazz = Class.forName(packageName + "." + eventType.toString());

            //constructor for the class
            final Constructor constructor = clazz.getDeclaredConstructor(long.class, String.class, String.class, String.class, String.class);

            object = constructor.newInstance(timestamp, subNetwork, ne, name, version);

            //Change the IMSI value
            if (null != imsi && !imsi.equals("")) {

                final Method methodImsi = clazz.getDeclaredMethod("setIMSI", String.class);

                methodImsi.invoke(object, imsi);

            }

            //Change the IMSI value
            if (null != imsi && !imsi.equals("")) {

                final Method methodImeisv = clazz.getDeclaredMethod("setIMEISV", String.class);

                methodImeisv.invoke(object, imeisv);

            }

            //change the APN value
            if (apn != null) {

                Method methodApn = null;

                //handle the NoSuchMethodException internally
                try {
                    methodApn = clazz.getDeclaredMethod("setAPN", String.class);

                    methodApn.invoke(object, apn);
                } catch (final NoSuchMethodException e) {

                }

            }

            //change the event result, and event result should be between [0, 3], i.e, valid event result code
            if (eventResult >= 0 && eventResult <= 3) {

                Method methodER = null;

                try {

                    methodER = clazz.getDeclaredMethod("setHEADER_EVENT_RESULT", byte.class);

                    methodER.invoke(object, eventResult);
                } catch (final NoSuchMethodException e) {

                }
            }

        } catch (final NoSuchMethodException e) {
            e.printStackTrace(); //To change body of catch statement use File | Settings | File Templates.
        } catch (final InvocationTargetException e) {
            e.printStackTrace(); //To change body of catch statement use File | Settings | File Templates.
        } catch (final InstantiationException e) {
            e.printStackTrace(); //To change body of catch statement use File | Settings | File Templates.
        } catch (final IllegalAccessException e) {
            e.printStackTrace(); //To change body of catch statement use File | Settings | File Templates.
        } catch (final ClassNotFoundException e) {
            e.printStackTrace(); //To change body of catch statement use File | Settings | File Templates.
        }

        return object;

    }

}
