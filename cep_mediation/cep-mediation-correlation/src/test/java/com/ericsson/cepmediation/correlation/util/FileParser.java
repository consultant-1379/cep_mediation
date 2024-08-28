/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.util;

import java.io.File;
import java.io.FileFilter;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.proc.config.Ne;
import com.ericsson.cepmediation.base.publishing.Publisher;
import com.ericsson.cepmediation.base.util.ConfigData;
import com.ericsson.cepmediation.correlation.support.Configurator;
import com.ericsson.cepmediation.loading.exception.ParsingFailedException;
import com.ericsson.cepmediation.loading.service.InputType;
import com.ericsson.cepmediation.loading.service.ParserFactory;
import com.ericsson.cepmediation.loading.service.ParserService;

/**
 * @author eemecoy
 *
 */
public class FileParser {

    public List<ApEventBean> parseGPEHRopFiles() throws ParsingFailedException {
        final String directoryPath = Configurator.testInstance().getProperties()
                .getProperty("performance.gpeh.input.folder.path");
        final String ropPattern = getRopPattern("gpeh.rop.pattern");
        return parseRopFiles(directoryPath, ropPattern,InputType.GPEH);

    }
    
    public List<ApEventBean> parseCoreRopFiles() throws ParsingFailedException {
        final String directoryPath = Configurator.testInstance().getProperties()
                .getProperty("performance.core.input.folder.path");
        final String ropPattern = getRopPattern("core.rop.pattern");
        return parseRopFiles(directoryPath, ropPattern,InputType.EBS);

    }
    
    public List<ApEventBean> parseCaptoolFiles() throws ParsingFailedException {
        final String directoryPath = Configurator.testInstance().getProperties()
                .getProperty("performance.captool.input.folder.path");
        final String ropPattern = getRopPattern("captool.rop.pattern");
        return parseRopFiles(directoryPath, ropPattern,InputType.CAPTOOL);
    }
    
    public List<ApEventBean> parseStapleFiles() throws ParsingFailedException {
        final String directoryPath = Configurator.testInstance().getProperties()
                .getProperty("performance.staple.input.folder.path");
        final String ropPattern = getRopPattern("staple.rop.pattern");
        return parseRopFiles(directoryPath, ropPattern, InputType.STAPLE);
    }


    private String getRopPattern(String pattern) {
        final String ropPattern = Configurator.testInstance().getProperties().getProperty(pattern);
        if (ropPattern == null) {
            return "";
        }

        return ropPattern;
    }

    private FileFilter getFileFilter(final String fileFilter) {
        return new FileFilter() {
            Pattern filePattern = Pattern.compile(".*" + fileFilter + ".*");

            @Override
            public boolean accept(final File file) {
                final String name = file.getName();
                return file.isFile() && (filePattern.matcher(name).matches());
            }

        };
    }
    
    private List<ApEventBean> parseRopFiles(String directoryPath, String ropPattern, InputType inputType) throws ParsingFailedException {
        final ParserService parser = ParserFactory.create(inputType);
        Ne ne = new Ne();
        ne.setDirectory(directoryPath);
        final ConfigData configData = ConfigData.create(ne);
        final SimplePublisher publisher = new SimplePublisher();
        long start = 0l;
        long bufferingCompleted = 0l;
        long sortedBegin = 0l;
        long sortedEnd = 0l;
        parser.initialize(configData.getSchemaHandler(), new Publisher[] { publisher });
        start = System.currentTimeMillis();
        System.out.println("Starting file parsing for " + inputType + ", parsing files in " + directoryPath + " with pattern " + ropPattern);
        final List<File> files = DirectoryLister.getFiles(directoryPath, getFileFilter(ropPattern));
        parser.execute(files);
        System.out.println("done parsing files");
        final List<ApEventBean> parsedRowEvents = publisher.getEvents();
        bufferingCompleted = (System.currentTimeMillis() - start);
        
        sortedBegin = System.currentTimeMillis();
        Collections.sort(parsedRowEvents);
        sortedEnd = System.currentTimeMillis() - sortedBegin;
        
        final String eventReport = inputType + " Files are parsed and buffered in " + bufferingCompleted
                + " ms. and sorted in " + sortedEnd + " for Number of events ---> " + parsedRowEvents.size();
        System.out.println(eventReport);
        return parsedRowEvents;
    }

  
    public List<ApEventBean> parseGPEHRopFiles(final String directoryPath, final String ropPattern)
            throws ParsingFailedException {
        return parseRopFiles(directoryPath, ropPattern,InputType.GPEH);
    }

}
