package com.ericsson.cepmediation.autoconfig.util;

import static org.junit.Assert.assertThat;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.Matchers.*;

import com.ericsson.cepmediation.autoconfig.properties.AutoconfigProperties.NEPath;

public class GpehPathHelperTest {
    GpehPathHelper instance;

    String rootPath;

    @Before
    public void setUp() {
        Map<String, String> rncId2ossId = new HashMap<String, String>();
        rncId2ossId.put("RNC09", "events_oss_3");
        rncId2ossId.put("RNC08", "events_oss_2");
        rncId2ossId.put("RNC07", "events_oss_1");

        URL paths = GpehPathHelperTest.class.getClassLoader().getResource("paths/dummy.txt");
        rootPath = paths.getPath().replace("dummy.txt", "");
        NEPath path = new NEPath();
        path.setRootPath(rootPath);
        path.setPathregexCep("gpeh.*_cep");

        instance = new GpehPathHelper(rncId2ossId, path);
    }

    @Test
    public void shouldGeneratePathByRncId() {
        String path = instance.getNEPath("RNC07");
        path = path.substring(rootPath.length());
        assertThat(path, is("events_oss_1/GpehEvents_CEP/SubNetwork=RNC07"));
    }

    @Test
    public void shouldReturnDefaultPathIfOssidNotFoundOnFileSystem(){
        String path = instance.getNEPath("RNC09");
        path = path.substring(rootPath.length());
        assertThat(path, is("events_oss_3/GpehEvents_CEP/SubNetwork=RNC09"));
    }
    
    @Test
    public void shouldGenerateDefaultPathIfSubnetworkDirNotPresent() {
        String path = instance.getNEPath("RNC08");
        path = path.substring(rootPath.length());
        assertThat(path, is("events_oss_2/GpehEvents_CEP/SubNetwork=RNC08"));
    }

    @Test
    public void shouldReturnNullIfRncNotInTopology() {
        String path = instance.getNEPath("RNC10");
        assertThat(path, org.hamcrest.Matchers.nullValue());
    }
    
}
