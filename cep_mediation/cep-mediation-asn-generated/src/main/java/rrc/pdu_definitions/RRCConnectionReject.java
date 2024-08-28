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
 * Define the ASN1 Type RRCConnectionReject from ASN1 Module PDU_definitions.
 * @see Choice
 */

public class RRCConnectionReject extends Choice {
    
    /**
     * The default constructor.
     */
    public RRCConnectionReject()
    {
    }
    
    public static final  int  r3_chosen = 1;
    public static final  int  later_than_r3_chosen = 2;
    
    // Methods for field "r3"
    public static RRCConnectionReject createRRCConnectionRejectWithR3(R3 r3)
    {
	RRCConnectionReject __object = new RRCConnectionReject();

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
	public R3(RRCConnectionReject_r3_IEs rrcConnectionReject_r3, 
			LaterNCEs laterNCEs)
	{
	    setRrcConnectionReject_r3(rrcConnectionReject_r3);
	    setLaterNCEs(laterNCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public R3(RRCConnectionReject_r3_IEs rrcConnectionReject_r3)
	{
	    setRrcConnectionReject_r3(rrcConnectionReject_r3);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new RRCConnectionReject_r3_IEs();
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
		    return new RRCConnectionReject_r3_IEs();
		case 1:
		    return new LaterNCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "rrcConnectionReject_r3"
	public RRCConnectionReject_r3_IEs getRrcConnectionReject_r3()
	{
	    return (RRCConnectionReject_r3_IEs)mComponents[0];
	}
	
	public void setRrcConnectionReject_r3(RRCConnectionReject_r3_IEs rrcConnectionReject_r3)
	{
	    mComponents[0] = rrcConnectionReject_r3;
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
	    public LaterNCEs(BitString rrcConnectionReject_r3_add_ext, 
			    V690NCEs v690NCEs)
	    {
		setRrcConnectionReject_r3_add_ext(rrcConnectionReject_r3_add_ext);
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
	    
	    
	    // Methods for field "rrcConnectionReject_r3_add_ext"
	    public BitString getRrcConnectionReject_r3_add_ext()
	    {
		return (BitString)mComponents[0];
	    }
	    
	    public void setRrcConnectionReject_r3_add_ext(BitString rrcConnectionReject_r3_add_ext)
	    {
		mComponents[0] = rrcConnectionReject_r3_add_ext;
	    }
	    
	    public boolean hasRrcConnectionReject_r3_add_ext()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteRrcConnectionReject_r3_add_ext()
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
		public V690NCEs(RRCConnectionReject_v690ext_IEs rrcConnectionReject_v690ext, 
				V6f0NCEs v6f0NCEs)
		{
		    setRrcConnectionReject_v690ext(rrcConnectionReject_v690ext);
		    setV6f0NCEs(v6f0NCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public V690NCEs(RRCConnectionReject_v690ext_IEs rrcConnectionReject_v690ext)
		{
		    setRrcConnectionReject_v690ext(rrcConnectionReject_v690ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new RRCConnectionReject_v690ext_IEs();
		    mComponents[1] = new V6f0NCEs();
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
			    return new RRCConnectionReject_v690ext_IEs();
			case 1:
			    return new V6f0NCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "rrcConnectionReject_v690ext"
		public RRCConnectionReject_v690ext_IEs getRrcConnectionReject_v690ext()
		{
		    return (RRCConnectionReject_v690ext_IEs)mComponents[0];
		}
		
		public void setRrcConnectionReject_v690ext(RRCConnectionReject_v690ext_IEs rrcConnectionReject_v690ext)
		{
		    mComponents[0] = rrcConnectionReject_v690ext;
		}
		
		
		// Methods for field "v6f0NCEs"
		public V6f0NCEs getV6f0NCEs()
		{
		    return (V6f0NCEs)mComponents[1];
		}
		
		public void setV6f0NCEs(V6f0NCEs v6f0NCEs)
		{
		    mComponents[1] = v6f0NCEs;
		}
		
		public boolean hasV6f0NCEs()
		{
		    return componentIsPresent(1);
		}
		
		public void deleteV6f0NCEs()
		{
		    setComponentAbsent(1);
		}
		
		
		
		/**
		 * Define the ASN1 Type V6f0NCEs from ASN1 Module PDU_definitions.
		 * @see Sequence
		 */
		public static class V6f0NCEs extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public V6f0NCEs()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public V6f0NCEs(RRCConnectionReject_v6f0ext_IEs rrcConnectionReject_v6f0ext, 
				    V860NCEs v860NCEs)
		    {
			setRrcConnectionReject_v6f0ext(rrcConnectionReject_v6f0ext);
			setV860NCEs(v860NCEs);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public V6f0NCEs(RRCConnectionReject_v6f0ext_IEs rrcConnectionReject_v6f0ext)
		    {
			setRrcConnectionReject_v6f0ext(rrcConnectionReject_v6f0ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new RRCConnectionReject_v6f0ext_IEs();
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
				return new RRCConnectionReject_v6f0ext_IEs();
			    case 1:
				return new V860NCEs();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "rrcConnectionReject_v6f0ext"
		    public RRCConnectionReject_v6f0ext_IEs getRrcConnectionReject_v6f0ext()
		    {
			return (RRCConnectionReject_v6f0ext_IEs)mComponents[0];
		    }
		    
		    public void setRrcConnectionReject_v6f0ext(RRCConnectionReject_v6f0ext_IEs rrcConnectionReject_v6f0ext)
		    {
			mComponents[0] = rrcConnectionReject_v6f0ext;
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
			public V860NCEs(RRCConnectionReject_v860ext_IEs rrcConnectionReject_v860ext, 
					Va40NCEs va40NCEs)
			{
			    setRrcConnectionReject_v860ext(rrcConnectionReject_v860ext);
			    setVa40NCEs(va40NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public V860NCEs(RRCConnectionReject_v860ext_IEs rrcConnectionReject_v860ext)
			{
			    setRrcConnectionReject_v860ext(rrcConnectionReject_v860ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new RRCConnectionReject_v860ext_IEs();
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
				    return new RRCConnectionReject_v860ext_IEs();
				case 1:
				    return new Va40NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "rrcConnectionReject_v860ext"
			public RRCConnectionReject_v860ext_IEs getRrcConnectionReject_v860ext()
			{
			    return (RRCConnectionReject_v860ext_IEs)mComponents[0];
			}
			
			public void setRrcConnectionReject_v860ext(RRCConnectionReject_v860ext_IEs rrcConnectionReject_v860ext)
			{
			    mComponents[0] = rrcConnectionReject_v860ext;
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
			    public Va40NCEs(RRCConnectionReject_va40ext_IEs rrcConnectionReject_va40ext, 
					    NonCriticalExtensions nonCriticalExtensions)
			    {
				setRrcConnectionReject_va40ext(rrcConnectionReject_va40ext);
				setNonCriticalExtensions(nonCriticalExtensions);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public Va40NCEs(RRCConnectionReject_va40ext_IEs rrcConnectionReject_va40ext)
			    {
				setRrcConnectionReject_va40ext(rrcConnectionReject_va40ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new RRCConnectionReject_va40ext_IEs();
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
					return new RRCConnectionReject_va40ext_IEs();
				    case 1:
					return new NonCriticalExtensions();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "rrcConnectionReject_va40ext"
			    public RRCConnectionReject_va40ext_IEs getRrcConnectionReject_va40ext()
			    {
				return (RRCConnectionReject_va40ext_IEs)mComponents[0];
			    }
			    
			    public void setRrcConnectionReject_va40ext(RRCConnectionReject_va40ext_IEs rrcConnectionReject_va40ext)
			    {
				mComponents[0] = rrcConnectionReject_va40ext;
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
					"RRCConnectionReject$R3$LaterNCEs$V690NCEs$V6f0NCEs$V860NCEs$Va40NCEs$NonCriticalExtensions"
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
				    "RRCConnectionReject$R3$LaterNCEs$V690NCEs$V6f0NCEs$V860NCEs$Va40NCEs"
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
							"RRCConnectionReject_va40ext_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"RRCConnectionReject-va40ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "RRCConnectionReject_va40ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "RRCConnectionReject_va40ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "rrcConnectionReject-va40ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "RRCConnectionReject$R3$LaterNCEs$V690NCEs$V6f0NCEs$V860NCEs$Va40NCEs$NonCriticalExtensions"
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
				"RRCConnectionReject$R3$LaterNCEs$V690NCEs$V6f0NCEs$V860NCEs"
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
						    "RRCConnectionReject_v860ext_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "RRCConnectionReject-v860ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"RRCConnectionReject_v860ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"RRCConnectionReject_v860ext_IEs"
						    )
						),
						0
					    )
					),
					"rrcConnectionReject-v860ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"RRCConnectionReject$R3$LaterNCEs$V690NCEs$V6f0NCEs$V860NCEs$Va40NCEs"
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
			    "RRCConnectionReject$R3$LaterNCEs$V690NCEs$V6f0NCEs"
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
						"RRCConnectionReject_v6f0ext_IEs"
					    ),
					    new QName (
						"PDU-definitions",
						"RRCConnectionReject-v6f0ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.pdu_definitions",
						    "RRCConnectionReject_v6f0ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.pdu_definitions",
						    "RRCConnectionReject_v6f0ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "rrcConnectionReject-v6f0ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "RRCConnectionReject$R3$LaterNCEs$V690NCEs$V6f0NCEs$V860NCEs"
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
		     * Get the type descriptor (TypeInfo) of 'this' V6f0NCEs object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' V6f0NCEs object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for V6f0NCEs

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
			"RRCConnectionReject$R3$LaterNCEs$V690NCEs"
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
					    "RRCConnectionReject_v690ext_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "RRCConnectionReject-v690ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"RRCConnectionReject_v690ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"RRCConnectionReject_v690ext_IEs"
					    )
					),
					0
				    )
				),
				"rrcConnectionReject-v690ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"RRCConnectionReject$R3$LaterNCEs$V690NCEs$V6f0NCEs"
				    )
				),
				"v6f0NCEs",
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
		    "RRCConnectionReject$R3$LaterNCEs"
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
			    "rrcConnectionReject-r3-add-ext",
			    0,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RRCConnectionReject$R3$LaterNCEs$V690NCEs"
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
		"RRCConnectionReject$R3"
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
				    "RRCConnectionReject_r3_IEs"
				),
				new QName (
				    "PDU-definitions",
				    "RRCConnectionReject-r3-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"RRCConnectionReject_r3_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"RRCConnectionReject_r3_IEs"
				    )
				),
				0
			    )
			),
			"rrcConnectionReject-r3",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"RRCConnectionReject$R3$LaterNCEs"
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
    public static RRCConnectionReject createRRCConnectionRejectWithLater_than_r3(Later_than_r3 later_than_r3)
    {
	RRCConnectionReject __object = new RRCConnectionReject();

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
	public Later_than_r3(rrc.informationelements.InitialUE_Identity initialUE_Identity, 
			rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
			CriticalExtensions criticalExtensions)
	{
	    setInitialUE_Identity(initialUE_Identity);
	    setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	    setCriticalExtensions(criticalExtensions);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new rrc.informationelements.InitialUE_Identity();
	    mComponents[1] = new rrc.informationelements.RRC_TransactionIdentifier();
	    mComponents[2] = new CriticalExtensions();
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
		    return new rrc.informationelements.InitialUE_Identity();
		case 1:
		    return new rrc.informationelements.RRC_TransactionIdentifier();
		case 2:
		    return new CriticalExtensions();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "initialUE_Identity"
	public rrc.informationelements.InitialUE_Identity getInitialUE_Identity()
	{
	    return (rrc.informationelements.InitialUE_Identity)mComponents[0];
	}
	
	public void setInitialUE_Identity(rrc.informationelements.InitialUE_Identity initialUE_Identity)
	{
	    mComponents[0] = initialUE_Identity;
	}
	
	
	// Methods for field "rrc_TransactionIdentifier"
	public rrc.informationelements.RRC_TransactionIdentifier getRrc_TransactionIdentifier()
	{
	    return (rrc.informationelements.RRC_TransactionIdentifier)mComponents[1];
	}
	
	public void setRrc_TransactionIdentifier(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier)
	{
	    mComponents[1] = rrc_TransactionIdentifier;
	}
	
	
	// Methods for field "criticalExtensions"
	public CriticalExtensions getCriticalExtensions()
	{
	    return (CriticalExtensions)mComponents[2];
	}
	
	public void setCriticalExtensions(CriticalExtensions criticalExtensions)
	{
	    mComponents[2] = criticalExtensions;
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
			(short)0x8002
		    }
		),
		new QName (
		    "rrc.pdu_definitions",
		    "RRCConnectionReject$Later_than_r3$CriticalExtensions"
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
		"RRCConnectionReject$Later_than_r3"
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
			    new ChoiceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "InitialUE_Identity"
				),
				new QName (
				    "InformationElements",
				    "InitialUE-Identity"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"InitialUE_Identity"
				    )
				),
				0,
				new TagDecoder (
				    new TagDecoderElement[] {
					new TagDecoderElement((short)0x8000, 0),
					new TagDecoderElement((short)0x8001, 1),
					new TagDecoderElement((short)0x8002, 2),
					new TagDecoderElement((short)0x8003, 3),
					new TagDecoderElement((short)0x8004, 4),
					new TagDecoderElement((short)0x8005, 5),
					new TagDecoderElement((short)0x8006, 6),
					new TagDecoderElement((short)0x8007, 7)
				    }
				)
			    )
			),
			"initialUE-Identity",
			0,
			2,
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
			1,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"RRCConnectionReject$Later_than_r3$CriticalExtensions"
			    )
			),
			"criticalExtensions",
			2,
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
	    "RRCConnectionReject"
	),
	new QName (
	    "PDU-definitions",
	    "RRCConnectionReject"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "RRCConnectionReject$R3"
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
			    "RRCConnectionReject$Later_than_r3"
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
     * Get the type descriptor (TypeInfo) of 'this' RRCConnectionReject object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RRCConnectionReject object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RRCConnectionReject
