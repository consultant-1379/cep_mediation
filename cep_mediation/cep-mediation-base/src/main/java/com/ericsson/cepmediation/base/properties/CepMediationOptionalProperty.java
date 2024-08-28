package com.ericsson.cepmediation.base.properties;

import com.ericsson.cepmediation.config.bean.AppStartTypeEnum;

public enum CepMediationOptionalProperty implements Property{
	MEMORY_MANAGEMENT_HINTS("memory.management.hints", AppStartTypeEnum.CEP_MEDIATION);
	
	private String propertyName;

    private AppStartTypeEnum optionalAppStartTypeEnum;

    CepMediationOptionalProperty(final String propertyName, final AppStartTypeEnum required) {
        this.propertyName = propertyName;
        this.optionalAppStartTypeEnum = required;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public AppStartTypeEnum getAppStartTypeEnum() {
        return this.optionalAppStartTypeEnum;
    }

    
}
