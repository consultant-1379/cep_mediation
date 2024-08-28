package com.ericsson.cepmediation.autoconfig.util.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.autoconfig.model.Config;
import com.ericsson.cepmediation.autoconfig.model.Host;
import com.ericsson.cepmediation.autoconfig.model.Rnc;
import com.ericsson.cepmediation.autoconfig.model.Sgsn;
import com.ericsson.cepmediation.autoconfig.model.UserPlane;
import com.ericsson.cepmediation.autoconfig.properties.AutoconfigProperties;
import com.ericsson.cepmediation.autoconfig.properties.AutoconfigProperties.NEPath;
import com.ericsson.cepmediation.autoconfig.util.GpehPathHelper;
import com.ericsson.cepmediation.autoconfig.util.SgehPathHelper;
import com.ericsson.cepmediation.autoconfig.util.Utils;
import com.ericsson.cepmediation.test.util.PrivateFieldAccessor;

/**
 * 
 * @author evikkua
 *
 */
public class UtilsTest {
    Config config;

    Map<String, Integer> rncs;

    List<String> sgsns;

    String gpehRootPath = "/eniq/data/eventdata/events_oss_1/GpehEvents_CEP/SubNetwork=";

    String sgehRootPath = "/eniq/data/eventdata/events_oss_1/SgehEvents_CEP/ManagedElement=";

    @Before
    public void init() throws SecurityException, IllegalArgumentException, NoSuchFieldException, IllegalAccessException {
        config = new Config();
        Host host1 = new Host("atrcxb2544", "10.44.81.62", true, 250000, 32);
        Host host2 = new Host("atrcxb2545", "10.44.81.52", true, 100000, 16);
        List<Host> hosts = new ArrayList<Host>();
        hosts.add(host1);
        hosts.add(host2);
        config.setHosts(hosts);

        String pcpXML = getClass().getClassLoader().getResource("pcp-config.xml").getFile();
        config.setPcapXML(pcpXML);

        rncs = new HashMap<String, Integer>();
        rncs.put("RNC1", 5301);
        rncs.put("RNC2", 2300);
        sgsns = new ArrayList<String>();
        sgsns.add("SGSN1");
        sgsns.add("SGSN2");
        
        // setup GpehPathHelper
        PrivateFieldAccessor accessor = new PrivateFieldAccessor(new Utils(), "gpehPathHelper");
        Map<String,String> rncId2ossId = new HashMap<String, String>();
        rncId2ossId.put("RNC1", "events_oss_1");
        rncId2ossId.put("RNC2", "events_oss_1");
        
        NEPath gpehPath = new NEPath();
        gpehPath.setRootPath("/eniq/data/eventdata/");
        // should fall back to default
        gpehPath.setPathregexOss("dummy");
        gpehPath.setPathregexCep("dummy");
        
        accessor.setVal(new GpehPathHelper(rncId2ossId, gpehPath));
        
        
        // setup SgehPathHelper
        accessor = new PrivateFieldAccessor(new Utils(), "sgehPathHelper");
        
        NEPath sgehPath = new NEPath();
        sgehPath.setRootPath("/eniq/data/eventdata/");
        // should fall back to default
        sgehPath.setPathregexOss("dummy");
        sgehPath.setPathregexCep("dummy");
        
        accessor.setVal(new SgehPathHelper(sgehPath));
    }
    
    

    @Test
    public void testGetAvailableMemory() {
        long availableMemory = Utils.getAvailableMemory(config);
        long memory = (long) ((250000 + 100000) * 0.85f);
        assertEquals(memory, availableMemory);
    }

    @Test
    public void testGetAvailableCPUs() {
        int availableCPUs = Utils.getAvailableCPUs(config);
        assertEquals(48, availableCPUs);
    }

    @Test
    public void testGetUPList() {
        List<UserPlane> ups = Utils.getUPList(config);
        assertEquals(2, ups.size());
        assertEquals("10.45.192.183", ups.get(0).getIp());
        assertEquals("admin", ups.get(0).getUserName());
        assertEquals("admin", ups.get(0).getPassword());
        assertEquals("10.45.192.181", ups.get(1).getIp());
        assertEquals("dcuser", ups.get(1).getUserName());
        assertEquals("dcuser", ups.get(1).getPassword());
    }

    @Test
    public void testGetRNCs() {
        List<Rnc> rncList = Utils.getRNCs(config, rncs);
        assertEquals(2, rncList.size());

        assertEquals("RNC1", rncList.get(0).getName());
        assertEquals(5301, rncList.get(0).getCells());
        assertEquals(gpehRootPath + "RNC1", rncList.get(0).getRootPath());

        assertEquals("RNC2", rncList.get(1).getName());
        assertEquals(2300, rncList.get(1).getCells());
        assertEquals(gpehRootPath + "RNC2", rncList.get(1).getRootPath());
    }

    @Test
    public void testGetSGSNs() {
        List<Sgsn> sgsn = Utils.getSGSNs(config, sgsns);
        assertEquals(2, sgsn.size());

        assertEquals("SGSN1", sgsn.get(0).getName());
        assertEquals(sgehRootPath + "SGSN1", sgsn.get(0).getRootPath());
        assertEquals("SGSN2", sgsn.get(1).getName());
        assertEquals(sgehRootPath + "SGSN2", sgsn.get(1).getRootPath());

    }
    
    @Test
    public void testExcludedRncs() throws SecurityException, IllegalArgumentException, NoSuchFieldException, IllegalAccessException{
        PrivateFieldAccessor accessor = new PrivateFieldAccessor(AutoconfigProperties.instance, "props");
        Properties props = new Properties();
        props.put(AutoconfigProperties.EXCLUDED_RNC_LIST, "RNC1,RNC2,RNC3");
        accessor.setVal(props);
        
        List<Rnc> rncList = Utils.getRNCs(config, rncs);
        assertTrue(rncList.isEmpty());
    }
    
    @Test
    public void testIsOneMinRop() throws UnsupportedEncodingException {
        URL url = UtilsTest.class.getClassLoader().getResource("paths/events_oss_1/GpehEvents_CEP/SubNetwork=RNC01/A20130809.0145+0200-0146+0200_SubNetwork=RNC106,MeContext=RNC106_rnc_gpehfile_Mp0.bin.gz");
        String root = url.getPath(); 
        root = URLDecoder.decode(root, "UTF-8");
        root = root.substring(0, root.lastIndexOf(File.separator));
        boolean isOneMinRop = Utils.isOneMinRop(root);
        assertTrue(isOneMinRop);
    }
}
