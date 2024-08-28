package com.ericsson.cepmediation.base.features.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.features.CepFeature;
import com.ericsson.cepmediation.base.features.FeatureManager;
import com.ericsson.cepmediation.config.bean.FeaturesEnum;

public class FeatureManagerImpl implements FeatureManager {
    private static final Logger logger = LoggerFactory.getLogger(FeatureManagerImpl.class);

    private static final long LICENCE_RELOAD_INTERVAL = 24 * 60 * 60 * 1000;

    private static final FeatureManager instance = new FeatureManagerImpl();

    private Map<FeaturesEnum, CepFeature> enabledFeatures;

    private Set<Integer> enabledGpehEvents;

    private Set<Integer> enabledSgehEvents;

    private Set<Integer> enabledUserPlaneEvents;

    private Set<String> enabledTables;

    private List<String> enabledEpls;

    private ReadWriteLock lock = new ReentrantReadWriteLock();

    public static FeatureManager getInstance() {
        return instance;
    }

    private FeatureManagerImpl() {
    	
    	ThreadFactory reloadThreadFactory = new ThreadFactory() {

    		@Override
    		public Thread newThread(Runnable r) {
    			Thread res = new Thread(r, "features-reloading-thread");
    			res.setDaemon(true);
    			return res;
    		}
    	};

    	Runnable reloadThread = new Runnable(){
    		public void run(){
    			init();
    		}
    	};

    	Executors.newSingleThreadScheduledExecutor(reloadThreadFactory).scheduleAtFixedRate(reloadThread,
    			LICENCE_RELOAD_INTERVAL, LICENCE_RELOAD_INTERVAL, TimeUnit.MILLISECONDS);
    	init();
    }

    public long getLicenceReloadInterval() {
        return LICENCE_RELOAD_INTERVAL;
    }

    @Override
    public void init() {
        lock.writeLock().lock();
        try {
            initEnabledFeatures();
            initEnabledGpehEvents();
            initEnabledSgehEvents();
            initEnabledUserPlaneEvents();
            initEnabledTables();
            initEnabledEpls();
            logger.info("Enabled features: " + toString());
        } finally {
            lock.writeLock().unlock();
        }
    }

    private void initEnabledUserPlaneEvents() {
        enabledUserPlaneEvents = new HashSet<Integer>();
        for (CepFeature f : enabledFeatures.values()) {
            for (Map.Entry<Integer, String> id2name : f.getEvents().entrySet()) {
                if (id2name.getValue().startsWith(CepFeature.USER_PLANE_EVENT_PREFIX)) {
                    enabledUserPlaneEvents.add(id2name.getKey());
                }
            }
        }
    }

    private void initEnabledEpls() {
        enabledEpls = new ArrayList<String>();
        for (CepFeature f : enabledFeatures.values()) {
            for (String epl : f.getEplFiles()) {
                if (!enabledEpls.contains(epl)) {
                    enabledEpls.add(epl);
                }
            }
        }
    }

    private void initEnabledTables() {
        enabledTables = new HashSet<String>();
        for (CepFeature f : enabledFeatures.values()) {
            enabledTables.addAll(f.getTableNames());
        }
    }

    private void initEnabledGpehEvents() {
        enabledGpehEvents = new HashSet<Integer>();
        for (CepFeature f : enabledFeatures.values()) {
            for (Map.Entry<Integer, String> id2name : f.getEvents().entrySet()) {
                if (id2name.getValue().startsWith(CepFeature.GPEH_EVENT_PREFIX)) {
                    enabledGpehEvents.add(id2name.getKey());
                }
            }
        }
    }

    private void initEnabledSgehEvents() {
        enabledSgehEvents = new HashSet<Integer>();
        for (CepFeature f : enabledFeatures.values()) {
            for (Map.Entry<Integer, String> id2name : f.getEvents().entrySet()) {
                if (id2name.getValue().startsWith(CepFeature.SGEH_EVENT_PREFIX)) {
                    enabledSgehEvents.add(id2name.getKey());
                }
            }
        }
    }

    private void initEnabledFeatures() {
        enabledFeatures = new HashMap<FeaturesEnum, CepFeature>();
        CepFeature feature = new WcdmaCfaFeature();
        if (feature.isEnabled() && feature.hasLicence()) {
            enabledFeatures.put(feature.getFeature(), feature);
        }
        feature = new WcdmaHfaFeature();
        if (feature.isEnabled() && feature.hasLicence()) {
            enabledFeatures.put(feature.getFeature(), feature);
        }
        feature = new SessionBrowserFeature();
        if (feature.isEnabled() && feature.hasLicence()) {
            enabledFeatures.put(feature.getFeature(), feature);
        }
        feature = new UERTTFeature();
        if (feature.isEnabled() && feature.hasLicence()) {
            enabledFeatures.put(feature.getFeature(), feature);
        }
        logger.info("enabledFeatures: " + enabledFeatures);
    }

    @Override
    public Collection<CepFeature> getEnabledFeatures() {
        lock.readLock().lock();
        try {
            return new ArrayList<CepFeature>(enabledFeatures.values());
        } finally {
            lock.readLock().unlock();
        }
    }

    @Override
    public boolean isUserPlaneEnabled() {
        lock.readLock().lock();
        try {
            return enabledFeatures.containsKey(FeaturesEnum.SESSION_BROWSER);
        } finally {
            lock.readLock().unlock();
        }
    }

    @Override
    public Set<Integer> getEnabledGpehEvents() {
        lock.readLock().lock();
        try {
            return new HashSet<Integer>(enabledGpehEvents);
        } finally {
            lock.readLock().unlock();
        }
    }

    @Override
    public Set<Integer> getEnabledSgehEvents() {
        lock.readLock().lock();
        try {
            return new HashSet<Integer>(enabledSgehEvents);
        } finally {
            lock.readLock().unlock();
        }
    }

    @Override
    public Set<String> getEnabledTables() {
        lock.readLock().lock();
        try {
            return new HashSet<String>(enabledTables);
        } finally {
            lock.readLock().unlock();
        }
    }

    @Override
    public Set<String> getEnabledEpls() {
        lock.readLock().lock();
        try {
            return new HashSet<String>(enabledEpls);
        } finally {
            lock.readLock().unlock();
        }
    }

    @Override
    public boolean isCFAEnabled() {
        return enabledFeatures.containsKey(FeaturesEnum.CFA);
    }

    @Override
    public boolean isHFAEnabled() {
        return enabledFeatures.containsKey(FeaturesEnum.HFA);
    }

    @Override
    public Set<Integer> getEnabledUserPlaneEvents() {
        lock.readLock().lock();
        try {
            return new HashSet<Integer>(enabledUserPlaneEvents);
        } finally {
            lock.readLock().unlock();
        }
    }

    @Override
    public String toString() {
        return "FeatureManagerImpl [enabledFeatures=" + enabledFeatures + ", enabledGpehEvents=" + enabledGpehEvents + ", enabledSgehEvents="
                + enabledSgehEvents + ", enabledUserPlaneEvents=" + enabledUserPlaneEvents + ", enabledTables=" + enabledTables + ", enabledEpls="
                + enabledEpls + "]";
    }
    
}
