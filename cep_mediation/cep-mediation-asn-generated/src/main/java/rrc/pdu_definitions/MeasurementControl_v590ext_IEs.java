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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type MeasurementControl_v590ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class MeasurementControl_v590ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public MeasurementControl_v590ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MeasurementControl_v590ext_IEs(MeasurementCommand_v590ext measurementCommand_v590ext, 
		    rrc.informationelements.IntraFreqReportingCriteria_1b_r5 intraFreqReportingCriteria_1b_r5, 
		    rrc.informationelements.IntraFreqEvent_1d_r5 intraFreqEvent_1d_r5, 
		    rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier_MSP_v590ext)
    {
	setMeasurementCommand_v590ext(measurementCommand_v590ext);
	setIntraFreqReportingCriteria_1b_r5(intraFreqReportingCriteria_1b_r5);
	setIntraFreqEvent_1d_r5(intraFreqEvent_1d_r5);
	setRrc_TransactionIdentifier_MSP_v590ext(rrc_TransactionIdentifier_MSP_v590ext);
    }
    
    /**
     * Construct with required components.
     */
    public MeasurementControl_v590ext_IEs(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier_MSP_v590ext)
    {
	setRrc_TransactionIdentifier_MSP_v590ext(rrc_TransactionIdentifier_MSP_v590ext);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MeasurementCommand_v590ext();
	mComponents[1] = new rrc.informationelements.IntraFreqReportingCriteria_1b_r5();
	mComponents[2] = new rrc.informationelements.IntraFreqEvent_1d_r5();
	mComponents[3] = new rrc.informationelements.RRC_TransactionIdentifier();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new MeasurementCommand_v590ext();
	    case 1:
		return new rrc.informationelements.IntraFreqReportingCriteria_1b_r5();
	    case 2:
		return new rrc.informationelements.IntraFreqEvent_1d_r5();
	    case 3:
		return new rrc.informationelements.RRC_TransactionIdentifier();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "measurementCommand_v590ext"
    public MeasurementCommand_v590ext getMeasurementCommand_v590ext()
    {
	return (MeasurementCommand_v590ext)mComponents[0];
    }
    
    public void setMeasurementCommand_v590ext(MeasurementCommand_v590ext measurementCommand_v590ext)
    {
	mComponents[0] = measurementCommand_v590ext;
    }
    
    public boolean hasMeasurementCommand_v590ext()
    {
	return componentIsPresent(0);
    }
    
    public void deleteMeasurementCommand_v590ext()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type MeasurementCommand_v590ext from ASN1 Module PDU_definitions.
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
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"MeasurementControl_v590ext_IEs$MeasurementCommand_v590ext"
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
	return (rrc.informationelements.IntraFreqReportingCriteria_1b_r5)mComponents[1];
    }
    
    public void setIntraFreqReportingCriteria_1b_r5(rrc.informationelements.IntraFreqReportingCriteria_1b_r5 intraFreqReportingCriteria_1b_r5)
    {
	mComponents[1] = intraFreqReportingCriteria_1b_r5;
    }
    
    public boolean hasIntraFreqReportingCriteria_1b_r5()
    {
	return componentIsPresent(1);
    }
    
    public void deleteIntraFreqReportingCriteria_1b_r5()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "intraFreqEvent_1d_r5"
    public rrc.informationelements.IntraFreqEvent_1d_r5 getIntraFreqEvent_1d_r5()
    {
	return (rrc.informationelements.IntraFreqEvent_1d_r5)mComponents[2];
    }
    
    public void setIntraFreqEvent_1d_r5(rrc.informationelements.IntraFreqEvent_1d_r5 intraFreqEvent_1d_r5)
    {
	mComponents[2] = intraFreqEvent_1d_r5;
    }
    
    public boolean hasIntraFreqEvent_1d_r5()
    {
	return componentIsPresent(2);
    }
    
    public void deleteIntraFreqEvent_1d_r5()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "rrc_TransactionIdentifier_MSP_v590ext"
    public rrc.informationelements.RRC_TransactionIdentifier getRrc_TransactionIdentifier_MSP_v590ext()
    {
	return (rrc.informationelements.RRC_TransactionIdentifier)mComponents[3];
    }
    
    public void setRrc_TransactionIdentifier_MSP_v590ext(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier_MSP_v590ext)
    {
	mComponents[3] = rrc_TransactionIdentifier_MSP_v590ext;
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
	    "rrc.pdu_definitions",
	    "MeasurementControl_v590ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "MeasurementControl-v590ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "MeasurementControl_v590ext_IEs$MeasurementCommand_v590ext"
			)
		    ),
		    "measurementCommand-v590ext",
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
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RRC_TransactionIdentifier"
			    ),
			    new QName (
				"InformationElements",
				"RRC-TransactionIdentifier"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.RRC_TransactionIdentifier(0), 
				    new rrc.informationelements.RRC_TransactionIdentifier(3),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(3)
			    ),
			    null
			)
		    ),
		    "rrc-TransactionIdentifier-MSP-v590ext",
		    3,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MeasurementControl_v590ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasurementControl_v590ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasurementControl_v590ext_IEs
