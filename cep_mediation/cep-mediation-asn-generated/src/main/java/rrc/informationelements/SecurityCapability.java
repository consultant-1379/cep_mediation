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
 * Define the ASN1 Type SecurityCapability from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SecurityCapability extends Sequence {
    
    /**
     * The default constructor.
     */
    public SecurityCapability()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SecurityCapability(CipheringAlgorithmCap cipheringAlgorithmCap, 
		    IntegrityProtectionAlgorithmCap integrityProtectionAlgorithmCap)
    {
	setCipheringAlgorithmCap(cipheringAlgorithmCap);
	setIntegrityProtectionAlgorithmCap(integrityProtectionAlgorithmCap);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CipheringAlgorithmCap();
	mComponents[1] = new IntegrityProtectionAlgorithmCap();
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
		return new CipheringAlgorithmCap();
	    case 1:
		return new IntegrityProtectionAlgorithmCap();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cipheringAlgorithmCap"
    public CipheringAlgorithmCap getCipheringAlgorithmCap()
    {
	return (CipheringAlgorithmCap)mComponents[0];
    }
    
    public void setCipheringAlgorithmCap(CipheringAlgorithmCap cipheringAlgorithmCap)
    {
	mComponents[0] = cipheringAlgorithmCap;
    }
    
    
    
    /**
     * Define the ASN1 Type CipheringAlgorithmCap from ASN1 Module InformationElements.
     * @see BitString
     */
    public static class CipheringAlgorithmCap extends BitString {
	
	/**
	 * The default constructor.
	 */
	public CipheringAlgorithmCap()
	{
	}
	
	/**
	 * Construct Bit String from a byte array.
	 * All bits considered significant.
	 * @param value the byte array to set this object to.
	 */
	public CipheringAlgorithmCap(byte[] value)
	{
	    super(value);
	}
	
	
	/**
	 * Construct Bit String from a byte array and significant bits.
	 * @param value the byte array to set this object to.
	 * @param sigBits the number of significant bits.
	 */
	public CipheringAlgorithmCap(byte[] value, int sigBits)
	{
	    super(value, sigBits);
	}
	
	// Named list definitions.
	public static final int spare15 = 0;
	public static final int spare14 = 1;
	public static final int spare13 = 2;
	public static final int spare12 = 3;
	public static final int spare11 = 4;
	public static final int spare10 = 5;
	public static final int spare9 = 6;
	public static final int spare8 = 7;
	public static final int spare7 = 8;
	public static final int spare6 = 9;
	public static final int spare5 = 10;
	public static final int spare4 = 11;
	public static final int spare3 = 12;
	public static final int uea2 = 13;
	public static final int uea1 = 14;
	public static final int uea0 = 15;
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final BitStringInfo c_typeinfo = new BitStringInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SecurityCapability$CipheringAlgorithmCap"
	    ),
	    new QName (
		"builtin",
		"BIT STRING"
	    ),
	    12314,
	    new SizeConstraint (
		new SingleValueConstraint (
		    new com.oss.asn1.INTEGER(16)
		)
	    ),
	    new Bounds (
		new java.lang.Long(16),
		new java.lang.Long(16)
	    ),
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"spare15",
			0
		    ),
		    new MemberListElement (
			"spare14",
			1
		    ),
		    new MemberListElement (
			"spare13",
			2
		    ),
		    new MemberListElement (
			"spare12",
			3
		    ),
		    new MemberListElement (
			"spare11",
			4
		    ),
		    new MemberListElement (
			"spare10",
			5
		    ),
		    new MemberListElement (
			"spare9",
			6
		    ),
		    new MemberListElement (
			"spare8",
			7
		    ),
		    new MemberListElement (
			"spare7",
			8
		    ),
		    new MemberListElement (
			"spare6",
			9
		    ),
		    new MemberListElement (
			"spare5",
			10
		    ),
		    new MemberListElement (
			"spare4",
			11
		    ),
		    new MemberListElement (
			"spare3",
			12
		    ),
		    new MemberListElement (
			"uea2",
			13
		    ),
		    new MemberListElement (
			"uea1",
			14
		    ),
		    new MemberListElement (
			"uea0",
			15
		    )
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' CipheringAlgorithmCap object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' CipheringAlgorithmCap object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for CipheringAlgorithmCap

    // Methods for field "integrityProtectionAlgorithmCap"
    public IntegrityProtectionAlgorithmCap getIntegrityProtectionAlgorithmCap()
    {
	return (IntegrityProtectionAlgorithmCap)mComponents[1];
    }
    
    public void setIntegrityProtectionAlgorithmCap(IntegrityProtectionAlgorithmCap integrityProtectionAlgorithmCap)
    {
	mComponents[1] = integrityProtectionAlgorithmCap;
    }
    
    
    
    /**
     * Define the ASN1 Type IntegrityProtectionAlgorithmCap from ASN1 Module InformationElements.
     * @see BitString
     */
    public static class IntegrityProtectionAlgorithmCap extends BitString {
	
	/**
	 * The default constructor.
	 */
	public IntegrityProtectionAlgorithmCap()
	{
	}
	
	/**
	 * Construct Bit String from a byte array.
	 * All bits considered significant.
	 * @param value the byte array to set this object to.
	 */
	public IntegrityProtectionAlgorithmCap(byte[] value)
	{
	    super(value);
	}
	
	
	/**
	 * Construct Bit String from a byte array and significant bits.
	 * @param value the byte array to set this object to.
	 * @param sigBits the number of significant bits.
	 */
	public IntegrityProtectionAlgorithmCap(byte[] value, int sigBits)
	{
	    super(value, sigBits);
	}
	
	// Named list definitions.
	public static final int spare15 = 0;
	public static final int spare14 = 1;
	public static final int spare13 = 2;
	public static final int spare12 = 3;
	public static final int spare11 = 4;
	public static final int spare10 = 5;
	public static final int spare9 = 6;
	public static final int spare8 = 7;
	public static final int spare7 = 8;
	public static final int spare6 = 9;
	public static final int spare5 = 10;
	public static final int spare4 = 11;
	public static final int spare3 = 12;
	public static final int uia2 = 13;
	public static final int uia1 = 14;
	public static final int spare0 = 15;
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final BitStringInfo c_typeinfo = new BitStringInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SecurityCapability$IntegrityProtectionAlgorithmCap"
	    ),
	    new QName (
		"builtin",
		"BIT STRING"
	    ),
	    12314,
	    new SizeConstraint (
		new SingleValueConstraint (
		    new com.oss.asn1.INTEGER(16)
		)
	    ),
	    new Bounds (
		new java.lang.Long(16),
		new java.lang.Long(16)
	    ),
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"spare15",
			0
		    ),
		    new MemberListElement (
			"spare14",
			1
		    ),
		    new MemberListElement (
			"spare13",
			2
		    ),
		    new MemberListElement (
			"spare12",
			3
		    ),
		    new MemberListElement (
			"spare11",
			4
		    ),
		    new MemberListElement (
			"spare10",
			5
		    ),
		    new MemberListElement (
			"spare9",
			6
		    ),
		    new MemberListElement (
			"spare8",
			7
		    ),
		    new MemberListElement (
			"spare7",
			8
		    ),
		    new MemberListElement (
			"spare6",
			9
		    ),
		    new MemberListElement (
			"spare5",
			10
		    ),
		    new MemberListElement (
			"spare4",
			11
		    ),
		    new MemberListElement (
			"spare3",
			12
		    ),
		    new MemberListElement (
			"uia2",
			13
		    ),
		    new MemberListElement (
			"uia1",
			14
		    ),
		    new MemberListElement (
			"spare0",
			15
		    )
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' IntegrityProtectionAlgorithmCap object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' IntegrityProtectionAlgorithmCap object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for IntegrityProtectionAlgorithmCap

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
	    "SecurityCapability"
	),
	new QName (
	    "InformationElements",
	    "SecurityCapability"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SecurityCapability$CipheringAlgorithmCap"
			)
		    ),
		    "cipheringAlgorithmCap",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SecurityCapability$IntegrityProtectionAlgorithmCap"
			)
		    ),
		    "integrityProtectionAlgorithmCap",
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
     * Get the type descriptor (TypeInfo) of 'this' SecurityCapability object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SecurityCapability object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SecurityCapability
