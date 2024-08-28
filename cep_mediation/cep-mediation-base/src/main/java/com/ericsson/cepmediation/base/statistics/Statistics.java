package com.ericsson.cepmediation.base.statistics;

/**
 * TODO stats collection needs to be finished
 * 
 * @author evelziv
 */
public interface Statistics {
    /**
     * 
     *                 
     * @author ecamosm                 
     * */
    public static interface Keys {

        /**
         * 
         * 
         * user plane stats
         * 
         **/
        public static final String NUMBER_OF_ENRICHED_USER_PLANE_EVENTS = "userplane.class.tcp.no.of.enriched.up.events";
        public static final String NUMBER_OF_ENRICHED_CLASSIFICATION_EVENTS = "classification.no.of.enriched.up.events";

        /**
         * 
         * forwarder stats
         */
        public static final String NUMBER_OF_FORWARDED_EVENTS = "forwarder.no.of.events.forwarded";

        public static final String FORWARDER_PROCESSING_TIME = "forwarder.processing.time";

        public static final String BEFORE_FORWARDED = "before.forwarder.last.event.time.forwarded";

        public static final String LAST_EVENT_TIME_FORWARDED = "after.forwarder.last.event.time.forwarded";

        /**
         * 
         * loader.parser stats
         */
        public static final String GPEH_NUMBER_OF_EVENTS_PARSED = "gpeh.no.of.events.parsed";

        public static final String SGEH_NUMBER_OF_EVENTS_PARSED = "sgeh.no.of.events.parsed";

        public static final String CAPTOOL_NUMBER_OF_RECORDS_PARSED = "captool.classification.no.of.events.parsed";

        public static final String STAPLE_NUMBER_OF_RECORDS_PARSED = "staple.tcp.no.of.events.parsed";

        public static final String GPEH_METRICS = "gpeh.starting.metrics";

        public static final String SGEH_METRICS = "sgeh.starting.metrics";

        public static final String CAPTOOL_METRICS = "captool.starting.metrics";

        public static final String STAPLE_METRICS = "staple.starting.metrics";

    }

    public void add(String key, Object value);
}
