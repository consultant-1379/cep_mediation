package com.ericsson.cepmediation.correlation.sgeh;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Ignore;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.ebm.SERVICE_REQUEST;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.meta.admin.MappedEvent;
import com.ericsson.cepmediation.base.meta.admin.SchemaHandler;
import com.ericsson.cepmediation.base.publishing.Publisher;
import com.ericsson.cepmediation.loading.service.EBMParser;

@Ignore("test uses input files that are missing")
public final class SgehParserTest extends TestCase {

    @Test
    public void test() throws Exception {

        final CountingPublisher publisher = new CountingPublisher();

        final SchemaHandler schemaHandler = new SchemaHandler();
        final EBMParser parser = new EBMParser();
        parser.initialize(schemaHandler, new Publisher[] { publisher });
        parser.execute(getFiles());

    }

    protected String getDirectoryName() {
        return "/home/michail/ebs/";
    }

    private List<File> getFiles() {
        final File directory = new File(getDirectoryName());
        final File[] files = directory.listFiles(new FileFilter() {
            @Override
            public boolean accept(final File file) {
                return true;
            }
        });
        Arrays.sort(files);
        return Arrays.asList(files);
    }

    private final class CountingPublisher implements Publisher {

        @Override
        public void publishMessage(final ApEventBean event) {
            if (event instanceof SERVICE_REQUEST) {
                final SERVICE_REQUEST e = (SERVICE_REQUEST) event;
                if (e.getMSID_IMEISV().indexOf("44010981227100") > -1) {
                    System.out.println(e.getCSVString());
                }

            }
        }

        @Override
        public void addEvents(final String schemaType, final Collection<MappedEvent> events) {
        }

        @Override
        public void removeEvents(final String schemaType, final Collection<MappedEvent> events) {
        }

        @Override
        public void flush() {
        }

        @Override
        public void close() {
        }

		@Override
		public void setCurrentFileName(String name) {
			// TODO Auto-generated method stub
			
		}
    }
}
