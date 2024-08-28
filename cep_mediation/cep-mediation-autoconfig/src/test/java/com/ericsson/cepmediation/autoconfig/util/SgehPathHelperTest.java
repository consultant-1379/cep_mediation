package com.ericsson.cepmediation.autoconfig.util;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.net.URL;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.autoconfig.properties.AutoconfigProperties.NEPath;

public class SgehPathHelperTest {
    SgehPathHelper instance;

    String rootPath;

    @Before
    public void setUp() {
        URL paths = SgehPathHelperTest.class.getClassLoader().getResource("paths/dummy.txt");
        rootPath = paths.getPath().replace("dummy.txt", "");
        NEPath path = new NEPath();
        path.setRootPath(rootPath);
        path.setPathregexOss("events_oss_\\d");
        path.setPathregexCep("sgeh.*_cep");

        instance = new SgehPathHelper(path);
    }

    @Test
    public void shouldGeneratePathBySgsnId(){
        String path = instance.getNEPath("SGSN09");
        path = path.substring(rootPath.length());
        assertThat(path, is("events_oss_2/SgehEvents_CEP/ManagedElement=SGSN09"));
    }

    @Test
    public void shouldReturnDefaultPathIfOssidNotFoundOnFileSystem() {
        String path = instance.getNEPath("SGSN07");
        path = path.substring(rootPath.length());
        assertThat(path, is("events_oss_2/SgehEvents_CEP/ManagedElement=SGSN07"));
    }
}
