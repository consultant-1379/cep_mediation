package com.ericsson.cepmediation.correlation.radio.performance;

import java.util.Collections;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.correlation.radio.RadioCorrelationBase;
import com.ericsson.cepmediation.correlation.radio.utils.Statements;
import com.ericsson.cepmediation.correlation.util.FileParser;
import com.ericsson.cepmediation.test.util.GitPath;

public abstract class BasePerformanceTest extends RadioCorrelationBase {
    //    Tests are run on a machine with 16 processors: Intel(R) Xeon(R) CPU X5570 @ 2.93GHz.
    //    with following jvm options: -Xms6G -Xmx16G -verbose:gc.

    //    performance/epl/rc_orig_refactor_imsi_update.epl
    //    Run 0 Loading performance: 94 duration: 43414
    //    Run: 0 Correlation duration: 117509 Performance: 63 sessions: 72517
    //    Run 1 Loading performance: 97 duration: 42079
    //    Run: 1 Correlation duration: 125743 Performance: 59 sessions: 72517
    //    Run 2 Loading performance: 100 duration: 40700
    //    Run: 2 Correlation duration: 115928 Performance: 64 sessions: 72517
    //    Run 3 Loading performance: 99 duration: 41099
    //    Run: 3 Correlation duration: 116093 Performance: 64 sessions: 72517
    //    Run 4 Loading performance: 100 duration: 40824
    //    Run: 4 Correlation duration: 140755 Performance: 53 sessions: 72517
    //    Run 5 Loading performance: 100 duration: 40776
    //    Run: 5 Correlation duration: 116153 Performance: 64 sessions: 72517
    //    Run 6 Loading performance: 101 duration: 40346
    //    Run: 6 Correlation duration: 117027 Performance: 63 sessions: 72517
    //    Run 7 Loading performance: 101 duration: 40498
    //    Run: 7 Correlation duration: 114686 Performance: 65 sessions: 72517
    //    Run 8 Loading performance: 101 duration: 40485
    //    Run: 8 Correlation duration: 143566 Performance: 52 sessions: 72517
    //    ### Runs: 9 Average performance: 60

    //    performance/epl/rc_orig_no_meas.epl
    //    Run 0 Loading performance: 102 duration: 40163
    //    Run: 0 Correlation duration: 74663 Performance: 55 sessions: 72517
    //    Run 1 Loading performance: 106 duration: 38521
    //    Run: 1 Correlation duration: 98965 Performance: 41 sessions: 72517
    //    Run 2 Loading performance: 100 duration: 40756
    //    Run: 2 Correlation duration: 74812 Performance: 54 sessions: 72517
    //    Run 3 Loading performance: 107 duration: 38181
    //    Run: 3 Correlation duration: 97282 Performance: 42 sessions: 72517
    //    Run 4 Loading performance: 101 duration: 40554
    //    Run: 4 Correlation duration: 74454 Performance: 55 sessions: 72517
    //    Run 5 Loading performance: 105 duration: 38865
    //    Run: 5 Correlation duration: 97800 Performance: 41 sessions: 72517
    //    Run 6 Loading performance: 100 duration: 40674
    //    Run: 6 Correlation duration: 98199 Performance: 41 sessions: 72517
    //    Run 7 Loading performance: 101 duration: 40435
    //    Run: 7 Correlation duration: 74633 Performance: 55 sessions: 72517
    //    Run 8 Loading performance: 101 duration: 40656
    //    Run: 8 Correlation duration: 97937 Performance: 41 sessions: 72517
    //    ### Runs: 9 Average performance: 46

    //    performance/epl/rc_orig_separate_bcgc.epl
    //    Run 0 Loading performance: 100 duration: 41055
    //    Run: 0 Correlation duration: 128238 Performance: 58 sessions: 72517
    //    Run 1 Loading performance: 100 duration: 41006
    //    Run: 1 Correlation duration: 129513 Performance: 57 sessions: 72517
    //    Run 2 Loading performance: 100 duration: 41043
    //    Run: 2 Correlation duration: 130450 Performance: 57 sessions: 72517
    //    Run 3 Loading performance: 99 duration: 41183
    //    Run: 3 Correlation duration: 153749 Performance: 48 sessions: 72517
    //    Run 4 Loading performance: 98 duration: 41531
    //    Run: 4 Correlation duration: 131486 Performance: 56 sessions: 72517
    //    Run 5 Loading performance: 99 duration: 41170
    //    Run: 5 Correlation duration: 154235 Performance: 48 sessions: 72517
    //    Run 6 Loading performance: 99 duration: 41480
    //    Run: 6 Correlation duration: 130416 Performance: 57 sessions: 72517
    //    Run 7 Loading performance: 98 duration: 41892
    //    Run: 7 Correlation duration: 131112 Performance: 56 sessions: 72517
    //    Run 8 Loading performance: 96 duration: 42597
    //    Run: 8 Correlation duration: 157168 Performance: 47 sessions: 72517
    //    ### Runs: 9 Average performance: 53

    //    performance/epl/rc_orig.epl
    //    Run 0 Loading performance: 101 duration: 40488
    //    Run: 0 Correlation duration: 121314 Performance: 61 sessions: 72517
    //    Run 1 Loading performance: 99 duration: 41373
    //    Run: 1 Correlation duration: 123342 Performance: 60 sessions: 72517
    //    Run 2 Loading performance: 100 duration: 40963
    //    Run: 2 Correlation duration: 121806 Performance: 61 sessions: 72517
    //    Run 3 Loading performance: 98 duration: 41715
    //    Run: 3 Correlation duration: 123406 Performance: 60 sessions: 72517
    //    Run 4 Loading performance: 98 duration: 41627
    //    Run: 4 Correlation duration: 121152 Performance: 61 sessions: 72517
    //    Run 5 Loading performance: 98 duration: 41643
    //    Run: 5 Correlation duration: 144608 Performance: 51 sessions: 72517
    //    Run 6 Loading performance: 98 duration: 41603
    //    Run: 6 Correlation duration: 120853 Performance: 61 sessions: 72517
    //    Run 7 Loading performance: 99 duration: 41431
    //    Run: 7 Correlation duration: 146789 Performance: 50 sessions: 72517
    //    Run 8 Loading performance: 99 duration: 41465
    //    Run: 8 Correlation duration: 123410 Performance: 60 sessions: 72517
    //    ### Runs: 9 Average performance: 58

    //    performance/epl/rc_orig_no_call_drop.epl
    //    Run 0 Loading performance: 100 duration: 40778
    //    Run: 0 Correlation duration: 129071 Performance: 57 sessions: 72517
    //    Run 1 Loading performance: 99 duration: 41312
    //    Run: 1 Correlation duration: 103709 Performance: 71 sessions: 72517
    //    Run 2 Loading performance: 101 duration: 40488
    //    Run: 2 Correlation duration: 104838 Performance: 71 sessions: 72517
    //    Run 3 Loading performance: 98 duration: 41627
    //    Run: 3 Correlation duration: 105941 Performance: 70 sessions: 72517
    //    Run 4 Loading performance: 101 duration: 40519
    //    Run: 4 Correlation duration: 104142 Performance: 71 sessions: 72517
    //    Run 5 Loading performance: 100 duration: 40987
    //    Run: 5 Correlation duration: 130213 Performance: 57 sessions: 72517
    //    Run 6 Loading performance: 101 duration: 40576
    //    Run: 6 Correlation duration: 127049 Performance: 58 sessions: 72517
    //    Run 7 Loading performance: 100 duration: 40761
    //    Run: 7 Correlation duration: 126426 Performance: 59 sessions: 72517
    //    Run 8 Loading performance: 99 duration: 41357
    //    Run: 8 Correlation duration: 104338 Performance: 71 sessions: 72517
    //    ### Runs: 9 Average performance: 64

    //    performance/epl/rc_orig_no_raw.epl
    //    Run 0 Loading performance: 100 duration: 40898
    //    Run: 0 Correlation duration: 119195 Performance: 62 sessions: 72517
    //    Run 1 Loading performance: 100 duration: 40665
    //    Run: 1 Correlation duration: 119567 Performance: 62 sessions: 72517
    //    Run 2 Loading performance: 100 duration: 40952
    //    Run: 2 Correlation duration: 143918 Performance: 51 sessions: 72517
    //    Run 3 Loading performance: 100 duration: 40787
    //    Run: 3 Correlation duration: 143947 Performance: 51 sessions: 72517
    //    Run 4 Loading performance: 100 duration: 41040
    //    Run: 4 Correlation duration: 142479 Performance: 52 sessions: 72517
    //    Run 5 Loading performance: 96 duration: 42614
    //    Run: 5 Correlation duration: 143092 Performance: 52 sessions: 72517
    //    Run 6 Loading performance: 97 duration: 42175
    //    Run: 6 Correlation duration: 144156 Performance: 51 sessions: 72517
    //    Run 7 Loading performance: 98 duration: 41743
    //    Run: 7 Correlation duration: 119831 Performance: 62 sessions: 72517
    //    Run 8 Loading performance: 97 duration: 41923
    //    Run: 8 Correlation duration: 143384 Performance: 52 sessions: 72517
    //    ### Runs: 9 Average performance: 55

    //    performance/epl/rc_visited_cells.epl
    //    Run 0 Loading performance: 90 duration: 45173
    //    Run: 0 Correlation duration: 242067 Performance: 30 sessions: 72517
    //    Run 1 Loading performance: 76 duration: 53927
    //    Run: 1 Correlation duration: 233886 Performance: 32 sessions: 72517
    //    Run 2 Loading performance: 92 duration: 44606
    //    Run: 2 Correlation duration: 230096 Performance: 32 sessions: 72517
    //    Run 3 Loading performance: 94 duration: 43462
    //    Run: 3 Correlation duration: 231743 Performance: 32 sessions: 72517
    //    ### Runs: 4 Average performance: 31 Average duration: 234448

    //    performance/epl/rc_raw_termination.epl
    //    Run 0 Loading performance: 78 duration: 52589
    //    Run: 0 Correlation duration: 150478 Performance: 49 sessions: 72517
    //    Run 1 Loading performance: 84 duration: 48592
    //    Run: 1 Correlation duration: 146821 Performance: 51 sessions: 72517
    //    Run 2 Loading performance: 101 duration: 40594
    //    Run: 2 Correlation duration: 146873 Performance: 50 sessions: 72517
    //    ### Runs: 3 Average performance: 50 Average duration: 148057

    protected static int cnt = 0;

    private static int totalDuration = 0;

    private static int totalEvents = 0;

    protected static StringBuffer perfData = new StringBuffer();

    protected List<ApEventBean> events;

    @BeforeClass
    public static void beforeClass() {
        cnt = 0;

        totalDuration = 0;

        totalEvents = 0;

        perfData = new StringBuffer();
        runGc();
    }

    @AfterClass
    public static void afterClass() {
        runGc();
    }

    @Before
    public void setup() throws Exception {
        configure(getEplFile(), Statements.SESSION_ENRICHMENT);
    }

    private static void runGc() {
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (final InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    protected void parseEvents() throws Exception {
        final String path = GitPath.getDirectoryPathForRealFilesInGIT();

        final long start = System.currentTimeMillis();
        events = new FileParser().parseGPEHRopFiles(path, ".*1645-1700.*");
        final long duration = System.currentTimeMillis() - start;

        perfData.append("Run " + cnt + " Loading performance: " + (events.size() / duration) + " duration: " + duration + "\n");
        Collections.sort(events);
    }

    protected abstract String getEplFile();

    @Test
    public void test1() throws Exception {
        runTest();
    }

    @Test
    public void test2() throws Exception {
        runTest();
    }

    @Test
    public void test3() throws Exception {
        runTest();
    }

    @Test
    public void test4() throws Exception {
        runTest();
        logAverageStats();
    }

    private void logAverageStats() {
        final String avgPerfData = "### Runs: " + cnt + " Average performance: " + (totalEvents / totalDuration) + " Average duration: "
                + (totalDuration / cnt);

        perfData.append(avgPerfData);

        perfData.insert(0, getEplFile() + "\n");

        System.out.println(perfData);
    }

    private void logStats(final int eventsCnt, final long duration) {
        final String currPerfData = "Run: " + cnt++ + " Correlation duration: " + duration + " Performance: " + (eventsCnt / duration) + " correlated records: "
                + getCorrelatedRecords() + "\n";

        System.out.println(currPerfData);

        perfData.append(currPerfData);
    }

    protected int getCorrelatedRecords() {
        return getSessionsCreated().size();
    }

    private void runTest() throws Exception {
        parseEvents();

        runGc();

        final long start = System.currentTimeMillis();
        final int eventsCnt = correlate();
        final long duration = System.currentTimeMillis() - start;

        totalDuration += duration;
        totalEvents += eventsCnt;

        logStats(eventsCnt, duration);
    }

    // allow overriding
    protected int correlate() {
        final int eventsCnt = correlationEngine.sendEventsAndSessionEndEventsForROP(events);
        return eventsCnt;
    }
}
