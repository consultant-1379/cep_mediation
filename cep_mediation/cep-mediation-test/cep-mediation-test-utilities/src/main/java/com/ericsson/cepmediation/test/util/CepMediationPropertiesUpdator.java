package com.ericsson.cepmediation.test.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.ericsson.cepmediation.base.properties.CepMediationProperties;

public class CepMediationPropertiesUpdator {
    private PrivateFieldAccessor propertiesAccessor;

    private Map<String, String> originalProps = new HashMap<String, String>();

    public CepMediationPropertiesUpdator() {
        try {
            propertiesAccessor = new PrivateFieldAccessor(CepMediationProperties.getInstance(), "cepMediationProperties");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void restoreOriginalValues() {
        for (String key : originalProps.keySet()) {
            setPropVal(key, originalProps.get(key));
        }
    }

    public void setPropVal(String key, String val) {
        try {
            Properties props = (Properties) propertiesAccessor.getVal();
            String original = props.getProperty(key);
            props.put(key, val);
            if (!originalProps.containsKey(key)) {
                originalProps.put(key, original);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
