/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.up;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.ericsson.cepmediation.apeventbeans.bearer_plane.FLASH_VIDEO_REPORT_PARTIAL;
import com.ericsson.cepmediation.apeventbeans.bearer_plane.TCP_REPORT_PARTIAL;
import com.ericsson.cepmediation.correlation.util.EsperConfigurationForTest;
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
 *
 * @author exuexie
 * 23/07/2012
 */
public abstract class UserPlaneCorrelationBase {

    protected long SESSION_DURATION = 60 * 1000; // In order to create the session//

    protected EPServiceProvider engine = null;

    protected EPRuntime correlationEngine = null;

    protected static List<EventBean[]> upSessionList = new ArrayList<EventBean[]>();

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

        final EPServiceProvider engine = EPServiceProviderManager.getDefaultProvider(new EsperConfigurationForTest().getEsperConfiguration());
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

    protected static List<EventBean[]> getUserPlaneSessionList() {
        return upSessionList;
    }

    protected static long getTimestamp() {
        return System.currentTimeMillis();
    }

    protected TCP_REPORT_PARTIAL createTcpReportPartialEvent(final long timestamp, final int duration, final byte direction, final int dataReceived, final int maxReceivedWin,
            final float setupTimeNet, final float setupTimeTerm, final int maxDataPacket, final float packageLossNet, final float packageLossTerm, final String host, final String imsi,
            final String imeisv, final String apn

    ) {

        TCP_REPORT_PARTIAL tcpReport = new TCP_REPORT_PARTIAL(timestamp, "", "", "", "");

        tcpReport.setDURATION(duration); //set the duration
        tcpReport.setDIRECTION(direction); //set the direction
        tcpReport.setDATA_RECEIVED(dataReceived); //data received
        tcpReport.setMAX_RWIN(maxReceivedWin);
        tcpReport.setSETUP_TIME_NET(setupTimeNet);
        tcpReport.setSETUP_TIME_TERM(setupTimeTerm);
        tcpReport.setMAX_DATA_PACKET(maxDataPacket);
        tcpReport.setPACKET_LOSS_NET(packageLossNet);
        tcpReport.setPACKET_LOSS_TERM(packageLossTerm);
        tcpReport.setHOST(host);
        tcpReport.setIMSI(imsi);
        tcpReport.setIMEISV(imeisv);//set the IMEISV
        tcpReport.setAPN(apn);

        return tcpReport;
    }

    protected FLASH_VIDEO_REPORT_PARTIAL createFlashVideoReportPartialEvent(final long timestamp, final int duration, final byte direction, final int dataReceived, final int maxReceivedWin,
            final float setupTimeNet, final float setupTimeTerm, final int maxDataPacket, final float packageLossNet, final float packageLossTerm, final String imsi, final String imeisv,
            final String apn) {

        FLASH_VIDEO_REPORT_PARTIAL flvPartial = new FLASH_VIDEO_REPORT_PARTIAL(timestamp, "", "", "", "");

        flvPartial.setDURATION(duration);
        flvPartial.setDATA_RECEIVED(dataReceived);
        flvPartial.setDIRECTION(direction);
        flvPartial.setMAX_RWIN(maxReceivedWin);
        flvPartial.setSETUP_TIME_NET(setupTimeNet);
        flvPartial.setSETUP_TIME_TERM(setupTimeTerm);
        flvPartial.setMAX_DATA_PACKET(maxDataPacket);
        flvPartial.setPACKET_LOSS_NET(packageLossNet);
        flvPartial.setPACKET_LOSS_TERM(packageLossTerm);
        flvPartial.setIMSI(imsi);
        flvPartial.setIMEISV(imeisv);
        flvPartial.setAPN(apn);

        return flvPartial;
    }

}
