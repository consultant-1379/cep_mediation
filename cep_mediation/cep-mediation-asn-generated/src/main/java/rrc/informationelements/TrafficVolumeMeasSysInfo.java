/*************************************************************/
/* Copyright (C) 2012 OSS Nokalva, Inc.  All rights reserved.*/
/*************************************************************/

/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.
 * AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.
 * THIS FILE MAY NOT BE DISTRIBUTED. */

/* Generated for: LM Ericsson Ltd, Athlone, Ireland - License 11536 for Solaris x86 */
/* Abstract syntax: class-definitions */
/* ASN.1 Java project: rrc.Rrc */
/* Created: Wed Feb 15 12:27:03 2012 */
/* ASN.1 Compiler for Java version: 4.1 */
/* ASN.1 compiler options and file names specified:
 * -output rrc -uper -root constants.asn ie-definitions.asn internode.asn
 * pdu-definitions.asn class-definitions.asn
 */


package rrc.informationelements;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type TrafficVolumeMeasSysInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class TrafficVolumeMeasSysInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public TrafficVolumeMeasSysInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TrafficVolumeMeasSysInfo(MeasurementIdentity trafficVolumeMeasurementID, 
		    TrafficVolumeMeasurementObjectList trafficVolumeMeasurementObjectList, 
		    TrafficVolumeMeasQuantity trafficVolumeMeasQuantity, 
		    TrafficVolumeReportingQuantity trafficVolumeReportingQuantity, 
		    TrafficVolumeReportingCriteria dummy, 
		    MeasurementValidity measurementValidity, 
		    MeasurementReportingMode measurementReportingMode, 
		    TrafficVolumeReportCriteriaSysInfo reportCriteriaSysInf)
    {
	setTrafficVolumeMeasurementID(trafficVolumeMeasurementID);
	setTrafficVolumeMeasurementObjectList(trafficVolumeMeasurementObjectList);
	setTrafficVolumeMeasQuantity(trafficVolumeMeasQuantity);
	setTrafficVolumeReportingQuantity(trafficVolumeReportingQuantity);
	setDummy(dummy);
	setMeasurementValidity(measurementValidity);
	setMeasurementReportingMode(measurementReportingMode);
	setReportCriteriaSysInf(reportCriteriaSysInf);
    }
    
    /**
     * Construct with required components.
     */
    public TrafficVolumeMeasSysInfo(MeasurementReportingMode measurementReportingMode, 
		    TrafficVolumeReportCriteriaSysInfo reportCriteriaSysInf)
    {
	setMeasurementReportingMode(measurementReportingMode);
	setReportCriteriaSysInf(reportCriteriaSysInf);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MeasurementIdentity();
	mComponents[1] = new TrafficVolumeMeasurementObjectList();
	mComponents[2] = new TrafficVolumeMeasQuantity();
	mComponents[3] = new TrafficVolumeReportingQuantity();
	mComponents[4] = new TrafficVolumeReportingCriteria();
	mComponents[5] = new MeasurementValidity();
	mComponents[6] = new MeasurementReportingMode();
	mComponents[7] = new TrafficVolumeReportCriteriaSysInfo();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[8];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new MeasurementIdentity();
	    case 1:
		return new TrafficVolumeMeasurementObjectList();
	    case 2:
		return new TrafficVolumeMeasQuantity();
	    case 3:
		return new TrafficVolumeReportingQuantity();
	    case 4:
		return new TrafficVolumeReportingCriteria();
	    case 5:
		return new MeasurementValidity();
	    case 6:
		return new MeasurementReportingMode();
	    case 7:
		return new TrafficVolumeReportCriteriaSysInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    // Default Values
    public static final MeasurementIdentity trafficVolumeMeasurementID__default = 
	new MeasurementIdentity(4);
    
    // Methods for field "trafficVolumeMeasurementID"
    public MeasurementIdentity getTrafficVolumeMeasurementID()
    {
	if (hasTrafficVolumeMeasurementID())
	    return (MeasurementIdentity)mComponents[0];
	else
	    return (MeasurementIdentity)trafficVolumeMeasurementID__default.clone();
    }
    
    public void setTrafficVolumeMeasurementID(MeasurementIdentity trafficVolumeMeasurementID)
    {
	mComponents[0] = trafficVolumeMeasurementID;
    }
    
    public void setTrafficVolumeMeasurementIDToDefault()
    {
	setTrafficVolumeMeasurementID(trafficVolumeMeasurementID__default);
    }
    
    public boolean hasDefaultTrafficVolumeMeasurementID()
    {
	return true;
    }
    
    public boolean hasTrafficVolumeMeasurementID()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTrafficVolumeMeasurementID()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "trafficVolumeMeasurementObjectList"
    public TrafficVolumeMeasurementObjectList getTrafficVolumeMeasurementObjectList()
    {
	return (TrafficVolumeMeasurementObjectList)mComponents[1];
    }
    
    public void setTrafficVolumeMeasurementObjectList(TrafficVolumeMeasurementObjectList trafficVolumeMeasurementObjectList)
    {
	mComponents[1] = trafficVolumeMeasurementObjectList;
    }
    
    public boolean hasTrafficVolumeMeasurementObjectList()
    {
	return componentIsPresent(1);
    }
    
    public void deleteTrafficVolumeMeasurementObjectList()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "trafficVolumeMeasQuantity"
    public TrafficVolumeMeasQuantity getTrafficVolumeMeasQuantity()
    {
	return (TrafficVolumeMeasQuantity)mComponents[2];
    }
    
    public void setTrafficVolumeMeasQuantity(TrafficVolumeMeasQuantity trafficVolumeMeasQuantity)
    {
	mComponents[2] = trafficVolumeMeasQuantity;
    }
    
    public boolean hasTrafficVolumeMeasQuantity()
    {
	return componentIsPresent(2);
    }
    
    public void deleteTrafficVolumeMeasQuantity()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "trafficVolumeReportingQuantity"
    public TrafficVolumeReportingQuantity getTrafficVolumeReportingQuantity()
    {
	return (TrafficVolumeReportingQuantity)mComponents[3];
    }
    
    public void setTrafficVolumeReportingQuantity(TrafficVolumeReportingQuantity trafficVolumeReportingQuantity)
    {
	mComponents[3] = trafficVolumeReportingQuantity;
    }
    
    public boolean hasTrafficVolumeReportingQuantity()
    {
	return componentIsPresent(3);
    }
    
    public void deleteTrafficVolumeReportingQuantity()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "dummy"
    public TrafficVolumeReportingCriteria getDummy()
    {
	return (TrafficVolumeReportingCriteria)mComponents[4];
    }
    
    public void setDummy(TrafficVolumeReportingCriteria dummy)
    {
	mComponents[4] = dummy;
    }
    
    public boolean hasDummy()
    {
	return componentIsPresent(4);
    }
    
    public void deleteDummy()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "measurementValidity"
    public MeasurementValidity getMeasurementValidity()
    {
	return (MeasurementValidity)mComponents[5];
    }
    
    public void setMeasurementValidity(MeasurementValidity measurementValidity)
    {
	mComponents[5] = measurementValidity;
    }
    
    public boolean hasMeasurementValidity()
    {
	return componentIsPresent(5);
    }
    
    public void deleteMeasurementValidity()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "measurementReportingMode"
    public MeasurementReportingMode getMeasurementReportingMode()
    {
	return (MeasurementReportingMode)mComponents[6];
    }
    
    public void setMeasurementReportingMode(MeasurementReportingMode measurementReportingMode)
    {
	mComponents[6] = measurementReportingMode;
    }
    
    
    // Methods for field "reportCriteriaSysInf"
    public TrafficVolumeReportCriteriaSysInfo getReportCriteriaSysInf()
    {
	return (TrafficVolumeReportCriteriaSysInfo)mComponents[7];
    }
    
    public void setReportCriteriaSysInf(TrafficVolumeReportCriteriaSysInfo reportCriteriaSysInf)
    {
	mComponents[7] = reportCriteriaSysInf;
    }
    
    
    /**
     * Initialize the type descriptor.
     */
    private static final SequenceInfo c_typeinfo = new SequenceInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "TrafficVolumeMeasSysInfo"
	),
	new QName (
	    "InformationElements",
	    "TrafficVolumeMeasSysInfo"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MeasurementIdentity"
			    ),
			    new QName (
				"InformationElements",
				"MeasurementIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MeasurementIdentity(1), 
				    new MeasurementIdentity(16),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "trafficVolumeMeasurementID",
		    0,
		    3,
		    trafficVolumeMeasurementID__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TrafficVolumeMeasurementObjectList"
			    ),
			    new QName (
				"InformationElements",
				"TrafficVolumeMeasurementObjectList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(32),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "UL_TrCH_Identity"
				)
			    )
			)
		    ),
		    "trafficVolumeMeasurementObjectList",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TrafficVolumeMeasQuantity"
			    ),
			    new QName (
				"InformationElements",
				"TrafficVolumeMeasQuantity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TrafficVolumeMeasQuantity"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2)
				}
			    )
			)
		    ),
		    "trafficVolumeMeasQuantity",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TrafficVolumeReportingQuantity"
			    ),
			    new QName (
				"InformationElements",
				"TrafficVolumeReportingQuantity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TrafficVolumeReportingQuantity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "TrafficVolumeReportingQuantity"
				)
			    ),
			    0
			)
		    ),
		    "trafficVolumeReportingQuantity",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TrafficVolumeReportingCriteria"
			    ),
			    new QName (
				"InformationElements",
				"TrafficVolumeReportingCriteria"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TrafficVolumeReportingCriteria"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "TrafficVolumeReportingCriteria"
				)
			    ),
			    0
			)
		    ),
		    "dummy",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MeasurementValidity"
			    ),
			    new QName (
				"InformationElements",
				"MeasurementValidity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementValidity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementValidity"
				)
			    ),
			    0
			)
		    ),
		    "measurementValidity",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MeasurementReportingMode"
			    ),
			    new QName (
				"InformationElements",
				"MeasurementReportingMode"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementReportingMode"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementReportingMode"
				)
			    ),
			    0
			)
		    ),
		    "measurementReportingMode",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TrafficVolumeReportCriteriaSysInfo"
			    ),
			    new QName (
				"InformationElements",
				"TrafficVolumeReportCriteriaSysInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TrafficVolumeReportCriteriaSysInfo"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "reportCriteriaSysInf",
		    7,
		    2,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TrafficVolumeMeasSysInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TrafficVolumeMeasSysInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TrafficVolumeMeasSysInfo
