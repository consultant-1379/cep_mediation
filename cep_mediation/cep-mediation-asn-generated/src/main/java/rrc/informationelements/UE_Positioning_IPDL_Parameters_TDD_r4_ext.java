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
 * Define the ASN1 Type UE_Positioning_IPDL_Parameters_TDD_r4_ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_IPDL_Parameters_TDD_r4_ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_IPDL_Parameters_TDD_r4_ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_IPDL_Parameters_TDD_r4_ext(IP_Spacing_TDD ip_Spacing, 
		    INTEGER ip_slot, INTEGER ip_Start, IP_PCCPCH_r4 ip_PCCPCG, 
		    BurstModeParameters burstModeParameters)
    {
	setIp_Spacing(ip_Spacing);
	setIp_slot(ip_slot);
	setIp_Start(ip_Start);
	setIp_PCCPCG(ip_PCCPCG);
	setBurstModeParameters(burstModeParameters);
    }
    
    /**
     * Construct with components.
     */
    public UE_Positioning_IPDL_Parameters_TDD_r4_ext(IP_Spacing_TDD ip_Spacing, 
		    long ip_slot, long ip_Start, IP_PCCPCH_r4 ip_PCCPCG, 
		    BurstModeParameters burstModeParameters)
    {
	this(ip_Spacing, new INTEGER(ip_slot), new INTEGER(ip_Start), 
	     ip_PCCPCG, burstModeParameters);
    }
    
    /**
     * Construct with required components.
     */
    public UE_Positioning_IPDL_Parameters_TDD_r4_ext(IP_Spacing_TDD ip_Spacing, 
		    long ip_slot, long ip_Start, 
		    BurstModeParameters burstModeParameters)
    {
	setIp_Spacing(ip_Spacing);
	setIp_slot(ip_slot);
	setIp_Start(ip_Start);
	setBurstModeParameters(burstModeParameters);
    }
    
    public void initComponents()
    {
	mComponents[0] = IP_Spacing_TDD.e30;
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
	mComponents[3] = new IP_PCCPCH_r4();
	mComponents[4] = new BurstModeParameters();
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
		return IP_Spacing_TDD.e30;
	    case 1:
		return new INTEGER();
	    case 2:
		return new INTEGER();
	    case 3:
		return new IP_PCCPCH_r4();
	    case 4:
		return new BurstModeParameters();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ip_Spacing"
    public IP_Spacing_TDD getIp_Spacing()
    {
	return (IP_Spacing_TDD)mComponents[0];
    }
    
    public void setIp_Spacing(IP_Spacing_TDD ip_Spacing)
    {
	mComponents[0] = ip_Spacing;
    }
    
    
    // Methods for field "ip_slot"
    public long getIp_slot()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setIp_slot(long ip_slot)
    {
	setIp_slot(new INTEGER(ip_slot));
    }
    
    public void setIp_slot(INTEGER ip_slot)
    {
	mComponents[1] = ip_slot;
    }
    
    
    // Methods for field "ip_Start"
    public long getIp_Start()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setIp_Start(long ip_Start)
    {
	setIp_Start(new INTEGER(ip_Start));
    }
    
    public void setIp_Start(INTEGER ip_Start)
    {
	mComponents[2] = ip_Start;
    }
    
    
    // Methods for field "ip_PCCPCG"
    public IP_PCCPCH_r4 getIp_PCCPCG()
    {
	return (IP_PCCPCH_r4)mComponents[3];
    }
    
    public void setIp_PCCPCG(IP_PCCPCH_r4 ip_PCCPCG)
    {
	mComponents[3] = ip_PCCPCG;
    }
    
    public boolean hasIp_PCCPCG()
    {
	return componentIsPresent(3);
    }
    
    public void deleteIp_PCCPCG()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "burstModeParameters"
    public BurstModeParameters getBurstModeParameters()
    {
	return (BurstModeParameters)mComponents[4];
    }
    
    public void setBurstModeParameters(BurstModeParameters burstModeParameters)
    {
	mComponents[4] = burstModeParameters;
    }
    
    
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
	    "UE_Positioning_IPDL_Parameters_TDD_r4_ext"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-IPDL-Parameters-TDD-r4-ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"IP_Spacing_TDD"
			    ),
			    new QName (
				"InformationElements",
				"IP-Spacing-TDD"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"e30",
					0
				    ),
				    new MemberListElement (
					"e40",
					1
				    ),
				    new MemberListElement (
					"e50",
					2
				    ),
				    new MemberListElement (
					"e70",
					3
				    ),
				    new MemberListElement (
					"e100",
					4
				    )
				}
			    ),
			    0,
			    IP_Spacing_TDD.e30
			)
		    ),
		    "ip-Spacing",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
				    new com.oss.asn1.INTEGER(14),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(14)
			    ),
			    null
			)
		    ),
		    "ip-slot",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
				    new com.oss.asn1.INTEGER(4095),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(4095)
			    ),
			    null
			)
		    ),
		    "ip-Start",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"IP_PCCPCH_r4"
			    ),
			    new QName (
				"InformationElements",
				"IP-PCCPCH-r4"
			    ),
			    12314,
			    null
			)
		    ),
		    "ip-PCCPCG",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"BurstModeParameters"
			    ),
			    new QName (
				"InformationElements",
				"BurstModeParameters"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "BurstModeParameters"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "BurstModeParameters"
				)
			    ),
			    0
			)
		    ),
		    "burstModeParameters",
		    4,
		    2,
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_IPDL_Parameters_TDD_r4_ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_IPDL_Parameters_TDD_r4_ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_IPDL_Parameters_TDD_r4_ext
