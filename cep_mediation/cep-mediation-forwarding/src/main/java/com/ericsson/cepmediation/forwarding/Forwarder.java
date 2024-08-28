package com.ericsson.cepmediation.forwarding;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.proc.config.ServiceConfigBean;

public interface Forwarder {

    void forward(ApEventBean event);

    void close();

    void init(ServiceConfigBean configData);

}
