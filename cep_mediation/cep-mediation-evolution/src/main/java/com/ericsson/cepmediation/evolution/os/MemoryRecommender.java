package com.ericsson.cepmediation.evolution.os;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.features.CepFeature;
import com.ericsson.cepmediation.config.bean.FeaturesEnum;
import com.ericsson.cepmediation.config.bean.RecommendationType;

/**
 * This class is used to determine the recommendation memory
 * 
 * @author exuexie
 *
 */
public class MemoryRecommender {

    private static final Logger logger = LoggerFactory.getLogger(MemoryRecommender.class);

    Map<Integer, Collection<FeaturesEnum>> includedFeatures;;

    Map<Integer, Long> memories;

    Collection<FeaturesEnum> enabledFeatures;

    public MemoryRecommender(List<RecommendationType> recommendations, Collection<CepFeature> features) {

        memories = new HashMap<Integer, Long>();
        includedFeatures = new HashMap<Integer, Collection<FeaturesEnum>>();
        enabledFeatures = new HashSet<FeaturesEnum>();

        init(recommendations);
        init(features);

    }

    private void init(Collection<CepFeature> features) {

        if (features != null) {

            for (CepFeature feature : features) {

                enabledFeatures.add(feature.getFeature());
            }
        }

    }

    private void init(List<RecommendationType> recommendations) {

        for (int i = 0; i < recommendations.size(); i++) {

            RecommendationType recommendation = recommendations.get(i);

            logger.debug("memory:" + Long.valueOf(recommendation.getMemorySize()));

            memories.put(i, Long.valueOf(recommendation.getMemorySize()));

            for (FeaturesEnum feature : recommendation.getIncludes().getInclude()) {

                if (includedFeatures.get(i) == null) {

                    includedFeatures.put(i, new HashSet<FeaturesEnum>());
                }

                includedFeatures.get(i).add(feature);
            }
        }

    }

    /**
     * Assign enabled features, mainly for testing purpose
     * @param enabledFeatures
     */
    public void setEnabledFeatures(Collection<FeaturesEnum> enabledFeatures) {

        this.enabledFeatures.clear();
        this.enabledFeatures.addAll(enabledFeatures);

    }

    public long getMemory() {

        for (Integer idx : includedFeatures.keySet()) {

            if (includedFeatures.get(idx).equals(enabledFeatures)) {

                return memories.get(idx);
            }

        }

        return getMaxMemory();

    }

    private long getMaxMemory() {

        long max = 0;

        for (Integer idx : memories.keySet()) {

            if (memories.get(idx) > max) {

                max = memories.get(idx);
            }
        }

        return max;

    }

}
