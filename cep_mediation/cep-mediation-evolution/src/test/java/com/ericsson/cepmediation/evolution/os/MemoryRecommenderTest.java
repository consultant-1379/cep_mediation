package com.ericsson.cepmediation.evolution.os;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.config.bean.FeaturesEnum;
import com.ericsson.cepmediation.config.bean.IncludesType;
import com.ericsson.cepmediation.config.bean.RecommendationType;

public class MemoryRecommenderTest {

    List<RecommendationType> recommendations;

    @Before
    public void init() {
        
        recommendations = new ArrayList<RecommendationType>();
        
        RecommendationType recommendation1 = new RecommendationType();
        IncludesType includes1 = new IncludesType();
        List<FeaturesEnum> features1 = new ArrayList<FeaturesEnum>();
        features1.add(FeaturesEnum.CFA);
        features1.add(FeaturesEnum.HFA);
        includes1.getInclude().addAll(features1);
        recommendation1.setMemorySize("20000");
        recommendation1.setIncludes(includes1);
        recommendations.add(recommendation1);
        
        RecommendationType recommendation2 = new RecommendationType();
        IncludesType includes2 = new IncludesType();                
        List<FeaturesEnum> features2 = new ArrayList<FeaturesEnum>();
        features2.add(FeaturesEnum.CFA);
        features2.add(FeaturesEnum.HFA);
        includes2.getInclude().addAll(features2);
        recommendation2.setMemorySize("6000");
        recommendation2.setIncludes(includes2);
        recommendations.add(recommendation2);
        
        RecommendationType recommendation3 = new RecommendationType();
        IncludesType includes3 = new IncludesType();
        List<FeaturesEnum> features3 = new ArrayList<FeaturesEnum>();
        features3.add(FeaturesEnum.CFA);
        includes3.getInclude().addAll(features3);
        recommendation3.setMemorySize("5000");
        recommendation3.setIncludes(includes3);
        recommendations.add(recommendation3);
        
    }

    @Test
    public void testGetMemory() {
        Collection<FeaturesEnum> enabledFeatures = new HashSet<FeaturesEnum>();
        enabledFeatures.add(FeaturesEnum.CFA);

        MemoryRecommender memoryRecommender = new MemoryRecommender(recommendations, null);
        memoryRecommender.setEnabledFeatures(enabledFeatures);
            
        long memory = memoryRecommender.getMemory();
        assertEquals(5000, memory);

    }

    @Test
    public void testGetMemoryWithoutMatch() {

        Collection<FeaturesEnum> enabledFeatures = new HashSet<FeaturesEnum>();
        enabledFeatures.add(FeaturesEnum.HFA);

        MemoryRecommender memoryRecommender = new MemoryRecommender(recommendations, null);
        memoryRecommender.setEnabledFeatures(enabledFeatures);

        long memory = memoryRecommender.getMemory();
        assertEquals(20000, memory);

    }

}
