package com.ericsson.cepmediation.server.management.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

import com.ericsson.cepmediation.server.management.AgentData;
import com.ericsson.cepmediation.server.management.util.AdminHelper;
import com.ericsson.cepmediation.server.management.util.CouldNotConnectToRMIServiceException;

public class SystemRegistry extends Observable {
    private static SystemRegistry hbRegistry;

    private final Map<String, AgentData> hashMap = new HashMap<String, AgentData>();

    private SystemRegistry() {

    }

    public static SystemRegistry getInstance() {
        if (hbRegistry == null) {
            hbRegistry = new SystemRegistry();
        }
        return hbRegistry;
    }

    //Add server to registry
    public void register(final AgentData data) throws CouldNotConnectToRMIServiceException {
        connect(data);
        hashMap.put(data.getHost(), data);
        setChanged();
        notifyObservers(data);
    }

    protected void connect(final AgentData data) throws CouldNotConnectToRMIServiceException {
        AdminHelper.connect(data);
    }

    //Remove server from registry
    public void unRegister(final String ip) {
        final AgentData remove = hashMap.remove(ip);

        if (remove != null) {
            remove.setReachable(false);
            setChanged();
            notifyObservers(remove);
        }
    }

    //Get server from registry
    public AgentData getRemoteObject(final String ip) {
        return hashMap.get(ip);
    }

    //Get total list of servers in registry
    public java.util.List<AgentData> getAllServerList() {
        final java.util.List<AgentData> beans = new ArrayList<AgentData>();
        for (final String ip : hashMap.keySet()) {
            beans.add(hashMap.get(ip));
        }
        return beans;
    }

}