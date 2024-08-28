package com.ericsson.cepmediation.forwarding.iq;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;

public class IqForwarderTest {
    private DateFormat dateFormat;

    private IqForwarder instance;

    @Before
    public void setUp() {
        dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        ServiceConfigBean configData = new ServiceConfigBean();
        configData.setHostName("myHost");
        configData.setHostIp("1.1.1.1");
        configData.setProcessId(1);
        instance = new IqForwarder();
        instance.init(configData);
    }

    private GPEH_SESSION createEvent() {
        final GPEH_SESSION sess = new GPEH_SESSION();
        sess.setTimestamp(new Date().getTime());

        final StringBuilder sb = new StringBuilder();
        while (sb.length() < 1000) {
            sb.append("abrakadabra");
        }
        // int fields
        sess.setCM_CNT(Integer.MIN_VALUE);
        sess.setCM_DL_CNT(Integer.MAX_VALUE);
        sess.setCM_DURATION(1);
        sess.setCM_UL_CNT(-1);
        sess.setCM_ULDL_CNT(312312);
        sess.setCM_USER_CNT(312312);
        sess.setDISTINCT_CELL_CNT(-754645);
        sess.setDL_NON_HS_TX_POWER_AVG(0);
        sess.setRRC_DURATION(3123123);
        sess.setECNO_AVG(423423);
        sess.setEND_C_ID(-123123);
        sess.setEVENT_CNT(3123123);
        sess.setHS_CELL_CHANGE_ERR_CNT(8987);
        sess.setHS_CELL_CHANGE_SUC_CNT(-42323);
        sess.setHS_NO_SELECTION_CNT(11);
        sess.setIFHO_EXEC_ERR_CNT(1);
        sess.setIFHO_EXEC_SUC_CNT(1);
        sess.setIRAT_EXEC_ERR_CNT(1);
        sess.setRRC_MEAS_REP_SAMPLES(1);
        sess.setRRC_SAMPLES_BC_BS(1);
        sess.setRRC_SAMPLES_BC_GS(1);
        sess.setRRC_SAMPLES_GC_BS(1);
        sess.setRRC_SAMPLES_GC_GS(1);
        sess.setRSCP_AVG((short) 1);

        sess.setSOHO_EXEC_SUC_CNT(Integer.MAX_VALUE);
        sess.setSTART_C_ID(Integer.MIN_VALUE);
        sess.setUL_INTERFERENCE_AVG(Integer.MIN_VALUE);

        // long
        sess.setIMSI(Long.MIN_VALUE);

        sess.setSessionId(1);

        // string fields
        sess.setIMSI_MCC("300");
        sess.setIMSI_MNC(sb.substring(0, 98));
        sess.setName("0000000000000();););););");
        sess.setNe("dasdasdasdasdasdas");
        sess.setVersion(sb.toString());

        // float
        sess.setACTIVITY(Float.MAX_VALUE);
        sess.setEUL_RATIO(-1);
        sess.setHS_RATIO(Float.MIN_VALUE);

        // short fields
        sess.setCDS_SUCC_CNT((short) 0);
        sess.setCS_REASON_QUEUE(Short.MAX_VALUE);

        sess.setCS_REASON_CAPACITY((short) -1);

        sess.setHSDPA_UE_CATEGORY(Short.MAX_VALUE);
        sess.setHSDSCH_USERS_AVG(Short.MAX_VALUE);
        sess.setSTART_RAB(Short.MAX_VALUE);
        sess.setSTART_RNC(Short.MAX_VALUE);

        return sess;
    }

    
    //@Test
    public void testForward() {
        final GPEH_SESSION sess = createEvent();
        instance.forward(sess);
        try {
            Thread.sleep(150000);
        } catch (Exception e) {
            //System.out.println("Exception" + e.getMessage());
        }
        instance.close(); 
    }
    
    
    //@Test
    public void testFillingMaxBinaryFileSize() {
    	// Each Gpeh Session File (100000 events) is ~ 41MB
    	// 250 files ~ 10 GB
    	for (int i = 0; i < 3; i++){
    		for (int files = 0; files < 500; files++) {
    			for (int events = 0; events < 100000; events++) {
    				final GPEH_SESSION sess = new GPEH_SESSION();
    				sess.setTimestamp(new Date().getTime());
    				sess.setCM_ULDL_CNT(12312);
    				instance.forward(createEvent());
    			}
    		}
    	
    		// Delete the files from the tech pack directories
    		File techPackdir = new File(CepMediationProperties.getFileProperty(CepMediationProperty.IQ_BINARY_DIRECTORY));
    		removeFiles(techPackdir);
    		System.out.println("Files Deleted");
    	}
    	
        instance.close();
    }
    
    private void removeFiles(File dir) {
    	File[] files = dir.listFiles();
    	for (File file : files) {
    		if (file.isDirectory()) {
    			removeFiles(file);
    		} else {
    			file.delete();
    		}
    			
    	}
    }
    
}
