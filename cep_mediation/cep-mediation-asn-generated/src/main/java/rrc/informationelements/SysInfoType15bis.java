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
 * Define the ASN1 Type SysInfoType15bis from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType15bis extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType15bis()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType15bis(ReferenceLocationGANSS ue_positioning_GANSS_ReferencePosition, 
		    UE_Positioning_GANSS_ReferenceTime ue_positioning_GANSS_ReferenceTime, 
		    UE_Positioning_GANSS_IonosphericModel ue_positioning_GANSS_IonosphericModel, 
		    V860NCEs v860NCEs)
    {
	setUe_positioning_GANSS_ReferencePosition(ue_positioning_GANSS_ReferencePosition);
	setUe_positioning_GANSS_ReferenceTime(ue_positioning_GANSS_ReferenceTime);
	setUe_positioning_GANSS_IonosphericModel(ue_positioning_GANSS_IonosphericModel);
	setV860NCEs(v860NCEs);
    }
    
    /**
     * Construct with required components.
     */
    public SysInfoType15bis(ReferenceLocationGANSS ue_positioning_GANSS_ReferencePosition, 
		    UE_Positioning_GANSS_ReferenceTime ue_positioning_GANSS_ReferenceTime)
    {
	setUe_positioning_GANSS_ReferencePosition(ue_positioning_GANSS_ReferencePosition);
	setUe_positioning_GANSS_ReferenceTime(ue_positioning_GANSS_ReferenceTime);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ReferenceLocationGANSS();
	mComponents[1] = new UE_Positioning_GANSS_ReferenceTime();
	mComponents[2] = new UE_Positioning_GANSS_IonosphericModel();
	mComponents[3] = new V860NCEs();
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
		return new ReferenceLocationGANSS();
	    case 1:
		return new UE_Positioning_GANSS_ReferenceTime();
	    case 2:
		return new UE_Positioning_GANSS_IonosphericModel();
	    case 3:
		return new V860NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_positioning_GANSS_ReferencePosition"
    public ReferenceLocationGANSS getUe_positioning_GANSS_ReferencePosition()
    {
	return (ReferenceLocationGANSS)mComponents[0];
    }
    
    public void setUe_positioning_GANSS_ReferencePosition(ReferenceLocationGANSS ue_positioning_GANSS_ReferencePosition)
    {
	mComponents[0] = ue_positioning_GANSS_ReferencePosition;
    }
    
    
    // Methods for field "ue_positioning_GANSS_ReferenceTime"
    public UE_Positioning_GANSS_ReferenceTime getUe_positioning_GANSS_ReferenceTime()
    {
	return (UE_Positioning_GANSS_ReferenceTime)mComponents[1];
    }
    
    public void setUe_positioning_GANSS_ReferenceTime(UE_Positioning_GANSS_ReferenceTime ue_positioning_GANSS_ReferenceTime)
    {
	mComponents[1] = ue_positioning_GANSS_ReferenceTime;
    }
    
    
    // Methods for field "ue_positioning_GANSS_IonosphericModel"
    public UE_Positioning_GANSS_IonosphericModel getUe_positioning_GANSS_IonosphericModel()
    {
	return (UE_Positioning_GANSS_IonosphericModel)mComponents[2];
    }
    
    public void setUe_positioning_GANSS_IonosphericModel(UE_Positioning_GANSS_IonosphericModel ue_positioning_GANSS_IonosphericModel)
    {
	mComponents[2] = ue_positioning_GANSS_IonosphericModel;
    }
    
    public boolean hasUe_positioning_GANSS_IonosphericModel()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUe_positioning_GANSS_IonosphericModel()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "v860NCEs"
    public V860NCEs getV860NCEs()
    {
	return (V860NCEs)mComponents[3];
    }
    
    public void setV860NCEs(V860NCEs v860NCEs)
    {
	mComponents[3] = v860NCEs;
    }
    
    public boolean hasV860NCEs()
    {
	return componentIsPresent(3);
    }
    
    public void deleteV860NCEs()
    {
	setComponentAbsent(3);
    }
    
    
    
    /**
     * Define the ASN1 Type V860NCEs from ASN1 Module InformationElements.
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
	public V860NCEs(SysInfoType15bis_v860ext_IEs sysInfoType15bis_v860ext, 
			Va40NCEs va40NCEs)
	{
	    setSysInfoType15bis_v860ext(sysInfoType15bis_v860ext);
	    setVa40NCEs(va40NCEs);
	}
	
	/**
	 * Construct with required components.
	 */
	public V860NCEs(SysInfoType15bis_v860ext_IEs sysInfoType15bis_v860ext)
	{
	    setSysInfoType15bis_v860ext(sysInfoType15bis_v860ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new SysInfoType15bis_v860ext_IEs();
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
		    return new SysInfoType15bis_v860ext_IEs();
		case 1:
		    return new Va40NCEs();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "sysInfoType15bis_v860ext"
	public SysInfoType15bis_v860ext_IEs getSysInfoType15bis_v860ext()
	{
	    return (SysInfoType15bis_v860ext_IEs)mComponents[0];
	}
	
	public void setSysInfoType15bis_v860ext(SysInfoType15bis_v860ext_IEs sysInfoType15bis_v860ext)
	{
	    mComponents[0] = sysInfoType15bis_v860ext;
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
	    public Va40NCEs(SysInfoType15bis_va40ext_IEs sysInfoType15bis_va40ext, 
			    NonCriticalExtensions nonCriticalExtensions)
	    {
		setSysInfoType15bis_va40ext(sysInfoType15bis_va40ext);
		setNonCriticalExtensions(nonCriticalExtensions);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Va40NCEs(SysInfoType15bis_va40ext_IEs sysInfoType15bis_va40ext)
	    {
		setSysInfoType15bis_va40ext(sysInfoType15bis_va40ext);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new SysInfoType15bis_va40ext_IEs();
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
			return new SysInfoType15bis_va40ext_IEs();
		    case 1:
			return new NonCriticalExtensions();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "sysInfoType15bis_va40ext"
	    public SysInfoType15bis_va40ext_IEs getSysInfoType15bis_va40ext()
	    {
		return (SysInfoType15bis_va40ext_IEs)mComponents[0];
	    }
	    
	    public void setSysInfoType15bis_va40ext(SysInfoType15bis_va40ext_IEs sysInfoType15bis_va40ext)
	    {
		mComponents[0] = sysInfoType15bis_va40ext;
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
			"SysInfoType15bis$V860NCEs$Va40NCEs$NonCriticalExtensions"
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
		    "SysInfoType15bis$V860NCEs$Va40NCEs"
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
					"SysInfoType15bis_va40ext_IEs"
				    ),
				    new QName (
					"InformationElements",
					"SysInfoType15bis-va40ext-IEs"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType15bis_va40ext_IEs"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "SysInfoType15bis_va40ext_IEs"
					)
				    ),
				    0
				)
			    ),
			    "sysInfoType15bis-va40ext",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "SysInfoType15bis$V860NCEs$Va40NCEs$NonCriticalExtensions"
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
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SysInfoType15bis$V860NCEs"
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
				    "SysInfoType15bis_v860ext_IEs"
				),
				new QName (
				    "InformationElements",
				    "SysInfoType15bis-v860ext-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType15bis_v860ext_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType15bis_v860ext_IEs"
				    )
				),
				0
			    )
			),
			"sysInfoType15bis-v860ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"SysInfoType15bis$V860NCEs$Va40NCEs"
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
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "SysInfoType15bis"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType15bis"
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
				"ReferenceLocationGANSS"
			    ),
			    new QName (
				"InformationElements",
				"ReferenceLocationGANSS"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ReferenceLocationGANSS"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "ReferenceLocationGANSS"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GANSS-ReferencePosition",
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
				"UE_Positioning_GANSS_ReferenceTime"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-ReferenceTime"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_ReferenceTime"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_ReferenceTime"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GANSS-ReferenceTime",
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
				"UE_Positioning_GANSS_IonosphericModel"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-IonosphericModel"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_IonosphericModel"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_IonosphericModel"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GANSS-IonosphericModel",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType15bis$V860NCEs"
			)
		    ),
		    "v860NCEs",
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType15bis object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType15bis object.
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
    
} // End class definition for SysInfoType15bis
