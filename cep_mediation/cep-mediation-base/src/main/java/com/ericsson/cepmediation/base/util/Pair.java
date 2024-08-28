package com.ericsson.cepmediation.base.util;

import java.io.Serializable;

@SuppressWarnings("serial")
public final class Pair<First, Second> implements Serializable {

    private final First first;

    private final Second second;

    public Pair(final First first, final Second second) {
        this.first = first;
        this.second = second;
    }

    public First getFirst() {
        return first;
    }

    public Second getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return first + "->" + second;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((first == null) ? 0 : first.hashCode());
        result = prime * result + ((second == null) ? 0 : second.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pair<?, ?> other = (Pair<?, ?>) obj;
        if (first == null) {
            if (other.first != null) {
                return false;
            }
        } else if (!first.equals(other.first)) {
            return false;
        }
        if (second == null) {
            if (other.second != null) {
                return false;
            }
        } else if (!second.equals(other.second)) {
            return false;
        }
        return true;
    }
}
