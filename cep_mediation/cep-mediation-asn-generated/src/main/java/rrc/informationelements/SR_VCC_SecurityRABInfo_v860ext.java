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
 * Define the ASN1 Type SR_VCC_SecurityRABInfo_v860ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SR_VCC_SecurityRABInfo_v860ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public SR_VCC_SecurityRABInfo_v860ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SR_VCC_SecurityRABInfo_v860ext(SR_VCC_Info sr_vcc_Info, 
		    RAB_InfoReplace rab_InfoReplace)
    {
	setSr_vcc_Info(sr_vcc_Info);
	setRab_InfoReplace(rab_InfoReplace);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SR_VCC_Info();
	mComponents[1] = new RAB_InfoReplace();
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
		return new SR_VCC_Info();
	    case 1:
		return new RAB_InfoReplace();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sr_vcc_Info"
    public SR_VCC_Info getSr_vcc_Info()
    {
	return (SR_VCC_Info)mComponents[0];
    }
    
    public void setSr_vcc_Info(SR_VCC_Info sr_vcc_Info)
    {
	mComponents[0] = sr_vcc_Info;
    }
    
    
    // Methods for field "rab_InfoReplace"
    public RAB_InfoReplace getRab_InfoReplace()
    {
	return (RAB_InfoReplace)mComponents[1];
    }
    
    public void setRab_InfoReplace(RAB_InfoReplace rab_InfoReplace)
    {
	mComponents[1] = rab_InfoReplace;
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
	    "SR_VCC_SecurityRABInfo_v860ext"
	),
	new QName (
	    "InformationElements",
	    "SR-VCC-SecurityRABInfo-v860ext"
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
				"SR_VCC_Info"
			    ),
			    new QName (
				"InformationElements",
				"SR-VCC-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SR_VCC_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "SR_VCC_Info"
				)
			    ),
			    0
			)
		    ),
		    "sr-vcc-Info",
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
		    1,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SR_VCC_SecurityRABInfo_v860ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SR_VCC_SecurityRABInfo_v860ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SR_VCC_SecurityRABInfo_v860ext
