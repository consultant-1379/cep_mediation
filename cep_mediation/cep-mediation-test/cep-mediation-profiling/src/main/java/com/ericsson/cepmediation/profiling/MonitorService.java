package com.ericsson.cepmediation.profiling;

import java.util.Date;
import java.util.List;

public interface MonitorService  {
	public void init(Date start, String[] args);
	
	public List<String> getData(INTERVALS interval);
	
	public String getSummary();

	public void shutdown();
}
