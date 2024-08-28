/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2013 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.eniq.events.cepmediation.datagen_precook.gpeh.eventprocessor.oneminrops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author eeikonl
 * @since 2013
 *
 */
public class OneMinuteRopFileNames {
    private static final String REPLACE_REGEX = "^(A\\d*\\.)\\d\\d\\d\\d(-)\\d\\d\\d\\d(.*)";

    private static final String MINUTE_REGEX = "^A\\d*\\.\\d\\d(\\d\\d)-\\d\\d\\d\\d.*";

    private final Map<String, List<String>> _15MinRops;

    public OneMinuteRopFileNames() {
        _15MinRops = new HashMap<String, List<String>>();
        List<String> rops = new ArrayList<String>();
        rops.add("00-01");
        rops.add("01-02");
        rops.add("02-03");
        rops.add("03-04");
        rops.add("04-05");
        rops.add("05-06");
        rops.add("06-07");
        rops.add("07-08");
        rops.add("08-09");
        rops.add("09-10");
        rops.add("10-11");
        rops.add("11-12");
        rops.add("12-13");
        rops.add("13-14");
        rops.add("14-15");
        _15MinRops.put("00", rops);
        rops = new ArrayList<String>();
        rops.add("15-16");
        rops.add("16-17");
        rops.add("17-18");
        rops.add("18-19");
        rops.add("19-20");
        rops.add("20-21");
        rops.add("21-22");
        rops.add("22-23");
        rops.add("23-24");
        rops.add("24-25");
        rops.add("25-26");
        rops.add("26-27");
        rops.add("27-28");
        rops.add("28-29");
        rops.add("29-30");
        _15MinRops.put("15", rops);
        rops = new ArrayList<String>();
        rops.add("30-31");
        rops.add("31-32");
        rops.add("32-33");
        rops.add("33-34");
        rops.add("34-35");
        rops.add("35-36");
        rops.add("36-37");
        rops.add("37-38");
        rops.add("38-39");
        rops.add("39-40");
        rops.add("40-41");
        rops.add("41-42");
        rops.add("42-43");
        rops.add("43-44");
        rops.add("44-45");
        _15MinRops.put("30", rops);
        rops = new ArrayList<String>();
        rops.add("45-46");
        rops.add("46-47");
        rops.add("47-48");
        rops.add("48-49");
        rops.add("49-50");
        rops.add("50-51");
        rops.add("51-52");
        rops.add("52-53");
        rops.add("53-54");
        rops.add("54-55");
        rops.add("55-56");
        rops.add("56-57");
        rops.add("57-58");
        rops.add("58-59");
        rops.add("59-00");
        _15MinRops.put("45", rops);

    }

    public List<String> getFileNames(final String currentFileName) {
        final List<String> fileNames = new ArrayList<String>();

        final List<String> oneMinList = _15MinRops.get(getCurrentRopStartMinute(currentFileName));

        final String startHour = getCurrentRopStartHour(currentFileName);

        final String endHour = getCurrentRopsEndHour(currentFileName);

        for (int i = 0; i < oneMinList.size(); i++) {
            //bug fix for the case where rop is 1545-1600
            String filename = oneMinList.size() == i + 1 ? getNewRopFileName(currentFileName, oneMinList.get(i),
                    startHour, endHour) : getNewRopFileName(currentFileName, oneMinList.get(i), startHour, startHour);
            fileNames.add(filename);
        }

        return fileNames;
    }

    /**
     * @param currentFileName
     * @return
     */
    private String getCurrentRopsEndHour(String currentFileName) {
        final String pattern = "^A\\d*\\.\\d\\d\\d\\d-(\\d\\d)\\d\\d.*";
        return currentFileName.replaceAll(pattern, "$1");
    }

    /**
     * @param get Current Rop Starting hour
     * @return
     */
    private String getCurrentRopStartHour(String currentFileName) {
        final String pattern = "^A\\d*\\.(\\d\\d)\\d\\d-\\d\\d\\d\\d.*";
        return currentFileName.replaceAll(pattern, "$1");
    }

    /**
     * @param get Current Rop ending hour
     */
    private String getCurrentRopStartMinute(final String currentFileName) {
        final String pattern = MINUTE_REGEX;

        return currentFileName.replaceAll(pattern, "$1");
    }

    private String getNewRopFileName(final String fileName, final String newTimes, final String startHour,
            final String endHour) {
        final String[] split = newTimes.split("-");
        final String pattern = REPLACE_REGEX;

        return fileName.replaceAll(pattern, "$1" + startHour + "" + split[0] + "$2" + endHour + "" + split[1] + "$3");
    }

}
