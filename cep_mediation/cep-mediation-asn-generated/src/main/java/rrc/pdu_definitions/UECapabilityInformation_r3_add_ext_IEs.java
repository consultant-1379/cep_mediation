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
 * Define the ASN1 Type UECapabilityInformation_r3_add_ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class UECapabilityInformation_r3_add_ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public UECapabilityInformation_r3_add_ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UECapabilityInformation_r3_add_ext_IEs(UECapabilityInformation_v650ext_IEs ueCapabilityInformation_v650ext, 
		    V680NCEs v680NCEs)
    {
	setUeCapabilityInformation_v650ext(ueCapabilityInformation_v650ext);
	setV680NCEs(v680NCEs);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UECapabilityInformation_v650ext_IEs();
	mComponents[1] = new V680NCEs();
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
		return new UECapabilityInformation_v650ext_IEs();
	    case 1:
		return new V680NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ueCapabilityInformation_v650ext"
    public UECapabilityInformation_v650ext_IEs getUeCapabilityInformation_v650ext()
    {
	return (UECapabilityInformation_v650ext_IEs)mComponents[0];
    }
    
    public void setUeCapabilityInformation_v650ext(UECapabilityInformation_v650ext_IEs ueCapabilityInformation_v650ext)
    {
	mComponents[0] = ueCapabilityInformation_v650ext;
    }
    
    public boolean hasUeCapabilityInformation_v650ext()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUeCapabilityInformation_v650ext()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "v680NCEs"
    public V680NCEs getV680NCEs()
    {
	return (V680NCEs)mComponents[1];
    }
    
    public void setV680NCEs(V680NCEs v680NCEs)
    {
	mComponents[1] = v680NCEs;
    }
    
    public boolean hasV680NCEs()
    {
	return componentIsPresent(1);
    }
    
    public void deleteV680NCEs()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type V680NCEs from ASN1 Module PDU_definitions.
     * @see Sequence
     */
    public static class V680NCEs extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public V680NCEs()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public V680NCEs(UECapabilityInformation_v680ext_IEs ueCapabilityInformation_v680ext, 
			V7e0NCEs v7e0NCEs)
	{
	    setUeCapabilityInformation_v680ext(ueCapabilityInformation_v680ext);
	    setV7e0NCEs(v7e0NCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public V680NCEs(UECapabilityInformation_v680ext_IEs ueCapabilityInformation_v680ext)
	{
	    setUeCapabilityInformation_v680ext(ueCapabilityInformation_v680ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new UECapabilityInformation_v680ext_IEs();
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
		    return new UECapabilityInformation_v680ext_IEs();
		case 1:
		    return new V7e0NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "ueCapabilityInformation_v680ext"
	public UECapabilityInformation_v680ext_IEs getUeCapabilityInformation_v680ext()
	{
	    return (UECapabilityInformation_v680ext_IEs)mComponents[0];
	}
	
	public void setUeCapabilityInformation_v680ext(UECapabilityInformation_v680ext_IEs ueCapabilityInformation_v680ext)
	{
	    mComponents[0] = ueCapabilityInformation_v680ext;
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
	    public V7e0NCEs(UECapabilityInformation_v7e0ext_IEs ueCapabilityInformation_v7e0ext, 
			    V7f0NCEs v7f0NCEs)
	    {
		setUeCapabilityInformation_v7e0ext(ueCapabilityInformation_v7e0ext);
		setV7f0NCEs(v7f0NCEs);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V7e0NCEs(UECapabilityInformation_v7e0ext_IEs ueCapabilityInformation_v7e0ext)
	    {
		setUeCapabilityInformation_v7e0ext(ueCapabilityInformation_v7e0ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new UECapabilityInformation_v7e0ext_IEs();
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
			return new UECapabilityInformation_v7e0ext_IEs();
		    case 1:
			return new V7f0NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "ueCapabilityInformation_v7e0ext"
	    public UECapabilityInformation_v7e0ext_IEs getUeCapabilityInformation_v7e0ext()
	    {
		return (UECapabilityInformation_v7e0ext_IEs)mComponents[0];
	    }
	    
	    public void setUeCapabilityInformation_v7e0ext(UECapabilityInformation_v7e0ext_IEs ueCapabilityInformation_v7e0ext)
	    {
		mComponents[0] = ueCapabilityInformation_v7e0ext;
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
		public V7f0NCEs(UECapabilityInformation_v7f0ext_IEs ueCapabilityInformation_v7f0ext, 
				Va40NCEs va40NCEs)
		{
		    setUeCapabilityInformation_v7f0ext(ueCapabilityInformation_v7f0ext);
		    setVa40NCEs(va40NCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public V7f0NCEs(UECapabilityInformation_v7f0ext_IEs ueCapabilityInformation_v7f0ext)
		{
		    setUeCapabilityInformation_v7f0ext(ueCapabilityInformation_v7f0ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new UECapabilityInformation_v7f0ext_IEs();
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
			    return new UECapabilityInformation_v7f0ext_IEs();
			case 1:
			    return new Va40NCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "ueCapabilityInformation_v7f0ext"
		public UECapabilityInformation_v7f0ext_IEs getUeCapabilityInformation_v7f0ext()
		{
		    return (UECapabilityInformation_v7f0ext_IEs)mComponents[0];
		}
		
		public void setUeCapabilityInformation_v7f0ext(UECapabilityInformation_v7f0ext_IEs ueCapabilityInformation_v7f0ext)
		{
		    mComponents[0] = ueCapabilityInformation_v7f0ext;
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
		    public Va40NCEs(UECapabilityInformation_va40ext_IEs ueCapabilityInformation_va40ext, 
				    NonCriticalExtensions nonCriticalExtensions)
		    {
			setUeCapabilityInformation_va40ext(ueCapabilityInformation_va40ext);
			setNonCriticalExtensions(nonCriticalExtensions);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public Va40NCEs(UECapabilityInformation_va40ext_IEs ueCapabilityInformation_va40ext)
		    {
			setUeCapabilityInformation_va40ext(ueCapabilityInformation_va40ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new UECapabilityInformation_va40ext_IEs();
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
				return new UECapabilityInformation_va40ext_IEs();
			    case 1:
				return new NonCriticalExtensions();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "ueCapabilityInformation_va40ext"
		    public UECapabilityInformation_va40ext_IEs getUeCapabilityInformation_va40ext()
		    {
			return (UECapabilityInformation_va40ext_IEs)mComponents[0];
		    }
		    
		    public void setUeCapabilityInformation_va40ext(UECapabilityInformation_va40ext_IEs ueCapabilityInformation_va40ext)
		    {
			mComponents[0] = ueCapabilityInformation_va40ext;
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
				"UECapabilityInformation_r3_add_ext_IEs$V680NCEs$V7e0NCEs$V7f0NCEs$Va40NCEs$NonCriticalExtensions"
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
			    "UECapabilityInformation_r3_add_ext_IEs$V680NCEs$V7e0NCEs$V7f0NCEs$Va40NCEs"
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
						"UECapabilityInformation_va40ext_IEs"
					    ),
					    new QName (
						"PDU-definitions",
						"UECapabilityInformation-va40ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.pdu_definitions",
						    "UECapabilityInformation_va40ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.pdu_definitions",
						    "UECapabilityInformation_va40ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "ueCapabilityInformation-va40ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "UECapabilityInformation_r3_add_ext_IEs$V680NCEs$V7e0NCEs$V7f0NCEs$Va40NCEs$NonCriticalExtensions"
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
			"UECapabilityInformation_r3_add_ext_IEs$V680NCEs$V7e0NCEs$V7f0NCEs"
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
					    "UECapabilityInformation_v7f0ext_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "UECapabilityInformation-v7f0ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"UECapabilityInformation_v7f0ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"UECapabilityInformation_v7f0ext_IEs"
					    )
					),
					0
				    )
				),
				"ueCapabilityInformation-v7f0ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"UECapabilityInformation_r3_add_ext_IEs$V680NCEs$V7e0NCEs$V7f0NCEs$Va40NCEs"
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
		    "UECapabilityInformation_r3_add_ext_IEs$V680NCEs$V7e0NCEs"
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
					"UECapabilityInformation_v7e0ext_IEs"
				    ),
				    new QName (
					"PDU-definitions",
					"UECapabilityInformation-v7e0ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "UECapabilityInformation_v7e0ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "UECapabilityInformation_v7e0ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "ueCapabilityInformation-v7e0ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "UECapabilityInformation_r3_add_ext_IEs$V680NCEs$V7e0NCEs$V7f0NCEs"
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
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"UECapabilityInformation_r3_add_ext_IEs$V680NCEs"
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
				    "UECapabilityInformation_v680ext_IEs"
				),
				new QName (
				    "PDU-definitions",
				    "UECapabilityInformation-v680ext-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"UECapabilityInformation_v680ext_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"UECapabilityInformation_v680ext_IEs"
				    )
				),
				0
			    )
			),
			"ueCapabilityInformation-v680ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"UECapabilityInformation_r3_add_ext_IEs$V680NCEs$V7e0NCEs"
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
	 * Get the type descriptor (TypeInfo) of 'this' V680NCEs object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' V680NCEs object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for V680NCEs

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
	    "UECapabilityInformation_r3_add_ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "UECapabilityInformation-r3-add-ext-IEs"
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
				"UECapabilityInformation_v650ext_IEs"
			    ),
			    new QName (
				"PDU-definitions",
				"UECapabilityInformation-v650ext-IEs"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "UECapabilityInformation_v650ext_IEs"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "UECapabilityInformation_v650ext_IEs"
				)
			    ),
			    0
			)
		    ),
		    "ueCapabilityInformation-v650ext",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "UECapabilityInformation_r3_add_ext_IEs$V680NCEs"
			)
		    ),
		    "v680NCEs",
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
     * Get the type descriptor (TypeInfo) of 'this' UECapabilityInformation_r3_add_ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UECapabilityInformation_r3_add_ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UECapabilityInformation_r3_add_ext_IEs
