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
 * Define the ASN1 Type MBSFNFrequency_v860ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBSFNFrequency_v860ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBSFNFrequency_v860ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBSFNFrequency_v860ext(Imb_Indication imb_Indication)
    {
	setImb_Indication(imb_Indication);
    }
    
    public void initComponents()
    {
	mComponents[0] = Imb_Indication._true;
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
		return Imb_Indication._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "imb_Indication"
    public Imb_Indication getImb_Indication()
    {
	return (Imb_Indication)mComponents[0];
    }
    
    public void setImb_Indication(Imb_Indication imb_Indication)
    {
	mComponents[0] = imb_Indication;
    }
    
    public boolean hasImb_Indication()
    {
	return componentIsPresent(0);
    }
    
    public void deleteImb_Indication()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type Imb_Indication from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class Imb_Indication extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Imb_Indication()
	{
	    super(cFirstNumber);
	}
	
	protected Imb_Indication(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Imb_Indication _true =
	    new Imb_Indication(0);
	private final static Imb_Indication cNamedNumbers[] = {
	     _true
	};
	protected final static long cFirstNumber = 0;
	protected final static boolean cLinearNumbers = false;
	
	public Enumerated[] getNamedNumbers()
	{
	    return cNamedNumbers;
	}
	
	public boolean hasLinearNumbers()
	{
	    return cLinearNumbers;
	}
	
	public long getFirstNumber()
	{
	    return cFirstNumber;
	}
	
	public static Imb_Indication valueOf(long value)
	{
	    return (Imb_Indication)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"MBSFNFrequency_v860ext$Imb_Indication"
	    ),
	    new QName (
		"builtin",
		"ENUMERATED"
	    ),
	    12314,
	    null,
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"true",
			0
		    )
		}
	    ),
	    0,
	    _true
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Imb_Indication object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Imb_Indication object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Imb_Indication

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
	    "MBSFNFrequency_v860ext"
	),
	new QName (
	    "InformationElements",
	    "MBSFNFrequency-v860ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MBSFNFrequency_v860ext$Imb_Indication"
			)
		    ),
		    "imb-Indication",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MBSFNFrequency_v860ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBSFNFrequency_v860ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBSFNFrequency_v860ext
