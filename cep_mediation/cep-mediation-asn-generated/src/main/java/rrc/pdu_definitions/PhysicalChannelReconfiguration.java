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
 * Define the ASN1 Type PhysicalChannelReconfiguration from ASN1 Module PDU_definitions.
 * @see Choice
 */

public class PhysicalChannelReconfiguration extends Choice {
    
    /**
     * The default constructor.
     */
    public PhysicalChannelReconfiguration()
    {
    }
    
    public static final  int  r3_chosen = 1;
    public static final  int  later_than_r3_chosen = 2;
    
    // Methods for field "r3"
    public static PhysicalChannelReconfiguration createPhysicalChannelReconfigurationWithR3(R3 r3)
    {
	PhysicalChannelReconfiguration __object = new PhysicalChannelReconfiguration();

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
	public R3(PhysicalChannelReconfiguration_r3_IEs physicalChannelReconfiguration_r3, 
			V3a0NCEs v3a0NCEs)
	{
	    setPhysicalChannelReconfiguration_r3(physicalChannelReconfiguration_r3);
	    setV3a0NCEs(v3a0NCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public R3(PhysicalChannelReconfiguration_r3_IEs physicalChannelReconfiguration_r3)
	{
	    setPhysicalChannelReconfiguration_r3(physicalChannelReconfiguration_r3);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new PhysicalChannelReconfiguration_r3_IEs();
	    mComponents[1] = new V3a0NCEs();
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
		    return new PhysicalChannelReconfiguration_r3_IEs();
		case 1:
		    return new V3a0NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "physicalChannelReconfiguration_r3"
	public PhysicalChannelReconfiguration_r3_IEs getPhysicalChannelReconfiguration_r3()
	{
	    return (PhysicalChannelReconfiguration_r3_IEs)mComponents[0];
	}
	
	public void setPhysicalChannelReconfiguration_r3(PhysicalChannelReconfiguration_r3_IEs physicalChannelReconfiguration_r3)
	{
	    mComponents[0] = physicalChannelReconfiguration_r3;
	}
	
	
	// Methods for field "v3a0NCEs"
	public V3a0NCEs getV3a0NCEs()
	{
	    return (V3a0NCEs)mComponents[1];
	}
	
	public void setV3a0NCEs(V3a0NCEs v3a0NCEs)
	{
	    mComponents[1] = v3a0NCEs;
	}
	
	public boolean hasV3a0NCEs()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteV3a0NCEs()
	{
	    setComponentAbsent(1);
	}
	
	
	
	/**
	 * Define the ASN1 Type V3a0NCEs from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class V3a0NCEs extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public V3a0NCEs()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public V3a0NCEs(PhysicalChannelReconfiguration_v3a0ext physicalChannelReconfiguration_v3a0ext, 
			    LaterNCEs laterNCEs)
	    {
		setPhysicalChannelReconfiguration_v3a0ext(physicalChannelReconfiguration_v3a0ext);
		setLaterNCEs(laterNCEs);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V3a0NCEs(PhysicalChannelReconfiguration_v3a0ext physicalChannelReconfiguration_v3a0ext)
	    {
		setPhysicalChannelReconfiguration_v3a0ext(physicalChannelReconfiguration_v3a0ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new PhysicalChannelReconfiguration_v3a0ext();
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
			return new PhysicalChannelReconfiguration_v3a0ext();
		    case 1:
			return new LaterNCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "physicalChannelReconfiguration_v3a0ext"
	    public PhysicalChannelReconfiguration_v3a0ext getPhysicalChannelReconfiguration_v3a0ext()
	    {
		return (PhysicalChannelReconfiguration_v3a0ext)mComponents[0];
	    }
	    
	    public void setPhysicalChannelReconfiguration_v3a0ext(PhysicalChannelReconfiguration_v3a0ext physicalChannelReconfiguration_v3a0ext)
	    {
		mComponents[0] = physicalChannelReconfiguration_v3a0ext;
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
		public LaterNCEs(BitString physicalChannelReconfiguration_r3_add_ext, 
				V4b0NonCriticalExtenstions v4b0NonCriticalExtenstions)
		{
		    setPhysicalChannelReconfiguration_r3_add_ext(physicalChannelReconfiguration_r3_add_ext);
		    setV4b0NonCriticalExtenstions(v4b0NonCriticalExtenstions);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new BitString();
		    mComponents[1] = new V4b0NonCriticalExtenstions();
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
			    return new V4b0NonCriticalExtenstions();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "physicalChannelReconfiguration_r3_add_ext"
		public BitString getPhysicalChannelReconfiguration_r3_add_ext()
		{
		    return (BitString)mComponents[0];
		}
		
		public void setPhysicalChannelReconfiguration_r3_add_ext(BitString physicalChannelReconfiguration_r3_add_ext)
		{
		    mComponents[0] = physicalChannelReconfiguration_r3_add_ext;
		}
		
		public boolean hasPhysicalChannelReconfiguration_r3_add_ext()
		{
		    return componentIsPresent(0);
		}
		
		public void deletePhysicalChannelReconfiguration_r3_add_ext()
		{
		    setComponentAbsent(0);
		}
		
		
		// Methods for field "v4b0NonCriticalExtenstions"
		public V4b0NonCriticalExtenstions getV4b0NonCriticalExtenstions()
		{
		    return (V4b0NonCriticalExtenstions)mComponents[1];
		}
		
		public void setV4b0NonCriticalExtenstions(V4b0NonCriticalExtenstions v4b0NonCriticalExtenstions)
		{
		    mComponents[1] = v4b0NonCriticalExtenstions;
		}
		
		public boolean hasV4b0NonCriticalExtenstions()
		{
		    return componentIsPresent(1);
		}
		
		public void deleteV4b0NonCriticalExtenstions()
		{
		    setComponentAbsent(1);
		}
		
		
		
		/**
		 * Define the ASN1 Type V4b0NonCriticalExtenstions from ASN1 Module PDU_definitions.
		 * @see Sequence
		 */
		public static class V4b0NonCriticalExtenstions extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public V4b0NonCriticalExtenstions()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public V4b0NonCriticalExtenstions(PhysicalChannelReconfiguration_v4b0ext_IEs physicalChannelReconfiguration_v4b0ext, 
				    V590NonCriticalExtenstions v590NonCriticalExtenstions)
		    {
			setPhysicalChannelReconfiguration_v4b0ext(physicalChannelReconfiguration_v4b0ext);
			setV590NonCriticalExtenstions(v590NonCriticalExtenstions);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public V4b0NonCriticalExtenstions(PhysicalChannelReconfiguration_v4b0ext_IEs physicalChannelReconfiguration_v4b0ext)
		    {
			setPhysicalChannelReconfiguration_v4b0ext(physicalChannelReconfiguration_v4b0ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new PhysicalChannelReconfiguration_v4b0ext_IEs();
			mComponents[1] = new V590NonCriticalExtenstions();
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
				return new PhysicalChannelReconfiguration_v4b0ext_IEs();
			    case 1:
				return new V590NonCriticalExtenstions();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "physicalChannelReconfiguration_v4b0ext"
		    public PhysicalChannelReconfiguration_v4b0ext_IEs getPhysicalChannelReconfiguration_v4b0ext()
		    {
			return (PhysicalChannelReconfiguration_v4b0ext_IEs)mComponents[0];
		    }
		    
		    public void setPhysicalChannelReconfiguration_v4b0ext(PhysicalChannelReconfiguration_v4b0ext_IEs physicalChannelReconfiguration_v4b0ext)
		    {
			mComponents[0] = physicalChannelReconfiguration_v4b0ext;
		    }
		    
		    
		    // Methods for field "v590NonCriticalExtenstions"
		    public V590NonCriticalExtenstions getV590NonCriticalExtenstions()
		    {
			return (V590NonCriticalExtenstions)mComponents[1];
		    }
		    
		    public void setV590NonCriticalExtenstions(V590NonCriticalExtenstions v590NonCriticalExtenstions)
		    {
			mComponents[1] = v590NonCriticalExtenstions;
		    }
		    
		    public boolean hasV590NonCriticalExtenstions()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteV590NonCriticalExtenstions()
		    {
			setComponentAbsent(1);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type V590NonCriticalExtenstions from ASN1 Module PDU_definitions.
		     * @see Sequence
		     */
		    public static class V590NonCriticalExtenstions extends Sequence {
			
			/**
			 * The default constructor.
			 */
			public V590NonCriticalExtenstions()
			{
			}
			
			/**
			 * Construct with AbstractData components.
			 */
			public V590NonCriticalExtenstions(PhysicalChannelReconfiguration_v590ext_IEs physicalChannelReconfiguration_v590ext, 
					V690NCEs v690NCEs)
			{
			    setPhysicalChannelReconfiguration_v590ext(physicalChannelReconfiguration_v590ext);
			    setV690NCEs(v690NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public V590NonCriticalExtenstions(PhysicalChannelReconfiguration_v590ext_IEs physicalChannelReconfiguration_v590ext)
			{
			    setPhysicalChannelReconfiguration_v590ext(physicalChannelReconfiguration_v590ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new PhysicalChannelReconfiguration_v590ext_IEs();
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
				    return new PhysicalChannelReconfiguration_v590ext_IEs();
				case 1:
				    return new V690NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "physicalChannelReconfiguration_v590ext"
			public PhysicalChannelReconfiguration_v590ext_IEs getPhysicalChannelReconfiguration_v590ext()
			{
			    return (PhysicalChannelReconfiguration_v590ext_IEs)mComponents[0];
			}
			
			public void setPhysicalChannelReconfiguration_v590ext(PhysicalChannelReconfiguration_v590ext_IEs physicalChannelReconfiguration_v590ext)
			{
			    mComponents[0] = physicalChannelReconfiguration_v590ext;
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
			    public V690NCEs(PhysicalChannelReconfiguration_v690ext_IEs physicalChannelReconfiguration_v690ext, 
					    V770NCEs v770NCEs)
			    {
				setPhysicalChannelReconfiguration_v690ext(physicalChannelReconfiguration_v690ext);
				setV770NCEs(v770NCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V690NCEs(PhysicalChannelReconfiguration_v690ext_IEs physicalChannelReconfiguration_v690ext)
			    {
				setPhysicalChannelReconfiguration_v690ext(physicalChannelReconfiguration_v690ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new PhysicalChannelReconfiguration_v690ext_IEs();
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
					return new PhysicalChannelReconfiguration_v690ext_IEs();
				    case 1:
					return new V770NCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "physicalChannelReconfiguration_v690ext"
			    public PhysicalChannelReconfiguration_v690ext_IEs getPhysicalChannelReconfiguration_v690ext()
			    {
				return (PhysicalChannelReconfiguration_v690ext_IEs)mComponents[0];
			    }
			    
			    public void setPhysicalChannelReconfiguration_v690ext(PhysicalChannelReconfiguration_v690ext_IEs physicalChannelReconfiguration_v690ext)
			    {
				mComponents[0] = physicalChannelReconfiguration_v690ext;
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
				public V770NCEs(PhysicalChannelReconfiguration_v770ext_IEs physicalChannelReconfiguration_v770ext, 
						NonCriticalExtensions nonCriticalExtensions)
				{
				    setPhysicalChannelReconfiguration_v770ext(physicalChannelReconfiguration_v770ext);
				    setNonCriticalExtensions(nonCriticalExtensions);
				}
				
				/**
				 * Construct with required components.
				 */
				public V770NCEs(PhysicalChannelReconfiguration_v770ext_IEs physicalChannelReconfiguration_v770ext)
				{
				    setPhysicalChannelReconfiguration_v770ext(physicalChannelReconfiguration_v770ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new PhysicalChannelReconfiguration_v770ext_IEs();
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
					    return new PhysicalChannelReconfiguration_v770ext_IEs();
					case 1:
					    return new NonCriticalExtensions();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "physicalChannelReconfiguration_v770ext"
				public PhysicalChannelReconfiguration_v770ext_IEs getPhysicalChannelReconfiguration_v770ext()
				{
				    return (PhysicalChannelReconfiguration_v770ext_IEs)mComponents[0];
				}
				
				public void setPhysicalChannelReconfiguration_v770ext(PhysicalChannelReconfiguration_v770ext_IEs physicalChannelReconfiguration_v770ext)
				{
				    mComponents[0] = physicalChannelReconfiguration_v770ext;
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
					    "PhysicalChannelReconfiguration$R3$V3a0NCEs$LaterNCEs$V4b0NonCriticalExtenstions$V590NonCriticalExtenstions$V690NCEs$V770NCEs$NonCriticalExtensions"
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
					"PhysicalChannelReconfiguration$R3$V3a0NCEs$LaterNCEs$V4b0NonCriticalExtenstions$V590NonCriticalExtenstions$V690NCEs$V770NCEs"
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
							    "PhysicalChannelReconfiguration_v770ext_IEs"
							),
							new QName (
							    "PDU-definitions",
							    "PhysicalChannelReconfiguration-v770ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.pdu_definitions",
								"PhysicalChannelReconfiguration_v770ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.pdu_definitions",
								"PhysicalChannelReconfiguration_v770ext_IEs"
							    )
							),
							0
						    )
						),
						"physicalChannelReconfiguration-v770ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.pdu_definitions",
							"PhysicalChannelReconfiguration$R3$V3a0NCEs$LaterNCEs$V4b0NonCriticalExtenstions$V590NonCriticalExtenstions$V690NCEs$V770NCEs$NonCriticalExtensions"
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
				    "PhysicalChannelReconfiguration$R3$V3a0NCEs$LaterNCEs$V4b0NonCriticalExtenstions$V590NonCriticalExtenstions$V690NCEs"
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
							"PhysicalChannelReconfiguration_v690ext_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"PhysicalChannelReconfiguration-v690ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "PhysicalChannelReconfiguration_v690ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "PhysicalChannelReconfiguration_v690ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "physicalChannelReconfiguration-v690ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "PhysicalChannelReconfiguration$R3$V3a0NCEs$LaterNCEs$V4b0NonCriticalExtenstions$V590NonCriticalExtenstions$V690NCEs$V770NCEs"
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
				"PhysicalChannelReconfiguration$R3$V3a0NCEs$LaterNCEs$V4b0NonCriticalExtenstions$V590NonCriticalExtenstions"
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
						    "PhysicalChannelReconfiguration_v590ext_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "PhysicalChannelReconfiguration-v590ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"PhysicalChannelReconfiguration_v590ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"PhysicalChannelReconfiguration_v590ext_IEs"
						    )
						),
						0
					    )
					),
					"physicalChannelReconfiguration-v590ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"PhysicalChannelReconfiguration$R3$V3a0NCEs$LaterNCEs$V4b0NonCriticalExtenstions$V590NonCriticalExtenstions$V690NCEs"
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
			 * Get the type descriptor (TypeInfo) of 'this' V590NonCriticalExtenstions object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' V590NonCriticalExtenstions object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for V590NonCriticalExtenstions

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
			    "PhysicalChannelReconfiguration$R3$V3a0NCEs$LaterNCEs$V4b0NonCriticalExtenstions"
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
						"PhysicalChannelReconfiguration_v4b0ext_IEs"
					    ),
					    new QName (
						"PDU-definitions",
						"PhysicalChannelReconfiguration-v4b0ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.pdu_definitions",
						    "PhysicalChannelReconfiguration_v4b0ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.pdu_definitions",
						    "PhysicalChannelReconfiguration_v4b0ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "physicalChannelReconfiguration-v4b0ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "PhysicalChannelReconfiguration$R3$V3a0NCEs$LaterNCEs$V4b0NonCriticalExtenstions$V590NonCriticalExtenstions"
					)
				    ),
				    "v590NonCriticalExtenstions",
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
		     * Get the type descriptor (TypeInfo) of 'this' V4b0NonCriticalExtenstions object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' V4b0NonCriticalExtenstions object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for V4b0NonCriticalExtenstions

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
			"PhysicalChannelReconfiguration$R3$V3a0NCEs$LaterNCEs"
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
				"physicalChannelReconfiguration-r3-add-ext",
				0,
				3,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"PhysicalChannelReconfiguration$R3$V3a0NCEs$LaterNCEs$V4b0NonCriticalExtenstions"
				    )
				),
				"v4b0NonCriticalExtenstions",
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
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.pdu_definitions",
		    "PhysicalChannelReconfiguration$R3$V3a0NCEs"
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
					"PhysicalChannelReconfiguration_v3a0ext"
				    ),
				    new QName (
					"PDU-definitions",
					"PhysicalChannelReconfiguration-v3a0ext"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "PhysicalChannelReconfiguration_v3a0ext"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "PhysicalChannelReconfiguration_v3a0ext"
					)
				    ),
				    0
				)
			    ),
			    "physicalChannelReconfiguration-v3a0ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "PhysicalChannelReconfiguration$R3$V3a0NCEs$LaterNCEs"
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
	     * Get the type descriptor (TypeInfo) of 'this' V3a0NCEs object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' V3a0NCEs object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for V3a0NCEs

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
		"PhysicalChannelReconfiguration$R3"
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
				    "PhysicalChannelReconfiguration_r3_IEs"
				),
				new QName (
				    "PDU-definitions",
				    "PhysicalChannelReconfiguration-r3-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"PhysicalChannelReconfiguration_r3_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"PhysicalChannelReconfiguration_r3_IEs"
				    )
				),
				0
			    )
			),
			"physicalChannelReconfiguration-r3",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"PhysicalChannelReconfiguration$R3$V3a0NCEs"
			    )
			),
			"v3a0NCEs",
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
    public static PhysicalChannelReconfiguration createPhysicalChannelReconfigurationWithLater_than_r3(Later_than_r3 later_than_r3)
    {
	PhysicalChannelReconfiguration __object = new PhysicalChannelReconfiguration();

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
		public R4(PhysicalChannelReconfiguration_r4_IEs physicalChannelReconfiguration_r4, 
				V4d0NCEs v4d0NCEs)
		{
		    setPhysicalChannelReconfiguration_r4(physicalChannelReconfiguration_r4);
		    setV4d0NCEs(v4d0NCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public R4(PhysicalChannelReconfiguration_r4_IEs physicalChannelReconfiguration_r4)
		{
		    setPhysicalChannelReconfiguration_r4(physicalChannelReconfiguration_r4);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new PhysicalChannelReconfiguration_r4_IEs();
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
			    return new PhysicalChannelReconfiguration_r4_IEs();
			case 1:
			    return new V4d0NCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "physicalChannelReconfiguration_r4"
		public PhysicalChannelReconfiguration_r4_IEs getPhysicalChannelReconfiguration_r4()
		{
		    return (PhysicalChannelReconfiguration_r4_IEs)mComponents[0];
		}
		
		public void setPhysicalChannelReconfiguration_r4(PhysicalChannelReconfiguration_r4_IEs physicalChannelReconfiguration_r4)
		{
		    mComponents[0] = physicalChannelReconfiguration_r4;
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
		    public V4d0NCEs(BitString physicalChannelReconfiguration_r4_add_ext, 
				    V590NonCriticalExtenstions v590NonCriticalExtenstions)
		    {
			setPhysicalChannelReconfiguration_r4_add_ext(physicalChannelReconfiguration_r4_add_ext);
			setV590NonCriticalExtenstions(v590NonCriticalExtenstions);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new BitString();
			mComponents[1] = new V590NonCriticalExtenstions();
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
				return new V590NonCriticalExtenstions();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "physicalChannelReconfiguration_r4_add_ext"
		    public BitString getPhysicalChannelReconfiguration_r4_add_ext()
		    {
			return (BitString)mComponents[0];
		    }
		    
		    public void setPhysicalChannelReconfiguration_r4_add_ext(BitString physicalChannelReconfiguration_r4_add_ext)
		    {
			mComponents[0] = physicalChannelReconfiguration_r4_add_ext;
		    }
		    
		    public boolean hasPhysicalChannelReconfiguration_r4_add_ext()
		    {
			return componentIsPresent(0);
		    }
		    
		    public void deletePhysicalChannelReconfiguration_r4_add_ext()
		    {
			setComponentAbsent(0);
		    }
		    
		    
		    // Methods for field "v590NonCriticalExtenstions"
		    public V590NonCriticalExtenstions getV590NonCriticalExtenstions()
		    {
			return (V590NonCriticalExtenstions)mComponents[1];
		    }
		    
		    public void setV590NonCriticalExtenstions(V590NonCriticalExtenstions v590NonCriticalExtenstions)
		    {
			mComponents[1] = v590NonCriticalExtenstions;
		    }
		    
		    public boolean hasV590NonCriticalExtenstions()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteV590NonCriticalExtenstions()
		    {
			setComponentAbsent(1);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type V590NonCriticalExtenstions from ASN1 Module PDU_definitions.
		     * @see Sequence
		     */
		    public static class V590NonCriticalExtenstions extends Sequence {
			
			/**
			 * The default constructor.
			 */
			public V590NonCriticalExtenstions()
			{
			}
			
			/**
			 * Construct with AbstractData components.
			 */
			public V590NonCriticalExtenstions(PhysicalChannelReconfiguration_v590ext_IEs physicalChannelReconfiguration_v590ext, 
					V690NCEs v690NCEs)
			{
			    setPhysicalChannelReconfiguration_v590ext(physicalChannelReconfiguration_v590ext);
			    setV690NCEs(v690NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public V590NonCriticalExtenstions(PhysicalChannelReconfiguration_v590ext_IEs physicalChannelReconfiguration_v590ext)
			{
			    setPhysicalChannelReconfiguration_v590ext(physicalChannelReconfiguration_v590ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new PhysicalChannelReconfiguration_v590ext_IEs();
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
				    return new PhysicalChannelReconfiguration_v590ext_IEs();
				case 1:
				    return new V690NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "physicalChannelReconfiguration_v590ext"
			public PhysicalChannelReconfiguration_v590ext_IEs getPhysicalChannelReconfiguration_v590ext()
			{
			    return (PhysicalChannelReconfiguration_v590ext_IEs)mComponents[0];
			}
			
			public void setPhysicalChannelReconfiguration_v590ext(PhysicalChannelReconfiguration_v590ext_IEs physicalChannelReconfiguration_v590ext)
			{
			    mComponents[0] = physicalChannelReconfiguration_v590ext;
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
			    public V690NCEs(PhysicalChannelReconfiguration_v690ext_IEs physicalChannelReconfiguration_v690ext, 
					    V770NCEs v770NCEs)
			    {
				setPhysicalChannelReconfiguration_v690ext(physicalChannelReconfiguration_v690ext);
				setV770NCEs(v770NCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V690NCEs(PhysicalChannelReconfiguration_v690ext_IEs physicalChannelReconfiguration_v690ext)
			    {
				setPhysicalChannelReconfiguration_v690ext(physicalChannelReconfiguration_v690ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new PhysicalChannelReconfiguration_v690ext_IEs();
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
					return new PhysicalChannelReconfiguration_v690ext_IEs();
				    case 1:
					return new V770NCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "physicalChannelReconfiguration_v690ext"
			    public PhysicalChannelReconfiguration_v690ext_IEs getPhysicalChannelReconfiguration_v690ext()
			    {
				return (PhysicalChannelReconfiguration_v690ext_IEs)mComponents[0];
			    }
			    
			    public void setPhysicalChannelReconfiguration_v690ext(PhysicalChannelReconfiguration_v690ext_IEs physicalChannelReconfiguration_v690ext)
			    {
				mComponents[0] = physicalChannelReconfiguration_v690ext;
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
				public V770NCEs(PhysicalChannelReconfiguration_v770ext_IEs physicalChannelReconfiguration_v770ext, 
						NonCriticalExtensions nonCriticalExtensions)
				{
				    setPhysicalChannelReconfiguration_v770ext(physicalChannelReconfiguration_v770ext);
				    setNonCriticalExtensions(nonCriticalExtensions);
				}
				
				/**
				 * Construct with required components.
				 */
				public V770NCEs(PhysicalChannelReconfiguration_v770ext_IEs physicalChannelReconfiguration_v770ext)
				{
				    setPhysicalChannelReconfiguration_v770ext(physicalChannelReconfiguration_v770ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new PhysicalChannelReconfiguration_v770ext_IEs();
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
					    return new PhysicalChannelReconfiguration_v770ext_IEs();
					case 1:
					    return new NonCriticalExtensions();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "physicalChannelReconfiguration_v770ext"
				public PhysicalChannelReconfiguration_v770ext_IEs getPhysicalChannelReconfiguration_v770ext()
				{
				    return (PhysicalChannelReconfiguration_v770ext_IEs)mComponents[0];
				}
				
				public void setPhysicalChannelReconfiguration_v770ext(PhysicalChannelReconfiguration_v770ext_IEs physicalChannelReconfiguration_v770ext)
				{
				    mComponents[0] = physicalChannelReconfiguration_v770ext;
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
					    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V590NonCriticalExtenstions$V690NCEs$V770NCEs$NonCriticalExtensions"
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
					"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V590NonCriticalExtenstions$V690NCEs$V770NCEs"
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
							    "PhysicalChannelReconfiguration_v770ext_IEs"
							),
							new QName (
							    "PDU-definitions",
							    "PhysicalChannelReconfiguration-v770ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.pdu_definitions",
								"PhysicalChannelReconfiguration_v770ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.pdu_definitions",
								"PhysicalChannelReconfiguration_v770ext_IEs"
							    )
							),
							0
						    )
						),
						"physicalChannelReconfiguration-v770ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.pdu_definitions",
							"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V590NonCriticalExtenstions$V690NCEs$V770NCEs$NonCriticalExtensions"
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
				    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V590NonCriticalExtenstions$V690NCEs"
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
							"PhysicalChannelReconfiguration_v690ext_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"PhysicalChannelReconfiguration-v690ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "PhysicalChannelReconfiguration_v690ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "PhysicalChannelReconfiguration_v690ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "physicalChannelReconfiguration-v690ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V590NonCriticalExtenstions$V690NCEs$V770NCEs"
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
				"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V590NonCriticalExtenstions"
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
						    "PhysicalChannelReconfiguration_v590ext_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "PhysicalChannelReconfiguration-v590ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"PhysicalChannelReconfiguration_v590ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"PhysicalChannelReconfiguration_v590ext_IEs"
						    )
						),
						0
					    )
					),
					"physicalChannelReconfiguration-v590ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V590NonCriticalExtenstions$V690NCEs"
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
			 * Get the type descriptor (TypeInfo) of 'this' V590NonCriticalExtenstions object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' V590NonCriticalExtenstions object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for V590NonCriticalExtenstions

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
			    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$R4$V4d0NCEs"
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
				    "physicalChannelReconfiguration-r4-add-ext",
				    0,
				    3,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V590NonCriticalExtenstions"
					)
				    ),
				    "v590NonCriticalExtenstions",
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
			"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$R4"
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
					    "PhysicalChannelReconfiguration_r4_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "PhysicalChannelReconfiguration-r4-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"PhysicalChannelReconfiguration_r4_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"PhysicalChannelReconfiguration_r4_IEs"
					    )
					),
					0
				    )
				),
				"physicalChannelReconfiguration-r4",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$R4$V4d0NCEs"
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
		    public R5(PhysicalChannelReconfiguration_r5_IEs physicalChannelReconfiguration_r5, 
				    BitString physicalChannelReconfiguration_r5_add_ext, 
				    V690NCEs v690NCEs)
		    {
			setPhysicalChannelReconfiguration_r5(physicalChannelReconfiguration_r5);
			setPhysicalChannelReconfiguration_r5_add_ext(physicalChannelReconfiguration_r5_add_ext);
			setV690NCEs(v690NCEs);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public R5(PhysicalChannelReconfiguration_r5_IEs physicalChannelReconfiguration_r5)
		    {
			setPhysicalChannelReconfiguration_r5(physicalChannelReconfiguration_r5);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new PhysicalChannelReconfiguration_r5_IEs();
			mComponents[1] = new BitString();
			mComponents[2] = new V690NCEs();
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
				return new PhysicalChannelReconfiguration_r5_IEs();
			    case 1:
				return new BitString();
			    case 2:
				return new V690NCEs();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "physicalChannelReconfiguration_r5"
		    public PhysicalChannelReconfiguration_r5_IEs getPhysicalChannelReconfiguration_r5()
		    {
			return (PhysicalChannelReconfiguration_r5_IEs)mComponents[0];
		    }
		    
		    public void setPhysicalChannelReconfiguration_r5(PhysicalChannelReconfiguration_r5_IEs physicalChannelReconfiguration_r5)
		    {
			mComponents[0] = physicalChannelReconfiguration_r5;
		    }
		    
		    
		    // Methods for field "physicalChannelReconfiguration_r5_add_ext"
		    public BitString getPhysicalChannelReconfiguration_r5_add_ext()
		    {
			return (BitString)mComponents[1];
		    }
		    
		    public void setPhysicalChannelReconfiguration_r5_add_ext(BitString physicalChannelReconfiguration_r5_add_ext)
		    {
			mComponents[1] = physicalChannelReconfiguration_r5_add_ext;
		    }
		    
		    public boolean hasPhysicalChannelReconfiguration_r5_add_ext()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deletePhysicalChannelReconfiguration_r5_add_ext()
		    {
			setComponentAbsent(1);
		    }
		    
		    
		    // Methods for field "v690NCEs"
		    public V690NCEs getV690NCEs()
		    {
			return (V690NCEs)mComponents[2];
		    }
		    
		    public void setV690NCEs(V690NCEs v690NCEs)
		    {
			mComponents[2] = v690NCEs;
		    }
		    
		    public boolean hasV690NCEs()
		    {
			return componentIsPresent(2);
		    }
		    
		    public void deleteV690NCEs()
		    {
			setComponentAbsent(2);
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
			public V690NCEs(PhysicalChannelReconfiguration_v690ext_IEs physicalChannelReconfiguration_v690ext, 
					V770NCEs v770NCEs)
			{
			    setPhysicalChannelReconfiguration_v690ext(physicalChannelReconfiguration_v690ext);
			    setV770NCEs(v770NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public V690NCEs(PhysicalChannelReconfiguration_v690ext_IEs physicalChannelReconfiguration_v690ext)
			{
			    setPhysicalChannelReconfiguration_v690ext(physicalChannelReconfiguration_v690ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new PhysicalChannelReconfiguration_v690ext_IEs();
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
				    return new PhysicalChannelReconfiguration_v690ext_IEs();
				case 1:
				    return new V770NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "physicalChannelReconfiguration_v690ext"
			public PhysicalChannelReconfiguration_v690ext_IEs getPhysicalChannelReconfiguration_v690ext()
			{
			    return (PhysicalChannelReconfiguration_v690ext_IEs)mComponents[0];
			}
			
			public void setPhysicalChannelReconfiguration_v690ext(PhysicalChannelReconfiguration_v690ext_IEs physicalChannelReconfiguration_v690ext)
			{
			    mComponents[0] = physicalChannelReconfiguration_v690ext;
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
			    public V770NCEs(PhysicalChannelReconfiguration_v770ext_IEs physicalChannelReconfiguration_v770ext, 
					    NonCriticalExtensions nonCriticalExtensions)
			    {
				setPhysicalChannelReconfiguration_v770ext(physicalChannelReconfiguration_v770ext);
				setNonCriticalExtensions(nonCriticalExtensions);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V770NCEs(PhysicalChannelReconfiguration_v770ext_IEs physicalChannelReconfiguration_v770ext)
			    {
				setPhysicalChannelReconfiguration_v770ext(physicalChannelReconfiguration_v770ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new PhysicalChannelReconfiguration_v770ext_IEs();
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
					return new PhysicalChannelReconfiguration_v770ext_IEs();
				    case 1:
					return new NonCriticalExtensions();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "physicalChannelReconfiguration_v770ext"
			    public PhysicalChannelReconfiguration_v770ext_IEs getPhysicalChannelReconfiguration_v770ext()
			    {
				return (PhysicalChannelReconfiguration_v770ext_IEs)mComponents[0];
			    }
			    
			    public void setPhysicalChannelReconfiguration_v770ext(PhysicalChannelReconfiguration_v770ext_IEs physicalChannelReconfiguration_v770ext)
			    {
				mComponents[0] = physicalChannelReconfiguration_v770ext;
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
					"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$R5$V690NCEs$V770NCEs$NonCriticalExtensions"
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
				    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$R5$V690NCEs$V770NCEs"
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
							"PhysicalChannelReconfiguration_v770ext_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"PhysicalChannelReconfiguration-v770ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "PhysicalChannelReconfiguration_v770ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "PhysicalChannelReconfiguration_v770ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "physicalChannelReconfiguration-v770ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$R5$V690NCEs$V770NCEs$NonCriticalExtensions"
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
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$R5$V690NCEs"
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
						    "PhysicalChannelReconfiguration_v690ext_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "PhysicalChannelReconfiguration-v690ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"PhysicalChannelReconfiguration_v690ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"PhysicalChannelReconfiguration_v690ext_IEs"
						    )
						),
						0
					    )
					),
					"physicalChannelReconfiguration-v690ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$R5$V690NCEs$V770NCEs"
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
				(short)0x8000
			    }
			),
			new QName (
			    "rrc.pdu_definitions",
			    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$R5"
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
						"PhysicalChannelReconfiguration_r5_IEs"
					    ),
					    new QName (
						"PDU-definitions",
						"PhysicalChannelReconfiguration-r5-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.pdu_definitions",
						    "PhysicalChannelReconfiguration_r5_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.pdu_definitions",
						    "PhysicalChannelReconfiguration_r5_IEs"
						)
					    ),
					    0
					)
				    ),
				    "physicalChannelReconfiguration-r5",
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
				    "physicalChannelReconfiguration-r5-add-ext",
				    1,
				    3,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$R5$V690NCEs"
					)
				    ),
				    "v690NCEs",
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
			public R6(PhysicalChannelReconfiguration_r6_IEs physicalChannelReconfiguration_r6, 
					BitString physicalChannelReconfiguration_r6_add_ext, 
					V6b0NCEs v6b0NCEs)
			{
			    setPhysicalChannelReconfiguration_r6(physicalChannelReconfiguration_r6);
			    setPhysicalChannelReconfiguration_r6_add_ext(physicalChannelReconfiguration_r6_add_ext);
			    setV6b0NCEs(v6b0NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public R6(PhysicalChannelReconfiguration_r6_IEs physicalChannelReconfiguration_r6)
			{
			    setPhysicalChannelReconfiguration_r6(physicalChannelReconfiguration_r6);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new PhysicalChannelReconfiguration_r6_IEs();
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
				    return new PhysicalChannelReconfiguration_r6_IEs();
				case 1:
				    return new BitString();
				case 2:
				    return new V6b0NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "physicalChannelReconfiguration_r6"
			public PhysicalChannelReconfiguration_r6_IEs getPhysicalChannelReconfiguration_r6()
			{
			    return (PhysicalChannelReconfiguration_r6_IEs)mComponents[0];
			}
			
			public void setPhysicalChannelReconfiguration_r6(PhysicalChannelReconfiguration_r6_IEs physicalChannelReconfiguration_r6)
			{
			    mComponents[0] = physicalChannelReconfiguration_r6;
			}
			
			
			// Methods for field "physicalChannelReconfiguration_r6_add_ext"
			public BitString getPhysicalChannelReconfiguration_r6_add_ext()
			{
			    return (BitString)mComponents[1];
			}
			
			public void setPhysicalChannelReconfiguration_r6_add_ext(BitString physicalChannelReconfiguration_r6_add_ext)
			{
			    mComponents[1] = physicalChannelReconfiguration_r6_add_ext;
			}
			
			public boolean hasPhysicalChannelReconfiguration_r6_add_ext()
			{
			    return componentIsPresent(1);
			}
			
			public void deletePhysicalChannelReconfiguration_r6_add_ext()
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
			    public V6b0NCEs(PhysicalChannelReconfiguration_v6b0ext_IEs physicalChannelReconfiguration_v6b0ext, 
					    V770NCEs v770NCEs)
			    {
				setPhysicalChannelReconfiguration_v6b0ext(physicalChannelReconfiguration_v6b0ext);
				setV770NCEs(v770NCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V6b0NCEs(PhysicalChannelReconfiguration_v6b0ext_IEs physicalChannelReconfiguration_v6b0ext)
			    {
				setPhysicalChannelReconfiguration_v6b0ext(physicalChannelReconfiguration_v6b0ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new PhysicalChannelReconfiguration_v6b0ext_IEs();
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
					return new PhysicalChannelReconfiguration_v6b0ext_IEs();
				    case 1:
					return new V770NCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "physicalChannelReconfiguration_v6b0ext"
			    public PhysicalChannelReconfiguration_v6b0ext_IEs getPhysicalChannelReconfiguration_v6b0ext()
			    {
				return (PhysicalChannelReconfiguration_v6b0ext_IEs)mComponents[0];
			    }
			    
			    public void setPhysicalChannelReconfiguration_v6b0ext(PhysicalChannelReconfiguration_v6b0ext_IEs physicalChannelReconfiguration_v6b0ext)
			    {
				mComponents[0] = physicalChannelReconfiguration_v6b0ext;
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
				public V770NCEs(PhysicalChannelReconfiguration_v770ext_IEs physicalChannelReconfiguration_v770ext, 
						NonCriticalExtensions nonCriticalExtensions)
				{
				    setPhysicalChannelReconfiguration_v770ext(physicalChannelReconfiguration_v770ext);
				    setNonCriticalExtensions(nonCriticalExtensions);
				}
				
				/**
				 * Construct with required components.
				 */
				public V770NCEs(PhysicalChannelReconfiguration_v770ext_IEs physicalChannelReconfiguration_v770ext)
				{
				    setPhysicalChannelReconfiguration_v770ext(physicalChannelReconfiguration_v770ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new PhysicalChannelReconfiguration_v770ext_IEs();
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
					    return new PhysicalChannelReconfiguration_v770ext_IEs();
					case 1:
					    return new NonCriticalExtensions();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "physicalChannelReconfiguration_v770ext"
				public PhysicalChannelReconfiguration_v770ext_IEs getPhysicalChannelReconfiguration_v770ext()
				{
				    return (PhysicalChannelReconfiguration_v770ext_IEs)mComponents[0];
				}
				
				public void setPhysicalChannelReconfiguration_v770ext(PhysicalChannelReconfiguration_v770ext_IEs physicalChannelReconfiguration_v770ext)
				{
				    mComponents[0] = physicalChannelReconfiguration_v770ext;
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
					    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R6$V6b0NCEs$V770NCEs$NonCriticalExtensions"
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
					"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R6$V6b0NCEs$V770NCEs"
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
							    "PhysicalChannelReconfiguration_v770ext_IEs"
							),
							new QName (
							    "PDU-definitions",
							    "PhysicalChannelReconfiguration-v770ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.pdu_definitions",
								"PhysicalChannelReconfiguration_v770ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.pdu_definitions",
								"PhysicalChannelReconfiguration_v770ext_IEs"
							    )
							),
							0
						    )
						),
						"physicalChannelReconfiguration-v770ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.pdu_definitions",
							"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R6$V6b0NCEs$V770NCEs$NonCriticalExtensions"
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
					(short)0x8002
				    }
				),
				new QName (
				    "rrc.pdu_definitions",
				    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R6$V6b0NCEs"
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
							"PhysicalChannelReconfiguration_v6b0ext_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"PhysicalChannelReconfiguration-v6b0ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "PhysicalChannelReconfiguration_v6b0ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "PhysicalChannelReconfiguration_v6b0ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "physicalChannelReconfiguration-v6b0ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R6$V6b0NCEs$V770NCEs"
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
				"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R6"
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
						    "PhysicalChannelReconfiguration_r6_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "PhysicalChannelReconfiguration-r6-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"PhysicalChannelReconfiguration_r6_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"PhysicalChannelReconfiguration_r6_IEs"
						    )
						),
						0
					    )
					),
					"physicalChannelReconfiguration-r6",
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
					"physicalChannelReconfiguration-r6-add-ext",
					1,
					3,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R6$V6b0NCEs"
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
			    public R7(PhysicalChannelReconfiguration_r7_IEs physicalChannelReconfiguration_r7, 
					    BitString physicalChannelReconfiguration_r7_add_ext, 
					    V780NCEs v780NCEs)
			    {
				setPhysicalChannelReconfiguration_r7(physicalChannelReconfiguration_r7);
				setPhysicalChannelReconfiguration_r7_add_ext(physicalChannelReconfiguration_r7_add_ext);
				setV780NCEs(v780NCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public R7(PhysicalChannelReconfiguration_r7_IEs physicalChannelReconfiguration_r7)
			    {
				setPhysicalChannelReconfiguration_r7(physicalChannelReconfiguration_r7);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new PhysicalChannelReconfiguration_r7_IEs();
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
					return new PhysicalChannelReconfiguration_r7_IEs();
				    case 1:
					return new BitString();
				    case 2:
					return new V780NCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "physicalChannelReconfiguration_r7"
			    public PhysicalChannelReconfiguration_r7_IEs getPhysicalChannelReconfiguration_r7()
			    {
				return (PhysicalChannelReconfiguration_r7_IEs)mComponents[0];
			    }
			    
			    public void setPhysicalChannelReconfiguration_r7(PhysicalChannelReconfiguration_r7_IEs physicalChannelReconfiguration_r7)
			    {
				mComponents[0] = physicalChannelReconfiguration_r7;
			    }
			    
			    
			    // Methods for field "physicalChannelReconfiguration_r7_add_ext"
			    public BitString getPhysicalChannelReconfiguration_r7_add_ext()
			    {
				return (BitString)mComponents[1];
			    }
			    
			    public void setPhysicalChannelReconfiguration_r7_add_ext(BitString physicalChannelReconfiguration_r7_add_ext)
			    {
				mComponents[1] = physicalChannelReconfiguration_r7_add_ext;
			    }
			    
			    public boolean hasPhysicalChannelReconfiguration_r7_add_ext()
			    {
				return componentIsPresent(1);
			    }
			    
			    public void deletePhysicalChannelReconfiguration_r7_add_ext()
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
				public V780NCEs(PhysicalChannelReconfiguration_v780ext_IEs physicalChannelReconfiguration_v780ext, 
						V7d0NCEs v7d0NCEs)
				{
				    setPhysicalChannelReconfiguration_v780ext(physicalChannelReconfiguration_v780ext);
				    setV7d0NCEs(v7d0NCEs);
				}
				
				/**
				 * Construct with required components.
				 */
				public V780NCEs(PhysicalChannelReconfiguration_v780ext_IEs physicalChannelReconfiguration_v780ext)
				{
				    setPhysicalChannelReconfiguration_v780ext(physicalChannelReconfiguration_v780ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new PhysicalChannelReconfiguration_v780ext_IEs();
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
					    return new PhysicalChannelReconfiguration_v780ext_IEs();
					case 1:
					    return new V7d0NCEs();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "physicalChannelReconfiguration_v780ext"
				public PhysicalChannelReconfiguration_v780ext_IEs getPhysicalChannelReconfiguration_v780ext()
				{
				    return (PhysicalChannelReconfiguration_v780ext_IEs)mComponents[0];
				}
				
				public void setPhysicalChannelReconfiguration_v780ext(PhysicalChannelReconfiguration_v780ext_IEs physicalChannelReconfiguration_v780ext)
				{
				    mComponents[0] = physicalChannelReconfiguration_v780ext;
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
				    public V7d0NCEs(PhysicalChannelReconfiguration_v7d0ext_IEs physicalChannelReconfiguration_v7d0ext, 
						    V7f0NCEs v7f0NCEs)
				    {
					setPhysicalChannelReconfiguration_v7d0ext(physicalChannelReconfiguration_v7d0ext);
					setV7f0NCEs(v7f0NCEs);
				    }
				    
				    /**
				     * Construct with required components.
				     */
				    public V7d0NCEs(PhysicalChannelReconfiguration_v7d0ext_IEs physicalChannelReconfiguration_v7d0ext)
				    {
					setPhysicalChannelReconfiguration_v7d0ext(physicalChannelReconfiguration_v7d0ext);
				    }
				    
				    public void initComponents()
				    {
					mComponents[0] = new PhysicalChannelReconfiguration_v7d0ext_IEs();
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
						return new PhysicalChannelReconfiguration_v7d0ext_IEs();
					    case 1:
						return new V7f0NCEs();
					    default:
						throw new InternalError("AbstractCollection.createInstance()");
					}
					
				    }
				    
				    
				    // Methods for field "physicalChannelReconfiguration_v7d0ext"
				    public PhysicalChannelReconfiguration_v7d0ext_IEs getPhysicalChannelReconfiguration_v7d0ext()
				    {
					return (PhysicalChannelReconfiguration_v7d0ext_IEs)mComponents[0];
				    }
				    
				    public void setPhysicalChannelReconfiguration_v7d0ext(PhysicalChannelReconfiguration_v7d0ext_IEs physicalChannelReconfiguration_v7d0ext)
				    {
					mComponents[0] = physicalChannelReconfiguration_v7d0ext;
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
					public V7f0NCEs(PhysicalChannelReconfiguration_v7f0ext_IEs physicalChannelReconfiguration_v7f0ext, 
							V7g0NCEs v7g0NCEs)
					{
					    setPhysicalChannelReconfiguration_v7f0ext(physicalChannelReconfiguration_v7f0ext);
					    setV7g0NCEs(v7g0NCEs);
					}
					
					/**
					 * Construct with required components.
					 */
					public V7f0NCEs(PhysicalChannelReconfiguration_v7f0ext_IEs physicalChannelReconfiguration_v7f0ext)
					{
					    setPhysicalChannelReconfiguration_v7f0ext(physicalChannelReconfiguration_v7f0ext);
					}
					
					public void initComponents()
					{
					    mComponents[0] = new PhysicalChannelReconfiguration_v7f0ext_IEs();
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
						    return new PhysicalChannelReconfiguration_v7f0ext_IEs();
						case 1:
						    return new V7g0NCEs();
						default:
						    throw new InternalError("AbstractCollection.createInstance()");
					    }
					    
					}
					
					
					// Methods for field "physicalChannelReconfiguration_v7f0ext"
					public PhysicalChannelReconfiguration_v7f0ext_IEs getPhysicalChannelReconfiguration_v7f0ext()
					{
					    return (PhysicalChannelReconfiguration_v7f0ext_IEs)mComponents[0];
					}
					
					public void setPhysicalChannelReconfiguration_v7f0ext(PhysicalChannelReconfiguration_v7f0ext_IEs physicalChannelReconfiguration_v7f0ext)
					{
					    mComponents[0] = physicalChannelReconfiguration_v7f0ext;
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
					    public V7g0NCEs(PhysicalChannelReconfiguration_v7g0ext_IEs physicalChannelReconfiguration_v7g0ext, 
							    NonCriticalExtensions nonCriticalExtensions)
					    {
						setPhysicalChannelReconfiguration_v7g0ext(physicalChannelReconfiguration_v7g0ext);
						setNonCriticalExtensions(nonCriticalExtensions);
					    }
					    
					    /**
					     * Construct with required components.
					     */
					    public V7g0NCEs(PhysicalChannelReconfiguration_v7g0ext_IEs physicalChannelReconfiguration_v7g0ext)
					    {
						setPhysicalChannelReconfiguration_v7g0ext(physicalChannelReconfiguration_v7g0ext);
					    }
					    
					    public void initComponents()
					    {
						mComponents[0] = new PhysicalChannelReconfiguration_v7g0ext_IEs();
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
							return new PhysicalChannelReconfiguration_v7g0ext_IEs();
						    case 1:
							return new NonCriticalExtensions();
						    default:
							throw new InternalError("AbstractCollection.createInstance()");
						}
						
					    }
					    
					    
					    // Methods for field "physicalChannelReconfiguration_v7g0ext"
					    public PhysicalChannelReconfiguration_v7g0ext_IEs getPhysicalChannelReconfiguration_v7g0ext()
					    {
						return (PhysicalChannelReconfiguration_v7g0ext_IEs)mComponents[0];
					    }
					    
					    public void setPhysicalChannelReconfiguration_v7g0ext(PhysicalChannelReconfiguration_v7g0ext_IEs physicalChannelReconfiguration_v7g0ext)
					    {
						mComponents[0] = physicalChannelReconfiguration_v7g0ext;
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
							"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7$V780NCEs$V7d0NCEs$V7f0NCEs$V7g0NCEs$NonCriticalExtensions"
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
						    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7$V780NCEs$V7d0NCEs$V7f0NCEs$V7g0NCEs"
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
									"PhysicalChannelReconfiguration_v7g0ext_IEs"
								    ),
								    new QName (
									"PDU-definitions",
									"PhysicalChannelReconfiguration-v7g0ext-IEs"
								    ),
								    12314,
								    null,
								    new FieldsRef (
									new QName (
									    "rrc.pdu_definitions",
									    "PhysicalChannelReconfiguration_v7g0ext_IEs"
									)
								    ),
								    0,
								    new TagDecodersRef (
									new QName (
									    "rrc.pdu_definitions",
									    "PhysicalChannelReconfiguration_v7g0ext_IEs"
									)
								    ),
								    0
								)
							    ),
							    "physicalChannelReconfiguration-v7g0ext",
							    0,
							    2,
							    null
							),
							new SequenceFieldInfo (
							    new TypeInfoRef (
								new QName (
								    "rrc.pdu_definitions",
								    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7$V780NCEs$V7d0NCEs$V7f0NCEs$V7g0NCEs$NonCriticalExtensions"
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
						"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7$V780NCEs$V7d0NCEs$V7f0NCEs"
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
								    "PhysicalChannelReconfiguration_v7f0ext_IEs"
								),
								new QName (
								    "PDU-definitions",
								    "PhysicalChannelReconfiguration-v7f0ext-IEs"
								),
								12314,
								null,
								new FieldsRef (
								    new QName (
									"rrc.pdu_definitions",
									"PhysicalChannelReconfiguration_v7f0ext_IEs"
								    )
								),
								0,
								new TagDecodersRef (
								    new QName (
									"rrc.pdu_definitions",
									"PhysicalChannelReconfiguration_v7f0ext_IEs"
								    )
								),
								0
							    )
							),
							"physicalChannelReconfiguration-v7f0ext",
							0,
							2,
							null
						    ),
						    new SequenceFieldInfo (
							new TypeInfoRef (
							    new QName (
								"rrc.pdu_definitions",
								"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7$V780NCEs$V7d0NCEs$V7f0NCEs$V7g0NCEs"
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
						(short)0x8001
					    }
					),
					new QName (
					    "rrc.pdu_definitions",
					    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7$V780NCEs$V7d0NCEs"
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
								"PhysicalChannelReconfiguration_v7d0ext_IEs"
							    ),
							    new QName (
								"PDU-definitions",
								"PhysicalChannelReconfiguration-v7d0ext-IEs"
							    ),
							    12314,
							    null,
							    new FieldsRef (
								new QName (
								    "rrc.pdu_definitions",
								    "PhysicalChannelReconfiguration_v7d0ext_IEs"
								)
							    ),
							    0,
							    new TagDecodersRef (
								new QName (
								    "rrc.pdu_definitions",
								    "PhysicalChannelReconfiguration_v7d0ext_IEs"
								)
							    ),
							    0
							)
						    ),
						    "physicalChannelReconfiguration-v7d0ext",
						    0,
						    2,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.pdu_definitions",
							    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7$V780NCEs$V7d0NCEs$V7f0NCEs"
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
					    (short)0x8002
					}
				    ),
				    new QName (
					"rrc.pdu_definitions",
					"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7$V780NCEs"
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
							    "PhysicalChannelReconfiguration_v780ext_IEs"
							),
							new QName (
							    "PDU-definitions",
							    "PhysicalChannelReconfiguration-v780ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.pdu_definitions",
								"PhysicalChannelReconfiguration_v780ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.pdu_definitions",
								"PhysicalChannelReconfiguration_v780ext_IEs"
							    )
							),
							0
						    )
						),
						"physicalChannelReconfiguration-v780ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.pdu_definitions",
							"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7$V780NCEs$V7d0NCEs"
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
				    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7"
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
							"PhysicalChannelReconfiguration_r7_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"PhysicalChannelReconfiguration-r7-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "PhysicalChannelReconfiguration_r7_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "PhysicalChannelReconfiguration_r7_IEs"
							)
						    ),
						    0
						)
					    ),
					    "physicalChannelReconfiguration-r7",
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
					    "physicalChannelReconfiguration-r7-add-ext",
					    1,
					    3,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7$V780NCEs"
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
				public R8(PhysicalChannelReconfiguration_r8_IEs physicalChannelReconfiguration_r8, 
						BitString physicalChannelReconfiguration_r8_add_ext, 
						V7d0NCEs v7d0NCEs)
				{
				    setPhysicalChannelReconfiguration_r8(physicalChannelReconfiguration_r8);
				    setPhysicalChannelReconfiguration_r8_add_ext(physicalChannelReconfiguration_r8_add_ext);
				    setV7d0NCEs(v7d0NCEs);
				}
				
				/**
				 * Construct with required components.
				 */
				public R8(PhysicalChannelReconfiguration_r8_IEs physicalChannelReconfiguration_r8)
				{
				    setPhysicalChannelReconfiguration_r8(physicalChannelReconfiguration_r8);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new PhysicalChannelReconfiguration_r8_IEs();
				    mComponents[1] = new BitString();
				    mComponents[2] = new V7d0NCEs();
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
					    return new PhysicalChannelReconfiguration_r8_IEs();
					case 1:
					    return new BitString();
					case 2:
					    return new V7d0NCEs();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "physicalChannelReconfiguration_r8"
				public PhysicalChannelReconfiguration_r8_IEs getPhysicalChannelReconfiguration_r8()
				{
				    return (PhysicalChannelReconfiguration_r8_IEs)mComponents[0];
				}
				
				public void setPhysicalChannelReconfiguration_r8(PhysicalChannelReconfiguration_r8_IEs physicalChannelReconfiguration_r8)
				{
				    mComponents[0] = physicalChannelReconfiguration_r8;
				}
				
				
				// Methods for field "physicalChannelReconfiguration_r8_add_ext"
				public BitString getPhysicalChannelReconfiguration_r8_add_ext()
				{
				    return (BitString)mComponents[1];
				}
				
				public void setPhysicalChannelReconfiguration_r8_add_ext(BitString physicalChannelReconfiguration_r8_add_ext)
				{
				    mComponents[1] = physicalChannelReconfiguration_r8_add_ext;
				}
				
				public boolean hasPhysicalChannelReconfiguration_r8_add_ext()
				{
				    return componentIsPresent(1);
				}
				
				public void deletePhysicalChannelReconfiguration_r8_add_ext()
				{
				    setComponentAbsent(1);
				}
				
				
				// Methods for field "v7d0NCEs"
				public V7d0NCEs getV7d0NCEs()
				{
				    return (V7d0NCEs)mComponents[2];
				}
				
				public void setV7d0NCEs(V7d0NCEs v7d0NCEs)
				{
				    mComponents[2] = v7d0NCEs;
				}
				
				public boolean hasV7d0NCEs()
				{
				    return componentIsPresent(2);
				}
				
				public void deleteV7d0NCEs()
				{
				    setComponentAbsent(2);
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
				    public V7d0NCEs(PhysicalChannelReconfiguration_v7d0ext_IEs physicalChannelReconfiguration_v7d0ext, 
						    V7f0NCEs v7f0NCEs)
				    {
					setPhysicalChannelReconfiguration_v7d0ext(physicalChannelReconfiguration_v7d0ext);
					setV7f0NCEs(v7f0NCEs);
				    }
				    
				    /**
				     * Construct with required components.
				     */
				    public V7d0NCEs(PhysicalChannelReconfiguration_v7d0ext_IEs physicalChannelReconfiguration_v7d0ext)
				    {
					setPhysicalChannelReconfiguration_v7d0ext(physicalChannelReconfiguration_v7d0ext);
				    }
				    
				    public void initComponents()
				    {
					mComponents[0] = new PhysicalChannelReconfiguration_v7d0ext_IEs();
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
						return new PhysicalChannelReconfiguration_v7d0ext_IEs();
					    case 1:
						return new V7f0NCEs();
					    default:
						throw new InternalError("AbstractCollection.createInstance()");
					}
					
				    }
				    
				    
				    // Methods for field "physicalChannelReconfiguration_v7d0ext"
				    public PhysicalChannelReconfiguration_v7d0ext_IEs getPhysicalChannelReconfiguration_v7d0ext()
				    {
					return (PhysicalChannelReconfiguration_v7d0ext_IEs)mComponents[0];
				    }
				    
				    public void setPhysicalChannelReconfiguration_v7d0ext(PhysicalChannelReconfiguration_v7d0ext_IEs physicalChannelReconfiguration_v7d0ext)
				    {
					mComponents[0] = physicalChannelReconfiguration_v7d0ext;
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
					public V7f0NCEs(PhysicalChannelReconfiguration_v7f0ext_IEs physicalChannelReconfiguration_v7f0ext, 
							V890NCEs v890NCEs)
					{
					    setPhysicalChannelReconfiguration_v7f0ext(physicalChannelReconfiguration_v7f0ext);
					    setV890NCEs(v890NCEs);
					}
					
					/**
					 * Construct with required components.
					 */
					public V7f0NCEs(PhysicalChannelReconfiguration_v7f0ext_IEs physicalChannelReconfiguration_v7f0ext)
					{
					    setPhysicalChannelReconfiguration_v7f0ext(physicalChannelReconfiguration_v7f0ext);
					}
					
					public void initComponents()
					{
					    mComponents[0] = new PhysicalChannelReconfiguration_v7f0ext_IEs();
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
						    return new PhysicalChannelReconfiguration_v7f0ext_IEs();
						case 1:
						    return new V890NCEs();
						default:
						    throw new InternalError("AbstractCollection.createInstance()");
					    }
					    
					}
					
					
					// Methods for field "physicalChannelReconfiguration_v7f0ext"
					public PhysicalChannelReconfiguration_v7f0ext_IEs getPhysicalChannelReconfiguration_v7f0ext()
					{
					    return (PhysicalChannelReconfiguration_v7f0ext_IEs)mComponents[0];
					}
					
					public void setPhysicalChannelReconfiguration_v7f0ext(PhysicalChannelReconfiguration_v7f0ext_IEs physicalChannelReconfiguration_v7f0ext)
					{
					    mComponents[0] = physicalChannelReconfiguration_v7f0ext;
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
					    public V890NCEs(PhysicalChannelReconfiguration_v890ext_IEs physicalChannelReconfiguration_v890ext, 
							    V7g0NCEs v7g0NCEs)
					    {
						setPhysicalChannelReconfiguration_v890ext(physicalChannelReconfiguration_v890ext);
						setV7g0NCEs(v7g0NCEs);
					    }
					    
					    /**
					     * Construct with required components.
					     */
					    public V890NCEs(PhysicalChannelReconfiguration_v890ext_IEs physicalChannelReconfiguration_v890ext)
					    {
						setPhysicalChannelReconfiguration_v890ext(physicalChannelReconfiguration_v890ext);
					    }
					    
					    public void initComponents()
					    {
						mComponents[0] = new PhysicalChannelReconfiguration_v890ext_IEs();
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
							return new PhysicalChannelReconfiguration_v890ext_IEs();
						    case 1:
							return new V7g0NCEs();
						    default:
							throw new InternalError("AbstractCollection.createInstance()");
						}
						
					    }
					    
					    
					    // Methods for field "physicalChannelReconfiguration_v890ext"
					    public PhysicalChannelReconfiguration_v890ext_IEs getPhysicalChannelReconfiguration_v890ext()
					    {
						return (PhysicalChannelReconfiguration_v890ext_IEs)mComponents[0];
					    }
					    
					    public void setPhysicalChannelReconfiguration_v890ext(PhysicalChannelReconfiguration_v890ext_IEs physicalChannelReconfiguration_v890ext)
					    {
						mComponents[0] = physicalChannelReconfiguration_v890ext;
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
						public V7g0NCEs(PhysicalChannelReconfiguration_v7g0ext_IEs physicalChannelReconfiguration_v7g0ext, 
								V8a0NCEs v8a0NCEs)
						{
						    setPhysicalChannelReconfiguration_v7g0ext(physicalChannelReconfiguration_v7g0ext);
						    setV8a0NCEs(v8a0NCEs);
						}
						
						/**
						 * Construct with required components.
						 */
						public V7g0NCEs(PhysicalChannelReconfiguration_v7g0ext_IEs physicalChannelReconfiguration_v7g0ext)
						{
						    setPhysicalChannelReconfiguration_v7g0ext(physicalChannelReconfiguration_v7g0ext);
						}
						
						public void initComponents()
						{
						    mComponents[0] = new PhysicalChannelReconfiguration_v7g0ext_IEs();
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
							    return new PhysicalChannelReconfiguration_v7g0ext_IEs();
							case 1:
							    return new V8a0NCEs();
							default:
							    throw new InternalError("AbstractCollection.createInstance()");
						    }
						    
						}
						
						
						// Methods for field "physicalChannelReconfiguration_v7g0ext"
						public PhysicalChannelReconfiguration_v7g0ext_IEs getPhysicalChannelReconfiguration_v7g0ext()
						{
						    return (PhysicalChannelReconfiguration_v7g0ext_IEs)mComponents[0];
						}
						
						public void setPhysicalChannelReconfiguration_v7g0ext(PhysicalChannelReconfiguration_v7g0ext_IEs physicalChannelReconfiguration_v7g0ext)
						{
						    mComponents[0] = physicalChannelReconfiguration_v7g0ext;
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
						    public V8a0NCEs(PhysicalChannelReconfiguration_v8a0ext_IEs physicalChannelReconfiguration_v8a0ext, 
								    NonCriticalExtensions nonCriticalExtensions)
						    {
							setPhysicalChannelReconfiguration_v8a0ext(physicalChannelReconfiguration_v8a0ext);
							setNonCriticalExtensions(nonCriticalExtensions);
						    }
						    
						    /**
						     * Construct with required components.
						     */
						    public V8a0NCEs(PhysicalChannelReconfiguration_v8a0ext_IEs physicalChannelReconfiguration_v8a0ext)
						    {
							setPhysicalChannelReconfiguration_v8a0ext(physicalChannelReconfiguration_v8a0ext);
						    }
						    
						    public void initComponents()
						    {
							mComponents[0] = new PhysicalChannelReconfiguration_v8a0ext_IEs();
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
								return new PhysicalChannelReconfiguration_v8a0ext_IEs();
							    case 1:
								return new NonCriticalExtensions();
							    default:
								throw new InternalError("AbstractCollection.createInstance()");
							}
							
						    }
						    
						    
						    // Methods for field "physicalChannelReconfiguration_v8a0ext"
						    public PhysicalChannelReconfiguration_v8a0ext_IEs getPhysicalChannelReconfiguration_v8a0ext()
						    {
							return (PhysicalChannelReconfiguration_v8a0ext_IEs)mComponents[0];
						    }
						    
						    public void setPhysicalChannelReconfiguration_v8a0ext(PhysicalChannelReconfiguration_v8a0ext_IEs physicalChannelReconfiguration_v8a0ext)
						    {
							mComponents[0] = physicalChannelReconfiguration_v8a0ext;
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
								"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs$V7f0NCEs$V890NCEs$V7g0NCEs$V8a0NCEs$NonCriticalExtensions"
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
							    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs$V7f0NCEs$V890NCEs$V7g0NCEs$V8a0NCEs"
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
										"PhysicalChannelReconfiguration_v8a0ext_IEs"
									    ),
									    new QName (
										"PDU-definitions",
										"PhysicalChannelReconfiguration-v8a0ext-IEs"
									    ),
									    12314,
									    null,
									    new FieldsRef (
										new QName (
										    "rrc.pdu_definitions",
										    "PhysicalChannelReconfiguration_v8a0ext_IEs"
										)
									    ),
									    0,
									    new TagDecodersRef (
										new QName (
										    "rrc.pdu_definitions",
										    "PhysicalChannelReconfiguration_v8a0ext_IEs"
										)
									    ),
									    0
									)
								    ),
								    "physicalChannelReconfiguration-v8a0ext",
								    0,
								    2,
								    null
								),
								new SequenceFieldInfo (
								    new TypeInfoRef (
									new QName (
									    "rrc.pdu_definitions",
									    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs$V7f0NCEs$V890NCEs$V7g0NCEs$V8a0NCEs$NonCriticalExtensions"
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
							"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs$V7f0NCEs$V890NCEs$V7g0NCEs"
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
									    "PhysicalChannelReconfiguration_v7g0ext_IEs"
									),
									new QName (
									    "PDU-definitions",
									    "PhysicalChannelReconfiguration-v7g0ext-IEs"
									),
									12314,
									null,
									new FieldsRef (
									    new QName (
										"rrc.pdu_definitions",
										"PhysicalChannelReconfiguration_v7g0ext_IEs"
									    )
									),
									0,
									new TagDecodersRef (
									    new QName (
										"rrc.pdu_definitions",
										"PhysicalChannelReconfiguration_v7g0ext_IEs"
									    )
									),
									0
								    )
								),
								"physicalChannelReconfiguration-v7g0ext",
								0,
								2,
								null
							    ),
							    new SequenceFieldInfo (
								new TypeInfoRef (
								    new QName (
									"rrc.pdu_definitions",
									"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs$V7f0NCEs$V890NCEs$V7g0NCEs$V8a0NCEs"
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
						    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs$V7f0NCEs$V890NCEs"
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
									"PhysicalChannelReconfiguration_v890ext_IEs"
								    ),
								    new QName (
									"PDU-definitions",
									"PhysicalChannelReconfiguration-v890ext-IEs"
								    ),
								    12314,
								    null,
								    new FieldsRef (
									new QName (
									    "rrc.pdu_definitions",
									    "PhysicalChannelReconfiguration_v890ext_IEs"
									)
								    ),
								    0,
								    new TagDecodersRef (
									new QName (
									    "rrc.pdu_definitions",
									    "PhysicalChannelReconfiguration_v890ext_IEs"
									)
								    ),
								    0
								)
							    ),
							    "physicalChannelReconfiguration-v890ext",
							    0,
							    2,
							    null
							),
							new SequenceFieldInfo (
							    new TypeInfoRef (
								new QName (
								    "rrc.pdu_definitions",
								    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs$V7f0NCEs$V890NCEs$V7g0NCEs"
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
						    (short)0x8001
						}
					    ),
					    new QName (
						"rrc.pdu_definitions",
						"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs$V7f0NCEs"
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
								    "PhysicalChannelReconfiguration_v7f0ext_IEs"
								),
								new QName (
								    "PDU-definitions",
								    "PhysicalChannelReconfiguration-v7f0ext-IEs"
								),
								12314,
								null,
								new FieldsRef (
								    new QName (
									"rrc.pdu_definitions",
									"PhysicalChannelReconfiguration_v7f0ext_IEs"
								    )
								),
								0,
								new TagDecodersRef (
								    new QName (
									"rrc.pdu_definitions",
									"PhysicalChannelReconfiguration_v7f0ext_IEs"
								    )
								),
								0
							    )
							),
							"physicalChannelReconfiguration-v7f0ext",
							0,
							2,
							null
						    ),
						    new SequenceFieldInfo (
							new TypeInfoRef (
							    new QName (
								"rrc.pdu_definitions",
								"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs$V7f0NCEs$V890NCEs"
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
					    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs"
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
								"PhysicalChannelReconfiguration_v7d0ext_IEs"
							    ),
							    new QName (
								"PDU-definitions",
								"PhysicalChannelReconfiguration-v7d0ext-IEs"
							    ),
							    12314,
							    null,
							    new FieldsRef (
								new QName (
								    "rrc.pdu_definitions",
								    "PhysicalChannelReconfiguration_v7d0ext_IEs"
								)
							    ),
							    0,
							    new TagDecodersRef (
								new QName (
								    "rrc.pdu_definitions",
								    "PhysicalChannelReconfiguration_v7d0ext_IEs"
								)
							    ),
							    0
							)
						    ),
						    "physicalChannelReconfiguration-v7d0ext",
						    0,
						    2,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.pdu_definitions",
							    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs$V7f0NCEs"
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
					"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8"
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
							    "PhysicalChannelReconfiguration_r8_IEs"
							),
							new QName (
							    "PDU-definitions",
							    "PhysicalChannelReconfiguration-r8-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.pdu_definitions",
								"PhysicalChannelReconfiguration_r8_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.pdu_definitions",
								"PhysicalChannelReconfiguration_r8_IEs"
							    )
							),
							0
						    )
						),
						"physicalChannelReconfiguration-r8",
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
						"physicalChannelReconfiguration-r8-add-ext",
						1,
						3,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.pdu_definitions",
							"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8$V7d0NCEs"
						    )
						),
						"v7d0NCEs",
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
				    public R9(PhysicalChannelReconfiguration_r9_IEs physicalChannelReconfiguration_r9, 
						    BitString physicalChannelReconfiguration_r9_add_ext, 
						    V950NCEs v950NCEs)
				    {
					setPhysicalChannelReconfiguration_r9(physicalChannelReconfiguration_r9);
					setPhysicalChannelReconfiguration_r9_add_ext(physicalChannelReconfiguration_r9_add_ext);
					setV950NCEs(v950NCEs);
				    }
				    
				    /**
				     * Construct with required components.
				     */
				    public R9(PhysicalChannelReconfiguration_r9_IEs physicalChannelReconfiguration_r9)
				    {
					setPhysicalChannelReconfiguration_r9(physicalChannelReconfiguration_r9);
				    }
				    
				    public void initComponents()
				    {
					mComponents[0] = new PhysicalChannelReconfiguration_r9_IEs();
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
						return new PhysicalChannelReconfiguration_r9_IEs();
					    case 1:
						return new BitString();
					    case 2:
						return new V950NCEs();
					    default:
						throw new InternalError("AbstractCollection.createInstance()");
					}
					
				    }
				    
				    
				    // Methods for field "physicalChannelReconfiguration_r9"
				    public PhysicalChannelReconfiguration_r9_IEs getPhysicalChannelReconfiguration_r9()
				    {
					return (PhysicalChannelReconfiguration_r9_IEs)mComponents[0];
				    }
				    
				    public void setPhysicalChannelReconfiguration_r9(PhysicalChannelReconfiguration_r9_IEs physicalChannelReconfiguration_r9)
				    {
					mComponents[0] = physicalChannelReconfiguration_r9;
				    }
				    
				    
				    // Methods for field "physicalChannelReconfiguration_r9_add_ext"
				    public BitString getPhysicalChannelReconfiguration_r9_add_ext()
				    {
					return (BitString)mComponents[1];
				    }
				    
				    public void setPhysicalChannelReconfiguration_r9_add_ext(BitString physicalChannelReconfiguration_r9_add_ext)
				    {
					mComponents[1] = physicalChannelReconfiguration_r9_add_ext;
				    }
				    
				    public boolean hasPhysicalChannelReconfiguration_r9_add_ext()
				    {
					return componentIsPresent(1);
				    }
				    
				    public void deletePhysicalChannelReconfiguration_r9_add_ext()
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
					public V950NCEs(PhysicalChannelReconfiguration_v950ext_IEs physicalChannelReconfiguration_v950ext, 
							NonCriticalExtensions nonCriticalExtensions)
					{
					    setPhysicalChannelReconfiguration_v950ext(physicalChannelReconfiguration_v950ext);
					    setNonCriticalExtensions(nonCriticalExtensions);
					}
					
					/**
					 * Construct with required components.
					 */
					public V950NCEs(PhysicalChannelReconfiguration_v950ext_IEs physicalChannelReconfiguration_v950ext)
					{
					    setPhysicalChannelReconfiguration_v950ext(physicalChannelReconfiguration_v950ext);
					}
					
					public void initComponents()
					{
					    mComponents[0] = new PhysicalChannelReconfiguration_v950ext_IEs();
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
						    return new PhysicalChannelReconfiguration_v950ext_IEs();
						case 1:
						    return new NonCriticalExtensions();
						default:
						    throw new InternalError("AbstractCollection.createInstance()");
					    }
					    
					}
					
					
					// Methods for field "physicalChannelReconfiguration_v950ext"
					public PhysicalChannelReconfiguration_v950ext_IEs getPhysicalChannelReconfiguration_v950ext()
					{
					    return (PhysicalChannelReconfiguration_v950ext_IEs)mComponents[0];
					}
					
					public void setPhysicalChannelReconfiguration_v950ext(PhysicalChannelReconfiguration_v950ext_IEs physicalChannelReconfiguration_v950ext)
					{
					    mComponents[0] = physicalChannelReconfiguration_v950ext;
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
						    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$R9$V950NCEs$NonCriticalExtensions"
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
						"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$R9$V950NCEs"
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
								    "PhysicalChannelReconfiguration_v950ext_IEs"
								),
								new QName (
								    "PDU-definitions",
								    "PhysicalChannelReconfiguration-v950ext-IEs"
								),
								12314,
								null,
								new FieldsRef (
								    new QName (
									"rrc.pdu_definitions",
									"PhysicalChannelReconfiguration_v950ext_IEs"
								    )
								),
								0,
								new TagDecodersRef (
								    new QName (
									"rrc.pdu_definitions",
									"PhysicalChannelReconfiguration_v950ext_IEs"
								    )
								),
								0
							    )
							),
							"physicalChannelReconfiguration-v950ext",
							0,
							2,
							null
						    ),
						    new SequenceFieldInfo (
							new TypeInfoRef (
							    new QName (
								"rrc.pdu_definitions",
								"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$R9$V950NCEs$NonCriticalExtensions"
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
					    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$R9"
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
								"PhysicalChannelReconfiguration_r9_IEs"
							    ),
							    new QName (
								"PDU-definitions",
								"PhysicalChannelReconfiguration-r9-IEs"
							    ),
							    12314,
							    null,
							    new FieldsRef (
								new QName (
								    "rrc.pdu_definitions",
								    "PhysicalChannelReconfiguration_r9_IEs"
								)
							    ),
							    0,
							    new TagDecodersRef (
								new QName (
								    "rrc.pdu_definitions",
								    "PhysicalChannelReconfiguration_r9_IEs"
								)
							    ),
							    0
							)
						    ),
						    "physicalChannelReconfiguration-r9",
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
						    "physicalChannelReconfiguration-r9-add-ext",
						    1,
						    3,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.pdu_definitions",
							    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$R9$V950NCEs"
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
					public R10(PhysicalChannelReconfiguration_r10_IEs physicalChannelReconfiguration_r10, 
							BitString physicalChannelReconfiguration_r10_add_ext, 
							NonCriticalExtensions nonCriticalExtensions)
					{
					    setPhysicalChannelReconfiguration_r10(physicalChannelReconfiguration_r10);
					    setPhysicalChannelReconfiguration_r10_add_ext(physicalChannelReconfiguration_r10_add_ext);
					    setNonCriticalExtensions(nonCriticalExtensions);
					}
					
					/**
					 * Construct with required components.
					 */
					public R10(PhysicalChannelReconfiguration_r10_IEs physicalChannelReconfiguration_r10)
					{
					    setPhysicalChannelReconfiguration_r10(physicalChannelReconfiguration_r10);
					}
					
					public void initComponents()
					{
					    mComponents[0] = new PhysicalChannelReconfiguration_r10_IEs();
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
						    return new PhysicalChannelReconfiguration_r10_IEs();
						case 1:
						    return new BitString();
						case 2:
						    return new NonCriticalExtensions();
						default:
						    throw new InternalError("AbstractCollection.createInstance()");
					    }
					    
					}
					
					
					// Methods for field "physicalChannelReconfiguration_r10"
					public PhysicalChannelReconfiguration_r10_IEs getPhysicalChannelReconfiguration_r10()
					{
					    return (PhysicalChannelReconfiguration_r10_IEs)mComponents[0];
					}
					
					public void setPhysicalChannelReconfiguration_r10(PhysicalChannelReconfiguration_r10_IEs physicalChannelReconfiguration_r10)
					{
					    mComponents[0] = physicalChannelReconfiguration_r10;
					}
					
					
					// Methods for field "physicalChannelReconfiguration_r10_add_ext"
					public BitString getPhysicalChannelReconfiguration_r10_add_ext()
					{
					    return (BitString)mComponents[1];
					}
					
					public void setPhysicalChannelReconfiguration_r10_add_ext(BitString physicalChannelReconfiguration_r10_add_ext)
					{
					    mComponents[1] = physicalChannelReconfiguration_r10_add_ext;
					}
					
					public boolean hasPhysicalChannelReconfiguration_r10_add_ext()
					{
					    return componentIsPresent(1);
					}
					
					public void deletePhysicalChannelReconfiguration_r10_add_ext()
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
						    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$CriticalExtensions6$R10$NonCriticalExtensions"
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
						"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$CriticalExtensions6$R10"
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
								    "PhysicalChannelReconfiguration_r10_IEs"
								),
								new QName (
								    "PDU-definitions",
								    "PhysicalChannelReconfiguration-r10-IEs"
								),
								12314,
								null,
								new FieldsRef (
								    new QName (
									"rrc.pdu_definitions",
									"PhysicalChannelReconfiguration_r10_IEs"
								    )
								),
								0,
								new TagDecodersRef (
								    new QName (
									"rrc.pdu_definitions",
									"PhysicalChannelReconfiguration_r10_IEs"
								    )
								),
								0
							    )
							),
							"physicalChannelReconfiguration-r10",
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
							"physicalChannelReconfiguration-r10-add-ext",
							1,
							3,
							null
						    ),
						    new SequenceFieldInfo (
							new TypeInfoRef (
							    new QName (
								"rrc.pdu_definitions",
								"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$CriticalExtensions6$R10$NonCriticalExtensions"
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
						"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$CriticalExtensions6$CriticalExtensions7"
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
					    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$CriticalExtensions6"
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
							    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$CriticalExtensions6$R10"
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
							    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$CriticalExtensions6$CriticalExtensions7"
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
					"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5"
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
							"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$R9"
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
							"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$CriticalExtensions6"
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
				    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4"
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
						    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R8"
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
						    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5"
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
				"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3"
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
						"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R7"
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
						"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4"
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
			    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2"
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
					    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$R6"
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
					    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3"
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
			"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1"
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
					"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$R5"
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
					"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2"
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
		    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions"
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
				    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$R4"
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
				    "PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions$CriticalExtensions1"
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
		"PhysicalChannelReconfiguration$Later_than_r3"
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
				"PhysicalChannelReconfiguration$Later_than_r3$CriticalExtensions"
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
	    "PhysicalChannelReconfiguration"
	),
	new QName (
	    "PDU-definitions",
	    "PhysicalChannelReconfiguration"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "PhysicalChannelReconfiguration$R3"
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
			    "PhysicalChannelReconfiguration$Later_than_r3"
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
     * Get the type descriptor (TypeInfo) of 'this' PhysicalChannelReconfiguration object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PhysicalChannelReconfiguration object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PhysicalChannelReconfiguration
