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
 * Define the ASN1 Type UE_Positioning_IPDL_Parameters from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_IPDL_Parameters extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_IPDL_Parameters()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_IPDL_Parameters(IP_Spacing ip_Spacing, 
		    IP_Length ip_Length, INTEGER ip_Offset, INTEGER seed, 
		    BurstModeParameters burstModeParameters)
    {
	setIp_Spacing(ip_Spacing);
	setIp_Length(ip_Length);
	setIp_Offset(ip_Offset);
	setSeed(seed);
	setBurstModeParameters(burstModeParameters);
    }
    
    /**
     * Construct with components.
     */
    public UE_Positioning_IPDL_Parameters(IP_Spacing ip_Spacing, 
		    IP_Length ip_Length, long ip_Offset, long seed, 
		    BurstModeParameters burstModeParameters)
    {
	this(ip_Spacing, ip_Length, new INTEGER(ip_Offset), 
	     new INTEGER(seed), burstModeParameters);
    }
    
    /**
     * Construct with required components.
     */
    public UE_Positioning_IPDL_Parameters(IP_Spacing ip_Spacing, 
		    IP_Length ip_Length, long ip_Offset, long seed)
    {
	setIp_Spacing(ip_Spacing);
	setIp_Length(ip_Length);
	setIp_Offset(ip_Offset);
	setSeed(seed);
    }
    
    public void initComponents()
    {
	mComponents[0] = IP_Spacing.e5;
	mComponents[1] = IP_Length.ipl5;
	mComponents[2] = new INTEGER();
	mComponents[3] = new INTEGER();
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
		return IP_Spacing.e5;
	    case 1:
		return IP_Length.ipl5;
	    case 2:
		return new INTEGER();
	    case 3:
		return new INTEGER();
	    case 4:
		return new BurstModeParameters();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ip_Spacing"
    public IP_Spacing getIp_Spacing()
    {
	return (IP_Spacing)mComponents[0];
    }
    
    public void setIp_Spacing(IP_Spacing ip_Spacing)
    {
	mComponents[0] = ip_Spacing;
    }
    
    
    // Methods for field "ip_Length"
    public IP_Length getIp_Length()
    {
	return (IP_Length)mComponents[1];
    }
    
    public void setIp_Length(IP_Length ip_Length)
    {
	mComponents[1] = ip_Length;
    }
    
    
    // Methods for field "ip_Offset"
    public long getIp_Offset()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setIp_Offset(long ip_Offset)
    {
	setIp_Offset(new INTEGER(ip_Offset));
    }
    
    public void setIp_Offset(INTEGER ip_Offset)
    {
	mComponents[2] = ip_Offset;
    }
    
    
    // Methods for field "seed"
    public long getSeed()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setSeed(long seed)
    {
	setSeed(new INTEGER(seed));
    }
    
    public void setSeed(INTEGER seed)
    {
	mComponents[3] = seed;
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
    
    public boolean hasBurstModeParameters()
    {
	return componentIsPresent(4);
    }
    
    public void deleteBurstModeParameters()
    {
	setComponentAbsent(4);
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
	    "UE_Positioning_IPDL_Parameters"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-IPDL-Parameters"
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
				"IP_Spacing"
			    ),
			    new QName (
				"InformationElements",
				"IP-Spacing"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"e5",
					0
				    ),
				    new MemberListElement (
					"e7",
					1
				    ),
				    new MemberListElement (
					"e10",
					2
				    ),
				    new MemberListElement (
					"e15",
					3
				    ),
				    new MemberListElement (
					"e20",
					4
				    ),
				    new MemberListElement (
					"e30",
					5
				    ),
				    new MemberListElement (
					"e40",
					6
				    ),
				    new MemberListElement (
					"e50",
					7
				    )
				}
			    ),
			    0,
			    IP_Spacing.e5
			)
		    ),
		    "ip-Spacing",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"IP_Length"
			    ),
			    new QName (
				"InformationElements",
				"IP-Length"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ipl5",
					0
				    ),
				    new MemberListElement (
					"ipl10",
					1
				    )
				}
			    ),
			    0,
			    IP_Length.ipl5
			)
		    ),
		    "ip-Length",
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
				    new com.oss.asn1.INTEGER(9),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(9)
			    ),
			    null
			)
		    ),
		    "ip-Offset",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    ),
		    "seed",
		    3,
		    2,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_IPDL_Parameters object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_IPDL_Parameters object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_IPDL_Parameters
