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
 * Define the ASN1 Type UE_Positioning_GANSS_MeasuredResults from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GANSS_MeasuredResults extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GANSS_MeasuredResults()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GANSS_MeasuredResults(ReferenceTime referenceTime, 
		    GANSSGenericMeasurementInfo ganssGenericMeasurementInfo)
    {
	setReferenceTime(referenceTime);
	setGanssGenericMeasurementInfo(ganssGenericMeasurementInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ReferenceTime();
	mComponents[1] = new GANSSGenericMeasurementInfo();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[2];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new ReferenceTime();
	    case 1:
		return new GANSSGenericMeasurementInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "referenceTime"
    public ReferenceTime getReferenceTime()
    {
	return (ReferenceTime)mComponents[0];
    }
    
    public void setReferenceTime(ReferenceTime referenceTime)
    {
	mComponents[0] = referenceTime;
    }
    
    
    
    /**
     * Define the ASN1 Type ReferenceTime from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class ReferenceTime extends Choice {
	
	/**
	 * The default constructor.
	 */
	public ReferenceTime()
	{
	}
	
	public static final  int  utran_GANSSReferenceTimeResult_chosen = 1;
	public static final  int  ganssReferenceTimeOnly_chosen = 2;
	
	// Methods for field "utran_GANSSReferenceTimeResult"
	public static ReferenceTime createReferenceTimeWithUtran_GANSSReferenceTimeResult(UTRAN_GANSSReferenceTime utran_GANSSReferenceTimeResult)
	{
	    ReferenceTime __object = new ReferenceTime();

	    __object.setUtran_GANSSReferenceTimeResult(utran_GANSSReferenceTimeResult);
	    return __object;
	}
	
	public boolean hasUtran_GANSSReferenceTimeResult()
	{
	    return getChosenFlag() == utran_GANSSReferenceTimeResult_chosen;
	}
	
	public void setUtran_GANSSReferenceTimeResult(UTRAN_GANSSReferenceTime utran_GANSSReferenceTimeResult)
	{
	    setChosenValue(utran_GANSSReferenceTimeResult);
	    setChosenFlag(utran_GANSSReferenceTimeResult_chosen);
	}
	
	
	// Methods for field "ganssReferenceTimeOnly"
	public static ReferenceTime createReferenceTimeWithGanssReferenceTimeOnly(GANSSReferenceTimeOnly ganssReferenceTimeOnly)
	{
	    ReferenceTime __object = new ReferenceTime();

	    __object.setGanssReferenceTimeOnly(ganssReferenceTimeOnly);
	    return __object;
	}
	
	public boolean hasGanssReferenceTimeOnly()
	{
	    return getChosenFlag() == ganssReferenceTimeOnly_chosen;
	}
	
	public void setGanssReferenceTimeOnly(GANSSReferenceTimeOnly ganssReferenceTimeOnly)
	{
	    setChosenValue(ganssReferenceTimeOnly);
	    setChosenFlag(ganssReferenceTimeOnly_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case utran_GANSSReferenceTimeResult_chosen:
		    return new UTRAN_GANSSReferenceTime();
		case ganssReferenceTimeOnly_chosen:
		    return new GANSSReferenceTimeOnly();
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
		"UE_Positioning_GANSS_MeasuredResults$ReferenceTime"
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
				    "UTRAN_GANSSReferenceTime"
				),
				new QName (
				    "InformationElements",
				    "UTRAN-GANSSReferenceTime"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"UTRAN_GANSSReferenceTime"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"UTRAN_GANSSReferenceTime"
				    )
				),
				0
			    )
			),
			"utran-GANSSReferenceTimeResult",
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
				    "GANSSReferenceTimeOnly"
				),
				new QName (
				    "InformationElements",
				    "GANSSReferenceTimeOnly"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"GANSSReferenceTimeOnly"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"GANSSReferenceTimeOnly"
				    )
				),
				0
			    )
			),
			"ganssReferenceTimeOnly",
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
	 * Get the type descriptor (TypeInfo) of 'this' ReferenceTime object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ReferenceTime object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ReferenceTime

    // Methods for field "ganssGenericMeasurementInfo"
    public GANSSGenericMeasurementInfo getGanssGenericMeasurementInfo()
    {
	return (GANSSGenericMeasurementInfo)mComponents[1];
    }
    
    public void setGanssGenericMeasurementInfo(GANSSGenericMeasurementInfo ganssGenericMeasurementInfo)
    {
	mComponents[1] = ganssGenericMeasurementInfo;
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
	    "UE_Positioning_GANSS_MeasuredResults"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GANSS-MeasuredResults"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_Positioning_GANSS_MeasuredResults$ReferenceTime"
			)
		    ),
		    "referenceTime",
		    0,
		    2,
		    null
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
				"GANSSGenericMeasurementInfo"
			    ),
			    new QName (
				"InformationElements",
				"GANSSGenericMeasurementInfo"
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
				    "GANSSGenericMeasurementInfo$Sequence_"
				)
			    )
			)
		    ),
		    "ganssGenericMeasurementInfo",
		    1,
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
			new TagDecoderElement((short)0x8001, 1)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_MeasuredResults object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_MeasuredResults object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GANSS_MeasuredResults
