package com.ericsson.cepmediation.forwarding;

public class MeasurementTypeDetails {
    
    // Name of the measurement type (directory) in the tech pack e.g. event_e_ran_session, event_e_ran_cfa,...
	private String measurementTypeName;
    
	// Location of the binary files under the measurement type directory e.g. raw/1, raw/2,...
	private String location;
    
	// Indicates whether it is Volume Based or Time Based partitions
	private PartitionTypeEnum partitionType;

	public MeasurementTypeDetails(String measurementTypeName, String location,
			PartitionTypeEnum partitionType) {
		
		this.measurementTypeName = measurementTypeName;
		this.location = location;
		this.partitionType = partitionType;
	}
	
	public String getMeasurementTypeName() {
		return measurementTypeName;
	}
	
	public String getLocation() {
		return location;
	}

	public PartitionTypeEnum getPartitionType() {
		return partitionType;
	}
	
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append('{');
		strBuilder.append("measurementTypeName=").append(measurementTypeName).append(',');
		strBuilder.append("location=").append(location).append(',');
		strBuilder.append("partitionType").append(partitionType.name());
		strBuilder.append('}');
		return strBuilder.toString();
	}
	
}
