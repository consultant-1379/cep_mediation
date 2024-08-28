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
 * Define the ASN1 Type TrafficVolumeMeasurement from ASN1 Module InformationElements.
 * @see Sequence
 */

public class TrafficVolumeMeasurement extends Sequence {
    
    /**
     * The default constructor.
     */
    public TrafficVolumeMeasurement()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TrafficVolumeMeasurement(TrafficVolumeMeasurementObjectList trafficVolumeMeasurementObjectList, 
		    TrafficVolumeMeasQuantity trafficVolumeMeasQuantity, 
		    TrafficVolumeReportingQuantity trafficVolumeReportingQuantity, 
		    MeasurementValidity measurementValidity, 
		    TrafficVolumeReportCriteria reportCriteria)
    {
	setTrafficVolumeMeasurementObjectList(trafficVolumeMeasurementObjectList);
	setTrafficVolumeMeasQuantity(trafficVolumeMeasQuantity);
	setTrafficVolumeReportingQuantity(trafficVolumeReportingQuantity);
	setMeasurementValidity(measurementValidity);
	setReportCriteria(reportCriteria);
    }
    
    /**
     * Construct with required components.
     */
    public TrafficVolumeMeasurement(TrafficVolumeReportCriteria reportCriteria)
    {
	setReportCriteria(reportCriteria);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TrafficVolumeMeasurementObjectList();
	mComponents[1] = new TrafficVolumeMeasQuantity();
	mComponents[2] = new TrafficVolumeReportingQuantity();
	mComponents[3] = new MeasurementValidity();
	mComponents[4] = new TrafficVolumeReportCriteria();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new TrafficVolumeMeasurementObjectList();
	    case 1:
		return new TrafficVolumeMeasQuantity();
	    case 2:
		return new TrafficVolumeReportingQuantity();
	    case 3:
		return new MeasurementValidity();
	    case 4:
		return new TrafficVolumeReportCriteria();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "trafficVolumeMeasurementObjectList"
    public TrafficVolumeMeasurementObjectList getTrafficVolumeMeasurementObjectList()
    {
	return (TrafficVolumeMeasurementObjectList)mComponents[0];
    }
    
    public void setTrafficVolumeMeasurementObjectList(TrafficVolumeMeasurementObjectList trafficVolumeMeasurementObjectList)
    {
	mComponents[0] = trafficVolumeMeasurementObjectList;
    }
    
    public boolean hasTrafficVolumeMeasurementObjectList()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTrafficVolumeMeasurementObjectList()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "trafficVolumeMeasQuantity"
    public TrafficVolumeMeasQuantity getTrafficVolumeMeasQuantity()
    {
	return (TrafficVolumeMeasQuantity)mComponents[1];
    }
    
    public void setTrafficVolumeMeasQuantity(TrafficVolumeMeasQuantity trafficVolumeMeasQuantity)
    {
	mComponents[1] = trafficVolumeMeasQuantity;
    }
    
    public boolean hasTrafficVolumeMeasQuantity()
    {
	return componentIsPresent(1);
    }
    
    public void deleteTrafficVolumeMeasQuantity()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "trafficVolumeReportingQuantity"
    public TrafficVolumeReportingQuantity getTrafficVolumeReportingQuantity()
    {
	return (TrafficVolumeReportingQuantity)mComponents[2];
    }
    
    public void setTrafficVolumeReportingQuantity(TrafficVolumeReportingQuantity trafficVolumeReportingQuantity)
    {
	mComponents[2] = trafficVolumeReportingQuantity;
    }
    
    public boolean hasTrafficVolumeReportingQuantity()
    {
	return componentIsPresent(2);
    }
    
    public void deleteTrafficVolumeReportingQuantity()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "measurementValidity"
    public MeasurementValidity getMeasurementValidity()
    {
	return (MeasurementValidity)mComponents[3];
    }
    
    public void setMeasurementValidity(MeasurementValidity measurementValidity)
    {
	mComponents[3] = measurementValidity;
    }
    
    public boolean hasMeasurementValidity()
    {
	return componentIsPresent(3);
    }
    
    public void deleteMeasurementValidity()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "reportCriteria"
    public TrafficVolumeReportCriteria getReportCriteria()
    {
	return (TrafficVolumeReportCriteria)mComponents[4];
    }
    
    public void setReportCriteria(TrafficVolumeReportCriteria reportCriteria)
    {
	mComponents[4] = reportCriteria;
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
	    "TrafficVolumeMeasurement"
	),
	new QName (
	    "InformationElements",
	    "TrafficVolumeMeasurement"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TrafficVolumeReportCriteria"
			    ),
			    new QName (
				"InformationElements",
				"TrafficVolumeReportCriteria"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TrafficVolumeReportCriteria"
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
		    "reportCriteria",
		    4,
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
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TrafficVolumeMeasurement object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TrafficVolumeMeasurement object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TrafficVolumeMeasurement
