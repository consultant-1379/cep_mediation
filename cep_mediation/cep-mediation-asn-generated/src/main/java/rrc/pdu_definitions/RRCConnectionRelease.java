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
 * Define the ASN1 Type RRCConnectionRelease from ASN1 Module PDU_definitions.
 * @see Choice
 */

public class RRCConnectionRelease extends Choice {
    
    /**
     * The default constructor.
     */
    public RRCConnectionRelease()
    {
    }
    
    public static final  int  r3_chosen = 1;
    public static final  int  later_than_r3_chosen = 2;
    
    // Methods for field "r3"
    public static RRCConnectionRelease createRRCConnectionReleaseWithR3(R3 r3)
    {
	RRCConnectionRelease __object = new RRCConnectionRelease();

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
	public R3(RRCConnectionRelease_r3_IEs rrcConnectionRelease_r3, 
			LaterNCEs laterNCEs)
	{
	    setRrcConnectionRelease_r3(rrcConnectionRelease_r3);
	    setLaterNCEs(laterNCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public R3(RRCConnectionRelease_r3_IEs rrcConnectionRelease_r3)
	{
	    setRrcConnectionRelease_r3(rrcConnectionRelease_r3);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new RRCConnectionRelease_r3_IEs();
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
		    return new RRCConnectionRelease_r3_IEs();
		case 1:
		    return new LaterNCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "rrcConnectionRelease_r3"
	public RRCConnectionRelease_r3_IEs getRrcConnectionRelease_r3()
	{
	    return (RRCConnectionRelease_r3_IEs)mComponents[0];
	}
	
	public void setRrcConnectionRelease_r3(RRCConnectionRelease_r3_IEs rrcConnectionRelease_r3)
	{
	    mComponents[0] = rrcConnectionRelease_r3;
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
	    public LaterNCEs(BitString rrcConnectionRelease_r3_add_ext, 
			    V690NCEs v690NCEs)
	    {
		setRrcConnectionRelease_r3_add_ext(rrcConnectionRelease_r3_add_ext);
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
	    
	    
	    // Methods for field "rrcConnectionRelease_r3_add_ext"
	    public BitString getRrcConnectionRelease_r3_add_ext()
	    {
		return (BitString)mComponents[0];
	    }
	    
	    public void setRrcConnectionRelease_r3_add_ext(BitString rrcConnectionRelease_r3_add_ext)
	    {
		mComponents[0] = rrcConnectionRelease_r3_add_ext;
	    }
	    
	    public boolean hasRrcConnectionRelease_r3_add_ext()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteRrcConnectionRelease_r3_add_ext()
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
		public V690NCEs(RRCConnectionRelease_v690ext_IEs rrcConnectionRelease_v690ext, 
				V770NCEs v770NCEs)
		{
		    setRrcConnectionRelease_v690ext(rrcConnectionRelease_v690ext);
		    setV770NCEs(v770NCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public V690NCEs(RRCConnectionRelease_v690ext_IEs rrcConnectionRelease_v690ext)
		{
		    setRrcConnectionRelease_v690ext(rrcConnectionRelease_v690ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new RRCConnectionRelease_v690ext_IEs();
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
			    return new RRCConnectionRelease_v690ext_IEs();
			case 1:
			    return new V770NCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "rrcConnectionRelease_v690ext"
		public RRCConnectionRelease_v690ext_IEs getRrcConnectionRelease_v690ext()
		{
		    return (RRCConnectionRelease_v690ext_IEs)mComponents[0];
		}
		
		public void setRrcConnectionRelease_v690ext(RRCConnectionRelease_v690ext_IEs rrcConnectionRelease_v690ext)
		{
		    mComponents[0] = rrcConnectionRelease_v690ext;
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
		    public V770NCEs(RRCConnectionRelease_v770ext_IEs rrcConnectionRelease_v770ext, 
				    V860NCEs v860NCEs)
		    {
			setRrcConnectionRelease_v770ext(rrcConnectionRelease_v770ext);
			setV860NCEs(v860NCEs);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public V770NCEs(RRCConnectionRelease_v770ext_IEs rrcConnectionRelease_v770ext)
		    {
			setRrcConnectionRelease_v770ext(rrcConnectionRelease_v770ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new RRCConnectionRelease_v770ext_IEs();
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
				return new RRCConnectionRelease_v770ext_IEs();
			    case 1:
				return new V860NCEs();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "rrcConnectionRelease_v770ext"
		    public RRCConnectionRelease_v770ext_IEs getRrcConnectionRelease_v770ext()
		    {
			return (RRCConnectionRelease_v770ext_IEs)mComponents[0];
		    }
		    
		    public void setRrcConnectionRelease_v770ext(RRCConnectionRelease_v770ext_IEs rrcConnectionRelease_v770ext)
		    {
			mComponents[0] = rrcConnectionRelease_v770ext;
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
			public V860NCEs(RRCConnectionRelease_v860ext_IEs rrcConnectionRelease_v860ext, 
					Va40NCEs va40NCEs)
			{
			    setRrcConnectionRelease_v860ext(rrcConnectionRelease_v860ext);
			    setVa40NCEs(va40NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public V860NCEs(RRCConnectionRelease_v860ext_IEs rrcConnectionRelease_v860ext)
			{
			    setRrcConnectionRelease_v860ext(rrcConnectionRelease_v860ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new RRCConnectionRelease_v860ext_IEs();
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
				    return new RRCConnectionRelease_v860ext_IEs();
				case 1:
				    return new Va40NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "rrcConnectionRelease_v860ext"
			public RRCConnectionRelease_v860ext_IEs getRrcConnectionRelease_v860ext()
			{
			    return (RRCConnectionRelease_v860ext_IEs)mComponents[0];
			}
			
			public void setRrcConnectionRelease_v860ext(RRCConnectionRelease_v860ext_IEs rrcConnectionRelease_v860ext)
			{
			    mComponents[0] = rrcConnectionRelease_v860ext;
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
			    public Va40NCEs(RRCConnectionRelease_va40ext_IEs rrcConnectionRelease_va40ext, 
					    NonCriticalExtensions nonCriticalExtensions)
			    {
				setRrcConnectionRelease_va40ext(rrcConnectionRelease_va40ext);
				setNonCriticalExtensions(nonCriticalExtensions);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public Va40NCEs(RRCConnectionRelease_va40ext_IEs rrcConnectionRelease_va40ext)
			    {
				setRrcConnectionRelease_va40ext(rrcConnectionRelease_va40ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new RRCConnectionRelease_va40ext_IEs();
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
					return new RRCConnectionRelease_va40ext_IEs();
				    case 1:
					return new NonCriticalExtensions();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "rrcConnectionRelease_va40ext"
			    public RRCConnectionRelease_va40ext_IEs getRrcConnectionRelease_va40ext()
			    {
				return (RRCConnectionRelease_va40ext_IEs)mComponents[0];
			    }
			    
			    public void setRrcConnectionRelease_va40ext(RRCConnectionRelease_va40ext_IEs rrcConnectionRelease_va40ext)
			    {
				mComponents[0] = rrcConnectionRelease_va40ext;
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
					"RRCConnectionRelease$R3$LaterNCEs$V690NCEs$V770NCEs$V860NCEs$Va40NCEs$NonCriticalExtensions"
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
				    "RRCConnectionRelease$R3$LaterNCEs$V690NCEs$V770NCEs$V860NCEs$Va40NCEs"
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
							"RRCConnectionRelease_va40ext_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"RRCConnectionRelease-va40ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "RRCConnectionRelease_va40ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "RRCConnectionRelease_va40ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "rrcConnectionRelease-va40ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "RRCConnectionRelease$R3$LaterNCEs$V690NCEs$V770NCEs$V860NCEs$Va40NCEs$NonCriticalExtensions"
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
				"RRCConnectionRelease$R3$LaterNCEs$V690NCEs$V770NCEs$V860NCEs"
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
						    "RRCConnectionRelease_v860ext_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "RRCConnectionRelease-v860ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"RRCConnectionRelease_v860ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"RRCConnectionRelease_v860ext_IEs"
						    )
						),
						0
					    )
					),
					"rrcConnectionRelease-v860ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"RRCConnectionRelease$R3$LaterNCEs$V690NCEs$V770NCEs$V860NCEs$Va40NCEs"
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
			    "RRCConnectionRelease$R3$LaterNCEs$V690NCEs$V770NCEs"
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
						"RRCConnectionRelease_v770ext_IEs"
					    ),
					    new QName (
						"PDU-definitions",
						"RRCConnectionRelease-v770ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.pdu_definitions",
						    "RRCConnectionRelease_v770ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.pdu_definitions",
						    "RRCConnectionRelease_v770ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "rrcConnectionRelease-v770ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "RRCConnectionRelease$R3$LaterNCEs$V690NCEs$V770NCEs$V860NCEs"
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
			"RRCConnectionRelease$R3$LaterNCEs$V690NCEs"
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
					    "RRCConnectionRelease_v690ext_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "RRCConnectionRelease-v690ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"RRCConnectionRelease_v690ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"RRCConnectionRelease_v690ext_IEs"
					    )
					),
					0
				    )
				),
				"rrcConnectionRelease-v690ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"RRCConnectionRelease$R3$LaterNCEs$V690NCEs$V770NCEs"
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
		    "RRCConnectionRelease$R3$LaterNCEs"
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
			    "rrcConnectionRelease-r3-add-ext",
			    0,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RRCConnectionRelease$R3$LaterNCEs$V690NCEs"
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
		"RRCConnectionRelease$R3"
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
				    "RRCConnectionRelease_r3_IEs"
				),
				new QName (
				    "PDU-definitions",
				    "RRCConnectionRelease-r3-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"RRCConnectionRelease_r3_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"RRCConnectionRelease_r3_IEs"
				    )
				),
				0
			    )
			),
			"rrcConnectionRelease-r3",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"RRCConnectionRelease$R3$LaterNCEs"
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
    public static RRCConnectionRelease createRRCConnectionReleaseWithLater_than_r3(Later_than_r3 later_than_r3)
    {
	RRCConnectionRelease __object = new RRCConnectionRelease();

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
		public R4(RRCConnectionRelease_r4_IEs rrcConnectionRelease_r4, 
				V4d0NCEs v4d0NCEs)
		{
		    setRrcConnectionRelease_r4(rrcConnectionRelease_r4);
		    setV4d0NCEs(v4d0NCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public R4(RRCConnectionRelease_r4_IEs rrcConnectionRelease_r4)
		{
		    setRrcConnectionRelease_r4(rrcConnectionRelease_r4);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new RRCConnectionRelease_r4_IEs();
		    mComponents[1] = new V4d0NCEs();
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
			    return new RRCConnectionRelease_r4_IEs();
			case 1:
			    return new V4d0NCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "rrcConnectionRelease_r4"
		public RRCConnectionRelease_r4_IEs getRrcConnectionRelease_r4()
		{
		    return (RRCConnectionRelease_r4_IEs)mComponents[0];
		}
		
		public void setRrcConnectionRelease_r4(RRCConnectionRelease_r4_IEs rrcConnectionRelease_r4)
		{
		    mComponents[0] = rrcConnectionRelease_r4;
		}
		
		
		// Methods for field "v4d0NCEs"
		public V4d0NCEs getV4d0NCEs()
		{
		    return (V4d0NCEs)mComponents[1];
		}
		
		public void setV4d0NCEs(V4d0NCEs v4d0NCEs)
		{
		    mComponents[1] = v4d0NCEs;
		}
		
		public boolean hasV4d0NCEs()
		{
		    return componentIsPresent(1);
		}
		
		public void deleteV4d0NCEs()
		{
		    setComponentAbsent(1);
		}
		
		
		
		/**
		 * Define the ASN1 Type V4d0NCEs from ASN1 Module PDU_definitions.
		 * @see Sequence
		 */
		public static class V4d0NCEs extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public V4d0NCEs()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public V4d0NCEs(BitString rrcConnectionRelease_r4_add_ext, 
				    V690NCEs v690NCEs)
		    {
			setRrcConnectionRelease_r4_add_ext(rrcConnectionRelease_r4_add_ext);
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
		    
		    
		    // Methods for field "rrcConnectionRelease_r4_add_ext"
		    public BitString getRrcConnectionRelease_r4_add_ext()
		    {
			return (BitString)mComponents[0];
		    }
		    
		    public void setRrcConnectionRelease_r4_add_ext(BitString rrcConnectionRelease_r4_add_ext)
		    {
			mComponents[0] = rrcConnectionRelease_r4_add_ext;
		    }
		    
		    public boolean hasRrcConnectionRelease_r4_add_ext()
		    {
			return componentIsPresent(0);
		    }
		    
		    public void deleteRrcConnectionRelease_r4_add_ext()
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
			public V690NCEs(RRCConnectionRelease_v690ext_IEs rrcConnectionRelease_v690ext, 
					V770NCEs v770NCEs)
			{
			    setRrcConnectionRelease_v690ext(rrcConnectionRelease_v690ext);
			    setV770NCEs(v770NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public V690NCEs(RRCConnectionRelease_v690ext_IEs rrcConnectionRelease_v690ext)
			{
			    setRrcConnectionRelease_v690ext(rrcConnectionRelease_v690ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new RRCConnectionRelease_v690ext_IEs();
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
				    return new RRCConnectionRelease_v690ext_IEs();
				case 1:
				    return new V770NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "rrcConnectionRelease_v690ext"
			public RRCConnectionRelease_v690ext_IEs getRrcConnectionRelease_v690ext()
			{
			    return (RRCConnectionRelease_v690ext_IEs)mComponents[0];
			}
			
			public void setRrcConnectionRelease_v690ext(RRCConnectionRelease_v690ext_IEs rrcConnectionRelease_v690ext)
			{
			    mComponents[0] = rrcConnectionRelease_v690ext;
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
			    public V770NCEs(RRCConnectionRelease_v770ext_IEs rrcConnectionRelease_v770ext, 
					    V860NCEs v860NCEs)
			    {
				setRrcConnectionRelease_v770ext(rrcConnectionRelease_v770ext);
				setV860NCEs(v860NCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V770NCEs(RRCConnectionRelease_v770ext_IEs rrcConnectionRelease_v770ext)
			    {
				setRrcConnectionRelease_v770ext(rrcConnectionRelease_v770ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new RRCConnectionRelease_v770ext_IEs();
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
					return new RRCConnectionRelease_v770ext_IEs();
				    case 1:
					return new V860NCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "rrcConnectionRelease_v770ext"
			    public RRCConnectionRelease_v770ext_IEs getRrcConnectionRelease_v770ext()
			    {
				return (RRCConnectionRelease_v770ext_IEs)mComponents[0];
			    }
			    
			    public void setRrcConnectionRelease_v770ext(RRCConnectionRelease_v770ext_IEs rrcConnectionRelease_v770ext)
			    {
				mComponents[0] = rrcConnectionRelease_v770ext;
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
				public V860NCEs(RRCConnectionRelease_v860ext_IEs rrcConnectionRelease_v860ext, 
						Va40NCEs va40NCEs)
				{
				    setRrcConnectionRelease_v860ext(rrcConnectionRelease_v860ext);
				    setVa40NCEs(va40NCEs);
				}
				
				/**
				 * Construct with required components.
				 */
				public V860NCEs(RRCConnectionRelease_v860ext_IEs rrcConnectionRelease_v860ext)
				{
				    setRrcConnectionRelease_v860ext(rrcConnectionRelease_v860ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new RRCConnectionRelease_v860ext_IEs();
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
					    return new RRCConnectionRelease_v860ext_IEs();
					case 1:
					    return new Va40NCEs();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "rrcConnectionRelease_v860ext"
				public RRCConnectionRelease_v860ext_IEs getRrcConnectionRelease_v860ext()
				{
				    return (RRCConnectionRelease_v860ext_IEs)mComponents[0];
				}
				
				public void setRrcConnectionRelease_v860ext(RRCConnectionRelease_v860ext_IEs rrcConnectionRelease_v860ext)
				{
				    mComponents[0] = rrcConnectionRelease_v860ext;
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
				    public Va40NCEs(RRCConnectionRelease_va40ext_IEs rrcConnectionRelease_va40ext, 
						    NonCriticalExtensions nonCriticalExtensions)
				    {
					setRrcConnectionRelease_va40ext(rrcConnectionRelease_va40ext);
					setNonCriticalExtensions(nonCriticalExtensions);
				    }
				    
				    /**
				     * Construct with required components.
				     */
				    public Va40NCEs(RRCConnectionRelease_va40ext_IEs rrcConnectionRelease_va40ext)
				    {
					setRrcConnectionRelease_va40ext(rrcConnectionRelease_va40ext);
				    }
				    
				    public void initComponents()
				    {
					mComponents[0] = new RRCConnectionRelease_va40ext_IEs();
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
						return new RRCConnectionRelease_va40ext_IEs();
					    case 1:
						return new NonCriticalExtensions();
					    default:
						throw new InternalError("AbstractCollection.createInstance()");
					}
					
				    }
				    
				    
				    // Methods for field "rrcConnectionRelease_va40ext"
				    public RRCConnectionRelease_va40ext_IEs getRrcConnectionRelease_va40ext()
				    {
					return (RRCConnectionRelease_va40ext_IEs)mComponents[0];
				    }
				    
				    public void setRrcConnectionRelease_va40ext(RRCConnectionRelease_va40ext_IEs rrcConnectionRelease_va40ext)
				    {
					mComponents[0] = rrcConnectionRelease_va40ext;
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
						"RRCConnectionRelease$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V690NCEs$V770NCEs$V860NCEs$Va40NCEs$NonCriticalExtensions"
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
					    "RRCConnectionRelease$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V690NCEs$V770NCEs$V860NCEs$Va40NCEs"
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
								"RRCConnectionRelease_va40ext_IEs"
							    ),
							    new QName (
								"PDU-definitions",
								"RRCConnectionRelease-va40ext-IEs"
							    ),
							    12314,
							    null,
							    new FieldsRef (
								new QName (
								    "rrc.pdu_definitions",
								    "RRCConnectionRelease_va40ext_IEs"
								)
							    ),
							    0,
							    new TagDecodersRef (
								new QName (
								    "rrc.pdu_definitions",
								    "RRCConnectionRelease_va40ext_IEs"
								)
							    ),
							    0
							)
						    ),
						    "rrcConnectionRelease-va40ext",
						    0,
						    2,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.pdu_definitions",
							    "RRCConnectionRelease$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V690NCEs$V770NCEs$V860NCEs$Va40NCEs$NonCriticalExtensions"
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
					"RRCConnectionRelease$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V690NCEs$V770NCEs$V860NCEs"
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
							    "RRCConnectionRelease_v860ext_IEs"
							),
							new QName (
							    "PDU-definitions",
							    "RRCConnectionRelease-v860ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.pdu_definitions",
								"RRCConnectionRelease_v860ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.pdu_definitions",
								"RRCConnectionRelease_v860ext_IEs"
							    )
							),
							0
						    )
						),
						"rrcConnectionRelease-v860ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.pdu_definitions",
							"RRCConnectionRelease$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V690NCEs$V770NCEs$V860NCEs$Va40NCEs"
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
				    "RRCConnectionRelease$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V690NCEs$V770NCEs"
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
							"RRCConnectionRelease_v770ext_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"RRCConnectionRelease-v770ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "RRCConnectionRelease_v770ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "RRCConnectionRelease_v770ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "rrcConnectionRelease-v770ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "RRCConnectionRelease$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V690NCEs$V770NCEs$V860NCEs"
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
				"RRCConnectionRelease$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V690NCEs"
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
						    "RRCConnectionRelease_v690ext_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "RRCConnectionRelease-v690ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"RRCConnectionRelease_v690ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"RRCConnectionRelease_v690ext_IEs"
						    )
						),
						0
					    )
					),
					"rrcConnectionRelease-v690ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"RRCConnectionRelease$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V690NCEs$V770NCEs"
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
			    "RRCConnectionRelease$Later_than_r3$CriticalExtensions$R4$V4d0NCEs"
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
				    "rrcConnectionRelease-r4-add-ext",
				    0,
				    3,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "RRCConnectionRelease$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V690NCEs"
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
		     * Get the type descriptor (TypeInfo) of 'this' V4d0NCEs object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' V4d0NCEs object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for V4d0NCEs

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
			"RRCConnectionRelease$Later_than_r3$CriticalExtensions$R4"
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
					    "RRCConnectionRelease_r4_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "RRCConnectionRelease-r4-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"RRCConnectionRelease_r4_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"RRCConnectionRelease_r4_IEs"
					    )
					),
					0
				    )
				),
				"rrcConnectionRelease-r4",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"RRCConnectionRelease$Later_than_r3$CriticalExtensions$R4$V4d0NCEs"
				    )
				),
				"v4d0NCEs",
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
			"RRCConnectionRelease$Later_than_r3$CriticalExtensions$CriticalExtensions1"
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
		    "RRCConnectionRelease$Later_than_r3$CriticalExtensions"
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
				    "RRCConnectionRelease$Later_than_r3$CriticalExtensions$R4"
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
				    "RRCConnectionRelease$Later_than_r3$CriticalExtensions$CriticalExtensions1"
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
		"RRCConnectionRelease$Later_than_r3"
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
				"RRCConnectionRelease$Later_than_r3$CriticalExtensions"
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
	    "RRCConnectionRelease"
	),
	new QName (
	    "PDU-definitions",
	    "RRCConnectionRelease"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "RRCConnectionRelease$R3"
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
			    "RRCConnectionRelease$Later_than_r3"
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
     * Get the type descriptor (TypeInfo) of 'this' RRCConnectionRelease object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RRCConnectionRelease object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RRCConnectionRelease
