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
 * Define the ASN1 Type HandoverToUTRANCommand from ASN1 Module PDU_definitions.
 * @see Choice
 */

public class HandoverToUTRANCommand extends Choice {
    
    /**
     * The default constructor.
     */
    public HandoverToUTRANCommand()
    {
    }
    
    public static final  int  r3_chosen = 1;
    public static final  int  criticalExtensions_chosen = 2;
    
    // Methods for field "r3"
    public static HandoverToUTRANCommand createHandoverToUTRANCommandWithR3(R3 r3)
    {
	HandoverToUTRANCommand __object = new HandoverToUTRANCommand();

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
	public R3(HandoverToUTRANCommand_r3_IEs handoverToUTRANCommand_r3, 
			NonCriticalExtensions nonCriticalExtensions)
	{
	    setHandoverToUTRANCommand_r3(handoverToUTRANCommand_r3);
	    setNonCriticalExtensions(nonCriticalExtensions);
	}
	
	/**
	 * Construct with required components.
	 */
	public R3(HandoverToUTRANCommand_r3_IEs handoverToUTRANCommand_r3)
	{
	    setHandoverToUTRANCommand_r3(handoverToUTRANCommand_r3);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new HandoverToUTRANCommand_r3_IEs();
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
		    return new HandoverToUTRANCommand_r3_IEs();
		case 1:
		    return new NonCriticalExtensions();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "handoverToUTRANCommand_r3"
	public HandoverToUTRANCommand_r3_IEs getHandoverToUTRANCommand_r3()
	{
	    return (HandoverToUTRANCommand_r3_IEs)mComponents[0];
	}
	
	public void setHandoverToUTRANCommand_r3(HandoverToUTRANCommand_r3_IEs handoverToUTRANCommand_r3)
	{
	    mComponents[0] = handoverToUTRANCommand_r3;
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
		    "HandoverToUTRANCommand$R3$NonCriticalExtensions"
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
		"HandoverToUTRANCommand$R3"
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
				    "HandoverToUTRANCommand_r3_IEs"
				),
				new QName (
				    "PDU-definitions",
				    "HandoverToUTRANCommand-r3-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"HandoverToUTRANCommand_r3_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"HandoverToUTRANCommand_r3_IEs"
				    )
				),
				0
			    )
			),
			"handoverToUTRANCommand-r3",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"HandoverToUTRANCommand$R3$NonCriticalExtensions"
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

    // Methods for field "criticalExtensions"
    public static HandoverToUTRANCommand createHandoverToUTRANCommandWithCriticalExtensions(CriticalExtensions criticalExtensions)
    {
	HandoverToUTRANCommand __object = new HandoverToUTRANCommand();

	__object.setCriticalExtensions(criticalExtensions);
	return __object;
    }
    
    public boolean hasCriticalExtensions()
    {
	return getChosenFlag() == criticalExtensions_chosen;
    }
    
    public void setCriticalExtensions(CriticalExtensions criticalExtensions)
    {
	setChosenValue(criticalExtensions);
	setChosenFlag(criticalExtensions_chosen);
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
	
	public static final  int  r4_chosen = 1;
	public static final  int  criticalExtensions_chosen = 2;
	
	// Methods for field "r4"
	public static CriticalExtensions createCriticalExtensionsWithR4(R4 r4)
	{
	    CriticalExtensions __object = new CriticalExtensions();

	    __object.setR4(r4);
	    return __object;
	}
	
	public boolean hasR4()
	{
	    return getChosenFlag() == r4_chosen;
	}
	
	public void setR4(R4 r4)
	{
	    setChosenValue(r4);
	    setChosenFlag(r4_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type R4 from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class R4 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public R4()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public R4(HandoverToUTRANCommand_r4_IEs handoverToUTRANCommand_r4, 
			    NonCriticalExtensions nonCriticalExtensions)
	    {
		setHandoverToUTRANCommand_r4(handoverToUTRANCommand_r4);
		setNonCriticalExtensions(nonCriticalExtensions);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public R4(HandoverToUTRANCommand_r4_IEs handoverToUTRANCommand_r4)
	    {
		setHandoverToUTRANCommand_r4(handoverToUTRANCommand_r4);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new HandoverToUTRANCommand_r4_IEs();
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
			return new HandoverToUTRANCommand_r4_IEs();
		    case 1:
			return new NonCriticalExtensions();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "handoverToUTRANCommand_r4"
	    public HandoverToUTRANCommand_r4_IEs getHandoverToUTRANCommand_r4()
	    {
		return (HandoverToUTRANCommand_r4_IEs)mComponents[0];
	    }
	    
	    public void setHandoverToUTRANCommand_r4(HandoverToUTRANCommand_r4_IEs handoverToUTRANCommand_r4)
	    {
		mComponents[0] = handoverToUTRANCommand_r4;
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
			"HandoverToUTRANCommand$CriticalExtensions$R4$NonCriticalExtensions"
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
		    "HandoverToUTRANCommand$CriticalExtensions$R4"
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
					"HandoverToUTRANCommand_r4_IEs"
				    ),
				    new QName (
					"PDU-definitions",
					"HandoverToUTRANCommand-r4-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "HandoverToUTRANCommand_r4_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "HandoverToUTRANCommand_r4_IEs"
					)
				    ),
				    0
				)
			    ),
			    "handoverToUTRANCommand-r4",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "HandoverToUTRANCommand$CriticalExtensions$R4$NonCriticalExtensions"
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
	     * Get the type descriptor (TypeInfo) of 'this' R4 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' R4 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for R4

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
	 * @see Choice
	 */
	public static class CriticalExtensions1 extends Choice {
	    
	    /**
	     * The default constructor.
	     */
	    public CriticalExtensions1()
	    {
	    }
	    
	    public static final  int  r5_chosen = 1;
	    public static final  int  criticalExtensions_chosen = 2;
	    
	    // Methods for field "r5"
	    public static CriticalExtensions1 createCriticalExtensions1WithR5(R5 r5)
	    {
		CriticalExtensions1 __object = new CriticalExtensions1();

		__object.setR5(r5);
		return __object;
	    }
	    
	    public boolean hasR5()
	    {
		return getChosenFlag() == r5_chosen;
	    }
	    
	    public void setR5(R5 r5)
	    {
		setChosenValue(r5);
		setChosenFlag(r5_chosen);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type R5 from ASN1 Module PDU_definitions.
	     * @see Sequence
	     */
	    public static class R5 extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public R5()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public R5(HandoverToUTRANCommand_r5_IEs handoverToUTRANCommand_r5, 
				NonCriticalExtensions nonCriticalExtensions)
		{
		    setHandoverToUTRANCommand_r5(handoverToUTRANCommand_r5);
		    setNonCriticalExtensions(nonCriticalExtensions);
		}
		
		/**
		 * Construct with required components.
		 */
		public R5(HandoverToUTRANCommand_r5_IEs handoverToUTRANCommand_r5)
		{
		    setHandoverToUTRANCommand_r5(handoverToUTRANCommand_r5);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new HandoverToUTRANCommand_r5_IEs();
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
			    return new HandoverToUTRANCommand_r5_IEs();
			case 1:
			    return new NonCriticalExtensions();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "handoverToUTRANCommand_r5"
		public HandoverToUTRANCommand_r5_IEs getHandoverToUTRANCommand_r5()
		{
		    return (HandoverToUTRANCommand_r5_IEs)mComponents[0];
		}
		
		public void setHandoverToUTRANCommand_r5(HandoverToUTRANCommand_r5_IEs handoverToUTRANCommand_r5)
		{
		    mComponents[0] = handoverToUTRANCommand_r5;
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
			    "HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$R5$NonCriticalExtensions"
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
			"HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$R5"
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
					    "HandoverToUTRANCommand_r5_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "HandoverToUTRANCommand-r5-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"HandoverToUTRANCommand_r5_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"HandoverToUTRANCommand_r5_IEs"
					    )
					),
					0
				    )
				),
				"handoverToUTRANCommand-r5",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$R5$NonCriticalExtensions"
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
		 * Get the type descriptor (TypeInfo) of 'this' R5 object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' R5 object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for R5

	    // Methods for field "criticalExtensions"
	    public static CriticalExtensions1 createCriticalExtensions1WithCriticalExtensions(CriticalExtensions2 criticalExtensions)
	    {
		CriticalExtensions1 __object = new CriticalExtensions1();

		__object.setCriticalExtensions(criticalExtensions);
		return __object;
	    }
	    
	    public boolean hasCriticalExtensions()
	    {
		return getChosenFlag() == criticalExtensions_chosen;
	    }
	    
	    public void setCriticalExtensions(CriticalExtensions2 criticalExtensions)
	    {
		setChosenValue(criticalExtensions);
		setChosenFlag(criticalExtensions_chosen);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type CriticalExtensions2 from ASN1 Module PDU_definitions.
	     * @see Choice
	     */
	    public static class CriticalExtensions2 extends Choice {
		
		/**
		 * The default constructor.
		 */
		public CriticalExtensions2()
		{
		}
		
		public static final  int  r6_chosen = 1;
		public static final  int  criticalExtensions_chosen = 2;
		
		// Methods for field "r6"
		public static CriticalExtensions2 createCriticalExtensions2WithR6(R6 r6)
		{
		    CriticalExtensions2 __object = new CriticalExtensions2();

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
		    public R6(HandoverToUTRANCommand_r6_IEs handoverToUTRANCommand_r6, 
				    V6b0NCEs v6b0NCEs)
		    {
			setHandoverToUTRANCommand_r6(handoverToUTRANCommand_r6);
			setV6b0NCEs(v6b0NCEs);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public R6(HandoverToUTRANCommand_r6_IEs handoverToUTRANCommand_r6)
		    {
			setHandoverToUTRANCommand_r6(handoverToUTRANCommand_r6);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new HandoverToUTRANCommand_r6_IEs();
			mComponents[1] = new V6b0NCEs();
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
				return new HandoverToUTRANCommand_r6_IEs();
			    case 1:
				return new V6b0NCEs();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "handoverToUTRANCommand_r6"
		    public HandoverToUTRANCommand_r6_IEs getHandoverToUTRANCommand_r6()
		    {
			return (HandoverToUTRANCommand_r6_IEs)mComponents[0];
		    }
		    
		    public void setHandoverToUTRANCommand_r6(HandoverToUTRANCommand_r6_IEs handoverToUTRANCommand_r6)
		    {
			mComponents[0] = handoverToUTRANCommand_r6;
		    }
		    
		    
		    // Methods for field "v6b0NCEs"
		    public V6b0NCEs getV6b0NCEs()
		    {
			return (V6b0NCEs)mComponents[1];
		    }
		    
		    public void setV6b0NCEs(V6b0NCEs v6b0NCEs)
		    {
			mComponents[1] = v6b0NCEs;
		    }
		    
		    public boolean hasV6b0NCEs()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteV6b0NCEs()
		    {
			setComponentAbsent(1);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type V6b0NCEs from ASN1 Module PDU_definitions.
		     * @see Sequence
		     */
		    public static class V6b0NCEs extends Sequence {
			
			/**
			 * The default constructor.
			 */
			public V6b0NCEs()
			{
			}
			
			/**
			 * Construct with AbstractData components.
			 */
			public V6b0NCEs(HandoverToUTRANCommand_v6b0ext_IEs handoverToUTRANCommand_v6b0ext, 
					NonCriticalExtensions nonCriticalExtensions)
			{
			    setHandoverToUTRANCommand_v6b0ext(handoverToUTRANCommand_v6b0ext);
			    setNonCriticalExtensions(nonCriticalExtensions);
			}
			
			/**
			 * Construct with required components.
			 */
			public V6b0NCEs(HandoverToUTRANCommand_v6b0ext_IEs handoverToUTRANCommand_v6b0ext)
			{
			    setHandoverToUTRANCommand_v6b0ext(handoverToUTRANCommand_v6b0ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new HandoverToUTRANCommand_v6b0ext_IEs();
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
				    return new HandoverToUTRANCommand_v6b0ext_IEs();
				case 1:
				    return new NonCriticalExtensions();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "handoverToUTRANCommand_v6b0ext"
			public HandoverToUTRANCommand_v6b0ext_IEs getHandoverToUTRANCommand_v6b0ext()
			{
			    return (HandoverToUTRANCommand_v6b0ext_IEs)mComponents[0];
			}
			
			public void setHandoverToUTRANCommand_v6b0ext(HandoverToUTRANCommand_v6b0ext_IEs handoverToUTRANCommand_v6b0ext)
			{
			    mComponents[0] = handoverToUTRANCommand_v6b0ext;
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
				    "HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R6$V6b0NCEs$NonCriticalExtensions"
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
				"HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R6$V6b0NCEs"
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
						    "HandoverToUTRANCommand_v6b0ext_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "HandoverToUTRANCommand-v6b0ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"HandoverToUTRANCommand_v6b0ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"HandoverToUTRANCommand_v6b0ext_IEs"
						    )
						),
						0
					    )
					),
					"handoverToUTRANCommand-v6b0ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R6$V6b0NCEs$NonCriticalExtensions"
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
			 * Get the type descriptor (TypeInfo) of 'this' V6b0NCEs object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' V6b0NCEs object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for V6b0NCEs

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
			    "HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R6"
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
						"HandoverToUTRANCommand_r6_IEs"
					    ),
					    new QName (
						"PDU-definitions",
						"HandoverToUTRANCommand-r6-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.pdu_definitions",
						    "HandoverToUTRANCommand_r6_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.pdu_definitions",
						    "HandoverToUTRANCommand_r6_IEs"
						)
					    ),
					    0
					)
				    ),
				    "handoverToUTRANCommand-r6",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R6$V6b0NCEs"
					)
				    ),
				    "v6b0NCEs",
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
		public static CriticalExtensions2 createCriticalExtensions2WithCriticalExtensions(CriticalExtensions3 criticalExtensions)
		{
		    CriticalExtensions2 __object = new CriticalExtensions2();

		    __object.setCriticalExtensions(criticalExtensions);
		    return __object;
		}
		
		public boolean hasCriticalExtensions()
		{
		    return getChosenFlag() == criticalExtensions_chosen;
		}
		
		public void setCriticalExtensions(CriticalExtensions3 criticalExtensions)
		{
		    setChosenValue(criticalExtensions);
		    setChosenFlag(criticalExtensions_chosen);
		}
		
		
		
		/**
		 * Define the ASN1 Type CriticalExtensions3 from ASN1 Module PDU_definitions.
		 * @see Choice
		 */
		public static class CriticalExtensions3 extends Choice {
		    
		    /**
		     * The default constructor.
		     */
		    public CriticalExtensions3()
		    {
		    }
		    
		    public static final  int  r7_chosen = 1;
		    public static final  int  criticalExtensions_chosen = 2;
		    
		    // Methods for field "r7"
		    public static CriticalExtensions3 createCriticalExtensions3WithR7(R7 r7)
		    {
			CriticalExtensions3 __object = new CriticalExtensions3();

			__object.setR7(r7);
			return __object;
		    }
		    
		    public boolean hasR7()
		    {
			return getChosenFlag() == r7_chosen;
		    }
		    
		    public void setR7(R7 r7)
		    {
			setChosenValue(r7);
			setChosenFlag(r7_chosen);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type R7 from ASN1 Module PDU_definitions.
		     * @see Sequence
		     */
		    public static class R7 extends Sequence {
			
			/**
			 * The default constructor.
			 */
			public R7()
			{
			}
			
			/**
			 * Construct with AbstractData components.
			 */
			public R7(HandoverToUTRANCommand_r7_IEs handoverToUTRANCommand_r7, 
					V780NCEs v780NCEs)
			{
			    setHandoverToUTRANCommand_r7(handoverToUTRANCommand_r7);
			    setV780NCEs(v780NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public R7(HandoverToUTRANCommand_r7_IEs handoverToUTRANCommand_r7)
			{
			    setHandoverToUTRANCommand_r7(handoverToUTRANCommand_r7);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new HandoverToUTRANCommand_r7_IEs();
			    mComponents[1] = new V780NCEs();
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
				    return new HandoverToUTRANCommand_r7_IEs();
				case 1:
				    return new V780NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "handoverToUTRANCommand_r7"
			public HandoverToUTRANCommand_r7_IEs getHandoverToUTRANCommand_r7()
			{
			    return (HandoverToUTRANCommand_r7_IEs)mComponents[0];
			}
			
			public void setHandoverToUTRANCommand_r7(HandoverToUTRANCommand_r7_IEs handoverToUTRANCommand_r7)
			{
			    mComponents[0] = handoverToUTRANCommand_r7;
			}
			
			
			// Methods for field "v780NCEs"
			public V780NCEs getV780NCEs()
			{
			    return (V780NCEs)mComponents[1];
			}
			
			public void setV780NCEs(V780NCEs v780NCEs)
			{
			    mComponents[1] = v780NCEs;
			}
			
			public boolean hasV780NCEs()
			{
			    return componentIsPresent(1);
			}
			
			public void deleteV780NCEs()
			{
			    setComponentAbsent(1);
			}
			
			
			
			/**
			 * Define the ASN1 Type V780NCEs from ASN1 Module PDU_definitions.
			 * @see Sequence
			 */
			public static class V780NCEs extends Sequence {
			    
			    /**
			     * The default constructor.
			     */
			    public V780NCEs()
			    {
			    }
			    
			    /**
			     * Construct with AbstractData components.
			     */
			    public V780NCEs(HandoverToUTRANCommand_v780ext_IEs handoverToUTRANCommand_v780ext, 
					    V820NCEs v820NCEs)
			    {
				setHandoverToUTRANCommand_v780ext(handoverToUTRANCommand_v780ext);
				setV820NCEs(v820NCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V780NCEs(HandoverToUTRANCommand_v780ext_IEs handoverToUTRANCommand_v780ext)
			    {
				setHandoverToUTRANCommand_v780ext(handoverToUTRANCommand_v780ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new HandoverToUTRANCommand_v780ext_IEs();
				mComponents[1] = new V820NCEs();
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
					return new HandoverToUTRANCommand_v780ext_IEs();
				    case 1:
					return new V820NCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "handoverToUTRANCommand_v780ext"
			    public HandoverToUTRANCommand_v780ext_IEs getHandoverToUTRANCommand_v780ext()
			    {
				return (HandoverToUTRANCommand_v780ext_IEs)mComponents[0];
			    }
			    
			    public void setHandoverToUTRANCommand_v780ext(HandoverToUTRANCommand_v780ext_IEs handoverToUTRANCommand_v780ext)
			    {
				mComponents[0] = handoverToUTRANCommand_v780ext;
			    }
			    
			    
			    // Methods for field "v820NCEs"
			    public V820NCEs getV820NCEs()
			    {
				return (V820NCEs)mComponents[1];
			    }
			    
			    public void setV820NCEs(V820NCEs v820NCEs)
			    {
				mComponents[1] = v820NCEs;
			    }
			    
			    public boolean hasV820NCEs()
			    {
				return componentIsPresent(1);
			    }
			    
			    public void deleteV820NCEs()
			    {
				setComponentAbsent(1);
			    }
			    
			    
			    
			    /**
			     * Define the ASN1 Type V820NCEs from ASN1 Module PDU_definitions.
			     * @see Sequence
			     */
			    public static class V820NCEs extends Sequence {
				
				/**
				 * The default constructor.
				 */
				public V820NCEs()
				{
				}
				
				/**
				 * Construct with AbstractData components.
				 */
				public V820NCEs(HandoverToUTRANCommand_v820ext_IEs handoverToUTRANCommand_v820ext, 
						V7d0NCEs v7d0NCEs)
				{
				    setHandoverToUTRANCommand_v820ext(handoverToUTRANCommand_v820ext);
				    setV7d0NCEs(v7d0NCEs);
				}
				
				/**
				 * Construct with required components.
				 */
				public V820NCEs(HandoverToUTRANCommand_v820ext_IEs handoverToUTRANCommand_v820ext)
				{
				    setHandoverToUTRANCommand_v820ext(handoverToUTRANCommand_v820ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new HandoverToUTRANCommand_v820ext_IEs();
				    mComponents[1] = new V7d0NCEs();
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
					    return new HandoverToUTRANCommand_v820ext_IEs();
					case 1:
					    return new V7d0NCEs();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "handoverToUTRANCommand_v820ext"
				public HandoverToUTRANCommand_v820ext_IEs getHandoverToUTRANCommand_v820ext()
				{
				    return (HandoverToUTRANCommand_v820ext_IEs)mComponents[0];
				}
				
				public void setHandoverToUTRANCommand_v820ext(HandoverToUTRANCommand_v820ext_IEs handoverToUTRANCommand_v820ext)
				{
				    mComponents[0] = handoverToUTRANCommand_v820ext;
				}
				
				
				// Methods for field "v7d0NCEs"
				public V7d0NCEs getV7d0NCEs()
				{
				    return (V7d0NCEs)mComponents[1];
				}
				
				public void setV7d0NCEs(V7d0NCEs v7d0NCEs)
				{
				    mComponents[1] = v7d0NCEs;
				}
				
				public boolean hasV7d0NCEs()
				{
				    return componentIsPresent(1);
				}
				
				public void deleteV7d0NCEs()
				{
				    setComponentAbsent(1);
				}
				
				
				
				/**
				 * Define the ASN1 Type V7d0NCEs from ASN1 Module PDU_definitions.
				 * @see Sequence
				 */
				public static class V7d0NCEs extends Sequence {
				    
				    /**
				     * The default constructor.
				     */
				    public V7d0NCEs()
				    {
				    }
				    
				    /**
				     * Construct with AbstractData components.
				     */
				    public V7d0NCEs(HandoverToUTRANCommand_v7d0ext_IEs handoverToUTRANCommand_v7d0ext, 
						    NonCriticalExtensions nonCriticalExtensions)
				    {
					setHandoverToUTRANCommand_v7d0ext(handoverToUTRANCommand_v7d0ext);
					setNonCriticalExtensions(nonCriticalExtensions);
				    }
				    
				    /**
				     * Construct with required components.
				     */
				    public V7d0NCEs(HandoverToUTRANCommand_v7d0ext_IEs handoverToUTRANCommand_v7d0ext)
				    {
					setHandoverToUTRANCommand_v7d0ext(handoverToUTRANCommand_v7d0ext);
				    }
				    
				    public void initComponents()
				    {
					mComponents[0] = new HandoverToUTRANCommand_v7d0ext_IEs();
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
						return new HandoverToUTRANCommand_v7d0ext_IEs();
					    case 1:
						return new NonCriticalExtensions();
					    default:
						throw new InternalError("AbstractCollection.createInstance()");
					}
					
				    }
				    
				    
				    // Methods for field "handoverToUTRANCommand_v7d0ext"
				    public HandoverToUTRANCommand_v7d0ext_IEs getHandoverToUTRANCommand_v7d0ext()
				    {
					return (HandoverToUTRANCommand_v7d0ext_IEs)mComponents[0];
				    }
				    
				    public void setHandoverToUTRANCommand_v7d0ext(HandoverToUTRANCommand_v7d0ext_IEs handoverToUTRANCommand_v7d0ext)
				    {
					mComponents[0] = handoverToUTRANCommand_v7d0ext;
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
						"HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7$V780NCEs$V820NCEs$V7d0NCEs$NonCriticalExtensions"
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
					    "HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7$V780NCEs$V820NCEs$V7d0NCEs"
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
								"HandoverToUTRANCommand_v7d0ext_IEs"
							    ),
							    new QName (
								"PDU-definitions",
								"HandoverToUTRANCommand-v7d0ext-IEs"
							    ),
							    12314,
							    null,
							    new FieldsRef (
								new QName (
								    "rrc.pdu_definitions",
								    "HandoverToUTRANCommand_v7d0ext_IEs"
								)
							    ),
							    0,
							    new TagDecodersRef (
								new QName (
								    "rrc.pdu_definitions",
								    "HandoverToUTRANCommand_v7d0ext_IEs"
								)
							    ),
							    0
							)
						    ),
						    "handoverToUTRANCommand-v7d0ext",
						    0,
						    2,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.pdu_definitions",
							    "HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7$V780NCEs$V820NCEs$V7d0NCEs$NonCriticalExtensions"
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
				     * Get the type descriptor (TypeInfo) of 'this' V7d0NCEs object.
				     */
				    public TypeInfo getTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				    /**
				     * Get the static type descriptor (TypeInfo) of 'this' V7d0NCEs object.
				     */
				    public static TypeInfo getStaticTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				} // End class definition for V7d0NCEs

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
					"HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7$V780NCEs$V820NCEs"
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
							    "HandoverToUTRANCommand_v820ext_IEs"
							),
							new QName (
							    "PDU-definitions",
							    "HandoverToUTRANCommand-v820ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.pdu_definitions",
								"HandoverToUTRANCommand_v820ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.pdu_definitions",
								"HandoverToUTRANCommand_v820ext_IEs"
							    )
							),
							0
						    )
						),
						"handoverToUTRANCommand-v820ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.pdu_definitions",
							"HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7$V780NCEs$V820NCEs$V7d0NCEs"
						    )
						),
						"v7d0NCEs",
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
				 * Get the type descriptor (TypeInfo) of 'this' V820NCEs object.
				 */
				public TypeInfo getTypeInfo()
				{
				    return c_typeinfo;
				}
				
				/**
				 * Get the static type descriptor (TypeInfo) of 'this' V820NCEs object.
				 */
				public static TypeInfo getStaticTypeInfo()
				{
				    return c_typeinfo;
				}
				
			    } // End class definition for V820NCEs

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
				    "HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7$V780NCEs"
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
							"HandoverToUTRANCommand_v780ext_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"HandoverToUTRANCommand-v780ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "HandoverToUTRANCommand_v780ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "HandoverToUTRANCommand_v780ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "handoverToUTRANCommand-v780ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7$V780NCEs$V820NCEs"
						)
					    ),
					    "v820NCEs",
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
			     * Get the type descriptor (TypeInfo) of 'this' V780NCEs object.
			     */
			    public TypeInfo getTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			    /**
			     * Get the static type descriptor (TypeInfo) of 'this' V780NCEs object.
			     */
			    public static TypeInfo getStaticTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			} // End class definition for V780NCEs

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
				"HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7"
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
						    "HandoverToUTRANCommand_r7_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "HandoverToUTRANCommand-r7-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"HandoverToUTRANCommand_r7_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"HandoverToUTRANCommand_r7_IEs"
						    )
						),
						0
					    )
					),
					"handoverToUTRANCommand-r7",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7$V780NCEs"
					    )
					),
					"v780NCEs",
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
			 * Get the type descriptor (TypeInfo) of 'this' R7 object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' R7 object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for R7

		    // Methods for field "criticalExtensions"
		    public static CriticalExtensions3 createCriticalExtensions3WithCriticalExtensions(CriticalExtensions4 criticalExtensions)
		    {
			CriticalExtensions3 __object = new CriticalExtensions3();

			__object.setCriticalExtensions(criticalExtensions);
			return __object;
		    }
		    
		    public boolean hasCriticalExtensions()
		    {
			return getChosenFlag() == criticalExtensions_chosen;
		    }
		    
		    public void setCriticalExtensions(CriticalExtensions4 criticalExtensions)
		    {
			setChosenValue(criticalExtensions);
			setChosenFlag(criticalExtensions_chosen);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type CriticalExtensions4 from ASN1 Module PDU_definitions.
		     * @see Choice
		     */
		    public static class CriticalExtensions4 extends Choice {
			
			/**
			 * The default constructor.
			 */
			public CriticalExtensions4()
			{
			}
			
			public static final  int  r8_chosen = 1;
			public static final  int  criticalExtensions_chosen = 2;
			
			// Methods for field "r8"
			public static CriticalExtensions4 createCriticalExtensions4WithR8(R8 r8)
			{
			    CriticalExtensions4 __object = new CriticalExtensions4();

			    __object.setR8(r8);
			    return __object;
			}
			
			public boolean hasR8()
			{
			    return getChosenFlag() == r8_chosen;
			}
			
			public void setR8(R8 r8)
			{
			    setChosenValue(r8);
			    setChosenFlag(r8_chosen);
			}
			
			
			
			/**
			 * Define the ASN1 Type R8 from ASN1 Module PDU_definitions.
			 * @see Sequence
			 */
			public static class R8 extends Sequence {
			    
			    /**
			     * The default constructor.
			     */
			    public R8()
			    {
			    }
			    
			    /**
			     * Construct with AbstractData components.
			     */
			    public R8(HandoverToUTRANCommand_r8_IEs handoverToUTRANCommand_r8, 
					    V7d0NCEs v7d0NCEs)
			    {
				setHandoverToUTRANCommand_r8(handoverToUTRANCommand_r8);
				setV7d0NCEs(v7d0NCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public R8(HandoverToUTRANCommand_r8_IEs handoverToUTRANCommand_r8)
			    {
				setHandoverToUTRANCommand_r8(handoverToUTRANCommand_r8);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new HandoverToUTRANCommand_r8_IEs();
				mComponents[1] = new V7d0NCEs();
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
					return new HandoverToUTRANCommand_r8_IEs();
				    case 1:
					return new V7d0NCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "handoverToUTRANCommand_r8"
			    public HandoverToUTRANCommand_r8_IEs getHandoverToUTRANCommand_r8()
			    {
				return (HandoverToUTRANCommand_r8_IEs)mComponents[0];
			    }
			    
			    public void setHandoverToUTRANCommand_r8(HandoverToUTRANCommand_r8_IEs handoverToUTRANCommand_r8)
			    {
				mComponents[0] = handoverToUTRANCommand_r8;
			    }
			    
			    
			    // Methods for field "v7d0NCEs"
			    public V7d0NCEs getV7d0NCEs()
			    {
				return (V7d0NCEs)mComponents[1];
			    }
			    
			    public void setV7d0NCEs(V7d0NCEs v7d0NCEs)
			    {
				mComponents[1] = v7d0NCEs;
			    }
			    
			    public boolean hasV7d0NCEs()
			    {
				return componentIsPresent(1);
			    }
			    
			    public void deleteV7d0NCEs()
			    {
				setComponentAbsent(1);
			    }
			    
			    
			    
			    /**
			     * Define the ASN1 Type V7d0NCEs from ASN1 Module PDU_definitions.
			     * @see Sequence
			     */
			    public static class V7d0NCEs extends Sequence {
				
				/**
				 * The default constructor.
				 */
				public V7d0NCEs()
				{
				}
				
				/**
				 * Construct with AbstractData components.
				 */
				public V7d0NCEs(HandoverToUTRANCommand_v7d0ext_IEs handoverToUTRANCommand_v7d0ext, 
						V890NCEs v890NCEs)
				{
				    setHandoverToUTRANCommand_v7d0ext(handoverToUTRANCommand_v7d0ext);
				    setV890NCEs(v890NCEs);
				}
				
				/**
				 * Construct with required components.
				 */
				public V7d0NCEs(HandoverToUTRANCommand_v7d0ext_IEs handoverToUTRANCommand_v7d0ext)
				{
				    setHandoverToUTRANCommand_v7d0ext(handoverToUTRANCommand_v7d0ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new HandoverToUTRANCommand_v7d0ext_IEs();
				    mComponents[1] = new V890NCEs();
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
					    return new HandoverToUTRANCommand_v7d0ext_IEs();
					case 1:
					    return new V890NCEs();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "handoverToUTRANCommand_v7d0ext"
				public HandoverToUTRANCommand_v7d0ext_IEs getHandoverToUTRANCommand_v7d0ext()
				{
				    return (HandoverToUTRANCommand_v7d0ext_IEs)mComponents[0];
				}
				
				public void setHandoverToUTRANCommand_v7d0ext(HandoverToUTRANCommand_v7d0ext_IEs handoverToUTRANCommand_v7d0ext)
				{
				    mComponents[0] = handoverToUTRANCommand_v7d0ext;
				}
				
				
				// Methods for field "v890NCEs"
				public V890NCEs getV890NCEs()
				{
				    return (V890NCEs)mComponents[1];
				}
				
				public void setV890NCEs(V890NCEs v890NCEs)
				{
				    mComponents[1] = v890NCEs;
				}
				
				public boolean hasV890NCEs()
				{
				    return componentIsPresent(1);
				}
				
				public void deleteV890NCEs()
				{
				    setComponentAbsent(1);
				}
				
				
				
				/**
				 * Define the ASN1 Type V890NCEs from ASN1 Module PDU_definitions.
				 * @see Sequence
				 */
				public static class V890NCEs extends Sequence {
				    
				    /**
				     * The default constructor.
				     */
				    public V890NCEs()
				    {
				    }
				    
				    /**
				     * Construct with AbstractData components.
				     */
				    public V890NCEs(HandoverToUTRANCommand_v890ext_IEs handoverToUTRANCommand_v890ext, 
						    V8a0NCEs v8a0NCEs)
				    {
					setHandoverToUTRANCommand_v890ext(handoverToUTRANCommand_v890ext);
					setV8a0NCEs(v8a0NCEs);
				    }
				    
				    /**
				     * Construct with required components.
				     */
				    public V890NCEs(HandoverToUTRANCommand_v890ext_IEs handoverToUTRANCommand_v890ext)
				    {
					setHandoverToUTRANCommand_v890ext(handoverToUTRANCommand_v890ext);
				    }
				    
				    public void initComponents()
				    {
					mComponents[0] = new HandoverToUTRANCommand_v890ext_IEs();
					mComponents[1] = new V8a0NCEs();
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
						return new HandoverToUTRANCommand_v890ext_IEs();
					    case 1:
						return new V8a0NCEs();
					    default:
						throw new InternalError("AbstractCollection.createInstance()");
					}
					
				    }
				    
				    
				    // Methods for field "handoverToUTRANCommand_v890ext"
				    public HandoverToUTRANCommand_v890ext_IEs getHandoverToUTRANCommand_v890ext()
				    {
					return (HandoverToUTRANCommand_v890ext_IEs)mComponents[0];
				    }
				    
				    public void setHandoverToUTRANCommand_v890ext(HandoverToUTRANCommand_v890ext_IEs handoverToUTRANCommand_v890ext)
				    {
					mComponents[0] = handoverToUTRANCommand_v890ext;
				    }
				    
				    
				    // Methods for field "v8a0NCEs"
				    public V8a0NCEs getV8a0NCEs()
				    {
					return (V8a0NCEs)mComponents[1];
				    }
				    
				    public void setV8a0NCEs(V8a0NCEs v8a0NCEs)
				    {
					mComponents[1] = v8a0NCEs;
				    }
				    
				    public boolean hasV8a0NCEs()
				    {
					return componentIsPresent(1);
				    }
				    
				    public void deleteV8a0NCEs()
				    {
					setComponentAbsent(1);
				    }
				    
				    
				    
				    /**
				     * Define the ASN1 Type V8a0NCEs from ASN1 Module PDU_definitions.
				     * @see Sequence
				     */
				    public static class V8a0NCEs extends Sequence {
					
					/**
					 * The default constructor.
					 */
					public V8a0NCEs()
					{
					}
					
					/**
					 * Construct with AbstractData components.
					 */
					public V8a0NCEs(HandoverToUTRANCommand_v8a0ext_IEs handoverToUTRANCommand_v8a0ext, 
							NonCriticalExtensions nonCriticalExtensions)
					{
					    setHandoverToUTRANCommand_v8a0ext(handoverToUTRANCommand_v8a0ext);
					    setNonCriticalExtensions(nonCriticalExtensions);
					}
					
					/**
					 * Construct with required components.
					 */
					public V8a0NCEs(HandoverToUTRANCommand_v8a0ext_IEs handoverToUTRANCommand_v8a0ext)
					{
					    setHandoverToUTRANCommand_v8a0ext(handoverToUTRANCommand_v8a0ext);
					}
					
					public void initComponents()
					{
					    mComponents[0] = new HandoverToUTRANCommand_v8a0ext_IEs();
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
						    return new HandoverToUTRANCommand_v8a0ext_IEs();
						case 1:
						    return new NonCriticalExtensions();
						default:
						    throw new InternalError("AbstractCollection.createInstance()");
					    }
					    
					}
					
					
					// Methods for field "handoverToUTRANCommand_v8a0ext"
					public HandoverToUTRANCommand_v8a0ext_IEs getHandoverToUTRANCommand_v8a0ext()
					{
					    return (HandoverToUTRANCommand_v8a0ext_IEs)mComponents[0];
					}
					
					public void setHandoverToUTRANCommand_v8a0ext(HandoverToUTRANCommand_v8a0ext_IEs handoverToUTRANCommand_v8a0ext)
					{
					    mComponents[0] = handoverToUTRANCommand_v8a0ext;
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
						    "HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs$V890NCEs$V8a0NCEs$NonCriticalExtensions"
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
						"HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs$V890NCEs$V8a0NCEs"
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
								    "HandoverToUTRANCommand_v8a0ext_IEs"
								),
								new QName (
								    "PDU-definitions",
								    "HandoverToUTRANCommand-v8a0ext-IEs"
								),
								12314,
								null,
								new FieldsRef (
								    new QName (
									"rrc.pdu_definitions",
									"HandoverToUTRANCommand_v8a0ext_IEs"
								    )
								),
								0,
								new TagDecodersRef (
								    new QName (
									"rrc.pdu_definitions",
									"HandoverToUTRANCommand_v8a0ext_IEs"
								    )
								),
								0
							    )
							),
							"handoverToUTRANCommand-v8a0ext",
							0,
							2,
							null
						    ),
						    new SequenceFieldInfo (
							new TypeInfoRef (
							    new QName (
								"rrc.pdu_definitions",
								"HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs$V890NCEs$V8a0NCEs$NonCriticalExtensions"
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
					 * Get the type descriptor (TypeInfo) of 'this' V8a0NCEs object.
					 */
					public TypeInfo getTypeInfo()
					{
					    return c_typeinfo;
					}
					
					/**
					 * Get the static type descriptor (TypeInfo) of 'this' V8a0NCEs object.
					 */
					public static TypeInfo getStaticTypeInfo()
					{
					    return c_typeinfo;
					}
					
				    } // End class definition for V8a0NCEs

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
					    "HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs$V890NCEs"
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
								"HandoverToUTRANCommand_v890ext_IEs"
							    ),
							    new QName (
								"PDU-definitions",
								"HandoverToUTRANCommand-v890ext-IEs"
							    ),
							    12314,
							    null,
							    new FieldsRef (
								new QName (
								    "rrc.pdu_definitions",
								    "HandoverToUTRANCommand_v890ext_IEs"
								)
							    ),
							    0,
							    new TagDecodersRef (
								new QName (
								    "rrc.pdu_definitions",
								    "HandoverToUTRANCommand_v890ext_IEs"
								)
							    ),
							    0
							)
						    ),
						    "handoverToUTRANCommand-v890ext",
						    0,
						    2,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.pdu_definitions",
							    "HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs$V890NCEs$V8a0NCEs"
							)
						    ),
						    "v8a0NCEs",
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
				     * Get the type descriptor (TypeInfo) of 'this' V890NCEs object.
				     */
				    public TypeInfo getTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				    /**
				     * Get the static type descriptor (TypeInfo) of 'this' V890NCEs object.
				     */
				    public static TypeInfo getStaticTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				} // End class definition for V890NCEs

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
					"HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs"
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
							    "HandoverToUTRANCommand_v7d0ext_IEs"
							),
							new QName (
							    "PDU-definitions",
							    "HandoverToUTRANCommand-v7d0ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.pdu_definitions",
								"HandoverToUTRANCommand_v7d0ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.pdu_definitions",
								"HandoverToUTRANCommand_v7d0ext_IEs"
							    )
							),
							0
						    )
						),
						"handoverToUTRANCommand-v7d0ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.pdu_definitions",
							"HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs$V890NCEs"
						    )
						),
						"v890NCEs",
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
				 * Get the type descriptor (TypeInfo) of 'this' V7d0NCEs object.
				 */
				public TypeInfo getTypeInfo()
				{
				    return c_typeinfo;
				}
				
				/**
				 * Get the static type descriptor (TypeInfo) of 'this' V7d0NCEs object.
				 */
				public static TypeInfo getStaticTypeInfo()
				{
				    return c_typeinfo;
				}
				
			    } // End class definition for V7d0NCEs

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
				    "HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8"
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
							"HandoverToUTRANCommand_r8_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"HandoverToUTRANCommand-r8-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "HandoverToUTRANCommand_r8_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "HandoverToUTRANCommand_r8_IEs"
							)
						    ),
						    0
						)
					    ),
					    "handoverToUTRANCommand-r8",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs"
						)
					    ),
					    "v7d0NCEs",
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
			     * Get the type descriptor (TypeInfo) of 'this' R8 object.
			     */
			    public TypeInfo getTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			    /**
			     * Get the static type descriptor (TypeInfo) of 'this' R8 object.
			     */
			    public static TypeInfo getStaticTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			} // End class definition for R8

			// Methods for field "criticalExtensions"
			public static CriticalExtensions4 createCriticalExtensions4WithCriticalExtensions(CriticalExtensions5 criticalExtensions)
			{
			    CriticalExtensions4 __object = new CriticalExtensions4();

			    __object.setCriticalExtensions(criticalExtensions);
			    return __object;
			}
			
			public boolean hasCriticalExtensions()
			{
			    return getChosenFlag() == criticalExtensions_chosen;
			}
			
			public void setCriticalExtensions(CriticalExtensions5 criticalExtensions)
			{
			    setChosenValue(criticalExtensions);
			    setChosenFlag(criticalExtensions_chosen);
			}
			
			
			
			/**
			 * Define the ASN1 Type CriticalExtensions5 from ASN1 Module PDU_definitions.
			 * @see Choice
			 */
			public static class CriticalExtensions5 extends Choice {
			    
			    /**
			     * The default constructor.
			     */
			    public CriticalExtensions5()
			    {
			    }
			    
			    public static final  int  r9_chosen = 1;
			    public static final  int  criticalExtensions_chosen = 2;
			    
			    // Methods for field "r9"
			    public static CriticalExtensions5 createCriticalExtensions5WithR9(R9 r9)
			    {
				CriticalExtensions5 __object = new CriticalExtensions5();

				__object.setR9(r9);
				return __object;
			    }
			    
			    public boolean hasR9()
			    {
				return getChosenFlag() == r9_chosen;
			    }
			    
			    public void setR9(R9 r9)
			    {
				setChosenValue(r9);
				setChosenFlag(r9_chosen);
			    }
			    
			    
			    
			    /**
			     * Define the ASN1 Type R9 from ASN1 Module PDU_definitions.
			     * @see Sequence
			     */
			    public static class R9 extends Sequence {
				
				/**
				 * The default constructor.
				 */
				public R9()
				{
				}
				
				/**
				 * Construct with AbstractData components.
				 */
				public R9(HandoverToUTRANCommand_r9_IEs handoverToUTRANCommand_r9, 
						NonCriticalExtensions nonCriticalExtensions)
				{
				    setHandoverToUTRANCommand_r9(handoverToUTRANCommand_r9);
				    setNonCriticalExtensions(nonCriticalExtensions);
				}
				
				/**
				 * Construct with required components.
				 */
				public R9(HandoverToUTRANCommand_r9_IEs handoverToUTRANCommand_r9)
				{
				    setHandoverToUTRANCommand_r9(handoverToUTRANCommand_r9);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new HandoverToUTRANCommand_r9_IEs();
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
					    return new HandoverToUTRANCommand_r9_IEs();
					case 1:
					    return new NonCriticalExtensions();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "handoverToUTRANCommand_r9"
				public HandoverToUTRANCommand_r9_IEs getHandoverToUTRANCommand_r9()
				{
				    return (HandoverToUTRANCommand_r9_IEs)mComponents[0];
				}
				
				public void setHandoverToUTRANCommand_r9(HandoverToUTRANCommand_r9_IEs handoverToUTRANCommand_r9)
				{
				    mComponents[0] = handoverToUTRANCommand_r9;
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
					    "HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$R9$NonCriticalExtensions"
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
					"HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$R9"
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
							    "HandoverToUTRANCommand_r9_IEs"
							),
							new QName (
							    "PDU-definitions",
							    "HandoverToUTRANCommand-r9-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.pdu_definitions",
								"HandoverToUTRANCommand_r9_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.pdu_definitions",
								"HandoverToUTRANCommand_r9_IEs"
							    )
							),
							0
						    )
						),
						"handoverToUTRANCommand-r9",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.pdu_definitions",
							"HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$R9$NonCriticalExtensions"
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
				 * Get the type descriptor (TypeInfo) of 'this' R9 object.
				 */
				public TypeInfo getTypeInfo()
				{
				    return c_typeinfo;
				}
				
				/**
				 * Get the static type descriptor (TypeInfo) of 'this' R9 object.
				 */
				public static TypeInfo getStaticTypeInfo()
				{
				    return c_typeinfo;
				}
				
			    } // End class definition for R9

			    // Methods for field "criticalExtensions"
			    public static CriticalExtensions5 createCriticalExtensions5WithCriticalExtensions(CriticalExtensions6 criticalExtensions)
			    {
				CriticalExtensions5 __object = new CriticalExtensions5();

				__object.setCriticalExtensions(criticalExtensions);
				return __object;
			    }
			    
			    public boolean hasCriticalExtensions()
			    {
				return getChosenFlag() == criticalExtensions_chosen;
			    }
			    
			    public void setCriticalExtensions(CriticalExtensions6 criticalExtensions)
			    {
				setChosenValue(criticalExtensions);
				setChosenFlag(criticalExtensions_chosen);
			    }
			    
			    
			    
			    /**
			     * Define the ASN1 Type CriticalExtensions6 from ASN1 Module PDU_definitions.
			     * @see Choice
			     */
			    public static class CriticalExtensions6 extends Choice {
				
				/**
				 * The default constructor.
				 */
				public CriticalExtensions6()
				{
				}
				
				public static final  int  r10_chosen = 1;
				public static final  int  criticalExtensions_chosen = 2;
				
				// Methods for field "r10"
				public static CriticalExtensions6 createCriticalExtensions6WithR10(R10 r10)
				{
				    CriticalExtensions6 __object = new CriticalExtensions6();

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
				    public R10(HandoverToUTRANCommand_r10_IEs handoverToUTRANCommand_r10, 
						    NonCriticalExtensions nonCriticalExtensions)
				    {
					setHandoverToUTRANCommand_r10(handoverToUTRANCommand_r10);
					setNonCriticalExtensions(nonCriticalExtensions);
				    }
				    
				    /**
				     * Construct with required components.
				     */
				    public R10(HandoverToUTRANCommand_r10_IEs handoverToUTRANCommand_r10)
				    {
					setHandoverToUTRANCommand_r10(handoverToUTRANCommand_r10);
				    }
				    
				    public void initComponents()
				    {
					mComponents[0] = new HandoverToUTRANCommand_r10_IEs();
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
						return new HandoverToUTRANCommand_r10_IEs();
					    case 1:
						return new NonCriticalExtensions();
					    default:
						throw new InternalError("AbstractCollection.createInstance()");
					}
					
				    }
				    
				    
				    // Methods for field "handoverToUTRANCommand_r10"
				    public HandoverToUTRANCommand_r10_IEs getHandoverToUTRANCommand_r10()
				    {
					return (HandoverToUTRANCommand_r10_IEs)mComponents[0];
				    }
				    
				    public void setHandoverToUTRANCommand_r10(HandoverToUTRANCommand_r10_IEs handoverToUTRANCommand_r10)
				    {
					mComponents[0] = handoverToUTRANCommand_r10;
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
						"HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$CriticalExtensions6$R10$NonCriticalExtensions"
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
					    "HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$CriticalExtensions6$R10"
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
								"HandoverToUTRANCommand_r10_IEs"
							    ),
							    new QName (
								"PDU-definitions",
								"HandoverToUTRANCommand-r10-IEs"
							    ),
							    12314,
							    null,
							    new FieldsRef (
								new QName (
								    "rrc.pdu_definitions",
								    "HandoverToUTRANCommand_r10_IEs"
								)
							    ),
							    0,
							    new TagDecodersRef (
								new QName (
								    "rrc.pdu_definitions",
								    "HandoverToUTRANCommand_r10_IEs"
								)
							    ),
							    0
							)
						    ),
						    "handoverToUTRANCommand-r10",
						    0,
						    2,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.pdu_definitions",
							    "HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$CriticalExtensions6$R10$NonCriticalExtensions"
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
				public static CriticalExtensions6 createCriticalExtensions6WithCriticalExtensions(CriticalExtensions7 criticalExtensions)
				{
				    CriticalExtensions6 __object = new CriticalExtensions6();

				    __object.setCriticalExtensions(criticalExtensions);
				    return __object;
				}
				
				public boolean hasCriticalExtensions()
				{
				    return getChosenFlag() == criticalExtensions_chosen;
				}
				
				public void setCriticalExtensions(CriticalExtensions7 criticalExtensions)
				{
				    setChosenValue(criticalExtensions);
				    setChosenFlag(criticalExtensions_chosen);
				}
				
				
				
				/**
				 * Define the ASN1 Type CriticalExtensions7 from ASN1 Module PDU_definitions.
				 * @see Sequence
				 */
				public static class CriticalExtensions7 extends Sequence {
				    
				    /**
				     * The default constructor.
				     */
				    public CriticalExtensions7()
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
					    "HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$CriticalExtensions6$CriticalExtensions7"
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
				     * Get the type descriptor (TypeInfo) of 'this' CriticalExtensions7 object.
				     */
				    public TypeInfo getTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				    /**
				     * Get the static type descriptor (TypeInfo) of 'this' CriticalExtensions7 object.
				     */
				    public static TypeInfo getStaticTypeInfo()
				    {
					return c_typeinfo;
				    }
				    
				} // End class definition for CriticalExtensions7

				// Method to create a specific choice instance
				public AbstractData createInstance(int chosen)
				{
				    switch (chosen) {
					case r10_chosen:
					    return new R10();
					case criticalExtensions_chosen:
					    return new CriticalExtensions7();
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
					"HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$CriticalExtensions6"
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
							"HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$CriticalExtensions6$R10"
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
							"HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$CriticalExtensions6$CriticalExtensions7"
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
				 * Get the type descriptor (TypeInfo) of 'this' CriticalExtensions6 object.
				 */
				public TypeInfo getTypeInfo()
				{
				    return c_typeinfo;
				}
				
				/**
				 * Get the static type descriptor (TypeInfo) of 'this' CriticalExtensions6 object.
				 */
				public static TypeInfo getStaticTypeInfo()
				{
				    return c_typeinfo;
				}
				
			    } // End class definition for CriticalExtensions6

			    // Method to create a specific choice instance
			    public AbstractData createInstance(int chosen)
			    {
				switch (chosen) {
				    case r9_chosen:
					return new R9();
				    case criticalExtensions_chosen:
					return new CriticalExtensions6();
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
				    "HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5"
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
						    "HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$R9"
						)
					    ),
					    "r9",
					    0,
					    2
					),
					new FieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$CriticalExtensions6"
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
			     * Get the type descriptor (TypeInfo) of 'this' CriticalExtensions5 object.
			     */
			    public TypeInfo getTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			    /**
			     * Get the static type descriptor (TypeInfo) of 'this' CriticalExtensions5 object.
			     */
			    public static TypeInfo getStaticTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			} // End class definition for CriticalExtensions5

			// Method to create a specific choice instance
			public AbstractData createInstance(int chosen)
			{
			    switch (chosen) {
				case r8_chosen:
				    return new R8();
				case criticalExtensions_chosen:
				    return new CriticalExtensions5();
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
				"HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4"
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
						"HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8"
					    )
					),
					"r8",
					0,
					2
				    ),
				    new FieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5"
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
			 * Get the type descriptor (TypeInfo) of 'this' CriticalExtensions4 object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' CriticalExtensions4 object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for CriticalExtensions4

		    // Method to create a specific choice instance
		    public AbstractData createInstance(int chosen)
		    {
			switch (chosen) {
			    case r7_chosen:
				return new R7();
			    case criticalExtensions_chosen:
				return new CriticalExtensions4();
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
			    "HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3"
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
					    "HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7"
					)
				    ),
				    "r7",
				    0,
				    2
				),
				new FieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4"
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
		     * Get the type descriptor (TypeInfo) of 'this' CriticalExtensions3 object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' CriticalExtensions3 object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for CriticalExtensions3

		// Method to create a specific choice instance
		public AbstractData createInstance(int chosen)
		{
		    switch (chosen) {
			case r6_chosen:
			    return new R6();
			case criticalExtensions_chosen:
			    return new CriticalExtensions3();
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
			"HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2"
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
					"HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R6"
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
					"HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3"
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
		 * Get the type descriptor (TypeInfo) of 'this' CriticalExtensions2 object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' CriticalExtensions2 object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for CriticalExtensions2

	    // Method to create a specific choice instance
	    public AbstractData createInstance(int chosen)
	    {
		switch (chosen) {
		    case r5_chosen:
			return new R5();
		    case criticalExtensions_chosen:
			return new CriticalExtensions2();
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
		    "HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1"
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
				    "HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$R5"
				)
			    ),
			    "r5",
			    0,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1$CriticalExtensions2"
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
		case r4_chosen:
		    return new R4();
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
		"HandoverToUTRANCommand$CriticalExtensions"
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
				"HandoverToUTRANCommand$CriticalExtensions$R4"
			    )
			),
			"r4",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"HandoverToUTRANCommand$CriticalExtensions$CriticalExtensions1"
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

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case r3_chosen:
		return new R3();
	    case criticalExtensions_chosen:
		return new CriticalExtensions();
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
	    "HandoverToUTRANCommand"
	),
	new QName (
	    "PDU-definitions",
	    "HandoverToUTRANCommand"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "HandoverToUTRANCommand$R3"
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
			    "HandoverToUTRANCommand$CriticalExtensions"
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
     * Get the type descriptor (TypeInfo) of 'this' HandoverToUTRANCommand object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HandoverToUTRANCommand object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
} // End class definition for HandoverToUTRANCommand
