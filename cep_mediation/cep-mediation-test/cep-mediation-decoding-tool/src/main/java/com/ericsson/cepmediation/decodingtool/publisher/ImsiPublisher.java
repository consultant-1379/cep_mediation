package com.ericsson.cepmediation.decodingtool.publisher;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_IMSI;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.decodingtool.parser.RopParser;

/**
 * 
 * Prints all imsis in a rop.
 * 
 * @author emicned
 *
 */
public class ImsiPublisher extends PublisherAdapter {
    private static final Logger logger = LoggerFactory.getLogger(ImsiPublisher.class);

    private Set<Long> imsis = new HashSet<Long>();

    @Override
    public void publishMessage(final ApEventBean event) {
        if (event instanceof INTERNAL_IMSI) {
            final String currImsi = ((INTERNAL_IMSI) event).getIMSI().trim();
            try {
                Long imsiLong = Long.valueOf(currImsi);
                if (!imsis.contains(imsiLong)) {
                    logger.info(imsiLong.toString());
                    imsis.add(imsiLong);
                }
            } catch (final Exception e) {
                logger.error("Unparseable imsi: " + currImsi);
            }
        }
    }

}