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
 * Define the ASN1 Type UECapabilityEnquiry from ASN1 Module PDU_definitions.
 * @see Choice
 */

public class UECapabilityEnquiry extends Choice {
    
    /**
     * The default constructor.
     */
    public UECapabilityEnquiry()
    {
    }
    
    public static final  int  r3_chosen = 1;
    public static final  int  later_than_r3_chosen = 2;
    
    // Methods for field "r3"
    public static UECapabilityEnquiry createUECapabilityEnquiryWithR3(R3 r3)
    {
	UECapabilityEnquiry __object = new UECapabilityEnquiry();

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
	public R3(UECapabilityEnquiry_r3_IEs ueCapabilityEnquiry_r3, 
			LaterNCEs laterNCEs)
	{
	    setUeCapabilityEnquiry_r3(ueCapabilityEnquiry_r3);
	    setLaterNCEs(laterNCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public R3(UECapabilityEnquiry_r3_IEs ueCapabilityEnquiry_r3)
	{
	    setUeCapabilityEnquiry_r3(ueCapabilityEnquiry_r3);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new UECapabilityEnquiry_r3_IEs();
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
		    return new UECapabilityEnquiry_r3_IEs();
		case 1:
		    return new LaterNCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "ueCapabilityEnquiry_r3"
	public UECapabilityEnquiry_r3_IEs getUeCapabilityEnquiry_r3()
	{
	    return (UECapabilityEnquiry_r3_IEs)mComponents[0];
	}
	
	public void setUeCapabilityEnquiry_r3(UECapabilityEnquiry_r3_IEs ueCapabilityEnquiry_r3)
	{
	    mComponents[0] = ueCapabilityEnquiry_r3;
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
	    public LaterNCEs(BitString ueCapabilityEnquiry_r3_add_ext, 
			    V4b0NCEs v4b0NCEs)
	    {
		setUeCapabilityEnquiry_r3_add_ext(ueCapabilityEnquiry_r3_add_ext);
		setV4b0NCEs(v4b0NCEs);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new BitString();
		mComponents[1] = new V4b0NCEs();
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
			return new V4b0NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "ueCapabilityEnquiry_r3_add_ext"
	    public BitString getUeCapabilityEnquiry_r3_add_ext()
	    {
		return (BitString)mComponents[0];
	    }
	    
	    public void setUeCapabilityEnquiry_r3_add_ext(BitString ueCapabilityEnquiry_r3_add_ext)
	    {
		mComponents[0] = ueCapabilityEnquiry_r3_add_ext;
	    }
	    
	    public boolean hasUeCapabilityEnquiry_r3_add_ext()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteUeCapabilityEnquiry_r3_add_ext()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "v4b0NCEs"
	    public V4b0NCEs getV4b0NCEs()
	    {
		return (V4b0NCEs)mComponents[1];
	    }
	    
	    public void setV4b0NCEs(V4b0NCEs v4b0NCEs)
	    {
		mComponents[1] = v4b0NCEs;
	    }
	    
	    public boolean hasV4b0NCEs()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteV4b0NCEs()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type V4b0NCEs from ASN1 Module PDU_definitions.
	     * @see Sequence
	     */
	    public static class V4b0NCEs extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public V4b0NCEs()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public V4b0NCEs(UECapabilityEnquiry_v4b0ext_IEs ueCapabilityEnquiry_v4b0ext, 
				V590NCEs v590NCEs)
		{
		    setUeCapabilityEnquiry_v4b0ext(ueCapabilityEnquiry_v4b0ext);
		    setV590NCEs(v590NCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public V4b0NCEs(UECapabilityEnquiry_v4b0ext_IEs ueCapabilityEnquiry_v4b0ext)
		{
		    setUeCapabilityEnquiry_v4b0ext(ueCapabilityEnquiry_v4b0ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new UECapabilityEnquiry_v4b0ext_IEs();
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
			    return new UECapabilityEnquiry_v4b0ext_IEs();
			case 1:
			    return new V590NCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "ueCapabilityEnquiry_v4b0ext"
		public UECapabilityEnquiry_v4b0ext_IEs getUeCapabilityEnquiry_v4b0ext()
		{
		    return (UECapabilityEnquiry_v4b0ext_IEs)mComponents[0];
		}
		
		public void setUeCapabilityEnquiry_v4b0ext(UECapabilityEnquiry_v4b0ext_IEs ueCapabilityEnquiry_v4b0ext)
		{
		    mComponents[0] = ueCapabilityEnquiry_v4b0ext;
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
		    public V590NCEs(UECapabilityEnquiry_v590ext_IEs ueCapabilityEnquiry_v590ext, 
				    V770NCEs v770NCEs)
		    {
			setUeCapabilityEnquiry_v590ext(ueCapabilityEnquiry_v590ext);
			setV770NCEs(v770NCEs);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public V590NCEs(UECapabilityEnquiry_v590ext_IEs ueCapabilityEnquiry_v590ext)
		    {
			setUeCapabilityEnquiry_v590ext(ueCapabilityEnquiry_v590ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new UECapabilityEnquiry_v590ext_IEs();
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
				return new UECapabilityEnquiry_v590ext_IEs();
			    case 1:
				return new V770NCEs();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "ueCapabilityEnquiry_v590ext"
		    public UECapabilityEnquiry_v590ext_IEs getUeCapabilityEnquiry_v590ext()
		    {
			return (UECapabilityEnquiry_v590ext_IEs)mComponents[0];
		    }
		    
		    public void setUeCapabilityEnquiry_v590ext(UECapabilityEnquiry_v590ext_IEs ueCapabilityEnquiry_v590ext)
		    {
			mComponents[0] = ueCapabilityEnquiry_v590ext;
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
			public V770NCEs(UECapabilityEnquiry_v770ext_IEs ueCapabilityEnquiry_v770ext, 
					V860NCEs v860NCEs)
			{
			    setUeCapabilityEnquiry_v770ext(ueCapabilityEnquiry_v770ext);
			    setV860NCEs(v860NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public V770NCEs(UECapabilityEnquiry_v770ext_IEs ueCapabilityEnquiry_v770ext)
			{
			    setUeCapabilityEnquiry_v770ext(ueCapabilityEnquiry_v770ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new UECapabilityEnquiry_v770ext_IEs();
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
				    return new UECapabilityEnquiry_v770ext_IEs();
				case 1:
				    return new V860NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "ueCapabilityEnquiry_v770ext"
			public UECapabilityEnquiry_v770ext_IEs getUeCapabilityEnquiry_v770ext()
			{
			    return (UECapabilityEnquiry_v770ext_IEs)mComponents[0];
			}
			
			public void setUeCapabilityEnquiry_v770ext(UECapabilityEnquiry_v770ext_IEs ueCapabilityEnquiry_v770ext)
			{
			    mComponents[0] = ueCapabilityEnquiry_v770ext;
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
			    public V860NCEs(UECapabilityEnquiry_v860ext_IEs ueCapabilityEnquiry_v860ext, 
					    NonCriticalExtensions nonCriticalExtensions)
			    {
				setUeCapabilityEnquiry_v860ext(ueCapabilityEnquiry_v860ext);
				setNonCriticalExtensions(nonCriticalExtensions);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V860NCEs(UECapabilityEnquiry_v860ext_IEs ueCapabilityEnquiry_v860ext)
			    {
				setUeCapabilityEnquiry_v860ext(ueCapabilityEnquiry_v860ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new UECapabilityEnquiry_v860ext_IEs();
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
					return new UECapabilityEnquiry_v860ext_IEs();
				    case 1:
					return new NonCriticalExtensions();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "ueCapabilityEnquiry_v860ext"
			    public UECapabilityEnquiry_v860ext_IEs getUeCapabilityEnquiry_v860ext()
			    {
				return (UECapabilityEnquiry_v860ext_IEs)mComponents[0];
			    }
			    
			    public void setUeCapabilityEnquiry_v860ext(UECapabilityEnquiry_v860ext_IEs ueCapabilityEnquiry_v860ext)
			    {
				mComponents[0] = ueCapabilityEnquiry_v860ext;
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
					"UECapabilityEnquiry$R3$LaterNCEs$V4b0NCEs$V590NCEs$V770NCEs$V860NCEs$NonCriticalExtensions"
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
				    "UECapabilityEnquiry$R3$LaterNCEs$V4b0NCEs$V590NCEs$V770NCEs$V860NCEs"
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
							"UECapabilityEnquiry_v860ext_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"UECapabilityEnquiry-v860ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "UECapabilityEnquiry_v860ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "UECapabilityEnquiry_v860ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "ueCapabilityEnquiry-v860ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "UECapabilityEnquiry$R3$LaterNCEs$V4b0NCEs$V590NCEs$V770NCEs$V860NCEs$NonCriticalExtensions"
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
				"UECapabilityEnquiry$R3$LaterNCEs$V4b0NCEs$V590NCEs$V770NCEs"
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
						    "UECapabilityEnquiry_v770ext_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "UECapabilityEnquiry-v770ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"UECapabilityEnquiry_v770ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"UECapabilityEnquiry_v770ext_IEs"
						    )
						),
						0
					    )
					),
					"ueCapabilityEnquiry-v770ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"UECapabilityEnquiry$R3$LaterNCEs$V4b0NCEs$V590NCEs$V770NCEs$V860NCEs"
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
			    "UECapabilityEnquiry$R3$LaterNCEs$V4b0NCEs$V590NCEs"
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
						"UECapabilityEnquiry_v590ext_IEs"
					    ),
					    new QName (
						"PDU-definitions",
						"UECapabilityEnquiry-v590ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.pdu_definitions",
						    "UECapabilityEnquiry_v590ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.pdu_definitions",
						    "UECapabilityEnquiry_v590ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "ueCapabilityEnquiry-v590ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "UECapabilityEnquiry$R3$LaterNCEs$V4b0NCEs$V590NCEs$V770NCEs"
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
			    (short)0x8001
			}
		    ),
		    new QName (
			"rrc.pdu_definitions",
			"UECapabilityEnquiry$R3$LaterNCEs$V4b0NCEs"
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
					    "UECapabilityEnquiry_v4b0ext_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "UECapabilityEnquiry-v4b0ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"UECapabilityEnquiry_v4b0ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"UECapabilityEnquiry_v4b0ext_IEs"
					    )
					),
					0
				    )
				),
				"ueCapabilityEnquiry-v4b0ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"UECapabilityEnquiry$R3$LaterNCEs$V4b0NCEs$V590NCEs"
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
		 * Get the type descriptor (TypeInfo) of 'this' V4b0NCEs object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' V4b0NCEs object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for V4b0NCEs

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
		    "UECapabilityEnquiry$R3$LaterNCEs"
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
			    "ueCapabilityEnquiry-r3-add-ext",
			    0,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "UECapabilityEnquiry$R3$LaterNCEs$V4b0NCEs"
				)
			    ),
			    "v4b0NCEs",
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
		"UECapabilityEnquiry$R3"
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
				    "UECapabilityEnquiry_r3_IEs"
				),
				new QName (
				    "PDU-definitions",
				    "UECapabilityEnquiry-r3-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"UECapabilityEnquiry_r3_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"UECapabilityEnquiry_r3_IEs"
				    )
				),
				0
			    )
			),
			"ueCapabilityEnquiry-r3",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"UECapabilityEnquiry$R3$LaterNCEs"
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
    public static UECapabilityEnquiry createUECapabilityEnquiryWithLater_than_r3(Later_than_r3 later_than_r3)
    {
	UECapabilityEnquiry __object = new UECapabilityEnquiry();

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
		    "UECapabilityEnquiry$Later_than_r3$CriticalExtensions"
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
		"UECapabilityEnquiry$Later_than_r3"
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
				"UECapabilityEnquiry$Later_than_r3$CriticalExtensions"
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
	    "UECapabilityEnquiry"
	),
	new QName (
	    "PDU-definitions",
	    "UECapabilityEnquiry"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "UECapabilityEnquiry$R3"
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
			    "UECapabilityEnquiry$Later_than_r3"
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
     * Get the type descriptor (TypeInfo) of 'this' UECapabilityEnquiry object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UECapabilityEnquiry object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UECapabilityEnquiry
