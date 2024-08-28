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
 * Define the ASN1 Type SysInfoType15_1 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType15_1 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType15_1()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType15_1(UE_Positioning_GPS_DGPS_Corrections ue_positioning_GPS_DGPS_Corrections, 
		    V920NCEs v920NCEs)
    {
	setUe_positioning_GPS_DGPS_Corrections(ue_positioning_GPS_DGPS_Corrections);
	setV920NCEs(v920NCEs);
    }
    
    /**
     * Construct with required components.
     */
    public SysInfoType15_1(UE_Positioning_GPS_DGPS_Corrections ue_positioning_GPS_DGPS_Corrections)
    {
	setUe_positioning_GPS_DGPS_Corrections(ue_positioning_GPS_DGPS_Corrections);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_Positioning_GPS_DGPS_Corrections();
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
		return new UE_Positioning_GPS_DGPS_Corrections();
	    case 1:
		return new V920NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_positioning_GPS_DGPS_Corrections"
    public UE_Positioning_GPS_DGPS_Corrections getUe_positioning_GPS_DGPS_Corrections()
    {
	return (UE_Positioning_GPS_DGPS_Corrections)mComponents[0];
    }
    
    public void setUe_positioning_GPS_DGPS_Corrections(UE_Positioning_GPS_DGPS_Corrections ue_positioning_GPS_DGPS_Corrections)
    {
	mComponents[0] = ue_positioning_GPS_DGPS_Corrections;
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
     * Define the ASN1 Type V920NCEs from ASN1 Module InformationElements.
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
	public V920NCEs(SysInfoType15_1_v920ext_IEs sysInfoType15_1_v920ext, 
			NonCriticalExtensions nonCriticalExtensions)
	{
	    setSysInfoType15_1_v920ext(sysInfoType15_1_v920ext);
	    setNonCriticalExtensions(nonCriticalExtensions);
	}
	
	/**
	 * Construct with required components.
	 */
	public V920NCEs(SysInfoType15_1_v920ext_IEs sysInfoType15_1_v920ext)
	{
	    setSysInfoType15_1_v920ext(sysInfoType15_1_v920ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new SysInfoType15_1_v920ext_IEs();
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
		    return new SysInfoType15_1_v920ext_IEs();
		case 1:
		    return new NonCriticalExtensions();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "sysInfoType15_1_v920ext"
	public SysInfoType15_1_v920ext_IEs getSysInfoType15_1_v920ext()
	{
	    return (SysInfoType15_1_v920ext_IEs)mComponents[0];
	}
	
	public void setSysInfoType15_1_v920ext(SysInfoType15_1_v920ext_IEs sysInfoType15_1_v920ext)
	{
	    mComponents[0] = sysInfoType15_1_v920ext;
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
		    "SysInfoType15_1$V920NCEs$NonCriticalExtensions"
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
		"SysInfoType15_1$V920NCEs"
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
				    "SysInfoType15_1_v920ext_IEs"
				),
				new QName (
				    "InformationElements",
				    "SysInfoType15-1-v920ext-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType15_1_v920ext_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType15_1_v920ext_IEs"
				    )
				),
				0
			    )
			),
			"sysInfoType15-1-v920ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"SysInfoType15_1$V920NCEs$NonCriticalExtensions"
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
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "SysInfoType15_1"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType15-1"
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
				"UE_Positioning_GPS_DGPS_Corrections"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-DGPS-Corrections"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_DGPS_Corrections"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_DGPS_Corrections"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GPS-DGPS-Corrections",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType15_1$V920NCEs"
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType15_1 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType15_1 object.
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
    
} // End class definition for SysInfoType15_1
