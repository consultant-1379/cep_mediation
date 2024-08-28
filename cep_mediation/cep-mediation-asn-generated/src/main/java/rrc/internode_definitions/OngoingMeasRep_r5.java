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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type OngoingMeasRep_r5 from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class OngoingMeasRep_r5 extends Sequence {
    
    /**
     * The default constructor.
     */
    public OngoingMeasRep_r5()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public OngoingMeasRep_r5(rrc.informationelements.MeasurementIdentity measurementIdentity, 
		    MeasurementCommandWithType_r4 measurementCommandWithType, 
		    rrc.informationelements.MeasurementReportingMode measurementReportingMode, 
		    rrc.informationelements.AdditionalMeasurementID_List additionalMeasurementID_List, 
		    MeasurementCommand_v590ext measurementCommand_v590ext, 
		    rrc.informationelements.IntraFreqReportingCriteria_1b_r5 intraFreqReportingCriteria_1b_r5, 
		    rrc.informationelements.IntraFreqEvent_1d_r5 intraFreqEvent_1d_r5)
    {
	setMeasurementIdentity(measurementIdentity);
	setMeasurementCommandWithType(measurementCommandWithType);
	setMeasurementReportingMode(measurementReportingMode);
	setAdditionalMeasurementID_List(additionalMeasurementID_List);
	setMeasurementCommand_v590ext(measurementCommand_v590ext);
	setIntraFreqReportingCriteria_1b_r5(intraFreqReportingCriteria_1b_r5);
	setIntraFreqEvent_1d_r5(intraFreqEvent_1d_r5);
    }
    
    /**
     * Construct with required components.
     */
    public OngoingMeasRep_r5(rrc.informationelements.MeasurementIdentity measurementIdentity, 
		    MeasurementCommandWithType_r4 measurementCommandWithType)
    {
	setMeasurementIdentity(measurementIdentity);
	setMeasurementCommandWithType(measurementCommandWithType);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.MeasurementIdentity();
	mComponents[1] = new MeasurementCommandWithType_r4();
	mComponents[2] = new rrc.informationelements.MeasurementReportingMode();
	mComponents[3] = new rrc.informationelements.AdditionalMeasurementID_List();
	mComponents[4] = new MeasurementCommand_v590ext();
	mComponents[5] = new rrc.informationelements.IntraFreqReportingCriteria_1b_r5();
	mComponents[6] = new rrc.informationelements.IntraFreqEvent_1d_r5();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[7];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.MeasurementIdentity();
	    case 1:
		return new MeasurementCommandWithType_r4();
	    case 2:
		return new rrc.informationelements.MeasurementReportingMode();
	    case 3:
		return new rrc.informationelements.AdditionalMeasurementID_List();
	    case 4:
		return new MeasurementCommand_v590ext();
	    case 5:
		return new rrc.informationelements.IntraFreqReportingCriteria_1b_r5();
	    case 6:
		return new rrc.informationelements.IntraFreqEvent_1d_r5();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "measurementIdentity"
    public rrc.informationelements.MeasurementIdentity getMeasurementIdentity()
    {
	return (rrc.informationelements.MeasurementIdentity)mComponents[0];
    }
    
    public void setMeasurementIdentity(rrc.informationelements.MeasurementIdentity measurementIdentity)
    {
	mComponents[0] = measurementIdentity;
    }
    
    
    // Methods for field "measurementCommandWithType"
    public MeasurementCommandWithType_r4 getMeasurementCommandWithType()
    {
	return (MeasurementCommandWithType_r4)mComponents[1];
    }
    
    public void setMeasurementCommandWithType(MeasurementCommandWithType_r4 measurementCommandWithType)
    {
	mComponents[1] = measurementCommandWithType;
    }
    
    
    // Methods for field "measurementReportingMode"
    public rrc.informationelements.MeasurementReportingMode getMeasurementReportingMode()
    {
	return (rrc.informationelements.MeasurementReportingMode)mComponents[2];
    }
    
    public void setMeasurementReportingMode(rrc.informationelements.MeasurementReportingMode measurementReportingMode)
    {
	mComponents[2] = measurementReportingMode;
    }
    
    public boolean hasMeasurementReportingMode()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMeasurementReportingMode()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "additionalMeasurementID_List"
    public rrc.informationelements.AdditionalMeasurementID_List getAdditionalMeasurementID_List()
    {
	return (rrc.informationelements.AdditionalMeasurementID_List)mComponents[3];
    }
    
    public void setAdditionalMeasurementID_List(rrc.informationelements.AdditionalMeasurementID_List additionalMeasurementID_List)
    {
	mComponents[3] = additionalMeasurementID_List;
    }
    
    public boolean hasAdditionalMeasurementID_List()
    {
	return componentIsPresent(3);
    }
    
    public void deleteAdditionalMeasurementID_List()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "measurementCommand_v590ext"
    public MeasurementCommand_v590ext getMeasurementCommand_v590ext()
    {
	return (MeasurementCommand_v590ext)mComponents[4];
    }
    
    public void setMeasurementCommand_v590ext(MeasurementCommand_v590ext measurementCommand_v590ext)
    {
	mComponents[4] = measurementCommand_v590ext;
    }
    
    public boolean hasMeasurementCommand_v590ext()
    {
	return componentIsPresent(4);
    }
    
    public void deleteMeasurementCommand_v590ext()
    {
	setComponentAbsent(4);
    }
    
    
    
    /**
     * Define the ASN1 Type MeasurementCommand_v590ext from ASN1 Module Internode_definitions.
     * @see Choice
     */
    public static class MeasurementCommand_v590ext extends Choice {
	
	/**
	 * The default constructor.
	 */
	public MeasurementCommand_v590ext()
	{
	}
	
	public static final  int  intra_frequency_chosen = 1;
	public static final  int  inter_frequency_chosen = 2;
	
	// Methods for field "intra_frequency"
	public static MeasurementCommand_v590ext createMeasurementCommand_v590extWithIntra_frequency(rrc.informationelements.Intra_FreqEventCriteriaList_v590ext intra_frequency)
	{
	    MeasurementCommand_v590ext __object = new MeasurementCommand_v590ext();

	    __object.setIntra_frequency(intra_frequency);
	    return __object;
	}
	
	public boolean hasIntra_frequency()
	{
	    return getChosenFlag() == intra_frequency_chosen;
	}
	
	public void setIntra_frequency(rrc.informationelements.Intra_FreqEventCriteriaList_v590ext intra_frequency)
	{
	    setChosenValue(intra_frequency);
	    setChosenFlag(intra_frequency_chosen);
	}
	
	
	// Methods for field "inter_frequency"
	public static MeasurementCommand_v590ext createMeasurementCommand_v590extWithInter_frequency(rrc.informationelements.Inter_FreqEventCriteriaList_v590ext inter_frequency)
	{
	    MeasurementCommand_v590ext __object = new MeasurementCommand_v590ext();

	    __object.setInter_frequency(inter_frequency);
	    return __object;
	}
	
	public boolean hasInter_frequency()
	{
	    return getChosenFlag() == inter_frequency_chosen;
	}
	
	public void setInter_frequency(rrc.informationelements.Inter_FreqEventCriteriaList_v590ext inter_frequency)
	{
	    setChosenValue(inter_frequency);
	    setChosenFlag(inter_frequency_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case intra_frequency_chosen:
		    return new rrc.informationelements.Intra_FreqEventCriteriaList_v590ext();
		case inter_frequency_chosen:
		    return new rrc.informationelements.Inter_FreqEventCriteriaList_v590ext();
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
		    (short)0x8004
		}
	    ),
	    new QName (
		"rrc.internode_definitions",
		"OngoingMeasRep_r5$MeasurementCommand_v590ext"
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
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "Intra_FreqEventCriteriaList_v590ext"
				),
				new QName (
				    "InformationElements",
				    "Intra-FreqEventCriteriaList-v590ext"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(8),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(8)
				),
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"DeltaRSCP"
				    )
				)
			    )
			),
			"intra-frequency",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "Inter_FreqEventCriteriaList_v590ext"
				),
				new QName (
				    "InformationElements",
				    "Inter-FreqEventCriteriaList-v590ext"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(8),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(8)
				),
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"Inter_FreqEventCriteria_v590ext"
				    )
				)
			    )
			),
			"inter-frequency",
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
	 * Get the type descriptor (TypeInfo) of 'this' MeasurementCommand_v590ext object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' MeasurementCommand_v590ext object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for MeasurementCommand_v590ext

    // Methods for field "intraFreqReportingCriteria_1b_r5"
    public rrc.informationelements.IntraFreqReportingCriteria_1b_r5 getIntraFreqReportingCriteria_1b_r5()
    {
	return (rrc.informationelements.IntraFreqReportingCriteria_1b_r5)mComponents[5];
    }
    
    public void setIntraFreqReportingCriteria_1b_r5(rrc.informationelements.IntraFreqReportingCriteria_1b_r5 intraFreqReportingCriteria_1b_r5)
    {
	mComponents[5] = intraFreqReportingCriteria_1b_r5;
    }
    
    public boolean hasIntraFreqReportingCriteria_1b_r5()
    {
	return componentIsPresent(5);
    }
    
    public void deleteIntraFreqReportingCriteria_1b_r5()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "intraFreqEvent_1d_r5"
    public rrc.informationelements.IntraFreqEvent_1d_r5 getIntraFreqEvent_1d_r5()
    {
	return (rrc.informationelements.IntraFreqEvent_1d_r5)mComponents[6];
    }
    
    public void setIntraFreqEvent_1d_r5(rrc.informationelements.IntraFreqEvent_1d_r5 intraFreqEvent_1d_r5)
    {
	mComponents[6] = intraFreqEvent_1d_r5;
    }
    
    public boolean hasIntraFreqEvent_1d_r5()
    {
	return componentIsPresent(6);
    }
    
    public void deleteIntraFreqEvent_1d_r5()
    {
	setComponentAbsent(6);
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
	    "rrc.internode_definitions",
	    "OngoingMeasRep_r5"
	),
	new QName (
	    "Internode-definitions",
	    "OngoingMeasRep-r5"
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
				    new rrc.informationelements.MeasurementIdentity(1), 
				    new rrc.informationelements.MeasurementIdentity(16),
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
		    "measurementIdentity",
		    0,
		    2,
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
				"rrc.internode_definitions",
				"MeasurementCommandWithType_r4"
			    ),
			    new QName (
				"Internode-definitions",
				"MeasurementCommandWithType-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.internode_definitions",
				    "MeasurementCommandWithType_r4"
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
		    "measurementCommandWithType",
		    1,
		    2,
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
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"AdditionalMeasurementID_List"
			    ),
			    new QName (
				"InformationElements",
				"AdditionalMeasurementID-List"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(4),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementIdentity"
				)
			    )
			)
		    ),
		    "additionalMeasurementID-List",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.internode_definitions",
			    "OngoingMeasRep_r5$MeasurementCommand_v590ext"
			)
		    ),
		    "measurementCommand-v590ext",
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
				"IntraFreqReportingCriteria_1b_r5"
			    ),
			    new QName (
				"InformationElements",
				"IntraFreqReportingCriteria-1b-r5"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqReportingCriteria_1b_r5"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqReportingCriteria_1b_r5"
				)
			    ),
			    0
			)
		    ),
		    "intraFreqReportingCriteria-1b-r5",
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
				"IntraFreqEvent_1d_r5"
			    ),
			    new QName (
				"InformationElements",
				"IntraFreqEvent-1d-r5"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqEvent_1d_r5"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqEvent_1d_r5"
				)
			    ),
			    0
			)
		    ),
		    "intraFreqEvent-1d-r5",
		    6,
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
			new TagDecoderElement((short)0x8000, 0)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' OngoingMeasRep_r5 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' OngoingMeasRep_r5 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for OngoingMeasRep_r5
