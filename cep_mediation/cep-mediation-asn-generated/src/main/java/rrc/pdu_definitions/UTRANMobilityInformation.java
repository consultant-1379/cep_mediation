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
 * Define the ASN1 Type UTRANMobilityInformation from ASN1 Module PDU_definitions.
 * @see Choice
 */

public class UTRANMobilityInformation extends Choice {
    
    /**
     * The default constructor.
     */
    public UTRANMobilityInformation()
    {
    }
    
    public static final  int  r3_chosen = 1;
    public static final  int  later_than_r3_chosen = 2;
    
    // Methods for field "r3"
    public static UTRANMobilityInformation createUTRANMobilityInformationWithR3(R3 r3)
    {
	UTRANMobilityInformation __object = new UTRANMobilityInformation();

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
	public R3(UTRANMobilityInformation_r3_IEs utranMobilityInformation_r3, 
			V3a0NCEs v3a0NCEs)
	{
	    setUtranMobilityInformation_r3(utranMobilityInformation_r3);
	    setV3a0NCEs(v3a0NCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public R3(UTRANMobilityInformation_r3_IEs utranMobilityInformation_r3)
	{
	    setUtranMobilityInformation_r3(utranMobilityInformation_r3);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new UTRANMobilityInformation_r3_IEs();
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
		    return new UTRANMobilityInformation_r3_IEs();
		case 1:
		    return new V3a0NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "utranMobilityInformation_r3"
	public UTRANMobilityInformation_r3_IEs getUtranMobilityInformation_r3()
	{
	    return (UTRANMobilityInformation_r3_IEs)mComponents[0];
	}
	
	public void setUtranMobilityInformation_r3(UTRANMobilityInformation_r3_IEs utranMobilityInformation_r3)
	{
	    mComponents[0] = utranMobilityInformation_r3;
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
	    public V3a0NCEs(UTRANMobilityInformation_v3a0ext_IEs utranMobilityInformation_v3a0ext, 
			    LaterNCEs laterNCEs)
	    {
		setUtranMobilityInformation_v3a0ext(utranMobilityInformation_v3a0ext);
		setLaterNCEs(laterNCEs);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V3a0NCEs(UTRANMobilityInformation_v3a0ext_IEs utranMobilityInformation_v3a0ext)
	    {
		setUtranMobilityInformation_v3a0ext(utranMobilityInformation_v3a0ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new UTRANMobilityInformation_v3a0ext_IEs();
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
			return new UTRANMobilityInformation_v3a0ext_IEs();
		    case 1:
			return new LaterNCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "utranMobilityInformation_v3a0ext"
	    public UTRANMobilityInformation_v3a0ext_IEs getUtranMobilityInformation_v3a0ext()
	    {
		return (UTRANMobilityInformation_v3a0ext_IEs)mComponents[0];
	    }
	    
	    public void setUtranMobilityInformation_v3a0ext(UTRANMobilityInformation_v3a0ext_IEs utranMobilityInformation_v3a0ext)
	    {
		mComponents[0] = utranMobilityInformation_v3a0ext;
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
		public LaterNCEs(BitString utranMobilityInformation_r3_add_ext, 
				V690NCEs v690NCEs)
		{
		    setUtranMobilityInformation_r3_add_ext(utranMobilityInformation_r3_add_ext);
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
		
		
		// Methods for field "utranMobilityInformation_r3_add_ext"
		public BitString getUtranMobilityInformation_r3_add_ext()
		{
		    return (BitString)mComponents[0];
		}
		
		public void setUtranMobilityInformation_r3_add_ext(BitString utranMobilityInformation_r3_add_ext)
		{
		    mComponents[0] = utranMobilityInformation_r3_add_ext;
		}
		
		public boolean hasUtranMobilityInformation_r3_add_ext()
		{
		    return componentIsPresent(0);
		}
		
		public void deleteUtranMobilityInformation_r3_add_ext()
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
		    public V690NCEs(UtranMobilityInformation_v690ext_IEs utranMobilityInformation_v690ext, 
				    V860NonCriticalExtentions v860NonCriticalExtentions)
		    {
			setUtranMobilityInformation_v690ext(utranMobilityInformation_v690ext);
			setV860NonCriticalExtentions(v860NonCriticalExtentions);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public V690NCEs(UtranMobilityInformation_v690ext_IEs utranMobilityInformation_v690ext)
		    {
			setUtranMobilityInformation_v690ext(utranMobilityInformation_v690ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new UtranMobilityInformation_v690ext_IEs();
			mComponents[1] = new V860NonCriticalExtentions();
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
				return new UtranMobilityInformation_v690ext_IEs();
			    case 1:
				return new V860NonCriticalExtentions();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "utranMobilityInformation_v690ext"
		    public UtranMobilityInformation_v690ext_IEs getUtranMobilityInformation_v690ext()
		    {
			return (UtranMobilityInformation_v690ext_IEs)mComponents[0];
		    }
		    
		    public void setUtranMobilityInformation_v690ext(UtranMobilityInformation_v690ext_IEs utranMobilityInformation_v690ext)
		    {
			mComponents[0] = utranMobilityInformation_v690ext;
		    }
		    
		    
		    // Methods for field "v860NonCriticalExtentions"
		    public V860NonCriticalExtentions getV860NonCriticalExtentions()
		    {
			return (V860NonCriticalExtentions)mComponents[1];
		    }
		    
		    public void setV860NonCriticalExtentions(V860NonCriticalExtentions v860NonCriticalExtentions)
		    {
			mComponents[1] = v860NonCriticalExtentions;
		    }
		    
		    public boolean hasV860NonCriticalExtentions()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteV860NonCriticalExtentions()
		    {
			setComponentAbsent(1);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type V860NonCriticalExtentions from ASN1 Module PDU_definitions.
		     * @see Sequence
		     */
		    public static class V860NonCriticalExtentions extends Sequence {
			
			/**
			 * The default constructor.
			 */
			public V860NonCriticalExtentions()
			{
			}
			
			/**
			 * Construct with AbstractData components.
			 */
			public V860NonCriticalExtentions(UTRANMobilityInformation_v860ext1_IEs utranMobilityInformation_v860ext, 
					NonCriticalExtensions nonCriticalExtensions)
			{
			    setUtranMobilityInformation_v860ext(utranMobilityInformation_v860ext);
			    setNonCriticalExtensions(nonCriticalExtensions);
			}
			
			/**
			 * Construct with required components.
			 */
			public V860NonCriticalExtentions(UTRANMobilityInformation_v860ext1_IEs utranMobilityInformation_v860ext)
			{
			    setUtranMobilityInformation_v860ext(utranMobilityInformation_v860ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new UTRANMobilityInformation_v860ext1_IEs();
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
				    return new UTRANMobilityInformation_v860ext1_IEs();
				case 1:
				    return new NonCriticalExtensions();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "utranMobilityInformation_v860ext"
			public UTRANMobilityInformation_v860ext1_IEs getUtranMobilityInformation_v860ext()
			{
			    return (UTRANMobilityInformation_v860ext1_IEs)mComponents[0];
			}
			
			public void setUtranMobilityInformation_v860ext(UTRANMobilityInformation_v860ext1_IEs utranMobilityInformation_v860ext)
			{
			    mComponents[0] = utranMobilityInformation_v860ext;
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
				    "UTRANMobilityInformation$R3$V3a0NCEs$LaterNCEs$V690NCEs$V860NonCriticalExtentions$NonCriticalExtensions"
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
				"UTRANMobilityInformation$R3$V3a0NCEs$LaterNCEs$V690NCEs$V860NonCriticalExtentions"
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
						    "UTRANMobilityInformation_v860ext1_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "UTRANMobilityInformation-v860ext1-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"UTRANMobilityInformation_v860ext1_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"UTRANMobilityInformation_v860ext1_IEs"
						    )
						),
						0
					    )
					),
					"utranMobilityInformation-v860ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"UTRANMobilityInformation$R3$V3a0NCEs$LaterNCEs$V690NCEs$V860NonCriticalExtentions$NonCriticalExtensions"
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
			 * Get the type descriptor (TypeInfo) of 'this' V860NonCriticalExtentions object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' V860NonCriticalExtentions object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for V860NonCriticalExtentions

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
			    "UTRANMobilityInformation$R3$V3a0NCEs$LaterNCEs$V690NCEs"
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
						"UtranMobilityInformation_v690ext_IEs"
					    ),
					    new QName (
						"PDU-definitions",
						"UtranMobilityInformation-v690ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.pdu_definitions",
						    "UtranMobilityInformation_v690ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.pdu_definitions",
						    "UtranMobilityInformation_v690ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "utranMobilityInformation-v690ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "UTRANMobilityInformation$R3$V3a0NCEs$LaterNCEs$V690NCEs$V860NonCriticalExtentions"
					)
				    ),
				    "v860NonCriticalExtentions",
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
			"UTRANMobilityInformation$R3$V3a0NCEs$LaterNCEs"
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
				"utranMobilityInformation-r3-add-ext",
				0,
				3,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"UTRANMobilityInformation$R3$V3a0NCEs$LaterNCEs$V690NCEs"
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
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.pdu_definitions",
		    "UTRANMobilityInformation$R3$V3a0NCEs"
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
					"UTRANMobilityInformation_v3a0ext_IEs"
				    ),
				    new QName (
					"PDU-definitions",
					"UTRANMobilityInformation-v3a0ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.pdu_definitions",
					    "UTRANMobilityInformation_v3a0ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.pdu_definitions",
					    "UTRANMobilityInformation_v3a0ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "utranMobilityInformation-v3a0ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "UTRANMobilityInformation$R3$V3a0NCEs$LaterNCEs"
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
		"UTRANMobilityInformation$R3"
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
				    "UTRANMobilityInformation_r3_IEs"
				),
				new QName (
				    "PDU-definitions",
				    "UTRANMobilityInformation-r3-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.pdu_definitions",
					"UTRANMobilityInformation_r3_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.pdu_definitions",
					"UTRANMobilityInformation_r3_IEs"
				    )
				),
				0
			    )
			),
			"utranMobilityInformation-r3",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"UTRANMobilityInformation$R3$V3a0NCEs"
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
    public static UTRANMobilityInformation createUTRANMobilityInformationWithLater_than_r3(Later_than_r3 later_than_r3)
    {
	UTRANMobilityInformation __object = new UTRANMobilityInformation();

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
	    
	    public static final  int  r5_chosen = 1;
	    public static final  int  criticalExtensions_chosen = 2;
	    
	    // Methods for field "r5"
	    public static CriticalExtensions createCriticalExtensionsWithR5(R5 r5)
	    {
		CriticalExtensions __object = new CriticalExtensions();

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
		public R5(UTRANMobilityInformation_r5_IEs utranMobilityInformation_r5, 
				V690NCEs v690NCEs)
		{
		    setUtranMobilityInformation_r5(utranMobilityInformation_r5);
		    setV690NCEs(v690NCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public R5(UTRANMobilityInformation_r5_IEs utranMobilityInformation_r5)
		{
		    setUtranMobilityInformation_r5(utranMobilityInformation_r5);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new UTRANMobilityInformation_r5_IEs();
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
			    return new UTRANMobilityInformation_r5_IEs();
			case 1:
			    return new V690NCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "utranMobilityInformation_r5"
		public UTRANMobilityInformation_r5_IEs getUtranMobilityInformation_r5()
		{
		    return (UTRANMobilityInformation_r5_IEs)mComponents[0];
		}
		
		public void setUtranMobilityInformation_r5(UTRANMobilityInformation_r5_IEs utranMobilityInformation_r5)
		{
		    mComponents[0] = utranMobilityInformation_r5;
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
		    public V690NCEs(UtranMobilityInformation_v690ext_IEs utranMobilityInformation_v690ext, 
				    V860NonCriticalExtentions v860NonCriticalExtentions)
		    {
			setUtranMobilityInformation_v690ext(utranMobilityInformation_v690ext);
			setV860NonCriticalExtentions(v860NonCriticalExtentions);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public V690NCEs(UtranMobilityInformation_v690ext_IEs utranMobilityInformation_v690ext)
		    {
			setUtranMobilityInformation_v690ext(utranMobilityInformation_v690ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new UtranMobilityInformation_v690ext_IEs();
			mComponents[1] = new V860NonCriticalExtentions();
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
				return new UtranMobilityInformation_v690ext_IEs();
			    case 1:
				return new V860NonCriticalExtentions();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "utranMobilityInformation_v690ext"
		    public UtranMobilityInformation_v690ext_IEs getUtranMobilityInformation_v690ext()
		    {
			return (UtranMobilityInformation_v690ext_IEs)mComponents[0];
		    }
		    
		    public void setUtranMobilityInformation_v690ext(UtranMobilityInformation_v690ext_IEs utranMobilityInformation_v690ext)
		    {
			mComponents[0] = utranMobilityInformation_v690ext;
		    }
		    
		    
		    // Methods for field "v860NonCriticalExtentions"
		    public V860NonCriticalExtentions getV860NonCriticalExtentions()
		    {
			return (V860NonCriticalExtentions)mComponents[1];
		    }
		    
		    public void setV860NonCriticalExtentions(V860NonCriticalExtentions v860NonCriticalExtentions)
		    {
			mComponents[1] = v860NonCriticalExtentions;
		    }
		    
		    public boolean hasV860NonCriticalExtentions()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteV860NonCriticalExtentions()
		    {
			setComponentAbsent(1);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type V860NonCriticalExtentions from ASN1 Module PDU_definitions.
		     * @see Sequence
		     */
		    public static class V860NonCriticalExtentions extends Sequence {
			
			/**
			 * The default constructor.
			 */
			public V860NonCriticalExtentions()
			{
			}
			
			/**
			 * Construct with AbstractData components.
			 */
			public V860NonCriticalExtentions(UTRANMobilityInformation_v860ext1_IEs utranMobilityInformation_v860ext, 
					NonCriticalExtensions nonCriticalExtensions)
			{
			    setUtranMobilityInformation_v860ext(utranMobilityInformation_v860ext);
			    setNonCriticalExtensions(nonCriticalExtensions);
			}
			
			/**
			 * Construct with required components.
			 */
			public V860NonCriticalExtentions(UTRANMobilityInformation_v860ext1_IEs utranMobilityInformation_v860ext)
			{
			    setUtranMobilityInformation_v860ext(utranMobilityInformation_v860ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new UTRANMobilityInformation_v860ext1_IEs();
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
				    return new UTRANMobilityInformation_v860ext1_IEs();
				case 1:
				    return new NonCriticalExtensions();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "utranMobilityInformation_v860ext"
			public UTRANMobilityInformation_v860ext1_IEs getUtranMobilityInformation_v860ext()
			{
			    return (UTRANMobilityInformation_v860ext1_IEs)mComponents[0];
			}
			
			public void setUtranMobilityInformation_v860ext(UTRANMobilityInformation_v860ext1_IEs utranMobilityInformation_v860ext)
			{
			    mComponents[0] = utranMobilityInformation_v860ext;
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
				    "UTRANMobilityInformation$Later_than_r3$CriticalExtensions$R5$V690NCEs$V860NonCriticalExtentions$NonCriticalExtensions"
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
				"UTRANMobilityInformation$Later_than_r3$CriticalExtensions$R5$V690NCEs$V860NonCriticalExtentions"
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
						    "UTRANMobilityInformation_v860ext1_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "UTRANMobilityInformation-v860ext1-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"UTRANMobilityInformation_v860ext1_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"UTRANMobilityInformation_v860ext1_IEs"
						    )
						),
						0
					    )
					),
					"utranMobilityInformation-v860ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"UTRANMobilityInformation$Later_than_r3$CriticalExtensions$R5$V690NCEs$V860NonCriticalExtentions$NonCriticalExtensions"
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
			 * Get the type descriptor (TypeInfo) of 'this' V860NonCriticalExtentions object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' V860NonCriticalExtentions object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for V860NonCriticalExtentions

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
			    "UTRANMobilityInformation$Later_than_r3$CriticalExtensions$R5$V690NCEs"
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
						"UtranMobilityInformation_v690ext_IEs"
					    ),
					    new QName (
						"PDU-definitions",
						"UtranMobilityInformation-v690ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.pdu_definitions",
						    "UtranMobilityInformation_v690ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.pdu_definitions",
						    "UtranMobilityInformation_v690ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "utranMobilityInformation-v690ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "UTRANMobilityInformation$Later_than_r3$CriticalExtensions$R5$V690NCEs$V860NonCriticalExtentions"
					)
				    ),
				    "v860NonCriticalExtentions",
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
			"UTRANMobilityInformation$Later_than_r3$CriticalExtensions$R5"
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
					    "UTRANMobilityInformation_r5_IEs"
					),
					new QName (
					    "PDU-definitions",
					    "UTRANMobilityInformation-r5-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.pdu_definitions",
						"UTRANMobilityInformation_r5_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.pdu_definitions",
						"UTRANMobilityInformation_r5_IEs"
					    )
					),
					0
				    )
				),
				"utranMobilityInformation-r5",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"UTRANMobilityInformation$Later_than_r3$CriticalExtensions$R5$V690NCEs"
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
		    public R7(UTRANMobilityInformation_r7_IEs utranMobilityInformation_r7, 
				    BitString utranMobilityInformation_r7_add_ext, 
				    V860NCEs v860NCEs)
		    {
			setUtranMobilityInformation_r7(utranMobilityInformation_r7);
			setUtranMobilityInformation_r7_add_ext(utranMobilityInformation_r7_add_ext);
			setV860NCEs(v860NCEs);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public R7(UTRANMobilityInformation_r7_IEs utranMobilityInformation_r7)
		    {
			setUtranMobilityInformation_r7(utranMobilityInformation_r7);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new UTRANMobilityInformation_r7_IEs();
			mComponents[1] = new BitString();
			mComponents[2] = new V860NCEs();
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
				return new UTRANMobilityInformation_r7_IEs();
			    case 1:
				return new BitString();
			    case 2:
				return new V860NCEs();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "utranMobilityInformation_r7"
		    public UTRANMobilityInformation_r7_IEs getUtranMobilityInformation_r7()
		    {
			return (UTRANMobilityInformation_r7_IEs)mComponents[0];
		    }
		    
		    public void setUtranMobilityInformation_r7(UTRANMobilityInformation_r7_IEs utranMobilityInformation_r7)
		    {
			mComponents[0] = utranMobilityInformation_r7;
		    }
		    
		    
		    // Methods for field "utranMobilityInformation_r7_add_ext"
		    public BitString getUtranMobilityInformation_r7_add_ext()
		    {
			return (BitString)mComponents[1];
		    }
		    
		    public void setUtranMobilityInformation_r7_add_ext(BitString utranMobilityInformation_r7_add_ext)
		    {
			mComponents[1] = utranMobilityInformation_r7_add_ext;
		    }
		    
		    public boolean hasUtranMobilityInformation_r7_add_ext()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteUtranMobilityInformation_r7_add_ext()
		    {
			setComponentAbsent(1);
		    }
		    
		    
		    // Methods for field "v860NCEs"
		    public V860NCEs getV860NCEs()
		    {
			return (V860NCEs)mComponents[2];
		    }
		    
		    public void setV860NCEs(V860NCEs v860NCEs)
		    {
			mComponents[2] = v860NCEs;
		    }
		    
		    public boolean hasV860NCEs()
		    {
			return componentIsPresent(2);
		    }
		    
		    public void deleteV860NCEs()
		    {
			setComponentAbsent(2);
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
			public V860NCEs(UTRANMobilityInformation_v860ext2_IEs utranMobilityInformation_v860ext, 
					NonCriticalExtensions nonCriticalExtensions)
			{
			    setUtranMobilityInformation_v860ext(utranMobilityInformation_v860ext);
			    setNonCriticalExtensions(nonCriticalExtensions);
			}
			
			/**
			 * Construct with required components.
			 */
			public V860NCEs(UTRANMobilityInformation_v860ext2_IEs utranMobilityInformation_v860ext)
			{
			    setUtranMobilityInformation_v860ext(utranMobilityInformation_v860ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new UTRANMobilityInformation_v860ext2_IEs();
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
				    return new UTRANMobilityInformation_v860ext2_IEs();
				case 1:
				    return new NonCriticalExtensions();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "utranMobilityInformation_v860ext"
			public UTRANMobilityInformation_v860ext2_IEs getUtranMobilityInformation_v860ext()
			{
			    return (UTRANMobilityInformation_v860ext2_IEs)mComponents[0];
			}
			
			public void setUtranMobilityInformation_v860ext(UTRANMobilityInformation_v860ext2_IEs utranMobilityInformation_v860ext)
			{
			    mComponents[0] = utranMobilityInformation_v860ext;
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
				    "UTRANMobilityInformation$Later_than_r3$CriticalExtensions$CriticalExtensions1$R7$V860NCEs$NonCriticalExtensions"
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
				"UTRANMobilityInformation$Later_than_r3$CriticalExtensions$CriticalExtensions1$R7$V860NCEs"
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
						    "UTRANMobilityInformation_v860ext2_IEs"
						),
						new QName (
						    "PDU-definitions",
						    "UTRANMobilityInformation-v860ext2-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.pdu_definitions",
							"UTRANMobilityInformation_v860ext2_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.pdu_definitions",
							"UTRANMobilityInformation_v860ext2_IEs"
						    )
						),
						0
					    )
					),
					"utranMobilityInformation-v860ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.pdu_definitions",
						"UTRANMobilityInformation$Later_than_r3$CriticalExtensions$CriticalExtensions1$R7$V860NCEs$NonCriticalExtensions"
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
				(short)0x8000
			    }
			),
			new QName (
			    "rrc.pdu_definitions",
			    "UTRANMobilityInformation$Later_than_r3$CriticalExtensions$CriticalExtensions1$R7"
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
						"UTRANMobilityInformation_r7_IEs"
					    ),
					    new QName (
						"PDU-definitions",
						"UTRANMobilityInformation-r7-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.pdu_definitions",
						    "UTRANMobilityInformation_r7_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.pdu_definitions",
						    "UTRANMobilityInformation_r7_IEs"
						)
					    ),
					    0
					)
				    ),
				    "utranMobilityInformation-r7",
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
				    "utranMobilityInformation-r7-add-ext",
				    1,
				    3,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "UTRANMobilityInformation$Later_than_r3$CriticalExtensions$CriticalExtensions1$R7$V860NCEs"
					)
				    ),
				    "v860NCEs",
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
		 * @see Sequence
		 */
		public static class CriticalExtensions2 extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public CriticalExtensions2()
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
			    "UTRANMobilityInformation$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2"
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
			"UTRANMobilityInformation$Later_than_r3$CriticalExtensions$CriticalExtensions1"
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
					"UTRANMobilityInformation$Later_than_r3$CriticalExtensions$CriticalExtensions1$R7"
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
					"UTRANMobilityInformation$Later_than_r3$CriticalExtensions$CriticalExtensions1$CriticalExtensions2"
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
		    case r5_chosen:
			return new R5();
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
		    "UTRANMobilityInformation$Later_than_r3$CriticalExtensions"
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
				    "UTRANMobilityInformation$Later_than_r3$CriticalExtensions$R5"
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
				    "UTRANMobilityInformation$Later_than_r3$CriticalExtensions$CriticalExtensions1"
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
		"UTRANMobilityInformation$Later_than_r3"
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
				"UTRANMobilityInformation$Later_than_r3$CriticalExtensions"
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
	    "UTRANMobilityInformation"
	),
	new QName (
	    "PDU-definitions",
	    "UTRANMobilityInformation"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "UTRANMobilityInformation$R3"
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
			    "UTRANMobilityInformation$Later_than_r3"
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
     * Get the type descriptor (TypeInfo) of 'this' UTRANMobilityInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UTRANMobilityInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UTRANMobilityInformation
