package com.ericsson.cepmediation.correlation.gpeh;

import java.io.File;
import java.io.FileFilter;

import org.junit.Ignore;
import org.junit.Test;

import com.ericsson.cepmediation.base.proc.config.Ne;
import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;
import com.ericsson.cepmediation.base.properties.ConfigBinder;
import com.ericsson.cepmediation.base.publishing.Publisher;
import com.ericsson.cepmediation.base.publishing.impl.AutoFlushingPublisher;
import com.ericsson.cepmediation.base.service.ServiceExecuter;
import com.ericsson.cepmediation.base.util.ConfigData;
import com.ericsson.cepmediation.config.bean.NetworkElement;
import com.ericsson.cepmediation.correlation.service.CorrelationExecuter;
import com.ericsson.cepmediation.forwarding.ForwarderListenerExecuter;

@Ignore("test uses input files that are missing")
public final class SessionCorrelationTest extends AbstractGpehParserTestCase {

    protected Publisher publisher;

    @Override
    protected void setUp() throws Exception {
        publisher = new AutoFlushingPublisher(8000000, ConfigBinder.getInstance().getAllEventListeners());

        final ServiceExecuter executor = CorrelationExecuter.create();
        final ServiceConfigBean data = ConfigBinder.getInstance().getAllLocalProcesses().get(0).getServices().get(3);
        executor.init(ConfigData.create(new Ne(new NetworkElement())), data);
        executor.execute();

        final ServiceConfigBean forwarder = ConfigBinder.getInstance().getAllLocalProcesses().get(0).getServices().get(4);
        final ForwarderListenerExecuter forwarderExec = ForwarderListenerExecuter.create();
        forwarderExec.init(ConfigData.create(new Ne(new NetworkElement())), forwarder);
        forwarderExec.execute();

        super.setUp();
    }

    @Test
    public void testCorrelation() throws Exception {
        super.parseFiles();
        Thread.sleep(Long.MAX_VALUE);
    }

    @Override
    protected Publisher getPublisher() {
        return publisher;
    }

    @Override
    protected FileFilter getFileFilter() {
        return new FileFilter() {
            @Override
            public boolean accept(final File file) {
                return file.isFile();//file.getName().indexOf("Mp0") > -1 || file.getName().indexOf("Mp1") > -1;
            }
        };
    }

    @Override
    protected String getDirectoryName() {
        return "/home/emicned/data-archive/gpeh/SubNetwork=RNC10/";
    }

}
