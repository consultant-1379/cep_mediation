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
 * Define the ASN1 Type MeasurementControl from ASN1 Module PDU_definitions.
 * @see Choice
 */

public class MeasurementControl extends Choice {
    
    /**
     * The default constructor.
     */
    public MeasurementControl()
    {
    }
    
    public static final  int  r3_chosen = 1;
    public static final  int  later_than_r3_chosen = 2;
    
    // Methods for field "r3"
    public static MeasurementControl createMeasurementControlWithR3(R3 r3)
    {
	MeasurementControl __object = new MeasurementControl();

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
	public R3(MeasurementControl_r3_IEs measurementControl_r3, 
			V390nonCriticalExtensions v390nonCriticalExtensions)
	{
	    setMeasurementControl_r3(measurementControl_r3);
	    setV390nonCriticalExtensions(v390nonCriticalExtensions);
	}
	
	/**
	 * Construct with required components.
	 */
	public R3(MeasurementControl_r3_IEs measurementControl_r3)
	{
	    setMeasurementControl_r3(measurementControl_r3);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new MeasurementControl_r3_IEs();
	    mComponents[1] = new V390nonCriticalExtensions();
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
		    return new MeasurementControl_r3_IEs();
		case 1:
		    return new V390nonCriticalExtensions();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "measurementControl_r3"
	public MeasurementControl_r3_IEs getMeasurementControl_r3()
	{
	    return (MeasurementControl_r3_IEs)mComponents[0];
	}
	
	public void setMeasurementControl_r3(MeasurementControl_r3_IEs measurementControl_r3)
	{
	    mComponents[0] = measurementControl_r3;
	}
	
	
	// Methods for field "v390nonCriticalExtensions"
	public V390nonCriticalExtensions getV390nonCriticalExtensions()
	{
	    return (V390nonCriticalExtensions)mComponents[1];
	}
	
	public void setV390nonCriticalExtensions(V390nonCriticalExtensions v390nonCriticalExtensions)
	{
	    mComponents[1] = v390nonCriticalExtensions;
	}
	
	public boolean hasV390nonCriticalExtensions()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteV390nonCriticalExtensions()
	{
	    setComponentAbsent(1);
	}
	
	
	
	/**
	 * Define the ASN1 Type V390nonCriticalExtensions from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class V390nonCriticalExtensions extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public V390nonCriticalExtensions()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public V390nonCriticalExtensions(MeasurementControl_v390ext measurementControl_v390ext, 
			    V3a0NCEs v3a0NCEs)
	    {
		setMeasurementControl_v390ext(measurementControl_v390ext);
		setV3a0NCEs(v3a0NCEs);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V390nonCriticalExtensions(MeasurementControl_v390ext measurementControl_v390ext)
	    {
		setMeasurementControl_v390ext(measurementControl_v390ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new MeasurementControl_v390ext();
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
			return new MeasurementControl_v390ext();
		    case 1:
			return new V3a0NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "measurementControl_v390ext"
	    public MeasurementControl_v390ext getMeasurementControl_v390ext()
	    {
		return (MeasurementControl_v390ext)mComponents[0];
	    }
	    
	    public void setMeasurementControl_v390ext(MeasurementControl_v390ext measurementControl_v390ext)
	    {
		mComponents[0] = measurementControl_v390ext;
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
		public V3a0NCEs(MeasurementControl_v3a0ext measurementControl_v3a0ext, 
				LaterNCEs laterNCEs)
		{
		    setMeasurementControl_v3a0ext(measurementControl_v3a0ext);
		    setLaterNCEs(laterNCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public V3a0NCEs(MeasurementControl_v3a0ext measurementControl_v3a0ext)
		{
		    setMeasurementControl_v3a0ext(measurementControl_v3a0ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new MeasurementControl_v3a0ext();
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
			    return new MeasurementControl_v3a0ext();
			case 1:
			    return new LaterNCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "measurementControl_v3a0ext"
		public MeasurementControl_v3a0ext getMeasurementControl_v3a0ext()
		{
		    return (MeasurementControl_v3a0ext)mComponents[0];
		}
		
		public void setMeasurementControl_v3a0ext(MeasurementControl_v3a0ext measurementControl_v3a0ext)
		{
		    mComponents[0] = measurementControl_v3a0ext;
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
		    public LaterNCEs(BitString measurementControl_r3_add_ext, 
				    V4b0NCEs v4b0NCEs)
		    {
			setMeasurementControl_r3_add_ext(measurementControl_r3_add_ext);
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
		    
		    
		    // Methods for field "measurementControl_r3_add_ext"
		    public BitString getMeasurementControl_r3_add_ext()
		    {
			return (BitString)mComponents[0];
		    }
		    
		    public void setMeasurementControl_r3_add_ext(BitString measurementControl_r3_add_ext)
		    {
			mComponents[0] = measurementControl_r3_add_ext;
		    }
		    
		    public boolean hasMeasurementControl_r3_add_ext()
		    {
			return componentIsPresent(0);
		    }
		    
		    public void deleteMeasurementControl_r3_add_ext()
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
			public V4b0NCEs(V590NCEs v590NCEs)
			{
			    setV590NCEs(v590NCEs);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new V590NCEs();
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
				    return new V590NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "v590NCEs"
			public V590NCEs getV590NCEs()
			{
			    return (V590NCEs)mComponents[0];
			}
			
			public void setV590NCEs(V590NCEs v590NCEs)
			{
			    mComponents[0] = v590NCEs;
			}
			
			public boolean hasV590NCEs()
			{
			    return componentIsPresent(0);
			}
			
			public void deleteV590NCEs()
			{
			    setComponentAbsent(0);
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
			    public V590NCEs(MeasurementControl_v590ext_IEs measurementControl_v590ext, 
					    V5b0NCEs v5b0NCEs)
			    {
				setMeasurementControl_v590ext(measurementControl_v590ext);
				setV5b0NCEs(v5b0NCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V590NCEs(MeasurementControl_v590ext_IEs measurementControl_v590ext)
			    {
				setMeasurementControl_v590ext(measurementControl_v590ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new MeasurementControl_v590ext_IEs();
				mComponents[1] = new V5b0NCEs();
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
					return new MeasurementControl_v590ext_IEs();
				    case 1:
					return new V5b0NCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "measurementControl_v590ext"
			    public MeasurementControl_v590ext_IEs getMeasurementControl_v590ext()
			    {
				return (MeasurementControl_v590ext_IEs)mComponents[0];
			    }
			    
			    public void setMeasurementControl_v590ext(MeasurementControl_v590ext_IEs measurementControl_v590ext)
			    {
				mComponents[0] = measurementControl_v590ext;
			    }
			    
			    
			    // Methods for field "v5b0NCEs"
			    public V5b0NCEs getV5b0NCEs()
			    {
				return (V5b0NCEs)mComponents[1];
			    }
			    
			    public void setV5b0NCEs(V5b0NCEs v5b0NCEs)
			    {
				mComponents[1] = v5b0NCEs;
			    }
			    
			    public boolean hasV5b0NCEs()
			    {
				return componentIsPresent(1);
			    }
			    
			    public void deleteV5b0NCEs()
			    {
				setComponentAbsent(1);
			    }
			    
			    
			    
			    /**
			     * Define the ASN1 Type V5b0NCEs from ASN1 Module PDU_definitions.
			     * @see Sequence
			     */
			    public static class V5b0NCEs extends Sequence {
				
				/**
				 * The default constructor.
				 */
				public V5b0NCEs()
				{
				}
				
				/**
				 * Construct with AbstractData components.
				 */
				public V5b0NCEs(MeasurementControl_v5b0ext_IEs measurementControl_v5b0ext, 
						NonCriticalExtensions nonCriticalExtensions)
				{
				    setMeasurementControl_v5b0ext(measurementControl_v5b0ext);
				    setNonCriticalExtensions(nonCriticalExtensions);
				}
				
				/**
				 * Construct with required components.
				 */
				public V5b0NCEs(MeasurementControl_v5b0ext_IEs measurementControl_v5b0ext)
				{
				    setMeasurementControl_v5b0ext(measurementControl_v5b0ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new MeasurementControl_v5b0ext_IEs();
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
					    return new MeasurementControl_v5b0ext_IEs();
					case 1:
					    return new NonCriticalExtensions();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "measurementControl_v5b0ext"
				public MeasurementControl_v5b0ext_IEs getMeasurementControl_v5b0ext()
				{
				    return (MeasurementControl_v5b0ext_IEs)mComponents[0];
				}
				
				public void setMeasurementControl_v5b0ext(MeasurementControl_v5b0ext_IEs measurementControl_v5b0ext)
				{
				    mComponents[0] = measurementControl_v5b0ext;
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
					    "MeasurementControl$R3$V390nonCriticalExtensions$V3a0NCEs$LaterNCEs$V4b0NCEs$V590NCEs$V5b0NCEs$NonCriticalExtensions"
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
					"MeasurementControl$R3$V390nonCriticalExtensions$V3a0NCEs$LaterNCEs$V4b0NCEs$V590NCEs$V5b0NCEs"
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
							    "MeasurementControl_v5b0ext_IEs"
							),
							new QName (
							    "PDU-definitions",
							    "MeasurementControl-v5b0ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.pdu_definitions",
								"MeasurementControl_v5b0ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.pdu_definitions",
								"MeasurementControl_v5b0ext_IEs"
							    )
							),
							0
						    )
						),
						"measurementControl-v5b0ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.pdu_definitions",
							"MeasurementControl$R3$V390nonCriticalExtensions$V3a0NCEs$LaterNCEs$V4b0NCEs$V590NCEs$V5b0NCEs$NonCriticalExtensions"
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
				 * Get the type descriptor (TypeInfo) of 'this' V5b0NCEs object.
				 */
				public TypeInfo getTypeInfo()
				{
				    return c_typeinfo;
				}
				
				/**
				 * Get the static type descriptor (TypeInfo) of 'this' V5b0NCEs object.
				 */
				public static TypeInfo getStaticTypeInfo()
				{
				    return c_typeinfo;
				}
				
			    } // End class definition for V5b0NCEs

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
				    "MeasurementControl$R3$V390nonCriticalExtensions$V3a0NCEs$LaterNCEs$V4b0NCEs$V590NCEs"
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
							"MeasurementControl_v590ext_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"MeasurementControl-v590ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "MeasurementControl_v590ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "MeasurementControl_v590ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "measurementControl-v590ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "MeasurementControl$R3$V390nonCriticalExtensions$V3a0NCEs$LaterNCEs$V4b0NCEs$V590NCEs$V5b0NCEs"
						)
					    ),
					    "v5b0NCEs",
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
				"MeasurementControl$R3$V390nonCriticalExtensions$V3a0NCEs$LaterNCEs$V4b0NCEs"
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
						"MeasurementControl$R3$V390nonCriticalExtensions$V3a0NCEs$LaterNCEs$V4b0NCEs$V590NCEs"
					    )
					),
					"v590NCEs",
					0,
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
			    "MeasurementControl$R3$V390nonCriticalExtensions$V3a0NCEs$LaterNCEs"
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
				    "measurementControl-r3-add-ext",
				    0,
				    3,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "MeasurementControl$R3$V390nonCriticalExtensions$V3a0NCEs$LaterNCEs$V4b0NCEs"
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
			    (short)0x8001
			}
		    ),
		    new QName (
			"rrc.pdu_definitions",
			"MeasurementControl$R3$V390nonCriticalExtensions$V3a0NCEs"
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
					    "MeasurementControl_v3a0ext"
					),
					new QName (
					    "PDU-definitions",
					    "MeasurementControl-v3a0ext"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"MeasurementControl_v3a0ext"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"MeasurementControl_v3a0ext"
					    )
					),
					0
				    )
				),
				"measurementControl-v3a0ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"MeasurementControl$R3$V390nonCriticalExtensions$V3a0NCEs$LaterNCEs"
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
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.pdu_definitions",
		    "MeasurementControl$R3$V390nonCriticalExtensions"
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
					"MeasurementControl_v390ext"
				    ),
				    new QName (
					"PDU-definitions",
					"MeasurementControl-v390ext"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "MeasurementControl_v390ext"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "MeasurementControl_v390ext"
					)
				    ),
				    0
				)
			    ),
			    "measurementControl-v390ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "MeasurementControl$R3$V390nonCriticalExtensions$V3a0NCEs"
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
	     * Get the type descriptor (TypeInfo) of 'this' V390nonCriticalExtensions object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' V390nonCriticalExtensions object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for V390nonCriticalExtensions

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
		"MeasurementControl$R3"
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
				    "MeasurementControl_r3_IEs"
				),
				new QName (
				    "PDU-definitions",
				    "MeasurementControl-r3-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"MeasurementControl_r3_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"MeasurementControl_r3_IEs"
				    )
				),
				0
			    )
			),
			"measurementControl-r3",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"MeasurementControl$R3$V390nonCriticalExtensions"
			    )
			),
			"v390nonCriticalExtensions",
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
    public static MeasurementControl createMeasurementControlWithLater_than_r3(Later_than_r3 later_than_r3)
    {
	MeasurementControl __object = new MeasurementControl();

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
	    public static final  int  later_than_r4_chosen = 2;
	    
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
		public R4(MeasurementControl_r4_IEs measurementControl_r4, 
				V4d0NCEs v4d0NCEs)
		{
		    setMeasurementControl_r4(measurementControl_r4);
		    setV4d0NCEs(v4d0NCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public R4(MeasurementControl_r4_IEs measurementControl_r4)
		{
		    setMeasurementControl_r4(measurementControl_r4);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new MeasurementControl_r4_IEs();
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
			    return new MeasurementControl_r4_IEs();
			case 1:
			    return new V4d0NCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "measurementControl_r4"
		public MeasurementControl_r4_IEs getMeasurementControl_r4()
		{
		    return (MeasurementControl_r4_IEs)mComponents[0];
		}
		
		public void setMeasurementControl_r4(MeasurementControl_r4_IEs measurementControl_r4)
		{
		    mComponents[0] = measurementControl_r4;
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
		    public V4d0NCEs(BitString measurementControl_r4_add_ext, 
				    V590NCEs v590NCEs)
		    {
			setMeasurementControl_r4_add_ext(measurementControl_r4_add_ext);
			setV590NCEs(v590NCEs);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new BitString();
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
				return new BitString();
			    case 1:
				return new V590NCEs();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "measurementControl_r4_add_ext"
		    public BitString getMeasurementControl_r4_add_ext()
		    {
			return (BitString)mComponents[0];
		    }
		    
		    public void setMeasurementControl_r4_add_ext(BitString measurementControl_r4_add_ext)
		    {
			mComponents[0] = measurementControl_r4_add_ext;
		    }
		    
		    public boolean hasMeasurementControl_r4_add_ext()
		    {
			return componentIsPresent(0);
		    }
		    
		    public void deleteMeasurementControl_r4_add_ext()
		    {
			setComponentAbsent(0);
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
			public V590NCEs(MeasurementControl_v590ext_IEs measurementControl_v590ext, 
					V5b0NCEs v5b0NCEs)
			{
			    setMeasurementControl_v590ext(measurementControl_v590ext);
			    setV5b0NCEs(v5b0NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public V590NCEs(MeasurementControl_v590ext_IEs measurementControl_v590ext)
			{
			    setMeasurementControl_v590ext(measurementControl_v590ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new MeasurementControl_v590ext_IEs();
			    mComponents[1] = new V5b0NCEs();
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
				    return new MeasurementControl_v590ext_IEs();
				case 1:
				    return new V5b0NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "measurementControl_v590ext"
			public MeasurementControl_v590ext_IEs getMeasurementControl_v590ext()
			{
			    return (MeasurementControl_v590ext_IEs)mComponents[0];
			}
			
			public void setMeasurementControl_v590ext(MeasurementControl_v590ext_IEs measurementControl_v590ext)
			{
			    mComponents[0] = measurementControl_v590ext;
			}
			
			
			// Methods for field "v5b0NCEs"
			public V5b0NCEs getV5b0NCEs()
			{
			    return (V5b0NCEs)mComponents[1];
			}
			
			public void setV5b0NCEs(V5b0NCEs v5b0NCEs)
			{
			    mComponents[1] = v5b0NCEs;
			}
			
			public boolean hasV5b0NCEs()
			{
			    return componentIsPresent(1);
			}
			
			public void deleteV5b0NCEs()
			{
			    setComponentAbsent(1);
			}
			
			
			
			/**
			 * Define the ASN1 Type V5b0NCEs from ASN1 Module PDU_definitions.
			 * @see Sequence
			 */
			public static class V5b0NCEs extends Sequence {
			    
			    /**
			     * The default constructor.
			     */
			    public V5b0NCEs()
			    {
			    }
			    
			    /**
			     * Construct with AbstractData components.
			     */
			    public V5b0NCEs(MeasurementControl_v5b0ext_IEs measurementControl_v5b0ext, 
					    NonCriticalExtensions nonCriticalExtensions)
			    {
				setMeasurementControl_v5b0ext(measurementControl_v5b0ext);
				setNonCriticalExtensions(nonCriticalExtensions);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V5b0NCEs(MeasurementControl_v5b0ext_IEs measurementControl_v5b0ext)
			    {
				setMeasurementControl_v5b0ext(measurementControl_v5b0ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new MeasurementControl_v5b0ext_IEs();
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
					return new MeasurementControl_v5b0ext_IEs();
				    case 1:
					return new NonCriticalExtensions();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "measurementControl_v5b0ext"
			    public MeasurementControl_v5b0ext_IEs getMeasurementControl_v5b0ext()
			    {
				return (MeasurementControl_v5b0ext_IEs)mComponents[0];
			    }
			    
			    public void setMeasurementControl_v5b0ext(MeasurementControl_v5b0ext_IEs measurementControl_v5b0ext)
			    {
				mComponents[0] = measurementControl_v5b0ext;
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
					"MeasurementControl$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V590NCEs$V5b0NCEs$NonCriticalExtensions"
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
				    "MeasurementControl$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V590NCEs$V5b0NCEs"
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
							"MeasurementControl_v5b0ext_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"MeasurementControl-v5b0ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "MeasurementControl_v5b0ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "MeasurementControl_v5b0ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "measurementControl-v5b0ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "MeasurementControl$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V590NCEs$V5b0NCEs$NonCriticalExtensions"
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
			     * Get the type descriptor (TypeInfo) of 'this' V5b0NCEs object.
			     */
			    public TypeInfo getTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			    /**
			     * Get the static type descriptor (TypeInfo) of 'this' V5b0NCEs object.
			     */
			    public static TypeInfo getStaticTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			} // End class definition for V5b0NCEs

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
				"MeasurementControl$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V590NCEs"
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
						    "MeasurementControl_v590ext_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "MeasurementControl-v590ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"MeasurementControl_v590ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"MeasurementControl_v590ext_IEs"
						    )
						),
						0
					    )
					),
					"measurementControl-v590ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"MeasurementControl$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V590NCEs$V5b0NCEs"
					    )
					),
					"v5b0NCEs",
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
			    "MeasurementControl$Later_than_r3$CriticalExtensions$R4$V4d0NCEs"
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
				    "measurementControl-r4-add-ext",
				    0,
				    3,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "MeasurementControl$Later_than_r3$CriticalExtensions$R4$V4d0NCEs$V590NCEs"
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
			"MeasurementControl$Later_than_r3$CriticalExtensions$R4"
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
					    "MeasurementControl_r4_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "MeasurementControl-r4-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"MeasurementControl_r4_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"MeasurementControl_r4_IEs"
					    )
					),
					0
				    )
				),
				"measurementControl-r4",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"MeasurementControl$Later_than_r3$CriticalExtensions$R4$V4d0NCEs"
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

	    // Methods for field "later_than_r4"
	    public static CriticalExtensions createCriticalExtensionsWithLater_than_r4(Later_than_r4 later_than_r4)
	    {
		CriticalExtensions __object = new CriticalExtensions();

		__object.setLater_than_r4(later_than_r4);
		return __object;
	    }
	    
	    public boolean hasLater_than_r4()
	    {
		return getChosenFlag() == later_than_r4_chosen;
	    }
	    
	    public void setLater_than_r4(Later_than_r4 later_than_r4)
	    {
		setChosenValue(later_than_r4);
		setChosenFlag(later_than_r4_chosen);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type Later_than_r4 from ASN1 Module PDU_definitions.
	     * @see Sequence
	     */
	    public static class Later_than_r4 extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public Later_than_r4()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public Later_than_r4(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier_MSP, 
				CriticalExtensions1 criticalExtensions)
		{
		    setRrc_TransactionIdentifier_MSP(rrc_TransactionIdentifier_MSP);
		    setCriticalExtensions(criticalExtensions);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new rrc.informationelements.RRC_TransactionIdentifier();
		    mComponents[1] = new CriticalExtensions1();
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
			    return new CriticalExtensions1();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "rrc_TransactionIdentifier_MSP"
		public rrc.informationelements.RRC_TransactionIdentifier getRrc_TransactionIdentifier_MSP()
		{
		    return (rrc.informationelements.RRC_TransactionIdentifier)mComponents[0];
		}
		
		public void setRrc_TransactionIdentifier_MSP(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier_MSP)
		{
		    mComponents[0] = rrc_TransactionIdentifier_MSP;
		}
		
		
		// Methods for field "criticalExtensions"
		public CriticalExtensions1 getCriticalExtensions()
		{
		    return (CriticalExtensions1)mComponents[1];
		}
		
		public void setCriticalExtensions(CriticalExtensions1 criticalExtensions)
		{
		    mComponents[1] = criticalExtensions;
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
		    
		    public static final  int  r6_chosen = 1;
		    public static final  int  criticalExtensions_chosen = 2;
		    
		    // Methods for field "r6"
		    public static CriticalExtensions1 createCriticalExtensions1WithR6(R6 r6)
		    {
			CriticalExtensions1 __object = new CriticalExtensions1();

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
			public R6(MeasurementControl_r6_IEs measurementControl_r6, 
					V6a0NCEs v6a0NCEs)
			{
			    setMeasurementControl_r6(measurementControl_r6);
			    setV6a0NCEs(v6a0NCEs);
			}
			
			/**
			 * Construct with required components.
			 */
			public R6(MeasurementControl_r6_IEs measurementControl_r6)
			{
			    setMeasurementControl_r6(measurementControl_r6);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new MeasurementControl_r6_IEs();
			    mComponents[1] = new V6a0NCEs();
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
				    return new MeasurementControl_r6_IEs();
				case 1:
				    return new V6a0NCEs();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "measurementControl_r6"
			public MeasurementControl_r6_IEs getMeasurementControl_r6()
			{
			    return (MeasurementControl_r6_IEs)mComponents[0];
			}
			
			public void setMeasurementControl_r6(MeasurementControl_r6_IEs measurementControl_r6)
			{
			    mComponents[0] = measurementControl_r6;
			}
			
			
			// Methods for field "v6a0NCEs"
			public V6a0NCEs getV6a0NCEs()
			{
			    return (V6a0NCEs)mComponents[1];
			}
			
			public void setV6a0NCEs(V6a0NCEs v6a0NCEs)
			{
			    mComponents[1] = v6a0NCEs;
			}
			
			public boolean hasV6a0NCEs()
			{
			    return componentIsPresent(1);
			}
			
			public void deleteV6a0NCEs()
			{
			    setComponentAbsent(1);
			}
			
			
			
			/**
			 * Define the ASN1 Type V6a0NCEs from ASN1 Module PDU_definitions.
			 * @see Sequence
			 */
			public static class V6a0NCEs extends Sequence {
			    
			    /**
			     * The default constructor.
			     */
			    public V6a0NCEs()
			    {
			    }
			    
			    /**
			     * Construct with AbstractData components.
			     */
			    public V6a0NCEs(MeasurementControl_v6a0ext_IEs measurementControl_v6a0ext, 
					    NonCriticalExtensions nonCriticalExtensions)
			    {
				setMeasurementControl_v6a0ext(measurementControl_v6a0ext);
				setNonCriticalExtensions(nonCriticalExtensions);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public V6a0NCEs(MeasurementControl_v6a0ext_IEs measurementControl_v6a0ext)
			    {
				setMeasurementControl_v6a0ext(measurementControl_v6a0ext);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new MeasurementControl_v6a0ext_IEs();
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
					return new MeasurementControl_v6a0ext_IEs();
				    case 1:
					return new NonCriticalExtensions();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "measurementControl_v6a0ext"
			    public MeasurementControl_v6a0ext_IEs getMeasurementControl_v6a0ext()
			    {
				return (MeasurementControl_v6a0ext_IEs)mComponents[0];
			    }
			    
			    public void setMeasurementControl_v6a0ext(MeasurementControl_v6a0ext_IEs measurementControl_v6a0ext)
			    {
				mComponents[0] = measurementControl_v6a0ext;
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
					"MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$R6$V6a0NCEs$NonCriticalExtensions"
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
				    "MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$R6$V6a0NCEs"
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
							"MeasurementControl_v6a0ext_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"MeasurementControl-v6a0ext-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "MeasurementControl_v6a0ext_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "MeasurementControl_v6a0ext_IEs"
							)
						    ),
						    0
						)
					    ),
					    "measurementControl-v6a0ext",
					    0,
					    2,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$R6$V6a0NCEs$NonCriticalExtensions"
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
			     * Get the type descriptor (TypeInfo) of 'this' V6a0NCEs object.
			     */
			    public TypeInfo getTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			    /**
			     * Get the static type descriptor (TypeInfo) of 'this' V6a0NCEs object.
			     */
			    public static TypeInfo getStaticTypeInfo()
			    {
				return c_typeinfo;
			    }
			    
			} // End class definition for V6a0NCEs

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
				"MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$R6"
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
						    "MeasurementControl_r6_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "MeasurementControl-r6-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"MeasurementControl_r6_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"MeasurementControl_r6_IEs"
						    )
						),
						0
					    )
					),
					"measurementControl-r6",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$R6$V6a0NCEs"
					    )
					),
					"v6a0NCEs",
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
			
			public static final  int  r7_chosen = 1;
			public static final  int  criticalExtensions_chosen = 2;
			
			// Methods for field "r7"
			public static CriticalExtensions2 createCriticalExtensions2WithR7(R7 r7)
			{
			    CriticalExtensions2 __object = new CriticalExtensions2();

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
			    public R7(MeasurementControl_r7_IEs measurementControl_r7, 
					    BitString measurementControl_r7_add_ext, 
					    V7b0NCEs v7b0NCEs)
			    {
				setMeasurementControl_r7(measurementControl_r7);
				setMeasurementControl_r7_add_ext(measurementControl_r7_add_ext);
				setV7b0NCEs(v7b0NCEs);
			    }
			    
			    /**
			     * Construct with required components.
			     */
			    public R7(MeasurementControl_r7_IEs measurementControl_r7)
			    {
				setMeasurementControl_r7(measurementControl_r7);
			    }
			    
			    public void initComponents()
			    {
				mComponents[0] = new MeasurementControl_r7_IEs();
				mComponents[1] = new BitString();
				mComponents[2] = new V7b0NCEs();
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
					return new MeasurementControl_r7_IEs();
				    case 1:
					return new BitString();
				    case 2:
					return new V7b0NCEs();
				    default:
					throw new InternalError("AbstractCollection.createInstance()");
				}
				
			    }
			    
			    
			    // Methods for field "measurementControl_r7"
			    public MeasurementControl_r7_IEs getMeasurementControl_r7()
			    {
				return (MeasurementControl_r7_IEs)mComponents[0];
			    }
			    
			    public void setMeasurementControl_r7(MeasurementControl_r7_IEs measurementControl_r7)
			    {
				mComponents[0] = measurementControl_r7;
			    }
			    
			    
			    // Methods for field "measurementControl_r7_add_ext"
			    public BitString getMeasurementControl_r7_add_ext()
			    {
				return (BitString)mComponents[1];
			    }
			    
			    public void setMeasurementControl_r7_add_ext(BitString measurementControl_r7_add_ext)
			    {
				mComponents[1] = measurementControl_r7_add_ext;
			    }
			    
			    public boolean hasMeasurementControl_r7_add_ext()
			    {
				return componentIsPresent(1);
			    }
			    
			    public void deleteMeasurementControl_r7_add_ext()
			    {
				setComponentAbsent(1);
			    }
			    
			    
			    // Methods for field "v7b0NCEs"
			    public V7b0NCEs getV7b0NCEs()
			    {
				return (V7b0NCEs)mComponents[2];
			    }
			    
			    public void setV7b0NCEs(V7b0NCEs v7b0NCEs)
			    {
				mComponents[2] = v7b0NCEs;
			    }
			    
			    public boolean hasV7b0NCEs()
			    {
				return componentIsPresent(2);
			    }
			    
			    public void deleteV7b0NCEs()
			    {
				setComponentAbsent(2);
			    }
			    
			    
			    
			    /**
			     * Define the ASN1 Type V7b0NCEs from ASN1 Module PDU_definitions.
			     * @see Sequence
			     */
			    public static class V7b0NCEs extends Sequence {
				
				/**
				 * The default constructor.
				 */
				public V7b0NCEs()
				{
				}
				
				/**
				 * Construct with AbstractData components.
				 */
				public V7b0NCEs(MeasurementControl_v7b0ext_IEs measurementControl_v7b0ext, 
						NonCriticalExtensions nonCriticalExtensions)
				{
				    setMeasurementControl_v7b0ext(measurementControl_v7b0ext);
				    setNonCriticalExtensions(nonCriticalExtensions);
				}
				
				/**
				 * Construct with required components.
				 */
				public V7b0NCEs(MeasurementControl_v7b0ext_IEs measurementControl_v7b0ext)
				{
				    setMeasurementControl_v7b0ext(measurementControl_v7b0ext);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new MeasurementControl_v7b0ext_IEs();
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
					    return new MeasurementControl_v7b0ext_IEs();
					case 1:
					    return new NonCriticalExtensions();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "measurementControl_v7b0ext"
				public MeasurementControl_v7b0ext_IEs getMeasurementControl_v7b0ext()
				{
				    return (MeasurementControl_v7b0ext_IEs)mComponents[0];
				}
				
				public void setMeasurementControl_v7b0ext(MeasurementControl_v7b0ext_IEs measurementControl_v7b0ext)
				{
				    mComponents[0] = measurementControl_v7b0ext;
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
					    "MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$R7$V7b0NCEs$NonCriticalExtensions"
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
					"MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$R7$V7b0NCEs"
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
							    "MeasurementControl_v7b0ext_IEs"
							),
							new QName (
							    "PDU-definitions",
							    "MeasurementControl-v7b0ext-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.pdu_definitions",
								"MeasurementControl_v7b0ext_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.pdu_definitions",
								"MeasurementControl_v7b0ext_IEs"
							    )
							),
							0
						    )
						),
						"measurementControl-v7b0ext",
						0,
						2,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.pdu_definitions",
							"MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$R7$V7b0NCEs$NonCriticalExtensions"
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
				 * Get the type descriptor (TypeInfo) of 'this' V7b0NCEs object.
				 */
				public TypeInfo getTypeInfo()
				{
				    return c_typeinfo;
				}
				
				/**
				 * Get the static type descriptor (TypeInfo) of 'this' V7b0NCEs object.
				 */
				public static TypeInfo getStaticTypeInfo()
				{
				    return c_typeinfo;
				}
				
			    } // End class definition for V7b0NCEs

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
				    "MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$R7"
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
							"MeasurementControl_r7_IEs"
						    ),
						    new QName (
							"PDU-definitions",
							"MeasurementControl-r7-IEs"
						    ),
						    12314,
						    null,
						    new FieldsRef (
							new QName (
							    "rrc.pdu_definitions",
							    "MeasurementControl_r7_IEs"
							)
						    ),
						    0,
						    new TagDecodersRef (
							new QName (
							    "rrc.pdu_definitions",
							    "MeasurementControl_r7_IEs"
							)
						    ),
						    0
						)
					    ),
					    "measurementControl-r7",
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
					    "measurementControl-r7-add-ext",
					    1,
					    3,
					    null
					),
					new SequenceFieldInfo (
					    new TypeInfoRef (
						new QName (
						    "rrc.pdu_definitions",
						    "MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$R7$V7b0NCEs"
						)
					    ),
					    "v7b0NCEs",
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
			    
			    public static final  int  r8_chosen = 1;
			    public static final  int  criticalExtensions_chosen = 2;
			    
			    // Methods for field "r8"
			    public static CriticalExtensions3 createCriticalExtensions3WithR8(R8 r8)
			    {
				CriticalExtensions3 __object = new CriticalExtensions3();

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
				public R8(MeasurementControl_r8_IEs measurementControl_r8, 
						BitString measurementControl_r8_add_ext, 
						V8a0NCEs v8a0NCEs)
				{
				    setMeasurementControl_r8(measurementControl_r8);
				    setMeasurementControl_r8_add_ext(measurementControl_r8_add_ext);
				    setV8a0NCEs(v8a0NCEs);
				}
				
				/**
				 * Construct with required components.
				 */
				public R8(MeasurementControl_r8_IEs measurementControl_r8)
				{
				    setMeasurementControl_r8(measurementControl_r8);
				}
				
				public void initComponents()
				{
				    mComponents[0] = new MeasurementControl_r8_IEs();
				    mComponents[1] = new BitString();
				    mComponents[2] = new V8a0NCEs();
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
					    return new MeasurementControl_r8_IEs();
					case 1:
					    return new BitString();
					case 2:
					    return new V8a0NCEs();
					default:
					    throw new InternalError("AbstractCollection.createInstance()");
				    }
				    
				}
				
				
				// Methods for field "measurementControl_r8"
				public MeasurementControl_r8_IEs getMeasurementControl_r8()
				{
				    return (MeasurementControl_r8_IEs)mComponents[0];
				}
				
				public void setMeasurementControl_r8(MeasurementControl_r8_IEs measurementControl_r8)
				{
				    mComponents[0] = measurementControl_r8;
				}
				
				
				// Methods for field "measurementControl_r8_add_ext"
				public BitString getMeasurementControl_r8_add_ext()
				{
				    return (BitString)mComponents[1];
				}
				
				public void setMeasurementControl_r8_add_ext(BitString measurementControl_r8_add_ext)
				{
				    mComponents[1] = measurementControl_r8_add_ext;
				}
				
				public boolean hasMeasurementControl_r8_add_ext()
				{
				    return componentIsPresent(1);
				}
				
				public void deleteMeasurementControl_r8_add_ext()
				{
				    setComponentAbsent(1);
				}
				
				
				// Methods for field "v8a0NCEs"
				public V8a0NCEs getV8a0NCEs()
				{
				    return (V8a0NCEs)mComponents[2];
				}
				
				public void setV8a0NCEs(V8a0NCEs v8a0NCEs)
				{
				    mComponents[2] = v8a0NCEs;
				}
				
				public boolean hasV8a0NCEs()
				{
				    return componentIsPresent(2);
				}
				
				public void deleteV8a0NCEs()
				{
				    setComponentAbsent(2);
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
				    public V8a0NCEs(MeasurementControl_v8a0ext_IEs measurementControl_v8a0ext, 
						    NonCriticalExtensions nonCriticalExtensions)
				    {
					setMeasurementControl_v8a0ext(measurementControl_v8a0ext);
					setNonCriticalExtensions(nonCriticalExtensions);
				    }
				    
				    /**
				     * Construct with required components.
				     */
				    public V8a0NCEs(MeasurementControl_v8a0ext_IEs measurementControl_v8a0ext)
				    {
					setMeasurementControl_v8a0ext(measurementControl_v8a0ext);
				    }
				    
				    public void initComponents()
				    {
					mComponents[0] = new MeasurementControl_v8a0ext_IEs();
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
						return new MeasurementControl_v8a0ext_IEs();
					    case 1:
						return new NonCriticalExtensions();
					    default:
						throw new InternalError("AbstractCollection.createInstance()");
					}
					
				    }
				    
				    
				    // Methods for field "measurementControl_v8a0ext"
				    public MeasurementControl_v8a0ext_IEs getMeasurementControl_v8a0ext()
				    {
					return (MeasurementControl_v8a0ext_IEs)mComponents[0];
				    }
				    
				    public void setMeasurementControl_v8a0ext(MeasurementControl_v8a0ext_IEs measurementControl_v8a0ext)
				    {
					mComponents[0] = measurementControl_v8a0ext;
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
						"MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R8$V8a0NCEs$NonCriticalExtensions"
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
					    "MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R8$V8a0NCEs"
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
								"MeasurementControl_v8a0ext_IEs"
							    ),
							    new QName (
								"PDU-definitions",
								"MeasurementControl-v8a0ext-IEs"
							    ),
							    12314,
							    null,
							    new FieldsRef (
								new QName (
								    "rrc.pdu_definitions",
								    "MeasurementControl_v8a0ext_IEs"
								)
							    ),
							    0,
							    new TagDecodersRef (
								new QName (
								    "rrc.pdu_definitions",
								    "MeasurementControl_v8a0ext_IEs"
								)
							    ),
							    0
							)
						    ),
						    "measurementControl-v8a0ext",
						    0,
						    2,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.pdu_definitions",
							    "MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R8$V8a0NCEs$NonCriticalExtensions"
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
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.pdu_definitions",
					"MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R8"
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
							    "MeasurementControl_r8_IEs"
							),
							new QName (
							    "PDU-definitions",
							    "MeasurementControl-r8-IEs"
							),
							12314,
							null,
							new FieldsRef (
							    new QName (
								"rrc.pdu_definitions",
								"MeasurementControl_r8_IEs"
							    )
							),
							0,
							new TagDecodersRef (
							    new QName (
								"rrc.pdu_definitions",
								"MeasurementControl_r8_IEs"
							    )
							),
							0
						    )
						),
						"measurementControl-r8",
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
						"measurementControl-r8-add-ext",
						1,
						3,
						null
					    ),
					    new SequenceFieldInfo (
						new TypeInfoRef (
						    new QName (
							"rrc.pdu_definitions",
							"MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R8$V8a0NCEs"
						    )
						),
						"v8a0NCEs",
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
				
				public static final  int  r9_chosen = 1;
				public static final  int  criticalExtensions_chosen = 2;
				
				// Methods for field "r9"
				public static CriticalExtensions4 createCriticalExtensions4WithR9(R9 r9)
				{
				    CriticalExtensions4 __object = new CriticalExtensions4();

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
				    public R9(MeasurementControl_r9_IEs measurementControl_r9, 
						    BitString measurementControl_r9_add_ext, 
						    V970NCEs v970NCEs)
				    {
					setMeasurementControl_r9(measurementControl_r9);
					setMeasurementControl_r9_add_ext(measurementControl_r9_add_ext);
					setV970NCEs(v970NCEs);
				    }
				    
				    /**
				     * Construct with required components.
				     */
				    public R9(MeasurementControl_r9_IEs measurementControl_r9)
				    {
					setMeasurementControl_r9(measurementControl_r9);
				    }
				    
				    public void initComponents()
				    {
					mComponents[0] = new MeasurementControl_r9_IEs();
					mComponents[1] = new BitString();
					mComponents[2] = new V970NCEs();
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
						return new MeasurementControl_r9_IEs();
					    case 1:
						return new BitString();
					    case 2:
						return new V970NCEs();
					    default:
						throw new InternalError("AbstractCollection.createInstance()");
					}
					
				    }
				    
				    
				    // Methods for field "measurementControl_r9"
				    public MeasurementControl_r9_IEs getMeasurementControl_r9()
				    {
					return (MeasurementControl_r9_IEs)mComponents[0];
				    }
				    
				    public void setMeasurementControl_r9(MeasurementControl_r9_IEs measurementControl_r9)
				    {
					mComponents[0] = measurementControl_r9;
				    }
				    
				    
				    // Methods for field "measurementControl_r9_add_ext"
				    public BitString getMeasurementControl_r9_add_ext()
				    {
					return (BitString)mComponents[1];
				    }
				    
				    public void setMeasurementControl_r9_add_ext(BitString measurementControl_r9_add_ext)
				    {
					mComponents[1] = measurementControl_r9_add_ext;
				    }
				    
				    public boolean hasMeasurementControl_r9_add_ext()
				    {
					return componentIsPresent(1);
				    }
				    
				    public void deleteMeasurementControl_r9_add_ext()
				    {
					setComponentAbsent(1);
				    }
				    
				    
				    // Methods for field "v970NCEs"
				    public V970NCEs getV970NCEs()
				    {
					return (V970NCEs)mComponents[2];
				    }
				    
				    public void setV970NCEs(V970NCEs v970NCEs)
				    {
					mComponents[2] = v970NCEs;
				    }
				    
				    public boolean hasV970NCEs()
				    {
					return componentIsPresent(2);
				    }
				    
				    public void deleteV970NCEs()
				    {
					setComponentAbsent(2);
				    }
				    
				    
				    
				    /**
				     * Define the ASN1 Type V970NCEs from ASN1 Module PDU_definitions.
				     * @see Sequence
				     */
				    public static class V970NCEs extends Sequence {
					
					/**
					 * The default constructor.
					 */
					public V970NCEs()
					{
					}
					
					/**
					 * Construct with AbstractData components.
					 */
					public V970NCEs(MeasurementControl_v970ext_IEs measurementControl_v970ext, 
							NonCriticalExtensions nonCriticalExtensions)
					{
					    setMeasurementControl_v970ext(measurementControl_v970ext);
					    setNonCriticalExtensions(nonCriticalExtensions);
					}
					
					/**
					 * Construct with required components.
					 */
					public V970NCEs(MeasurementControl_v970ext_IEs measurementControl_v970ext)
					{
					    setMeasurementControl_v970ext(measurementControl_v970ext);
					}
					
					public void initComponents()
					{
					    mComponents[0] = new MeasurementControl_v970ext_IEs();
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
						    return new MeasurementControl_v970ext_IEs();
						case 1:
						    return new NonCriticalExtensions();
						default:
						    throw new InternalError("AbstractCollection.createInstance()");
					    }
					    
					}
					
					
					// Methods for field "measurementControl_v970ext"
					public MeasurementControl_v970ext_IEs getMeasurementControl_v970ext()
					{
					    return (MeasurementControl_v970ext_IEs)mComponents[0];
					}
					
					public void setMeasurementControl_v970ext(MeasurementControl_v970ext_IEs measurementControl_v970ext)
					{
					    mComponents[0] = measurementControl_v970ext;
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
						    "MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R9$V970NCEs$NonCriticalExtensions"
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
						"MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R9$V970NCEs"
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
								    "MeasurementControl_v970ext_IEs"
								),
								new QName (
								    "PDU-definitions",
								    "MeasurementControl-v970ext-IEs"
								),
								12314,
								null,
								new FieldsRef (
								    new QName (
									"rrc.pdu_definitions",
									"MeasurementControl_v970ext_IEs"
								    )
								),
								0,
								new TagDecodersRef (
								    new QName (
									"rrc.pdu_definitions",
									"MeasurementControl_v970ext_IEs"
								    )
								),
								0
							    )
							),
							"measurementControl-v970ext",
							0,
							2,
							null
						    ),
						    new SequenceFieldInfo (
							new TypeInfoRef (
							    new QName (
								"rrc.pdu_definitions",
								"MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R9$V970NCEs$NonCriticalExtensions"
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
					 * Get the type descriptor (TypeInfo) of 'this' V970NCEs object.
					 */
					public TypeInfo getTypeInfo()
					{
					    return c_typeinfo;
					}
					
					/**
					 * Get the static type descriptor (TypeInfo) of 'this' V970NCEs object.
					 */
					public static TypeInfo getStaticTypeInfo()
					{
					    return c_typeinfo;
					}
					
				    } // End class definition for V970NCEs

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
					    "MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R9"
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
								"MeasurementControl_r9_IEs"
							    ),
							    new QName (
								"PDU-definitions",
								"MeasurementControl-r9-IEs"
							    ),
							    12314,
							    null,
							    new FieldsRef (
								new QName (
								    "rrc.pdu_definitions",
								    "MeasurementControl_r9_IEs"
								)
							    ),
							    0,
							    new TagDecodersRef (
								new QName (
								    "rrc.pdu_definitions",
								    "MeasurementControl_r9_IEs"
								)
							    ),
							    0
							)
						    ),
						    "measurementControl-r9",
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
						    "measurementControl-r9-add-ext",
						    1,
						    3,
						    null
						),
						new SequenceFieldInfo (
						    new TypeInfoRef (
							new QName (
							    "rrc.pdu_definitions",
							    "MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R9$V970NCEs"
							)
						    ),
						    "v970NCEs",
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
				    
				    public static final  int  r10_chosen = 1;
				    public static final  int  criticalExtensions_chosen = 2;
				    
				    // Methods for field "r10"
				    public static CriticalExtensions5 createCriticalExtensions5WithR10(R10 r10)
				    {
					CriticalExtensions5 __object = new CriticalExtensions5();

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
					public R10(MeasurementControl_r10_IEs measurementControl_r10, 
							BitString measurementControl_r10_add_ext, 
							NonCriticalExtensions nonCriticalExtensions)
					{
					    setMeasurementControl_r10(measurementControl_r10);
					    setMeasurementControl_r10_add_ext(measurementControl_r10_add_ext);
					    setNonCriticalExtensions(nonCriticalExtensions);
					}
					
					/**
					 * Construct with required components.
					 */
					public R10(MeasurementControl_r10_IEs measurementControl_r10)
					{
					    setMeasurementControl_r10(measurementControl_r10);
					}
					
					public void initComponents()
					{
					    mComponents[0] = new MeasurementControl_r10_IEs();
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
						    return new MeasurementControl_r10_IEs();
						case 1:
						    return new BitString();
						case 2:
						    return new NonCriticalExtensions();
						default:
						    throw new InternalError("AbstractCollection.createInstance()");
					    }
					    
					}
					
					
					// Methods for field "measurementControl_r10"
					public MeasurementControl_r10_IEs getMeasurementControl_r10()
					{
					    return (MeasurementControl_r10_IEs)mComponents[0];
					}
					
					public void setMeasurementControl_r10(MeasurementControl_r10_IEs measurementControl_r10)
					{
					    mComponents[0] = measurementControl_r10;
					}
					
					
					// Methods for field "measurementControl_r10_add_ext"
					public BitString getMeasurementControl_r10_add_ext()
					{
					    return (BitString)mComponents[1];
					}
					
					public void setMeasurementControl_r10_add_ext(BitString measurementControl_r10_add_ext)
					{
					    mComponents[1] = measurementControl_r10_add_ext;
					}
					
					public boolean hasMeasurementControl_r10_add_ext()
					{
					    return componentIsPresent(1);
					}
					
					public void deleteMeasurementControl_r10_add_ext()
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
						    "MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$R10$NonCriticalExtensions"
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
						"MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$R10"
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
								    "MeasurementControl_r10_IEs"
								),
								new QName (
								    "PDU-definitions",
								    "MeasurementControl-r10-IEs"
								),
								12314,
								null,
								new FieldsRef (
								    new QName (
									"rrc.pdu_definitions",
									"MeasurementControl_r10_IEs"
								    )
								),
								0,
								new TagDecodersRef (
								    new QName (
									"rrc.pdu_definitions",
									"MeasurementControl_r10_IEs"
								    )
								),
								0
							    )
							),
							"measurementControl-r10",
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
							"measurementControl-r10-add-ext",
							1,
							3,
							null
						    ),
						    new SequenceFieldInfo (
							new TypeInfoRef (
							    new QName (
								"rrc.pdu_definitions",
								"MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$R10$NonCriticalExtensions"
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
				     * @see Sequence
				     */
				    public static class CriticalExtensions6 extends Sequence {
					
					/**
					 * The default constructor.
					 */
					public CriticalExtensions6()
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
						"MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$CriticalExtensions6"
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
					    case r10_chosen:
						return new R10();
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
					    "MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5"
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
							    "MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$R10"
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
							    "MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5$CriticalExtensions6"
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
					case r9_chosen:
					    return new R9();
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
					"MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4"
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
							"MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$R9"
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
							"MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4$CriticalExtensions5"
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
				    case r8_chosen:
					return new R8();
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
				    "MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3"
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
						    "MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$R8"
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
						    "MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3$CriticalExtensions4"
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
				case r7_chosen:
				    return new R7();
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
				"MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2"
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
						"MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$R7"
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
						"MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2$CriticalExtensions3"
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
			    case r6_chosen:
				return new R6();
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
			    "MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1"
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
					    "MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$R6"
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
					    "MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1$CriticalExtensions2"
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
			"MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4"
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
				"rrc-TransactionIdentifier-MSP",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4$CriticalExtensions1"
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
		 * Get the type descriptor (TypeInfo) of 'this' Later_than_r4 object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' Later_than_r4 object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for Later_than_r4

	    // Method to create a specific choice instance
	    public AbstractData createInstance(int chosen)
	    {
		switch (chosen) {
		    case r4_chosen:
			return new R4();
		    case later_than_r4_chosen:
			return new Later_than_r4();
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
		    "MeasurementControl$Later_than_r3$CriticalExtensions"
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
				    "MeasurementControl$Later_than_r3$CriticalExtensions$R4"
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
				    "MeasurementControl$Later_than_r3$CriticalExtensions$Later_than_r4"
				)
			    ),
			    "later-than-r4",
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
		"MeasurementControl$Later_than_r3"
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
				"MeasurementControl$Later_than_r3$CriticalExtensions"
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
	    "MeasurementControl"
	),
	new QName (
	    "PDU-definitions",
	    "MeasurementControl"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "MeasurementControl$R3"
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
			    "MeasurementControl$Later_than_r3"
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
     * Get the type descriptor (TypeInfo) of 'this' MeasurementControl object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasurementControl object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasurementControl
