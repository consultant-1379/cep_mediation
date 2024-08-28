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
 * Define the ASN1 Type SysInfoType19 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType19 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType19()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType19(UTRA_PriorityInfoList utra_PriorityInfoList, 
		    GSM_PriorityInfoList gsm_PriorityInfoList, 
		    EUTRA_FrequencyAndPriorityInfoList eutra_FrequencyAndPriorityInfoList, 
		    V920NCEs v920NCEs)
    {
	setUtra_PriorityInfoList(utra_PriorityInfoList);
	setGsm_PriorityInfoList(gsm_PriorityInfoList);
	setEutra_FrequencyAndPriorityInfoList(eutra_FrequencyAndPriorityInfoList);
	setV920NCEs(v920NCEs);
    }
    
    /**
     * Construct with required components.
     */
    public SysInfoType19(UTRA_PriorityInfoList utra_PriorityInfoList)
    {
	setUtra_PriorityInfoList(utra_PriorityInfoList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UTRA_PriorityInfoList();
	mComponents[1] = new GSM_PriorityInfoList();
	mComponents[2] = new EUTRA_FrequencyAndPriorityInfoList();
	mComponents[3] = new V920NCEs();
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
		return new UTRA_PriorityInfoList();
	    case 1:
		return new GSM_PriorityInfoList();
	    case 2:
		return new EUTRA_FrequencyAndPriorityInfoList();
	    case 3:
		return new V920NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "utra_PriorityInfoList"
    public UTRA_PriorityInfoList getUtra_PriorityInfoList()
    {
	return (UTRA_PriorityInfoList)mComponents[0];
    }
    
    public void setUtra_PriorityInfoList(UTRA_PriorityInfoList utra_PriorityInfoList)
    {
	mComponents[0] = utra_PriorityInfoList;
    }
    
    
    // Methods for field "gsm_PriorityInfoList"
    public GSM_PriorityInfoList getGsm_PriorityInfoList()
    {
	return (GSM_PriorityInfoList)mComponents[1];
    }
    
    public void setGsm_PriorityInfoList(GSM_PriorityInfoList gsm_PriorityInfoList)
    {
	mComponents[1] = gsm_PriorityInfoList;
    }
    
    public boolean hasGsm_PriorityInfoList()
    {
	return componentIsPresent(1);
    }
    
    public void deleteGsm_PriorityInfoList()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "eutra_FrequencyAndPriorityInfoList"
    public EUTRA_FrequencyAndPriorityInfoList getEutra_FrequencyAndPriorityInfoList()
    {
	return (EUTRA_FrequencyAndPriorityInfoList)mComponents[2];
    }
    
    public void setEutra_FrequencyAndPriorityInfoList(EUTRA_FrequencyAndPriorityInfoList eutra_FrequencyAndPriorityInfoList)
    {
	mComponents[2] = eutra_FrequencyAndPriorityInfoList;
    }
    
    public boolean hasEutra_FrequencyAndPriorityInfoList()
    {
	return componentIsPresent(2);
    }
    
    public void deleteEutra_FrequencyAndPriorityInfoList()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "v920NCEs"
    public V920NCEs getV920NCEs()
    {
	return (V920NCEs)mComponents[3];
    }
    
    public void setV920NCEs(V920NCEs v920NCEs)
    {
	mComponents[3] = v920NCEs;
    }
    
    public boolean hasV920NCEs()
    {
	return componentIsPresent(3);
    }
    
    public void deleteV920NCEs()
    {
	setComponentAbsent(3);
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
	public V920NCEs(SysInfoType19_v920ext sysInfoType19_v920ext, 
			NonCriticalExtensions nonCriticalExtensions)
	{
	    setSysInfoType19_v920ext(sysInfoType19_v920ext);
	    setNonCriticalExtensions(nonCriticalExtensions);
	}
	
	/**
	 * Construct with required components.
	 */
	public V920NCEs(SysInfoType19_v920ext sysInfoType19_v920ext)
	{
	    setSysInfoType19_v920ext(sysInfoType19_v920ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new SysInfoType19_v920ext();
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
		    return new SysInfoType19_v920ext();
		case 1:
		    return new NonCriticalExtensions();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "sysInfoType19_v920ext"
	public SysInfoType19_v920ext getSysInfoType19_v920ext()
	{
	    return (SysInfoType19_v920ext)mComponents[0];
	}
	
	public void setSysInfoType19_v920ext(SysInfoType19_v920ext sysInfoType19_v920ext)
	{
	    mComponents[0] = sysInfoType19_v920ext;
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
		    "SysInfoType19$V920NCEs$NonCriticalExtensions"
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
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SysInfoType19$V920NCEs"
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
				    "SysInfoType19_v920ext"
				),
				new QName (
				    "InformationElements",
				    "SysInfoType19-v920ext"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType19_v920ext"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType19_v920ext"
				    )
				),
				0
			    )
			),
			"sysInfoType19-v920ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"SysInfoType19$V920NCEs$NonCriticalExtensions"
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
	    "SysInfoType19"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType19"
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
				"UTRA_PriorityInfoList"
			    ),
			    new QName (
				"InformationElements",
				"UTRA-PriorityInfoList"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UTRA_PriorityInfoList"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UTRA_PriorityInfoList"
				)
			    ),
			    0
			)
		    ),
		    "utra-PriorityInfoList",
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
				"GSM_PriorityInfoList"
			    ),
			    new QName (
				"InformationElements",
				"GSM-PriorityInfoList"
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
				new QName (
				    "rrc.informationelements",
				    "GSM_PriorityInfo"
				)
			    )
			)
		    ),
		    "gsm-PriorityInfoList",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"EUTRA_FrequencyAndPriorityInfoList"
			    ),
			    new QName (
				"InformationElements",
				"EUTRA-FrequencyAndPriorityInfoList"
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
				    "EUTRA_FrequencyAndPriorityInfo"
				)
			    )
			)
		    ),
		    "eutra-FrequencyAndPriorityInfoList",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType19$V920NCEs"
			)
		    ),
		    "v920NCEs",
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType19 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType19 object.
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
    
} // End class definition for SysInfoType19
