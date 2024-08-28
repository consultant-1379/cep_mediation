package com.ericsson.cepmediation.correlation.gpeh.esper;

import org.junit.Ignore;

import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION_START_MARKER;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CMODE_ACTIVATE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_IMSI;
import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;

@Ignore("epl file not in source control")
public final class CoreMetricsEsperTestCase extends BaseEsperTestCase {

    @Override
    protected String getConfFileName() {
        return DEFAULT_ESPER_CONF_FILE;
    }

    @Override
    protected String getModuleFileName() {
        return "etc/esper/VeljkoDev.epl";
    }

    public void test() throws Exception {
        final EPStatement
        //		stmt  = admin.getStatement("Session-Result-Selector");
        //		stmt = admin.getStatement("Session-Deleter-Trigger");
        stmt = admin.getStatement("Dummy");
        stmt.addListener(new PrintingUpdateListener());

        final long sessionId = 1;

        final GPEH_SESSION_START_MARKER marker = new GPEH_SESSION_START_MARKER();
        marker.setSessionId(sessionId);
        marker.setEXPECTED_EVENT_COUNT(2);

        final INTERNAL_IMSI ii = new INTERNAL_IMSI();
        ii.setTimestamp(System.currentTimeMillis());
        ii.setSessionId(sessionId);
        //		ii.setIMSI(34);
        ii.setC_ID_1((short) 2);
        ii.setRNC_ID_1((short) 1);

        final INTERNAL_CMODE_ACTIVATE activate = new INTERNAL_CMODE_ACTIVATE();
        activate.setTimestamp(System.currentTimeMillis() + 10);
        activate.setSessionId(sessionId);
        activate.setC_ID_1((short) 12);
        activate.setRNC_ID_1((short) 33);

        runtime.sendEvent(marker);
        runtime.sendEvent(ii);
        runtime.sendEvent(activate);

        System.in.read();
    }

    private static final class PrintingUpdateListener implements UpdateListener {
        @Override
        public void update(final EventBean[] newEvents, final EventBean[] oldEvents) {
            if (newEvents != null) {
                for (int i = 0; i < newEvents.length; i++) {
                    System.out.println(newEvents[i]);
                }
            }
            if (oldEvents != null) {
                for (int i = 0; i < oldEvents.length; i++) {
                    System.out.println(oldEvents[i]);
                }
            }
        }
    }
}
