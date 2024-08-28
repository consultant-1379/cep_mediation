/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.staple;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.meta.admin.MappedEvent;
import com.ericsson.cepmediation.base.meta.admin.SchemaHandler;
import com.ericsson.cepmediation.base.publishing.Publisher;
import com.ericsson.cepmediation.loading.filerecords.LoadingMetrics;
import com.ericsson.cepmediation.loading.service.CaptoolParser;

/**
 * @author epstvxj
 * @since 2012
 *
 */
public class CaptoolParserTest {

    private SchemaHandler schemaHandler;

    private CaptoolParser parser;

    private final Publisher publisher = new Publisher() {

        @Override
        public void removeEvents(final String schemaType, final Collection<MappedEvent> events) {
        }

        @Override
        public void publishMessage(final ApEventBean event) {
            System.out.println(event.getCSVString());
        }

        @Override
        public void flush() {
        }

        @Override
        public void close() {
        }

        @Override
        public void addEvents(final String schemaType, final Collection<MappedEvent> events) {
        }
    	public String getCurrentFileName() {
    		return null;
    	}

    	public void setCurrentFileName(String currentFileName) {
    	}
    };

    public void setUp() throws Exception {
        parser = new CaptoolParser();
        schemaHandler = new SchemaHandler();
        parser.initialize(schemaHandler, new Publisher[] { publisher });
        final List<File> files = getRawData();
        if (null == files) {
            return;
        }
        final LoadingMetrics lm = parser.execute(files);
        System.out.println(lm);

    }

    private List<File> getRawData() {
        final File folder = new File("/home/epstvxj/Development/captool");
        if (folder.exists()) {
            final File[] files = folder.listFiles(new FileFilter() {
                @Override
                public boolean accept(final File file) {
                    return file.isFile();
                }
            });
            Arrays.sort(files);
            return Arrays.asList(files);
        }
        return null;
    }

    public static void main(final String[] args) throws Exception {
        final CaptoolParserTest test = new CaptoolParserTest();
        test.setUp();
    }

}
