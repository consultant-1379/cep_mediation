package com.ericsson.cepmediation.loading.asn1;

import java.io.File;
import java.io.FileFilter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.gpeh.RRC_MEASUREMENT_REPORT;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.meta.admin.MappedEvent;
import com.ericsson.cepmediation.base.meta.admin.SchemaHandler;
import com.ericsson.cepmediation.base.publishing.Publisher;
import com.ericsson.cepmediation.loading.filerecords.LoadingMetrics;
import com.ericsson.cepmediation.loading.service.GPEHParser;

@Ignore
public class RrcMeasurementReportDecodeTest {

    long timestamp;

    protected static Asn1Decoder decoder;

    protected static final String TIME_ZONE = "UTC";

    protected static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";

    // This date formatter is required to format dates into UTC
    protected static final DateFormat dateFormat = new SimpleDateFormat(DATE_TIME_FORMAT);

    // Set the time zone for the formatter as UTC?
    static {
        dateFormat.setTimeZone(TimeZone.getTimeZone(TIME_ZONE));
    }

    @Before
    public void setUp() throws Exception {
        decoder = new Asn1Decoder();
        timestamp = dateFormat.parse("2012-03-30 06:17:05.970").getTime();
    }

    @Test
    public void decodeRrcMeasurements() throws Exception {
        final Publisher publisher = new Publisher() {

            @Override
            public void flush() {

            }

            @Override
            public void close() {

            }

            @Override
            public void addEvents(final String schemaType, final Collection<MappedEvent> events) {

            }

            @Override
            public void removeEvents(final String schemaType, final Collection<MappedEvent> events) {

            }

            @Override
            public void publishMessage(final ApEventBean event) {
                if (event instanceof RRC_MEASUREMENT_REPORT) {
                    final RRC_MEASUREMENT_REPORT report = (RRC_MEASUREMENT_REPORT) event;
                    decoder.decodeAsn1(report);
                }
            }
            
        	public String getCurrentFileName() {
        		return null;
        	}

        	public void setCurrentFileName(String currentFileName) {
        	}
        };

        System.out.println("Create parser");
        final GPEHParser parser = new GPEHParser();
        System.out.println("Init parser");
        parser.initialize(new SchemaHandler(), new Publisher[] { publisher });
        System.out.println("Get raw data");
        final List<File> files = getRawData();
        if (null == files)
            return;
        System.out.println("Execute parser");
        final LoadingMetrics lm = parser.execute(files);
        System.out.println(lm);
    }

    private List<File> getRawData() {
        final File folder = new File("/home/epstvxj/Development/Temp/input_data/gpeh");
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
}
