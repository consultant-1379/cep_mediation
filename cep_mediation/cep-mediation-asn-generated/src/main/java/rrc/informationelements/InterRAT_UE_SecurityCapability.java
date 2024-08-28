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
 * Define the ASN1 Type InterRAT_UE_SecurityCapability from ASN1 Module InformationElements.
 * @see Choice
 */

public class InterRAT_UE_SecurityCapability extends Choice {
    
    /**
     * The default constructor.
     */
    public InterRAT_UE_SecurityCapability()
    {
    }
    
    public static final  int  gsm_chosen = 1;
    
    // Methods for field "gsm"
    public static InterRAT_UE_SecurityCapability createInterRAT_UE_SecurityCapabilityWithGsm(Gsm gsm)
    {
	InterRAT_UE_SecurityCapability __object = new InterRAT_UE_SecurityCapability();

	__object.setGsm(gsm);
	return __object;
    }
    
    public boolean hasGsm()
    {
	return getChosenFlag() == gsm_chosen;
    }
    
    public void setGsm(Gsm gsm)
    {
	setChosenValue(gsm);
	setChosenFlag(gsm_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Gsm from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Gsm extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Gsm()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Gsm(GsmSecurityCapability gsmSecurityCapability)
	{
	    setGsmSecurityCapability(gsmSecurityCapability);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new GsmSecurityCapability();
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[1];
	}
	
	// Method to create a specific component instance
	public AbstractData createInstance(int index)
	{
	    switch (index) {
		case 0:
		    return new GsmSecurityCapability();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "gsmSecurityCapability"
	public GsmSecurityCapability getGsmSecurityCapability()
	{
	    return (GsmSecurityCapability)mComponents[0];
	}
	
	public void setGsmSecurityCapability(GsmSecurityCapability gsmSecurityCapability)
	{
	    mComponents[0] = gsmSecurityCapability;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"InterRAT_UE_SecurityCapability$Gsm"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
	    ),
	    12314,
	    null,
	    new Fields (
		new SequenceFieldInfo[] {
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new BitStringInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "GsmSecurityCapability"
				),
				new QName (
				    "InformationElements",
				    "GsmSecurityCapability"
				),
				12314,
				new SizeConstraint (
				    new SingleValueConstraint (
					new com.oss.asn1.INTEGER(7)
				    )
				),
				new Bounds (
				    new java.lang.Long(7),
				    new java.lang.Long(7)
				),
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "a5-7",
					    0
					),
					new MemberListElement (
					    "a5-6",
					    1
					),
					new MemberListElement (
					    "a5-5",
					    2
					),
					new MemberListElement (
					    "a5-4",
					    3
					),
					new MemberListElement (
					    "a5-3",
					    4
					),
					new MemberListElement (
					    "a5-2",
					    5
					),
					new MemberListElement (
					    "a5-1",
					    6
					)
				    }
				)
			    )
			),
			"gsmSecurityCapability",
			0,
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
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Gsm object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Gsm object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Gsm

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case gsm_chosen:
		return new Gsm();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "rrc.informationelements",
	    "InterRAT_UE_SecurityCapability"
	),
	new QName (
	    "InformationElements",
	    "InterRAT-UE-SecurityCapability"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "InterRAT_UE_SecurityCapability$Gsm"
			)
		    ),
		    "gsm",
		    0,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' InterRAT_UE_SecurityCapability object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterRAT_UE_SecurityCapability object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterRAT_UE_SecurityCapability
