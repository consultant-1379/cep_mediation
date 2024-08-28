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
 * Define the ASN1 Type HandoverFromUTRANCommand_GSM from ASN1 Module PDU_definitions.
 * @see Choice
 */

public class HandoverFromUTRANCommand_GSM extends Choice {
    
    /**
     * The default constructor.
     */
    public HandoverFromUTRANCommand_GSM()
    {
    }
    
    public static final  int  r3_chosen = 1;
    public static final  int  later_than_r3_chosen = 2;
    
    // Methods for field "r3"
    public static HandoverFromUTRANCommand_GSM createHandoverFromUTRANCommand_GSMWithR3(R3 r3)
    {
	HandoverFromUTRANCommand_GSM __object = new HandoverFromUTRANCommand_GSM();

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
	public R3(HandoverFromUTRANCommand_GSM_r3_IEs handoverFromUTRANCommand_GSM_r3, 
			LaterNCEs laterNCEs)
	{
	    setHandoverFromUTRANCommand_GSM_r3(handoverFromUTRANCommand_GSM_r3);
	    setLaterNCEs(laterNCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public R3(HandoverFromUTRANCommand_GSM_r3_IEs handoverFromUTRANCommand_GSM_r3)
	{
	    setHandoverFromUTRANCommand_GSM_r3(handoverFromUTRANCommand_GSM_r3);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new HandoverFromUTRANCommand_GSM_r3_IEs();
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
		    return new HandoverFromUTRANCommand_GSM_r3_IEs();
		case 1:
		    return new LaterNCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "handoverFromUTRANCommand_GSM_r3"
	public HandoverFromUTRANCommand_GSM_r3_IEs getHandoverFromUTRANCommand_GSM_r3()
	{
	    return (HandoverFromUTRANCommand_GSM_r3_IEs)mComponents[0];
	}
	
	public void setHandoverFromUTRANCommand_GSM_r3(HandoverFromUTRANCommand_GSM_r3_IEs handoverFromUTRANCommand_GSM_r3)
	{
	    mComponents[0] = handoverFromUTRANCommand_GSM_r3;
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
	    public LaterNCEs(BitString handoverFromUTRANCommand_GSM_r3_add_ext, 
			    V690NCEs v690NCEs)
	    {
		setHandoverFromUTRANCommand_GSM_r3_add_ext(handoverFromUTRANCommand_GSM_r3_add_ext);
		setV690NCEs(v690NCEs);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new BitString();
		mComponents[1] = new V690NCEs();
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
			return new V690NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "handoverFromUTRANCommand_GSM_r3_add_ext"
	    public BitString getHandoverFromUTRANCommand_GSM_r3_add_ext()
	    {
		return (BitString)mComponents[0];
	    }
	    
	    public void setHandoverFromUTRANCommand_GSM_r3_add_ext(BitString handoverFromUTRANCommand_GSM_r3_add_ext)
	    {
		mComponents[0] = handoverFromUTRANCommand_GSM_r3_add_ext;
	    }
	    
	    public boolean hasHandoverFromUTRANCommand_GSM_r3_add_ext()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteHandoverFromUTRANCommand_GSM_r3_add_ext()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "v690NCEs"
	    public V690NCEs getV690NCEs()
	    {
		return (V690NCEs)mComponents[1];
	    }
	    
	    public void setV690NCEs(V690NCEs v690NCEs)
	    {
		mComponents[1] = v690NCEs;
	    }
	    
	    public boolean hasV690NCEs()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteV690NCEs()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type V690NCEs from ASN1 Module PDU_definitions.
	     * @see Sequence
	     */
	    public static class V690NCEs extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public V690NCEs()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public V690NCEs(HandoverFromUTRANCommand_GSM_v690ext_IEs handoverFromUTRANCommand_GSM_v690ext, 
				V860NCEs v860NCEs)
		{
		    setHandoverFromUTRANCommand_GSM_v690ext(handoverFromUTRANCommand_GSM_v690ext);
		    setV860NCEs(v860NCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public V690NCEs(HandoverFromUTRANCommand_GSM_v690ext_IEs handoverFromUTRANCommand_GSM_v690ext)
		{
		    setHandoverFromUTRANCommand_GSM_v690ext(handoverFromUTRANCommand_GSM_v690ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new HandoverFromUTRANCommand_GSM_v690ext_IEs();
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
			    return new HandoverFromUTRANCommand_GSM_v690ext_IEs();
			case 1:
			    return new V860NCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "handoverFromUTRANCommand_GSM_v690ext"
		public HandoverFromUTRANCommand_GSM_v690ext_IEs getHandoverFromUTRANCommand_GSM_v690ext()
		{
		    return (HandoverFromUTRANCommand_GSM_v690ext_IEs)mComponents[0];
		}
		
		public void setHandoverFromUTRANCommand_GSM_v690ext(HandoverFromUTRANCommand_GSM_v690ext_IEs handoverFromUTRANCommand_GSM_v690ext)
		{
		    mComponents[0] = handoverFromUTRANCommand_GSM_v690ext;
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
		    public V860NCEs(HandoverFromUTRANCommand_GSM_v860ext_IEs handoverFromUTRANCommand_GSM_v860ext, 
				    NonCriticalExtensions nonCriticalExtensions)
		    {
			setHandoverFromUTRANCommand_GSM_v860ext(handoverFromUTRANCommand_GSM_v860ext);
			setNonCriticalExtensions(nonCriticalExtensions);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public V860NCEs(HandoverFromUTRANCommand_GSM_v860ext_IEs handoverFromUTRANCommand_GSM_v860ext)
		    {
			setHandoverFromUTRANCommand_GSM_v860ext(handoverFromUTRANCommand_GSM_v860ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new HandoverFromUTRANCommand_GSM_v860ext_IEs();
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
				return new HandoverFromUTRANCommand_GSM_v860ext_IEs();
			    case 1:
				return new NonCriticalExtensions();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "handoverFromUTRANCommand_GSM_v860ext"
		    public HandoverFromUTRANCommand_GSM_v860ext_IEs getHandoverFromUTRANCommand_GSM_v860ext()
		    {
			return (HandoverFromUTRANCommand_GSM_v860ext_IEs)mComponents[0];
		    }
		    
		    public void setHandoverFromUTRANCommand_GSM_v860ext(HandoverFromUTRANCommand_GSM_v860ext_IEs handoverFromUTRANCommand_GSM_v860ext)
		    {
			mComponents[0] = handoverFromUTRANCommand_GSM_v860ext;
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
				"HandoverFromUTRANCommand_GSM$R3$LaterNCEs$V690NCEs$V860NCEs$NonCriticalExtensions"
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
			    "HandoverFromUTRANCommand_GSM$R3$LaterNCEs$V690NCEs$V860NCEs"
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
						"HandoverFromUTRANCommand_GSM_v860ext_IEs"
					    ),
					    new QName (
						"PDU-definitions",
						"HandoverFromUTRANCommand-GSM-v860ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.pdu_definitions",
						    "HandoverFromUTRANCommand_GSM_v860ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.pdu_definitions",
						    "HandoverFromUTRANCommand_GSM_v860ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "handoverFromUTRANCommand-GSM-v860ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "HandoverFromUTRANCommand_GSM$R3$LaterNCEs$V690NCEs$V860NCEs$NonCriticalExtensions"
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
			"HandoverFromUTRANCommand_GSM$R3$LaterNCEs$V690NCEs"
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
					    "HandoverFromUTRANCommand_GSM_v690ext_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "HandoverFromUTRANCommand-GSM-v690ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"HandoverFromUTRANCommand_GSM_v690ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"HandoverFromUTRANCommand_GSM_v690ext_IEs"
					    )
					),
					0
				    )
				),
				"handoverFromUTRANCommand-GSM-v690ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"HandoverFromUTRANCommand_GSM$R3$LaterNCEs$V690NCEs$V860NCEs"
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
		 * Get the type descriptor (TypeInfo) of 'this' V690NCEs object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' V690NCEs object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for V690NCEs

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
		    "HandoverFromUTRANCommand_GSM$R3$LaterNCEs"
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
			    "handoverFromUTRANCommand-GSM-r3-add-ext",
			    0,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "HandoverFromUTRANCommand_GSM$R3$LaterNCEs$V690NCEs"
				)
			    ),
			    "v690NCEs",
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
		"HandoverFromUTRANCommand_GSM$R3"
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
				    "HandoverFromUTRANCommand_GSM_r3_IEs"
				),
				new QName (
				    "PDU-definitions",
				    "HandoverFromUTRANCommand-GSM-r3-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"HandoverFromUTRANCommand_GSM_r3_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"HandoverFromUTRANCommand_GSM_r3_IEs"
				    )
				),
				0
			    )
			),
			"handoverFromUTRANCommand-GSM-r3",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"HandoverFromUTRANCommand_GSM$R3$LaterNCEs"
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
    public static HandoverFromUTRANCommand_GSM createHandoverFromUTRANCommand_GSMWithLater_than_r3(Later_than_r3 later_than_r3)
    {
	HandoverFromUTRANCommand_GSM __object = new HandoverFromUTRANCommand_GSM();

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
	 * @see Choice
	 */
	public static class CriticalExtensions extends Choice {
	    
	    /**
	     * The default constructor.
	     */
	    public CriticalExtensions()
	    {
	    }
	    
	    public static final  int  r6_chosen = 1;
	    public static final  int  criticalExtensions_chosen = 2;
	    
	    // Methods for field "r6"
	    public static CriticalExtensions createCriticalExtensionsWithR6(R6 r6)
	    {
		CriticalExtensions __object = new CriticalExtensions();

		__object.setR6(r6);
		return __object;
	    }
	    
	    public boolean hasR6()
	    {
		return getChosenFlag() == r6_chosen;
	    }
	    
	    public void setR6(R6 r6)
	    {
		setChosenValue(r6);
		setChosenFlag(r6_chosen);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type R6 from ASN1 Module PDU_definitions.
	     * @see Sequence
	     */
	    public static class R6 extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public R6()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public R6(HandoverFromUTRANCommand_GSM_r6_IEs handoverFromUTRANCommand_GSM_r6, 
				BitString handoverFromUTRANCommand_GSM_r6_add_ext, 
				V860NCEs v860NCEs)
		{
		    setHandoverFromUTRANCommand_GSM_r6(handoverFromUTRANCommand_GSM_r6);
		    setHandoverFromUTRANCommand_GSM_r6_add_ext(handoverFromUTRANCommand_GSM_r6_add_ext);
		    setV860NCEs(v860NCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public R6(HandoverFromUTRANCommand_GSM_r6_IEs handoverFromUTRANCommand_GSM_r6)
		{
		    setHandoverFromUTRANCommand_GSM_r6(handoverFromUTRANCommand_GSM_r6);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new HandoverFromUTRANCommand_GSM_r6_IEs();
		    mComponents[1] = new BitString();
		    mComponents[2] = new V860NCEs();
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
			    return new HandoverFromUTRANCommand_GSM_r6_IEs();
			case 1:
			    return new BitString();
			case 2:
			    return new V860NCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "handoverFromUTRANCommand_GSM_r6"
		public HandoverFromUTRANCommand_GSM_r6_IEs getHandoverFromUTRANCommand_GSM_r6()
		{
		    return (HandoverFromUTRANCommand_GSM_r6_IEs)mComponents[0];
		}
		
		public void setHandoverFromUTRANCommand_GSM_r6(HandoverFromUTRANCommand_GSM_r6_IEs handoverFromUTRANCommand_GSM_r6)
		{
		    mComponents[0] = handoverFromUTRANCommand_GSM_r6;
		}
		
		
		// Methods for field "handoverFromUTRANCommand_GSM_r6_add_ext"
		public BitString getHandoverFromUTRANCommand_GSM_r6_add_ext()
		{
		    return (BitString)mComponents[1];
		}
		
		public void setHandoverFromUTRANCommand_GSM_r6_add_ext(BitString handoverFromUTRANCommand_GSM_r6_add_ext)
		{
		    mComponents[1] = handoverFromUTRANCommand_GSM_r6_add_ext;
		}
		
		public boolean hasHandoverFromUTRANCommand_GSM_r6_add_ext()
		{
		    return componentIsPresent(1);
		}
		
		public void deleteHandoverFromUTRANCommand_GSM_r6_add_ext()
		{
		    setComponentAbsent(1);
		}
		
		
		// Methods for field "v860NCEs"
		public V860NCEs getV860NCEs()
		{
		    return (V860NCEs)mComponents[2];
		}
		
		public void setV860NCEs(V860NCEs v860NCEs)
		{
		    mComponents[2] = v860NCEs;
		}
		
		public boolean hasV860NCEs()
		{
		    return componentIsPresent(2);
		}
		
		public void deleteV860NCEs()
		{
		    setComponentAbsent(2);
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
		    public V860NCEs(HandoverFromUTRANCommand_GSM_v860ext_IEs handoverFromUTRANCommand_GSM_v860ext, 
				    NonCriticalExtensions nonCriticalExtensions)
		    {
			setHandoverFromUTRANCommand_GSM_v860ext(handoverFromUTRANCommand_GSM_v860ext);
			setNonCriticalExtensions(nonCriticalExtensions);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public V860NCEs(HandoverFromUTRANCommand_GSM_v860ext_IEs handoverFromUTRANCommand_GSM_v860ext)
		    {
			setHandoverFromUTRANCommand_GSM_v860ext(handoverFromUTRANCommand_GSM_v860ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new HandoverFromUTRANCommand_GSM_v860ext_IEs();
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
				return new HandoverFromUTRANCommand_GSM_v860ext_IEs();
			    case 1:
				return new NonCriticalExtensions();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "handoverFromUTRANCommand_GSM_v860ext"
		    public HandoverFromUTRANCommand_GSM_v860ext_IEs getHandoverFromUTRANCommand_GSM_v860ext()
		    {
			return (HandoverFromUTRANCommand_GSM_v860ext_IEs)mComponents[0];
		    }
		    
		    public void setHandoverFromUTRANCommand_GSM_v860ext(HandoverFromUTRANCommand_GSM_v860ext_IEs handoverFromUTRANCommand_GSM_v860ext)
		    {
			mComponents[0] = handoverFromUTRANCommand_GSM_v860ext;
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
				"HandoverFromUTRANCommand_GSM$Later_than_r3$CriticalExtensions$R6$V860NCEs$NonCriticalExtensions"
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
				(short)0x8002
			    }
			),
			new QName (
			    "rrc.pdu_definitions",
			    "HandoverFromUTRANCommand_GSM$Later_than_r3$CriticalExtensions$R6$V860NCEs"
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
						"HandoverFromUTRANCommand_GSM_v860ext_IEs"
					    ),
					    new QName (
						"PDU-definitions",
						"HandoverFromUTRANCommand-GSM-v860ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.pdu_definitions",
						    "HandoverFromUTRANCommand_GSM_v860ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.pdu_definitions",
						    "HandoverFromUTRANCommand_GSM_v860ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "handoverFromUTRANCommand-GSM-v860ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "HandoverFromUTRANCommand_GSM$Later_than_r3$CriticalExtensions$R6$V860NCEs$NonCriticalExtensions"
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
			    (short)0x8000
			}
		    ),
		    new QName (
			"rrc.pdu_definitions",
			"HandoverFromUTRANCommand_GSM$Later_than_r3$CriticalExtensions$R6"
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
					    "HandoverFromUTRANCommand_GSM_r6_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "HandoverFromUTRANCommand-GSM-r6-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"HandoverFromUTRANCommand_GSM_r6_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"HandoverFromUTRANCommand_GSM_r6_IEs"
					    )
					),
					0
				    )
				),
				"handoverFromUTRANCommand-GSM-r6",
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
				"handoverFromUTRANCommand-GSM-r6-add-ext",
				1,
				3,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"HandoverFromUTRANCommand_GSM$Later_than_r3$CriticalExtensions$R6$V860NCEs"
				    )
				),
				"v860NCEs",
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
		 * Get the type descriptor (TypeInfo) of 'this' R6 object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' R6 object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for R6

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
			"HandoverFromUTRANCommand_GSM$Later_than_r3$CriticalExtensions$CriticalExtensions1"
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
		    case r6_chosen:
			return new R6();
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
		    "HandoverFromUTRANCommand_GSM$Later_than_r3$CriticalExtensions"
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
				    "HandoverFromUTRANCommand_GSM$Later_than_r3$CriticalExtensions$R6"
				)
			    ),
			    "r6",
			    0,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "HandoverFromUTRANCommand_GSM$Later_than_r3$CriticalExtensions$CriticalExtensions1"
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
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"HandoverFromUTRANCommand_GSM$Later_than_r3"
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
				"HandoverFromUTRANCommand_GSM$Later_than_r3$CriticalExtensions"
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
	    "HandoverFromUTRANCommand_GSM"
	),
	new QName (
	    "PDU-definitions",
	    "HandoverFromUTRANCommand-GSM"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "HandoverFromUTRANCommand_GSM$R3"
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
			    "HandoverFromUTRANCommand_GSM$Later_than_r3"
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
     * Get the type descriptor (TypeInfo) of 'this' HandoverFromUTRANCommand_GSM object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HandoverFromUTRANCommand_GSM object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HandoverFromUTRANCommand_GSM
