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
 * Define the ASN1 Type HandoverFromUTRANCommand_GERANIu from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class HandoverFromUTRANCommand_GERANIu extends Sequence {
    
    /**
     * The default constructor.
     */
    public HandoverFromUTRANCommand_GERANIu()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HandoverFromUTRANCommand_GERANIu(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
		    HandoverFromUTRANCommand_GERANIu1 handoverFromUTRANCommand_GERANIu)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	setHandoverFromUTRANCommand_GERANIu(handoverFromUTRANCommand_GERANIu);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.RRC_TransactionIdentifier();
	mComponents[1] = new HandoverFromUTRANCommand_GERANIu1();
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
		return new HandoverFromUTRANCommand_GERANIu1();
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
    
    
    // Methods for field "handoverFromUTRANCommand_GERANIu"
    public HandoverFromUTRANCommand_GERANIu1 getHandoverFromUTRANCommand_GERANIu()
    {
	return (HandoverFromUTRANCommand_GERANIu1)mComponents[1];
    }
    
    public void setHandoverFromUTRANCommand_GERANIu(HandoverFromUTRANCommand_GERANIu1 handoverFromUTRANCommand_GERANIu)
    {
	mComponents[1] = handoverFromUTRANCommand_GERANIu;
    }
    
    
    
    /**
     * Define the ASN1 Type HandoverFromUTRANCommand_GERANIu1 from ASN1 Module PDU_definitions.
     * @see Choice
     */
    public static class HandoverFromUTRANCommand_GERANIu1 extends Choice {
	
	/**
	 * The default constructor.
	 */
	public HandoverFromUTRANCommand_GERANIu1()
	{
	}
	
	public static final  int  r5_chosen = 1;
	public static final  int  later_than_r5_chosen = 2;
	
	// Methods for field "r5"
	public static HandoverFromUTRANCommand_GERANIu1 createHandoverFromUTRANCommand_GERANIu1WithR5(R5 r5)
	{
	    HandoverFromUTRANCommand_GERANIu1 __object = new HandoverFromUTRANCommand_GERANIu1();

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
	    public R5(HandoverFromUTRANCommand_GERANIu_r5_IEs handoverFromUTRANCommand_GERANIu_r5, 
			    NonCriticalExtensions nonCriticalExtensions)
	    {
		setHandoverFromUTRANCommand_GERANIu_r5(handoverFromUTRANCommand_GERANIu_r5);
		setNonCriticalExtensions(nonCriticalExtensions);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public R5(HandoverFromUTRANCommand_GERANIu_r5_IEs handoverFromUTRANCommand_GERANIu_r5)
	    {
		setHandoverFromUTRANCommand_GERANIu_r5(handoverFromUTRANCommand_GERANIu_r5);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new HandoverFromUTRANCommand_GERANIu_r5_IEs();
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
			return new HandoverFromUTRANCommand_GERANIu_r5_IEs();
		    case 1:
			return new NonCriticalExtensions();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "handoverFromUTRANCommand_GERANIu_r5"
	    public HandoverFromUTRANCommand_GERANIu_r5_IEs getHandoverFromUTRANCommand_GERANIu_r5()
	    {
		return (HandoverFromUTRANCommand_GERANIu_r5_IEs)mComponents[0];
	    }
	    
	    public void setHandoverFromUTRANCommand_GERANIu_r5(HandoverFromUTRANCommand_GERANIu_r5_IEs handoverFromUTRANCommand_GERANIu_r5)
	    {
		mComponents[0] = handoverFromUTRANCommand_GERANIu_r5;
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
			"HandoverFromUTRANCommand_GERANIu$HandoverFromUTRANCommand_GERANIu1$R5$NonCriticalExtensions"
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
		    "HandoverFromUTRANCommand_GERANIu$HandoverFromUTRANCommand_GERANIu1$R5"
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
					"HandoverFromUTRANCommand_GERANIu_r5_IEs"
				    ),
				    new QName (
					"PDU-definitions",
					"HandoverFromUTRANCommand-GERANIu-r5-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "HandoverFromUTRANCommand_GERANIu_r5_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "HandoverFromUTRANCommand_GERANIu_r5_IEs"
					)
				    ),
				    0
				)
			    ),
			    "handoverFromUTRANCommand-GERANIu-r5",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "HandoverFromUTRANCommand_GERANIu$HandoverFromUTRANCommand_GERANIu1$R5$NonCriticalExtensions"
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

	// Methods for field "later_than_r5"
	public static HandoverFromUTRANCommand_GERANIu1 createHandoverFromUTRANCommand_GERANIu1WithLater_than_r5(Later_than_r5 later_than_r5)
	{
	    HandoverFromUTRANCommand_GERANIu1 __object = new HandoverFromUTRANCommand_GERANIu1();

	    __object.setLater_than_r5(later_than_r5);
	    return __object;
	}
	
	public boolean hasLater_than_r5()
	{
	    return getChosenFlag() == later_than_r5_chosen;
	}
	
	public void setLater_than_r5(Later_than_r5 later_than_r5)
	{
	    setChosenValue(later_than_r5);
	    setChosenFlag(later_than_r5_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Later_than_r5 from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class Later_than_r5 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Later_than_r5()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Later_than_r5(CriticalExtensions criticalExtensions)
	    {
		setCriticalExtensions(criticalExtensions);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new CriticalExtensions();
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
			return new CriticalExtensions();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "criticalExtensions"
	    public CriticalExtensions getCriticalExtensions()
	    {
		return (CriticalExtensions)mComponents[0];
	    }
	    
	    public void setCriticalExtensions(CriticalExtensions criticalExtensions)
	    {
		mComponents[0] = criticalExtensions;
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
			    (short)0x8000
			}
		    ),
		    new QName (
			"rrc.pdu_definitions",
			"HandoverFromUTRANCommand_GERANIu$HandoverFromUTRANCommand_GERANIu1$Later_than_r5$CriticalExtensions"
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
		    "HandoverFromUTRANCommand_GERANIu$HandoverFromUTRANCommand_GERANIu1$Later_than_r5"
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
				new QName (
				    "rrc.pdu_definitions",
				    "HandoverFromUTRANCommand_GERANIu$HandoverFromUTRANCommand_GERANIu1$Later_than_r5$CriticalExtensions"
				)
			    ),
			    "criticalExtensions",
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
	     * Get the type descriptor (TypeInfo) of 'this' Later_than_r5 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Later_than_r5 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Later_than_r5

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case r5_chosen:
		    return new R5();
		case later_than_r5_chosen:
		    return new Later_than_r5();
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
		"HandoverFromUTRANCommand_GERANIu$HandoverFromUTRANCommand_GERANIu1"
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
				"HandoverFromUTRANCommand_GERANIu$HandoverFromUTRANCommand_GERANIu1$R5"
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
				"HandoverFromUTRANCommand_GERANIu$HandoverFromUTRANCommand_GERANIu1$Later_than_r5"
			    )
			),
			"later-than-r5",
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
	 * Get the type descriptor (TypeInfo) of 'this' HandoverFromUTRANCommand_GERANIu1 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' HandoverFromUTRANCommand_GERANIu1 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for HandoverFromUTRANCommand_GERANIu1

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
	    "HandoverFromUTRANCommand_GERANIu"
	),
	new QName (
	    "PDU-definitions",
	    "HandoverFromUTRANCommand-GERANIu"
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
			    "HandoverFromUTRANCommand_GERANIu$HandoverFromUTRANCommand_GERANIu1"
			)
		    ),
		    "handoverFromUTRANCommand-GERANIu",
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
     * Get the type descriptor (TypeInfo) of 'this' HandoverFromUTRANCommand_GERANIu object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HandoverFromUTRANCommand_GERANIu object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HandoverFromUTRANCommand_GERANIu
