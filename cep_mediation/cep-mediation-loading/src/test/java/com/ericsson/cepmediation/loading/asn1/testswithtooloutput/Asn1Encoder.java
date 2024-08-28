/**
 * -----------------------------------------------------------------------
wconfig *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.loading.asn1.testswithtooloutput;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;

import rrc.class_definitions.UL_DCCH_Message;
import rrc.class_definitions.UL_DCCH_MessageType;
import rrc.informationelements.CPICH_Ec_N0;
import rrc.informationelements.CPICH_RSCP;
import rrc.informationelements.CellMeasuredResults;
import rrc.informationelements.CellMeasuredResults.ModeSpecificInfo;
import rrc.informationelements.CellMeasuredResults.ModeSpecificInfo.Fdd;
import rrc.informationelements.CellMeasurementEventResults;
import rrc.informationelements.EventIDIntraFreq;
import rrc.informationelements.EventResults;
import rrc.informationelements.IntraFreqEventResults;
import rrc.informationelements.IntraFreqMeasuredResultsList;
import rrc.informationelements.MeasuredResults;
import rrc.informationelements.MeasuredResultsList;
import rrc.informationelements.MeasuredResultsOnRACH;
import rrc.informationelements.MeasurementIdentity;
import rrc.informationelements.PrimaryCPICH_Info;
import rrc.informationelements.PrimaryScramblingCode;
import rrc.pdu_definitions.MeasurementReport;
import rrc.pdu_definitions.MeasurementReport.V390nonCriticalExtensions;

import com.ericsson.cepmediation.test.util.FileUtilsForTest;

/**
 * Work in progress - idea is to take the asn1 messages as decoded from the binary files by RRCCoder (and before CEP Mediation flattens the message structure)
 * , rebuild the ASN1 objects from these messages and call the production Asn1Decoder on these reconstructed objects
 * 
 * Input to this class are the output from the decoding tools (which just call toString() on the objects created the RRCCoder)
 * The schema of these files is something like JSON - some of the methods below tranform the output from RRCCoder to json format, but this process isn't fully automated yet
 * 
 * @author eemecoy
 *
 */
public class Asn1Encoder {

    public UL_DCCH_Message encodeFile(String fileName) throws IOException, ParseException {
        String message = FileUtilsForTest.readFileFromClasspath(fileName);
        return encodeMessage(message);
    }

    private UL_DCCH_Message encodeMessage(String message) throws ParseException {
        String jsonString = convertToJson(message);
        JSONObject jsonObject = (JSONObject) JSONValue.parseWithException(jsonString);
        return transformToAsn1Object(jsonObject);
    }

    private UL_DCCH_Message transformToAsn1Object(JSONObject jsonObject) {
        short measurementIdentityValue = getMeasurementIdentity(jsonObject);
        MeasurementIdentity measurementIdentity = new MeasurementIdentity(measurementIdentityValue);
        CellMeasuredResults[] cellMeasuredResults = getCellMeasuredResults(jsonObject);
        IntraFreqMeasuredResultsList intraFreqMeasuredResultsList = new IntraFreqMeasuredResultsList(cellMeasuredResults);
        MeasuredResults measuredResults = MeasuredResults.createMeasuredResultsWithIntraFreqMeasuredResultsList(intraFreqMeasuredResultsList);
        MeasuredResultsOnRACH measuredResultsOnRACH = null;
        MeasuredResultsList additionalMeasuredResults = null;
        EventIDIntraFreq eventID = EventIDIntraFreq.e1a; //hard coded for now
        rrc.informationelements.CellMeasurementEventResults.Fdd fdd = getCellMeasurementEventResults(jsonObject);
        CellMeasurementEventResults cellMeasurementEventResults = CellMeasurementEventResults.createCellMeasurementEventResultsWithFdd(fdd);
        IntraFreqEventResults intraFreqEventResults = new IntraFreqEventResults(eventID, cellMeasurementEventResults);
        EventResults eventResults = EventResults.createEventResultsWithIntraFreqEventResults(intraFreqEventResults);
        V390nonCriticalExtensions v390nonCriticalExtensions = null;
        MeasurementReport measurementReport = new MeasurementReport(measurementIdentity, measuredResults, measuredResultsOnRACH, additionalMeasuredResults, eventResults, v390nonCriticalExtensions);
        UL_DCCH_Message ul_DCCH_Message = new UL_DCCH_Message();
        UL_DCCH_MessageType message = new UL_DCCH_MessageType();
        message.setChosenValue(measurementReport);
        message.setChosenFlag(UL_DCCH_MessageType.measurementReport_chosen);
        ul_DCCH_Message.setMessage(message);
        return ul_DCCH_Message;
    }

    private rrc.informationelements.CellMeasurementEventResults.Fdd getCellMeasurementEventResults(JSONObject jsonObject) {
        List<Short> values = getCellMeasurementEventResultsFromJson(jsonObject);
        PrimaryCPICH_Info[] elements = new PrimaryCPICH_Info[values.size()];
        for (int i = 0; i < values.size(); i++) {
            PrimaryScramblingCode primaryScramblingCode = new PrimaryScramblingCode(values.get(i));
            elements[i] = new PrimaryCPICH_Info(primaryScramblingCode);
        }
        rrc.informationelements.CellMeasurementEventResults.Fdd fdd = new rrc.informationelements.CellMeasurementEventResults.Fdd(elements);
        return fdd;
    }

    private List<Short> getCellMeasurementEventResultsFromJson(JSONObject jsonObject) {
        List<Short> values = new ArrayList<Short>();
        JSONObject measurementReport = getMeasurementReportJson(jsonObject);
        JSONObject eventResults = (JSONObject) measurementReport.get("eventResultsXintraFreqEventResults");
        JSONArray fdd = (JSONArray) eventResults.get("cellMeasurementEventResultsXfdd");
        for (int i = 0; i < fdd.size(); i++) {
            JSONObject scramblingCode = (JSONObject) fdd.get(i);
            String value = (String) scramblingCode.get("primaryScramblingCode");
            values.add(Short.valueOf(value));
        }
        return values;

    }

    private CellMeasuredResults[] getCellMeasuredResults(JSONObject jsonObject) {
        int numberOfMeasurements = getNumberOfMeasurements(jsonObject);
        CellMeasuredResults[] cellMeasuredResults = new CellMeasuredResults[numberOfMeasurements];
        for (int i = 0; i < numberOfMeasurements; i++) {
            CellMeasuredResults cellMeasuredResult = getCellMeasuredResult(jsonObject, i);
            cellMeasuredResults[i] = cellMeasuredResult;
        }
        return cellMeasuredResults;
    }

    private CellMeasuredResults getCellMeasuredResult(JSONObject jsonObject, int index) {
        JSONObject modeSpecificInfoFdd = getModeSpecificInfoFdd(jsonObject, index);
        short primaryScramblingCodeValue = getPrimaryScramblingCode(modeSpecificInfoFdd);
        PrimaryScramblingCode primaryScramblingCode = new PrimaryScramblingCode(primaryScramblingCodeValue);
        PrimaryCPICH_Info primaryCPICH_Info = new PrimaryCPICH_Info(primaryScramblingCode);
        short ecno = getEcno(modeSpecificInfoFdd);
        CPICH_Ec_N0 cpich_Ec_N0 = new CPICH_Ec_N0(ecno);
        short rscp = getRscp(modeSpecificInfoFdd);
        CPICH_RSCP cpich_RSCP = new CPICH_RSCP(rscp);
        Fdd fdd = new Fdd(primaryCPICH_Info, cpich_Ec_N0, cpich_RSCP, null);
        ModeSpecificInfo modeSpecificInfo = ModeSpecificInfo.createModeSpecificInfoWithFdd(fdd);
        CellMeasuredResults cellMeasuredResult = new CellMeasuredResults(modeSpecificInfo);
        return cellMeasuredResult;
    }

    private int getNumberOfMeasurements(JSONObject jsonObject) {
        JSONObject measurementReport = getMeasurementReportJson(jsonObject);
        JSONArray list = (JSONArray) measurementReport.get("measuredResultsXintraFreqMeasuredResultsList");
        return list.size();
    }

    private short getRscp(JSONObject modeSpecificInfoFdd) {
        String rscp = (String) modeSpecificInfoFdd.get("cpich-RSCP");
        return Short.parseShort(rscp);
    }

    private short getEcno(JSONObject modeSpecificInfoFdd) {
        String ecno = (String) modeSpecificInfoFdd.get("cpich-Ec-N0");
        return Short.parseShort(ecno);
    }

    private short getPrimaryScramblingCode(JSONObject modeSpecificInfoFdd) {
        JSONObject primaryCpichInfo = (JSONObject) modeSpecificInfoFdd.get("primaryCPICH-Info");
        String primaryScramblingCode = (String) primaryCpichInfo.get("primaryScramblingCode");
        return Short.parseShort(primaryScramblingCode);
    }

    private JSONObject getModeSpecificInfoFdd(JSONObject jsonObject, int index) {
        JSONObject measurementReport = getMeasurementReportJson(jsonObject);
        JSONArray list = (JSONArray) measurementReport.get("measuredResultsXintraFreqMeasuredResultsList");
        JSONObject firstEntry = (JSONObject) list.get(index);

        JSONObject modeSpecificInfoFdd = (JSONObject) firstEntry.get("modeSpecificInfoXfdd");
        return modeSpecificInfoFdd;
    }

    private short getMeasurementIdentity(JSONObject jsonObject) {
        JSONObject measurementReport = getMeasurementReportJson(jsonObject);
        String measurementIdentity = (String) measurementReport.get("measurementIdentity");
        return Short.parseShort(measurementIdentity);
    }

    private JSONObject getMeasurementReportJson(JSONObject jsonObject) {
        JSONObject measurementReport = (JSONObject) jsonObject.get("messageXmeasurementReport");
        return measurementReport;
    }

    private String convertToJson(String string) {
        String updatedWithQuotes = surroundEverythingWithQuotes(string);
        String withColonsAdded = addColons(updatedWithQuotes);
        String withDoubleColonsRemoved = removeDoubleColons(withColonsAdded);
        return removeErroneousTrailingColons(withDoubleColonsRemoved);

    }

    private String removeErroneousTrailingColons(String string) {
        String[] lines = turnIntoListOfLines(string);
        StringBuilder correctedLines = new StringBuilder();
        for (String line : lines) {
            if (lineIsKeyValuePair(line)) {
                String correctedLine = replaceAll(line, ": \\{", " \\{");
                correctedLines.append(correctedLine);
            } else {
                correctedLines.append(line);
            }
            correctedLines.append("\n");
        }
        return correctedLines.toString();
    }

    private boolean lineIsKeyValuePair(String line) {
        return line.contains("\": \"");
    }

    private String[] turnIntoListOfLines(String string) {
        return string.split("\n");
    }

    private String removeDoubleColons(String withColonsAdded) {
        return replaceAll(withColonsAdded, ": :", ":");
    }

    private String addColons(String string) {
        return replaceAll(string, "\" ", "\": ");
    }

    private String replaceAll(final String originalText, final String find, final String replace) {
        final Pattern pattern = Pattern.compile(find);
        final Matcher matcher = pattern.matcher(originalText);
        return matcher.replaceAll(replace);
    }

    private String surroundEverythingWithQuotes(String string) {
        StringBuilder jsonString = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            if (isText(character)) {
                int endOfWord = findEndOfWord(string, i);
                String word = string.substring(i, endOfWord);
                String wordWithQuotes = addQuotes(word);
                jsonString.append(wordWithQuotes);
                i = endOfWord - 1;
            } else {
                jsonString.append(character);
            }
        }
        return jsonString.toString();
    }

    private String addQuotes(String word) {
        return "\"" + word + "\"";
    }

    private int findEndOfWord(String string, int startOfWord) {
        for (int i = startOfWord; i < string.length(); i++) {
            char character = string.charAt(i);
            if (!isText(character)) {
                return i;
            }
        }
        return 0;
    }

    private boolean isText(char character) {
        return Character.isDigit(character) || Character.isLetter(character) || character == '-';
    }

}
