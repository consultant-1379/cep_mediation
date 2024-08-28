/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2015
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.cepmediation.loading.captool;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;
import org.junit.Before;
import org.junit.Test;
import com.ericsson.cepmediation.base.meta.admin.SchemaHandler;
import com.ericsson.cepmediation.base.publishing.Publisher;
import com.ericsson.cepmediation.loading.exception.ParsingFailedException;
import com.ericsson.cepmediation.loading.filerecords.LoadingMetrics;
import com.ericsson.cepmediation.loading.service.Parser;
import com.ericsson.cepmediation.loading.service.ParserService;

public class CaptoolTest extends Parser implements ParserService {

    public CaptoolTest() {
        super();

    }

    public final String CAPTOOL_SCHEMA_TYPE = "bearer_plane";

    public String captoolParserMetrics = "";
    String INPUT_FILE = "src/test/resources/captool-data/103_542_26500-A20150127.1706-1707_summary_1421860020_000.log-1.gz";
    String classLocation = CaptoolTest.class.getProtectionDomain().getCodeSource().getLocation().getPath();
    String fileLocation = classLocation.substring(0,classLocation.indexOf("target")) + INPUT_FILE;
    SchemaHandler handler = null;
    String expectedEventCnt = "51";
    int eventIndex = 2;

    @Before
    public void setUp() {
        Publisher pub1 = mock(Publisher.class);
        Publisher pub2 = mock(Publisher.class);
        Publisher[] publishers = { pub1, pub2 };
        try {
            handler = new SchemaHandler();
            super.initialize(handler, CAPTOOL_SCHEMA_TYPE, publishers);
        } catch (Exception e) {

        }
    }

    @Test
    public void testCaptool() {
        try {

            Collection<File> fileLists = new ArrayList<File>();
            fileLists.add(new File(fileLocation));
            final LoadingMetrics loadingMetrics = new MockLoadCaptool().load(schemaTypeHandler, fileLists, publishers);
            captoolParserMetrics = loadingMetrics.toString();
            String resultData[] = captoolParserMetrics.toString().split(",");
            String event = resultData[eventIndex].substring(resultData[eventIndex].indexOf("=") + 1);
            assertTrue(event.endsWith(expectedEventCnt));

        } catch (final Exception e) {

        }
    }

    @Override
    public void initialize(final SchemaHandler schemaHandler,
            final Publisher[] publishers) {
    }

    @Override
    public LoadingMetrics execute(final Collection<File> fileList)
            throws ParsingFailedException {
        return null;
    }

    public class MockLoadCaptool extends LoadCaptool {
        @Override
        public Set<Integer> getEnabledEvents() {
            Set<Integer> enabledEvents = new TreeSet<Integer>();
            enabledEvents.add(18010);
            return enabledEvents;
        }
    }
}
