package com.ericsson.cepmediation.decodingtool.parser;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

import com.ericsson.cepmediation.base.meta.admin.SchemaHandler;
import com.ericsson.cepmediation.base.meta.schema.SchemaException;
import com.ericsson.cepmediation.base.publishing.Publisher;
import com.ericsson.cepmediation.loading.exception.ParsingFailedException;
import com.ericsson.cepmediation.loading.service.GPEHParser;

public class RopParser {
    private final SchemaHandler schemaHandler;

    private final GPEHParser parser;

    private final String directoryPath;

    public RopParser(final String directoryPath, final Publisher p) throws SchemaException, ParsingFailedException {
        schemaHandler = new SchemaHandler();
        parser = new GPEHParser();
        this.directoryPath = directoryPath;
        parser.initialize(schemaHandler, new Publisher[] { p });
    }

    public final void parseFiles() {
        try {
            final File[] files = new File(directoryPath).listFiles(new FileFilter() {
                @Override
                public boolean accept(final File file) {
                    return file.isFile() && file.getName().startsWith("A");
                }
            });
            if (files == null || files.length == 0) {
                throw new RuntimeException("No files found in " + directoryPath + " starting with A");
            }
            Arrays.sort(files);

            HeaderPrinter headerPrinter = new HeaderPrinter(GPEHParser.GPEH_SCHEMA_TYPE);
            headerPrinter.print(files[0]);
            
            parser.execute(Arrays.asList(files));
        } catch (final ParsingFailedException e) {
            throw new RuntimeException(e);
        }
    }
}
