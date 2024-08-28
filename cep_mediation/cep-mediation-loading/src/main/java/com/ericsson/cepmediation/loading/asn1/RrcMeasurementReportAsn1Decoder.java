package com.ericsson.cepmediation.loading.asn1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import rrc.class_definitions.UL_DCCH_Message;
import rrc.class_definitions.UL_DCCH_MessageType;
import rrc.informationelements.CellMeasuredResults;
import rrc.informationelements.CellMeasuredResults.ModeSpecificInfo;
import rrc.informationelements.CellMeasuredResults.ModeSpecificInfo.Fdd;
import rrc.informationelements.CellMeasurementEventResults;
import rrc.informationelements.CellToReport;
import rrc.informationelements.CellToReportList;
import rrc.informationelements.EventResults;
import rrc.informationelements.InterFreqCell;
import rrc.informationelements.InterFreqCellList;
import rrc.informationelements.InterFreqCellMeasuredResultsList;
import rrc.informationelements.InterFreqEventResults;
import rrc.informationelements.InterFreqMeasuredResults;
import rrc.informationelements.InterFreqMeasuredResultsList;
import rrc.informationelements.InterRATEventResults;
import rrc.informationelements.IntraFreqEventResults;
import rrc.informationelements.IntraFreqMeasuredResultsList;
import rrc.informationelements.MeasuredResults;
import rrc.informationelements.MeasuredResultsOnRACH;
import rrc.informationelements.MeasuredResultsOnRACH.CurrentCell;
import rrc.informationelements.MeasuredResultsOnRACH.CurrentCell.ModeSpecificInfo.Fdd.MeasurementQuantity;
import rrc.informationelements.PrimaryCPICH_Info;
import rrc.informationelements.TrafficVolumeEventResults;
import rrc.informationelements.TrafficVolumeEventType;
import rrc.informationelements.UE_InternalEventResults;
import rrc.pdu_definitions.MeasurementReport;

import com.ericsson.cepmediation.apeventbeans.gpeh.RRC_MEASUREMENT_REPORT;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;
import com.ericsson.cepmediation.base.util.constants.MeasReportAttributes;
import com.ericsson.cepmediation.loading.events.Asn1MessageSplitter;
import com.oss.asn1.INTEGER;
import com.oss.asn1.SequenceOf;


/**
 * At the moment we support intra and inter frequency measurement results.
 * Intra-RAT (GSM) does not seem to support these measurements.
 * 
 * @author evelziv
 */

public class RrcMeasurementReportAsn1Decoder extends AbstractAsn1EventDecoder {

    private static final String RRC_MEASUREMENT = "rrc_measurement";

    private static final Logger logger = LoggerFactory.getLogger(RrcMeasurementReportAsn1Decoder.class);

    // One RRC_MEASUREMENT_REPORT can contain multiple measurement reports (which contain the actual metrics).
    private static final boolean EXTRACT_ONLY_FIRST_REPORT_INTRA_FREQ = false;

    private static final boolean EXTRACT_ONLY_FIRST_REPORT_INTER_FREQ = false;

    private static final boolean EXTRACT_ONLY_FIRST_REPORT_RAT = true;

    public static final byte DEFAULT_MEAS_ORD_NUMB = 0;
    

    public RrcMeasurementReportAsn1Decoder(RRCCoder rrcCoderValue) {
        super(rrcCoderValue);
    }


    /**
     * Has default access to allow use by test decoder
     */
    public List<Map<String, String>> handleUlDcchMessage(final UL_DCCH_Message message) {
        final UL_DCCH_MessageType ul_DCCH_MessageType = getUL_DCCH_MessageType(message);
        if (!ul_DCCH_MessageType.hasMeasurementReport()) {
        	String error = "Expected event of type " + getEventName();
            throw new IllegalStateException(error);
        }
        final MeasurementReport measurementReport = (MeasurementReport) ul_DCCH_MessageType.getChosenValue();
        final EventResultData eventResultData = extractEventResultData(measurementReport);
        final MeasuredResults measuredResults = measurementReport.getMeasuredResults();
        final MeasuredResultsOnRACH measuredResultsOnRAC = measurementReport.getMeasuredResultsOnRACH();

        final List<Map<String, String>> transformedMeasurements = new ArrayList<Map<String, String>>();
        if (measuredResults != null && measuredResults.hasIntraFreqMeasuredResultsList()) {
            final IntraFreqMeasuredResultsList intraFreqMeasurementResultsLists = (IntraFreqMeasuredResultsList) measuredResults
                    .getChosenValue();
            transformedMeasurements.addAll(handleIntraFreqMeasurementResults(eventResultData,
                    intraFreqMeasurementResultsLists));
        } else if (eventResultData.isInterFreq()) {
            if (measuredResults != null && measuredResults.hasInterFreqMeasuredResultsList()) {
                final InterFreqMeasuredResultsList interFreqMeasuredResultsList = (InterFreqMeasuredResultsList) measuredResults
                        .getChosenValue();
                transformedMeasurements.addAll(handleInterFreqMeasurementResults(eventResultData,
                        interFreqMeasuredResultsList));
            } else {
                final Map<String, String> asn1Attributes = createAttributesMapWithDefaultValues();
                setMeasurementType(asn1Attributes, (byte) EVENT_TYPE.INTER_FREQ.getId());
                setTriggerEventId(asn1Attributes, eventResultData.getEventId());
                transformedMeasurements.add(asn1Attributes);
            }
        } else if (eventResultData.isInterRat()) {
            if (!eventResultData.isEmpty()) {
                transformedMeasurements.addAll(handleInterRATMeasurementResults(eventResultData));
            }
        } else if (eventResultData.isTrafficVolume()) {
            if (measuredResultsOnRAC == null || measuredResultsOnRAC.getCurrentCell() == null) {
                final Map<String, String> attributesMap = createAttributesMapWithDefaultValues();
                setMeasurementType(attributesMap, (byte) EVENT_TYPE.TRAFFIC_VOLUME.getId());
                setTriggerEventId(attributesMap, eventResultData.getEventId());
                transformedMeasurements.add(attributesMap);
            } else {
                transformedMeasurements.add(handleMeasuredResultsOnRac(EVENT_TYPE.TRAFFIC_VOLUME,
                        eventResultData.getEventId(), measuredResultsOnRAC));
            }
        } else if (eventResultData.isUeInternal()
                && (eventResultData.getEventId() == UE_INTERNAL_EVENT_RESULT_ID.EVENT6A.getId() || eventResultData
                        .getEventId() == UE_INTERNAL_EVENT_RESULT_ID.EVENT6B.getId())) {
            if (measuredResultsOnRAC == null || measuredResultsOnRAC.getCurrentCell() == null) {
                final Map<String, String> meas = createAttributesMapWithDefaultValues();
                setMeasurementType(meas, (byte) EVENT_TYPE.UE_INTERNAL.getId());
                setTriggerEventId(meas, eventResultData.getEventId());
                transformedMeasurements.add(meas);
            } else {
                transformedMeasurements.add(handleMeasuredResultsOnRac(EVENT_TYPE.UE_INTERNAL,
                        eventResultData.getEventId(), measuredResultsOnRAC));
            }
        } else {
            logger.trace("handleUlDcchMessage() --> case not handled");
        }
        addScramblingCodesFromEventResultsThatHaveNoMeasurements(transformedMeasurements, eventResultData);

        return transformedMeasurements;
    }
    

    private void addScramblingCodesFromEventResultsThatHaveNoMeasurements(
            final List<Map<String, String>> transformedMeasurements, final EventResultData eventResultData) {
        if (shouldAddOrderNumberForCellsInEventResultData(eventResultData.getType())) {
            final List<Integer> codes = eventResultData.getCodes();
            for (final Integer code : codes) {
                if (!thereIsMeasurementForCode(code, transformedMeasurements)) {
                    final boolean isSetMeasurementOrdNumb = transformedMeasurements.isEmpty();
                    final Map<String, String> dataForCellWithNoMeasurement = createDataForCellWithNoMeasurement(code,
                            eventResultData, isSetMeasurementOrdNumb);
                    transformedMeasurements.add(dataForCellWithNoMeasurement);
                }
            }
        }
    }

    private boolean shouldAddOrderNumberForCellsInEventResultData(final EVENT_TYPE type) {
        return type != EVENT_TYPE.INTER_RAT;
    }

    private Map<String, String> createDataForCellWithNoMeasurement(final int code,
            final EventResultData eventResultData, final boolean isSetMeasurementOrdNumb) {
        final Map<String, String> attributes = createAttributesMapWithDefaultValues();
        if (!isSetMeasurementOrdNumb) {
            setMeasResultsOrderNumber(attributes, (byte) -1);
        }
        setEventResultsOrderNumber(attributes, getEventResultsOrderFor(code, eventResultData));
        setValidEventResults(attributes, true);
        setScramblingCode(attributes, (short) code);
        setTriggerEventId(attributes, eventResultData.getEventId());
        setMeasurementTypeFromEventResultData(eventResultData, attributes);
        return attributes;
    }

    private boolean thereIsMeasurementForCode(final Integer code,
            final List<Map<String, String>> transformedMeasurements) {

        for (final Map<String, String> transformedMeasurement : transformedMeasurements) {
            final String scramblingCode = transformedMeasurement.get(MeasReportAttributes.SCRAMBLING_CODE);
            final short scramblingCodeAsShort = Short.parseShort(scramblingCode);
            if (scramblingCodeAsShort == code) {
                return true;
            }
        }
        return false;
    }

    /**
     * Create the attributes map with some of the fields set to their default values
     */
    private Map<String, String> createAttributesMapWithDefaultValues() {
        final Map<String, String> attributeMap = new HashMap<String, String>();
        setMeasResultsOrderNumber(attributeMap, DEFAULT_MEAS_ORD_NUMB);
        setDefaultScramblingCode(attributeMap);
        setDefaultEventResultsOrderNumber(attributeMap);
        setDefaultECNO(attributeMap);
        setDefaultRSCP(attributeMap);
        setDefaultBSIC(attributeMap);
        setValidMeasResults(attributeMap, false);
        setValidEventResults(attributeMap, false);
        return attributeMap;
    }

    private void setDefaultEventResultsOrderNumber(final Map<String, String> attributeMap) {
        setEventResultsOrderNumber(attributeMap, DefaultValues.DEFAULT_BYTE_VALUE);
    }

    private void setDefaultBSIC(final Map<String, String> attributeMap) {
        setBSIC(attributeMap, DefaultValues.DEFAULT_INT_VALUE);
    }

    private void setDefaultRSCP(final Map<String, String> attributeMap) {
        setRSCP(attributeMap, DefaultValues.DEFAULT_INT_VALUE);
    }

    private void setDefaultECNO(final Map<String, String> attributeMap) {
        setECNO(attributeMap, DefaultValues.DEFAULT_INT_VALUE);
    }


    private Map<String, String> handleMeasuredResultsOnRac(final EVENT_TYPE type, final short eventId,
            final MeasuredResultsOnRACH measuredResultsOnRAC) {
        final Map<String, String> measurement = createAttributesMapWithDefaultValues();
        setMeasurementType(measurement, (byte) type.getId());
        setTriggerEventId(measurement, eventId);

        final CurrentCell currentCell = measuredResultsOnRAC.getCurrentCell();
        final MeasuredResultsOnRACH.CurrentCell.ModeSpecificInfo info = currentCell.getModeSpecificInfo();
        if (info != null && info.hasFdd()) {
            final MeasuredResultsOnRACH.CurrentCell.ModeSpecificInfo.Fdd fdd = (MeasuredResultsOnRACH.CurrentCell.ModeSpecificInfo.Fdd) info
                    .getChosenValue();

            final MeasurementQuantity quantity = fdd.getMeasurementQuantity();
            if (quantity.hasCpich_Ec_N0()) {
                final INTEGER ecno = (INTEGER) quantity.getChosenValue();
                setECNO(measurement, ecno.intValue());
            }

            if (quantity.hasCpich_RSCP()) {
                final INTEGER rscp = (INTEGER) quantity.getChosenValue();
                setRSCP(measurement, rscp.intValue());
            }
        }

        return measurement;
    }

    private EventResultData extractEventResultData(final MeasurementReport measurementReport) {
        final EventResultData eventResultData = new EventResultData();
        final EventResults eventResults = measurementReport.getEventResults();
        if (eventResults == null) {
            final EVENT_TYPE measurementType = getMeasurementTypeFromMeasuredResults(measurementReport
                    .getMeasuredResults());
            eventResultData.setType(measurementType);
        } else {
            extractDataFromEventResults(eventResultData, eventResults);
        }
        return eventResultData;
    }

    private EVENT_TYPE getMeasurementTypeFromMeasuredResults(final MeasuredResults measuredResults) {
        if (measuredResults == null) {
            return null;
        }
        if (measuredResults.hasInterFreqMeasuredResultsList()) {
            return EVENT_TYPE.INTER_FREQ;
        }
        if (measuredResults.hasIntraFreqMeasuredResultsList()) {
            return EVENT_TYPE.INTRA_FREQ;
        }
        if (measuredResults.hasInterRATMeasuredResultsList()) {
            return EVENT_TYPE.INTER_RAT;
        }
        if (measuredResults.hasTrafficVolumeMeasuredResultsList()) {
            return EVENT_TYPE.TRAFFIC_VOLUME;
        }
        return null;
    }

    private void extractDataFromEventResults(final EventResultData eventResultData, final EventResults eventResults) {
        if (eventResults.hasIntraFreqEventResults()) {
            final IntraFreqEventResults intraFreqEventResults = (IntraFreqEventResults) eventResults.getChosenValue();
            if (intraFreqEventResults.getEventID() != null) {
                final short eventId = (short) intraFreqEventResults.getEventID().longValue();
                eventResultData.setEventId(eventId);
                eventResultData.setExtractOnlyFirstReport(EXTRACT_ONLY_FIRST_REPORT_INTRA_FREQ);
                eventResultData.setType(EVENT_TYPE.INTRA_FREQ);

                fillCodes(eventResultData, intraFreqEventResults.getCellMeasurementEventResults());
            }
        } else if (eventResults.hasInterFreqEventResults()) {
            final InterFreqEventResults interFreqEventResults = (InterFreqEventResults) eventResults.getChosenValue();
            if (interFreqEventResults.getEventID() != null) {
                final short eventId = (short) interFreqEventResults.getEventID().longValue();
                eventResultData.setEventId(eventId);
                eventResultData.setExtractOnlyFirstReport(EXTRACT_ONLY_FIRST_REPORT_INTER_FREQ);
                eventResultData.setType(EVENT_TYPE.INTER_FREQ);

                final InterFreqCellList interFreqCellList = interFreqEventResults.getInterFreqCellList();
                final int size = getSize(interFreqCellList);
                for (int i = 0; i < size; i++) {
                    final InterFreqCell interFreqCell = interFreqCellList.get(i);
                    fillCodes(eventResultData, interFreqCell.getNonFreqRelatedEventResults());
                    if (eventResultData.isExtractOnlyFirstReport() && !eventResultData.isEmpty()) {
                        break;
                    }
                }
            }
        } else if (eventResults.hasInterRATEventResults()) {
            final InterRATEventResults interRATEventResults = (InterRATEventResults) eventResults.getChosenValue();
            if (interRATEventResults.getEventID() != null) {
                eventResultData.setEventId((short) interRATEventResults.getEventID().longValue());
                eventResultData.setExtractOnlyFirstReport(EXTRACT_ONLY_FIRST_REPORT_RAT);
                eventResultData.setType(EVENT_TYPE.INTER_RAT);

                final CellToReportList cellToReportList = interRATEventResults.getCellToReportList();
                final int size = getSize(cellToReportList);
                for (int i = 0; i < size; i++) {
                    final CellToReport cellToReport = cellToReportList.get(i);
                    if (cellToReport.getBsicReported() != null && cellToReport.getBsicReported().hasVerifiedBSIC()) {
                        final INTEGER bsic = (INTEGER) cellToReport.getBsicReported().getChosenValue();
                        eventResultData.addCode(bsic.intValue());
                        if (eventResultData.isExtractOnlyFirstReport()) {
                            break;
                        }
                    }
                }
            }
        } else if (eventResults.hasTrafficVolumeEventResults()) {

            eventResultData.setType(EVENT_TYPE.TRAFFIC_VOLUME);
            final TrafficVolumeEventResults trafficVolumeEventResults = (TrafficVolumeEventResults) eventResults
                    .getChosenValue();
            if (trafficVolumeEventResults.getTrafficVolumeEventIdentity() != null) {
                final TrafficVolumeEventType type = trafficVolumeEventResults.getTrafficVolumeEventIdentity();
                eventResultData.setEventId((short) type.longValue());
            }

        } else if (eventResults.hasUe_InternalEventResults()) {
            eventResultData.setType(EVENT_TYPE.UE_INTERNAL);
            final UE_InternalEventResults ueInternalEventResults = (UE_InternalEventResults) eventResults
                    .getChosenValue();
            if (ueInternalEventResults.hasEvent6a()) {
                eventResultData.setEventId(UE_INTERNAL_EVENT_RESULT_ID.EVENT6A.getId());
            } else if (ueInternalEventResults.hasEvent6b()) {
                eventResultData.setEventId(UE_INTERNAL_EVENT_RESULT_ID.EVENT6B.getId());
            } else if (ueInternalEventResults.hasEvent6c()) {
                eventResultData.setEventId(UE_INTERNAL_EVENT_RESULT_ID.EVENT6C.getId());
            } else if (ueInternalEventResults.hasEvent6d()) {
                eventResultData.setEventId(UE_INTERNAL_EVENT_RESULT_ID.EVENT6D.getId());
            } else if (ueInternalEventResults.hasEvent6e()) {
                eventResultData.setEventId(UE_INTERNAL_EVENT_RESULT_ID.EVENT6E.getId());
            } else if (ueInternalEventResults.hasEvent6f()) {
                eventResultData.setEventId(UE_INTERNAL_EVENT_RESULT_ID.EVENT6F.getId());
            } else if (ueInternalEventResults.hasEvent6g()) {
                eventResultData.setEventId(UE_INTERNAL_EVENT_RESULT_ID.EVENT6G.getId());
            }

        } else {
            logger.trace("extractEventResultData() --> case not handled");
        }
    }

    private EventResultData fillCodes(final EventResultData eventResultData,
            final CellMeasurementEventResults cellMeasurementEventResults) {
        if (cellMeasurementEventResults != null && cellMeasurementEventResults.hasFdd()) {
            final CellMeasurementEventResults.Fdd fdd = (CellMeasurementEventResults.Fdd) cellMeasurementEventResults
                    .getChosenValue();
            final int fddSize = getSize(fdd);
            for (int i = 0; i < fddSize; i++) {
                final PrimaryCPICH_Info info = fdd.get(i);
                if (info != null && info.getPrimaryScramblingCode() != null) {
                    final int primaryScramblingCode = info.getPrimaryScramblingCode().intValue();
                    eventResultData.addCode(primaryScramblingCode);
                    if (eventResultData.isExtractOnlyFirstReport()) {
                        return eventResultData;
                    }
                }
            }
        }

        return eventResultData;
    }

    private List<Map<String, String>> handleInterFreqMeasurementResults(final EventResultData eventResultData,
            final InterFreqMeasuredResultsList interFreqMeasuredResultsList) {
        final List<Map<String, String>> res = new ArrayList<Map<String, String>>();
        byte count = 0;
        final int size = getSize(interFreqMeasuredResultsList);
        for (int i = 0; i < size; i++) {
            final InterFreqMeasuredResults interFreqMeasuredResutls = interFreqMeasuredResultsList.get(i);
            final InterFreqCellMeasuredResultsList interFreqCellMeasuredResultsList = interFreqMeasuredResutls
                    .getInterFreqCellMeasuredResultsList();
            final int sizeOfCellMeasuredResultsList = getSize(interFreqCellMeasuredResultsList);
            for (int j = 0; j < sizeOfCellMeasuredResultsList; j++) {
                final CellMeasuredResults cellMeasuredResults = interFreqCellMeasuredResultsList.get(j);
                final Map<String, String> measurement = createMeasurement(eventResultData, cellMeasuredResults);
                if (measurement != null) {
                    setMeasResultsOrderNumber(measurement, count++);
                    res.add(measurement);
                    if (eventResultData.isExtractOnlyFirstReport()) {
                        return res;
                    }
                }
            }
        }

        return res;
    }

    /**
     * Extracted out with default access to get under test (getSize() in SequenceOf is a final method so 
     * can't be mocked)
     */
    int getSize(final SequenceOf sequence) {
        if (sequence == null) {
            return 0;
        }
        return sequence.getSize();
    }

    private List<Map<String, String>> handleIntraFreqMeasurementResults(final EventResultData eventResultData,
            final IntraFreqMeasuredResultsList intraFreqMeasuredResultsList) {
        final List<Map<String, String>> results = new ArrayList<Map<String, String>>();
        byte count = 0;
        final int size = getSize(intraFreqMeasuredResultsList);
        for (int i = 0; i < size; i++) {
            final CellMeasuredResults cellMeasuredResults = intraFreqMeasuredResultsList.get(i);
            final Map<String, String> measurement = createMeasurement(eventResultData, cellMeasuredResults);
            if (measurement != null) {
                setMeasResultsOrderNumber(measurement, count++);
                results.add(measurement);
                if (eventResultData.isExtractOnlyFirstReport()) {
                    return results;
                }
            }
        }

        return results;
    }

    private void setMeasResultsOrderNumber(final Map<String, String> measurement, final byte value) {
        measurement.put(MeasReportAttributes.MEAS_RESULTS_ORDER_NUMBER, Byte.toString(value));
    }

    private List<Map<String, String>> handleInterRATMeasurementResults(final EventResultData eventResultData) {
        final List<Map<String, String>> messages = new ArrayList<Map<String, String>>();
        byte count = 0;
        for (final Iterator<Integer> iter = eventResultData.getCodesIter(); iter.hasNext();) {
            final Map<String, String> messageAttributes = createAttributesMapWithDefaultValues();
            final int bsic = iter.next();
            setMeasResultsOrderNumber(messageAttributes, count);
            setBSIC(messageAttributes, (byte) bsic);
            setMeasurementTypeFromEventResultData(eventResultData, messageAttributes);
            setTriggerEventId(messageAttributes, eventResultData.getEventId());
            setDefaultScramblingCode(messageAttributes);
            setDefaultECNO(messageAttributes);
            setDefaultRSCP(messageAttributes);
            setEventResultsOrderNumber(messageAttributes, count);
            setValidEventResults(messageAttributes, true);
            messages.add(messageAttributes);
            count++;
            if (eventResultData.isExtractOnlyFirstReport()) {
                return messages;
            }
        }
        return messages;
    }

    private void setDefaultScramblingCode(final Map<String, String> messageAttributes) {
        setScramblingCode(messageAttributes, DefaultValues.DEFAULT_SHORT_VALUE);
    }

    private void setBSIC(final Map<String, String> measurement, final int bisc) {
        measurement.put(MeasReportAttributes.BSIC, Integer.toString(bisc));
    }

    private Map<String, String> createMeasurement(final EventResultData eventResultData,
            final CellMeasuredResults cellMeasurementResults) {
        final ModeSpecificInfo modeSpecificInfo = cellMeasurementResults.getModeSpecificInfo();
        if (modeSpecificInfo.hasTdd()) {
            return null;
        }
        final Fdd fdd = (Fdd) modeSpecificInfo.getChosenValue();

        final PrimaryCPICH_Info pcpich = fdd.getPrimaryCPICH_Info();
        if (pcpich == null) {
            return null;
        }

        final int cellIdentity = pcpich.getPrimaryScramblingCode().intValue();

        final Map<String, String> messageAttributes = new HashMap<String, String>();
        if (eventResultData.getType() != null) {
            setMeasurementTypeFromEventResultData(eventResultData, messageAttributes);
        } else {
            setMeasurementType(messageAttributes, DefaultValues.DEFAULT_BYTE_VALUE);
        }
        setTriggerEventId(messageAttributes, getTriggerEventId(eventResultData, cellIdentity));
        setValidEventResults(messageAttributes, isValidEventResult(eventResultData, cellIdentity));
        setECNO(messageAttributes, getEcno(fdd));
        setRSCP(messageAttributes, getRscp(fdd));
        setValidMeasResults(messageAttributes, true);
        setScramblingCode(messageAttributes, (short) cellIdentity);
        setEventResultsOrderNumber(messageAttributes, getEventResultsOrderFor(cellIdentity, eventResultData));
        setMeasResultsOrderNumber(messageAttributes, DEFAULT_MEAS_ORD_NUMB);
        setDefaultBSIC(messageAttributes);

        return messageAttributes;
    }

    private void setValidEventResults(final Map<String, String> messageAttributes, final boolean validEventResult) {
        setBooleanAttribute(messageAttributes, MeasReportAttributes.VALID_EVENT_RESULTS, validEventResult);
    }

    private boolean isValidEventResult(final EventResultData eventResultData, final int cellIdentity) {
        if (eventResultData.containsCode(cellIdentity)) {
            return true;
        }
        return false;
    }

    private void setValidMeasResults(final Map<String, String> messageAttributes, final boolean value) {
        setBooleanAttribute(messageAttributes, MeasReportAttributes.VALID_MEAS_RESULTS, value);
    }

    private void setBooleanAttribute(final Map<String, String> messageAttributes, final String attributeName,
            final boolean value) {
        messageAttributes.put(attributeName, Boolean.toString(value));
    }

    private void setEventResultsOrderNumber(final Map<String, String> messageAttributes, final byte eventResultsOrderFor) {
        setAttribute(messageAttributes, MeasReportAttributes.EVENT_RESULTS_ORDER_NUMBER, eventResultsOrderFor);
    }

    private byte getEventResultsOrderFor(final int cellIdentity, final EventResultData eventResultData) {
        final List<Integer> codes = eventResultData.getCodes();
        byte index = 0;
        for (final Integer scramblingCode : codes) {
            if (scramblingCode == cellIdentity) {
                return index;
            }
            index++;
        }
        return DefaultValues.DEFAULT_BYTE_VALUE;
    }

    private void setMeasurementTypeFromEventResultData(final EventResultData eventResultData,
            final Map<String, String> messageAttributes) {
        setMeasurementType(messageAttributes, (byte) eventResultData.getType().getId());
    }

    /**
     * Get the trigger event id
     * If the cell identity isn't in the list of scrambling codes in the eventResultsData, then -1
     * is returned
     * 
     * @param eventResultData                           the eventResult construct in the message
     * @param cellIdentity                              cell identity for measurement
     * @return trigger event id
     *  
     */
    private short getTriggerEventId(final EventResultData eventResultData, final int cellIdentity) {
        if (eventResultData.containsCode(cellIdentity)) {
            return eventResultData.getEventId();
        }
        return DefaultValues.DEFAULT_SHORT_VALUE;
    }

    private int getRscp(final Fdd fdd) {
        int rscp = Integer.MIN_VALUE;
        if (fdd.hasCpich_RSCP()) {
            rscp = fdd.getCpich_RSCP().intValue();
        }
        return rscp;
    }

    private int getEcno(final Fdd fdd) {
        int ecNo = Integer.MIN_VALUE;
        if (fdd.hasCpich_Ec_N0()) {
            ecNo = fdd.getCpich_Ec_N0().intValue();
        }
        return ecNo;
    }

    private void setScramblingCode(final Map<String, String> messageAttributes, final short cellIdentity) {
        messageAttributes.put(MeasReportAttributes.SCRAMBLING_CODE, Integer.toString(cellIdentity));
    }

    private void setRSCP(final Map<String, String> messageAttributes, final int rscp) {
        messageAttributes.put(MeasReportAttributes.RSCP, Integer.toString(rscp));
    }

    private void setECNO(final Map<String, String> messageAttributes, final int ecNo) {
        messageAttributes.put(MeasReportAttributes.EC_NO, Integer.toString(ecNo));
    }

    private void setTriggerEventId(final Map<String, String> messageAttributes, final short eventId) {
        messageAttributes.put(MeasReportAttributes.TRIGGER_EVENT_ID, Integer.toString(eventId));
    }

    private void setMeasurementType(final Map<String, String> messageAttributes, final byte measurementType) {
        setAttribute(messageAttributes, MeasReportAttributes.MEASUREMENT_TYPE, measurementType);
    }

    private void setAttribute(final Map<String, String> messageAttributes, final String attributeName,
            final byte attributeValue) {
        messageAttributes.put(attributeName, Integer.toString(attributeValue));
    }


	@Override
	protected void postProcess(ApEventBean apEventBean) {
		final List<Object> splitEvents = Asn1MessageSplitter.splitEvent(apEventBean);
		apEventBean.setMeasurements(splitEvents);
		apEventBean.setAsn1MessageList(null);
		
		if (shouldNullifyMessageContentsAfterDecoding() ) {
            ((RRC_MEASUREMENT_REPORT) apEventBean).setMESSAGE_CONTENTS(new byte[] { -1 });
        }
	}


	@Override
	protected String getMessageName() {
		return RRC_MEASUREMENT;
	}


	@Override
	protected String getEventName() {
		return "RRC_MEASUREMENT_REPORT";
	}

}
