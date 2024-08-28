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
 * Define the ASN1 Type UECapabilityInformationConfirm from ASN1 Module PDU_definitions.
 * @see Choice
 */

public class UECapabilityInformationConfirm extends Choice {
    
    /**
     * The default constructor.
     */
    public UECapabilityInformationConfirm()
    {
    }
    
    public static final  int  r3_chosen = 1;
    public static final  int  later_than_r3_chosen = 2;
    
    // Methods for field "r3"
    public static UECapabilityInformationConfirm createUECapabilityInformationConfirmWithR3(R3 r3)
    {
	UECapabilityInformationConfirm __object = new UECapabilityInformationConfirm();

	__object.setR3(r3);
	return __object;
    }
    
    public boolean hasR3()
    {
	return getChosenFlag() == r3_chosen;
    }
    
    public void setR3(R3 r3)
    {
	setChosenValue(r3);
	setChosenFlag(r3_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type R3 from ASN1 Module PDU_definitions.
     * @see Sequence
     */
    public static class R3 extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public R3()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public R3(UECapabilityInformationConfirm_r3_IEs ueCapabilityInformationConfirm_r3, 
			LaterNCEs laterNCEs)
	{
	    setUeCapabilityInformationConfirm_r3(ueCapabilityInformationConfirm_r3);
	    setLaterNCEs(laterNCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public R3(UECapabilityInformationConfirm_r3_IEs ueCapabilityInformationConfirm_r3)
	{
	    setUeCapabilityInformationConfirm_r3(ueCapabilityInformationConfirm_r3);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new UECapabilityInformationConfirm_r3_IEs();
	    mComponents[1] = new LaterNCEs();
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
		    return new UECapabilityInformationConfirm_r3_IEs();
		case 1:
		    return new LaterNCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "ueCapabilityInformationConfirm_r3"
	public UECapabilityInformationConfirm_r3_IEs getUeCapabilityInformationConfirm_r3()
	{
	    return (UECapabilityInformationConfirm_r3_IEs)mComponents[0];
	}
	
	public void setUeCapabilityInformationConfirm_r3(UECapabilityInformationConfirm_r3_IEs ueCapabilityInformationConfirm_r3)
	{
	    mComponents[0] = ueCapabilityInformationConfirm_r3;
	}
	
	
	// Methods for field "laterNCEs"
	public LaterNCEs getLaterNCEs()
	{
	    return (LaterNCEs)mComponents[1];
	}
	
	public void setLaterNCEs(LaterNCEs laterNCEs)
	{
	    mComponents[1] = laterNCEs;
	}
	
	public boolean hasLaterNCEs()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteLaterNCEs()
	{
	    setComponentAbsent(1);
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
	    public LaterNCEs(BitString ueCapabilityInformationConfirm_r3_add_ext, 
			    V770NCEs v770NCEs)
	    {
		setUeCapabilityInformationConfirm_r3_add_ext(ueCapabilityInformationConfirm_r3_add_ext);
		setV770NCEs(v770NCEs);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new BitString();
		mComponents[1] = new V770NCEs();
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
			return new V770NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "ueCapabilityInformationConfirm_r3_add_ext"
	    public BitString getUeCapabilityInformationConfirm_r3_add_ext()
	    {
		return (BitString)mComponents[0];
	    }
	    
	    public void setUeCapabilityInformationConfirm_r3_add_ext(BitString ueCapabilityInformationConfirm_r3_add_ext)
	    {
		mComponents[0] = ueCapabilityInformationConfirm_r3_add_ext;
	    }
	    
	    public boolean hasUeCapabilityInformationConfirm_r3_add_ext()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteUeCapabilityInformationConfirm_r3_add_ext()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "v770NCEs"
	    public V770NCEs getV770NCEs()
	    {
		return (V770NCEs)mComponents[1];
	    }
	    
	    public void setV770NCEs(V770NCEs v770NCEs)
	    {
		mComponents[1] = v770NCEs;
	    }
	    
	    public boolean hasV770NCEs()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteV770NCEs()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type V770NCEs from ASN1 Module PDU_definitions.
	     * @see Sequence
	     */
	    public static class V770NCEs extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public V770NCEs()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public V770NCEs(UECapabilityInformationConfirm_v770ext_IEs ueCapabilityInformationConfirm_v770ext, 
				NonCriticalExtensions nonCriticalExtensions)
		{
		    setUeCapabilityInformationConfirm_v770ext(ueCapabilityInformationConfirm_v770ext);
		    setNonCriticalExtensions(nonCriticalExtensions);
		}
		
		/**
		 * Construct with required components.
		 */
		public V770NCEs(UECapabilityInformationConfirm_v770ext_IEs ueCapabilityInformationConfirm_v770ext)
		{
		    setUeCapabilityInformationConfirm_v770ext(ueCapabilityInformationConfirm_v770ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new UECapabilityInformationConfirm_v770ext_IEs();
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
			    return new UECapabilityInformationConfirm_v770ext_IEs();
			case 1:
			    return new NonCriticalExtensions();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "ueCapabilityInformationConfirm_v770ext"
		public UECapabilityInformationConfirm_v770ext_IEs getUeCapabilityInformationConfirm_v770ext()
		{
		    return (UECapabilityInformationConfirm_v770ext_IEs)mComponents[0];
		}
		
		public void setUeCapabilityInformationConfirm_v770ext(UECapabilityInformationConfirm_v770ext_IEs ueCapabilityInformationConfirm_v770ext)
		{
		    mComponents[0] = ueCapabilityInformationConfirm_v770ext;
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
			    "UECapabilityInformationConfirm$R3$LaterNCEs$V770NCEs$NonCriticalExtensions"
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
			"UECapabilityInformationConfirm$R3$LaterNCEs$V770NCEs"
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
					    "UECapabilityInformationConfirm_v770ext_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "UECapabilityInformationConfirm-v770ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"UECapabilityInformationConfirm_v770ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"UECapabilityInformationConfirm_v770ext_IEs"
					    )
					),
					0
				    )
				),
				"ueCapabilityInformationConfirm-v770ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"UECapabilityInformationConfirm$R3$LaterNCEs$V770NCEs$NonCriticalExtensions"
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
		 * Get the type descriptor (TypeInfo) of 'this' V770NCEs object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' V770NCEs object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for V770NCEs

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
		    "UECapabilityInformationConfirm$R3$LaterNCEs"
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
			    "ueCapabilityInformationConfirm-r3-add-ext",
			    0,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "UECapabilityInformationConfirm$R3$LaterNCEs$V770NCEs"
				)
			    ),
			    "v770NCEs",
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
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"UECapabilityInformationConfirm$R3"
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
				    "UECapabilityInformationConfirm_r3_IEs"
				),
				new QName (
				    "PDU-definitions",
				    "UECapabilityInformationConfirm-r3-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"UECapabilityInformationConfirm_r3_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"UECapabilityInformationConfirm_r3_IEs"
				    )
				),
				0
			    )
			),
			"ueCapabilityInformationConfirm-r3",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"UECapabilityInformationConfirm$R3$LaterNCEs"
			    )
			),
			"laterNCEs",
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
	 * Get the type descriptor (TypeInfo) of 'this' R3 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' R3 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for R3

    // Methods for field "later_than_r3"
    public static UECapabilityInformationConfirm createUECapabilityInformationConfirmWithLater_than_r3(Later_than_r3 later_than_r3)
    {
	UECapabilityInformationConfirm __object = new UECapabilityInformationConfirm();

	__object.setLater_than_r3(later_than_r3);
	return __object;
    }
    
    public boolean hasLater_than_r3()
    {
	return getChosenFlag() == later_than_r3_chosen;
    }
    
    public void setLater_than_r3(Later_than_r3 later_than_r3)
    {
	setChosenValue(later_than_r3);
	setChosenFlag(later_than_r3_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Later_than_r3 from ASN1 Module PDU_definitions.
     * @see Sequence
     */
    public static class Later_than_r3 extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Later_than_r3()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Later_than_r3(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
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
	 * @see Sequence
	 */
	public static class CriticalExtensions extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public CriticalExtensions()
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
		    "UECapabilityInformationConfirm$Later_than_r3$CriticalExtensions"
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
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"UECapabilityInformationConfirm$Later_than_r3"
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
				"UECapabilityInformationConfirm$Later_than_r3$CriticalExtensions"
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
	 * Get the type descriptor (TypeInfo) of 'this' Later_than_r3 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Later_than_r3 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Later_than_r3

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case r3_chosen:
		return new R3();
	    case later_than_r3_chosen:
		return new Later_than_r3();
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
	    "rrc.pdu_definitions",
	    "UECapabilityInformationConfirm"
	),
	new QName (
	    "PDU-definitions",
	    "UECapabilityInformationConfirm"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "UECapabilityInformationConfirm$R3"
			)
		    ),
		    "r3",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "UECapabilityInformationConfirm$Later_than_r3"
			)
		    ),
		    "later-than-r3",
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
     * Get the type descriptor (TypeInfo) of 'this' UECapabilityInformationConfirm object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UECapabilityInformationConfirm object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UECapabilityInformationConfirm
