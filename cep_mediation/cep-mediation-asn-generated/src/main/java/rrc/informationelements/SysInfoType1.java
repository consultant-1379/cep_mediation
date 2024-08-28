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
 * Define the ASN1 Type SysInfoType1 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType1 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType1()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType1(NAS_SystemInformationGSM_MAP cn_CommonGSM_MAP_NAS_SysInfo, 
		    CN_DomainSysInfoList cn_DomainSysInfoList, 
		    UE_ConnTimersAndConstants ue_ConnTimersAndConstants, 
		    UE_IdleTimersAndConstants ue_IdleTimersAndConstants, 
		    V3a0NCEs v3a0NCEs)
    {
	setCn_CommonGSM_MAP_NAS_SysInfo(cn_CommonGSM_MAP_NAS_SysInfo);
	setCn_DomainSysInfoList(cn_DomainSysInfoList);
	setUe_ConnTimersAndConstants(ue_ConnTimersAndConstants);
	setUe_IdleTimersAndConstants(ue_IdleTimersAndConstants);
	setV3a0NCEs(v3a0NCEs);
    }
    
    /**
     * Construct with required components.
     */
    public SysInfoType1(NAS_SystemInformationGSM_MAP cn_CommonGSM_MAP_NAS_SysInfo, 
		    CN_DomainSysInfoList cn_DomainSysInfoList)
    {
	setCn_CommonGSM_MAP_NAS_SysInfo(cn_CommonGSM_MAP_NAS_SysInfo);
	setCn_DomainSysInfoList(cn_DomainSysInfoList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new NAS_SystemInformationGSM_MAP();
	mComponents[1] = new CN_DomainSysInfoList();
	mComponents[2] = new UE_ConnTimersAndConstants();
	mComponents[3] = new UE_IdleTimersAndConstants();
	mComponents[4] = new V3a0NCEs();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new NAS_SystemInformationGSM_MAP();
	    case 1:
		return new CN_DomainSysInfoList();
	    case 2:
		return new UE_ConnTimersAndConstants();
	    case 3:
		return new UE_IdleTimersAndConstants();
	    case 4:
		return new V3a0NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cn_CommonGSM_MAP_NAS_SysInfo"
    public NAS_SystemInformationGSM_MAP getCn_CommonGSM_MAP_NAS_SysInfo()
    {
	return (NAS_SystemInformationGSM_MAP)mComponents[0];
    }
    
    public void setCn_CommonGSM_MAP_NAS_SysInfo(NAS_SystemInformationGSM_MAP cn_CommonGSM_MAP_NAS_SysInfo)
    {
	mComponents[0] = cn_CommonGSM_MAP_NAS_SysInfo;
    }
    
    
    // Methods for field "cn_DomainSysInfoList"
    public CN_DomainSysInfoList getCn_DomainSysInfoList()
    {
	return (CN_DomainSysInfoList)mComponents[1];
    }
    
    public void setCn_DomainSysInfoList(CN_DomainSysInfoList cn_DomainSysInfoList)
    {
	mComponents[1] = cn_DomainSysInfoList;
    }
    
    
    // Methods for field "ue_ConnTimersAndConstants"
    public UE_ConnTimersAndConstants getUe_ConnTimersAndConstants()
    {
	return (UE_ConnTimersAndConstants)mComponents[2];
    }
    
    public void setUe_ConnTimersAndConstants(UE_ConnTimersAndConstants ue_ConnTimersAndConstants)
    {
	mComponents[2] = ue_ConnTimersAndConstants;
    }
    
    public boolean hasUe_ConnTimersAndConstants()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUe_ConnTimersAndConstants()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "ue_IdleTimersAndConstants"
    public UE_IdleTimersAndConstants getUe_IdleTimersAndConstants()
    {
	return (UE_IdleTimersAndConstants)mComponents[3];
    }
    
    public void setUe_IdleTimersAndConstants(UE_IdleTimersAndConstants ue_IdleTimersAndConstants)
    {
	mComponents[3] = ue_IdleTimersAndConstants;
    }
    
    public boolean hasUe_IdleTimersAndConstants()
    {
	return componentIsPresent(3);
    }
    
    public void deleteUe_IdleTimersAndConstants()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "v3a0NCEs"
    public V3a0NCEs getV3a0NCEs()
    {
	return (V3a0NCEs)mComponents[4];
    }
    
    public void setV3a0NCEs(V3a0NCEs v3a0NCEs)
    {
	mComponents[4] = v3a0NCEs;
    }
    
    public boolean hasV3a0NCEs()
    {
	return componentIsPresent(4);
    }
    
    public void deleteV3a0NCEs()
    {
	setComponentAbsent(4);
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
	public V3a0NCEs(SysInfoType1_v3a0ext_IEs sysInfoType1_v3a0ext, 
			V860NonCriticalExtentions v860NonCriticalExtentions)
	{
	    setSysInfoType1_v3a0ext(sysInfoType1_v3a0ext);
	    setV860NonCriticalExtentions(v860NonCriticalExtentions);
	}
	
	/**
	 * Construct with required components.
	 */
	public V3a0NCEs(SysInfoType1_v3a0ext_IEs sysInfoType1_v3a0ext)
	{
	    setSysInfoType1_v3a0ext(sysInfoType1_v3a0ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new SysInfoType1_v3a0ext_IEs();
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
		    return new SysInfoType1_v3a0ext_IEs();
		case 1:
		    return new V860NonCriticalExtentions();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "sysInfoType1_v3a0ext"
	public SysInfoType1_v3a0ext_IEs getSysInfoType1_v3a0ext()
	{
	    return (SysInfoType1_v3a0ext_IEs)mComponents[0];
	}
	
	public void setSysInfoType1_v3a0ext(SysInfoType1_v3a0ext_IEs sysInfoType1_v3a0ext)
	{
	    mComponents[0] = sysInfoType1_v3a0ext;
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
	 * Define the ASN1 Type V860NonCriticalExtentions from ASN1 Module InformationElements.
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
	    public V860NonCriticalExtentions(SysInfoType1_v860ext_IEs sysInfoType1_v860ext, 
			    NonCriticalExtensions nonCriticalExtensions)
	    {
		setSysInfoType1_v860ext(sysInfoType1_v860ext);
		setNonCriticalExtensions(nonCriticalExtensions);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V860NonCriticalExtentions(SysInfoType1_v860ext_IEs sysInfoType1_v860ext)
	    {
		setSysInfoType1_v860ext(sysInfoType1_v860ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new SysInfoType1_v860ext_IEs();
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
			return new SysInfoType1_v860ext_IEs();
		    case 1:
			return new NonCriticalExtensions();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "sysInfoType1_v860ext"
	    public SysInfoType1_v860ext_IEs getSysInfoType1_v860ext()
	    {
		return (SysInfoType1_v860ext_IEs)mComponents[0];
	    }
	    
	    public void setSysInfoType1_v860ext(SysInfoType1_v860ext_IEs sysInfoType1_v860ext)
	    {
		mComponents[0] = sysInfoType1_v860ext;
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
			"SysInfoType1$V3a0NCEs$V860NonCriticalExtentions$NonCriticalExtensions"
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
		    "SysInfoType1$V3a0NCEs$V860NonCriticalExtentions"
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
					"SysInfoType1_v860ext_IEs"
				    ),
				    new QName (
					"InformationElements",
					"SysInfoType1-v860ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType1_v860ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType1_v860ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "sysInfoType1-v860ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "SysInfoType1$V3a0NCEs$V860NonCriticalExtentions$NonCriticalExtensions"
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
		    (short)0x8004
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SysInfoType1$V3a0NCEs"
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
				    "SysInfoType1_v3a0ext_IEs"
				),
				new QName (
				    "InformationElements",
				    "SysInfoType1-v3a0ext-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType1_v3a0ext_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType1_v3a0ext_IEs"
				    )
				),
				0
			    )
			),
			"sysInfoType1-v3a0ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"SysInfoType1$V3a0NCEs$V860NonCriticalExtentions"
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
	    "SysInfoType1"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType1"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"NAS_SystemInformationGSM_MAP"
			    ),
			    new QName (
				"InformationElements",
				"NAS-SystemInformationGSM-MAP"
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
			    )
			)
		    ),
		    "cn-CommonGSM-MAP-NAS-SysInfo",
		    0,
		    2,
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
				"UE_ConnTimersAndConstants"
			    ),
			    new QName (
				"InformationElements",
				"UE-ConnTimersAndConstants"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_ConnTimersAndConstants"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_ConnTimersAndConstants"
				)
			    ),
			    0
			)
		    ),
		    "ue-ConnTimersAndConstants",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType1$V3a0NCEs"
			)
		    ),
		    "v3a0NCEs",
		    4,
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType1 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType1 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType1
