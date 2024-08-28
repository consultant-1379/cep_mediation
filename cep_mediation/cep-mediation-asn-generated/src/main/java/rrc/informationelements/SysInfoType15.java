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
 * Define the ASN1 Type SysInfoType15 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType15 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType15()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType15(UE_Positioning_CipherParameters ue_positioning_GPS_CipherParameters, 
		    ReferenceLocation ue_positioning_GPS_ReferenceLocation, 
		    UE_Positioning_GPS_ReferenceTime ue_positioning_GPS_ReferenceTime, 
		    BadSatList ue_positioning_GPS_Real_timeIntegrity, 
		    V4b0NCEs v4b0NCEs)
    {
	setUe_positioning_GPS_CipherParameters(ue_positioning_GPS_CipherParameters);
	setUe_positioning_GPS_ReferenceLocation(ue_positioning_GPS_ReferenceLocation);
	setUe_positioning_GPS_ReferenceTime(ue_positioning_GPS_ReferenceTime);
	setUe_positioning_GPS_Real_timeIntegrity(ue_positioning_GPS_Real_timeIntegrity);
	setV4b0NCEs(v4b0NCEs);
    }
    
    /**
     * Construct with required components.
     */
    public SysInfoType15(ReferenceLocation ue_positioning_GPS_ReferenceLocation, 
		    UE_Positioning_GPS_ReferenceTime ue_positioning_GPS_ReferenceTime)
    {
	setUe_positioning_GPS_ReferenceLocation(ue_positioning_GPS_ReferenceLocation);
	setUe_positioning_GPS_ReferenceTime(ue_positioning_GPS_ReferenceTime);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_Positioning_CipherParameters();
	mComponents[1] = new ReferenceLocation();
	mComponents[2] = new UE_Positioning_GPS_ReferenceTime();
	mComponents[3] = new BadSatList();
	mComponents[4] = new V4b0NCEs();
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
		return new UE_Positioning_CipherParameters();
	    case 1:
		return new ReferenceLocation();
	    case 2:
		return new UE_Positioning_GPS_ReferenceTime();
	    case 3:
		return new BadSatList();
	    case 4:
		return new V4b0NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_positioning_GPS_CipherParameters"
    public UE_Positioning_CipherParameters getUe_positioning_GPS_CipherParameters()
    {
	return (UE_Positioning_CipherParameters)mComponents[0];
    }
    
    public void setUe_positioning_GPS_CipherParameters(UE_Positioning_CipherParameters ue_positioning_GPS_CipherParameters)
    {
	mComponents[0] = ue_positioning_GPS_CipherParameters;
    }
    
    public boolean hasUe_positioning_GPS_CipherParameters()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_positioning_GPS_CipherParameters()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ue_positioning_GPS_ReferenceLocation"
    public ReferenceLocation getUe_positioning_GPS_ReferenceLocation()
    {
	return (ReferenceLocation)mComponents[1];
    }
    
    public void setUe_positioning_GPS_ReferenceLocation(ReferenceLocation ue_positioning_GPS_ReferenceLocation)
    {
	mComponents[1] = ue_positioning_GPS_ReferenceLocation;
    }
    
    
    // Methods for field "ue_positioning_GPS_ReferenceTime"
    public UE_Positioning_GPS_ReferenceTime getUe_positioning_GPS_ReferenceTime()
    {
	return (UE_Positioning_GPS_ReferenceTime)mComponents[2];
    }
    
    public void setUe_positioning_GPS_ReferenceTime(UE_Positioning_GPS_ReferenceTime ue_positioning_GPS_ReferenceTime)
    {
	mComponents[2] = ue_positioning_GPS_ReferenceTime;
    }
    
    
    // Methods for field "ue_positioning_GPS_Real_timeIntegrity"
    public BadSatList getUe_positioning_GPS_Real_timeIntegrity()
    {
	return (BadSatList)mComponents[3];
    }
    
    public void setUe_positioning_GPS_Real_timeIntegrity(BadSatList ue_positioning_GPS_Real_timeIntegrity)
    {
	mComponents[3] = ue_positioning_GPS_Real_timeIntegrity;
    }
    
    public boolean hasUe_positioning_GPS_Real_timeIntegrity()
    {
	return componentIsPresent(3);
    }
    
    public void deleteUe_positioning_GPS_Real_timeIntegrity()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "v4b0NCEs"
    public V4b0NCEs getV4b0NCEs()
    {
	return (V4b0NCEs)mComponents[4];
    }
    
    public void setV4b0NCEs(V4b0NCEs v4b0NCEs)
    {
	mComponents[4] = v4b0NCEs;
    }
    
    public boolean hasV4b0NCEs()
    {
	return componentIsPresent(4);
    }
    
    public void deleteV4b0NCEs()
    {
	setComponentAbsent(4);
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
	public V4b0NCEs(SysInfoType15_v4b0ext_IEs sysInfoType15_v4b0ext, 
			V770NCEs v770NCEs)
	{
	    setSysInfoType15_v4b0ext(sysInfoType15_v4b0ext);
	    setV770NCEs(v770NCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public V4b0NCEs(SysInfoType15_v4b0ext_IEs sysInfoType15_v4b0ext)
	{
	    setSysInfoType15_v4b0ext(sysInfoType15_v4b0ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new SysInfoType15_v4b0ext_IEs();
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
		    return new SysInfoType15_v4b0ext_IEs();
		case 1:
		    return new V770NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "sysInfoType15_v4b0ext"
	public SysInfoType15_v4b0ext_IEs getSysInfoType15_v4b0ext()
	{
	    return (SysInfoType15_v4b0ext_IEs)mComponents[0];
	}
	
	public void setSysInfoType15_v4b0ext(SysInfoType15_v4b0ext_IEs sysInfoType15_v4b0ext)
	{
	    mComponents[0] = sysInfoType15_v4b0ext;
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
	    public V770NCEs(SysInfoType15_v770ext_IEs sysInfoType15_v770ext, 
			    Va40NCEs va40NCEs)
	    {
		setSysInfoType15_v770ext(sysInfoType15_v770ext);
		setVa40NCEs(va40NCEs);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V770NCEs(SysInfoType15_v770ext_IEs sysInfoType15_v770ext)
	    {
		setSysInfoType15_v770ext(sysInfoType15_v770ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new SysInfoType15_v770ext_IEs();
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
			return new SysInfoType15_v770ext_IEs();
		    case 1:
			return new Va40NCEs();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "sysInfoType15_v770ext"
	    public SysInfoType15_v770ext_IEs getSysInfoType15_v770ext()
	    {
		return (SysInfoType15_v770ext_IEs)mComponents[0];
	    }
	    
	    public void setSysInfoType15_v770ext(SysInfoType15_v770ext_IEs sysInfoType15_v770ext)
	    {
		mComponents[0] = sysInfoType15_v770ext;
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
	     * Define the ASN1 Type Va40NCEs from ASN1 Module InformationElements.
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
		public Va40NCEs(SysInfoType15_va40ext_IEs sysInfoType15_va40ext, 
				NonCriticalExtensions nonCriticalExtensions)
		{
		    setSysInfoType15_va40ext(sysInfoType15_va40ext);
		    setNonCriticalExtensions(nonCriticalExtensions);
		}
		
		/**
		 * Construct with required components.
		 */
		public Va40NCEs(SysInfoType15_va40ext_IEs sysInfoType15_va40ext)
		{
		    setSysInfoType15_va40ext(sysInfoType15_va40ext);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new SysInfoType15_va40ext_IEs();
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
			    return new SysInfoType15_va40ext_IEs();
			case 1:
			    return new NonCriticalExtensions();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "sysInfoType15_va40ext"
		public SysInfoType15_va40ext_IEs getSysInfoType15_va40ext()
		{
		    return (SysInfoType15_va40ext_IEs)mComponents[0];
		}
		
		public void setSysInfoType15_va40ext(SysInfoType15_va40ext_IEs sysInfoType15_va40ext)
		{
		    mComponents[0] = sysInfoType15_va40ext;
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
			    "SysInfoType15$V4b0NCEs$V770NCEs$Va40NCEs$NonCriticalExtensions"
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
			"SysInfoType15$V4b0NCEs$V770NCEs$Va40NCEs"
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
					    "SysInfoType15_va40ext_IEs"
					),
					new QName (
					    "InformationElements",
					    "SysInfoType15-va40ext-IEs"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"SysInfoType15_va40ext_IEs"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"SysInfoType15_va40ext_IEs"
					    )
					),
					0
				    )
				),
				"sysInfoType15-va40ext",
				0,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType15$V4b0NCEs$V770NCEs$Va40NCEs$NonCriticalExtensions"
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
		    "rrc.informationelements",
		    "SysInfoType15$V4b0NCEs$V770NCEs"
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
					"SysInfoType15_v770ext_IEs"
				    ),
				    new QName (
					"InformationElements",
					"SysInfoType15-v770ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType15_v770ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType15_v770ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "sysInfoType15-v770ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "SysInfoType15$V4b0NCEs$V770NCEs$Va40NCEs"
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
		    (short)0x8004
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SysInfoType15$V4b0NCEs"
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
				    "SysInfoType15_v4b0ext_IEs"
				),
				new QName (
				    "InformationElements",
				    "SysInfoType15-v4b0ext-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType15_v4b0ext_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType15_v4b0ext_IEs"
				    )
				),
				0
			    )
			),
			"sysInfoType15-v4b0ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"SysInfoType15$V4b0NCEs$V770NCEs"
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
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "SysInfoType15"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType15"
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
				"UE_Positioning_CipherParameters"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-CipherParameters"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_CipherParameters"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_CipherParameters"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GPS-CipherParameters",
		    0,
		    3,
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
				"ReferenceLocation"
			    ),
			    new QName (
				"InformationElements",
				"ReferenceLocation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ReferenceLocation"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "ReferenceLocation"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GPS-ReferenceLocation",
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
				"UE_Positioning_GPS_ReferenceTime"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-ReferenceTime"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_ReferenceTime"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_ReferenceTime"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GPS-ReferenceTime",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"BadSatList"
			    ),
			    new QName (
				"InformationElements",
				"BadSatList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(16),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    new TypeInfoRef (
				new IntegerInfo (
				    new Tags (
					new short[] {
					    0x0002
					}
				    ),
				    new QName (
					"com.oss.asn1",
					"INTEGER"
				    ),
				    new QName (
					"builtin",
					"INTEGER"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(0), 
					    new com.oss.asn1.INTEGER(63),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(63)
				    ),
				    null
				)
			    )
			)
		    ),
		    "ue-positioning-GPS-Real-timeIntegrity",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType15$V4b0NCEs"
			)
		    ),
		    "v4b0NCEs",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType15 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType15 object.
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
    
} // End class definition for SysInfoType15
