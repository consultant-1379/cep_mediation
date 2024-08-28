package com.ericsson.cepmediation.loading.cleanup;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.loading.service.task.collection.CollectionJob;

public class LegacyFileCleanerTest {
    private LegacyFileCleaner instance;

    private Map<String, String> mappings;

    private File dotLast;

    @Before
    public void init() {
        instance = new LegacyFileCleaner();
        mappings = new HashMap<String, String>();
        instance.addMapping(1, "RNC1", 1, 2, mappings);

        URL rnc1 = LegacyFileCleanerTest.class.getClassLoader().getResource("cleanup/RNC1.last");
        dotLast = new File(rnc1.getFile());
    }

    @Test
    public void shouldHaveLegacyLabel() throws IOException {
        assertDotLastIntact();

        assertThat(mappings.size(), is(1));
        assertThat(mappings.keySet().iterator().next(), is("gpeh_1-1-2"));
        assertThat(mappings.values().iterator().next(), is("RNC1"));
    }

    @Test
    public void shouldDeleteLegacyDir() throws IOException {
        assertDotLastIntact();

        // get the root path
        String rootDir = dotLast.getAbsolutePath().replace("RNC1.last", "");

        // create a legacy folder
        File legacyDir = new File(new File(rootDir), "gpeh_1-1-2");
        // delete the dir on JVM exit in case it is not already deleted
        legacyDir.deleteOnExit();
        boolean success = legacyDir.mkdir();
        assertTrue(success);

        File legacyFile = new File(legacyDir, "mp0.gz");
        boolean fileCreateSuccess = legacyFile.createNewFile();
        legacyFile.deleteOnExit();
        assertTrue(fileCreateSuccess);

        // do cleanup
        String fileLabel = legacyDir.getName().replace(CollectionJob.LAST_LIST_EXTENSION, "");
        String newLabel = mappings.get(fileLabel);
        if (newLabel != null) {
            instance.cleanLegacyFile(legacyDir, newLabel);
        }
        
        assertDotLastIntact();
        assertTrue(!legacyDir.exists());
    }

    @Test
    public void shouldSkipRenaming() throws IOException {
        assertDotLastIntact();

        // get the root path
        String rootPath = dotLast.getAbsolutePath().replace("RNC1.last", "");

        // create a legacy file
        File legacyDotLast = new File(new File(rootPath), "gpeh_1-1-2.last");
        // delete the dir on JVM exit in case it is not already deleted
        legacyDotLast.deleteOnExit();
        boolean success = legacyDotLast.createNewFile();
        assertTrue("could not create file: " + legacyDotLast.getAbsolutePath(), success);

        // do cleanup
        String fileLabel = legacyDotLast.getName().replace(CollectionJob.LAST_LIST_EXTENSION, "");
        String newLabel = mappings.get(fileLabel);
        if (newLabel != null) {
            instance.cleanLegacyFile(legacyDotLast, newLabel);
        }

        assertDotLastIntact();
        assertTrue(!legacyDotLast.exists());
    }

    @Test
    public void shouldRenameLegacyFile() throws FileNotFoundException, IOException {
        assertDotLastIntact();

        // get the root path
        String rootPath = dotLast.getAbsolutePath().replace("RNC1.last", "");

        // create a legacy file
        File legacyDotLast = new File(new File(rootPath), "gpeh_1-1-2.last");

        // rename the dotLast to legacyDotLast
        boolean success = dotLast.renameTo(legacyDotLast);
        assertTrue("Could not rename dotLast file: " + dotLast.getAbsolutePath() + " to " + legacyDotLast, success);

        // do cleanup
        String fileLabel = legacyDotLast.getName().replace(CollectionJob.LAST_LIST_EXTENSION, "");
        String newLabel = mappings.get(fileLabel);
        if (newLabel != null) {
            instance.cleanLegacyFile(legacyDotLast, newLabel);
        }

        assertDotLastIntact();
        assertTrue(!legacyDotLast.exists());
    }

    private void assertDotLastIntact() throws FileNotFoundException, IOException {
        assertTrue(dotLast.exists());
        BufferedReader br = new BufferedReader(new FileReader(dotLast));
        String dotLastContent = br.readLine();
        br.close();
        assertThat(dotLastContent, is("rnc1"));

        File rootDir = new File(dotLast.getAbsolutePath().replace(".last", ""));
        assertTrue(rootDir.exists());
    }

}
