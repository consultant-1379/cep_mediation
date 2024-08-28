package com.ericsson.cepmediation.correlation.support;

import java.util.Comparator;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;

public final class TimeOnlyApEventBeanComparator implements Comparator<ApEventBean> {

	public static final Comparator<ApEventBean> COMPARATOR = new TimeOnlyApEventBeanComparator();
	
	@Override
	public int compare(final ApEventBean o1, final ApEventBean o2) {
		if(o1 == null || o2 == null) {
			return 0;
		}
		final long t1 = o1.getTimestamp();
		final long t2 = o2.getTimestamp();
		if(t1 < t2) {
			return -1;
		} else if(t1 > t2) {
			return 1;
		} else {			
			return 0;
		}
	}
}
