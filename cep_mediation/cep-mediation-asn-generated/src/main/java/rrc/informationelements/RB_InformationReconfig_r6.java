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
 * Define the ASN1 Type RB_InformationReconfig_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RB_InformationReconfig_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public RB_InformationReconfig_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RB_InformationReconfig_r6(RB_Identity rb_Identity, 
		    PDCP_InfoReconfig_r4 pdcp_Info, PDCP_SN_Info pdcp_SN_Info, 
		    RLC_Info_r6 rlc_Info, RB_MappingInfo_r6 rb_MappingInfo, 
		    RB_StopContinue rb_StopContinue)
    {
	setRb_Identity(rb_Identity);
	setPdcp_Info(pdcp_Info);
	setPdcp_SN_Info(pdcp_SN_Info);
	setRlc_Info(rlc_Info);
	setRb_MappingInfo(rb_MappingInfo);
	setRb_StopContinue(rb_StopContinue);
    }
    
    /**
     * Construct with required components.
     */
    public RB_InformationReconfig_r6(RB_Identity rb_Identity)
    {
	setRb_Identity(rb_Identity);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RB_Identity();
	mComponents[1] = new PDCP_InfoReconfig_r4();
	mComponents[2] = new PDCP_SN_Info();
	mComponents[3] = new RLC_Info_r6();
	mComponents[4] = new RB_MappingInfo_r6();
	mComponents[5] = RB_StopContinue.stopRB;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[6];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new RB_Identity();
	    case 1:
		return new PDCP_InfoReconfig_r4();
	    case 2:
		return new PDCP_SN_Info();
	    case 3:
		return new RLC_Info_r6();
	    case 4:
		return new RB_MappingInfo_r6();
	    case 5:
		return RB_StopContinue.stopRB;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rb_Identity"
    public RB_Identity getRb_Identity()
    {
	return (RB_Identity)mComponents[0];
    }
    
    public void setRb_Identity(RB_Identity rb_Identity)
    {
	mComponents[0] = rb_Identity;
    }
    
    
    // Methods for field "pdcp_Info"
    public PDCP_InfoReconfig_r4 getPdcp_Info()
    {
	return (PDCP_InfoReconfig_r4)mComponents[1];
    }
    
    public void setPdcp_Info(PDCP_InfoReconfig_r4 pdcp_Info)
    {
	mComponents[1] = pdcp_Info;
    }
    
    public boolean hasPdcp_Info()
    {
	return componentIsPresent(1);
    }
    
    public void deletePdcp_Info()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "pdcp_SN_Info"
    public PDCP_SN_Info getPdcp_SN_Info()
    {
	return (PDCP_SN_Info)mComponents[2];
    }
    
    public void setPdcp_SN_Info(PDCP_SN_Info pdcp_SN_Info)
    {
	mComponents[2] = pdcp_SN_Info;
    }
    
    public boolean hasPdcp_SN_Info()
    {
	return componentIsPresent(2);
    }
    
    public void deletePdcp_SN_Info()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "rlc_Info"
    public RLC_Info_r6 getRlc_Info()
    {
	return (RLC_Info_r6)mComponents[3];
    }
    
    public void setRlc_Info(RLC_Info_r6 rlc_Info)
    {
	mComponents[3] = rlc_Info;
    }
    
    public boolean hasRlc_Info()
    {
	return componentIsPresent(3);
    }
    
    public void deleteRlc_Info()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "rb_MappingInfo"
    public RB_MappingInfo_r6 getRb_MappingInfo()
    {
	return (RB_MappingInfo_r6)mComponents[4];
    }
    
    public void setRb_MappingInfo(RB_MappingInfo_r6 rb_MappingInfo)
    {
	mComponents[4] = rb_MappingInfo;
    }
    
    public boolean hasRb_MappingInfo()
    {
	return componentIsPresent(4);
    }
    
    public void deleteRb_MappingInfo()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "rb_StopContinue"
    public RB_StopContinue getRb_StopContinue()
    {
	return (RB_StopContinue)mComponents[5];
    }
    
    public void setRb_StopContinue(RB_StopContinue rb_StopContinue)
    {
	mComponents[5] = rb_StopContinue;
    }
    
    public boolean hasRb_StopContinue()
    {
	return componentIsPresent(5);
    }
    
    public void deleteRb_StopContinue()
    {
	setComponentAbsent(5);
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
	    "RB_InformationReconfig_r6"
	),
	new QName (
	    "InformationElements",
	    "RB-InformationReconfig-r6"
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
				"rrc.informationelements",
				"RB_Identity"
			    ),
			    new QName (
				"InformationElements",
				"RB-Identity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new RB_Identity(1), 
				    new RB_Identity(32),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "rb-Identity",
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
				"PDCP_InfoReconfig_r4"
			    ),
			    new QName (
				"InformationElements",
				"PDCP-InfoReconfig-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PDCP_InfoReconfig_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PDCP_InfoReconfig_r4"
				)
			    ),
			    0
			)
		    ),
		    "pdcp-Info",
		    1,
		    3,
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
				"PDCP_SN_Info"
			    ),
			    new QName (
				"InformationElements",
				"PDCP-SN-Info"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new PDCP_SN_Info(0), 
				    new PDCP_SN_Info(65535),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(65535)
			    ),
			    null
			)
		    ),
		    "pdcp-SN-Info",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RLC_Info_r6"
			    ),
			    new QName (
				"InformationElements",
				"RLC-Info-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RLC_Info_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "RLC_Info_r6"
				)
			    ),
			    0
			)
		    ),
		    "rlc-Info",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RB_MappingInfo_r6"
			    ),
			    new QName (
				"InformationElements",
				"RB-MappingInfo-r6"
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
				    "RB_MappingOption_r6"
				)
			    )
			)
		    ),
		    "rb-MappingInfo",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RB_StopContinue"
			    ),
			    new QName (
				"InformationElements",
				"RB-StopContinue"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"stopRB",
					0
				    ),
				    new MemberListElement (
					"continueRB",
					1
				    )
				}
			    ),
			    0,
			    RB_StopContinue.stopRB
			)
		    ),
		    "rb-StopContinue",
		    5,
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
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RB_InformationReconfig_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RB_InformationReconfig_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RB_InformationReconfig_r6
