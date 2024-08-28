package com.ericsson.cepmediation.base.util;

public final class Triple<First, Second, Third> {

    private final First first;

    private final Second second;

    private final Third third;

    public Triple(final First first, final Second second, final Third third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public First getFirst() {
        return first;
    }

    public Second getSecond() {
        return second;
    }

    public Third getThird() {
        return third;
    }
}
