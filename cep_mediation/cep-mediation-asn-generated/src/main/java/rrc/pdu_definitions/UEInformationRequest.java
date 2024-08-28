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
 * Define the ASN1 Type UEInformationRequest from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class UEInformationRequest extends Sequence {
    
    /**
     * The default constructor.
     */
    public UEInformationRequest()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UEInformationRequest(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
		    CriticalExtensions criticalExtensions)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	setCriticalExtensions(criticalExtensions);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.RRC_TransactionIdentifier();
	mComponents[1] = new CriticalExtensions();
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
		return new rrc.informationelements.RRC_TransactionIdentifier();
	    case 1:
		return new CriticalExtensions();
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
    
    
    // Methods for field "criticalExtensions"
    public CriticalExtensions getCriticalExtensions()
    {
	return (CriticalExtensions)mComponents[1];
    }
    
    public void setCriticalExtensions(CriticalExtensions criticalExtensions)
    {
	mComponents[1] = criticalExtensions;
    }
    
    
    
    /**
     * Define the ASN1 Type CriticalExtensions from ASN1 Module PDU_definitions.
     * @see Choice
     */
    public static class CriticalExtensions extends Choice {
	
	/**
	 * The default constructor.
	 */
	public CriticalExtensions()
	{
	}
	
	public static final  int  r10_chosen = 1;
	public static final  int  criticalExtensions_chosen = 2;
	
	// Methods for field "r10"
	public static CriticalExtensions createCriticalExtensionsWithR10(R10 r10)
	{
	    CriticalExtensions __object = new CriticalExtensions();

	    __object.setR10(r10);
	    return __object;
	}
	
	public boolean hasR10()
	{
	    return getChosenFlag() == r10_chosen;
	}
	
	public void setR10(R10 r10)
	{
	    setChosenValue(r10);
	    setChosenFlag(r10_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type R10 from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class R10 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public R10()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public R10(UEInformationRequest_r10_IEs ueInformationRequest_r10, 
			    BitString ueInformationRequest_r10_add_ext, 
			    NonCriticalExtensions nonCriticalExtensions)
	    {
		setUeInformationRequest_r10(ueInformationRequest_r10);
		setUeInformationRequest_r10_add_ext(ueInformationRequest_r10_add_ext);
		setNonCriticalExtensions(nonCriticalExtensions);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public R10(UEInformationRequest_r10_IEs ueInformationRequest_r10)
	    {
		setUeInformationRequest_r10(ueInformationRequest_r10);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new UEInformationRequest_r10_IEs();
		mComponents[1] = new BitString();
		mComponents[2] = new NonCriticalExtensions();
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
			return new UEInformationRequest_r10_IEs();
		    case 1:
			return new BitString();
		    case 2:
			return new NonCriticalExtensions();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "ueInformationRequest_r10"
	    public UEInformationRequest_r10_IEs getUeInformationRequest_r10()
	    {
		return (UEInformationRequest_r10_IEs)mComponents[0];
	    }
	    
	    public void setUeInformationRequest_r10(UEInformationRequest_r10_IEs ueInformationRequest_r10)
	    {
		mComponents[0] = ueInformationRequest_r10;
	    }
	    
	    
	    // Methods for field "ueInformationRequest_r10_add_ext"
	    public BitString getUeInformationRequest_r10_add_ext()
	    {
		return (BitString)mComponents[1];
	    }
	    
	    public void setUeInformationRequest_r10_add_ext(BitString ueInformationRequest_r10_add_ext)
	    {
		mComponents[1] = ueInformationRequest_r10_add_ext;
	    }
	    
	    public boolean hasUeInformationRequest_r10_add_ext()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteUeInformationRequest_r10_add_ext()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    // Methods for field "nonCriticalExtensions"
	    public NonCriticalExtensions getNonCriticalExtensions()
	    {
		return (NonCriticalExtensions)mComponents[2];
	    }
	    
	    public void setNonCriticalExtensions(NonCriticalExtensions nonCriticalExtensions)
	    {
		mComponents[2] = nonCriticalExtensions;
	    }
	    
	    public boolean hasNonCriticalExtensions()
	    {
		return componentIsPresent(2);
	    }
	    
	    public void deleteNonCriticalExtensions()
	    {
		setComponentAbsent(2);
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
			    (short)0x8002
			}
		    ),
		    new QName (
			"rrc.pdu_definitions",
			"UEInformationRequest$CriticalExtensions$R10$NonCriticalExtensions"
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
			(short)0x8000
		    }
		),
		new QName (
		    "rrc.pdu_definitions",
		    "UEInformationRequest$CriticalExtensions$R10"
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
					"UEInformationRequest_r10_IEs"
				    ),
				    new QName (
					"PDU-definitions",
					"UEInformationRequest-r10-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "UEInformationRequest_r10_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "UEInformationRequest_r10_IEs"
					)
				    ),
				    0
				)
			    ),
			    "ueInformationRequest-r10",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new BitStringInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
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
			    "ueInformationRequest-r10-add-ext",
			    1,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "UEInformationRequest$CriticalExtensions$R10$NonCriticalExtensions"
				)
			    ),
			    "nonCriticalExtensions",
			    2,
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
	     * Get the type descriptor (TypeInfo) of 'this' R10 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' R10 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for R10

	// Methods for field "criticalExtensions"
	public static CriticalExtensions createCriticalExtensionsWithCriticalExtensions(CriticalExtensions1 criticalExtensions)
	{
	    CriticalExtensions __object = new CriticalExtensions();

	    __object.setCriticalExtensions(criticalExtensions);
	    return __object;
	}
	
	public boolean hasCriticalExtensions()
	{
	    return getChosenFlag() == criticalExtensions_chosen;
	}
	
	public void setCriticalExtensions(CriticalExtensions1 criticalExtensions)
	{
	    setChosenValue(criticalExtensions);
	    setChosenFlag(criticalExtensions_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type CriticalExtensions1 from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class CriticalExtensions1 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public CriticalExtensions1()
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
		    "UEInformationRequest$CriticalExtensions$CriticalExtensions1"
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
	     * Get the type descriptor (TypeInfo) of 'this' CriticalExtensions1 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' CriticalExtensions1 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for CriticalExtensions1

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case r10_chosen:
		    return new R10();
		case criticalExtensions_chosen:
		    return new CriticalExtensions1();
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
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"UEInformationRequest$CriticalExtensions"
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
				"UEInformationRequest$CriticalExtensions$R10"
			    )
			),
			"r10",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"UEInformationRequest$CriticalExtensions$CriticalExtensions1"
			    )
			),
			"criticalExtensions",
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
	 * Get the type descriptor (TypeInfo) of 'this' CriticalExtensions object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' CriticalExtensions object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for CriticalExtensions

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
	    "UEInformationRequest"
	),
	new QName (
	    "PDU-definitions",
	    "UEInformationRequest"
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
			new QName (
			    "rrc.pdu_definitions",
			    "UEInformationRequest$CriticalExtensions"
			)
		    ),
		    "criticalExtensions",
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
     * Get the type descriptor (TypeInfo) of 'this' UEInformationRequest object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UEInformationRequest object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UEInformationRequest
