/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.radio;

import java.io.File;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Ignore;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.proc.config.Ne;
import com.ericsson.cepmediation.base.publishing.Publisher;
import com.ericsson.cepmediation.base.util.ConfigData;
import com.ericsson.cepmediation.base.util.ResourceLoadingUtilities;
import com.ericsson.cepmediation.correlation.util.DirectoryLister;
import com.ericsson.cepmediation.correlation.util.SimplePublisher;
import com.ericsson.cepmediation.loading.exception.ParsingFailedException;
import com.ericsson.cepmediation.loading.service.InputType;
import com.ericsson.cepmediation.loading.service.ParserFactory;
import com.ericsson.cepmediation.loading.service.ParserService;

/**
 * @author EEMECOY
 *
 */
@Ignore("Not enough RAM on jenkins in IT Hub to ruon this test")
public class RadioCorrelationOneRopTest {

    public void testParsingAndCorrelatingFiles() throws ParsingFailedException {
        createData();
    }

    private void createData() throws ParsingFailedException {
        final ParserService parser = ParserFactory.create(InputType.GPEH);
        final ConfigData configData = ConfigData.create(new Ne());
        long start = 0l;
        long bufferingCompleted = 0l;
        long sortedBegin = 0l;
        long sortedEnd = 0l;

        final SimplePublisher publisher = new SimplePublisher();
        parser.initialize(configData.getSchemaHandler(), new Publisher[] { publisher });
        start = System.currentTimeMillis();
        System.out.println("Starting file parsing");
        final String directoryPath = getDirectoryForInputFiles();
        final Collection<File> files = DirectoryLister.getFiles(directoryPath);
        parser.execute(files);
        System.out.println("done parsing files");
        final List<ApEventBean> events = publisher.getEvents();
        bufferingCompleted = (System.currentTimeMillis() - start);

        sortedBegin = System.currentTimeMillis();
        Collections.sort(events);
        sortedEnd = System.currentTimeMillis() - sortedBegin;

        System.out.println("GPEH Files are parsed and buffered in " + bufferingCompleted + " ms. and sorted in "
                + sortedEnd + " for Number of events ---> " + events.size());
    }

    private String getDirectoryForInputFiles() {
        final String directParent = "smartone_data";
        final URL urlForOneOfTheFiles = ResourceLoadingUtilities.getURLForResourceOnClassPath("input_files/"
                + directParent + "/A20120517.0415-0430_SubNetwork=RNC09,MeContext=RNC09_rnc_gpehfile_Mp0.bin.gz");
        final String pathToFile = urlForOneOfTheFiles.getPath();
        final int endIndex = pathToFile.lastIndexOf(directParent) + directParent.length();
        final String parentFolder = pathToFile.substring(0, endIndex);
        return parentFolder;
    }
}
