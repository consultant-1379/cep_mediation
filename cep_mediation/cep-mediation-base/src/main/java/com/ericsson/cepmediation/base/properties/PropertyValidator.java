/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.properties;

import com.ericsson.cepmediation.base.util.Pair;
import com.ericsson.cepmediation.config.bean.AppStartTypeEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author EEMECOY
 */
public class PropertyValidator {

    public void checkStartUpPropertiesPresent(AppStartTypeEnum type) throws ConfigurationException {
        final List<Pair<String,AppStartTypeEnum>> requiredProperties = getRequiredProperties();
        final Map<String, String> propertiesConfiguredByUser = getPropertiesConfiguredByUser();
        for (final Pair<String,AppStartTypeEnum> requiredProperty : requiredProperties) {
            if (!propertiesConfiguredByUser.containsKey(requiredProperty.getFirst())  && requiredProperty.getSecond().equals(type)) {
                throw new MissingSystemPropertyException(requiredProperty.getFirst());
            }
        }

    }

    Map<String, String> getPropertiesConfiguredByUser() {
        return ConfigBinder.getInstance().getProperties();
    }

    private List<Pair<String,AppStartTypeEnum>> getRequiredProperties() {
        final List<Pair<String,AppStartTypeEnum>> requiredProperties = new ArrayList<Pair<String,AppStartTypeEnum>>();
        final CepMediationProperty[] cepMediationProperties = CepMediationProperty.values();
        for (final CepMediationProperty cepMediationProperty : cepMediationProperties) {

                requiredProperties.add( new Pair<String, AppStartTypeEnum>(cepMediationProperty.getPropertyName(),cepMediationProperty.getRequiredAppStartTypeEnum()));
        }
        return requiredProperties;
    }
}
