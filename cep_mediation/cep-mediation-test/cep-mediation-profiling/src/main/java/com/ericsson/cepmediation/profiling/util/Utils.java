package com.ericsson.cepmediation.profiling.util;

public class Utils {
    private static final String ETC_STRING = "...";

    private static final int COL_LENGTH = 30;

    public static String formatLine(Object[] tokens) {
        StringBuilder line = new StringBuilder();
        for (Object o : tokens) {
            line.append(formatValue(o));
        }
        return line.toString();
    }

    public static String formatValue(Object o) {
        String res = o.toString();
        if (res.length() > COL_LENGTH) {
            res = res.substring(0, COL_LENGTH - ETC_STRING.length()) + ETC_STRING;
        } else if (res.length() != COL_LENGTH) {
            while (res.length() != COL_LENGTH) {
                res += " ";
            }
        }

        return res;

    }

    public static int calcPercentage(int perc, int total) {
        return (int) Math.round(new Double((perc * 100) / total));
    }

}
