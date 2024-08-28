package com.ericsson.cepmediation.evolution.os;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.evolution.common.Host;

public class HostManagerTest {

    HostManager hostManager = HostManager.getInstance();

    @Before
    public void init() {

        String cepIni = getClass().getClassLoader().getResource("cep_mediation.ini").getFile();

        hostManager.setCepIni(cepIni);

    }

    @Test
    public void testGetHosts() {

        List<Host> hosts = hostManager.getHosts();
        
        assertEquals(2, hosts.size());

        assertEquals(new Host("atrcxb2544", "10.44.81.62", false), hosts.get(0));
        assertEquals(new Host("atrcxb2545", "10.44.81.52", false), hosts.get(1));

    }

}
