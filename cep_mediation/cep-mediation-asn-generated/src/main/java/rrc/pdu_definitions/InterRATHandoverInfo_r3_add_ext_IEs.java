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
 * Define the ASN1 Type InterRATHandoverInfo_r3_add_ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class InterRATHandoverInfo_r3_add_ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public InterRATHandoverInfo_r3_add_ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InterRATHandoverInfo_r3_add_ext_IEs(InterRATHandoverInfo_v690ext1_IEs interRATHandoverInfo_v690ext1, 
		    V7e0NCEs v7e0NCEs)
    {
	setInterRATHandoverInfo_v690ext1(interRATHandoverInfo_v690ext1);
	setV7e0NCEs(v7e0NCEs);
    }
    
    /**
     * Construct with required components.
     */
    public InterRATHandoverInfo_r3_add_ext_IEs(InterRATHandoverInfo_v690ext1_IEs interRATHandoverInfo_v690ext1)
    {
	setInterRATHandoverInfo_v690ext1(interRATHandoverInfo_v690ext1);
    }
    
    public void initComponents()
    {
	mComponents[0] = new InterRATHandoverInfo_v690ext1_IEs();
	mComponents[1] = new V7e0NCEs();
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
		return new InterRATHandoverInfo_v690ext1_IEs();
	    case 1:
		return new V7e0NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "interRATHandoverInfo_v690ext1"
    public InterRATHandoverInfo_v690ext1_IEs getInterRATHandoverInfo_v690ext1()
    {
	return (InterRATHandoverInfo_v690ext1_IEs)mComponents[0];
    }
    
    public void setInterRATHandoverInfo_v690ext1(InterRATHandoverInfo_v690ext1_IEs interRATHandoverInfo_v690ext1)
    {
	mComponents[0] = interRATHandoverInfo_v690ext1;
    }
    
    
    // Methods for field "v7e0NCEs"
    public V7e0NCEs getV7e0NCEs()
    {
	return (V7e0NCEs)mComponents[1];
    }
    
    public void setV7e0NCEs(V7e0NCEs v7e0NCEs)
    {
	mComponents[1] = v7e0NCEs;
    }
    
    public boolean hasV7e0NCEs()
    {
	return componentIsPresent(1);
    }
    
    public void deleteV7e0NCEs()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type V7e0NCEs from ASN1 Module PDU_definitions.
     * @see Sequence
     */
    public static class V7e0NCEs extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public V7e0NCEs()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public V7e0NCEs(InterRATHandoverInfo_v7e0ext_IEs interRATHandoverInfo_v7e0ext, 
			V7f0NCEs v7f0NCEs)
	{
	    setInterRATHandoverInfo_v7e0ext(interRATHandoverInfo_v7e0ext);
	    setV7f0NCEs(v7f0NCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public V7e0NCEs(InterRATHandoverInfo_v7e0ext_IEs interRATHandoverInfo_v7e0ext)
	{
	    setInterRATHandoverInfo_v7e0ext(interRATHandoverInfo_v7e0ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new InterRATHandoverInfo_v7e0ext_IEs();
	    mComponents[1] = new V7f0NCEs();
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
		    return new InterRATHandoverInfo_v7e0ext_IEs();
		case 1:
		    return new V7f0NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "interRATHandoverInfo_v7e0ext"
	public InterRATHandoverInfo_v7e0ext_IEs getInterRATHandoverInfo_v7e0ext()
	{
	    return (InterRATHandoverInfo_v7e0ext_IEs)mComponents[0];
	}
	
	public void setInterRATHandoverInfo_v7e0ext(InterRATHandoverInfo_v7e0ext_IEs interRATHandoverInfo_v7e0ext)
	{
	    mComponents[0] = interRATHandoverInfo_v7e0ext;
	}
	
	
	// Methods for field "v7f0NCEs"
	public V7f0NCEs getV7f0NCEs()
	{
	    return (V7f0NCEs)mComponents[1];
	}
	
	public void setV7f0NCEs(V7f0NCEs v7f0NCEs)
	{
	    mComponents[1] = v7f0NCEs;
	}
	
	public boolean hasV7f0NCEs()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteV7f0NCEs()
	{
	    setComponentAbsent(1);
	}
	
	
	
	/**
	 * Define the ASN1 Type V7f0NCEs from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class V7f0NCEs extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public V7f0NCEs()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public V7f0NCEs(InterRATHandoverInfo_v7f0ext_IEs interRATHandoverInfo_v7f0ext, 
			    Va40NCEs va40NCEs)
	    {
		setInterRATHandoverInfo_v7f0ext(interRATHandoverInfo_v7f0ext);
		setVa40NCEs(va40NCEs);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V7f0NCEs(InterRATHandoverInfo_v7f0ext_IEs interRATHandoverInfo_v7f0ext)
	    {
		setInterRATHandoverInfo_v7f0ext(interRATHandoverInfo_v7f0ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new InterRATHandoverInfo_v7f0ext_IEs();
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
			return new InterRATHandoverInfo_v7f0ext_IEs();
		    case 1:
			return new Va40NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "interRATHandoverInfo_v7f0ext"
	    public InterRATHandoverInfo_v7f0ext_IEs getInterRATHandoverInfo_v7f0ext()
	    {
		return (InterRATHandoverInfo_v7f0ext_IEs)mComponents[0];
	    }
	    
	    public void setInterRATHandoverInfo_v7f0ext(InterRATHandoverInfo_v7f0ext_IEs interRATHandoverInfo_v7f0ext)
	    {
		mComponents[0] = interRATHandoverInfo_v7f0ext;
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
		public Va40NCEs(InterRATHandoverInfoBand_va40ext_IEs interRATHandoverInfo_va40ext, 
				NonCriticalExtensions nonCriticalExtensions)
		{
		    setInterRATHandoverInfo_va40ext(interRATHandoverInfo_va40ext);
		    setNonCriticalExtensions(nonCriticalExtensions);
		}
		
		/**
		 * Construct with required components.
		 */
		public Va40NCEs(InterRATHandoverInfoBand_va40ext_IEs interRATHandoverInfo_va40ext)
		{
		    setInterRATHandoverInfo_va40ext(interRATHandoverInfo_va40ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new InterRATHandoverInfoBand_va40ext_IEs();
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
			    return new InterRATHandoverInfoBand_va40ext_IEs();
			case 1:
			    return new NonCriticalExtensions();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "interRATHandoverInfo_va40ext"
		public InterRATHandoverInfoBand_va40ext_IEs getInterRATHandoverInfo_va40ext()
		{
		    return (InterRATHandoverInfoBand_va40ext_IEs)mComponents[0];
		}
		
		public void setInterRATHandoverInfo_va40ext(InterRATHandoverInfoBand_va40ext_IEs interRATHandoverInfo_va40ext)
		{
		    mComponents[0] = interRATHandoverInfo_va40ext;
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
			    "InterRATHandoverInfo_r3_add_ext_IEs$V7e0NCEs$V7f0NCEs$Va40NCEs$NonCriticalExtensions"
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
			"InterRATHandoverInfo_r3_add_ext_IEs$V7e0NCEs$V7f0NCEs$Va40NCEs"
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
					    "InterRATHandoverInfoBand_va40ext_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "InterRATHandoverInfoBand-va40ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"InterRATHandoverInfoBand_va40ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"InterRATHandoverInfoBand_va40ext_IEs"
					    )
					),
					0
				    )
				),
				"interRATHandoverInfo-va40ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"InterRATHandoverInfo_r3_add_ext_IEs$V7e0NCEs$V7f0NCEs$Va40NCEs$NonCriticalExtensions"
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
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.pdu_definitions",
		    "InterRATHandoverInfo_r3_add_ext_IEs$V7e0NCEs$V7f0NCEs"
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
					"InterRATHandoverInfo_v7f0ext_IEs"
				    ),
				    new QName (
					"PDU-definitions",
					"InterRATHandoverInfo-v7f0ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "InterRATHandoverInfo_v7f0ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "InterRATHandoverInfo_v7f0ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "interRATHandoverInfo-v7f0ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "InterRATHandoverInfo_r3_add_ext_IEs$V7e0NCEs$V7f0NCEs$Va40NCEs"
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
	     * Get the type descriptor (TypeInfo) of 'this' V7f0NCEs object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' V7f0NCEs object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for V7f0NCEs

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
		"InterRATHandoverInfo_r3_add_ext_IEs$V7e0NCEs"
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
				    "InterRATHandoverInfo_v7e0ext_IEs"
				),
				new QName (
				    "PDU-definitions",
				    "InterRATHandoverInfo-v7e0ext-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"InterRATHandoverInfo_v7e0ext_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"InterRATHandoverInfo_v7e0ext_IEs"
				    )
				),
				0
			    )
			),
			"interRATHandoverInfo-v7e0ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"InterRATHandoverInfo_r3_add_ext_IEs$V7e0NCEs$V7f0NCEs"
			    )
			),
			"v7f0NCEs",
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
	 * Get the type descriptor (TypeInfo) of 'this' V7e0NCEs object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' V7e0NCEs object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for V7e0NCEs

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
	    "InterRATHandoverInfo_r3_add_ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "InterRATHandoverInfo-r3-add-ext-IEs"
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
				"InterRATHandoverInfo_v690ext1_IEs"
			    ),
			    new QName (
				"PDU-definitions",
				"InterRATHandoverInfo-v690ext1-IEs"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "InterRATHandoverInfo_v690ext1_IEs"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "InterRATHandoverInfo_v690ext1_IEs"
				)
			    ),
			    0
			)
		    ),
		    "interRATHandoverInfo-v690ext1",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "InterRATHandoverInfo_r3_add_ext_IEs$V7e0NCEs"
			)
		    ),
		    "v7e0NCEs",
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
     * Get the type descriptor (TypeInfo) of 'this' InterRATHandoverInfo_r3_add_ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterRATHandoverInfo_r3_add_ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterRATHandoverInfo_r3_add_ext_IEs
