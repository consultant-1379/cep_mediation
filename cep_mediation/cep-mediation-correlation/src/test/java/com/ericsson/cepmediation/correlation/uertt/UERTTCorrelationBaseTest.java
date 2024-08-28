/***------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2013
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
-----------------------------------------------------------------------------------------------*/
package com.ericsson.cepmediation.correlation.uertt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.correlation.radio.utils.Statements;
import com.ericsson.cepmediation.correlation.stubs.StubbedEsperService;
import com.ericsson.cepmediation.correlation.util.EsperInitialization;
import com.ericsson.cepmediation.correlation.util.parser.PlainFileParser;
import com.ericsson.cepmediation.test.common.DateTimeUtilities;
import com.espertech.esper.client.EPAdministrator;
import com.espertech.esper.client.EPOnDemandQueryResult;
import com.espertech.esper.client.EPRuntime;
import com.espertech.esper.client.EPServiceDestroyedException;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;
import com.espertech.esper.client.deploy.DeploymentException;
import com.espertech.esper.client.deploy.Module;
import com.espertech.esper.client.deploy.ParseException;
import com.espertech.esper.client.scopetest.SupportUpdateListener;

public abstract class UERTTCorrelationBaseTest {

    protected static long FIVE_MINUTE = 5 * 60 * 1000; // In order to create the session//

    protected short ueContext;

    protected short rncId;

    protected int cellId;

    protected byte rncModuleId;

    protected EPServiceProvider engine = null;

    protected UpdateListener fiveMinuteSessionListener = null;
    
    private  EPAdministrator admin;

    protected SupportUpdateListener sessionListener = null;

    protected SupportUpdateListener startMarkerListener = null;

    protected SupportUpdateListener enrichedEventListener = null;

    protected StubbedEsperService correlationEngine = null;

    protected static List<EventBean[]> radioSessionList = new ArrayList<EventBean[]>();

    /**
     * @param eplName           name of epl file
     * @param statement         name of statement in epl to listen on
     */
    public void configure(final String eplName, final String statement) throws Exception {
        configureEsper(eplName);
        addStatementAndListener(statement, sessionListener = new SupportUpdateListener());
    }

    /**
     * Configure esper to run the epl specified by eplName
     * This method will use the default Statement to listen on, ie Session-Enrichment
     * 
     * @param eplName           name of epl file
     * 
     */
    public void configure(final String eplName) throws Exception {
        configure(eplName, Statements.SESSION_ENRICHMENT);
    }

    public void configureEsper(final String... eplName) throws Exception { 
    	
    	configureEngine(eplName);
        final EPRuntime epRuntime = this.engine.getEPRuntime();
        correlationEngine = new StubbedEsperService(epRuntime);
    }

    public void deploy(final String eplFile) {
        try {
            final Module module = admin.getDeploymentAdmin().read(eplFile);
            admin.getDeploymentAdmin().deploy(module, null);
        } catch (final Exception e) {
            throw new RuntimeException("UERTTEsperService:Unable to deploy module '" + eplFile + "'", e);
        }
    }
    
    protected void configureEngine(final String... eplName) throws EPServiceDestroyedException, IOException, ParseException, DeploymentException {
        this.engine = EsperInitialization.configureEngine(eplName);
    }

    protected void listenToStatements(final String... statements) {
        for (final String statement : statements) {
            addStatementAndListener(statement, fiveMinuteSessionListener);
        }
    }
    
    protected void addStatementAndListener(final String statement, final UpdateListener updateListener) {
        final EPAdministrator epAdministrator = this.engine.getEPAdministrator();
        final EPStatement epStatement = epAdministrator.getStatement(statement);
        if (epStatement == null) {
            throw new RuntimeException("Could not find epl statement " + statement);
        }
        epStatement.addListener(updateListener);
    }

   

    protected static long getTimestamp() {
        return System.currentTimeMillis();
    }


    protected List<? extends Object> getElementsInWindow(final String windowName) {
        return runOnDemandQuery("select * from " + windowName);
    }

    protected List<? extends Object> runOnDemandQuery(final String onDemandQuery) {
        final String currentTime = DateTimeUtilities.convertTimeStampToDateString(getTimestamp());
        System.out.println("At " + currentTime + " ,running on demand query: " + onDemandQuery);
        final EPOnDemandQueryResult result = engine.getEPRuntime().executeQuery(onDemandQuery);
        final EventBean[] eventBeanObjects = result.getArray();
        final List<Object> objects = new ArrayList<Object>();

        for (final EventBean eventBean : eventBeanObjects) {
            final Object underlying = eventBean.getUnderlying();
            objects.add(underlying);
        }
        return objects;
    }

    



    protected void processFile(final String file) {
        List<ApEventBean> events = readEventsFromFile(file);
        correlationEngine.sendEventsAndSessionEndEventsForROP(events);
    }

    protected List<ApEventBean> readEventsFromFile(final String file) {
        List<ApEventBean> events = null;
        try {
            events = new PlainFileParser(file).parse();
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
        Collections.sort(events);
        return events;
    }

   
}