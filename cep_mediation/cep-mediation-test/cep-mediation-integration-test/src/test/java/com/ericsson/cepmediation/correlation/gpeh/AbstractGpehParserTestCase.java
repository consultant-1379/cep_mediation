package com.ericsson.cepmediation.correlation.gpeh;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

import junit.framework.TestCase;

import com.ericsson.cepmediation.base.meta.admin.SchemaHandler;
import com.ericsson.cepmediation.base.meta.admin.SchemaTypeHandler;
import com.ericsson.cepmediation.base.publishing.Publisher;
import com.ericsson.cepmediation.loading.exception.ParsingFailedException;
import com.ericsson.cepmediation.loading.service.GPEHParser;

/**
 * @author evelziv
 */
public abstract class AbstractGpehParserTestCase extends TestCase {

	protected GPEHParser parser;
	protected SchemaHandler schemaHandler;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		schemaHandler = new SchemaHandler();
		parser = new GPEHParser();
		parser.initialize(schemaHandler, new Publisher[] {getPublisher()});
	}

	@Override
	protected void tearDown() throws Exception {
		parser.close();
		super.tearDown();
	}
	
	protected final void parseFiles() {
		try {
			File directory = new File(getDirectoryName());
			File[] files = directory.listFiles(getFileFilter());
			Arrays.sort(files);
			parser.execute(Arrays.asList(files));
		} catch (ParsingFailedException e) {
			throw new RuntimeException(e);
		}
	}
	
	protected String getCorrelationSchemaName() {
		SchemaTypeHandler schemaTypeHandler = schemaHandler.getSchemaMap().get("correlation");
		if(schemaTypeHandler == null) {
			throw new NullPointerException("Schema type handler is null");
		}
		return schemaTypeHandler.getName();
	}
	
	protected abstract Publisher getPublisher();
	
	protected abstract FileFilter getFileFilter();
	
	protected abstract String getDirectoryName();
}
