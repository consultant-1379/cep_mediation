package com.ericsson.cepmediation.base.features;

import java.util.Collection;
import java.util.Set;

/**
 * Convenience class for working with features.
 * 
 * This class extracts information about features from the feature classes
 * and provides this information in convenient format.
 * 
 * @author emicned
 *
 */
public interface FeatureManager {
    public void init();

    public boolean isUserPlaneEnabled();
    
    public boolean isCFAEnabled();
    
    public boolean isHFAEnabled();

    public Collection<CepFeature> getEnabledFeatures();

    public Set<Integer> getEnabledGpehEvents();

    public Set<Integer> getEnabledSgehEvents();

    public Set<String> getEnabledTables();

    public Set<String> getEnabledEpls();

    public Set<Integer> getEnabledUserPlaneEvents();
    
    public long getLicenceReloadInterval();
}
