package com.ericsson.cepmediation.correlation.beans;

import java.util.List;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.statistics.StatisticsAware;

public interface EventAware extends StatisticsAware {

    void onEvents(List<ApEventBean> events);
}
