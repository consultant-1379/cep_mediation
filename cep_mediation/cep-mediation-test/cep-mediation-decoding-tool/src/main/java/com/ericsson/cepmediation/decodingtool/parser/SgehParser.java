package com.ericsson.cepmediation.decodingtool.parser;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

import com.ericsson.cepmediation.base.meta.admin.SchemaHandler;
import com.ericsson.cepmediation.base.meta.schema.SchemaException;
import com.ericsson.cepmediation.base.publishing.Publisher;
import com.ericsson.cepmediation.loading.exception.ParsingFailedException;
import com.ericsson.cepmediation.loading.service.EBMParser;
import com.ericsson.cepmediation.loading.service.GPEHParser;

public class SgehParser {
    private final SchemaHandler schemaHandler;

    private final EBMParser parser;

    private final String directoryPath;

    private File[] files;

    public SgehParser(final String directoryPath, final Publisher p) throws SchemaException, ParsingFailedException {
        schemaHandler = new SchemaHandler();
        parser = new EBMParser();
        this.directoryPath = directoryPath;
        parser.initialize(schemaHandler, new Publisher[] { p });
    }

    public final void parseFiles() {
        try {
            if (new File(directoryPath).isDirectory()) {
                files = new File(directoryPath).listFiles(new FileFilter() {
                    @Override
                    public boolean accept(final File file) {
                        return file.isFile() && file.getName().startsWith("A");
                    }
                });
                if (files == null || files.length == 0) {
                    throw new RuntimeException("No files found in " + directoryPath + " starting with A");
                }
                Arrays.sort(files);
            } else if (new File(directoryPath).isFile()) {
                files = new File[] { new File(directoryPath) };
            }
            
            HeaderPrinter headerPrinter = new HeaderPrinter(EBMParser.EBM_SCHEMA_TYPE);
            headerPrinter.print(files[0]);
            
            parser.execute(Arrays.asList(files));

        } catch (final ParsingFailedException e) {
            throw new RuntimeException(e);
        }
    }
}
