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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type InterRATHandoverInfoWithInterRATCapabilities_r3 from ASN1 Module Internode_definitions.
 * @see Choice
 */

public class InterRATHandoverInfoWithInterRATCapabilities_r3 extends Choice {
    
    /**
     * The default constructor.
     */
    public InterRATHandoverInfoWithInterRATCapabilities_r3()
    {
    }
    
    public static final  int  r3_chosen = 1;
    public static final  int  criticalExtensions_chosen = 2;
    
    // Methods for field "r3"
    public static InterRATHandoverInfoWithInterRATCapabilities_r3 createInterRATHandoverInfoWithInterRATCapabilities_r3WithR3(R3 r3)
    {
	InterRATHandoverInfoWithInterRATCapabilities_r3 __object = new InterRATHandoverInfoWithInterRATCapabilities_r3();

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
     * Define the ASN1 Type R3 from ASN1 Module Internode_definitions.
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
	public R3(InterRATHandoverInfoWithInterRATCapabilities_r3_IEs interRATHandoverInfo_r3, 
			V390NCEs v390NCEs)
	{
	    setInterRATHandoverInfo_r3(interRATHandoverInfo_r3);
	    setV390NCEs(v390NCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public R3(InterRATHandoverInfoWithInterRATCapabilities_r3_IEs interRATHandoverInfo_r3)
	{
	    setInterRATHandoverInfo_r3(interRATHandoverInfo_r3);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new InterRATHandoverInfoWithInterRATCapabilities_r3_IEs();
	    mComponents[1] = new V390NCEs();
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
		    return new InterRATHandoverInfoWithInterRATCapabilities_r3_IEs();
		case 1:
		    return new V390NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "interRATHandoverInfo_r3"
	public InterRATHandoverInfoWithInterRATCapabilities_r3_IEs getInterRATHandoverInfo_r3()
	{
	    return (InterRATHandoverInfoWithInterRATCapabilities_r3_IEs)mComponents[0];
	}
	
	public void setInterRATHandoverInfo_r3(InterRATHandoverInfoWithInterRATCapabilities_r3_IEs interRATHandoverInfo_r3)
	{
	    mComponents[0] = interRATHandoverInfo_r3;
	}
	
	
	// Methods for field "v390NCEs"
	public V390NCEs getV390NCEs()
	{
	    return (V390NCEs)mComponents[1];
	}
	
	public void setV390NCEs(V390NCEs v390NCEs)
	{
	    mComponents[1] = v390NCEs;
	}
	
	public boolean hasV390NCEs()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteV390NCEs()
	{
	    setComponentAbsent(1);
	}
	
	
	
	/**
	 * Define the ASN1 Type V390NCEs from ASN1 Module Internode_definitions.
	 * @see Sequence
	 */
	public static class V390NCEs extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public V390NCEs()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public V390NCEs(InterRATHandoverInfoWithInterRATCapabilities_v390ext_IEs interRATHandoverInfoWithInterRATCapabilities_v390ext, 
			    V690NCEs v690NCEs)
	    {
		setInterRATHandoverInfoWithInterRATCapabilities_v390ext(interRATHandoverInfoWithInterRATCapabilities_v390ext);
		setV690NCEs(v690NCEs);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V390NCEs(InterRATHandoverInfoWithInterRATCapabilities_v390ext_IEs interRATHandoverInfoWithInterRATCapabilities_v390ext)
	    {
		setInterRATHandoverInfoWithInterRATCapabilities_v390ext(interRATHandoverInfoWithInterRATCapabilities_v390ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new InterRATHandoverInfoWithInterRATCapabilities_v390ext_IEs();
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
			return new InterRATHandoverInfoWithInterRATCapabilities_v390ext_IEs();
		    case 1:
			return new V690NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "interRATHandoverInfoWithInterRATCapabilities_v390ext"
	    public InterRATHandoverInfoWithInterRATCapabilities_v390ext_IEs getInterRATHandoverInfoWithInterRATCapabilities_v390ext()
	    {
		return (InterRATHandoverInfoWithInterRATCapabilities_v390ext_IEs)mComponents[0];
	    }
	    
	    public void setInterRATHandoverInfoWithInterRATCapabilities_v390ext(InterRATHandoverInfoWithInterRATCapabilities_v390ext_IEs interRATHandoverInfoWithInterRATCapabilities_v390ext)
	    {
		mComponents[0] = interRATHandoverInfoWithInterRATCapabilities_v390ext;
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
	     * Define the ASN1 Type V690NCEs from ASN1 Module Internode_definitions.
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
		public V690NCEs(InterRATHandoverInfoWithInterRATCapabilities_v690ext_IEs interRATHandoverInfoWithInterRATCapabilities_v690ext, 
				V860NCEs v860NCEs)
		{
		    setInterRATHandoverInfoWithInterRATCapabilities_v690ext(interRATHandoverInfoWithInterRATCapabilities_v690ext);
		    setV860NCEs(v860NCEs);
		}
		
		/**
		 * Construct with required components.
		 */
		public V690NCEs(InterRATHandoverInfoWithInterRATCapabilities_v690ext_IEs interRATHandoverInfoWithInterRATCapabilities_v690ext)
		{
		    setInterRATHandoverInfoWithInterRATCapabilities_v690ext(interRATHandoverInfoWithInterRATCapabilities_v690ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new InterRATHandoverInfoWithInterRATCapabilities_v690ext_IEs();
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
			    return new InterRATHandoverInfoWithInterRATCapabilities_v690ext_IEs();
			case 1:
			    return new V860NCEs();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "interRATHandoverInfoWithInterRATCapabilities_v690ext"
		public InterRATHandoverInfoWithInterRATCapabilities_v690ext_IEs getInterRATHandoverInfoWithInterRATCapabilities_v690ext()
		{
		    return (InterRATHandoverInfoWithInterRATCapabilities_v690ext_IEs)mComponents[0];
		}
		
		public void setInterRATHandoverInfoWithInterRATCapabilities_v690ext(InterRATHandoverInfoWithInterRATCapabilities_v690ext_IEs interRATHandoverInfoWithInterRATCapabilities_v690ext)
		{
		    mComponents[0] = interRATHandoverInfoWithInterRATCapabilities_v690ext;
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
		 * Define the ASN1 Type V860NCEs from ASN1 Module Internode_definitions.
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
		    public V860NCEs(InterRATHandoverInfoWithInterRATCapabilities_v860ext_IEs interRATHandoverInfoWithInterRATCapabilities_v860ext, 
				    V920NCEs v920NCEs)
		    {
			setInterRATHandoverInfoWithInterRATCapabilities_v860ext(interRATHandoverInfoWithInterRATCapabilities_v860ext);
			setV920NCEs(v920NCEs);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public V860NCEs(InterRATHandoverInfoWithInterRATCapabilities_v860ext_IEs interRATHandoverInfoWithInterRATCapabilities_v860ext)
		    {
			setInterRATHandoverInfoWithInterRATCapabilities_v860ext(interRATHandoverInfoWithInterRATCapabilities_v860ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new InterRATHandoverInfoWithInterRATCapabilities_v860ext_IEs();
			mComponents[1] = new V920NCEs();
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
				return new InterRATHandoverInfoWithInterRATCapabilities_v860ext_IEs();
			    case 1:
				return new V920NCEs();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "interRATHandoverInfoWithInterRATCapabilities_v860ext"
		    public InterRATHandoverInfoWithInterRATCapabilities_v860ext_IEs getInterRATHandoverInfoWithInterRATCapabilities_v860ext()
		    {
			return (InterRATHandoverInfoWithInterRATCapabilities_v860ext_IEs)mComponents[0];
		    }
		    
		    public void setInterRATHandoverInfoWithInterRATCapabilities_v860ext(InterRATHandoverInfoWithInterRATCapabilities_v860ext_IEs interRATHandoverInfoWithInterRATCapabilities_v860ext)
		    {
			mComponents[0] = interRATHandoverInfoWithInterRATCapabilities_v860ext;
		    }
		    
		    
		    // Methods for field "v920NCEs"
		    public V920NCEs getV920NCEs()
		    {
			return (V920NCEs)mComponents[1];
		    }
		    
		    public void setV920NCEs(V920NCEs v920NCEs)
		    {
			mComponents[1] = v920NCEs;
		    }
		    
		    public boolean hasV920NCEs()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deleteV920NCEs()
		    {
			setComponentAbsent(1);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type V920NCEs from ASN1 Module Internode_definitions.
		     * @see Sequence
		     */
		    public static class V920NCEs extends Sequence {
			
			/**
			 * The default constructor.
			 */
			public V920NCEs()
			{
			}
			
			/**
			 * Construct with AbstractData components.
			 */
			public V920NCEs(InterRATHandoverInfoWithInterRATCapabilities_v920ext_IEs interRATHandoverInfoWithInterRATCapabilities_v920ext, 
					NonCriticalExtensions nonCriticalExtensions)
			{
			    setInterRATHandoverInfoWithInterRATCapabilities_v920ext(interRATHandoverInfoWithInterRATCapabilities_v920ext);
			    setNonCriticalExtensions(nonCriticalExtensions);
			}
			
			/**
			 * Construct with required components.
			 */
			public V920NCEs(InterRATHandoverInfoWithInterRATCapabilities_v920ext_IEs interRATHandoverInfoWithInterRATCapabilities_v920ext)
			{
			    setInterRATHandoverInfoWithInterRATCapabilities_v920ext(interRATHandoverInfoWithInterRATCapabilities_v920ext);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new InterRATHandoverInfoWithInterRATCapabilities_v920ext_IEs();
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
				    return new InterRATHandoverInfoWithInterRATCapabilities_v920ext_IEs();
				case 1:
				    return new NonCriticalExtensions();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "interRATHandoverInfoWithInterRATCapabilities_v920ext"
			public InterRATHandoverInfoWithInterRATCapabilities_v920ext_IEs getInterRATHandoverInfoWithInterRATCapabilities_v920ext()
			{
			    return (InterRATHandoverInfoWithInterRATCapabilities_v920ext_IEs)mComponents[0];
			}
			
			public void setInterRATHandoverInfoWithInterRATCapabilities_v920ext(InterRATHandoverInfoWithInterRATCapabilities_v920ext_IEs interRATHandoverInfoWithInterRATCapabilities_v920ext)
			{
			    mComponents[0] = interRATHandoverInfoWithInterRATCapabilities_v920ext;
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
			 * Define the ASN1 Type NonCriticalExtensions from ASN1 Module Internode_definitions.
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
				    "rrc.internode_definitions",
				    "InterRATHandoverInfoWithInterRATCapabilities_r3$R3$V390NCEs$V690NCEs$V860NCEs$V920NCEs$NonCriticalExtensions"
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
				"rrc.internode_definitions",
				"InterRATHandoverInfoWithInterRATCapabilities_r3$R3$V390NCEs$V690NCEs$V860NCEs$V920NCEs"
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
						    "rrc.internode_definitions",
						    "InterRATHandoverInfoWithInterRATCapabilities_v920ext_IEs"
						),
						new QName (
						    "Internode-definitions",
						    "InterRATHandoverInfoWithInterRATCapabilities-v920ext-IEs"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.internode_definitions",
							"InterRATHandoverInfoWithInterRATCapabilities_v920ext_IEs"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.internode_definitions",
							"InterRATHandoverInfoWithInterRATCapabilities_v920ext_IEs"
						    )
						),
						0
					    )
					),
					"interRATHandoverInfoWithInterRATCapabilities-v920ext",
					0,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new QName (
						"rrc.internode_definitions",
						"InterRATHandoverInfoWithInterRATCapabilities_r3$R3$V390NCEs$V690NCEs$V860NCEs$V920NCEs$NonCriticalExtensions"
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
			 * Get the type descriptor (TypeInfo) of 'this' V920NCEs object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' V920NCEs object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for V920NCEs

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
			    "rrc.internode_definitions",
			    "InterRATHandoverInfoWithInterRATCapabilities_r3$R3$V390NCEs$V690NCEs$V860NCEs"
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
						"rrc.internode_definitions",
						"InterRATHandoverInfoWithInterRATCapabilities_v860ext_IEs"
					    ),
					    new QName (
						"Internode-definitions",
						"InterRATHandoverInfoWithInterRATCapabilities-v860ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.internode_definitions",
						    "InterRATHandoverInfoWithInterRATCapabilities_v860ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.internode_definitions",
						    "InterRATHandoverInfoWithInterRATCapabilities_v860ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "interRATHandoverInfoWithInterRATCapabilities-v860ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.internode_definitions",
					    "InterRATHandoverInfoWithInterRATCapabilities_r3$R3$V390NCEs$V690NCEs$V860NCEs$V920NCEs"
					)
				    ),
				    "v920NCEs",
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
			"rrc.internode_definitions",
			"InterRATHandoverInfoWithInterRATCapabilities_r3$R3$V390NCEs$V690NCEs"
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
					    "rrc.internode_definitions",
					    "InterRATHandoverInfoWithInterRATCapabilities_v690ext_IEs"
					),
					new QName (
					    "Internode-definitions",
					    "InterRATHandoverInfoWithInterRATCapabilities-v690ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.internode_definitions",
						"InterRATHandoverInfoWithInterRATCapabilities_v690ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.internode_definitions",
						"InterRATHandoverInfoWithInterRATCapabilities_v690ext_IEs"
					    )
					),
					0
				    )
				),
				"interRATHandoverInfoWithInterRATCapabilities-v690ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.internode_definitions",
					"InterRATHandoverInfoWithInterRATCapabilities_r3$R3$V390NCEs$V690NCEs$V860NCEs"
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
		    "rrc.internode_definitions",
		    "InterRATHandoverInfoWithInterRATCapabilities_r3$R3$V390NCEs"
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
					"rrc.internode_definitions",
					"InterRATHandoverInfoWithInterRATCapabilities_v390ext_IEs"
				    ),
				    new QName (
					"Internode-definitions",
					"InterRATHandoverInfoWithInterRATCapabilities-v390ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.internode_definitions",
					    "InterRATHandoverInfoWithInterRATCapabilities_v390ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.internode_definitions",
					    "InterRATHandoverInfoWithInterRATCapabilities_v390ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "interRATHandoverInfoWithInterRATCapabilities-v390ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.internode_definitions",
				    "InterRATHandoverInfoWithInterRATCapabilities_r3$R3$V390NCEs$V690NCEs"
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
	     * Get the type descriptor (TypeInfo) of 'this' V390NCEs object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' V390NCEs object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for V390NCEs

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
		"rrc.internode_definitions",
		"InterRATHandoverInfoWithInterRATCapabilities_r3$R3"
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
				    "rrc.internode_definitions",
				    "InterRATHandoverInfoWithInterRATCapabilities_r3_IEs"
				),
				new QName (
				    "Internode-definitions",
				    "InterRATHandoverInfoWithInterRATCapabilities-r3-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.internode_definitions",
					"InterRATHandoverInfoWithInterRATCapabilities_r3_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.internode_definitions",
					"InterRATHandoverInfoWithInterRATCapabilities_r3_IEs"
				    )
				),
				0
			    )
			),
			"interRATHandoverInfo-r3",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.internode_definitions",
				"InterRATHandoverInfoWithInterRATCapabilities_r3$R3$V390NCEs"
			    )
			),
			"v390NCEs",
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

    // Methods for field "criticalExtensions"
    public static InterRATHandoverInfoWithInterRATCapabilities_r3 createInterRATHandoverInfoWithInterRATCapabilities_r3WithCriticalExtensions(CriticalExtensions criticalExtensions)
    {
	InterRATHandoverInfoWithInterRATCapabilities_r3 __object = new InterRATHandoverInfoWithInterRATCapabilities_r3();

	__object.setCriticalExtensions(criticalExtensions);
	return __object;
    }
    
    public boolean hasCriticalExtensions()
    {
	return getChosenFlag() == criticalExtensions_chosen;
    }
    
    public void setCriticalExtensions(CriticalExtensions criticalExtensions)
    {
	setChosenValue(criticalExtensions);
	setChosenFlag(criticalExtensions_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type CriticalExtensions from ASN1 Module Internode_definitions.
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
		"rrc.internode_definitions",
		"InterRATHandoverInfoWithInterRATCapabilities_r3$CriticalExtensions"
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

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case r3_chosen:
		return new R3();
	    case criticalExtensions_chosen:
		return new CriticalExtensions();
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
	    "rrc.internode_definitions",
	    "InterRATHandoverInfoWithInterRATCapabilities_r3"
	),
	new QName (
	    "Internode-definitions",
	    "InterRATHandoverInfoWithInterRATCapabilities-r3"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.internode_definitions",
			    "InterRATHandoverInfoWithInterRATCapabilities_r3$R3"
			)
		    ),
		    "r3",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.internode_definitions",
			    "InterRATHandoverInfoWithInterRATCapabilities_r3$CriticalExtensions"
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
     * Get the type descriptor (TypeInfo) of 'this' InterRATHandoverInfoWithInterRATCapabilities_r3 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterRATHandoverInfoWithInterRATCapabilities_r3 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterRATHandoverInfoWithInterRATCapabilities_r3
