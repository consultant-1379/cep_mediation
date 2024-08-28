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
 * Define the ASN1 Type RAB_InformationSetup_r8 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RAB_InformationSetup_r8 extends Sequence {
    
    /**
     * The default constructor.
     */
    public RAB_InformationSetup_r8()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RAB_InformationSetup_r8(RAB_Info_r7 rab_Info, 
		    CS_HSPA_Information cs_HSPA_Information, 
		    RAB_InfoReplace rab_InfoReplace, 
		    RB_InformationSetupList_r8 rb_InformationSetupList)
    {
	setRab_Info(rab_Info);
	setCs_HSPA_Information(cs_HSPA_Information);
	setRab_InfoReplace(rab_InfoReplace);
	setRb_InformationSetupList(rb_InformationSetupList);
    }
    
    /**
     * Construct with required components.
     */
    public RAB_InformationSetup_r8(RAB_Info_r7 rab_Info, 
		    RB_InformationSetupList_r8 rb_InformationSetupList)
    {
	setRab_Info(rab_Info);
	setRb_InformationSetupList(rb_InformationSetupList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RAB_Info_r7();
	mComponents[1] = new CS_HSPA_Information();
	mComponents[2] = new RAB_InfoReplace();
	mComponents[3] = new RB_InformationSetupList_r8();
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
		return new RAB_Info_r7();
	    case 1:
		return new CS_HSPA_Information();
	    case 2:
		return new RAB_InfoReplace();
	    case 3:
		return new RB_InformationSetupList_r8();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rab_Info"
    public RAB_Info_r7 getRab_Info()
    {
	return (RAB_Info_r7)mComponents[0];
    }
    
    public void setRab_Info(RAB_Info_r7 rab_Info)
    {
	mComponents[0] = rab_Info;
    }
    
    
    // Methods for field "cs_HSPA_Information"
    public CS_HSPA_Information getCs_HSPA_Information()
    {
	return (CS_HSPA_Information)mComponents[1];
    }
    
    public void setCs_HSPA_Information(CS_HSPA_Information cs_HSPA_Information)
    {
	mComponents[1] = cs_HSPA_Information;
    }
    
    public boolean hasCs_HSPA_Information()
    {
	return componentIsPresent(1);
    }
    
    public void deleteCs_HSPA_Information()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "rab_InfoReplace"
    public RAB_InfoReplace getRab_InfoReplace()
    {
	return (RAB_InfoReplace)mComponents[2];
    }
    
    public void setRab_InfoReplace(RAB_InfoReplace rab_InfoReplace)
    {
	mComponents[2] = rab_InfoReplace;
    }
    
    public boolean hasRab_InfoReplace()
    {
	return componentIsPresent(2);
    }
    
    public void deleteRab_InfoReplace()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "rb_InformationSetupList"
    public RB_InformationSetupList_r8 getRb_InformationSetupList()
    {
	return (RB_InformationSetupList_r8)mComponents[3];
    }
    
    public void setRb_InformationSetupList(RB_InformationSetupList_r8 rb_InformationSetupList)
    {
	mComponents[3] = rb_InformationSetupList;
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
	    "RAB_InformationSetup_r8"
	),
	new QName (
	    "InformationElements",
	    "RAB-InformationSetup-r8"
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
				"RAB_Info_r7"
			    ),
			    new QName (
				"InformationElements",
				"RAB-Info-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RAB_Info_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "RAB_Info_r7"
				)
			    ),
			    0
			)
		    ),
		    "rab-Info",
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
				"CS_HSPA_Information"
			    ),
			    new QName (
				"InformationElements",
				"CS-HSPA-Information"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CS_HSPA_Information"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CS_HSPA_Information"
				)
			    ),
			    0
			)
		    ),
		    "cs-HSPA-Information",
		    1,
		    3,
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
				"RAB_InfoReplace"
			    ),
			    new QName (
				"InformationElements",
				"RAB-InfoReplace"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RAB_InfoReplace"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "RAB_InfoReplace"
				)
			    ),
			    0
			)
		    ),
		    "rab-InfoReplace",
		    2,
		    3,
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
				"RB_InformationSetupList_r8"
			    ),
			    new QName (
				"InformationElements",
				"RB-InformationSetupList-r8"
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
				    "RB_InformationSetup_r8"
				)
			    )
			)
		    ),
		    "rb-InformationSetupList",
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
     * Get the type descriptor (TypeInfo) of 'this' RAB_InformationSetup_r8 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RAB_InformationSetup_r8 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RAB_InformationSetup_r8
