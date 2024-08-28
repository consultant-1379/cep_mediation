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
 * Define the ASN1 Type SysInfoType15_5 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType15_5 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType15_5()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType15_5(UE_Positioning_OTDOA_AssistanceData_UEB ue_positioning_OTDOA_AssistanceData_UEB, 
		    V3a0NCEs v3a0NCEs)
    {
	setUe_positioning_OTDOA_AssistanceData_UEB(ue_positioning_OTDOA_AssistanceData_UEB);
	setV3a0NCEs(v3a0NCEs);
    }
    
    /**
     * Construct with required components.
     */
    public SysInfoType15_5(UE_Positioning_OTDOA_AssistanceData_UEB ue_positioning_OTDOA_AssistanceData_UEB)
    {
	setUe_positioning_OTDOA_AssistanceData_UEB(ue_positioning_OTDOA_AssistanceData_UEB);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_Positioning_OTDOA_AssistanceData_UEB();
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
		return new UE_Positioning_OTDOA_AssistanceData_UEB();
	    case 1:
		return new V3a0NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_positioning_OTDOA_AssistanceData_UEB"
    public UE_Positioning_OTDOA_AssistanceData_UEB getUe_positioning_OTDOA_AssistanceData_UEB()
    {
	return (UE_Positioning_OTDOA_AssistanceData_UEB)mComponents[0];
    }
    
    public void setUe_positioning_OTDOA_AssistanceData_UEB(UE_Positioning_OTDOA_AssistanceData_UEB ue_positioning_OTDOA_AssistanceData_UEB)
    {
	mComponents[0] = ue_positioning_OTDOA_AssistanceData_UEB;
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
	public V3a0NCEs(SysInfoType15_5_v3a0ext sysInfoType15_5_v3a0ext, 
			V770NCEs v770NCEs)
	{
	    setSysInfoType15_5_v3a0ext(sysInfoType15_5_v3a0ext);
	    setV770NCEs(v770NCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public V3a0NCEs(SysInfoType15_5_v3a0ext sysInfoType15_5_v3a0ext)
	{
	    setSysInfoType15_5_v3a0ext(sysInfoType15_5_v3a0ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new SysInfoType15_5_v3a0ext();
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
		    return new SysInfoType15_5_v3a0ext();
		case 1:
		    return new V770NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "sysInfoType15_5_v3a0ext"
	public SysInfoType15_5_v3a0ext getSysInfoType15_5_v3a0ext()
	{
	    return (SysInfoType15_5_v3a0ext)mComponents[0];
	}
	
	public void setSysInfoType15_5_v3a0ext(SysInfoType15_5_v3a0ext sysInfoType15_5_v3a0ext)
	{
	    mComponents[0] = sysInfoType15_5_v3a0ext;
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
	    public V770NCEs(SysInfoType15_5_v770ext_IEs sysInfoType15_5_v770ext, 
			    NonCriticalExtensions nonCriticalExtensions)
	    {
		setSysInfoType15_5_v770ext(sysInfoType15_5_v770ext);
		setNonCriticalExtensions(nonCriticalExtensions);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public V770NCEs(SysInfoType15_5_v770ext_IEs sysInfoType15_5_v770ext)
	    {
		setSysInfoType15_5_v770ext(sysInfoType15_5_v770ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new SysInfoType15_5_v770ext_IEs();
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
			return new SysInfoType15_5_v770ext_IEs();
		    case 1:
			return new NonCriticalExtensions();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "sysInfoType15_5_v770ext"
	    public SysInfoType15_5_v770ext_IEs getSysInfoType15_5_v770ext()
	    {
		return (SysInfoType15_5_v770ext_IEs)mComponents[0];
	    }
	    
	    public void setSysInfoType15_5_v770ext(SysInfoType15_5_v770ext_IEs sysInfoType15_5_v770ext)
	    {
		mComponents[0] = sysInfoType15_5_v770ext;
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
			"SysInfoType15_5$V3a0NCEs$V770NCEs$NonCriticalExtensions"
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
		    "SysInfoType15_5$V3a0NCEs$V770NCEs"
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
					"SysInfoType15_5_v770ext_IEs"
				    ),
				    new QName (
					"InformationElements",
					"SysInfoType15-5-v770ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType15_5_v770ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType15_5_v770ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "sysInfoType15-5-v770ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "SysInfoType15_5$V3a0NCEs$V770NCEs$NonCriticalExtensions"
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
		"SysInfoType15_5$V3a0NCEs"
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
				    "SysInfoType15_5_v3a0ext"
				),
				new QName (
				    "InformationElements",
				    "SysInfoType15-5-v3a0ext"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType15_5_v3a0ext"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType15_5_v3a0ext"
				    )
				),
				0
			    )
			),
			"sysInfoType15-5-v3a0ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"SysInfoType15_5$V3a0NCEs$V770NCEs"
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
	    "SysInfoType15_5"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType15-5"
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
				"UE_Positioning_OTDOA_AssistanceData_UEB"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-OTDOA-AssistanceData-UEB"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_OTDOA_AssistanceData_UEB"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_OTDOA_AssistanceData_UEB"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-OTDOA-AssistanceData-UEB",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType15_5$V3a0NCEs"
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType15_5 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType15_5 object.
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
    
} // End class definition for SysInfoType15_5
