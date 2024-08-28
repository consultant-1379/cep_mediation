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
import com.ericsson.cepmediation.loading.service.StapleParser;

/**
 * @author epstvxj
 * @since 2012
 *
 */
public class StapleParserTest {

    private SchemaHandler schemaHandler;

    private StapleParser parser;

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
        parser = new StapleParser();
        //        parser = new StapleParserOld();
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
        final File folder = new File("/home/epstvxj/Development/staple/");
        if (folder.exists()) {
            final File[] files = folder.listFiles(new FileFilter() {
                @Override
                public boolean accept(final File file) {
                    return file.isFile()
                            && file.getName().equals("A20120516.0430-0435_staple_tcpta-partial_1337142900_1-302.log");
                }
            });
            Arrays.sort(files);
            return Arrays.asList(files);
        }
        return null;
    }

    public static void main(final String[] args) throws Exception {
        final StapleParserTest test = new StapleParserTest();
        test.setUp();
    }

}
