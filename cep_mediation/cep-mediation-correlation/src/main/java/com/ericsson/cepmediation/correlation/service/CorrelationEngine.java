package com.ericsson.cepmediation.correlation.service;

import java.util.List;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;

public interface CorrelationEngine {

    public void onEvents(final List<ApEventBean> events);
}
