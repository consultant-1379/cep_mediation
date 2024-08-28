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
 * Define the ASN1 Type SysInfoType15_6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType15_6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType15_6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType15_6(INTEGER ue_positioning_GANSS_TOD, 
		    UE_Positioning_GANSS_ReferenceMeasurementInfo ue_positioning_GANSS_ReferenceMeasurementInformation, 
		    Va40NCEs va40NCEs)
    {
	setUe_positioning_GANSS_TOD(ue_positioning_GANSS_TOD);
	setUe_positioning_GANSS_ReferenceMeasurementInformation(ue_positioning_GANSS_ReferenceMeasurementInformation);
	setVa40NCEs(va40NCEs);
    }
    
    /**
     * Construct with components.
     */
    public SysInfoType15_6(long ue_positioning_GANSS_TOD, 
		    UE_Positioning_GANSS_ReferenceMeasurementInfo ue_positioning_GANSS_ReferenceMeasurementInformation, 
		    Va40NCEs va40NCEs)
    {
	this(new INTEGER(ue_positioning_GANSS_TOD), 
	     ue_positioning_GANSS_ReferenceMeasurementInformation, va40NCEs);
    }
    
    /**
     * Construct with required components.
     */
    public SysInfoType15_6(long ue_positioning_GANSS_TOD, 
		    UE_Positioning_GANSS_ReferenceMeasurementInfo ue_positioning_GANSS_ReferenceMeasurementInformation)
    {
	setUe_positioning_GANSS_TOD(ue_positioning_GANSS_TOD);
	setUe_positioning_GANSS_ReferenceMeasurementInformation(ue_positioning_GANSS_ReferenceMeasurementInformation);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new UE_Positioning_GANSS_ReferenceMeasurementInfo();
	mComponents[2] = new Va40NCEs();
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
		return new INTEGER();
	    case 1:
		return new UE_Positioning_GANSS_ReferenceMeasurementInfo();
	    case 2:
		return new Va40NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_positioning_GANSS_TOD"
    public long getUe_positioning_GANSS_TOD()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setUe_positioning_GANSS_TOD(long ue_positioning_GANSS_TOD)
    {
	setUe_positioning_GANSS_TOD(new INTEGER(ue_positioning_GANSS_TOD));
    }
    
    public void setUe_positioning_GANSS_TOD(INTEGER ue_positioning_GANSS_TOD)
    {
	mComponents[0] = ue_positioning_GANSS_TOD;
    }
    
    
    // Methods for field "ue_positioning_GANSS_ReferenceMeasurementInformation"
    public UE_Positioning_GANSS_ReferenceMeasurementInfo getUe_positioning_GANSS_ReferenceMeasurementInformation()
    {
	return (UE_Positioning_GANSS_ReferenceMeasurementInfo)mComponents[1];
    }
    
    public void setUe_positioning_GANSS_ReferenceMeasurementInformation(UE_Positioning_GANSS_ReferenceMeasurementInfo ue_positioning_GANSS_ReferenceMeasurementInformation)
    {
	mComponents[1] = ue_positioning_GANSS_ReferenceMeasurementInformation;
    }
    
    
    // Methods for field "va40NCEs"
    public Va40NCEs getVa40NCEs()
    {
	return (Va40NCEs)mComponents[2];
    }
    
    public void setVa40NCEs(Va40NCEs va40NCEs)
    {
	mComponents[2] = va40NCEs;
    }
    
    public boolean hasVa40NCEs()
    {
	return componentIsPresent(2);
    }
    
    public void deleteVa40NCEs()
    {
	setComponentAbsent(2);
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
	public Va40NCEs(SysInfoType15_6_va40ext_IEs sysInfoType15_6_va40ext, 
			NonCriticalExtensions nonCriticalExtensions)
	{
	    setSysInfoType15_6_va40ext(sysInfoType15_6_va40ext);
	    setNonCriticalExtensions(nonCriticalExtensions);
	}
	
	/**
	 * Construct with required components.
	 */
	public Va40NCEs(SysInfoType15_6_va40ext_IEs sysInfoType15_6_va40ext)
	{
	    setSysInfoType15_6_va40ext(sysInfoType15_6_va40ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new SysInfoType15_6_va40ext_IEs();
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
		    return new SysInfoType15_6_va40ext_IEs();
		case 1:
		    return new NonCriticalExtensions();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "sysInfoType15_6_va40ext"
	public SysInfoType15_6_va40ext_IEs getSysInfoType15_6_va40ext()
	{
	    return (SysInfoType15_6_va40ext_IEs)mComponents[0];
	}
	
	public void setSysInfoType15_6_va40ext(SysInfoType15_6_va40ext_IEs sysInfoType15_6_va40ext)
	{
	    mComponents[0] = sysInfoType15_6_va40ext;
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
		    "SysInfoType15_6$Va40NCEs$NonCriticalExtensions"
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
		"rrc.informationelements",
		"SysInfoType15_6$Va40NCEs"
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
				    "SysInfoType15_6_va40ext_IEs"
				),
				new QName (
				    "InformationElements",
				    "SysInfoType15-6-va40ext-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType15_6_va40ext_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType15_6_va40ext_IEs"
				    )
				),
				0
			    )
			),
			"sysInfoType15-6-va40ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"SysInfoType15_6$Va40NCEs$NonCriticalExtensions"
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
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "SysInfoType15_6"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType15-6"
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
				    new com.oss.asn1.INTEGER(86399),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(86399)
			    ),
			    null
			)
		    ),
		    "ue-positioning-GANSS-TOD",
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
				"UE_Positioning_GANSS_ReferenceMeasurementInfo"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-ReferenceMeasurementInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_ReferenceMeasurementInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_ReferenceMeasurementInfo"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GANSS-ReferenceMeasurementInformation",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType15_6$Va40NCEs"
			)
		    ),
		    "va40NCEs",
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType15_6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType15_6 object.
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
    
} // End class definition for SysInfoType15_6
