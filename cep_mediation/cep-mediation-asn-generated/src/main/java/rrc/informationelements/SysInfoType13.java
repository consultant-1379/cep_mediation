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
 * Define the ASN1 Type SysInfoType13 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType13 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType13()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType13(CN_DomainSysInfoList cn_DomainSysInfoList, 
		    UE_IdleTimersAndConstants ue_IdleTimersAndConstants, 
		    CapabilityUpdateRequirement capabilityUpdateRequirement, 
		    V3a0NCEs v3a0NCEs)
    {
	setCn_DomainSysInfoList(cn_DomainSysInfoList);
	setUe_IdleTimersAndConstants(ue_IdleTimersAndConstants);
	setCapabilityUpdateRequirement(capabilityUpdateRequirement);
	setV3a0NCEs(v3a0NCEs);
    }
    
    /**
     * Construct with required components.
     */
    public SysInfoType13(CN_DomainSysInfoList cn_DomainSysInfoList)
    {
	setCn_DomainSysInfoList(cn_DomainSysInfoList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CN_DomainSysInfoList();
	mComponents[1] = new UE_IdleTimersAndConstants();
	mComponents[2] = new CapabilityUpdateRequirement();
	mComponents[3] = new V3a0NCEs();
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
		return new CN_DomainSysInfoList();
	    case 1:
		return new UE_IdleTimersAndConstants();
	    case 2:
		return new CapabilityUpdateRequirement();
	    case 3:
		return new V3a0NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cn_DomainSysInfoList"
    public CN_DomainSysInfoList getCn_DomainSysInfoList()
    {
	return (CN_DomainSysInfoList)mComponents[0];
    }
    
    public void setCn_DomainSysInfoList(CN_DomainSysInfoList cn_DomainSysInfoList)
    {
	mComponents[0] = cn_DomainSysInfoList;
    }
    
    
    // Methods for field "ue_IdleTimersAndConstants"
    public UE_IdleTimersAndConstants getUe_IdleTimersAndConstants()
    {
	return (UE_IdleTimersAndConstants)mComponents[1];
    }
    
    public void setUe_IdleTimersAndConstants(UE_IdleTimersAndConstants ue_IdleTimersAndConstants)
    {
	mComponents[1] = ue_IdleTimersAndConstants;
    }
    
    public boolean hasUe_IdleTimersAndConstants()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUe_IdleTimersAndConstants()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "capabilityUpdateRequirement"
    public CapabilityUpdateRequirement getCapabilityUpdateRequirement()
    {
	return (CapabilityUpdateRequirement)mComponents[2];
    }
    
    public void setCapabilityUpdateRequirement(CapabilityUpdateRequirement capabilityUpdateRequirement)
    {
	mComponents[2] = capabilityUpdateRequirement;
    }
    
    public boolean hasCapabilityUpdateRequirement()
    {
	return componentIsPresent(2);
    }
    
    public void deleteCapabilityUpdateRequirement()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "v3a0NCEs"
    public V3a0NCEs getV3a0NCEs()
    {
	return (V3a0NCEs)mComponents[3];
    }
    
    public void setV3a0NCEs(V3a0NCEs v3a0NCEs)
    {
	mComponents[3] = v3a0NCEs;
    }
    
    public boolean hasV3a0NCEs()
    {
	return componentIsPresent(3);
    }
    
    public void deleteV3a0NCEs()
    {
	setComponentAbsent(3);
    }
    
    
    
    /**
     * Define the ASN1 Type V3a0NCEs from ASN1 Module InformationElements.
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
	public V3a0NCEs(SysInfoType13_v3a0ext_IEs sysInfoType13_v3a0ext, 
			V4b0NCEs v4b0NCEs)
	{
	    setSysInfoType13_v3a0ext(sysInfoType13_v3a0ext);
	    setV4b0NCEs(v4b0NCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public V3a0NCEs(SysInfoType13_v3a0ext_IEs sysInfoType13_v3a0ext)
	{
	    setSysInfoType13_v3a0ext(sysInfoType13_v3a0ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new SysInfoType13_v3a0ext_IEs();
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
		    return new SysInfoType13_v3a0ext_IEs();
		case 1:
		    return new V4b0NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "sysInfoType13_v3a0ext"
	public SysInfoType13_v3a0ext_IEs getSysInfoType13_v3a0ext()
	{
	    return (SysInfoType13_v3a0ext_IEs)mComponents[0];
	}
	
	public void setSysInfoType13_v3a0ext(SysInfoType13_v3a0ext_IEs sysInfoType13_v3a0ext)
	{
	    mComponents[0] = sysInfoType13_v3a0ext;
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
	    public V4b0NCEs(SysInfoType13_v4b0ext_IEs sysInfoType13_v4b0ext, 
			    V770NCEs v770NCEs)
	    {
		setSysInfoType13_v4b0ext(sysInfoType13_v4b0ext);
		setV770NCEs(v770NCEs);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V4b0NCEs(SysInfoType13_v4b0ext_IEs sysInfoType13_v4b0ext)
	    {
		setSysInfoType13_v4b0ext(sysInfoType13_v4b0ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new SysInfoType13_v4b0ext_IEs();
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
			return new SysInfoType13_v4b0ext_IEs();
		    case 1:
			return new V770NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "sysInfoType13_v4b0ext"
	    public SysInfoType13_v4b0ext_IEs getSysInfoType13_v4b0ext()
	    {
		return (SysInfoType13_v4b0ext_IEs)mComponents[0];
	    }
	    
	    public void setSysInfoType13_v4b0ext(SysInfoType13_v4b0ext_IEs sysInfoType13_v4b0ext)
	    {
		mComponents[0] = sysInfoType13_v4b0ext;
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
		public V770NCEs(SysInfoType13_v770ext_IEs sysInfoType13_v770ext, 
				NonCriticalExtensions nonCriticalExtensions)
		{
		    setSysInfoType13_v770ext(sysInfoType13_v770ext);
		    setNonCriticalExtensions(nonCriticalExtensions);
		}
		
		/**
		 * Construct with required components.
		 */
		public V770NCEs(SysInfoType13_v770ext_IEs sysInfoType13_v770ext)
		{
		    setSysInfoType13_v770ext(sysInfoType13_v770ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new SysInfoType13_v770ext_IEs();
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
			    return new SysInfoType13_v770ext_IEs();
			case 1:
			    return new NonCriticalExtensions();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "sysInfoType13_v770ext"
		public SysInfoType13_v770ext_IEs getSysInfoType13_v770ext()
		{
		    return (SysInfoType13_v770ext_IEs)mComponents[0];
		}
		
		public void setSysInfoType13_v770ext(SysInfoType13_v770ext_IEs sysInfoType13_v770ext)
		{
		    mComponents[0] = sysInfoType13_v770ext;
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
			    "SysInfoType13$V3a0NCEs$V4b0NCEs$V770NCEs$NonCriticalExtensions"
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
			"SysInfoType13$V3a0NCEs$V4b0NCEs$V770NCEs"
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
					    "SysInfoType13_v770ext_IEs"
					),
					new QName (
					    "InformationElements",
					    "SysInfoType13-v770ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"SysInfoType13_v770ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"SysInfoType13_v770ext_IEs"
					    )
					),
					0
				    )
				),
				"sysInfoType13-v770ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType13$V3a0NCEs$V4b0NCEs$V770NCEs$NonCriticalExtensions"
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
		    "SysInfoType13$V3a0NCEs$V4b0NCEs"
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
					"SysInfoType13_v4b0ext_IEs"
				    ),
				    new QName (
					"InformationElements",
					"SysInfoType13-v4b0ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType13_v4b0ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType13_v4b0ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "sysInfoType13-v4b0ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "SysInfoType13$V3a0NCEs$V4b0NCEs$V770NCEs"
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
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SysInfoType13$V3a0NCEs"
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
				    "SysInfoType13_v3a0ext_IEs"
				),
				new QName (
				    "InformationElements",
				    "SysInfoType13-v3a0ext-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType13_v3a0ext_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType13_v3a0ext_IEs"
				    )
				),
				0
			    )
			),
			"sysInfoType13-v3a0ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"SysInfoType13$V3a0NCEs$V4b0NCEs"
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
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "SysInfoType13"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType13"
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
				"CN_DomainSysInfoList"
			    ),
			    new QName (
				"InformationElements",
				"CN-DomainSysInfoList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(4),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "CN_DomainSysInfo"
				)
			    )
			)
		    ),
		    "cn-DomainSysInfoList",
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
				"UE_IdleTimersAndConstants"
			    ),
			    new QName (
				"InformationElements",
				"UE-IdleTimersAndConstants"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_IdleTimersAndConstants"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_IdleTimersAndConstants"
				)
			    ),
			    0
			)
		    ),
		    "ue-IdleTimersAndConstants",
		    1,
		    3,
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
				"CapabilityUpdateRequirement"
			    ),
			    new QName (
				"InformationElements",
				"CapabilityUpdateRequirement"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CapabilityUpdateRequirement"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CapabilityUpdateRequirement"
				)
			    ),
			    0
			)
		    ),
		    "capabilityUpdateRequirement",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType13$V3a0NCEs"
			)
		    ),
		    "v3a0NCEs",
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType13 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType13 object.
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
    
} // End class definition for SysInfoType13
