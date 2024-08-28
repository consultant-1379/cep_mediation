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
 * Define the ASN1 Type CN_DomainSysInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CN_DomainSysInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public CN_DomainSysInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CN_DomainSysInfo(CN_DomainIdentity cn_DomainIdentity, 
		    Cn_Type cn_Type, 
		    CN_DRX_CycleLengthCoefficient cn_DRX_CycleLengthCoeff)
    {
	setCn_DomainIdentity(cn_DomainIdentity);
	setCn_Type(cn_Type);
	setCn_DRX_CycleLengthCoeff(cn_DRX_CycleLengthCoeff);
    }
    
    public void initComponents()
    {
	mComponents[0] = CN_DomainIdentity.cs_domain;
	mComponents[1] = new Cn_Type();
	mComponents[2] = new CN_DRX_CycleLengthCoefficient();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return CN_DomainIdentity.cs_domain;
	    case 1:
		return new Cn_Type();
	    case 2:
		return new CN_DRX_CycleLengthCoefficient();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cn_DomainIdentity"
    public CN_DomainIdentity getCn_DomainIdentity()
    {
	return (CN_DomainIdentity)mComponents[0];
    }
    
    public void setCn_DomainIdentity(CN_DomainIdentity cn_DomainIdentity)
    {
	mComponents[0] = cn_DomainIdentity;
    }
    
    
    // Methods for field "cn_Type"
    public Cn_Type getCn_Type()
    {
	return (Cn_Type)mComponents[1];
    }
    
    public void setCn_Type(Cn_Type cn_Type)
    {
	mComponents[1] = cn_Type;
    }
    
    
    
    /**
     * Define the ASN1 Type Cn_Type from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Cn_Type extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Cn_Type()
	{
	}
	
	public static final  int  gsm_MAP_chosen = 1;
	public static final  int  ansi_41_chosen = 2;
	
	// Methods for field "gsm_MAP"
	public static Cn_Type createCn_TypeWithGsm_MAP(NAS_SystemInformationGSM_MAP gsm_MAP)
	{
	    Cn_Type __object = new Cn_Type();

	    __object.setGsm_MAP(gsm_MAP);
	    return __object;
	}
	
	public boolean hasGsm_MAP()
	{
	    return getChosenFlag() == gsm_MAP_chosen;
	}
	
	public void setGsm_MAP(NAS_SystemInformationGSM_MAP gsm_MAP)
	{
	    setChosenValue(gsm_MAP);
	    setChosenFlag(gsm_MAP_chosen);
	}
	
	
	// Methods for field "ansi_41"
	public static Cn_Type createCn_TypeWithAnsi_41(NAS_SystemInformationANSI_41 ansi_41)
	{
	    Cn_Type __object = new Cn_Type();

	    __object.setAnsi_41(ansi_41);
	    return __object;
	}
	
	public boolean hasAnsi_41()
	{
	    return getChosenFlag() == ansi_41_chosen;
	}
	
	public void setAnsi_41(NAS_SystemInformationANSI_41 ansi_41)
	{
	    setChosenValue(ansi_41);
	    setChosenFlag(ansi_41_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case gsm_MAP_chosen:
		    return new NAS_SystemInformationGSM_MAP();
		case ansi_41_chosen:
		    return new NAS_SystemInformationANSI_41();
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
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"CN_DomainSysInfo$Cn_Type"
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
			    new VectorInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "NAS_SystemInformationGSM_MAP"
				),
				new QName (
				    "InformationElements",
				    "NAS-SystemInformationGSM-MAP"
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
				)
			    )
			),
			"gsm-MAP",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new BitStringInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "NAS_SystemInformationANSI_41"
				),
				new QName (
				    "InformationElements",
				    "NAS-SystemInformationANSI-41"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(2048),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(2048)
				),
				null
			    )
			),
			"ansi-41",
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
	 * Get the type descriptor (TypeInfo) of 'this' Cn_Type object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Cn_Type object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Cn_Type

    // Methods for field "cn_DRX_CycleLengthCoeff"
    public CN_DRX_CycleLengthCoefficient getCn_DRX_CycleLengthCoeff()
    {
	return (CN_DRX_CycleLengthCoefficient)mComponents[2];
    }
    
    public void setCn_DRX_CycleLengthCoeff(CN_DRX_CycleLengthCoefficient cn_DRX_CycleLengthCoeff)
    {
	mComponents[2] = cn_DRX_CycleLengthCoeff;
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
	    "CN_DomainSysInfo"
	),
	new QName (
	    "InformationElements",
	    "CN-DomainSysInfo"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CN_DomainIdentity"
			    ),
			    new QName (
				"InformationElements",
				"CN-DomainIdentity"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"cs-domain",
					0
				    ),
				    new MemberListElement (
					"ps-domain",
					1
				    )
				}
			    ),
			    0,
			    CN_DomainIdentity.cs_domain
			)
		    ),
		    "cn-DomainIdentity",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "CN_DomainSysInfo$Cn_Type"
			)
		    ),
		    "cn-Type",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CN_DRX_CycleLengthCoefficient"
			    ),
			    new QName (
				"InformationElements",
				"CN-DRX-CycleLengthCoefficient"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CN_DRX_CycleLengthCoefficient(6), 
				    new CN_DRX_CycleLengthCoefficient(9),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(6),
				new java.lang.Long(9)
			    ),
			    null
			)
		    ),
		    "cn-DRX-CycleLengthCoeff",
		    2,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CN_DomainSysInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CN_DomainSysInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CN_DomainSysInfo
