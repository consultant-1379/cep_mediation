package com.ericsson.cepmediation.correlation.enrichment.listeners;

import java.util.concurrent.atomic.AtomicLong;

import com.ericsson.cepmediation.apeventbeans.bearer_plane.CLASSIFICATION_REPORT;
import com.ericsson.cepmediation.apeventbeans.bearer_plane.FLASH_VIDEO_REPORT;
import com.ericsson.cepmediation.apeventbeans.bearer_plane.TCP_REPORT;
import com.ericsson.cepmediation.apeventbeans.bearer_plane.TCP_REPORT_PARTIAL;
import com.ericsson.cepmediation.apeventbeans.correlation.CLASSIFICATION_REPORT_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.correlation.TCP_REPORT_ENRICHED;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.cepmediation.base.statistics.Statistics;
import com.ericsson.cepmediation.base.statistics.StatisticsAware;
import com.ericsson.cepmediation.base.statistics.StatisticsCollector;
import com.ericsson.cepmediation.correlation.enrichment.listeners.up.SimpleUserPlaneTransformer;
import com.espertech.esper.client.EventBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class WcdmaUserPlaneCorrelationEsperListener3 extends GenericEsperListener implements StatisticsAware {

    private static final Logger logger = LoggerFactory.getLogger(WcdmaUserPlaneCorrelationEsperListener3.class);

    private final boolean DROP_TCP_PARTIALS = CepMediationProperties
            .getBooleanProperty(CepMediationProperty.UP_DROP_TCP_PARTIALS);

    private final boolean FORWARD_UNMATCHED = CepMediationProperties
            .getBooleanProperty(CepMediationProperty.TEST_FORWARD_UP_UNMATCHED);

    private static final int REPORT_BACKOFF = 20 * 1000;

    private long lastReportTime;

    private final SimpleUserPlaneTransformer transformer = new SimpleUserPlaneTransformer();

    private final Stats stats = new Stats();

    private AtomicLong numberOfEnrichedUserPlaneEvents = null;
    private AtomicLong numberOfClassificationEvents = null;

    public WcdmaUserPlaneCorrelationEsperListener3() {
        StatisticsCollector.registerMe(this);
        numberOfEnrichedUserPlaneEvents = new AtomicLong(0l);
        numberOfClassificationEvents = new AtomicLong(0l);
        logger.info("Starting WcdmaUserPlaneCorrelationEsperListener3[DropTcpPartials:" + DROP_TCP_PARTIALS
                + ",ForwardUnenriched:" + FORWARD_UNMATCHED + "]");
    }

    @Override
    public void exportTo(final Statistics statistics) {
        statistics.add(Statistics.Keys.NUMBER_OF_ENRICHED_USER_PLANE_EVENTS, numberOfEnrichedUserPlaneEvents.getAndSet(0l));
        statistics.add(Statistics.Keys.NUMBER_OF_ENRICHED_CLASSIFICATION_EVENTS, numberOfClassificationEvents.getAndSet(0l));
    }

    @Override
    public void update(final EventBean[] newEvents, final EventBean[] oldEvents) {
        if (newEvents != null && newEvents.length > 0) {
            for (final EventBean bean : newEvents) {
                final Object underlying = bean.getUnderlying();
                if (underlying == null || !(underlying instanceof ApEventBean)) {
                    continue;
                }
                final ApEventBean event = (ApEventBean) underlying;
                handleEvent(event);
            }
        }
    }

    private void handleEvent(final ApEventBean event) {

        numberOfEnrichedUserPlaneEvents.incrementAndGet();
        
        if (event instanceof TCP_REPORT_ENRICHED){

            final TCP_REPORT_ENRICHED tcpReportEnriched = transformer.transform((TCP_REPORT_ENRICHED)event);
            
            if (tcpReportEnriched.getIMSI() < 1){
                ++stats.unenrCntTcp;
                if ( FORWARD_UNMATCHED){
                    publish(tcpReportEnriched);
                }
            }
            else{
                publish(tcpReportEnriched);
                ++stats.enrCntTcp;
            }
            
        }
        else if (event instanceof CLASSIFICATION_REPORT) {
            numberOfClassificationEvents.incrementAndGet();
            ++stats.recCntClass;
            final CLASSIFICATION_REPORT_ENRICHED classReport = transformer.transform((CLASSIFICATION_REPORT) event);
            if (classReport.getIMSI() < 1) {
                ++stats.unenrCntClass;
                if (FORWARD_UNMATCHED) {
                    publish(classReport);
                }
            } else {
                publish(classReport);
                ++stats.enrCntClass;
            }
        }

        //won't or shouldn't get these eventbeans any more, as these full reports are not processed
        else if (event instanceof TCP_REPORT) {
            ++stats.recCntTcp;
            final TCP_REPORT_ENRICHED tcpReport = transformer.transform((TCP_REPORT) event);
            if (tcpReport.getIMSI() < 1) { // IMSI check here
                ++stats.unenrCntTcp;
                if (FORWARD_UNMATCHED) {
                    publish(tcpReport);
                }
            } else {
                publish(tcpReport);
                ++stats.enrCntTcp;
            }
        } 
        else if ( event instanceof FLASH_VIDEO_REPORT){

            ++stats.recCntTcp;
            final TCP_REPORT_ENRICHED tcpReport = transformer.transform((FLASH_VIDEO_REPORT) event);
            if (tcpReport.getIMSI() < 1) { // IMSI check here
                ++stats.unenrCntTcp;
                if (FORWARD_UNMATCHED) {
                    publish(tcpReport);
                }
            } else {
                publish(tcpReport);
                ++stats.enrCntTcp;
            }

        }
        
        else if (event instanceof TCP_REPORT_PARTIAL && !DROP_TCP_PARTIALS) {
            ++stats.recCntTcp;
            final TCP_REPORT_ENRICHED tcpReport = transformer.transform((TCP_REPORT_PARTIAL) event);
            if (tcpReport.getIMSI() < 1) { // IMSI check here
                ++stats.unenrCntTcp;
                if (FORWARD_UNMATCHED) {
                    publish(tcpReport);
                }
            } else {
                publish(tcpReport);
                ++stats.enrCntTcp;
            }
        } else {
            logger.warn("Illegal event type received " + event.getClass().getName());
        }
        if ((System.currentTimeMillis() - lastReportTime) > REPORT_BACKOFF) {
            logger.info(stats.toString());
            stats.reset();
            lastReportTime = System.currentTimeMillis();
        }
    }

    private final class Stats {

        private int recCntClass;

        private int recCntTcp;

        private int enrCntClass;

        private int enrCntTcp;

        private int unenrCntClass;

        private int unenrCntTcp;

        public void reset() {
            recCntClass = 0;
            recCntTcp = 0;
            enrCntTcp = 0;
            enrCntClass = 0;

            unenrCntClass = 0;
            unenrCntTcp = 0;
        }

        @Override
        public String toString() {
            final StringBuilder builder = new StringBuilder();
            builder.append("Stats [recCntClass=");
            builder.append(recCntClass);
            builder.append(", recCntTcp=");
            builder.append(recCntTcp);
            builder.append(", enrCntClass=");
            builder.append(enrCntClass);
            builder.append(", enrCntTcp=");
            builder.append(enrCntTcp);
            builder.append(", unenrCntClass=");
            builder.append(unenrCntClass);
            builder.append(", unenrCntTcp=");
            builder.append(unenrCntTcp);
            builder.append("]");
            return builder.toString();
        }
    }

}
