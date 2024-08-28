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
 * Define the ASN1 Type HandoverToUTRANComplete from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class HandoverToUTRANComplete extends Sequence {
    
    /**
     * The default constructor.
     */
    public HandoverToUTRANComplete()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HandoverToUTRANComplete(rrc.informationelements.STARTList startList, 
		    rrc.informationelements.ActivationTime count_C_ActivationTime, 
		    LaterNCEs laterNCEs)
    {
	setStartList(startList);
	setCount_C_ActivationTime(count_C_ActivationTime);
	setLaterNCEs(laterNCEs);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.STARTList();
	mComponents[1] = new rrc.informationelements.ActivationTime();
	mComponents[2] = new LaterNCEs();
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
		return new rrc.informationelements.STARTList();
	    case 1:
		return new rrc.informationelements.ActivationTime();
	    case 2:
		return new LaterNCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "startList"
    public rrc.informationelements.STARTList getStartList()
    {
	return (rrc.informationelements.STARTList)mComponents[0];
    }
    
    public void setStartList(rrc.informationelements.STARTList startList)
    {
	mComponents[0] = startList;
    }
    
    public boolean hasStartList()
    {
	return componentIsPresent(0);
    }
    
    public void deleteStartList()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "count_C_ActivationTime"
    public rrc.informationelements.ActivationTime getCount_C_ActivationTime()
    {
	return (rrc.informationelements.ActivationTime)mComponents[1];
    }
    
    public void setCount_C_ActivationTime(rrc.informationelements.ActivationTime count_C_ActivationTime)
    {
	mComponents[1] = count_C_ActivationTime;
    }
    
    public boolean hasCount_C_ActivationTime()
    {
	return componentIsPresent(1);
    }
    
    public void deleteCount_C_ActivationTime()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "laterNCEs"
    public LaterNCEs getLaterNCEs()
    {
	return (LaterNCEs)mComponents[2];
    }
    
    public void setLaterNCEs(LaterNCEs laterNCEs)
    {
	mComponents[2] = laterNCEs;
    }
    
    public boolean hasLaterNCEs()
    {
	return componentIsPresent(2);
    }
    
    public void deleteLaterNCEs()
    {
	setComponentAbsent(2);
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
	public LaterNCEs(BitString handoverToUTRANComplete_r3_add_ext, 
			Va40NCEs va40NCEs)
	{
	    setHandoverToUTRANComplete_r3_add_ext(handoverToUTRANComplete_r3_add_ext);
	    setVa40NCEs(va40NCEs);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new BitString();
	    mComponents[1] = new Va40NCEs();
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
		    return new Va40NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "handoverToUTRANComplete_r3_add_ext"
	public BitString getHandoverToUTRANComplete_r3_add_ext()
	{
	    return (BitString)mComponents[0];
	}
	
	public void setHandoverToUTRANComplete_r3_add_ext(BitString handoverToUTRANComplete_r3_add_ext)
	{
	    mComponents[0] = handoverToUTRANComplete_r3_add_ext;
	}
	
	public boolean hasHandoverToUTRANComplete_r3_add_ext()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteHandoverToUTRANComplete_r3_add_ext()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "va40NCEs"
	public Va40NCEs getVa40NCEs()
	{
	    return (Va40NCEs)mComponents[1];
	}
	
	public void setVa40NCEs(Va40NCEs va40NCEs)
	{
	    mComponents[1] = va40NCEs;
	}
	
	public boolean hasVa40NCEs()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteVa40NCEs()
	{
	    setComponentAbsent(1);
	}
	
	
	
	/**
	 * Define the ASN1 Type Va40NCEs from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class Va40NCEs extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Va40NCEs()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Va40NCEs(HandoverToUTRANComplete_va40ext handoverToUTRANComplete_va40ext, 
			    NonCriticalExtensions nonCriticalExtensions)
	    {
		setHandoverToUTRANComplete_va40ext(handoverToUTRANComplete_va40ext);
		setNonCriticalExtensions(nonCriticalExtensions);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Va40NCEs(HandoverToUTRANComplete_va40ext handoverToUTRANComplete_va40ext)
	    {
		setHandoverToUTRANComplete_va40ext(handoverToUTRANComplete_va40ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new HandoverToUTRANComplete_va40ext();
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
			return new HandoverToUTRANComplete_va40ext();
		    case 1:
			return new NonCriticalExtensions();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "handoverToUTRANComplete_va40ext"
	    public HandoverToUTRANComplete_va40ext getHandoverToUTRANComplete_va40ext()
	    {
		return (HandoverToUTRANComplete_va40ext)mComponents[0];
	    }
	    
	    public void setHandoverToUTRANComplete_va40ext(HandoverToUTRANComplete_va40ext handoverToUTRANComplete_va40ext)
	    {
		mComponents[0] = handoverToUTRANComplete_va40ext;
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
			"HandoverToUTRANComplete$LaterNCEs$Va40NCEs$NonCriticalExtensions"
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
		    "HandoverToUTRANComplete$LaterNCEs$Va40NCEs"
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
					"HandoverToUTRANComplete_va40ext"
				    ),
				    new QName (
					"PDU-definitions",
					"HandoverToUTRANComplete-va40ext"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "HandoverToUTRANComplete_va40ext"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "HandoverToUTRANComplete_va40ext"
					)
				    ),
				    0
				)
			    ),
			    "handoverToUTRANComplete-va40ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "HandoverToUTRANComplete$LaterNCEs$Va40NCEs$NonCriticalExtensions"
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
	     * Get the type descriptor (TypeInfo) of 'this' Va40NCEs object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Va40NCEs object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Va40NCEs

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
		"HandoverToUTRANComplete$LaterNCEs"
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
			"handoverToUTRANComplete-r3-add-ext",
			0,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"HandoverToUTRANComplete$LaterNCEs$Va40NCEs"
			    )
			),
			"va40NCEs",
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
	    "HandoverToUTRANComplete"
	),
	new QName (
	    "PDU-definitions",
	    "HandoverToUTRANComplete"
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
				"STARTList"
			    ),
			    new QName (
				"InformationElements",
				"STARTList"
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
				    "STARTSingle"
				)
			    )
			)
		    ),
		    "startList",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ActivationTime"
			    ),
			    new QName (
				"InformationElements",
				"ActivationTime"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.ActivationTime(0), 
				    new rrc.informationelements.ActivationTime(255),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(255)
			    ),
			    null
			)
		    ),
		    "count-C-ActivationTime",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "HandoverToUTRANComplete$LaterNCEs"
			)
		    ),
		    "laterNCEs",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' HandoverToUTRANComplete object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HandoverToUTRANComplete object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HandoverToUTRANComplete
