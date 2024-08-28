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
 * Define the ASN1 Type PagingRecord2_r5 from ASN1 Module InformationElements.
 * @see Choice
 */

public class PagingRecord2_r5 extends Choice {
    
    /**
     * The default constructor.
     */
    public PagingRecord2_r5()
    {
    }
    
    public static final  int  utran_SingleUE_Identity_chosen = 1;
    public static final  int  utran_GroupIdentity_chosen = 2;
    
    // Methods for field "utran_SingleUE_Identity"
    public static PagingRecord2_r5 createPagingRecord2_r5WithUtran_SingleUE_Identity(Utran_SingleUE_Identity utran_SingleUE_Identity)
    {
	PagingRecord2_r5 __object = new PagingRecord2_r5();

	__object.setUtran_SingleUE_Identity(utran_SingleUE_Identity);
	return __object;
    }
    
    public boolean hasUtran_SingleUE_Identity()
    {
	return getChosenFlag() == utran_SingleUE_Identity_chosen;
    }
    
    public void setUtran_SingleUE_Identity(Utran_SingleUE_Identity utran_SingleUE_Identity)
    {
	setChosenValue(utran_SingleUE_Identity);
	setChosenFlag(utran_SingleUE_Identity_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Utran_SingleUE_Identity from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Utran_SingleUE_Identity extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Utran_SingleUE_Identity()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Utran_SingleUE_Identity(U_RNTI u_RNTI, 
			Cn_OriginatedPage_connectedMode_UE cn_OriginatedPage_connectedMode_UE, 
			RRC_ConnectionReleaseInformation rrc_ConnectionReleaseInformation)
	{
	    setU_RNTI(u_RNTI);
	    setCn_OriginatedPage_connectedMode_UE(cn_OriginatedPage_connectedMode_UE);
	    setRrc_ConnectionReleaseInformation(rrc_ConnectionReleaseInformation);
	}
	
	/**
	 * Construct with required components.
	 */
	public Utran_SingleUE_Identity(U_RNTI u_RNTI, 
			RRC_ConnectionReleaseInformation rrc_ConnectionReleaseInformation)
	{
	    setU_RNTI(u_RNTI);
	    setRrc_ConnectionReleaseInformation(rrc_ConnectionReleaseInformation);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new U_RNTI();
	    mComponents[1] = new Cn_OriginatedPage_connectedMode_UE();
	    mComponents[2] = new RRC_ConnectionReleaseInformation();
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
		    return new U_RNTI();
		case 1:
		    return new Cn_OriginatedPage_connectedMode_UE();
		case 2:
		    return new RRC_ConnectionReleaseInformation();
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
		    "PagingRecord2_r5$Utran_SingleUE_Identity$Cn_OriginatedPage_connectedMode_UE"
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

	// Methods for field "rrc_ConnectionReleaseInformation"
	public RRC_ConnectionReleaseInformation getRrc_ConnectionReleaseInformation()
	{
	    return (RRC_ConnectionReleaseInformation)mComponents[2];
	}
	
	public void setRrc_ConnectionReleaseInformation(RRC_ConnectionReleaseInformation rrc_ConnectionReleaseInformation)
	{
	    mComponents[2] = rrc_ConnectionReleaseInformation;
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
		"PagingRecord2_r5$Utran_SingleUE_Identity"
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
				"PagingRecord2_r5$Utran_SingleUE_Identity$Cn_OriginatedPage_connectedMode_UE"
			    )
			),
			"cn-OriginatedPage-connectedMode-UE",
			1,
			3,
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
				    "RRC_ConnectionReleaseInformation"
				),
				new QName (
				    "InformationElements",
				    "RRC-ConnectionReleaseInformation"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"RRC_ConnectionReleaseInformation"
				    )
				),
				0,
				new TagDecoder (
				    new TagDecoderElement[] {
					new TagDecoderElement((short)0x8000, 0),
					new TagDecoderElement((short)0x8001, 1)
				    }
				)
			    )
			),
			"rrc-ConnectionReleaseInformation",
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
			    new TagDecoderElement((short)0x8001, 1),
			    new TagDecoderElement((short)0x8002, 2)
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
	 * Get the type descriptor (TypeInfo) of 'this' Utran_SingleUE_Identity object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Utran_SingleUE_Identity object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Utran_SingleUE_Identity

    // Methods for field "utran_GroupIdentity"
    public static PagingRecord2_r5 createPagingRecord2_r5WithUtran_GroupIdentity(Utran_GroupIdentity utran_GroupIdentity)
    {
	PagingRecord2_r5 __object = new PagingRecord2_r5();

	__object.setUtran_GroupIdentity(utran_GroupIdentity);
	return __object;
    }
    
    public boolean hasUtran_GroupIdentity()
    {
	return getChosenFlag() == utran_GroupIdentity_chosen;
    }
    
    public void setUtran_GroupIdentity(Utran_GroupIdentity utran_GroupIdentity)
    {
	setChosenValue(utran_GroupIdentity);
	setChosenFlag(utran_GroupIdentity_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Utran_GroupIdentity from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class Utran_GroupIdentity extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Utran_GroupIdentity()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Utran_GroupIdentity(GroupIdentityWithReleaseInformation[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(GroupIdentityWithReleaseInformation element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(GroupIdentityWithReleaseInformation element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized GroupIdentityWithReleaseInformation get(int atIndex)
	{
	    return (GroupIdentityWithReleaseInformation)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(GroupIdentityWithReleaseInformation element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(GroupIdentityWithReleaseInformation element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new GroupIdentityWithReleaseInformation();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"PagingRecord2_r5$Utran_GroupIdentity"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
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
	    ),
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "GroupIdentityWithReleaseInformation"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Utran_GroupIdentity object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Utran_GroupIdentity object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Utran_GroupIdentity

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case utran_SingleUE_Identity_chosen:
		return new Utran_SingleUE_Identity();
	    case utran_GroupIdentity_chosen:
		return new Utran_GroupIdentity();
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
	    "PagingRecord2_r5"
	),
	new QName (
	    "InformationElements",
	    "PagingRecord2-r5"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PagingRecord2_r5$Utran_SingleUE_Identity"
			)
		    ),
		    "utran-SingleUE-Identity",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PagingRecord2_r5$Utran_GroupIdentity"
			)
		    ),
		    "utran-GroupIdentity",
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
     * Get the type descriptor (TypeInfo) of 'this' PagingRecord2_r5 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PagingRecord2_r5 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PagingRecord2_r5
