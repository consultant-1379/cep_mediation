package com.ericsson.cepmediation.forwarding;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.listening.TopicListener;
import com.ericsson.cepmediation.base.statistics.Statistics;
import com.ericsson.cepmediation.base.statistics.StatisticsAware;
import com.ericsson.cepmediation.base.statistics.StatisticsCollector;
import com.ericsson.cepmediation.base.util.Metrics;

public class ForwarderListener extends TopicListener implements StatisticsAware {

    // Get a reference to the logger
    private static final Logger logger = LoggerFactory.getLogger(ForwarderListener.class);

    // Get a reference to the metrics logger
    private static final Logger metricLogger = LoggerFactory.getLogger(Metrics.class);

    private final Forwarder forwarder;

    private final AtomicLong totalNumberOfEventsForwarded;

    private final AtomicInteger forwarderProcessingTime;

    private String lastEventTimeForwarded = "";

    private static DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSS");

    /**
     * Constructor, Subscribes to all events in the schema handler
     * @param name The topic listener name
     * @param topicName 
     */
    protected ForwarderListener(final String name, final Forwarder forwarder, String topicName) {
        super(name);

        this.forwarder = forwarder;

        setTopic(topicName);

        totalNumberOfEventsForwarded = new AtomicLong(0l);
        forwarderProcessingTime = new AtomicInteger(0);
        StatisticsCollector.registerMe(this);
    }

    private void setTopic(String topicName) {
        // Declare an array list to hold all the topics we will listen on
        final List<String> topicList = new ArrayList<String>();
        // Add the topic to the list
        topicList.add(topicName);

        // Set the topics to listen on
        super.setTopics(topicList);
    }

    @Override
    public void exportTo(final Statistics statistics) {
        statistics.add(Statistics.Keys.NUMBER_OF_FORWARDED_EVENTS, totalNumberOfEventsForwarded.getAndSet(0l));
        statistics.add(Statistics.Keys.FORWARDER_PROCESSING_TIME, forwarderProcessingTime.getAndSet(0));
        statistics.add(Statistics.Keys.BEFORE_FORWARDED, lastEventTimeForwarded);
    }

    /**
     * This method receives the event
     * @param events The list of events received
     */
    @Override
    public void onMessage(final List<ApEventBean> events) {
        metricLogger.trace(events.size() + " events received for forwarding");

        // Handle each message one after another
        final long start = System.currentTimeMillis();
        for (final ApEventBean eventItem : events) {
            // Only trace the messages if tracing is active to reduce load
            if (logger.isTraceEnabled()) {
                logger.trace(eventItem.getCSVString().substring(0, 80));
            }
            //This part should be removed after Performance Tests!!!!
            lastEventTimeForwarded = currentTime();

            // Dispatch the event to the forwarder for handling
            forwarder.forward(eventItem);
            totalNumberOfEventsForwarded.incrementAndGet();

        }

        forwarderProcessingTime.getAndAdd((int) (System.currentTimeMillis() - start));

        metricLogger.trace(events.size() + " events forwarded");
    }

    private String currentTime() {
        return dateFormatter.format(new Date());
    }

    public void close() {
        // Pass the signal to the forwarder to finish
        forwarder.close();
    }

    @Override
    public void onMessage(List<ApEventBean> events, String dataLabel) {
        onMessage(events);

    }
}
