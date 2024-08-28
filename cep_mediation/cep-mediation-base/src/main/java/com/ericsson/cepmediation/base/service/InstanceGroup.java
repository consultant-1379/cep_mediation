package com.ericsson.cepmediation.base.service;

import java.util.HashMap;

public class InstanceGroup
	{
	HashMap<String,PCPService> pcpServices = new HashMap<String,PCPService>();



		public void addInstance(PCPService pcpService) {
			pcpServices.put(pcpService.getClass().getName(), pcpService);
		}

		public PCPService getInstance(Class<?> classType)
		{
			return pcpServices.get(classType.getName());
		}
	}