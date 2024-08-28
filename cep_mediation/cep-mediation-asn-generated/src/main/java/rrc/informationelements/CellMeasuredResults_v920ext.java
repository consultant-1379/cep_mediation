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
 * Define the ASN1 Type CellMeasuredResults_v920ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CellMeasuredResults_v920ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public CellMeasuredResults_v920ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CellMeasuredResults_v920ext(CSG_Identity csgIdentity, 
		    CsgMemberIndication csgMemberIndication)
    {
	setCsgIdentity(csgIdentity);
	setCsgMemberIndication(csgMemberIndication);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CSG_Identity();
	mComponents[1] = CsgMemberIndication.member;
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
		return new CSG_Identity();
	    case 1:
		return CsgMemberIndication.member;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "csgIdentity"
    public CSG_Identity getCsgIdentity()
    {
	return (CSG_Identity)mComponents[0];
    }
    
    public void setCsgIdentity(CSG_Identity csgIdentity)
    {
	mComponents[0] = csgIdentity;
    }
    
    public boolean hasCsgIdentity()
    {
	return componentIsPresent(0);
    }
    
    public void deleteCsgIdentity()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "csgMemberIndication"
    public CsgMemberIndication getCsgMemberIndication()
    {
	return (CsgMemberIndication)mComponents[1];
    }
    
    public void setCsgMemberIndication(CsgMemberIndication csgMemberIndication)
    {
	mComponents[1] = csgMemberIndication;
    }
    
    public boolean hasCsgMemberIndication()
    {
	return componentIsPresent(1);
    }
    
    public void deleteCsgMemberIndication()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type CsgMemberIndication from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class CsgMemberIndication extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private CsgMemberIndication()
	{
	    super(cFirstNumber);
	}
	
	protected CsgMemberIndication(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final CsgMemberIndication member =
	    new CsgMemberIndication(0);
	private final static CsgMemberIndication cNamedNumbers[] = {
	     member
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
	
	public static CsgMemberIndication valueOf(long value)
	{
	    return (CsgMemberIndication)member.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"CellMeasuredResults_v920ext$CsgMemberIndication"
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
			"member",
			0
		    )
		}
	    ),
	    0,
	    member
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' CsgMemberIndication object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' CsgMemberIndication object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for CsgMemberIndication

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
	    "CellMeasuredResults_v920ext"
	),
	new QName (
	    "InformationElements",
	    "CellMeasuredResults-v920ext"
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
				"CSG_Identity"
			    ),
			    new QName (
				"InformationElements",
				"CSG-Identity"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(27)
				)
			    ),
			    new Bounds (
				new java.lang.Long(27),
				new java.lang.Long(27)
			    ),
			    null
			)
		    ),
		    "csgIdentity",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "CellMeasuredResults_v920ext$CsgMemberIndication"
			)
		    ),
		    "csgMemberIndication",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' CellMeasuredResults_v920ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CellMeasuredResults_v920ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CellMeasuredResults_v920ext
