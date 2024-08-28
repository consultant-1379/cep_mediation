package com.ericsson.cepmediation.correlation.precorrelation.esperservices;

import com.ericsson.cepmediation.correlation.beans.EventAware;
import com.espertech.esper.client.UpdateListener;

public interface EsperService extends EventAware {

    public void deploy(String eplFile);

    public void attachListenerToStatements(UpdateListener listener, String[] statements);
}
