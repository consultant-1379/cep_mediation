package com.ericsson.cepmediation.loading.gpeh;

import static org.mockito.Mockito.mock;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicLong;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.base.meta.admin.SchemaHandler;
import com.ericsson.cepmediation.base.meta.admin.SchemaTypeHandler;
import com.ericsson.cepmediation.base.publishing.Publisher;
import com.ericsson.cepmediation.loading.events.EventRecordHandler;
import com.ericsson.cepmediation.loading.exception.ParsingFailedException;
import com.ericsson.cepmediation.loading.filerecords.LoadingMetrics;
import com.ericsson.cepmediation.loading.filerecords.RecordDescriptor;
import com.ericsson.cepmediation.loading.gpeh.LoadGPEH;
import com.ericsson.cepmediation.loading.service.InputType;
import com.ericsson.cepmediation.loading.service.Parser;
import com.ericsson.cepmediation.loading.service.ParserFactory;
import com.ericsson.cepmediation.loading.service.ParserService;

public class LoadGPEHTest extends Parser implements ParserService {

    private static final String TARGET = "target";

    String INPUT_FILE, classLocation, fileLocation;

    public static int mockEventRecordHandlerCounter = 0;
    final SchemaTypeHandler mockSchemaTypeHandler = null;
    final Collection<File> mockFileList = null;
    final Publisher[] mockPublishers = null;
    public final String GPEH_SCHEMA_TYPE = "gpeh";

    public LoadGPEHTest() {
        super();
    }

    SchemaHandler handler = null;

    @Before
    public void setUp() {

        Publisher pub1 = mock(Publisher.class);
        Publisher pub2 = mock(Publisher.class);
        Publisher[] publishers = { pub1, pub2 };

        try {
            handler = new SchemaHandler();
            super.initialize(handler, GPEH_SCHEMA_TYPE, publishers);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    Collection<File> fileLists = new ArrayList<File>();
    final ParserService parser = ParserFactory.create(InputType.GPEH);

    @Test
    public void testGPEH() {
        try {
            for (int fileCount = 0; fileCount < 2; fileCount++) {
                INPUT_FILE = "src/test/resources/gpeh-data/A20150730.0030+0200-0045+0200_SubNetwork=RNC307,MeContext=RNC307_rnc_gpehfile_Mp"
                        + fileCount + ".bin.gz";
                classLocation = LoadGPEHTest.class.getProtectionDomain()
                        .getCodeSource().getLocation().getPath();
                fileLocation = classLocation.substring(0,
                        classLocation.indexOf(TARGET))
                        + INPUT_FILE;
                fileLists.add(new File(fileLocation));

            }
            final LoadingMetrics loadingMetrics = new MockLoadGPEH().load(
                    schemaTypeHandler, fileLists, publishers);
            assertThat(loadingMetrics.getEnabledEventsCounter().get(457),
                    is((long) 2124));
            assertThat(loadingMetrics.getEnabledEventsCounter().get(456),
                    is((long) 26));
            assertThat(loadingMetrics.getEnabledEventsCounter().get(438),
                    is((long) 0));

        } catch (final Exception e) {
            e.printStackTrace();

        }
    }

    @Override
    public void initialize(SchemaHandler schemaHandler, Publisher[] publishers)
            throws ParsingFailedException {
        // TODO Auto-generated method stub

    }

    @Override
    public LoadingMetrics execute(Collection<File> fileList)
            throws ParsingFailedException {
        // TODO Auto-generated method stub
        return null;
    }

    public class MockLoadGPEH extends LoadGPEH {

        private final boolean IS_SHORT_HEADER = true;

        private final AtomicLong numberOfEventsParsed = new AtomicLong(0);

        final RecordDescriptor gpehRecordDescriptor = new RecordDescriptor(
                IS_SHORT_HEADER);

        public LoadingMetrics load(final SchemaTypeHandler schemaTypeHandler,
                final Collection<File> fileList, final Publisher[] publishers) {

            final GPEHHeaderRecordHandler gpehHeaderRecordHandler = new GPEHHeaderRecordHandler(
                    schemaTypeHandler);

            final EventRecordHandler gpehEventRecordHandler = new EventRecordHandler(
                    gpehHeaderRecordHandler, publishers, new HashSet<Integer>(
                            Arrays.asList(438, 456, 457)));

            gpehEventRecordHandler
                    .setEventCounterForStats(numberOfEventsParsed);

            gpehRecordDescriptor.addRecordHandler(gpehHeaderRecordHandler);
            gpehRecordDescriptor
                    .addRecordHandler(new GPEHRecordingRecordHandler());
            gpehRecordDescriptor
                    .addRecordHandler(new GPEHProtocolRecordHandler());
            gpehRecordDescriptor.addRecordHandler(gpehEventRecordHandler);
            gpehRecordDescriptor.addRecordHandler(new GPEHErrorRecordHandler());
            gpehRecordDescriptor.addRecordHandler(new GPEHLinkRecordHandler());
            gpehRecordDescriptor
                    .addRecordHandler(new GPEHFooterRecordHandler());

            return super.load(gpehRecordDescriptor,
                    schemaTypeHandler.getName(), fileList, publishers);
        }
    }
}
