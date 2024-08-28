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


package rrc.informationelements;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type SysInfoType4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType4(CellIdentity cellIdentity, 
		    CellSelectReselectInfoSIB_3_4 cellSelectReselectInfo, 
		    CellAccessRestriction cellAccessRestriction, 
		    V4b0NCEs v4b0NCEs)
    {
	setCellIdentity(cellIdentity);
	setCellSelectReselectInfo(cellSelectReselectInfo);
	setCellAccessRestriction(cellAccessRestriction);
	setV4b0NCEs(v4b0NCEs);
    }
    
    /**
     * Construct with required components.
     */
    public SysInfoType4(CellIdentity cellIdentity, 
		    CellSelectReselectInfoSIB_3_4 cellSelectReselectInfo, 
		    CellAccessRestriction cellAccessRestriction)
    {
	setCellIdentity(cellIdentity);
	setCellSelectReselectInfo(cellSelectReselectInfo);
	setCellAccessRestriction(cellAccessRestriction);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CellIdentity();
	mComponents[1] = new CellSelectReselectInfoSIB_3_4();
	mComponents[2] = new CellAccessRestriction();
	mComponents[3] = new V4b0NCEs();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new CellIdentity();
	    case 1:
		return new CellSelectReselectInfoSIB_3_4();
	    case 2:
		return new CellAccessRestriction();
	    case 3:
		return new V4b0NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cellIdentity"
    public CellIdentity getCellIdentity()
    {
	return (CellIdentity)mComponents[0];
    }
    
    public void setCellIdentity(CellIdentity cellIdentity)
    {
	mComponents[0] = cellIdentity;
    }
    
    
    // Methods for field "cellSelectReselectInfo"
    public CellSelectReselectInfoSIB_3_4 getCellSelectReselectInfo()
    {
	return (CellSelectReselectInfoSIB_3_4)mComponents[1];
    }
    
    public void setCellSelectReselectInfo(CellSelectReselectInfoSIB_3_4 cellSelectReselectInfo)
    {
	mComponents[1] = cellSelectReselectInfo;
    }
    
    
    // Methods for field "cellAccessRestriction"
    public CellAccessRestriction getCellAccessRestriction()
    {
	return (CellAccessRestriction)mComponents[2];
    }
    
    public void setCellAccessRestriction(CellAccessRestriction cellAccessRestriction)
    {
	mComponents[2] = cellAccessRestriction;
    }
    
    
    // Methods for field "v4b0NCEs"
    public V4b0NCEs getV4b0NCEs()
    {
	return (V4b0NCEs)mComponents[3];
    }
    
    public void setV4b0NCEs(V4b0NCEs v4b0NCEs)
    {
	mComponents[3] = v4b0NCEs;
    }
    
    public boolean hasV4b0NCEs()
    {
	return componentIsPresent(3);
    }
    
    public void deleteV4b0NCEs()
    {
	setComponentAbsent(3);
    }
    
    
    
    /**
     * Define the ASN1 Type V4b0NCEs from ASN1 Module InformationElements.
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
	public V4b0NCEs(SysInfoType4_v4b0ext_IEs sysInfoType4_v4b0ext, 
			V590NCE v590NCE)
	{
	    setSysInfoType4_v4b0ext(sysInfoType4_v4b0ext);
	    setV590NCE(v590NCE);
	}
	
	/**
	 * Construct with required components.
	 */
	public V4b0NCEs(SysInfoType4_v4b0ext_IEs sysInfoType4_v4b0ext)
	{
	    setSysInfoType4_v4b0ext(sysInfoType4_v4b0ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new SysInfoType4_v4b0ext_IEs();
	    mComponents[1] = new V590NCE();
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
		    return new SysInfoType4_v4b0ext_IEs();
		case 1:
		    return new V590NCE();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "sysInfoType4_v4b0ext"
	public SysInfoType4_v4b0ext_IEs getSysInfoType4_v4b0ext()
	{
	    return (SysInfoType4_v4b0ext_IEs)mComponents[0];
	}
	
	public void setSysInfoType4_v4b0ext(SysInfoType4_v4b0ext_IEs sysInfoType4_v4b0ext)
	{
	    mComponents[0] = sysInfoType4_v4b0ext;
	}
	
	
	// Methods for field "v590NCE"
	public V590NCE getV590NCE()
	{
	    return (V590NCE)mComponents[1];
	}
	
	public void setV590NCE(V590NCE v590NCE)
	{
	    mComponents[1] = v590NCE;
	}
	
	public boolean hasV590NCE()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteV590NCE()
	{
	    setComponentAbsent(1);
	}
	
	
	
	/**
	 * Define the ASN1 Type V590NCE from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class V590NCE extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public V590NCE()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public V590NCE(SysInfoType4_v590ext sysInfoType4_v590ext, 
			    V5b0NCE v5b0NCE)
	    {
		setSysInfoType4_v590ext(sysInfoType4_v590ext);
		setV5b0NCE(v5b0NCE);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V590NCE(SysInfoType4_v590ext sysInfoType4_v590ext)
	    {
		setSysInfoType4_v590ext(sysInfoType4_v590ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new SysInfoType4_v590ext();
		mComponents[1] = new V5b0NCE();
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
			return new SysInfoType4_v590ext();
		    case 1:
			return new V5b0NCE();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "sysInfoType4_v590ext"
	    public SysInfoType4_v590ext getSysInfoType4_v590ext()
	    {
		return (SysInfoType4_v590ext)mComponents[0];
	    }
	    
	    public void setSysInfoType4_v590ext(SysInfoType4_v590ext sysInfoType4_v590ext)
	    {
		mComponents[0] = sysInfoType4_v590ext;
	    }
	    
	    
	    // Methods for field "v5b0NCE"
	    public V5b0NCE getV5b0NCE()
	    {
		return (V5b0NCE)mComponents[1];
	    }
	    
	    public void setV5b0NCE(V5b0NCE v5b0NCE)
	    {
		mComponents[1] = v5b0NCE;
	    }
	    
	    public boolean hasV5b0NCE()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteV5b0NCE()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type V5b0NCE from ASN1 Module InformationElements.
	     * @see Sequence
	     */
	    public static class V5b0NCE extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public V5b0NCE()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public V5b0NCE(SysInfoType4_v5b0ext_IEs sysInfoType4_v5b0ext, 
				V5c0NCE v5c0NCE)
		{
		    setSysInfoType4_v5b0ext(sysInfoType4_v5b0ext);
		    setV5c0NCE(v5c0NCE);
		}
		
		/**
		 * Construct with required components.
		 */
		public V5b0NCE(SysInfoType4_v5b0ext_IEs sysInfoType4_v5b0ext)
		{
		    setSysInfoType4_v5b0ext(sysInfoType4_v5b0ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new SysInfoType4_v5b0ext_IEs();
		    mComponents[1] = new V5c0NCE();
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
			    return new SysInfoType4_v5b0ext_IEs();
			case 1:
			    return new V5c0NCE();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "sysInfoType4_v5b0ext"
		public SysInfoType4_v5b0ext_IEs getSysInfoType4_v5b0ext()
		{
		    return (SysInfoType4_v5b0ext_IEs)mComponents[0];
		}
		
		public void setSysInfoType4_v5b0ext(SysInfoType4_v5b0ext_IEs sysInfoType4_v5b0ext)
		{
		    mComponents[0] = sysInfoType4_v5b0ext;
		}
		
		
		// Methods for field "v5c0NCE"
		public V5c0NCE getV5c0NCE()
		{
		    return (V5c0NCE)mComponents[1];
		}
		
		public void setV5c0NCE(V5c0NCE v5c0NCE)
		{
		    mComponents[1] = v5c0NCE;
		}
		
		public boolean hasV5c0NCE()
		{
		    return componentIsPresent(1);
		}
		
		public void deleteV5c0NCE()
		{
		    setComponentAbsent(1);
		}
		
		
		
		/**
		 * Define the ASN1 Type V5c0NCE from ASN1 Module InformationElements.
		 * @see Sequence
		 */
		public static class V5c0NCE extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public V5c0NCE()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public V5c0NCE(SysInfoType4_v5c0ext_IEs sysInfoType4_v5c0ext, 
				    NonCriticalExtensions nonCriticalExtensions)
		    {
			setSysInfoType4_v5c0ext(sysInfoType4_v5c0ext);
			setNonCriticalExtensions(nonCriticalExtensions);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public V5c0NCE(SysInfoType4_v5c0ext_IEs sysInfoType4_v5c0ext)
		    {
			setSysInfoType4_v5c0ext(sysInfoType4_v5c0ext);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new SysInfoType4_v5c0ext_IEs();
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
				return new SysInfoType4_v5c0ext_IEs();
			    case 1:
				return new NonCriticalExtensions();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "sysInfoType4_v5c0ext"
		    public SysInfoType4_v5c0ext_IEs getSysInfoType4_v5c0ext()
		    {
			return (SysInfoType4_v5c0ext_IEs)mComponents[0];
		    }
		    
		    public void setSysInfoType4_v5c0ext(SysInfoType4_v5c0ext_IEs sysInfoType4_v5c0ext)
		    {
			mComponents[0] = sysInfoType4_v5c0ext;
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
		     * Define the ASN1 Type NonCriticalExtensions from ASN1 Module InformationElements.
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
				"rrc.informationelements",
				"SysInfoType4$V4b0NCEs$V590NCE$V5b0NCE$V5c0NCE$NonCriticalExtensions"
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
			    "rrc.informationelements",
			    "SysInfoType4$V4b0NCEs$V590NCE$V5b0NCE$V5c0NCE"
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
						"rrc.informationelements",
						"SysInfoType4_v5c0ext_IEs"
					    ),
					    new QName (
						"InformationElements",
						"SysInfoType4-v5c0ext-IEs"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "SysInfoType4_v5c0ext_IEs"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "SysInfoType4_v5c0ext_IEs"
						)
					    ),
					    0
					)
				    ),
				    "sysInfoType4-v5c0ext",
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType4$V4b0NCEs$V590NCE$V5b0NCE$V5c0NCE$NonCriticalExtensions"
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
		     * Get the type descriptor (TypeInfo) of 'this' V5c0NCE object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' V5c0NCE object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for V5c0NCE

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
			"rrc.informationelements",
			"SysInfoType4$V4b0NCEs$V590NCE$V5b0NCE"
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
					    "rrc.informationelements",
					    "SysInfoType4_v5b0ext_IEs"
					),
					new QName (
					    "InformationElements",
					    "SysInfoType4-v5b0ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"SysInfoType4_v5b0ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"SysInfoType4_v5b0ext_IEs"
					    )
					),
					0
				    )
				),
				"sysInfoType4-v5b0ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType4$V4b0NCEs$V590NCE$V5b0NCE$V5c0NCE"
				    )
				),
				"v5c0NCE",
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
		 * Get the type descriptor (TypeInfo) of 'this' V5b0NCE object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' V5b0NCE object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for V5b0NCE

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
		    "rrc.informationelements",
		    "SysInfoType4$V4b0NCEs$V590NCE"
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
					"rrc.informationelements",
					"SysInfoType4_v590ext"
				    ),
				    new QName (
					"InformationElements",
					"SysInfoType4-v590ext"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType4_v590ext"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType4_v590ext"
					)
				    ),
				    0
				)
			    ),
			    "sysInfoType4-v590ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "SysInfoType4$V4b0NCEs$V590NCE$V5b0NCE"
				)
			    ),
			    "v5b0NCE",
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
	     * Get the type descriptor (TypeInfo) of 'this' V590NCE object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' V590NCE object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for V590NCE

	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SysInfoType4$V4b0NCEs"
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
				    "rrc.informationelements",
				    "SysInfoType4_v4b0ext_IEs"
				),
				new QName (
				    "InformationElements",
				    "SysInfoType4-v4b0ext-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType4_v4b0ext_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType4_v4b0ext_IEs"
				    )
				),
				0
			    )
			),
			"sysInfoType4-v4b0ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"SysInfoType4$V4b0NCEs$V590NCE"
			    )
			),
			"v590NCE",
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
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "SysInfoType4"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType4"
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
				"rrc.informationelements",
				"CellIdentity"
			    ),
			    new QName (
				"InformationElements",
				"CellIdentity"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(28)
				)
			    ),
			    new Bounds (
				new java.lang.Long(28),
				new java.lang.Long(28)
			    ),
			    null
			)
		    ),
		    "cellIdentity",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellSelectReselectInfoSIB_3_4"
			    ),
			    new QName (
				"InformationElements",
				"CellSelectReselectInfoSIB-3-4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CellSelectReselectInfoSIB_3_4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CellSelectReselectInfoSIB_3_4"
				)
			    ),
			    0
			)
		    ),
		    "cellSelectReselectInfo",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CellAccessRestriction"
			    ),
			    new QName (
				"InformationElements",
				"CellAccessRestriction"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CellAccessRestriction"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CellAccessRestriction"
				)
			    ),
			    0
			)
		    ),
		    "cellAccessRestriction",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType4$V4b0NCEs"
			)
		    ),
		    "v4b0NCEs",
		    3,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
} // End class definition for SysInfoType4
