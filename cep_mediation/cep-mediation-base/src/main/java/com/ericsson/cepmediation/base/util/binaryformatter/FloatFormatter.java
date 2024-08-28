package com.ericsson.cepmediation.base.util.binaryformatter;

public abstract class FloatFormatter {
    public static byte[] doFormat(final float value, final boolean isLittleEndian, final boolean isNull) {
        final int rawInt = Float.floatToIntBits(value);
        return IntFormatter.doFormat(rawInt, isLittleEndian, isNull);
    }
}
