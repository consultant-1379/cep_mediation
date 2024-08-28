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
 * Define the ASN1 Type PCPCH_ChannelInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PCPCH_ChannelInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public PCPCH_ChannelInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PCPCH_ChannelInfo(INTEGER pcpch_UL_ScramblingCode, 
		    INTEGER pcpch_DL_ChannelisationCode, 
		    SecondaryScramblingCode pcpch_DL_ScramblingCode, 
		    PCP_Length pcp_Length, UCSM_Info ucsm_Info)
    {
	setPcpch_UL_ScramblingCode(pcpch_UL_ScramblingCode);
	setPcpch_DL_ChannelisationCode(pcpch_DL_ChannelisationCode);
	setPcpch_DL_ScramblingCode(pcpch_DL_ScramblingCode);
	setPcp_Length(pcp_Length);
	setUcsm_Info(ucsm_Info);
    }
    
    /**
     * Construct with components.
     */
    public PCPCH_ChannelInfo(long pcpch_UL_ScramblingCode, 
		    long pcpch_DL_ChannelisationCode, 
		    SecondaryScramblingCode pcpch_DL_ScramblingCode, 
		    PCP_Length pcp_Length, UCSM_Info ucsm_Info)
    {
	this(new INTEGER(pcpch_UL_ScramblingCode), 
	     new INTEGER(pcpch_DL_ChannelisationCode), 
	     pcpch_DL_ScramblingCode, pcp_Length, ucsm_Info);
    }
    
    /**
     * Construct with required components.
     */
    public PCPCH_ChannelInfo(long pcpch_UL_ScramblingCode, 
		    long pcpch_DL_ChannelisationCode, PCP_Length pcp_Length)
    {
	setPcpch_UL_ScramblingCode(pcpch_UL_ScramblingCode);
	setPcpch_DL_ChannelisationCode(pcpch_DL_ChannelisationCode);
	setPcp_Length(pcp_Length);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
	mComponents[2] = new SecondaryScramblingCode();
	mComponents[3] = PCP_Length.as0;
	mComponents[4] = new UCSM_Info();
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
		return new INTEGER();
	    case 1:
		return new INTEGER();
	    case 2:
		return new SecondaryScramblingCode();
	    case 3:
		return PCP_Length.as0;
	    case 4:
		return new UCSM_Info();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "pcpch_UL_ScramblingCode"
    public long getPcpch_UL_ScramblingCode()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setPcpch_UL_ScramblingCode(long pcpch_UL_ScramblingCode)
    {
	setPcpch_UL_ScramblingCode(new INTEGER(pcpch_UL_ScramblingCode));
    }
    
    public void setPcpch_UL_ScramblingCode(INTEGER pcpch_UL_ScramblingCode)
    {
	mComponents[0] = pcpch_UL_ScramblingCode;
    }
    
    
    // Methods for field "pcpch_DL_ChannelisationCode"
    public long getPcpch_DL_ChannelisationCode()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setPcpch_DL_ChannelisationCode(long pcpch_DL_ChannelisationCode)
    {
	setPcpch_DL_ChannelisationCode(new INTEGER(pcpch_DL_ChannelisationCode));
    }
    
    public void setPcpch_DL_ChannelisationCode(INTEGER pcpch_DL_ChannelisationCode)
    {
	mComponents[1] = pcpch_DL_ChannelisationCode;
    }
    
    
    // Methods for field "pcpch_DL_ScramblingCode"
    public SecondaryScramblingCode getPcpch_DL_ScramblingCode()
    {
	return (SecondaryScramblingCode)mComponents[2];
    }
    
    public void setPcpch_DL_ScramblingCode(SecondaryScramblingCode pcpch_DL_ScramblingCode)
    {
	mComponents[2] = pcpch_DL_ScramblingCode;
    }
    
    public boolean hasPcpch_DL_ScramblingCode()
    {
	return componentIsPresent(2);
    }
    
    public void deletePcpch_DL_ScramblingCode()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "pcp_Length"
    public PCP_Length getPcp_Length()
    {
	return (PCP_Length)mComponents[3];
    }
    
    public void setPcp_Length(PCP_Length pcp_Length)
    {
	mComponents[3] = pcp_Length;
    }
    
    
    // Methods for field "ucsm_Info"
    public UCSM_Info getUcsm_Info()
    {
	return (UCSM_Info)mComponents[4];
    }
    
    public void setUcsm_Info(UCSM_Info ucsm_Info)
    {
	mComponents[4] = ucsm_Info;
    }
    
    public boolean hasUcsm_Info()
    {
	return componentIsPresent(4);
    }
    
    public void deleteUcsm_Info()
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
	    "PCPCH_ChannelInfo"
	),
	new QName (
	    "InformationElements",
	    "PCPCH-ChannelInfo"
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
				    new com.oss.asn1.INTEGER(79),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(79)
			    ),
			    null
			)
		    ),
		    "pcpch-UL-ScramblingCode",
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
				    new com.oss.asn1.INTEGER(511),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(511)
			    ),
			    null
			)
		    ),
		    "pcpch-DL-ChannelisationCode",
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
				"rrc.informationelements",
				"SecondaryScramblingCode"
			    ),
			    new QName (
				"InformationElements",
				"SecondaryScramblingCode"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SecondaryScramblingCode(1), 
				    new SecondaryScramblingCode(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "pcpch-DL-ScramblingCode",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PCP_Length"
			    ),
			    new QName (
				"InformationElements",
				"PCP-Length"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"as0",
					0
				    ),
				    new MemberListElement (
					"as8",
					1
				    )
				}
			    ),
			    0,
			    PCP_Length.as0
			)
		    ),
		    "pcp-Length",
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
				"UCSM_Info"
			    ),
			    new QName (
				"InformationElements",
				"UCSM-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UCSM_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UCSM_Info"
				)
			    ),
			    0
			)
		    ),
		    "ucsm-Info",
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
			new TagDecoderElement((short)0x8003, 3)
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
     * Get the type descriptor (TypeInfo) of 'this' PCPCH_ChannelInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PCPCH_ChannelInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PCPCH_ChannelInfo
