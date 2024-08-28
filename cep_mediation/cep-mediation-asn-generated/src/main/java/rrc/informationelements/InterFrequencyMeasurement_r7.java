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
 * Define the ASN1 Type InterFrequencyMeasurement_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class InterFrequencyMeasurement_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public InterFrequencyMeasurement_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InterFrequencyMeasurement_r7(InterFreqCellInfoList_r4 interFreqCellInfoList, 
		    InterFreqMeasQuantity interFreqMeasQuantity, 
		    InterFreqReportingQuantity interFreqReportingQuantity, 
		    MeasurementValidity measurementValidity, 
		    UE_AutonomousUpdateMode interFreqSetUpdate, 
		    InterFreqReportCriteria_r7 reportCriteria)
    {
	setInterFreqCellInfoList(interFreqCellInfoList);
	setInterFreqMeasQuantity(interFreqMeasQuantity);
	setInterFreqReportingQuantity(interFreqReportingQuantity);
	setMeasurementValidity(measurementValidity);
	setInterFreqSetUpdate(interFreqSetUpdate);
	setReportCriteria(reportCriteria);
    }
    
    /**
     * Construct with required components.
     */
    public InterFrequencyMeasurement_r7(InterFreqCellInfoList_r4 interFreqCellInfoList, 
		    InterFreqReportCriteria_r7 reportCriteria)
    {
	setInterFreqCellInfoList(interFreqCellInfoList);
	setReportCriteria(reportCriteria);
    }
    
    public void initComponents()
    {
	mComponents[0] = new InterFreqCellInfoList_r4();
	mComponents[1] = new InterFreqMeasQuantity();
	mComponents[2] = new InterFreqReportingQuantity();
	mComponents[3] = new MeasurementValidity();
	mComponents[4] = new UE_AutonomousUpdateMode();
	mComponents[5] = new InterFreqReportCriteria_r7();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[6];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new InterFreqCellInfoList_r4();
	    case 1:
		return new InterFreqMeasQuantity();
	    case 2:
		return new InterFreqReportingQuantity();
	    case 3:
		return new MeasurementValidity();
	    case 4:
		return new UE_AutonomousUpdateMode();
	    case 5:
		return new InterFreqReportCriteria_r7();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "interFreqCellInfoList"
    public InterFreqCellInfoList_r4 getInterFreqCellInfoList()
    {
	return (InterFreqCellInfoList_r4)mComponents[0];
    }
    
    public void setInterFreqCellInfoList(InterFreqCellInfoList_r4 interFreqCellInfoList)
    {
	mComponents[0] = interFreqCellInfoList;
    }
    
    
    // Methods for field "interFreqMeasQuantity"
    public InterFreqMeasQuantity getInterFreqMeasQuantity()
    {
	return (InterFreqMeasQuantity)mComponents[1];
    }
    
    public void setInterFreqMeasQuantity(InterFreqMeasQuantity interFreqMeasQuantity)
    {
	mComponents[1] = interFreqMeasQuantity;
    }
    
    public boolean hasInterFreqMeasQuantity()
    {
	return componentIsPresent(1);
    }
    
    public void deleteInterFreqMeasQuantity()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "interFreqReportingQuantity"
    public InterFreqReportingQuantity getInterFreqReportingQuantity()
    {
	return (InterFreqReportingQuantity)mComponents[2];
    }
    
    public void setInterFreqReportingQuantity(InterFreqReportingQuantity interFreqReportingQuantity)
    {
	mComponents[2] = interFreqReportingQuantity;
    }
    
    public boolean hasInterFreqReportingQuantity()
    {
	return componentIsPresent(2);
    }
    
    public void deleteInterFreqReportingQuantity()
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
    
    
    // Methods for field "interFreqSetUpdate"
    public UE_AutonomousUpdateMode getInterFreqSetUpdate()
    {
	return (UE_AutonomousUpdateMode)mComponents[4];
    }
    
    public void setInterFreqSetUpdate(UE_AutonomousUpdateMode interFreqSetUpdate)
    {
	mComponents[4] = interFreqSetUpdate;
    }
    
    public boolean hasInterFreqSetUpdate()
    {
	return componentIsPresent(4);
    }
    
    public void deleteInterFreqSetUpdate()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "reportCriteria"
    public InterFreqReportCriteria_r7 getReportCriteria()
    {
	return (InterFreqReportCriteria_r7)mComponents[5];
    }
    
    public void setReportCriteria(InterFreqReportCriteria_r7 reportCriteria)
    {
	mComponents[5] = reportCriteria;
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
	    "InterFrequencyMeasurement_r7"
	),
	new QName (
	    "InformationElements",
	    "InterFrequencyMeasurement-r7"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"InterFreqCellInfoList_r4"
			    ),
			    new QName (
				"InformationElements",
				"InterFreqCellInfoList-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "InterFreqCellInfoList_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "InterFreqCellInfoList_r4"
				)
			    ),
			    0
			)
		    ),
		    "interFreqCellInfoList",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"InterFreqMeasQuantity"
			    ),
			    new QName (
				"InformationElements",
				"InterFreqMeasQuantity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "InterFreqMeasQuantity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "InterFreqMeasQuantity"
				)
			    ),
			    0
			)
		    ),
		    "interFreqMeasQuantity",
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
				"InterFreqReportingQuantity"
			    ),
			    new QName (
				"InformationElements",
				"InterFreqReportingQuantity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "InterFreqReportingQuantity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "InterFreqReportingQuantity"
				)
			    ),
			    0
			)
		    ),
		    "interFreqReportingQuantity",
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
				"UE_AutonomousUpdateMode"
			    ),
			    new QName (
				"InformationElements",
				"UE-AutonomousUpdateMode"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_AutonomousUpdateMode"
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
		    "interFreqSetUpdate",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"InterFreqReportCriteria_r7"
			    ),
			    new QName (
				"InformationElements",
				"InterFreqReportCriteria-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "InterFreqReportCriteria_r7"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3)
				}
			    )
			)
		    ),
		    "reportCriteria",
		    5,
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
			new TagDecoderElement((short)0x8000, 0)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' InterFrequencyMeasurement_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterFrequencyMeasurement_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterFrequencyMeasurement_r7
