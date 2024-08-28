package com.ericsson.cepmediation.decodingtool.publisher;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SYSTEM_UTILIZATION;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.meta.admin.MappedEvent;

/**
 * Prints sys utils events in the specified time range for the specified cell.
 * 
 * @author emicned
 *
 */
public class SysUtilPublisher extends PublisherAdapter {
    private static final Logger logger = LoggerFactory.getLogger(SysUtilPublisher.class);

    private final List<INTERNAL_SYSTEM_UTILIZATION> interSysUtil = new ArrayList<INTERNAL_SYSTEM_UTILIZATION>(100000);

    private final long start;

    private final long end;

    private final int cellId;

    public SysUtilPublisher(final long start, final long end, final int cellId) {
        this.start = start;
        this.end = end;
        this.cellId = cellId;
    }

    @Override
    public void publishMessage(final ApEventBean e) {
        if (e instanceof GpehBase) {
            final GpehBase event = (GpehBase) e;
            if (event instanceof INTERNAL_SYSTEM_UTILIZATION) {
                interSysUtil.add((INTERNAL_SYSTEM_UTILIZATION) event);
            }
        }
    }

    @Override
    public void flush() {
        for (final INTERNAL_SYSTEM_UTILIZATION i : interSysUtil) {
            if (i.getC_ID_1() == cellId && i.getTimestamp() < end && i.getTimestamp() > start) {
                logger.info(i.getDecodedString());
            }
        }
    }

    @Override
    public void addEvents(final String schemaType, final Collection<MappedEvent> events) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeEvents(final String schemaType, final Collection<MappedEvent> events) {
    }

    @Override
    public void close() {
    }
}