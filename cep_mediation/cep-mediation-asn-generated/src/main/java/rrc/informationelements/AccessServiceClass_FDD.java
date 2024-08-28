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
 * Define the ASN1 Type AccessServiceClass_FDD from ASN1 Module InformationElements.
 * @see Sequence
 */

public class AccessServiceClass_FDD extends Sequence {
    
    /**
     * The default constructor.
     */
    public AccessServiceClass_FDD()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AccessServiceClass_FDD(INTEGER availableSignatureStartIndex, 
		    INTEGER availableSignatureEndIndex, 
		    AssignedSubChannelNumber assignedSubChannelNumber)
    {
	setAvailableSignatureStartIndex(availableSignatureStartIndex);
	setAvailableSignatureEndIndex(availableSignatureEndIndex);
	setAssignedSubChannelNumber(assignedSubChannelNumber);
    }
    
    /**
     * Construct with components.
     */
    public AccessServiceClass_FDD(long availableSignatureStartIndex, 
		    long availableSignatureEndIndex, 
		    AssignedSubChannelNumber assignedSubChannelNumber)
    {
	this(new INTEGER(availableSignatureStartIndex), 
	     new INTEGER(availableSignatureEndIndex), 
	     assignedSubChannelNumber);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
	mComponents[2] = new AssignedSubChannelNumber();
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
		return new INTEGER();
	    case 1:
		return new INTEGER();
	    case 2:
		return new AssignedSubChannelNumber();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "availableSignatureStartIndex"
    public long getAvailableSignatureStartIndex()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setAvailableSignatureStartIndex(long availableSignatureStartIndex)
    {
	setAvailableSignatureStartIndex(new INTEGER(availableSignatureStartIndex));
    }
    
    public void setAvailableSignatureStartIndex(INTEGER availableSignatureStartIndex)
    {
	mComponents[0] = availableSignatureStartIndex;
    }
    
    
    // Methods for field "availableSignatureEndIndex"
    public long getAvailableSignatureEndIndex()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setAvailableSignatureEndIndex(long availableSignatureEndIndex)
    {
	setAvailableSignatureEndIndex(new INTEGER(availableSignatureEndIndex));
    }
    
    public void setAvailableSignatureEndIndex(INTEGER availableSignatureEndIndex)
    {
	mComponents[1] = availableSignatureEndIndex;
    }
    
    
    // Methods for field "assignedSubChannelNumber"
    public AssignedSubChannelNumber getAssignedSubChannelNumber()
    {
	return (AssignedSubChannelNumber)mComponents[2];
    }
    
    public void setAssignedSubChannelNumber(AssignedSubChannelNumber assignedSubChannelNumber)
    {
	mComponents[2] = assignedSubChannelNumber;
    }
    
    
    
    /**
     * Define the ASN1 Type AssignedSubChannelNumber from ASN1 Module InformationElements.
     * @see BitString
     */
    public static class AssignedSubChannelNumber extends BitString {
	
	/**
	 * The default constructor.
	 */
	public AssignedSubChannelNumber()
	{
	}
	
	/**
	 * Construct Bit String from a byte array.
	 * All bits considered significant.
	 * @param value the byte array to set this object to.
	 */
	public AssignedSubChannelNumber(byte[] value)
	{
	    super(value);
	}
	
	
	/**
	 * Construct Bit String from a byte array and significant bits.
	 * @param value the byte array to set this object to.
	 * @param sigBits the number of significant bits.
	 */
	public AssignedSubChannelNumber(byte[] value, int sigBits)
	{
	    super(value, sigBits);
	}
	
	// Named list definitions.
	public static final int b3 = 0;
	public static final int b2 = 1;
	public static final int b1 = 2;
	public static final int b0 = 3;
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final BitStringInfo c_typeinfo = new BitStringInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"AccessServiceClass_FDD$AssignedSubChannelNumber"
	    ),
	    new QName (
		"builtin",
		"BIT STRING"
	    ),
	    12314,
	    new SizeConstraint (
		new SingleValueConstraint (
		    new com.oss.asn1.INTEGER(4)
		)
	    ),
	    new Bounds (
		new java.lang.Long(4),
		new java.lang.Long(4)
	    ),
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"b3",
			0
		    ),
		    new MemberListElement (
			"b2",
			1
		    ),
		    new MemberListElement (
			"b1",
			2
		    ),
		    new MemberListElement (
			"b0",
			3
		    )
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' AssignedSubChannelNumber object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' AssignedSubChannelNumber object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for AssignedSubChannelNumber

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
	    "AccessServiceClass_FDD"
	),
	new QName (
	    "InformationElements",
	    "AccessServiceClass-FDD"
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
				    new com.oss.asn1.INTEGER(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "availableSignatureStartIndex",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
				    new com.oss.asn1.INTEGER(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "availableSignatureEndIndex",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "AccessServiceClass_FDD$AssignedSubChannelNumber"
			)
		    ),
		    "assignedSubChannelNumber",
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
     * Get the type descriptor (TypeInfo) of 'this' AccessServiceClass_FDD object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AccessServiceClass_FDD object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AccessServiceClass_FDD
