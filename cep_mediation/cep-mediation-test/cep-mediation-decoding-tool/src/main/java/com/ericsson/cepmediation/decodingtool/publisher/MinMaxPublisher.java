package com.ericsson.cepmediation.decodingtool.publisher;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;

/**
 * Prints min and max date in the rop.
 * 
 * @author emicned
 *
 */
public class MinMaxPublisher extends PublisherAdapter {
    private static final Logger logger = LoggerFactory.getLogger(MinMaxPublisher.class);

    long min = Long.MAX_VALUE;

    long max = Long.MIN_VALUE;

    @Override
    public void publishMessage(final ApEventBean e) {
        if (e instanceof GpehBase) {
            if (e.getTimestamp() < min) {
                min = e.getTimestamp();
            }

            if (e.getTimestamp() > max) {
                max = e.getTimestamp();
            }
        }
    }

    @Override
    public void flush() {
        final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";
        final String TIME_ZONE = "UTC";
        final DateFormat dateFormat = new SimpleDateFormat(DATE_TIME_FORMAT);
        dateFormat.setTimeZone(TimeZone.getTimeZone(TIME_ZONE));
        if (min != Long.MAX_VALUE) {
            logger.info("min date:" + dateFormat.format(new Date(min)));
        } else {
            logger.info("min date: n/a");
        }

        if (max != Long.MIN_VALUE) {
            logger.info("max date:" + dateFormat.format(new Date(max)));
        } else {
            logger.info("max date: n/a");
        }
    }
}
