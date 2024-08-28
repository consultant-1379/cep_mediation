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
 * Define the ASN1 Type HandoverFromUTRANFailure from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class HandoverFromUTRANFailure extends Sequence {
    
    /**
     * The default constructor.
     */
    public HandoverFromUTRANFailure()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HandoverFromUTRANFailure(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
		    rrc.informationelements.InterRAT_HO_FailureCause interRAT_HO_FailureCause, 
		    InterRATMessage interRATMessage, LaterNCEs laterNCEs)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	setInterRAT_HO_FailureCause(interRAT_HO_FailureCause);
	setInterRATMessage(interRATMessage);
	setLaterNCEs(laterNCEs);
    }
    
    /**
     * Construct with required components.
     */
    public HandoverFromUTRANFailure(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.RRC_TransactionIdentifier();
	mComponents[1] = new rrc.informationelements.InterRAT_HO_FailureCause();
	mComponents[2] = new InterRATMessage();
	mComponents[3] = new LaterNCEs();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.RRC_TransactionIdentifier();
	    case 1:
		return new rrc.informationelements.InterRAT_HO_FailureCause();
	    case 2:
		return new InterRATMessage();
	    case 3:
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
    
    
    // Methods for field "interRAT_HO_FailureCause"
    public rrc.informationelements.InterRAT_HO_FailureCause getInterRAT_HO_FailureCause()
    {
	return (rrc.informationelements.InterRAT_HO_FailureCause)mComponents[1];
    }
    
    public void setInterRAT_HO_FailureCause(rrc.informationelements.InterRAT_HO_FailureCause interRAT_HO_FailureCause)
    {
	mComponents[1] = interRAT_HO_FailureCause;
    }
    
    public boolean hasInterRAT_HO_FailureCause()
    {
	return componentIsPresent(1);
    }
    
    public void deleteInterRAT_HO_FailureCause()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "interRATMessage"
    public InterRATMessage getInterRATMessage()
    {
	return (InterRATMessage)mComponents[2];
    }
    
    public void setInterRATMessage(InterRATMessage interRATMessage)
    {
	mComponents[2] = interRATMessage;
    }
    
    public boolean hasInterRATMessage()
    {
	return componentIsPresent(2);
    }
    
    public void deleteInterRATMessage()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type InterRATMessage from ASN1 Module PDU_definitions.
     * @see Choice
     */
    public static class InterRATMessage extends Choice {
	
	/**
	 * The default constructor.
	 */
	public InterRATMessage()
	{
	}
	
	public static final  int  gsm_chosen = 1;
	public static final  int  cdma2000_chosen = 2;
	
	// Methods for field "gsm"
	public static InterRATMessage createInterRATMessageWithGsm(Gsm gsm)
	{
	    InterRATMessage __object = new InterRATMessage();

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
	 * Define the ASN1 Type Gsm from ASN1 Module PDU_definitions.
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
	    public Gsm(rrc.informationelements.GSM_MessageList gsm_MessageList)
	    {
		setGsm_MessageList(gsm_MessageList);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new rrc.informationelements.GSM_MessageList();
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
			return new rrc.informationelements.GSM_MessageList();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "gsm_MessageList"
	    public rrc.informationelements.GSM_MessageList getGsm_MessageList()
	    {
		return (rrc.informationelements.GSM_MessageList)mComponents[0];
	    }
	    
	    public void setGsm_MessageList(rrc.informationelements.GSM_MessageList gsm_MessageList)
	    {
		mComponents[0] = gsm_MessageList;
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
		    "rrc.pdu_definitions",
		    "HandoverFromUTRANFailure$InterRATMessage$Gsm"
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
				new ContainerInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"GSM_MessageList"
				    ),
				    new QName (
					"InformationElements",
					"GSM-MessageList"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(4),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(4)
				    ),
				    new TypeInfoRef (
					new BitStringInfo (
					    new Tags (
						new short[] {
						    0x0003
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
					    new SizeConstraint (
						new ValueRangeConstraint (
						    new AbstractBounds(
							new com.oss.asn1.INTEGER(1), 
							new com.oss.asn1.INTEGER(512),
							0
						    )
						)
					    ),
					    new Bounds (
						new java.lang.Long(1),
						new java.lang.Long(512)
					    ),
					    null
					)
				    )
				)
			    ),
			    "gsm-MessageList",
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

	// Methods for field "cdma2000"
	public static InterRATMessage createInterRATMessageWithCdma2000(Cdma2000 cdma2000)
	{
	    InterRATMessage __object = new InterRATMessage();

	    __object.setCdma2000(cdma2000);
	    return __object;
	}
	
	public boolean hasCdma2000()
	{
	    return getChosenFlag() == cdma2000_chosen;
	}
	
	public void setCdma2000(Cdma2000 cdma2000)
	{
	    setChosenValue(cdma2000);
	    setChosenFlag(cdma2000_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Cdma2000 from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class Cdma2000 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Cdma2000()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Cdma2000(rrc.informationelements.CDMA2000_MessageList cdma2000_MessageList)
	    {
		setCdma2000_MessageList(cdma2000_MessageList);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new rrc.informationelements.CDMA2000_MessageList();
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
			return new rrc.informationelements.CDMA2000_MessageList();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "cdma2000_MessageList"
	    public rrc.informationelements.CDMA2000_MessageList getCdma2000_MessageList()
	    {
		return (rrc.informationelements.CDMA2000_MessageList)mComponents[0];
	    }
	    
	    public void setCdma2000_MessageList(rrc.informationelements.CDMA2000_MessageList cdma2000_MessageList)
	    {
		mComponents[0] = cdma2000_MessageList;
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
		    "HandoverFromUTRANFailure$InterRATMessage$Cdma2000"
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
				new ContainerInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"CDMA2000_MessageList"
				    ),
				    new QName (
					"InformationElements",
					"CDMA2000-MessageList"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(4),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(4)
				    ),
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "CDMA2000_Message"
					)
				    )
				)
			    ),
			    "cdma2000-MessageList",
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
	     * Get the type descriptor (TypeInfo) of 'this' Cdma2000 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Cdma2000 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Cdma2000

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case gsm_chosen:
		    return new Gsm();
		case cdma2000_chosen:
		    return new Cdma2000();
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
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"HandoverFromUTRANFailure$InterRATMessage"
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
			    new QName (
				"rrc.pdu_definitions",
				"HandoverFromUTRANFailure$InterRATMessage$Gsm"
			    )
			),
			"gsm",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"HandoverFromUTRANFailure$InterRATMessage$Cdma2000"
			    )
			),
			"cdma2000",
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
	 * Get the type descriptor (TypeInfo) of 'this' InterRATMessage object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' InterRATMessage object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for InterRATMessage

    // Methods for field "laterNCEs"
    public LaterNCEs getLaterNCEs()
    {
	return (LaterNCEs)mComponents[3];
    }
    
    public void setLaterNCEs(LaterNCEs laterNCEs)
    {
	mComponents[3] = laterNCEs;
    }
    
    public boolean hasLaterNCEs()
    {
	return componentIsPresent(3);
    }
    
    public void deleteLaterNCEs()
    {
	setComponentAbsent(3);
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
	public LaterNCEs(BitString handoverFromUTRANFailure_r3_add_ext, 
			V590NCEs v590NCEs)
	{
	    setHandoverFromUTRANFailure_r3_add_ext(handoverFromUTRANFailure_r3_add_ext);
	    setV590NCEs(v590NCEs);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new BitString();
	    mComponents[1] = new V590NCEs();
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
		    return new V590NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "handoverFromUTRANFailure_r3_add_ext"
	public BitString getHandoverFromUTRANFailure_r3_add_ext()
	{
	    return (BitString)mComponents[0];
	}
	
	public void setHandoverFromUTRANFailure_r3_add_ext(BitString handoverFromUTRANFailure_r3_add_ext)
	{
	    mComponents[0] = handoverFromUTRANFailure_r3_add_ext;
	}
	
	public boolean hasHandoverFromUTRANFailure_r3_add_ext()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteHandoverFromUTRANFailure_r3_add_ext()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "v590NCEs"
	public V590NCEs getV590NCEs()
	{
	    return (V590NCEs)mComponents[1];
	}
	
	public void setV590NCEs(V590NCEs v590NCEs)
	{
	    mComponents[1] = v590NCEs;
	}
	
	public boolean hasV590NCEs()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteV590NCEs()
	{
	    setComponentAbsent(1);
	}
	
	
	
	/**
	 * Define the ASN1 Type V590NCEs from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class V590NCEs extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public V590NCEs()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public V590NCEs(HandoverFromUtranFailure_v590ext_IEs handoverFromUTRANFailure_v590ext, 
			    V860NCEs v860NCEs)
	    {
		setHandoverFromUTRANFailure_v590ext(handoverFromUTRANFailure_v590ext);
		setV860NCEs(v860NCEs);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V590NCEs(HandoverFromUtranFailure_v590ext_IEs handoverFromUTRANFailure_v590ext)
	    {
		setHandoverFromUTRANFailure_v590ext(handoverFromUTRANFailure_v590ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new HandoverFromUtranFailure_v590ext_IEs();
		mComponents[1] = new V860NCEs();
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
			return new HandoverFromUtranFailure_v590ext_IEs();
		    case 1:
			return new V860NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "handoverFromUTRANFailure_v590ext"
	    public HandoverFromUtranFailure_v590ext_IEs getHandoverFromUTRANFailure_v590ext()
	    {
		return (HandoverFromUtranFailure_v590ext_IEs)mComponents[0];
	    }
	    
	    public void setHandoverFromUTRANFailure_v590ext(HandoverFromUtranFailure_v590ext_IEs handoverFromUTRANFailure_v590ext)
	    {
		mComponents[0] = handoverFromUTRANFailure_v590ext;
	    }
	    
	    
	    // Methods for field "v860NCEs"
	    public V860NCEs getV860NCEs()
	    {
		return (V860NCEs)mComponents[1];
	    }
	    
	    public void setV860NCEs(V860NCEs v860NCEs)
	    {
		mComponents[1] = v860NCEs;
	    }
	    
	    public boolean hasV860NCEs()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteV860NCEs()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type V860NCEs from ASN1 Module PDU_definitions.
	     * @see Sequence
	     */
	    public static class V860NCEs extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public V860NCEs()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public V860NCEs(HandoverFromUtranFailure_v860ext_IEs handoverFromUTRANFailure_v860ext, 
				NonCriticalExtensions nonCriticalExtensions)
		{
		    setHandoverFromUTRANFailure_v860ext(handoverFromUTRANFailure_v860ext);
		    setNonCriticalExtensions(nonCriticalExtensions);
		}
		
		/**
		 * Construct with required components.
		 */
		public V860NCEs(HandoverFromUtranFailure_v860ext_IEs handoverFromUTRANFailure_v860ext)
		{
		    setHandoverFromUTRANFailure_v860ext(handoverFromUTRANFailure_v860ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new HandoverFromUtranFailure_v860ext_IEs();
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
			    return new HandoverFromUtranFailure_v860ext_IEs();
			case 1:
			    return new NonCriticalExtensions();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "handoverFromUTRANFailure_v860ext"
		public HandoverFromUtranFailure_v860ext_IEs getHandoverFromUTRANFailure_v860ext()
		{
		    return (HandoverFromUtranFailure_v860ext_IEs)mComponents[0];
		}
		
		public void setHandoverFromUTRANFailure_v860ext(HandoverFromUtranFailure_v860ext_IEs handoverFromUTRANFailure_v860ext)
		{
		    mComponents[0] = handoverFromUTRANFailure_v860ext;
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
			    "HandoverFromUTRANFailure$LaterNCEs$V590NCEs$V860NCEs$NonCriticalExtensions"
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
			    (short)0x8001
			}
		    ),
		    new QName (
			"rrc.pdu_definitions",
			"HandoverFromUTRANFailure$LaterNCEs$V590NCEs$V860NCEs"
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
					    "rrc.pdu_definitions",
					    "HandoverFromUtranFailure_v860ext_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "HandoverFromUtranFailure-v860ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"HandoverFromUtranFailure_v860ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"HandoverFromUtranFailure_v860ext_IEs"
					    )
					),
					0
				    )
				),
				"handoverFromUTRANFailure-v860ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"HandoverFromUTRANFailure$LaterNCEs$V590NCEs$V860NCEs$NonCriticalExtensions"
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
		 * Get the type descriptor (TypeInfo) of 'this' V860NCEs object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' V860NCEs object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for V860NCEs

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
		    "HandoverFromUTRANFailure$LaterNCEs$V590NCEs"
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
					"rrc.pdu_definitions",
					"HandoverFromUtranFailure_v590ext_IEs"
				    ),
				    new QName (
					"PDU-definitions",
					"HandoverFromUtranFailure-v590ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "HandoverFromUtranFailure_v590ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "HandoverFromUtranFailure_v590ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "handoverFromUTRANFailure-v590ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "HandoverFromUTRANFailure$LaterNCEs$V590NCEs$V860NCEs"
				)
			    ),
			    "v860NCEs",
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
	     * Get the type descriptor (TypeInfo) of 'this' V590NCEs object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' V590NCEs object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for V590NCEs

	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"HandoverFromUTRANFailure$LaterNCEs"
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
			"handoverFromUTRANFailure-r3-add-ext",
			0,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"HandoverFromUTRANFailure$LaterNCEs$V590NCEs"
			    )
			),
			"v590NCEs",
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
	    "HandoverFromUTRANFailure"
	),
	new QName (
	    "PDU-definitions",
	    "HandoverFromUTRANFailure"
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
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"InterRAT_HO_FailureCause"
			    ),
			    new QName (
				"InformationElements",
				"InterRAT-HO-FailureCause"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "InterRAT_HO_FailureCause"
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
				    new TagDecoderElement((short)0x8007, 7),
				    new TagDecoderElement((short)0x8008, 8),
				    new TagDecoderElement((short)0x8009, 9),
				    new TagDecoderElement((short)0x800a, 10),
				    new TagDecoderElement((short)0x800b, 11),
				    new TagDecoderElement((short)0x800c, 12),
				    new TagDecoderElement((short)0x800d, 13),
				    new TagDecoderElement((short)0x800e, 14),
				    new TagDecoderElement((short)0x800f, 15)
				}
			    )
			)
		    ),
		    "interRAT-HO-FailureCause",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "HandoverFromUTRANFailure$InterRATMessage"
			)
		    ),
		    "interRATMessage",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "HandoverFromUTRANFailure$LaterNCEs"
			)
		    ),
		    "laterNCEs",
		    3,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' HandoverFromUTRANFailure object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HandoverFromUTRANFailure object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HandoverFromUTRANFailure
