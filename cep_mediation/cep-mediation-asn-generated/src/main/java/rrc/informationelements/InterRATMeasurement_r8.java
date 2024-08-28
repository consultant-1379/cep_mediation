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
 * Define the ASN1 Type InterRATMeasurement_r8 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class InterRATMeasurement_r8 extends Sequence {
    
    /**
     * The default constructor.
     */
    public InterRATMeasurement_r8()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InterRATMeasurement_r8(InterRATMeasurementObjects interRATMeasurementObjects, 
		    InterRATMeasQuantity_r8 interRATMeasQuantity, 
		    InterRATReportingQuantity_r8 interRATReportingQuantity, 
		    InterRATReportCriteria reportCriteria, 
		    IdleIntervalInfo idleIntervalInfo)
    {
	setInterRATMeasurementObjects(interRATMeasurementObjects);
	setInterRATMeasQuantity(interRATMeasQuantity);
	setInterRATReportingQuantity(interRATReportingQuantity);
	setReportCriteria(reportCriteria);
	setIdleIntervalInfo(idleIntervalInfo);
    }
    
    /**
     * Construct with required components.
     */
    public InterRATMeasurement_r8(InterRATReportCriteria reportCriteria)
    {
	setReportCriteria(reportCriteria);
    }
    
    public void initComponents()
    {
	mComponents[0] = new InterRATMeasurementObjects();
	mComponents[1] = new InterRATMeasQuantity_r8();
	mComponents[2] = new InterRATReportingQuantity_r8();
	mComponents[3] = new InterRATReportCriteria();
	mComponents[4] = new IdleIntervalInfo();
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
		return new InterRATMeasurementObjects();
	    case 1:
		return new InterRATMeasQuantity_r8();
	    case 2:
		return new InterRATReportingQuantity_r8();
	    case 3:
		return new InterRATReportCriteria();
	    case 4:
		return new IdleIntervalInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "interRATMeasurementObjects"
    public InterRATMeasurementObjects getInterRATMeasurementObjects()
    {
	return (InterRATMeasurementObjects)mComponents[0];
    }
    
    public void setInterRATMeasurementObjects(InterRATMeasurementObjects interRATMeasurementObjects)
    {
	mComponents[0] = interRATMeasurementObjects;
    }
    
    public boolean hasInterRATMeasurementObjects()
    {
	return componentIsPresent(0);
    }
    
    public void deleteInterRATMeasurementObjects()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type InterRATMeasurementObjects from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class InterRATMeasurementObjects extends Choice {
	
	/**
	 * The default constructor.
	 */
	public InterRATMeasurementObjects()
	{
	}
	
	public static final  int  interRATCellInfoList_chosen = 1;
	public static final  int  eutra_FrequencyList_chosen = 2;
	
	// Methods for field "interRATCellInfoList"
	public static InterRATMeasurementObjects createInterRATMeasurementObjectsWithInterRATCellInfoList(InterRATCellInfoList_r6 interRATCellInfoList)
	{
	    InterRATMeasurementObjects __object = new InterRATMeasurementObjects();

	    __object.setInterRATCellInfoList(interRATCellInfoList);
	    return __object;
	}
	
	public boolean hasInterRATCellInfoList()
	{
	    return getChosenFlag() == interRATCellInfoList_chosen;
	}
	
	public void setInterRATCellInfoList(InterRATCellInfoList_r6 interRATCellInfoList)
	{
	    setChosenValue(interRATCellInfoList);
	    setChosenFlag(interRATCellInfoList_chosen);
	}
	
	
	// Methods for field "eutra_FrequencyList"
	public static InterRATMeasurementObjects createInterRATMeasurementObjectsWithEutra_FrequencyList(EUTRA_FrequencyList eutra_FrequencyList)
	{
	    InterRATMeasurementObjects __object = new InterRATMeasurementObjects();

	    __object.setEutra_FrequencyList(eutra_FrequencyList);
	    return __object;
	}
	
	public boolean hasEutra_FrequencyList()
	{
	    return getChosenFlag() == eutra_FrequencyList_chosen;
	}
	
	public void setEutra_FrequencyList(EUTRA_FrequencyList eutra_FrequencyList)
	{
	    setChosenValue(eutra_FrequencyList);
	    setChosenFlag(eutra_FrequencyList_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case interRATCellInfoList_chosen:
		    return new InterRATCellInfoList_r6();
		case eutra_FrequencyList_chosen:
		    return new EUTRA_FrequencyList();
		default:
		    throw new InternalError("Choice.createInstance()");
	    }
	    
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"InterRATMeasurement_r8$InterRATMeasurementObjects"
	    ),
	    new QName (
		"builtin",
		"CHOICE"
	    ),
	    12314,
	    null,
	    new Fields (
		new FieldInfo[] {
		    new FieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "InterRATCellInfoList_r6"
				),
				new QName (
				    "InformationElements",
				    "InterRATCellInfoList-r6"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"InterRATCellInfoList_r6"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"InterRATCellInfoList_r6"
				    )
				),
				0
			    )
			),
			"interRATCellInfoList",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "EUTRA_FrequencyList"
				),
				new QName (
				    "InformationElements",
				    "EUTRA-FrequencyList"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"EUTRA_FrequencyList"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"EUTRA_FrequencyList"
				    )
				),
				0
			    )
			),
			"eutra-FrequencyList",
			1,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0),
		    new TagDecoderElement((short)0x8001, 1)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' InterRATMeasurementObjects object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' InterRATMeasurementObjects object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for InterRATMeasurementObjects

    // Methods for field "interRATMeasQuantity"
    public InterRATMeasQuantity_r8 getInterRATMeasQuantity()
    {
	return (InterRATMeasQuantity_r8)mComponents[1];
    }
    
    public void setInterRATMeasQuantity(InterRATMeasQuantity_r8 interRATMeasQuantity)
    {
	mComponents[1] = interRATMeasQuantity;
    }
    
    public boolean hasInterRATMeasQuantity()
    {
	return componentIsPresent(1);
    }
    
    public void deleteInterRATMeasQuantity()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "interRATReportingQuantity"
    public InterRATReportingQuantity_r8 getInterRATReportingQuantity()
    {
	return (InterRATReportingQuantity_r8)mComponents[2];
    }
    
    public void setInterRATReportingQuantity(InterRATReportingQuantity_r8 interRATReportingQuantity)
    {
	mComponents[2] = interRATReportingQuantity;
    }
    
    public boolean hasInterRATReportingQuantity()
    {
	return componentIsPresent(2);
    }
    
    public void deleteInterRATReportingQuantity()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "reportCriteria"
    public InterRATReportCriteria getReportCriteria()
    {
	return (InterRATReportCriteria)mComponents[3];
    }
    
    public void setReportCriteria(InterRATReportCriteria reportCriteria)
    {
	mComponents[3] = reportCriteria;
    }
    
    
    // Methods for field "idleIntervalInfo"
    public IdleIntervalInfo getIdleIntervalInfo()
    {
	return (IdleIntervalInfo)mComponents[4];
    }
    
    public void setIdleIntervalInfo(IdleIntervalInfo idleIntervalInfo)
    {
	mComponents[4] = idleIntervalInfo;
    }
    
    public boolean hasIdleIntervalInfo()
    {
	return componentIsPresent(4);
    }
    
    public void deleteIdleIntervalInfo()
    {
	setComponentAbsent(4);
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
	    "InterRATMeasurement_r8"
	),
	new QName (
	    "InformationElements",
	    "InterRATMeasurement-r8"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "InterRATMeasurement_r8$InterRATMeasurementObjects"
			)
		    ),
		    "interRATMeasurementObjects",
		    0,
		    3,
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
				"InterRATMeasQuantity_r8"
			    ),
			    new QName (
				"InformationElements",
				"InterRATMeasQuantity-r8"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "InterRATMeasQuantity_r8"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "InterRATMeasQuantity_r8"
				)
			    ),
			    0
			)
		    ),
		    "interRATMeasQuantity",
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
				"InterRATReportingQuantity_r8"
			    ),
			    new QName (
				"InformationElements",
				"InterRATReportingQuantity-r8"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "InterRATReportingQuantity_r8"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "InterRATReportingQuantity_r8"
				)
			    ),
			    0
			)
		    ),
		    "interRATReportingQuantity",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"InterRATReportCriteria"
			    ),
			    new QName (
				"InformationElements",
				"InterRATReportCriteria"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "InterRATReportCriteria"
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
		    3,
		    2,
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
				"IdleIntervalInfo"
			    ),
			    new QName (
				"InformationElements",
				"IdleIntervalInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IdleIntervalInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IdleIntervalInfo"
				)
			    ),
			    0
			)
		    ),
		    "idleIntervalInfo",
		    4,
		    3,
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
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
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
     * Get the type descriptor (TypeInfo) of 'this' InterRATMeasurement_r8 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterRATMeasurement_r8 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterRATMeasurement_r8
