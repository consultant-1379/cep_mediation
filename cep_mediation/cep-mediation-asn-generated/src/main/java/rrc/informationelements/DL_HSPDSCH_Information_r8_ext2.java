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
 * Define the ASN1 Type DL_HSPDSCH_Information_r8_ext2 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_HSPDSCH_Information_r8_ext2 extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_HSPDSCH_Information_r8_ext2()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_HSPDSCH_Information_r8_ext2(HS_SCCH_Info_r8_ext hs_scch_Info)
    {
	setHs_scch_Info(hs_scch_Info);
    }
    
    public void initComponents()
    {
	mComponents[0] = new HS_SCCH_Info_r8_ext();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[1];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new HS_SCCH_Info_r8_ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "hs_scch_Info"
    public HS_SCCH_Info_r8_ext getHs_scch_Info()
    {
	return (HS_SCCH_Info_r8_ext)mComponents[0];
    }
    
    public void setHs_scch_Info(HS_SCCH_Info_r8_ext hs_scch_Info)
    {
	mComponents[0] = hs_scch_Info;
    }
    
    public boolean hasHs_scch_Info()
    {
	return componentIsPresent(0);
    }
    
    public void deleteHs_scch_Info()
    {
	setComponentAbsent(0);
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
	    "DL_HSPDSCH_Information_r8_ext2"
	),
	new QName (
	    "InformationElements",
	    "DL-HSPDSCH-Information-r8-ext2"
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
				"HS_SCCH_Info_r8_ext"
			    ),
			    new QName (
				"InformationElements",
				"HS-SCCH-Info-r8-ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "HS_SCCH_Info_r8_ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "HS_SCCH_Info_r8_ext"
				)
			    ),
			    0
			)
		    ),
		    "hs-scch-Info",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DL_HSPDSCH_Information_r8_ext2 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_HSPDSCH_Information_r8_ext2 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_HSPDSCH_Information_r8_ext2
