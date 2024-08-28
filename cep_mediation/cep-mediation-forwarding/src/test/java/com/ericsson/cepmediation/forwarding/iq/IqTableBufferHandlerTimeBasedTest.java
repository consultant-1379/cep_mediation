package com.ericsson.cepmediation.forwarding.iq;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.RAB_ESTABLISH_RNC_AGGR;
import com.ericsson.cepmediation.forwarding.ForwarderUtilityHelper;

@Ignore
// This test is ignored because it creates some files on the test server file system
public class IqTableBufferHandlerTimeBasedTest {
    private DateFormat dateFormat;

    private IqTableBufferHandler instance;

    @Before
    public void setUp() {
        dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        ForwarderUtilityHelper.setInitialData(null, "1.1.1.1", 1);
        instance = new IqTableBufferHandler();
        instance.start();
    }

    private RAB_ESTABLISH_RNC_AGGR createEvent() {
        final RAB_ESTABLISH_RNC_AGGR agg = new RAB_ESTABLISH_RNC_AGGR();
        agg.setTimestamp(new Date().getTime());

        final StringBuilder sb = new StringBuilder();
        while (sb.length() < 1000) {
            sb.append("abrakadabra");
        }
        // int fields
        agg.setHIER3_ID(1l);
        agg.setRNC_ID((short)1);
        agg.setCALLS_PS_ALL(1000);
        agg.setCALLS_CS_ALL(1000);
        agg.setCALLS_MR_ALL(1000);
        agg.setPS_SUC(1000);
        agg.setCS_SUC(1000);
        agg.setMR_SUC(1000);

        return agg;
    }

    @Test
    public void testInsert() throws Exception {
        instance.insert("correlation.RAB_ESTABLISH_RNC_AGGR", createEvent());
        instance.insert("correlation.RAB_ESTABLISH_RNC_AGGR", createEvent());
        instance.insert("correlation.RAB_ESTABLISH_RNC_AGGR", createEvent());
        instance.close();
        Thread.sleep(2000);
    }

    @Test
    public void testMultipleInsertOver2Days() throws Exception{
    	final RAB_ESTABLISH_RNC_AGGR aggDayOld = createEvent();
    	aggDayOld.setTimestamp(new Date().getTime()-(24*60*60*1000));
    	instance.insert("correlation.RAB_ESTABLISH_RNC_AGGR", aggDayOld);
    	instance.insert("correlation.RAB_ESTABLISH_RNC_AGGR", createEvent());
    	instance.close();
    	Thread.sleep(2000);
    }

}
