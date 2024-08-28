package com.ericsson.cepmediation.correlation.support;

import java.io.InputStream;
import java.util.Properties;

 
public class Configurator {
	private static Configurator defaultInstance;
	private static Configurator testInstance;
	private Properties props = null;

	public static Configurator getInstance() {
		if (defaultInstance == null) {
			defaultInstance = new Configurator();
			defaultInstance.props = loadProperties("cep.properties");
		}

		return defaultInstance;
	}
	
	public static Configurator testInstance() {
		if (testInstance == null) {
			testInstance = new Configurator();
			testInstance.props = loadProperties("cep.test.properties");
		}

		return testInstance;
	}

	public Properties getProperties() {
		return props;
	}

	private static Properties loadProperties(String fileName) {
		Properties props = null;
		InputStream is = null;
		try {
			is = Configurator.class.getClassLoader().getResourceAsStream(fileName);
			props = new Properties();
			props.load(is);
		} catch (Exception e) {
            //log
		} finally{
			if(is != null){
				try {
					is.close();
				} catch (Exception ignore) {
				}
			}
		}
		return props;
	}
}
