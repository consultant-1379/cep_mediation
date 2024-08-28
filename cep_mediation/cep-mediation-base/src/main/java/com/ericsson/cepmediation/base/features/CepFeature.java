package com.ericsson.cepmediation.base.features;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ericsson.cepmediation.config.bean.FeaturesEnum;
/**
 * This class encapsulates information for a feature like raw events, epl files etc.
 * 
 * The information is needed to completely or partially disable certain services so that
 * no additional system resources are unnecessarily used if the feature is disabled.
 * 
 * @author emicned
 *
 */
public interface CepFeature {
    /**
     * Prefix for all gpeh files in the events map as per getEvents().
     */
    public String GPEH_EVENT_PREFIX = "gpeh.";

    /**
     * Prefix for all sgeh files in the events map as per getEvents().
     */    
    public String SGEH_EVENT_PREFIX = "ebm.";
    
    /**
     * Prefix for all user plane files in the events map as per getEvents().
     */    
    public String USER_PLANE_EVENT_PREFIX = "bearer_plane.";
    
    /**
     * Indicates whether the feature is enabled in the config file.
     */
    public boolean isEnabled();
    
    /**
     * Indicates if there is a valid licence for this feature.
     */
    public boolean hasLicence();
    
    /**
     * The feature(CFA,HFA etc).
     */
    public FeaturesEnum getFeature();
    
    /**
     * The raw events required by this feature.
     */
    public Map<Integer, String> getEvents();
    
    /**
     * The epl files with correlation logic for this feature.
     */
    public List<String> getEplFiles();
    
    /**
     * The tables in which correlated events are stored.
     */
    public Set<String> getTableNames();

}
