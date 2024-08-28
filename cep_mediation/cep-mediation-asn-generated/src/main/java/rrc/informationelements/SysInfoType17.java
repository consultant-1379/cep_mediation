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
 * Define the ASN1 Type SysInfoType17 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType17 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType17()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType17(PUSCH_SysInfoList pusch_SysInfoList, 
		    PDSCH_SysInfoList pdsch_SysInfoList, V4b0NCEs v4b0NCEs)
    {
	setPusch_SysInfoList(pusch_SysInfoList);
	setPdsch_SysInfoList(pdsch_SysInfoList);
	setV4b0NCEs(v4b0NCEs);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PUSCH_SysInfoList();
	mComponents[1] = new PDSCH_SysInfoList();
	mComponents[2] = new V4b0NCEs();
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
		return new PUSCH_SysInfoList();
	    case 1:
		return new PDSCH_SysInfoList();
	    case 2:
		return new V4b0NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "pusch_SysInfoList"
    public PUSCH_SysInfoList getPusch_SysInfoList()
    {
	return (PUSCH_SysInfoList)mComponents[0];
    }
    
    public void setPusch_SysInfoList(PUSCH_SysInfoList pusch_SysInfoList)
    {
	mComponents[0] = pusch_SysInfoList;
    }
    
    public boolean hasPusch_SysInfoList()
    {
	return componentIsPresent(0);
    }
    
    public void deletePusch_SysInfoList()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "pdsch_SysInfoList"
    public PDSCH_SysInfoList getPdsch_SysInfoList()
    {
	return (PDSCH_SysInfoList)mComponents[1];
    }
    
    public void setPdsch_SysInfoList(PDSCH_SysInfoList pdsch_SysInfoList)
    {
	mComponents[1] = pdsch_SysInfoList;
    }
    
    public boolean hasPdsch_SysInfoList()
    {
	return componentIsPresent(1);
    }
    
    public void deletePdsch_SysInfoList()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "v4b0NCEs"
    public V4b0NCEs getV4b0NCEs()
    {
	return (V4b0NCEs)mComponents[2];
    }
    
    public void setV4b0NCEs(V4b0NCEs v4b0NCEs)
    {
	mComponents[2] = v4b0NCEs;
    }
    
    public boolean hasV4b0NCEs()
    {
	return componentIsPresent(2);
    }
    
    public void deleteV4b0NCEs()
    {
	setComponentAbsent(2);
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
	public V4b0NCEs(SysInfoType17_v4b0ext_IEs sysInfoType17_v4b0ext, 
			V590NCEs v590NCEs)
	{
	    setSysInfoType17_v4b0ext(sysInfoType17_v4b0ext);
	    setV590NCEs(v590NCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public V4b0NCEs(SysInfoType17_v4b0ext_IEs sysInfoType17_v4b0ext)
	{
	    setSysInfoType17_v4b0ext(sysInfoType17_v4b0ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new SysInfoType17_v4b0ext_IEs();
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
		    return new SysInfoType17_v4b0ext_IEs();
		case 1:
		    return new V590NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "sysInfoType17_v4b0ext"
	public SysInfoType17_v4b0ext_IEs getSysInfoType17_v4b0ext()
	{
	    return (SysInfoType17_v4b0ext_IEs)mComponents[0];
	}
	
	public void setSysInfoType17_v4b0ext(SysInfoType17_v4b0ext_IEs sysInfoType17_v4b0ext)
	{
	    mComponents[0] = sysInfoType17_v4b0ext;
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
	 * Define the ASN1 Type V590NCEs from ASN1 Module InformationElements.
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
	    public V590NCEs(SysInfoType17_v590ext_IEs sysInfoType17_v590ext, 
			    V770NCEs v770NCEs)
	    {
		setSysInfoType17_v590ext(sysInfoType17_v590ext);
		setV770NCEs(v770NCEs);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new SysInfoType17_v590ext_IEs();
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
			return new SysInfoType17_v590ext_IEs();
		    case 1:
			return new V770NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "sysInfoType17_v590ext"
	    public SysInfoType17_v590ext_IEs getSysInfoType17_v590ext()
	    {
		return (SysInfoType17_v590ext_IEs)mComponents[0];
	    }
	    
	    public void setSysInfoType17_v590ext(SysInfoType17_v590ext_IEs sysInfoType17_v590ext)
	    {
		mComponents[0] = sysInfoType17_v590ext;
	    }
	    
	    public boolean hasSysInfoType17_v590ext()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteSysInfoType17_v590ext()
	    {
		setComponentAbsent(0);
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
	     * Define the ASN1 Type V770NCEs from ASN1 Module InformationElements.
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
		public V770NCEs(SysInfoType17_v770ext_IEs sysInfoType17_v770ext, 
				NonCriticalExtensions nonCriticalExtensions)
		{
		    setSysInfoType17_v770ext(sysInfoType17_v770ext);
		    setNonCriticalExtensions(nonCriticalExtensions);
		}
		
		/**
		 * Construct with required components.
		 */
		public V770NCEs(SysInfoType17_v770ext_IEs sysInfoType17_v770ext)
		{
		    setSysInfoType17_v770ext(sysInfoType17_v770ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new SysInfoType17_v770ext_IEs();
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
			    return new SysInfoType17_v770ext_IEs();
			case 1:
			    return new NonCriticalExtensions();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "sysInfoType17_v770ext"
		public SysInfoType17_v770ext_IEs getSysInfoType17_v770ext()
		{
		    return (SysInfoType17_v770ext_IEs)mComponents[0];
		}
		
		public void setSysInfoType17_v770ext(SysInfoType17_v770ext_IEs sysInfoType17_v770ext)
		{
		    mComponents[0] = sysInfoType17_v770ext;
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
			    "SysInfoType17$V4b0NCEs$V590NCEs$V770NCEs$NonCriticalExtensions"
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
			"SysInfoType17$V4b0NCEs$V590NCEs$V770NCEs"
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
					    "SysInfoType17_v770ext_IEs"
					),
					new QName (
					    "InformationElements",
					    "SysInfoType17-v770ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"SysInfoType17_v770ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"SysInfoType17_v770ext_IEs"
					    )
					),
					0
				    )
				),
				"sysInfoType17-v770ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType17$V4b0NCEs$V590NCEs$V770NCEs$NonCriticalExtensions"
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
		    "rrc.informationelements",
		    "SysInfoType17$V4b0NCEs$V590NCEs"
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
					"SysInfoType17_v590ext_IEs"
				    ),
				    new QName (
					"InformationElements",
					"SysInfoType17-v590ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType17_v590ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType17_v590ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "sysInfoType17-v590ext",
			    0,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "SysInfoType17$V4b0NCEs$V590NCEs$V770NCEs"
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
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SysInfoType17$V4b0NCEs"
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
				    "SysInfoType17_v4b0ext_IEs"
				),
				new QName (
				    "InformationElements",
				    "SysInfoType17-v4b0ext-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType17_v4b0ext_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType17_v4b0ext_IEs"
				    )
				),
				0
			    )
			),
			"sysInfoType17-v4b0ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"SysInfoType17$V4b0NCEs$V590NCEs"
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
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "SysInfoType17"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType17"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PUSCH_SysInfoList"
			    ),
			    new QName (
				"InformationElements",
				"PUSCH-SysInfoList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "PUSCH_SysInfo"
				)
			    )
			)
		    ),
		    "pusch-SysInfoList",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PDSCH_SysInfoList"
			    ),
			    new QName (
				"InformationElements",
				"PDSCH-SysInfoList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "PDSCH_SysInfo"
				)
			    )
			)
		    ),
		    "pdsch-SysInfoList",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType17$V4b0NCEs"
			)
		    ),
		    "v4b0NCEs",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType17 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType17 object.
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
    
} // End class definition for SysInfoType17
