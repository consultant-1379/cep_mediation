package com.ericsson.cepmediation.correlation.gpeh.esper;

import junit.framework.TestCase;

import com.ericsson.cepmediation.test.util.FileUtilsForTest;
import com.espertech.esper.client.Configuration;
import com.espertech.esper.client.EPAdministrator;
import com.espertech.esper.client.EPRuntime;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;

public abstract class BaseEsperTestCase extends TestCase {

    protected static final String DEFAULT_ESPER_CONF_FILE = "conf/test-esper-conf.xml";

    protected EPServiceProvider provider;

    protected EPRuntime runtime;

    protected EPAdministrator admin;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        final Configuration conf = new Configuration();
        conf.addEventType("ApEventBean", "com.ericsson.cepmediation.base.apeventbeans.ApEventBean");
        conf.addImport("java.util.ArrayList");
        conf.configure(getConfFileName());
        provider = EPServiceProviderManager.getProvider("http://www.ericsson.com/cep-mediation/correlation", conf);
        provider.initialize();
        runtime = provider.getEPRuntime();
        admin = provider.getEPAdministrator();
        final String moduleText = FileUtilsForTest.readFileFromClasspath(getModuleFileName());
        admin.getDeploymentAdmin().parseDeploy(moduleText);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    protected abstract String getConfFileName();

    protected abstract String getModuleFileName();
}
