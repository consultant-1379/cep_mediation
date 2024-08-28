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
 * Define the ASN1 Type RB_InformationSetup_r8 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RB_InformationSetup_r8 extends Sequence {
    
    /**
     * The default constructor.
     */
    public RB_InformationSetup_r8()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RB_InformationSetup_r8(RB_Identity rb_Identity, 
		    PDCP_Info_r4 pdcp_Info, RLC_InfoChoice_r7 rlc_InfoChoice, 
		    RB_MappingInfo_r8 rb_MappingInfo)
    {
	setRb_Identity(rb_Identity);
	setPdcp_Info(pdcp_Info);
	setRlc_InfoChoice(rlc_InfoChoice);
	setRb_MappingInfo(rb_MappingInfo);
    }
    
    /**
     * Construct with required components.
     */
    public RB_InformationSetup_r8(RB_Identity rb_Identity, 
		    RLC_InfoChoice_r7 rlc_InfoChoice, 
		    RB_MappingInfo_r8 rb_MappingInfo)
    {
	setRb_Identity(rb_Identity);
	setRlc_InfoChoice(rlc_InfoChoice);
	setRb_MappingInfo(rb_MappingInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RB_Identity();
	mComponents[1] = new PDCP_Info_r4();
	mComponents[2] = new RLC_InfoChoice_r7();
	mComponents[3] = new RB_MappingInfo_r8();
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
		return new RB_Identity();
	    case 1:
		return new PDCP_Info_r4();
	    case 2:
		return new RLC_InfoChoice_r7();
	    case 3:
		return new RB_MappingInfo_r8();
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
    public PDCP_Info_r4 getPdcp_Info()
    {
	return (PDCP_Info_r4)mComponents[1];
    }
    
    public void setPdcp_Info(PDCP_Info_r4 pdcp_Info)
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
    
    
    // Methods for field "rlc_InfoChoice"
    public RLC_InfoChoice_r7 getRlc_InfoChoice()
    {
	return (RLC_InfoChoice_r7)mComponents[2];
    }
    
    public void setRlc_InfoChoice(RLC_InfoChoice_r7 rlc_InfoChoice)
    {
	mComponents[2] = rlc_InfoChoice;
    }
    
    
    // Methods for field "rb_MappingInfo"
    public RB_MappingInfo_r8 getRb_MappingInfo()
    {
	return (RB_MappingInfo_r8)mComponents[3];
    }
    
    public void setRb_MappingInfo(RB_MappingInfo_r8 rb_MappingInfo)
    {
	mComponents[3] = rb_MappingInfo;
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
	    "RB_InformationSetup_r8"
	),
	new QName (
	    "InformationElements",
	    "RB-InformationSetup-r8"
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
				"PDCP_Info_r4"
			    ),
			    new QName (
				"InformationElements",
				"PDCP-Info-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PDCP_Info_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PDCP_Info_r4"
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
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RLC_InfoChoice_r7"
			    ),
			    new QName (
				"InformationElements",
				"RLC-InfoChoice-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RLC_InfoChoice_r7"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "rlc-InfoChoice",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RB_MappingInfo_r8"
			    ),
			    new QName (
				"InformationElements",
				"RB-MappingInfo-r8"
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
				    "RB_MappingOption_r8"
				)
			    )
			)
		    ),
		    "rb-MappingInfo",
		    3,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RB_InformationSetup_r8 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RB_InformationSetup_r8 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RB_InformationSetup_r8
