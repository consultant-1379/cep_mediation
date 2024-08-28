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
 * Define the ASN1 Type ActiveSetUpdate from ASN1 Module PDU_definitions.
 * @see Choice
 */

public class ActiveSetUpdate extends Choice {
    
    /**
     * The default constructor.
     */
    public ActiveSetUpdate()
    {
    }
    
    public static final  int  r3_chosen = 1;
    public static final  int  later_than_r3_chosen = 2;
    
    // Methods for field "r3"
    public static ActiveSetUpdate createActiveSetUpdateWithR3(R3 r3)
    {
	ActiveSetUpdate __object = new ActiveSetUpdate();

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
	public R3(ActiveSetUpdate_r3_IEs activeSetUpdate_r3, 
			LaterNCEs laterNCEs)
	{
	    setActiveSetUpdate_r3(activeSetUpdate_r3);
	    setLaterNCEs(laterNCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public R3(ActiveSetUpdate_r3_IEs activeSetUpdate_r3)
	{
	    setActiveSetUpdate_r3(activeSetUpdate_r3);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new ActiveSetUpdate_r3_IEs();
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
		    return new ActiveSetUpdate_r3_IEs();
		case 1:
		    return new LaterNCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "activeSetUpdate_r3"
	public ActiveSetUpdate_r3_IEs getActiveSetUpdate_r3()
	{
	    return (ActiveSetUpdate_r3_IEs)mComponents[0];
	}
	
	public void setActiveSetUpdate_r3(ActiveSetUpdate_r3_IEs activeSetUpdate_r3)
	{
	    mComponents[0] = activeSetUpdate_r3;
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
	    public LaterNCEs(BitString activeSetUpdate_r3_add_ext, 
			    V4b0NCEs v4b0NCEs)
	    {
		setActiveSetUpdate_r3_add_ext(activeSetUpdate_r3_add_ext);
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
	    
	    
	    // Methods for field "activeSetUpdate_r3_add_ext"
	    public BitString getActiveSetUpdate_r3_add_ext()
	    {
		return (BitString)mComponents[0];
	    }
	    
	    public void setActiveSetUpdate_r3_add_ext(BitString activeSetUpdate_r3_add_ext)
	    {
		mComponents[0] = activeSetUpdate_r3_add_ext;
	    }
	    
	    public boolean hasActiveSetUpdate_r3_add_ext()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteActiveSetUpdate_r3_add_ext()
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
		public V4b0NCEs(ActiveSetUpdate_v4b0ext_IEs activeSetUpdate_v4b0ext, 
				V590NCEs v590NCEs)
		{
		    setActiveSetUpdate_v4b0ext(activeSetUpdate_v4b0ext);
		    setV590NCEs(v590NCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public V4b0NCEs(ActiveSetUpdate_v4b0ext_IEs activeSetUpdate_v4b0ext)
		{
		    setActiveSetUpdate_v4b0ext(activeSetUpdate_v4b0ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new ActiveSetUpdate_v4b0ext_IEs();
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
			    return new ActiveSetUpdate_v4b0ext_IEs();
			case 1:
			    return new V590NCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "activeSetUpdate_v4b0ext"
		public ActiveSetUpdate_v4b0ext_IEs getActiveSetUpdate_v4b0ext()
		{
		    return (ActiveSetUpdate_v4b0ext_IEs)mComponents[0];
		}
		
		public void setActiveSetUpdate_v4b0ext(ActiveSetUpdate_v4b0ext_IEs activeSetUpdate_v4b0ext)
		{
		    mComponents[0] = activeSetUpdate_v4b0ext;
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
		    public V590NCEs(ActiveSetUpdate_v590ext_IEs activeSetUpdate_v590ext, 
				    V690NCEs v690NCEs)
		    {
			setActiveSetUpdate_v590ext(activeSetUpdate_v590ext);
			setV690NCEs(v690NCEs);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public V590NCEs(ActiveSetUpdate_v590ext_IEs activeSetUpdate_v590ext)
		    {
			setActiveSetUpdate_v590ext(activeSetUpdate_v590ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new ActiveSetUpdate_v590ext_IEs();
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
				return new ActiveSetUpdate_v590ext_IEs();
			    case 1:
				return new V690NCEs();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "activeSetUpdate_v590ext"
		    public ActiveSetUpdate_v590ext_IEs getActiveSetUpdate_v590ext()
		    {
			return (ActiveSetUpdate_v590ext_IEs)mComponents[0];
		    }
		    
		    public void setActiveSetUpdate_v590ext(ActiveSetUpdate_v590ext_IEs activeSetUpdate_v590ext)
		    {
			mComponents[0] = activeSetUpdate_v590ext;
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
			public V690NCEs(ActiveSetUpdate_v690ext_IEs activeSetUpdate_v690ext, 
					NonCriticalExtensions nonCriticalExtensions)
			{
			    setActiveSetUpdate_v690ext(activeSetUpdate_v690ext);
			    setNonCriticalExtensions(nonCriticalExtensions);
			}
			
			/**
			 * Construct with required components.
			 */
			public V690NCEs(ActiveSetUpdate_v690ext_IEs activeSetUpdate_v690ext)
			{
			    setActiveSetUpdate_v690ext(activeSetUpdate_v690ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new ActiveSetUpdate_v690ext_IEs();
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
				    return new ActiveSetUpdate_v690ext_IEs();
				case 1:
				    return new NonCriticalExtensions();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "activeSetUpdate_v690ext"
			public ActiveSetUpdate_v690ext_IEs getActiveSetUpdate_v690ext()
			{
			    return (ActiveSetUpdate_v690ext_IEs)mComponents[0];
			}
			
			public void setActiveSetUpdate_v690ext(ActiveSetUpdate_v690ext_IEs activeSetUpdate_v690ext)
			{
			    mComponents[0] = activeSetUpdate_v690ext;
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
				    "ActiveSetUpdate$R3$LaterNCEs$V4b0NCEs$V590NCEs$V690NCEs$NonCriticalExtensions"
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
				"ActiveSetUpdate$R3$LaterNCEs$V4b0NCEs$V590NCEs$V690NCEs"
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
						    "ActiveSetUpdate_v690ext_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "ActiveSetUpdate-v690ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"ActiveSetUpdate_v690ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"ActiveSetUpdate_v690ext_IEs"
						    )
						),
						0
					    )
					),
					"activeSetUpdate-v690ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"ActiveSetUpdate$R3$LaterNCEs$V4b0NCEs$V590NCEs$V690NCEs$NonCriticalExtensions"
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
			    "ActiveSetUpdate$R3$LaterNCEs$V4b0NCEs$V590NCEs"
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
						"ActiveSetUpdate_v590ext_IEs"
					    ),
					    new QName (
						"PDU-definitions",
						"ActiveSetUpdate-v590ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.pdu_definitions",
						    "ActiveSetUpdate_v590ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.pdu_definitions",
						    "ActiveSetUpdate_v590ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "activeSetUpdate-v590ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "ActiveSetUpdate$R3$LaterNCEs$V4b0NCEs$V590NCEs$V690NCEs"
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
			"ActiveSetUpdate$R3$LaterNCEs$V4b0NCEs"
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
					    "ActiveSetUpdate_v4b0ext_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "ActiveSetUpdate-v4b0ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"ActiveSetUpdate_v4b0ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"ActiveSetUpdate_v4b0ext_IEs"
					    )
					),
					0
				    )
				),
				"activeSetUpdate-v4b0ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"ActiveSetUpdate$R3$LaterNCEs$V4b0NCEs$V590NCEs"
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
		    "ActiveSetUpdate$R3$LaterNCEs"
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
			    "activeSetUpdate-r3-add-ext",
			    0,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "ActiveSetUpdate$R3$LaterNCEs$V4b0NCEs"
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
		"ActiveSetUpdate$R3"
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
				    "ActiveSetUpdate_r3_IEs"
				),
				new QName (
				    "PDU-definitions",
				    "ActiveSetUpdate-r3-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"ActiveSetUpdate_r3_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"ActiveSetUpdate_r3_IEs"
				    )
				),
				0
			    )
			),
			"activeSetUpdate-r3",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"ActiveSetUpdate$R3$LaterNCEs"
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
    public static ActiveSetUpdate createActiveSetUpdateWithLater_than_r3(Later_than_r3 later_than_r3)
    {
	ActiveSetUpdate __object = new ActiveSetUpdate();

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
		public R6(ActiveSetUpdate_r6_IEs activeSetUpdate_r6, 
				BitString activeSetUpdate_r6_add_ext, 
				V6b0NCEs v6b0NCEs)
		{
		    setActiveSetUpdate_r6(activeSetUpdate_r6);
		    setActiveSetUpdate_r6_add_ext(activeSetUpdate_r6_add_ext);
		    setV6b0NCEs(v6b0NCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public R6(ActiveSetUpdate_r6_IEs activeSetUpdate_r6)
		{
		    setActiveSetUpdate_r6(activeSetUpdate_r6);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new ActiveSetUpdate_r6_IEs();
		    mComponents[1] = new BitString();
		    mComponents[2] = new V6b0NCEs();
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
			    return new ActiveSetUpdate_r6_IEs();
			case 1:
			    return new BitString();
			case 2:
			    return new V6b0NCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "activeSetUpdate_r6"
		public ActiveSetUpdate_r6_IEs getActiveSetUpdate_r6()
		{
		    return (ActiveSetUpdate_r6_IEs)mComponents[0];
		}
		
		public void setActiveSetUpdate_r6(ActiveSetUpdate_r6_IEs activeSetUpdate_r6)
		{
		    mComponents[0] = activeSetUpdate_r6;
		}
		
		
		// Methods for field "activeSetUpdate_r6_add_ext"
		public BitString getActiveSetUpdate_r6_add_ext()
		{
		    return (BitString)mComponents[1];
		}
		
		public void setActiveSetUpdate_r6_add_ext(BitString activeSetUpdate_r6_add_ext)
		{
		    mComponents[1] = activeSetUpdate_r6_add_ext;
		}
		
		public boolean hasActiveSetUpdate_r6_add_ext()
		{
		    return componentIsPresent(1);
		}
		
		public void deleteActiveSetUpdate_r6_add_ext()
		{
		    setComponentAbsent(1);
		}
		
		
		// Methods for field "v6b0NCEs"
		public V6b0NCEs getV6b0NCEs()
		{
		    return (V6b0NCEs)mComponents[2];
		}
		
		public void setV6b0NCEs(V6b0NCEs v6b0NCEs)
		{
		    mComponents[2] = v6b0NCEs;
		}
		
		public boolean hasV6b0NCEs()
		{
		    return componentIsPresent(2);
		}
		
		public void deleteV6b0NCEs()
		{
		    setComponentAbsent(2);
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
		    public V6b0NCEs(ActiveSetUpdate_v6b0ext_IEs activeSetUpdate_v6b0ext, 
				    NonCriticalExtensions nonCriticalExtensions)
		    {
			setActiveSetUpdate_v6b0ext(activeSetUpdate_v6b0ext);
			setNonCriticalExtensions(nonCriticalExtensions);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public V6b0NCEs(ActiveSetUpdate_v6b0ext_IEs activeSetUpdate_v6b0ext)
		    {
			setActiveSetUpdate_v6b0ext(activeSetUpdate_v6b0ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new ActiveSetUpdate_v6b0ext_IEs();
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
				return new ActiveSetUpdate_v6b0ext_IEs();
			    case 1:
				return new NonCriticalExtensions();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "activeSetUpdate_v6b0ext"
		    public ActiveSetUpdate_v6b0ext_IEs getActiveSetUpdate_v6b0ext()
		    {
			return (ActiveSetUpdate_v6b0ext_IEs)mComponents[0];
		    }
		    
		    public void setActiveSetUpdate_v6b0ext(ActiveSetUpdate_v6b0ext_IEs activeSetUpdate_v6b0ext)
		    {
			mComponents[0] = activeSetUpdate_v6b0ext;
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
				"ActiveSetUpdate$Later_than_r3$CriticalExtensions$R6$V6b0NCEs$NonCriticalExtensions"
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
			    "ActiveSetUpdate$Later_than_r3$CriticalExtensions$R6$V6b0NCEs"
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
						"ActiveSetUpdate_v6b0ext_IEs"
					    ),
					    new QName (
						"PDU-definitions",
						"ActiveSetUpdate-v6b0ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.pdu_definitions",
						    "ActiveSetUpdate_v6b0ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.pdu_definitions",
						    "ActiveSetUpdate_v6b0ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "activeSetUpdate-v6b0ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "ActiveSetUpdate$Later_than_r3$CriticalExtensions$R6$V6b0NCEs$NonCriticalExtensions"
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
			"ActiveSetUpdate$Later_than_r3$CriticalExtensions$R6"
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
					    "ActiveSetUpdate_r6_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "ActiveSetUpdate-r6-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"ActiveSetUpdate_r6_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"ActiveSetUpdate_r6_IEs"
					    )
					),
					0
				    )
				),
				"activeSetUpdate-r6",
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
				"activeSetUpdate-r6-add-ext",
				1,
				3,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"ActiveSetUpdate$Later_than_r3$CriticalExtensions$R6$V6b0NCEs"
				    )
				),
				"v6b0NCEs",
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
	     * @see Choice
	     */
	    public static class CriticalExtensions1 extends Choice {
		
		/**
		 * The default constructor.
		 */
		public CriticalExtensions1()
		{
		}
		
		public static final  int  r7_chosen = 1;
		public static final  int  criticalExtensions_chosen = 2;
		
		// Methods for field "r7"
		public static CriticalExtensions1 createCriticalExtensions1WithR7(R7 r7)
		{
		    CriticalExtensions1 __object = new CriticalExtensions1();

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
		    public R7(ActiveSetUpdate_r7_IEs activeSetUpdate_r7, 
				    BitString activeSetUpdate_r7_add_ext, 
				    V780NCEs v780NCEs)
		    {
			setActiveSetUpdate_r7(activeSetUpdate_r7);
			setActiveSetUpdate_r7_add_ext(activeSetUpdate_r7_add_ext);
			setV780NCEs(v780NCEs);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public R7(ActiveSetUpdate_r7_IEs activeSetUpdate_r7)
		    {
			setActiveSetUpdate_r7(activeSetUpdate_r7);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new ActiveSetUpdate_r7_IEs();
			mComponents[1] = new BitString();
			mComponents[2] = new V780NCEs();
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
				return new ActiveSetUpdate_r7_IEs();
			    case 1:
				return new BitString();
			    case 2:
				return new V780NCEs();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "activeSetUpdate_r7"
		    public ActiveSetUpdate_r7_IEs getActiveSetUpdate_r7()
		    {
			return (ActiveSetUpdate_r7_IEs)mComponents[0];
		    }
		    
		    public void setActiveSetUpdate_r7(ActiveSetUpdate_r7_IEs activeSetUpdate_r7)
		    {
			mComponents[0] = activeSetUpdate_r7;
		    }
		    
		    
		    // Methods for field "activeSetUpdate_r7_add_ext"
		    public BitString getActiveSetUpdate_r7_add_ext()
		    {
			return (BitString)mComponents[1];
		    }
		    
		    public void setActiveSetUpdate_r7_add_ext(BitString activeSetUpdate_r7_add_ext)
		    {
			mComponents[1] = activeSetUpdate_r7_add_ext;
		    }
		    
		    public boolean hasActiveSetUpdate_r7_add_ext()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteActiveSetUpdate_r7_add_ext()
		    {
			setComponentAbsent(1);
		    }
		    
		    
		    // Methods for field "v780NCEs"
		    public V780NCEs getV780NCEs()
		    {
			return (V780NCEs)mComponents[2];
		    }
		    
		    public void setV780NCEs(V780NCEs v780NCEs)
		    {
			mComponents[2] = v780NCEs;
		    }
		    
		    public boolean hasV780NCEs()
		    {
			return componentIsPresent(2);
		    }
		    
		    public void deleteV780NCEs()
		    {
			setComponentAbsent(2);
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
			public V780NCEs(ActiveSetUpdate_v780ext_IEs activeSetUpdate_v780ext, 
					V7f0NCEs v7f0NCEs)
			{
			    setActiveSetUpdate_v780ext(activeSetUpdate_v780ext);
			    setV7f0NCEs(v7f0NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public V780NCEs(ActiveSetUpdate_v780ext_IEs activeSetUpdate_v780ext)
			{
			    setActiveSetUpdate_v780ext(activeSetUpdate_v780ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new ActiveSetUpdate_v780ext_IEs();
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
				    return new ActiveSetUpdate_v780ext_IEs();
				case 1:
				    return new V7f0NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "activeSetUpdate_v780ext"
			public ActiveSetUpdate_v780ext_IEs getActiveSetUpdate_v780ext()
			{
			    return (ActiveSetUpdate_v780ext_IEs)mComponents[0];
			}
			
			public void setActiveSetUpdate_v780ext(ActiveSetUpdate_v780ext_IEs activeSetUpdate_v780ext)
			{
			    mComponents[0] = activeSetUpdate_v780ext;
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
			    public V7f0NCEs(ActiveSetUpdate_v7f0ext_IEs activeSetUdpate_v7f0ext, 
					    V7g0NCEs v7g0NCEs)
			    {
				setActiveSetUdpate_v7f0ext(activeSetUdpate_v7f0ext);
				setV7g0NCEs(v7g0NCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V7f0NCEs(ActiveSetUpdate_v7f0ext_IEs activeSetUdpate_v7f0ext)
			    {
				setActiveSetUdpate_v7f0ext(activeSetUdpate_v7f0ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new ActiveSetUpdate_v7f0ext_IEs();
				mComponents[1] = new V7g0NCEs();
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
					return new ActiveSetUpdate_v7f0ext_IEs();
				    case 1:
					return new V7g0NCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "activeSetUdpate_v7f0ext"
			    public ActiveSetUpdate_v7f0ext_IEs getActiveSetUdpate_v7f0ext()
			    {
				return (ActiveSetUpdate_v7f0ext_IEs)mComponents[0];
			    }
			    
			    public void setActiveSetUdpate_v7f0ext(ActiveSetUpdate_v7f0ext_IEs activeSetUdpate_v7f0ext)
			    {
				mComponents[0] = activeSetUdpate_v7f0ext;
			    }
			    
			    
			    // Methods for field "v7g0NCEs"
			    public V7g0NCEs getV7g0NCEs()
			    {
				return (V7g0NCEs)mComponents[1];
			    }
			    
			    public void setV7g0NCEs(V7g0NCEs v7g0NCEs)
			    {
				mComponents[1] = v7g0NCEs;
			    }
			    
			    public boolean hasV7g0NCEs()
			    {
				return componentIsPresent(1);
			    }
			    
			    public void deleteV7g0NCEs()
			    {
				setComponentAbsent(1);
			    }
			    
			    
			    
			    /**
			     * Define the ASN1 Type V7g0NCEs from ASN1 Module PDU_definitions.
			     * @see Sequence
			     */
			    public static class V7g0NCEs extends Sequence {
				
				/**
				 * The default constructor.
				 */
				public V7g0NCEs()
				{
				}
				
				/**
				 * Construct with AbstractData components.
				 */
				public V7g0NCEs(ActiveSetUpdate_v7g0ext_IEs activeSetUdpate_v7g0ext, 
						NonCriticalExtensions nonCriticalExtensions)
				{
				    setActiveSetUdpate_v7g0ext(activeSetUdpate_v7g0ext);
				    setNonCriticalExtensions(nonCriticalExtensions);
				}
				
				/**
				 * Construct with required components.
				 */
				public V7g0NCEs(ActiveSetUpdate_v7g0ext_IEs activeSetUdpate_v7g0ext)
				{
				    setActiveSetUdpate_v7g0ext(activeSetUdpate_v7g0ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new ActiveSetUpdate_v7g0ext_IEs();
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
					    return new ActiveSetUpdate_v7g0ext_IEs();
					case 1:
					    return new NonCriticalExtensions();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "activeSetUdpate_v7g0ext"
				public ActiveSetUpdate_v7g0ext_IEs getActiveSetUdpate_v7g0ext()
				{
				    return (ActiveSetUpdate_v7g0ext_IEs)mComponents[0];
				}
				
				public void setActiveSetUdpate_v7g0ext(ActiveSetUpdate_v7g0ext_IEs activeSetUdpate_v7g0ext)
				{
				    mComponents[0] = activeSetUdpate_v7g0ext;
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
					    "ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$R7$V780NCEs$V7f0NCEs$V7g0NCEs$NonCriticalExtensions"
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
					"ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$R7$V780NCEs$V7f0NCEs$V7g0NCEs"
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
							    "ActiveSetUpdate_v7g0ext_IEs"
							),
							new QName (
							    "PDU-definitions",
							    "ActiveSetUpdate-v7g0ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.pdu_definitions",
								"ActiveSetUpdate_v7g0ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.pdu_definitions",
								"ActiveSetUpdate_v7g0ext_IEs"
							    )
							),
							0
						    )
						),
						"activeSetUdpate-v7g0ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.pdu_definitions",
							"ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$R7$V780NCEs$V7f0NCEs$V7g0NCEs$NonCriticalExtensions"
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
				 * Get the type descriptor (TypeInfo) of 'this' V7g0NCEs object.
				 */
				public TypeInfo getTypeInfo()
				{
				    return c_typeinfo;
				}
				
				/**
				 * Get the static type descriptor (TypeInfo) of 'this' V7g0NCEs object.
				 */
				public static TypeInfo getStaticTypeInfo()
				{
				    return c_typeinfo;
				}
				
			    } // End class definition for V7g0NCEs

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
				    "ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$R7$V780NCEs$V7f0NCEs"
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
							"ActiveSetUpdate_v7f0ext_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"ActiveSetUpdate-v7f0ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "ActiveSetUpdate_v7f0ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "ActiveSetUpdate_v7f0ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "activeSetUdpate-v7f0ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$R7$V780NCEs$V7f0NCEs$V7g0NCEs"
						)
					    ),
					    "v7g0NCEs",
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
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$R7$V780NCEs"
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
						    "ActiveSetUpdate_v780ext_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "ActiveSetUpdate-v780ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"ActiveSetUpdate_v780ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"ActiveSetUpdate_v780ext_IEs"
						    )
						),
						0
					    )
					),
					"activeSetUpdate-v780ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$R7$V780NCEs$V7f0NCEs"
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
			    "ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$R7"
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
						"ActiveSetUpdate_r7_IEs"
					    ),
					    new QName (
						"PDU-definitions",
						"ActiveSetUpdate-r7-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.pdu_definitions",
						    "ActiveSetUpdate_r7_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.pdu_definitions",
						    "ActiveSetUpdate_r7_IEs"
						)
					    ),
					    0
					)
				    ),
				    "activeSetUpdate-r7",
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
				    "activeSetUpdate-r7-add-ext",
				    1,
				    3,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$R7$V780NCEs"
					)
				    ),
				    "v780NCEs",
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
		    
		    public static final  int  r8_chosen = 1;
		    public static final  int  criticalExtensions_chosen = 2;
		    
		    // Methods for field "r8"
		    public static CriticalExtensions2 createCriticalExtensions2WithR8(R8 r8)
		    {
			CriticalExtensions2 __object = new CriticalExtensions2();

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
			public R8(ActiveSetUpdate_r8_IEs activeSetUpdate_r8, 
					BitString activeSetUpdate_r8_add_ext, 
					V890NCEs v890NCEs)
			{
			    setActiveSetUpdate_r8(activeSetUpdate_r8);
			    setActiveSetUpdate_r8_add_ext(activeSetUpdate_r8_add_ext);
			    setV890NCEs(v890NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public R8(ActiveSetUpdate_r8_IEs activeSetUpdate_r8)
			{
			    setActiveSetUpdate_r8(activeSetUpdate_r8);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new ActiveSetUpdate_r8_IEs();
			    mComponents[1] = new BitString();
			    mComponents[2] = new V890NCEs();
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
				    return new ActiveSetUpdate_r8_IEs();
				case 1:
				    return new BitString();
				case 2:
				    return new V890NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "activeSetUpdate_r8"
			public ActiveSetUpdate_r8_IEs getActiveSetUpdate_r8()
			{
			    return (ActiveSetUpdate_r8_IEs)mComponents[0];
			}
			
			public void setActiveSetUpdate_r8(ActiveSetUpdate_r8_IEs activeSetUpdate_r8)
			{
			    mComponents[0] = activeSetUpdate_r8;
			}
			
			
			// Methods for field "activeSetUpdate_r8_add_ext"
			public BitString getActiveSetUpdate_r8_add_ext()
			{
			    return (BitString)mComponents[1];
			}
			
			public void setActiveSetUpdate_r8_add_ext(BitString activeSetUpdate_r8_add_ext)
			{
			    mComponents[1] = activeSetUpdate_r8_add_ext;
			}
			
			public boolean hasActiveSetUpdate_r8_add_ext()
			{
			    return componentIsPresent(1);
			}
			
			public void deleteActiveSetUpdate_r8_add_ext()
			{
			    setComponentAbsent(1);
			}
			
			
			// Methods for field "v890NCEs"
			public V890NCEs getV890NCEs()
			{
			    return (V890NCEs)mComponents[2];
			}
			
			public void setV890NCEs(V890NCEs v890NCEs)
			{
			    mComponents[2] = v890NCEs;
			}
			
			public boolean hasV890NCEs()
			{
			    return componentIsPresent(2);
			}
			
			public void deleteV890NCEs()
			{
			    setComponentAbsent(2);
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
			    public V890NCEs(ActiveSetUpdate_v890ext_IEs activeSetUpdate_v890ext, 
					    V7g0NCEs v7g0NCEs)
			    {
				setActiveSetUpdate_v890ext(activeSetUpdate_v890ext);
				setV7g0NCEs(v7g0NCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V890NCEs(ActiveSetUpdate_v890ext_IEs activeSetUpdate_v890ext)
			    {
				setActiveSetUpdate_v890ext(activeSetUpdate_v890ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new ActiveSetUpdate_v890ext_IEs();
				mComponents[1] = new V7g0NCEs();
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
					return new ActiveSetUpdate_v890ext_IEs();
				    case 1:
					return new V7g0NCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "activeSetUpdate_v890ext"
			    public ActiveSetUpdate_v890ext_IEs getActiveSetUpdate_v890ext()
			    {
				return (ActiveSetUpdate_v890ext_IEs)mComponents[0];
			    }
			    
			    public void setActiveSetUpdate_v890ext(ActiveSetUpdate_v890ext_IEs activeSetUpdate_v890ext)
			    {
				mComponents[0] = activeSetUpdate_v890ext;
			    }
			    
			    
			    // Methods for field "v7g0NCEs"
			    public V7g0NCEs getV7g0NCEs()
			    {
				return (V7g0NCEs)mComponents[1];
			    }
			    
			    public void setV7g0NCEs(V7g0NCEs v7g0NCEs)
			    {
				mComponents[1] = v7g0NCEs;
			    }
			    
			    public boolean hasV7g0NCEs()
			    {
				return componentIsPresent(1);
			    }
			    
			    public void deleteV7g0NCEs()
			    {
				setComponentAbsent(1);
			    }
			    
			    
			    
			    /**
			     * Define the ASN1 Type V7g0NCEs from ASN1 Module PDU_definitions.
			     * @see Sequence
			     */
			    public static class V7g0NCEs extends Sequence {
				
				/**
				 * The default constructor.
				 */
				public V7g0NCEs()
				{
				}
				
				/**
				 * Construct with AbstractData components.
				 */
				public V7g0NCEs(ActiveSetUpdate_v7g0ext_IEs activeSetUpdate_v7g0ext, 
						NonCriticalExtensions nonCriticalExtensions)
				{
				    setActiveSetUpdate_v7g0ext(activeSetUpdate_v7g0ext);
				    setNonCriticalExtensions(nonCriticalExtensions);
				}
				
				/**
				 * Construct with required components.
				 */
				public V7g0NCEs(ActiveSetUpdate_v7g0ext_IEs activeSetUpdate_v7g0ext)
				{
				    setActiveSetUpdate_v7g0ext(activeSetUpdate_v7g0ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new ActiveSetUpdate_v7g0ext_IEs();
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
					    return new ActiveSetUpdate_v7g0ext_IEs();
					case 1:
					    return new NonCriticalExtensions();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "activeSetUpdate_v7g0ext"
				public ActiveSetUpdate_v7g0ext_IEs getActiveSetUpdate_v7g0ext()
				{
				    return (ActiveSetUpdate_v7g0ext_IEs)mComponents[0];
				}
				
				public void setActiveSetUpdate_v7g0ext(ActiveSetUpdate_v7g0ext_IEs activeSetUpdate_v7g0ext)
				{
				    mComponents[0] = activeSetUpdate_v7g0ext;
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
					    "ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R8$V890NCEs$V7g0NCEs$NonCriticalExtensions"
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
					"ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R8$V890NCEs$V7g0NCEs"
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
							    "ActiveSetUpdate_v7g0ext_IEs"
							),
							new QName (
							    "PDU-definitions",
							    "ActiveSetUpdate-v7g0ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.pdu_definitions",
								"ActiveSetUpdate_v7g0ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.pdu_definitions",
								"ActiveSetUpdate_v7g0ext_IEs"
							    )
							),
							0
						    )
						),
						"activeSetUpdate-v7g0ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.pdu_definitions",
							"ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R8$V890NCEs$V7g0NCEs$NonCriticalExtensions"
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
				 * Get the type descriptor (TypeInfo) of 'this' V7g0NCEs object.
				 */
				public TypeInfo getTypeInfo()
				{
				    return c_typeinfo;
				}
				
				/**
				 * Get the static type descriptor (TypeInfo) of 'this' V7g0NCEs object.
				 */
				public static TypeInfo getStaticTypeInfo()
				{
				    return c_typeinfo;
				}
				
			    } // End class definition for V7g0NCEs

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
				    "ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R8$V890NCEs"
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
							"ActiveSetUpdate_v890ext_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"ActiveSetUpdate-v890ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "ActiveSetUpdate_v890ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "ActiveSetUpdate_v890ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "activeSetUpdate-v890ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R8$V890NCEs$V7g0NCEs"
						)
					    ),
					    "v7g0NCEs",
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
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R8"
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
						    "ActiveSetUpdate_r8_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "ActiveSetUpdate-r8-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"ActiveSetUpdate_r8_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"ActiveSetUpdate_r8_IEs"
						    )
						),
						0
					    )
					),
					"activeSetUpdate-r8",
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
					"activeSetUpdate-r8-add-ext",
					1,
					3,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R8$V890NCEs"
					    )
					),
					"v890NCEs",
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
			
			public static final  int  r9_chosen = 1;
			public static final  int  criticalExtensions_chosen = 2;
			
			// Methods for field "r9"
			public static CriticalExtensions3 createCriticalExtensions3WithR9(R9 r9)
			{
			    CriticalExtensions3 __object = new CriticalExtensions3();

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
			    public R9(ActiveSetUpdate_r9_IEs activeSetUpdate_r9, 
					    BitString activeSetUpdate_r9_add_ext, 
					    V950NCEs v950NCEs)
			    {
				setActiveSetUpdate_r9(activeSetUpdate_r9);
				setActiveSetUpdate_r9_add_ext(activeSetUpdate_r9_add_ext);
				setV950NCEs(v950NCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public R9(ActiveSetUpdate_r9_IEs activeSetUpdate_r9)
			    {
				setActiveSetUpdate_r9(activeSetUpdate_r9);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new ActiveSetUpdate_r9_IEs();
				mComponents[1] = new BitString();
				mComponents[2] = new V950NCEs();
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
					return new ActiveSetUpdate_r9_IEs();
				    case 1:
					return new BitString();
				    case 2:
					return new V950NCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "activeSetUpdate_r9"
			    public ActiveSetUpdate_r9_IEs getActiveSetUpdate_r9()
			    {
				return (ActiveSetUpdate_r9_IEs)mComponents[0];
			    }
			    
			    public void setActiveSetUpdate_r9(ActiveSetUpdate_r9_IEs activeSetUpdate_r9)
			    {
				mComponents[0] = activeSetUpdate_r9;
			    }
			    
			    
			    // Methods for field "activeSetUpdate_r9_add_ext"
			    public BitString getActiveSetUpdate_r9_add_ext()
			    {
				return (BitString)mComponents[1];
			    }
			    
			    public void setActiveSetUpdate_r9_add_ext(BitString activeSetUpdate_r9_add_ext)
			    {
				mComponents[1] = activeSetUpdate_r9_add_ext;
			    }
			    
			    public boolean hasActiveSetUpdate_r9_add_ext()
			    {
				return componentIsPresent(1);
			    }
			    
			    public void deleteActiveSetUpdate_r9_add_ext()
			    {
				setComponentAbsent(1);
			    }
			    
			    
			    // Methods for field "v950NCEs"
			    public V950NCEs getV950NCEs()
			    {
				return (V950NCEs)mComponents[2];
			    }
			    
			    public void setV950NCEs(V950NCEs v950NCEs)
			    {
				mComponents[2] = v950NCEs;
			    }
			    
			    public boolean hasV950NCEs()
			    {
				return componentIsPresent(2);
			    }
			    
			    public void deleteV950NCEs()
			    {
				setComponentAbsent(2);
			    }
			    
			    
			    
			    /**
			     * Define the ASN1 Type V950NCEs from ASN1 Module PDU_definitions.
			     * @see Sequence
			     */
			    public static class V950NCEs extends Sequence {
				
				/**
				 * The default constructor.
				 */
				public V950NCEs()
				{
				}
				
				/**
				 * Construct with AbstractData components.
				 */
				public V950NCEs(ActiveSetUpdate_v950ext_IEs activeSetUpdate_v950ext, 
						NonCriticalExtensions nonCriticalExtensions)
				{
				    setActiveSetUpdate_v950ext(activeSetUpdate_v950ext);
				    setNonCriticalExtensions(nonCriticalExtensions);
				}
				
				/**
				 * Construct with required components.
				 */
				public V950NCEs(ActiveSetUpdate_v950ext_IEs activeSetUpdate_v950ext)
				{
				    setActiveSetUpdate_v950ext(activeSetUpdate_v950ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new ActiveSetUpdate_v950ext_IEs();
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
					    return new ActiveSetUpdate_v950ext_IEs();
					case 1:
					    return new NonCriticalExtensions();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "activeSetUpdate_v950ext"
				public ActiveSetUpdate_v950ext_IEs getActiveSetUpdate_v950ext()
				{
				    return (ActiveSetUpdate_v950ext_IEs)mComponents[0];
				}
				
				public void setActiveSetUpdate_v950ext(ActiveSetUpdate_v950ext_IEs activeSetUpdate_v950ext)
				{
				    mComponents[0] = activeSetUpdate_v950ext;
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
					    "ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R9$V950NCEs$NonCriticalExtensions"
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
					"ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R9$V950NCEs"
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
							    "ActiveSetUpdate_v950ext_IEs"
							),
							new QName (
							    "PDU-definitions",
							    "ActiveSetUpdate-v950ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.pdu_definitions",
								"ActiveSetUpdate_v950ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.pdu_definitions",
								"ActiveSetUpdate_v950ext_IEs"
							    )
							),
							0
						    )
						),
						"activeSetUpdate-v950ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.pdu_definitions",
							"ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R9$V950NCEs$NonCriticalExtensions"
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
				 * Get the type descriptor (TypeInfo) of 'this' V950NCEs object.
				 */
				public TypeInfo getTypeInfo()
				{
				    return c_typeinfo;
				}
				
				/**
				 * Get the static type descriptor (TypeInfo) of 'this' V950NCEs object.
				 */
				public static TypeInfo getStaticTypeInfo()
				{
				    return c_typeinfo;
				}
				
			    } // End class definition for V950NCEs

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
				    "ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R9"
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
							"ActiveSetUpdate_r9_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"ActiveSetUpdate-r9-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "ActiveSetUpdate_r9_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "ActiveSetUpdate_r9_IEs"
							)
						    ),
						    0
						)
					    ),
					    "activeSetUpdate-r9",
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
					    "activeSetUpdate-r9-add-ext",
					    1,
					    3,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R9$V950NCEs"
						)
					    ),
					    "v950NCEs",
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
			    
			    public static final  int  r10_chosen = 1;
			    public static final  int  criticalExtensions_chosen = 2;
			    
			    // Methods for field "r10"
			    public static CriticalExtensions4 createCriticalExtensions4WithR10(R10 r10)
			    {
				CriticalExtensions4 __object = new CriticalExtensions4();

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
				public R10(ActiveSetUpdate_r10_IEs activeSetUpdate_r10, 
						BitString activeSetUpdate_r10_add_ext, 
						NonCriticalExtensions nonCriticalExtensions)
				{
				    setActiveSetUpdate_r10(activeSetUpdate_r10);
				    setActiveSetUpdate_r10_add_ext(activeSetUpdate_r10_add_ext);
				    setNonCriticalExtensions(nonCriticalExtensions);
				}
				
				/**
				 * Construct with required components.
				 */
				public R10(ActiveSetUpdate_r10_IEs activeSetUpdate_r10)
				{
				    setActiveSetUpdate_r10(activeSetUpdate_r10);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new ActiveSetUpdate_r10_IEs();
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
					    return new ActiveSetUpdate_r10_IEs();
					case 1:
					    return new BitString();
					case 2:
					    return new NonCriticalExtensions();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "activeSetUpdate_r10"
				public ActiveSetUpdate_r10_IEs getActiveSetUpdate_r10()
				{
				    return (ActiveSetUpdate_r10_IEs)mComponents[0];
				}
				
				public void setActiveSetUpdate_r10(ActiveSetUpdate_r10_IEs activeSetUpdate_r10)
				{
				    mComponents[0] = activeSetUpdate_r10;
				}
				
				
				// Methods for field "activeSetUpdate_r10_add_ext"
				public BitString getActiveSetUpdate_r10_add_ext()
				{
				    return (BitString)mComponents[1];
				}
				
				public void setActiveSetUpdate_r10_add_ext(BitString activeSetUpdate_r10_add_ext)
				{
				    mComponents[1] = activeSetUpdate_r10_add_ext;
				}
				
				public boolean hasActiveSetUpdate_r10_add_ext()
				{
				    return componentIsPresent(1);
				}
				
				public void deleteActiveSetUpdate_r10_add_ext()
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
					    "ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R10$NonCriticalExtensions"
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
					"ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R10"
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
							    "ActiveSetUpdate_r10_IEs"
							),
							new QName (
							    "PDU-definitions",
							    "ActiveSetUpdate-r10-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.pdu_definitions",
								"ActiveSetUpdate_r10_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.pdu_definitions",
								"ActiveSetUpdate_r10_IEs"
							    )
							),
							0
						    )
						),
						"activeSetUpdate-r10",
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
						"activeSetUpdate-r10-add-ext",
						1,
						3,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.pdu_definitions",
							"ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R10$NonCriticalExtensions"
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
			     * @see Sequence
			     */
			    public static class CriticalExtensions5 extends Sequence {
				
				/**
				 * The default constructor.
				 */
				public CriticalExtensions5()
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
					"ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5"
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
				    case r10_chosen:
					return new R10();
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
				    "ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4"
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
						    "ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R10"
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
						    "ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5"
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
				case r9_chosen:
				    return new R9();
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
				"ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3"
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
						"ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R9"
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
						"ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4"
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
			    case r8_chosen:
				return new R8();
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
			    "ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2"
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
					    "ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R8"
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
					    "ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3"
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
			case r7_chosen:
			    return new R7();
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
			"ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1"
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
					"ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$R7"
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
					"ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2"
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
		    "ActiveSetUpdate$Later_than_r3$CriticalExtensions"
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
				    "ActiveSetUpdate$Later_than_r3$CriticalExtensions$R6"
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
				    "ActiveSetUpdate$Later_than_r3$CriticalExtensions$CriticalExtensions1"
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
		"ActiveSetUpdate$Later_than_r3"
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
				"ActiveSetUpdate$Later_than_r3$CriticalExtensions"
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
	    "ActiveSetUpdate"
	),
	new QName (
	    "PDU-definitions",
	    "ActiveSetUpdate"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "ActiveSetUpdate$R3"
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
			    "ActiveSetUpdate$Later_than_r3"
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
     * Get the type descriptor (TypeInfo) of 'this' ActiveSetUpdate object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ActiveSetUpdate object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ActiveSetUpdate
