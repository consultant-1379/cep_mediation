package com.ericsson.cepmediation.profiling;

public enum INTERVALS {
	ONE_MIN(60 * 1000), FIVE_MINS(5 * 60 * 1000), FIFTEEN_MINUTES(15 * 60 * 1000), THIRTY_MINS(30 * 60 * 1000), ONE_HOUR(60 * 60 * 1000), THREE_HOURS(
			3 * 60 * 60 * 1000);

	private int millis;

	INTERVALS(int millis) {
		this.millis = millis;
	}

	public int getMillis() {
		return millis;
	}
}
