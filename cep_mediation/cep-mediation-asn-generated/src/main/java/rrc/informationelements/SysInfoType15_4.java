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
 * Define the ASN1 Type SysInfoType15_4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType15_4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType15_4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType15_4(UE_Positioning_CipherParameters ue_positioning_OTDOA_CipherParameters, 
		    UE_Positioning_OTDOA_AssistanceData ue_positioning_OTDOA_AssistanceData, 
		    V3a0NCEs v3a0NCEs)
    {
	setUe_positioning_OTDOA_CipherParameters(ue_positioning_OTDOA_CipherParameters);
	setUe_positioning_OTDOA_AssistanceData(ue_positioning_OTDOA_AssistanceData);
	setV3a0NCEs(v3a0NCEs);
    }
    
    /**
     * Construct with required components.
     */
    public SysInfoType15_4(UE_Positioning_OTDOA_AssistanceData ue_positioning_OTDOA_AssistanceData)
    {
	setUe_positioning_OTDOA_AssistanceData(ue_positioning_OTDOA_AssistanceData);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_Positioning_CipherParameters();
	mComponents[1] = new UE_Positioning_OTDOA_AssistanceData();
	mComponents[2] = new V3a0NCEs();
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
		return new UE_Positioning_CipherParameters();
	    case 1:
		return new UE_Positioning_OTDOA_AssistanceData();
	    case 2:
		return new V3a0NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_positioning_OTDOA_CipherParameters"
    public UE_Positioning_CipherParameters getUe_positioning_OTDOA_CipherParameters()
    {
	return (UE_Positioning_CipherParameters)mComponents[0];
    }
    
    public void setUe_positioning_OTDOA_CipherParameters(UE_Positioning_CipherParameters ue_positioning_OTDOA_CipherParameters)
    {
	mComponents[0] = ue_positioning_OTDOA_CipherParameters;
    }
    
    public boolean hasUe_positioning_OTDOA_CipherParameters()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_positioning_OTDOA_CipherParameters()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ue_positioning_OTDOA_AssistanceData"
    public UE_Positioning_OTDOA_AssistanceData getUe_positioning_OTDOA_AssistanceData()
    {
	return (UE_Positioning_OTDOA_AssistanceData)mComponents[1];
    }
    
    public void setUe_positioning_OTDOA_AssistanceData(UE_Positioning_OTDOA_AssistanceData ue_positioning_OTDOA_AssistanceData)
    {
	mComponents[1] = ue_positioning_OTDOA_AssistanceData;
    }
    
    
    // Methods for field "v3a0NCEs"
    public V3a0NCEs getV3a0NCEs()
    {
	return (V3a0NCEs)mComponents[2];
    }
    
    public void setV3a0NCEs(V3a0NCEs v3a0NCEs)
    {
	mComponents[2] = v3a0NCEs;
    }
    
    public boolean hasV3a0NCEs()
    {
	return componentIsPresent(2);
    }
    
    public void deleteV3a0NCEs()
    {
	setComponentAbsent(2);
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
	public V3a0NCEs(SysInfoType15_4_v3a0ext sysInfoType15_4_v3a0ext, 
			V4b0NCEs v4b0NCEs)
	{
	    setSysInfoType15_4_v3a0ext(sysInfoType15_4_v3a0ext);
	    setV4b0NCEs(v4b0NCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public V3a0NCEs(SysInfoType15_4_v3a0ext sysInfoType15_4_v3a0ext)
	{
	    setSysInfoType15_4_v3a0ext(sysInfoType15_4_v3a0ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new SysInfoType15_4_v3a0ext();
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
		    return new SysInfoType15_4_v3a0ext();
		case 1:
		    return new V4b0NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "sysInfoType15_4_v3a0ext"
	public SysInfoType15_4_v3a0ext getSysInfoType15_4_v3a0ext()
	{
	    return (SysInfoType15_4_v3a0ext)mComponents[0];
	}
	
	public void setSysInfoType15_4_v3a0ext(SysInfoType15_4_v3a0ext sysInfoType15_4_v3a0ext)
	{
	    mComponents[0] = sysInfoType15_4_v3a0ext;
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
	    public V4b0NCEs(SysInfoType15_4_v4b0ext sysInfoType15_4_v4b0ext, 
			    NonCriticalExtensions nonCriticalExtensions)
	    {
		setSysInfoType15_4_v4b0ext(sysInfoType15_4_v4b0ext);
		setNonCriticalExtensions(nonCriticalExtensions);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V4b0NCEs(SysInfoType15_4_v4b0ext sysInfoType15_4_v4b0ext)
	    {
		setSysInfoType15_4_v4b0ext(sysInfoType15_4_v4b0ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new SysInfoType15_4_v4b0ext();
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
			return new SysInfoType15_4_v4b0ext();
		    case 1:
			return new NonCriticalExtensions();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "sysInfoType15_4_v4b0ext"
	    public SysInfoType15_4_v4b0ext getSysInfoType15_4_v4b0ext()
	    {
		return (SysInfoType15_4_v4b0ext)mComponents[0];
	    }
	    
	    public void setSysInfoType15_4_v4b0ext(SysInfoType15_4_v4b0ext sysInfoType15_4_v4b0ext)
	    {
		mComponents[0] = sysInfoType15_4_v4b0ext;
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
			"SysInfoType15_4$V3a0NCEs$V4b0NCEs$NonCriticalExtensions"
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
		    "SysInfoType15_4$V3a0NCEs$V4b0NCEs"
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
					"SysInfoType15_4_v4b0ext"
				    ),
				    new QName (
					"InformationElements",
					"SysInfoType15-4-v4b0ext"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType15_4_v4b0ext"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType15_4_v4b0ext"
					)
				    ),
				    0
				)
			    ),
			    "sysInfoType15-4-v4b0ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "SysInfoType15_4$V3a0NCEs$V4b0NCEs$NonCriticalExtensions"
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
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SysInfoType15_4$V3a0NCEs"
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
				    "SysInfoType15_4_v3a0ext"
				),
				new QName (
				    "InformationElements",
				    "SysInfoType15-4-v3a0ext"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType15_4_v3a0ext"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType15_4_v3a0ext"
				    )
				),
				0
			    )
			),
			"sysInfoType15-4-v3a0ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"SysInfoType15_4$V3a0NCEs$V4b0NCEs"
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
	    "SysInfoType15_4"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType15-4"
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
		    "ue-positioning-OTDOA-CipherParameters",
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
				"UE_Positioning_OTDOA_AssistanceData"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-OTDOA-AssistanceData"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_OTDOA_AssistanceData"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_OTDOA_AssistanceData"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-OTDOA-AssistanceData",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType15_4$V3a0NCEs"
			)
		    ),
		    "v3a0NCEs",
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType15_4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType15_4 object.
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
    
} // End class definition for SysInfoType15_4
