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
 * Define the ASN1 Type UE_Positioning_GANSS_Almanac from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GANSS_Almanac extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GANSS_Almanac()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GANSS_Almanac(INTEGER ganss_wk_number, 
		    ALM_keplerianParameters alm_keplerianParameters)
    {
	setGanss_wk_number(ganss_wk_number);
	setAlm_keplerianParameters(alm_keplerianParameters);
    }
    
    /**
     * Construct with components.
     */
    public UE_Positioning_GANSS_Almanac(long ganss_wk_number, 
		    ALM_keplerianParameters alm_keplerianParameters)
    {
	this(new INTEGER(ganss_wk_number), alm_keplerianParameters);
    }
    
    /**
     * Construct with required components.
     */
    public UE_Positioning_GANSS_Almanac(long ganss_wk_number)
    {
	setGanss_wk_number(ganss_wk_number);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new ALM_keplerianParameters();
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
		return new INTEGER();
	    case 1:
		return new ALM_keplerianParameters();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ganss_wk_number"
    public long getGanss_wk_number()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setGanss_wk_number(long ganss_wk_number)
    {
	setGanss_wk_number(new INTEGER(ganss_wk_number));
    }
    
    public void setGanss_wk_number(INTEGER ganss_wk_number)
    {
	mComponents[0] = ganss_wk_number;
    }
    
    
    // Methods for field "alm_keplerianParameters"
    public ALM_keplerianParameters getAlm_keplerianParameters()
    {
	return (ALM_keplerianParameters)mComponents[1];
    }
    
    public void setAlm_keplerianParameters(ALM_keplerianParameters alm_keplerianParameters)
    {
	mComponents[1] = alm_keplerianParameters;
    }
    
    public boolean hasAlm_keplerianParameters()
    {
	return componentIsPresent(1);
    }
    
    public void deleteAlm_keplerianParameters()
    {
	setComponentAbsent(1);
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
	    "UE_Positioning_GANSS_Almanac"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GANSS-Almanac"
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
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(255),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(255)
			    ),
			    null
			)
		    ),
		    "ganss-wk-number",
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
				"ALM_keplerianParameters"
			    ),
			    new QName (
				"InformationElements",
				"ALM-keplerianParameters"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ALM_keplerianParameters"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "ALM_keplerianParameters"
				)
			    ),
			    0
			)
		    ),
		    "alm-keplerianParameters",
		    1,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_Almanac object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_Almanac object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GANSS_Almanac
