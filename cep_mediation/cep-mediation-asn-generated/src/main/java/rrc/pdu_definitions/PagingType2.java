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
 * Define the ASN1 Type PagingType2 from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class PagingType2 extends Sequence {
    
    /**
     * The default constructor.
     */
    public PagingType2()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PagingType2(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
		    rrc.informationelements.PagingCause pagingCause, 
		    rrc.informationelements.CN_DomainIdentity cn_DomainIdentity, 
		    rrc.informationelements.PagingRecordTypeID pagingRecordTypeID, 
		    LaterNCEs laterNCEs)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	setPagingCause(pagingCause);
	setCn_DomainIdentity(cn_DomainIdentity);
	setPagingRecordTypeID(pagingRecordTypeID);
	setLaterNCEs(laterNCEs);
    }
    
    /**
     * Construct with required components.
     */
    public PagingType2(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
		    rrc.informationelements.PagingCause pagingCause, 
		    rrc.informationelements.CN_DomainIdentity cn_DomainIdentity, 
		    rrc.informationelements.PagingRecordTypeID pagingRecordTypeID)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	setPagingCause(pagingCause);
	setCn_DomainIdentity(cn_DomainIdentity);
	setPagingRecordTypeID(pagingRecordTypeID);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.RRC_TransactionIdentifier();
	mComponents[1] = rrc.informationelements.PagingCause.terminatingConversationalCall;
	mComponents[2] = rrc.informationelements.CN_DomainIdentity.cs_domain;
	mComponents[3] = rrc.informationelements.PagingRecordTypeID.imsi_GSM_MAP;
	mComponents[4] = new LaterNCEs();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.RRC_TransactionIdentifier();
	    case 1:
		return rrc.informationelements.PagingCause.terminatingConversationalCall;
	    case 2:
		return rrc.informationelements.CN_DomainIdentity.cs_domain;
	    case 3:
		return rrc.informationelements.PagingRecordTypeID.imsi_GSM_MAP;
	    case 4:
		return new LaterNCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rrc_TransactionIdentifier"
    public rrc.informationelements.RRC_TransactionIdentifier getRrc_TransactionIdentifier()
    {
	return (rrc.informationelements.RRC_TransactionIdentifier)mComponents[0];
    }
    
    public void setRrc_TransactionIdentifier(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier)
    {
	mComponents[0] = rrc_TransactionIdentifier;
    }
    
    
    // Methods for field "pagingCause"
    public rrc.informationelements.PagingCause getPagingCause()
    {
	return (rrc.informationelements.PagingCause)mComponents[1];
    }
    
    public void setPagingCause(rrc.informationelements.PagingCause pagingCause)
    {
	mComponents[1] = pagingCause;
    }
    
    
    // Methods for field "cn_DomainIdentity"
    public rrc.informationelements.CN_DomainIdentity getCn_DomainIdentity()
    {
	return (rrc.informationelements.CN_DomainIdentity)mComponents[2];
    }
    
    public void setCn_DomainIdentity(rrc.informationelements.CN_DomainIdentity cn_DomainIdentity)
    {
	mComponents[2] = cn_DomainIdentity;
    }
    
    
    // Methods for field "pagingRecordTypeID"
    public rrc.informationelements.PagingRecordTypeID getPagingRecordTypeID()
    {
	return (rrc.informationelements.PagingRecordTypeID)mComponents[3];
    }
    
    public void setPagingRecordTypeID(rrc.informationelements.PagingRecordTypeID pagingRecordTypeID)
    {
	mComponents[3] = pagingRecordTypeID;
    }
    
    
    // Methods for field "laterNCEs"
    public LaterNCEs getLaterNCEs()
    {
	return (LaterNCEs)mComponents[4];
    }
    
    public void setLaterNCEs(LaterNCEs laterNCEs)
    {
	mComponents[4] = laterNCEs;
    }
    
    public boolean hasLaterNCEs()
    {
	return componentIsPresent(4);
    }
    
    public void deleteLaterNCEs()
    {
	setComponentAbsent(4);
    }
    
    
    
    /**
     * Define the ASN1 Type LaterNCEs from ASN1 Module PDU_definitions.
     * @see Sequence
     */
    public static class LaterNCEs extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public LaterNCEs()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public LaterNCEs(BitString pagingType2_r3_add_ext, 
			NonCriticalExtensions nonCriticalExtensions)
	{
	    setPagingType2_r3_add_ext(pagingType2_r3_add_ext);
	    setNonCriticalExtensions(nonCriticalExtensions);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new BitString();
	    mComponents[1] = new NonCriticalExtensions();
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
		    return new BitString();
		case 1:
		    return new NonCriticalExtensions();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "pagingType2_r3_add_ext"
	public BitString getPagingType2_r3_add_ext()
	{
	    return (BitString)mComponents[0];
	}
	
	public void setPagingType2_r3_add_ext(BitString pagingType2_r3_add_ext)
	{
	    mComponents[0] = pagingType2_r3_add_ext;
	}
	
	public boolean hasPagingType2_r3_add_ext()
	{
	    return componentIsPresent(0);
	}
	
	public void deletePagingType2_r3_add_ext()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "nonCriticalExtensions"
	public NonCriticalExtensions getNonCriticalExtensions()
	{
	    return (NonCriticalExtensions)mComponents[1];
	}
	
	public void setNonCriticalExtensions(NonCriticalExtensions nonCriticalExtensions)
	{
	    mComponents[1] = nonCriticalExtensions;
	}
	
	public boolean hasNonCriticalExtensions()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteNonCriticalExtensions()
	{
	    setComponentAbsent(1);
	}
	
	
	
	/**
	 * Define the ASN1 Type NonCriticalExtensions from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class NonCriticalExtensions extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public NonCriticalExtensions()
	    {
	    }
	    
	    public void initComponents()
	    {
		
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[0];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		return null;
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.pdu_definitions",
		    "PagingType2$LaterNCEs$NonCriticalExtensions"
		),
		new QName (
		    "builtin",
		    "SEQUENCE"
		),
		12314,
		null,
		new Fields (
		    new SequenceFieldInfo[] {
		    }
		),
		0,
		null,
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for NonCriticalExtensions

	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8004
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"PagingType2$LaterNCEs"
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
				    "com.oss.asn1",
				    "BitString"
				),
				new QName (
				    "builtin",
				    "BIT STRING"
				),
				12314,
				null,
				null,
				null
			    )
			),
			"pagingType2-r3-add-ext",
			0,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"PagingType2$LaterNCEs$NonCriticalExtensions"
			    )
			),
			"nonCriticalExtensions",
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
	 * Get the type descriptor (TypeInfo) of 'this' LaterNCEs object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' LaterNCEs object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for LaterNCEs

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
	    "PagingType2"
	),
	new QName (
	    "PDU-definitions",
	    "PagingType2"
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
		    "rrc-TransactionIdentifier",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PagingCause"
			    ),
			    new QName (
				"InformationElements",
				"PagingCause"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"terminatingConversationalCall",
					0
				    ),
				    new MemberListElement (
					"terminatingStreamingCall",
					1
				    ),
				    new MemberListElement (
					"terminatingInteractiveCall",
					2
				    ),
				    new MemberListElement (
					"terminatingBackgroundCall",
					3
				    ),
				    new MemberListElement (
					"terminatingHighPrioritySignalling",
					4
				    ),
				    new MemberListElement (
					"terminatingLowPrioritySignalling",
					5
				    ),
				    new MemberListElement (
					"terminatingCauseUnknown",
					6
				    ),
				    new MemberListElement (
					"spare",
					7
				    )
				}
			    ),
			    0,
			    rrc.informationelements.PagingCause.terminatingConversationalCall
			)
		    ),
		    "pagingCause",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
			    rrc.informationelements.CN_DomainIdentity.cs_domain
			)
		    ),
		    "cn-DomainIdentity",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PagingRecordTypeID"
			    ),
			    new QName (
				"InformationElements",
				"PagingRecordTypeID"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"imsi-GSM-MAP",
					0
				    ),
				    new MemberListElement (
					"tmsi-GSM-MAP-P-TMSI",
					1
				    ),
				    new MemberListElement (
					"imsi-DS-41",
					2
				    ),
				    new MemberListElement (
					"tmsi-DS-41",
					3
				    )
				}
			    ),
			    0,
			    rrc.informationelements.PagingRecordTypeID.imsi_GSM_MAP
			)
		    ),
		    "pagingRecordTypeID",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "PagingType2$LaterNCEs"
			)
		    ),
		    "laterNCEs",
		    4,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PagingType2 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PagingType2 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PagingType2
