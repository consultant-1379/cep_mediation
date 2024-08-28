package com.ericsson.cepmediation.loading.events;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;
import com.ericsson.cepmediation.base.meta.schema.Event;
import com.ericsson.cepmediation.base.meta.schema.EventHandler;
import com.ericsson.cepmediation.base.meta.schema.EventParameter;
import com.ericsson.cepmediation.base.meta.schema.Schema;
import com.ericsson.cepmediation.base.meta.schema.SchemaException;
import com.ericsson.cepmediation.base.publishing.Publisher;
import com.ericsson.cepmediation.base.util.DataConverters;
import com.ericsson.cepmediation.loading.asn1.Asn1Decoder;
import com.ericsson.cepmediation.loading.filerecords.RecordHandler;

/**
 * This class handles an event record. This code is optimized for speed by using
 * local variables and hard coded algorithms rather than using stock library
 * functions. Please edit it with care to avoid slowing it down
 *
 * @author eeilfn
 */
public class EventRecordHandler implements RecordHandler {
    public static final String SHOULD_NULLIFY_ASN1MESSAGECONTENTS_AFTER_DECODING = "should.nullify.asn1messagecontents.after.decoding";

    // Get a reference to the logger
    private static final Logger logger = LoggerFactory
            .getLogger(EventRecordHandler.class);

    // Get the event class package name
    private static final String EVENT_CLASS_PACKAGE = "com.ericsson.cepmediation.apeventbeans";

    // Reference to the header record
    private final EventHeaderRecordHandler headerRecordHandler;

    // The publishers on which to publish events
    Publisher[] publishers = null;

    // The ID of the event in this record
    private int eventId = -1;

    // The number of events processed by this record handler
    private long eventsProcessed;

    // Hold a reference to an ASN.1 decoder
    Asn1Decoder asn1Decoder = new Asn1Decoder();

    private AtomicLong numberOfEventsParsed = new AtomicLong(0);

    private Set<Integer> enabledEvents;

    private Set<Integer> parsingExceptions = new HashSet<Integer>();

    private Map<Integer, Long> enabledEventsCounter = new HashMap<Integer, Long>();

    private final Integer otherEvents = 0;

    /**
     * Constructor, used to get a handle to the header record, from which we
     * read information
     *
     * @param headerRecordhandler
     *            The handler for the header record
     * @param publishers
     *            The publishers to use to publish events
     * @param idLength
     *            The length in bytes of the ID field
     */
    public EventRecordHandler(
            final EventHeaderRecordHandler headerRecordHandler,
            final Publisher[] publishers, Set<Integer> enabledEvents) {
        this.enabledEvents = enabledEvents;

        // Set all the event Id's based on the interesting events.
        for (int eventIdDisplay : enabledEvents) {
            enabledEventsCounter.put(eventIdDisplay, (long) 0);
        }
        // Initialize all the event counter by zero
        enabledEventsCounter.put(otherEvents, (long) 0);

        // Save the header record reference
        this.headerRecordHandler = headerRecordHandler;

        // Save the publisher
        this.publishers = publishers;
    }

    /**
     * This method processes the event records
     *
     * @return true if the record was processed as an event
     * @throws SchemaException
     *             If there is no schema to process the record
     */
    @Override
    public synchronized boolean process(byte[] data) throws SchemaException {
        final Schema schema = readSchemaFromEventRecordHandler();

        eventId = getEventIdFromEventRecord(data);

        // Increment the event counter
        if (!enabledEvents.contains(eventId)) {
            enabledEventsCounter.put(otherEvents,
                    (enabledEventsCounter.get(otherEvents) + 1));
            return false;
        } else
            enabledEventsCounter.put(eventId,
                    (enabledEventsCounter.get(eventId) + 1));

        final Event event = getEventSchema(schema);

        // Check if the event was found
        if (event == null) {
            logger.warn("Event ID not found:" + eventId);
            return false;
        }

        data = unpackEventIfBitPacked(data, event);

        // Check if this event should be ignored
        if (event.isIgnored()) {
            logger.trace(event.getName() + ": skipped");
            return false;
        }

        if (!headerRecordHandler.isTreatAs()
                && !isEventLengthCorrect(event, data)) {
            return false;
        }

        // Track the offset in the record data, start at the bit position after
        // the EVENT_ID position in events without
        // event IDs as fields, at position 0 in events with event ID as a field
        final int offset = (headerRecordHandler.isIdInEvent() ? 0
                : headerRecordHandler.getIdLength() / 8);

        // Get the class that represents this event
        final ApEventBean apEventBean = getClassRepresentingEvent(schema, event);
        if (apEventBean == null) {
            logger.warn("could not instantiate event class");
            return false;
        }

        try {
            setFieldsInApEventBean(data, event, offset, apEventBean);
            decodeAsn1(event, apEventBean);
        } catch (Exception e) {
            if (!parsingExceptions.contains(eventId)) {
                logger.error(
                        "Error while decoding event. Event: " + event.getName(),
                        e);
                parsingExceptions.add(eventId);
            }
        }

        publishMessage(apEventBean);
        incrementEventsCounters();
        return true;
    }

    private void publishMessage(final ApEventBean apEventBean) {
        for (final Publisher publisher : publishers) {
            publisher.publishMessage(apEventBean);
        }
    }

    Event getEventSchema(final Schema schema) {
        // Get the description of this event from the event schema
        final EventHandler eventHandler = schema.getEventHandler();
        final Map<Integer, Event> map = eventHandler.getMap();
        return map.get(new Integer(eventId));
    }

    private void decodeAsn1(final Event event, final ApEventBean apEventBean) {
        if (event.isDecodeAsn1()) {
            asn1Decoder.decodeAsn1(apEventBean);
        }
    }

    private void incrementEventsCounters() {
        // Increment the number of events processed and return
        eventsProcessed++;
        numberOfEventsParsed.incrementAndGet();
    }

    private void setFieldsInApEventBean(final byte[] data, final Event event,
            final int offset, final ApEventBean apEventBean) {
        // Set the time stamp and the NE logical name on the event class
        apEventBean.setEventId(eventId);
        apEventBean.setTimestamp(getTimeStamp(event, offset, data));
        apEventBean.setSubNetwork(headerRecordHandler.getSubNetworkName());
        apEventBean.setNe(headerRecordHandler.getNeLogicalName());
        apEventBean.setName(event.getName());
        apEventBean.setVersion(headerRecordHandler.getFileInformationVersion());
        String ossId = headerRecordHandler.getOssId();
        apEventBean.setOSS_ID(ossId != null ? ossId
                : DefaultValues.DEFAULT_STRING_VALUE);
        apEventBean.setNetworkElementTimezoneOffset(headerRecordHandler
                .getNetworkElementTimezoneOffset());

        // Set the event class data from the byte array
        apEventBean.setData(event, data, offset);

    }

    private ApEventBean getClassRepresentingEvent(final Schema schema,
            final Event event) {
        // Get the class that represents this event
        final String className = EVENT_CLASS_PACKAGE + '.' + schema.getName()
                + '.' + event.getName();
        try {
            return (ApEventBean) Class.forName(className).newInstance();
        } catch (final Exception e) {
            // The event class for this event was not found
            logger.warn("could not instantiate event class:" + className, e);
            return null;
        }
    }

    private boolean isEventLengthCorrect(final Event event, final byte[] data) {
        // Check if the event is a variable length record
        if (event.isVariableLength()) {
            // Just check the minimum length
            if (data.length < event.getLength()) {
                // The length of this record is invalid
                logger.warn(event.getName()
                        + ": too short, length should be at least: "
                        + event.getLength() + ", it is: " + data.length);
                return false;
            }
        } else {
            // The length of the record should be the event length plus the ID
            // length adjusted for byte packing on 4-byte boundaries
            // if the event ID is not included in the event message
            int expectedDataLength = event.getLength();
            if (!headerRecordHandler.isIdInEvent()) {
                // Event ID is not in the event itself, so we add it's length to
                // the data
                expectedDataLength += headerRecordHandler.getIdLength() / 8;
            }

            // Length is in bytes, pad the length to the next 4-byte boundary
            if (expectedDataLength % 4 > 0) {
                // Padding needed so pad
                expectedDataLength += 4 - (expectedDataLength % 4);
            }

            // Now, check the data length
            if (data.length != expectedDataLength) {
                // The length of this record is invalid
                logger.warn(event.getName()
                        + ": incorrect length, length should be: "
                        + expectedDataLength + ", it is: " + data.length);
                return false;
            }
        }
        return true;
    }

    private byte[] unpackEventIfBitPacked(byte[] data, final Event event) {
        // Check if the event is bit packed
        if (event.isBitpacked()) {
            // Unpack the bit packed event
            data = new Unpacker(event, parsingExceptions).unpack(data);
        }
        return data;
    }

    Schema readSchemaFromEventRecordHandler() throws SchemaException {
        final Schema schema = headerRecordHandler.getUsedSchema();

        // Throw an exception of the schema was not found
        if (schema == null) {
            throw new SchemaException(
                    "No schema matching the file information version of this file found: fiv="
                            + headerRecordHandler.getFileInformationVersion());
        }
        return schema;
    }

    /**
     * This method parses the event for its time stamp and returns the UTC time
     * stamp as a long It works with all types of events
     *
     * @param event
     *            The event to parse
     * @param offset
     *            The offset in the event to start at
     * @param data
     *            The event data
     * @return the time stamp
     */
    private long getTimeStamp(final Event event, int offset, final byte[] data) {
        // Define holders for the time
        int hour = 0;
        int minute = 0;
        int second = 0;
        int millisecond = 0;

        // Iterate over the time parameters
        final Iterator<EventParameter> parameterIterator = event
                .getParameterList().iterator();
        while (parameterIterator.hasNext()) {
            // Get the next parameter
            EventParameter parameter = parameterIterator.next();

            // Check if this parameter is the hour parameter
            if (parameter.getName().endsWith("_HOUR")) {
                // Set the hour on the calendar
                hour = (int) DataConverters.getByteArrayInteger(data, offset,
                        parameter.getNumberOfBytes(),
                        DataConverters.UNSIGNED_FLAG);

                // Increment the offset by the appropriate amount of seconds and
                // get the minute parameter
                offset += parameter.getNumberOfBytes();
                parameter = parameterIterator.next();

                // Set the minute on the calendar
                minute = (int) DataConverters.getByteArrayInteger(data, offset,
                        parameter.getNumberOfBytes(),
                        DataConverters.UNSIGNED_FLAG);

                // Increment the offset by the appropriate amount and get the
                // second parameter
                offset += parameter.getNumberOfBytes();
                parameter = parameterIterator.next();

                // Set the second on the calendar
                second = (int) DataConverters.getByteArrayInteger(data, offset,
                        parameter.getNumberOfBytes(),
                        DataConverters.UNSIGNED_FLAG);

                // Increment the offset by the appropriate amount and get the
                // millisecond parameter
                offset += parameter.getNumberOfBytes();
                parameter = parameterIterator.next();

                // The millisecond parameter is not always specified so check it
                if (parameter.getName().endsWith("_MILLISECOND")
                        || parameter.getName().endsWith("_MILLISEC")) {
                    // Set the millisecond on the calendar
                    millisecond = (int) DataConverters.getByteArrayInteger(
                            data, offset, parameter.getNumberOfBytes(),
                            DataConverters.UNSIGNED_FLAG);
                }

                // Millisecond is the last parameter of the time stamp, so break
                // out here
                break;
            }

            // The time stamp is always in the first 8 parameters so if the
            // offset is greater than that, just return
            offset += parameter.getNumberOfBytes();
            if (offset > 8) {
                break;
            }
        }

        // get the time stamp in millisecond
        return getTimeStampInMills(hour, minute, second, millisecond);

    }

    /**
     *
     * Separate the time stamp calculation from other function for unit testing
     * purpose
     *
     * @param hour
     * @param minute
     * @param second
     * @param millisecond
     * @return
     */
    long getTimeStampInMills(final int hour, final int minute,
            final int second, final int millisecond) {

        // timestamp of the event, calculate based on the utcstartofday and the
        // passing time(hour, minute, second,
        // millisecond)
        long timestamp = 0;

        // time of the event
        long time = 0;

        // the time from event body is local time, add the time zone offset
        long timeZoneDiffDuration = headerRecordHandler
                .getUtcOffsetOfDataInsideFile();
        time = hour * 3600000 + // Hour in milliseconds
                minute * 60000 + // Minute in milliseconds
                second * 1000 + // Second in milliseconds
                millisecond + timeZoneDiffDuration;

        // if the time if negative, add 1 day N
        if (time < 0) {

            time = time + 3600000 * 24;
        }

        // Get the time stamp
        timestamp = headerRecordHandler.getUTCStartOfDay() + time;

        timestamp = removeOneDayFromTimestampIfRequired(timestamp);

        return addOneDayToTimestampIfNeeded(timestamp);

    }

    /**
     *
     * fix the midnight(local time) problem: like in the file
     * A20120517.0000+0800-20120517.0001+0800_1_ebs.135, there exists some
     * events from yesterday 2012/05/16 23.59
     *
     * Need to remove one day from the result if the timestamp way too bigger
     * than the header timestamp, say 1hr
     *
     *
     */
    long removeOneDayFromTimestampIfRequired(long timestamp) {
        if (timestamp - headerRecordHandler.getTimestamp().getTimeInMillis() > 3600000) {

            return timestamp - 3600000 * 24;
        }
        return timestamp;
    }

    /**
     *
     * fix for the midnight future event problem, for example,
     *
     * in ROP file A20120517.0759+0800-20120517.0800+0800_1_ebs.104, there
     * exists events using 8:00:00, which are supposed to be included in the
     * next ROP. Those events would be decoded as 20120516 00:00:00, we need to
     * add one day to the event timestamp
     *
     */
    long addOneDayToTimestampIfNeeded(long timestamp) {
        if (headerRecordHandler.getTimestamp().getTimeInMillis() - timestamp > 3600000) {

            return timestamp + 3600000 * 24;
        }
        return timestamp;
    }

    /**
     * This method uses ID length and ID position data from the header record
     * handler to read the event ID from the event record
     *
     * @param data
     *            The event record
     * @return The event ID
     */
    private int getEventIdFromEventRecord(final byte[] data) {
        // Store the first 8 bytes of the event record into a long
        long eventIdHolder = DataConverters.getByteArrayInteger(data, 0,
                Long.SIZE / 8, DataConverters.UNSIGNED_FLAG);

        // Shift the long value to the left to align with the event ID start
        // position
        eventIdHolder <<= headerRecordHandler.getIdStartPos();

        // Shift the long value to the right to align the event ID rightmost bit
        // to the right of the long
        eventIdHolder >>>= Long.SIZE - headerRecordHandler.getIdLength();

        // Mask out all but length least significant bits
        final long mask = (long) Math.pow(2, headerRecordHandler.getIdLength()) - 1;
        eventIdHolder &= mask;

        return (int) eventIdHolder;
    }

    /**
     * This method returns the record type
     *
     * @return the record type
     */
    @Override
    public short getRecordType() {
        return (short) headerRecordHandler.getEventRecordType();
    }

    /**
     * Return the number of events processed by this record handler
     *
     * @return the number of events
     */
    @Override
    public long getEventsProcessed() {
        // Return the number of events processed
        return eventsProcessed;
    }

    /**
     * Clear the number of events processed by this record handler
     */
    @Override
    public void clearEventsProcessed() {
        eventsProcessed = 0;
    }

    public void setEventCounterForStats(final AtomicLong eventcounter) {
        numberOfEventsParsed = eventcounter;
    }

    public Map<Integer, Long> getEnabledEventsCounter() {
        return enabledEventsCounter;
    }

    /**
     * Format event for printing
     *
     * @return The formatted string
     */
    @Override
    public String toString(final byte[] data) {
        // Construct the string representation
        final StringBuilder builder = new StringBuilder();

        // Get the event ID
        final int recordEventId = getEventIdFromEventRecord(data);

        builder.append("[Event  ] ");
        builder.append(recordEventId);

        // Return the string
        return builder.toString();
    }
}
