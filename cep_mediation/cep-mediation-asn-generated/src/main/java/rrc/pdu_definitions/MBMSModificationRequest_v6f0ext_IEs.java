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
 * Define the ASN1 Type MBMSModificationRequest_v6f0ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class MBMSModificationRequest_v6f0ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMSModificationRequest_v6f0ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMSModificationRequest_v6f0ext_IEs(MbmsSupportOfServiceChangeForAPtpRB mbmsSupportOfServiceChangeForAPtpRB)
    {
	setMbmsSupportOfServiceChangeForAPtpRB(mbmsSupportOfServiceChangeForAPtpRB);
    }
    
    public void initComponents()
    {
	mComponents[0] = MbmsSupportOfServiceChangeForAPtpRB._true;
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
		return MbmsSupportOfServiceChangeForAPtpRB._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mbmsSupportOfServiceChangeForAPtpRB"
    public MbmsSupportOfServiceChangeForAPtpRB getMbmsSupportOfServiceChangeForAPtpRB()
    {
	return (MbmsSupportOfServiceChangeForAPtpRB)mComponents[0];
    }
    
    public void setMbmsSupportOfServiceChangeForAPtpRB(MbmsSupportOfServiceChangeForAPtpRB mbmsSupportOfServiceChangeForAPtpRB)
    {
	mComponents[0] = mbmsSupportOfServiceChangeForAPtpRB;
    }
    
    public boolean hasMbmsSupportOfServiceChangeForAPtpRB()
    {
	return componentIsPresent(0);
    }
    
    public void deleteMbmsSupportOfServiceChangeForAPtpRB()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type MbmsSupportOfServiceChangeForAPtpRB from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class MbmsSupportOfServiceChangeForAPtpRB extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private MbmsSupportOfServiceChangeForAPtpRB()
	{
	    super(cFirstNumber);
	}
	
	protected MbmsSupportOfServiceChangeForAPtpRB(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final MbmsSupportOfServiceChangeForAPtpRB _true =
	    new MbmsSupportOfServiceChangeForAPtpRB(0);
	private final static MbmsSupportOfServiceChangeForAPtpRB cNamedNumbers[] = {
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
	
	public static MbmsSupportOfServiceChangeForAPtpRB valueOf(long value)
	{
	    return (MbmsSupportOfServiceChangeForAPtpRB)_true.lookupValue(value);
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
		"rrc.pdu_definitions",
		"MBMSModificationRequest_v6f0ext_IEs$MbmsSupportOfServiceChangeForAPtpRB"
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
	 * Get the type descriptor (TypeInfo) of 'this' MbmsSupportOfServiceChangeForAPtpRB object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' MbmsSupportOfServiceChangeForAPtpRB object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for MbmsSupportOfServiceChangeForAPtpRB

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
	    "MBMSModificationRequest_v6f0ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "MBMSModificationRequest-v6f0ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "MBMSModificationRequest_v6f0ext_IEs$MbmsSupportOfServiceChangeForAPtpRB"
			)
		    ),
		    "mbmsSupportOfServiceChangeForAPtpRB",
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
     * Get the type descriptor (TypeInfo) of 'this' MBMSModificationRequest_v6f0ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMSModificationRequest_v6f0ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMSModificationRequest_v6f0ext_IEs
