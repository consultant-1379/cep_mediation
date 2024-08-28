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
 * Define the ASN1 Type PagingRecord from ASN1 Module InformationElements.
 * @see Choice
 */

public class PagingRecord extends Choice {
    
    /**
     * The default constructor.
     */
    public PagingRecord()
    {
    }
    
    public static final  int  cn_Identity_chosen = 1;
    public static final  int  utran_Identity_chosen = 2;
    
    // Methods for field "cn_Identity"
    public static PagingRecord createPagingRecordWithCn_Identity(Cn_Identity cn_Identity)
    {
	PagingRecord __object = new PagingRecord();

	__object.setCn_Identity(cn_Identity);
	return __object;
    }
    
    public boolean hasCn_Identity()
    {
	return getChosenFlag() == cn_Identity_chosen;
    }
    
    public void setCn_Identity(Cn_Identity cn_Identity)
    {
	setChosenValue(cn_Identity);
	setChosenFlag(cn_Identity_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Cn_Identity from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Cn_Identity extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Cn_Identity()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Cn_Identity(PagingCause pagingCause, 
			CN_DomainIdentity cn_DomainIdentity, 
			CN_PagedUE_Identity cn_pagedUE_Identity)
	{
	    setPagingCause(pagingCause);
	    setCn_DomainIdentity(cn_DomainIdentity);
	    setCn_pagedUE_Identity(cn_pagedUE_Identity);
	}
	
	public void initComponents()
	{
	    mComponents[0] = PagingCause.terminatingConversationalCall;
	    mComponents[1] = CN_DomainIdentity.cs_domain;
	    mComponents[2] = new CN_PagedUE_Identity();
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
		    return PagingCause.terminatingConversationalCall;
		case 1:
		    return CN_DomainIdentity.cs_domain;
		case 2:
		    return new CN_PagedUE_Identity();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "pagingCause"
	public PagingCause getPagingCause()
	{
	    return (PagingCause)mComponents[0];
	}
	
	public void setPagingCause(PagingCause pagingCause)
	{
	    mComponents[0] = pagingCause;
	}
	
	
	// Methods for field "cn_DomainIdentity"
	public CN_DomainIdentity getCn_DomainIdentity()
	{
	    return (CN_DomainIdentity)mComponents[1];
	}
	
	public void setCn_DomainIdentity(CN_DomainIdentity cn_DomainIdentity)
	{
	    mComponents[1] = cn_DomainIdentity;
	}
	
	
	// Methods for field "cn_pagedUE_Identity"
	public CN_PagedUE_Identity getCn_pagedUE_Identity()
	{
	    return (CN_PagedUE_Identity)mComponents[2];
	}
	
	public void setCn_pagedUE_Identity(CN_PagedUE_Identity cn_pagedUE_Identity)
	{
	    mComponents[2] = cn_pagedUE_Identity;
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
		"PagingRecord$Cn_Identity"
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
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8000
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
				PagingCause.terminatingConversationalCall
			    )
			),
			"pagingCause",
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
			1,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new ChoiceInfo (
				new Tags (
				    new short[] {
					(short)0x8002
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "CN_PagedUE_Identity"
				),
				new QName (
				    "InformationElements",
				    "CN-PagedUE-Identity"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"CN_PagedUE_Identity"
				    )
				),
				0,
				new TagDecoder (
				    new TagDecoderElement[] {
					new TagDecoderElement((short)0x8000, 0),
					new TagDecoderElement((short)0x8001, 1),
					new TagDecoderElement((short)0x8002, 2),
					new TagDecoderElement((short)0x8003, 3),
					new TagDecoderElement((short)0x8004, 4),
					new TagDecoderElement((short)0x8005, 5),
					new TagDecoderElement((short)0x8006, 6),
					new TagDecoderElement((short)0x8007, 7)
				    }
				)
			    )
			),
			"cn-pagedUE-Identity",
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
	 * Get the type descriptor (TypeInfo) of 'this' Cn_Identity object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Cn_Identity object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Cn_Identity

    // Methods for field "utran_Identity"
    public static PagingRecord createPagingRecordWithUtran_Identity(Utran_Identity utran_Identity)
    {
	PagingRecord __object = new PagingRecord();

	__object.setUtran_Identity(utran_Identity);
	return __object;
    }
    
    public boolean hasUtran_Identity()
    {
	return getChosenFlag() == utran_Identity_chosen;
    }
    
    public void setUtran_Identity(Utran_Identity utran_Identity)
    {
	setChosenValue(utran_Identity);
	setChosenFlag(utran_Identity_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Utran_Identity from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Utran_Identity extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Utran_Identity()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Utran_Identity(U_RNTI u_RNTI, 
			Cn_OriginatedPage_connectedMode_UE cn_OriginatedPage_connectedMode_UE)
	{
	    setU_RNTI(u_RNTI);
	    setCn_OriginatedPage_connectedMode_UE(cn_OriginatedPage_connectedMode_UE);
	}
	
	/**
	 * Construct with required components.
	 */
	public Utran_Identity(U_RNTI u_RNTI)
	{
	    setU_RNTI(u_RNTI);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new U_RNTI();
	    mComponents[1] = new Cn_OriginatedPage_connectedMode_UE();
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
		    return new U_RNTI();
		case 1:
		    return new Cn_OriginatedPage_connectedMode_UE();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "u_RNTI"
	public U_RNTI getU_RNTI()
	{
	    return (U_RNTI)mComponents[0];
	}
	
	public void setU_RNTI(U_RNTI u_RNTI)
	{
	    mComponents[0] = u_RNTI;
	}
	
	
	// Methods for field "cn_OriginatedPage_connectedMode_UE"
	public Cn_OriginatedPage_connectedMode_UE getCn_OriginatedPage_connectedMode_UE()
	{
	    return (Cn_OriginatedPage_connectedMode_UE)mComponents[1];
	}
	
	public void setCn_OriginatedPage_connectedMode_UE(Cn_OriginatedPage_connectedMode_UE cn_OriginatedPage_connectedMode_UE)
	{
	    mComponents[1] = cn_OriginatedPage_connectedMode_UE;
	}
	
	public boolean hasCn_OriginatedPage_connectedMode_UE()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteCn_OriginatedPage_connectedMode_UE()
	{
	    setComponentAbsent(1);
	}
	
	
	
	/**
	 * Define the ASN1 Type Cn_OriginatedPage_connectedMode_UE from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Cn_OriginatedPage_connectedMode_UE extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Cn_OriginatedPage_connectedMode_UE()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Cn_OriginatedPage_connectedMode_UE(PagingCause pagingCause, 
			    CN_DomainIdentity cn_DomainIdentity, 
			    PagingRecordTypeID pagingRecordTypeID)
	    {
		setPagingCause(pagingCause);
		setCn_DomainIdentity(cn_DomainIdentity);
		setPagingRecordTypeID(pagingRecordTypeID);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = PagingCause.terminatingConversationalCall;
		mComponents[1] = CN_DomainIdentity.cs_domain;
		mComponents[2] = PagingRecordTypeID.imsi_GSM_MAP;
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
			return PagingCause.terminatingConversationalCall;
		    case 1:
			return CN_DomainIdentity.cs_domain;
		    case 2:
			return PagingRecordTypeID.imsi_GSM_MAP;
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "pagingCause"
	    public PagingCause getPagingCause()
	    {
		return (PagingCause)mComponents[0];
	    }
	    
	    public void setPagingCause(PagingCause pagingCause)
	    {
		mComponents[0] = pagingCause;
	    }
	    
	    
	    // Methods for field "cn_DomainIdentity"
	    public CN_DomainIdentity getCn_DomainIdentity()
	    {
		return (CN_DomainIdentity)mComponents[1];
	    }
	    
	    public void setCn_DomainIdentity(CN_DomainIdentity cn_DomainIdentity)
	    {
		mComponents[1] = cn_DomainIdentity;
	    }
	    
	    
	    // Methods for field "pagingRecordTypeID"
	    public PagingRecordTypeID getPagingRecordTypeID()
	    {
		return (PagingRecordTypeID)mComponents[2];
	    }
	    
	    public void setPagingRecordTypeID(PagingRecordTypeID pagingRecordTypeID)
	    {
		mComponents[2] = pagingRecordTypeID;
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
		    "rrc.informationelements",
		    "PagingRecord$Utran_Identity$Cn_OriginatedPage_connectedMode_UE"
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
				new EnumeratedInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
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
				    PagingCause.terminatingConversationalCall
				)
			    ),
			    "pagingCause",
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
				    PagingRecordTypeID.imsi_GSM_MAP
				)
			    ),
			    "pagingRecordTypeID",
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
	     * Get the type descriptor (TypeInfo) of 'this' Cn_OriginatedPage_connectedMode_UE object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Cn_OriginatedPage_connectedMode_UE object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Cn_OriginatedPage_connectedMode_UE

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
		"rrc.informationelements",
		"PagingRecord$Utran_Identity"
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
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "U_RNTI"
				),
				new QName (
				    "InformationElements",
				    "U-RNTI"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"U_RNTI"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"U_RNTI"
				    )
				),
				0
			    )
			),
			"u-RNTI",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"PagingRecord$Utran_Identity$Cn_OriginatedPage_connectedMode_UE"
			    )
			),
			"cn-OriginatedPage-connectedMode-UE",
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
	 * Get the type descriptor (TypeInfo) of 'this' Utran_Identity object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Utran_Identity object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Utran_Identity

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case cn_Identity_chosen:
		return new Cn_Identity();
	    case utran_Identity_chosen:
		return new Utran_Identity();
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
	    "PagingRecord"
	),
	new QName (
	    "InformationElements",
	    "PagingRecord"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PagingRecord$Cn_Identity"
			)
		    ),
		    "cn-Identity",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PagingRecord$Utran_Identity"
			)
		    ),
		    "utran-Identity",
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
     * Get the type descriptor (TypeInfo) of 'this' PagingRecord object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PagingRecord object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PagingRecord
