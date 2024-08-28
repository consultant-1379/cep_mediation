package com.ericsson.cepmediation.autoconfig.command.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.autoconfig.command.HazelcastCommand;
import com.ericsson.cepmediation.autoconfig.model.Config;
import com.ericsson.cepmediation.autoconfig.model.Host;

public class HazelcastCommandTest {

    Config config;

    @Before
    public void init() {
        config = new Config();
        Host host1 = new Host("atrcxb2544", "10.44.81.62", true, 250000, 32);
        Host host2 = new Host("atrcxb2545", "10.44.81.52", true, 100000, 16);
        List<Host> hosts = new ArrayList<Host>();
        hosts.add(host1);
        hosts.add(host2);
        config.setHosts(hosts);

        String hazelcastXML = getClass().getClassLoader().getResource("hazelcast.xml").getFile();
        config.setHazelcastXML(hazelcastXML);
    }

    @Test
    public void testProcess() {
        assertTrue(new HazelcastCommand().process(config));
    }

}
